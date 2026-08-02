package com.playtika.sharedsdk.shaded.org.brotli.dec;

/* loaded from: classes7.dex */
final class Decode {
    private static final int CODE_LENGTH_CODES = 18;
    private static final int CODE_LENGTH_REPEAT_CODE = 16;
    private static final int DEFAULT_CODE_LENGTH = 8;
    private static final int DISTANCE_CONTEXT_BITS = 2;
    private static final int HUFFMAN_TABLE_BITS = 8;
    private static final int HUFFMAN_TABLE_MASK = 255;
    private static final int LITERAL_CONTEXT_BITS = 6;
    private static final int NUM_BLOCK_LENGTH_CODES = 26;
    private static final int NUM_DISTANCE_SHORT_CODES = 16;
    private static final int NUM_INSERT_AND_COPY_CODES = 704;
    private static final int NUM_LITERAL_CODES = 256;
    private static final int[] CODE_LENGTH_CODE_ORDER = {1, 2, 3, 4, 0, 5, 17, 6, 16, 7, 8, 9, 10, 11, 12, 13, 14, 15};
    private static final int[] DISTANCE_SHORT_CODE_INDEX_OFFSET = {3, 2, 1, 0, 3, 3, 3, 3, 3, 3, 2, 2, 2, 2, 2, 2};
    private static final int[] DISTANCE_SHORT_CODE_VALUE_OFFSET = {0, 0, 0, 0, -1, 1, -2, 2, -3, 3, -1, 1, -2, 2, -3, 3};
    private static final int[] FIXED_TABLE = {131072, 131076, 131075, 196610, 131072, 131076, 131075, 262145, 131072, 131076, 131075, 196610, 131072, 131076, 131075, 262149};

    Decode() {
    }

    private static int decodeVarLenUnsignedByte(BitReader bitReader) {
        if (BitReader.readBits(bitReader, 1) == 0) {
            return 0;
        }
        int readBits = BitReader.readBits(bitReader, 3);
        if (readBits == 0) {
            return 1;
        }
        return BitReader.readBits(bitReader, readBits) + (1 << readBits);
    }

    private static void decodeMetaBlockLength(BitReader bitReader, State state) {
        state.inputEnd = BitReader.readBits(bitReader, 1) == 1;
        state.metaBlockLength = 0;
        state.isUncompressed = false;
        state.isMetadata = false;
        if (!state.inputEnd || BitReader.readBits(bitReader, 1) == 0) {
            int readBits = BitReader.readBits(bitReader, 2) + 4;
            if (readBits == 7) {
                state.isMetadata = true;
                if (BitReader.readBits(bitReader, 1) != 0) {
                    throw new BrotliRuntimeException("Corrupted reserved bit");
                }
                int readBits2 = BitReader.readBits(bitReader, 2);
                if (readBits2 == 0) {
                    return;
                }
                for (int i = 0; i < readBits2; i++) {
                    int readBits3 = BitReader.readBits(bitReader, 8);
                    if (readBits3 == 0 && i + 1 == readBits2 && readBits2 > 1) {
                        throw new BrotliRuntimeException("Exuberant nibble");
                    }
                    state.metaBlockLength = (readBits3 << (i * 8)) | state.metaBlockLength;
                }
            } else {
                for (int i2 = 0; i2 < readBits; i2++) {
                    int readBits4 = BitReader.readBits(bitReader, 4);
                    if (readBits4 == 0 && i2 + 1 == readBits && readBits > 4) {
                        throw new BrotliRuntimeException("Exuberant nibble");
                    }
                    state.metaBlockLength = (readBits4 << (i2 * 4)) | state.metaBlockLength;
                }
            }
            state.metaBlockLength++;
            if (state.inputEnd) {
                return;
            }
            state.isUncompressed = BitReader.readBits(bitReader, 1) == 1;
        }
    }

    private static int readSymbol(int[] iArr, int i, BitReader bitReader) {
        int i2 = (int) (bitReader.accumulator >>> bitReader.bitOffset);
        int i3 = i + (i2 & 255);
        int i4 = iArr[i3];
        int i5 = i4 >> 16;
        int i6 = i4 & 65535;
        if (i5 <= 8) {
            bitReader.bitOffset += i5;
            return i6;
        }
        int i7 = i3 + i6 + ((i2 & ((1 << i5) - 1)) >>> 8);
        bitReader.bitOffset += (iArr[i7] >> 16) + 8;
        return iArr[i7] & 65535;
    }

    private static int readBlockLength(int[] iArr, int i, BitReader bitReader) {
        BitReader.fillBitWindow(bitReader);
        int readSymbol = readSymbol(iArr, i, bitReader);
        return Prefix.BLOCK_LENGTH_OFFSET[readSymbol] + BitReader.readBits(bitReader, Prefix.BLOCK_LENGTH_N_BITS[readSymbol]);
    }

    private static int translateShortCodes(int i, int[] iArr, int i2) {
        return i < 16 ? iArr[(i2 + DISTANCE_SHORT_CODE_INDEX_OFFSET[i]) & 3] + DISTANCE_SHORT_CODE_VALUE_OFFSET[i] : i - 15;
    }

    private static void moveToFront(int[] iArr, int i) {
        int i2 = iArr[i];
        while (i > 0) {
            iArr[i] = iArr[i - 1];
            i--;
        }
        iArr[0] = i2;
    }

    private static void inverseMoveToFrontTransform(byte[] bArr, int i) {
        int[] iArr = new int[256];
        for (int i2 = 0; i2 < 256; i2++) {
            iArr[i2] = i2;
        }
        for (int i3 = 0; i3 < i; i3++) {
            int i4 = bArr[i3] & 255;
            bArr[i3] = (byte) iArr[i4];
            if (i4 != 0) {
                moveToFront(iArr, i4);
            }
        }
    }

    private static void readHuffmanCodeLengths(int[] iArr, int i, int[] iArr2, BitReader bitReader) {
        int[] iArr3 = new int[32];
        Huffman.buildHuffmanTable(iArr3, 0, 5, iArr, 18);
        int i2 = 8;
        int i3 = 32768;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (i4 < i && i3 > 0) {
            BitReader.readMoreInput(bitReader);
            BitReader.fillBitWindow(bitReader);
            int i7 = ((int) (bitReader.accumulator >>> bitReader.bitOffset)) & 31;
            bitReader.bitOffset += iArr3[i7] >> 16;
            int i8 = iArr3[i7] & 65535;
            if (i8 < 16) {
                int i9 = i4 + 1;
                iArr2[i4] = i8;
                if (i8 != 0) {
                    i3 -= 32768 >> i8;
                    i4 = i9;
                    i2 = i8;
                } else {
                    i4 = i9;
                }
                i6 = 0;
            } else {
                int i10 = i8 - 14;
                int i11 = i8 == 16 ? i2 : 0;
                if (i5 != i11) {
                    i6 = 0;
                    i5 = i11;
                }
                int readBits = (i6 > 0 ? (i6 - 2) << i10 : i6) + BitReader.readBits(bitReader, i10) + 3;
                int i12 = readBits - i6;
                if (i4 + i12 > i) {
                    throw new BrotliRuntimeException("symbol + repeatDelta > numSymbols");
                }
                int i13 = 0;
                while (i13 < i12) {
                    iArr2[i4] = i5;
                    i13++;
                    i4++;
                }
                if (i5 != 0) {
                    i3 -= i12 << (15 - i5);
                }
                i6 = readBits;
            }
        }
        if (i3 != 0) {
            throw new BrotliRuntimeException("Unused space");
        }
        Utils.fillWithZeroes(iArr2, i4, i - i4);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static void readHuffmanCode(int i, int[] iArr, int i2, BitReader bitReader) {
        int i3;
        int i4;
        int i5;
        BitReader.readMoreInput(bitReader);
        int[] iArr2 = new int[i];
        int readBits = BitReader.readBits(bitReader, 2);
        boolean z = true;
        if (readBits == 1) {
            int i6 = i - 1;
            int[] iArr3 = new int[4];
            int readBits2 = BitReader.readBits(bitReader, 2) + 1;
            int i7 = 0;
            while (i6 != 0) {
                i6 >>= 1;
                i7++;
            }
            for (int i8 = 0; i8 < readBits2; i8++) {
                int readBits3 = BitReader.readBits(bitReader, i7) % i;
                iArr3[i8] = readBits3;
                iArr2[readBits3] = 2;
            }
            iArr2[iArr3[0]] = 1;
            if (readBits2 != 1) {
                if (readBits2 == 2) {
                    int i9 = iArr3[0];
                    int i10 = iArr3[1];
                    r5 = i9 != i10;
                    iArr2[i10] = 1;
                } else if (readBits2 == 3) {
                    int i11 = iArr3[0];
                    int i12 = iArr3[1];
                    if (i11 != i12 && i11 != (i3 = iArr3[2]) && i12 != i3) {
                        r5 = true;
                    }
                } else {
                    int i13 = iArr3[0];
                    int i14 = iArr3[1];
                    boolean z2 = (i13 == i14 || i13 == (i4 = iArr3[2]) || i13 == (i5 = iArr3[3]) || i14 == i4 || i14 == i5 || i4 == i5) ? false : true;
                    if (BitReader.readBits(bitReader, 1) == 1) {
                        iArr2[iArr3[2]] = 3;
                        iArr2[iArr3[3]] = 3;
                    } else {
                        iArr2[iArr3[0]] = 2;
                    }
                    z = z2;
                }
            }
            if (z) {
                throw new BrotliRuntimeException("Can't readHuffmanCode");
            }
            Huffman.buildHuffmanTable(iArr, i2, 8, iArr2, i);
            return;
        }
        int[] iArr4 = new int[18];
        int i15 = 0;
        int i16 = 32;
        while (readBits < 18 && i16 > 0) {
            int i17 = CODE_LENGTH_CODE_ORDER[readBits];
            BitReader.fillBitWindow(bitReader);
            int i18 = ((int) (bitReader.accumulator >>> bitReader.bitOffset)) & 15;
            int i19 = bitReader.bitOffset;
            int[] iArr5 = FIXED_TABLE;
            bitReader.bitOffset = i19 + (iArr5[i18] >> 16);
            int i20 = iArr5[i18] & 65535;
            iArr4[i17] = i20;
            if (i20 != 0) {
                i16 -= 32 >> i20;
                i15++;
            }
            readBits++;
        }
        r5 = i15 == 1 || i16 == 0;
        readHuffmanCodeLengths(iArr4, i, iArr2, bitReader);
        z = r5;
        if (z) {
        }
    }

    private static int decodeContextMap(int i, byte[] bArr, BitReader bitReader) {
        BitReader.readMoreInput(bitReader);
        int decodeVarLenUnsignedByte = decodeVarLenUnsignedByte(bitReader) + 1;
        if (decodeVarLenUnsignedByte == 1) {
            Utils.fillWithZeroes(bArr, 0, i);
            return decodeVarLenUnsignedByte;
        }
        int readBits = BitReader.readBits(bitReader, 1) == 1 ? BitReader.readBits(bitReader, 4) + 1 : 0;
        int[] iArr = new int[1080];
        readHuffmanCode(decodeVarLenUnsignedByte + readBits, iArr, 0, bitReader);
        int i2 = 0;
        while (i2 < i) {
            BitReader.readMoreInput(bitReader);
            BitReader.fillBitWindow(bitReader);
            int readSymbol = readSymbol(iArr, 0, bitReader);
            if (readSymbol == 0) {
                bArr[i2] = 0;
            } else if (readSymbol <= readBits) {
                for (int readBits2 = (1 << readSymbol) + BitReader.readBits(bitReader, readSymbol); readBits2 != 0; readBits2--) {
                    if (i2 >= i) {
                        throw new BrotliRuntimeException("Corrupted context map");
                    }
                    bArr[i2] = 0;
                    i2++;
                }
            } else {
                bArr[i2] = (byte) (readSymbol - readBits);
            }
            i2++;
        }
        if (BitReader.readBits(bitReader, 1) == 1) {
            inverseMoveToFrontTransform(bArr, i);
        }
        return decodeVarLenUnsignedByte;
    }

    private static void decodeBlockTypeAndLength(State state, int i) {
        int i2;
        BitReader bitReader = state.br;
        int[] iArr = state.blockTypeRb;
        int i3 = i * 2;
        BitReader.fillBitWindow(bitReader);
        int i4 = i * 1080;
        int readSymbol = readSymbol(state.blockTypeTrees, i4, bitReader);
        state.blockLength[i] = readBlockLength(state.blockLenTrees, i4, bitReader);
        if (readSymbol == 1) {
            i2 = iArr[i3 + 1] + 1;
        } else {
            i2 = readSymbol == 0 ? iArr[i3] : readSymbol - 2;
        }
        if (i2 >= state.numBlockTypes[i]) {
            i2 -= state.numBlockTypes[i];
        }
        int i5 = i3 + 1;
        iArr[i3] = iArr[i5];
        iArr[i5] = i2;
    }

    private static void decodeLiteralBlockSwitch(State state) {
        decodeBlockTypeAndLength(state, 0);
        int i = state.blockTypeRb[1];
        state.contextMapSlice = i << 6;
        state.literalTreeIndex = state.contextMap[state.contextMapSlice] & 255;
        state.literalTree = state.hGroup0.trees[state.literalTreeIndex];
        byte b = state.contextModes[i];
        state.contextLookupOffset1 = Context.LOOKUP_OFFSETS[b];
        state.contextLookupOffset2 = Context.LOOKUP_OFFSETS[b + 1];
    }

    private static void decodeCommandBlockSwitch(State state) {
        decodeBlockTypeAndLength(state, 1);
        state.treeCommandOffset = state.hGroup1.trees[state.blockTypeRb[3]];
    }

    private static void decodeDistanceBlockSwitch(State state) {
        decodeBlockTypeAndLength(state, 2);
        state.distContextMapSlice = state.blockTypeRb[5] << 2;
    }

    private static void maybeReallocateRingBuffer(State state) {
        int i;
        int i2;
        int i3 = state.maxRingBufferSize;
        if (i3 > state.expectedTotalSize) {
            while (true) {
                int i4 = i3 >> 1;
                if (i4 <= ((int) state.expectedTotalSize) + state.customDictionary.length) {
                    break;
                } else {
                    i3 = i4;
                }
            }
            if (!state.inputEnd && i3 < 16384 && state.maxRingBufferSize >= 16384) {
                i3 = 16384;
            }
        }
        if (i3 <= state.ringBufferSize) {
            return;
        }
        byte[] bArr = new byte[i3 + 37];
        if (state.ringBuffer != null) {
            System.arraycopy(state.ringBuffer, 0, bArr, 0, state.ringBufferSize);
        } else if (state.customDictionary.length != 0) {
            int length = state.customDictionary.length;
            if (length > state.maxBackwardDistance) {
                i2 = length - state.maxBackwardDistance;
                i = state.maxBackwardDistance;
            } else {
                i = length;
                i2 = 0;
            }
            System.arraycopy(state.customDictionary, i2, bArr, 0, i);
            state.pos = i;
            state.bytesToIgnore = i;
        }
        state.ringBuffer = bArr;
        state.ringBufferSize = i3;
    }

    private static void readMetablockInfo(State state) {
        BitReader bitReader = state.br;
        if (state.inputEnd) {
            state.nextRunningState = 10;
            state.bytesToWrite = state.pos;
            state.bytesWritten = 0;
            state.runningState = 12;
            return;
        }
        state.hGroup0.codes = null;
        state.hGroup0.trees = null;
        state.hGroup1.codes = null;
        state.hGroup1.trees = null;
        state.hGroup2.codes = null;
        state.hGroup2.trees = null;
        BitReader.readMoreInput(bitReader);
        decodeMetaBlockLength(bitReader, state);
        if (state.metaBlockLength != 0 || state.isMetadata) {
            if (state.isUncompressed || state.isMetadata) {
                BitReader.jumpToByteBoundary(bitReader);
                state.runningState = state.isMetadata ? 4 : 5;
            } else {
                state.runningState = 2;
            }
            if (state.isMetadata) {
                return;
            }
            state.expectedTotalSize += state.metaBlockLength;
            if (state.ringBufferSize < state.maxRingBufferSize) {
                maybeReallocateRingBuffer(state);
            }
        }
    }

    private static void readMetablockHuffmanCodesAndContextMaps(State state) {
        BitReader bitReader = state.br;
        for (int i = 0; i < 3; i++) {
            state.numBlockTypes[i] = decodeVarLenUnsignedByte(bitReader) + 1;
            state.blockLength[i] = 268435456;
            if (state.numBlockTypes[i] > 1) {
                int i2 = i * 1080;
                readHuffmanCode(state.numBlockTypes[i] + 2, state.blockTypeTrees, i2, bitReader);
                readHuffmanCode(26, state.blockLenTrees, i2, bitReader);
                state.blockLength[i] = readBlockLength(state.blockLenTrees, i2, bitReader);
            }
        }
        BitReader.readMoreInput(bitReader);
        state.distancePostfixBits = BitReader.readBits(bitReader, 2);
        state.numDirectDistanceCodes = (BitReader.readBits(bitReader, 4) << state.distancePostfixBits) + 16;
        state.distancePostfixMask = (1 << state.distancePostfixBits) - 1;
        int i3 = state.numDirectDistanceCodes + (48 << state.distancePostfixBits);
        state.contextModes = new byte[state.numBlockTypes[0]];
        int i4 = 0;
        while (i4 < state.numBlockTypes[0]) {
            int min = Math.min(i4 + 96, state.numBlockTypes[0]);
            while (i4 < min) {
                state.contextModes[i4] = (byte) (BitReader.readBits(bitReader, 2) << 1);
                i4++;
            }
            BitReader.readMoreInput(bitReader);
        }
        state.contextMap = new byte[state.numBlockTypes[0] << 6];
        int decodeContextMap = decodeContextMap(state.numBlockTypes[0] << 6, state.contextMap, bitReader);
        state.trivialLiteralContext = true;
        int i5 = 0;
        while (true) {
            if (i5 >= (state.numBlockTypes[0] << 6)) {
                break;
            }
            if (state.contextMap[i5] != (i5 >> 6)) {
                state.trivialLiteralContext = false;
                break;
            }
            i5++;
        }
        state.distContextMap = new byte[state.numBlockTypes[2] << 2];
        int decodeContextMap2 = decodeContextMap(state.numBlockTypes[2] << 2, state.distContextMap, bitReader);
        HuffmanTreeGroup.init(state.hGroup0, 256, decodeContextMap);
        HuffmanTreeGroup.init(state.hGroup1, 704, state.numBlockTypes[1]);
        HuffmanTreeGroup.init(state.hGroup2, i3, decodeContextMap2);
        HuffmanTreeGroup.decode(state.hGroup0, bitReader);
        HuffmanTreeGroup.decode(state.hGroup1, bitReader);
        HuffmanTreeGroup.decode(state.hGroup2, bitReader);
        state.contextMapSlice = 0;
        state.distContextMapSlice = 0;
        state.contextLookupOffset1 = Context.LOOKUP_OFFSETS[state.contextModes[0]];
        state.contextLookupOffset2 = Context.LOOKUP_OFFSETS[state.contextModes[0] + 1];
        state.literalTreeIndex = 0;
        state.literalTree = state.hGroup0.trees[0];
        state.treeCommandOffset = state.hGroup1.trees[0];
        int[] iArr = state.blockTypeRb;
        int[] iArr2 = state.blockTypeRb;
        state.blockTypeRb[4] = 1;
        iArr2[2] = 1;
        iArr[0] = 1;
        int[] iArr3 = state.blockTypeRb;
        int[] iArr4 = state.blockTypeRb;
        state.blockTypeRb[5] = 0;
        iArr4[3] = 0;
        iArr3[1] = 0;
    }

    private static void copyUncompressedData(State state) {
        BitReader bitReader = state.br;
        byte[] bArr = state.ringBuffer;
        if (state.metaBlockLength <= 0) {
            BitReader.reload(bitReader);
            state.runningState = 1;
            return;
        }
        int min = Math.min(state.ringBufferSize - state.pos, state.metaBlockLength);
        BitReader.copyBytes(bitReader, bArr, state.pos, min);
        state.metaBlockLength -= min;
        state.pos += min;
        if (state.pos == state.ringBufferSize) {
            state.nextRunningState = 5;
            state.bytesToWrite = state.ringBufferSize;
            state.bytesWritten = 0;
            state.runningState = 12;
            return;
        }
        BitReader.reload(bitReader);
        state.runningState = 1;
    }

    private static boolean writeRingBuffer(State state) {
        if (state.bytesToIgnore != 0) {
            state.bytesWritten += state.bytesToIgnore;
            state.bytesToIgnore = 0;
        }
        int min = Math.min(state.outputLength - state.outputUsed, state.bytesToWrite - state.bytesWritten);
        if (min != 0) {
            System.arraycopy(state.ringBuffer, state.bytesWritten, state.output, state.outputOffset + state.outputUsed, min);
            state.outputUsed += min;
            state.bytesWritten += min;
        }
        return state.outputUsed < state.outputLength;
    }

    static void setCustomDictionary(State state, byte[] bArr) {
        if (bArr == null) {
            bArr = new byte[0];
        }
        state.customDictionary = bArr;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:113:0x03a4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x03a4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0153 A[LOOP:3: B:61:0x0153->B:114:?, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0220  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static void decompress(State state) {
        int i;
        String str;
        char c;
        int i2;
        int i3;
        int i4;
        if (state.runningState == 0) {
            throw new IllegalStateException("Can't decompress until initialized");
        }
        if (state.runningState == 11) {
            throw new IllegalStateException("Can't decompress after close");
        }
        BitReader bitReader = state.br;
        int i5 = 1;
        int i6 = state.ringBufferSize - 1;
        byte[] bArr = state.ringBuffer;
        while (state.runningState != 10) {
            int i7 = state.runningState;
            if (i7 != 12) {
                char c2 = 2;
                int i8 = 0;
                switch (i7) {
                    case 1:
                        i = i5;
                        if (state.metaBlockLength < 0) {
                            throw new BrotliRuntimeException("Invalid metablock length");
                        }
                        readMetablockInfo(state);
                        i6 = state.ringBufferSize - 1;
                        bArr = state.ringBuffer;
                        break;
                    case 2:
                        str = "Invalid backward reference";
                        readMetablockHuffmanCodesAndContextMaps(state);
                        state.runningState = 3;
                        if (state.metaBlockLength > 0) {
                            state.runningState = i5;
                            i = i5;
                            break;
                        } else {
                            BitReader.readMoreInput(bitReader);
                            if (state.blockLength[i5] == 0) {
                                decodeCommandBlockSwitch(state);
                            }
                            int[] iArr = state.blockLength;
                            iArr[i5] = iArr[i5] - i5;
                            BitReader.fillBitWindow(bitReader);
                            int readSymbol = readSymbol(state.hGroup1.codes, state.treeCommandOffset, bitReader);
                            int i9 = readSymbol >>> 6;
                            state.distanceCode = 0;
                            if (i9 >= 2) {
                                i9 -= 2;
                                state.distanceCode = -1;
                            }
                            int i10 = Prefix.INSERT_RANGE_LUT[i9] + ((readSymbol >>> 3) & 7);
                            int i11 = Prefix.COPY_RANGE_LUT[i9] + (readSymbol & 7);
                            state.insertLength = Prefix.INSERT_LENGTH_OFFSET[i10] + BitReader.readBits(bitReader, Prefix.INSERT_LENGTH_N_BITS[i10]);
                            state.copyLength = Prefix.COPY_LENGTH_OFFSET[i11] + BitReader.readBits(bitReader, Prefix.COPY_LENGTH_N_BITS[i11]);
                            state.j = 0;
                            state.runningState = 6;
                            if (state.trivialLiteralContext) {
                                int i12 = bArr[(state.pos - i5) & i6] & 255;
                                int i13 = bArr[(state.pos - 2) & i6] & 255;
                                while (true) {
                                    c = c2;
                                    if (state.j < state.insertLength) {
                                        BitReader.readMoreInput(bitReader);
                                        if (state.blockLength[0] == 0) {
                                            decodeLiteralBlockSwitch(state);
                                        }
                                        i = i5;
                                        int i14 = state.contextMap[state.contextMapSlice + (Context.LOOKUP[state.contextLookupOffset1 + i12] | Context.LOOKUP[state.contextLookupOffset2 + i13])] & 255;
                                        state.blockLength[0] = r7[0] - 1;
                                        BitReader.fillBitWindow(bitReader);
                                        int readSymbol2 = readSymbol(state.hGroup0.codes, state.hGroup0.trees[i14], bitReader);
                                        bArr[state.pos] = (byte) readSymbol2;
                                        state.j++;
                                        int i15 = state.pos;
                                        state.pos = i15 + 1;
                                        if (i15 == i6) {
                                            state.nextRunningState = 6;
                                            state.bytesToWrite = state.ringBufferSize;
                                            state.bytesWritten = 0;
                                            state.runningState = 12;
                                        } else {
                                            i13 = i12;
                                            c2 = c;
                                            i12 = readSymbol2;
                                            i5 = i;
                                        }
                                    } else {
                                        i = i5;
                                    }
                                }
                            } else {
                                while (true) {
                                    if (state.j < state.insertLength) {
                                        BitReader.readMoreInput(bitReader);
                                        if (state.blockLength[0] == 0) {
                                            decodeLiteralBlockSwitch(state);
                                        }
                                        int[] iArr2 = state.blockLength;
                                        iArr2[0] = iArr2[0] - i5;
                                        BitReader.fillBitWindow(bitReader);
                                        bArr[state.pos] = (byte) readSymbol(state.hGroup0.codes, state.literalTree, bitReader);
                                        state.j += i5;
                                        int i16 = state.pos;
                                        state.pos = i16 + 1;
                                        if (i16 == i6) {
                                            state.nextRunningState = 6;
                                            state.bytesToWrite = state.ringBufferSize;
                                            state.bytesWritten = 0;
                                            state.runningState = 12;
                                        }
                                    }
                                }
                                i = i5;
                                c = 2;
                            }
                            if (state.runningState == 6) {
                                continue;
                            } else {
                                state.metaBlockLength -= state.insertLength;
                                if (state.metaBlockLength <= 0) {
                                    state.runningState = 3;
                                    break;
                                } else {
                                    if (state.distanceCode < 0) {
                                        BitReader.readMoreInput(bitReader);
                                        if (state.blockLength[c] == 0) {
                                            decodeDistanceBlockSwitch(state);
                                        }
                                        state.blockLength[c] = r3[c] - 1;
                                        BitReader.fillBitWindow(bitReader);
                                        state.distanceCode = readSymbol(state.hGroup2.codes, state.hGroup2.trees[state.distContextMap[state.distContextMapSlice + (state.copyLength > 4 ? 3 : state.copyLength - 2)] & 255], bitReader);
                                        if (state.distanceCode >= state.numDirectDistanceCodes) {
                                            state.distanceCode -= state.numDirectDistanceCodes;
                                            int i17 = state.distanceCode & state.distancePostfixMask;
                                            state.distanceCode >>>= state.distancePostfixBits;
                                            int i18 = (state.distanceCode >>> 1) + 1;
                                            state.distanceCode = state.numDirectDistanceCodes + i17 + ((((((state.distanceCode & 1) + 2) << i18) - 4) + BitReader.readBits(bitReader, i18)) << state.distancePostfixBits);
                                        }
                                    }
                                    state.distance = translateShortCodes(state.distanceCode, state.distRb, state.distRbIdx);
                                    if (state.distance < 0) {
                                        throw new BrotliRuntimeException("Negative distance");
                                    }
                                    if (state.maxDistance != state.maxBackwardDistance && state.pos < state.maxBackwardDistance) {
                                        state.maxDistance = state.pos;
                                    } else {
                                        state.maxDistance = state.maxBackwardDistance;
                                    }
                                    state.copyDst = state.pos;
                                    if (state.distance > state.maxDistance) {
                                        state.runningState = 9;
                                        break;
                                    } else {
                                        if (state.distanceCode > 0) {
                                            state.distRb[state.distRbIdx & 3] = state.distance;
                                            state.distRbIdx++;
                                        }
                                        if (state.copyLength > state.metaBlockLength) {
                                            throw new BrotliRuntimeException(str);
                                        }
                                        state.j = 0;
                                        state.runningState = 7;
                                        i2 = (state.pos - state.distance) & i6;
                                        int i19 = state.pos;
                                        i3 = state.copyLength - state.j;
                                        if (i2 + i3 >= i6 && i19 + i3 < i6) {
                                            while (i8 < i3) {
                                                bArr[i19] = bArr[i2];
                                                i8++;
                                                i19++;
                                                i2++;
                                            }
                                            state.j += i3;
                                            state.metaBlockLength -= i3;
                                            state.pos += i3;
                                        } else {
                                            while (state.j < state.copyLength) {
                                                bArr[state.pos] = bArr[(state.pos - state.distance) & i6];
                                                state.metaBlockLength--;
                                                state.j++;
                                                int i20 = state.pos;
                                                state.pos = i20 + 1;
                                                if (i20 == i6) {
                                                    i4 = 7;
                                                    state.nextRunningState = 7;
                                                    state.bytesToWrite = state.ringBufferSize;
                                                    state.bytesWritten = 0;
                                                    state.runningState = 12;
                                                    if (state.runningState != i4) {
                                                        break;
                                                    } else {
                                                        state.runningState = 3;
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                        i4 = 7;
                                        if (state.runningState != i4) {
                                        }
                                    }
                                }
                            }
                        }
                        break;
                    case 3:
                        str = "Invalid backward reference";
                        if (state.metaBlockLength > 0) {
                        }
                        break;
                    case 4:
                        while (state.metaBlockLength > 0) {
                            BitReader.readMoreInput(bitReader);
                            BitReader.readBits(bitReader, 8);
                            state.metaBlockLength -= i5;
                        }
                        state.runningState = i5;
                        i = i5;
                        break;
                    case 5:
                        copyUncompressedData(state);
                        i = i5;
                        break;
                    case 6:
                        str = "Invalid backward reference";
                        if (state.trivialLiteralContext) {
                        }
                        if (state.runningState == 6) {
                        }
                        break;
                    case 7:
                        i = i5;
                        i2 = (state.pos - state.distance) & i6;
                        int i192 = state.pos;
                        i3 = state.copyLength - state.j;
                        if (i2 + i3 >= i6) {
                            break;
                        }
                        while (state.j < state.copyLength) {
                        }
                        i4 = 7;
                        if (state.runningState != i4) {
                        }
                        break;
                    case 8:
                        System.arraycopy(bArr, state.ringBufferSize, bArr, 0, state.copyDst - state.ringBufferSize);
                        state.runningState = 3;
                        i = i5;
                        break;
                    case 9:
                        if (state.copyLength >= 4 && state.copyLength <= 24) {
                            int i21 = Dictionary.OFFSETS_BY_LENGTH[state.copyLength];
                            int i22 = (state.distance - state.maxDistance) - i5;
                            int i23 = Dictionary.SIZE_BITS_BY_LENGTH[state.copyLength];
                            int i24 = ((i5 << i23) - i5) & i22;
                            int i25 = i22 >>> i23;
                            int i26 = i21 + (i24 * state.copyLength);
                            if (i25 < Transform.TRANSFORMS.length) {
                                int transformDictionaryWord = Transform.transformDictionaryWord(bArr, state.copyDst, Dictionary.getData(), i26, state.copyLength, Transform.TRANSFORMS[i25]);
                                state.copyDst += transformDictionaryWord;
                                state.pos += transformDictionaryWord;
                                state.metaBlockLength -= transformDictionaryWord;
                                if (state.copyDst >= state.ringBufferSize) {
                                    state.nextRunningState = 8;
                                    state.bytesToWrite = state.ringBufferSize;
                                    state.bytesWritten = 0;
                                    state.runningState = 12;
                                } else {
                                    state.runningState = 3;
                                }
                                i = i5;
                                break;
                            } else {
                                throw new BrotliRuntimeException("Invalid backward reference");
                            }
                        } else {
                            throw new BrotliRuntimeException("Invalid backward reference");
                        }
                    default:
                        throw new BrotliRuntimeException("Unexpected state " + state.runningState);
                }
            } else {
                i = i5;
                if (!writeRingBuffer(state)) {
                    return;
                }
                if (state.pos >= state.maxBackwardDistance) {
                    state.maxDistance = state.maxBackwardDistance;
                }
                state.pos &= i6;
                state.runningState = state.nextRunningState;
            }
            i5 = i;
        }
        boolean z = i5;
        if (state.runningState == 10) {
            if (state.metaBlockLength < 0) {
                throw new BrotliRuntimeException("Invalid metablock length");
            }
            BitReader.jumpToByteBoundary(bitReader);
            BitReader.checkHealth(state.br, z);
        }
    }
}

package com.mbridge.msdk.playercommon.exoplayer2.extractor.mp4;

import android.util.Pair;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.Format;
import com.mbridge.msdk.playercommon.exoplayer2.ParserException;
import com.mbridge.msdk.playercommon.exoplayer2.audio.Ac3Util;
import com.mbridge.msdk.playercommon.exoplayer2.drm.DrmInitData;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.GaplessInfoHolder;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.mp4.Atom;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.mp4.FixedSampleSizeRechunker;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.Metadata;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import com.mbridge.msdk.playercommon.exoplayer2.util.CodecSpecificDataUtil;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.mbridge.msdk.playercommon.exoplayer2.util.ParsableByteArray;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;
import com.mbridge.msdk.playercommon.exoplayer2.video.AvcConfig;
import com.mbridge.msdk.playercommon.exoplayer2.video.HevcConfig;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.a70;
import defpackage.yhk;
import defpackage.zzl;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
final class AtomParsers {
    private static final int MAX_GAPLESS_TRIM_SIZE_SAMPLES = 3;
    private static final String TAG = "AtomParsers";
    private static final int TYPE_vide = Util.getIntegerCodeForString("vide");
    private static final int TYPE_soun = Util.getIntegerCodeForString("soun");
    private static final int TYPE_text = Util.getIntegerCodeForString("text");
    private static final int TYPE_sbtl = Util.getIntegerCodeForString("sbtl");
    private static final int TYPE_subt = Util.getIntegerCodeForString("subt");
    private static final int TYPE_clcp = Util.getIntegerCodeForString("clcp");
    private static final int TYPE_meta = Util.getIntegerCodeForString("meta");

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class ChunkIterator {
        private final ParsableByteArray chunkOffsets;
        private final boolean chunkOffsetsAreLongs;
        public int index;
        public final int length;
        private int nextSamplesPerChunkChangeIndex;
        public int numSamples;
        public long offset;
        private int remainingSamplesPerChunkChanges;
        private final ParsableByteArray stsc;

        public ChunkIterator(ParsableByteArray parsableByteArray, ParsableByteArray parsableByteArray2, boolean z) {
            this.stsc = parsableByteArray;
            this.chunkOffsets = parsableByteArray2;
            this.chunkOffsetsAreLongs = z;
            parsableByteArray2.setPosition(12);
            this.length = parsableByteArray2.readUnsignedIntToInt();
            parsableByteArray.setPosition(12);
            this.remainingSamplesPerChunkChanges = parsableByteArray.readUnsignedIntToInt();
            Assertions.checkState(parsableByteArray.readInt() == 1, "first_chunk must be 1");
            this.index = -1;
        }

        public boolean moveNext() {
            int i = this.index + 1;
            this.index = i;
            if (i == this.length) {
                return false;
            }
            boolean z = this.chunkOffsetsAreLongs;
            ParsableByteArray parsableByteArray = this.chunkOffsets;
            this.offset = z ? parsableByteArray.readUnsignedLongToLong() : parsableByteArray.readUnsignedInt();
            if (this.index == this.nextSamplesPerChunkChangeIndex) {
                this.numSamples = this.stsc.readUnsignedIntToInt();
                this.stsc.skipBytes(4);
                int i2 = this.remainingSamplesPerChunkChanges - 1;
                this.remainingSamplesPerChunkChanges = i2;
                this.nextSamplesPerChunkChangeIndex = i2 > 0 ? this.stsc.readUnsignedIntToInt() - 1 : -1;
            }
            return true;
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public interface SampleSizeBox {
        int getSampleCount();

        boolean isFixedSampleSize();

        int readNextSampleSize();
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class StsdData {
        public static final int STSD_HEADER_SIZE = 8;
        public Format format;
        public int nalUnitLengthFieldLength;
        public int requiredSampleTransformation = 0;
        public final TrackEncryptionBox[] trackEncryptionBoxes;

        public StsdData(int i) {
            this.trackEncryptionBoxes = new TrackEncryptionBox[i];
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class StszSampleSizeBox implements SampleSizeBox {
        private final ParsableByteArray data;
        private final int fixedSampleSize;
        private final int sampleCount;

        public StszSampleSizeBox(Atom.LeafAtom leafAtom) {
            ParsableByteArray parsableByteArray = leafAtom.data;
            this.data = parsableByteArray;
            parsableByteArray.setPosition(12);
            this.fixedSampleSize = parsableByteArray.readUnsignedIntToInt();
            this.sampleCount = parsableByteArray.readUnsignedIntToInt();
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.mp4.AtomParsers.SampleSizeBox
        public int getSampleCount() {
            return this.sampleCount;
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.mp4.AtomParsers.SampleSizeBox
        public boolean isFixedSampleSize() {
            return this.fixedSampleSize != 0;
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.mp4.AtomParsers.SampleSizeBox
        public int readNextSampleSize() {
            int i = this.fixedSampleSize;
            return i == 0 ? this.data.readUnsignedIntToInt() : i;
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class Stz2SampleSizeBox implements SampleSizeBox {
        private int currentByte;
        private final ParsableByteArray data;
        private final int fieldSize;
        private final int sampleCount;
        private int sampleIndex;

        public Stz2SampleSizeBox(Atom.LeafAtom leafAtom) {
            ParsableByteArray parsableByteArray = leafAtom.data;
            this.data = parsableByteArray;
            parsableByteArray.setPosition(12);
            this.fieldSize = parsableByteArray.readUnsignedIntToInt() & 255;
            this.sampleCount = parsableByteArray.readUnsignedIntToInt();
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.mp4.AtomParsers.SampleSizeBox
        public int getSampleCount() {
            return this.sampleCount;
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.mp4.AtomParsers.SampleSizeBox
        public boolean isFixedSampleSize() {
            return false;
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.mp4.AtomParsers.SampleSizeBox
        public int readNextSampleSize() {
            int i = this.fieldSize;
            if (i == 8) {
                return this.data.readUnsignedByte();
            }
            if (i == 16) {
                return this.data.readUnsignedShort();
            }
            int i2 = this.sampleIndex;
            this.sampleIndex = i2 + 1;
            if (i2 % 2 != 0) {
                return this.currentByte & 15;
            }
            int readUnsignedByte = this.data.readUnsignedByte();
            this.currentByte = readUnsignedByte;
            return (readUnsignedByte & 240) >> 4;
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class TkhdData {
        private final long duration;
        private final int id;
        private final int rotationDegrees;

        public TkhdData(int i, long j, int i2) {
            this.id = i;
            this.duration = j;
            this.rotationDegrees = i2;
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class UnhandledEditListException extends ParserException {
    }

    private AtomParsers() {
    }

    private static boolean canApplyEditWithGaplessInfo(long[] jArr, long j, long j2, long j3) {
        int length = jArr.length - 1;
        return jArr[0] <= j2 && j2 < jArr[Util.constrainValue(3, 0, length)] && jArr[Util.constrainValue(jArr.length - 3, 0, length)] < j3 && j3 <= j;
    }

    private static int findEsdsPosition(ParsableByteArray parsableByteArray, int i, int i2) {
        int position = parsableByteArray.getPosition();
        while (position - i < i2) {
            parsableByteArray.setPosition(position);
            int readInt = parsableByteArray.readInt();
            Assertions.checkArgument(readInt > 0, "childAtomSize should be positive");
            if (parsableByteArray.readInt() == Atom.TYPE_esds) {
                return position;
            }
            position += readInt;
        }
        return -1;
    }

    private static void parseAudioSampleEntry(ParsableByteArray parsableByteArray, int i, int i2, int i3, int i4, String str, boolean z, DrmInitData drmInitData, StsdData stsdData, int i5) throws ParserException {
        int i6;
        int readUnsignedFixedPoint1616;
        int i7;
        int i8;
        DrmInitData drmInitData2;
        int i9;
        String str2;
        int i10;
        boolean z2;
        int i11;
        int i12 = i2;
        int i13 = i3;
        String str3 = str;
        DrmInitData drmInitData3 = drmInitData;
        parsableByteArray.setPosition(i12 + 16);
        if (z) {
            i6 = parsableByteArray.readUnsignedShort();
            parsableByteArray.skipBytes(6);
        } else {
            parsableByteArray.skipBytes(8);
            i6 = 0;
        }
        int i14 = 2;
        boolean z3 = true;
        if (i6 == 0 || i6 == 1) {
            int readUnsignedShort = parsableByteArray.readUnsignedShort();
            parsableByteArray.skipBytes(6);
            readUnsignedFixedPoint1616 = parsableByteArray.readUnsignedFixedPoint1616();
            if (i6 == 1) {
                parsableByteArray.skipBytes(16);
            }
            i7 = readUnsignedShort;
        } else {
            if (i6 != 2) {
                return;
            }
            parsableByteArray.skipBytes(16);
            readUnsignedFixedPoint1616 = (int) Math.round(parsableByteArray.readDouble());
            i7 = parsableByteArray.readUnsignedIntToInt();
            parsableByteArray.skipBytes(20);
        }
        int position = parsableByteArray.getPosition();
        int i15 = i;
        if (i15 == Atom.TYPE_enca) {
            Pair<Integer, TrackEncryptionBox> parseSampleEntryEncryptionData = parseSampleEntryEncryptionData(parsableByteArray, i12, i13);
            if (parseSampleEntryEncryptionData != null) {
                i15 = ((Integer) parseSampleEntryEncryptionData.first).intValue();
                drmInitData3 = drmInitData3 == null ? null : drmInitData3.copyWithSchemeType(((TrackEncryptionBox) parseSampleEntryEncryptionData.second).schemeType);
                stsdData.trackEncryptionBoxes[i5] = (TrackEncryptionBox) parseSampleEntryEncryptionData.second;
            }
            parsableByteArray.setPosition(position);
        }
        DrmInitData drmInitData4 = drmInitData3;
        int i16 = Atom.TYPE_ac_3;
        String str4 = MimeTypes.AUDIO_RAW;
        int i17 = readUnsignedFixedPoint1616;
        String str5 = i15 == i16 ? MimeTypes.AUDIO_AC3 : i15 == Atom.TYPE_ec_3 ? MimeTypes.AUDIO_E_AC3 : i15 == Atom.TYPE_dtsc ? MimeTypes.AUDIO_DTS : (i15 == Atom.TYPE_dtsh || i15 == Atom.TYPE_dtsl) ? MimeTypes.AUDIO_DTS_HD : i15 == Atom.TYPE_dtse ? MimeTypes.AUDIO_DTS_EXPRESS : i15 == Atom.TYPE_samr ? MimeTypes.AUDIO_AMR_NB : i15 == Atom.TYPE_sawb ? MimeTypes.AUDIO_AMR_WB : (i15 == Atom.TYPE_lpcm || i15 == Atom.TYPE_sowt) ? MimeTypes.AUDIO_RAW : i15 == Atom.TYPE__mp3 ? MimeTypes.AUDIO_MPEG : i15 == Atom.TYPE_alac ? MimeTypes.AUDIO_ALAC : null;
        int i18 = i17;
        int i19 = i7;
        int i20 = position;
        byte[] bArr = null;
        while (i20 - i12 < i13) {
            parsableByteArray.setPosition(i20);
            int readInt = parsableByteArray.readInt();
            Assertions.checkArgument(readInt > 0 ? z3 : false, "childAtomSize should be positive");
            int readInt2 = parsableByteArray.readInt();
            int i21 = Atom.TYPE_esds;
            if (readInt2 == i21 || (z && readInt2 == Atom.TYPE_wave)) {
                i8 = i20;
                drmInitData2 = drmInitData4;
                i9 = readInt;
                str2 = str4;
                i10 = 2;
                z2 = true;
                i11 = i18;
                int findEsdsPosition = readInt2 == i21 ? i8 : findEsdsPosition(parsableByteArray, i8, i9);
                if (findEsdsPosition != -1) {
                    Pair<String, byte[]> parseEsdsFromParent = parseEsdsFromParent(parsableByteArray, findEsdsPosition);
                    str5 = (String) parseEsdsFromParent.first;
                    bArr = (byte[]) parseEsdsFromParent.second;
                    if (MimeTypes.AUDIO_AAC.equals(str5)) {
                        Pair<Integer, Integer> parseAacAudioSpecificConfig = CodecSpecificDataUtil.parseAacAudioSpecificConfig(bArr);
                        int intValue = ((Integer) parseAacAudioSpecificConfig.first).intValue();
                        i19 = ((Integer) parseAacAudioSpecificConfig.second).intValue();
                        i18 = intValue;
                        i20 = i9 + i8;
                        str4 = str2;
                        drmInitData4 = drmInitData2;
                        i14 = i10;
                        z3 = z2;
                        i12 = i2;
                        i13 = i3;
                        str3 = str;
                    }
                }
            } else {
                if (readInt2 == Atom.TYPE_dac3) {
                    parsableByteArray.setPosition(i20 + 8);
                    stsdData.format = Ac3Util.parseAc3AnnexFFormat(parsableByteArray, Integer.toString(i4), str3, drmInitData4);
                } else if (readInt2 == Atom.TYPE_dec3) {
                    parsableByteArray.setPosition(i20 + 8);
                    stsdData.format = Ac3Util.parseEAc3AnnexFFormat(parsableByteArray, Integer.toString(i4), str3, drmInitData4);
                } else if (readInt2 == Atom.TYPE_ddts) {
                    drmInitData2 = drmInitData4;
                    i11 = i18;
                    i8 = i20;
                    i9 = readInt;
                    str2 = str4;
                    i10 = 2;
                    z2 = true;
                    stsdData.format = Format.createAudioSampleFormat(Integer.toString(i4), str5, null, -1, -1, i19, i11, null, drmInitData2, 0, str);
                } else {
                    i8 = i20;
                    drmInitData2 = drmInitData4;
                    i9 = readInt;
                    str2 = str4;
                    i10 = 2;
                    z2 = true;
                    i11 = i18;
                    if (readInt2 == Atom.TYPE_alac) {
                        byte[] bArr2 = new byte[i9];
                        parsableByteArray.setPosition(i8);
                        parsableByteArray.readBytes(bArr2, 0, i9);
                        bArr = bArr2;
                    }
                }
                i8 = i20;
                drmInitData2 = drmInitData4;
                i9 = readInt;
                str2 = str4;
                i10 = 2;
                z2 = true;
                i11 = i18;
            }
            i18 = i11;
            i20 = i9 + i8;
            str4 = str2;
            drmInitData4 = drmInitData2;
            i14 = i10;
            z3 = z2;
            i12 = i2;
            i13 = i3;
            str3 = str;
        }
        int i22 = i14;
        DrmInitData drmInitData5 = drmInitData4;
        String str6 = str4;
        int i23 = i18;
        if (stsdData.format != null || str5 == null) {
            return;
        }
        stsdData.format = Format.createAudioSampleFormat(Integer.toString(i4), str5, null, -1, -1, i19, i23, str6.equals(str5) ? i22 : -1, bArr != null ? Collections.singletonList(bArr) : null, drmInitData5, 0, str);
    }

    public static Pair<Integer, TrackEncryptionBox> parseCommonEncryptionSinfFromParent(ParsableByteArray parsableByteArray, int i, int i2) {
        int i3 = i + 8;
        int i4 = -1;
        int i5 = 0;
        String str = null;
        Integer num = null;
        while (i3 - i < i2) {
            parsableByteArray.setPosition(i3);
            int readInt = parsableByteArray.readInt();
            int readInt2 = parsableByteArray.readInt();
            if (readInt2 == Atom.TYPE_frma) {
                num = Integer.valueOf(parsableByteArray.readInt());
            } else if (readInt2 == Atom.TYPE_schm) {
                parsableByteArray.skipBytes(4);
                str = parsableByteArray.readString(4);
            } else if (readInt2 == Atom.TYPE_schi) {
                i4 = i3;
                i5 = readInt;
            }
            i3 += readInt;
        }
        if (!C.CENC_TYPE_cenc.equals(str) && !C.CENC_TYPE_cbc1.equals(str) && !C.CENC_TYPE_cens.equals(str) && !C.CENC_TYPE_cbcs.equals(str)) {
            return null;
        }
        Assertions.checkArgument(num != null, "frma atom is mandatory");
        Assertions.checkArgument(i4 != -1, "schi atom is mandatory");
        TrackEncryptionBox parseSchiFromParent = parseSchiFromParent(parsableByteArray, i4, i5, str);
        Assertions.checkArgument(parseSchiFromParent != null, "tenc atom is mandatory");
        return Pair.create(num, parseSchiFromParent);
    }

    private static Pair<long[], long[]> parseEdts(Atom.ContainerAtom containerAtom) {
        Atom.LeafAtom leafAtomOfType;
        if (containerAtom == null || (leafAtomOfType = containerAtom.getLeafAtomOfType(Atom.TYPE_elst)) == null) {
            return Pair.create(null, null);
        }
        ParsableByteArray parsableByteArray = leafAtomOfType.data;
        parsableByteArray.setPosition(8);
        int parseFullAtomVersion = Atom.parseFullAtomVersion(parsableByteArray.readInt());
        int readUnsignedIntToInt = parsableByteArray.readUnsignedIntToInt();
        long[] jArr = new long[readUnsignedIntToInt];
        long[] jArr2 = new long[readUnsignedIntToInt];
        for (int i = 0; i < readUnsignedIntToInt; i++) {
            jArr[i] = parseFullAtomVersion == 1 ? parsableByteArray.readUnsignedLongToLong() : parsableByteArray.readUnsignedInt();
            jArr2[i] = parseFullAtomVersion == 1 ? parsableByteArray.readLong() : parsableByteArray.readInt();
            if (parsableByteArray.readShort() != 1) {
                a70.p("Unsupported media rate.");
                return null;
            }
            parsableByteArray.skipBytes(2);
        }
        return Pair.create(jArr, jArr2);
    }

    private static Pair<String, byte[]> parseEsdsFromParent(ParsableByteArray parsableByteArray, int i) {
        parsableByteArray.setPosition(i + 12);
        parsableByteArray.skipBytes(1);
        parseExpandableClassSize(parsableByteArray);
        parsableByteArray.skipBytes(2);
        int readUnsignedByte = parsableByteArray.readUnsignedByte();
        if ((readUnsignedByte & 128) != 0) {
            parsableByteArray.skipBytes(2);
        }
        if ((readUnsignedByte & 64) != 0) {
            parsableByteArray.skipBytes(parsableByteArray.readUnsignedShort());
        }
        if ((readUnsignedByte & 32) != 0) {
            parsableByteArray.skipBytes(2);
        }
        parsableByteArray.skipBytes(1);
        parseExpandableClassSize(parsableByteArray);
        String mimeTypeFromMp4ObjectType = MimeTypes.getMimeTypeFromMp4ObjectType(parsableByteArray.readUnsignedByte());
        if (MimeTypes.AUDIO_MPEG.equals(mimeTypeFromMp4ObjectType) || MimeTypes.AUDIO_DTS.equals(mimeTypeFromMp4ObjectType) || MimeTypes.AUDIO_DTS_HD.equals(mimeTypeFromMp4ObjectType)) {
            return Pair.create(mimeTypeFromMp4ObjectType, null);
        }
        parsableByteArray.skipBytes(12);
        parsableByteArray.skipBytes(1);
        int parseExpandableClassSize = parseExpandableClassSize(parsableByteArray);
        byte[] bArr = new byte[parseExpandableClassSize];
        parsableByteArray.readBytes(bArr, 0, parseExpandableClassSize);
        return Pair.create(mimeTypeFromMp4ObjectType, bArr);
    }

    private static int parseExpandableClassSize(ParsableByteArray parsableByteArray) {
        int readUnsignedByte = parsableByteArray.readUnsignedByte();
        int i = readUnsignedByte & Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE;
        while ((readUnsignedByte & 128) == 128) {
            readUnsignedByte = parsableByteArray.readUnsignedByte();
            i = (i << 7) | (readUnsignedByte & Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE);
        }
        return i;
    }

    private static int parseHdlr(ParsableByteArray parsableByteArray) {
        parsableByteArray.setPosition(16);
        int readInt = parsableByteArray.readInt();
        if (readInt == TYPE_soun) {
            return 1;
        }
        if (readInt == TYPE_vide) {
            return 2;
        }
        if (readInt == TYPE_text || readInt == TYPE_sbtl || readInt == TYPE_subt || readInt == TYPE_clcp) {
            return 3;
        }
        return readInt == TYPE_meta ? 4 : -1;
    }

    private static Metadata parseIlst(ParsableByteArray parsableByteArray, int i) {
        parsableByteArray.skipBytes(8);
        ArrayList arrayList = new ArrayList();
        while (parsableByteArray.getPosition() < i) {
            Metadata.Entry parseIlstElement = MetadataUtil.parseIlstElement(parsableByteArray);
            if (parseIlstElement != null) {
                arrayList.add(parseIlstElement);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }

    private static Pair<Long, String> parseMdhd(ParsableByteArray parsableByteArray) {
        parsableByteArray.setPosition(8);
        int parseFullAtomVersion = Atom.parseFullAtomVersion(parsableByteArray.readInt());
        parsableByteArray.skipBytes(parseFullAtomVersion == 0 ? 8 : 16);
        long readUnsignedInt = parsableByteArray.readUnsignedInt();
        parsableByteArray.skipBytes(parseFullAtomVersion == 0 ? 4 : 8);
        int readUnsignedShort = parsableByteArray.readUnsignedShort();
        return Pair.create(Long.valueOf(readUnsignedInt), "" + ((char) (((readUnsignedShort >> 10) & 31) + 96)) + ((char) (((readUnsignedShort >> 5) & 31) + 96)) + ((char) ((readUnsignedShort & 31) + 96)));
    }

    private static Metadata parseMetaAtom(ParsableByteArray parsableByteArray, int i) {
        parsableByteArray.skipBytes(12);
        while (parsableByteArray.getPosition() < i) {
            int position = parsableByteArray.getPosition();
            int readInt = parsableByteArray.readInt();
            if (parsableByteArray.readInt() == Atom.TYPE_ilst) {
                parsableByteArray.setPosition(position);
                return parseIlst(parsableByteArray, position + readInt);
            }
            parsableByteArray.skipBytes(readInt - 8);
        }
        return null;
    }

    private static long parseMvhd(ParsableByteArray parsableByteArray) {
        parsableByteArray.setPosition(8);
        parsableByteArray.skipBytes(Atom.parseFullAtomVersion(parsableByteArray.readInt()) != 0 ? 16 : 8);
        return parsableByteArray.readUnsignedInt();
    }

    private static float parsePaspFromParent(ParsableByteArray parsableByteArray, int i) {
        parsableByteArray.setPosition(i + 8);
        return parsableByteArray.readUnsignedIntToInt() / parsableByteArray.readUnsignedIntToInt();
    }

    private static byte[] parseProjFromParent(ParsableByteArray parsableByteArray, int i, int i2) {
        int i3 = i + 8;
        while (i3 - i < i2) {
            parsableByteArray.setPosition(i3);
            int readInt = parsableByteArray.readInt();
            if (parsableByteArray.readInt() == Atom.TYPE_proj) {
                return Arrays.copyOfRange(parsableByteArray.data, i3, readInt + i3);
            }
            i3 += readInt;
        }
        return null;
    }

    private static Pair<Integer, TrackEncryptionBox> parseSampleEntryEncryptionData(ParsableByteArray parsableByteArray, int i, int i2) {
        Pair<Integer, TrackEncryptionBox> parseCommonEncryptionSinfFromParent;
        int position = parsableByteArray.getPosition();
        while (position - i < i2) {
            parsableByteArray.setPosition(position);
            int readInt = parsableByteArray.readInt();
            Assertions.checkArgument(readInt > 0, "childAtomSize should be positive");
            if (parsableByteArray.readInt() == Atom.TYPE_sinf && (parseCommonEncryptionSinfFromParent = parseCommonEncryptionSinfFromParent(parsableByteArray, position, readInt)) != null) {
                return parseCommonEncryptionSinfFromParent;
            }
            position += readInt;
        }
        return null;
    }

    private static TrackEncryptionBox parseSchiFromParent(ParsableByteArray parsableByteArray, int i, int i2, String str) {
        int i3;
        int i4;
        int i5 = i + 8;
        while (true) {
            byte[] bArr = null;
            if (i5 - i >= i2) {
                return null;
            }
            parsableByteArray.setPosition(i5);
            int readInt = parsableByteArray.readInt();
            if (parsableByteArray.readInt() == Atom.TYPE_tenc) {
                int parseFullAtomVersion = Atom.parseFullAtomVersion(parsableByteArray.readInt());
                parsableByteArray.skipBytes(1);
                if (parseFullAtomVersion == 0) {
                    parsableByteArray.skipBytes(1);
                    i4 = 0;
                    i3 = 0;
                } else {
                    int readUnsignedByte = parsableByteArray.readUnsignedByte();
                    i3 = readUnsignedByte & 15;
                    i4 = (readUnsignedByte & 240) >> 4;
                }
                boolean z = parsableByteArray.readUnsignedByte() == 1;
                int readUnsignedByte2 = parsableByteArray.readUnsignedByte();
                byte[] bArr2 = new byte[16];
                parsableByteArray.readBytes(bArr2, 0, 16);
                if (z && readUnsignedByte2 == 0) {
                    int readUnsignedByte3 = parsableByteArray.readUnsignedByte();
                    bArr = new byte[readUnsignedByte3];
                    parsableByteArray.readBytes(bArr, 0, readUnsignedByte3);
                }
                return new TrackEncryptionBox(z, str, readUnsignedByte2, bArr2, i4, i3, bArr);
            }
            i5 += readInt;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:201:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0206  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static TrackSampleTable parseStbl(Track track, Atom.ContainerAtom containerAtom, GaplessInfoHolder gaplessInfoHolder) throws ParserException {
        SampleSizeBox stz2SampleSizeBox;
        boolean z;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        long[] jArr;
        int[] iArr;
        int[] iArr2;
        long[] jArr2;
        long j;
        int i6;
        int[] iArr3;
        long scaleLargeTimestamp;
        Track track2;
        int i7;
        long[] jArr3;
        int[] iArr4;
        int i8;
        long j2;
        int i9;
        int i10;
        int i11;
        int i12;
        Atom.LeafAtom leafAtomOfType = containerAtom.getLeafAtomOfType(Atom.TYPE_stsz);
        ParsableByteArray parsableByteArray = null;
        if (leafAtomOfType != null) {
            stz2SampleSizeBox = new StszSampleSizeBox(leafAtomOfType);
        } else {
            Atom.LeafAtom leafAtomOfType2 = containerAtom.getLeafAtomOfType(Atom.TYPE_stz2);
            if (leafAtomOfType2 == null) {
                yhk.k("Track has no sample table size information");
                return null;
            }
            stz2SampleSizeBox = new Stz2SampleSizeBox(leafAtomOfType2);
        }
        int sampleCount = stz2SampleSizeBox.getSampleCount();
        if (sampleCount == 0) {
            return new TrackSampleTable(track, new long[0], new int[0], 0, new long[0], new int[0], C.TIME_UNSET);
        }
        Atom.LeafAtom leafAtomOfType3 = containerAtom.getLeafAtomOfType(Atom.TYPE_stco);
        if (leafAtomOfType3 == null) {
            leafAtomOfType3 = containerAtom.getLeafAtomOfType(Atom.TYPE_co64);
            z = true;
        } else {
            z = false;
        }
        ParsableByteArray parsableByteArray2 = leafAtomOfType3.data;
        ParsableByteArray parsableByteArray3 = containerAtom.getLeafAtomOfType(Atom.TYPE_stsc).data;
        ParsableByteArray parsableByteArray4 = containerAtom.getLeafAtomOfType(Atom.TYPE_stts).data;
        Atom.LeafAtom leafAtomOfType4 = containerAtom.getLeafAtomOfType(Atom.TYPE_stss);
        ParsableByteArray parsableByteArray5 = leafAtomOfType4 != null ? leafAtomOfType4.data : null;
        Atom.LeafAtom leafAtomOfType5 = containerAtom.getLeafAtomOfType(Atom.TYPE_ctts);
        ParsableByteArray parsableByteArray6 = leafAtomOfType5 != null ? leafAtomOfType5.data : null;
        ChunkIterator chunkIterator = new ChunkIterator(parsableByteArray3, parsableByteArray2, z);
        parsableByteArray4.setPosition(12);
        int readUnsignedIntToInt = parsableByteArray4.readUnsignedIntToInt() - 1;
        int readUnsignedIntToInt2 = parsableByteArray4.readUnsignedIntToInt();
        int readUnsignedIntToInt3 = parsableByteArray4.readUnsignedIntToInt();
        if (parsableByteArray6 != null) {
            parsableByteArray6.setPosition(12);
            i = parsableByteArray6.readUnsignedIntToInt();
        } else {
            i = 0;
        }
        if (parsableByteArray5 != null) {
            parsableByteArray5.setPosition(12);
            i2 = parsableByteArray5.readUnsignedIntToInt();
            r16 = i2 > 0 ? parsableByteArray5.readUnsignedIntToInt() - 1 : -1;
            if (stz2SampleSizeBox.isFixedSampleSize()) {
                i3 = 0;
            } else {
                i3 = 0;
                if (MimeTypes.AUDIO_RAW.equals(track.format.sampleMimeType) && readUnsignedIntToInt == 0 && i == 0 && i2 == 0) {
                    i4 = 1;
                    if (i4 == 0) {
                        long[] jArr4 = new long[sampleCount];
                        iArr = new int[sampleCount];
                        i5 = 1;
                        long[] jArr5 = new long[sampleCount];
                        ParsableByteArray parsableByteArray7 = parsableByteArray6;
                        int[] iArr5 = new int[sampleCount];
                        int i13 = r16;
                        ParsableByteArray parsableByteArray8 = parsableByteArray;
                        SampleSizeBox sampleSizeBox = stz2SampleSizeBox;
                        int i14 = i3;
                        int i15 = i14;
                        int i16 = i15;
                        int i17 = i16;
                        int i18 = i17;
                        long j3 = 0;
                        long j4 = 0;
                        while (i14 < sampleCount) {
                            while (i18 == 0) {
                                Assertions.checkState(chunkIterator.moveNext());
                                j4 = chunkIterator.offset;
                                i18 = chunkIterator.numSamples;
                                jArr5 = jArr5;
                                i2 = i2;
                            }
                            int i19 = i2;
                            long[] jArr6 = jArr5;
                            if (parsableByteArray7 != null) {
                                while (i17 == 0 && i > 0) {
                                    i17 = parsableByteArray7.readUnsignedIntToInt();
                                    i15 = parsableByteArray7.readInt();
                                    i--;
                                }
                                i17--;
                            }
                            jArr4[i14] = j4;
                            int readNextSampleSize = sampleSizeBox.readNextSampleSize();
                            iArr[i14] = readNextSampleSize;
                            if (readNextSampleSize > i16) {
                                i16 = readNextSampleSize;
                            }
                            jArr6[i14] = j3 + i15;
                            iArr5[i14] = parsableByteArray8 == null ? 1 : i3;
                            if (i14 == i13) {
                                iArr5[i14] = 1;
                                i2 = i19 - 1;
                                if (i2 > 0) {
                                    i13 = parsableByteArray8.readUnsignedIntToInt() - 1;
                                }
                                i11 = i14;
                                i12 = i15;
                            } else {
                                i11 = i14;
                                i12 = i15;
                                i2 = i19;
                            }
                            j3 += readUnsignedIntToInt3;
                            readUnsignedIntToInt2--;
                            if (readUnsignedIntToInt2 == 0 && readUnsignedIntToInt > 0) {
                                readUnsignedIntToInt--;
                                readUnsignedIntToInt2 = parsableByteArray4.readUnsignedIntToInt();
                                readUnsignedIntToInt3 = parsableByteArray4.readInt();
                            }
                            j4 += iArr[i11];
                            i18--;
                            i14 = i11 + 1;
                            jArr5 = jArr6;
                            i15 = i12;
                        }
                        int i20 = i2;
                        long[] jArr7 = jArr5;
                        long j5 = j3 + i15;
                        Assertions.checkArgument(i17 == 0 ? 1 : i3);
                        while (i > 0) {
                            Assertions.checkArgument(parsableByteArray7.readUnsignedIntToInt() == 0 ? 1 : i3);
                            parsableByteArray7.readInt();
                            i--;
                        }
                        if (i20 != 0 || readUnsignedIntToInt2 != 0 || i18 != 0 || readUnsignedIntToInt != 0) {
                            int i21 = track.id;
                        }
                        i6 = i16;
                        iArr2 = iArr5;
                        jArr = jArr4;
                        j = j5;
                        jArr2 = jArr7;
                    } else {
                        i5 = 1;
                        int i22 = chunkIterator.length;
                        long[] jArr8 = new long[i22];
                        int[] iArr6 = new int[i22];
                        while (chunkIterator.moveNext()) {
                            int i23 = chunkIterator.index;
                            jArr8[i23] = chunkIterator.offset;
                            iArr6[i23] = chunkIterator.numSamples;
                        }
                        Format format = track.format;
                        FixedSampleSizeRechunker.Results rechunk = FixedSampleSizeRechunker.rechunk(Util.getPcmFrameSize(format.pcmEncoding, format.channelCount), jArr8, iArr6, readUnsignedIntToInt3);
                        jArr = rechunk.offsets;
                        iArr = rechunk.sizes;
                        int i24 = rechunk.maximumSize;
                        long[] jArr9 = rechunk.timestamps;
                        int[] iArr7 = rechunk.flags;
                        long j6 = rechunk.duration;
                        iArr2 = iArr7;
                        jArr2 = jArr9;
                        j = j6;
                        i6 = i24;
                    }
                    iArr3 = iArr;
                    scaleLargeTimestamp = Util.scaleLargeTimestamp(j, 1000000L, track.timescale);
                    if (track.editListDurations != null || gaplessInfoHolder.hasGaplessInfo()) {
                        int i25 = i6;
                        long[] jArr10 = jArr;
                        long[] jArr11 = jArr2;
                        int[] iArr8 = iArr2;
                        Util.scaleLargeTimestampsInPlace(jArr11, 1000000L, track.timescale);
                        return new TrackSampleTable(track, jArr10, iArr3, i25, jArr11, iArr8, scaleLargeTimestamp);
                    }
                    long[] jArr12 = track.editListDurations;
                    int i26 = i5;
                    if (jArr12.length == i26 && track.type == i26 && jArr2.length >= 2) {
                        long j7 = track.editListMediaTimes[i3];
                        int i27 = i6;
                        long scaleLargeTimestamp2 = Util.scaleLargeTimestamp(jArr12[i3], track.timescale, track.movieTimescale) + j7;
                        if (canApplyEditWithGaplessInfo(jArr2, j, j7, scaleLargeTimestamp2)) {
                            long scaleLargeTimestamp3 = Util.scaleLargeTimestamp(j7 - jArr2[i3], track.format.sampleRate, track.timescale);
                            long scaleLargeTimestamp4 = Util.scaleLargeTimestamp(j - scaleLargeTimestamp2, track.format.sampleRate, track.timescale);
                            if ((scaleLargeTimestamp3 != 0 || scaleLargeTimestamp4 != 0) && scaleLargeTimestamp3 <= 2147483647L && scaleLargeTimestamp4 <= 2147483647L) {
                                gaplessInfoHolder.encoderDelay = (int) scaleLargeTimestamp3;
                                gaplessInfoHolder.encoderPadding = (int) scaleLargeTimestamp4;
                                Util.scaleLargeTimestampsInPlace(jArr2, 1000000L, track.timescale);
                                return new TrackSampleTable(track, jArr, iArr3, i27, jArr2, iArr2, scaleLargeTimestamp);
                            }
                        }
                        i6 = i27;
                        track2 = track;
                        iArr3 = iArr3;
                    } else {
                        track2 = track;
                    }
                    int[] iArr9 = iArr2;
                    long[] jArr13 = jArr;
                    long[] jArr14 = jArr2;
                    long[] jArr15 = track2.editListDurations;
                    if (jArr15.length == 1 && jArr15[i3] == 0) {
                        long j8 = track2.editListMediaTimes[i3];
                        for (int i28 = i3; i28 < jArr14.length; i28++) {
                            jArr14[i28] = Util.scaleLargeTimestamp(jArr14[i28] - j8, 1000000L, track2.timescale);
                        }
                        return new TrackSampleTable(track2, jArr13, iArr3, i6, jArr14, iArr9, Util.scaleLargeTimestamp(j - j8, 1000000L, track2.timescale));
                    }
                    boolean z2 = track2.type == 1 ? 1 : i3;
                    int i29 = i3;
                    int i30 = i29;
                    int i31 = i30;
                    int i32 = i31;
                    while (true) {
                        long[] jArr16 = track2.editListDurations;
                        if (i29 >= jArr16.length) {
                            break;
                        }
                        long j9 = track2.editListMediaTimes[i29];
                        if (j9 != -1) {
                            long scaleLargeTimestamp5 = Util.scaleLargeTimestamp(jArr16[i29], track2.timescale, track2.movieTimescale);
                            i9 = i6;
                            i10 = i29;
                            int binarySearchCeil = Util.binarySearchCeil(jArr14, j9, true, true);
                            int binarySearchCeil2 = Util.binarySearchCeil(jArr14, j9 + scaleLargeTimestamp5, z2, (boolean) i3);
                            i30 += binarySearchCeil2 - binarySearchCeil;
                            i32 |= i31 != binarySearchCeil ? 1 : 0;
                            i31 = binarySearchCeil2;
                        } else {
                            i9 = i6;
                            i10 = i29;
                        }
                        i29 = i10 + 1;
                        i6 = i9;
                        i3 = 0;
                    }
                    int i33 = i6;
                    int i34 = (i30 != sampleCount ? 1 : 0) | i32;
                    long[] jArr17 = i34 != 0 ? new long[i30] : jArr13;
                    int[] iArr10 = i34 != 0 ? new int[i30] : iArr3;
                    if (i34 != 0) {
                        i33 = 0;
                    }
                    int[] iArr11 = i34 != 0 ? new int[i30] : iArr9;
                    long[] jArr18 = new long[i30];
                    long j10 = 0;
                    int i35 = 0;
                    int i36 = 0;
                    while (true) {
                        long[] jArr19 = track2.editListDurations;
                        if (i35 >= jArr19.length) {
                            return new TrackSampleTable(track2, jArr17, iArr10, i33, jArr18, iArr11, Util.scaleLargeTimestamp(j10, 1000000L, track2.timescale));
                        }
                        long j11 = track2.editListMediaTimes[i35];
                        long j12 = jArr19[i35];
                        if (j11 != -1) {
                            jArr3 = jArr18;
                            iArr4 = iArr11;
                            j2 = j12;
                            long scaleLargeTimestamp6 = Util.scaleLargeTimestamp(j12, track2.timescale, track2.movieTimescale) + j11;
                            i7 = i34;
                            i8 = i35;
                            int binarySearchCeil3 = Util.binarySearchCeil(jArr14, j11, true, true);
                            int binarySearchCeil4 = Util.binarySearchCeil(jArr14, scaleLargeTimestamp6, z2, false);
                            if (i7 != 0) {
                                int i37 = binarySearchCeil4 - binarySearchCeil3;
                                System.arraycopy(jArr13, binarySearchCeil3, jArr17, i36, i37);
                                System.arraycopy(iArr3, binarySearchCeil3, iArr10, i36, i37);
                                System.arraycopy(iArr9, binarySearchCeil3, iArr4, i36, i37);
                            }
                            if (binarySearchCeil3 < binarySearchCeil4 && (iArr4[i36] & 1) == 0) {
                                throw new UnhandledEditListException();
                            }
                            int i38 = i33;
                            while (binarySearchCeil3 < binarySearchCeil4) {
                                long[] jArr20 = jArr13;
                                int[] iArr12 = iArr3;
                                jArr3[i36] = Util.scaleLargeTimestamp(j10, 1000000L, track2.movieTimescale) + Util.scaleLargeTimestamp(jArr14[binarySearchCeil3] - j11, 1000000L, track2.timescale);
                                if (i7 != 0 && iArr10[i36] > i38) {
                                    i38 = iArr12[binarySearchCeil3];
                                }
                                i36++;
                                binarySearchCeil3++;
                                iArr3 = iArr12;
                                jArr13 = jArr20;
                            }
                            i33 = i38;
                        } else {
                            i7 = i34;
                            jArr3 = jArr18;
                            iArr4 = iArr11;
                            i8 = i35;
                            j2 = j12;
                        }
                        j10 += j2;
                        i35 = i8 + 1;
                        iArr11 = iArr4;
                        iArr3 = iArr3;
                        jArr18 = jArr3;
                        i34 = i7;
                        jArr13 = jArr13;
                    }
                }
            }
            i4 = i3;
            if (i4 == 0) {
            }
            iArr3 = iArr;
            scaleLargeTimestamp = Util.scaleLargeTimestamp(j, 1000000L, track.timescale);
            if (track.editListDurations != null) {
            }
            int i252 = i6;
            long[] jArr102 = jArr;
            long[] jArr112 = jArr2;
            int[] iArr82 = iArr2;
            Util.scaleLargeTimestampsInPlace(jArr112, 1000000L, track.timescale);
            return new TrackSampleTable(track, jArr102, iArr3, i252, jArr112, iArr82, scaleLargeTimestamp);
        }
        i2 = 0;
        parsableByteArray = parsableByteArray5;
        if (stz2SampleSizeBox.isFixedSampleSize()) {
        }
        i4 = i3;
        if (i4 == 0) {
        }
        iArr3 = iArr;
        scaleLargeTimestamp = Util.scaleLargeTimestamp(j, 1000000L, track.timescale);
        if (track.editListDurations != null) {
        }
        int i2522 = i6;
        long[] jArr1022 = jArr;
        long[] jArr1122 = jArr2;
        int[] iArr822 = iArr2;
        Util.scaleLargeTimestampsInPlace(jArr1122, 1000000L, track.timescale);
        return new TrackSampleTable(track, jArr1022, iArr3, i2522, jArr1122, iArr822, scaleLargeTimestamp);
    }

    private static StsdData parseStsd(ParsableByteArray parsableByteArray, int i, int i2, String str, DrmInitData drmInitData, boolean z) throws ParserException {
        parsableByteArray.setPosition(12);
        int readInt = parsableByteArray.readInt();
        StsdData stsdData = new StsdData(readInt);
        int i3 = 0;
        while (i3 < readInt) {
            int position = parsableByteArray.getPosition();
            int readInt2 = parsableByteArray.readInt();
            Assertions.checkArgument(readInt2 > 0, "childAtomSize should be positive");
            int readInt3 = parsableByteArray.readInt();
            if (readInt3 == Atom.TYPE_avc1 || readInt3 == Atom.TYPE_avc3 || readInt3 == Atom.TYPE_encv || readInt3 == Atom.TYPE_mp4v || readInt3 == Atom.TYPE_hvc1 || readInt3 == Atom.TYPE_hev1 || readInt3 == Atom.TYPE_s263 || readInt3 == Atom.TYPE_vp08 || readInt3 == Atom.TYPE_vp09) {
                StsdData stsdData2 = stsdData;
                int i4 = i3;
                parseVideoSampleEntry(parsableByteArray, readInt3, position, readInt2, i, i2, drmInitData, stsdData2, i4);
                stsdData = stsdData2;
                i3 = i4;
            } else if (readInt3 == Atom.TYPE_mp4a || readInt3 == Atom.TYPE_enca || readInt3 == Atom.TYPE_ac_3 || readInt3 == Atom.TYPE_ec_3 || readInt3 == Atom.TYPE_dtsc || readInt3 == Atom.TYPE_dtse || readInt3 == Atom.TYPE_dtsh || readInt3 == Atom.TYPE_dtsl || readInt3 == Atom.TYPE_samr || readInt3 == Atom.TYPE_sawb || readInt3 == Atom.TYPE_lpcm || readInt3 == Atom.TYPE_sowt || readInt3 == Atom.TYPE__mp3 || readInt3 == Atom.TYPE_alac) {
                StsdData stsdData3 = stsdData;
                parseAudioSampleEntry(parsableByteArray, readInt3, position, readInt2, i, str, z, drmInitData, stsdData3, i3);
                stsdData = stsdData3;
            } else if (readInt3 == Atom.TYPE_TTML || readInt3 == Atom.TYPE_tx3g || readInt3 == Atom.TYPE_wvtt || readInt3 == Atom.TYPE_stpp || readInt3 == Atom.TYPE_c608) {
                parseTextSampleEntry(parsableByteArray, readInt3, position, readInt2, i, str, stsdData);
            } else if (readInt3 == Atom.TYPE_camm) {
                stsdData.format = Format.createSampleFormat(Integer.toString(i), MimeTypes.APPLICATION_CAMERA_MOTION, null, -1, null);
            }
            parsableByteArray.setPosition(position + readInt2);
            i3++;
        }
        return stsdData;
    }

    private static void parseTextSampleEntry(ParsableByteArray parsableByteArray, int i, int i2, int i3, int i4, String str, StsdData stsdData) throws ParserException {
        parsableByteArray.setPosition(i2 + 16);
        int i5 = Atom.TYPE_TTML;
        String str2 = MimeTypes.APPLICATION_TTML;
        List list = null;
        long j = Long.MAX_VALUE;
        if (i != i5) {
            if (i == Atom.TYPE_tx3g) {
                int i6 = i3 - 16;
                byte[] bArr = new byte[i6];
                parsableByteArray.readBytes(bArr, 0, i6);
                list = Collections.singletonList(bArr);
                str2 = MimeTypes.APPLICATION_TX3G;
            } else if (i == Atom.TYPE_wvtt) {
                str2 = MimeTypes.APPLICATION_MP4VTT;
            } else if (i == Atom.TYPE_stpp) {
                j = 0;
            } else if (i != Atom.TYPE_c608) {
                zzl.s();
                return;
            } else {
                stsdData.requiredSampleTransformation = 1;
                str2 = MimeTypes.APPLICATION_MP4CEA608;
            }
        }
        stsdData.format = Format.createTextSampleFormat(Integer.toString(i4), str2, null, -1, 0, str, -1, null, j, list);
    }

    private static TkhdData parseTkhd(ParsableByteArray parsableByteArray) {
        long j;
        parsableByteArray.setPosition(8);
        int parseFullAtomVersion = Atom.parseFullAtomVersion(parsableByteArray.readInt());
        parsableByteArray.skipBytes(parseFullAtomVersion == 0 ? 8 : 16);
        int readInt = parsableByteArray.readInt();
        parsableByteArray.skipBytes(4);
        int position = parsableByteArray.getPosition();
        int i = parseFullAtomVersion == 0 ? 4 : 8;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            j = C.TIME_UNSET;
            if (i3 >= i) {
                parsableByteArray.skipBytes(i);
                break;
            }
            if (parsableByteArray.data[position + i3] != -1) {
                long readUnsignedInt = parseFullAtomVersion == 0 ? parsableByteArray.readUnsignedInt() : parsableByteArray.readUnsignedLongToLong();
                if (readUnsignedInt != 0) {
                    j = readUnsignedInt;
                }
            } else {
                i3++;
            }
        }
        parsableByteArray.skipBytes(16);
        int readInt2 = parsableByteArray.readInt();
        int readInt3 = parsableByteArray.readInt();
        parsableByteArray.skipBytes(4);
        int readInt4 = parsableByteArray.readInt();
        int readInt5 = parsableByteArray.readInt();
        if (readInt2 == 0 && readInt3 == 65536 && readInt4 == -65536 && readInt5 == 0) {
            i2 = 90;
        } else if (readInt2 == 0 && readInt3 == -65536 && readInt4 == 65536 && readInt5 == 0) {
            i2 = 270;
        } else if (readInt2 == -65536 && readInt3 == 0 && readInt4 == 0 && readInt5 == -65536) {
            i2 = 180;
        }
        return new TkhdData(readInt, j, i2);
    }

    public static Track parseTrak(Atom.ContainerAtom containerAtom, Atom.LeafAtom leafAtom, long j, DrmInitData drmInitData, boolean z, boolean z2) throws ParserException {
        long[] jArr;
        long[] jArr2;
        Atom.ContainerAtom containerAtomOfType = containerAtom.getContainerAtomOfType(Atom.TYPE_mdia);
        int parseHdlr = parseHdlr(containerAtomOfType.getLeafAtomOfType(Atom.TYPE_hdlr).data);
        if (parseHdlr == -1) {
            return null;
        }
        TkhdData parseTkhd = parseTkhd(containerAtom.getLeafAtomOfType(Atom.TYPE_tkhd).data);
        long j2 = C.TIME_UNSET;
        long j3 = j == C.TIME_UNSET ? parseTkhd.duration : j;
        long parseMvhd = parseMvhd(leafAtom.data);
        if (j3 != C.TIME_UNSET) {
            j2 = Util.scaleLargeTimestamp(j3, 1000000L, parseMvhd);
        }
        long j4 = j2;
        Atom.ContainerAtom containerAtomOfType2 = containerAtomOfType.getContainerAtomOfType(Atom.TYPE_minf).getContainerAtomOfType(Atom.TYPE_stbl);
        Pair<Long, String> parseMdhd = parseMdhd(containerAtomOfType.getLeafAtomOfType(Atom.TYPE_mdhd).data);
        StsdData parseStsd = parseStsd(containerAtomOfType2.getLeafAtomOfType(Atom.TYPE_stsd).data, parseTkhd.id, parseTkhd.rotationDegrees, (String) parseMdhd.second, drmInitData, z2);
        if (z) {
            jArr = null;
            jArr2 = null;
        } else {
            Pair<long[], long[]> parseEdts = parseEdts(containerAtom.getContainerAtomOfType(Atom.TYPE_edts));
            long[] jArr3 = (long[]) parseEdts.first;
            jArr2 = (long[]) parseEdts.second;
            jArr = jArr3;
        }
        if (parseStsd.format == null) {
            return null;
        }
        return new Track(parseTkhd.id, parseHdlr, ((Long) parseMdhd.first).longValue(), parseMvhd, j4, parseStsd.format, parseStsd.requiredSampleTransformation, parseStsd.trackEncryptionBoxes, parseStsd.nalUnitLengthFieldLength, jArr, jArr2);
    }

    public static Metadata parseUdta(Atom.LeafAtom leafAtom, boolean z) {
        if (z) {
            return null;
        }
        ParsableByteArray parsableByteArray = leafAtom.data;
        parsableByteArray.setPosition(8);
        while (parsableByteArray.bytesLeft() >= 8) {
            int position = parsableByteArray.getPosition();
            int readInt = parsableByteArray.readInt();
            if (parsableByteArray.readInt() == Atom.TYPE_meta) {
                parsableByteArray.setPosition(position);
                return parseMetaAtom(parsableByteArray, position + readInt);
            }
            parsableByteArray.skipBytes(readInt - 8);
        }
        return null;
    }

    private static void parseVideoSampleEntry(ParsableByteArray parsableByteArray, int i, int i2, int i3, int i4, int i5, DrmInitData drmInitData, StsdData stsdData, int i6) throws ParserException {
        String str;
        List<byte[]> list;
        DrmInitData drmInitData2 = drmInitData;
        parsableByteArray.setPosition(i2 + 16);
        parsableByteArray.skipBytes(16);
        int readUnsignedShort = parsableByteArray.readUnsignedShort();
        int readUnsignedShort2 = parsableByteArray.readUnsignedShort();
        parsableByteArray.skipBytes(50);
        int position = parsableByteArray.getPosition();
        String str2 = null;
        int i7 = i;
        if (i7 == Atom.TYPE_encv) {
            Pair<Integer, TrackEncryptionBox> parseSampleEntryEncryptionData = parseSampleEntryEncryptionData(parsableByteArray, i2, i3);
            if (parseSampleEntryEncryptionData != null) {
                i7 = ((Integer) parseSampleEntryEncryptionData.first).intValue();
                drmInitData2 = drmInitData2 == null ? null : drmInitData2.copyWithSchemeType(((TrackEncryptionBox) parseSampleEntryEncryptionData.second).schemeType);
                stsdData.trackEncryptionBoxes[i6] = (TrackEncryptionBox) parseSampleEntryEncryptionData.second;
            }
            parsableByteArray.setPosition(position);
        }
        DrmInitData drmInitData3 = drmInitData2;
        float f = 1.0f;
        List<byte[]> list2 = null;
        byte[] bArr = null;
        int i8 = -1;
        boolean z = false;
        while (position - i2 < i3) {
            parsableByteArray.setPosition(position);
            int position2 = parsableByteArray.getPosition();
            int readInt = parsableByteArray.readInt();
            if (readInt == 0 && parsableByteArray.getPosition() - i2 == i3) {
                break;
            }
            int i9 = 1;
            Assertions.checkArgument(readInt > 0, "childAtomSize should be positive");
            int readInt2 = parsableByteArray.readInt();
            if (readInt2 == Atom.TYPE_avcC) {
                Assertions.checkState(str2 == null);
                parsableByteArray.setPosition(position2 + 8);
                AvcConfig parse = AvcConfig.parse(parsableByteArray);
                list = parse.initializationData;
                stsdData.nalUnitLengthFieldLength = parse.nalUnitLengthFieldLength;
                if (!z) {
                    f = parse.pixelWidthAspectRatio;
                }
                str = "video/avc";
            } else if (readInt2 == Atom.TYPE_hvcC) {
                Assertions.checkState(str2 == null);
                parsableByteArray.setPosition(position2 + 8);
                HevcConfig parse2 = HevcConfig.parse(parsableByteArray);
                list = parse2.initializationData;
                stsdData.nalUnitLengthFieldLength = parse2.nalUnitLengthFieldLength;
                str = "video/hevc";
            } else {
                if (readInt2 == Atom.TYPE_vpcC) {
                    Assertions.checkState(str2 == null);
                    str = i7 == Atom.TYPE_vp08 ? MimeTypes.VIDEO_VP8 : MimeTypes.VIDEO_VP9;
                } else if (readInt2 == Atom.TYPE_d263) {
                    Assertions.checkState(str2 == null);
                    str = MimeTypes.VIDEO_H263;
                } else {
                    if (readInt2 == Atom.TYPE_esds) {
                        Assertions.checkState(str2 == null);
                        Pair<String, byte[]> parseEsdsFromParent = parseEsdsFromParent(parsableByteArray, position2);
                        str2 = (String) parseEsdsFromParent.first;
                        list2 = Collections.singletonList((byte[]) parseEsdsFromParent.second);
                    } else if (readInt2 == Atom.TYPE_pasp) {
                        f = parsePaspFromParent(parsableByteArray, position2);
                        z = true;
                    } else if (readInt2 == Atom.TYPE_sv3d) {
                        bArr = parseProjFromParent(parsableByteArray, position2, readInt);
                    } else if (readInt2 == Atom.TYPE_st3d) {
                        int readUnsignedByte = parsableByteArray.readUnsignedByte();
                        parsableByteArray.skipBytes(3);
                        if (readUnsignedByte == 0) {
                            int readUnsignedByte2 = parsableByteArray.readUnsignedByte();
                            if (readUnsignedByte2 != 0) {
                                if (readUnsignedByte2 != 1) {
                                    i9 = 2;
                                    if (readUnsignedByte2 != 2) {
                                        if (readUnsignedByte2 == 3) {
                                            i8 = 3;
                                        }
                                    }
                                }
                                i8 = i9;
                            } else {
                                i8 = 0;
                            }
                        }
                    }
                    position += readInt;
                }
                str2 = str;
                position += readInt;
            }
            list2 = list;
            str2 = str;
            position += readInt;
        }
        if (str2 == null) {
            return;
        }
        stsdData.format = Format.createVideoSampleFormat(Integer.toString(i4), str2, null, -1, -1, readUnsignedShort, readUnsignedShort2, -1.0f, list2, i5, f, bArr, i8, null, drmInitData3);
    }
}

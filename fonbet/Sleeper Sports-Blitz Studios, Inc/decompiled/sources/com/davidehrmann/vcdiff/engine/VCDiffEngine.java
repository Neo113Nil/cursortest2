package com.davidehrmann.vcdiff.engine;

import com.davidehrmann.vcdiff.VCDiffCodeTableWriter;
import com.davidehrmann.vcdiff.engine.BlockHash;
import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
class VCDiffEngine {
    public static final int kMinimumMatchSize = 32;
    protected final byte[] dictionary_;
    protected final BlockHash hashed_dictionary_;

    protected static boolean ShouldGenerateCopyInstructionForMatchOfSize(int i) {
        return i >= 32;
    }

    public VCDiffEngine(byte[] bArr) {
        this.dictionary_ = bArr;
        this.hashed_dictionary_ = BlockHash.CreateDictionaryHash(bArr);
    }

    public int dictionary_size() {
        return this.dictionary_.length;
    }

    public <OUT> void Encode(ByteBuffer byteBuffer, boolean z, OUT out, VCDiffCodeTableWriter<OUT> vCDiffCodeTableWriter) throws IOException {
        int UpdateHash;
        if (byteBuffer.hasRemaining()) {
            if (byteBuffer.remaining() < 16) {
                byteBuffer.remaining();
                AddUnmatchedRemainder(byteBuffer, vCDiffCodeTableWriter);
                vCDiffCodeTableWriter.output(out);
                return;
            }
            ByteBuffer slice = byteBuffer.slice();
            RollingHash rollingHash = new RollingHash(16);
            BlockHash CreateTargetHash = z ? BlockHash.CreateTargetHash(slice.slice(), dictionary_size()) : null;
            ByteBuffer slice2 = slice.slice();
            int Hash = (int) rollingHash.Hash(slice2.array(), slice2.arrayOffset() + slice2.position(), slice2.remaining());
            while (true) {
                boolean EncodeCopyForBestMatch = EncodeCopyForBestMatch(z, Hash, slice2, slice, CreateTargetHash, vCDiffCodeTableWriter);
                int i = Hash;
                if (EncodeCopyForBestMatch) {
                    slice2.position(slice.position());
                    if (slice2.remaining() < 16) {
                        break;
                    }
                    UpdateHash = (int) rollingHash.Hash(slice2.array(), slice2.arrayOffset() + slice2.position(), slice2.remaining());
                    if (z) {
                        CreateTargetHash.AddAllBlocksThroughIndex(slice2.position());
                    }
                    Hash = UpdateHash;
                } else {
                    if (slice2.remaining() - 1 < 16) {
                        break;
                    }
                    if (z) {
                        CreateTargetHash.AddOneIndexHash(slice2.position(), i);
                    }
                    UpdateHash = (int) rollingHash.UpdateHash(i, slice2.get(), slice2.get(slice2.position() + 16));
                    Hash = UpdateHash;
                }
            }
            AddUnmatchedRemainder(slice, vCDiffCodeTableWriter);
            vCDiffCodeTableWriter.output(out);
            byteBuffer.position(byteBuffer.position() + slice.position());
        }
    }

    protected void AddUnmatchedRemainder(ByteBuffer byteBuffer, VCDiffCodeTableWriter<?> vCDiffCodeTableWriter) {
        if (byteBuffer.hasRemaining()) {
            vCDiffCodeTableWriter.add(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
            byteBuffer.position(byteBuffer.limit());
        }
    }

    protected boolean EncodeCopyForBestMatch(boolean z, int i, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, BlockHash blockHash, VCDiffCodeTableWriter<?> vCDiffCodeTableWriter) {
        BlockHash.Match match = new BlockHash.Match();
        ByteBuffer slice = byteBuffer2.slice();
        slice.position((byteBuffer.arrayOffset() + byteBuffer.position()) - (byteBuffer2.arrayOffset() + byteBuffer2.position()));
        this.hashed_dictionary_.FindBestMatch(i, slice, match);
        if (z) {
            blockHash.FindBestMatch(i, slice, match);
        }
        if (!ShouldGenerateCopyInstructionForMatchOfSize(match.size())) {
            return false;
        }
        if (match.target_offset() > 0) {
            vCDiffCodeTableWriter.add(byteBuffer2.array(), byteBuffer2.arrayOffset() + byteBuffer2.position(), match.target_offset());
        }
        vCDiffCodeTableWriter.copy(match.source_offset(), match.size());
        byteBuffer2.position(byteBuffer2.position() + match.target_offset() + match.size());
        return match.target_offset() + match.size() > 0;
    }
}

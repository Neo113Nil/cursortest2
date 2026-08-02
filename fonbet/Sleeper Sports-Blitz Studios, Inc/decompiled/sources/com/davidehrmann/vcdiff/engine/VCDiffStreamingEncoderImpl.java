package com.davidehrmann.vcdiff.engine;

import com.davidehrmann.vcdiff.VCDiffCodeTableWriter;
import com.davidehrmann.vcdiff.VCDiffFormatExtension;
import com.davidehrmann.vcdiff.VCDiffStreamingEncoder;
import com.davidehrmann.vcdiff.util.ZeroInitializedAdler32;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.EnumSet;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* loaded from: classes6.dex */
public class VCDiffStreamingEncoderImpl<OUT> implements VCDiffStreamingEncoder<OUT> {
    private static final Logger LOGGER = LoggerFactory.getLogger((Class<?>) VCDiffStreamingEncoderImpl.class);
    protected final VCDiffCodeTableWriter<OUT> coder;
    protected boolean encodeChunkAllowed;
    protected final VCDiffEngine engine;
    protected final EnumSet<VCDiffFormatExtension> formatExtensions;
    protected final boolean lookForTargetMatches;

    public VCDiffStreamingEncoderImpl(VCDiffCodeTableWriter<OUT> vCDiffCodeTableWriter, HashedDictionary hashedDictionary, EnumSet<VCDiffFormatExtension> enumSet, boolean z) {
        this.engine = hashedDictionary.engine();
        this.formatExtensions = enumSet.clone();
        this.lookForTargetMatches = z;
        this.coder = vCDiffCodeTableWriter;
    }

    @Override // com.davidehrmann.vcdiff.VCDiffStreamingEncoder
    public void startEncoding(OUT out) throws IOException {
        this.coder.init(this.engine.dictionary_size());
        this.coder.writeHeader(out, this.formatExtensions);
        this.encodeChunkAllowed = true;
    }

    @Override // com.davidehrmann.vcdiff.VCDiffStreamingEncoder
    public void encodeChunk(byte[] bArr, int i, int i2, OUT out) throws IOException {
        if (!this.encodeChunkAllowed) {
            throw new IllegalStateException("encodeChunk called before startEncoding");
        }
        if (this.formatExtensions.contains(VCDiffFormatExtension.GOOGLE_CHECKSUM)) {
            ZeroInitializedAdler32 zeroInitializedAdler32 = new ZeroInitializedAdler32();
            zeroInitializedAdler32.update(bArr, i, i2);
            this.coder.addChecksum((int) zeroInitializedAdler32.getValue());
        }
        this.engine.Encode(ByteBuffer.wrap(bArr, i, i2).slice(), this.lookForTargetMatches, out, this.coder);
    }

    @Override // com.davidehrmann.vcdiff.VCDiffStreamingEncoder
    public void encodeChunk(byte[] bArr, OUT out) throws IOException {
        encodeChunk(bArr, 0, bArr.length, out);
    }

    @Override // com.davidehrmann.vcdiff.VCDiffStreamingEncoder
    public void finishEncoding(OUT out) throws IOException {
        if (!this.encodeChunkAllowed) {
            throw new IllegalStateException("finishEncoding called before startEncoding");
        }
        this.encodeChunkAllowed = false;
        this.coder.finishEncoding(out);
    }
}

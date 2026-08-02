package com.davidehrmann.vcdiff;

import com.davidehrmann.vcdiff.util.Objects;
import java.io.IOException;

/* loaded from: classes6.dex */
public class VCDiffEncoder<OUT> {
    private final VCDiffStreamingEncoder<OUT> encoder;

    public VCDiffEncoder(VCDiffStreamingEncoder<OUT> vCDiffStreamingEncoder) {
        this.encoder = (VCDiffStreamingEncoder) Objects.requireNotNull(vCDiffStreamingEncoder, "encoder was null");
    }

    public void encode(byte[] bArr, int i, int i2, OUT out) throws IOException {
        this.encoder.startEncoding(out);
        this.encoder.encodeChunk(bArr, i, i2, out);
        this.encoder.finishEncoding(out);
    }

    public void encode(byte[] bArr, OUT out) throws IOException {
        encode(bArr, 0, bArr.length, out);
    }
}

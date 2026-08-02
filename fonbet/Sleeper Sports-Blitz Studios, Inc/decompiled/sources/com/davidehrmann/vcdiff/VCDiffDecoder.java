package com.davidehrmann.vcdiff;

import com.davidehrmann.vcdiff.util.Objects;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public class VCDiffDecoder {
    private final VCDiffStreamingDecoder decoder;

    public VCDiffDecoder(VCDiffStreamingDecoder vCDiffStreamingDecoder) {
        this.decoder = (VCDiffStreamingDecoder) Objects.requireNotNull(vCDiffStreamingDecoder, "decoder was null");
    }

    @Deprecated
    public void decode(byte[] bArr, byte[] bArr2, int i, int i2, OutputStream outputStream) throws IOException {
        decode(ByteBuffer.wrap(bArr), ByteBuffer.wrap(bArr2, i, i2), outputStream);
    }

    public void decode(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, OutputStream outputStream) throws IOException {
        this.decoder.startDecoding(byteBuffer);
        this.decoder.decodeChunk(byteBuffer2, outputStream);
        this.decoder.finishDecoding();
    }

    public void decode(byte[] bArr, byte[] bArr2, OutputStream outputStream) throws IOException {
        decode(ByteBuffer.wrap(bArr), ByteBuffer.wrap(bArr2), outputStream);
    }
}

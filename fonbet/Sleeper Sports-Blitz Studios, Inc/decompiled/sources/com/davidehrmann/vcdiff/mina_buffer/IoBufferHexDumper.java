package com.davidehrmann.vcdiff.mina_buffer;

import org.tensorflow.lite.schema.BuiltinOptions;

/* loaded from: classes6.dex */
class IoBufferHexDumper {
    private static final byte[] highDigits;
    private static final byte[] lowDigits;

    IoBufferHexDumper() {
    }

    static {
        byte[] bArr = {BuiltinOptions.SliceOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.TileOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.EqualOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.PowOptions, BuiltinOptions.ArgMinOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.SquareOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.FillOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.BidirectionalSequenceRNNOptions};
        byte[] bArr2 = new byte[256];
        byte[] bArr3 = new byte[256];
        for (int i = 0; i < 256; i++) {
            bArr2[i] = bArr[i >>> 4];
            bArr3[i] = bArr[i & 15];
        }
        highDigits = bArr2;
        lowDigits = bArr3;
    }

    public static String getHexdump(IoBuffer ioBuffer, int i) {
        if (i == 0) {
            throw new IllegalArgumentException("lengthLimit: " + i + " (expected: 1+)");
        }
        boolean z = ioBuffer.remaining() > i;
        if (!z) {
            i = ioBuffer.remaining();
        }
        if (i == 0) {
            return "empty";
        }
        StringBuilder sb = new StringBuilder((i * 3) + 3);
        int position = ioBuffer.position();
        int i2 = ioBuffer.get() & 255;
        sb.append((char) highDigits[i2]);
        sb.append((char) lowDigits[i2]);
        while (true) {
            i--;
            if (i <= 0) {
                break;
            }
            sb.append(' ');
            int i3 = ioBuffer.get() & 255;
            sb.append((char) highDigits[i3]);
            sb.append((char) lowDigits[i3]);
        }
        ioBuffer.position(position);
        if (z) {
            sb.append("...");
        }
        return sb.toString();
    }
}

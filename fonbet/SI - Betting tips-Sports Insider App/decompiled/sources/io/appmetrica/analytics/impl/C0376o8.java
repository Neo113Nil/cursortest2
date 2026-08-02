package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.o8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0376o8 extends MessageNano {

    /* renamed from: b, reason: collision with root package name */
    public static volatile C0376o8[] f14402b;

    /* renamed from: a, reason: collision with root package name */
    public byte[] f14403a;

    public C0376o8() {
        a();
    }

    public static C0376o8[] b() {
        if (f14402b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f14402b == null) {
                        f14402b = new C0376o8[0];
                    }
                } finally {
                }
            }
        }
        return f14402b;
    }

    public final C0376o8 a() {
        this.f14403a = WireFormatNano.EMPTY_BYTES;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        return !Arrays.equals(this.f14403a, WireFormatNano.EMPTY_BYTES) ? CodedOutputByteBufferNano.computeBytesSize(1, this.f14403a) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!Arrays.equals(this.f14403a, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(1, this.f14403a);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0376o8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag != 10) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                this.f14403a = codedInputByteBufferNano.readBytes();
            }
        }
        return this;
    }

    public static C0376o8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0376o8) MessageNano.mergeFrom(new C0376o8(), bArr);
    }

    public static C0376o8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0376o8().mergeFrom(codedInputByteBufferNano);
    }
}

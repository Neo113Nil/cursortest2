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
/* loaded from: classes.dex */
public final class Lk extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile Lk[] f12550c;

    /* renamed from: a, reason: collision with root package name */
    public byte[] f12551a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f12552b;

    public Lk() {
        a();
    }

    public static Lk[] b() {
        if (f12550c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f12550c == null) {
                        f12550c = new Lk[0];
                    }
                } finally {
                }
            }
        }
        return f12550c;
    }

    public final Lk a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f12551a = bArr;
        this.f12552b = bArr;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f12551a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f12551a);
        }
        return !Arrays.equals(this.f12552b, bArr2) ? CodedOutputByteBufferNano.computeBytesSize(2, this.f12552b) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        byte[] bArr = this.f12551a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f12551a);
        }
        if (!Arrays.equals(this.f12552b, bArr2)) {
            codedOutputByteBufferNano.writeBytes(2, this.f12552b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Lk mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                this.f12551a = codedInputByteBufferNano.readBytes();
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                this.f12552b = codedInputByteBufferNano.readBytes();
            }
        }
        return this;
    }

    public static Lk b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new Lk().mergeFrom(codedInputByteBufferNano);
    }

    public static Lk a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (Lk) MessageNano.mergeFrom(new Lk(), bArr);
    }
}

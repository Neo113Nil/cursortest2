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
public final class Hi extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile Hi[] f12321c;

    /* renamed from: a, reason: collision with root package name */
    public byte[] f12322a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f12323b;

    public Hi() {
        a();
    }

    public static Hi[] b() {
        if (f12321c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f12321c == null) {
                        f12321c = new Hi[0];
                    }
                } finally {
                }
            }
        }
        return f12321c;
    }

    public final Hi a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f12322a = bArr;
        this.f12323b = bArr;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f12322a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f12322a);
        }
        return !Arrays.equals(this.f12323b, bArr2) ? CodedOutputByteBufferNano.computeBytesSize(2, this.f12323b) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        byte[] bArr = this.f12322a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f12322a);
        }
        if (!Arrays.equals(this.f12323b, bArr2)) {
            codedOutputByteBufferNano.writeBytes(2, this.f12323b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Hi mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                this.f12322a = codedInputByteBufferNano.readBytes();
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                this.f12323b = codedInputByteBufferNano.readBytes();
            }
        }
        return this;
    }

    public static Hi b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new Hi().mergeFrom(codedInputByteBufferNano);
    }

    public static Hi a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (Hi) MessageNano.mergeFrom(new Hi(), bArr);
    }
}

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
/* renamed from: io.appmetrica.analytics.impl.p8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0401p8 extends MessageNano {

    /* renamed from: d, reason: collision with root package name */
    public static volatile C0401p8[] f14464d;

    /* renamed from: a, reason: collision with root package name */
    public byte[] f14465a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f14466b;

    /* renamed from: c, reason: collision with root package name */
    public C0426q8 f14467c;

    public C0401p8() {
        a();
    }

    public static C0401p8[] b() {
        if (f14464d == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f14464d == null) {
                        f14464d = new C0401p8[0];
                    }
                } finally {
                }
            }
        }
        return f14464d;
    }

    public final C0401p8 a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f14465a = bArr;
        this.f14466b = bArr;
        this.f14467c = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f14465a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f14465a);
        }
        if (!Arrays.equals(this.f14466b, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(2, this.f14466b);
        }
        C0426q8 c0426q8 = this.f14467c;
        return c0426q8 != null ? CodedOutputByteBufferNano.computeMessageSize(3, c0426q8) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        byte[] bArr = this.f14465a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f14465a);
        }
        if (!Arrays.equals(this.f14466b, bArr2)) {
            codedOutputByteBufferNano.writeBytes(2, this.f14466b);
        }
        C0426q8 c0426q8 = this.f14467c;
        if (c0426q8 != null) {
            codedOutputByteBufferNano.writeMessage(3, c0426q8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0401p8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                this.f14465a = codedInputByteBufferNano.readBytes();
            } else if (readTag == 18) {
                this.f14466b = codedInputByteBufferNano.readBytes();
            } else if (readTag != 26) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                if (this.f14467c == null) {
                    this.f14467c = new C0426q8();
                }
                codedInputByteBufferNano.readMessage(this.f14467c);
            }
        }
        return this;
    }

    public static C0401p8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0401p8().mergeFrom(codedInputByteBufferNano);
    }

    public static C0401p8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0401p8) MessageNano.mergeFrom(new C0401p8(), bArr);
    }
}

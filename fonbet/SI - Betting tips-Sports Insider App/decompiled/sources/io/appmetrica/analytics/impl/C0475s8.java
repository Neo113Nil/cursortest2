package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.s8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0475s8 extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile C0475s8[] f14620c;

    /* renamed from: a, reason: collision with root package name */
    public C0351n8 f14621a;

    /* renamed from: b, reason: collision with root package name */
    public C0401p8 f14622b;

    public C0475s8() {
        a();
    }

    public static C0475s8[] b() {
        if (f14620c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f14620c == null) {
                        f14620c = new C0475s8[0];
                    }
                } finally {
                }
            }
        }
        return f14620c;
    }

    public final C0475s8 a() {
        this.f14621a = null;
        this.f14622b = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C0351n8 c0351n8 = this.f14621a;
        if (c0351n8 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c0351n8);
        }
        C0401p8 c0401p8 = this.f14622b;
        return c0401p8 != null ? CodedOutputByteBufferNano.computeMessageSize(2, c0401p8) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C0351n8 c0351n8 = this.f14621a;
        if (c0351n8 != null) {
            codedOutputByteBufferNano.writeMessage(1, c0351n8);
        }
        C0401p8 c0401p8 = this.f14622b;
        if (c0401p8 != null) {
            codedOutputByteBufferNano.writeMessage(2, c0401p8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0475s8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                if (this.f14621a == null) {
                    this.f14621a = new C0351n8();
                }
                codedInputByteBufferNano.readMessage(this.f14621a);
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                if (this.f14622b == null) {
                    this.f14622b = new C0401p8();
                }
                codedInputByteBufferNano.readMessage(this.f14622b);
            }
        }
        return this;
    }

    public static C0475s8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0475s8().mergeFrom(codedInputByteBufferNano);
    }

    public static C0475s8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0475s8) MessageNano.mergeFrom(new C0475s8(), bArr);
    }
}

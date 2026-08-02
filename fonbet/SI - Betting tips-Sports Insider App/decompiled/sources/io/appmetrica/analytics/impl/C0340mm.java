package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.mm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0340mm extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile C0340mm[] f14283c;

    /* renamed from: a, reason: collision with root package name */
    public String f14284a;

    /* renamed from: b, reason: collision with root package name */
    public C0315lm f14285b;

    public C0340mm() {
        a();
    }

    public static C0340mm[] b() {
        if (f14283c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f14283c == null) {
                        f14283c = new C0340mm[0];
                    }
                } finally {
                }
            }
        }
        return f14283c;
    }

    public final C0340mm a() {
        this.f14284a = "";
        this.f14285b = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.f14284a.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f14284a);
        }
        C0315lm c0315lm = this.f14285b;
        return c0315lm != null ? CodedOutputByteBufferNano.computeMessageSize(2, c0315lm) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.f14284a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f14284a);
        }
        C0315lm c0315lm = this.f14285b;
        if (c0315lm != null) {
            codedOutputByteBufferNano.writeMessage(2, c0315lm);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0340mm mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                this.f14284a = codedInputByteBufferNano.readString();
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                if (this.f14285b == null) {
                    this.f14285b = new C0315lm();
                }
                codedInputByteBufferNano.readMessage(this.f14285b);
            }
        }
        return this;
    }

    public static C0340mm b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0340mm().mergeFrom(codedInputByteBufferNano);
    }

    public static C0340mm a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0340mm) MessageNano.mergeFrom(new C0340mm(), bArr);
    }
}

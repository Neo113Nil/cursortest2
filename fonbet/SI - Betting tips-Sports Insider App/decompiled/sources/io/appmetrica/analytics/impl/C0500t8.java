package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.t8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0500t8 extends MessageNano {

    /* renamed from: b, reason: collision with root package name */
    public static volatile C0500t8[] f14670b;

    /* renamed from: a, reason: collision with root package name */
    public C0426q8 f14671a;

    public C0500t8() {
        a();
    }

    public static C0500t8[] b() {
        if (f14670b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f14670b == null) {
                        f14670b = new C0500t8[0];
                    }
                } finally {
                }
            }
        }
        return f14670b;
    }

    public final C0500t8 a() {
        this.f14671a = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C0426q8 c0426q8 = this.f14671a;
        return c0426q8 != null ? CodedOutputByteBufferNano.computeMessageSize(1, c0426q8) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C0426q8 c0426q8 = this.f14671a;
        if (c0426q8 != null) {
            codedOutputByteBufferNano.writeMessage(1, c0426q8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0500t8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
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
                if (this.f14671a == null) {
                    this.f14671a = new C0426q8();
                }
                codedInputByteBufferNano.readMessage(this.f14671a);
            }
        }
        return this;
    }

    public static C0500t8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0500t8().mergeFrom(codedInputByteBufferNano);
    }

    public static C0500t8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0500t8) MessageNano.mergeFrom(new C0500t8(), bArr);
    }
}

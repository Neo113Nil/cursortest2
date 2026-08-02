package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.d8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0096d8 extends MessageNano {

    /* renamed from: b, reason: collision with root package name */
    public static volatile C0096d8[] f13581b;

    /* renamed from: a, reason: collision with root package name */
    public C0121e8 f13582a;

    public C0096d8() {
        a();
    }

    public static C0096d8[] b() {
        if (f13581b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f13581b == null) {
                        f13581b = new C0096d8[0];
                    }
                } finally {
                }
            }
        }
        return f13581b;
    }

    public final C0096d8 a() {
        this.f13582a = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C0121e8 c0121e8 = this.f13582a;
        return c0121e8 != null ? CodedOutputByteBufferNano.computeMessageSize(1, c0121e8) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C0121e8 c0121e8 = this.f13582a;
        if (c0121e8 != null) {
            codedOutputByteBufferNano.writeMessage(1, c0121e8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0096d8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
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
                if (this.f13582a == null) {
                    this.f13582a = new C0121e8();
                }
                codedInputByteBufferNano.readMessage(this.f13582a);
            }
        }
        return this;
    }

    public static C0096d8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0096d8().mergeFrom(codedInputByteBufferNano);
    }

    public static C0096d8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0096d8) MessageNano.mergeFrom(new C0096d8(), bArr);
    }
}

package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.v3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0545v3 extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile C0545v3[] f14766c;

    /* renamed from: a, reason: collision with root package name */
    public String f14767a;

    /* renamed from: b, reason: collision with root package name */
    public String f14768b;

    public C0545v3() {
        a();
    }

    public static C0545v3[] b() {
        if (f14766c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f14766c == null) {
                        f14766c = new C0545v3[0];
                    }
                } finally {
                }
            }
        }
        return f14766c;
    }

    public final C0545v3 a() {
        this.f14767a = "";
        this.f14768b = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.f14767a.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f14767a);
        }
        return !this.f14768b.equals("") ? CodedOutputByteBufferNano.computeStringSize(2, this.f14768b) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.f14767a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f14767a);
        }
        if (!this.f14768b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f14768b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0545v3 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                this.f14767a = codedInputByteBufferNano.readString();
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                this.f14768b = codedInputByteBufferNano.readString();
            }
        }
        return this;
    }

    public static C0545v3 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0545v3().mergeFrom(codedInputByteBufferNano);
    }

    public static C0545v3 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0545v3) MessageNano.mergeFrom(new C0545v3(), bArr);
    }
}

package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.a9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0019a9 extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile C0019a9[] f13350c;

    /* renamed from: a, reason: collision with root package name */
    public String f13351a;

    /* renamed from: b, reason: collision with root package name */
    public long f13352b;

    public C0019a9() {
        a();
    }

    public static C0019a9[] b() {
        if (f13350c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f13350c == null) {
                        f13350c = new C0019a9[0];
                    }
                } finally {
                }
            }
        }
        return f13350c;
    }

    public final C0019a9 a() {
        this.f13351a = "";
        this.f13352b = 0L;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        return CodedOutputByteBufferNano.computeUInt64Size(2, this.f13352b) + CodedOutputByteBufferNano.computeStringSize(1, this.f13351a) + super.computeSerializedSize();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeString(1, this.f13351a);
        codedOutputByteBufferNano.writeUInt64(2, this.f13352b);
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0019a9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                this.f13351a = codedInputByteBufferNano.readString();
            } else if (readTag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                this.f13352b = codedInputByteBufferNano.readUInt64();
            }
        }
        return this;
    }

    public static C0019a9 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0019a9().mergeFrom(codedInputByteBufferNano);
    }

    public static C0019a9 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0019a9) MessageNano.mergeFrom(new C0019a9(), bArr);
    }
}

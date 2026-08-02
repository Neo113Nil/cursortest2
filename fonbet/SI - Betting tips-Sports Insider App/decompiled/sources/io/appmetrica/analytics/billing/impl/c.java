package io.appmetrica.analytics.billing.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class c extends MessageNano {

    /* renamed from: f, reason: collision with root package name */
    public static volatile c[] f11413f;

    /* renamed from: a, reason: collision with root package name */
    public int f11414a;

    /* renamed from: b, reason: collision with root package name */
    public String f11415b;

    /* renamed from: c, reason: collision with root package name */
    public String f11416c;

    /* renamed from: d, reason: collision with root package name */
    public long f11417d;

    /* renamed from: e, reason: collision with root package name */
    public long f11418e;

    public c() {
        a();
    }

    public static c[] b() {
        if (f11413f == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f11413f == null) {
                        f11413f = new c[0];
                    }
                } finally {
                }
            }
        }
        return f11413f;
    }

    public final c a() {
        this.f11414a = 1;
        this.f11415b = "";
        this.f11416c = "";
        this.f11417d = 0L;
        this.f11418e = 0L;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        return CodedOutputByteBufferNano.computeUInt64Size(5, this.f11418e) + CodedOutputByteBufferNano.computeUInt64Size(4, this.f11417d) + CodedOutputByteBufferNano.computeStringSize(3, this.f11416c) + CodedOutputByteBufferNano.computeStringSize(2, this.f11415b) + CodedOutputByteBufferNano.computeInt32Size(1, this.f11414a) + super.computeSerializedSize();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeInt32(1, this.f11414a);
        codedOutputByteBufferNano.writeString(2, this.f11415b);
        codedOutputByteBufferNano.writeString(3, this.f11416c);
        codedOutputByteBufferNano.writeUInt64(4, this.f11417d);
        codedOutputByteBufferNano.writeUInt64(5, this.f11418e);
        super.writeTo(codedOutputByteBufferNano);
    }

    public static c b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new c().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final c mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 8) {
                int readInt32 = codedInputByteBufferNano.readInt32();
                if (readInt32 == 1 || readInt32 == 2 || readInt32 == 3) {
                    this.f11414a = readInt32;
                }
            } else if (readTag == 18) {
                this.f11415b = codedInputByteBufferNano.readString();
            } else if (readTag == 26) {
                this.f11416c = codedInputByteBufferNano.readString();
            } else if (readTag == 32) {
                this.f11417d = codedInputByteBufferNano.readUInt64();
            } else if (readTag != 40) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                this.f11418e = codedInputByteBufferNano.readUInt64();
            }
        }
        return this;
    }

    public static c a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (c) MessageNano.mergeFrom(new c(), bArr);
    }
}

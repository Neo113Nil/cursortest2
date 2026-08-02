package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class Vf extends MessageNano {

    /* renamed from: e, reason: collision with root package name */
    public static final int f13058e = 0;

    /* renamed from: f, reason: collision with root package name */
    public static final int f13059f = 1;

    /* renamed from: g, reason: collision with root package name */
    public static final int f13060g = 2;

    /* renamed from: h, reason: collision with root package name */
    public static volatile Vf[] f13061h;

    /* renamed from: a, reason: collision with root package name */
    public byte[] f13062a;

    /* renamed from: b, reason: collision with root package name */
    public long f13063b;

    /* renamed from: c, reason: collision with root package name */
    public long f13064c;

    /* renamed from: d, reason: collision with root package name */
    public int f13065d;

    public Vf() {
        a();
    }

    public static Vf[] b() {
        if (f13061h == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f13061h == null) {
                        f13061h = new Vf[0];
                    }
                } finally {
                }
            }
        }
        return f13061h;
    }

    public final Vf a() {
        this.f13062a = WireFormatNano.EMPTY_BYTES;
        this.f13063b = 0L;
        this.f13064c = 0L;
        this.f13065d = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeBytesSize = CodedOutputByteBufferNano.computeBytesSize(1, this.f13062a) + super.computeSerializedSize();
        long j = this.f13063b;
        if (j != 0) {
            computeBytesSize += CodedOutputByteBufferNano.computeUInt64Size(2, j);
        }
        long j6 = this.f13064c;
        if (j6 != 0) {
            computeBytesSize += CodedOutputByteBufferNano.computeUInt64Size(3, j6);
        }
        int i5 = this.f13065d;
        return i5 != 0 ? CodedOutputByteBufferNano.computeInt32Size(4, i5) + computeBytesSize : computeBytesSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeBytes(1, this.f13062a);
        long j = this.f13063b;
        if (j != 0) {
            codedOutputByteBufferNano.writeUInt64(2, j);
        }
        long j6 = this.f13064c;
        if (j6 != 0) {
            codedOutputByteBufferNano.writeUInt64(3, j6);
        }
        int i5 = this.f13065d;
        if (i5 != 0) {
            codedOutputByteBufferNano.writeInt32(4, i5);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Vf mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                this.f13062a = codedInputByteBufferNano.readBytes();
            } else if (readTag == 16) {
                this.f13063b = codedInputByteBufferNano.readUInt64();
            } else if (readTag == 24) {
                this.f13064c = codedInputByteBufferNano.readUInt64();
            } else if (readTag != 32) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                int readInt32 = codedInputByteBufferNano.readInt32();
                if (readInt32 == 0 || readInt32 == 1 || readInt32 == 2) {
                    this.f13065d = readInt32;
                }
            }
        }
        return this;
    }

    public static Vf b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new Vf().mergeFrom(codedInputByteBufferNano);
    }

    public static Vf a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (Vf) MessageNano.mergeFrom(new Vf(), bArr);
    }
}

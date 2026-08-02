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
public final class Z8 extends MessageNano {
    public static final int j = 0;

    /* renamed from: k, reason: collision with root package name */
    public static final int f13269k = 1;

    /* renamed from: l, reason: collision with root package name */
    public static final int f13270l = 2;

    /* renamed from: m, reason: collision with root package name */
    public static volatile Z8[] f13271m;

    /* renamed from: a, reason: collision with root package name */
    public double f13272a;

    /* renamed from: b, reason: collision with root package name */
    public double f13273b;

    /* renamed from: c, reason: collision with root package name */
    public long f13274c;

    /* renamed from: d, reason: collision with root package name */
    public int f13275d;

    /* renamed from: e, reason: collision with root package name */
    public int f13276e;

    /* renamed from: f, reason: collision with root package name */
    public int f13277f;

    /* renamed from: g, reason: collision with root package name */
    public int f13278g;

    /* renamed from: h, reason: collision with root package name */
    public int f13279h;

    /* renamed from: i, reason: collision with root package name */
    public String f13280i;

    public Z8() {
        a();
    }

    public static Z8[] b() {
        if (f13271m == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f13271m == null) {
                        f13271m = new Z8[0];
                    }
                } finally {
                }
            }
        }
        return f13271m;
    }

    public final Z8 a() {
        this.f13272a = 0.0d;
        this.f13273b = 0.0d;
        this.f13274c = 0L;
        this.f13275d = 0;
        this.f13276e = 0;
        this.f13277f = 0;
        this.f13278g = 0;
        this.f13279h = 0;
        this.f13280i = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeDoubleSize = CodedOutputByteBufferNano.computeDoubleSize(2, this.f13273b) + CodedOutputByteBufferNano.computeDoubleSize(1, this.f13272a) + super.computeSerializedSize();
        long j6 = this.f13274c;
        if (j6 != 0) {
            computeDoubleSize += CodedOutputByteBufferNano.computeUInt64Size(3, j6);
        }
        int i5 = this.f13275d;
        if (i5 != 0) {
            computeDoubleSize += CodedOutputByteBufferNano.computeUInt32Size(4, i5);
        }
        int i10 = this.f13276e;
        if (i10 != 0) {
            computeDoubleSize += CodedOutputByteBufferNano.computeUInt32Size(5, i10);
        }
        int i11 = this.f13277f;
        if (i11 != 0) {
            computeDoubleSize += CodedOutputByteBufferNano.computeUInt32Size(6, i11);
        }
        int i12 = this.f13278g;
        if (i12 != 0) {
            computeDoubleSize += CodedOutputByteBufferNano.computeInt32Size(7, i12);
        }
        int i13 = this.f13279h;
        if (i13 != 0) {
            computeDoubleSize += CodedOutputByteBufferNano.computeInt32Size(8, i13);
        }
        return !this.f13280i.equals("") ? CodedOutputByteBufferNano.computeStringSize(9, this.f13280i) + computeDoubleSize : computeDoubleSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeDouble(1, this.f13272a);
        codedOutputByteBufferNano.writeDouble(2, this.f13273b);
        long j6 = this.f13274c;
        if (j6 != 0) {
            codedOutputByteBufferNano.writeUInt64(3, j6);
        }
        int i5 = this.f13275d;
        if (i5 != 0) {
            codedOutputByteBufferNano.writeUInt32(4, i5);
        }
        int i10 = this.f13276e;
        if (i10 != 0) {
            codedOutputByteBufferNano.writeUInt32(5, i10);
        }
        int i11 = this.f13277f;
        if (i11 != 0) {
            codedOutputByteBufferNano.writeUInt32(6, i11);
        }
        int i12 = this.f13278g;
        if (i12 != 0) {
            codedOutputByteBufferNano.writeInt32(7, i12);
        }
        int i13 = this.f13279h;
        if (i13 != 0) {
            codedOutputByteBufferNano.writeInt32(8, i13);
        }
        if (!this.f13280i.equals("")) {
            codedOutputByteBufferNano.writeString(9, this.f13280i);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static Z8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new Z8().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Z8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 9) {
                this.f13272a = codedInputByteBufferNano.readDouble();
            } else if (readTag == 17) {
                this.f13273b = codedInputByteBufferNano.readDouble();
            } else if (readTag == 24) {
                this.f13274c = codedInputByteBufferNano.readUInt64();
            } else if (readTag == 32) {
                this.f13275d = codedInputByteBufferNano.readUInt32();
            } else if (readTag == 40) {
                this.f13276e = codedInputByteBufferNano.readUInt32();
            } else if (readTag == 48) {
                this.f13277f = codedInputByteBufferNano.readUInt32();
            } else if (readTag == 56) {
                this.f13278g = codedInputByteBufferNano.readInt32();
            } else if (readTag == 64) {
                int readInt32 = codedInputByteBufferNano.readInt32();
                if (readInt32 == 0 || readInt32 == 1 || readInt32 == 2) {
                    this.f13279h = readInt32;
                }
            } else if (readTag != 74) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                this.f13280i = codedInputByteBufferNano.readString();
            }
        }
        return this;
    }

    public static Z8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (Z8) MessageNano.mergeFrom(new Z8(), bArr);
    }
}

package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.n7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0350n7 extends MessageNano {

    /* renamed from: k, reason: collision with root package name */
    public static volatile C0350n7[] f14301k;

    /* renamed from: a, reason: collision with root package name */
    public int f14302a;

    /* renamed from: b, reason: collision with root package name */
    public double f14303b;

    /* renamed from: c, reason: collision with root package name */
    public double f14304c;

    /* renamed from: d, reason: collision with root package name */
    public int f14305d;

    /* renamed from: e, reason: collision with root package name */
    public int f14306e;

    /* renamed from: f, reason: collision with root package name */
    public int f14307f;

    /* renamed from: g, reason: collision with root package name */
    public int f14308g;

    /* renamed from: h, reason: collision with root package name */
    public long f14309h;

    /* renamed from: i, reason: collision with root package name */
    public String f14310i;
    public String j;

    public C0350n7() {
        a();
    }

    public static C0350n7[] b() {
        if (f14301k == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f14301k == null) {
                        f14301k = new C0350n7[0];
                    }
                } finally {
                }
            }
        }
        return f14301k;
    }

    public final C0350n7 a() {
        this.f14302a = -1;
        this.f14303b = -1.0d;
        this.f14304c = -1.0d;
        this.f14305d = -1;
        this.f14306e = -1;
        this.f14307f = -1;
        this.f14308g = -1;
        this.f14309h = -1L;
        this.f14310i = "";
        this.j = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i5 = this.f14302a;
        if (i5 != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(1, i5);
        }
        if (Double.doubleToLongBits(this.f14303b) != Double.doubleToLongBits(-1.0d)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeDoubleSize(2, this.f14303b);
        }
        if (Double.doubleToLongBits(this.f14304c) != Double.doubleToLongBits(-1.0d)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeDoubleSize(3, this.f14304c);
        }
        int i10 = this.f14305d;
        if (i10 != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(4, i10);
        }
        int i11 = this.f14306e;
        if (i11 != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(5, i11);
        }
        int i12 = this.f14307f;
        if (i12 != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(6, i12);
        }
        int i13 = this.f14308g;
        if (i13 != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(7, i13);
        }
        long j = this.f14309h;
        if (j != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(8, j);
        }
        if (!this.f14310i.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(9, this.f14310i);
        }
        return !this.j.equals("") ? CodedOutputByteBufferNano.computeStringSize(10, this.j) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i5 = this.f14302a;
        if (i5 != -1) {
            codedOutputByteBufferNano.writeInt32(1, i5);
        }
        if (Double.doubleToLongBits(this.f14303b) != Double.doubleToLongBits(-1.0d)) {
            codedOutputByteBufferNano.writeDouble(2, this.f14303b);
        }
        if (Double.doubleToLongBits(this.f14304c) != Double.doubleToLongBits(-1.0d)) {
            codedOutputByteBufferNano.writeDouble(3, this.f14304c);
        }
        int i10 = this.f14305d;
        if (i10 != -1) {
            codedOutputByteBufferNano.writeInt32(4, i10);
        }
        int i11 = this.f14306e;
        if (i11 != -1) {
            codedOutputByteBufferNano.writeInt32(5, i11);
        }
        int i12 = this.f14307f;
        if (i12 != -1) {
            codedOutputByteBufferNano.writeInt32(6, i12);
        }
        int i13 = this.f14308g;
        if (i13 != -1) {
            codedOutputByteBufferNano.writeInt32(7, i13);
        }
        long j = this.f14309h;
        if (j != -1) {
            codedOutputByteBufferNano.writeInt64(8, j);
        }
        if (!this.f14310i.equals("")) {
            codedOutputByteBufferNano.writeString(9, this.f14310i);
        }
        if (!this.j.equals("")) {
            codedOutputByteBufferNano.writeString(10, this.j);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C0350n7 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0350n7().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0350n7 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            switch (readTag) {
                case 0:
                    break;
                case 8:
                    int readInt32 = codedInputByteBufferNano.readInt32();
                    if (readInt32 != -1 && readInt32 != 0 && readInt32 != 1) {
                        break;
                    } else {
                        this.f14302a = readInt32;
                        break;
                    }
                case 17:
                    this.f14303b = codedInputByteBufferNano.readDouble();
                    break;
                case C0122e9.F /* 25 */:
                    this.f14304c = codedInputByteBufferNano.readDouble();
                    break;
                case 32:
                    this.f14305d = codedInputByteBufferNano.readInt32();
                    break;
                case 40:
                    this.f14306e = codedInputByteBufferNano.readInt32();
                    break;
                case 48:
                    this.f14307f = codedInputByteBufferNano.readInt32();
                    break;
                case 56:
                    this.f14308g = codedInputByteBufferNano.readInt32();
                    break;
                case 64:
                    this.f14309h = codedInputByteBufferNano.readInt64();
                    break;
                case 74:
                    this.f14310i = codedInputByteBufferNano.readString();
                    break;
                case 82:
                    this.j = codedInputByteBufferNano.readString();
                    break;
                default:
                    if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                        break;
                    } else {
                        break;
                    }
            }
        }
        return this;
    }

    public static C0350n7 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0350n7) MessageNano.mergeFrom(new C0350n7(), bArr);
    }
}

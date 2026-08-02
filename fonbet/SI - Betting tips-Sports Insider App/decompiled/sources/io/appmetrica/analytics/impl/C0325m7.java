package io.appmetrica.analytics.impl;

import com.appsflyer.attribution.RequestError;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.m7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0325m7 extends MessageNano {

    /* renamed from: s, reason: collision with root package name */
    public static volatile C0325m7[] f14233s;

    /* renamed from: a, reason: collision with root package name */
    public int f14234a;

    /* renamed from: b, reason: collision with root package name */
    public String f14235b;

    /* renamed from: c, reason: collision with root package name */
    public String f14236c;

    /* renamed from: d, reason: collision with root package name */
    public long f14237d;

    /* renamed from: e, reason: collision with root package name */
    public C0350n7 f14238e;

    /* renamed from: f, reason: collision with root package name */
    public String f14239f;

    /* renamed from: g, reason: collision with root package name */
    public String f14240g;

    /* renamed from: h, reason: collision with root package name */
    public long f14241h;

    /* renamed from: i, reason: collision with root package name */
    public int f14242i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public String f14243k;

    /* renamed from: l, reason: collision with root package name */
    public int f14244l;

    /* renamed from: m, reason: collision with root package name */
    public String f14245m;

    /* renamed from: n, reason: collision with root package name */
    public int f14246n;

    /* renamed from: o, reason: collision with root package name */
    public int f14247o;

    /* renamed from: p, reason: collision with root package name */
    public int f14248p;
    public int q;

    /* renamed from: r, reason: collision with root package name */
    public byte[] f14249r;

    public C0325m7() {
        a();
    }

    public static C0325m7[] b() {
        if (f14233s == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f14233s == null) {
                        f14233s = new C0325m7[0];
                    }
                } finally {
                }
            }
        }
        return f14233s;
    }

    public final C0325m7 a() {
        this.f14234a = -1;
        this.f14235b = "";
        this.f14236c = "";
        this.f14237d = -1L;
        this.f14238e = null;
        this.f14239f = "";
        this.f14240g = "";
        this.f14241h = -1L;
        this.f14242i = -1;
        this.j = -1;
        this.f14243k = "";
        this.f14244l = -1;
        this.f14245m = "";
        this.f14246n = -1;
        this.f14247o = -1;
        this.f14248p = -1;
        this.q = -1;
        this.f14249r = WireFormatNano.EMPTY_BYTES;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i5 = this.f14234a;
        if (i5 != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(1, i5);
        }
        if (!this.f14235b.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(2, this.f14235b);
        }
        if (!this.f14236c.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(3, this.f14236c);
        }
        long j = this.f14237d;
        if (j != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(4, j);
        }
        C0350n7 c0350n7 = this.f14238e;
        if (c0350n7 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(5, c0350n7);
        }
        if (!this.f14239f.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(6, this.f14239f);
        }
        if (!this.f14240g.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(7, this.f14240g);
        }
        long j6 = this.f14241h;
        if (j6 != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(8, j6);
        }
        int i10 = this.f14242i;
        if (i10 != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(9, i10);
        }
        int i11 = this.j;
        if (i11 != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(10, i11);
        }
        if (!this.f14243k.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(11, this.f14243k);
        }
        int i12 = this.f14244l;
        if (i12 != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(12, i12);
        }
        if (!this.f14245m.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(13, this.f14245m);
        }
        int i13 = this.f14246n;
        if (i13 != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(14, i13);
        }
        int i14 = this.f14247o;
        if (i14 != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(15, i14);
        }
        int i15 = this.f14248p;
        if (i15 != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(16, i15);
        }
        int i16 = this.q;
        if (i16 != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(17, i16);
        }
        return !Arrays.equals(this.f14249r, WireFormatNano.EMPTY_BYTES) ? CodedOutputByteBufferNano.computeBytesSize(18, this.f14249r) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i5 = this.f14234a;
        if (i5 != -1) {
            codedOutputByteBufferNano.writeInt32(1, i5);
        }
        if (!this.f14235b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f14235b);
        }
        if (!this.f14236c.equals("")) {
            codedOutputByteBufferNano.writeString(3, this.f14236c);
        }
        long j = this.f14237d;
        if (j != -1) {
            codedOutputByteBufferNano.writeInt64(4, j);
        }
        C0350n7 c0350n7 = this.f14238e;
        if (c0350n7 != null) {
            codedOutputByteBufferNano.writeMessage(5, c0350n7);
        }
        if (!this.f14239f.equals("")) {
            codedOutputByteBufferNano.writeString(6, this.f14239f);
        }
        if (!this.f14240g.equals("")) {
            codedOutputByteBufferNano.writeString(7, this.f14240g);
        }
        long j6 = this.f14241h;
        if (j6 != -1) {
            codedOutputByteBufferNano.writeInt64(8, j6);
        }
        int i10 = this.f14242i;
        if (i10 != -1) {
            codedOutputByteBufferNano.writeInt32(9, i10);
        }
        int i11 = this.j;
        if (i11 != -1) {
            codedOutputByteBufferNano.writeInt32(10, i11);
        }
        if (!this.f14243k.equals("")) {
            codedOutputByteBufferNano.writeString(11, this.f14243k);
        }
        int i12 = this.f14244l;
        if (i12 != -1) {
            codedOutputByteBufferNano.writeInt32(12, i12);
        }
        if (!this.f14245m.equals("")) {
            codedOutputByteBufferNano.writeString(13, this.f14245m);
        }
        int i13 = this.f14246n;
        if (i13 != -1) {
            codedOutputByteBufferNano.writeInt32(14, i13);
        }
        int i14 = this.f14247o;
        if (i14 != -1) {
            codedOutputByteBufferNano.writeInt32(15, i14);
        }
        int i15 = this.f14248p;
        if (i15 != -1) {
            codedOutputByteBufferNano.writeInt32(16, i15);
        }
        int i16 = this.q;
        if (i16 != -1) {
            codedOutputByteBufferNano.writeInt32(17, i16);
        }
        if (!Arrays.equals(this.f14249r, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(18, this.f14249r);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C0325m7 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0325m7().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0325m7 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            switch (readTag) {
                case 0:
                    break;
                case 8:
                    this.f14234a = codedInputByteBufferNano.readInt32();
                    break;
                case 18:
                    this.f14235b = codedInputByteBufferNano.readString();
                    break;
                case C0122e9.G /* 26 */:
                    this.f14236c = codedInputByteBufferNano.readString();
                    break;
                case 32:
                    this.f14237d = codedInputByteBufferNano.readInt64();
                    break;
                case C0122e9.M /* 42 */:
                    if (this.f14238e == null) {
                        this.f14238e = new C0350n7();
                    }
                    codedInputByteBufferNano.readMessage(this.f14238e);
                    break;
                case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                    this.f14239f = codedInputByteBufferNano.readString();
                    break;
                case 58:
                    this.f14240g = codedInputByteBufferNano.readString();
                    break;
                case 64:
                    this.f14241h = codedInputByteBufferNano.readInt64();
                    break;
                case 72:
                    this.f14242i = codedInputByteBufferNano.readInt32();
                    break;
                case 80:
                    this.j = codedInputByteBufferNano.readInt32();
                    break;
                case AppMetricaDefaultValues.DEFAULT_DISPATCH_PERIOD_SECONDS /* 90 */:
                    this.f14243k = codedInputByteBufferNano.readString();
                    break;
                case 96:
                    this.f14244l = codedInputByteBufferNano.readInt32();
                    break;
                case 106:
                    this.f14245m = codedInputByteBufferNano.readString();
                    break;
                case 112:
                    this.f14246n = codedInputByteBufferNano.readInt32();
                    break;
                case 120:
                    this.f14247o = codedInputByteBufferNano.readInt32();
                    break;
                case 128:
                    int readInt32 = codedInputByteBufferNano.readInt32();
                    if (readInt32 != -1 && readInt32 != 0 && readInt32 != 1) {
                        break;
                    } else {
                        this.f14248p = readInt32;
                        break;
                    }
                case 136:
                    this.q = codedInputByteBufferNano.readInt32();
                    break;
                case 146:
                    this.f14249r = codedInputByteBufferNano.readBytes();
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

    public static C0325m7 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0325m7) MessageNano.mergeFrom(new C0325m7(), bArr);
    }
}

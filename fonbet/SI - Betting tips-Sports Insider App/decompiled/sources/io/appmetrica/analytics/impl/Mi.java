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
/* loaded from: classes.dex */
public final class Mi extends MessageNano {

    /* renamed from: l, reason: collision with root package name */
    public static final int f12599l = 0;

    /* renamed from: m, reason: collision with root package name */
    public static final int f12600m = 1;

    /* renamed from: n, reason: collision with root package name */
    public static final int f12601n = 2;

    /* renamed from: o, reason: collision with root package name */
    public static final int f12602o = 1;

    /* renamed from: p, reason: collision with root package name */
    public static final int f12603p = 2;
    public static volatile Mi[] q;

    /* renamed from: a, reason: collision with root package name */
    public int f12604a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f12605b;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f12606c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f12607d;

    /* renamed from: e, reason: collision with root package name */
    public Hi f12608e;

    /* renamed from: f, reason: collision with root package name */
    public long f12609f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f12610g;

    /* renamed from: h, reason: collision with root package name */
    public int f12611h;

    /* renamed from: i, reason: collision with root package name */
    public int f12612i;
    public Li j;

    /* renamed from: k, reason: collision with root package name */
    public Ki f12613k;

    public Mi() {
        a();
    }

    public static Mi[] b() {
        if (q == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (q == null) {
                        q = new Mi[0];
                    }
                } finally {
                }
            }
        }
        return q;
    }

    public final Mi a() {
        this.f12604a = 1;
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f12605b = bArr;
        this.f12606c = bArr;
        this.f12607d = bArr;
        this.f12608e = null;
        this.f12609f = 0L;
        this.f12610g = false;
        this.f12611h = 0;
        this.f12612i = 1;
        this.j = null;
        this.f12613k = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i5 = this.f12604a;
        if (i5 != 1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(1, i5);
        }
        int computeBytesSize = CodedOutputByteBufferNano.computeBytesSize(3, this.f12605b) + computeSerializedSize;
        byte[] bArr = this.f12606c;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            computeBytesSize += CodedOutputByteBufferNano.computeBytesSize(4, this.f12606c);
        }
        if (!Arrays.equals(this.f12607d, bArr2)) {
            computeBytesSize += CodedOutputByteBufferNano.computeBytesSize(5, this.f12607d);
        }
        Hi hi2 = this.f12608e;
        if (hi2 != null) {
            computeBytesSize += CodedOutputByteBufferNano.computeMessageSize(6, hi2);
        }
        long j = this.f12609f;
        if (j != 0) {
            computeBytesSize += CodedOutputByteBufferNano.computeInt64Size(7, j);
        }
        boolean z5 = this.f12610g;
        if (z5) {
            computeBytesSize += CodedOutputByteBufferNano.computeBoolSize(8, z5);
        }
        int i10 = this.f12611h;
        if (i10 != 0) {
            computeBytesSize += CodedOutputByteBufferNano.computeInt32Size(9, i10);
        }
        int i11 = this.f12612i;
        if (i11 != 1) {
            computeBytesSize += CodedOutputByteBufferNano.computeInt32Size(10, i11);
        }
        Li li2 = this.j;
        if (li2 != null) {
            computeBytesSize += CodedOutputByteBufferNano.computeMessageSize(11, li2);
        }
        Ki ki = this.f12613k;
        return ki != null ? CodedOutputByteBufferNano.computeMessageSize(12, ki) + computeBytesSize : computeBytesSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i5 = this.f12604a;
        if (i5 != 1) {
            codedOutputByteBufferNano.writeUInt32(1, i5);
        }
        codedOutputByteBufferNano.writeBytes(3, this.f12605b);
        byte[] bArr = this.f12606c;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(4, this.f12606c);
        }
        if (!Arrays.equals(this.f12607d, bArr2)) {
            codedOutputByteBufferNano.writeBytes(5, this.f12607d);
        }
        Hi hi2 = this.f12608e;
        if (hi2 != null) {
            codedOutputByteBufferNano.writeMessage(6, hi2);
        }
        long j = this.f12609f;
        if (j != 0) {
            codedOutputByteBufferNano.writeInt64(7, j);
        }
        boolean z5 = this.f12610g;
        if (z5) {
            codedOutputByteBufferNano.writeBool(8, z5);
        }
        int i10 = this.f12611h;
        if (i10 != 0) {
            codedOutputByteBufferNano.writeInt32(9, i10);
        }
        int i11 = this.f12612i;
        if (i11 != 1) {
            codedOutputByteBufferNano.writeInt32(10, i11);
        }
        Li li2 = this.j;
        if (li2 != null) {
            codedOutputByteBufferNano.writeMessage(11, li2);
        }
        Ki ki = this.f12613k;
        if (ki != null) {
            codedOutputByteBufferNano.writeMessage(12, ki);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static Mi b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new Mi().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Mi mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            switch (readTag) {
                case 0:
                    break;
                case 8:
                    this.f12604a = codedInputByteBufferNano.readUInt32();
                    break;
                case C0122e9.G /* 26 */:
                    this.f12605b = codedInputByteBufferNano.readBytes();
                    break;
                case 34:
                    this.f12606c = codedInputByteBufferNano.readBytes();
                    break;
                case C0122e9.M /* 42 */:
                    this.f12607d = codedInputByteBufferNano.readBytes();
                    break;
                case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                    if (this.f12608e == null) {
                        this.f12608e = new Hi();
                    }
                    codedInputByteBufferNano.readMessage(this.f12608e);
                    break;
                case 56:
                    this.f12609f = codedInputByteBufferNano.readInt64();
                    break;
                case 64:
                    this.f12610g = codedInputByteBufferNano.readBool();
                    break;
                case 72:
                    int readInt32 = codedInputByteBufferNano.readInt32();
                    if (readInt32 != 0 && readInt32 != 1 && readInt32 != 2) {
                        break;
                    } else {
                        this.f12611h = readInt32;
                        break;
                    }
                case 80:
                    int readInt322 = codedInputByteBufferNano.readInt32();
                    if (readInt322 != 1 && readInt322 != 2) {
                        break;
                    } else {
                        this.f12612i = readInt322;
                        break;
                    }
                case AppMetricaDefaultValues.DEFAULT_DISPATCH_PERIOD_SECONDS /* 90 */:
                    if (this.j == null) {
                        this.j = new Li();
                    }
                    codedInputByteBufferNano.readMessage(this.j);
                    break;
                case 98:
                    if (this.f12613k == null) {
                        this.f12613k = new Ki();
                    }
                    codedInputByteBufferNano.readMessage(this.f12613k);
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

    public static Mi a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (Mi) MessageNano.mergeFrom(new Mi(), bArr);
    }
}

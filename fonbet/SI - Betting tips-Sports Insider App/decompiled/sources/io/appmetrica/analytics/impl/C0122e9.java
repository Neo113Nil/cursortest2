package io.appmetrica.analytics.impl;

import com.appsflyer.attribution.RequestError;
import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.e9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0122e9 extends MessageNano {
    public static final int A = 17;
    public static final int B = 18;
    public static final int C = 19;
    public static final int D = 20;
    public static final int E = 21;
    public static final int F = 25;
    public static final int G = 26;
    public static final int H = 27;
    public static final int I = 29;
    public static final int J = 35;
    public static final int K = 38;
    public static final int L = 40;
    public static final int M = 42;
    public static final int N = 0;
    public static final int O = 1;
    public static final int P = 2;
    public static final int Q = 0;
    public static final int R = 1;
    public static final int S = 2;
    public static volatile C0122e9[] T = null;

    /* renamed from: t, reason: collision with root package name */
    public static final int f13654t = 1;

    /* renamed from: u, reason: collision with root package name */
    public static final int f13655u = 2;

    /* renamed from: v, reason: collision with root package name */
    public static final int f13656v = 4;

    /* renamed from: w, reason: collision with root package name */
    public static final int f13657w = 5;

    /* renamed from: x, reason: collision with root package name */
    public static final int f13658x = 7;

    /* renamed from: y, reason: collision with root package name */
    public static final int f13659y = 13;

    /* renamed from: z, reason: collision with root package name */
    public static final int f13660z = 16;

    /* renamed from: a, reason: collision with root package name */
    public long f13661a;

    /* renamed from: b, reason: collision with root package name */
    public long f13662b;

    /* renamed from: c, reason: collision with root package name */
    public int f13663c;

    /* renamed from: d, reason: collision with root package name */
    public String f13664d;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f13665e;

    /* renamed from: f, reason: collision with root package name */
    public Z8 f13666f;

    /* renamed from: g, reason: collision with root package name */
    public C0097d9 f13667g;

    /* renamed from: h, reason: collision with root package name */
    public String f13668h;

    /* renamed from: i, reason: collision with root package name */
    public int f13669i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public int f13670k;

    /* renamed from: l, reason: collision with root package name */
    public byte[] f13671l;

    /* renamed from: m, reason: collision with root package name */
    public int f13672m;

    /* renamed from: n, reason: collision with root package name */
    public long f13673n;

    /* renamed from: o, reason: collision with root package name */
    public long f13674o;

    /* renamed from: p, reason: collision with root package name */
    public int f13675p;
    public boolean q;

    /* renamed from: r, reason: collision with root package name */
    public long f13676r;

    /* renamed from: s, reason: collision with root package name */
    public C0071c9[] f13677s;

    public C0122e9() {
        a();
    }

    public static C0122e9[] b() {
        if (T == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (T == null) {
                        T = new C0122e9[0];
                    }
                } finally {
                }
            }
        }
        return T;
    }

    public final C0122e9 a() {
        this.f13661a = 0L;
        this.f13662b = 0L;
        this.f13663c = 0;
        this.f13664d = "";
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f13665e = bArr;
        this.f13666f = null;
        this.f13667g = null;
        this.f13668h = "";
        this.f13669i = 0;
        this.j = 0;
        this.f13670k = -1;
        this.f13671l = bArr;
        this.f13672m = -1;
        this.f13673n = 0L;
        this.f13674o = 0L;
        this.f13675p = 0;
        this.q = false;
        this.f13676r = 1L;
        this.f13677s = C0071c9.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeUInt32Size = CodedOutputByteBufferNano.computeUInt32Size(3, this.f13663c) + CodedOutputByteBufferNano.computeUInt64Size(2, this.f13662b) + CodedOutputByteBufferNano.computeUInt64Size(1, this.f13661a) + super.computeSerializedSize();
        if (!this.f13664d.equals("")) {
            computeUInt32Size += CodedOutputByteBufferNano.computeStringSize(4, this.f13664d);
        }
        byte[] bArr = this.f13665e;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            computeUInt32Size += CodedOutputByteBufferNano.computeBytesSize(5, this.f13665e);
        }
        Z8 z82 = this.f13666f;
        if (z82 != null) {
            computeUInt32Size += CodedOutputByteBufferNano.computeMessageSize(6, z82);
        }
        C0097d9 c0097d9 = this.f13667g;
        if (c0097d9 != null) {
            computeUInt32Size += CodedOutputByteBufferNano.computeMessageSize(7, c0097d9);
        }
        if (!this.f13668h.equals("")) {
            computeUInt32Size += CodedOutputByteBufferNano.computeStringSize(8, this.f13668h);
        }
        int i5 = this.f13669i;
        if (i5 != 0) {
            computeUInt32Size += CodedOutputByteBufferNano.computeUInt32Size(10, i5);
        }
        int i10 = this.j;
        if (i10 != 0) {
            computeUInt32Size += CodedOutputByteBufferNano.computeInt32Size(12, i10);
        }
        int i11 = this.f13670k;
        if (i11 != -1) {
            computeUInt32Size += CodedOutputByteBufferNano.computeInt32Size(13, i11);
        }
        if (!Arrays.equals(this.f13671l, bArr2)) {
            computeUInt32Size += CodedOutputByteBufferNano.computeBytesSize(14, this.f13671l);
        }
        int i12 = this.f13672m;
        if (i12 != -1) {
            computeUInt32Size += CodedOutputByteBufferNano.computeInt32Size(15, i12);
        }
        long j = this.f13673n;
        if (j != 0) {
            computeUInt32Size += CodedOutputByteBufferNano.computeUInt64Size(16, j);
        }
        long j6 = this.f13674o;
        if (j6 != 0) {
            computeUInt32Size += CodedOutputByteBufferNano.computeUInt64Size(17, j6);
        }
        int i13 = this.f13675p;
        if (i13 != 0) {
            computeUInt32Size += CodedOutputByteBufferNano.computeInt32Size(22, i13);
        }
        boolean z5 = this.q;
        if (z5) {
            computeUInt32Size += CodedOutputByteBufferNano.computeBoolSize(23, z5);
        }
        long j10 = this.f13676r;
        if (j10 != 1) {
            computeUInt32Size += CodedOutputByteBufferNano.computeUInt64Size(24, j10);
        }
        C0071c9[] c0071c9Arr = this.f13677s;
        if (c0071c9Arr != null && c0071c9Arr.length > 0) {
            int i14 = 0;
            while (true) {
                C0071c9[] c0071c9Arr2 = this.f13677s;
                if (i14 >= c0071c9Arr2.length) {
                    break;
                }
                C0071c9 c0071c9 = c0071c9Arr2[i14];
                if (c0071c9 != null) {
                    computeUInt32Size = CodedOutputByteBufferNano.computeMessageSize(25, c0071c9) + computeUInt32Size;
                }
                i14++;
            }
        }
        return computeUInt32Size;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeUInt64(1, this.f13661a);
        codedOutputByteBufferNano.writeUInt64(2, this.f13662b);
        codedOutputByteBufferNano.writeUInt32(3, this.f13663c);
        if (!this.f13664d.equals("")) {
            codedOutputByteBufferNano.writeString(4, this.f13664d);
        }
        byte[] bArr = this.f13665e;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(5, this.f13665e);
        }
        Z8 z82 = this.f13666f;
        if (z82 != null) {
            codedOutputByteBufferNano.writeMessage(6, z82);
        }
        C0097d9 c0097d9 = this.f13667g;
        if (c0097d9 != null) {
            codedOutputByteBufferNano.writeMessage(7, c0097d9);
        }
        if (!this.f13668h.equals("")) {
            codedOutputByteBufferNano.writeString(8, this.f13668h);
        }
        int i5 = this.f13669i;
        if (i5 != 0) {
            codedOutputByteBufferNano.writeUInt32(10, i5);
        }
        int i10 = this.j;
        if (i10 != 0) {
            codedOutputByteBufferNano.writeInt32(12, i10);
        }
        int i11 = this.f13670k;
        if (i11 != -1) {
            codedOutputByteBufferNano.writeInt32(13, i11);
        }
        if (!Arrays.equals(this.f13671l, bArr2)) {
            codedOutputByteBufferNano.writeBytes(14, this.f13671l);
        }
        int i12 = this.f13672m;
        if (i12 != -1) {
            codedOutputByteBufferNano.writeInt32(15, i12);
        }
        long j = this.f13673n;
        if (j != 0) {
            codedOutputByteBufferNano.writeUInt64(16, j);
        }
        long j6 = this.f13674o;
        if (j6 != 0) {
            codedOutputByteBufferNano.writeUInt64(17, j6);
        }
        int i13 = this.f13675p;
        if (i13 != 0) {
            codedOutputByteBufferNano.writeInt32(22, i13);
        }
        boolean z5 = this.q;
        if (z5) {
            codedOutputByteBufferNano.writeBool(23, z5);
        }
        long j10 = this.f13676r;
        if (j10 != 1) {
            codedOutputByteBufferNano.writeUInt64(24, j10);
        }
        C0071c9[] c0071c9Arr = this.f13677s;
        if (c0071c9Arr != null && c0071c9Arr.length > 0) {
            int i14 = 0;
            while (true) {
                C0071c9[] c0071c9Arr2 = this.f13677s;
                if (i14 >= c0071c9Arr2.length) {
                    break;
                }
                C0071c9 c0071c9 = c0071c9Arr2[i14];
                if (c0071c9 != null) {
                    codedOutputByteBufferNano.writeMessage(25, c0071c9);
                }
                i14++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C0122e9 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0122e9().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0122e9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            switch (readTag) {
                case 0:
                    break;
                case 8:
                    this.f13661a = codedInputByteBufferNano.readUInt64();
                    break;
                case 16:
                    this.f13662b = codedInputByteBufferNano.readUInt64();
                    break;
                case zg.g.FORCEINGEST_FIELD_NUMBER /* 24 */:
                    this.f13663c = codedInputByteBufferNano.readUInt32();
                    break;
                case 34:
                    this.f13664d = codedInputByteBufferNano.readString();
                    break;
                case M /* 42 */:
                    this.f13665e = codedInputByteBufferNano.readBytes();
                    break;
                case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                    if (this.f13666f == null) {
                        this.f13666f = new Z8();
                    }
                    codedInputByteBufferNano.readMessage(this.f13666f);
                    break;
                case 58:
                    if (this.f13667g == null) {
                        this.f13667g = new C0097d9();
                    }
                    codedInputByteBufferNano.readMessage(this.f13667g);
                    break;
                case 66:
                    this.f13668h = codedInputByteBufferNano.readString();
                    break;
                case 80:
                    this.f13669i = codedInputByteBufferNano.readUInt32();
                    break;
                case 96:
                    int readInt32 = codedInputByteBufferNano.readInt32();
                    if (readInt32 != 0 && readInt32 != 1 && readInt32 != 2) {
                        break;
                    } else {
                        this.j = readInt32;
                        break;
                    }
                case 104:
                    int readInt322 = codedInputByteBufferNano.readInt32();
                    if (readInt322 != -1 && readInt322 != 0 && readInt322 != 1) {
                        break;
                    } else {
                        this.f13670k = readInt322;
                        break;
                    }
                case 114:
                    this.f13671l = codedInputByteBufferNano.readBytes();
                    break;
                case 120:
                    int readInt323 = codedInputByteBufferNano.readInt32();
                    if (readInt323 != -1 && readInt323 != 0 && readInt323 != 1) {
                        break;
                    } else {
                        this.f13672m = readInt323;
                        break;
                    }
                case 128:
                    this.f13673n = codedInputByteBufferNano.readUInt64();
                    break;
                case 136:
                    this.f13674o = codedInputByteBufferNano.readUInt64();
                    break;
                case 176:
                    int readInt324 = codedInputByteBufferNano.readInt32();
                    if (readInt324 != 0 && readInt324 != 1 && readInt324 != 2) {
                        break;
                    } else {
                        this.f13675p = readInt324;
                        break;
                    }
                case 184:
                    this.q = codedInputByteBufferNano.readBool();
                    break;
                case 192:
                    this.f13676r = codedInputByteBufferNano.readUInt64();
                    break;
                case 202:
                    int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 202);
                    C0071c9[] c0071c9Arr = this.f13677s;
                    int length = c0071c9Arr == null ? 0 : c0071c9Arr.length;
                    int i5 = repeatedFieldArrayLength + length;
                    C0071c9[] c0071c9Arr2 = new C0071c9[i5];
                    if (length != 0) {
                        System.arraycopy(c0071c9Arr, 0, c0071c9Arr2, 0, length);
                    }
                    while (length < i5 - 1) {
                        C0071c9 c0071c9 = new C0071c9();
                        c0071c9Arr2[length] = c0071c9;
                        codedInputByteBufferNano.readMessage(c0071c9);
                        codedInputByteBufferNano.readTag();
                        length++;
                    }
                    C0071c9 c0071c92 = new C0071c9();
                    c0071c9Arr2[length] = c0071c92;
                    codedInputByteBufferNano.readMessage(c0071c92);
                    this.f13677s = c0071c9Arr2;
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

    public static C0122e9 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0122e9) MessageNano.mergeFrom(new C0122e9(), bArr);
    }
}

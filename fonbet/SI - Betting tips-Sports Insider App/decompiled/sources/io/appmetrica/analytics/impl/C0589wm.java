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

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.wm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0589wm extends MessageNano {
    public static final int D = -1;
    public static final int E = 0;
    public static final int F = 1;
    public static volatile C0589wm[] G;
    public C0539um A;
    public C0489sm[] B;
    public C0440qm C;

    /* renamed from: a, reason: collision with root package name */
    public String f14852a;

    /* renamed from: b, reason: collision with root package name */
    public long f14853b;

    /* renamed from: c, reason: collision with root package name */
    public String[] f14854c;

    /* renamed from: d, reason: collision with root package name */
    public String f14855d;

    /* renamed from: e, reason: collision with root package name */
    public String f14856e;

    /* renamed from: f, reason: collision with root package name */
    public String[] f14857f;

    /* renamed from: g, reason: collision with root package name */
    public String[] f14858g;

    /* renamed from: h, reason: collision with root package name */
    public C0415pm[] f14859h;

    /* renamed from: i, reason: collision with root package name */
    public C0464rm f14860i;
    public String j;

    /* renamed from: k, reason: collision with root package name */
    public String f14861k;

    /* renamed from: l, reason: collision with root package name */
    public String f14862l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f14863m;

    /* renamed from: n, reason: collision with root package name */
    public String f14864n;

    /* renamed from: o, reason: collision with root package name */
    public String[] f14865o;

    /* renamed from: p, reason: collision with root package name */
    public C0564vm f14866p;
    public boolean q;

    /* renamed from: r, reason: collision with root package name */
    public String f14867r;

    /* renamed from: s, reason: collision with root package name */
    public long f14868s;

    /* renamed from: t, reason: collision with root package name */
    public long f14869t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f14870u;

    /* renamed from: v, reason: collision with root package name */
    public C0514tm f14871v;

    /* renamed from: w, reason: collision with root package name */
    public int f14872w;

    /* renamed from: x, reason: collision with root package name */
    public int f14873x;

    /* renamed from: y, reason: collision with root package name */
    public C0390om f14874y;

    /* renamed from: z, reason: collision with root package name */
    public C0365nm f14875z;

    public C0589wm() {
        a();
    }

    public static C0589wm[] b() {
        if (G == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (G == null) {
                        G = new C0589wm[0];
                    }
                } finally {
                }
            }
        }
        return G;
    }

    public final C0589wm a() {
        this.f14852a = "";
        this.f14853b = 0L;
        String[] strArr = WireFormatNano.EMPTY_STRING_ARRAY;
        this.f14854c = strArr;
        this.f14855d = "";
        this.f14856e = "";
        this.f14857f = strArr;
        this.f14858g = strArr;
        this.f14859h = C0415pm.b();
        this.f14860i = null;
        this.j = "";
        this.f14861k = "";
        this.f14862l = "";
        this.f14863m = false;
        this.f14864n = "";
        this.f14865o = strArr;
        this.f14866p = null;
        this.q = false;
        this.f14867r = "";
        this.f14868s = 0L;
        this.f14869t = 0L;
        this.f14870u = false;
        this.f14871v = null;
        this.f14872w = 600;
        this.f14873x = 1;
        this.f14874y = null;
        this.f14875z = null;
        this.A = null;
        this.B = C0489sm.b();
        this.C = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.f14852a.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f14852a);
        }
        int computeInt64Size = CodedOutputByteBufferNano.computeInt64Size(2, this.f14853b) + computeSerializedSize;
        String[] strArr = this.f14854c;
        int i5 = 0;
        if (strArr != null && strArr.length > 0) {
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            while (true) {
                String[] strArr2 = this.f14854c;
                if (i10 >= strArr2.length) {
                    break;
                }
                String str = strArr2[i10];
                if (str != null) {
                    i12++;
                    i11 += CodedOutputByteBufferNano.computeStringSizeNoTag(str);
                }
                i10++;
            }
            computeInt64Size = computeInt64Size + i11 + i12;
        }
        if (!this.f14855d.equals("")) {
            computeInt64Size += CodedOutputByteBufferNano.computeStringSize(4, this.f14855d);
        }
        if (!this.f14856e.equals("")) {
            computeInt64Size += CodedOutputByteBufferNano.computeStringSize(5, this.f14856e);
        }
        String[] strArr3 = this.f14857f;
        if (strArr3 != null && strArr3.length > 0) {
            int i13 = 0;
            int i14 = 0;
            int i15 = 0;
            while (true) {
                String[] strArr4 = this.f14857f;
                if (i13 >= strArr4.length) {
                    break;
                }
                String str2 = strArr4[i13];
                if (str2 != null) {
                    i15++;
                    i14 += CodedOutputByteBufferNano.computeStringSizeNoTag(str2);
                }
                i13++;
            }
            computeInt64Size = computeInt64Size + i14 + i15;
        }
        String[] strArr5 = this.f14858g;
        if (strArr5 != null && strArr5.length > 0) {
            int i16 = 0;
            int i17 = 0;
            int i18 = 0;
            while (true) {
                String[] strArr6 = this.f14858g;
                if (i16 >= strArr6.length) {
                    break;
                }
                String str3 = strArr6[i16];
                if (str3 != null) {
                    i18++;
                    i17 += CodedOutputByteBufferNano.computeStringSizeNoTag(str3);
                }
                i16++;
            }
            computeInt64Size = computeInt64Size + i17 + i18;
        }
        C0415pm[] c0415pmArr = this.f14859h;
        if (c0415pmArr != null && c0415pmArr.length > 0) {
            int i19 = 0;
            while (true) {
                C0415pm[] c0415pmArr2 = this.f14859h;
                if (i19 >= c0415pmArr2.length) {
                    break;
                }
                C0415pm c0415pm = c0415pmArr2[i19];
                if (c0415pm != null) {
                    computeInt64Size = CodedOutputByteBufferNano.computeMessageSize(8, c0415pm) + computeInt64Size;
                }
                i19++;
            }
        }
        C0464rm c0464rm = this.f14860i;
        if (c0464rm != null) {
            computeInt64Size += CodedOutputByteBufferNano.computeMessageSize(9, c0464rm);
        }
        if (!this.j.equals("")) {
            computeInt64Size += CodedOutputByteBufferNano.computeStringSize(10, this.j);
        }
        if (!this.f14861k.equals("")) {
            computeInt64Size += CodedOutputByteBufferNano.computeStringSize(11, this.f14861k);
        }
        if (!this.f14862l.equals("")) {
            computeInt64Size += CodedOutputByteBufferNano.computeStringSize(12, this.f14862l);
        }
        int computeBoolSize = CodedOutputByteBufferNano.computeBoolSize(13, this.f14863m) + computeInt64Size;
        if (!this.f14864n.equals("")) {
            computeBoolSize += CodedOutputByteBufferNano.computeStringSize(14, this.f14864n);
        }
        String[] strArr7 = this.f14865o;
        if (strArr7 != null && strArr7.length > 0) {
            int i20 = 0;
            int i21 = 0;
            int i22 = 0;
            while (true) {
                String[] strArr8 = this.f14865o;
                if (i20 >= strArr8.length) {
                    break;
                }
                String str4 = strArr8[i20];
                if (str4 != null) {
                    i22++;
                    i21 += CodedOutputByteBufferNano.computeStringSizeNoTag(str4);
                }
                i20++;
            }
            computeBoolSize = computeBoolSize + i21 + i22;
        }
        C0564vm c0564vm = this.f14866p;
        if (c0564vm != null) {
            computeBoolSize += CodedOutputByteBufferNano.computeMessageSize(16, c0564vm);
        }
        boolean z5 = this.q;
        if (z5) {
            computeBoolSize += CodedOutputByteBufferNano.computeBoolSize(17, z5);
        }
        if (!this.f14867r.equals("")) {
            computeBoolSize += CodedOutputByteBufferNano.computeStringSize(20, this.f14867r);
        }
        int computeInt64Size2 = CodedOutputByteBufferNano.computeInt64Size(22, this.f14869t) + CodedOutputByteBufferNano.computeInt64Size(21, this.f14868s) + computeBoolSize;
        boolean z7 = this.f14870u;
        if (z7) {
            computeInt64Size2 += CodedOutputByteBufferNano.computeBoolSize(23, z7);
        }
        C0514tm c0514tm = this.f14871v;
        if (c0514tm != null) {
            computeInt64Size2 += CodedOutputByteBufferNano.computeMessageSize(24, c0514tm);
        }
        int computeInt32Size = CodedOutputByteBufferNano.computeInt32Size(26, this.f14873x) + CodedOutputByteBufferNano.computeInt32Size(25, this.f14872w) + computeInt64Size2;
        C0390om c0390om = this.f14874y;
        if (c0390om != null) {
            computeInt32Size += CodedOutputByteBufferNano.computeMessageSize(27, c0390om);
        }
        C0365nm c0365nm = this.f14875z;
        if (c0365nm != null) {
            computeInt32Size += CodedOutputByteBufferNano.computeMessageSize(29, c0365nm);
        }
        C0539um c0539um = this.A;
        if (c0539um != null) {
            computeInt32Size += CodedOutputByteBufferNano.computeMessageSize(30, c0539um);
        }
        C0489sm[] c0489smArr = this.B;
        if (c0489smArr != null && c0489smArr.length > 0) {
            while (true) {
                C0489sm[] c0489smArr2 = this.B;
                if (i5 >= c0489smArr2.length) {
                    break;
                }
                C0489sm c0489sm = c0489smArr2[i5];
                if (c0489sm != null) {
                    computeInt32Size = CodedOutputByteBufferNano.computeMessageSize(31, c0489sm) + computeInt32Size;
                }
                i5++;
            }
        }
        C0440qm c0440qm = this.C;
        return c0440qm != null ? CodedOutputByteBufferNano.computeMessageSize(32, c0440qm) + computeInt32Size : computeInt32Size;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.f14852a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f14852a);
        }
        codedOutputByteBufferNano.writeInt64(2, this.f14853b);
        String[] strArr = this.f14854c;
        int i5 = 0;
        if (strArr != null && strArr.length > 0) {
            int i10 = 0;
            while (true) {
                String[] strArr2 = this.f14854c;
                if (i10 >= strArr2.length) {
                    break;
                }
                String str = strArr2[i10];
                if (str != null) {
                    codedOutputByteBufferNano.writeString(3, str);
                }
                i10++;
            }
        }
        if (!this.f14855d.equals("")) {
            codedOutputByteBufferNano.writeString(4, this.f14855d);
        }
        if (!this.f14856e.equals("")) {
            codedOutputByteBufferNano.writeString(5, this.f14856e);
        }
        String[] strArr3 = this.f14857f;
        if (strArr3 != null && strArr3.length > 0) {
            int i11 = 0;
            while (true) {
                String[] strArr4 = this.f14857f;
                if (i11 >= strArr4.length) {
                    break;
                }
                String str2 = strArr4[i11];
                if (str2 != null) {
                    codedOutputByteBufferNano.writeString(6, str2);
                }
                i11++;
            }
        }
        String[] strArr5 = this.f14858g;
        if (strArr5 != null && strArr5.length > 0) {
            int i12 = 0;
            while (true) {
                String[] strArr6 = this.f14858g;
                if (i12 >= strArr6.length) {
                    break;
                }
                String str3 = strArr6[i12];
                if (str3 != null) {
                    codedOutputByteBufferNano.writeString(7, str3);
                }
                i12++;
            }
        }
        C0415pm[] c0415pmArr = this.f14859h;
        if (c0415pmArr != null && c0415pmArr.length > 0) {
            int i13 = 0;
            while (true) {
                C0415pm[] c0415pmArr2 = this.f14859h;
                if (i13 >= c0415pmArr2.length) {
                    break;
                }
                C0415pm c0415pm = c0415pmArr2[i13];
                if (c0415pm != null) {
                    codedOutputByteBufferNano.writeMessage(8, c0415pm);
                }
                i13++;
            }
        }
        C0464rm c0464rm = this.f14860i;
        if (c0464rm != null) {
            codedOutputByteBufferNano.writeMessage(9, c0464rm);
        }
        if (!this.j.equals("")) {
            codedOutputByteBufferNano.writeString(10, this.j);
        }
        if (!this.f14861k.equals("")) {
            codedOutputByteBufferNano.writeString(11, this.f14861k);
        }
        if (!this.f14862l.equals("")) {
            codedOutputByteBufferNano.writeString(12, this.f14862l);
        }
        codedOutputByteBufferNano.writeBool(13, this.f14863m);
        if (!this.f14864n.equals("")) {
            codedOutputByteBufferNano.writeString(14, this.f14864n);
        }
        String[] strArr7 = this.f14865o;
        if (strArr7 != null && strArr7.length > 0) {
            int i14 = 0;
            while (true) {
                String[] strArr8 = this.f14865o;
                if (i14 >= strArr8.length) {
                    break;
                }
                String str4 = strArr8[i14];
                if (str4 != null) {
                    codedOutputByteBufferNano.writeString(15, str4);
                }
                i14++;
            }
        }
        C0564vm c0564vm = this.f14866p;
        if (c0564vm != null) {
            codedOutputByteBufferNano.writeMessage(16, c0564vm);
        }
        boolean z5 = this.q;
        if (z5) {
            codedOutputByteBufferNano.writeBool(17, z5);
        }
        if (!this.f14867r.equals("")) {
            codedOutputByteBufferNano.writeString(20, this.f14867r);
        }
        codedOutputByteBufferNano.writeInt64(21, this.f14868s);
        codedOutputByteBufferNano.writeInt64(22, this.f14869t);
        boolean z7 = this.f14870u;
        if (z7) {
            codedOutputByteBufferNano.writeBool(23, z7);
        }
        C0514tm c0514tm = this.f14871v;
        if (c0514tm != null) {
            codedOutputByteBufferNano.writeMessage(24, c0514tm);
        }
        codedOutputByteBufferNano.writeInt32(25, this.f14872w);
        codedOutputByteBufferNano.writeInt32(26, this.f14873x);
        C0390om c0390om = this.f14874y;
        if (c0390om != null) {
            codedOutputByteBufferNano.writeMessage(27, c0390om);
        }
        C0365nm c0365nm = this.f14875z;
        if (c0365nm != null) {
            codedOutputByteBufferNano.writeMessage(29, c0365nm);
        }
        C0539um c0539um = this.A;
        if (c0539um != null) {
            codedOutputByteBufferNano.writeMessage(30, c0539um);
        }
        C0489sm[] c0489smArr = this.B;
        if (c0489smArr != null && c0489smArr.length > 0) {
            while (true) {
                C0489sm[] c0489smArr2 = this.B;
                if (i5 >= c0489smArr2.length) {
                    break;
                }
                C0489sm c0489sm = c0489smArr2[i5];
                if (c0489sm != null) {
                    codedOutputByteBufferNano.writeMessage(31, c0489sm);
                }
                i5++;
            }
        }
        C0440qm c0440qm = this.C;
        if (c0440qm != null) {
            codedOutputByteBufferNano.writeMessage(32, c0440qm);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C0589wm b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0589wm().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0589wm mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            switch (readTag) {
                case 0:
                    break;
                case 10:
                    this.f14852a = codedInputByteBufferNano.readString();
                    break;
                case 16:
                    this.f14853b = codedInputByteBufferNano.readInt64();
                    break;
                case C0122e9.G /* 26 */:
                    int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 26);
                    String[] strArr = this.f14854c;
                    int length = strArr == null ? 0 : strArr.length;
                    int i5 = repeatedFieldArrayLength + length;
                    String[] strArr2 = new String[i5];
                    if (length != 0) {
                        System.arraycopy(strArr, 0, strArr2, 0, length);
                    }
                    while (length < i5 - 1) {
                        strArr2[length] = codedInputByteBufferNano.readString();
                        codedInputByteBufferNano.readTag();
                        length++;
                    }
                    strArr2[length] = codedInputByteBufferNano.readString();
                    this.f14854c = strArr2;
                    break;
                case 34:
                    this.f14855d = codedInputByteBufferNano.readString();
                    break;
                case C0122e9.M /* 42 */:
                    this.f14856e = codedInputByteBufferNano.readString();
                    break;
                case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                    int repeatedFieldArrayLength2 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 50);
                    String[] strArr3 = this.f14857f;
                    int length2 = strArr3 == null ? 0 : strArr3.length;
                    int i10 = repeatedFieldArrayLength2 + length2;
                    String[] strArr4 = new String[i10];
                    if (length2 != 0) {
                        System.arraycopy(strArr3, 0, strArr4, 0, length2);
                    }
                    while (length2 < i10 - 1) {
                        strArr4[length2] = codedInputByteBufferNano.readString();
                        codedInputByteBufferNano.readTag();
                        length2++;
                    }
                    strArr4[length2] = codedInputByteBufferNano.readString();
                    this.f14857f = strArr4;
                    break;
                case 58:
                    int repeatedFieldArrayLength3 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 58);
                    String[] strArr5 = this.f14858g;
                    int length3 = strArr5 == null ? 0 : strArr5.length;
                    int i11 = repeatedFieldArrayLength3 + length3;
                    String[] strArr6 = new String[i11];
                    if (length3 != 0) {
                        System.arraycopy(strArr5, 0, strArr6, 0, length3);
                    }
                    while (length3 < i11 - 1) {
                        strArr6[length3] = codedInputByteBufferNano.readString();
                        codedInputByteBufferNano.readTag();
                        length3++;
                    }
                    strArr6[length3] = codedInputByteBufferNano.readString();
                    this.f14858g = strArr6;
                    break;
                case 66:
                    int repeatedFieldArrayLength4 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 66);
                    C0415pm[] c0415pmArr = this.f14859h;
                    int length4 = c0415pmArr == null ? 0 : c0415pmArr.length;
                    int i12 = repeatedFieldArrayLength4 + length4;
                    C0415pm[] c0415pmArr2 = new C0415pm[i12];
                    if (length4 != 0) {
                        System.arraycopy(c0415pmArr, 0, c0415pmArr2, 0, length4);
                    }
                    while (length4 < i12 - 1) {
                        C0415pm c0415pm = new C0415pm();
                        c0415pmArr2[length4] = c0415pm;
                        codedInputByteBufferNano.readMessage(c0415pm);
                        codedInputByteBufferNano.readTag();
                        length4++;
                    }
                    C0415pm c0415pm2 = new C0415pm();
                    c0415pmArr2[length4] = c0415pm2;
                    codedInputByteBufferNano.readMessage(c0415pm2);
                    this.f14859h = c0415pmArr2;
                    break;
                case 74:
                    if (this.f14860i == null) {
                        this.f14860i = new C0464rm();
                    }
                    codedInputByteBufferNano.readMessage(this.f14860i);
                    break;
                case 82:
                    this.j = codedInputByteBufferNano.readString();
                    break;
                case AppMetricaDefaultValues.DEFAULT_DISPATCH_PERIOD_SECONDS /* 90 */:
                    this.f14861k = codedInputByteBufferNano.readString();
                    break;
                case 98:
                    this.f14862l = codedInputByteBufferNano.readString();
                    break;
                case 104:
                    this.f14863m = codedInputByteBufferNano.readBool();
                    break;
                case 114:
                    this.f14864n = codedInputByteBufferNano.readString();
                    break;
                case 122:
                    int repeatedFieldArrayLength5 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 122);
                    String[] strArr7 = this.f14865o;
                    int length5 = strArr7 == null ? 0 : strArr7.length;
                    int i13 = repeatedFieldArrayLength5 + length5;
                    String[] strArr8 = new String[i13];
                    if (length5 != 0) {
                        System.arraycopy(strArr7, 0, strArr8, 0, length5);
                    }
                    while (length5 < i13 - 1) {
                        strArr8[length5] = codedInputByteBufferNano.readString();
                        codedInputByteBufferNano.readTag();
                        length5++;
                    }
                    strArr8[length5] = codedInputByteBufferNano.readString();
                    this.f14865o = strArr8;
                    break;
                case 130:
                    if (this.f14866p == null) {
                        this.f14866p = new C0564vm();
                    }
                    codedInputByteBufferNano.readMessage(this.f14866p);
                    break;
                case 136:
                    this.q = codedInputByteBufferNano.readBool();
                    break;
                case 162:
                    this.f14867r = codedInputByteBufferNano.readString();
                    break;
                case 168:
                    this.f14868s = codedInputByteBufferNano.readInt64();
                    break;
                case 176:
                    this.f14869t = codedInputByteBufferNano.readInt64();
                    break;
                case 184:
                    this.f14870u = codedInputByteBufferNano.readBool();
                    break;
                case 194:
                    if (this.f14871v == null) {
                        this.f14871v = new C0514tm();
                    }
                    codedInputByteBufferNano.readMessage(this.f14871v);
                    break;
                case 200:
                    this.f14872w = codedInputByteBufferNano.readInt32();
                    break;
                case 208:
                    this.f14873x = codedInputByteBufferNano.readInt32();
                    break;
                case 218:
                    if (this.f14874y == null) {
                        this.f14874y = new C0390om();
                    }
                    codedInputByteBufferNano.readMessage(this.f14874y);
                    break;
                case 234:
                    if (this.f14875z == null) {
                        this.f14875z = new C0365nm();
                    }
                    codedInputByteBufferNano.readMessage(this.f14875z);
                    break;
                case 242:
                    if (this.A == null) {
                        this.A = new C0539um();
                    }
                    codedInputByteBufferNano.readMessage(this.A);
                    break;
                case 250:
                    int repeatedFieldArrayLength6 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 250);
                    C0489sm[] c0489smArr = this.B;
                    int length6 = c0489smArr == null ? 0 : c0489smArr.length;
                    int i14 = repeatedFieldArrayLength6 + length6;
                    C0489sm[] c0489smArr2 = new C0489sm[i14];
                    if (length6 != 0) {
                        System.arraycopy(c0489smArr, 0, c0489smArr2, 0, length6);
                    }
                    while (length6 < i14 - 1) {
                        C0489sm c0489sm = new C0489sm();
                        c0489smArr2[length6] = c0489sm;
                        codedInputByteBufferNano.readMessage(c0489sm);
                        codedInputByteBufferNano.readTag();
                        length6++;
                    }
                    C0489sm c0489sm2 = new C0489sm();
                    c0489smArr2[length6] = c0489sm2;
                    codedInputByteBufferNano.readMessage(c0489sm2);
                    this.B = c0489smArr2;
                    break;
                case 258:
                    if (this.C == null) {
                        this.C = new C0440qm();
                    }
                    codedInputByteBufferNano.readMessage(this.C);
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

    public static C0589wm a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0589wm) MessageNano.mergeFrom(new C0589wm(), bArr);
    }
}

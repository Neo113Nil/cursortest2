package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.j9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0251j9 extends MessageNano {

    /* renamed from: g, reason: collision with root package name */
    public static final int f14012g = -1;

    /* renamed from: h, reason: collision with root package name */
    public static final int f14013h = 0;

    /* renamed from: i, reason: collision with root package name */
    public static final int f14014i = 1;
    public static volatile C0251j9[] j;

    /* renamed from: a, reason: collision with root package name */
    public C0174g9[] f14015a;

    /* renamed from: b, reason: collision with root package name */
    public C0045b9 f14016b;

    /* renamed from: c, reason: collision with root package name */
    public Y8[] f14017c;

    /* renamed from: d, reason: collision with root package name */
    public C0200h9[] f14018d;

    /* renamed from: e, reason: collision with root package name */
    public String[] f14019e;

    /* renamed from: f, reason: collision with root package name */
    public byte[][] f14020f;

    public C0251j9() {
        a();
    }

    public static C0251j9[] b() {
        if (j == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (j == null) {
                        j = new C0251j9[0];
                    }
                } finally {
                }
            }
        }
        return j;
    }

    public final C0251j9 a() {
        this.f14015a = C0174g9.b();
        this.f14016b = null;
        this.f14017c = Y8.b();
        this.f14018d = C0200h9.b();
        this.f14019e = WireFormatNano.EMPTY_STRING_ARRAY;
        this.f14020f = WireFormatNano.EMPTY_BYTES_ARRAY;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C0174g9[] c0174g9Arr = this.f14015a;
        int i5 = 0;
        if (c0174g9Arr != null && c0174g9Arr.length > 0) {
            int i10 = 0;
            while (true) {
                C0174g9[] c0174g9Arr2 = this.f14015a;
                if (i10 >= c0174g9Arr2.length) {
                    break;
                }
                C0174g9 c0174g9 = c0174g9Arr2[i10];
                if (c0174g9 != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(3, c0174g9) + computeSerializedSize;
                }
                i10++;
            }
        }
        C0045b9 c0045b9 = this.f14016b;
        if (c0045b9 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(4, c0045b9);
        }
        Y8[] y8Arr = this.f14017c;
        if (y8Arr != null && y8Arr.length > 0) {
            int i11 = 0;
            while (true) {
                Y8[] y8Arr2 = this.f14017c;
                if (i11 >= y8Arr2.length) {
                    break;
                }
                Y8 y82 = y8Arr2[i11];
                if (y82 != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(7, y82) + computeSerializedSize;
                }
                i11++;
            }
        }
        C0200h9[] c0200h9Arr = this.f14018d;
        if (c0200h9Arr != null && c0200h9Arr.length > 0) {
            int i12 = 0;
            while (true) {
                C0200h9[] c0200h9Arr2 = this.f14018d;
                if (i12 >= c0200h9Arr2.length) {
                    break;
                }
                C0200h9 c0200h9 = c0200h9Arr2[i12];
                if (c0200h9 != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(10, c0200h9) + computeSerializedSize;
                }
                i12++;
            }
        }
        String[] strArr = this.f14019e;
        if (strArr != null && strArr.length > 0) {
            int i13 = 0;
            int i14 = 0;
            int i15 = 0;
            while (true) {
                String[] strArr2 = this.f14019e;
                if (i13 >= strArr2.length) {
                    break;
                }
                String str = strArr2[i13];
                if (str != null) {
                    i15++;
                    i14 += CodedOutputByteBufferNano.computeStringSizeNoTag(str);
                }
                i13++;
            }
            computeSerializedSize = computeSerializedSize + i14 + i15;
        }
        byte[][] bArr = this.f14020f;
        if (bArr == null || bArr.length <= 0) {
            return computeSerializedSize;
        }
        int i16 = 0;
        int i17 = 0;
        while (true) {
            byte[][] bArr2 = this.f14020f;
            if (i5 >= bArr2.length) {
                return computeSerializedSize + i16 + i17;
            }
            byte[] bArr3 = bArr2[i5];
            if (bArr3 != null) {
                i17++;
                i16 = CodedOutputByteBufferNano.computeBytesSizeNoTag(bArr3) + i16;
            }
            i5++;
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C0174g9[] c0174g9Arr = this.f14015a;
        int i5 = 0;
        if (c0174g9Arr != null && c0174g9Arr.length > 0) {
            int i10 = 0;
            while (true) {
                C0174g9[] c0174g9Arr2 = this.f14015a;
                if (i10 >= c0174g9Arr2.length) {
                    break;
                }
                C0174g9 c0174g9 = c0174g9Arr2[i10];
                if (c0174g9 != null) {
                    codedOutputByteBufferNano.writeMessage(3, c0174g9);
                }
                i10++;
            }
        }
        C0045b9 c0045b9 = this.f14016b;
        if (c0045b9 != null) {
            codedOutputByteBufferNano.writeMessage(4, c0045b9);
        }
        Y8[] y8Arr = this.f14017c;
        if (y8Arr != null && y8Arr.length > 0) {
            int i11 = 0;
            while (true) {
                Y8[] y8Arr2 = this.f14017c;
                if (i11 >= y8Arr2.length) {
                    break;
                }
                Y8 y82 = y8Arr2[i11];
                if (y82 != null) {
                    codedOutputByteBufferNano.writeMessage(7, y82);
                }
                i11++;
            }
        }
        C0200h9[] c0200h9Arr = this.f14018d;
        if (c0200h9Arr != null && c0200h9Arr.length > 0) {
            int i12 = 0;
            while (true) {
                C0200h9[] c0200h9Arr2 = this.f14018d;
                if (i12 >= c0200h9Arr2.length) {
                    break;
                }
                C0200h9 c0200h9 = c0200h9Arr2[i12];
                if (c0200h9 != null) {
                    codedOutputByteBufferNano.writeMessage(10, c0200h9);
                }
                i12++;
            }
        }
        String[] strArr = this.f14019e;
        if (strArr != null && strArr.length > 0) {
            int i13 = 0;
            while (true) {
                String[] strArr2 = this.f14019e;
                if (i13 >= strArr2.length) {
                    break;
                }
                String str = strArr2[i13];
                if (str != null) {
                    codedOutputByteBufferNano.writeString(11, str);
                }
                i13++;
            }
        }
        byte[][] bArr = this.f14020f;
        if (bArr != null && bArr.length > 0) {
            while (true) {
                byte[][] bArr2 = this.f14020f;
                if (i5 >= bArr2.length) {
                    break;
                }
                byte[] bArr3 = bArr2[i5];
                if (bArr3 != null) {
                    codedOutputByteBufferNano.writeBytes(12, bArr3);
                }
                i5++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C0251j9 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0251j9().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0251j9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 26) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 26);
                C0174g9[] c0174g9Arr = this.f14015a;
                int length = c0174g9Arr == null ? 0 : c0174g9Arr.length;
                int i5 = repeatedFieldArrayLength + length;
                C0174g9[] c0174g9Arr2 = new C0174g9[i5];
                if (length != 0) {
                    System.arraycopy(c0174g9Arr, 0, c0174g9Arr2, 0, length);
                }
                while (length < i5 - 1) {
                    C0174g9 c0174g9 = new C0174g9();
                    c0174g9Arr2[length] = c0174g9;
                    codedInputByteBufferNano.readMessage(c0174g9);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C0174g9 c0174g92 = new C0174g9();
                c0174g9Arr2[length] = c0174g92;
                codedInputByteBufferNano.readMessage(c0174g92);
                this.f14015a = c0174g9Arr2;
            } else if (readTag == 34) {
                if (this.f14016b == null) {
                    this.f14016b = new C0045b9();
                }
                codedInputByteBufferNano.readMessage(this.f14016b);
            } else if (readTag == 58) {
                int repeatedFieldArrayLength2 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 58);
                Y8[] y8Arr = this.f14017c;
                int length2 = y8Arr == null ? 0 : y8Arr.length;
                int i10 = repeatedFieldArrayLength2 + length2;
                Y8[] y8Arr2 = new Y8[i10];
                if (length2 != 0) {
                    System.arraycopy(y8Arr, 0, y8Arr2, 0, length2);
                }
                while (length2 < i10 - 1) {
                    Y8 y82 = new Y8();
                    y8Arr2[length2] = y82;
                    codedInputByteBufferNano.readMessage(y82);
                    codedInputByteBufferNano.readTag();
                    length2++;
                }
                Y8 y83 = new Y8();
                y8Arr2[length2] = y83;
                codedInputByteBufferNano.readMessage(y83);
                this.f14017c = y8Arr2;
            } else if (readTag == 82) {
                int repeatedFieldArrayLength3 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 82);
                C0200h9[] c0200h9Arr = this.f14018d;
                int length3 = c0200h9Arr == null ? 0 : c0200h9Arr.length;
                int i11 = repeatedFieldArrayLength3 + length3;
                C0200h9[] c0200h9Arr2 = new C0200h9[i11];
                if (length3 != 0) {
                    System.arraycopy(c0200h9Arr, 0, c0200h9Arr2, 0, length3);
                }
                while (length3 < i11 - 1) {
                    C0200h9 c0200h9 = new C0200h9();
                    c0200h9Arr2[length3] = c0200h9;
                    codedInputByteBufferNano.readMessage(c0200h9);
                    codedInputByteBufferNano.readTag();
                    length3++;
                }
                C0200h9 c0200h92 = new C0200h9();
                c0200h9Arr2[length3] = c0200h92;
                codedInputByteBufferNano.readMessage(c0200h92);
                this.f14018d = c0200h9Arr2;
            } else if (readTag == 90) {
                int repeatedFieldArrayLength4 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 90);
                String[] strArr = this.f14019e;
                int length4 = strArr == null ? 0 : strArr.length;
                int i12 = repeatedFieldArrayLength4 + length4;
                String[] strArr2 = new String[i12];
                if (length4 != 0) {
                    System.arraycopy(strArr, 0, strArr2, 0, length4);
                }
                while (length4 < i12 - 1) {
                    strArr2[length4] = codedInputByteBufferNano.readString();
                    codedInputByteBufferNano.readTag();
                    length4++;
                }
                strArr2[length4] = codedInputByteBufferNano.readString();
                this.f14019e = strArr2;
            } else if (readTag != 98) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                int repeatedFieldArrayLength5 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 98);
                byte[][] bArr = this.f14020f;
                int length5 = bArr == null ? 0 : bArr.length;
                int i13 = repeatedFieldArrayLength5 + length5;
                byte[][] bArr2 = new byte[i13][];
                if (length5 != 0) {
                    System.arraycopy(bArr, 0, bArr2, 0, length5);
                }
                while (length5 < i13 - 1) {
                    bArr2[length5] = codedInputByteBufferNano.readBytes();
                    codedInputByteBufferNano.readTag();
                    length5++;
                }
                bArr2[length5] = codedInputByteBufferNano.readBytes();
                this.f14020f = bArr2;
            }
        }
        return this;
    }

    public static C0251j9 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0251j9) MessageNano.mergeFrom(new C0251j9(), bArr);
    }
}

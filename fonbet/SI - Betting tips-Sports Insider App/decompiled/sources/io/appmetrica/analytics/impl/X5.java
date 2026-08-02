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
public final class X5 extends MessageNano {

    /* renamed from: l, reason: collision with root package name */
    public static final int f13162l = 0;

    /* renamed from: m, reason: collision with root package name */
    public static final int f13163m = 1;

    /* renamed from: n, reason: collision with root package name */
    public static volatile X5[] f13164n;

    /* renamed from: o, reason: collision with root package name */
    public static byte[] f13165o;

    /* renamed from: p, reason: collision with root package name */
    public static volatile boolean f13166p;

    /* renamed from: a, reason: collision with root package name */
    public C0042b6 f13167a;

    /* renamed from: b, reason: collision with root package name */
    public R5 f13168b;

    /* renamed from: c, reason: collision with root package name */
    public String f13169c;

    /* renamed from: d, reason: collision with root package name */
    public int f13170d;

    /* renamed from: e, reason: collision with root package name */
    public Z5[] f13171e;

    /* renamed from: f, reason: collision with root package name */
    public String f13172f;

    /* renamed from: g, reason: collision with root package name */
    public int f13173g;

    /* renamed from: h, reason: collision with root package name */
    public W5 f13174h;

    /* renamed from: i, reason: collision with root package name */
    public byte[] f13175i;
    public byte[] j;

    /* renamed from: k, reason: collision with root package name */
    public T5[] f13176k;

    public X5() {
        if (!f13166p) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (!f13166p) {
                        f13165o = InternalNano.bytesDefaultValue("JVM");
                        f13166p = true;
                    }
                } finally {
                }
            }
        }
        a();
    }

    public static X5[] b() {
        if (f13164n == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f13164n == null) {
                        f13164n = new X5[0];
                    }
                } finally {
                }
            }
        }
        return f13164n;
    }

    public final X5 a() {
        this.f13167a = null;
        this.f13168b = null;
        this.f13169c = "";
        this.f13170d = -1;
        this.f13171e = Z5.b();
        this.f13172f = "";
        this.f13173g = 0;
        this.f13174h = null;
        this.f13175i = (byte[]) f13165o.clone();
        this.j = WireFormatNano.EMPTY_BYTES;
        this.f13176k = T5.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C0042b6 c0042b6 = this.f13167a;
        if (c0042b6 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c0042b6);
        }
        R5 r5 = this.f13168b;
        if (r5 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, r5);
        }
        if (!this.f13169c.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(3, this.f13169c);
        }
        int i5 = this.f13170d;
        if (i5 != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(4, i5);
        }
        Z5[] z5Arr = this.f13171e;
        int i10 = 0;
        if (z5Arr != null && z5Arr.length > 0) {
            int i11 = 0;
            while (true) {
                Z5[] z5Arr2 = this.f13171e;
                if (i11 >= z5Arr2.length) {
                    break;
                }
                Z5 z5 = z5Arr2[i11];
                if (z5 != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(5, z5) + computeSerializedSize;
                }
                i11++;
            }
        }
        if (!this.f13172f.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(6, this.f13172f);
        }
        int i12 = this.f13173g;
        if (i12 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(7, i12);
        }
        W5 w52 = this.f13174h;
        if (w52 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(8, w52);
        }
        if (!Arrays.equals(this.f13175i, f13165o)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(9, this.f13175i);
        }
        if (!Arrays.equals(this.j, WireFormatNano.EMPTY_BYTES)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(10, this.j);
        }
        T5[] t5Arr = this.f13176k;
        if (t5Arr != null && t5Arr.length > 0) {
            while (true) {
                T5[] t5Arr2 = this.f13176k;
                if (i10 >= t5Arr2.length) {
                    break;
                }
                T5 t5 = t5Arr2[i10];
                if (t5 != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(11, t5) + computeSerializedSize;
                }
                i10++;
            }
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C0042b6 c0042b6 = this.f13167a;
        if (c0042b6 != null) {
            codedOutputByteBufferNano.writeMessage(1, c0042b6);
        }
        R5 r5 = this.f13168b;
        if (r5 != null) {
            codedOutputByteBufferNano.writeMessage(2, r5);
        }
        if (!this.f13169c.equals("")) {
            codedOutputByteBufferNano.writeString(3, this.f13169c);
        }
        int i5 = this.f13170d;
        if (i5 != -1) {
            codedOutputByteBufferNano.writeInt32(4, i5);
        }
        Z5[] z5Arr = this.f13171e;
        int i10 = 0;
        if (z5Arr != null && z5Arr.length > 0) {
            int i11 = 0;
            while (true) {
                Z5[] z5Arr2 = this.f13171e;
                if (i11 >= z5Arr2.length) {
                    break;
                }
                Z5 z5 = z5Arr2[i11];
                if (z5 != null) {
                    codedOutputByteBufferNano.writeMessage(5, z5);
                }
                i11++;
            }
        }
        if (!this.f13172f.equals("")) {
            codedOutputByteBufferNano.writeString(6, this.f13172f);
        }
        int i12 = this.f13173g;
        if (i12 != 0) {
            codedOutputByteBufferNano.writeInt32(7, i12);
        }
        W5 w52 = this.f13174h;
        if (w52 != null) {
            codedOutputByteBufferNano.writeMessage(8, w52);
        }
        if (!Arrays.equals(this.f13175i, f13165o)) {
            codedOutputByteBufferNano.writeBytes(9, this.f13175i);
        }
        if (!Arrays.equals(this.j, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(10, this.j);
        }
        T5[] t5Arr = this.f13176k;
        if (t5Arr != null && t5Arr.length > 0) {
            while (true) {
                T5[] t5Arr2 = this.f13176k;
                if (i10 >= t5Arr2.length) {
                    break;
                }
                T5 t5 = t5Arr2[i10];
                if (t5 != null) {
                    codedOutputByteBufferNano.writeMessage(11, t5);
                }
                i10++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static X5 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new X5().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final X5 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            switch (readTag) {
                case 0:
                    break;
                case 10:
                    if (this.f13167a == null) {
                        this.f13167a = new C0042b6();
                    }
                    codedInputByteBufferNano.readMessage(this.f13167a);
                    break;
                case 18:
                    if (this.f13168b == null) {
                        this.f13168b = new R5();
                    }
                    codedInputByteBufferNano.readMessage(this.f13168b);
                    break;
                case C0122e9.G /* 26 */:
                    this.f13169c = codedInputByteBufferNano.readString();
                    break;
                case 32:
                    int readInt32 = codedInputByteBufferNano.readInt32();
                    if (readInt32 != -1 && readInt32 != 0 && readInt32 != 1) {
                        break;
                    } else {
                        this.f13170d = readInt32;
                        break;
                    }
                case C0122e9.M /* 42 */:
                    int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 42);
                    Z5[] z5Arr = this.f13171e;
                    int length = z5Arr == null ? 0 : z5Arr.length;
                    int i5 = repeatedFieldArrayLength + length;
                    Z5[] z5Arr2 = new Z5[i5];
                    if (length != 0) {
                        System.arraycopy(z5Arr, 0, z5Arr2, 0, length);
                    }
                    while (length < i5 - 1) {
                        Z5 z5 = new Z5();
                        z5Arr2[length] = z5;
                        codedInputByteBufferNano.readMessage(z5);
                        codedInputByteBufferNano.readTag();
                        length++;
                    }
                    Z5 z52 = new Z5();
                    z5Arr2[length] = z52;
                    codedInputByteBufferNano.readMessage(z52);
                    this.f13171e = z5Arr2;
                    break;
                case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                    this.f13172f = codedInputByteBufferNano.readString();
                    break;
                case 56:
                    int readInt322 = codedInputByteBufferNano.readInt32();
                    if (readInt322 != 0 && readInt322 != 1) {
                        break;
                    } else {
                        this.f13173g = readInt322;
                        break;
                    }
                case 66:
                    if (this.f13174h == null) {
                        this.f13174h = new W5();
                    }
                    codedInputByteBufferNano.readMessage(this.f13174h);
                    break;
                case 74:
                    this.f13175i = codedInputByteBufferNano.readBytes();
                    break;
                case 82:
                    this.j = codedInputByteBufferNano.readBytes();
                    break;
                case AppMetricaDefaultValues.DEFAULT_DISPATCH_PERIOD_SECONDS /* 90 */:
                    int repeatedFieldArrayLength2 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 90);
                    T5[] t5Arr = this.f13176k;
                    int length2 = t5Arr == null ? 0 : t5Arr.length;
                    int i10 = repeatedFieldArrayLength2 + length2;
                    T5[] t5Arr2 = new T5[i10];
                    if (length2 != 0) {
                        System.arraycopy(t5Arr, 0, t5Arr2, 0, length2);
                    }
                    while (length2 < i10 - 1) {
                        T5 t5 = new T5();
                        t5Arr2[length2] = t5;
                        codedInputByteBufferNano.readMessage(t5);
                        codedInputByteBufferNano.readTag();
                        length2++;
                    }
                    T5 t52 = new T5();
                    t5Arr2[length2] = t52;
                    codedInputByteBufferNano.readMessage(t52);
                    this.f13176k = t5Arr2;
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

    public static X5 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (X5) MessageNano.mergeFrom(new X5(), bArr);
    }
}

package io.appmetrica.analytics.impl;

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
public final class V5 extends MessageNano {

    /* renamed from: k, reason: collision with root package name */
    public static final int f13015k = 0;

    /* renamed from: l, reason: collision with root package name */
    public static final int f13016l = 1;

    /* renamed from: m, reason: collision with root package name */
    public static volatile V5[] f13017m;

    /* renamed from: n, reason: collision with root package name */
    public static byte[] f13018n;

    /* renamed from: o, reason: collision with root package name */
    public static volatile boolean f13019o;

    /* renamed from: a, reason: collision with root package name */
    public C0042b6 f13020a;

    /* renamed from: b, reason: collision with root package name */
    public R5 f13021b;

    /* renamed from: c, reason: collision with root package name */
    public String f13022c;

    /* renamed from: d, reason: collision with root package name */
    public int f13023d;

    /* renamed from: e, reason: collision with root package name */
    public Z5[] f13024e;

    /* renamed from: f, reason: collision with root package name */
    public int f13025f;

    /* renamed from: g, reason: collision with root package name */
    public U5 f13026g;

    /* renamed from: h, reason: collision with root package name */
    public byte[] f13027h;

    /* renamed from: i, reason: collision with root package name */
    public byte[] f13028i;
    public T5[] j;

    public V5() {
        if (!f13019o) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (!f13019o) {
                        f13018n = InternalNano.bytesDefaultValue("JVM");
                        f13019o = true;
                    }
                } finally {
                }
            }
        }
        a();
    }

    public static V5[] b() {
        if (f13017m == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f13017m == null) {
                        f13017m = new V5[0];
                    }
                } finally {
                }
            }
        }
        return f13017m;
    }

    public final V5 a() {
        this.f13020a = null;
        this.f13021b = null;
        this.f13022c = "";
        this.f13023d = -1;
        this.f13024e = Z5.b();
        this.f13025f = 0;
        this.f13026g = null;
        this.f13027h = (byte[]) f13018n.clone();
        this.f13028i = WireFormatNano.EMPTY_BYTES;
        this.j = T5.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C0042b6 c0042b6 = this.f13020a;
        if (c0042b6 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c0042b6);
        }
        R5 r5 = this.f13021b;
        if (r5 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, r5);
        }
        if (!this.f13022c.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(3, this.f13022c);
        }
        int i5 = this.f13023d;
        if (i5 != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(4, i5);
        }
        Z5[] z5Arr = this.f13024e;
        int i10 = 0;
        if (z5Arr != null && z5Arr.length > 0) {
            int i11 = 0;
            while (true) {
                Z5[] z5Arr2 = this.f13024e;
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
        int i12 = this.f13025f;
        if (i12 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(6, i12);
        }
        U5 u52 = this.f13026g;
        if (u52 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(7, u52);
        }
        if (!Arrays.equals(this.f13027h, f13018n)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(8, this.f13027h);
        }
        if (!Arrays.equals(this.f13028i, WireFormatNano.EMPTY_BYTES)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(9, this.f13028i);
        }
        T5[] t5Arr = this.j;
        if (t5Arr != null && t5Arr.length > 0) {
            while (true) {
                T5[] t5Arr2 = this.j;
                if (i10 >= t5Arr2.length) {
                    break;
                }
                T5 t5 = t5Arr2[i10];
                if (t5 != null) {
                    computeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(10, t5) + computeSerializedSize;
                }
                i10++;
            }
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C0042b6 c0042b6 = this.f13020a;
        if (c0042b6 != null) {
            codedOutputByteBufferNano.writeMessage(1, c0042b6);
        }
        R5 r5 = this.f13021b;
        if (r5 != null) {
            codedOutputByteBufferNano.writeMessage(2, r5);
        }
        if (!this.f13022c.equals("")) {
            codedOutputByteBufferNano.writeString(3, this.f13022c);
        }
        int i5 = this.f13023d;
        if (i5 != -1) {
            codedOutputByteBufferNano.writeInt32(4, i5);
        }
        Z5[] z5Arr = this.f13024e;
        int i10 = 0;
        if (z5Arr != null && z5Arr.length > 0) {
            int i11 = 0;
            while (true) {
                Z5[] z5Arr2 = this.f13024e;
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
        int i12 = this.f13025f;
        if (i12 != 0) {
            codedOutputByteBufferNano.writeInt32(6, i12);
        }
        U5 u52 = this.f13026g;
        if (u52 != null) {
            codedOutputByteBufferNano.writeMessage(7, u52);
        }
        if (!Arrays.equals(this.f13027h, f13018n)) {
            codedOutputByteBufferNano.writeBytes(8, this.f13027h);
        }
        if (!Arrays.equals(this.f13028i, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(9, this.f13028i);
        }
        T5[] t5Arr = this.j;
        if (t5Arr != null && t5Arr.length > 0) {
            while (true) {
                T5[] t5Arr2 = this.j;
                if (i10 >= t5Arr2.length) {
                    break;
                }
                T5 t5 = t5Arr2[i10];
                if (t5 != null) {
                    codedOutputByteBufferNano.writeMessage(10, t5);
                }
                i10++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static V5 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new V5().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final V5 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            switch (readTag) {
                case 0:
                    break;
                case 10:
                    if (this.f13020a == null) {
                        this.f13020a = new C0042b6();
                    }
                    codedInputByteBufferNano.readMessage(this.f13020a);
                    break;
                case 18:
                    if (this.f13021b == null) {
                        this.f13021b = new R5();
                    }
                    codedInputByteBufferNano.readMessage(this.f13021b);
                    break;
                case C0122e9.G /* 26 */:
                    this.f13022c = codedInputByteBufferNano.readString();
                    break;
                case 32:
                    int readInt32 = codedInputByteBufferNano.readInt32();
                    if (readInt32 != -1 && readInt32 != 0 && readInt32 != 1) {
                        break;
                    } else {
                        this.f13023d = readInt32;
                        break;
                    }
                case C0122e9.M /* 42 */:
                    int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 42);
                    Z5[] z5Arr = this.f13024e;
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
                    this.f13024e = z5Arr2;
                    break;
                case 48:
                    int readInt322 = codedInputByteBufferNano.readInt32();
                    if (readInt322 != 0 && readInt322 != 1) {
                        break;
                    } else {
                        this.f13025f = readInt322;
                        break;
                    }
                case 58:
                    if (this.f13026g == null) {
                        this.f13026g = new U5();
                    }
                    codedInputByteBufferNano.readMessage(this.f13026g);
                    break;
                case 66:
                    this.f13027h = codedInputByteBufferNano.readBytes();
                    break;
                case 74:
                    this.f13028i = codedInputByteBufferNano.readBytes();
                    break;
                case 82:
                    int repeatedFieldArrayLength2 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 82);
                    T5[] t5Arr = this.j;
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
                    this.j = t5Arr2;
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

    public static V5 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (V5) MessageNano.mergeFrom(new V5(), bArr);
    }
}

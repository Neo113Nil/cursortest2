package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import java.io.IOException;

/* renamed from: com.google.protobuf.b, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
final class C5951b {

    /* renamed from: com.google.protobuf.b$a */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f60194a;

        static {
            int[] iArr = new int[WireFormat$FieldType.values().length];
            f60194a = iArr;
            try {
                iArr[WireFormat$FieldType.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f60194a[WireFormat$FieldType.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f60194a[WireFormat$FieldType.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f60194a[WireFormat$FieldType.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f60194a[WireFormat$FieldType.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f60194a[WireFormat$FieldType.UINT32.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f60194a[WireFormat$FieldType.FIXED64.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f60194a[WireFormat$FieldType.SFIXED64.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f60194a[WireFormat$FieldType.FIXED32.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f60194a[WireFormat$FieldType.SFIXED32.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f60194a[WireFormat$FieldType.BOOL.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f60194a[WireFormat$FieldType.SINT32.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f60194a[WireFormat$FieldType.SINT64.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f60194a[WireFormat$FieldType.ENUM.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f60194a[WireFormat$FieldType.BYTES.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f60194a[WireFormat$FieldType.STRING.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f60194a[WireFormat$FieldType.GROUP.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f60194a[WireFormat$FieldType.MESSAGE.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    /* renamed from: com.google.protobuf.b$b, reason: collision with other inner class name */
    static final class C0915b {

        /* renamed from: a, reason: collision with root package name */
        public int f60195a;

        /* renamed from: b, reason: collision with root package name */
        public long f60196b;

        /* renamed from: c, reason: collision with root package name */
        public Object f60197c;

        /* renamed from: d, reason: collision with root package name */
        public final C5957h f60198d;

        /* renamed from: e, reason: collision with root package name */
        public int f60199e;

        C0915b(C5957h c5957h) {
            c5957h.getClass();
            this.f60198d = c5957h;
        }
    }

    static int A(byte[] bArr, int i11, C0915b c0915b) throws InvalidProtocolBufferException {
        int G11 = G(bArr, i11, c0915b);
        int i12 = c0915b.f60195a;
        if (i12 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        if (i12 == 0) {
            c0915b.f60197c = "";
            return G11;
        }
        c0915b.f60197c = new String(bArr, G11, i12, Internal.f60125a);
        return G11 + i12;
    }

    static int B(int i11, byte[] bArr, int i12, int i13, Internal.e<?> eVar, C0915b c0915b) throws InvalidProtocolBufferException {
        int G11 = G(bArr, i12, c0915b);
        int i14 = c0915b.f60195a;
        if (i14 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        if (i14 == 0) {
            eVar.add("");
        } else {
            eVar.add(new String(bArr, G11, i14, Internal.f60125a));
            G11 += i14;
        }
        while (G11 < i13) {
            int G12 = G(bArr, G11, c0915b);
            if (i11 != c0915b.f60195a) {
                break;
            }
            G11 = G(bArr, G12, c0915b);
            int i15 = c0915b.f60195a;
            if (i15 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            if (i15 == 0) {
                eVar.add("");
            } else {
                eVar.add(new String(bArr, G11, i15, Internal.f60125a));
                G11 += i15;
            }
        }
        return G11;
    }

    static int C(int i11, byte[] bArr, int i12, int i13, Internal.e<?> eVar, C0915b c0915b) throws InvalidProtocolBufferException {
        int G11 = G(bArr, i12, c0915b);
        int i14 = c0915b.f60195a;
        if (i14 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        if (i14 == 0) {
            eVar.add("");
        } else {
            int i15 = G11 + i14;
            if (!Utf8.o(bArr, G11, i15)) {
                throw InvalidProtocolBufferException.invalidUtf8();
            }
            eVar.add(new String(bArr, G11, i14, Internal.f60125a));
            G11 = i15;
        }
        while (G11 < i13) {
            int G12 = G(bArr, G11, c0915b);
            if (i11 != c0915b.f60195a) {
                break;
            }
            G11 = G(bArr, G12, c0915b);
            int i16 = c0915b.f60195a;
            if (i16 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            if (i16 == 0) {
                eVar.add("");
            } else {
                int i17 = G11 + i16;
                if (!Utf8.o(bArr, G11, i17)) {
                    throw InvalidProtocolBufferException.invalidUtf8();
                }
                eVar.add(new String(bArr, G11, i16, Internal.f60125a));
                G11 = i17;
            }
        }
        return G11;
    }

    static int D(byte[] bArr, int i11, C0915b c0915b) throws InvalidProtocolBufferException {
        int G11 = G(bArr, i11, c0915b);
        int i12 = c0915b.f60195a;
        if (i12 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        if (i12 == 0) {
            c0915b.f60197c = "";
            return G11;
        }
        c0915b.f60197c = Utf8.g(bArr, G11, i12);
        return G11 + i12;
    }

    static int E(int i11, byte[] bArr, int i12, int i13, O o11, C0915b c0915b) throws InvalidProtocolBufferException {
        if ((i11 >>> 3) == 0) {
            throw InvalidProtocolBufferException.invalidTag();
        }
        int i14 = i11 & 7;
        if (i14 == 0) {
            int I11 = I(bArr, i12, c0915b);
            o11.l(i11, Long.valueOf(c0915b.f60196b));
            return I11;
        }
        if (i14 == 1) {
            o11.l(i11, Long.valueOf(i(i12, bArr)));
            return i12 + 8;
        }
        if (i14 == 2) {
            int G11 = G(bArr, i12, c0915b);
            int i15 = c0915b.f60195a;
            if (i15 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            if (i15 > bArr.length - G11) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            if (i15 == 0) {
                o11.l(i11, ByteString.EMPTY);
            } else {
                o11.l(i11, ByteString.copyFrom(bArr, G11, i15));
            }
            return G11 + i15;
        }
        if (i14 != 3) {
            if (i14 != 5) {
                throw InvalidProtocolBufferException.invalidTag();
            }
            o11.l(i11, Integer.valueOf(g(i12, bArr)));
            return i12 + 4;
        }
        O j11 = O.j();
        int i16 = (i11 & (-8)) | 4;
        int i17 = c0915b.f60199e + 1;
        c0915b.f60199e = i17;
        if (i17 >= 100) {
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }
        int i18 = 0;
        while (true) {
            if (i12 >= i13) {
                break;
            }
            int G12 = G(bArr, i12, c0915b);
            i18 = c0915b.f60195a;
            if (i18 == i16) {
                i12 = G12;
                break;
            }
            i12 = E(i18, bArr, G12, i13, j11, c0915b);
        }
        c0915b.f60199e--;
        if (i12 > i13 || i18 != i16) {
            throw InvalidProtocolBufferException.parseFailure();
        }
        o11.l(i11, j11);
        return i12;
    }

    static int F(int i11, byte[] bArr, int i12, C0915b c0915b) {
        int i13 = i11 & 127;
        int i14 = i12 + 1;
        byte b11 = bArr[i12];
        if (b11 >= 0) {
            c0915b.f60195a = i13 | (b11 << 7);
            return i14;
        }
        int i15 = i13 | ((b11 & Byte.MAX_VALUE) << 7);
        int i16 = i12 + 2;
        byte b12 = bArr[i14];
        if (b12 >= 0) {
            c0915b.f60195a = i15 | (b12 << 14);
            return i16;
        }
        int i17 = i15 | ((b12 & Byte.MAX_VALUE) << 14);
        int i18 = i12 + 3;
        byte b13 = bArr[i16];
        if (b13 >= 0) {
            c0915b.f60195a = i17 | (b13 << 21);
            return i18;
        }
        int i19 = i17 | ((b13 & Byte.MAX_VALUE) << 21);
        int i21 = i12 + 4;
        byte b14 = bArr[i18];
        if (b14 >= 0) {
            c0915b.f60195a = i19 | (b14 << 28);
            return i21;
        }
        int i22 = i19 | ((b14 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i23 = i21 + 1;
            if (bArr[i21] >= 0) {
                c0915b.f60195a = i22;
                return i23;
            }
            i21 = i23;
        }
    }

    static int G(byte[] bArr, int i11, C0915b c0915b) {
        int i12 = i11 + 1;
        byte b11 = bArr[i11];
        if (b11 < 0) {
            return F(b11, bArr, i12, c0915b);
        }
        c0915b.f60195a = b11;
        return i12;
    }

    static int H(int i11, byte[] bArr, int i12, int i13, Internal.e<?> eVar, C0915b c0915b) {
        IntArrayList intArrayList = (IntArrayList) eVar;
        int G11 = G(bArr, i12, c0915b);
        intArrayList.addInt(c0915b.f60195a);
        while (G11 < i13) {
            int G12 = G(bArr, G11, c0915b);
            if (i11 != c0915b.f60195a) {
                break;
            }
            G11 = G(bArr, G12, c0915b);
            intArrayList.addInt(c0915b.f60195a);
        }
        return G11;
    }

    static int I(byte[] bArr, int i11, C0915b c0915b) {
        int i12 = i11 + 1;
        long j11 = bArr[i11];
        if (j11 >= 0) {
            c0915b.f60196b = j11;
            return i12;
        }
        int i13 = i11 + 2;
        byte b11 = bArr[i12];
        long j12 = (j11 & 127) | ((b11 & Byte.MAX_VALUE) << 7);
        int i14 = 7;
        while (b11 < 0) {
            int i15 = i13 + 1;
            i14 += 7;
            j12 |= (r10 & Byte.MAX_VALUE) << i14;
            b11 = bArr[i13];
            i13 = i15;
        }
        c0915b.f60196b = j12;
        return i13;
    }

    static int J(int i11, byte[] bArr, int i12, int i13, Internal.e<?> eVar, C0915b c0915b) {
        LongArrayList longArrayList = (LongArrayList) eVar;
        int I11 = I(bArr, i12, c0915b);
        longArrayList.addLong(c0915b.f60196b);
        while (I11 < i13) {
            int G11 = G(bArr, I11, c0915b);
            if (i11 != c0915b.f60195a) {
                break;
            }
            I11 = I(bArr, G11, c0915b);
            longArrayList.addLong(c0915b.f60196b);
        }
        return I11;
    }

    static <T> int K(Object obj, J<T> j11, byte[] bArr, int i11, int i12, int i13, C0915b c0915b) throws IOException {
        MessageSchema messageSchema = (MessageSchema) j11;
        int i14 = c0915b.f60199e + 1;
        c0915b.f60199e = i14;
        if (i14 >= 100) {
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }
        int parseMessage = messageSchema.parseMessage(obj, bArr, i11, i12, i13, c0915b);
        c0915b.f60199e--;
        c0915b.f60197c = obj;
        return parseMessage;
    }

    static <T> int L(Object obj, J<T> j11, byte[] bArr, int i11, int i12, C0915b c0915b) throws IOException {
        int i13 = i11 + 1;
        int i14 = bArr[i11];
        if (i14 < 0) {
            i13 = F(i14, bArr, i13, c0915b);
            i14 = c0915b.f60195a;
        }
        int i15 = i13;
        if (i14 < 0 || i14 > i12 - i15) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        int i16 = c0915b.f60199e + 1;
        c0915b.f60199e = i16;
        if (i16 >= 100) {
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }
        int i17 = i15 + i14;
        j11.mergeFrom(obj, bArr, i15, i17, c0915b);
        c0915b.f60199e--;
        c0915b.f60197c = obj;
        return i17;
    }

    static int M(int i11, byte[] bArr, int i12, int i13, C0915b c0915b) throws InvalidProtocolBufferException {
        if ((i11 >>> 3) == 0) {
            throw InvalidProtocolBufferException.invalidTag();
        }
        int i14 = i11 & 7;
        if (i14 == 0) {
            return I(bArr, i12, c0915b);
        }
        if (i14 == 1) {
            return i12 + 8;
        }
        if (i14 == 2) {
            return G(bArr, i12, c0915b) + c0915b.f60195a;
        }
        if (i14 != 3) {
            if (i14 == 5) {
                return i12 + 4;
            }
            throw InvalidProtocolBufferException.invalidTag();
        }
        int i15 = (i11 & (-8)) | 4;
        int i16 = 0;
        while (i12 < i13) {
            i12 = G(bArr, i12, c0915b);
            i16 = c0915b.f60195a;
            if (i16 == i15) {
                break;
            }
            i12 = M(i16, bArr, i12, i13, c0915b);
        }
        if (i12 > i13 || i16 != i15) {
            throw InvalidProtocolBufferException.parseFailure();
        }
        return i12;
    }

    static int a(int i11, byte[] bArr, int i12, int i13, Internal.e<?> eVar, C0915b c0915b) {
        BooleanArrayList booleanArrayList = (BooleanArrayList) eVar;
        int I11 = I(bArr, i12, c0915b);
        booleanArrayList.addBoolean(c0915b.f60196b != 0);
        while (I11 < i13) {
            int G11 = G(bArr, I11, c0915b);
            if (i11 != c0915b.f60195a) {
                break;
            }
            I11 = I(bArr, G11, c0915b);
            booleanArrayList.addBoolean(c0915b.f60196b != 0);
        }
        return I11;
    }

    static int b(byte[] bArr, int i11, C0915b c0915b) throws InvalidProtocolBufferException {
        int G11 = G(bArr, i11, c0915b);
        int i12 = c0915b.f60195a;
        if (i12 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        if (i12 > bArr.length - G11) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        if (i12 == 0) {
            c0915b.f60197c = ByteString.EMPTY;
            return G11;
        }
        c0915b.f60197c = ByteString.copyFrom(bArr, G11, i12);
        return G11 + i12;
    }

    static int c(int i11, byte[] bArr, int i12, int i13, Internal.e<?> eVar, C0915b c0915b) throws InvalidProtocolBufferException {
        int G11 = G(bArr, i12, c0915b);
        int i14 = c0915b.f60195a;
        if (i14 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        if (i14 > bArr.length - G11) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        if (i14 == 0) {
            eVar.add(ByteString.EMPTY);
        } else {
            eVar.add(ByteString.copyFrom(bArr, G11, i14));
            G11 += i14;
        }
        while (G11 < i13) {
            int G12 = G(bArr, G11, c0915b);
            if (i11 != c0915b.f60195a) {
                break;
            }
            G11 = G(bArr, G12, c0915b);
            int i15 = c0915b.f60195a;
            if (i15 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            if (i15 > bArr.length - G11) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            if (i15 == 0) {
                eVar.add(ByteString.EMPTY);
            } else {
                eVar.add(ByteString.copyFrom(bArr, G11, i15));
                G11 += i15;
            }
        }
        return G11;
    }

    static double d(int i11, byte[] bArr) {
        return Double.longBitsToDouble(i(i11, bArr));
    }

    static int e(int i11, byte[] bArr, int i12, int i13, Internal.e<?> eVar, C0915b c0915b) {
        DoubleArrayList doubleArrayList = (DoubleArrayList) eVar;
        doubleArrayList.addDouble(d(i12, bArr));
        int i14 = i12 + 8;
        while (i14 < i13) {
            int G11 = G(bArr, i14, c0915b);
            if (i11 != c0915b.f60195a) {
                break;
            }
            doubleArrayList.addDouble(Double.longBitsToDouble(i(G11, bArr)));
            i14 = G11 + 8;
        }
        return i14;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    static int f(int i11, byte[] bArr, int i12, int i13, Object obj, MessageLite messageLite, N<O, O> n11, C0915b c0915b) throws IOException {
        int i14 = i11 >>> 3;
        GeneratedMessageLite.GeneratedExtension a11 = c0915b.f60198d.a(i14, messageLite);
        if (a11 == null) {
            return E(i11, bArr, i12, i13, MessageSchema.getMutableUnknownFields(obj), c0915b);
        }
        GeneratedMessageLite.ExtendableMessage extendableMessage = (GeneratedMessageLite.ExtendableMessage) obj;
        extendableMessage.ensureExtensionsAreMutable();
        C5961l<GeneratedMessageLite.ExtensionDescriptor> c5961l = extendableMessage.extensions;
        if (a11.descriptor.isRepeated() && a11.descriptor.isPacked()) {
            switch (a.f60194a[a11.getLiteType().ordinal()]) {
                case 1:
                    DoubleArrayList doubleArrayList = new DoubleArrayList();
                    int q11 = q(bArr, i12, doubleArrayList, c0915b);
                    c5961l.z(a11.descriptor, doubleArrayList);
                    return q11;
                case 2:
                    FloatArrayList floatArrayList = new FloatArrayList();
                    int t2 = t(bArr, i12, floatArrayList, c0915b);
                    c5961l.z(a11.descriptor, floatArrayList);
                    return t2;
                case 3:
                case 4:
                    LongArrayList longArrayList = new LongArrayList();
                    int x11 = x(bArr, i12, longArrayList, c0915b);
                    c5961l.z(a11.descriptor, longArrayList);
                    return x11;
                case 5:
                case 6:
                    IntArrayList intArrayList = new IntArrayList();
                    int w11 = w(bArr, i12, intArrayList, c0915b);
                    c5961l.z(a11.descriptor, intArrayList);
                    return w11;
                case 7:
                case 8:
                    LongArrayList longArrayList2 = new LongArrayList();
                    int s11 = s(bArr, i12, longArrayList2, c0915b);
                    c5961l.z(a11.descriptor, longArrayList2);
                    return s11;
                case 9:
                case 10:
                    IntArrayList intArrayList2 = new IntArrayList();
                    int r11 = r(bArr, i12, intArrayList2, c0915b);
                    c5961l.z(a11.descriptor, intArrayList2);
                    return r11;
                case 11:
                    BooleanArrayList booleanArrayList = new BooleanArrayList();
                    int p11 = p(bArr, i12, booleanArrayList, c0915b);
                    c5961l.z(a11.descriptor, booleanArrayList);
                    return p11;
                case 12:
                    IntArrayList intArrayList3 = new IntArrayList();
                    int u11 = u(bArr, i12, intArrayList3, c0915b);
                    c5961l.z(a11.descriptor, intArrayList3);
                    return u11;
                case 13:
                    LongArrayList longArrayList3 = new LongArrayList();
                    int v11 = v(bArr, i12, longArrayList3, c0915b);
                    c5961l.z(a11.descriptor, longArrayList3);
                    return v11;
                case 14:
                    IntArrayList intArrayList4 = new IntArrayList();
                    int w12 = w(bArr, i12, intArrayList4, c0915b);
                    L.j(extendableMessage, i14, intArrayList4, a11.descriptor.getEnumType(), null, n11);
                    c5961l.z(a11.descriptor, intArrayList4);
                    return w12;
                default:
                    throw new IllegalStateException("Type cannot be packed: " + a11.descriptor.getLiteType());
            }
        }
        Object obj2 = null;
        if (a11.getLiteType() == WireFormat$FieldType.ENUM) {
            i12 = G(bArr, i12, c0915b);
            if (a11.descriptor.getEnumType().findValueByNumber(c0915b.f60195a) == null) {
                L.n(extendableMessage, i14, c0915b.f60195a, null, n11);
                return i12;
            }
            obj2 = Integer.valueOf(c0915b.f60195a);
        } else {
            switch (a.f60194a[a11.getLiteType().ordinal()]) {
                case 1:
                    obj2 = Double.valueOf(Double.longBitsToDouble(i(i12, bArr)));
                    i12 += 8;
                    break;
                case 2:
                    obj2 = Float.valueOf(Float.intBitsToFloat(g(i12, bArr)));
                    i12 += 4;
                    break;
                case 3:
                case 4:
                    i12 = I(bArr, i12, c0915b);
                    obj2 = Long.valueOf(c0915b.f60196b);
                    break;
                case 5:
                case 6:
                    i12 = G(bArr, i12, c0915b);
                    obj2 = Integer.valueOf(c0915b.f60195a);
                    break;
                case 7:
                case 8:
                    obj2 = Long.valueOf(i(i12, bArr));
                    i12 += 8;
                    break;
                case 9:
                case 10:
                    obj2 = Integer.valueOf(g(i12, bArr));
                    i12 += 4;
                    break;
                case 11:
                    i12 = I(bArr, i12, c0915b);
                    obj2 = Boolean.valueOf(c0915b.f60196b != 0);
                    break;
                case 12:
                    i12 = G(bArr, i12, c0915b);
                    obj2 = Integer.valueOf(CodedInputStream.decodeZigZag32(c0915b.f60195a));
                    break;
                case 13:
                    i12 = I(bArr, i12, c0915b);
                    obj2 = Long.valueOf(CodedInputStream.decodeZigZag64(c0915b.f60196b));
                    break;
                case 14:
                    throw new IllegalStateException("Shouldn't reach here.");
                case 15:
                    i12 = b(bArr, i12, c0915b);
                    obj2 = c0915b.f60197c;
                    break;
                case 16:
                    i12 = A(bArr, i12, c0915b);
                    obj2 = c0915b.f60197c;
                    break;
                case 17:
                    int i15 = (i14 << 3) | 4;
                    J b11 = H.a().b(a11.getMessageDefaultInstance().getClass());
                    if (!a11.isRepeated()) {
                        Object i16 = c5961l.i(a11.descriptor);
                        if (i16 == null) {
                            i16 = b11.newInstance();
                            c5961l.z(a11.descriptor, i16);
                        }
                        return K(i16, b11, bArr, i12, i13, i15, c0915b);
                    }
                    Object newInstance = b11.newInstance();
                    int K11 = K(newInstance, b11, bArr, i12, i13, i15, c0915b);
                    b11.makeImmutable(newInstance);
                    c0915b.f60197c = newInstance;
                    c5961l.a(a11.descriptor, newInstance);
                    return K11;
                case 18:
                    J b12 = H.a().b(a11.getMessageDefaultInstance().getClass());
                    if (a11.isRepeated()) {
                        int n12 = n(b12, bArr, i12, i13, c0915b);
                        c5961l.a(a11.descriptor, c0915b.f60197c);
                        return n12;
                    }
                    Object i17 = c5961l.i(a11.descriptor);
                    if (i17 == null) {
                        i17 = b12.newInstance();
                        c5961l.z(a11.descriptor, i17);
                    }
                    return L(i17, b12, bArr, i12, i13, c0915b);
            }
        }
        if (a11.isRepeated()) {
            c5961l.a(a11.descriptor, obj2);
            return i12;
        }
        c5961l.z(a11.descriptor, obj2);
        return i12;
    }

    static int g(int i11, byte[] bArr) {
        return ((bArr[i11 + 3] & 255) << 24) | (bArr[i11] & 255) | ((bArr[i11 + 1] & 255) << 8) | ((bArr[i11 + 2] & 255) << 16);
    }

    static int h(int i11, byte[] bArr, int i12, int i13, Internal.e<?> eVar, C0915b c0915b) {
        IntArrayList intArrayList = (IntArrayList) eVar;
        intArrayList.addInt(g(i12, bArr));
        int i14 = i12 + 4;
        while (i14 < i13) {
            int G11 = G(bArr, i14, c0915b);
            if (i11 != c0915b.f60195a) {
                break;
            }
            intArrayList.addInt(g(G11, bArr));
            i14 = G11 + 4;
        }
        return i14;
    }

    static long i(int i11, byte[] bArr) {
        return ((bArr[i11 + 7] & 255) << 56) | (bArr[i11] & 255) | ((bArr[i11 + 1] & 255) << 8) | ((bArr[i11 + 2] & 255) << 16) | ((bArr[i11 + 3] & 255) << 24) | ((bArr[i11 + 4] & 255) << 32) | ((bArr[i11 + 5] & 255) << 40) | ((bArr[i11 + 6] & 255) << 48);
    }

    static int j(int i11, byte[] bArr, int i12, int i13, Internal.e<?> eVar, C0915b c0915b) {
        LongArrayList longArrayList = (LongArrayList) eVar;
        longArrayList.addLong(i(i12, bArr));
        int i14 = i12 + 8;
        while (i14 < i13) {
            int G11 = G(bArr, i14, c0915b);
            if (i11 != c0915b.f60195a) {
                break;
            }
            longArrayList.addLong(i(G11, bArr));
            i14 = G11 + 8;
        }
        return i14;
    }

    static float k(int i11, byte[] bArr) {
        return Float.intBitsToFloat(g(i11, bArr));
    }

    static int l(int i11, byte[] bArr, int i12, int i13, Internal.e<?> eVar, C0915b c0915b) {
        FloatArrayList floatArrayList = (FloatArrayList) eVar;
        floatArrayList.addFloat(k(i12, bArr));
        int i14 = i12 + 4;
        while (i14 < i13) {
            int G11 = G(bArr, i14, c0915b);
            if (i11 != c0915b.f60195a) {
                break;
            }
            floatArrayList.addFloat(Float.intBitsToFloat(g(G11, bArr)));
            i14 = G11 + 4;
        }
        return i14;
    }

    static int m(J<?> j11, int i11, byte[] bArr, int i12, int i13, Internal.e<Object> eVar, C0915b c0915b) throws IOException {
        int i14 = (i11 & (-8)) | 4;
        Object newInstance = j11.newInstance();
        int K11 = K(newInstance, j11, bArr, i12, i13, i14, c0915b);
        j11.makeImmutable(newInstance);
        c0915b.f60197c = newInstance;
        eVar.add(newInstance);
        while (K11 < i13) {
            int G11 = G(bArr, K11, c0915b);
            if (i11 != c0915b.f60195a) {
                break;
            }
            Object newInstance2 = j11.newInstance();
            K11 = K(newInstance2, j11, bArr, G11, i13, i14, c0915b);
            j11.makeImmutable(newInstance2);
            c0915b.f60197c = newInstance2;
            eVar.add(newInstance2);
        }
        return K11;
    }

    static <T> int n(J<T> j11, byte[] bArr, int i11, int i12, C0915b c0915b) throws IOException {
        T newInstance = j11.newInstance();
        int L11 = L(newInstance, j11, bArr, i11, i12, c0915b);
        j11.makeImmutable(newInstance);
        c0915b.f60197c = newInstance;
        return L11;
    }

    static int o(J<?> j11, int i11, byte[] bArr, int i12, int i13, Internal.e<?> eVar, C0915b c0915b) throws IOException {
        int n11 = n(j11, bArr, i12, i13, c0915b);
        eVar.add(c0915b.f60197c);
        while (n11 < i13) {
            int G11 = G(bArr, n11, c0915b);
            if (i11 != c0915b.f60195a) {
                break;
            }
            n11 = n(j11, bArr, G11, i13, c0915b);
            eVar.add(c0915b.f60197c);
        }
        return n11;
    }

    static int p(byte[] bArr, int i11, Internal.e<?> eVar, C0915b c0915b) throws InvalidProtocolBufferException {
        BooleanArrayList booleanArrayList = (BooleanArrayList) eVar;
        int G11 = G(bArr, i11, c0915b);
        int i12 = c0915b.f60195a + G11;
        while (G11 < i12) {
            G11 = I(bArr, G11, c0915b);
            booleanArrayList.addBoolean(c0915b.f60196b != 0);
        }
        if (G11 == i12) {
            return G11;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    static int q(byte[] bArr, int i11, Internal.e<?> eVar, C0915b c0915b) throws InvalidProtocolBufferException {
        DoubleArrayList doubleArrayList = (DoubleArrayList) eVar;
        int G11 = G(bArr, i11, c0915b);
        int i12 = c0915b.f60195a;
        int i13 = G11 + i12;
        if (i13 > bArr.length) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        doubleArrayList.ensureCapacity((i12 / 8) + doubleArrayList.size());
        while (G11 < i13) {
            doubleArrayList.addDouble(Double.longBitsToDouble(i(G11, bArr)));
            G11 += 8;
        }
        if (G11 == i13) {
            return G11;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    static int r(byte[] bArr, int i11, Internal.e<?> eVar, C0915b c0915b) throws InvalidProtocolBufferException {
        IntArrayList intArrayList = (IntArrayList) eVar;
        int G11 = G(bArr, i11, c0915b);
        int i12 = c0915b.f60195a;
        int i13 = G11 + i12;
        if (i13 > bArr.length) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        intArrayList.ensureCapacity((i12 / 4) + intArrayList.size());
        while (G11 < i13) {
            intArrayList.addInt(g(G11, bArr));
            G11 += 4;
        }
        if (G11 == i13) {
            return G11;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    static int s(byte[] bArr, int i11, Internal.e<?> eVar, C0915b c0915b) throws InvalidProtocolBufferException {
        LongArrayList longArrayList = (LongArrayList) eVar;
        int G11 = G(bArr, i11, c0915b);
        int i12 = c0915b.f60195a;
        int i13 = G11 + i12;
        if (i13 > bArr.length) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        longArrayList.ensureCapacity((i12 / 8) + longArrayList.size());
        while (G11 < i13) {
            longArrayList.addLong(i(G11, bArr));
            G11 += 8;
        }
        if (G11 == i13) {
            return G11;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    static int t(byte[] bArr, int i11, Internal.e<?> eVar, C0915b c0915b) throws InvalidProtocolBufferException {
        FloatArrayList floatArrayList = (FloatArrayList) eVar;
        int G11 = G(bArr, i11, c0915b);
        int i12 = c0915b.f60195a;
        int i13 = G11 + i12;
        if (i13 > bArr.length) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        floatArrayList.ensureCapacity((i12 / 4) + floatArrayList.size());
        while (G11 < i13) {
            floatArrayList.addFloat(Float.intBitsToFloat(g(G11, bArr)));
            G11 += 4;
        }
        if (G11 == i13) {
            return G11;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    static int u(byte[] bArr, int i11, Internal.e<?> eVar, C0915b c0915b) throws InvalidProtocolBufferException {
        IntArrayList intArrayList = (IntArrayList) eVar;
        int G11 = G(bArr, i11, c0915b);
        int i12 = c0915b.f60195a + G11;
        while (G11 < i12) {
            G11 = G(bArr, G11, c0915b);
            intArrayList.addInt(CodedInputStream.decodeZigZag32(c0915b.f60195a));
        }
        if (G11 == i12) {
            return G11;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    static int v(byte[] bArr, int i11, Internal.e<?> eVar, C0915b c0915b) throws InvalidProtocolBufferException {
        LongArrayList longArrayList = (LongArrayList) eVar;
        int G11 = G(bArr, i11, c0915b);
        int i12 = c0915b.f60195a + G11;
        while (G11 < i12) {
            G11 = I(bArr, G11, c0915b);
            longArrayList.addLong(CodedInputStream.decodeZigZag64(c0915b.f60196b));
        }
        if (G11 == i12) {
            return G11;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    static int w(byte[] bArr, int i11, Internal.e<?> eVar, C0915b c0915b) throws IOException {
        IntArrayList intArrayList = (IntArrayList) eVar;
        int G11 = G(bArr, i11, c0915b);
        int i12 = c0915b.f60195a + G11;
        while (G11 < i12) {
            G11 = G(bArr, G11, c0915b);
            intArrayList.addInt(c0915b.f60195a);
        }
        if (G11 == i12) {
            return G11;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    static int x(byte[] bArr, int i11, Internal.e<?> eVar, C0915b c0915b) throws IOException {
        LongArrayList longArrayList = (LongArrayList) eVar;
        int G11 = G(bArr, i11, c0915b);
        int i12 = c0915b.f60195a + G11;
        while (G11 < i12) {
            G11 = I(bArr, G11, c0915b);
            longArrayList.addLong(c0915b.f60196b);
        }
        if (G11 == i12) {
            return G11;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    static int y(int i11, byte[] bArr, int i12, int i13, Internal.e<?> eVar, C0915b c0915b) {
        IntArrayList intArrayList = (IntArrayList) eVar;
        int G11 = G(bArr, i12, c0915b);
        intArrayList.addInt(CodedInputStream.decodeZigZag32(c0915b.f60195a));
        while (G11 < i13) {
            int G12 = G(bArr, G11, c0915b);
            if (i11 != c0915b.f60195a) {
                break;
            }
            G11 = G(bArr, G12, c0915b);
            intArrayList.addInt(CodedInputStream.decodeZigZag32(c0915b.f60195a));
        }
        return G11;
    }

    static int z(int i11, byte[] bArr, int i12, int i13, Internal.e<?> eVar, C0915b c0915b) {
        LongArrayList longArrayList = (LongArrayList) eVar;
        int I11 = I(bArr, i12, c0915b);
        longArrayList.addLong(CodedInputStream.decodeZigZag64(c0915b.f60196b));
        while (I11 < i13) {
            int G11 = G(bArr, I11, c0915b);
            if (i11 != c0915b.f60195a) {
                break;
            }
            I11 = I(bArr, G11, c0915b);
            longArrayList.addLong(CodedInputStream.decodeZigZag64(c0915b.f60196b));
        }
        return I11;
    }
}

package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.WireFormat;
import java.io.IOException;
import ru.ok.proto.rtmp.amf.AmfConstants;
import xsna.u8e0;

/* compiled from: ArrayDecoders.java */
/* loaded from: classes13.dex */
public final class b {

    /* compiled from: ArrayDecoders.java */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            a = iArr;
            try {
                iArr[WireFormat.FieldType.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[WireFormat.FieldType.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[WireFormat.FieldType.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[WireFormat.FieldType.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[WireFormat.FieldType.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[WireFormat.FieldType.UINT32.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[WireFormat.FieldType.FIXED64.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[WireFormat.FieldType.SFIXED64.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[WireFormat.FieldType.FIXED32.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[WireFormat.FieldType.SFIXED32.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[WireFormat.FieldType.BOOL.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[WireFormat.FieldType.SINT32.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                a[WireFormat.FieldType.SINT64.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                a[WireFormat.FieldType.ENUM.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                a[WireFormat.FieldType.BYTES.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                a[WireFormat.FieldType.STRING.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                a[WireFormat.FieldType.GROUP.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                a[WireFormat.FieldType.MESSAGE.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    /* compiled from: ArrayDecoders.java */
    /* renamed from: com.google.protobuf.b$b, reason: collision with other inner class name */
    public static final class C0151b {
        public int a;
        public long b;
        public Object c;
        public final ExtensionRegistryLite d;
        public int e;

        public C0151b(ExtensionRegistryLite extensionRegistryLite) {
            extensionRegistryLite.getClass();
            this.d = extensionRegistryLite;
        }
    }

    public static int A(int i, byte[] bArr, int i2, int i3, Internal.ProtobufList<?> protobufList, C0151b c0151b) {
        l lVar = (l) protobufList;
        int J = J(bArr, i2, c0151b);
        lVar.addLong(CodedInputStream.decodeZigZag64(c0151b.b));
        while (J < i3) {
            int H = H(bArr, J, c0151b);
            if (i != c0151b.a) {
                break;
            }
            J = J(bArr, H, c0151b);
            lVar.addLong(CodedInputStream.decodeZigZag64(c0151b.b));
        }
        return J;
    }

    public static int B(byte[] bArr, int i, C0151b c0151b) throws InvalidProtocolBufferException {
        int H = H(bArr, i, c0151b);
        int i2 = c0151b.a;
        if (i2 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        if (i2 == 0) {
            c0151b.c = "";
            return H;
        }
        c0151b.c = new String(bArr, H, i2, Internal.UTF_8);
        return H + i2;
    }

    public static int C(int i, byte[] bArr, int i2, int i3, Internal.ProtobufList<?> protobufList, C0151b c0151b) throws InvalidProtocolBufferException {
        int H = H(bArr, i2, c0151b);
        int i4 = c0151b.a;
        if (i4 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        if (i4 == 0) {
            protobufList.add("");
        } else {
            protobufList.add(new String(bArr, H, i4, Internal.UTF_8));
            H += i4;
        }
        while (H < i3) {
            int H2 = H(bArr, H, c0151b);
            if (i != c0151b.a) {
                break;
            }
            H = H(bArr, H2, c0151b);
            int i5 = c0151b.a;
            if (i5 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            if (i5 == 0) {
                protobufList.add("");
            } else {
                protobufList.add(new String(bArr, H, i5, Internal.UTF_8));
                H += i5;
            }
        }
        return H;
    }

    public static int D(int i, byte[] bArr, int i2, int i3, Internal.ProtobufList<?> protobufList, C0151b c0151b) throws InvalidProtocolBufferException {
        int H = H(bArr, i2, c0151b);
        int i4 = c0151b.a;
        if (i4 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        if (i4 == 0) {
            protobufList.add("");
        } else {
            int i5 = H + i4;
            if (!b0.a.c(H, i5, bArr)) {
                throw InvalidProtocolBufferException.invalidUtf8();
            }
            protobufList.add(new String(bArr, H, i4, Internal.UTF_8));
            H = i5;
        }
        while (H < i3) {
            int H2 = H(bArr, H, c0151b);
            if (i != c0151b.a) {
                break;
            }
            H = H(bArr, H2, c0151b);
            int i6 = c0151b.a;
            if (i6 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            if (i6 == 0) {
                protobufList.add("");
            } else {
                int i7 = H + i6;
                if (!b0.a.c(H, i7, bArr)) {
                    throw InvalidProtocolBufferException.invalidUtf8();
                }
                protobufList.add(new String(bArr, H, i6, Internal.UTF_8));
                H = i7;
            }
        }
        return H;
    }

    public static int E(byte[] bArr, int i, C0151b c0151b) throws InvalidProtocolBufferException {
        int H = H(bArr, i, c0151b);
        int i2 = c0151b.a;
        if (i2 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        if (i2 == 0) {
            c0151b.c = "";
            return H;
        }
        c0151b.c = b0.a.h(H, i2, bArr);
        return H + i2;
    }

    public static int F(int i, byte[] bArr, int i2, int i3, UnknownFieldSetLite unknownFieldSetLite, C0151b c0151b) throws InvalidProtocolBufferException {
        if (WireFormat.getTagFieldNumber(i) == 0) {
            throw InvalidProtocolBufferException.invalidTag();
        }
        int tagWireType = WireFormat.getTagWireType(i);
        if (tagWireType == 0) {
            int J = J(bArr, i2, c0151b);
            unknownFieldSetLite.storeField(i, Long.valueOf(c0151b.b));
            return J;
        }
        if (tagWireType == 1) {
            unknownFieldSetLite.storeField(i, Long.valueOf(i(i2, bArr)));
            return i2 + 8;
        }
        if (tagWireType == 2) {
            int H = H(bArr, i2, c0151b);
            int i4 = c0151b.a;
            if (i4 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            if (i4 > bArr.length - H) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            if (i4 == 0) {
                unknownFieldSetLite.storeField(i, ByteString.EMPTY);
            } else {
                unknownFieldSetLite.storeField(i, ByteString.copyFrom(bArr, H, i4));
            }
            return H + i4;
        }
        if (tagWireType != 3) {
            if (tagWireType != 5) {
                throw InvalidProtocolBufferException.invalidTag();
            }
            unknownFieldSetLite.storeField(i, Integer.valueOf(g(i2, bArr)));
            return i2 + 4;
        }
        UnknownFieldSetLite newInstance = UnknownFieldSetLite.newInstance();
        int i5 = (i & (-8)) | 4;
        int i6 = c0151b.e + 1;
        c0151b.e = i6;
        if (i6 >= 100) {
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }
        int i7 = 0;
        while (true) {
            if (i2 >= i3) {
                break;
            }
            int H2 = H(bArr, i2, c0151b);
            i7 = c0151b.a;
            if (i7 == i5) {
                i2 = H2;
                break;
            }
            i2 = F(i7, bArr, H2, i3, newInstance, c0151b);
        }
        c0151b.e--;
        if (i2 > i3 || i7 != i5) {
            throw InvalidProtocolBufferException.parseFailure();
        }
        unknownFieldSetLite.storeField(i, newInstance);
        return i2;
    }

    public static int G(int i, byte[] bArr, int i2, C0151b c0151b) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            c0151b.a = i3 | (b << 7);
            return i4;
        }
        int i5 = i3 | ((b & Byte.MAX_VALUE) << 7);
        int i6 = i2 + 2;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            c0151b.a = i5 | (b2 << AmfConstants.TYPE_RECORDSET_MARKER);
            return i6;
        }
        int i7 = i5 | ((b2 & Byte.MAX_VALUE) << 14);
        int i8 = i2 + 3;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            c0151b.a = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & Byte.MAX_VALUE) << 21);
        int i10 = i2 + 4;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            c0151b.a = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                c0151b.a = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    public static int H(byte[] bArr, int i, C0151b c0151b) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return G(b, bArr, i2, c0151b);
        }
        c0151b.a = b;
        return i2;
    }

    public static int I(int i, byte[] bArr, int i2, int i3, Internal.ProtobufList<?> protobufList, C0151b c0151b) {
        j jVar = (j) protobufList;
        int H = H(bArr, i2, c0151b);
        jVar.addInt(c0151b.a);
        while (H < i3) {
            int H2 = H(bArr, H, c0151b);
            if (i != c0151b.a) {
                break;
            }
            H = H(bArr, H2, c0151b);
            jVar.addInt(c0151b.a);
        }
        return H;
    }

    public static int J(byte[] bArr, int i, C0151b c0151b) {
        int i2 = i + 1;
        long j = bArr[i];
        if (j >= 0) {
            c0151b.b = j;
            return i2;
        }
        int i3 = i + 2;
        byte b = bArr[i2];
        long j2 = (j & 127) | ((b & Byte.MAX_VALUE) << 7);
        int i4 = 7;
        while (b < 0) {
            int i5 = i3 + 1;
            i4 += 7;
            j2 |= (r10 & Byte.MAX_VALUE) << i4;
            b = bArr[i3];
            i3 = i5;
        }
        c0151b.b = j2;
        return i3;
    }

    public static int K(int i, byte[] bArr, int i2, int i3, Internal.ProtobufList<?> protobufList, C0151b c0151b) {
        l lVar = (l) protobufList;
        int J = J(bArr, i2, c0151b);
        lVar.addLong(c0151b.b);
        while (J < i3) {
            int H = H(bArr, J, c0151b);
            if (i != c0151b.a) {
                break;
            }
            J = J(bArr, H, c0151b);
            lVar.addLong(c0151b.b);
        }
        return J;
    }

    public static int L(Object obj, v vVar, byte[] bArr, int i, int i2, int i3, C0151b c0151b) throws IOException {
        p pVar = (p) vVar;
        int i4 = c0151b.e + 1;
        c0151b.e = i4;
        if (i4 >= 100) {
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }
        int H = pVar.H(obj, bArr, i, i2, i3, c0151b);
        c0151b.e--;
        c0151b.c = obj;
        return H;
    }

    public static int M(Object obj, v vVar, byte[] bArr, int i, int i2, C0151b c0151b) throws IOException {
        int i3 = i + 1;
        int i4 = bArr[i];
        if (i4 < 0) {
            i3 = G(i4, bArr, i3, c0151b);
            i4 = c0151b.a;
        }
        int i5 = i3;
        if (i4 < 0 || i4 > i2 - i5) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        int i6 = c0151b.e + 1;
        c0151b.e = i6;
        if (i6 >= 100) {
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }
        int i7 = i5 + i4;
        vVar.h(obj, bArr, i5, i7, c0151b);
        c0151b.e--;
        c0151b.c = obj;
        return i7;
    }

    public static int N(int i, byte[] bArr, int i2, int i3, C0151b c0151b) throws InvalidProtocolBufferException {
        if (WireFormat.getTagFieldNumber(i) == 0) {
            throw InvalidProtocolBufferException.invalidTag();
        }
        int tagWireType = WireFormat.getTagWireType(i);
        if (tagWireType == 0) {
            return J(bArr, i2, c0151b);
        }
        if (tagWireType == 1) {
            return i2 + 8;
        }
        if (tagWireType == 2) {
            return H(bArr, i2, c0151b) + c0151b.a;
        }
        if (tagWireType != 3) {
            if (tagWireType == 5) {
                return i2 + 4;
            }
            throw InvalidProtocolBufferException.invalidTag();
        }
        int i4 = (i & (-8)) | 4;
        int i5 = 0;
        while (i2 < i3) {
            i2 = H(bArr, i2, c0151b);
            i5 = c0151b.a;
            if (i5 == i4) {
                break;
            }
            i2 = N(i5, bArr, i2, i3, c0151b);
        }
        if (i2 > i3 || i5 != i4) {
            throw InvalidProtocolBufferException.parseFailure();
        }
        return i2;
    }

    public static int a(int i, byte[] bArr, int i2, int i3, Internal.ProtobufList<?> protobufList, C0151b c0151b) {
        c cVar = (c) protobufList;
        int J = J(bArr, i2, c0151b);
        cVar.addBoolean(c0151b.b != 0);
        while (J < i3) {
            int H = H(bArr, J, c0151b);
            if (i != c0151b.a) {
                break;
            }
            J = J(bArr, H, c0151b);
            cVar.addBoolean(c0151b.b != 0);
        }
        return J;
    }

    public static int b(byte[] bArr, int i, C0151b c0151b) throws InvalidProtocolBufferException {
        int H = H(bArr, i, c0151b);
        int i2 = c0151b.a;
        if (i2 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        if (i2 > bArr.length - H) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        if (i2 == 0) {
            c0151b.c = ByteString.EMPTY;
            return H;
        }
        c0151b.c = ByteString.copyFrom(bArr, H, i2);
        return H + i2;
    }

    public static int c(int i, byte[] bArr, int i2, int i3, Internal.ProtobufList<?> protobufList, C0151b c0151b) throws InvalidProtocolBufferException {
        int H = H(bArr, i2, c0151b);
        int i4 = c0151b.a;
        if (i4 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        if (i4 > bArr.length - H) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        if (i4 == 0) {
            protobufList.add(ByteString.EMPTY);
        } else {
            protobufList.add(ByteString.copyFrom(bArr, H, i4));
            H += i4;
        }
        while (H < i3) {
            int H2 = H(bArr, H, c0151b);
            if (i != c0151b.a) {
                break;
            }
            H = H(bArr, H2, c0151b);
            int i5 = c0151b.a;
            if (i5 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            if (i5 > bArr.length - H) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            if (i5 == 0) {
                protobufList.add(ByteString.EMPTY);
            } else {
                protobufList.add(ByteString.copyFrom(bArr, H, i5));
                H += i5;
            }
        }
        return H;
    }

    public static double d(int i, byte[] bArr) {
        return Double.longBitsToDouble(i(i, bArr));
    }

    public static int e(int i, byte[] bArr, int i2, int i3, Internal.ProtobufList<?> protobufList, C0151b c0151b) {
        f fVar = (f) protobufList;
        fVar.addDouble(d(i2, bArr));
        int i4 = i2 + 8;
        while (i4 < i3) {
            int H = H(bArr, i4, c0151b);
            if (i != c0151b.a) {
                break;
            }
            fVar.addDouble(Double.longBitsToDouble(i(H, bArr)));
            i4 = H + 8;
        }
        return i4;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int f(int i, byte[] bArr, int i2, int i3, Object obj, MessageLite messageLite, z<UnknownFieldSetLite, UnknownFieldSetLite> zVar, C0151b c0151b) throws IOException {
        int i4;
        int i5;
        GeneratedMessageLite.GeneratedExtension findLiteExtensionByNumber = c0151b.d.findLiteExtensionByNumber(messageLite, i >>> 3);
        if (findLiteExtensionByNumber == null) {
            return F(i, bArr, i2, i3, p.r(obj), c0151b);
        }
        GeneratedMessageLite.ExtendableMessage extendableMessage = (GeneratedMessageLite.ExtendableMessage) obj;
        extendableMessage.ensureExtensionsAreMutable();
        FieldSet<GeneratedMessageLite.b> fieldSet = extendableMessage.extensions;
        int i6 = i >>> 3;
        GeneratedMessageLite.b bVar = findLiteExtensionByNumber.descriptor;
        if (bVar.e && bVar.f) {
            switch (a.a[findLiteExtensionByNumber.getLiteType().ordinal()]) {
                case 1:
                    f fVar = new f();
                    int r = r(bArr, i2, fVar, c0151b);
                    fieldSet.y(findLiteExtensionByNumber.descriptor, fVar);
                    return r;
                case 2:
                    i iVar = new i();
                    int u = u(bArr, i2, iVar, c0151b);
                    fieldSet.y(findLiteExtensionByNumber.descriptor, iVar);
                    return u;
                case 3:
                case 4:
                    l lVar = new l();
                    int y = y(bArr, i2, lVar, c0151b);
                    fieldSet.y(findLiteExtensionByNumber.descriptor, lVar);
                    return y;
                case 5:
                case 6:
                    j jVar = new j();
                    int x = x(bArr, i2, jVar, c0151b);
                    fieldSet.y(findLiteExtensionByNumber.descriptor, jVar);
                    return x;
                case 7:
                case 8:
                    l lVar2 = new l();
                    int t = t(bArr, i2, lVar2, c0151b);
                    fieldSet.y(findLiteExtensionByNumber.descriptor, lVar2);
                    return t;
                case 9:
                case 10:
                    j jVar2 = new j();
                    int s = s(bArr, i2, jVar2, c0151b);
                    fieldSet.y(findLiteExtensionByNumber.descriptor, jVar2);
                    return s;
                case 11:
                    c cVar = new c();
                    int q = q(bArr, i2, cVar, c0151b);
                    fieldSet.y(findLiteExtensionByNumber.descriptor, cVar);
                    return q;
                case 12:
                    j jVar3 = new j();
                    int v = v(bArr, i2, jVar3, c0151b);
                    fieldSet.y(findLiteExtensionByNumber.descriptor, jVar3);
                    return v;
                case 13:
                    l lVar3 = new l();
                    int w = w(bArr, i2, lVar3, c0151b);
                    fieldSet.y(findLiteExtensionByNumber.descriptor, lVar3);
                    return w;
                case 14:
                    j jVar4 = new j();
                    int x2 = x(bArr, i2, jVar4, c0151b);
                    w.j(extendableMessage, i6, jVar4, findLiteExtensionByNumber.descriptor.b, null, zVar);
                    fieldSet.y(findLiteExtensionByNumber.descriptor, jVar4);
                    return x2;
                default:
                    throw new IllegalStateException("Type cannot be packed: " + findLiteExtensionByNumber.descriptor.d);
            }
        }
        int i7 = i2;
        Object obj2 = null;
        if (findLiteExtensionByNumber.getLiteType() == WireFormat.FieldType.ENUM) {
            i7 = H(bArr, i7, c0151b);
            if (findLiteExtensionByNumber.descriptor.b.findValueByNumber(c0151b.a) == null) {
                w.m(extendableMessage, i6, c0151b.a, null, zVar);
                return i7;
            }
            obj2 = Integer.valueOf(c0151b.a);
        } else {
            switch (a.a[findLiteExtensionByNumber.getLiteType().ordinal()]) {
                case 1:
                    i4 = i7;
                    obj2 = Double.valueOf(d(i4, bArr));
                    i7 = i4 + 8;
                    break;
                case 2:
                    i5 = i7;
                    obj2 = Float.valueOf(k(i5, bArr));
                    i7 = i5 + 4;
                    break;
                case 3:
                case 4:
                    i7 = J(bArr, i7, c0151b);
                    obj2 = Long.valueOf(c0151b.b);
                    break;
                case 5:
                case 6:
                    i7 = H(bArr, i7, c0151b);
                    obj2 = Integer.valueOf(c0151b.a);
                    break;
                case 7:
                case 8:
                    i4 = i7;
                    obj2 = Long.valueOf(i(i4, bArr));
                    i7 = i4 + 8;
                    break;
                case 9:
                case 10:
                    i5 = i7;
                    obj2 = Integer.valueOf(g(i5, bArr));
                    i7 = i5 + 4;
                    break;
                case 11:
                    i7 = J(bArr, i7, c0151b);
                    obj2 = Boolean.valueOf(c0151b.b != 0);
                    break;
                case 12:
                    i7 = H(bArr, i7, c0151b);
                    obj2 = Integer.valueOf(CodedInputStream.decodeZigZag32(c0151b.a));
                    break;
                case 13:
                    i7 = J(bArr, i7, c0151b);
                    obj2 = Long.valueOf(CodedInputStream.decodeZigZag64(c0151b.b));
                    break;
                case 14:
                    throw new IllegalStateException("Shouldn't reach here.");
                case 15:
                    i7 = b(bArr, i7, c0151b);
                    obj2 = c0151b.c;
                    break;
                case 16:
                    i7 = B(bArr, i7, c0151b);
                    obj2 = c0151b.c;
                    break;
                case 17:
                    int i8 = (i6 << 3) | 4;
                    v a2 = u8e0.c.a(findLiteExtensionByNumber.getMessageDefaultInstance().getClass());
                    if (findLiteExtensionByNumber.isRepeated()) {
                        int m = m(a2, bArr, i7, i3, i8, c0151b);
                        fieldSet.a(findLiteExtensionByNumber.descriptor, c0151b.c);
                        return m;
                    }
                    Object h = fieldSet.h(findLiteExtensionByNumber.descriptor);
                    if (h == null) {
                        h = a2.b();
                        fieldSet.y(findLiteExtensionByNumber.descriptor, h);
                    }
                    return L(h, a2, bArr, i7, i3, i8, c0151b);
                case 18:
                    v a3 = u8e0.c.a(findLiteExtensionByNumber.getMessageDefaultInstance().getClass());
                    if (findLiteExtensionByNumber.isRepeated()) {
                        int o = o(a3, bArr, i7, i3, c0151b);
                        fieldSet.a(findLiteExtensionByNumber.descriptor, c0151b.c);
                        return o;
                    }
                    Object h2 = fieldSet.h(findLiteExtensionByNumber.descriptor);
                    if (h2 == null) {
                        h2 = a3.b();
                        fieldSet.y(findLiteExtensionByNumber.descriptor, h2);
                    }
                    return M(h2, a3, bArr, i7, i3, c0151b);
            }
        }
        if (findLiteExtensionByNumber.isRepeated()) {
            fieldSet.a(findLiteExtensionByNumber.descriptor, obj2);
            return i7;
        }
        fieldSet.y(findLiteExtensionByNumber.descriptor, obj2);
        return i7;
    }

    public static int g(int i, byte[] bArr) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public static int h(int i, byte[] bArr, int i2, int i3, Internal.ProtobufList<?> protobufList, C0151b c0151b) {
        j jVar = (j) protobufList;
        jVar.addInt(g(i2, bArr));
        int i4 = i2 + 4;
        while (i4 < i3) {
            int H = H(bArr, i4, c0151b);
            if (i != c0151b.a) {
                break;
            }
            jVar.addInt(g(H, bArr));
            i4 = H + 4;
        }
        return i4;
    }

    public static long i(int i, byte[] bArr) {
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    public static int j(int i, byte[] bArr, int i2, int i3, Internal.ProtobufList<?> protobufList, C0151b c0151b) {
        l lVar = (l) protobufList;
        lVar.addLong(i(i2, bArr));
        int i4 = i2 + 8;
        while (i4 < i3) {
            int H = H(bArr, i4, c0151b);
            if (i != c0151b.a) {
                break;
            }
            lVar.addLong(i(H, bArr));
            i4 = H + 8;
        }
        return i4;
    }

    public static float k(int i, byte[] bArr) {
        return Float.intBitsToFloat(g(i, bArr));
    }

    public static int l(int i, byte[] bArr, int i2, int i3, Internal.ProtobufList<?> protobufList, C0151b c0151b) {
        i iVar = (i) protobufList;
        iVar.addFloat(k(i2, bArr));
        int i4 = i2 + 4;
        while (i4 < i3) {
            int H = H(bArr, i4, c0151b);
            if (i != c0151b.a) {
                break;
            }
            iVar.addFloat(Float.intBitsToFloat(g(H, bArr)));
            i4 = H + 4;
        }
        return i4;
    }

    public static int m(v vVar, byte[] bArr, int i, int i2, int i3, C0151b c0151b) throws IOException {
        Object b = vVar.b();
        int L = L(b, vVar, bArr, i, i2, i3, c0151b);
        vVar.d(b);
        c0151b.c = b;
        return L;
    }

    public static int n(v vVar, int i, byte[] bArr, int i2, int i3, Internal.ProtobufList<?> protobufList, C0151b c0151b) throws IOException {
        int i4 = (i & (-8)) | 4;
        int m = m(vVar, bArr, i2, i3, i4, c0151b);
        protobufList.add(c0151b.c);
        while (m < i3) {
            int H = H(bArr, m, c0151b);
            if (i != c0151b.a) {
                break;
            }
            m = m(vVar, bArr, H, i3, i4, c0151b);
            protobufList.add(c0151b.c);
        }
        return m;
    }

    public static int o(v vVar, byte[] bArr, int i, int i2, C0151b c0151b) throws IOException {
        Object b = vVar.b();
        int M = M(b, vVar, bArr, i, i2, c0151b);
        vVar.d(b);
        c0151b.c = b;
        return M;
    }

    public static int p(v<?> vVar, int i, byte[] bArr, int i2, int i3, Internal.ProtobufList<?> protobufList, C0151b c0151b) throws IOException {
        int o = o(vVar, bArr, i2, i3, c0151b);
        protobufList.add(c0151b.c);
        while (o < i3) {
            int H = H(bArr, o, c0151b);
            if (i != c0151b.a) {
                break;
            }
            o = o(vVar, bArr, H, i3, c0151b);
            protobufList.add(c0151b.c);
        }
        return o;
    }

    public static int q(byte[] bArr, int i, Internal.ProtobufList<?> protobufList, C0151b c0151b) throws IOException {
        c cVar = (c) protobufList;
        int H = H(bArr, i, c0151b);
        int i2 = c0151b.a + H;
        while (H < i2) {
            H = J(bArr, H, c0151b);
            cVar.addBoolean(c0151b.b != 0);
        }
        if (H == i2) {
            return H;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int r(byte[] bArr, int i, Internal.ProtobufList<?> protobufList, C0151b c0151b) throws IOException {
        f fVar = (f) protobufList;
        int H = H(bArr, i, c0151b);
        int i2 = c0151b.a + H;
        while (H < i2) {
            fVar.addDouble(Double.longBitsToDouble(i(H, bArr)));
            H += 8;
        }
        if (H == i2) {
            return H;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int s(byte[] bArr, int i, Internal.ProtobufList<?> protobufList, C0151b c0151b) throws IOException {
        j jVar = (j) protobufList;
        int H = H(bArr, i, c0151b);
        int i2 = c0151b.a + H;
        while (H < i2) {
            jVar.addInt(g(H, bArr));
            H += 4;
        }
        if (H == i2) {
            return H;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int t(byte[] bArr, int i, Internal.ProtobufList<?> protobufList, C0151b c0151b) throws IOException {
        l lVar = (l) protobufList;
        int H = H(bArr, i, c0151b);
        int i2 = c0151b.a + H;
        while (H < i2) {
            lVar.addLong(i(H, bArr));
            H += 8;
        }
        if (H == i2) {
            return H;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int u(byte[] bArr, int i, Internal.ProtobufList<?> protobufList, C0151b c0151b) throws IOException {
        i iVar = (i) protobufList;
        int H = H(bArr, i, c0151b);
        int i2 = c0151b.a + H;
        while (H < i2) {
            iVar.addFloat(Float.intBitsToFloat(g(H, bArr)));
            H += 4;
        }
        if (H == i2) {
            return H;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int v(byte[] bArr, int i, Internal.ProtobufList<?> protobufList, C0151b c0151b) throws IOException {
        j jVar = (j) protobufList;
        int H = H(bArr, i, c0151b);
        int i2 = c0151b.a + H;
        while (H < i2) {
            H = H(bArr, H, c0151b);
            jVar.addInt(CodedInputStream.decodeZigZag32(c0151b.a));
        }
        if (H == i2) {
            return H;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int w(byte[] bArr, int i, Internal.ProtobufList<?> protobufList, C0151b c0151b) throws IOException {
        l lVar = (l) protobufList;
        int H = H(bArr, i, c0151b);
        int i2 = c0151b.a + H;
        while (H < i2) {
            H = J(bArr, H, c0151b);
            lVar.addLong(CodedInputStream.decodeZigZag64(c0151b.b));
        }
        if (H == i2) {
            return H;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int x(byte[] bArr, int i, Internal.ProtobufList<?> protobufList, C0151b c0151b) throws IOException {
        j jVar = (j) protobufList;
        int H = H(bArr, i, c0151b);
        int i2 = c0151b.a + H;
        while (H < i2) {
            H = H(bArr, H, c0151b);
            jVar.addInt(c0151b.a);
        }
        if (H == i2) {
            return H;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int y(byte[] bArr, int i, Internal.ProtobufList<?> protobufList, C0151b c0151b) throws IOException {
        l lVar = (l) protobufList;
        int H = H(bArr, i, c0151b);
        int i2 = c0151b.a + H;
        while (H < i2) {
            H = J(bArr, H, c0151b);
            lVar.addLong(c0151b.b);
        }
        if (H == i2) {
            return H;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int z(int i, byte[] bArr, int i2, int i3, Internal.ProtobufList<?> protobufList, C0151b c0151b) {
        j jVar = (j) protobufList;
        int H = H(bArr, i2, c0151b);
        jVar.addInt(CodedInputStream.decodeZigZag32(c0151b.a));
        while (H < i3) {
            int H2 = H(bArr, H, c0151b);
            if (i != c0151b.a) {
                break;
            }
            H = H(bArr, H2, c0151b);
            jVar.addInt(CodedInputStream.decodeZigZag32(c0151b.a));
        }
        return H;
    }
}

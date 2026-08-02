package com.google.protobuf;

import com.google.protobuf.Internal;
import com.inmobi.media.core.config.models.AdConfig;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.tg0;
import defpackage.vsg;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class f {
    public static int a(byte[] bArr, int i, tg0 tg0Var) {
        int r = r(bArr, i, tg0Var);
        int i2 = tg0Var.a;
        if (i2 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        if (i2 > bArr.length - r) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        if (i2 == 0) {
            tg0Var.c = ByteString.EMPTY;
            return r;
        }
        tg0Var.c = ByteString.copyFrom(bArr, r, i2);
        return r + i2;
    }

    public static int b(int i, byte[] bArr) {
        return ((bArr[i + 3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | (bArr[i] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((bArr[i + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | ((bArr[i + 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16);
    }

    public static long c(int i, byte[] bArr) {
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    public static int d(vsg vsgVar, byte[] bArr, int i, int i2, int i3, tg0 tg0Var) {
        Object d = vsgVar.d();
        int u = u(d, vsgVar, bArr, i, i2, i3, tg0Var);
        vsgVar.b(d);
        tg0Var.c = d;
        return u;
    }

    public static int e(vsg vsgVar, byte[] bArr, int i, int i2, tg0 tg0Var) {
        Object d = vsgVar.d();
        int v = v(d, vsgVar, bArr, i, i2, tg0Var);
        vsgVar.b(d);
        tg0Var.c = d;
        return v;
    }

    public static int f(vsg vsgVar, int i, byte[] bArr, int i2, int i3, Internal.ProtobufList protobufList, tg0 tg0Var) {
        int e = e(vsgVar, bArr, i2, i3, tg0Var);
        protobufList.add(tg0Var.c);
        while (e < i3) {
            int r = r(bArr, e, tg0Var);
            if (i != tg0Var.a) {
                break;
            }
            e = e(vsgVar, bArr, r, i3, tg0Var);
            protobufList.add(tg0Var.c);
        }
        return e;
    }

    public static int g(byte[] bArr, int i, Internal.ProtobufList protobufList, tg0 tg0Var) {
        h hVar = (h) protobufList;
        int r = r(bArr, i, tg0Var);
        int i2 = tg0Var.a + r;
        while (r < i2) {
            r = t(bArr, r, tg0Var);
            hVar.addBoolean(tg0Var.b != 0);
        }
        if (r == i2) {
            return r;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int h(byte[] bArr, int i, Internal.ProtobufList protobufList, tg0 tg0Var) {
        n0 n0Var = (n0) protobufList;
        int r = r(bArr, i, tg0Var);
        int i2 = tg0Var.a + r;
        while (r < i2) {
            n0Var.addDouble(Double.longBitsToDouble(c(r, bArr)));
            r += 8;
        }
        if (r == i2) {
            return r;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int i(byte[] bArr, int i, Internal.ProtobufList protobufList, tg0 tg0Var) {
        k1 k1Var = (k1) protobufList;
        int r = r(bArr, i, tg0Var);
        int i2 = tg0Var.a + r;
        while (r < i2) {
            k1Var.addInt(b(r, bArr));
            r += 4;
        }
        if (r == i2) {
            return r;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int j(byte[] bArr, int i, Internal.ProtobufList protobufList, tg0 tg0Var) {
        t1 t1Var = (t1) protobufList;
        int r = r(bArr, i, tg0Var);
        int i2 = tg0Var.a + r;
        while (r < i2) {
            t1Var.addLong(c(r, bArr));
            r += 8;
        }
        if (r == i2) {
            return r;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int k(byte[] bArr, int i, Internal.ProtobufList protobufList, tg0 tg0Var) {
        e1 e1Var = (e1) protobufList;
        int r = r(bArr, i, tg0Var);
        int i2 = tg0Var.a + r;
        while (r < i2) {
            e1Var.addFloat(Float.intBitsToFloat(b(r, bArr)));
            r += 4;
        }
        if (r == i2) {
            return r;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int l(byte[] bArr, int i, Internal.ProtobufList protobufList, tg0 tg0Var) {
        k1 k1Var = (k1) protobufList;
        int r = r(bArr, i, tg0Var);
        int i2 = tg0Var.a + r;
        while (r < i2) {
            r = r(bArr, r, tg0Var);
            k1Var.addInt(CodedInputStream.decodeZigZag32(tg0Var.a));
        }
        if (r == i2) {
            return r;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int m(byte[] bArr, int i, Internal.ProtobufList protobufList, tg0 tg0Var) {
        t1 t1Var = (t1) protobufList;
        int r = r(bArr, i, tg0Var);
        int i2 = tg0Var.a + r;
        while (r < i2) {
            r = t(bArr, r, tg0Var);
            t1Var.addLong(CodedInputStream.decodeZigZag64(tg0Var.b));
        }
        if (r == i2) {
            return r;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int n(byte[] bArr, int i, Internal.ProtobufList protobufList, tg0 tg0Var) {
        k1 k1Var = (k1) protobufList;
        int r = r(bArr, i, tg0Var);
        int i2 = tg0Var.a + r;
        while (r < i2) {
            r = r(bArr, r, tg0Var);
            k1Var.addInt(tg0Var.a);
        }
        if (r == i2) {
            return r;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int o(byte[] bArr, int i, tg0 tg0Var) {
        int r = r(bArr, i, tg0Var);
        int i2 = tg0Var.a;
        if (i2 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        if (i2 == 0) {
            tg0Var.c = "";
            return r;
        }
        tg0Var.c = new String(bArr, r, i2, Internal.UTF_8);
        return r + i2;
    }

    public static int p(int i, byte[] bArr, int i2, int i3, UnknownFieldSetLite unknownFieldSetLite, tg0 tg0Var) {
        if (WireFormat.getTagFieldNumber(i) == 0) {
            throw InvalidProtocolBufferException.invalidTag();
        }
        int tagWireType = WireFormat.getTagWireType(i);
        if (tagWireType == 0) {
            int t = t(bArr, i2, tg0Var);
            unknownFieldSetLite.storeField(i, Long.valueOf(tg0Var.b));
            return t;
        }
        if (tagWireType == 1) {
            unknownFieldSetLite.storeField(i, Long.valueOf(c(i2, bArr)));
            return i2 + 8;
        }
        if (tagWireType == 2) {
            int r = r(bArr, i2, tg0Var);
            int i4 = tg0Var.a;
            if (i4 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            if (i4 > bArr.length - r) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            if (i4 == 0) {
                unknownFieldSetLite.storeField(i, ByteString.EMPTY);
            } else {
                unknownFieldSetLite.storeField(i, ByteString.copyFrom(bArr, r, i4));
            }
            return r + i4;
        }
        if (tagWireType != 3) {
            if (tagWireType != 5) {
                throw InvalidProtocolBufferException.invalidTag();
            }
            unknownFieldSetLite.storeField(i, Integer.valueOf(b(i2, bArr)));
            return i2 + 4;
        }
        UnknownFieldSetLite newInstance = UnknownFieldSetLite.newInstance();
        int i5 = (i & (-8)) | 4;
        int i6 = tg0Var.d + 1;
        tg0Var.d = i6;
        if (i6 >= 100) {
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }
        int i7 = 0;
        while (true) {
            if (i2 >= i3) {
                break;
            }
            int r2 = r(bArr, i2, tg0Var);
            i7 = tg0Var.a;
            if (i7 == i5) {
                i2 = r2;
                break;
            }
            i2 = p(i7, bArr, r2, i3, newInstance, tg0Var);
        }
        tg0Var.d--;
        if (i2 > i3 || i7 != i5) {
            throw InvalidProtocolBufferException.parseFailure();
        }
        unknownFieldSetLite.storeField(i, newInstance);
        return i2;
    }

    public static int q(int i, byte[] bArr, int i2, tg0 tg0Var) {
        int i3 = i & Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            tg0Var.a = i3 | (b << 7);
            return i4;
        }
        int i5 = i3 | ((b & Byte.MAX_VALUE) << 7);
        int i6 = i2 + 2;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            tg0Var.a = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & Byte.MAX_VALUE) << 14);
        int i8 = i2 + 3;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            tg0Var.a = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & Byte.MAX_VALUE) << 21);
        int i10 = i2 + 4;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            tg0Var.a = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                tg0Var.a = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    public static int r(byte[] bArr, int i, tg0 tg0Var) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return q(b, bArr, i2, tg0Var);
        }
        tg0Var.a = b;
        return i2;
    }

    public static int s(int i, byte[] bArr, int i2, int i3, Internal.ProtobufList protobufList, tg0 tg0Var) {
        k1 k1Var = (k1) protobufList;
        int r = r(bArr, i2, tg0Var);
        k1Var.addInt(tg0Var.a);
        while (r < i3) {
            int r2 = r(bArr, r, tg0Var);
            if (i != tg0Var.a) {
                break;
            }
            r = r(bArr, r2, tg0Var);
            k1Var.addInt(tg0Var.a);
        }
        return r;
    }

    public static int t(byte[] bArr, int i, tg0 tg0Var) {
        int i2 = i + 1;
        long j = bArr[i];
        if (j >= 0) {
            tg0Var.b = j;
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
        tg0Var.b = j2;
        return i3;
    }

    public static int u(Object obj, vsg vsgVar, byte[] bArr, int i, int i2, int i3, tg0 tg0Var) {
        y1 y1Var = (y1) vsgVar;
        int i4 = tg0Var.d + 1;
        tg0Var.d = i4;
        if (i4 >= 100) {
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }
        int F = y1Var.F(obj, bArr, i, i2, i3, tg0Var);
        tg0Var.d--;
        tg0Var.c = obj;
        return F;
    }

    public static int v(Object obj, vsg vsgVar, byte[] bArr, int i, int i2, tg0 tg0Var) {
        int i3 = i + 1;
        int i4 = bArr[i];
        if (i4 < 0) {
            i3 = q(i4, bArr, i3, tg0Var);
            i4 = tg0Var.a;
        }
        int i5 = i3;
        if (i4 < 0 || i4 > i2 - i5) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        int i6 = tg0Var.d + 1;
        tg0Var.d = i6;
        if (i6 >= 100) {
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }
        int i7 = i5 + i4;
        vsgVar.j(obj, bArr, i5, i7, tg0Var);
        tg0Var.d--;
        tg0Var.c = obj;
        return i7;
    }

    public static int w(int i, byte[] bArr, int i2, int i3, tg0 tg0Var) {
        if (WireFormat.getTagFieldNumber(i) == 0) {
            throw InvalidProtocolBufferException.invalidTag();
        }
        int tagWireType = WireFormat.getTagWireType(i);
        if (tagWireType == 0) {
            return t(bArr, i2, tg0Var);
        }
        if (tagWireType == 1) {
            return i2 + 8;
        }
        if (tagWireType == 2) {
            return r(bArr, i2, tg0Var) + tg0Var.a;
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
            i2 = r(bArr, i2, tg0Var);
            i5 = tg0Var.a;
            if (i5 == i4) {
                break;
            }
            i2 = w(i5, bArr, i2, i3, tg0Var);
        }
        if (i2 > i3 || i5 != i4) {
            throw InvalidProtocolBufferException.parseFailure();
        }
        return i2;
    }
}

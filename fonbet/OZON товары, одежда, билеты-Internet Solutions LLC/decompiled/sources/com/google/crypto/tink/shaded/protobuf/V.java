package com.google.crypto.tink.shaded.protobuf;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.fido.u2f.api.common.RegisterRequest;
import com.google.crypto.tink.shaded.protobuf.A;
import com.google.crypto.tink.shaded.protobuf.AbstractC5917x;
import com.google.crypto.tink.shaded.protobuf.C5899e;
import com.google.crypto.tink.shaded.protobuf.C5919z;
import com.google.crypto.tink.shaded.protobuf.t0;
import com.google.protobuf.DescriptorProtos$FileOptions;
import com.google.protobuf.DescriptorProtos$MethodOptions;
import g.C6594f;
import io.sentry.android.core.internal.tombstone.TombstoneProtos$Tombstone;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import ru.rustore.sdk.appupdate.model.AppUpdateInfo;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
final class V<T> implements f0<T> {

    /* renamed from: p, reason: collision with root package name */
    private static final int[] f59323p = new int[0];

    /* renamed from: q, reason: collision with root package name */
    private static final Unsafe f59324q = p0.w();

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ int f59325r = 0;

    /* renamed from: a, reason: collision with root package name */
    private final int[] f59326a;

    /* renamed from: b, reason: collision with root package name */
    private final Object[] f59327b;

    /* renamed from: c, reason: collision with root package name */
    private final int f59328c;

    /* renamed from: d, reason: collision with root package name */
    private final int f59329d;

    /* renamed from: e, reason: collision with root package name */
    private final S f59330e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f59331f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f59332g;

    /* renamed from: h, reason: collision with root package name */
    private final int[] f59333h;

    /* renamed from: i, reason: collision with root package name */
    private final int f59334i;

    /* renamed from: j, reason: collision with root package name */
    private final int f59335j;

    /* renamed from: k, reason: collision with root package name */
    private final X f59336k;

    /* renamed from: l, reason: collision with root package name */
    private final F f59337l;

    /* renamed from: m, reason: collision with root package name */
    private final m0<?, ?> f59338m;

    /* renamed from: n, reason: collision with root package name */
    private final AbstractC5911q<?> f59339n;

    /* renamed from: o, reason: collision with root package name */
    private final M f59340o;

    private V(int[] iArr, Object[] objArr, int i11, int i12, S s11, int[] iArr2, int i13, int i14, X x11, F f7, m0 m0Var, AbstractC5911q abstractC5911q, M m11) {
        this.f59326a = iArr;
        this.f59327b = objArr;
        this.f59328c = i11;
        this.f59329d = i12;
        this.f59332g = s11 instanceof AbstractC5917x;
        this.f59331f = abstractC5911q != null && abstractC5911q.e(s11);
        this.f59333h = iArr2;
        this.f59334i = i13;
        this.f59335j = i14;
        this.f59336k = x11;
        this.f59337l = f7;
        this.f59338m = m0Var;
        this.f59339n = abstractC5911q;
        this.f59330e = s11;
        this.f59340o = m11;
    }

    private static <T> long A(T t2, long j11) {
        return ((Long) p0.v(t2, j11)).longValue();
    }

    private void B(Object obj, byte[] bArr, int i11, int i12, int i13, long j11, C5899e.a aVar) throws IOException {
        Unsafe unsafe = f59324q;
        Object k11 = k(i13);
        Object object = unsafe.getObject(obj, j11);
        M m11 = this.f59340o;
        if (m11.isImmutable(object)) {
            L a11 = m11.a();
            m11.mergeFrom(a11, object);
            unsafe.putObject(obj, j11, a11);
            object = a11;
        }
        m11.forMapMetadata(k11);
        m11.forMutableMapData(object);
        int g10 = C5899e.g(bArr, i11, aVar);
        int i14 = aVar.f59358a;
        if (i14 >= 0 && i14 <= i12 - g10) {
            throw null;
        }
        throw A.l();
    }

    private int D(T t2, byte[] bArr, int i11, int i12, int i13, int i14, int i15, int i16, int i17, long j11, int i18, C5899e.a aVar) throws IOException {
        Unsafe unsafe = f59324q;
        long j12 = this.f59326a[i18 + 2] & 1048575;
        switch (i17) {
            case 51:
                if (i15 != 1) {
                    return i11;
                }
                unsafe.putObject(t2, j11, Double.valueOf(Double.longBitsToDouble(C5899e.c(i11, bArr))));
                int i19 = i11 + 8;
                unsafe.putInt(t2, j12, i14);
                return i19;
            case 52:
                if (i15 != 5) {
                    return i11;
                }
                unsafe.putObject(t2, j11, Float.valueOf(Float.intBitsToFloat(C5899e.b(i11, bArr))));
                int i21 = i11 + 4;
                unsafe.putInt(t2, j12, i14);
                return i21;
            case 53:
            case 54:
                if (i15 != 0) {
                    return i11;
                }
                int i22 = C5899e.i(bArr, i11, aVar);
                unsafe.putObject(t2, j11, Long.valueOf(aVar.f59359b));
                unsafe.putInt(t2, j12, i14);
                return i22;
            case 55:
            case 62:
                if (i15 != 0) {
                    return i11;
                }
                int g10 = C5899e.g(bArr, i11, aVar);
                unsafe.putObject(t2, j11, Integer.valueOf(aVar.f59358a));
                unsafe.putInt(t2, j12, i14);
                return g10;
            case 56:
            case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                if (i15 != 1) {
                    return i11;
                }
                unsafe.putObject(t2, j11, Long.valueOf(C5899e.c(i11, bArr)));
                int i23 = i11 + 8;
                unsafe.putInt(t2, j12, i14);
                return i23;
            case 57:
            case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
                if (i15 != 5) {
                    return i11;
                }
                unsafe.putObject(t2, j11, Integer.valueOf(C5899e.b(i11, bArr)));
                int i24 = i11 + 4;
                unsafe.putInt(t2, j12, i14);
                return i24;
            case 58:
                if (i15 != 0) {
                    return i11;
                }
                int i25 = C5899e.i(bArr, i11, aVar);
                unsafe.putObject(t2, j11, Boolean.valueOf(aVar.f59359b != 0));
                unsafe.putInt(t2, j12, i14);
                return i25;
            case 59:
                if (i15 != 2) {
                    return i11;
                }
                int g11 = C5899e.g(bArr, i11, aVar);
                int i26 = aVar.f59358a;
                if (i26 == 0) {
                    unsafe.putObject(t2, j11, "");
                } else {
                    if ((i16 & 536870912) != 0 && !q0.g(bArr, g11, g11 + i26)) {
                        throw A.d();
                    }
                    unsafe.putObject(t2, j11, new String(bArr, g11, i26, C5919z.f59480a));
                    g11 += i26;
                }
                unsafe.putInt(t2, j12, i14);
                return g11;
            case 60:
                if (i15 != 2) {
                    return i11;
                }
                Object w11 = w(t2, i14, i18);
                int k11 = C5899e.k(w11, l(i18), bArr, i11, i12, aVar);
                O(t2, i14, i18, w11);
                return k11;
            case 61:
                if (i15 != 2) {
                    return i11;
                }
                int a11 = C5899e.a(bArr, i11, aVar);
                unsafe.putObject(t2, j11, aVar.f59360c);
                unsafe.putInt(t2, j12, i14);
                return a11;
            case 63:
                if (i15 != 0) {
                    return i11;
                }
                int g12 = C5899e.g(bArr, i11, aVar);
                int i27 = aVar.f59358a;
                C5919z.c j13 = j(i18);
                if (j13 != null && !j13.a()) {
                    m(t2).j(i13, Long.valueOf(i27));
                    return g12;
                }
                unsafe.putObject(t2, j11, Integer.valueOf(i27));
                unsafe.putInt(t2, j12, i14);
                return g12;
            case 66:
                if (i15 != 0) {
                    return i11;
                }
                int g13 = C5899e.g(bArr, i11, aVar);
                unsafe.putObject(t2, j11, Integer.valueOf(AbstractC5904j.b(aVar.f59358a)));
                unsafe.putInt(t2, j12, i14);
                return g13;
            case 67:
                if (i15 != 0) {
                    return i11;
                }
                int i28 = C5899e.i(bArr, i11, aVar);
                unsafe.putObject(t2, j11, Long.valueOf(AbstractC5904j.c(aVar.f59359b)));
                unsafe.putInt(t2, j12, i14);
                return i28;
            case 68:
                if (i15 == 3) {
                    Object w12 = w(t2, i14, i18);
                    int j14 = C5899e.j(w12, l(i18), bArr, i11, i12, (i13 & (-8)) | 4, aVar);
                    O(t2, i14, i18, w12);
                    return j14;
                }
                break;
        }
        return i11;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    private int E(T t2, byte[] bArr, int i11, int i12, int i13, int i14, int i15, int i16, long j11, int i17, long j12, C5899e.a aVar) throws IOException {
        int h11;
        Unsafe unsafe = f59324q;
        C5919z.d dVar = (C5919z.d) unsafe.getObject(t2, j12);
        if (!dVar.isModifiable()) {
            dVar = dVar.mutableCopyWithCapacity(dVar.size() * 2);
            unsafe.putObject(t2, j12, dVar);
        }
        C5919z.d dVar2 = dVar;
        switch (i17) {
            case 18:
            case DescriptorProtos$MethodOptions.FEATURES_FIELD_NUMBER /* 35 */:
                if (i15 != 2) {
                    if (i15 == 1) {
                        C5908n c5908n = (C5908n) dVar2;
                        c5908n.addDouble(Double.longBitsToDouble(C5899e.c(i11, bArr)));
                        int i18 = i11 + 8;
                        while (i18 < i12) {
                            int g10 = C5899e.g(bArr, i18, aVar);
                            if (i13 != aVar.f59358a) {
                                return i18;
                            }
                            c5908n.addDouble(Double.longBitsToDouble(C5899e.c(g10, bArr)));
                            i18 = g10 + 8;
                        }
                        return i18;
                    }
                    return i11;
                }
                C5908n c5908n2 = (C5908n) dVar2;
                int g11 = C5899e.g(bArr, i11, aVar);
                int i19 = aVar.f59358a;
                int i21 = g11 + i19;
                if (i21 > bArr.length) {
                    throw A.l();
                }
                c5908n2.b((i19 / 8) + c5908n2.size());
                while (g11 < i21) {
                    c5908n2.addDouble(Double.longBitsToDouble(C5899e.c(g11, bArr)));
                    g11 += 8;
                }
                if (g11 == i21) {
                    return g11;
                }
                throw A.l();
            case 19:
            case DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                if (i15 != 2) {
                    if (i15 == 5) {
                        C5915v c5915v = (C5915v) dVar2;
                        c5915v.addFloat(Float.intBitsToFloat(C5899e.b(i11, bArr)));
                        int i22 = i11 + 4;
                        while (i22 < i12) {
                            int g12 = C5899e.g(bArr, i22, aVar);
                            if (i13 != aVar.f59358a) {
                                return i22;
                            }
                            c5915v.addFloat(Float.intBitsToFloat(C5899e.b(g12, bArr)));
                            i22 = g12 + 4;
                        }
                        return i22;
                    }
                    return i11;
                }
                C5915v c5915v2 = (C5915v) dVar2;
                int g13 = C5899e.g(bArr, i11, aVar);
                int i23 = aVar.f59358a;
                int i24 = g13 + i23;
                if (i24 > bArr.length) {
                    throw A.l();
                }
                c5915v2.b((i23 / 4) + c5915v2.size());
                while (g13 < i24) {
                    c5915v2.addFloat(Float.intBitsToFloat(C5899e.b(g13, bArr)));
                    g13 += 4;
                }
                if (g13 == i24) {
                    return g13;
                }
                throw A.l();
            case 20:
            case 21:
            case DescriptorProtos$FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
            case 38:
                if (i15 == 2) {
                    I i25 = (I) dVar2;
                    int g14 = C5899e.g(bArr, i11, aVar);
                    int i26 = aVar.f59358a + g14;
                    while (g14 < i26) {
                        g14 = C5899e.i(bArr, g14, aVar);
                        i25.addLong(aVar.f59359b);
                    }
                    if (g14 == i26) {
                        return g14;
                    }
                    throw A.l();
                }
                if (i15 == 0) {
                    I i27 = (I) dVar2;
                    int i28 = C5899e.i(bArr, i11, aVar);
                    i27.addLong(aVar.f59359b);
                    while (i28 < i12) {
                        int g15 = C5899e.g(bArr, i28, aVar);
                        if (i13 != aVar.f59358a) {
                            return i28;
                        }
                        i28 = C5899e.i(bArr, g15, aVar);
                        i27.addLong(aVar.f59359b);
                    }
                    return i28;
                }
                return i11;
            case 22:
            case 29:
            case DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
            case 43:
                if (i15 != 2) {
                    if (i15 == 0) {
                        return C5899e.h(i13, bArr, i11, i12, dVar2, aVar);
                    }
                    return i11;
                }
                C5918y c5918y = (C5918y) dVar2;
                int g16 = C5899e.g(bArr, i11, aVar);
                int i29 = aVar.f59358a + g16;
                while (g16 < i29) {
                    g16 = C5899e.g(bArr, g16, aVar);
                    c5918y.addInt(aVar.f59358a);
                }
                if (g16 == i29) {
                    return g16;
                }
                throw A.l();
            case 23:
            case 32:
            case 40:
            case 46:
                if (i15 != 2) {
                    if (i15 == 1) {
                        I i31 = (I) dVar2;
                        i31.addLong(C5899e.c(i11, bArr));
                        int i32 = i11 + 8;
                        while (i32 < i12) {
                            int g17 = C5899e.g(bArr, i32, aVar);
                            if (i13 != aVar.f59358a) {
                                return i32;
                            }
                            i31.addLong(C5899e.c(g17, bArr));
                            i32 = g17 + 8;
                        }
                        return i32;
                    }
                    return i11;
                }
                I i33 = (I) dVar2;
                int g18 = C5899e.g(bArr, i11, aVar);
                int i34 = aVar.f59358a;
                int i35 = g18 + i34;
                if (i35 > bArr.length) {
                    throw A.l();
                }
                i33.b((i34 / 8) + i33.size());
                while (g18 < i35) {
                    i33.addLong(C5899e.c(g18, bArr));
                    g18 += 8;
                }
                if (g18 == i35) {
                    return g18;
                }
                throw A.l();
            case 24:
            case DescriptorProtos$FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
            case 41:
            case DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                if (i15 != 2) {
                    if (i15 == 5) {
                        C5918y c5918y2 = (C5918y) dVar2;
                        c5918y2.addInt(C5899e.b(i11, bArr));
                        int i36 = i11 + 4;
                        while (i36 < i12) {
                            int g19 = C5899e.g(bArr, i36, aVar);
                            if (i13 != aVar.f59358a) {
                                return i36;
                            }
                            c5918y2.addInt(C5899e.b(g19, bArr));
                            i36 = g19 + 4;
                        }
                        return i36;
                    }
                    return i11;
                }
                C5918y c5918y3 = (C5918y) dVar2;
                int g21 = C5899e.g(bArr, i11, aVar);
                int i37 = aVar.f59358a;
                int i38 = g21 + i37;
                if (i38 > bArr.length) {
                    throw A.l();
                }
                c5918y3.b((i37 / 4) + c5918y3.size());
                while (g21 < i38) {
                    c5918y3.addInt(C5899e.b(g21, bArr));
                    g21 += 4;
                }
                if (g21 == i38) {
                    return g21;
                }
                throw A.l();
            case TombstoneProtos$Tombstone.GUEST_THREADS_FIELD_NUMBER /* 25 */:
            case 42:
                if (i15 == 2) {
                    C5900f c5900f = (C5900f) dVar2;
                    int g22 = C5899e.g(bArr, i11, aVar);
                    int i39 = aVar.f59358a + g22;
                    while (g22 < i39) {
                        g22 = C5899e.i(bArr, g22, aVar);
                        c5900f.addBoolean(aVar.f59359b != 0);
                    }
                    if (g22 == i39) {
                        return g22;
                    }
                    throw A.l();
                }
                if (i15 == 0) {
                    C5900f c5900f2 = (C5900f) dVar2;
                    int i41 = C5899e.i(bArr, i11, aVar);
                    c5900f2.addBoolean(aVar.f59359b != 0);
                    while (i41 < i12) {
                        int g23 = C5899e.g(bArr, i41, aVar);
                        if (i13 != aVar.f59358a) {
                            return i41;
                        }
                        i41 = C5899e.i(bArr, g23, aVar);
                        c5900f2.addBoolean(aVar.f59359b != 0);
                    }
                    return i41;
                }
                return i11;
            case TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER /* 26 */:
                if (i15 == 2) {
                    if ((j11 & 536870912) == 0) {
                        int g24 = C5899e.g(bArr, i11, aVar);
                        int i42 = aVar.f59358a;
                        if (i42 < 0) {
                            throw A.g();
                        }
                        if (i42 == 0) {
                            dVar2.add("");
                        } else {
                            dVar2.add(new String(bArr, g24, i42, C5919z.f59480a));
                            g24 += i42;
                        }
                        while (g24 < i12) {
                            int g25 = C5899e.g(bArr, g24, aVar);
                            if (i13 != aVar.f59358a) {
                                return g24;
                            }
                            g24 = C5899e.g(bArr, g25, aVar);
                            int i43 = aVar.f59358a;
                            if (i43 < 0) {
                                throw A.g();
                            }
                            if (i43 == 0) {
                                dVar2.add("");
                            } else {
                                dVar2.add(new String(bArr, g24, i43, C5919z.f59480a));
                                g24 += i43;
                            }
                        }
                        return g24;
                    }
                    int g26 = C5899e.g(bArr, i11, aVar);
                    int i44 = aVar.f59358a;
                    if (i44 < 0) {
                        throw A.g();
                    }
                    if (i44 == 0) {
                        dVar2.add("");
                    } else {
                        int i45 = g26 + i44;
                        if (!q0.g(bArr, g26, i45)) {
                            throw A.d();
                        }
                        dVar2.add(new String(bArr, g26, i44, C5919z.f59480a));
                        g26 = i45;
                    }
                    while (g26 < i12) {
                        int g27 = C5899e.g(bArr, g26, aVar);
                        if (i13 != aVar.f59358a) {
                            return g26;
                        }
                        g26 = C5899e.g(bArr, g27, aVar);
                        int i46 = aVar.f59358a;
                        if (i46 < 0) {
                            throw A.g();
                        }
                        if (i46 == 0) {
                            dVar2.add("");
                        } else {
                            int i47 = g26 + i46;
                            if (!q0.g(bArr, g26, i47)) {
                                throw A.d();
                            }
                            dVar2.add(new String(bArr, g26, i46, C5919z.f59480a));
                            g26 = i47;
                        }
                    }
                    return g26;
                }
                return i11;
            case DescriptorProtos$FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                if (i15 == 2) {
                    return C5899e.d(l(i16), i13, bArr, i11, i12, dVar2, aVar);
                }
                return i11;
            case 28:
                if (i15 == 2) {
                    int g28 = C5899e.g(bArr, i11, aVar);
                    int i48 = aVar.f59358a;
                    if (i48 < 0) {
                        throw A.g();
                    }
                    if (i48 > bArr.length - g28) {
                        throw A.l();
                    }
                    if (i48 == 0) {
                        dVar2.add(AbstractC5903i.f59377b);
                    } else {
                        dVar2.add(AbstractC5903i.e(g28, i48, bArr));
                        g28 += i48;
                    }
                    while (g28 < i12) {
                        int g29 = C5899e.g(bArr, g28, aVar);
                        if (i13 != aVar.f59358a) {
                            return g28;
                        }
                        g28 = C5899e.g(bArr, g29, aVar);
                        int i49 = aVar.f59358a;
                        if (i49 < 0) {
                            throw A.g();
                        }
                        if (i49 > bArr.length - g28) {
                            throw A.l();
                        }
                        if (i49 == 0) {
                            dVar2.add(AbstractC5903i.f59377b);
                        } else {
                            dVar2.add(AbstractC5903i.e(g28, i49, bArr));
                            g28 += i49;
                        }
                    }
                    return g28;
                }
                return i11;
            case AppUpdateInfo.Factory.DAYS_BETWEEN_30 /* 30 */:
            case DescriptorProtos$FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                if (i15 != 2) {
                    if (i15 == 0) {
                        h11 = C5899e.h(i13, bArr, i11, i12, dVar2, aVar);
                    }
                    return i11;
                }
                C5918y c5918y4 = (C5918y) dVar2;
                h11 = C5899e.g(bArr, i11, aVar);
                int i51 = aVar.f59358a + h11;
                while (h11 < i51) {
                    h11 = C5899e.g(bArr, h11, aVar);
                    c5918y4.addInt(aVar.f59358a);
                }
                if (h11 != i51) {
                    throw A.l();
                }
                g0.j(t2, i14, dVar2, j(i16), null, this.f59338m);
                return h11;
            case 33:
            case 47:
                if (i15 == 2) {
                    C5918y c5918y5 = (C5918y) dVar2;
                    int g31 = C5899e.g(bArr, i11, aVar);
                    int i52 = aVar.f59358a + g31;
                    while (g31 < i52) {
                        g31 = C5899e.g(bArr, g31, aVar);
                        c5918y5.addInt(AbstractC5904j.b(aVar.f59358a));
                    }
                    if (g31 == i52) {
                        return g31;
                    }
                    throw A.l();
                }
                if (i15 == 0) {
                    C5918y c5918y6 = (C5918y) dVar2;
                    int g32 = C5899e.g(bArr, i11, aVar);
                    c5918y6.addInt(AbstractC5904j.b(aVar.f59358a));
                    while (g32 < i12) {
                        int g33 = C5899e.g(bArr, g32, aVar);
                        if (i13 != aVar.f59358a) {
                            return g32;
                        }
                        g32 = C5899e.g(bArr, g33, aVar);
                        c5918y6.addInt(AbstractC5904j.b(aVar.f59358a));
                    }
                    return g32;
                }
                return i11;
            case 34:
            case 48:
                if (i15 == 2) {
                    I i53 = (I) dVar2;
                    int g34 = C5899e.g(bArr, i11, aVar);
                    int i54 = aVar.f59358a + g34;
                    while (g34 < i54) {
                        g34 = C5899e.i(bArr, g34, aVar);
                        i53.addLong(AbstractC5904j.c(aVar.f59359b));
                    }
                    if (g34 == i54) {
                        return g34;
                    }
                    throw A.l();
                }
                if (i15 == 0) {
                    I i55 = (I) dVar2;
                    int i56 = C5899e.i(bArr, i11, aVar);
                    i55.addLong(AbstractC5904j.c(aVar.f59359b));
                    while (i56 < i12) {
                        int g35 = C5899e.g(bArr, i56, aVar);
                        if (i13 != aVar.f59358a) {
                            return i56;
                        }
                        i56 = C5899e.i(bArr, g35, aVar);
                        i55.addLong(AbstractC5904j.c(aVar.f59359b));
                    }
                    return i56;
                }
                return i11;
            case 49:
                if (i15 == 3) {
                    f0 l11 = l(i16);
                    int i57 = (i13 & (-8)) | 4;
                    Object newInstance = l11.newInstance();
                    int j13 = C5899e.j(newInstance, l11, bArr, i11, i12, i57, aVar);
                    f0 f0Var = l11;
                    f0Var.makeImmutable(newInstance);
                    aVar.f59360c = newInstance;
                    dVar2.add(newInstance);
                    f0 f0Var2 = f0Var;
                    while (j13 < i12) {
                        int g36 = C5899e.g(bArr, j13, aVar);
                        if (i13 != aVar.f59358a) {
                            return j13;
                        }
                        Object newInstance2 = f0Var2.newInstance();
                        f0 f0Var3 = f0Var2;
                        j13 = C5899e.j(newInstance2, f0Var3, bArr, g36, i12, i57, aVar);
                        f0Var3.makeImmutable(newInstance2);
                        aVar.f59360c = newInstance2;
                        dVar2.add(newInstance2);
                        f0Var2 = f0Var3;
                    }
                    return j13;
                }
                return i11;
            default:
                return i11;
        }
    }

    private void F(Object obj, long j11, C5905k c5905k, f0 f0Var, C5910p c5910p) throws IOException {
        c5905k.v(this.f59337l.a(j11, obj), f0Var, c5910p);
    }

    private void G(Object obj, int i11, C5905k c5905k, f0 f0Var, C5910p c5910p) throws IOException {
        c5905k.B(this.f59337l.a(i11 & 1048575, obj), f0Var, c5910p);
    }

    private void H(int i11, C5905k c5905k, Object obj) throws IOException {
        if ((536870912 & i11) != 0) {
            p0.H(obj, i11 & 1048575, c5905k.M());
        } else if (this.f59332g) {
            p0.H(obj, i11 & 1048575, c5905k.K());
        } else {
            p0.H(obj, i11 & 1048575, c5905k.j());
        }
    }

    private void I(int i11, C5905k c5905k, Object obj) throws IOException {
        boolean z11 = (536870912 & i11) != 0;
        F f7 = this.f59337l;
        if (z11) {
            c5905k.L(f7.a(i11 & 1048575, obj), true);
        } else {
            c5905k.L(f7.a(i11 & 1048575, obj), false);
        }
    }

    private static Field J(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException e11) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            StringBuilder b11 = C6594f.b("Field ", str, " for ");
            b11.append(cls.getName());
            b11.append(" not found. Known fields are ");
            b11.append(Arrays.toString(declaredFields));
            throw new RuntimeException(b11.toString(), e11);
        }
    }

    private void K(T t2, int i11) {
        int i12 = this.f59326a[i11 + 2];
        long j11 = 1048575 & i12;
        if (j11 == 1048575) {
            return;
        }
        p0.F(t2, j11, (1 << (i12 >>> 20)) | p0.t(t2, j11));
    }

    private void L(T t2, int i11, int i12) {
        p0.F(t2, this.f59326a[i12 + 2] & 1048575, i11);
    }

    private int M(int i11, int i12) {
        int[] iArr = this.f59326a;
        int length = (iArr.length / 3) - 1;
        while (i12 <= length) {
            int i13 = (length + i12) >>> 1;
            int i14 = i13 * 3;
            int i15 = iArr[i14];
            if (i11 == i15) {
                return i14;
            }
            if (i11 < i15) {
                length = i13 - 1;
            } else {
                i12 = i13 + 1;
            }
        }
        return -1;
    }

    private void N(T t2, int i11, Object obj) {
        f59324q.putObject(t2, Q(i11) & 1048575, obj);
        K(t2, i11);
    }

    private void O(T t2, int i11, int i12, Object obj) {
        f59324q.putObject(t2, Q(i12) & 1048575, obj);
        L(t2, i11, i12);
    }

    private static int P(int i11) {
        return (i11 & 267386880) >>> 20;
    }

    private int Q(int i11) {
        return this.f59326a[i11 + 1];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0550  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x055a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void R(T t2, t0 t0Var) throws IOException {
        Map.Entry<?, Object> entry;
        int length;
        int i11;
        boolean z11;
        int i12;
        int i13;
        boolean z12;
        V<T> v11 = this;
        boolean z13 = v11.f59331f;
        AbstractC5911q<?> abstractC5911q = v11.f59339n;
        if (z13) {
            C5913t<?> c11 = abstractC5911q.c(t2);
            if (!c11.h()) {
                entry = c11.l().next();
                int[] iArr = v11.f59326a;
                length = iArr.length;
                Unsafe unsafe = f59324q;
                int i14 = 1048575;
                int i15 = 0;
                for (i11 = 0; i11 < length; i11 += 3) {
                    int Q11 = v11.Q(i11);
                    int i16 = iArr[i11];
                    int P11 = P(Q11);
                    if (P11 <= 17) {
                        int i17 = iArr[i11 + 2];
                        z11 = true;
                        int i18 = i17 & 1048575;
                        if (i18 != i14) {
                            i15 = i18 == 1048575 ? 0 : unsafe.getInt(t2, i18);
                            i14 = i18;
                        }
                        i12 = Q11;
                        i13 = 1 << (i17 >>> 20);
                    } else {
                        z11 = true;
                        i12 = Q11;
                        i13 = 0;
                    }
                    if (entry != null) {
                        abstractC5911q.a(entry);
                        if (i16 >= 0) {
                            abstractC5911q.j(entry);
                            throw null;
                        }
                    }
                    long j11 = i12 & 1048575;
                    switch (P11) {
                        case 0:
                            if (v11.o(t2, i11, i14, i15, i13)) {
                                ((C5907m) t0Var).f(i16, p0.r(t2, j11));
                                break;
                            } else {
                                break;
                            }
                        case 1:
                            if (v11.o(t2, i11, i14, i15, i13)) {
                                ((C5907m) t0Var).o(i16, p0.s(t2, j11));
                            }
                            v11 = this;
                            break;
                        case 2:
                            if (v11.o(t2, i11, i14, i15, i13)) {
                                ((C5907m) t0Var).t(i16, unsafe.getLong(t2, j11));
                            }
                            v11 = this;
                            break;
                        case 3:
                            if (v11.o(t2, i11, i14, i15, i13)) {
                                ((C5907m) t0Var).L(i16, unsafe.getLong(t2, j11));
                            }
                            v11 = this;
                            break;
                        case 4:
                            if (v11.o(t2, i11, i14, i15, i13)) {
                                ((C5907m) t0Var).r(i16, unsafe.getInt(t2, j11));
                            }
                            v11 = this;
                            break;
                        case 5:
                            if (v11.o(t2, i11, i14, i15, i13)) {
                                ((C5907m) t0Var).m(i16, unsafe.getLong(t2, j11));
                            }
                            v11 = this;
                            break;
                        case 6:
                            if (v11.o(t2, i11, i14, i15, i13)) {
                                ((C5907m) t0Var).k(i16, unsafe.getInt(t2, j11));
                            }
                            v11 = this;
                            break;
                        case 7:
                            if (v11.o(t2, i11, i14, i15, i13)) {
                                ((C5907m) t0Var).b(i16, p0.p(t2, j11));
                            }
                            v11 = this;
                            break;
                        case 8:
                            if (v11.o(t2, i11, i14, i15, i13)) {
                                S(i16, unsafe.getObject(t2, j11), t0Var);
                            }
                            v11 = this;
                            break;
                        case 9:
                            if (v11.o(t2, i11, i14, i15, i13)) {
                                ((C5907m) t0Var).w(i16, unsafe.getObject(t2, j11), v11.l(i11));
                                break;
                            } else {
                                break;
                            }
                        case 10:
                            if (v11.o(t2, i11, i14, i15, i13)) {
                                ((C5907m) t0Var).d(i16, (AbstractC5903i) unsafe.getObject(t2, j11));
                            }
                            v11 = this;
                            break;
                        case 11:
                            if (v11.o(t2, i11, i14, i15, i13)) {
                                ((C5907m) t0Var).J(i16, unsafe.getInt(t2, j11));
                            }
                            v11 = this;
                            break;
                        case 12:
                            if (v11.o(t2, i11, i14, i15, i13)) {
                                ((C5907m) t0Var).i(i16, unsafe.getInt(t2, j11));
                            }
                            v11 = this;
                            break;
                        case 13:
                            if (v11.o(t2, i11, i14, i15, i13)) {
                                ((C5907m) t0Var).y(i16, unsafe.getInt(t2, j11));
                            }
                            v11 = this;
                            break;
                        case 14:
                            if (v11.o(t2, i11, i14, i15, i13)) {
                                ((C5907m) t0Var).A(i16, unsafe.getLong(t2, j11));
                            }
                            v11 = this;
                            break;
                        case 15:
                            if (v11.o(t2, i11, i14, i15, i13)) {
                                ((C5907m) t0Var).C(i16, unsafe.getInt(t2, j11));
                            }
                            v11 = this;
                            break;
                        case 16:
                            if (v11.o(t2, i11, i14, i15, i13)) {
                                ((C5907m) t0Var).E(i16, unsafe.getLong(t2, j11));
                            }
                            v11 = this;
                            break;
                        case 17:
                            if (v11.o(t2, i11, i14, i15, i13)) {
                                ((C5907m) t0Var).q(i16, unsafe.getObject(t2, j11), v11.l(i11));
                                break;
                            } else {
                                break;
                            }
                        case 18:
                            z12 = false;
                            g0.q(iArr[i11], (List) unsafe.getObject(t2, j11), t0Var, false);
                            break;
                        case 19:
                            z12 = false;
                            g0.u(iArr[i11], (List) unsafe.getObject(t2, j11), t0Var, false);
                            break;
                        case 20:
                            z12 = false;
                            g0.x(iArr[i11], (List) unsafe.getObject(t2, j11), t0Var, false);
                            break;
                        case 21:
                            z12 = false;
                            g0.E(iArr[i11], (List) unsafe.getObject(t2, j11), t0Var, false);
                            break;
                        case 22:
                            z12 = false;
                            g0.w(iArr[i11], (List) unsafe.getObject(t2, j11), t0Var, false);
                            break;
                        case 23:
                            z12 = false;
                            g0.t(iArr[i11], (List) unsafe.getObject(t2, j11), t0Var, false);
                            break;
                        case 24:
                            z12 = false;
                            g0.s(iArr[i11], (List) unsafe.getObject(t2, j11), t0Var, false);
                            break;
                        case TombstoneProtos$Tombstone.GUEST_THREADS_FIELD_NUMBER /* 25 */:
                            z12 = false;
                            g0.p(iArr[i11], (List) unsafe.getObject(t2, j11), t0Var, false);
                            break;
                        case TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER /* 26 */:
                            int i19 = iArr[i11];
                            List<String> list = (List) unsafe.getObject(t2, j11);
                            int i21 = g0.f59373d;
                            if (list != null && !list.isEmpty()) {
                                ((C5907m) t0Var).I(i19, list);
                            }
                            break;
                        case DescriptorProtos$FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                            g0.y(iArr[i11], (List) unsafe.getObject(t2, j11), t0Var, v11.l(i11));
                            break;
                        case 28:
                            int i22 = iArr[i11];
                            List<AbstractC5903i> list2 = (List) unsafe.getObject(t2, j11);
                            int i23 = g0.f59373d;
                            if (list2 != null && !list2.isEmpty()) {
                                ((C5907m) t0Var).e(i22, list2);
                            }
                            break;
                        case 29:
                            z12 = false;
                            g0.D(iArr[i11], (List) unsafe.getObject(t2, j11), t0Var, false);
                            break;
                        case AppUpdateInfo.Factory.DAYS_BETWEEN_30 /* 30 */:
                            z12 = false;
                            g0.r(iArr[i11], (List) unsafe.getObject(t2, j11), t0Var, false);
                            break;
                        case DescriptorProtos$FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                            z12 = false;
                            g0.z(iArr[i11], (List) unsafe.getObject(t2, j11), t0Var, false);
                            break;
                        case 32:
                            z12 = false;
                            g0.A(iArr[i11], (List) unsafe.getObject(t2, j11), t0Var, false);
                            break;
                        case 33:
                            z12 = false;
                            g0.B(iArr[i11], (List) unsafe.getObject(t2, j11), t0Var, false);
                            break;
                        case 34:
                            z12 = false;
                            g0.C(iArr[i11], (List) unsafe.getObject(t2, j11), t0Var, false);
                            break;
                        case DescriptorProtos$MethodOptions.FEATURES_FIELD_NUMBER /* 35 */:
                            g0.q(iArr[i11], (List) unsafe.getObject(t2, j11), t0Var, z11);
                            break;
                        case DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                            g0.u(iArr[i11], (List) unsafe.getObject(t2, j11), t0Var, z11);
                            break;
                        case DescriptorProtos$FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                            g0.x(iArr[i11], (List) unsafe.getObject(t2, j11), t0Var, z11);
                            break;
                        case 38:
                            g0.E(iArr[i11], (List) unsafe.getObject(t2, j11), t0Var, z11);
                            break;
                        case DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                            g0.w(iArr[i11], (List) unsafe.getObject(t2, j11), t0Var, z11);
                            break;
                        case 40:
                            g0.t(iArr[i11], (List) unsafe.getObject(t2, j11), t0Var, z11);
                            break;
                        case 41:
                            g0.s(iArr[i11], (List) unsafe.getObject(t2, j11), t0Var, z11);
                            break;
                        case 42:
                            g0.p(iArr[i11], (List) unsafe.getObject(t2, j11), t0Var, z11);
                            break;
                        case 43:
                            g0.D(iArr[i11], (List) unsafe.getObject(t2, j11), t0Var, z11);
                            break;
                        case DescriptorProtos$FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                            g0.r(iArr[i11], (List) unsafe.getObject(t2, j11), t0Var, z11);
                            break;
                        case DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                            g0.z(iArr[i11], (List) unsafe.getObject(t2, j11), t0Var, z11);
                            break;
                        case 46:
                            g0.A(iArr[i11], (List) unsafe.getObject(t2, j11), t0Var, z11);
                            break;
                        case 47:
                            g0.B(iArr[i11], (List) unsafe.getObject(t2, j11), t0Var, z11);
                            break;
                        case 48:
                            g0.C(iArr[i11], (List) unsafe.getObject(t2, j11), t0Var, z11);
                            break;
                        case 49:
                            g0.v(iArr[i11], (List) unsafe.getObject(t2, j11), t0Var, v11.l(i11));
                            break;
                        case 50:
                            Object object = unsafe.getObject(t2, j11);
                            if (object != null) {
                                Object k11 = v11.k(i11);
                                M m11 = v11.f59340o;
                                m11.forMapMetadata(k11);
                                ((C5907m) t0Var).v(i16, m11.forMapData(object));
                            }
                            break;
                        case 51:
                            if (v11.q(t2, i16, i11)) {
                                ((C5907m) t0Var).f(i16, ((Double) p0.v(t2, j11)).doubleValue());
                            }
                            break;
                        case 52:
                            if (v11.q(t2, i16, i11)) {
                                ((C5907m) t0Var).o(i16, ((Float) p0.v(t2, j11)).floatValue());
                            }
                            break;
                        case 53:
                            if (v11.q(t2, i16, i11)) {
                                ((C5907m) t0Var).t(i16, A(t2, j11));
                            }
                            break;
                        case 54:
                            if (v11.q(t2, i16, i11)) {
                                ((C5907m) t0Var).L(i16, A(t2, j11));
                            }
                            break;
                        case 55:
                            if (v11.q(t2, i16, i11)) {
                                ((C5907m) t0Var).r(i16, z(t2, j11));
                            }
                            break;
                        case 56:
                            if (v11.q(t2, i16, i11)) {
                                ((C5907m) t0Var).m(i16, A(t2, j11));
                            }
                            break;
                        case 57:
                            if (v11.q(t2, i16, i11)) {
                                ((C5907m) t0Var).k(i16, z(t2, j11));
                            }
                            break;
                        case 58:
                            if (v11.q(t2, i16, i11)) {
                                ((C5907m) t0Var).b(i16, ((Boolean) p0.v(t2, j11)).booleanValue());
                            }
                            break;
                        case 59:
                            if (v11.q(t2, i16, i11)) {
                                S(i16, unsafe.getObject(t2, j11), t0Var);
                            }
                            break;
                        case 60:
                            if (v11.q(t2, i16, i11)) {
                                ((C5907m) t0Var).w(i16, unsafe.getObject(t2, j11), v11.l(i11));
                            }
                            break;
                        case 61:
                            if (v11.q(t2, i16, i11)) {
                                ((C5907m) t0Var).d(i16, (AbstractC5903i) unsafe.getObject(t2, j11));
                            }
                            break;
                        case 62:
                            if (v11.q(t2, i16, i11)) {
                                ((C5907m) t0Var).J(i16, z(t2, j11));
                            }
                            break;
                        case 63:
                            if (v11.q(t2, i16, i11)) {
                                ((C5907m) t0Var).i(i16, z(t2, j11));
                            }
                            break;
                        case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
                            if (v11.q(t2, i16, i11)) {
                                ((C5907m) t0Var).y(i16, z(t2, j11));
                            }
                            break;
                        case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                            if (v11.q(t2, i16, i11)) {
                                ((C5907m) t0Var).A(i16, A(t2, j11));
                            }
                            break;
                        case 66:
                            if (v11.q(t2, i16, i11)) {
                                ((C5907m) t0Var).C(i16, z(t2, j11));
                            }
                            break;
                        case 67:
                            if (v11.q(t2, i16, i11)) {
                                ((C5907m) t0Var).E(i16, A(t2, j11));
                            }
                            break;
                        case 68:
                            if (v11.q(t2, i16, i11)) {
                                ((C5907m) t0Var).q(i16, unsafe.getObject(t2, j11), v11.l(i11));
                            }
                            break;
                    }
                }
                if (entry == null) {
                    abstractC5911q.j(entry);
                    throw null;
                }
                m0<?, ?> m0Var = v11.f59338m;
                m0Var.r(m0Var.g(t2), t0Var);
                return;
            }
        }
        entry = null;
        int[] iArr2 = v11.f59326a;
        length = iArr2.length;
        Unsafe unsafe2 = f59324q;
        int i142 = 1048575;
        int i152 = 0;
        while (i11 < length) {
        }
        if (entry == null) {
        }
    }

    private static void S(int i11, Object obj, t0 t0Var) throws IOException {
        if (obj instanceof String) {
            ((C5907m) t0Var).H(i11, (String) obj);
        } else {
            ((C5907m) t0Var).d(i11, (AbstractC5903i) obj);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private boolean g(AbstractC5917x abstractC5917x, AbstractC5917x abstractC5917x2, int i11) {
        return n(abstractC5917x, i11) == n(abstractC5917x2, i11);
    }

    private static void h(Object obj) {
        if (!p(obj)) {
            throw new IllegalArgumentException(U7.m.b(obj, "Mutating immutable message: "));
        }
    }

    private void i(Object obj, int i11, Object obj2, m0 m0Var, Object obj3) {
        C5919z.c j11;
        int i12 = this.f59326a[i11];
        Object v11 = p0.v(obj, Q(i11) & 1048575);
        if (v11 == null || (j11 = j(i11)) == null) {
            return;
        }
        M m11 = this.f59340o;
        L forMutableMapData = m11.forMutableMapData(v11);
        m11.forMapMetadata(k(i11));
        for (Map.Entry entry : forMutableMapData.entrySet()) {
            ((Integer) entry.getValue()).getClass();
            if (!j11.a()) {
                if (obj2 == null) {
                    m0Var.f(obj3);
                }
                entry.getKey();
                entry.getValue();
                K.b();
                throw null;
            }
        }
    }

    private C5919z.c j(int i11) {
        return (C5919z.c) this.f59327b[I1.w.a(i11, 3, 2, 1)];
    }

    private Object k(int i11) {
        return this.f59327b[(i11 / 3) * 2];
    }

    private f0 l(int i11) {
        int i12 = (i11 / 3) * 2;
        Object[] objArr = this.f59327b;
        f0 f0Var = (f0) objArr[i12];
        if (f0Var != null) {
            return f0Var;
        }
        f0<T> b11 = c0.a().b((Class) objArr[i12 + 1]);
        objArr[i12] = b11;
        return b11;
    }

    static n0 m(Object obj) {
        AbstractC5917x abstractC5917x = (AbstractC5917x) obj;
        n0 n0Var = abstractC5917x.unknownFields;
        if (n0Var != n0.b()) {
            return n0Var;
        }
        n0 h11 = n0.h();
        abstractC5917x.unknownFields = h11;
        return h11;
    }

    private boolean n(T t2, int i11) {
        int i12 = this.f59326a[i11 + 2];
        long j11 = i12 & 1048575;
        if (j11 == 1048575) {
            int Q11 = Q(i11);
            long j12 = Q11 & 1048575;
            switch (P(Q11)) {
                case 0:
                    if (Double.doubleToRawLongBits(p0.r(t2, j12)) == 0) {
                        return false;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(p0.s(t2, j12)) == 0) {
                        return false;
                    }
                    break;
                case 2:
                    if (p0.u(t2, j12) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (p0.u(t2, j12) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (p0.t(t2, j12) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (p0.u(t2, j12) == 0) {
                        return false;
                    }
                    break;
                case 6:
                    if (p0.t(t2, j12) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return p0.p(t2, j12);
                case 8:
                    Object v11 = p0.v(t2, j12);
                    if (v11 instanceof String) {
                        return !((String) v11).isEmpty();
                    }
                    if (v11 instanceof AbstractC5903i) {
                        return !AbstractC5903i.f59377b.equals(v11);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    if (p0.v(t2, j12) == null) {
                        return false;
                    }
                    break;
                case 10:
                    return !AbstractC5903i.f59377b.equals(p0.v(t2, j12));
                case 11:
                    if (p0.t(t2, j12) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (p0.t(t2, j12) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (p0.t(t2, j12) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (p0.u(t2, j12) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (p0.t(t2, j12) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (p0.u(t2, j12) == 0) {
                        return false;
                    }
                    break;
                case 17:
                    if (p0.v(t2, j12) == null) {
                        return false;
                    }
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } else {
            if ((p0.t(t2, j11) & (1 << (i12 >>> 20))) == 0) {
                return false;
            }
        }
        return true;
    }

    private boolean o(T t2, int i11, int i12, int i13, int i14) {
        return i12 == 1048575 ? n(t2, i11) : (i13 & i14) != 0;
    }

    private static boolean p(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof AbstractC5917x) {
            return ((AbstractC5917x) obj).r();
        }
        return true;
    }

    private boolean q(T t2, int i11, int i12) {
        return p0.t(t2, (long) (this.f59326a[i12 + 2] & 1048575)) == i11;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:99|(2:100|101)|(3:113|114|(1:116)(7:117|118|25|26|27|28|29))(1:103)|104|105|106|107|27|28|29) */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01e4, code lost:
    
        r4 = r6;
        r2 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x01e0, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01e1, code lost:
    
        r2 = r7;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0762 A[Catch: all -> 0x04e7, TryCatch #4 {all -> 0x04e7, blocks: (B:44:0x075d, B:46:0x0762, B:47:0x0766, B:235:0x04da, B:238:0x04ea, B:244:0x0509, B:253:0x051c, B:256:0x0521, B:257:0x0534, B:258:0x0547, B:259:0x055a, B:260:0x056d, B:261:0x0580, B:262:0x0593, B:263:0x05a6, B:264:0x05b9, B:265:0x05cf, B:266:0x05e5, B:267:0x05fb, B:268:0x0611, B:269:0x0627, B:271:0x0639, B:274:0x0640, B:275:0x0647, B:276:0x0653, B:277:0x0669, B:278:0x067f, B:279:0x0695, B:280:0x06a3, B:281:0x06b9, B:282:0x06cf, B:283:0x06e5, B:284:0x06fb, B:285:0x0711, B:286:0x0727, B:287:0x073c), top: B:43:0x075d }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x076d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0796 A[LOOP:3: B:63:0x0794->B:64:0x0796, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x07a6  */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r23v0, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void r(m0 m0Var, AbstractC5911q abstractC5911q, Object obj, C5905k c5905k, C5910p c5910p) throws IOException {
        m0 m0Var2;
        Object obj2;
        Object obj3;
        int i11;
        int i12;
        m0 m0Var3;
        T t2;
        C5905k c5905k2;
        Throwable th2;
        int P11;
        F f7;
        C5905k c5905k3;
        V<T> v11;
        Object obj4;
        Object j11;
        T t11;
        int n11;
        C5919z.c j12;
        T t12;
        Object obj5;
        V<T> v12 = this;
        C5910p c5910p2 = c5910p;
        int[] iArr = v12.f59333h;
        int i13 = v12.f59335j;
        int i14 = v12.f59334i;
        ?? r11 = 0;
        C5905k c5905k4 = c5905k;
        Object obj6 = null;
        while (true) {
            try {
                int b11 = c5905k4.b();
                try {
                    int M11 = (b11 < v12.f59328c || b11 > v12.f59329d) ? -1 : v12.M(b11, 0);
                    if (M11 >= 0) {
                        m0Var3 = m0Var;
                        t2 = obj;
                        obj3 = obj6;
                        try {
                            int Q11 = v12.Q(M11);
                            try {
                                P11 = P(Q11);
                                th2 = r11;
                                f7 = v12.f59337l;
                            } catch (A.a unused) {
                                c5905k2 = c5905k4;
                                i11 = i14;
                                th2 = r11;
                            }
                            switch (P11) {
                                case 0:
                                    c5905k2 = c5905k4;
                                    i11 = i14;
                                    p0.D(t2, y(Q11), c5905k2.l());
                                    v12.K(t2, M11);
                                    v12 = this;
                                    c5905k4 = c5905k2;
                                    i14 = i11;
                                    obj6 = obj3;
                                    r11 = th2;
                                case 1:
                                    c5905k2 = c5905k4;
                                    i11 = i14;
                                    p0.E(t2, y(Q11), c5905k2.t());
                                    v12.K(t2, M11);
                                    v12 = this;
                                    c5905k4 = c5905k2;
                                    i14 = i11;
                                    obj6 = obj3;
                                    r11 = th2;
                                case 2:
                                    c5905k2 = c5905k4;
                                    i11 = i14;
                                    p0.G(t2, y(Q11), c5905k2.y());
                                    v12.K(t2, M11);
                                    v12 = this;
                                    c5905k4 = c5905k2;
                                    i14 = i11;
                                    obj6 = obj3;
                                    r11 = th2;
                                case 3:
                                    c5905k2 = c5905k4;
                                    i11 = i14;
                                    p0.G(t2, y(Q11), c5905k2.P());
                                    v12.K(t2, M11);
                                    v12 = this;
                                    c5905k4 = c5905k2;
                                    i14 = i11;
                                    obj6 = obj3;
                                    r11 = th2;
                                case 4:
                                    c5905k2 = c5905k4;
                                    i11 = i14;
                                    p0.F(t2, y(Q11), c5905k2.w());
                                    v12.K(t2, M11);
                                    v12 = this;
                                    c5905k4 = c5905k2;
                                    i14 = i11;
                                    obj6 = obj3;
                                    r11 = th2;
                                case 5:
                                    c5905k2 = c5905k4;
                                    i11 = i14;
                                    p0.G(t2, y(Q11), c5905k2.r());
                                    v12.K(t2, M11);
                                    v12 = this;
                                    c5905k4 = c5905k2;
                                    i14 = i11;
                                    obj6 = obj3;
                                    r11 = th2;
                                case 6:
                                    c5905k2 = c5905k4;
                                    i11 = i14;
                                    p0.F(t2, y(Q11), c5905k2.p());
                                    v12.K(t2, M11);
                                    v12 = this;
                                    c5905k4 = c5905k2;
                                    i14 = i11;
                                    obj6 = obj3;
                                    r11 = th2;
                                case 7:
                                    c5905k2 = c5905k4;
                                    i11 = i14;
                                    p0.z(t2, y(Q11), c5905k2.h());
                                    v12.K(t2, M11);
                                    v12 = this;
                                    c5905k4 = c5905k2;
                                    i14 = i11;
                                    obj6 = obj3;
                                    r11 = th2;
                                case 8:
                                    c5905k2 = c5905k4;
                                    i11 = i14;
                                    v12.H(Q11, c5905k2, t2);
                                    v12.K(t2, M11);
                                    v12 = this;
                                    c5905k4 = c5905k2;
                                    i14 = i11;
                                    obj6 = obj3;
                                    r11 = th2;
                                case 9:
                                    c5905k2 = c5905k4;
                                    i11 = i14;
                                    S s11 = (S) v12.v(t2, M11);
                                    c5905k2.f(s11, v12.l(M11), c5910p2);
                                    v12.N(t2, M11, s11);
                                    v12 = this;
                                    c5905k4 = c5905k2;
                                    i14 = i11;
                                    obj6 = obj3;
                                    r11 = th2;
                                case 10:
                                    c5905k2 = c5905k4;
                                    i11 = i14;
                                    p0.H(t2, y(Q11), c5905k2.j());
                                    v12.K(t2, M11);
                                    v12 = this;
                                    c5905k4 = c5905k2;
                                    i14 = i11;
                                    obj6 = obj3;
                                    r11 = th2;
                                case 11:
                                    c5905k2 = c5905k4;
                                    i11 = i14;
                                    p0.F(t2, y(Q11), c5905k2.N());
                                    v12.K(t2, M11);
                                    v12 = this;
                                    c5905k4 = c5905k2;
                                    i14 = i11;
                                    obj6 = obj3;
                                    r11 = th2;
                                case 12:
                                    c5905k2 = c5905k4;
                                    i11 = i14;
                                    int n12 = c5905k2.n();
                                    C5919z.c j13 = v12.j(M11);
                                    if (j13 != null && !j13.a()) {
                                        obj3 = g0.m(t2, b11, n12, obj3, m0Var3);
                                        v12 = this;
                                        c5905k4 = c5905k2;
                                        i14 = i11;
                                        obj6 = obj3;
                                        r11 = th2;
                                    }
                                    p0.F(t2, y(Q11), n12);
                                    v12.K(t2, M11);
                                    v12 = this;
                                    c5905k4 = c5905k2;
                                    i14 = i11;
                                    obj6 = obj3;
                                    r11 = th2;
                                    break;
                                case 13:
                                    c5905k2 = c5905k4;
                                    i11 = i14;
                                    p0.F(t2, y(Q11), c5905k2.C());
                                    v12.K(t2, M11);
                                    v12 = this;
                                    c5905k4 = c5905k2;
                                    i14 = i11;
                                    obj6 = obj3;
                                    r11 = th2;
                                case 14:
                                    c5905k2 = c5905k4;
                                    i11 = i14;
                                    p0.G(t2, y(Q11), c5905k2.E());
                                    v12.K(t2, M11);
                                    v12 = this;
                                    c5905k4 = c5905k2;
                                    i14 = i11;
                                    obj6 = obj3;
                                    r11 = th2;
                                case 15:
                                    c5905k2 = c5905k4;
                                    i11 = i14;
                                    p0.F(t2, y(Q11), c5905k2.G());
                                    v12.K(t2, M11);
                                    v12 = this;
                                    c5905k4 = c5905k2;
                                    i14 = i11;
                                    obj6 = obj3;
                                    r11 = th2;
                                case 16:
                                    c5905k2 = c5905k4;
                                    i11 = i14;
                                    p0.G(t2, y(Q11), c5905k2.I());
                                    v12.K(t2, M11);
                                    v12 = this;
                                    c5905k4 = c5905k2;
                                    i14 = i11;
                                    obj6 = obj3;
                                    r11 = th2;
                                case 17:
                                    c5905k2 = c5905k4;
                                    i11 = i14;
                                    S s12 = (S) v12.v(t2, M11);
                                    c5905k2.d(s12, v12.l(M11), c5910p2);
                                    v12.N(t2, M11, s12);
                                    v12 = this;
                                    c5905k4 = c5905k2;
                                    i14 = i11;
                                    obj6 = obj3;
                                    r11 = th2;
                                case 18:
                                    c5905k2 = c5905k4;
                                    i11 = i14;
                                    c5905k2.m(f7.a(y(Q11), t2));
                                    v12 = this;
                                    c5905k4 = c5905k2;
                                    i14 = i11;
                                    obj6 = obj3;
                                    r11 = th2;
                                case 19:
                                    c5905k2 = c5905k4;
                                    i11 = i14;
                                    c5905k2.u(f7.a(y(Q11), t2));
                                    v12 = this;
                                    c5905k4 = c5905k2;
                                    i14 = i11;
                                    obj6 = obj3;
                                    r11 = th2;
                                case 20:
                                    c5905k2 = c5905k4;
                                    i11 = i14;
                                    c5905k2.z(f7.a(y(Q11), t2));
                                    v12 = this;
                                    c5905k4 = c5905k2;
                                    i14 = i11;
                                    obj6 = obj3;
                                    r11 = th2;
                                case 21:
                                    c5905k2 = c5905k4;
                                    i11 = i14;
                                    c5905k2.Q(f7.a(y(Q11), t2));
                                    v12 = this;
                                    c5905k4 = c5905k2;
                                    i14 = i11;
                                    obj6 = obj3;
                                    r11 = th2;
                                case 22:
                                    c5905k2 = c5905k4;
                                    i11 = i14;
                                    c5905k2.x(f7.a(y(Q11), t2));
                                    v12 = this;
                                    c5905k4 = c5905k2;
                                    i14 = i11;
                                    obj6 = obj3;
                                    r11 = th2;
                                case 23:
                                    c5905k2 = c5905k4;
                                    i11 = i14;
                                    c5905k2.s(f7.a(y(Q11), t2));
                                    v12 = this;
                                    c5905k4 = c5905k2;
                                    i14 = i11;
                                    obj6 = obj3;
                                    r11 = th2;
                                case 24:
                                    c5905k2 = c5905k4;
                                    i11 = i14;
                                    c5905k2.q(f7.a(y(Q11), t2));
                                    v12 = this;
                                    c5905k4 = c5905k2;
                                    i14 = i11;
                                    obj6 = obj3;
                                    r11 = th2;
                                case TombstoneProtos$Tombstone.GUEST_THREADS_FIELD_NUMBER /* 25 */:
                                    c5905k2 = c5905k4;
                                    i11 = i14;
                                    c5905k2.i(f7.a(y(Q11), t2));
                                    v12 = this;
                                    c5905k4 = c5905k2;
                                    i14 = i11;
                                    obj6 = obj3;
                                    r11 = th2;
                                case TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER /* 26 */:
                                    c5905k2 = c5905k4;
                                    i11 = i14;
                                    obj2 = t2;
                                    m0Var2 = m0Var3;
                                    try {
                                        v12.I(Q11, c5905k2, obj2);
                                    } catch (A.a unused2) {
                                        try {
                                            m0Var2.getClass();
                                            if (obj3 == null) {
                                                obj3 = m0Var2.f(obj2);
                                            }
                                            if (!m0Var2.l(0, c5905k2, obj3)) {
                                                int i15 = i11;
                                                while (i15 < i13) {
                                                    v12.i(obj2, iArr[i15], obj3, m0Var2, obj);
                                                    i15++;
                                                    v12 = this;
                                                }
                                                if (obj3 != null) {
                                                    m0Var2.n(obj2, obj3);
                                                    return;
                                                }
                                                return;
                                            }
                                            v12 = this;
                                            c5905k4 = c5905k2;
                                            i14 = i11;
                                            obj6 = obj3;
                                            r11 = th2;
                                        } catch (Throwable th3) {
                                            th = th3;
                                            obj6 = obj3;
                                            for (i12 = i11; i12 < i13; i12++) {
                                                i(obj2, iArr[i12], obj6, m0Var2, obj);
                                            }
                                            m0 m0Var4 = m0Var2;
                                            if (obj6 != null) {
                                                m0Var4.n(obj2, obj6);
                                            }
                                            throw th;
                                        }
                                    }
                                    v12 = this;
                                    c5905k4 = c5905k2;
                                    i14 = i11;
                                    obj6 = obj3;
                                    r11 = th2;
                                case DescriptorProtos$FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                                    i11 = i14;
                                    obj2 = t2;
                                    m0Var2 = m0Var3;
                                    try {
                                        c5905k2 = c5905k4;
                                        try {
                                            v12.G(obj2, Q11, c5905k2, v12.l(M11), c5910p);
                                            c5910p2 = c5910p;
                                        } catch (A.a unused3) {
                                            c5910p2 = c5910p;
                                            m0Var2.getClass();
                                            if (obj3 == null) {
                                            }
                                            if (!m0Var2.l(0, c5905k2, obj3)) {
                                            }
                                            v12 = this;
                                            c5905k4 = c5905k2;
                                            i14 = i11;
                                            obj6 = obj3;
                                            r11 = th2;
                                        }
                                        v12 = this;
                                        c5905k4 = c5905k2;
                                        i14 = i11;
                                        obj6 = obj3;
                                        r11 = th2;
                                    } catch (Throwable th4) {
                                        th = th4;
                                        obj6 = obj3;
                                        while (i12 < i13) {
                                        }
                                        m0 m0Var42 = m0Var2;
                                        if (obj6 != null) {
                                        }
                                        throw th;
                                    }
                                    break;
                                case 28:
                                    i11 = i14;
                                    c5905k3 = c5905k4;
                                    v11 = v12;
                                    c5905k3.k(f7.a(y(Q11), t2));
                                    c5910p2 = c5910p;
                                    c5905k2 = c5905k3;
                                    v12 = this;
                                    c5905k4 = c5905k2;
                                    i14 = i11;
                                    obj6 = obj3;
                                    r11 = th2;
                                case 29:
                                    i11 = i14;
                                    obj2 = t2;
                                    c5905k3 = c5905k4;
                                    m0Var2 = m0Var3;
                                    v11 = v12;
                                    try {
                                        c5905k3.O(f7.a(y(Q11), obj2));
                                        c5910p2 = c5910p;
                                        c5905k2 = c5905k3;
                                    } catch (A.a unused4) {
                                        c5910p2 = c5910p;
                                        v12 = v11;
                                        c5905k2 = c5905k3;
                                        m0Var2.getClass();
                                        if (obj3 == null) {
                                        }
                                        if (!m0Var2.l(0, c5905k2, obj3)) {
                                        }
                                        v12 = this;
                                        c5905k4 = c5905k2;
                                        i14 = i11;
                                        obj6 = obj3;
                                        r11 = th2;
                                    }
                                    v12 = this;
                                    c5905k4 = c5905k2;
                                    i14 = i11;
                                    obj6 = obj3;
                                    r11 = th2;
                                    break;
                                case AppUpdateInfo.Factory.DAYS_BETWEEN_30 /* 30 */:
                                    v11 = v12;
                                    i11 = i14;
                                    obj2 = t2;
                                    c5905k3 = c5905k4;
                                    C5919z.d a11 = f7.a(y(Q11), obj2);
                                    try {
                                        c5905k3.o(a11);
                                        obj4 = obj2;
                                    } catch (Throwable th5) {
                                        th = th5;
                                        m0Var2 = m0Var;
                                        obj6 = obj3;
                                        while (i12 < i13) {
                                        }
                                        m0 m0Var422 = m0Var2;
                                        if (obj6 != null) {
                                        }
                                        throw th;
                                    }
                                    try {
                                        j11 = g0.j(obj4, b11, a11, v11.j(M11), obj3, m0Var);
                                        c5910p2 = c5910p;
                                        obj3 = j11;
                                        c5905k2 = c5905k3;
                                    } catch (A.a unused5) {
                                        obj3 = obj3;
                                        m0Var2 = m0Var;
                                        c5910p2 = c5910p;
                                        obj2 = obj4;
                                        v12 = v11;
                                        c5905k2 = c5905k3;
                                        m0Var2.getClass();
                                        if (obj3 == null) {
                                        }
                                        if (!m0Var2.l(0, c5905k2, obj3)) {
                                        }
                                        v12 = this;
                                        c5905k4 = c5905k2;
                                        i14 = i11;
                                        obj6 = obj3;
                                        r11 = th2;
                                    } catch (Throwable th6) {
                                        th = th6;
                                        obj2 = obj4;
                                        obj3 = obj3;
                                        m0Var2 = m0Var;
                                        obj6 = obj3;
                                        while (i12 < i13) {
                                        }
                                        m0 m0Var4222 = m0Var2;
                                        if (obj6 != null) {
                                        }
                                        throw th;
                                    }
                                    v12 = this;
                                    c5905k4 = c5905k2;
                                    i14 = i11;
                                    obj6 = obj3;
                                    r11 = th2;
                                    break;
                                case DescriptorProtos$FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                                    v11 = v12;
                                    i11 = i14;
                                    c5905k3 = c5905k4;
                                    c5905k3.D(f7.a(y(Q11), t2));
                                    c5910p2 = c5910p;
                                    c5905k2 = c5905k3;
                                    v12 = this;
                                    c5905k4 = c5905k2;
                                    i14 = i11;
                                    obj6 = obj3;
                                    r11 = th2;
                                case 32:
                                    v11 = v12;
                                    i11 = i14;
                                    c5905k3 = c5905k4;
                                    c5905k3.F(f7.a(y(Q11), t2));
                                    c5910p2 = c5910p;
                                    c5905k2 = c5905k3;
                                    v12 = this;
                                    c5905k4 = c5905k2;
                                    i14 = i11;
                                    obj6 = obj3;
                                    r11 = th2;
                                case 33:
                                    v11 = v12;
                                    i11 = i14;
                                    c5905k3 = c5905k4;
                                    c5905k3.H(f7.a(y(Q11), t2));
                                    c5910p2 = c5910p;
                                    c5905k2 = c5905k3;
                                    v12 = this;
                                    c5905k4 = c5905k2;
                                    i14 = i11;
                                    obj6 = obj3;
                                    r11 = th2;
                                case 34:
                                    v11 = v12;
                                    i11 = i14;
                                    c5905k3 = c5905k4;
                                    c5905k3.J(f7.a(y(Q11), t2));
                                    c5910p2 = c5910p;
                                    c5905k2 = c5905k3;
                                    v12 = this;
                                    c5905k4 = c5905k2;
                                    i14 = i11;
                                    obj6 = obj3;
                                    r11 = th2;
                                case DescriptorProtos$MethodOptions.FEATURES_FIELD_NUMBER /* 35 */:
                                    v11 = v12;
                                    i11 = i14;
                                    c5905k3 = c5905k4;
                                    c5905k3.m(f7.a(y(Q11), t2));
                                    c5910p2 = c5910p;
                                    c5905k2 = c5905k3;
                                    v12 = this;
                                    c5905k4 = c5905k2;
                                    i14 = i11;
                                    obj6 = obj3;
                                    r11 = th2;
                                case DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                                    v11 = v12;
                                    i11 = i14;
                                    c5905k3 = c5905k4;
                                    c5905k3.u(f7.a(y(Q11), t2));
                                    c5910p2 = c5910p;
                                    c5905k2 = c5905k3;
                                    v12 = this;
                                    c5905k4 = c5905k2;
                                    i14 = i11;
                                    obj6 = obj3;
                                    r11 = th2;
                                case DescriptorProtos$FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                                    v11 = v12;
                                    i11 = i14;
                                    c5905k3 = c5905k4;
                                    c5905k3.z(f7.a(y(Q11), t2));
                                    c5910p2 = c5910p;
                                    c5905k2 = c5905k3;
                                    v12 = this;
                                    c5905k4 = c5905k2;
                                    i14 = i11;
                                    obj6 = obj3;
                                    r11 = th2;
                                case 38:
                                    v11 = v12;
                                    i11 = i14;
                                    c5905k3 = c5905k4;
                                    c5905k3.Q(f7.a(y(Q11), t2));
                                    c5910p2 = c5910p;
                                    c5905k2 = c5905k3;
                                    v12 = this;
                                    c5905k4 = c5905k2;
                                    i14 = i11;
                                    obj6 = obj3;
                                    r11 = th2;
                                case DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                                    v11 = v12;
                                    i11 = i14;
                                    c5905k3 = c5905k4;
                                    c5905k3.x(f7.a(y(Q11), t2));
                                    c5910p2 = c5910p;
                                    c5905k2 = c5905k3;
                                    v12 = this;
                                    c5905k4 = c5905k2;
                                    i14 = i11;
                                    obj6 = obj3;
                                    r11 = th2;
                                case 40:
                                    v11 = v12;
                                    i11 = i14;
                                    c5905k3 = c5905k4;
                                    c5905k3.s(f7.a(y(Q11), t2));
                                    c5910p2 = c5910p;
                                    c5905k2 = c5905k3;
                                    v12 = this;
                                    c5905k4 = c5905k2;
                                    i14 = i11;
                                    obj6 = obj3;
                                    r11 = th2;
                                case 41:
                                    v11 = v12;
                                    i11 = i14;
                                    c5905k3 = c5905k4;
                                    c5905k3.q(f7.a(y(Q11), t2));
                                    c5910p2 = c5910p;
                                    c5905k2 = c5905k3;
                                    v12 = this;
                                    c5905k4 = c5905k2;
                                    i14 = i11;
                                    obj6 = obj3;
                                    r11 = th2;
                                case 42:
                                    v11 = v12;
                                    i11 = i14;
                                    c5905k3 = c5905k4;
                                    c5905k3.i(f7.a(y(Q11), t2));
                                    c5910p2 = c5910p;
                                    c5905k2 = c5905k3;
                                    v12 = this;
                                    c5905k4 = c5905k2;
                                    i14 = i11;
                                    obj6 = obj3;
                                    r11 = th2;
                                case 43:
                                    v11 = v12;
                                    i11 = i14;
                                    obj2 = t2;
                                    c5905k3 = c5905k4;
                                    try {
                                        try {
                                            c5905k3.O(f7.a(y(Q11), obj2));
                                            c5910p2 = c5910p;
                                            c5905k2 = c5905k3;
                                        } catch (A.a unused6) {
                                            m0Var2 = m0Var;
                                            c5910p2 = c5910p;
                                            v12 = v11;
                                            c5905k2 = c5905k3;
                                            m0Var2.getClass();
                                            if (obj3 == null) {
                                            }
                                            if (!m0Var2.l(0, c5905k2, obj3)) {
                                            }
                                            v12 = this;
                                            c5905k4 = c5905k2;
                                            i14 = i11;
                                            obj6 = obj3;
                                            r11 = th2;
                                        }
                                        v12 = this;
                                        c5905k4 = c5905k2;
                                        i14 = i11;
                                        obj6 = obj3;
                                        r11 = th2;
                                    } catch (Throwable th7) {
                                        th = th7;
                                        m0Var2 = m0Var;
                                        obj6 = obj3;
                                        while (i12 < i13) {
                                        }
                                        m0 m0Var42222 = m0Var2;
                                        if (obj6 != null) {
                                        }
                                        throw th;
                                    }
                                    break;
                                case DescriptorProtos$FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                                    v11 = v12;
                                    obj4 = t2;
                                    i11 = i14;
                                    c5905k3 = c5905k4;
                                    try {
                                        C5919z.d a12 = f7.a(y(Q11), obj4);
                                        c5905k3.o(a12);
                                        try {
                                            j11 = g0.j(obj4, b11, a12, v11.j(M11), obj3, m0Var3);
                                            c5910p2 = c5910p;
                                            obj3 = j11;
                                            c5905k2 = c5905k3;
                                        } catch (A.a unused7) {
                                            obj3 = obj3;
                                            m0Var2 = m0Var;
                                            c5910p2 = c5910p;
                                            obj2 = obj4;
                                            v12 = v11;
                                            c5905k2 = c5905k3;
                                            m0Var2.getClass();
                                            if (obj3 == null) {
                                            }
                                            if (!m0Var2.l(0, c5905k2, obj3)) {
                                            }
                                            v12 = this;
                                            c5905k4 = c5905k2;
                                            i14 = i11;
                                            obj6 = obj3;
                                            r11 = th2;
                                        } catch (Throwable th8) {
                                            th = th8;
                                            obj2 = obj4;
                                            obj3 = obj3;
                                            m0Var2 = m0Var;
                                            obj6 = obj3;
                                            while (i12 < i13) {
                                            }
                                            m0 m0Var422222 = m0Var2;
                                            if (obj6 != null) {
                                            }
                                            throw th;
                                        }
                                    } catch (A.a unused8) {
                                    } catch (Throwable th9) {
                                        th = th9;
                                        obj2 = obj4;
                                    }
                                    v12 = this;
                                    c5905k4 = c5905k2;
                                    i14 = i11;
                                    obj6 = obj3;
                                    r11 = th2;
                                    break;
                                case DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                                    v11 = v12;
                                    obj4 = t2;
                                    i11 = i14;
                                    c5905k3 = c5905k4;
                                    c5905k3.D(f7.a(y(Q11), obj4));
                                    c5910p2 = c5910p;
                                    c5905k2 = c5905k3;
                                    v12 = this;
                                    c5905k4 = c5905k2;
                                    i14 = i11;
                                    obj6 = obj3;
                                    r11 = th2;
                                case 46:
                                    v11 = v12;
                                    obj4 = t2;
                                    i11 = i14;
                                    c5905k3 = c5905k4;
                                    c5905k3.F(f7.a(y(Q11), obj4));
                                    c5910p2 = c5910p;
                                    c5905k2 = c5905k3;
                                    v12 = this;
                                    c5905k4 = c5905k2;
                                    i14 = i11;
                                    obj6 = obj3;
                                    r11 = th2;
                                case 47:
                                    v11 = v12;
                                    obj4 = t2;
                                    i11 = i14;
                                    c5905k3 = c5905k4;
                                    c5905k3.H(f7.a(y(Q11), obj4));
                                    c5910p2 = c5910p;
                                    c5905k2 = c5905k3;
                                    v12 = this;
                                    c5905k4 = c5905k2;
                                    i14 = i11;
                                    obj6 = obj3;
                                    r11 = th2;
                                case 48:
                                    v11 = v12;
                                    obj4 = t2;
                                    m0Var2 = m0Var3;
                                    i11 = i14;
                                    c5905k3 = c5905k4;
                                    try {
                                        c5905k3.J(f7.a(y(Q11), obj4));
                                        c5910p2 = c5910p;
                                        c5905k2 = c5905k3;
                                    } catch (A.a unused9) {
                                        c5910p2 = c5910p;
                                        obj2 = obj4;
                                        v12 = v11;
                                        c5905k2 = c5905k3;
                                        m0Var2.getClass();
                                        if (obj3 == null) {
                                        }
                                        if (!m0Var2.l(0, c5905k2, obj3)) {
                                        }
                                        v12 = this;
                                        c5905k4 = c5905k2;
                                        i14 = i11;
                                        obj6 = obj3;
                                        r11 = th2;
                                    } catch (Throwable th10) {
                                        th = th10;
                                        obj2 = obj4;
                                        obj6 = obj3;
                                        while (i12 < i13) {
                                        }
                                        m0 m0Var4222222 = m0Var2;
                                        if (obj6 != null) {
                                        }
                                        throw th;
                                    }
                                    v12 = this;
                                    c5905k4 = c5905k2;
                                    i14 = i11;
                                    obj6 = obj3;
                                    r11 = th2;
                                    break;
                                case 49:
                                    m0Var2 = m0Var3;
                                    i11 = i14;
                                    try {
                                        try {
                                            obj2 = obj;
                                        } catch (Throwable th11) {
                                            th = th11;
                                            obj4 = obj;
                                        }
                                    } catch (A.a unused10) {
                                        obj2 = obj;
                                        c5905k2 = c5905k;
                                    }
                                    try {
                                        v12.F(obj2, y(Q11), c5905k, v12.l(M11), c5910p);
                                        v11 = v12;
                                        obj4 = obj2;
                                        c5905k3 = c5905k;
                                        c5910p2 = c5910p;
                                        c5905k2 = c5905k3;
                                    } catch (A.a unused11) {
                                        c5905k2 = c5905k;
                                        c5910p2 = c5910p;
                                        m0Var2.getClass();
                                        if (obj3 == null) {
                                        }
                                        if (!m0Var2.l(0, c5905k2, obj3)) {
                                        }
                                        v12 = this;
                                        c5905k4 = c5905k2;
                                        i14 = i11;
                                        obj6 = obj3;
                                        r11 = th2;
                                    } catch (Throwable th12) {
                                        th = th12;
                                        obj4 = obj2;
                                        obj2 = obj4;
                                        obj6 = obj3;
                                        while (i12 < i13) {
                                        }
                                        m0 m0Var42222222 = m0Var2;
                                        if (obj6 != null) {
                                        }
                                        throw th;
                                    }
                                    v12 = this;
                                    c5905k4 = c5905k2;
                                    i14 = i11;
                                    obj6 = obj3;
                                    r11 = th2;
                                    break;
                                case 50:
                                    m0Var2 = m0Var3;
                                    i11 = i14;
                                    try {
                                        v12.s(t2, M11, v12.k(M11), c5910p2, c5905k4);
                                        throw th2;
                                        break;
                                    } catch (Throwable th13) {
                                        th = th13;
                                        obj2 = obj;
                                        obj6 = obj3;
                                        while (i12 < i13) {
                                        }
                                        m0 m0Var422222222 = m0Var2;
                                        if (obj6 != null) {
                                        }
                                        throw th;
                                    }
                                case 51:
                                    t11 = t2;
                                    i11 = i14;
                                    p0.H(t11, y(Q11), Double.valueOf(c5905k4.l()));
                                    v12.L(t11, b11, M11);
                                    c5905k2 = c5905k4;
                                    v12 = this;
                                    c5905k4 = c5905k2;
                                    i14 = i11;
                                    obj6 = obj3;
                                    r11 = th2;
                                case 52:
                                    t11 = t2;
                                    i11 = i14;
                                    p0.H(t11, y(Q11), Float.valueOf(c5905k4.t()));
                                    v12.L(t11, b11, M11);
                                    c5905k2 = c5905k4;
                                    v12 = this;
                                    c5905k4 = c5905k2;
                                    i14 = i11;
                                    obj6 = obj3;
                                    r11 = th2;
                                case 53:
                                    t11 = t2;
                                    i11 = i14;
                                    p0.H(t11, y(Q11), Long.valueOf(c5905k4.y()));
                                    v12.L(t11, b11, M11);
                                    c5905k2 = c5905k4;
                                    v12 = this;
                                    c5905k4 = c5905k2;
                                    i14 = i11;
                                    obj6 = obj3;
                                    r11 = th2;
                                case 54:
                                    t11 = t2;
                                    i11 = i14;
                                    p0.H(t11, y(Q11), Long.valueOf(c5905k4.P()));
                                    v12.L(t11, b11, M11);
                                    c5905k2 = c5905k4;
                                    v12 = this;
                                    c5905k4 = c5905k2;
                                    i14 = i11;
                                    obj6 = obj3;
                                    r11 = th2;
                                case 55:
                                    t11 = t2;
                                    i11 = i14;
                                    p0.H(t11, y(Q11), Integer.valueOf(c5905k4.w()));
                                    v12.L(t11, b11, M11);
                                    c5905k2 = c5905k4;
                                    v12 = this;
                                    c5905k4 = c5905k2;
                                    i14 = i11;
                                    obj6 = obj3;
                                    r11 = th2;
                                case 56:
                                    t11 = t2;
                                    i11 = i14;
                                    p0.H(t11, y(Q11), Long.valueOf(c5905k4.r()));
                                    v12.L(t11, b11, M11);
                                    c5905k2 = c5905k4;
                                    v12 = this;
                                    c5905k4 = c5905k2;
                                    i14 = i11;
                                    obj6 = obj3;
                                    r11 = th2;
                                case 57:
                                    t11 = t2;
                                    i11 = i14;
                                    p0.H(t11, y(Q11), Integer.valueOf(c5905k4.p()));
                                    v12.L(t11, b11, M11);
                                    c5905k2 = c5905k4;
                                    v12 = this;
                                    c5905k4 = c5905k2;
                                    i14 = i11;
                                    obj6 = obj3;
                                    r11 = th2;
                                case 58:
                                    t11 = t2;
                                    i11 = i14;
                                    p0.H(t11, y(Q11), Boolean.valueOf(c5905k4.h()));
                                    v12.L(t11, b11, M11);
                                    c5905k2 = c5905k4;
                                    v12 = this;
                                    c5905k4 = c5905k2;
                                    i14 = i11;
                                    obj6 = obj3;
                                    r11 = th2;
                                case 59:
                                    t11 = t2;
                                    i11 = i14;
                                    v12.H(Q11, c5905k4, t11);
                                    v12.L(t11, b11, M11);
                                    c5905k2 = c5905k4;
                                    v12 = this;
                                    c5905k4 = c5905k2;
                                    i14 = i11;
                                    obj6 = obj3;
                                    r11 = th2;
                                case 60:
                                    t11 = t2;
                                    i11 = i14;
                                    S s13 = (S) v12.w(t11, b11, M11);
                                    c5905k4.f(s13, v12.l(M11), c5910p2);
                                    v12.O(t11, b11, M11, s13);
                                    c5905k2 = c5905k4;
                                    v12 = this;
                                    c5905k4 = c5905k2;
                                    i14 = i11;
                                    obj6 = obj3;
                                    r11 = th2;
                                case 61:
                                    t11 = t2;
                                    i11 = i14;
                                    p0.H(t11, y(Q11), c5905k4.j());
                                    v12.L(t11, b11, M11);
                                    c5905k2 = c5905k4;
                                    v12 = this;
                                    c5905k4 = c5905k2;
                                    i14 = i11;
                                    obj6 = obj3;
                                    r11 = th2;
                                case 62:
                                    t11 = t2;
                                    i11 = i14;
                                    p0.H(t11, y(Q11), Integer.valueOf(c5905k4.N()));
                                    v12.L(t11, b11, M11);
                                    c5905k2 = c5905k4;
                                    v12 = this;
                                    c5905k4 = c5905k2;
                                    i14 = i11;
                                    obj6 = obj3;
                                    r11 = th2;
                                case 63:
                                    m0Var2 = m0Var3;
                                    t11 = t2;
                                    try {
                                        n11 = c5905k4.n();
                                        j12 = v12.j(M11);
                                    } catch (A.a unused12) {
                                        i11 = i14;
                                        obj3 = obj3;
                                        break;
                                    } catch (Throwable th14) {
                                        th = th14;
                                        i11 = i14;
                                        obj3 = obj3;
                                        break;
                                    }
                                    if (j12 != null) {
                                        try {
                                        } catch (A.a unused13) {
                                            obj3 = obj3;
                                            c5905k2 = c5905k4;
                                            obj2 = t11;
                                            i11 = i14;
                                            m0Var2.getClass();
                                            if (obj3 == null) {
                                            }
                                            if (!m0Var2.l(0, c5905k2, obj3)) {
                                            }
                                            v12 = this;
                                            c5905k4 = c5905k2;
                                            i14 = i11;
                                            obj6 = obj3;
                                            r11 = th2;
                                        } catch (Throwable th15) {
                                            th = th15;
                                            obj3 = obj3;
                                            obj2 = t11;
                                            i11 = i14;
                                            obj6 = obj3;
                                            while (i12 < i13) {
                                            }
                                            m0 m0Var4222222222 = m0Var2;
                                            if (obj6 != null) {
                                            }
                                            throw th;
                                        }
                                        if (j12.a()) {
                                            i11 = i14;
                                            obj3 = obj3;
                                        } else {
                                            obj6 = g0.m(t11, b11, n11, obj3, m0Var2);
                                            obj3 = obj6;
                                            c5905k2 = c5905k4;
                                            i11 = i14;
                                            v12 = this;
                                            c5905k4 = c5905k2;
                                            i14 = i11;
                                            obj6 = obj3;
                                            r11 = th2;
                                        }
                                    } else {
                                        obj3 = obj3;
                                        i11 = i14;
                                    }
                                    p0.H(t11, y(Q11), Integer.valueOf(n11));
                                    v12.L(t11, b11, M11);
                                    c5905k2 = c5905k4;
                                    v12 = this;
                                    c5905k4 = c5905k2;
                                    i14 = i11;
                                    obj6 = obj3;
                                    r11 = th2;
                                    break;
                                case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
                                    t12 = t2;
                                    obj5 = obj3;
                                    p0.H(t12, y(Q11), Integer.valueOf(c5905k4.C()));
                                    v12.L(t12, b11, M11);
                                    c5905k2 = c5905k4;
                                    i11 = i14;
                                    obj3 = obj5;
                                    v12 = this;
                                    c5905k4 = c5905k2;
                                    i14 = i11;
                                    obj6 = obj3;
                                    r11 = th2;
                                case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                                    t12 = t2;
                                    obj5 = obj3;
                                    p0.H(t12, y(Q11), Long.valueOf(c5905k4.E()));
                                    v12.L(t12, b11, M11);
                                    c5905k2 = c5905k4;
                                    i11 = i14;
                                    obj3 = obj5;
                                    v12 = this;
                                    c5905k4 = c5905k2;
                                    i14 = i11;
                                    obj6 = obj3;
                                    r11 = th2;
                                case 66:
                                    t12 = t2;
                                    obj5 = obj3;
                                    p0.H(t12, y(Q11), Integer.valueOf(c5905k4.G()));
                                    v12.L(t12, b11, M11);
                                    c5905k2 = c5905k4;
                                    i11 = i14;
                                    obj3 = obj5;
                                    v12 = this;
                                    c5905k4 = c5905k2;
                                    i14 = i11;
                                    obj6 = obj3;
                                    r11 = th2;
                                case 67:
                                    m0Var2 = m0Var3;
                                    t12 = t2;
                                    obj5 = obj3;
                                    try {
                                        p0.H(t12, y(Q11), Long.valueOf(c5905k4.I()));
                                        v12.L(t12, b11, M11);
                                        c5905k2 = c5905k4;
                                        i11 = i14;
                                        obj3 = obj5;
                                    } catch (A.a unused14) {
                                        c5905k2 = c5905k4;
                                        obj2 = t12;
                                        i11 = i14;
                                        obj3 = obj5;
                                        m0Var2.getClass();
                                        if (obj3 == null) {
                                        }
                                        if (!m0Var2.l(0, c5905k2, obj3)) {
                                        }
                                        v12 = this;
                                        c5905k4 = c5905k2;
                                        i14 = i11;
                                        obj6 = obj3;
                                        r11 = th2;
                                    } catch (Throwable th16) {
                                        th = th16;
                                        obj2 = t12;
                                        i11 = i14;
                                        obj6 = obj5;
                                        while (i12 < i13) {
                                        }
                                        m0 m0Var42222222222 = m0Var2;
                                        if (obj6 != null) {
                                        }
                                        throw th;
                                    }
                                    v12 = this;
                                    c5905k4 = c5905k2;
                                    i14 = i11;
                                    obj6 = obj3;
                                    r11 = th2;
                                    break;
                                case 68:
                                    m0Var2 = m0Var3;
                                    t11 = t2;
                                    try {
                                        S s14 = (S) v12.w(t11, b11, M11);
                                        c5905k4.d(s14, v12.l(M11), c5910p2);
                                        v12.O(t11, b11, M11, s14);
                                        c5905k2 = c5905k4;
                                        i11 = i14;
                                    } catch (A.a unused15) {
                                        c5905k2 = c5905k4;
                                        obj2 = t11;
                                        i11 = i14;
                                        m0Var2.getClass();
                                        if (obj3 == null) {
                                        }
                                        if (!m0Var2.l(0, c5905k2, obj3)) {
                                        }
                                        v12 = this;
                                        c5905k4 = c5905k2;
                                        i14 = i11;
                                        obj6 = obj3;
                                        r11 = th2;
                                    } catch (Throwable th17) {
                                        th = th17;
                                        obj2 = t11;
                                        i11 = i14;
                                        obj6 = obj3;
                                        while (i12 < i13) {
                                        }
                                        m0 m0Var422222222222 = m0Var2;
                                        if (obj6 != null) {
                                        }
                                        throw th;
                                    }
                                    v12 = this;
                                    c5905k4 = c5905k2;
                                    i14 = i11;
                                    obj6 = obj3;
                                    r11 = th2;
                                    break;
                                default:
                                    if (obj3 == null) {
                                        try {
                                            try {
                                                obj6 = m0Var3.f(t2);
                                            } catch (Throwable th18) {
                                                th = th18;
                                                i11 = i14;
                                                obj6 = obj3;
                                                obj2 = t2;
                                                m0Var2 = m0Var3;
                                                while (i12 < i13) {
                                                }
                                                m0 m0Var4222222222222 = m0Var2;
                                                if (obj6 != null) {
                                                }
                                                throw th;
                                            }
                                        } catch (A.a unused16) {
                                            c5905k2 = c5905k4;
                                            i11 = i14;
                                            obj2 = t2;
                                            m0Var2 = m0Var3;
                                            m0Var2.getClass();
                                            if (obj3 == null) {
                                            }
                                            if (!m0Var2.l(0, c5905k2, obj3)) {
                                            }
                                            v12 = this;
                                            c5905k4 = c5905k2;
                                            i14 = i11;
                                            obj6 = obj3;
                                            r11 = th2;
                                        }
                                    } else {
                                        obj6 = obj3;
                                    }
                                    try {
                                    } catch (A.a unused17) {
                                        m0Var2 = m0Var3;
                                        t11 = t2;
                                        obj3 = obj6;
                                        c5905k2 = c5905k4;
                                        obj2 = t11;
                                        i11 = i14;
                                        m0Var2.getClass();
                                        if (obj3 == null) {
                                        }
                                        if (!m0Var2.l(0, c5905k2, obj3)) {
                                        }
                                        v12 = this;
                                        c5905k4 = c5905k2;
                                        i14 = i11;
                                        obj6 = obj3;
                                        r11 = th2;
                                    } catch (Throwable th19) {
                                        th = th19;
                                        m0Var2 = m0Var3;
                                        obj2 = t2;
                                        i11 = i14;
                                        while (i12 < i13) {
                                        }
                                        m0 m0Var42222222222222 = m0Var2;
                                        if (obj6 != null) {
                                        }
                                        throw th;
                                    }
                                    if (!m0Var3.l(0, c5905k4, obj6)) {
                                        while (i14 < i13) {
                                            m0 m0Var5 = m0Var3;
                                            T t13 = t2;
                                            v12.i(t13, iArr[i14], obj6, m0Var5, obj);
                                            i14++;
                                            t2 = t13;
                                            m0Var3 = m0Var5;
                                        }
                                        Object obj7 = t2;
                                        m0 m0Var6 = m0Var3;
                                        if (obj6 != null) {
                                            m0Var6.n(obj7, obj6);
                                            return;
                                        }
                                        return;
                                    }
                                    t11 = t2;
                                    obj3 = obj6;
                                    c5905k2 = c5905k4;
                                    i11 = i14;
                                    v12 = this;
                                    c5905k4 = c5905k2;
                                    i14 = i11;
                                    obj6 = obj3;
                                    r11 = th2;
                                    break;
                            }
                        } catch (Throwable th20) {
                            th = th20;
                            i11 = i14;
                            obj2 = t2;
                            m0Var2 = m0Var3;
                        }
                    } else {
                        if (b11 == Integer.MAX_VALUE) {
                            while (i14 < i13) {
                                v12.i(obj, iArr[i14], obj6, m0Var, obj);
                                i14++;
                                obj6 = obj6;
                            }
                            Object obj8 = obj6;
                            if (obj8 != null) {
                                m0Var.n(obj, obj8);
                                return;
                            }
                            return;
                        }
                        m0 m0Var7 = m0Var;
                        obj3 = obj6;
                        try {
                            AbstractC5917x.e b12 = !v12.f59331f ? r11 : abstractC5911q.b(c5910p2, v12.f59330e, b11);
                            if (b12 != null) {
                                m0Var3 = m0Var7;
                                t2 = obj;
                                abstractC5911q.d(obj);
                                abstractC5911q.g(b12);
                                throw r11;
                            }
                            m0Var7.getClass();
                            if (obj3 == null) {
                                try {
                                    obj6 = m0Var7.f(obj);
                                } catch (Throwable th21) {
                                    th = th21;
                                    m0Var2 = m0Var7;
                                    obj2 = obj;
                                    i11 = i14;
                                    obj6 = obj3;
                                    while (i12 < i13) {
                                    }
                                    m0 m0Var422222222222222 = m0Var2;
                                    if (obj6 != null) {
                                    }
                                    throw th;
                                }
                            } else {
                                obj6 = obj3;
                            }
                            try {
                                if (!m0Var7.l(0, c5905k4, obj6)) {
                                    while (i14 < i13) {
                                        v12.i(obj, iArr[i14], obj6, m0Var, obj);
                                        i14++;
                                        m0Var7 = m0Var;
                                    }
                                    m0 m0Var8 = m0Var7;
                                    if (obj6 != null) {
                                        m0Var8.n(obj, obj6);
                                        return;
                                    }
                                    return;
                                }
                            } catch (Throwable th22) {
                                th = th22;
                                t2 = obj;
                                m0Var3 = m0Var7;
                                i11 = i14;
                                obj2 = t2;
                                m0Var2 = m0Var3;
                                while (i12 < i13) {
                                }
                                m0 m0Var4222222222222222 = m0Var2;
                                if (obj6 != null) {
                                }
                                throw th;
                            }
                        } catch (Throwable th23) {
                            th = th23;
                            m0Var3 = m0Var7;
                            t2 = obj;
                            i11 = i14;
                            obj6 = obj3;
                            obj2 = t2;
                            m0Var2 = m0Var3;
                            while (i12 < i13) {
                            }
                            m0 m0Var42222222222222222 = m0Var2;
                            if (obj6 != null) {
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th24) {
                    th = th24;
                    m0Var2 = m0Var;
                    obj2 = obj;
                    obj3 = obj6;
                    i11 = i14;
                    obj6 = obj3;
                    while (i12 < i13) {
                    }
                    m0 m0Var422222222222222222 = m0Var2;
                    if (obj6 != null) {
                    }
                    throw th;
                }
            } catch (Throwable th25) {
                th = th25;
            }
        }
    }

    private final void s(Object obj, int i11, Object obj2, C5910p c5910p, C5905k c5905k) throws IOException {
        long Q11 = Q(i11) & 1048575;
        Object v11 = p0.v(obj, Q11);
        M m11 = this.f59340o;
        if (v11 == null) {
            v11 = m11.a();
            p0.H(obj, Q11, v11);
        } else if (m11.isImmutable(v11)) {
            L a11 = m11.a();
            m11.mergeFrom(a11, v11);
            p0.H(obj, Q11, a11);
            v11 = a11;
        }
        m11.forMutableMapData(v11);
        m11.forMapMetadata(obj2);
        c5905k.A();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void t(T t2, T t11, int i11) {
        if (n(t11, i11)) {
            long Q11 = Q(i11) & 1048575;
            Unsafe unsafe = f59324q;
            Object object = unsafe.getObject(t11, Q11);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f59326a[i11] + " is present but null: " + t11);
            }
            f0 l11 = l(i11);
            if (!n(t2, i11)) {
                if (p(object)) {
                    Object newInstance = l11.newInstance();
                    l11.mergeFrom(newInstance, object);
                    unsafe.putObject(t2, Q11, newInstance);
                } else {
                    unsafe.putObject(t2, Q11, object);
                }
                K(t2, i11);
                return;
            }
            Object object2 = unsafe.getObject(t2, Q11);
            if (!p(object2)) {
                Object newInstance2 = l11.newInstance();
                l11.mergeFrom(newInstance2, object2);
                unsafe.putObject(t2, Q11, newInstance2);
                object2 = newInstance2;
            }
            l11.mergeFrom(object2, object);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void u(T t2, T t11, int i11) {
        int[] iArr = this.f59326a;
        int i12 = iArr[i11];
        if (q(t11, i12, i11)) {
            long Q11 = Q(i11) & 1048575;
            Unsafe unsafe = f59324q;
            Object object = unsafe.getObject(t11, Q11);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i11] + " is present but null: " + t11);
            }
            f0 l11 = l(i11);
            if (!q(t2, i12, i11)) {
                if (p(object)) {
                    Object newInstance = l11.newInstance();
                    l11.mergeFrom(newInstance, object);
                    unsafe.putObject(t2, Q11, newInstance);
                } else {
                    unsafe.putObject(t2, Q11, object);
                }
                L(t2, i12, i11);
                return;
            }
            Object object2 = unsafe.getObject(t2, Q11);
            if (!p(object2)) {
                Object newInstance2 = l11.newInstance();
                l11.mergeFrom(newInstance2, object2);
                unsafe.putObject(t2, Q11, newInstance2);
                object2 = newInstance2;
            }
            l11.mergeFrom(object2, object);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Object v(T t2, int i11) {
        f0 l11 = l(i11);
        long Q11 = Q(i11) & 1048575;
        if (!n(t2, i11)) {
            return l11.newInstance();
        }
        Object object = f59324q.getObject(t2, Q11);
        if (p(object)) {
            return object;
        }
        Object newInstance = l11.newInstance();
        if (object != null) {
            l11.mergeFrom(newInstance, object);
        }
        return newInstance;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Object w(T t2, int i11, int i12) {
        f0 l11 = l(i12);
        if (!q(t2, i11, i12)) {
            return l11.newInstance();
        }
        Object object = f59324q.getObject(t2, Q(i12) & 1048575);
        if (p(object)) {
            return object;
        }
        Object newInstance = l11.newInstance();
        if (object != null) {
            l11.mergeFrom(newInstance, object);
        }
        return newInstance;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x03a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static <T> V<T> x(e0 e0Var, X x11, F f7, m0<?, ?> m0Var, AbstractC5911q<?> abstractC5911q, M m11) {
        int i11;
        int charAt;
        int i12;
        int i13;
        int i14;
        int[] iArr;
        int i15;
        int i16;
        int i17;
        int i18;
        char charAt2;
        int i19;
        char charAt3;
        int i21;
        char charAt4;
        int i22;
        char charAt5;
        int i23;
        char charAt6;
        int i24;
        char charAt7;
        int i25;
        char charAt8;
        int i26;
        char charAt9;
        int i27;
        int i28;
        int[] iArr2;
        int i29;
        int i31;
        int objectFieldOffset;
        int i32;
        int i33;
        int i34;
        int i35;
        Field J11;
        char charAt10;
        int i36;
        int i37;
        Field J12;
        Field J13;
        int i38;
        char charAt11;
        int i39;
        int i41;
        char charAt12;
        int i42;
        char charAt13;
        int i43;
        char charAt14;
        String b11 = e0Var.b();
        int length = b11.length();
        int i44 = 55296;
        if (b11.charAt(0) >= 55296) {
            int i45 = 1;
            while (true) {
                i11 = i45 + 1;
                if (b11.charAt(i45) < 55296) {
                    break;
                }
                i45 = i11;
            }
        } else {
            i11 = 1;
        }
        int i46 = i11 + 1;
        int charAt15 = b11.charAt(i11);
        if (charAt15 >= 55296) {
            int i47 = charAt15 & 8191;
            int i48 = 13;
            while (true) {
                i43 = i46 + 1;
                charAt14 = b11.charAt(i46);
                if (charAt14 < 55296) {
                    break;
                }
                i47 |= (charAt14 & 8191) << i48;
                i48 += 13;
                i46 = i43;
            }
            charAt15 = i47 | (charAt14 << i48);
            i46 = i43;
        }
        if (charAt15 == 0) {
            i13 = 0;
            i16 = 0;
            charAt = 0;
            i12 = 0;
            i15 = 0;
            i17 = 0;
            iArr = f59323p;
            i14 = 0;
        } else {
            int i49 = i46 + 1;
            int charAt16 = b11.charAt(i46);
            if (charAt16 >= 55296) {
                int i51 = charAt16 & 8191;
                int i52 = 13;
                while (true) {
                    i26 = i49 + 1;
                    charAt9 = b11.charAt(i49);
                    if (charAt9 < 55296) {
                        break;
                    }
                    i51 |= (charAt9 & 8191) << i52;
                    i52 += 13;
                    i49 = i26;
                }
                charAt16 = i51 | (charAt9 << i52);
                i49 = i26;
            }
            int i53 = i49 + 1;
            int charAt17 = b11.charAt(i49);
            if (charAt17 >= 55296) {
                int i54 = charAt17 & 8191;
                int i55 = 13;
                while (true) {
                    i25 = i53 + 1;
                    charAt8 = b11.charAt(i53);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i54 |= (charAt8 & 8191) << i55;
                    i55 += 13;
                    i53 = i25;
                }
                charAt17 = i54 | (charAt8 << i55);
                i53 = i25;
            }
            int i56 = i53 + 1;
            int charAt18 = b11.charAt(i53);
            if (charAt18 >= 55296) {
                int i57 = charAt18 & 8191;
                int i58 = 13;
                while (true) {
                    i24 = i56 + 1;
                    charAt7 = b11.charAt(i56);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i57 |= (charAt7 & 8191) << i58;
                    i58 += 13;
                    i56 = i24;
                }
                charAt18 = i57 | (charAt7 << i58);
                i56 = i24;
            }
            int i59 = i56 + 1;
            int charAt19 = b11.charAt(i56);
            if (charAt19 >= 55296) {
                int i61 = charAt19 & 8191;
                int i62 = 13;
                while (true) {
                    i23 = i59 + 1;
                    charAt6 = b11.charAt(i59);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i61 |= (charAt6 & 8191) << i62;
                    i62 += 13;
                    i59 = i23;
                }
                charAt19 = i61 | (charAt6 << i62);
                i59 = i23;
            }
            int i63 = i59 + 1;
            charAt = b11.charAt(i59);
            if (charAt >= 55296) {
                int i64 = charAt & 8191;
                int i65 = 13;
                while (true) {
                    i22 = i63 + 1;
                    charAt5 = b11.charAt(i63);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i64 |= (charAt5 & 8191) << i65;
                    i65 += 13;
                    i63 = i22;
                }
                charAt = i64 | (charAt5 << i65);
                i63 = i22;
            }
            int i66 = i63 + 1;
            int charAt20 = b11.charAt(i63);
            if (charAt20 >= 55296) {
                int i67 = charAt20 & 8191;
                int i68 = 13;
                while (true) {
                    i21 = i66 + 1;
                    charAt4 = b11.charAt(i66);
                    if (charAt4 < 55296) {
                        break;
                    }
                    i67 |= (charAt4 & 8191) << i68;
                    i68 += 13;
                    i66 = i21;
                }
                charAt20 = i67 | (charAt4 << i68);
                i66 = i21;
            }
            int i69 = i66 + 1;
            int charAt21 = b11.charAt(i66);
            if (charAt21 >= 55296) {
                int i71 = charAt21 & 8191;
                int i72 = 13;
                while (true) {
                    i19 = i69 + 1;
                    charAt3 = b11.charAt(i69);
                    if (charAt3 < 55296) {
                        break;
                    }
                    i71 |= (charAt3 & 8191) << i72;
                    i72 += 13;
                    i69 = i19;
                }
                charAt21 = i71 | (charAt3 << i72);
                i69 = i19;
            }
            int i73 = i69 + 1;
            int charAt22 = b11.charAt(i69);
            if (charAt22 >= 55296) {
                int i74 = charAt22 & 8191;
                int i75 = 13;
                while (true) {
                    i18 = i73 + 1;
                    charAt2 = b11.charAt(i73);
                    if (charAt2 < 55296) {
                        break;
                    }
                    i74 |= (charAt2 & 8191) << i75;
                    i75 += 13;
                    i73 = i18;
                }
                charAt22 = i74 | (charAt2 << i75);
                i73 = i18;
            }
            int[] iArr3 = new int[charAt22 + charAt20 + charAt21];
            int i76 = (charAt16 * 2) + charAt17;
            int i77 = charAt20;
            i12 = charAt18;
            i13 = i77;
            i14 = charAt16;
            i46 = i73;
            iArr = iArr3;
            i15 = charAt19;
            i16 = i76;
            i17 = charAt22;
        }
        Unsafe unsafe = f59324q;
        Object[] a11 = e0Var.a();
        Class<?> cls = e0Var.getDefaultInstance().getClass();
        int[] iArr4 = new int[charAt * 3];
        Object[] objArr = new Object[charAt * 2];
        int i78 = i13 + i17;
        int i79 = i78;
        int i81 = i17;
        int i82 = 0;
        int i83 = 0;
        while (i46 < length) {
            int i84 = i46 + 1;
            int charAt23 = b11.charAt(i46);
            if (charAt23 >= i44) {
                int i85 = charAt23 & 8191;
                int i86 = i84;
                int i87 = 13;
                while (true) {
                    i42 = i86 + 1;
                    charAt13 = b11.charAt(i86);
                    i27 = length;
                    if (charAt13 < 55296) {
                        break;
                    }
                    i85 |= (charAt13 & 8191) << i87;
                    i87 += 13;
                    i86 = i42;
                    length = i27;
                }
                charAt23 = i85 | (charAt13 << i87);
                i28 = i42;
            } else {
                i27 = length;
                i28 = i84;
            }
            int i88 = i28 + 1;
            int charAt24 = b11.charAt(i28);
            int i89 = charAt23;
            char c11 = 55296;
            if (charAt24 >= 55296) {
                int i91 = charAt24 & 8191;
                int i92 = 13;
                while (true) {
                    i41 = i88 + 1;
                    charAt12 = b11.charAt(i88);
                    if (charAt12 < c11) {
                        break;
                    }
                    i91 |= (charAt12 & 8191) << i92;
                    i92 += 13;
                    i88 = i41;
                    c11 = 55296;
                }
                charAt24 = i91 | (charAt12 << i92);
                i88 = i41;
            }
            int i93 = charAt24 & 255;
            int i94 = i14;
            if ((charAt24 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
                iArr[i83] = i82;
                i83++;
            }
            if (i93 >= 51) {
                int i95 = i88 + 1;
                int charAt25 = b11.charAt(i88);
                if (charAt25 >= 55296) {
                    int i96 = charAt25 & 8191;
                    int i97 = i95;
                    int i98 = 13;
                    while (true) {
                        i38 = i97 + 1;
                        charAt11 = b11.charAt(i97);
                        i39 = i96;
                        if (charAt11 < 55296) {
                            break;
                        }
                        i96 = i39 | ((charAt11 & 8191) << i98);
                        i98 += 13;
                        i97 = i38;
                    }
                    charAt25 = i39 | (charAt11 << i98);
                    i37 = i38;
                } else {
                    i37 = i95;
                }
                int i99 = charAt25;
                int i100 = i93 - 51;
                int i101 = i37;
                if (i100 == 9 || i100 == 17) {
                    iArr2 = iArr4;
                    objArr[I1.w.a(i82, 3, 2, 1)] = a11[i16];
                    i16++;
                } else if (i100 != 12 || (!e0Var.getSyntax().equals(b0.PROTO2) && (charAt24 & 2048) == 0)) {
                    iArr2 = iArr4;
                } else {
                    iArr2 = iArr4;
                    objArr[I1.w.a(i82, 3, 2, 1)] = a11[i16];
                    i16++;
                }
                int i102 = i99 * 2;
                Object obj = a11[i102];
                if (obj instanceof Field) {
                    J12 = (Field) obj;
                } else {
                    J12 = J(cls, (String) obj);
                    a11[i102] = J12;
                }
                int objectFieldOffset2 = (int) unsafe.objectFieldOffset(J12);
                int i103 = i102 + 1;
                Object obj2 = a11[i103];
                if (obj2 instanceof Field) {
                    J13 = (Field) obj2;
                } else {
                    J13 = J(cls, (String) obj2);
                    a11[i103] = J13;
                }
                i29 = i78;
                i35 = objectFieldOffset2;
                i33 = i101;
                i32 = (int) unsafe.objectFieldOffset(J13);
                i34 = 0;
            } else {
                iArr2 = iArr4;
                int i104 = i16 + 1;
                Field J14 = J(cls, (String) a11[i16]);
                if (i93 == 9 || i93 == 17) {
                    i29 = i78;
                    objArr[I1.w.a(i82, 3, 2, 1)] = J14.getType();
                } else {
                    if (i93 == 27 || i93 == 49) {
                        i29 = i78;
                        i36 = i16 + 2;
                        objArr[I1.w.a(i82, 3, 2, 1)] = a11[i104];
                    } else if (i93 == 12 || i93 == 30 || i93 == 44) {
                        i29 = i78;
                        if (e0Var.getSyntax() == b0.PROTO2 || (charAt24 & 2048) != 0) {
                            i36 = i16 + 2;
                            objArr[I1.w.a(i82, 3, 2, 1)] = a11[i104];
                        }
                    } else if (i93 == 50) {
                        int i105 = i81 + 1;
                        iArr[i81] = i82;
                        int i106 = (i82 / 3) * 2;
                        int i107 = i16 + 2;
                        objArr[i106] = a11[i104];
                        if ((charAt24 & 2048) != 0) {
                            i31 = i16 + 3;
                            objArr[i106 + 1] = a11[i107];
                            i29 = i78;
                            i81 = i105;
                        } else {
                            i31 = i107;
                            i81 = i105;
                            i29 = i78;
                        }
                        objectFieldOffset = (int) unsafe.objectFieldOffset(J14);
                        if ((charAt24 & 4096) != 0 || i93 > 17) {
                            i32 = 1048575;
                            i33 = i88;
                            i34 = 0;
                        } else {
                            int i108 = i88 + 1;
                            int charAt26 = b11.charAt(i88);
                            if (charAt26 >= 55296) {
                                int i109 = charAt26 & 8191;
                                int i110 = 13;
                                while (true) {
                                    i33 = i108 + 1;
                                    charAt10 = b11.charAt(i108);
                                    if (charAt10 < 55296) {
                                        break;
                                    }
                                    i109 |= (charAt10 & 8191) << i110;
                                    i110 += 13;
                                    i108 = i33;
                                }
                                charAt26 = i109 | (charAt10 << i110);
                            } else {
                                i33 = i108;
                            }
                            int i111 = (charAt26 / 32) + (i94 * 2);
                            Object obj3 = a11[i111];
                            if (obj3 instanceof Field) {
                                J11 = (Field) obj3;
                            } else {
                                J11 = J(cls, (String) obj3);
                                a11[i111] = J11;
                            }
                            i32 = (int) unsafe.objectFieldOffset(J11);
                            i34 = charAt26 % 32;
                        }
                        if (i93 >= 18 && i93 <= 49) {
                            iArr[i79] = objectFieldOffset;
                            i79++;
                        }
                        i16 = i31;
                        i35 = objectFieldOffset;
                    } else {
                        i29 = i78;
                    }
                    i31 = i36;
                    objectFieldOffset = (int) unsafe.objectFieldOffset(J14);
                    if ((charAt24 & 4096) != 0) {
                    }
                    i32 = 1048575;
                    i33 = i88;
                    i34 = 0;
                    if (i93 >= 18) {
                        iArr[i79] = objectFieldOffset;
                        i79++;
                    }
                    i16 = i31;
                    i35 = objectFieldOffset;
                }
                i31 = i104;
                objectFieldOffset = (int) unsafe.objectFieldOffset(J14);
                if ((charAt24 & 4096) != 0) {
                }
                i32 = 1048575;
                i33 = i88;
                i34 = 0;
                if (i93 >= 18) {
                }
                i16 = i31;
                i35 = objectFieldOffset;
            }
            int i112 = i82 + 1;
            iArr2[i82] = i89;
            int i113 = i82 + 2;
            String str = b11;
            iArr2[i112] = ((charAt24 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? 536870912 : 0) | ((charAt24 & 256) != 0 ? 268435456 : 0) | ((charAt24 & 2048) != 0 ? LinearLayoutManager.INVALID_OFFSET : 0) | (i93 << 20) | i35;
            i82 += 3;
            iArr2[i113] = (i34 << 20) | i32;
            b11 = str;
            i14 = i94;
            length = i27;
            i46 = i33;
            i78 = i29;
            iArr4 = iArr2;
            i44 = 55296;
        }
        return new V<>(iArr4, objArr, i12, i15, e0Var.getDefaultInstance(), iArr, i17, i78, x11, f7, m0Var, abstractC5911q, m11);
    }

    private static long y(int i11) {
        return i11 & 1048575;
    }

    private static <T> int z(T t2, long j11) {
        return ((Integer) p0.v(t2, j11)).intValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x049a, code lost:
    
        r0 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x04f4, code lost:
    
        if (r0 == 1048575) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x04f6, code lost:
    
        r25.putInt(r9, r0, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x04fc, code lost:
    
        r7 = r8.f59334i;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0501, code lost:
    
        if (r7 >= r8.f59335j) goto L262;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0503, code lost:
    
        r8.i(r9, r8.f59333h[r7], null, r8.f59338m, r28);
        r7 = r7 + 1;
        r8 = r27;
        r9 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0518, code lost:
    
        if (r32 != 0) goto L192;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x051a, code lost:
    
        if (r6 != r10) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0521, code lost:
    
        throw com.google.crypto.tink.shaded.protobuf.A.h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0526, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0522, code lost:
    
        if (r6 > r10) goto L195;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0524, code lost:
    
        if (r14 != r32) goto L195;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x052b, code lost:
    
        throw com.google.crypto.tink.shaded.protobuf.A.h();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final int C(T t2, byte[] bArr, int i11, int i12, int i13, C5899e.a aVar) throws IOException {
        int i14;
        int i15;
        Unsafe unsafe;
        V<T> v11;
        T t11;
        int i16;
        int i17;
        int i18;
        int i19;
        int e11;
        int i21;
        int i22;
        int i23;
        T t12;
        Unsafe unsafe2;
        byte[] bArr2;
        int i24;
        char c11;
        C5899e.a aVar2;
        int i25;
        C5899e.a aVar3;
        Unsafe unsafe3;
        int i26;
        Unsafe unsafe4;
        T t13;
        byte[] bArr3;
        int i27;
        int g10;
        int i28;
        Unsafe unsafe5;
        T t14;
        Unsafe unsafe6;
        byte[] bArr4;
        C5899e.a aVar4;
        int i29;
        int i31;
        byte[] bArr5;
        int i32;
        int i33;
        int i34;
        V<T> v12 = this;
        T t15 = t2;
        byte[] bArr6 = bArr;
        int i35 = i12;
        C5899e.a aVar5 = aVar;
        h(t15);
        Unsafe unsafe7 = f59324q;
        int i36 = i11;
        int i37 = -1;
        int i38 = 0;
        int i39 = 1048575;
        int i41 = 0;
        int i42 = 0;
        while (true) {
            if (i36 < i35) {
                int i43 = i36 + 1;
                int i44 = bArr6[i36];
                if (i44 < 0) {
                    i43 = C5899e.f(i44, bArr6, i43, aVar5);
                    i44 = aVar5.f59358a;
                }
                int i45 = i43;
                i42 = i44;
                int i46 = i42 >>> 3;
                int i47 = i38;
                int i48 = i42 & 7;
                int i49 = v12.f59329d;
                int i51 = v12.f59328c;
                if (i46 > i37) {
                    i18 = (i46 < i51 || i46 > i49) ? -1 : v12.M(i46, i47 / 3);
                    i17 = 0;
                } else if (i46 < i51 || i46 > i49) {
                    i17 = 0;
                    i18 = -1;
                } else {
                    i17 = 0;
                    i18 = v12.M(i46, 0);
                }
                int i52 = i18;
                if (i52 == -1) {
                    i19 = i45;
                    i15 = i39;
                    unsafe = unsafe7;
                    i37 = i46;
                    i38 = i17;
                    v11 = v12;
                    t11 = t15;
                } else {
                    int[] iArr = v12.f59326a;
                    int i53 = iArr[i52 + 1];
                    int P11 = P(i53);
                    long j11 = i53 & 1048575;
                    if (P11 <= 17) {
                        int i54 = iArr[i52 + 2];
                        int i55 = 1 << (i54 >>> 20);
                        int i56 = i54 & 1048575;
                        if (i56 != i39) {
                            if (i39 != 1048575) {
                                unsafe7.putInt(t15, i39, i41);
                            }
                            i23 = i56;
                            i22 = i56 == 1048575 ? 0 : unsafe7.getInt(t15, i56);
                        } else {
                            i22 = i41;
                            i23 = i39;
                        }
                        switch (P11) {
                            case 0:
                                aVar3 = aVar;
                                unsafe5 = unsafe7;
                                i26 = i45;
                                c11 = 65535;
                                bArr5 = bArr;
                                if (i48 != 1) {
                                    t11 = t15;
                                    unsafe = unsafe5;
                                    aVar5 = aVar3;
                                    i37 = i46;
                                    i19 = i26;
                                    i38 = i52;
                                    i15 = i23;
                                    i41 = i22;
                                    v11 = v12;
                                    break;
                                } else {
                                    p0.D(t15, j11, Double.longBitsToDouble(C5899e.c(i26, bArr5)));
                                    i36 = i26 + 8;
                                    i32 = i22 | i55;
                                    aVar5 = aVar3;
                                    i37 = i46;
                                    i38 = i52;
                                    i39 = i23;
                                    i41 = i32;
                                    bArr6 = bArr5;
                                    unsafe7 = unsafe5;
                                    i35 = i12;
                                    break;
                                }
                            case 1:
                                aVar3 = aVar;
                                unsafe5 = unsafe7;
                                i26 = i45;
                                c11 = 65535;
                                bArr5 = bArr;
                                if (i48 != 5) {
                                    t11 = t15;
                                    unsafe = unsafe5;
                                    aVar5 = aVar3;
                                    i37 = i46;
                                    i19 = i26;
                                    i38 = i52;
                                    i15 = i23;
                                    i41 = i22;
                                    v11 = v12;
                                    break;
                                } else {
                                    p0.E(t15, j11, Float.intBitsToFloat(C5899e.b(i26, bArr5)));
                                    i36 = i26 + 4;
                                    i32 = i22 | i55;
                                    aVar5 = aVar3;
                                    i37 = i46;
                                    i38 = i52;
                                    i39 = i23;
                                    i41 = i32;
                                    bArr6 = bArr5;
                                    unsafe7 = unsafe5;
                                    i35 = i12;
                                    break;
                                }
                            case 2:
                            case 3:
                                aVar3 = aVar;
                                unsafe3 = unsafe7;
                                i26 = i45;
                                c11 = 65535;
                                bArr5 = bArr;
                                if (i48 != 0) {
                                    unsafe5 = unsafe3;
                                    t11 = t15;
                                    unsafe = unsafe5;
                                    aVar5 = aVar3;
                                    i37 = i46;
                                    i19 = i26;
                                    i38 = i52;
                                    i15 = i23;
                                    i41 = i22;
                                    v11 = v12;
                                    break;
                                } else {
                                    int i57 = C5899e.i(bArr5, i26, aVar3);
                                    T t16 = t15;
                                    unsafe3.putLong(t16, j11, aVar3.f59359b);
                                    unsafe5 = unsafe3;
                                    t15 = t16;
                                    i32 = i22 | i55;
                                    i36 = i57;
                                    aVar5 = aVar3;
                                    i37 = i46;
                                    i38 = i52;
                                    i39 = i23;
                                    i41 = i32;
                                    bArr6 = bArr5;
                                    unsafe7 = unsafe5;
                                    i35 = i12;
                                    break;
                                }
                            case 4:
                            case 11:
                                aVar3 = aVar;
                                unsafe3 = unsafe7;
                                i26 = i45;
                                c11 = 65535;
                                if (i48 != 0) {
                                    unsafe5 = unsafe3;
                                    t11 = t15;
                                    unsafe = unsafe5;
                                    aVar5 = aVar3;
                                    i37 = i46;
                                    i19 = i26;
                                    i38 = i52;
                                    i15 = i23;
                                    i41 = i22;
                                    v11 = v12;
                                    break;
                                } else {
                                    int g11 = C5899e.g(bArr, i26, aVar3);
                                    unsafe3.putInt(t15, j11, aVar3.f59358a);
                                    unsafe7 = unsafe3;
                                    bArr6 = bArr;
                                    int i58 = i23;
                                    i41 = i22 | i55;
                                    i36 = g11;
                                    aVar5 = aVar3;
                                    i39 = i58;
                                    i35 = i12;
                                    i37 = i46;
                                    i38 = i52;
                                    break;
                                }
                            case 5:
                            case 14:
                                Unsafe unsafe8 = unsafe7;
                                i26 = i45;
                                c11 = 65535;
                                T t17 = t15;
                                if (i48 != 1) {
                                    t15 = t17;
                                    unsafe3 = unsafe8;
                                    aVar3 = aVar;
                                    unsafe5 = unsafe3;
                                    t11 = t15;
                                    unsafe = unsafe5;
                                    aVar5 = aVar3;
                                    i37 = i46;
                                    i19 = i26;
                                    i38 = i52;
                                    i15 = i23;
                                    i41 = i22;
                                    v11 = v12;
                                    break;
                                } else {
                                    unsafe8.putLong(t17, j11, C5899e.c(i26, bArr));
                                    t15 = t17;
                                    i36 = i26 + 8;
                                    unsafe7 = unsafe8;
                                    bArr6 = bArr;
                                    aVar5 = aVar;
                                    i37 = i46;
                                    i38 = i52;
                                    i39 = i23;
                                    i41 = i22 | i55;
                                    i35 = i12;
                                    break;
                                }
                            case 6:
                            case 13:
                                unsafe4 = unsafe7;
                                i26 = i45;
                                c11 = 65535;
                                aVar2 = aVar;
                                t13 = t15;
                                bArr3 = bArr;
                                if (i48 != 5) {
                                    t15 = t13;
                                    unsafe5 = unsafe4;
                                    aVar3 = aVar2;
                                    t11 = t15;
                                    unsafe = unsafe5;
                                    aVar5 = aVar3;
                                    i37 = i46;
                                    i19 = i26;
                                    i38 = i52;
                                    i15 = i23;
                                    i41 = i22;
                                    v11 = v12;
                                    break;
                                } else {
                                    unsafe4.putInt(t13, j11, C5899e.b(i26, bArr3));
                                    i36 = i26 + 4;
                                    bArr6 = bArr3;
                                    t15 = t13;
                                    unsafe7 = unsafe4;
                                    i39 = i23;
                                    i41 = i22 | i55;
                                    i35 = i12;
                                    aVar5 = aVar2;
                                    i37 = i46;
                                    i38 = i52;
                                    break;
                                }
                            case 7:
                                unsafe4 = unsafe7;
                                i27 = i45;
                                c11 = 65535;
                                aVar2 = aVar;
                                t13 = t15;
                                bArr3 = bArr;
                                if (i48 != 0) {
                                    t15 = t13;
                                    i26 = i27;
                                    unsafe5 = unsafe4;
                                    aVar3 = aVar2;
                                    t11 = t15;
                                    unsafe = unsafe5;
                                    aVar5 = aVar3;
                                    i37 = i46;
                                    i19 = i26;
                                    i38 = i52;
                                    i15 = i23;
                                    i41 = i22;
                                    v11 = v12;
                                    break;
                                } else {
                                    i25 = C5899e.i(bArr3, i27, aVar2);
                                    p0.z(t13, j11, aVar2.f59359b != 0);
                                    bArr6 = bArr3;
                                    t15 = t13;
                                    unsafe7 = unsafe4;
                                    i39 = i23;
                                    i41 = i22 | i55;
                                    i35 = i12;
                                    aVar5 = aVar2;
                                    i36 = i25;
                                    i37 = i46;
                                    i38 = i52;
                                    break;
                                }
                            case 8:
                                unsafe4 = unsafe7;
                                i27 = i45;
                                c11 = 65535;
                                aVar2 = aVar;
                                t13 = t15;
                                bArr3 = bArr;
                                if (i48 != 2) {
                                    t15 = t13;
                                    i26 = i27;
                                    unsafe5 = unsafe4;
                                    aVar3 = aVar2;
                                    t11 = t15;
                                    unsafe = unsafe5;
                                    aVar5 = aVar3;
                                    i37 = i46;
                                    i19 = i26;
                                    i38 = i52;
                                    i15 = i23;
                                    i41 = i22;
                                    v11 = v12;
                                    break;
                                } else {
                                    if ((536870912 & i53) != 0) {
                                        g10 = C5899e.g(bArr3, i27, aVar2);
                                        i28 = aVar2.f59358a;
                                        if (i28 < 0) {
                                            throw A.g();
                                        }
                                        if (i28 == 0) {
                                            aVar2.f59360c = "";
                                            i36 = g10;
                                            unsafe4.putObject(t13, j11, aVar2.f59360c);
                                            bArr6 = bArr3;
                                            t15 = t13;
                                            unsafe7 = unsafe4;
                                            i39 = i23;
                                            i41 = i22 | i55;
                                        } else {
                                            aVar2.f59360c = q0.d(bArr3, g10, i28);
                                            g10 += i28;
                                            i36 = g10;
                                            unsafe4.putObject(t13, j11, aVar2.f59360c);
                                            bArr6 = bArr3;
                                            t15 = t13;
                                            unsafe7 = unsafe4;
                                            i39 = i23;
                                            i41 = i22 | i55;
                                        }
                                    } else {
                                        g10 = C5899e.g(bArr3, i27, aVar2);
                                        i28 = aVar2.f59358a;
                                        if (i28 < 0) {
                                            throw A.g();
                                        }
                                        if (i28 == 0) {
                                            aVar2.f59360c = "";
                                            i36 = g10;
                                            unsafe4.putObject(t13, j11, aVar2.f59360c);
                                            bArr6 = bArr3;
                                            t15 = t13;
                                            unsafe7 = unsafe4;
                                            i39 = i23;
                                            i41 = i22 | i55;
                                        } else {
                                            aVar2.f59360c = new String(bArr3, g10, i28, C5919z.f59480a);
                                            g10 += i28;
                                            i36 = g10;
                                            unsafe4.putObject(t13, j11, aVar2.f59360c);
                                            bArr6 = bArr3;
                                            t15 = t13;
                                            unsafe7 = unsafe4;
                                            i39 = i23;
                                            i41 = i22 | i55;
                                        }
                                    }
                                    i35 = i12;
                                    aVar5 = aVar2;
                                    i37 = i46;
                                    i38 = i52;
                                    break;
                                }
                            case 9:
                                Unsafe unsafe9 = unsafe7;
                                t13 = t15;
                                i27 = i45;
                                c11 = 65535;
                                aVar2 = aVar;
                                if (i48 != 2) {
                                    unsafe4 = unsafe9;
                                    bArr3 = bArr;
                                    t15 = t13;
                                    i26 = i27;
                                    unsafe5 = unsafe4;
                                    aVar3 = aVar2;
                                    t11 = t15;
                                    unsafe = unsafe5;
                                    aVar5 = aVar3;
                                    i37 = i46;
                                    i19 = i26;
                                    i38 = i52;
                                    i15 = i23;
                                    i41 = i22;
                                    v11 = v12;
                                    break;
                                } else {
                                    Object v13 = v12.v(t13, i52);
                                    int k11 = C5899e.k(v13, v12.l(i52), bArr, i27, i12, aVar2);
                                    v12.N(t13, i52, v13);
                                    bArr6 = bArr;
                                    t15 = t13;
                                    unsafe7 = unsafe9;
                                    i39 = i23;
                                    i41 = i22 | i55;
                                    i36 = k11;
                                    i35 = i12;
                                    aVar5 = aVar2;
                                    i37 = i46;
                                    i38 = i52;
                                    break;
                                }
                            case 10:
                                Unsafe unsafe10 = unsafe7;
                                t12 = t15;
                                unsafe2 = unsafe10;
                                bArr2 = bArr;
                                i24 = i45;
                                c11 = 65535;
                                aVar2 = aVar;
                                if (i48 != 2) {
                                    unsafe5 = unsafe2;
                                    i26 = i24;
                                    t15 = t12;
                                    aVar3 = aVar2;
                                    t11 = t15;
                                    unsafe = unsafe5;
                                    aVar5 = aVar3;
                                    i37 = i46;
                                    i19 = i26;
                                    i38 = i52;
                                    i15 = i23;
                                    i41 = i22;
                                    v11 = v12;
                                    break;
                                } else {
                                    i36 = C5899e.a(bArr2, i24, aVar2);
                                    unsafe2.putObject(t12, j11, aVar2.f59360c);
                                    unsafe7 = unsafe2;
                                    t15 = t12;
                                    int i59 = i23;
                                    i41 = i22 | i55;
                                    bArr6 = bArr2;
                                    i39 = i59;
                                    i35 = i12;
                                    aVar5 = aVar2;
                                    i37 = i46;
                                    i38 = i52;
                                    break;
                                }
                            case 12:
                                Unsafe unsafe11 = unsafe7;
                                t12 = t15;
                                unsafe2 = unsafe11;
                                bArr2 = bArr;
                                i24 = i45;
                                c11 = 65535;
                                aVar2 = aVar;
                                if (i48 != 0) {
                                    unsafe5 = unsafe2;
                                    i26 = i24;
                                    t15 = t12;
                                    aVar3 = aVar2;
                                    t11 = t15;
                                    unsafe = unsafe5;
                                    aVar5 = aVar3;
                                    i37 = i46;
                                    i19 = i26;
                                    i38 = i52;
                                    i15 = i23;
                                    i41 = i22;
                                    v11 = v12;
                                    break;
                                } else {
                                    int g12 = C5899e.g(bArr2, i24, aVar2);
                                    int i61 = aVar2.f59358a;
                                    C5919z.c j12 = v12.j(i52);
                                    if ((i53 & LinearLayoutManager.INVALID_OFFSET) != 0 && j12 != null && !j12.a()) {
                                        m(t12).j(i42, Long.valueOf(i61));
                                        unsafe7 = unsafe2;
                                        t15 = t12;
                                        i35 = i12;
                                        aVar5 = aVar2;
                                        i36 = g12;
                                        bArr6 = bArr2;
                                        i37 = i46;
                                        i38 = i52;
                                        i39 = i23;
                                        i41 = i22;
                                        break;
                                    } else {
                                        i25 = g12;
                                        unsafe2.putInt(t12, j11, i61);
                                        unsafe7 = unsafe2;
                                        t15 = t12;
                                        int i62 = i23;
                                        i41 = i22 | i55;
                                        bArr6 = bArr2;
                                        i39 = i62;
                                        i35 = i12;
                                        aVar5 = aVar2;
                                        i36 = i25;
                                        i37 = i46;
                                        i38 = i52;
                                        break;
                                    }
                                }
                                break;
                            case 15:
                                Unsafe unsafe12 = unsafe7;
                                t14 = t15;
                                unsafe6 = unsafe12;
                                bArr4 = bArr;
                                aVar4 = aVar;
                                i29 = i45;
                                c11 = 65535;
                                if (i48 != 0) {
                                    unsafe5 = unsafe6;
                                    t15 = t14;
                                    aVar3 = aVar4;
                                    i26 = i29;
                                    t11 = t15;
                                    unsafe = unsafe5;
                                    aVar5 = aVar3;
                                    i37 = i46;
                                    i19 = i26;
                                    i38 = i52;
                                    i15 = i23;
                                    i41 = i22;
                                    v11 = v12;
                                    break;
                                } else {
                                    i36 = C5899e.g(bArr4, i29, aVar4);
                                    unsafe6.putInt(t14, j11, AbstractC5904j.b(aVar4.f59358a));
                                    i31 = i22 | i55;
                                    unsafe7 = unsafe6;
                                    t15 = t14;
                                    int i63 = i23;
                                    i41 = i31;
                                    bArr6 = bArr4;
                                    i39 = i63;
                                    i35 = i12;
                                    i37 = i46;
                                    aVar5 = aVar4;
                                    i38 = i52;
                                    break;
                                }
                            case 16:
                                bArr4 = bArr;
                                aVar4 = aVar;
                                i29 = i45;
                                c11 = 65535;
                                if (i48 != 0) {
                                    Unsafe unsafe13 = unsafe7;
                                    t14 = t15;
                                    unsafe6 = unsafe13;
                                    unsafe5 = unsafe6;
                                    t15 = t14;
                                    aVar3 = aVar4;
                                    i26 = i29;
                                    t11 = t15;
                                    unsafe = unsafe5;
                                    aVar5 = aVar3;
                                    i37 = i46;
                                    i19 = i26;
                                    i38 = i52;
                                    i15 = i23;
                                    i41 = i22;
                                    v11 = v12;
                                    break;
                                } else {
                                    int i64 = C5899e.i(bArr4, i29, aVar4);
                                    T t18 = t15;
                                    Unsafe unsafe14 = unsafe7;
                                    unsafe14.putLong(t18, j11, AbstractC5904j.c(aVar4.f59359b));
                                    unsafe7 = unsafe14;
                                    t15 = t18;
                                    int i65 = i23;
                                    i41 = i22 | i55;
                                    bArr6 = bArr4;
                                    i39 = i65;
                                    i35 = i12;
                                    i36 = i64;
                                    i37 = i46;
                                    aVar5 = aVar4;
                                    i38 = i52;
                                    break;
                                }
                            case 17:
                                if (i48 != 3) {
                                    c11 = 65535;
                                    aVar3 = aVar;
                                    unsafe5 = unsafe7;
                                    i26 = i45;
                                    t11 = t15;
                                    unsafe = unsafe5;
                                    aVar5 = aVar3;
                                    i37 = i46;
                                    i19 = i26;
                                    i38 = i52;
                                    i15 = i23;
                                    i41 = i22;
                                    v11 = v12;
                                    break;
                                } else {
                                    Object v14 = v12.v(t15, i52);
                                    i36 = C5899e.j(v14, v12.l(i52), bArr, i45, i12, (i46 << 3) | 4, aVar);
                                    aVar4 = aVar;
                                    bArr4 = bArr;
                                    v12.N(t15, i52, v14);
                                    i31 = i22 | i55;
                                    int i632 = i23;
                                    i41 = i31;
                                    bArr6 = bArr4;
                                    i39 = i632;
                                    i35 = i12;
                                    i37 = i46;
                                    aVar5 = aVar4;
                                    i38 = i52;
                                    break;
                                }
                            default:
                                aVar3 = aVar;
                                unsafe5 = unsafe7;
                                i26 = i45;
                                c11 = 65535;
                                t11 = t15;
                                unsafe = unsafe5;
                                aVar5 = aVar3;
                                i37 = i46;
                                i19 = i26;
                                i38 = i52;
                                i15 = i23;
                                i41 = i22;
                                v11 = v12;
                                break;
                        }
                    } else {
                        Unsafe unsafe15 = unsafe7;
                        if (P11 != 27) {
                            i33 = i45;
                            if (P11 <= 49) {
                                unsafe = unsafe15;
                                i15 = i39;
                                i34 = i41;
                                int E11 = v12.E(t2, bArr, i33, i12, i42, i46, i48, i52, i53, P11, j11, aVar);
                                i42 = i42;
                                i52 = i52;
                                if (E11 != i33) {
                                    v12 = this;
                                    t15 = t2;
                                    bArr6 = bArr;
                                    i35 = i12;
                                    aVar5 = aVar;
                                    i36 = E11;
                                    i37 = i46;
                                } else {
                                    v11 = this;
                                    aVar5 = aVar;
                                    i19 = E11;
                                    i37 = i46;
                                    i38 = i52;
                                    i41 = i34;
                                    t11 = t2;
                                }
                            } else {
                                i15 = i39;
                                unsafe = unsafe15;
                                i34 = i41;
                                if (P11 != 50) {
                                    i37 = i46;
                                    int D11 = D(t2, bArr, i33, i12, i42, i37, i48, i53, P11, j11, i52, aVar);
                                    v11 = this;
                                    t11 = t2;
                                    aVar5 = aVar;
                                    if (D11 != i33) {
                                        bArr6 = bArr;
                                        i35 = i12;
                                        i36 = D11;
                                        v12 = v11;
                                        t15 = t11;
                                    } else {
                                        i19 = D11;
                                        i38 = i52;
                                        i41 = i34;
                                    }
                                } else if (i48 == 2) {
                                    B(t2, bArr, i33, i12, i52, j11, aVar);
                                    throw null;
                                }
                            }
                            i38 = i52;
                            i39 = i15;
                            i41 = i34;
                            unsafe7 = unsafe;
                        } else if (i48 == 2) {
                            C5919z.d dVar = (C5919z.d) unsafe15.getObject(t15, j11);
                            if (!dVar.isModifiable()) {
                                int size = dVar.size();
                                dVar = dVar.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
                                unsafe15.putObject(t15, j11, dVar);
                            }
                            unsafe7 = unsafe15;
                            int d11 = C5899e.d(v12.l(i52), i42, bArr, i45, i12, dVar, aVar);
                            bArr6 = bArr;
                            i35 = i12;
                            aVar5 = aVar;
                            i36 = d11;
                            i37 = i46;
                            i38 = i52;
                            t15 = t2;
                        } else {
                            unsafe = unsafe15;
                            i15 = i39;
                            i34 = i41;
                            i33 = i45;
                        }
                        v11 = this;
                        t11 = t2;
                        aVar5 = aVar;
                        i19 = i33;
                        i37 = i46;
                        i38 = i52;
                        i41 = i34;
                    }
                }
                if (i42 != i13 || i13 == 0) {
                    if (v11.f59331f) {
                        C5910p b11 = C5910p.b();
                        C5910p c5910p = aVar5.f59361d;
                        if (c5910p != b11) {
                            if (c5910p.a(v11.f59330e, i37) != null) {
                                ((AbstractC5917x.c) t11).D();
                                throw null;
                            }
                            e11 = C5899e.e(i42, bArr, i19, i12, m(t11), aVar5);
                            i21 = i12;
                            i36 = e11;
                            bArr6 = bArr;
                            aVar5 = aVar;
                            v12 = v11;
                            t15 = t11;
                            i35 = i21;
                            i39 = i15;
                            unsafe7 = unsafe;
                        }
                    }
                    e11 = C5899e.e(i42, bArr, i19, i12, m(t11), aVar);
                    i21 = i12;
                    i36 = e11;
                    bArr6 = bArr;
                    aVar5 = aVar;
                    v12 = v11;
                    t15 = t11;
                    i35 = i21;
                    i39 = i15;
                    unsafe7 = unsafe;
                } else {
                    i14 = i12;
                    i16 = i19;
                }
            } else {
                i14 = i35;
                i15 = i39;
                unsafe = unsafe7;
                v11 = v12;
                t11 = t15;
                i16 = i36;
            }
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f0
    public final void a(T t2, byte[] bArr, int i11, int i12, C5899e.a aVar) throws IOException {
        C(t2, bArr, i11, i12, 0, aVar);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f0
    public final void b(Object obj, C5905k c5905k, C5910p c5910p) throws IOException {
        c5910p.getClass();
        h(obj);
        r(this.f59338m, this.f59339n, obj, c5905k, c5910p);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x006c, code lost:
    
        if (com.google.crypto.tink.shaded.protobuf.g0.l(com.google.crypto.tink.shaded.protobuf.p0.v(r11, r7), com.google.crypto.tink.shaded.protobuf.p0.v(r12, r7)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0080, code lost:
    
        if (com.google.crypto.tink.shaded.protobuf.p0.u(r11, r7) == com.google.crypto.tink.shaded.protobuf.p0.u(r12, r7)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0092, code lost:
    
        if (com.google.crypto.tink.shaded.protobuf.p0.t(r11, r7) == com.google.crypto.tink.shaded.protobuf.p0.t(r12, r7)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a6, code lost:
    
        if (com.google.crypto.tink.shaded.protobuf.p0.u(r11, r7) == com.google.crypto.tink.shaded.protobuf.p0.u(r12, r7)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b8, code lost:
    
        if (com.google.crypto.tink.shaded.protobuf.p0.t(r11, r7) == com.google.crypto.tink.shaded.protobuf.p0.t(r12, r7)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ca, code lost:
    
        if (com.google.crypto.tink.shaded.protobuf.p0.t(r11, r7) == com.google.crypto.tink.shaded.protobuf.p0.t(r12, r7)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00dc, code lost:
    
        if (com.google.crypto.tink.shaded.protobuf.p0.t(r11, r7) == com.google.crypto.tink.shaded.protobuf.p0.t(r12, r7)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00f2, code lost:
    
        if (com.google.crypto.tink.shaded.protobuf.g0.l(com.google.crypto.tink.shaded.protobuf.p0.v(r11, r7), com.google.crypto.tink.shaded.protobuf.p0.v(r12, r7)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0108, code lost:
    
        if (com.google.crypto.tink.shaded.protobuf.g0.l(com.google.crypto.tink.shaded.protobuf.p0.v(r11, r7), com.google.crypto.tink.shaded.protobuf.p0.v(r12, r7)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x011e, code lost:
    
        if (com.google.crypto.tink.shaded.protobuf.g0.l(com.google.crypto.tink.shaded.protobuf.p0.v(r11, r7), com.google.crypto.tink.shaded.protobuf.p0.v(r12, r7)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0130, code lost:
    
        if (com.google.crypto.tink.shaded.protobuf.p0.p(r11, r7) == com.google.crypto.tink.shaded.protobuf.p0.p(r12, r7)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0142, code lost:
    
        if (com.google.crypto.tink.shaded.protobuf.p0.t(r11, r7) == com.google.crypto.tink.shaded.protobuf.p0.t(r12, r7)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0156, code lost:
    
        if (com.google.crypto.tink.shaded.protobuf.p0.u(r11, r7) == com.google.crypto.tink.shaded.protobuf.p0.u(r12, r7)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0167, code lost:
    
        if (com.google.crypto.tink.shaded.protobuf.p0.t(r11, r7) == com.google.crypto.tink.shaded.protobuf.p0.t(r12, r7)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x017a, code lost:
    
        if (com.google.crypto.tink.shaded.protobuf.p0.u(r11, r7) == com.google.crypto.tink.shaded.protobuf.p0.u(r12, r7)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x018d, code lost:
    
        if (com.google.crypto.tink.shaded.protobuf.p0.u(r11, r7) == com.google.crypto.tink.shaded.protobuf.p0.u(r12, r7)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01a6, code lost:
    
        if (java.lang.Float.floatToIntBits(com.google.crypto.tink.shaded.protobuf.p0.s(r11, r7)) == java.lang.Float.floatToIntBits(com.google.crypto.tink.shaded.protobuf.p0.s(r12, r7))) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01c1, code lost:
    
        if (java.lang.Double.doubleToLongBits(com.google.crypto.tink.shaded.protobuf.p0.r(r11, r7)) == java.lang.Double.doubleToLongBits(com.google.crypto.tink.shaded.protobuf.p0.r(r12, r7))) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0037, code lost:
    
        if (com.google.crypto.tink.shaded.protobuf.g0.l(com.google.crypto.tink.shaded.protobuf.p0.v(r11, r7), com.google.crypto.tink.shaded.protobuf.p0.v(r12, r7)) != false) goto L105;
     */
    @Override // com.google.crypto.tink.shaded.protobuf.f0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c(AbstractC5917x abstractC5917x, AbstractC5917x abstractC5917x2) {
        int[] iArr = this.f59326a;
        int length = iArr.length;
        int i11 = 0;
        while (true) {
            boolean z11 = true;
            if (i11 < length) {
                int Q11 = Q(i11);
                long j11 = Q11 & 1048575;
                switch (P(Q11)) {
                    case 0:
                        if (g(abstractC5917x, abstractC5917x2, i11)) {
                            break;
                        }
                        z11 = false;
                        break;
                    case 1:
                        if (g(abstractC5917x, abstractC5917x2, i11)) {
                            break;
                        }
                        z11 = false;
                        break;
                    case 2:
                        if (g(abstractC5917x, abstractC5917x2, i11)) {
                            break;
                        }
                        z11 = false;
                        break;
                    case 3:
                        if (g(abstractC5917x, abstractC5917x2, i11)) {
                            break;
                        }
                        z11 = false;
                        break;
                    case 4:
                        if (g(abstractC5917x, abstractC5917x2, i11)) {
                            break;
                        }
                        z11 = false;
                        break;
                    case 5:
                        if (g(abstractC5917x, abstractC5917x2, i11)) {
                            break;
                        }
                        z11 = false;
                        break;
                    case 6:
                        if (g(abstractC5917x, abstractC5917x2, i11)) {
                            break;
                        }
                        z11 = false;
                        break;
                    case 7:
                        if (g(abstractC5917x, abstractC5917x2, i11)) {
                            break;
                        }
                        z11 = false;
                        break;
                    case 8:
                        if (g(abstractC5917x, abstractC5917x2, i11)) {
                            break;
                        }
                        z11 = false;
                        break;
                    case 9:
                        if (g(abstractC5917x, abstractC5917x2, i11)) {
                            break;
                        }
                        z11 = false;
                        break;
                    case 10:
                        if (g(abstractC5917x, abstractC5917x2, i11)) {
                            break;
                        }
                        z11 = false;
                        break;
                    case 11:
                        if (g(abstractC5917x, abstractC5917x2, i11)) {
                            break;
                        }
                        z11 = false;
                        break;
                    case 12:
                        if (g(abstractC5917x, abstractC5917x2, i11)) {
                            break;
                        }
                        z11 = false;
                        break;
                    case 13:
                        if (g(abstractC5917x, abstractC5917x2, i11)) {
                            break;
                        }
                        z11 = false;
                        break;
                    case 14:
                        if (g(abstractC5917x, abstractC5917x2, i11)) {
                            break;
                        }
                        z11 = false;
                        break;
                    case 15:
                        if (g(abstractC5917x, abstractC5917x2, i11)) {
                            break;
                        }
                        z11 = false;
                        break;
                    case 16:
                        if (g(abstractC5917x, abstractC5917x2, i11)) {
                            break;
                        }
                        z11 = false;
                        break;
                    case 17:
                        if (g(abstractC5917x, abstractC5917x2, i11)) {
                            break;
                        }
                        z11 = false;
                        break;
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case TombstoneProtos$Tombstone.GUEST_THREADS_FIELD_NUMBER /* 25 */:
                    case TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER /* 26 */:
                    case DescriptorProtos$FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                    case 28:
                    case 29:
                    case AppUpdateInfo.Factory.DAYS_BETWEEN_30 /* 30 */:
                    case DescriptorProtos$FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                    case 32:
                    case 33:
                    case 34:
                    case DescriptorProtos$MethodOptions.FEATURES_FIELD_NUMBER /* 35 */:
                    case DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                    case DescriptorProtos$FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                    case 38:
                    case DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case DescriptorProtos$FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                    case DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                        z11 = g0.l(p0.v(abstractC5917x, j11), p0.v(abstractC5917x2, j11));
                        break;
                    case 50:
                        z11 = g0.l(p0.v(abstractC5917x, j11), p0.v(abstractC5917x2, j11));
                        break;
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                    case 60:
                    case 61:
                    case 62:
                    case 63:
                    case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
                    case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                    case 66:
                    case 67:
                    case 68:
                        long j12 = iArr[i11 + 2] & 1048575;
                        if (p0.t(abstractC5917x, j12) == p0.t(abstractC5917x2, j12)) {
                            break;
                        }
                        z11 = false;
                        break;
                }
                if (z11) {
                    i11 += 3;
                }
            } else {
                m0<?, ?> m0Var = this.f59338m;
                if (m0Var.g(abstractC5917x).equals(m0Var.g(abstractC5917x2))) {
                    if (!this.f59331f) {
                        return true;
                    }
                    AbstractC5911q<?> abstractC5911q = this.f59339n;
                    return abstractC5911q.c(abstractC5917x).equals(abstractC5911q.c(abstractC5917x2));
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x01f0, code lost:
    
        if (r4 != false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00d7, code lost:
    
        if (r4 != false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00d9, code lost:
    
        r8 = 1231;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00da, code lost:
    
        r3 = r8 + r3;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.crypto.tink.shaded.protobuf.f0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int d(AbstractC5917x abstractC5917x) {
        int i11;
        int b11;
        int i12;
        int t2;
        int i13;
        int[] iArr = this.f59326a;
        int length = iArr.length;
        int i14 = 0;
        for (int i15 = 0; i15 < length; i15 += 3) {
            int Q11 = Q(i15);
            int i16 = iArr[i15];
            long j11 = 1048575 & Q11;
            int i17 = 1237;
            int i18 = 37;
            switch (P(Q11)) {
                case 0:
                    i11 = i14 * 53;
                    b11 = C5919z.b(Double.doubleToLongBits(p0.r(abstractC5917x, j11)));
                    i14 = b11 + i11;
                    break;
                case 1:
                    i11 = i14 * 53;
                    b11 = Float.floatToIntBits(p0.s(abstractC5917x, j11));
                    i14 = b11 + i11;
                    break;
                case 2:
                    i11 = i14 * 53;
                    b11 = C5919z.b(p0.u(abstractC5917x, j11));
                    i14 = b11 + i11;
                    break;
                case 3:
                    i11 = i14 * 53;
                    b11 = C5919z.b(p0.u(abstractC5917x, j11));
                    i14 = b11 + i11;
                    break;
                case 4:
                    i12 = i14 * 53;
                    t2 = p0.t(abstractC5917x, j11);
                    i14 = i12 + t2;
                    break;
                case 5:
                    i11 = i14 * 53;
                    b11 = C5919z.b(p0.u(abstractC5917x, j11));
                    i14 = b11 + i11;
                    break;
                case 6:
                    i12 = i14 * 53;
                    t2 = p0.t(abstractC5917x, j11);
                    i14 = i12 + t2;
                    break;
                case 7:
                    i13 = i14 * 53;
                    boolean p11 = p0.p(abstractC5917x, j11);
                    byte[] bArr = C5919z.f59481b;
                    break;
                case 8:
                    i11 = i14 * 53;
                    b11 = ((String) p0.v(abstractC5917x, j11)).hashCode();
                    i14 = b11 + i11;
                    break;
                case 9:
                    Object v11 = p0.v(abstractC5917x, j11);
                    if (v11 != null) {
                        i18 = v11.hashCode();
                    }
                    i14 = (i14 * 53) + i18;
                    break;
                case 10:
                    i11 = i14 * 53;
                    b11 = p0.v(abstractC5917x, j11).hashCode();
                    i14 = b11 + i11;
                    break;
                case 11:
                    i12 = i14 * 53;
                    t2 = p0.t(abstractC5917x, j11);
                    i14 = i12 + t2;
                    break;
                case 12:
                    i12 = i14 * 53;
                    t2 = p0.t(abstractC5917x, j11);
                    i14 = i12 + t2;
                    break;
                case 13:
                    i12 = i14 * 53;
                    t2 = p0.t(abstractC5917x, j11);
                    i14 = i12 + t2;
                    break;
                case 14:
                    i11 = i14 * 53;
                    b11 = C5919z.b(p0.u(abstractC5917x, j11));
                    i14 = b11 + i11;
                    break;
                case 15:
                    i12 = i14 * 53;
                    t2 = p0.t(abstractC5917x, j11);
                    i14 = i12 + t2;
                    break;
                case 16:
                    i11 = i14 * 53;
                    b11 = C5919z.b(p0.u(abstractC5917x, j11));
                    i14 = b11 + i11;
                    break;
                case 17:
                    Object v12 = p0.v(abstractC5917x, j11);
                    if (v12 != null) {
                        i18 = v12.hashCode();
                    }
                    i14 = (i14 * 53) + i18;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case TombstoneProtos$Tombstone.GUEST_THREADS_FIELD_NUMBER /* 25 */:
                case TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER /* 26 */:
                case DescriptorProtos$FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                case 28:
                case 29:
                case AppUpdateInfo.Factory.DAYS_BETWEEN_30 /* 30 */:
                case DescriptorProtos$FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                case 32:
                case 33:
                case 34:
                case DescriptorProtos$MethodOptions.FEATURES_FIELD_NUMBER /* 35 */:
                case DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                case DescriptorProtos$FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                case 38:
                case DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                case 40:
                case 41:
                case 42:
                case 43:
                case DescriptorProtos$FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                case DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                case 46:
                case 47:
                case 48:
                case 49:
                    i11 = i14 * 53;
                    b11 = p0.v(abstractC5917x, j11).hashCode();
                    i14 = b11 + i11;
                    break;
                case 50:
                    i11 = i14 * 53;
                    b11 = p0.v(abstractC5917x, j11).hashCode();
                    i14 = b11 + i11;
                    break;
                case 51:
                    if (q(abstractC5917x, i16, i15)) {
                        i11 = i14 * 53;
                        b11 = C5919z.b(Double.doubleToLongBits(((Double) p0.v(abstractC5917x, j11)).doubleValue()));
                        i14 = b11 + i11;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (q(abstractC5917x, i16, i15)) {
                        i11 = i14 * 53;
                        b11 = Float.floatToIntBits(((Float) p0.v(abstractC5917x, j11)).floatValue());
                        i14 = b11 + i11;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (q(abstractC5917x, i16, i15)) {
                        i11 = i14 * 53;
                        b11 = C5919z.b(A(abstractC5917x, j11));
                        i14 = b11 + i11;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (q(abstractC5917x, i16, i15)) {
                        i11 = i14 * 53;
                        b11 = C5919z.b(A(abstractC5917x, j11));
                        i14 = b11 + i11;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (q(abstractC5917x, i16, i15)) {
                        i12 = i14 * 53;
                        t2 = z(abstractC5917x, j11);
                        i14 = i12 + t2;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (q(abstractC5917x, i16, i15)) {
                        i11 = i14 * 53;
                        b11 = C5919z.b(A(abstractC5917x, j11));
                        i14 = b11 + i11;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (q(abstractC5917x, i16, i15)) {
                        i12 = i14 * 53;
                        t2 = z(abstractC5917x, j11);
                        i14 = i12 + t2;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (q(abstractC5917x, i16, i15)) {
                        i13 = i14 * 53;
                        boolean booleanValue = ((Boolean) p0.v(abstractC5917x, j11)).booleanValue();
                        byte[] bArr2 = C5919z.f59481b;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (q(abstractC5917x, i16, i15)) {
                        i11 = i14 * 53;
                        b11 = ((String) p0.v(abstractC5917x, j11)).hashCode();
                        i14 = b11 + i11;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (q(abstractC5917x, i16, i15)) {
                        i11 = i14 * 53;
                        b11 = p0.v(abstractC5917x, j11).hashCode();
                        i14 = b11 + i11;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (q(abstractC5917x, i16, i15)) {
                        i11 = i14 * 53;
                        b11 = p0.v(abstractC5917x, j11).hashCode();
                        i14 = b11 + i11;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (q(abstractC5917x, i16, i15)) {
                        i12 = i14 * 53;
                        t2 = z(abstractC5917x, j11);
                        i14 = i12 + t2;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (q(abstractC5917x, i16, i15)) {
                        i12 = i14 * 53;
                        t2 = z(abstractC5917x, j11);
                        i14 = i12 + t2;
                        break;
                    } else {
                        break;
                    }
                case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
                    if (q(abstractC5917x, i16, i15)) {
                        i12 = i14 * 53;
                        t2 = z(abstractC5917x, j11);
                        i14 = i12 + t2;
                        break;
                    } else {
                        break;
                    }
                case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                    if (q(abstractC5917x, i16, i15)) {
                        i11 = i14 * 53;
                        b11 = C5919z.b(A(abstractC5917x, j11));
                        i14 = b11 + i11;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (q(abstractC5917x, i16, i15)) {
                        i12 = i14 * 53;
                        t2 = z(abstractC5917x, j11);
                        i14 = i12 + t2;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (q(abstractC5917x, i16, i15)) {
                        i11 = i14 * 53;
                        b11 = C5919z.b(A(abstractC5917x, j11));
                        i14 = b11 + i11;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (q(abstractC5917x, i16, i15)) {
                        i11 = i14 * 53;
                        b11 = p0.v(abstractC5917x, j11).hashCode();
                        i14 = b11 + i11;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = this.f59338m.g(abstractC5917x).hashCode() + (i14 * 53);
        return this.f59331f ? (hashCode * 53) + this.f59339n.c(abstractC5917x).hashCode() : hashCode;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.crypto.tink.shaded.protobuf.f0
    public final int e(AbstractC5895a abstractC5895a) {
        int i11;
        int i12;
        int i13;
        int i14;
        int k11;
        int i15;
        int k12;
        int i16;
        int i17;
        int j11;
        int c11;
        int i18;
        int c12;
        int i19;
        int size;
        int i21;
        int i22;
        int i23;
        int i24;
        int j12;
        int i25;
        int serializedSize;
        int i26;
        int i27;
        int i28;
        int k13;
        int i29;
        int k14;
        int i31;
        V<T> v11 = this;
        T t2 = abstractC5895a;
        int i32 = 1;
        Unsafe unsafe = f59324q;
        int i33 = 0;
        int i34 = 0;
        int i35 = 0;
        int i36 = 1048575;
        while (true) {
            int[] iArr = v11.f59326a;
            if (i33 >= iArr.length) {
                m0<?, ?> m0Var = v11.f59338m;
                int h11 = i35 + m0Var.h(m0Var.g(t2));
                return v11.f59331f ? h11 + v11.f59339n.c(t2).g() : h11;
            }
            int Q11 = v11.Q(i33);
            int P11 = P(Q11);
            int i37 = iArr[i33];
            int i38 = iArr[i33 + 2];
            int i39 = i38 & 1048575;
            if (P11 <= 17) {
                if (i39 != i36) {
                    i34 = i39 == 1048575 ? 0 : unsafe.getInt(t2, i39);
                    i36 = i39;
                }
                i11 = i32 << (i38 >>> 20);
            } else {
                i11 = 0;
            }
            long j13 = Q11 & 1048575;
            if (P11 >= EnumC5914u.DOUBLE_LIST_PACKED.a()) {
                EnumC5914u.SINT64_LIST_PACKED.a();
            }
            switch (P11) {
                case 0:
                    i12 = i32;
                    if (v11.o(t2, i33, i36, i34, i11)) {
                        i35 += AbstractC5906l.i(i37) + 8;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    i12 = i32;
                    if (v11.o(t2, i33, i36, i34, i11)) {
                        i13 = AbstractC5906l.i(i37);
                        i17 = i13 + 4;
                        i35 += i17;
                    }
                    v11 = this;
                    t2 = abstractC5895a;
                    break;
                case 2:
                    i12 = i32;
                    if (v11.o(t2, i33, i36, i34, i11)) {
                        long j14 = unsafe.getLong(t2, j13);
                        i14 = AbstractC5906l.i(i37);
                        k11 = AbstractC5906l.k(j14);
                        i35 += k11 + i14;
                    }
                    v11 = this;
                    break;
                case 3:
                    i12 = i32;
                    if (v11.o(t2, i33, i36, i34, i11)) {
                        long j15 = unsafe.getLong(t2, j13);
                        i14 = AbstractC5906l.i(i37);
                        k11 = AbstractC5906l.k(j15);
                        i35 += k11 + i14;
                    }
                    v11 = this;
                    break;
                case 4:
                    i12 = i32;
                    if (v11.o(t2, i33, i36, i34, i11)) {
                        int i41 = unsafe.getInt(t2, j13);
                        i15 = AbstractC5906l.i(i37);
                        k12 = AbstractC5906l.k(i41);
                        c11 = k12 + i15;
                        i35 += c11;
                    }
                    v11 = this;
                    break;
                case 5:
                    i12 = i32;
                    if (v11.o(t2, i33, i36, i34, i11)) {
                        i16 = AbstractC5906l.i(i37);
                        i17 = i16 + 8;
                        i35 += i17;
                    }
                    v11 = this;
                    t2 = abstractC5895a;
                    break;
                case 6:
                    i12 = i32;
                    if (v11.o(t2, i33, i36, i34, i11)) {
                        i13 = AbstractC5906l.i(i37);
                        i17 = i13 + 4;
                        i35 += i17;
                    }
                    v11 = this;
                    t2 = abstractC5895a;
                    break;
                case 7:
                    i12 = i32;
                    if (v11.o(t2, i33, i36, i34, i11)) {
                        i17 = AbstractC5906l.i(i37) + 1;
                        i35 += i17;
                    }
                    v11 = this;
                    t2 = abstractC5895a;
                    break;
                case 8:
                    i12 = i32;
                    if (v11.o(t2, i33, i36, i34, i11)) {
                        Object object = unsafe.getObject(t2, j13);
                        i35 = (object instanceof AbstractC5903i ? AbstractC5906l.c(i37, (AbstractC5903i) object) : AbstractC5906l.h((String) object) + AbstractC5906l.i(i37)) + i35;
                    }
                    v11 = this;
                    break;
                case 9:
                    i12 = i32;
                    if (v11.o(t2, i33, i36, i34, i11)) {
                        Object object2 = unsafe.getObject(t2, j13);
                        f0 l11 = v11.l(i33);
                        int i42 = g0.f59373d;
                        if (object2 instanceof D) {
                            j11 = AbstractC5906l.e((D) object2) + AbstractC5906l.i(i37);
                        } else {
                            int i43 = AbstractC5906l.i(i37);
                            int c13 = ((AbstractC5895a) object2).c(l11);
                            j11 = AbstractC5906l.j(c13) + c13 + i43;
                        }
                        i35 += j11;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    i12 = i32;
                    if (v11.o(t2, i33, i36, i34, i11)) {
                        c11 = AbstractC5906l.c(i37, (AbstractC5903i) unsafe.getObject(t2, j13));
                        i35 += c11;
                    }
                    v11 = this;
                    break;
                case 11:
                    i12 = i32;
                    if (v11.o(t2, i33, i36, i34, i11)) {
                        int i44 = unsafe.getInt(t2, j13);
                        i15 = AbstractC5906l.i(i37);
                        k12 = AbstractC5906l.j(i44);
                        c11 = k12 + i15;
                        i35 += c11;
                    }
                    v11 = this;
                    break;
                case 12:
                    i12 = i32;
                    if (v11.o(t2, i33, i36, i34, i11)) {
                        int i45 = unsafe.getInt(t2, j13);
                        i15 = AbstractC5906l.i(i37);
                        k12 = AbstractC5906l.k(i45);
                        c11 = k12 + i15;
                        i35 += c11;
                    }
                    v11 = this;
                    break;
                case 13:
                    i12 = i32;
                    if (v11.o(t2, i33, i36, i34, i11)) {
                        i13 = AbstractC5906l.i(i37);
                        i17 = i13 + 4;
                        i35 += i17;
                    }
                    v11 = this;
                    t2 = abstractC5895a;
                    break;
                case 14:
                    i12 = i32;
                    if (v11.o(t2, i33, i36, i34, i11)) {
                        i16 = AbstractC5906l.i(i37);
                        i17 = i16 + 8;
                        i35 += i17;
                    }
                    v11 = this;
                    t2 = abstractC5895a;
                    break;
                case 15:
                    i12 = i32;
                    if (v11.o(t2, i33, i36, i34, i11)) {
                        int i46 = unsafe.getInt(t2, j13);
                        i15 = AbstractC5906l.i(i37);
                        k12 = AbstractC5906l.f(i46);
                        c11 = k12 + i15;
                        i35 += c11;
                    }
                    v11 = this;
                    break;
                case 16:
                    i12 = i32;
                    if (v11.o(t2, i33, i36, i34, i11)) {
                        long j16 = unsafe.getLong(t2, j13);
                        i14 = AbstractC5906l.i(i37);
                        k11 = AbstractC5906l.g(j16);
                        i35 += k11 + i14;
                    }
                    v11 = this;
                    break;
                case 17:
                    i12 = i32;
                    if (v11.o(t2, i33, i36, i34, i11)) {
                        S s11 = (S) unsafe.getObject(t2, j13);
                        f0 l12 = v11.l(i33);
                        i18 = AbstractC5906l.i(i37) * 2;
                        c12 = ((AbstractC5895a) s11).c(l12);
                        i35 += i18 + c12;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    i12 = i32;
                    j11 = g0.c(i37, (List) unsafe.getObject(t2, j13));
                    i35 += j11;
                    break;
                case 19:
                    i12 = i32;
                    j11 = g0.b(i37, (List) unsafe.getObject(t2, j13));
                    i35 += j11;
                    break;
                case 20:
                    i12 = i32;
                    List list = (List) unsafe.getObject(t2, j13);
                    int i47 = g0.f59373d;
                    if (list.size() != 0) {
                        i19 = (AbstractC5906l.i(i37) * list.size()) + g0.e(list);
                        i35 += i19;
                        break;
                    }
                    i19 = 0;
                    i35 += i19;
                case 21:
                    i12 = i32;
                    List list2 = (List) unsafe.getObject(t2, j13);
                    int i48 = g0.f59373d;
                    size = list2.size();
                    if (size != 0) {
                        i21 = g0.i(list2);
                        i22 = AbstractC5906l.i(i37);
                        i19 = (i22 * size) + i21;
                        i35 += i19;
                        break;
                    }
                    i19 = 0;
                    i35 += i19;
                case 22:
                    i12 = i32;
                    List list3 = (List) unsafe.getObject(t2, j13);
                    int i49 = g0.f59373d;
                    size = list3.size();
                    if (size != 0) {
                        i21 = g0.d(list3);
                        i22 = AbstractC5906l.i(i37);
                        i19 = (i22 * size) + i21;
                        i35 += i19;
                        break;
                    }
                    i19 = 0;
                    i35 += i19;
                case 23:
                    i12 = i32;
                    j11 = g0.c(i37, (List) unsafe.getObject(t2, j13));
                    i35 += j11;
                    break;
                case 24:
                    i12 = i32;
                    j11 = g0.b(i37, (List) unsafe.getObject(t2, j13));
                    i35 += j11;
                    break;
                case TombstoneProtos$Tombstone.GUEST_THREADS_FIELD_NUMBER /* 25 */:
                    i12 = i32;
                    List list4 = (List) unsafe.getObject(t2, j13);
                    int i51 = g0.f59373d;
                    int size2 = list4.size();
                    i35 += size2 == 0 ? 0 : (AbstractC5906l.i(i37) + 1) * size2;
                    break;
                case TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER /* 26 */:
                    i12 = i32;
                    List list5 = (List) unsafe.getObject(t2, j13);
                    int i52 = g0.f59373d;
                    int size3 = list5.size();
                    if (size3 != 0) {
                        i19 = AbstractC5906l.i(i37) * size3;
                        if (list5 instanceof E) {
                            E e11 = (E) list5;
                            for (int i53 = 0; i53 < size3; i53++) {
                                Object y11 = e11.y();
                                i19 = (y11 instanceof AbstractC5903i ? AbstractC5906l.d((AbstractC5903i) y11) : AbstractC5906l.h((String) y11)) + i19;
                            }
                        } else {
                            for (int i54 = 0; i54 < size3; i54++) {
                                Object obj = list5.get(i54);
                                i19 = (obj instanceof AbstractC5903i ? AbstractC5906l.d((AbstractC5903i) obj) : AbstractC5906l.h((String) obj)) + i19;
                            }
                        }
                        i35 += i19;
                        break;
                    }
                    i19 = 0;
                    i35 += i19;
                case DescriptorProtos$FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                    i12 = i32;
                    List list6 = (List) unsafe.getObject(t2, j13);
                    f0 l13 = v11.l(i33);
                    int i55 = g0.f59373d;
                    int size4 = list6.size();
                    if (size4 == 0) {
                        i23 = 0;
                    } else {
                        i23 = AbstractC5906l.i(i37) * size4;
                        for (int i56 = 0; i56 < size4; i56++) {
                            Object obj2 = list6.get(i56);
                            if (obj2 instanceof D) {
                                i23 = AbstractC5906l.e((D) obj2) + i23;
                            } else {
                                int c14 = ((AbstractC5895a) obj2).c(l13);
                                i23 = AbstractC5906l.j(c14) + c14 + i23;
                            }
                        }
                    }
                    i35 += i23;
                    break;
                case 28:
                    i12 = i32;
                    List list7 = (List) unsafe.getObject(t2, j13);
                    int i57 = g0.f59373d;
                    int size5 = list7.size();
                    if (size5 != 0) {
                        i19 = AbstractC5906l.i(i37) * size5;
                        for (int i58 = 0; i58 < list7.size(); i58++) {
                            i19 += AbstractC5906l.d((AbstractC5903i) list7.get(i58));
                        }
                        i35 += i19;
                        break;
                    }
                    i19 = 0;
                    i35 += i19;
                case 29:
                    i12 = i32;
                    List list8 = (List) unsafe.getObject(t2, j13);
                    int i59 = g0.f59373d;
                    size = list8.size();
                    if (size != 0) {
                        i21 = g0.h(list8);
                        i22 = AbstractC5906l.i(i37);
                        i19 = (i22 * size) + i21;
                        i35 += i19;
                        break;
                    }
                    i19 = 0;
                    i35 += i19;
                case AppUpdateInfo.Factory.DAYS_BETWEEN_30 /* 30 */:
                    i12 = i32;
                    List list9 = (List) unsafe.getObject(t2, j13);
                    int i61 = g0.f59373d;
                    size = list9.size();
                    if (size != 0) {
                        i21 = g0.a(list9);
                        i22 = AbstractC5906l.i(i37);
                        i19 = (i22 * size) + i21;
                        i35 += i19;
                        break;
                    }
                    i19 = 0;
                    i35 += i19;
                case DescriptorProtos$FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                    i12 = i32;
                    j11 = g0.b(i37, (List) unsafe.getObject(t2, j13));
                    i35 += j11;
                    break;
                case 32:
                    i12 = i32;
                    j11 = g0.c(i37, (List) unsafe.getObject(t2, j13));
                    i35 += j11;
                    break;
                case 33:
                    i12 = i32;
                    List list10 = (List) unsafe.getObject(t2, j13);
                    int i62 = g0.f59373d;
                    size = list10.size();
                    if (size != 0) {
                        i21 = g0.f(list10);
                        i22 = AbstractC5906l.i(i37);
                        i19 = (i22 * size) + i21;
                        i35 += i19;
                        break;
                    }
                    i19 = 0;
                    i35 += i19;
                case 34:
                    i12 = i32;
                    List list11 = (List) unsafe.getObject(t2, j13);
                    int i63 = g0.f59373d;
                    size = list11.size();
                    if (size != 0) {
                        i21 = g0.g(list11);
                        i22 = AbstractC5906l.i(i37);
                        i19 = (i22 * size) + i21;
                        i35 += i19;
                        break;
                    }
                    i19 = 0;
                    i35 += i19;
                case DescriptorProtos$MethodOptions.FEATURES_FIELD_NUMBER /* 35 */:
                    i12 = i32;
                    List list12 = (List) unsafe.getObject(t2, j13);
                    int i64 = g0.f59373d;
                    c12 = list12.size() * 8;
                    if (c12 > 0) {
                        i24 = AbstractC5906l.i(i37);
                        j12 = AbstractC5906l.j(c12);
                        i18 = j12 + i24;
                        i35 += i18 + c12;
                        break;
                    } else {
                        break;
                    }
                case DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                    i12 = i32;
                    List list13 = (List) unsafe.getObject(t2, j13);
                    int i65 = g0.f59373d;
                    c12 = list13.size() * 4;
                    if (c12 > 0) {
                        i24 = AbstractC5906l.i(i37);
                        j12 = AbstractC5906l.j(c12);
                        i18 = j12 + i24;
                        i35 += i18 + c12;
                        break;
                    } else {
                        break;
                    }
                case DescriptorProtos$FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                    i12 = i32;
                    c12 = g0.e((List) unsafe.getObject(t2, j13));
                    if (c12 > 0) {
                        i24 = AbstractC5906l.i(i37);
                        j12 = AbstractC5906l.j(c12);
                        i18 = j12 + i24;
                        i35 += i18 + c12;
                        break;
                    } else {
                        break;
                    }
                case 38:
                    i12 = i32;
                    c12 = g0.i((List) unsafe.getObject(t2, j13));
                    if (c12 > 0) {
                        i24 = AbstractC5906l.i(i37);
                        j12 = AbstractC5906l.j(c12);
                        i18 = j12 + i24;
                        i35 += i18 + c12;
                        break;
                    } else {
                        break;
                    }
                case DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                    i12 = i32;
                    c12 = g0.d((List) unsafe.getObject(t2, j13));
                    if (c12 > 0) {
                        i24 = AbstractC5906l.i(i37);
                        j12 = AbstractC5906l.j(c12);
                        i18 = j12 + i24;
                        i35 += i18 + c12;
                        break;
                    } else {
                        break;
                    }
                case 40:
                    i12 = i32;
                    List list14 = (List) unsafe.getObject(t2, j13);
                    int i66 = g0.f59373d;
                    c12 = list14.size() * 8;
                    if (c12 > 0) {
                        i24 = AbstractC5906l.i(i37);
                        j12 = AbstractC5906l.j(c12);
                        i18 = j12 + i24;
                        i35 += i18 + c12;
                        break;
                    } else {
                        break;
                    }
                case 41:
                    i12 = i32;
                    List list15 = (List) unsafe.getObject(t2, j13);
                    int i67 = g0.f59373d;
                    c12 = list15.size() * 4;
                    if (c12 > 0) {
                        i24 = AbstractC5906l.i(i37);
                        j12 = AbstractC5906l.j(c12);
                        i18 = j12 + i24;
                        i35 += i18 + c12;
                        break;
                    } else {
                        break;
                    }
                case 42:
                    i12 = i32;
                    List list16 = (List) unsafe.getObject(t2, j13);
                    int i68 = g0.f59373d;
                    c12 = list16.size();
                    if (c12 > 0) {
                        i24 = AbstractC5906l.i(i37);
                        j12 = AbstractC5906l.j(c12);
                        i18 = j12 + i24;
                        i35 += i18 + c12;
                        break;
                    } else {
                        break;
                    }
                case 43:
                    i12 = i32;
                    c12 = g0.h((List) unsafe.getObject(t2, j13));
                    if (c12 > 0) {
                        i24 = AbstractC5906l.i(i37);
                        j12 = AbstractC5906l.j(c12);
                        i18 = j12 + i24;
                        i35 += i18 + c12;
                        break;
                    } else {
                        break;
                    }
                case DescriptorProtos$FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                    i12 = i32;
                    c12 = g0.a((List) unsafe.getObject(t2, j13));
                    if (c12 > 0) {
                        i24 = AbstractC5906l.i(i37);
                        j12 = AbstractC5906l.j(c12);
                        i18 = j12 + i24;
                        i35 += i18 + c12;
                        break;
                    } else {
                        break;
                    }
                case DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                    i12 = i32;
                    List list17 = (List) unsafe.getObject(t2, j13);
                    int i69 = g0.f59373d;
                    c12 = list17.size() * 4;
                    if (c12 > 0) {
                        i24 = AbstractC5906l.i(i37);
                        j12 = AbstractC5906l.j(c12);
                        i18 = j12 + i24;
                        i35 += i18 + c12;
                        break;
                    } else {
                        break;
                    }
                case 46:
                    i12 = i32;
                    List list18 = (List) unsafe.getObject(t2, j13);
                    int i71 = g0.f59373d;
                    c12 = list18.size() * 8;
                    if (c12 > 0) {
                        i24 = AbstractC5906l.i(i37);
                        j12 = AbstractC5906l.j(c12);
                        i18 = j12 + i24;
                        i35 += i18 + c12;
                        break;
                    } else {
                        break;
                    }
                case 47:
                    i12 = i32;
                    c12 = g0.f((List) unsafe.getObject(t2, j13));
                    if (c12 > 0) {
                        i24 = AbstractC5906l.i(i37);
                        j12 = AbstractC5906l.j(c12);
                        i18 = j12 + i24;
                        i35 += i18 + c12;
                        break;
                    } else {
                        break;
                    }
                case 48:
                    i12 = i32;
                    c12 = g0.g((List) unsafe.getObject(t2, j13));
                    if (c12 > 0) {
                        i24 = AbstractC5906l.i(i37);
                        j12 = AbstractC5906l.j(c12);
                        i18 = j12 + i24;
                        i35 += i18 + c12;
                        break;
                    } else {
                        break;
                    }
                case 49:
                    List list19 = (List) unsafe.getObject(t2, j13);
                    f0 l14 = v11.l(i33);
                    int i72 = g0.f59373d;
                    int size6 = list19.size();
                    if (size6 == 0) {
                        i25 = 0;
                    } else {
                        int i73 = 0;
                        i25 = 0;
                        while (i73 < size6) {
                            i25 = (AbstractC5906l.i(i37) * 2) + ((AbstractC5895a) ((S) list19.get(i73))).c(l14) + i25;
                            i73++;
                            i32 = i32;
                        }
                    }
                    i12 = i32;
                    i35 += i25;
                    break;
                case 50:
                    serializedSize = v11.f59340o.getSerializedSize(i37, unsafe.getObject(t2, j13), v11.k(i33));
                    i35 += serializedSize;
                    i12 = i32;
                    break;
                case 51:
                    if (v11.q(t2, i37, i33)) {
                        i26 = AbstractC5906l.i(i37);
                        i31 = i26 + 8;
                        i35 += i31;
                    }
                    i12 = i32;
                    break;
                case 52:
                    if (v11.q(t2, i37, i33)) {
                        i27 = AbstractC5906l.i(i37);
                        i31 = i27 + 4;
                        i35 += i31;
                    }
                    i12 = i32;
                    break;
                case 53:
                    if (v11.q(t2, i37, i33)) {
                        long A11 = A(t2, j13);
                        i28 = AbstractC5906l.i(i37);
                        k13 = AbstractC5906l.k(A11);
                        i35 += k13 + i28;
                    }
                    i12 = i32;
                    break;
                case 54:
                    if (v11.q(t2, i37, i33)) {
                        long A12 = A(t2, j13);
                        i28 = AbstractC5906l.i(i37);
                        k13 = AbstractC5906l.k(A12);
                        i35 += k13 + i28;
                    }
                    i12 = i32;
                    break;
                case 55:
                    if (v11.q(t2, i37, i33)) {
                        int z11 = z(t2, j13);
                        i29 = AbstractC5906l.i(i37);
                        k14 = AbstractC5906l.k(z11);
                        i31 = k14 + i29;
                        i35 += i31;
                    }
                    i12 = i32;
                    break;
                case 56:
                    if (v11.q(t2, i37, i33)) {
                        i26 = AbstractC5906l.i(i37);
                        i31 = i26 + 8;
                        i35 += i31;
                    }
                    i12 = i32;
                    break;
                case 57:
                    if (v11.q(t2, i37, i33)) {
                        i27 = AbstractC5906l.i(i37);
                        i31 = i27 + 4;
                        i35 += i31;
                    }
                    i12 = i32;
                    break;
                case 58:
                    if (v11.q(t2, i37, i33)) {
                        i31 = AbstractC5906l.i(i37) + i32;
                        i35 += i31;
                    }
                    i12 = i32;
                    break;
                case 59:
                    if (v11.q(t2, i37, i33)) {
                        Object object3 = unsafe.getObject(t2, j13);
                        i35 = (object3 instanceof AbstractC5903i ? AbstractC5906l.c(i37, (AbstractC5903i) object3) : AbstractC5906l.h((String) object3) + AbstractC5906l.i(i37)) + i35;
                    }
                    i12 = i32;
                    break;
                case 60:
                    if (v11.q(t2, i37, i33)) {
                        Object object4 = unsafe.getObject(t2, j13);
                        f0 l15 = v11.l(i33);
                        int i74 = g0.f59373d;
                        if (object4 instanceof D) {
                            serializedSize = AbstractC5906l.e((D) object4) + AbstractC5906l.i(i37);
                        } else {
                            int i75 = AbstractC5906l.i(i37);
                            int c15 = ((AbstractC5895a) object4).c(l15);
                            serializedSize = AbstractC5906l.j(c15) + c15 + i75;
                        }
                        i35 += serializedSize;
                    }
                    i12 = i32;
                    break;
                case 61:
                    if (v11.q(t2, i37, i33)) {
                        i31 = AbstractC5906l.c(i37, (AbstractC5903i) unsafe.getObject(t2, j13));
                        i35 += i31;
                    }
                    i12 = i32;
                    break;
                case 62:
                    if (v11.q(t2, i37, i33)) {
                        int z12 = z(t2, j13);
                        i29 = AbstractC5906l.i(i37);
                        k14 = AbstractC5906l.j(z12);
                        i31 = k14 + i29;
                        i35 += i31;
                    }
                    i12 = i32;
                    break;
                case 63:
                    if (v11.q(t2, i37, i33)) {
                        int z13 = z(t2, j13);
                        i29 = AbstractC5906l.i(i37);
                        k14 = AbstractC5906l.k(z13);
                        i31 = k14 + i29;
                        i35 += i31;
                    }
                    i12 = i32;
                    break;
                case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
                    if (v11.q(t2, i37, i33)) {
                        i27 = AbstractC5906l.i(i37);
                        i31 = i27 + 4;
                        i35 += i31;
                    }
                    i12 = i32;
                    break;
                case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                    if (v11.q(t2, i37, i33)) {
                        i26 = AbstractC5906l.i(i37);
                        i31 = i26 + 8;
                        i35 += i31;
                    }
                    i12 = i32;
                    break;
                case 66:
                    if (v11.q(t2, i37, i33)) {
                        int z14 = z(t2, j13);
                        i29 = AbstractC5906l.i(i37);
                        k14 = AbstractC5906l.f(z14);
                        i31 = k14 + i29;
                        i35 += i31;
                    }
                    i12 = i32;
                    break;
                case 67:
                    if (v11.q(t2, i37, i33)) {
                        long A13 = A(t2, j13);
                        i28 = AbstractC5906l.i(i37);
                        k13 = AbstractC5906l.g(A13);
                        i35 += k13 + i28;
                    }
                    i12 = i32;
                    break;
                case 68:
                    if (v11.q(t2, i37, i33)) {
                        i35 += (AbstractC5906l.i(i37) * 2) + ((AbstractC5895a) ((S) unsafe.getObject(t2, j13))).c(v11.l(i33));
                    }
                    i12 = i32;
                    break;
                default:
                    i12 = i32;
                    break;
            }
            i33 += 3;
            i32 = i12;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x04f7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:286:0x04f8  */
    @Override // com.google.crypto.tink.shaded.protobuf.f0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(T t2, t0 t0Var) throws IOException {
        Map.Entry<?, Object> entry;
        int length;
        C5907m c5907m = (C5907m) t0Var;
        c5907m.getClass();
        if (t0.a.ASCENDING != t0.a.DESCENDING) {
            R(t2, t0Var);
            return;
        }
        m0<?, ?> m0Var = this.f59338m;
        m0Var.r(m0Var.g(t2), t0Var);
        boolean z11 = this.f59331f;
        AbstractC5911q<?> abstractC5911q = this.f59339n;
        if (z11) {
            C5913t<?> c11 = abstractC5911q.c(t2);
            if (!c11.h()) {
                entry = c11.c().next();
                int[] iArr = this.f59326a;
                for (length = iArr.length - 3; length >= 0; length -= 3) {
                    int Q11 = Q(length);
                    int i11 = iArr[length];
                    if (entry != null) {
                        abstractC5911q.a(entry);
                        if (i11 < 0) {
                            abstractC5911q.j(entry);
                            throw null;
                        }
                    }
                    switch (P(Q11)) {
                        case 0:
                            if (n(t2, length)) {
                                c5907m.f(i11, p0.r(t2, Q11 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 1:
                            if (n(t2, length)) {
                                c5907m.o(i11, p0.s(t2, Q11 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 2:
                            if (n(t2, length)) {
                                c5907m.t(i11, p0.u(t2, Q11 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 3:
                            if (n(t2, length)) {
                                c5907m.L(i11, p0.u(t2, Q11 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 4:
                            if (n(t2, length)) {
                                c5907m.r(i11, p0.t(t2, Q11 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 5:
                            if (n(t2, length)) {
                                c5907m.m(i11, p0.u(t2, Q11 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 6:
                            if (n(t2, length)) {
                                c5907m.k(i11, p0.t(t2, Q11 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 7:
                            if (n(t2, length)) {
                                c5907m.b(i11, p0.p(t2, Q11 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 8:
                            if (n(t2, length)) {
                                S(i11, p0.v(t2, Q11 & 1048575), t0Var);
                                break;
                            } else {
                                break;
                            }
                        case 9:
                            if (n(t2, length)) {
                                c5907m.w(i11, p0.v(t2, Q11 & 1048575), l(length));
                                break;
                            } else {
                                break;
                            }
                        case 10:
                            if (n(t2, length)) {
                                c5907m.d(i11, (AbstractC5903i) p0.v(t2, Q11 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 11:
                            if (n(t2, length)) {
                                c5907m.J(i11, p0.t(t2, Q11 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 12:
                            if (n(t2, length)) {
                                c5907m.i(i11, p0.t(t2, Q11 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 13:
                            if (n(t2, length)) {
                                c5907m.y(i11, p0.t(t2, Q11 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 14:
                            if (n(t2, length)) {
                                c5907m.A(i11, p0.u(t2, Q11 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 15:
                            if (n(t2, length)) {
                                c5907m.C(i11, p0.t(t2, Q11 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 16:
                            if (n(t2, length)) {
                                c5907m.E(i11, p0.u(t2, Q11 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 17:
                            if (n(t2, length)) {
                                c5907m.q(i11, p0.v(t2, Q11 & 1048575), l(length));
                                break;
                            } else {
                                break;
                            }
                        case 18:
                            g0.q(iArr[length], (List) p0.v(t2, Q11 & 1048575), t0Var, false);
                            break;
                        case 19:
                            g0.u(iArr[length], (List) p0.v(t2, Q11 & 1048575), t0Var, false);
                            break;
                        case 20:
                            g0.x(iArr[length], (List) p0.v(t2, Q11 & 1048575), t0Var, false);
                            break;
                        case 21:
                            g0.E(iArr[length], (List) p0.v(t2, Q11 & 1048575), t0Var, false);
                            break;
                        case 22:
                            g0.w(iArr[length], (List) p0.v(t2, Q11 & 1048575), t0Var, false);
                            break;
                        case 23:
                            g0.t(iArr[length], (List) p0.v(t2, Q11 & 1048575), t0Var, false);
                            break;
                        case 24:
                            g0.s(iArr[length], (List) p0.v(t2, Q11 & 1048575), t0Var, false);
                            break;
                        case TombstoneProtos$Tombstone.GUEST_THREADS_FIELD_NUMBER /* 25 */:
                            g0.p(iArr[length], (List) p0.v(t2, Q11 & 1048575), t0Var, false);
                            break;
                        case TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER /* 26 */:
                            int i12 = iArr[length];
                            List<String> list = (List) p0.v(t2, Q11 & 1048575);
                            int i13 = g0.f59373d;
                            if (list != null && !list.isEmpty()) {
                                c5907m.I(i12, list);
                                break;
                            }
                            break;
                        case DescriptorProtos$FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                            g0.y(iArr[length], (List) p0.v(t2, Q11 & 1048575), t0Var, l(length));
                            break;
                        case 28:
                            int i14 = iArr[length];
                            List<AbstractC5903i> list2 = (List) p0.v(t2, Q11 & 1048575);
                            int i15 = g0.f59373d;
                            if (list2 != null && !list2.isEmpty()) {
                                c5907m.e(i14, list2);
                                break;
                            }
                            break;
                        case 29:
                            g0.D(iArr[length], (List) p0.v(t2, Q11 & 1048575), t0Var, false);
                            break;
                        case AppUpdateInfo.Factory.DAYS_BETWEEN_30 /* 30 */:
                            g0.r(iArr[length], (List) p0.v(t2, Q11 & 1048575), t0Var, false);
                            break;
                        case DescriptorProtos$FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                            g0.z(iArr[length], (List) p0.v(t2, Q11 & 1048575), t0Var, false);
                            break;
                        case 32:
                            g0.A(iArr[length], (List) p0.v(t2, Q11 & 1048575), t0Var, false);
                            break;
                        case 33:
                            g0.B(iArr[length], (List) p0.v(t2, Q11 & 1048575), t0Var, false);
                            break;
                        case 34:
                            g0.C(iArr[length], (List) p0.v(t2, Q11 & 1048575), t0Var, false);
                            break;
                        case DescriptorProtos$MethodOptions.FEATURES_FIELD_NUMBER /* 35 */:
                            g0.q(iArr[length], (List) p0.v(t2, Q11 & 1048575), t0Var, true);
                            break;
                        case DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                            g0.u(iArr[length], (List) p0.v(t2, Q11 & 1048575), t0Var, true);
                            break;
                        case DescriptorProtos$FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                            g0.x(iArr[length], (List) p0.v(t2, Q11 & 1048575), t0Var, true);
                            break;
                        case 38:
                            g0.E(iArr[length], (List) p0.v(t2, Q11 & 1048575), t0Var, true);
                            break;
                        case DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                            g0.w(iArr[length], (List) p0.v(t2, Q11 & 1048575), t0Var, true);
                            break;
                        case 40:
                            g0.t(iArr[length], (List) p0.v(t2, Q11 & 1048575), t0Var, true);
                            break;
                        case 41:
                            g0.s(iArr[length], (List) p0.v(t2, Q11 & 1048575), t0Var, true);
                            break;
                        case 42:
                            g0.p(iArr[length], (List) p0.v(t2, Q11 & 1048575), t0Var, true);
                            break;
                        case 43:
                            g0.D(iArr[length], (List) p0.v(t2, Q11 & 1048575), t0Var, true);
                            break;
                        case DescriptorProtos$FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                            g0.r(iArr[length], (List) p0.v(t2, Q11 & 1048575), t0Var, true);
                            break;
                        case DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                            g0.z(iArr[length], (List) p0.v(t2, Q11 & 1048575), t0Var, true);
                            break;
                        case 46:
                            g0.A(iArr[length], (List) p0.v(t2, Q11 & 1048575), t0Var, true);
                            break;
                        case 47:
                            g0.B(iArr[length], (List) p0.v(t2, Q11 & 1048575), t0Var, true);
                            break;
                        case 48:
                            g0.C(iArr[length], (List) p0.v(t2, Q11 & 1048575), t0Var, true);
                            break;
                        case 49:
                            g0.v(iArr[length], (List) p0.v(t2, Q11 & 1048575), t0Var, l(length));
                            break;
                        case 50:
                            Object v11 = p0.v(t2, Q11 & 1048575);
                            if (v11 != null) {
                                Object k11 = k(length);
                                M m11 = this.f59340o;
                                m11.forMapMetadata(k11);
                                c5907m.v(i11, m11.forMapData(v11));
                                break;
                            } else {
                                break;
                            }
                        case 51:
                            if (q(t2, i11, length)) {
                                c5907m.f(i11, ((Double) p0.v(t2, Q11 & 1048575)).doubleValue());
                                break;
                            } else {
                                break;
                            }
                        case 52:
                            if (q(t2, i11, length)) {
                                c5907m.o(i11, ((Float) p0.v(t2, Q11 & 1048575)).floatValue());
                                break;
                            } else {
                                break;
                            }
                        case 53:
                            if (q(t2, i11, length)) {
                                c5907m.t(i11, A(t2, Q11 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 54:
                            if (q(t2, i11, length)) {
                                c5907m.L(i11, A(t2, Q11 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 55:
                            if (q(t2, i11, length)) {
                                c5907m.r(i11, z(t2, Q11 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 56:
                            if (q(t2, i11, length)) {
                                c5907m.m(i11, A(t2, Q11 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 57:
                            if (q(t2, i11, length)) {
                                c5907m.k(i11, z(t2, Q11 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 58:
                            if (q(t2, i11, length)) {
                                c5907m.b(i11, ((Boolean) p0.v(t2, Q11 & 1048575)).booleanValue());
                                break;
                            } else {
                                break;
                            }
                        case 59:
                            if (q(t2, i11, length)) {
                                S(i11, p0.v(t2, Q11 & 1048575), t0Var);
                                break;
                            } else {
                                break;
                            }
                        case 60:
                            if (q(t2, i11, length)) {
                                c5907m.w(i11, p0.v(t2, Q11 & 1048575), l(length));
                                break;
                            } else {
                                break;
                            }
                        case 61:
                            if (q(t2, i11, length)) {
                                c5907m.d(i11, (AbstractC5903i) p0.v(t2, Q11 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 62:
                            if (q(t2, i11, length)) {
                                c5907m.J(i11, z(t2, Q11 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 63:
                            if (q(t2, i11, length)) {
                                c5907m.i(i11, z(t2, Q11 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
                            if (q(t2, i11, length)) {
                                c5907m.y(i11, z(t2, Q11 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                            if (q(t2, i11, length)) {
                                c5907m.A(i11, A(t2, Q11 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 66:
                            if (q(t2, i11, length)) {
                                c5907m.C(i11, z(t2, Q11 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 67:
                            if (q(t2, i11, length)) {
                                c5907m.E(i11, A(t2, Q11 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 68:
                            if (q(t2, i11, length)) {
                                c5907m.q(i11, p0.v(t2, Q11 & 1048575), l(length));
                                break;
                            } else {
                                break;
                            }
                    }
                }
                if (entry != null) {
                    return;
                }
                abstractC5911q.j(entry);
                throw null;
            }
        }
        entry = null;
        int[] iArr2 = this.f59326a;
        while (length >= 0) {
        }
        if (entry != null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.crypto.tink.shaded.protobuf.f0
    public final boolean isInitialized(T t2) {
        int i11;
        int i12;
        int i13;
        int i14 = 1048575;
        int i15 = 0;
        int i16 = 0;
        while (i16 < this.f59334i) {
            int i17 = this.f59333h[i16];
            int[] iArr = this.f59326a;
            int i18 = iArr[i17];
            int Q11 = Q(i17);
            int i19 = iArr[i17 + 2];
            int i21 = i19 & 1048575;
            int i22 = 1 << (i19 >>> 20);
            if (i21 != i14) {
                if (i21 != 1048575) {
                    i15 = f59324q.getInt(t2, i21);
                }
                i12 = i17;
                i13 = i15;
                i11 = i21;
            } else {
                int i23 = i15;
                i11 = i14;
                i12 = i17;
                i13 = i23;
            }
            if ((268435456 & Q11) == 0 || o(t2, i12, i11, i13, i22)) {
                int P11 = P(Q11);
                if (P11 == 9 || P11 == 17) {
                    if (o(t2, i12, i11, i13, i22) && !l(i12).isInitialized(p0.v(t2, Q11 & 1048575))) {
                    }
                    i16++;
                    i14 = i11;
                    i15 = i13;
                } else {
                    if (P11 != 27) {
                        if (P11 == 60 || P11 == 68) {
                            if (q(t2, i18, i12) && !l(i12).isInitialized(p0.v(t2, Q11 & 1048575))) {
                            }
                        } else if (P11 != 49) {
                            if (P11 != 50) {
                                continue;
                            } else {
                                Object v11 = p0.v(t2, Q11 & 1048575);
                                M m11 = this.f59340o;
                                if (!m11.forMapData(v11).isEmpty()) {
                                    m11.forMapMetadata(k(i12));
                                    throw null;
                                }
                            }
                        }
                        i16++;
                        i14 = i11;
                        i15 = i13;
                    }
                    List list = (List) p0.v(t2, Q11 & 1048575);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        f0 l11 = l(i12);
                        for (int i24 = 0; i24 < list.size(); i24++) {
                            if (l11.isInitialized(list.get(i24))) {
                            }
                        }
                    }
                    i16++;
                    i14 = i11;
                    i15 = i13;
                }
            }
            return false;
        }
        if (this.f59331f) {
            this.f59339n.c(t2).j();
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.crypto.tink.shaded.protobuf.f0
    public final void makeImmutable(T t2) {
        if (p(t2)) {
            if (t2 instanceof AbstractC5917x) {
                AbstractC5917x abstractC5917x = (AbstractC5917x) t2;
                abstractC5917x.e(Integer.MAX_VALUE);
                abstractC5917x.memoizedHashCode = 0;
                abstractC5917x.t();
            }
            int[] iArr = this.f59326a;
            int length = iArr.length;
            for (int i11 = 0; i11 < length; i11 += 3) {
                int Q11 = Q(i11);
                long j11 = 1048575 & Q11;
                int P11 = P(Q11);
                if (P11 != 9) {
                    if (P11 != 60 && P11 != 68) {
                        switch (P11) {
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case TombstoneProtos$Tombstone.GUEST_THREADS_FIELD_NUMBER /* 25 */:
                            case TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER /* 26 */:
                            case DescriptorProtos$FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                            case 28:
                            case 29:
                            case AppUpdateInfo.Factory.DAYS_BETWEEN_30 /* 30 */:
                            case DescriptorProtos$FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                            case 32:
                            case 33:
                            case 34:
                            case DescriptorProtos$MethodOptions.FEATURES_FIELD_NUMBER /* 35 */:
                            case DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                            case DescriptorProtos$FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                            case 38:
                            case DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                            case 40:
                            case 41:
                            case 42:
                            case 43:
                            case DescriptorProtos$FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                            case DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                            case 46:
                            case 47:
                            case 48:
                            case 49:
                                this.f59337l.makeImmutableListAt(t2, j11);
                                break;
                            case 50:
                                Unsafe unsafe = f59324q;
                                Object object = unsafe.getObject(t2, j11);
                                if (object != null) {
                                    unsafe.putObject(t2, j11, this.f59340o.toImmutable(object));
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (q(t2, iArr[i11], i11)) {
                        l(i11).makeImmutable(f59324q.getObject(t2, j11));
                    }
                }
                if (n(t2, i11)) {
                    l(i11).makeImmutable(f59324q.getObject(t2, j11));
                }
            }
            this.f59338m.j(t2);
            if (this.f59331f) {
                this.f59339n.f(t2);
            }
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f0
    public final void mergeFrom(T t2, T t11) {
        h(t2);
        t11.getClass();
        int i11 = 0;
        while (true) {
            int[] iArr = this.f59326a;
            if (i11 >= iArr.length) {
                int i12 = g0.f59373d;
                m0<?, ?> m0Var = this.f59338m;
                m0Var.o(t2, m0Var.k(m0Var.g(t2), m0Var.g(t11)));
                if (this.f59331f) {
                    AbstractC5911q<?> abstractC5911q = this.f59339n;
                    C5913t<?> c11 = abstractC5911q.c(t11);
                    if (c11.h()) {
                        return;
                    }
                    abstractC5911q.d(t2).n(c11);
                    return;
                }
                return;
            }
            int Q11 = Q(i11);
            long j11 = 1048575 & Q11;
            int i13 = iArr[i11];
            switch (P(Q11)) {
                case 0:
                    if (!n(t11, i11)) {
                        break;
                    } else {
                        p0.D(t2, j11, p0.r(t11, j11));
                        K(t2, i11);
                        break;
                    }
                case 1:
                    if (!n(t11, i11)) {
                        break;
                    } else {
                        p0.E(t2, j11, p0.s(t11, j11));
                        K(t2, i11);
                        break;
                    }
                case 2:
                    if (!n(t11, i11)) {
                        break;
                    } else {
                        p0.G(t2, j11, p0.u(t11, j11));
                        K(t2, i11);
                        break;
                    }
                case 3:
                    if (!n(t11, i11)) {
                        break;
                    } else {
                        p0.G(t2, j11, p0.u(t11, j11));
                        K(t2, i11);
                        break;
                    }
                case 4:
                    if (!n(t11, i11)) {
                        break;
                    } else {
                        p0.F(t2, j11, p0.t(t11, j11));
                        K(t2, i11);
                        break;
                    }
                case 5:
                    if (!n(t11, i11)) {
                        break;
                    } else {
                        p0.G(t2, j11, p0.u(t11, j11));
                        K(t2, i11);
                        break;
                    }
                case 6:
                    if (!n(t11, i11)) {
                        break;
                    } else {
                        p0.F(t2, j11, p0.t(t11, j11));
                        K(t2, i11);
                        break;
                    }
                case 7:
                    if (!n(t11, i11)) {
                        break;
                    } else {
                        p0.z(t2, j11, p0.p(t11, j11));
                        K(t2, i11);
                        break;
                    }
                case 8:
                    if (!n(t11, i11)) {
                        break;
                    } else {
                        p0.H(t2, j11, p0.v(t11, j11));
                        K(t2, i11);
                        break;
                    }
                case 9:
                    t(t2, t11, i11);
                    break;
                case 10:
                    if (!n(t11, i11)) {
                        break;
                    } else {
                        p0.H(t2, j11, p0.v(t11, j11));
                        K(t2, i11);
                        break;
                    }
                case 11:
                    if (!n(t11, i11)) {
                        break;
                    } else {
                        p0.F(t2, j11, p0.t(t11, j11));
                        K(t2, i11);
                        break;
                    }
                case 12:
                    if (!n(t11, i11)) {
                        break;
                    } else {
                        p0.F(t2, j11, p0.t(t11, j11));
                        K(t2, i11);
                        break;
                    }
                case 13:
                    if (!n(t11, i11)) {
                        break;
                    } else {
                        p0.F(t2, j11, p0.t(t11, j11));
                        K(t2, i11);
                        break;
                    }
                case 14:
                    if (!n(t11, i11)) {
                        break;
                    } else {
                        p0.G(t2, j11, p0.u(t11, j11));
                        K(t2, i11);
                        break;
                    }
                case 15:
                    if (!n(t11, i11)) {
                        break;
                    } else {
                        p0.F(t2, j11, p0.t(t11, j11));
                        K(t2, i11);
                        break;
                    }
                case 16:
                    if (!n(t11, i11)) {
                        break;
                    } else {
                        p0.G(t2, j11, p0.u(t11, j11));
                        K(t2, i11);
                        break;
                    }
                case 17:
                    t(t2, t11, i11);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case TombstoneProtos$Tombstone.GUEST_THREADS_FIELD_NUMBER /* 25 */:
                case TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER /* 26 */:
                case DescriptorProtos$FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                case 28:
                case 29:
                case AppUpdateInfo.Factory.DAYS_BETWEEN_30 /* 30 */:
                case DescriptorProtos$FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                case 32:
                case 33:
                case 34:
                case DescriptorProtos$MethodOptions.FEATURES_FIELD_NUMBER /* 35 */:
                case DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                case DescriptorProtos$FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                case 38:
                case DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                case 40:
                case 41:
                case 42:
                case 43:
                case DescriptorProtos$FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                case DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.f59337l.mergeListsAt(t2, t11, j11);
                    break;
                case 50:
                    int i14 = g0.f59373d;
                    p0.H(t2, j11, this.f59340o.mergeFrom(p0.v(t2, j11), p0.v(t11, j11)));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (!q(t11, i13, i11)) {
                        break;
                    } else {
                        p0.H(t2, j11, p0.v(t11, j11));
                        L(t2, i13, i11);
                        break;
                    }
                case 60:
                    u(t2, t11, i11);
                    break;
                case 61:
                case 62:
                case 63:
                case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
                case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                case 66:
                case 67:
                    if (!q(t11, i13, i11)) {
                        break;
                    } else {
                        p0.H(t2, j11, p0.v(t11, j11));
                        L(t2, i13, i11);
                        break;
                    }
                case 68:
                    u(t2, t11, i11);
                    break;
            }
            i11 += 3;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f0
    public final T newInstance() {
        return (T) this.f59336k.newInstance(this.f59330e);
    }
}

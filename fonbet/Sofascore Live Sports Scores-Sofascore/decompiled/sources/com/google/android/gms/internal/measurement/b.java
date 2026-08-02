package com.google.android.gms.internal.measurement;

import defpackage.a70;
import defpackage.a9n;
import defpackage.bf3;
import defpackage.cp4;
import defpackage.ewm;
import defpackage.fc6;
import defpackage.fn0;
import defpackage.gan;
import defpackage.hbo;
import defpackage.ilg;
import defpackage.is8;
import defpackage.jdn;
import defpackage.l2a;
import defpackage.m9n;
import defpackage.men;
import defpackage.mz1;
import defpackage.odn;
import defpackage.omf;
import defpackage.pff;
import defpackage.rdn;
import defpackage.sck;
import defpackage.tdn;
import defpackage.ten;
import defpackage.tg0;
import defpackage.vp2;
import defpackage.w1a;
import defpackage.x5n;
import defpackage.zz0;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class b implements odn {
    public static final int[] m = new int[0];
    public static final Unsafe n = men.k();
    public final int[] a;
    public final Object[] b;
    public final int c;
    public final int d;
    public final zzafc e;
    public final boolean f;
    public final boolean g;
    public final int[] h;
    public final int i;
    public final int j;
    public final e k;
    public final pff l;

    public b(int[] iArr, Object[] objArr, int i, int i2, zzafc zzafcVar, int[] iArr2, int i3, int i4, e eVar, pff pffVar) {
        this.a = iArr;
        this.b = objArr;
        this.c = i;
        this.d = i2;
        this.g = zzafcVar instanceof zzadu;
        boolean z = false;
        if (pffVar != null && (zzafcVar instanceof zzadr)) {
            z = true;
        }
        this.f = z;
        this.h = iArr2;
        this.i = i3;
        this.j = i4;
        this.k = eVar;
        this.l = pffVar;
        this.e = zzafcVar;
    }

    public static int k(int i) {
        return (i >>> 20) & 255;
    }

    public static boolean l(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzadu) {
            return ((zzadu) obj).k();
        }
        return true;
    }

    public static void m(Object obj) {
        if (l(obj)) {
            return;
        }
        a70.p("Mutating immutable message: ".concat(String.valueOf(obj)));
    }

    public static int n(Object obj, long j) {
        return ((Integer) men.h(obj, j)).intValue();
    }

    public static long o(Object obj, long j) {
        return ((Long) men.h(obj, j)).longValue();
    }

    public static final int w(byte[] bArr, int i, int i2, zzagm zzagmVar, Class cls, tg0 tg0Var) {
        zzagm zzagmVar2 = zzagm.c;
        switch (zzagmVar.ordinal()) {
            case 0:
                int i3 = i + 8;
                tg0Var.c = Double.valueOf(Double.longBitsToDouble(w1a.Q(i, bArr)));
                return i3;
            case 1:
                int i4 = i + 4;
                tg0Var.c = Float.valueOf(Float.intBitsToFloat(w1a.O(i, bArr)));
                return i4;
            case 2:
            case 3:
                int M = w1a.M(bArr, i, tg0Var);
                tg0Var.c = Long.valueOf(tg0Var.b);
                return M;
            case 4:
            case 12:
            case 13:
                int I = w1a.I(bArr, i, tg0Var);
                tg0Var.c = Integer.valueOf(tg0Var.a);
                return I;
            case 5:
            case 15:
                int i5 = i + 8;
                tg0Var.c = Long.valueOf(w1a.Q(i, bArr));
                return i5;
            case 6:
            case 14:
                int i6 = i + 4;
                tg0Var.c = Integer.valueOf(w1a.O(i, bArr));
                return i6;
            case 7:
                int M2 = w1a.M(bArr, i, tg0Var);
                tg0Var.c = Boolean.valueOf(tg0Var.b != 0);
                return M2;
            case 8:
                return w1a.R(bArr, i, tg0Var);
            case 9:
            default:
                cp4.h("unsupported field type.");
                return 0;
            case 10:
                odn a = jdn.c.a(cls);
                Object zza = a.zza();
                int T = w1a.T(zza, a, bArr, i, i2, tg0Var);
                a.c(zza);
                tg0Var.c = zza;
                return T;
            case 11:
                return w1a.S(bArr, i, tg0Var);
            case 16:
                int I2 = w1a.I(bArr, i, tg0Var);
                tg0Var.c = Integer.valueOf(zzacv.j(tg0Var.a));
                return I2;
            case 17:
                int M3 = w1a.M(bArr, i, tg0Var);
                tg0Var.c = Long.valueOf(zzacv.k(tg0Var.b));
                return M3;
        }
    }

    public static zzaga x(Object obj) {
        zzadu zzaduVar = (zzadu) obj;
        zzaga zzagaVar = zzaduVar.zzc;
        if (zzagaVar != zzaga.f) {
            return zzagaVar;
        }
        zzaga a = zzaga.a();
        zzaduVar.zzc = a;
        return a;
    }

    public static Field z(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException e) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder sb = new StringBuilder(fn0.c(11, str) + name.length() + 29 + String.valueOf(arrays).length());
            bf3.v(sb, "Field ", str, " for ", name);
            vp2.e(mz1.o(sb, " not found. Known fields are ", arrays), e);
            return null;
        }
    }

    public final void A(int i, Object obj, Object obj2) {
        if (r(i, obj2)) {
            long j = j(i) & 1048575;
            Unsafe unsafe = n;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                int i2 = this.a[i];
                String obj3 = obj2.toString();
                hbo.g(fn0.a(i2, 38) + obj3.length(), i2, obj3);
                return;
            }
            odn C = C(i);
            if (!r(i, obj)) {
                if (l(object)) {
                    Object zza = C.zza();
                    C.a(zza, object);
                    unsafe.putObject(obj, j, zza);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                s(i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!l(object2)) {
                Object zza2 = C.zza();
                C.a(zza2, object2);
                unsafe.putObject(obj, j, zza2);
                object2 = zza2;
            }
            C.a(object2, object);
        }
    }

    public final void B(int i, Object obj, Object obj2) {
        int[] iArr = this.a;
        int i2 = iArr[i];
        if (t(i2, i, obj2)) {
            long j = j(i) & 1048575;
            Unsafe unsafe = n;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                int i3 = iArr[i];
                String obj3 = obj2.toString();
                hbo.g(fn0.a(i3, 38) + obj3.length(), i3, obj3);
                return;
            }
            odn C = C(i);
            if (!t(i2, i, obj)) {
                if (l(object)) {
                    Object zza = C.zza();
                    C.a(zza, object);
                    unsafe.putObject(obj, j, zza);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                u(i2, i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!l(object2)) {
                Object zza2 = C.zza();
                C.a(zza2, object2);
                unsafe.putObject(obj, j, zza2);
                object2 = zza2;
            }
            C.a(object2, object);
        }
    }

    public final odn C(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        Object[] objArr = this.b;
        odn odnVar = (odn) objArr[i3];
        if (odnVar != null) {
            return odnVar;
        }
        odn a = jdn.c.a((Class) objArr[i3 + 1]);
        objArr[i3] = a;
        return a;
    }

    public final Object D(int i) {
        int i2 = i / 3;
        return this.b[i2 + i2];
    }

    public final zzadz E(int i) {
        int i2 = i / 3;
        return (zzadz) this.b[i2 + i2 + 1];
    }

    public final Object F(int i, Object obj) {
        odn C = C(i);
        int j = j(i) & 1048575;
        if (!r(i, obj)) {
            return C.zza();
        }
        Object object = n.getObject(obj, j);
        if (l(object)) {
            return object;
        }
        Object zza = C.zza();
        if (object != null) {
            C.a(zza, object);
        }
        return zza;
    }

    public final void G(int i, Object obj, Object obj2) {
        n.putObject(obj, j(i) & 1048575, obj2);
        s(i, obj);
    }

    public final Object H(int i, int i2, Object obj) {
        odn C = C(i2);
        if (!t(i, i2, obj)) {
            return C.zza();
        }
        Object object = n.getObject(obj, j(i2) & 1048575);
        if (l(object)) {
            return object;
        }
        Object zza = C.zza();
        if (object != null) {
            C.a(zza, object);
        }
        return zza;
    }

    public final void I(int i, Object obj, Object obj2, int i2) {
        n.putObject(obj, j(i2) & 1048575, obj2);
        u(i, i2, obj);
    }

    public final Object J(Object obj, int i, Object obj2, e eVar, Object obj3) {
        zzadz E;
        int i2 = this.a[i];
        Object h = men.h(obj, j(i) & 1048575);
        if (h == null || (E = E(i)) == null) {
            return obj2;
        }
        l2a l2aVar = ((zzaev) D(i)).a;
        Iterator it = ((zzaew) h).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!E.a(((Integer) entry.getValue()).intValue())) {
                if (obj2 == null) {
                    eVar.getClass();
                    obj2 = e.a(obj3);
                }
                int b = zzaev.b(l2aVar, entry.getKey(), entry.getValue());
                a9n a9nVar = zzacr.b;
                byte[] bArr = new byte[b];
                boolean z = zzada.b;
                m9n m9nVar = new m9n(bArr, b);
                try {
                    zzaev.a(m9nVar, l2aVar, entry.getKey(), entry.getValue());
                    m9nVar.e();
                    a9n a9nVar2 = new a9n(bArr);
                    eVar.getClass();
                    ((zzaga) obj2).d((i2 << 3) | 2, a9nVar2);
                    it.remove();
                } catch (IOException e) {
                    is8.h(e);
                    return null;
                }
            }
        }
        return obj2;
    }

    public final void K(int i, zz0 zz0Var, Object obj) {
        zzacv zzacvVar = (zzacv) zz0Var.e;
        long j = i & 1048575;
        if ((536870912 & i) != 0) {
            zz0Var.o1(2);
            men.i(j, obj, zzacvVar.x());
        } else if (!this.g) {
            men.i(j, obj, zz0Var.K1());
        } else {
            zz0Var.o1(2);
            men.i(j, obj, zzacvVar.w());
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.odn
    public final void a(Object obj, Object obj2) {
        Object obj3;
        m(obj);
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.a;
            if (i >= iArr.length) {
                Object obj4 = obj;
                d.b(obj4, obj2);
                if (!this.f || ((zzadr) obj2).zzb.a.isEmpty()) {
                    return;
                }
                throw null;
            }
            int j = j(i);
            int i2 = 1048575 & j;
            int k = k(j);
            int i3 = iArr[i];
            long j2 = i2;
            switch (k) {
                case 0:
                    if (r(i, obj2)) {
                        sck sckVar = men.c;
                        obj3 = obj;
                        sckVar.G(obj3, j2, sckVar.C(obj2, j2));
                        s(i, obj3);
                        break;
                    }
                    obj3 = obj;
                    break;
                case 1:
                    if (r(i, obj2)) {
                        sck sckVar2 = men.c;
                        sckVar2.B(obj, j2, sckVar2.v(obj2, j2));
                        s(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 2:
                    if (r(i, obj2)) {
                        men.g(obj, j2, men.f(obj2, j2));
                        s(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 3:
                    if (r(i, obj2)) {
                        men.g(obj, j2, men.f(obj2, j2));
                        s(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 4:
                    if (r(i, obj2)) {
                        men.e(men.d(obj2, j2), j2, obj);
                        s(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 5:
                    if (r(i, obj2)) {
                        men.g(obj, j2, men.f(obj2, j2));
                        s(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 6:
                    if (r(i, obj2)) {
                        men.e(men.d(obj2, j2), j2, obj);
                        s(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 7:
                    if (r(i, obj2)) {
                        sck sckVar3 = men.c;
                        sckVar3.u(obj, j2, sckVar3.s(obj2, j2));
                        s(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 8:
                    if (r(i, obj2)) {
                        men.i(j2, obj, men.h(obj2, j2));
                        s(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 9:
                    A(i, obj, obj2);
                    obj3 = obj;
                    break;
                case 10:
                    if (r(i, obj2)) {
                        men.i(j2, obj, men.h(obj2, j2));
                        s(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 11:
                    if (r(i, obj2)) {
                        men.e(men.d(obj2, j2), j2, obj);
                        s(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 12:
                    if (r(i, obj2)) {
                        men.e(men.d(obj2, j2), j2, obj);
                        s(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 13:
                    if (r(i, obj2)) {
                        men.e(men.d(obj2, j2), j2, obj);
                        s(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 14:
                    if (r(i, obj2)) {
                        men.g(obj, j2, men.f(obj2, j2));
                        s(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 15:
                    if (r(i, obj2)) {
                        men.e(men.d(obj2, j2), j2, obj);
                        s(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 16:
                    if (r(i, obj2)) {
                        men.g(obj, j2, men.f(obj2, j2));
                        s(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 17:
                    A(i, obj, obj2);
                    obj3 = obj;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    zzaef zzaefVar = (zzaef) men.h(obj, j2);
                    zzaef zzaefVar2 = (zzaef) men.h(obj2, j2);
                    int size = zzaefVar.size();
                    int size2 = zzaefVar2.size();
                    if (size > 0 && size2 > 0) {
                        if (!zzaefVar.zza()) {
                            zzaefVar = zzaefVar.f(size2 + size);
                        }
                        zzaefVar.addAll(zzaefVar2);
                    }
                    if (size > 0) {
                        zzaefVar2 = zzaefVar;
                    }
                    men.i(j2, obj, zzaefVar2);
                    obj3 = obj;
                    break;
                case 50:
                    e eVar = d.a;
                    men.i(j2, obj, omf.d(men.h(obj, j2), men.h(obj2, j2)));
                    obj3 = obj;
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
                    if (t(i3, i, obj2)) {
                        men.i(j2, obj, men.h(obj2, j2));
                        u(i3, i, obj);
                    }
                    obj3 = obj;
                    break;
                case 60:
                    B(i, obj, obj2);
                    obj3 = obj;
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (t(i3, i, obj2)) {
                        men.i(j2, obj, men.h(obj2, j2));
                        u(i3, i, obj);
                    }
                    obj3 = obj;
                    break;
                case 68:
                    B(i, obj, obj2);
                    obj3 = obj;
                    break;
                default:
                    obj3 = obj;
                    break;
            }
            i += 3;
            obj = obj3;
        }
    }

    @Override // defpackage.odn
    public final boolean b(Object obj) {
        int i = 0;
        int i2 = 0;
        int i3 = 1048575;
        loop0: while (true) {
            if (i < this.i) {
                int i4 = this.h[i];
                int j = this.j(i4);
                int[] iArr = this.a;
                int i5 = iArr[i4 + 2];
                int i6 = i5 & 1048575;
                int i7 = 1 << (i5 >>> 20);
                if (i6 == i3) {
                    i6 = i3;
                } else if (i6 != 1048575) {
                    i2 = n.getInt(obj, i6);
                }
                int i8 = i2;
                b bVar = this;
                Object obj2 = obj;
                if ((268435456 & j) != 0 && !bVar.q(i4, i6, i8, i7, obj2)) {
                    break;
                }
                int k = k(j);
                if (k == 9 || k == 17) {
                    if (bVar.q(i4, i6, i8, i7, obj2) && !bVar.C(i4).b(men.h(obj2, j & 1048575))) {
                        break;
                    }
                    i++;
                    this = bVar;
                    i3 = i6;
                    i2 = i8;
                    obj = obj2;
                } else {
                    if (k != 27) {
                        if (k == 60 || k == 68) {
                            if (bVar.t(iArr[i4], i4, obj2) && !bVar.C(i4).b(men.h(obj2, j & 1048575))) {
                                break;
                            }
                            i++;
                            this = bVar;
                            i3 = i6;
                            i2 = i8;
                            obj = obj2;
                        } else if (k != 49) {
                            if (k == 50) {
                                zzaew zzaewVar = (zzaew) men.h(obj2, j & 1048575);
                                if (!zzaewVar.isEmpty() && ((zzagm) ((zzaev) bVar.D(i4)).a.c).a == zzagn.i) {
                                    odn odnVar = null;
                                    for (Object obj3 : zzaewVar.values()) {
                                        if (odnVar == null) {
                                            odnVar = jdn.c.a(obj3.getClass());
                                        }
                                        if (!odnVar.b(obj3)) {
                                            break loop0;
                                        }
                                    }
                                }
                            } else {
                                continue;
                            }
                            i++;
                            this = bVar;
                            i3 = i6;
                            i2 = i8;
                            obj = obj2;
                        }
                    }
                    List list = (List) men.h(obj2, j & 1048575);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        odn C = bVar.C(i4);
                        for (int i9 = 0; i9 < list.size(); i9++) {
                            if (!C.b(list.get(i9))) {
                                break loop0;
                            }
                        }
                    }
                    i++;
                    this = bVar;
                    i3 = i6;
                    i2 = i8;
                    obj = obj2;
                }
            } else {
                Object obj4 = obj;
                if (!this.f || ((zzadr) obj4).zzb.d()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.odn
    public final void c(Object obj) {
        if (!l(obj)) {
            return;
        }
        if (obj instanceof zzadu) {
            zzadu zzaduVar = (zzadu) obj;
            zzaduVar.r();
            zzaduVar.zza = 0;
            zzaduVar.l();
        }
        int i = 0;
        while (true) {
            int[] iArr = this.a;
            if (i >= iArr.length) {
                this.k.getClass();
                zzaga zzagaVar = ((zzadu) obj).zzc;
                if (zzagaVar.e) {
                    zzagaVar.e = false;
                }
                if (this.f) {
                    this.l.getClass();
                    ((zzadr) obj).zzb.a();
                    return;
                }
                return;
            }
            int j = j(i);
            int i2 = 1048575 & j;
            int k = k(j);
            long j2 = i2;
            Unsafe unsafe = n;
            if (k != 9) {
                if (k != 60 && k != 68) {
                    switch (k) {
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                        case 40:
                        case 41:
                        case 42:
                        case 43:
                        case 44:
                        case 45:
                        case 46:
                        case 47:
                        case 48:
                        case 49:
                            ((zzaef) men.h(obj, j2)).zzb();
                            break;
                        case 50:
                            Object object = unsafe.getObject(obj, j2);
                            if (object == null) {
                                break;
                            } else {
                                ((zzaew) object).a = false;
                                unsafe.putObject(obj, j2, object);
                                break;
                            }
                    }
                } else if (t(iArr[i], i, obj)) {
                    C(i).c(unsafe.getObject(obj, j2));
                }
                i += 3;
            }
            if (r(i, obj)) {
                C(i).c(unsafe.getObject(obj, j2));
            }
            i += 3;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.odn
    public final void d(Object obj, ewm ewmVar) {
        boolean z;
        int[] iArr;
        int i;
        boolean z2;
        b bVar = this;
        zzada zzadaVar = (zzada) ewmVar.b;
        Map.Entry entry = null;
        if (bVar.f) {
            gan ganVar = ((zzadr) obj).zzb;
            if (!ganVar.a.isEmpty()) {
                entry = (Map.Entry) ganVar.b().next();
            }
        }
        Map.Entry entry2 = entry;
        int i2 = 1048575;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            int[] iArr2 = bVar.a;
            if (i4 >= iArr2.length) {
                if (entry2 != null) {
                    throw fc6.d(entry2);
                }
                ((zzadu) obj).zzc.b(ewmVar);
                return;
            }
            int j = bVar.j(i4);
            int k = k(j);
            int i6 = iArr2[i4];
            Unsafe unsafe = n;
            if (k <= 17) {
                int i7 = iArr2[i4 + 2];
                z = true;
                int i8 = i7 & i2;
                if (i8 != i3) {
                    i5 = i8 == i2 ? 0 : unsafe.getInt(obj, i8);
                    i3 = i8;
                }
                int i9 = 1 << (i7 >>> 20);
                iArr = iArr2;
                i = i9;
            } else {
                z = true;
                iArr = iArr2;
                i = 0;
            }
            if (entry2 != null) {
                throw fc6.d(entry2);
            }
            long j2 = j & i2;
            switch (k) {
                case 0:
                    if (bVar.q(i4, i3, i5, i, obj)) {
                        zzadaVar.k(i6, Double.doubleToRawLongBits(men.c.C(obj, j2)));
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (bVar.q(i4, i3, i5, i, obj)) {
                        zzadaVar.i(i6, Float.floatToRawIntBits(men.c.v(obj, j2)));
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (bVar.q(i4, i3, i5, i, obj)) {
                        zzadaVar.j(i6, unsafe.getLong(obj, j2));
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (bVar.q(i4, i3, i5, i, obj)) {
                        zzadaVar.j(i6, unsafe.getLong(obj, j2));
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (bVar.q(i4, i3, i5, i, obj)) {
                        zzadaVar.g(i6, unsafe.getInt(obj, j2));
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (bVar.q(i4, i3, i5, i, obj)) {
                        zzadaVar.k(i6, unsafe.getLong(obj, j2));
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (bVar.q(i4, i3, i5, i, obj)) {
                        zzadaVar.i(i6, unsafe.getInt(obj, j2));
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (bVar.q(i4, i3, i5, i, obj)) {
                        zzadaVar.l(i6, men.c.s(obj, j2));
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (bVar.q(i4, i3, i5, i, obj)) {
                        Object object = unsafe.getObject(obj, j2);
                        if (object instanceof String) {
                            zzadaVar.m(i6, (String) object);
                            break;
                        } else {
                            zzadaVar.n(i6, (zzacr) object);
                            break;
                        }
                    } else {
                        break;
                    }
                case 9:
                    if (bVar.q(i4, i3, i5, i, obj)) {
                        ewmVar.f(i6, unsafe.getObject(obj, j2), bVar.C(i4));
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (bVar.q(i4, i3, i5, i, obj)) {
                        zzadaVar.n(i6, (zzacr) unsafe.getObject(obj, j2));
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (bVar.q(i4, i3, i5, i, obj)) {
                        zzadaVar.h(i6, unsafe.getInt(obj, j2));
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (bVar.q(i4, i3, i5, i, obj)) {
                        zzadaVar.g(i6, unsafe.getInt(obj, j2));
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (bVar.q(i4, i3, i5, i, obj)) {
                        zzadaVar.i(i6, unsafe.getInt(obj, j2));
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (bVar.q(i4, i3, i5, i, obj)) {
                        zzadaVar.k(i6, unsafe.getLong(obj, j2));
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (bVar.q(i4, i3, i5, i, obj)) {
                        int i10 = unsafe.getInt(obj, j2);
                        zzadaVar.h(i6, (i10 >> 31) ^ (i10 + i10));
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (bVar.q(i4, i3, i5, i, obj)) {
                        long j3 = unsafe.getLong(obj, j2);
                        zzadaVar.j(i6, (j3 >> 63) ^ (j3 + j3));
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (bVar.q(i4, i3, i5, i, obj)) {
                        Object object2 = unsafe.getObject(obj, j2);
                        zzadaVar.f(i6, 3);
                        bVar.C(i4).d((zzacb) object2, ewmVar);
                        zzadaVar.f(i6, 4);
                        break;
                    } else {
                        break;
                    }
                case 18:
                    z2 = false;
                    d.d(iArr[i4], (List) unsafe.getObject(obj, j2), ewmVar, false);
                    break;
                case 19:
                    z2 = false;
                    d.e(iArr[i4], (List) unsafe.getObject(obj, j2), ewmVar, false);
                    break;
                case 20:
                    z2 = false;
                    d.f(iArr[i4], (List) unsafe.getObject(obj, j2), ewmVar, false);
                    break;
                case 21:
                    z2 = false;
                    d.g(iArr[i4], (List) unsafe.getObject(obj, j2), ewmVar, false);
                    break;
                case 22:
                    z2 = false;
                    d.k(iArr[i4], (List) unsafe.getObject(obj, j2), ewmVar, false);
                    break;
                case 23:
                    z2 = false;
                    d.i(iArr[i4], (List) unsafe.getObject(obj, j2), ewmVar, false);
                    break;
                case 24:
                    z2 = false;
                    d.n(iArr[i4], (List) unsafe.getObject(obj, j2), ewmVar, false);
                    break;
                case 25:
                    z2 = false;
                    d.q(iArr[i4], (List) unsafe.getObject(obj, j2), ewmVar, false);
                    break;
                case 26:
                    int i11 = iArr[i4];
                    List list = (List) unsafe.getObject(obj, j2);
                    e eVar = d.a;
                    if (list != null && !list.isEmpty()) {
                        if (list instanceof zzaen) {
                            zzaen zzaenVar = (zzaen) list;
                            for (int i12 = 0; i12 < list.size(); i12++) {
                                Object zzc = zzaenVar.zzc();
                                if (zzc instanceof String) {
                                    zzadaVar.m(i11, (String) zzc);
                                } else {
                                    zzadaVar.n(i11, (zzacr) zzc);
                                }
                            }
                        } else {
                            for (int i13 = 0; i13 < list.size(); i13++) {
                                zzadaVar.m(i11, (String) list.get(i13));
                            }
                        }
                    }
                    break;
                case 27:
                    int i14 = iArr[i4];
                    List list2 = (List) unsafe.getObject(obj, j2);
                    odn C = bVar.C(i4);
                    e eVar2 = d.a;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i15 = 0; i15 < list2.size(); i15++) {
                            ewmVar.f(i14, list2.get(i15), C);
                        }
                    }
                    break;
                case 28:
                    int i16 = iArr[i4];
                    List list3 = (List) unsafe.getObject(obj, j2);
                    e eVar3 = d.a;
                    if (list3 != null && !list3.isEmpty()) {
                        for (int i17 = 0; i17 < list3.size(); i17++) {
                            zzadaVar.n(i16, (zzacr) list3.get(i17));
                        }
                    }
                    break;
                case 29:
                    z2 = false;
                    d.l(iArr[i4], (List) unsafe.getObject(obj, j2), ewmVar, false);
                    break;
                case 30:
                    z2 = false;
                    d.p(iArr[i4], (List) unsafe.getObject(obj, j2), ewmVar, false);
                    break;
                case 31:
                    z2 = false;
                    d.o(iArr[i4], (List) unsafe.getObject(obj, j2), ewmVar, false);
                    break;
                case 32:
                    z2 = false;
                    d.j(iArr[i4], (List) unsafe.getObject(obj, j2), ewmVar, false);
                    break;
                case 33:
                    z2 = false;
                    d.m(iArr[i4], (List) unsafe.getObject(obj, j2), ewmVar, false);
                    break;
                case 34:
                    z2 = false;
                    d.h(iArr[i4], (List) unsafe.getObject(obj, j2), ewmVar, false);
                    break;
                case 35:
                    d.d(iArr[i4], (List) unsafe.getObject(obj, j2), ewmVar, z);
                    break;
                case 36:
                    d.e(iArr[i4], (List) unsafe.getObject(obj, j2), ewmVar, z);
                    break;
                case 37:
                    d.f(iArr[i4], (List) unsafe.getObject(obj, j2), ewmVar, z);
                    break;
                case 38:
                    d.g(iArr[i4], (List) unsafe.getObject(obj, j2), ewmVar, z);
                    break;
                case 39:
                    d.k(iArr[i4], (List) unsafe.getObject(obj, j2), ewmVar, z);
                    break;
                case 40:
                    d.i(iArr[i4], (List) unsafe.getObject(obj, j2), ewmVar, z);
                    break;
                case 41:
                    d.n(iArr[i4], (List) unsafe.getObject(obj, j2), ewmVar, z);
                    break;
                case 42:
                    d.q(iArr[i4], (List) unsafe.getObject(obj, j2), ewmVar, z);
                    break;
                case 43:
                    d.l(iArr[i4], (List) unsafe.getObject(obj, j2), ewmVar, z);
                    break;
                case 44:
                    d.p(iArr[i4], (List) unsafe.getObject(obj, j2), ewmVar, z);
                    break;
                case 45:
                    d.o(iArr[i4], (List) unsafe.getObject(obj, j2), ewmVar, z);
                    break;
                case 46:
                    d.j(iArr[i4], (List) unsafe.getObject(obj, j2), ewmVar, z);
                    break;
                case 47:
                    d.m(iArr[i4], (List) unsafe.getObject(obj, j2), ewmVar, z);
                    break;
                case 48:
                    d.h(iArr[i4], (List) unsafe.getObject(obj, j2), ewmVar, z);
                    break;
                case 49:
                    int i18 = iArr[i4];
                    List list4 = (List) unsafe.getObject(obj, j2);
                    odn C2 = bVar.C(i4);
                    e eVar4 = d.a;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i19 = 0; i19 < list4.size(); i19++) {
                            zzacb zzacbVar = (zzacb) list4.get(i19);
                            zzadaVar.f(i18, 3);
                            C2.d(zzacbVar, ewmVar);
                            zzadaVar.f(i18, 4);
                        }
                    }
                    break;
                case 50:
                    Object object3 = unsafe.getObject(obj, j2);
                    if (object3 != null) {
                        l2a l2aVar = ((zzaev) bVar.D(i4)).a;
                        for (Map.Entry entry3 : ((zzaew) object3).entrySet()) {
                            zzadaVar.f(i6, 2);
                            zzadaVar.v(zzaev.b(l2aVar, entry3.getKey(), entry3.getValue()));
                            zzaev.a(zzadaVar, l2aVar, entry3.getKey(), entry3.getValue());
                        }
                    }
                    break;
                case 51:
                    if (bVar.t(i6, i4, obj)) {
                        zzadaVar.k(i6, Double.doubleToRawLongBits(((Double) men.h(obj, j2)).doubleValue()));
                    }
                    break;
                case 52:
                    if (bVar.t(i6, i4, obj)) {
                        zzadaVar.i(i6, Float.floatToRawIntBits(((Float) men.h(obj, j2)).floatValue()));
                    }
                    break;
                case 53:
                    if (bVar.t(i6, i4, obj)) {
                        zzadaVar.j(i6, o(obj, j2));
                    }
                    break;
                case 54:
                    if (bVar.t(i6, i4, obj)) {
                        zzadaVar.j(i6, o(obj, j2));
                    }
                    break;
                case 55:
                    if (bVar.t(i6, i4, obj)) {
                        zzadaVar.g(i6, n(obj, j2));
                    }
                    break;
                case 56:
                    if (bVar.t(i6, i4, obj)) {
                        zzadaVar.k(i6, o(obj, j2));
                    }
                    break;
                case 57:
                    if (bVar.t(i6, i4, obj)) {
                        zzadaVar.i(i6, n(obj, j2));
                    }
                    break;
                case 58:
                    if (bVar.t(i6, i4, obj)) {
                        zzadaVar.l(i6, ((Boolean) men.h(obj, j2)).booleanValue());
                    }
                    break;
                case 59:
                    if (bVar.t(i6, i4, obj)) {
                        Object object4 = unsafe.getObject(obj, j2);
                        if (object4 instanceof String) {
                            zzadaVar.m(i6, (String) object4);
                        } else {
                            zzadaVar.n(i6, (zzacr) object4);
                        }
                    }
                    break;
                case 60:
                    if (bVar.t(i6, i4, obj)) {
                        ewmVar.f(i6, unsafe.getObject(obj, j2), bVar.C(i4));
                    }
                    break;
                case 61:
                    if (bVar.t(i6, i4, obj)) {
                        zzadaVar.n(i6, (zzacr) unsafe.getObject(obj, j2));
                    }
                    break;
                case 62:
                    if (bVar.t(i6, i4, obj)) {
                        zzadaVar.h(i6, n(obj, j2));
                    }
                    break;
                case 63:
                    if (bVar.t(i6, i4, obj)) {
                        zzadaVar.g(i6, n(obj, j2));
                    }
                    break;
                case 64:
                    if (bVar.t(i6, i4, obj)) {
                        zzadaVar.i(i6, n(obj, j2));
                    }
                    break;
                case 65:
                    if (bVar.t(i6, i4, obj)) {
                        zzadaVar.k(i6, o(obj, j2));
                    }
                    break;
                case 66:
                    if (bVar.t(i6, i4, obj)) {
                        int n2 = n(obj, j2);
                        zzadaVar.h(i6, (n2 >> 31) ^ (n2 + n2));
                    }
                    break;
                case 67:
                    if (bVar.t(i6, i4, obj)) {
                        long o = o(obj, j2);
                        zzadaVar.j(i6, (o >> 63) ^ (o + o));
                    }
                    break;
                case 68:
                    if (bVar.t(i6, i4, obj)) {
                        Object object5 = unsafe.getObject(obj, j2);
                        zzadaVar.f(i6, 3);
                        bVar.C(i4).d((zzacb) object5, ewmVar);
                        zzadaVar.f(i6, 4);
                    }
                    break;
            }
            i4 += 3;
            i2 = 1048575;
            bVar = this;
        }
    }

    @Override // defpackage.odn
    public final void e(Object obj, byte[] bArr, int i, int i2, tg0 tg0Var) {
        y(obj, bArr, i, i2, 0, tg0Var);
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    @Override // defpackage.odn
    public final void f(java.lang.Object r22, defpackage.zz0 r23, com.google.android.gms.internal.measurement.zzadf r24) {
        /*
            Method dump skipped, instructions count: 2222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.b.f(java.lang.Object, zz0, com.google.android.gms.internal.measurement.zzadf):void");
    }

    @Override // defpackage.odn
    public final int g(zzadu zzaduVar) {
        int i;
        long doubleToLongBits;
        int i2;
        int floatToIntBits;
        int i3;
        int i4;
        int i5 = 0;
        for (int i6 = 0; i6 < this.a.length; i6 += 3) {
            int j = j(i6);
            int k = k(j);
            if (k <= 50 || k >= 69) {
                long j2 = j & 1048575;
                int i7 = 37;
                switch (k) {
                    case 0:
                        i = i5 * 53;
                        doubleToLongBits = Double.doubleToLongBits(men.c.C(zzaduVar, j2));
                        byte[] bArr = zzaed.a;
                        i3 = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i5 = i + i3;
                        break;
                    case 1:
                        i2 = i5 * 53;
                        floatToIntBits = Float.floatToIntBits(men.c.v(zzaduVar, j2));
                        i5 = i2 + floatToIntBits;
                        break;
                    case 2:
                        i = i5 * 53;
                        doubleToLongBits = men.f(zzaduVar, j2);
                        byte[] bArr2 = zzaed.a;
                        i3 = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i5 = i + i3;
                        break;
                    case 3:
                        i = i5 * 53;
                        doubleToLongBits = men.f(zzaduVar, j2);
                        byte[] bArr3 = zzaed.a;
                        i3 = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i5 = i + i3;
                        break;
                    case 4:
                        i2 = i5 * 53;
                        floatToIntBits = men.d(zzaduVar, j2);
                        i5 = i2 + floatToIntBits;
                        break;
                    case 5:
                        i = i5 * 53;
                        doubleToLongBits = men.f(zzaduVar, j2);
                        byte[] bArr4 = zzaed.a;
                        i3 = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i5 = i + i3;
                        break;
                    case 6:
                        i2 = i5 * 53;
                        floatToIntBits = men.d(zzaduVar, j2);
                        i5 = i2 + floatToIntBits;
                        break;
                    case 7:
                        i = i5 * 53;
                        boolean s = men.c.s(zzaduVar, j2);
                        byte[] bArr5 = zzaed.a;
                        i3 = s ? 1231 : 1237;
                        i5 = i + i3;
                        break;
                    case 8:
                        i2 = i5 * 53;
                        floatToIntBits = ((String) men.h(zzaduVar, j2)).hashCode();
                        i5 = i2 + floatToIntBits;
                        break;
                    case 9:
                        i4 = i5 * 53;
                        Object h = men.h(zzaduVar, j2);
                        if (h != null) {
                            i7 = h.hashCode();
                        }
                        i5 = i4 + i7;
                        break;
                    case 10:
                        i2 = i5 * 53;
                        floatToIntBits = men.h(zzaduVar, j2).hashCode();
                        i5 = i2 + floatToIntBits;
                        break;
                    case 11:
                        i2 = i5 * 53;
                        floatToIntBits = men.d(zzaduVar, j2);
                        i5 = i2 + floatToIntBits;
                        break;
                    case 12:
                        i2 = i5 * 53;
                        floatToIntBits = men.d(zzaduVar, j2);
                        i5 = i2 + floatToIntBits;
                        break;
                    case 13:
                        i2 = i5 * 53;
                        floatToIntBits = men.d(zzaduVar, j2);
                        i5 = i2 + floatToIntBits;
                        break;
                    case 14:
                        i = i5 * 53;
                        doubleToLongBits = men.f(zzaduVar, j2);
                        byte[] bArr6 = zzaed.a;
                        i3 = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i5 = i + i3;
                        break;
                    case 15:
                        i2 = i5 * 53;
                        floatToIntBits = men.d(zzaduVar, j2);
                        i5 = i2 + floatToIntBits;
                        break;
                    case 16:
                        i = i5 * 53;
                        doubleToLongBits = men.f(zzaduVar, j2);
                        byte[] bArr7 = zzaed.a;
                        i3 = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i5 = i + i3;
                        break;
                    case 17:
                        i4 = i5 * 53;
                        Object h2 = men.h(zzaduVar, j2);
                        if (h2 != null) {
                            i7 = h2.hashCode();
                        }
                        i5 = i4 + i7;
                        break;
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                        i2 = i5 * 53;
                        floatToIntBits = men.h(zzaduVar, j2).hashCode();
                        i5 = i2 + floatToIntBits;
                        break;
                    case 50:
                        i2 = i5 * 53;
                        floatToIntBits = men.h(zzaduVar, j2).hashCode();
                        i5 = i2 + floatToIntBits;
                        break;
                }
            }
        }
        int i8 = this.j;
        while (true) {
            int[] iArr = this.h;
            if (i8 >= iArr.length) {
                int hashCode = zzaduVar.zzc.hashCode() + (i5 * 53);
                if (this.f) {
                    return ((zzadr) zzaduVar).zzb.a.hashCode() + (hashCode * 53);
                }
                return hashCode;
            }
            if (!t(0, iArr[i8], zzaduVar)) {
                i5 = men.h(zzaduVar, j(r3) & 1048575).hashCode() + (i5 * 53);
            }
            i8++;
        }
    }

    @Override // defpackage.odn
    public final int h(zzadu zzaduVar) {
        int i;
        int b;
        int c;
        int A;
        int i2;
        int i3;
        int b2;
        int size;
        int s;
        int b3;
        int b4;
        int b5;
        int i4;
        int b6;
        int c2;
        b bVar = this;
        zzadu zzaduVar2 = zzaduVar;
        int i5 = 1048575;
        int i6 = 1048575;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (true) {
            int[] iArr = bVar.a;
            if (i7 >= iArr.length) {
                int c3 = zzaduVar2.zzc.c() + i9;
                if (!bVar.f) {
                    return c3;
                }
                rdn rdnVar = ((zzadr) zzaduVar2).zzb.a;
                int i10 = rdnVar.b;
                int i11 = 0;
                for (int i12 = 0; i12 < i10; i12++) {
                    tdn a = rdnVar.a(i12);
                    i11 = gan.h((zzadj) a.a, a.b) + i11;
                }
                for (Map.Entry entry : rdnVar.c()) {
                    i11 = gan.h((zzadj) entry.getKey(), entry.getValue()) + i11;
                }
                return c3 + i11;
            }
            int j = bVar.j(i7);
            int k = k(j);
            int i13 = iArr[i7];
            int i14 = iArr[i7 + 2];
            int i15 = i14 & i5;
            Unsafe unsafe = n;
            if (k <= 17) {
                if (i15 != i6) {
                    i8 = i15 == i5 ? 0 : unsafe.getInt(zzaduVar2, i15);
                    i6 = i15;
                }
                i = 1 << (i14 >>> 20);
            } else {
                i = 0;
            }
            int i16 = j & i5;
            if (k >= zzadl.b.a) {
                int i17 = zzadl.c.a;
            }
            long j2 = i16;
            switch (k) {
                case 0:
                    if (bVar.q(i7, i6, i8, i, zzaduVar2)) {
                        i9 = x5n.c(i13 << 3, 8, i9);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (bVar.q(i7, i6, i8, i, zzaduVar2)) {
                        i9 = x5n.c(i13 << 3, 4, i9);
                    }
                    bVar = this;
                    zzaduVar2 = zzaduVar;
                    break;
                case 2:
                    if (bVar.q(i7, i6, i8, i, zzaduVar2)) {
                        long j3 = unsafe.getLong(zzaduVar2, j2);
                        b = zzada.b(i13 << 3);
                        c = zzada.c(j3);
                        i9 += c + b;
                    }
                    bVar = this;
                    break;
                case 3:
                    if (bVar.q(i7, i6, i8, i, zzaduVar2)) {
                        long j4 = unsafe.getLong(zzaduVar2, j2);
                        b = zzada.b(i13 << 3);
                        c = zzada.c(j4);
                        i9 += c + b;
                    }
                    bVar = this;
                    break;
                case 4:
                    if (bVar.q(i7, i6, i8, i, zzaduVar2)) {
                        long j5 = unsafe.getInt(zzaduVar2, j2);
                        b = zzada.b(i13 << 3);
                        c = zzada.c(j5);
                        i9 += c + b;
                    }
                    bVar = this;
                    break;
                case 5:
                    if (bVar.q(i7, i6, i8, i, zzaduVar2)) {
                        i9 = x5n.c(i13 << 3, 8, i9);
                    }
                    bVar = this;
                    zzaduVar2 = zzaduVar;
                    break;
                case 6:
                    if (bVar.q(i7, i6, i8, i, zzaduVar2)) {
                        i9 = x5n.c(i13 << 3, 4, i9);
                    }
                    bVar = this;
                    zzaduVar2 = zzaduVar;
                    break;
                case 7:
                    if (bVar.q(i7, i6, i8, i, zzaduVar2)) {
                        i9 = x5n.c(i13 << 3, 1, i9);
                    }
                    bVar = this;
                    zzaduVar2 = zzaduVar;
                    break;
                case 8:
                    if (bVar.q(i7, i6, i8, i, zzaduVar2)) {
                        int i18 = i13 << 3;
                        Object object = unsafe.getObject(zzaduVar2, j2);
                        if (object instanceof zzacr) {
                            int b7 = zzada.b(i18);
                            int d = ((zzacr) object).d();
                            i9 = x5n.w(d, d, b7, i9);
                        } else {
                            int b8 = zzada.b(i18);
                            int b9 = ten.b((String) object);
                            i9 = x5n.w(b9, b9, b8, i9);
                        }
                    }
                    bVar = this;
                    break;
                case 9:
                    if (bVar.q(i7, i6, i8, i, zzaduVar2)) {
                        A = d.A(i13, unsafe.getObject(zzaduVar2, j2), bVar.C(i7));
                        i9 += A;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (bVar.q(i7, i6, i8, i, zzaduVar2)) {
                        zzacr zzacrVar = (zzacr) unsafe.getObject(zzaduVar2, j2);
                        int b10 = zzada.b(i13 << 3);
                        int d2 = zzacrVar.d();
                        i9 = x5n.w(d2, d2, b10, i9);
                    }
                    bVar = this;
                    break;
                case 11:
                    if (bVar.q(i7, i6, i8, i, zzaduVar2)) {
                        i9 = x5n.c(unsafe.getInt(zzaduVar2, j2), zzada.b(i13 << 3), i9);
                    }
                    bVar = this;
                    break;
                case 12:
                    if (bVar.q(i7, i6, i8, i, zzaduVar2)) {
                        long j6 = unsafe.getInt(zzaduVar2, j2);
                        b = zzada.b(i13 << 3);
                        c = zzada.c(j6);
                        i9 += c + b;
                    }
                    bVar = this;
                    break;
                case 13:
                    if (bVar.q(i7, i6, i8, i, zzaduVar2)) {
                        i9 = x5n.c(i13 << 3, 4, i9);
                    }
                    bVar = this;
                    zzaduVar2 = zzaduVar;
                    break;
                case 14:
                    if (bVar.q(i7, i6, i8, i, zzaduVar2)) {
                        i9 = x5n.c(i13 << 3, 8, i9);
                    }
                    bVar = this;
                    zzaduVar2 = zzaduVar;
                    break;
                case 15:
                    if (bVar.q(i7, i6, i8, i, zzaduVar2)) {
                        int i19 = unsafe.getInt(zzaduVar2, j2);
                        i9 = x5n.c((i19 >> 31) ^ (i19 + i19), zzada.b(i13 << 3), i9);
                    }
                    bVar = this;
                    break;
                case 16:
                    if (bVar.q(i7, i6, i8, i, zzaduVar2)) {
                        long j7 = unsafe.getLong(zzaduVar2, j2);
                        b = zzada.b(i13 << 3);
                        c = zzada.c((j7 >> 63) ^ (j7 + j7));
                        i9 += c + b;
                    }
                    bVar = this;
                    break;
                case 17:
                    if (bVar.q(i7, i6, i8, i, zzaduVar2)) {
                        zzafc zzafcVar = (zzafc) unsafe.getObject(zzaduVar2, j2);
                        odn C = bVar.C(i7);
                        e eVar = d.a;
                        int b11 = zzada.b(i13 << 3);
                        i2 = b11 + b11;
                        i3 = ((zzacb) zzafcVar).i(C);
                        A = i3 + i2;
                        i9 += A;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    A = d.z(i13, (List) unsafe.getObject(zzaduVar2, j2));
                    i9 += A;
                    break;
                case 19:
                    A = d.y(i13, (List) unsafe.getObject(zzaduVar2, j2));
                    i9 += A;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(zzaduVar2, j2);
                    e eVar2 = d.a;
                    if (list.size() != 0) {
                        b2 = (zzada.b(i13 << 3) * list.size()) + d.r(list);
                        i9 += b2;
                        break;
                    }
                    b2 = 0;
                    i9 += b2;
                case 21:
                    List list2 = (List) unsafe.getObject(zzaduVar2, j2);
                    e eVar3 = d.a;
                    size = list2.size();
                    if (size != 0) {
                        s = d.s(list2);
                        b3 = zzada.b(i13 << 3);
                        b4 = (b3 * size) + s;
                        i9 += b4;
                        break;
                    }
                    b4 = 0;
                    i9 += b4;
                case 22:
                    List list3 = (List) unsafe.getObject(zzaduVar2, j2);
                    e eVar4 = d.a;
                    size = list3.size();
                    if (size != 0) {
                        s = d.v(list3);
                        b3 = zzada.b(i13 << 3);
                        b4 = (b3 * size) + s;
                        i9 += b4;
                        break;
                    }
                    b4 = 0;
                    i9 += b4;
                case 23:
                    A = d.z(i13, (List) unsafe.getObject(zzaduVar2, j2));
                    i9 += A;
                    break;
                case 24:
                    A = d.y(i13, (List) unsafe.getObject(zzaduVar2, j2));
                    i9 += A;
                    break;
                case 25:
                    List list4 = (List) unsafe.getObject(zzaduVar2, j2);
                    e eVar5 = d.a;
                    int size2 = list4.size();
                    if (size2 != 0) {
                        b2 = (zzada.b(i13 << 3) + 1) * size2;
                        i9 += b2;
                        break;
                    }
                    b2 = 0;
                    i9 += b2;
                case 26:
                    List list5 = (List) unsafe.getObject(zzaduVar2, j2);
                    e eVar6 = d.a;
                    int size3 = list5.size();
                    if (size3 != 0) {
                        b4 = zzada.b(i13 << 3) * size3;
                        if (list5 instanceof zzaen) {
                            zzaen zzaenVar = (zzaen) list5;
                            for (int i20 = 0; i20 < size3; i20++) {
                                Object zzc = zzaenVar.zzc();
                                if (zzc instanceof zzacr) {
                                    int d3 = ((zzacr) zzc).d();
                                    b4 = x5n.c(d3, d3, b4);
                                } else {
                                    int b12 = ten.b((String) zzc);
                                    b4 = x5n.c(b12, b12, b4);
                                }
                            }
                        } else {
                            for (int i21 = 0; i21 < size3; i21++) {
                                Object obj = list5.get(i21);
                                if (obj instanceof zzacr) {
                                    int d4 = ((zzacr) obj).d();
                                    b4 = x5n.c(d4, d4, b4);
                                } else {
                                    int b13 = ten.b((String) obj);
                                    b4 = x5n.c(b13, b13, b4);
                                }
                            }
                        }
                        i9 += b4;
                        break;
                    }
                    b4 = 0;
                    i9 += b4;
                case 27:
                    List list6 = (List) unsafe.getObject(zzaduVar2, j2);
                    odn C2 = bVar.C(i7);
                    e eVar7 = d.a;
                    int size4 = list6.size();
                    if (size4 == 0) {
                        b5 = 0;
                    } else {
                        b5 = zzada.b(i13 << 3) * size4;
                        for (int i22 = 0; i22 < size4; i22++) {
                            Object obj2 = list6.get(i22);
                            if (obj2 instanceof zzaem) {
                                int a2 = ((zzaem) obj2).a();
                                b5 = x5n.c(a2, a2, b5);
                            } else {
                                int i23 = ((zzacb) obj2).i(C2);
                                b5 = x5n.c(i23, i23, b5);
                            }
                        }
                    }
                    i9 += b5;
                    break;
                case 28:
                    List list7 = (List) unsafe.getObject(zzaduVar2, j2);
                    e eVar8 = d.a;
                    int size5 = list7.size();
                    if (size5 != 0) {
                        b4 = zzada.b(i13 << 3) * size5;
                        for (int i24 = 0; i24 < list7.size(); i24++) {
                            int d5 = ((zzacr) list7.get(i24)).d();
                            b4 = x5n.c(d5, d5, b4);
                        }
                        i9 += b4;
                        break;
                    }
                    b4 = 0;
                    i9 += b4;
                case 29:
                    List list8 = (List) unsafe.getObject(zzaduVar2, j2);
                    e eVar9 = d.a;
                    size = list8.size();
                    if (size != 0) {
                        s = d.w(list8);
                        b3 = zzada.b(i13 << 3);
                        b4 = (b3 * size) + s;
                        i9 += b4;
                        break;
                    }
                    b4 = 0;
                    i9 += b4;
                case 30:
                    List list9 = (List) unsafe.getObject(zzaduVar2, j2);
                    e eVar10 = d.a;
                    size = list9.size();
                    if (size != 0) {
                        s = d.u(list9);
                        b3 = zzada.b(i13 << 3);
                        b4 = (b3 * size) + s;
                        i9 += b4;
                        break;
                    }
                    b4 = 0;
                    i9 += b4;
                case 31:
                    A = d.y(i13, (List) unsafe.getObject(zzaduVar2, j2));
                    i9 += A;
                    break;
                case 32:
                    A = d.z(i13, (List) unsafe.getObject(zzaduVar2, j2));
                    i9 += A;
                    break;
                case 33:
                    List list10 = (List) unsafe.getObject(zzaduVar2, j2);
                    e eVar11 = d.a;
                    size = list10.size();
                    if (size != 0) {
                        s = d.x(list10);
                        b3 = zzada.b(i13 << 3);
                        b4 = (b3 * size) + s;
                        i9 += b4;
                        break;
                    }
                    b4 = 0;
                    i9 += b4;
                case 34:
                    List list11 = (List) unsafe.getObject(zzaduVar2, j2);
                    e eVar12 = d.a;
                    size = list11.size();
                    if (size != 0) {
                        s = d.t(list11);
                        b3 = zzada.b(i13 << 3);
                        b4 = (b3 * size) + s;
                        i9 += b4;
                        break;
                    }
                    b4 = 0;
                    i9 += b4;
                case 35:
                    List list12 = (List) unsafe.getObject(zzaduVar2, j2);
                    e eVar13 = d.a;
                    int size6 = list12.size() * 8;
                    if (size6 > 0) {
                        i9 = x5n.w(size6, zzada.b(i13 << 3), size6, i9);
                        break;
                    } else {
                        break;
                    }
                case 36:
                    List list13 = (List) unsafe.getObject(zzaduVar2, j2);
                    e eVar14 = d.a;
                    int size7 = list13.size() * 4;
                    if (size7 > 0) {
                        i9 = x5n.w(size7, zzada.b(i13 << 3), size7, i9);
                        break;
                    } else {
                        break;
                    }
                case 37:
                    int r = d.r((List) unsafe.getObject(zzaduVar2, j2));
                    if (r > 0) {
                        i9 = x5n.w(r, zzada.b(i13 << 3), r, i9);
                        break;
                    } else {
                        break;
                    }
                case 38:
                    int s2 = d.s((List) unsafe.getObject(zzaduVar2, j2));
                    if (s2 > 0) {
                        i9 = x5n.w(s2, zzada.b(i13 << 3), s2, i9);
                        break;
                    } else {
                        break;
                    }
                case 39:
                    int v = d.v((List) unsafe.getObject(zzaduVar2, j2));
                    if (v > 0) {
                        i9 = x5n.w(v, zzada.b(i13 << 3), v, i9);
                        break;
                    } else {
                        break;
                    }
                case 40:
                    List list14 = (List) unsafe.getObject(zzaduVar2, j2);
                    e eVar15 = d.a;
                    int size8 = list14.size() * 8;
                    if (size8 > 0) {
                        i9 = x5n.w(size8, zzada.b(i13 << 3), size8, i9);
                        break;
                    } else {
                        break;
                    }
                case 41:
                    List list15 = (List) unsafe.getObject(zzaduVar2, j2);
                    e eVar16 = d.a;
                    int size9 = list15.size() * 4;
                    if (size9 > 0) {
                        i9 = x5n.w(size9, zzada.b(i13 << 3), size9, i9);
                        break;
                    } else {
                        break;
                    }
                case 42:
                    List list16 = (List) unsafe.getObject(zzaduVar2, j2);
                    e eVar17 = d.a;
                    int size10 = list16.size();
                    if (size10 > 0) {
                        i9 = x5n.w(size10, zzada.b(i13 << 3), size10, i9);
                        break;
                    } else {
                        break;
                    }
                case 43:
                    int w = d.w((List) unsafe.getObject(zzaduVar2, j2));
                    if (w > 0) {
                        i9 = x5n.w(w, zzada.b(i13 << 3), w, i9);
                        break;
                    } else {
                        break;
                    }
                case 44:
                    int u = d.u((List) unsafe.getObject(zzaduVar2, j2));
                    if (u > 0) {
                        i9 = x5n.w(u, zzada.b(i13 << 3), u, i9);
                        break;
                    } else {
                        break;
                    }
                case 45:
                    List list17 = (List) unsafe.getObject(zzaduVar2, j2);
                    e eVar18 = d.a;
                    int size11 = list17.size() * 4;
                    if (size11 > 0) {
                        i9 = x5n.w(size11, zzada.b(i13 << 3), size11, i9);
                        break;
                    } else {
                        break;
                    }
                case 46:
                    List list18 = (List) unsafe.getObject(zzaduVar2, j2);
                    e eVar19 = d.a;
                    int size12 = list18.size() * 8;
                    if (size12 > 0) {
                        i9 = x5n.w(size12, zzada.b(i13 << 3), size12, i9);
                        break;
                    } else {
                        break;
                    }
                case 47:
                    int x = d.x((List) unsafe.getObject(zzaduVar2, j2));
                    if (x > 0) {
                        i9 = x5n.w(x, zzada.b(i13 << 3), x, i9);
                        break;
                    } else {
                        break;
                    }
                case 48:
                    int t = d.t((List) unsafe.getObject(zzaduVar2, j2));
                    if (t > 0) {
                        i9 = x5n.w(t, zzada.b(i13 << 3), t, i9);
                        break;
                    } else {
                        break;
                    }
                case 49:
                    List list19 = (List) unsafe.getObject(zzaduVar2, j2);
                    odn C3 = bVar.C(i7);
                    e eVar20 = d.a;
                    int size13 = list19.size();
                    if (size13 == 0) {
                        i4 = 0;
                    } else {
                        i4 = 0;
                        for (int i25 = 0; i25 < size13; i25++) {
                            zzafc zzafcVar2 = (zzafc) list19.get(i25);
                            int b14 = zzada.b(i13 << 3);
                            i4 += ((zzacb) zzafcVar2).i(C3) + b14 + b14;
                        }
                    }
                    i9 += i4;
                    break;
                case 50:
                    zzaew zzaewVar = (zzaew) unsafe.getObject(zzaduVar2, j2);
                    zzaev zzaevVar = (zzaev) bVar.D(i7);
                    if (!zzaewVar.isEmpty()) {
                        b4 = 0;
                        for (Map.Entry entry2 : zzaewVar.entrySet()) {
                            Object key = entry2.getKey();
                            Object value = entry2.getValue();
                            l2a l2aVar = zzaevVar.a;
                            int b15 = zzada.b(i13 << 3);
                            int b16 = zzaev.b(l2aVar, key, value);
                            b4 = x5n.w(b16, b16, b15, b4);
                        }
                        i9 += b4;
                        break;
                    }
                    b4 = 0;
                    i9 += b4;
                case 51:
                    if (bVar.t(i13, i7, zzaduVar2)) {
                        i9 = x5n.c(i13 << 3, 8, i9);
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (bVar.t(i13, i7, zzaduVar2)) {
                        i9 = x5n.c(i13 << 3, 4, i9);
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (bVar.t(i13, i7, zzaduVar2)) {
                        long o = o(zzaduVar2, j2);
                        b6 = zzada.b(i13 << 3);
                        c2 = zzada.c(o);
                        i9 += c2 + b6;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (bVar.t(i13, i7, zzaduVar2)) {
                        long o2 = o(zzaduVar2, j2);
                        b6 = zzada.b(i13 << 3);
                        c2 = zzada.c(o2);
                        i9 += c2 + b6;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (bVar.t(i13, i7, zzaduVar2)) {
                        long n2 = n(zzaduVar2, j2);
                        b6 = zzada.b(i13 << 3);
                        c2 = zzada.c(n2);
                        i9 += c2 + b6;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (bVar.t(i13, i7, zzaduVar2)) {
                        i9 = x5n.c(i13 << 3, 8, i9);
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (bVar.t(i13, i7, zzaduVar2)) {
                        i9 = x5n.c(i13 << 3, 4, i9);
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (bVar.t(i13, i7, zzaduVar2)) {
                        i9 = x5n.c(i13 << 3, 1, i9);
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (bVar.t(i13, i7, zzaduVar2)) {
                        int i26 = i13 << 3;
                        Object object2 = unsafe.getObject(zzaduVar2, j2);
                        if (object2 instanceof zzacr) {
                            int b17 = zzada.b(i26);
                            int d6 = ((zzacr) object2).d();
                            i9 = x5n.w(d6, d6, b17, i9);
                            break;
                        } else {
                            int b18 = zzada.b(i26);
                            int b19 = ten.b((String) object2);
                            i9 = x5n.w(b19, b19, b18, i9);
                            break;
                        }
                    } else {
                        break;
                    }
                case 60:
                    if (bVar.t(i13, i7, zzaduVar2)) {
                        A = d.A(i13, unsafe.getObject(zzaduVar2, j2), bVar.C(i7));
                        i9 += A;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (bVar.t(i13, i7, zzaduVar2)) {
                        zzacr zzacrVar2 = (zzacr) unsafe.getObject(zzaduVar2, j2);
                        int b20 = zzada.b(i13 << 3);
                        int d7 = zzacrVar2.d();
                        i9 = x5n.w(d7, d7, b20, i9);
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (bVar.t(i13, i7, zzaduVar2)) {
                        i9 = x5n.c(n(zzaduVar2, j2), zzada.b(i13 << 3), i9);
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (bVar.t(i13, i7, zzaduVar2)) {
                        long n3 = n(zzaduVar2, j2);
                        b6 = zzada.b(i13 << 3);
                        c2 = zzada.c(n3);
                        i9 += c2 + b6;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (bVar.t(i13, i7, zzaduVar2)) {
                        i9 = x5n.c(i13 << 3, 4, i9);
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (bVar.t(i13, i7, zzaduVar2)) {
                        i9 = x5n.c(i13 << 3, 8, i9);
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (bVar.t(i13, i7, zzaduVar2)) {
                        int n4 = n(zzaduVar2, j2);
                        i9 = x5n.c((n4 >> 31) ^ (n4 + n4), zzada.b(i13 << 3), i9);
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (bVar.t(i13, i7, zzaduVar2)) {
                        long o3 = o(zzaduVar2, j2);
                        b6 = zzada.b(i13 << 3);
                        c2 = zzada.c((o3 >> 63) ^ (o3 + o3));
                        i9 += c2 + b6;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (bVar.t(i13, i7, zzaduVar2)) {
                        zzafc zzafcVar3 = (zzafc) unsafe.getObject(zzaduVar2, j2);
                        odn C4 = bVar.C(i7);
                        e eVar21 = d.a;
                        int b21 = zzada.b(i13 << 3);
                        i2 = b21 + b21;
                        i3 = ((zzacb) zzafcVar3).i(C4);
                        A = i3 + i2;
                        i9 += A;
                        break;
                    } else {
                        break;
                    }
            }
            i7 += 3;
            i5 = 1048575;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:153:0x01d1, code lost:
    
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0218 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01d1 A[SYNTHETIC] */
    @Override // defpackage.odn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean i(zzadu zzaduVar, zzadu zzaduVar2) {
        boolean a;
        int i = 0;
        while (true) {
            int[] iArr = this.a;
            if (i < iArr.length) {
                int j = j(i);
                int k = k(j);
                if (k <= 50 || k >= 69) {
                    long j2 = j & 1048575;
                    switch (k) {
                        case 0:
                            if (!p(zzaduVar, zzaduVar2, i)) {
                                break;
                            } else {
                                sck sckVar = men.c;
                                if (Double.doubleToLongBits(sckVar.C(zzaduVar, j2)) != Double.doubleToLongBits(sckVar.C(zzaduVar2, j2))) {
                                    break;
                                } else {
                                    break;
                                }
                            }
                        case 1:
                            if (!p(zzaduVar, zzaduVar2, i)) {
                                break;
                            } else {
                                sck sckVar2 = men.c;
                                if (Float.floatToIntBits(sckVar2.v(zzaduVar, j2)) != Float.floatToIntBits(sckVar2.v(zzaduVar2, j2))) {
                                    break;
                                } else {
                                    break;
                                }
                            }
                        case 2:
                            if (p(zzaduVar, zzaduVar2, i) && men.f(zzaduVar, j2) == men.f(zzaduVar2, j2)) {
                                break;
                            }
                            break;
                        case 3:
                            if (p(zzaduVar, zzaduVar2, i) && men.f(zzaduVar, j2) == men.f(zzaduVar2, j2)) {
                                break;
                            }
                            break;
                        case 4:
                            if (p(zzaduVar, zzaduVar2, i) && men.d(zzaduVar, j2) == men.d(zzaduVar2, j2)) {
                                break;
                            }
                            break;
                        case 5:
                            if (p(zzaduVar, zzaduVar2, i) && men.f(zzaduVar, j2) == men.f(zzaduVar2, j2)) {
                                break;
                            }
                            break;
                        case 6:
                            if (p(zzaduVar, zzaduVar2, i) && men.d(zzaduVar, j2) == men.d(zzaduVar2, j2)) {
                                break;
                            }
                            break;
                        case 7:
                            if (!p(zzaduVar, zzaduVar2, i)) {
                                break;
                            } else {
                                sck sckVar3 = men.c;
                                if (sckVar3.s(zzaduVar, j2) != sckVar3.s(zzaduVar2, j2)) {
                                    break;
                                } else {
                                    break;
                                }
                            }
                        case 8:
                            if (p(zzaduVar, zzaduVar2, i) && d.a(men.h(zzaduVar, j2), men.h(zzaduVar2, j2))) {
                                break;
                            }
                            break;
                        case 9:
                            if (p(zzaduVar, zzaduVar2, i) && d.a(men.h(zzaduVar, j2), men.h(zzaduVar2, j2))) {
                                break;
                            }
                            break;
                        case 10:
                            if (p(zzaduVar, zzaduVar2, i) && d.a(men.h(zzaduVar, j2), men.h(zzaduVar2, j2))) {
                                break;
                            }
                            break;
                        case 11:
                            if (p(zzaduVar, zzaduVar2, i) && men.d(zzaduVar, j2) == men.d(zzaduVar2, j2)) {
                                break;
                            }
                            break;
                        case 12:
                            if (p(zzaduVar, zzaduVar2, i) && men.d(zzaduVar, j2) == men.d(zzaduVar2, j2)) {
                                break;
                            }
                            break;
                        case 13:
                            if (p(zzaduVar, zzaduVar2, i) && men.d(zzaduVar, j2) == men.d(zzaduVar2, j2)) {
                                break;
                            }
                            break;
                        case 14:
                            if (p(zzaduVar, zzaduVar2, i) && men.f(zzaduVar, j2) == men.f(zzaduVar2, j2)) {
                                break;
                            }
                            break;
                        case 15:
                            if (p(zzaduVar, zzaduVar2, i) && men.d(zzaduVar, j2) == men.d(zzaduVar2, j2)) {
                                break;
                            }
                            break;
                        case 16:
                            if (p(zzaduVar, zzaduVar2, i) && men.f(zzaduVar, j2) == men.f(zzaduVar2, j2)) {
                                break;
                            }
                            break;
                        case 17:
                            if (p(zzaduVar, zzaduVar2, i) && d.a(men.h(zzaduVar, j2), men.h(zzaduVar2, j2))) {
                                break;
                            }
                            break;
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                        case 40:
                        case 41:
                        case 42:
                        case 43:
                        case 44:
                        case 45:
                        case 46:
                        case 47:
                        case 48:
                        case 49:
                            a = d.a(men.h(zzaduVar, j2), men.h(zzaduVar2, j2));
                            if (!a) {
                                break;
                            } else {
                                break;
                            }
                        case 50:
                            a = d.a(men.h(zzaduVar, j2), men.h(zzaduVar2, j2));
                            if (!a) {
                            }
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
                        case 64:
                        case 65:
                        case 66:
                        case 67:
                        case 68:
                            long j3 = iArr[i + 2] & 1048575;
                            if (men.d(zzaduVar, j3) == men.d(zzaduVar2, j3) && d.a(men.h(zzaduVar, j2), men.h(zzaduVar2, j2))) {
                                break;
                            }
                            break;
                    }
                    return false;
                }
                i += 3;
            } else {
                int i2 = this.j;
                while (true) {
                    int[] iArr2 = this.h;
                    if (i2 < iArr2.length) {
                        int i3 = iArr2[i2];
                        long j4 = iArr[i3 + 2] & 1048575;
                        if (men.d(zzaduVar, j4) != men.d(zzaduVar2, j4)) {
                            return false;
                        }
                        if (!t(0, i3, zzaduVar)) {
                            long j5 = j(i3) & 1048575;
                            if (!d.a(men.h(zzaduVar, j5), men.h(zzaduVar2, j5))) {
                            }
                        }
                        i2++;
                    } else if (zzaduVar.zzc.equals(zzaduVar2.zzc)) {
                        if (this.f) {
                            return ((zzadr) zzaduVar).zzb.equals(((zzadr) zzaduVar2).zzb);
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int j(int i) {
        return this.a[i + 1];
    }

    public final boolean p(zzadu zzaduVar, zzadu zzaduVar2, int i) {
        return r(i, zzaduVar) == r(i, zzaduVar2);
    }

    public final boolean q(int i, int i2, int i3, int i4, Object obj) {
        return i2 == 1048575 ? r(i, obj) : (i3 & i4) != 0;
    }

    public final boolean r(int i, Object obj) {
        int i2 = this.a[i + 2];
        long j = i2 & 1048575;
        if (j != 1048575) {
            return ((1 << (i2 >>> 20)) & men.d(obj, j)) != 0;
        }
        int j2 = j(i);
        long j3 = j2 & 1048575;
        switch (k(j2)) {
            case 0:
                if (Double.doubleToRawLongBits(men.c.C(obj, j3)) != 0) {
                }
                break;
            case 1:
                if (Float.floatToRawIntBits(men.c.v(obj, j3)) != 0) {
                }
                break;
            case 2:
                if (men.f(obj, j3) != 0) {
                }
                break;
            case 3:
                if (men.f(obj, j3) != 0) {
                }
                break;
            case 4:
                if (men.d(obj, j3) != 0) {
                }
                break;
            case 5:
                if (men.f(obj, j3) != 0) {
                }
                break;
            case 6:
                if (men.d(obj, j3) != 0) {
                }
                break;
            case 7:
                break;
            case 8:
                Object h = men.h(obj, j3);
                if (!(h instanceof String)) {
                    if (!(h instanceof zzacr)) {
                        ilg.c();
                        break;
                    } else if (!zzacr.b.equals(h)) {
                    }
                } else if (!((String) h).isEmpty()) {
                }
                break;
            case 9:
                if (men.h(obj, j3) != null) {
                }
                break;
            case 10:
                if (!zzacr.b.equals(men.h(obj, j3))) {
                }
                break;
            case 11:
                if (men.d(obj, j3) != 0) {
                }
                break;
            case 12:
                if (men.d(obj, j3) != 0) {
                }
                break;
            case 13:
                if (men.d(obj, j3) != 0) {
                }
                break;
            case 14:
                if (men.f(obj, j3) != 0) {
                }
                break;
            case 15:
                if (men.d(obj, j3) != 0) {
                }
                break;
            case 16:
                if (men.f(obj, j3) != 0) {
                }
                break;
            case 17:
                if (men.h(obj, j3) != null) {
                }
                break;
            default:
                ilg.c();
                break;
        }
        return false;
    }

    public final void s(int i, Object obj) {
        int i2 = this.a[i + 2];
        long j = 1048575 & i2;
        if (j == 1048575) {
            return;
        }
        men.e((1 << (i2 >>> 20)) | men.d(obj, j), j, obj);
    }

    public final boolean t(int i, int i2, Object obj) {
        return men.d(obj, (long) (this.a[i2 + 2] & 1048575)) == i;
    }

    public final void u(int i, int i2, Object obj) {
        men.e(i, this.a[i2 + 2] & 1048575, obj);
    }

    public final int v(int i, int i2) {
        int[] iArr = this.a;
        int length = (iArr.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = iArr[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public final int y(java.lang.Object r38, byte[] r39, int r40, int r41, int r42, defpackage.tg0 r43) {
        /*
            Method dump skipped, instructions count: 3994
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.b.y(java.lang.Object, byte[], int, int, int, tg0):int");
    }

    @Override // defpackage.odn
    public final Object zza() {
        return ((zzadu) this.e).n();
    }
}

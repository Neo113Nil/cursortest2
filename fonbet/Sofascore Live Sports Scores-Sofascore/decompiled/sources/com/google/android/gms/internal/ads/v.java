package com.google.android.gms.internal.ads;

import defpackage.a70;
import defpackage.b1l;
import defpackage.bf3;
import defpackage.ceo;
import defpackage.cp4;
import defpackage.fc6;
import defpackage.fn0;
import defpackage.g7a;
import defpackage.h5o;
import defpackage.hbo;
import defpackage.ilg;
import defpackage.is8;
import defpackage.jqo;
import defpackage.mpo;
import defpackage.mz1;
import defpackage.nqo;
import defpackage.omf;
import defpackage.oqo;
import defpackage.ppo;
import defpackage.pqo;
import defpackage.pvd;
import defpackage.rpo;
import defpackage.rqo;
import defpackage.s6a;
import defpackage.sck;
import defpackage.tg0;
import defpackage.tqo;
import defpackage.vp2;
import defpackage.vpo;
import defpackage.wje;
import defpackage.wkf;
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
public final class v implements nqo {
    public static final int[] m = new int[0];
    public static final Unsafe n = rqo.g();
    public final int[] a;
    public final Object[] b;
    public final int c;
    public final int d;
    public final zzigw e;
    public final boolean f;
    public final boolean g;
    public final int[] h;
    public final int i;
    public final int j;
    public final z k;
    public final wkf l;

    public v(int[] iArr, Object[] objArr, int i, int i2, zzigw zzigwVar, int[] iArr2, int i3, int i4, z zVar, wkf wkfVar) {
        this.a = iArr;
        this.b = objArr;
        this.c = i;
        this.d = i2;
        this.g = zzigwVar instanceof zzifm;
        boolean z = false;
        if (wkfVar != null && (zzigwVar instanceof zzifi)) {
            z = true;
        }
        this.f = z;
        this.h = iArr2;
        this.i = i3;
        this.j = i4;
        this.k = zVar;
        this.l = wkfVar;
        this.e = zzigwVar;
    }

    public static int k(int i) {
        return (i >>> 20) & 255;
    }

    public static boolean l(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzifm) {
            return ((zzifm) obj).n();
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
        return ((Integer) rqo.e(obj, j)).intValue();
    }

    public static long o(Object obj, long j) {
        return ((Long) rqo.e(obj, j)).longValue();
    }

    public static final int w(byte[] bArr, int i, int i2, zziin zziinVar, Class cls, tg0 tg0Var) {
        zziin zziinVar2 = zziin.c;
        switch (zziinVar.ordinal()) {
            case 0:
                int i3 = i + 8;
                tg0Var.c = Double.valueOf(Double.longBitsToDouble(s6a.S(i, bArr)));
                return i3;
            case 1:
                int i4 = i + 4;
                tg0Var.c = Float.valueOf(Float.intBitsToFloat(s6a.R(i, bArr)));
                return i4;
            case 2:
            case 3:
                int Q = s6a.Q(bArr, i, tg0Var);
                tg0Var.c = Long.valueOf(tg0Var.b);
                return Q;
            case 4:
            case 12:
            case 13:
                int O = s6a.O(bArr, i, tg0Var);
                tg0Var.c = Integer.valueOf(tg0Var.a);
                return O;
            case 5:
            case 15:
                int i5 = i + 8;
                tg0Var.c = Long.valueOf(s6a.S(i, bArr));
                return i5;
            case 6:
            case 14:
                int i6 = i + 4;
                tg0Var.c = Integer.valueOf(s6a.R(i, bArr));
                return i6;
            case 7:
                int Q2 = s6a.Q(bArr, i, tg0Var);
                tg0Var.c = Boolean.valueOf(tg0Var.b != 0);
                return Q2;
            case 8:
                return s6a.T(bArr, i, tg0Var);
            case 9:
            default:
                cp4.h("unsupported field type.");
                return 0;
            case 10:
                nqo a = jqo.c.a(cls);
                Object zza = a.zza();
                int V = s6a.V(zza, a, bArr, i, i2, tg0Var);
                a.c(zza);
                tg0Var.c = zza;
                return V;
            case 11:
                return s6a.U(bArr, i, tg0Var);
            case 16:
                int O2 = s6a.O(bArr, i, tg0Var);
                tg0Var.c = Integer.valueOf(zziem.h(tg0Var.a));
                return O2;
            case 17:
                int Q3 = s6a.Q(bArr, i, tg0Var);
                tg0Var.c = Long.valueOf(zziem.i(tg0Var.b));
                return Q3;
        }
    }

    public static zziib x(Object obj) {
        zzifm zzifmVar = (zzifm) obj;
        zziib zziibVar = zzifmVar.zzt;
        if (zziibVar != zziib.f) {
            return zziibVar;
        }
        zziib a = zziib.a();
        zzifmVar.zzt = a;
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
            nqo C = C(i);
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
            nqo C = C(i);
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

    public final nqo C(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        Object[] objArr = this.b;
        nqo nqoVar = (nqo) objArr[i3];
        if (nqoVar != null) {
            return nqoVar;
        }
        nqo a = jqo.c.a((Class) objArr[i3 + 1]);
        objArr[i3] = a;
        return a;
    }

    public final Object D(int i) {
        int i2 = i / 3;
        return this.b[i2 + i2];
    }

    public final zzifs E(int i) {
        int i2 = i / 3;
        return (zzifs) this.b[i2 + i2 + 1];
    }

    public final Object F(int i, Object obj) {
        nqo C = C(i);
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
        nqo C = C(i2);
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

    public final Object J(int i, Object obj, Object obj2, Object obj3) {
        zzifs E;
        int i2 = this.a[i];
        Object e = rqo.e(obj, j(i) & 1048575);
        if (e == null || (E = E(i)) == null) {
            return obj2;
        }
        h5o h5oVar = ((zzigp) D(i)).a;
        zziin zziinVar = (zziin) h5oVar.b;
        zziin zziinVar2 = (zziin) h5oVar.a;
        Iterator it = ((zzigq) e).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!E.a(((Integer) entry.getValue()).intValue())) {
                if (obj2 == null) {
                    obj2 = z.b(obj3);
                }
                int f = vpo.f(zziinVar, 2, entry.getValue()) + vpo.f(zziinVar2, 1, entry.getKey());
                mpo mpoVar = zziei.b;
                byte[] bArr = new byte[f];
                ppo ppoVar = new ppo(bArr, f);
                try {
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    vpo.e(ppoVar, zziinVar2, 1, key);
                    vpo.e(ppoVar, zziinVar, 2, value);
                    ppoVar.d();
                    ((zziib) obj2).d((i2 << 3) | 2, new mpo(bArr));
                    it.remove();
                } catch (IOException e2) {
                    is8.h(e2);
                    return null;
                }
            }
        }
        return obj2;
    }

    public final void K(int i, zz0 zz0Var, Object obj) {
        zziem zziemVar = (zziem) zz0Var.e;
        long j = i & 1048575;
        if ((536870912 & i) != 0) {
            zz0Var.o1(2);
            rqo.f(j, obj, zziemVar.v());
        } else if (!this.g) {
            rqo.f(j, obj, zz0Var.J1());
        } else {
            zz0Var.o1(2);
            rqo.f(j, obj, zziemVar.u());
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.nqo
    public final void a(Object obj, Object obj2) {
        Object obj3;
        m(obj);
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.a;
            if (i >= iArr.length) {
                Object obj4 = obj;
                y.d(obj4, obj2);
                if (!this.f || ((zzifi) obj2).zza.a.isEmpty()) {
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
                        sck sckVar = rqo.c;
                        obj3 = obj;
                        sckVar.D(obj3, j2, sckVar.z(obj2, j2));
                        s(i, obj3);
                        break;
                    }
                    obj3 = obj;
                    break;
                case 1:
                    if (r(i, obj2)) {
                        sck sckVar2 = rqo.c;
                        sckVar2.y(obj, j2, sckVar2.t(obj2, j2));
                        s(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 2:
                    if (r(i, obj2)) {
                        rqo.d(obj, j2, rqo.c(obj2, j2));
                        s(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 3:
                    if (r(i, obj2)) {
                        rqo.d(obj, j2, rqo.c(obj2, j2));
                        s(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 4:
                    if (r(i, obj2)) {
                        rqo.b(rqo.a(obj2, j2), j2, obj);
                        s(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 5:
                    if (r(i, obj2)) {
                        rqo.d(obj, j2, rqo.c(obj2, j2));
                        s(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 6:
                    if (r(i, obj2)) {
                        rqo.b(rqo.a(obj2, j2), j2, obj);
                        s(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 7:
                    if (r(i, obj2)) {
                        sck sckVar3 = rqo.c;
                        sckVar3.r(obj, j2, sckVar3.p(obj2, j2));
                        s(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 8:
                    if (r(i, obj2)) {
                        rqo.f(j2, obj, rqo.e(obj2, j2));
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
                        rqo.f(j2, obj, rqo.e(obj2, j2));
                        s(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 11:
                    if (r(i, obj2)) {
                        rqo.b(rqo.a(obj2, j2), j2, obj);
                        s(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 12:
                    if (r(i, obj2)) {
                        rqo.b(rqo.a(obj2, j2), j2, obj);
                        s(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 13:
                    if (r(i, obj2)) {
                        rqo.b(rqo.a(obj2, j2), j2, obj);
                        s(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 14:
                    if (r(i, obj2)) {
                        rqo.d(obj, j2, rqo.c(obj2, j2));
                        s(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 15:
                    if (r(i, obj2)) {
                        rqo.b(rqo.a(obj2, j2), j2, obj);
                        s(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 16:
                    if (r(i, obj2)) {
                        rqo.d(obj, j2, rqo.c(obj2, j2));
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
                    zzify zzifyVar = (zzify) rqo.e(obj, j2);
                    zzify zzifyVar2 = (zzify) rqo.e(obj2, j2);
                    int size = zzifyVar.size();
                    int size2 = zzifyVar2.size();
                    if (size > 0 && size2 > 0) {
                        if (!zzifyVar.zza()) {
                            zzifyVar = zzifyVar.g(size2 + size);
                        }
                        zzifyVar.addAll(zzifyVar2);
                    }
                    if (size > 0) {
                        zzifyVar2 = zzifyVar;
                    }
                    rqo.f(j2, obj, zzifyVar2);
                    obj3 = obj;
                    break;
                case 50:
                    z zVar = y.a;
                    rqo.f(j2, obj, wje.k(rqo.e(obj, j2), rqo.e(obj2, j2)));
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
                        rqo.f(j2, obj, rqo.e(obj2, j2));
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
                        rqo.f(j2, obj, rqo.e(obj2, j2));
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

    @Override // defpackage.nqo
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
                v vVar = this;
                Object obj2 = obj;
                if ((268435456 & j) != 0 && !vVar.q(i4, i6, i8, i7, obj2)) {
                    break;
                }
                int k = k(j);
                if (k == 9 || k == 17) {
                    if (vVar.q(i4, i6, i8, i7, obj2) && !vVar.C(i4).b(rqo.e(obj2, j & 1048575))) {
                        break;
                    }
                    i++;
                    this = vVar;
                    i3 = i6;
                    i2 = i8;
                    obj = obj2;
                } else {
                    if (k != 27) {
                        if (k == 60 || k == 68) {
                            if (vVar.t(iArr[i4], i4, obj2) && !vVar.C(i4).b(rqo.e(obj2, j & 1048575))) {
                                break;
                            }
                            i++;
                            this = vVar;
                            i3 = i6;
                            i2 = i8;
                            obj = obj2;
                        } else if (k != 49) {
                            if (k == 50) {
                                zzigq zzigqVar = (zzigq) rqo.e(obj2, j & 1048575);
                                if (!zzigqVar.isEmpty() && ((zziin) ((zzigp) vVar.D(i4)).a.b).a == zziio.i) {
                                    nqo nqoVar = null;
                                    for (Object obj3 : zzigqVar.values()) {
                                        if (nqoVar == null) {
                                            nqoVar = jqo.c.a(obj3.getClass());
                                        }
                                        if (!nqoVar.b(obj3)) {
                                            break loop0;
                                        }
                                    }
                                }
                            } else {
                                continue;
                            }
                            i++;
                            this = vVar;
                            i3 = i6;
                            i2 = i8;
                            obj = obj2;
                        }
                    }
                    List list = (List) rqo.e(obj2, j & 1048575);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        nqo C = vVar.C(i4);
                        for (int i9 = 0; i9 < list.size(); i9++) {
                            if (!C.b(list.get(i9))) {
                                break loop0;
                            }
                        }
                    }
                    i++;
                    this = vVar;
                    i3 = i6;
                    i2 = i8;
                    obj = obj2;
                }
            } else {
                Object obj4 = obj;
                if (!this.f || ((zzifi) obj4).zza.d()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.nqo
    public final void c(Object obj) {
        if (!l(obj)) {
            return;
        }
        if (obj instanceof zzifm) {
            zzifm zzifmVar = (zzifm) obj;
            zzifmVar.m(Integer.MAX_VALUE);
            zzifmVar.zzq = 0;
            zzifmVar.o();
        }
        int i = 0;
        while (true) {
            int[] iArr = this.a;
            if (i >= iArr.length) {
                zziib zziibVar = ((zzifm) obj).zzt;
                if (zziibVar.e) {
                    zziibVar.e = false;
                }
                if (this.f) {
                    ((zzifi) obj).zza.a();
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
                            ((zzify) rqo.e(obj, j2)).zzb();
                            break;
                        case 50:
                            Object object = unsafe.getObject(obj, j2);
                            if (object == null) {
                                break;
                            } else {
                                ((zzigq) object).a = false;
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

    @Override // defpackage.nqo
    public final void d(Object obj, byte[] bArr, int i, int i2, tg0 tg0Var) {
        y(obj, bArr, i, i2, 0, tg0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x073a  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x072d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x071f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // defpackage.nqo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(Object obj, zz0 zz0Var, zziew zziewVar) {
        int[] iArr;
        z zVar;
        zziem zziemVar;
        zziem zziemVar2 = (zziem) zz0Var.e;
        int[] iArr2 = this.h;
        int i = this.j;
        int i2 = this.i;
        zziewVar.getClass();
        m(obj);
        Throwable th = null;
        Object obj2 = null;
        while (true) {
            try {
                int H1 = zz0Var.H1();
                int v = (H1 < this.c || H1 > this.d) ? -1 : v(H1, 0);
                z zVar2 = this.k;
                if (v >= 0) {
                    int j = j(v);
                    try {
                    } catch (zzigd unused) {
                        zVar = zVar2;
                    }
                    switch (k(j)) {
                        case 0:
                            zziemVar = zziemVar2;
                            iArr = iArr2;
                            zz0Var.o1(1);
                            rqo.c.D(obj, j & 1048575, zziemVar.m());
                            s(v, obj);
                            iArr2 = iArr;
                            zziemVar2 = zziemVar;
                            th = null;
                        case 1:
                            zziemVar = zziemVar2;
                            iArr = iArr2;
                            zz0Var.o1(5);
                            rqo.c.y(obj, j & 1048575, zziemVar.n());
                            s(v, obj);
                            iArr2 = iArr;
                            zziemVar2 = zziemVar;
                            th = null;
                        case 2:
                            zziemVar = zziemVar2;
                            iArr = iArr2;
                            zz0Var.o1(0);
                            rqo.d(obj, j & 1048575, zziemVar.p());
                            s(v, obj);
                            iArr2 = iArr;
                            zziemVar2 = zziemVar;
                            th = null;
                        case 3:
                            zziemVar = zziemVar2;
                            iArr = iArr2;
                            zz0Var.o1(0);
                            rqo.d(obj, j & 1048575, zziemVar.o());
                            s(v, obj);
                            iArr2 = iArr;
                            zziemVar2 = zziemVar;
                            th = null;
                        case 4:
                            zziemVar = zziemVar2;
                            iArr = iArr2;
                            zz0Var.o1(0);
                            rqo.b(zziemVar.q(), j & 1048575, obj);
                            s(v, obj);
                            iArr2 = iArr;
                            zziemVar2 = zziemVar;
                            th = null;
                        case 5:
                            zziemVar = zziemVar2;
                            iArr = iArr2;
                            zz0Var.o1(1);
                            rqo.d(obj, j & 1048575, zziemVar.r());
                            s(v, obj);
                            iArr2 = iArr;
                            zziemVar2 = zziemVar;
                            th = null;
                        case 6:
                            zziemVar = zziemVar2;
                            iArr = iArr2;
                            zz0Var.o1(5);
                            rqo.b(zziemVar.s(), j & 1048575, obj);
                            s(v, obj);
                            iArr2 = iArr;
                            zziemVar2 = zziemVar;
                            th = null;
                        case 7:
                            zziemVar = zziemVar2;
                            iArr = iArr2;
                            zz0Var.o1(0);
                            rqo.c.r(obj, j & 1048575, zziemVar.t());
                            s(v, obj);
                            iArr2 = iArr;
                            zziemVar2 = zziemVar;
                            th = null;
                        case 8:
                            zziemVar = zziemVar2;
                            iArr = iArr2;
                            K(j, zz0Var, obj);
                            s(v, obj);
                            iArr2 = iArr;
                            zziemVar2 = zziemVar;
                            th = null;
                        case 9:
                            zziemVar = zziemVar2;
                            iArr = iArr2;
                            zzigw zzigwVar = (zzigw) F(v, obj);
                            nqo C = C(v);
                            zz0Var.o1(2);
                            zz0Var.t1(zzigwVar, C, zziewVar);
                            G(v, obj, zzigwVar);
                            iArr2 = iArr;
                            zziemVar2 = zziemVar;
                            th = null;
                        case 10:
                            zziemVar = zziemVar2;
                            iArr = iArr2;
                            rqo.f(j & 1048575, obj, zz0Var.J1());
                            s(v, obj);
                            iArr2 = iArr;
                            zziemVar2 = zziemVar;
                            th = null;
                        case 11:
                            zziemVar = zziemVar2;
                            iArr = iArr2;
                            zz0Var.o1(0);
                            rqo.b(zziemVar.x(), j & 1048575, obj);
                            s(v, obj);
                            iArr2 = iArr;
                            zziemVar2 = zziemVar;
                            th = null;
                        case 12:
                            zziemVar = zziemVar2;
                            iArr = iArr2;
                            zz0Var.o1(0);
                            int y = zziemVar.y();
                            zzifs E = E(v);
                            if (E != null && !E.a(y)) {
                                obj2 = y.f(H1, obj, obj2, y);
                                iArr2 = iArr;
                                zziemVar2 = zziemVar;
                                th = null;
                            }
                            rqo.b(y, j & 1048575, obj);
                            s(v, obj);
                            iArr2 = iArr;
                            zziemVar2 = zziemVar;
                            th = null;
                            break;
                        case 13:
                            zziemVar = zziemVar2;
                            iArr = iArr2;
                            zz0Var.o1(5);
                            rqo.b(zziemVar.z(), j & 1048575, obj);
                            s(v, obj);
                            iArr2 = iArr;
                            zziemVar2 = zziemVar;
                            th = null;
                        case 14:
                            zziemVar = zziemVar2;
                            iArr = iArr2;
                            zz0Var.o1(1);
                            rqo.d(obj, j & 1048575, zziemVar.A());
                            s(v, obj);
                            iArr2 = iArr;
                            zziemVar2 = zziemVar;
                            th = null;
                        case 15:
                            zziemVar = zziemVar2;
                            iArr = iArr2;
                            zz0Var.o1(0);
                            rqo.b(zziemVar.B(), j & 1048575, obj);
                            s(v, obj);
                            iArr2 = iArr;
                            zziemVar2 = zziemVar;
                            th = null;
                        case 16:
                            zziemVar = zziemVar2;
                            iArr = iArr2;
                            zz0Var.o1(0);
                            rqo.d(obj, j & 1048575, zziemVar.C());
                            s(v, obj);
                            iArr2 = iArr;
                            zziemVar2 = zziemVar;
                            th = null;
                        case 17:
                            zziemVar = zziemVar2;
                            iArr = iArr2;
                            zzigw zzigwVar2 = (zzigw) F(v, obj);
                            nqo C2 = C(v);
                            zz0Var.o1(3);
                            zz0Var.y1(zzigwVar2, C2, zziewVar);
                            G(v, obj, zzigwVar2);
                            iArr2 = iArr;
                            zziemVar2 = zziemVar;
                            th = null;
                        case 18:
                            zziemVar = zziemVar2;
                            iArr = iArr2;
                            zz0Var.N1(omf.a(obj, j & 1048575));
                            iArr2 = iArr;
                            zziemVar2 = zziemVar;
                            th = null;
                        case 19:
                            zziemVar = zziemVar2;
                            iArr = iArr2;
                            zz0Var.R1(omf.a(obj, j & 1048575));
                            iArr2 = iArr;
                            zziemVar2 = zziemVar;
                            th = null;
                        case 20:
                            zziemVar = zziemVar2;
                            iArr = iArr2;
                            zz0Var.d0(omf.a(obj, j & 1048575));
                            iArr2 = iArr;
                            zziemVar2 = zziemVar;
                            th = null;
                        case 21:
                            zziemVar = zziemVar2;
                            iArr = iArr2;
                            zz0Var.V1(omf.a(obj, j & 1048575));
                            iArr2 = iArr;
                            zziemVar2 = zziemVar;
                            th = null;
                        case 22:
                            zziemVar = zziemVar2;
                            iArr = iArr2;
                            zz0Var.h0(omf.a(obj, j & 1048575));
                            iArr2 = iArr;
                            zziemVar2 = zziemVar;
                            th = null;
                        case 23:
                            zziemVar = zziemVar2;
                            iArr = iArr2;
                            zz0Var.l0(omf.a(obj, j & 1048575));
                            iArr2 = iArr;
                            zziemVar2 = zziemVar;
                            th = null;
                        case 24:
                            zziemVar = zziemVar2;
                            iArr = iArr2;
                            zz0Var.p0(omf.a(obj, j & 1048575));
                            iArr2 = iArr;
                            zziemVar2 = zziemVar;
                            th = null;
                        case 25:
                            zziemVar = zziemVar2;
                            iArr = iArr2;
                            zz0Var.t0(omf.a(obj, j & 1048575));
                            iArr2 = iArr;
                            zziemVar2 = zziemVar;
                            th = null;
                        case 26:
                            zziemVar = zziemVar2;
                            iArr = iArr2;
                            if ((536870912 & j) != 0) {
                                zz0Var.x0(omf.a(obj, j & 1048575), true);
                            } else {
                                zz0Var.x0(omf.a(obj, j & 1048575), false);
                            }
                            iArr2 = iArr;
                            zziemVar2 = zziemVar;
                            th = null;
                        case 27:
                            zziemVar = zziemVar2;
                            iArr = iArr2;
                            zz0Var.B0(omf.a(obj, j & 1048575), C(v), zziewVar);
                            iArr2 = iArr;
                            zziemVar2 = zziemVar;
                            th = null;
                        case 28:
                            zziemVar = zziemVar2;
                            iArr = iArr2;
                            zz0Var.J0(omf.a(obj, j & 1048575));
                            iArr2 = iArr;
                            zziemVar2 = zziemVar;
                            th = null;
                        case 29:
                            zziemVar = zziemVar2;
                            iArr = iArr2;
                            zz0Var.N0(omf.a(obj, j & 1048575));
                            iArr2 = iArr;
                            zziemVar2 = zziemVar;
                            th = null;
                        case 30:
                            zziemVar = zziemVar2;
                            iArr = iArr2;
                            zzify a = omf.a(obj, j & 1048575);
                            zz0Var.R0(a);
                            obj2 = y.e(obj, H1, a, E(v), obj2);
                            iArr2 = iArr;
                            zziemVar2 = zziemVar;
                            th = null;
                        case 31:
                            zziemVar = zziemVar2;
                            iArr = iArr2;
                            zz0Var.V0(omf.a(obj, j & 1048575));
                            iArr2 = iArr;
                            zziemVar2 = zziemVar;
                            th = null;
                        case 32:
                            zziemVar = zziemVar2;
                            iArr = iArr2;
                            zz0Var.Z0(omf.a(obj, j & 1048575));
                            iArr2 = iArr;
                            zziemVar2 = zziemVar;
                            th = null;
                        case 33:
                            zziemVar = zziemVar2;
                            iArr = iArr2;
                            zz0Var.d1(omf.a(obj, j & 1048575));
                            iArr2 = iArr;
                            zziemVar2 = zziemVar;
                            th = null;
                        case 34:
                            zziemVar = zziemVar2;
                            iArr = iArr2;
                            zz0Var.i1(omf.a(obj, j & 1048575));
                            iArr2 = iArr;
                            zziemVar2 = zziemVar;
                            th = null;
                        case 35:
                            zziemVar = zziemVar2;
                            iArr = iArr2;
                            zz0Var.N1(omf.a(obj, j & 1048575));
                            iArr2 = iArr;
                            zziemVar2 = zziemVar;
                            th = null;
                        case 36:
                            zziemVar = zziemVar2;
                            iArr = iArr2;
                            zz0Var.R1(omf.a(obj, j & 1048575));
                            iArr2 = iArr;
                            zziemVar2 = zziemVar;
                            th = null;
                        case 37:
                            zziemVar = zziemVar2;
                            iArr = iArr2;
                            zz0Var.d0(omf.a(obj, j & 1048575));
                            iArr2 = iArr;
                            zziemVar2 = zziemVar;
                            th = null;
                        case 38:
                            zziemVar = zziemVar2;
                            iArr = iArr2;
                            zz0Var.V1(omf.a(obj, j & 1048575));
                            iArr2 = iArr;
                            zziemVar2 = zziemVar;
                            th = null;
                        case 39:
                            zziemVar = zziemVar2;
                            iArr = iArr2;
                            zz0Var.h0(omf.a(obj, j & 1048575));
                            iArr2 = iArr;
                            zziemVar2 = zziemVar;
                            th = null;
                        case 40:
                            zziemVar = zziemVar2;
                            iArr = iArr2;
                            zz0Var.l0(omf.a(obj, j & 1048575));
                            iArr2 = iArr;
                            zziemVar2 = zziemVar;
                            th = null;
                        case 41:
                            zziemVar = zziemVar2;
                            iArr = iArr2;
                            zz0Var.p0(omf.a(obj, j & 1048575));
                            iArr2 = iArr;
                            zziemVar2 = zziemVar;
                            th = null;
                        case 42:
                            zziemVar = zziemVar2;
                            iArr = iArr2;
                            zz0Var.t0(omf.a(obj, j & 1048575));
                            iArr2 = iArr;
                            zziemVar2 = zziemVar;
                            th = null;
                        case 43:
                            zziemVar = zziemVar2;
                            iArr = iArr2;
                            zz0Var.N0(omf.a(obj, j & 1048575));
                            iArr2 = iArr;
                            zziemVar2 = zziemVar;
                            th = null;
                        case 44:
                            zziemVar = zziemVar2;
                            iArr = iArr2;
                            zzify a2 = omf.a(obj, j & 1048575);
                            zz0Var.R0(a2);
                            obj2 = y.e(obj, H1, a2, E(v), obj2);
                            iArr2 = iArr;
                            zziemVar2 = zziemVar;
                            th = null;
                        case 45:
                            zziemVar = zziemVar2;
                            iArr = iArr2;
                            zz0Var.V0(omf.a(obj, j & 1048575));
                            iArr2 = iArr;
                            zziemVar2 = zziemVar;
                            th = null;
                        case 46:
                            zziemVar = zziemVar2;
                            iArr = iArr2;
                            zz0Var.Z0(omf.a(obj, j & 1048575));
                            iArr2 = iArr;
                            zziemVar2 = zziemVar;
                            th = null;
                        case 47:
                            zziemVar = zziemVar2;
                            iArr = iArr2;
                            zz0Var.d1(omf.a(obj, j & 1048575));
                            iArr2 = iArr;
                            zziemVar2 = zziemVar;
                            th = null;
                        case 48:
                            zziemVar = zziemVar2;
                            iArr = iArr2;
                            zz0Var.i1(omf.a(obj, j & 1048575));
                            iArr2 = iArr;
                            zziemVar2 = zziemVar;
                            th = null;
                        case 49:
                            zziemVar = zziemVar2;
                            iArr = iArr2;
                            zz0Var.F0(omf.a(obj, j & 1048575), C(v), zziewVar);
                            iArr2 = iArr;
                            zziemVar2 = zziemVar;
                            th = null;
                        case 50:
                            zziemVar = zziemVar2;
                            iArr = iArr2;
                            Object D = D(v);
                            long j2 = j(v) & 1048575;
                            Object e = rqo.e(obj, j2);
                            if (e == null) {
                                e = zzigq.b.g();
                                rqo.f(j2, obj, e);
                            } else if (!((zzigq) e).a) {
                                Object g = zzigq.b.g();
                                wje.k(g, e);
                                rqo.f(j2, obj, g);
                                e = g;
                            }
                            zz0Var.k1((zzigq) e, ((zzigp) D).a, zziewVar);
                            iArr2 = iArr;
                            zziemVar2 = zziemVar;
                            th = null;
                        case 51:
                            zziemVar = zziemVar2;
                            iArr = iArr2;
                            zz0Var.o1(1);
                            rqo.f(j & 1048575, obj, Double.valueOf(zziemVar.m()));
                            u(H1, v, obj);
                            iArr2 = iArr;
                            zziemVar2 = zziemVar;
                            th = null;
                        case 52:
                            zziemVar = zziemVar2;
                            iArr = iArr2;
                            zz0Var.o1(5);
                            rqo.f(j & 1048575, obj, Float.valueOf(zziemVar.n()));
                            u(H1, v, obj);
                            iArr2 = iArr;
                            zziemVar2 = zziemVar;
                            th = null;
                        case 53:
                            zziemVar = zziemVar2;
                            iArr = iArr2;
                            zz0Var.o1(0);
                            rqo.f(j & 1048575, obj, Long.valueOf(zziemVar.p()));
                            u(H1, v, obj);
                            iArr2 = iArr;
                            zziemVar2 = zziemVar;
                            th = null;
                        case 54:
                            zziemVar = zziemVar2;
                            iArr = iArr2;
                            zz0Var.o1(0);
                            rqo.f(j & 1048575, obj, Long.valueOf(zziemVar.o()));
                            u(H1, v, obj);
                            iArr2 = iArr;
                            zziemVar2 = zziemVar;
                            th = null;
                        case 55:
                            zziemVar = zziemVar2;
                            iArr = iArr2;
                            zz0Var.o1(0);
                            rqo.f(j & 1048575, obj, Integer.valueOf(zziemVar.q()));
                            u(H1, v, obj);
                            iArr2 = iArr;
                            zziemVar2 = zziemVar;
                            th = null;
                        case 56:
                            zziemVar = zziemVar2;
                            iArr = iArr2;
                            zz0Var.o1(1);
                            rqo.f(j & 1048575, obj, Long.valueOf(zziemVar.r()));
                            u(H1, v, obj);
                            iArr2 = iArr;
                            zziemVar2 = zziemVar;
                            th = null;
                        case 57:
                            zziemVar = zziemVar2;
                            iArr = iArr2;
                            zz0Var.o1(5);
                            rqo.f(j & 1048575, obj, Integer.valueOf(zziemVar.s()));
                            u(H1, v, obj);
                            iArr2 = iArr;
                            zziemVar2 = zziemVar;
                            th = null;
                        case 58:
                            zziemVar = zziemVar2;
                            iArr = iArr2;
                            zz0Var.o1(0);
                            rqo.f(j & 1048575, obj, Boolean.valueOf(zziemVar.t()));
                            u(H1, v, obj);
                            iArr2 = iArr;
                            zziemVar2 = zziemVar;
                            th = null;
                        case 59:
                            zziemVar = zziemVar2;
                            iArr = iArr2;
                            K(j, zz0Var, obj);
                            u(H1, v, obj);
                            iArr2 = iArr;
                            zziemVar2 = zziemVar;
                            th = null;
                        case 60:
                            zziemVar = zziemVar2;
                            iArr = iArr2;
                            zzigw zzigwVar3 = (zzigw) H(H1, v, obj);
                            nqo C3 = C(v);
                            zz0Var.o1(2);
                            zz0Var.t1(zzigwVar3, C3, zziewVar);
                            I(H1, obj, zzigwVar3, v);
                            iArr2 = iArr;
                            zziemVar2 = zziemVar;
                            th = null;
                        case 61:
                            zziemVar = zziemVar2;
                            iArr = iArr2;
                            rqo.f(j & 1048575, obj, zz0Var.J1());
                            u(H1, v, obj);
                            iArr2 = iArr;
                            zziemVar2 = zziemVar;
                            th = null;
                        case 62:
                            zziemVar = zziemVar2;
                            iArr = iArr2;
                            zz0Var.o1(0);
                            rqo.f(j & 1048575, obj, Integer.valueOf(zziemVar.x()));
                            u(H1, v, obj);
                            iArr2 = iArr;
                            zziemVar2 = zziemVar;
                            th = null;
                        case 63:
                            zziemVar = zziemVar2;
                            iArr = iArr2;
                            zz0Var.o1(0);
                            int y2 = zziemVar.y();
                            zzifs E2 = E(v);
                            if (E2 != null && !E2.a(y2)) {
                                obj2 = y.f(H1, obj, obj2, y2);
                                iArr2 = iArr;
                                zziemVar2 = zziemVar;
                                th = null;
                            }
                            rqo.f(j & 1048575, obj, Integer.valueOf(y2));
                            u(H1, v, obj);
                            iArr2 = iArr;
                            zziemVar2 = zziemVar;
                            th = null;
                            break;
                        case 64:
                            zziemVar = zziemVar2;
                            iArr = iArr2;
                            zz0Var.o1(5);
                            rqo.f(j & 1048575, obj, Integer.valueOf(zziemVar.z()));
                            u(H1, v, obj);
                            iArr2 = iArr;
                            zziemVar2 = zziemVar;
                            th = null;
                        case 65:
                            zziemVar = zziemVar2;
                            iArr = iArr2;
                            zz0Var.o1(1);
                            rqo.f(j & 1048575, obj, Long.valueOf(zziemVar.A()));
                            u(H1, v, obj);
                            iArr2 = iArr;
                            zziemVar2 = zziemVar;
                            th = null;
                        case 66:
                            zVar = zVar2;
                            int i3 = j & 1048575;
                            zz0Var.o1(0);
                            zziemVar = zziemVar2;
                            iArr = iArr2;
                            try {
                                rqo.f(i3, obj, Integer.valueOf(zziemVar2.B()));
                                u(H1, v, obj);
                            } catch (zzigd unused2) {
                                if (obj2 == null) {
                                    try {
                                        obj2 = z.b(obj);
                                    } catch (Throwable th2) {
                                        th = th2;
                                        while (i2 < i) {
                                            obj2 = J(iArr[i2], obj, obj2, obj);
                                            i2++;
                                        }
                                        if (obj2 != null) {
                                            ((zzifm) obj).zzt = (zziib) obj2;
                                        }
                                        throw th;
                                    }
                                }
                                zVar.getClass();
                                if (!z.a(0, zz0Var, obj2)) {
                                    while (i2 < i) {
                                        obj2 = J(iArr[i2], obj, obj2, obj);
                                        i2++;
                                    }
                                    if (obj2 == null) {
                                    }
                                }
                                iArr2 = iArr;
                                zziemVar2 = zziemVar;
                                th = null;
                            }
                            iArr2 = iArr;
                            zziemVar2 = zziemVar;
                            th = null;
                            break;
                        case 67:
                            int i4 = j & 1048575;
                            zz0Var.o1(0);
                            zVar = zVar2;
                            try {
                                rqo.f(i4, obj, Long.valueOf(zziemVar2.C()));
                                u(H1, v, obj);
                                zziemVar = zziemVar2;
                                iArr = iArr2;
                            } catch (zzigd unused3) {
                                zziemVar = zziemVar2;
                                iArr = iArr2;
                                if (obj2 == null) {
                                }
                                zVar.getClass();
                                if (!z.a(0, zz0Var, obj2)) {
                                }
                                iArr2 = iArr;
                                zziemVar2 = zziemVar;
                                th = null;
                            }
                            iArr2 = iArr;
                            zziemVar2 = zziemVar;
                            th = null;
                            break;
                        case 68:
                            zzigw zzigwVar4 = (zzigw) H(H1, v, obj);
                            nqo C4 = C(v);
                            zz0Var.o1(3);
                            zz0Var.y1(zzigwVar4, C4, zziewVar);
                            I(H1, obj, zzigwVar4, v);
                            zziemVar = zziemVar2;
                            iArr = iArr2;
                            iArr2 = iArr;
                            zziemVar2 = zziemVar;
                            th = null;
                        default:
                            if (obj2 == null) {
                                obj2 = z.b(obj);
                            }
                            zVar2.getClass();
                            if (!z.a(0, zz0Var, obj2)) {
                                while (i2 < i) {
                                    obj2 = J(iArr2[i2], obj, obj2, obj);
                                    i2++;
                                }
                                break;
                            }
                            th = null;
                    }
                } else if (H1 == Integer.MAX_VALUE) {
                    while (i2 < i) {
                        obj2 = J(iArr2[i2], obj, obj2, obj);
                        i2++;
                    }
                } else {
                    if ((!this.f ? th : (zzifk) zziewVar.a.get(new rpo(H1, this.e))) != null) {
                        throw th;
                    }
                    if (obj2 == null) {
                        obj2 = z.b(obj);
                    }
                    zVar2.getClass();
                    if (!z.a(0, zz0Var, obj2)) {
                        while (i2 < i) {
                            obj2 = J(iArr2[i2], obj, obj2, obj);
                            i2++;
                        }
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                iArr = iArr2;
            }
        }
        if (obj2 == null) {
            ((zzifm) obj).zzt = (zziib) obj2;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.nqo
    public final void f(Object obj, b1l b1lVar) {
        boolean z;
        int[] iArr;
        int i;
        boolean z2;
        int i2;
        int i3;
        v vVar = this;
        zzier zzierVar = (zzier) b1lVar.b;
        Map.Entry entry = null;
        if (vVar.f) {
            vpo vpoVar = ((zzifi) obj).zza;
            if (!vpoVar.a.isEmpty()) {
                entry = (Map.Entry) vpoVar.b().next();
            }
        }
        Map.Entry entry2 = entry;
        int i4 = 1048575;
        int i5 = 1048575;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            int[] iArr2 = vVar.a;
            if (i6 >= iArr2.length) {
                if (entry2 == null) {
                    ((zzifm) obj).zzt.b(b1lVar);
                    return;
                }
                vVar.l.getClass();
                entry2.getKey().getClass();
                pvd.j();
                return;
            }
            int j = vVar.j(i6);
            int k = k(j);
            int i8 = iArr2[i6];
            Unsafe unsafe = n;
            if (k <= 17) {
                int i9 = iArr2[i6 + 2];
                z = true;
                int i10 = i9 & i4;
                if (i10 != i5) {
                    i7 = i10 == i4 ? 0 : unsafe.getInt(obj, i10);
                    i5 = i10;
                }
                int i11 = 1 << (i9 >>> 20);
                iArr = iArr2;
                i = i11;
            } else {
                z = true;
                iArr = iArr2;
                i = 0;
            }
            if (entry2 != null) {
                throw fc6.d(entry2);
            }
            long j2 = j & i4;
            switch (k) {
                case 0:
                    if (vVar.q(i6, i5, i7, i, obj)) {
                        zzierVar.j(i8, Double.doubleToRawLongBits(rqo.c.z(obj, j2)));
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (vVar.q(i6, i5, i7, i, obj)) {
                        zzierVar.h(i8, Float.floatToRawIntBits(rqo.c.t(obj, j2)));
                    }
                    vVar = this;
                    break;
                case 2:
                    if (vVar.q(i6, i5, i7, i, obj)) {
                        zzierVar.i(i8, unsafe.getLong(obj, j2));
                    }
                    vVar = this;
                    break;
                case 3:
                    if (vVar.q(i6, i5, i7, i, obj)) {
                        zzierVar.i(i8, unsafe.getLong(obj, j2));
                    }
                    vVar = this;
                    break;
                case 4:
                    if (vVar.q(i6, i5, i7, i, obj)) {
                        zzierVar.f(i8, unsafe.getInt(obj, j2));
                    }
                    vVar = this;
                    break;
                case 5:
                    if (vVar.q(i6, i5, i7, i, obj)) {
                        zzierVar.j(i8, unsafe.getLong(obj, j2));
                    }
                    vVar = this;
                    break;
                case 6:
                    if (vVar.q(i6, i5, i7, i, obj)) {
                        zzierVar.h(i8, unsafe.getInt(obj, j2));
                    }
                    vVar = this;
                    break;
                case 7:
                    if (vVar.q(i6, i5, i7, i, obj)) {
                        zzierVar.k(i8, rqo.c.p(obj, j2));
                    }
                    vVar = this;
                    break;
                case 8:
                    if (vVar.q(i6, i5, i7, i, obj)) {
                        Object object = unsafe.getObject(obj, j2);
                        if (object instanceof String) {
                            zzierVar.l(i8, (String) object);
                        } else {
                            zzierVar.m(i8, (zziei) object);
                        }
                    }
                    vVar = this;
                    break;
                case 9:
                    if (vVar.q(i6, i5, i7, i, obj)) {
                        b1lVar.m(i8, unsafe.getObject(obj, j2), vVar.C(i6));
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (vVar.q(i6, i5, i7, i, obj)) {
                        zzierVar.m(i8, (zziei) unsafe.getObject(obj, j2));
                    }
                    vVar = this;
                    break;
                case 11:
                    if (vVar.q(i6, i5, i7, i, obj)) {
                        zzierVar.g(i8, unsafe.getInt(obj, j2));
                    }
                    vVar = this;
                    break;
                case 12:
                    if (vVar.q(i6, i5, i7, i, obj)) {
                        zzierVar.f(i8, unsafe.getInt(obj, j2));
                    }
                    vVar = this;
                    break;
                case 13:
                    if (vVar.q(i6, i5, i7, i, obj)) {
                        zzierVar.h(i8, unsafe.getInt(obj, j2));
                    }
                    vVar = this;
                    break;
                case 14:
                    if (vVar.q(i6, i5, i7, i, obj)) {
                        zzierVar.j(i8, unsafe.getLong(obj, j2));
                    }
                    vVar = this;
                    break;
                case 15:
                    if (vVar.q(i6, i5, i7, i, obj)) {
                        int i12 = unsafe.getInt(obj, j2);
                        zzierVar.g(i8, (i12 >> 31) ^ (i12 + i12));
                    }
                    vVar = this;
                    break;
                case 16:
                    if (vVar.q(i6, i5, i7, i, obj)) {
                        long j3 = unsafe.getLong(obj, j2);
                        zzierVar.i(i8, (j3 >> 63) ^ (j3 + j3));
                    }
                    vVar = this;
                    break;
                case 17:
                    if (vVar.q(i6, i5, i7, i, obj)) {
                        Object object2 = unsafe.getObject(obj, j2);
                        zzierVar.e(i8, 3);
                        vVar.C(i6).f((zzidr) object2, b1lVar);
                        zzierVar.e(i8, 4);
                        break;
                    } else {
                        break;
                    }
                case 18:
                    z2 = false;
                    i2 = i5;
                    y.g(iArr[i6], (List) unsafe.getObject(obj, j2), b1lVar, false);
                    i5 = i2;
                    break;
                case 19:
                    z2 = false;
                    i2 = i5;
                    y.h(iArr[i6], (List) unsafe.getObject(obj, j2), b1lVar, false);
                    i5 = i2;
                    break;
                case 20:
                    z2 = false;
                    i2 = i5;
                    y.i(iArr[i6], (List) unsafe.getObject(obj, j2), b1lVar, false);
                    i5 = i2;
                    break;
                case 21:
                    z2 = false;
                    i2 = i5;
                    y.j(iArr[i6], (List) unsafe.getObject(obj, j2), b1lVar, false);
                    i5 = i2;
                    break;
                case 22:
                    z2 = false;
                    i2 = i5;
                    y.n(iArr[i6], (List) unsafe.getObject(obj, j2), b1lVar, false);
                    i5 = i2;
                    break;
                case 23:
                    z2 = false;
                    i2 = i5;
                    y.l(iArr[i6], (List) unsafe.getObject(obj, j2), b1lVar, false);
                    i5 = i2;
                    break;
                case 24:
                    z2 = false;
                    i2 = i5;
                    y.q(iArr[i6], (List) unsafe.getObject(obj, j2), b1lVar, false);
                    i5 = i2;
                    break;
                case 25:
                    i2 = i5;
                    z2 = false;
                    y.t(iArr[i6], (List) unsafe.getObject(obj, j2), b1lVar, false);
                    i5 = i2;
                    break;
                case 26:
                    i3 = i5;
                    int i13 = iArr[i6];
                    List list = (List) unsafe.getObject(obj, j2);
                    z zVar = y.a;
                    if (list != null && !list.isEmpty()) {
                        if (list instanceof zzigh) {
                            zzigh zzighVar = (zzigh) list;
                            for (int i14 = 0; i14 < list.size(); i14++) {
                                Object zzc = zzighVar.zzc();
                                if (zzc instanceof String) {
                                    zzierVar.l(i13, (String) zzc);
                                } else {
                                    zzierVar.m(i13, (zziei) zzc);
                                }
                            }
                        } else {
                            for (int i15 = 0; i15 < list.size(); i15++) {
                                zzierVar.l(i13, (String) list.get(i15));
                            }
                        }
                    }
                    i5 = i3;
                    break;
                case 27:
                    i3 = i5;
                    int i16 = iArr[i6];
                    List list2 = (List) unsafe.getObject(obj, j2);
                    nqo C = vVar.C(i6);
                    z zVar2 = y.a;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i17 = 0; i17 < list2.size(); i17++) {
                            b1lVar.m(i16, list2.get(i17), C);
                        }
                    }
                    i5 = i3;
                    break;
                case 28:
                    i3 = i5;
                    int i18 = iArr[i6];
                    List list3 = (List) unsafe.getObject(obj, j2);
                    z zVar3 = y.a;
                    if (list3 != null && !list3.isEmpty()) {
                        for (int i19 = 0; i19 < list3.size(); i19++) {
                            zzierVar.m(i18, (zziei) list3.get(i19));
                        }
                    }
                    i5 = i3;
                    break;
                case 29:
                    z2 = false;
                    i2 = i5;
                    y.o(iArr[i6], (List) unsafe.getObject(obj, j2), b1lVar, false);
                    i5 = i2;
                    break;
                case 30:
                    z2 = false;
                    i2 = i5;
                    y.s(iArr[i6], (List) unsafe.getObject(obj, j2), b1lVar, false);
                    i5 = i2;
                    break;
                case 31:
                    z2 = false;
                    i2 = i5;
                    y.r(iArr[i6], (List) unsafe.getObject(obj, j2), b1lVar, false);
                    i5 = i2;
                    break;
                case 32:
                    z2 = false;
                    i2 = i5;
                    y.m(iArr[i6], (List) unsafe.getObject(obj, j2), b1lVar, false);
                    i5 = i2;
                    break;
                case 33:
                    z2 = false;
                    i2 = i5;
                    y.p(iArr[i6], (List) unsafe.getObject(obj, j2), b1lVar, false);
                    i5 = i2;
                    break;
                case 34:
                    i2 = i5;
                    z2 = false;
                    y.k(iArr[i6], (List) unsafe.getObject(obj, j2), b1lVar, false);
                    i5 = i2;
                    break;
                case 35:
                    i3 = i5;
                    y.g(iArr[i6], (List) unsafe.getObject(obj, j2), b1lVar, z);
                    i5 = i3;
                    break;
                case 36:
                    i3 = i5;
                    y.h(iArr[i6], (List) unsafe.getObject(obj, j2), b1lVar, z);
                    i5 = i3;
                    break;
                case 37:
                    i3 = i5;
                    y.i(iArr[i6], (List) unsafe.getObject(obj, j2), b1lVar, z);
                    i5 = i3;
                    break;
                case 38:
                    i3 = i5;
                    y.j(iArr[i6], (List) unsafe.getObject(obj, j2), b1lVar, z);
                    i5 = i3;
                    break;
                case 39:
                    i3 = i5;
                    y.n(iArr[i6], (List) unsafe.getObject(obj, j2), b1lVar, z);
                    i5 = i3;
                    break;
                case 40:
                    i3 = i5;
                    y.l(iArr[i6], (List) unsafe.getObject(obj, j2), b1lVar, z);
                    i5 = i3;
                    break;
                case 41:
                    i3 = i5;
                    y.q(iArr[i6], (List) unsafe.getObject(obj, j2), b1lVar, z);
                    i5 = i3;
                    break;
                case 42:
                    i3 = i5;
                    y.t(iArr[i6], (List) unsafe.getObject(obj, j2), b1lVar, z);
                    i5 = i3;
                    break;
                case 43:
                    i3 = i5;
                    y.o(iArr[i6], (List) unsafe.getObject(obj, j2), b1lVar, z);
                    i5 = i3;
                    break;
                case 44:
                    i3 = i5;
                    y.s(iArr[i6], (List) unsafe.getObject(obj, j2), b1lVar, z);
                    i5 = i3;
                    break;
                case 45:
                    i3 = i5;
                    y.r(iArr[i6], (List) unsafe.getObject(obj, j2), b1lVar, z);
                    i5 = i3;
                    break;
                case 46:
                    i3 = i5;
                    y.m(iArr[i6], (List) unsafe.getObject(obj, j2), b1lVar, z);
                    i5 = i3;
                    break;
                case 47:
                    i3 = i5;
                    y.p(iArr[i6], (List) unsafe.getObject(obj, j2), b1lVar, z);
                    i5 = i3;
                    break;
                case 48:
                    i3 = i5;
                    y.k(iArr[i6], (List) unsafe.getObject(obj, j2), b1lVar, true);
                    i5 = i3;
                    break;
                case 49:
                    i3 = i5;
                    int i20 = iArr[i6];
                    List list4 = (List) unsafe.getObject(obj, j2);
                    nqo C2 = vVar.C(i6);
                    z zVar4 = y.a;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i21 = 0; i21 < list4.size(); i21++) {
                            zzidr zzidrVar = (zzidr) list4.get(i21);
                            zzierVar.e(i20, 3);
                            C2.f(zzidrVar, b1lVar);
                            zzierVar.e(i20, 4);
                        }
                    }
                    i5 = i3;
                    break;
                case 50:
                    Object object3 = unsafe.getObject(obj, j2);
                    if (object3 != null) {
                        h5o h5oVar = ((zzigp) vVar.D(i6)).a;
                        zziin zziinVar = (zziin) h5oVar.b;
                        zziin zziinVar2 = (zziin) h5oVar.a;
                        for (Map.Entry entry3 : ((zzigq) object3).entrySet()) {
                            zzierVar.e(i8, 2);
                            int i22 = i5;
                            boolean z3 = z;
                            zzierVar.u(vpo.f(zziinVar, 2, entry3.getValue()) + vpo.f(zziinVar2, z3 ? 1 : 0, entry3.getKey()));
                            Object key = entry3.getKey();
                            Object value = entry3.getValue();
                            vpo.e(zzierVar, zziinVar2, z3 ? 1 : 0, key);
                            vpo.e(zzierVar, zziinVar, 2, value);
                            i5 = i22;
                            z = true;
                        }
                    }
                    break;
                case 51:
                    if (vVar.t(i8, i6, obj)) {
                        zzierVar.j(i8, Double.doubleToRawLongBits(((Double) rqo.e(obj, j2)).doubleValue()));
                    }
                    break;
                case 52:
                    if (vVar.t(i8, i6, obj)) {
                        zzierVar.h(i8, Float.floatToRawIntBits(((Float) rqo.e(obj, j2)).floatValue()));
                    }
                    break;
                case 53:
                    if (vVar.t(i8, i6, obj)) {
                        zzierVar.i(i8, o(obj, j2));
                    }
                    break;
                case 54:
                    if (vVar.t(i8, i6, obj)) {
                        zzierVar.i(i8, o(obj, j2));
                    }
                    break;
                case 55:
                    if (vVar.t(i8, i6, obj)) {
                        zzierVar.f(i8, n(obj, j2));
                    }
                    break;
                case 56:
                    if (vVar.t(i8, i6, obj)) {
                        zzierVar.j(i8, o(obj, j2));
                    }
                    break;
                case 57:
                    if (vVar.t(i8, i6, obj)) {
                        zzierVar.h(i8, n(obj, j2));
                    }
                    break;
                case 58:
                    if (vVar.t(i8, i6, obj)) {
                        zzierVar.k(i8, ((Boolean) rqo.e(obj, j2)).booleanValue());
                    }
                    break;
                case 59:
                    if (vVar.t(i8, i6, obj)) {
                        Object object4 = unsafe.getObject(obj, j2);
                        if (object4 instanceof String) {
                            zzierVar.l(i8, (String) object4);
                        } else {
                            zzierVar.m(i8, (zziei) object4);
                        }
                    }
                    break;
                case 60:
                    if (vVar.t(i8, i6, obj)) {
                        b1lVar.m(i8, unsafe.getObject(obj, j2), vVar.C(i6));
                    }
                    break;
                case 61:
                    if (vVar.t(i8, i6, obj)) {
                        zzierVar.m(i8, (zziei) unsafe.getObject(obj, j2));
                    }
                    break;
                case 62:
                    if (vVar.t(i8, i6, obj)) {
                        zzierVar.g(i8, n(obj, j2));
                    }
                    break;
                case 63:
                    if (vVar.t(i8, i6, obj)) {
                        zzierVar.f(i8, n(obj, j2));
                    }
                    break;
                case 64:
                    if (vVar.t(i8, i6, obj)) {
                        zzierVar.h(i8, n(obj, j2));
                    }
                    break;
                case 65:
                    if (vVar.t(i8, i6, obj)) {
                        zzierVar.j(i8, o(obj, j2));
                    }
                    break;
                case 66:
                    if (vVar.t(i8, i6, obj)) {
                        int n2 = n(obj, j2);
                        zzierVar.g(i8, (n2 >> 31) ^ (n2 + n2));
                    }
                    break;
                case 67:
                    if (vVar.t(i8, i6, obj)) {
                        long o = o(obj, j2);
                        zzierVar.i(i8, (o >> 63) ^ (o + o));
                    }
                    break;
                case 68:
                    if (vVar.t(i8, i6, obj)) {
                        Object object5 = unsafe.getObject(obj, j2);
                        zzierVar.e(i8, 3);
                        vVar.C(i6).f((zzidr) object5, b1lVar);
                        zzierVar.e(i8, 4);
                    }
                    break;
            }
            i6 += 3;
            i4 = 1048575;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:153:0x01d1, code lost:
    
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0218 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01d1 A[SYNTHETIC] */
    @Override // defpackage.nqo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean g(zzifm zzifmVar, zzifm zzifmVar2) {
        boolean c;
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
                            if (!p(zzifmVar, zzifmVar2, i)) {
                                break;
                            } else {
                                sck sckVar = rqo.c;
                                if (Double.doubleToLongBits(sckVar.z(zzifmVar, j2)) != Double.doubleToLongBits(sckVar.z(zzifmVar2, j2))) {
                                    break;
                                } else {
                                    break;
                                }
                            }
                        case 1:
                            if (!p(zzifmVar, zzifmVar2, i)) {
                                break;
                            } else {
                                sck sckVar2 = rqo.c;
                                if (Float.floatToIntBits(sckVar2.t(zzifmVar, j2)) != Float.floatToIntBits(sckVar2.t(zzifmVar2, j2))) {
                                    break;
                                } else {
                                    break;
                                }
                            }
                        case 2:
                            if (p(zzifmVar, zzifmVar2, i) && rqo.c(zzifmVar, j2) == rqo.c(zzifmVar2, j2)) {
                                break;
                            }
                            break;
                        case 3:
                            if (p(zzifmVar, zzifmVar2, i) && rqo.c(zzifmVar, j2) == rqo.c(zzifmVar2, j2)) {
                                break;
                            }
                            break;
                        case 4:
                            if (p(zzifmVar, zzifmVar2, i) && rqo.a(zzifmVar, j2) == rqo.a(zzifmVar2, j2)) {
                                break;
                            }
                            break;
                        case 5:
                            if (p(zzifmVar, zzifmVar2, i) && rqo.c(zzifmVar, j2) == rqo.c(zzifmVar2, j2)) {
                                break;
                            }
                            break;
                        case 6:
                            if (p(zzifmVar, zzifmVar2, i) && rqo.a(zzifmVar, j2) == rqo.a(zzifmVar2, j2)) {
                                break;
                            }
                            break;
                        case 7:
                            if (!p(zzifmVar, zzifmVar2, i)) {
                                break;
                            } else {
                                sck sckVar3 = rqo.c;
                                if (sckVar3.p(zzifmVar, j2) != sckVar3.p(zzifmVar2, j2)) {
                                    break;
                                } else {
                                    break;
                                }
                            }
                        case 8:
                            if (p(zzifmVar, zzifmVar2, i) && y.c(rqo.e(zzifmVar, j2), rqo.e(zzifmVar2, j2))) {
                                break;
                            }
                            break;
                        case 9:
                            if (p(zzifmVar, zzifmVar2, i) && y.c(rqo.e(zzifmVar, j2), rqo.e(zzifmVar2, j2))) {
                                break;
                            }
                            break;
                        case 10:
                            if (p(zzifmVar, zzifmVar2, i) && y.c(rqo.e(zzifmVar, j2), rqo.e(zzifmVar2, j2))) {
                                break;
                            }
                            break;
                        case 11:
                            if (p(zzifmVar, zzifmVar2, i) && rqo.a(zzifmVar, j2) == rqo.a(zzifmVar2, j2)) {
                                break;
                            }
                            break;
                        case 12:
                            if (p(zzifmVar, zzifmVar2, i) && rqo.a(zzifmVar, j2) == rqo.a(zzifmVar2, j2)) {
                                break;
                            }
                            break;
                        case 13:
                            if (p(zzifmVar, zzifmVar2, i) && rqo.a(zzifmVar, j2) == rqo.a(zzifmVar2, j2)) {
                                break;
                            }
                            break;
                        case 14:
                            if (p(zzifmVar, zzifmVar2, i) && rqo.c(zzifmVar, j2) == rqo.c(zzifmVar2, j2)) {
                                break;
                            }
                            break;
                        case 15:
                            if (p(zzifmVar, zzifmVar2, i) && rqo.a(zzifmVar, j2) == rqo.a(zzifmVar2, j2)) {
                                break;
                            }
                            break;
                        case 16:
                            if (p(zzifmVar, zzifmVar2, i) && rqo.c(zzifmVar, j2) == rqo.c(zzifmVar2, j2)) {
                                break;
                            }
                            break;
                        case 17:
                            if (p(zzifmVar, zzifmVar2, i) && y.c(rqo.e(zzifmVar, j2), rqo.e(zzifmVar2, j2))) {
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
                            c = y.c(rqo.e(zzifmVar, j2), rqo.e(zzifmVar2, j2));
                            if (!c) {
                                break;
                            } else {
                                break;
                            }
                        case 50:
                            c = y.c(rqo.e(zzifmVar, j2), rqo.e(zzifmVar2, j2));
                            if (!c) {
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
                            if (rqo.a(zzifmVar, j3) == rqo.a(zzifmVar2, j3) && y.c(rqo.e(zzifmVar, j2), rqo.e(zzifmVar2, j2))) {
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
                        if (rqo.a(zzifmVar, j4) != rqo.a(zzifmVar2, j4)) {
                            return false;
                        }
                        if (!t(0, i3, zzifmVar)) {
                            long j5 = j(i3) & 1048575;
                            if (!y.c(rqo.e(zzifmVar, j5), rqo.e(zzifmVar2, j5))) {
                            }
                        }
                        i2++;
                    } else if (zzifmVar.zzt.equals(zzifmVar2.zzt)) {
                        if (this.f) {
                            return ((zzifi) zzifmVar).zza.equals(((zzifi) zzifmVar2).zza);
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.nqo
    public final int h(zzifm zzifmVar) {
        int i;
        int b;
        int c;
        int i2;
        int k;
        int b2;
        int b3;
        int size;
        int v;
        int b4;
        int b5;
        int b6;
        int i3;
        int b7;
        int c2;
        v vVar = this;
        zzifm zzifmVar2 = zzifmVar;
        int i4 = 1048575;
        int i5 = 1048575;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (true) {
            int[] iArr = vVar.a;
            if (i6 >= iArr.length) {
                int c3 = zzifmVar2.zzt.c() + i8;
                if (!vVar.f) {
                    return c3;
                }
                oqo oqoVar = ((zzifi) zzifmVar2).zza.a;
                int i9 = oqoVar.b;
                int i10 = 0;
                for (int i11 = 0; i11 < i9; i11++) {
                    pqo a = oqoVar.a(i11);
                    i10 = vpo.h(a.a, a.b) + i10;
                }
                for (Map.Entry entry : oqoVar.c()) {
                    i10 = vpo.h((zzifa) entry.getKey(), entry.getValue()) + i10;
                }
                return c3 + i10;
            }
            int j = vVar.j(i6);
            int k2 = k(j);
            int i12 = iArr[i6];
            int i13 = iArr[i6 + 2];
            int i14 = i13 & i4;
            Unsafe unsafe = n;
            if (k2 <= 17) {
                if (i14 != i5) {
                    i7 = i14 == i4 ? 0 : unsafe.getInt(zzifmVar2, i14);
                    i5 = i14;
                }
                i = 1 << (i13 >>> 20);
            } else {
                i = 0;
            }
            int i15 = j & i4;
            if (k2 >= zzifc.b.a) {
                int i16 = zzifc.c.a;
            }
            long j2 = i15;
            switch (k2) {
                case 0:
                    if (vVar.q(i6, i5, i7, i, zzifmVar2)) {
                        i8 = ceo.b(i12 << 3, 8, i8);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (vVar.q(i6, i5, i7, i, zzifmVar2)) {
                        i8 = ceo.b(i12 << 3, 4, i8);
                    }
                    vVar = this;
                    zzifmVar2 = zzifmVar;
                    break;
                case 2:
                    if (vVar.q(i6, i5, i7, i, zzifmVar2)) {
                        long j3 = unsafe.getLong(zzifmVar2, j2);
                        b = zzier.b(i12 << 3);
                        c = zzier.c(j3);
                        i8 += c + b;
                    }
                    vVar = this;
                    break;
                case 3:
                    if (vVar.q(i6, i5, i7, i, zzifmVar2)) {
                        long j4 = unsafe.getLong(zzifmVar2, j2);
                        b = zzier.b(i12 << 3);
                        c = zzier.c(j4);
                        i8 += c + b;
                    }
                    vVar = this;
                    break;
                case 4:
                    if (vVar.q(i6, i5, i7, i, zzifmVar2)) {
                        long j5 = unsafe.getInt(zzifmVar2, j2);
                        b = zzier.b(i12 << 3);
                        c = zzier.c(j5);
                        i8 += c + b;
                    }
                    vVar = this;
                    break;
                case 5:
                    if (vVar.q(i6, i5, i7, i, zzifmVar2)) {
                        i8 = ceo.b(i12 << 3, 8, i8);
                    }
                    vVar = this;
                    zzifmVar2 = zzifmVar;
                    break;
                case 6:
                    if (vVar.q(i6, i5, i7, i, zzifmVar2)) {
                        i8 = ceo.b(i12 << 3, 4, i8);
                    }
                    vVar = this;
                    zzifmVar2 = zzifmVar;
                    break;
                case 7:
                    if (vVar.q(i6, i5, i7, i, zzifmVar2)) {
                        i8 = ceo.b(i12 << 3, 1, i8);
                    }
                    vVar = this;
                    zzifmVar2 = zzifmVar;
                    break;
                case 8:
                    if (vVar.q(i6, i5, i7, i, zzifmVar2)) {
                        int i17 = i12 << 3;
                        Object object = unsafe.getObject(zzifmVar2, j2);
                        if (object instanceof zziei) {
                            int b8 = zzier.b(i17);
                            int o = ((zziei) object).o();
                            i8 = ceo.i(o, o, b8, i8);
                        } else {
                            int b9 = zzier.b(i17);
                            int i18 = tqo.a;
                            int F = g7a.F((String) object);
                            i8 = ceo.i(F, F, b9, i8);
                        }
                    }
                    vVar = this;
                    break;
                case 9:
                    if (vVar.q(i6, i5, i7, i, zzifmVar2)) {
                        Object object2 = unsafe.getObject(zzifmVar2, j2);
                        nqo C = vVar.C(i6);
                        z zVar = y.a;
                        int b10 = zzier.b(i12 << 3);
                        int k3 = ((zzidr) object2).k(C);
                        i8 = ceo.i(k3, k3, b10, i8);
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (vVar.q(i6, i5, i7, i, zzifmVar2)) {
                        zziei zzieiVar = (zziei) unsafe.getObject(zzifmVar2, j2);
                        int b11 = zzier.b(i12 << 3);
                        int o2 = zzieiVar.o();
                        i8 = ceo.i(o2, o2, b11, i8);
                    }
                    vVar = this;
                    break;
                case 11:
                    if (vVar.q(i6, i5, i7, i, zzifmVar2)) {
                        i8 = ceo.b(unsafe.getInt(zzifmVar2, j2), zzier.b(i12 << 3), i8);
                    }
                    vVar = this;
                    break;
                case 12:
                    if (vVar.q(i6, i5, i7, i, zzifmVar2)) {
                        long j6 = unsafe.getInt(zzifmVar2, j2);
                        b = zzier.b(i12 << 3);
                        c = zzier.c(j6);
                        i8 += c + b;
                    }
                    vVar = this;
                    break;
                case 13:
                    if (vVar.q(i6, i5, i7, i, zzifmVar2)) {
                        i8 = ceo.b(i12 << 3, 4, i8);
                    }
                    vVar = this;
                    zzifmVar2 = zzifmVar;
                    break;
                case 14:
                    if (vVar.q(i6, i5, i7, i, zzifmVar2)) {
                        i8 = ceo.b(i12 << 3, 8, i8);
                    }
                    vVar = this;
                    zzifmVar2 = zzifmVar;
                    break;
                case 15:
                    if (vVar.q(i6, i5, i7, i, zzifmVar2)) {
                        int i19 = unsafe.getInt(zzifmVar2, j2);
                        i8 = ceo.b((i19 >> 31) ^ (i19 + i19), zzier.b(i12 << 3), i8);
                    }
                    vVar = this;
                    break;
                case 16:
                    if (vVar.q(i6, i5, i7, i, zzifmVar2)) {
                        long j7 = unsafe.getLong(zzifmVar2, j2);
                        b = zzier.b(i12 << 3);
                        c = zzier.c((j7 >> 63) ^ (j7 + j7));
                        i8 += c + b;
                    }
                    vVar = this;
                    break;
                case 17:
                    if (vVar.q(i6, i5, i7, i, zzifmVar2)) {
                        zzigw zzigwVar = (zzigw) unsafe.getObject(zzifmVar2, j2);
                        nqo C2 = vVar.C(i6);
                        z zVar2 = y.a;
                        int b12 = zzier.b(i12 << 3);
                        i2 = b12 + b12;
                        k = ((zzidr) zzigwVar).k(C2);
                        b2 = k + i2;
                        i8 += b2;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    b2 = y.b(i12, (List) unsafe.getObject(zzifmVar2, j2));
                    i8 += b2;
                    break;
                case 19:
                    b2 = y.a(i12, (List) unsafe.getObject(zzifmVar2, j2));
                    i8 += b2;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(zzifmVar2, j2);
                    z zVar3 = y.a;
                    if (list.size() != 0) {
                        b3 = (zzier.b(i12 << 3) * list.size()) + y.u(list);
                        i8 += b3;
                        break;
                    }
                    b3 = 0;
                    i8 += b3;
                case 21:
                    List list2 = (List) unsafe.getObject(zzifmVar2, j2);
                    z zVar4 = y.a;
                    size = list2.size();
                    if (size != 0) {
                        v = y.v(list2);
                        b4 = zzier.b(i12 << 3);
                        b5 = (b4 * size) + v;
                        i8 += b5;
                        break;
                    }
                    b5 = 0;
                    i8 += b5;
                case 22:
                    List list3 = (List) unsafe.getObject(zzifmVar2, j2);
                    z zVar5 = y.a;
                    size = list3.size();
                    if (size != 0) {
                        v = y.y(list3);
                        b4 = zzier.b(i12 << 3);
                        b5 = (b4 * size) + v;
                        i8 += b5;
                        break;
                    }
                    b5 = 0;
                    i8 += b5;
                case 23:
                    b2 = y.b(i12, (List) unsafe.getObject(zzifmVar2, j2));
                    i8 += b2;
                    break;
                case 24:
                    b2 = y.a(i12, (List) unsafe.getObject(zzifmVar2, j2));
                    i8 += b2;
                    break;
                case 25:
                    List list4 = (List) unsafe.getObject(zzifmVar2, j2);
                    z zVar6 = y.a;
                    int size2 = list4.size();
                    if (size2 != 0) {
                        b3 = (zzier.b(i12 << 3) + 1) * size2;
                        i8 += b3;
                        break;
                    }
                    b3 = 0;
                    i8 += b3;
                case 26:
                    List list5 = (List) unsafe.getObject(zzifmVar2, j2);
                    z zVar7 = y.a;
                    int size3 = list5.size();
                    if (size3 != 0) {
                        b5 = zzier.b(i12 << 3) * size3;
                        if (list5 instanceof zzigh) {
                            zzigh zzighVar = (zzigh) list5;
                            for (int i20 = 0; i20 < size3; i20++) {
                                Object zzc = zzighVar.zzc();
                                if (zzc instanceof zziei) {
                                    int o3 = ((zziei) zzc).o();
                                    b5 = ceo.b(o3, o3, b5);
                                } else {
                                    int i21 = tqo.a;
                                    int F2 = g7a.F((String) zzc);
                                    b5 = ceo.b(F2, F2, b5);
                                }
                            }
                        } else {
                            for (int i22 = 0; i22 < size3; i22++) {
                                Object obj = list5.get(i22);
                                if (obj instanceof zziei) {
                                    int o4 = ((zziei) obj).o();
                                    b5 = ceo.b(o4, o4, b5);
                                } else {
                                    int i23 = tqo.a;
                                    int F3 = g7a.F((String) obj);
                                    b5 = ceo.b(F3, F3, b5);
                                }
                            }
                        }
                        i8 += b5;
                        break;
                    }
                    b5 = 0;
                    i8 += b5;
                case 27:
                    List list6 = (List) unsafe.getObject(zzifmVar2, j2);
                    nqo C3 = vVar.C(i6);
                    z zVar8 = y.a;
                    int size4 = list6.size();
                    if (size4 == 0) {
                        b6 = 0;
                    } else {
                        b6 = zzier.b(i12 << 3) * size4;
                        for (int i24 = 0; i24 < size4; i24++) {
                            int k4 = ((zzidr) list6.get(i24)).k(C3);
                            b6 = ceo.b(k4, k4, b6);
                        }
                    }
                    i8 += b6;
                    break;
                case 28:
                    List list7 = (List) unsafe.getObject(zzifmVar2, j2);
                    z zVar9 = y.a;
                    int size5 = list7.size();
                    if (size5 != 0) {
                        b5 = zzier.b(i12 << 3) * size5;
                        for (int i25 = 0; i25 < list7.size(); i25++) {
                            int o5 = ((zziei) list7.get(i25)).o();
                            b5 = ceo.b(o5, o5, b5);
                        }
                        i8 += b5;
                        break;
                    }
                    b5 = 0;
                    i8 += b5;
                case 29:
                    List list8 = (List) unsafe.getObject(zzifmVar2, j2);
                    z zVar10 = y.a;
                    size = list8.size();
                    if (size != 0) {
                        v = y.z(list8);
                        b4 = zzier.b(i12 << 3);
                        b5 = (b4 * size) + v;
                        i8 += b5;
                        break;
                    }
                    b5 = 0;
                    i8 += b5;
                case 30:
                    List list9 = (List) unsafe.getObject(zzifmVar2, j2);
                    z zVar11 = y.a;
                    size = list9.size();
                    if (size != 0) {
                        v = y.x(list9);
                        b4 = zzier.b(i12 << 3);
                        b5 = (b4 * size) + v;
                        i8 += b5;
                        break;
                    }
                    b5 = 0;
                    i8 += b5;
                case 31:
                    b2 = y.a(i12, (List) unsafe.getObject(zzifmVar2, j2));
                    i8 += b2;
                    break;
                case 32:
                    b2 = y.b(i12, (List) unsafe.getObject(zzifmVar2, j2));
                    i8 += b2;
                    break;
                case 33:
                    List list10 = (List) unsafe.getObject(zzifmVar2, j2);
                    z zVar12 = y.a;
                    size = list10.size();
                    if (size != 0) {
                        v = y.A(list10);
                        b4 = zzier.b(i12 << 3);
                        b5 = (b4 * size) + v;
                        i8 += b5;
                        break;
                    }
                    b5 = 0;
                    i8 += b5;
                case 34:
                    List list11 = (List) unsafe.getObject(zzifmVar2, j2);
                    z zVar13 = y.a;
                    size = list11.size();
                    if (size != 0) {
                        v = y.w(list11);
                        b4 = zzier.b(i12 << 3);
                        b5 = (b4 * size) + v;
                        i8 += b5;
                        break;
                    }
                    b5 = 0;
                    i8 += b5;
                case 35:
                    List list12 = (List) unsafe.getObject(zzifmVar2, j2);
                    z zVar14 = y.a;
                    int size6 = list12.size() * 8;
                    if (size6 > 0) {
                        i8 = ceo.i(size6, zzier.b(i12 << 3), size6, i8);
                        break;
                    } else {
                        break;
                    }
                case 36:
                    List list13 = (List) unsafe.getObject(zzifmVar2, j2);
                    z zVar15 = y.a;
                    int size7 = list13.size() * 4;
                    if (size7 > 0) {
                        i8 = ceo.i(size7, zzier.b(i12 << 3), size7, i8);
                        break;
                    } else {
                        break;
                    }
                case 37:
                    int u = y.u((List) unsafe.getObject(zzifmVar2, j2));
                    if (u > 0) {
                        i8 = ceo.i(u, zzier.b(i12 << 3), u, i8);
                        break;
                    } else {
                        break;
                    }
                case 38:
                    int v2 = y.v((List) unsafe.getObject(zzifmVar2, j2));
                    if (v2 > 0) {
                        i8 = ceo.i(v2, zzier.b(i12 << 3), v2, i8);
                        break;
                    } else {
                        break;
                    }
                case 39:
                    int y = y.y((List) unsafe.getObject(zzifmVar2, j2));
                    if (y > 0) {
                        i8 = ceo.i(y, zzier.b(i12 << 3), y, i8);
                        break;
                    } else {
                        break;
                    }
                case 40:
                    List list14 = (List) unsafe.getObject(zzifmVar2, j2);
                    z zVar16 = y.a;
                    int size8 = list14.size() * 8;
                    if (size8 > 0) {
                        i8 = ceo.i(size8, zzier.b(i12 << 3), size8, i8);
                        break;
                    } else {
                        break;
                    }
                case 41:
                    List list15 = (List) unsafe.getObject(zzifmVar2, j2);
                    z zVar17 = y.a;
                    int size9 = list15.size() * 4;
                    if (size9 > 0) {
                        i8 = ceo.i(size9, zzier.b(i12 << 3), size9, i8);
                        break;
                    } else {
                        break;
                    }
                case 42:
                    List list16 = (List) unsafe.getObject(zzifmVar2, j2);
                    z zVar18 = y.a;
                    int size10 = list16.size();
                    if (size10 > 0) {
                        i8 = ceo.i(size10, zzier.b(i12 << 3), size10, i8);
                        break;
                    } else {
                        break;
                    }
                case 43:
                    int z = y.z((List) unsafe.getObject(zzifmVar2, j2));
                    if (z > 0) {
                        i8 = ceo.i(z, zzier.b(i12 << 3), z, i8);
                        break;
                    } else {
                        break;
                    }
                case 44:
                    int x = y.x((List) unsafe.getObject(zzifmVar2, j2));
                    if (x > 0) {
                        i8 = ceo.i(x, zzier.b(i12 << 3), x, i8);
                        break;
                    } else {
                        break;
                    }
                case 45:
                    List list17 = (List) unsafe.getObject(zzifmVar2, j2);
                    z zVar19 = y.a;
                    int size11 = list17.size() * 4;
                    if (size11 > 0) {
                        i8 = ceo.i(size11, zzier.b(i12 << 3), size11, i8);
                        break;
                    } else {
                        break;
                    }
                case 46:
                    List list18 = (List) unsafe.getObject(zzifmVar2, j2);
                    z zVar20 = y.a;
                    int size12 = list18.size() * 8;
                    if (size12 > 0) {
                        i8 = ceo.i(size12, zzier.b(i12 << 3), size12, i8);
                        break;
                    } else {
                        break;
                    }
                case 47:
                    int A = y.A((List) unsafe.getObject(zzifmVar2, j2));
                    if (A > 0) {
                        i8 = ceo.i(A, zzier.b(i12 << 3), A, i8);
                        break;
                    } else {
                        break;
                    }
                case 48:
                    int w = y.w((List) unsafe.getObject(zzifmVar2, j2));
                    if (w > 0) {
                        i8 = ceo.i(w, zzier.b(i12 << 3), w, i8);
                        break;
                    } else {
                        break;
                    }
                case 49:
                    List list19 = (List) unsafe.getObject(zzifmVar2, j2);
                    nqo C4 = vVar.C(i6);
                    z zVar21 = y.a;
                    int size13 = list19.size();
                    if (size13 == 0) {
                        i3 = 0;
                    } else {
                        i3 = 0;
                        for (int i26 = 0; i26 < size13; i26++) {
                            zzigw zzigwVar2 = (zzigw) list19.get(i26);
                            int b13 = zzier.b(i12 << 3);
                            i3 += ((zzidr) zzigwVar2).k(C4) + b13 + b13;
                        }
                    }
                    i8 += i3;
                    break;
                case 50:
                    zzigq zzigqVar = (zzigq) unsafe.getObject(zzifmVar2, j2);
                    zzigp zzigpVar = (zzigp) vVar.D(i6);
                    if (!zzigqVar.isEmpty()) {
                        b5 = 0;
                        for (Map.Entry entry2 : zzigqVar.entrySet()) {
                            Object key = entry2.getKey();
                            Object value = entry2.getValue();
                            h5o h5oVar = zzigpVar.a;
                            int b14 = zzier.b(i12 << 3);
                            int f = vpo.f((zziin) h5oVar.b, 2, value) + vpo.f((zziin) h5oVar.a, 1, key);
                            b5 = ceo.i(f, f, b14, b5);
                        }
                        i8 += b5;
                        break;
                    }
                    b5 = 0;
                    i8 += b5;
                case 51:
                    if (vVar.t(i12, i6, zzifmVar2)) {
                        i8 = ceo.b(i12 << 3, 8, i8);
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (vVar.t(i12, i6, zzifmVar2)) {
                        i8 = ceo.b(i12 << 3, 4, i8);
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (vVar.t(i12, i6, zzifmVar2)) {
                        long o6 = o(zzifmVar2, j2);
                        b7 = zzier.b(i12 << 3);
                        c2 = zzier.c(o6);
                        i8 += c2 + b7;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (vVar.t(i12, i6, zzifmVar2)) {
                        long o7 = o(zzifmVar2, j2);
                        b7 = zzier.b(i12 << 3);
                        c2 = zzier.c(o7);
                        i8 += c2 + b7;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (vVar.t(i12, i6, zzifmVar2)) {
                        long n2 = n(zzifmVar2, j2);
                        b7 = zzier.b(i12 << 3);
                        c2 = zzier.c(n2);
                        i8 += c2 + b7;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (vVar.t(i12, i6, zzifmVar2)) {
                        i8 = ceo.b(i12 << 3, 8, i8);
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (vVar.t(i12, i6, zzifmVar2)) {
                        i8 = ceo.b(i12 << 3, 4, i8);
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (vVar.t(i12, i6, zzifmVar2)) {
                        i8 = ceo.b(i12 << 3, 1, i8);
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (vVar.t(i12, i6, zzifmVar2)) {
                        int i27 = i12 << 3;
                        Object object3 = unsafe.getObject(zzifmVar2, j2);
                        if (object3 instanceof zziei) {
                            int b15 = zzier.b(i27);
                            int o8 = ((zziei) object3).o();
                            i8 = ceo.i(o8, o8, b15, i8);
                            break;
                        } else {
                            int b16 = zzier.b(i27);
                            int i28 = tqo.a;
                            int F4 = g7a.F((String) object3);
                            i8 = ceo.i(F4, F4, b16, i8);
                            break;
                        }
                    } else {
                        break;
                    }
                case 60:
                    if (vVar.t(i12, i6, zzifmVar2)) {
                        Object object4 = unsafe.getObject(zzifmVar2, j2);
                        nqo C5 = vVar.C(i6);
                        z zVar22 = y.a;
                        int b17 = zzier.b(i12 << 3);
                        int k5 = ((zzidr) object4).k(C5);
                        i8 = ceo.i(k5, k5, b17, i8);
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (vVar.t(i12, i6, zzifmVar2)) {
                        zziei zzieiVar2 = (zziei) unsafe.getObject(zzifmVar2, j2);
                        int b18 = zzier.b(i12 << 3);
                        int o9 = zzieiVar2.o();
                        i8 = ceo.i(o9, o9, b18, i8);
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (vVar.t(i12, i6, zzifmVar2)) {
                        i8 = ceo.b(n(zzifmVar2, j2), zzier.b(i12 << 3), i8);
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (vVar.t(i12, i6, zzifmVar2)) {
                        long n3 = n(zzifmVar2, j2);
                        b7 = zzier.b(i12 << 3);
                        c2 = zzier.c(n3);
                        i8 += c2 + b7;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (vVar.t(i12, i6, zzifmVar2)) {
                        i8 = ceo.b(i12 << 3, 4, i8);
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (vVar.t(i12, i6, zzifmVar2)) {
                        i8 = ceo.b(i12 << 3, 8, i8);
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (vVar.t(i12, i6, zzifmVar2)) {
                        int n4 = n(zzifmVar2, j2);
                        i8 = ceo.b((n4 >> 31) ^ (n4 + n4), zzier.b(i12 << 3), i8);
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (vVar.t(i12, i6, zzifmVar2)) {
                        long o10 = o(zzifmVar2, j2);
                        b7 = zzier.b(i12 << 3);
                        c2 = zzier.c((o10 >> 63) ^ (o10 + o10));
                        i8 += c2 + b7;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (vVar.t(i12, i6, zzifmVar2)) {
                        zzigw zzigwVar3 = (zzigw) unsafe.getObject(zzifmVar2, j2);
                        nqo C6 = vVar.C(i6);
                        z zVar23 = y.a;
                        int b19 = zzier.b(i12 << 3);
                        i2 = b19 + b19;
                        k = ((zzidr) zzigwVar3).k(C6);
                        b2 = k + i2;
                        i8 += b2;
                        break;
                    } else {
                        break;
                    }
            }
            i6 += 3;
            i4 = 1048575;
        }
    }

    @Override // defpackage.nqo
    public final int i(zzifm zzifmVar) {
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
                        doubleToLongBits = Double.doubleToLongBits(rqo.c.z(zzifmVar, j2));
                        byte[] bArr = zzifz.a;
                        i3 = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i5 = i + i3;
                        break;
                    case 1:
                        i2 = i5 * 53;
                        floatToIntBits = Float.floatToIntBits(rqo.c.t(zzifmVar, j2));
                        i5 = i2 + floatToIntBits;
                        break;
                    case 2:
                        i = i5 * 53;
                        doubleToLongBits = rqo.c(zzifmVar, j2);
                        byte[] bArr2 = zzifz.a;
                        i3 = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i5 = i + i3;
                        break;
                    case 3:
                        i = i5 * 53;
                        doubleToLongBits = rqo.c(zzifmVar, j2);
                        byte[] bArr3 = zzifz.a;
                        i3 = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i5 = i + i3;
                        break;
                    case 4:
                        i2 = i5 * 53;
                        floatToIntBits = rqo.a(zzifmVar, j2);
                        i5 = i2 + floatToIntBits;
                        break;
                    case 5:
                        i = i5 * 53;
                        doubleToLongBits = rqo.c(zzifmVar, j2);
                        byte[] bArr4 = zzifz.a;
                        i3 = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i5 = i + i3;
                        break;
                    case 6:
                        i2 = i5 * 53;
                        floatToIntBits = rqo.a(zzifmVar, j2);
                        i5 = i2 + floatToIntBits;
                        break;
                    case 7:
                        i = i5 * 53;
                        boolean p = rqo.c.p(zzifmVar, j2);
                        byte[] bArr5 = zzifz.a;
                        i3 = p ? 1231 : 1237;
                        i5 = i + i3;
                        break;
                    case 8:
                        i2 = i5 * 53;
                        floatToIntBits = ((String) rqo.e(zzifmVar, j2)).hashCode();
                        i5 = i2 + floatToIntBits;
                        break;
                    case 9:
                        i4 = i5 * 53;
                        Object e = rqo.e(zzifmVar, j2);
                        if (e != null) {
                            i7 = e.hashCode();
                        }
                        i5 = i4 + i7;
                        break;
                    case 10:
                        i2 = i5 * 53;
                        floatToIntBits = rqo.e(zzifmVar, j2).hashCode();
                        i5 = i2 + floatToIntBits;
                        break;
                    case 11:
                        i2 = i5 * 53;
                        floatToIntBits = rqo.a(zzifmVar, j2);
                        i5 = i2 + floatToIntBits;
                        break;
                    case 12:
                        i2 = i5 * 53;
                        floatToIntBits = rqo.a(zzifmVar, j2);
                        i5 = i2 + floatToIntBits;
                        break;
                    case 13:
                        i2 = i5 * 53;
                        floatToIntBits = rqo.a(zzifmVar, j2);
                        i5 = i2 + floatToIntBits;
                        break;
                    case 14:
                        i = i5 * 53;
                        doubleToLongBits = rqo.c(zzifmVar, j2);
                        byte[] bArr6 = zzifz.a;
                        i3 = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i5 = i + i3;
                        break;
                    case 15:
                        i2 = i5 * 53;
                        floatToIntBits = rqo.a(zzifmVar, j2);
                        i5 = i2 + floatToIntBits;
                        break;
                    case 16:
                        i = i5 * 53;
                        doubleToLongBits = rqo.c(zzifmVar, j2);
                        byte[] bArr7 = zzifz.a;
                        i3 = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i5 = i + i3;
                        break;
                    case 17:
                        i4 = i5 * 53;
                        Object e2 = rqo.e(zzifmVar, j2);
                        if (e2 != null) {
                            i7 = e2.hashCode();
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
                        floatToIntBits = rqo.e(zzifmVar, j2).hashCode();
                        i5 = i2 + floatToIntBits;
                        break;
                    case 50:
                        i2 = i5 * 53;
                        floatToIntBits = rqo.e(zzifmVar, j2).hashCode();
                        i5 = i2 + floatToIntBits;
                        break;
                }
            }
        }
        int i8 = this.j;
        while (true) {
            int[] iArr = this.h;
            if (i8 >= iArr.length) {
                int hashCode = zzifmVar.zzt.hashCode() + (i5 * 53);
                if (this.f) {
                    return ((zzifi) zzifmVar).zza.a.hashCode() + (hashCode * 53);
                }
                return hashCode;
            }
            if (!t(0, iArr[i8], zzifmVar)) {
                i5 = rqo.e(zzifmVar, j(r3) & 1048575).hashCode() + (i5 * 53);
            }
            i8++;
        }
    }

    public final int j(int i) {
        return this.a[i + 1];
    }

    public final boolean p(zzifm zzifmVar, zzifm zzifmVar2, int i) {
        return r(i, zzifmVar) == r(i, zzifmVar2);
    }

    public final boolean q(int i, int i2, int i3, int i4, Object obj) {
        return i2 == 1048575 ? r(i, obj) : (i3 & i4) != 0;
    }

    public final boolean r(int i, Object obj) {
        int i2 = this.a[i + 2];
        long j = i2 & 1048575;
        if (j != 1048575) {
            return ((1 << (i2 >>> 20)) & rqo.a(obj, j)) != 0;
        }
        int j2 = j(i);
        long j3 = j2 & 1048575;
        switch (k(j2)) {
            case 0:
                if (Double.doubleToRawLongBits(rqo.c.z(obj, j3)) != 0) {
                }
                break;
            case 1:
                if (Float.floatToRawIntBits(rqo.c.t(obj, j3)) != 0) {
                }
                break;
            case 2:
                if (rqo.c(obj, j3) != 0) {
                }
                break;
            case 3:
                if (rqo.c(obj, j3) != 0) {
                }
                break;
            case 4:
                if (rqo.a(obj, j3) != 0) {
                }
                break;
            case 5:
                if (rqo.c(obj, j3) != 0) {
                }
                break;
            case 6:
                if (rqo.a(obj, j3) != 0) {
                }
                break;
            case 7:
                break;
            case 8:
                Object e = rqo.e(obj, j3);
                if (!(e instanceof String)) {
                    if (!(e instanceof zziei)) {
                        ilg.c();
                        break;
                    } else if (!zziei.b.equals(e)) {
                    }
                } else if (!((String) e).isEmpty()) {
                }
                break;
            case 9:
                if (rqo.e(obj, j3) != null) {
                }
                break;
            case 10:
                if (!zziei.b.equals(rqo.e(obj, j3))) {
                }
                break;
            case 11:
                if (rqo.a(obj, j3) != 0) {
                }
                break;
            case 12:
                if (rqo.a(obj, j3) != 0) {
                }
                break;
            case 13:
                if (rqo.a(obj, j3) != 0) {
                }
                break;
            case 14:
                if (rqo.c(obj, j3) != 0) {
                }
                break;
            case 15:
                if (rqo.a(obj, j3) != 0) {
                }
                break;
            case 16:
                if (rqo.c(obj, j3) != 0) {
                }
                break;
            case 17:
                if (rqo.e(obj, j3) != null) {
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
        rqo.b((1 << (i2 >>> 20)) | rqo.a(obj, j), j, obj);
    }

    public final boolean t(int i, int i2, Object obj) {
        return rqo.a(obj, (long) (this.a[i2 + 2] & 1048575)) == i;
    }

    public final void u(int i, int i2, Object obj) {
        rqo.b(i, this.a[i2 + 2] & 1048575, obj);
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
    public final int y(java.lang.Object r40, byte[] r41, int r42, int r43, int r44, defpackage.tg0 r45) {
        /*
            Method dump skipped, instructions count: 3886
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.v.y(java.lang.Object, byte[], int, int, int, tg0):int");
    }

    @Override // defpackage.nqo
    public final Object zza() {
        return ((zzifm) this.e).t();
    }
}

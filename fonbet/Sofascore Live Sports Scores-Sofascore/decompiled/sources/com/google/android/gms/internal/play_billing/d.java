package com.google.android.gms.internal.play_billing;

import defpackage.a70;
import defpackage.aik;
import defpackage.apo;
import defpackage.aso;
import defpackage.cdo;
import defpackage.ceo;
import defpackage.cp4;
import defpackage.d1l;
import defpackage.dff;
import defpackage.eao;
import defpackage.ejg;
import defpackage.fc6;
import defpackage.fpo;
import defpackage.hbo;
import defpackage.i9a;
import defpackage.ilg;
import defpackage.jpe;
import defpackage.mz1;
import defpackage.nro;
import defpackage.q5a;
import defpackage.qoo;
import defpackage.sck;
import defpackage.tg0;
import defpackage.x5n;
import defpackage.zno;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class d implements qoo {
    public static final int[] j = new int[0];
    public static final Unsafe k = nro.d();
    public final int[] a;
    public final Object[] b;
    public final int c;
    public final int d;
    public final zzhr e;
    public final boolean f;
    public final int[] g;
    public final int h;
    public final int i;

    public d(int[] iArr, Object[] objArr, int i, int i2, zzhr zzhrVar, int[] iArr2, int i3, int i4, jpe jpeVar, dff dffVar) {
        this.a = iArr;
        this.b = objArr;
        this.c = i;
        this.d = i2;
        boolean z = false;
        if (dffVar != null && (zzhrVar instanceof zzgm)) {
            z = true;
        }
        this.f = z;
        this.g = iArr2;
        this.h = i3;
        this.i = i4;
        this.e = zzhrVar;
    }

    public static Field C(Class cls, String str) {
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
            StringBuilder s = mz1.s("Field ", str, " for ", name, " not found. Known fields are ");
            s.append(arrays);
            throw new RuntimeException(s.toString(), e);
        }
    }

    public static boolean o(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzgp) {
            return ((zzgp) obj).g();
        }
        return true;
    }

    public static final int q(byte[] bArr, int i, int i2, zzjg zzjgVar, Class cls, tg0 tg0Var) {
        zzjg zzjgVar2 = zzjg.c;
        switch (zzjgVar.ordinal()) {
            case 0:
                int i3 = i + 8;
                tg0Var.c = Double.valueOf(Double.longBitsToDouble(aik.x0(i, bArr)));
                return i3;
            case 1:
                int i4 = i + 4;
                tg0Var.c = Float.valueOf(Float.intBitsToFloat(aik.l0(i, bArr)));
                return i4;
            case 2:
            case 3:
                int t0 = aik.t0(bArr, i, tg0Var);
                tg0Var.c = Long.valueOf(tg0Var.b);
                return t0;
            case 4:
            case 12:
            case 13:
                int q0 = aik.q0(bArr, i, tg0Var);
                tg0Var.c = Integer.valueOf(tg0Var.a);
                return q0;
            case 5:
            case 15:
                int i5 = i + 8;
                tg0Var.c = Long.valueOf(aik.x0(i, bArr));
                return i5;
            case 6:
            case 14:
                int i6 = i + 4;
                tg0Var.c = Integer.valueOf(aik.l0(i, bArr));
                return i6;
            case 7:
                int t02 = aik.t0(bArr, i, tg0Var);
                tg0Var.c = Boolean.valueOf(tg0Var.b != 0);
                return t02;
            case 8:
                return aik.o0(bArr, i, tg0Var);
            case 9:
            default:
                cp4.h("unsupported field type.");
                return 0;
            case 10:
                qoo a = zno.b.a(cls);
                Object zze = a.zze();
                int v0 = aik.v0(zze, a, bArr, i, i2, tg0Var);
                a.a(zze);
                tg0Var.c = zze;
                return v0;
            case 11:
                return aik.j0(bArr, i, tg0Var);
            case 16:
                int q02 = aik.q0(bArr, i, tg0Var);
                tg0Var.c = Integer.valueOf(zzft.a(tg0Var.a));
                return q02;
            case 17:
                int t03 = aik.t0(bArr, i, tg0Var);
                long j2 = tg0Var.b;
                tg0Var.c = Long.valueOf((j2 >>> 1) ^ (-(1 & j2)));
                return t03;
        }
    }

    public static zzir s(Object obj) {
        zzgp zzgpVar = (zzgp) obj;
        zzir zzirVar = zzgpVar.zzc;
        if (zzirVar != zzir.f) {
            return zzirVar;
        }
        zzir b = zzir.b();
        zzgpVar.zzc = b;
        return b;
    }

    public static int t(Object obj, long j2) {
        return ((Integer) nro.c(obj, j2)).intValue();
    }

    public static int v(int i) {
        return (i >>> 20) & 255;
    }

    public static long x(Object obj, long j2) {
        return ((Long) nro.c(obj, j2)).longValue();
    }

    public final Object A(int i, Object obj) {
        qoo z = z(i);
        int w = w(i) & 1048575;
        if (!m(i, obj)) {
            return z.zze();
        }
        Object object = k.getObject(obj, w);
        if (o(object)) {
            return object;
        }
        Object zze = z.zze();
        if (object != null) {
            z.b(zze, object);
        }
        return zze;
    }

    public final Object B(int i, int i2, Object obj) {
        qoo z = z(i2);
        if (!p(i, i2, obj)) {
            return z.zze();
        }
        Object object = k.getObject(obj, w(i2) & 1048575);
        if (o(object)) {
            return object;
        }
        Object zze = z.zze();
        if (object != null) {
            z.b(zze, object);
        }
        return zze;
    }

    @Override // defpackage.qoo
    public final void a(Object obj) {
        if (!o(obj)) {
            return;
        }
        if (obj instanceof zzgp) {
            zzgp zzgpVar = (zzgp) obj;
            zzgpVar.f();
            zzgpVar.zza = 0;
            zzgpVar.d();
        }
        int i = 0;
        while (true) {
            int[] iArr = this.a;
            if (i >= iArr.length) {
                zzir zzirVar = ((zzgp) obj).zzc;
                if (zzirVar.e) {
                    zzirVar.e = false;
                }
                if (this.f) {
                    ((zzgm) obj).zzb.e();
                    return;
                }
                return;
            }
            int w = w(i);
            int i2 = 1048575 & w;
            int v = v(w);
            long j2 = i2;
            Unsafe unsafe = k;
            if (v != 9) {
                if (v != 60 && v != 68) {
                    switch (v) {
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
                            ((zzgu) nro.c(obj, j2)).zzb();
                            break;
                        case 50:
                            Object object = unsafe.getObject(obj, j2);
                            if (object == null) {
                                break;
                            } else {
                                ((zzhm) object).a = false;
                                unsafe.putObject(obj, j2, object);
                                break;
                            }
                    }
                } else if (p(iArr[i], i, obj)) {
                    z(i).a(unsafe.getObject(obj, j2));
                }
                i += 3;
            }
            if (m(i, obj)) {
                z(i).a(unsafe.getObject(obj, j2));
            }
            i += 3;
        }
    }

    @Override // defpackage.qoo
    public final void b(Object obj, Object obj2) {
        Object obj3;
        if (!o(obj)) {
            a70.p("Mutating immutable message: ".concat(String.valueOf(obj)));
            return;
        }
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.a;
            if (i >= iArr.length) {
                Object obj4 = obj;
                f.o(obj4, obj2);
                if (!this.f || ((zzgm) obj2).zzb.a.isEmpty()) {
                    return;
                }
                throw null;
            }
            int w = w(i);
            int i2 = w & 1048575;
            int v = v(w);
            int i3 = iArr[i];
            long j2 = i2;
            switch (v) {
                case 0:
                    obj3 = obj;
                    if (!m(i, obj2)) {
                        break;
                    } else {
                        sck sckVar = nro.c;
                        sckVar.x(obj3, j2, sckVar.n(obj2, j2));
                        k(i, obj3);
                        continue;
                    }
                case 1:
                    obj3 = obj;
                    if (m(i, obj2)) {
                        sck sckVar2 = nro.c;
                        sckVar2.B(obj3, j2, sckVar2.q(obj2, j2));
                        k(i, obj3);
                        break;
                    } else {
                        continue;
                    }
                case 2:
                    obj3 = obj;
                    if (m(i, obj2)) {
                        nro.c.b.putLong(obj3, j2, nro.b(obj2, j2));
                        k(i, obj3);
                        break;
                    } else {
                        continue;
                    }
                case 3:
                    obj3 = obj;
                    if (m(i, obj2)) {
                        nro.c.b.putLong(obj3, j2, nro.b(obj2, j2));
                        k(i, obj3);
                        break;
                    } else {
                        continue;
                    }
                case 4:
                    obj3 = obj;
                    if (m(i, obj2)) {
                        nro.g(nro.a(obj2, j2), j2, obj3);
                        k(i, obj3);
                        break;
                    } else {
                        continue;
                    }
                case 5:
                    obj3 = obj;
                    if (m(i, obj2)) {
                        nro.c.b.putLong(obj3, j2, nro.b(obj2, j2));
                        k(i, obj3);
                        break;
                    } else {
                        continue;
                    }
                case 6:
                    obj3 = obj;
                    if (m(i, obj2)) {
                        nro.g(nro.a(obj2, j2), j2, obj3);
                        k(i, obj3);
                        break;
                    } else {
                        continue;
                    }
                case 7:
                    obj3 = obj;
                    if (m(i, obj2)) {
                        sck sckVar3 = nro.c;
                        sckVar3.u(obj3, j2, sckVar3.F(obj2, j2));
                        k(i, obj3);
                        break;
                    } else {
                        continue;
                    }
                case 8:
                    obj3 = obj;
                    if (m(i, obj2)) {
                        nro.h(j2, obj3, nro.c(obj2, j2));
                        k(i, obj3);
                        break;
                    } else {
                        continue;
                    }
                case 9:
                    obj3 = obj;
                    i(i, obj3, obj2);
                    continue;
                case 10:
                    obj3 = obj;
                    if (m(i, obj2)) {
                        nro.h(j2, obj3, nro.c(obj2, j2));
                        k(i, obj3);
                        break;
                    } else {
                        continue;
                    }
                case 11:
                    obj3 = obj;
                    if (m(i, obj2)) {
                        nro.g(nro.a(obj2, j2), j2, obj3);
                        k(i, obj3);
                        break;
                    } else {
                        continue;
                    }
                case 12:
                    obj3 = obj;
                    if (m(i, obj2)) {
                        nro.g(nro.a(obj2, j2), j2, obj3);
                        k(i, obj3);
                        break;
                    } else {
                        continue;
                    }
                case 13:
                    obj3 = obj;
                    if (m(i, obj2)) {
                        nro.g(nro.a(obj2, j2), j2, obj3);
                        k(i, obj3);
                        break;
                    } else {
                        continue;
                    }
                case 14:
                    obj3 = obj;
                    if (m(i, obj2)) {
                        nro.c.b.putLong(obj3, j2, nro.b(obj2, j2));
                        k(i, obj3);
                        break;
                    } else {
                        continue;
                    }
                case 15:
                    obj3 = obj;
                    if (m(i, obj2)) {
                        nro.g(nro.a(obj2, j2), j2, obj3);
                        k(i, obj3);
                        break;
                    } else {
                        continue;
                    }
                case 16:
                    if (m(i, obj2)) {
                        obj3 = obj;
                        nro.c.b.putLong(obj3, j2, nro.b(obj2, j2));
                        k(i, obj3);
                        break;
                    }
                    break;
                case 17:
                    i(i, obj, obj2);
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
                    zzgu zzguVar = (zzgu) nro.c(obj, j2);
                    zzgu zzguVar2 = (zzgu) nro.c(obj2, j2);
                    int size = zzguVar.size();
                    int size2 = zzguVar2.size();
                    if (size > 0 && size2 > 0) {
                        if (!zzguVar.zzc()) {
                            zzguVar = zzguVar.i(size2 + size);
                        }
                        zzguVar.addAll(zzguVar2);
                    }
                    if (size > 0) {
                        zzguVar2 = zzguVar;
                    }
                    nro.h(j2, obj, zzguVar2);
                    break;
                case 50:
                    jpe jpeVar = f.a;
                    nro.h(j2, obj, q5a.Q(nro.c(obj, j2), nro.c(obj2, j2)));
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
                    if (p(i3, i, obj2)) {
                        nro.h(j2, obj, nro.c(obj2, j2));
                        nro.g(i3, iArr[i + 2] & 1048575, obj);
                        break;
                    }
                    break;
                case 60:
                    j(i, obj, obj2);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (p(i3, i, obj2)) {
                        nro.h(j2, obj, nro.c(obj2, j2));
                        nro.g(i3, iArr[i + 2] & 1048575, obj);
                        break;
                    }
                    break;
                case 68:
                    j(i, obj, obj2);
                    break;
            }
            obj3 = obj;
            i += 3;
            obj = obj3;
        }
    }

    @Override // defpackage.qoo
    public final boolean c(Object obj) {
        int i = 0;
        int i2 = 0;
        int i3 = 1048575;
        loop0: while (true) {
            if (i < this.h) {
                int i4 = this.g[i];
                int w = this.w(i4);
                int[] iArr = this.a;
                int i5 = iArr[i4 + 2];
                int i6 = i5 & 1048575;
                int i7 = 1 << (i5 >>> 20);
                if (i6 == i3) {
                    i6 = i3;
                } else if (i6 != 1048575) {
                    i2 = k.getInt(obj, i6);
                }
                int i8 = i2;
                d dVar = this;
                Object obj2 = obj;
                if ((268435456 & w) != 0 && !dVar.n(i4, i6, i8, i7, obj2)) {
                    break;
                }
                int v = v(w);
                if (v == 9 || v == 17) {
                    if (dVar.n(i4, i6, i8, i7, obj2) && !dVar.z(i4).c(nro.c(obj2, w & 1048575))) {
                        break;
                    }
                    i++;
                    this = dVar;
                    i3 = i6;
                    i2 = i8;
                    obj = obj2;
                } else {
                    if (v != 27) {
                        if (v == 60 || v == 68) {
                            if (dVar.p(iArr[i4], i4, obj2) && !dVar.z(i4).c(nro.c(obj2, w & 1048575))) {
                                break;
                            }
                            i++;
                            this = dVar;
                            i3 = i6;
                            i2 = i8;
                            obj = obj2;
                        } else if (v != 49) {
                            if (v != 50) {
                                continue;
                            } else {
                                zzhm zzhmVar = (zzhm) nro.c(obj2, w & 1048575);
                                if (zzhmVar.isEmpty()) {
                                    continue;
                                } else {
                                    int i9 = i4 / 3;
                                    if (((zzjg) ((zzhl) dVar.b[i9 + i9]).a.b).a == zzjh.i) {
                                        qoo qooVar = null;
                                        for (Object obj3 : zzhmVar.values()) {
                                            if (qooVar == null) {
                                                qooVar = zno.b.a(obj3.getClass());
                                            }
                                            if (!qooVar.c(obj3)) {
                                                break loop0;
                                            }
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                            }
                            i++;
                            this = dVar;
                            i3 = i6;
                            i2 = i8;
                            obj = obj2;
                        }
                    }
                    List list = (List) nro.c(obj2, w & 1048575);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        qoo z = dVar.z(i4);
                        for (int i10 = 0; i10 < list.size(); i10++) {
                            if (!z.c(list.get(i10))) {
                                break loop0;
                            }
                        }
                    }
                    i++;
                    this = dVar;
                    i3 = i6;
                    i2 = i8;
                    obj = obj2;
                }
            } else {
                Object obj4 = obj;
                if (!this.f || ((zzgm) obj4).zzb.h()) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:153:0x01d1, code lost:
    
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0218 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01d1 A[SYNTHETIC] */
    @Override // defpackage.qoo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean d(zzgp zzgpVar, zzgp zzgpVar2) {
        boolean e;
        int i = 0;
        while (true) {
            int[] iArr = this.a;
            if (i < iArr.length) {
                int w = w(i);
                int v = v(w);
                if (v <= 50 || v >= 69) {
                    long j2 = w & 1048575;
                    switch (v) {
                        case 0:
                            if (!l(zzgpVar, zzgpVar2, i)) {
                                break;
                            } else {
                                sck sckVar = nro.c;
                                if (Double.doubleToLongBits(sckVar.n(zzgpVar, j2)) != Double.doubleToLongBits(sckVar.n(zzgpVar2, j2))) {
                                    break;
                                } else {
                                    break;
                                }
                            }
                        case 1:
                            if (!l(zzgpVar, zzgpVar2, i)) {
                                break;
                            } else {
                                sck sckVar2 = nro.c;
                                if (Float.floatToIntBits(sckVar2.q(zzgpVar, j2)) != Float.floatToIntBits(sckVar2.q(zzgpVar2, j2))) {
                                    break;
                                } else {
                                    break;
                                }
                            }
                        case 2:
                            if (l(zzgpVar, zzgpVar2, i) && nro.b(zzgpVar, j2) == nro.b(zzgpVar2, j2)) {
                                break;
                            }
                            break;
                        case 3:
                            if (l(zzgpVar, zzgpVar2, i) && nro.b(zzgpVar, j2) == nro.b(zzgpVar2, j2)) {
                                break;
                            }
                            break;
                        case 4:
                            if (l(zzgpVar, zzgpVar2, i) && nro.a(zzgpVar, j2) == nro.a(zzgpVar2, j2)) {
                                break;
                            }
                            break;
                        case 5:
                            if (l(zzgpVar, zzgpVar2, i) && nro.b(zzgpVar, j2) == nro.b(zzgpVar2, j2)) {
                                break;
                            }
                            break;
                        case 6:
                            if (l(zzgpVar, zzgpVar2, i) && nro.a(zzgpVar, j2) == nro.a(zzgpVar2, j2)) {
                                break;
                            }
                            break;
                        case 7:
                            if (!l(zzgpVar, zzgpVar2, i)) {
                                break;
                            } else {
                                sck sckVar3 = nro.c;
                                if (sckVar3.F(zzgpVar, j2) != sckVar3.F(zzgpVar2, j2)) {
                                    break;
                                } else {
                                    break;
                                }
                            }
                        case 8:
                            if (l(zzgpVar, zzgpVar2, i) && f.e(nro.c(zzgpVar, j2), nro.c(zzgpVar2, j2))) {
                                break;
                            }
                            break;
                        case 9:
                            if (l(zzgpVar, zzgpVar2, i) && f.e(nro.c(zzgpVar, j2), nro.c(zzgpVar2, j2))) {
                                break;
                            }
                            break;
                        case 10:
                            if (l(zzgpVar, zzgpVar2, i) && f.e(nro.c(zzgpVar, j2), nro.c(zzgpVar2, j2))) {
                                break;
                            }
                            break;
                        case 11:
                            if (l(zzgpVar, zzgpVar2, i) && nro.a(zzgpVar, j2) == nro.a(zzgpVar2, j2)) {
                                break;
                            }
                            break;
                        case 12:
                            if (l(zzgpVar, zzgpVar2, i) && nro.a(zzgpVar, j2) == nro.a(zzgpVar2, j2)) {
                                break;
                            }
                            break;
                        case 13:
                            if (l(zzgpVar, zzgpVar2, i) && nro.a(zzgpVar, j2) == nro.a(zzgpVar2, j2)) {
                                break;
                            }
                            break;
                        case 14:
                            if (l(zzgpVar, zzgpVar2, i) && nro.b(zzgpVar, j2) == nro.b(zzgpVar2, j2)) {
                                break;
                            }
                            break;
                        case 15:
                            if (l(zzgpVar, zzgpVar2, i) && nro.a(zzgpVar, j2) == nro.a(zzgpVar2, j2)) {
                                break;
                            }
                            break;
                        case 16:
                            if (l(zzgpVar, zzgpVar2, i) && nro.b(zzgpVar, j2) == nro.b(zzgpVar2, j2)) {
                                break;
                            }
                            break;
                        case 17:
                            if (l(zzgpVar, zzgpVar2, i) && f.e(nro.c(zzgpVar, j2), nro.c(zzgpVar2, j2))) {
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
                            e = f.e(nro.c(zzgpVar, j2), nro.c(zzgpVar2, j2));
                            if (!e) {
                                break;
                            } else {
                                break;
                            }
                        case 50:
                            e = f.e(nro.c(zzgpVar, j2), nro.c(zzgpVar2, j2));
                            if (!e) {
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
                            if (nro.a(zzgpVar, j3) == nro.a(zzgpVar2, j3) && f.e(nro.c(zzgpVar, j2), nro.c(zzgpVar2, j2))) {
                                break;
                            }
                            break;
                    }
                    return false;
                }
                i += 3;
            } else {
                int i2 = this.i;
                while (true) {
                    int[] iArr2 = this.g;
                    if (i2 < iArr2.length) {
                        int i3 = iArr2[i2];
                        long j4 = iArr[i3 + 2] & 1048575;
                        if (nro.a(zzgpVar, j4) != nro.a(zzgpVar2, j4)) {
                            return false;
                        }
                        if (!p(0, i3, zzgpVar)) {
                            long w2 = w(i3) & 1048575;
                            if (!f.e(nro.c(zzgpVar, w2), nro.c(zzgpVar2, w2))) {
                            }
                        }
                        i2++;
                    } else if (zzgpVar.zzc.equals(zzgpVar2.zzc)) {
                        if (this.f) {
                            return ((zzgm) zzgpVar).zzb.equals(((zzgm) zzgpVar2).zzb);
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.qoo
    public final void e(Object obj, byte[] bArr, int i, int i2, tg0 tg0Var) {
        r(obj, bArr, i, i2, 0, tg0Var);
    }

    @Override // defpackage.qoo
    public final int f(zzgp zzgpVar) {
        int i;
        int c;
        int d;
        int i2;
        int c2;
        int h;
        int c3;
        int size;
        int n;
        int c4;
        int c5;
        int c6;
        int i3;
        int c7;
        int d2;
        d dVar = this;
        zzgp zzgpVar2 = zzgpVar;
        int i4 = 1048575;
        int i5 = 1048575;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (true) {
            int[] iArr = dVar.a;
            if (i6 >= iArr.length) {
                int a = zzgpVar2.zzc.a() + i8;
                if (!dVar.f) {
                    return a;
                }
                apo apoVar = ((zzgm) zzgpVar2).zzb.a;
                int i9 = apoVar.b;
                int i10 = 0;
                for (int i11 = 0; i11 < i9; i11++) {
                    fpo d3 = apoVar.d(i11);
                    i10 = cdo.c(d3.a, d3.b) + i10;
                }
                for (Map.Entry entry : apoVar.a()) {
                    i10 = cdo.c((zzgg) entry.getKey(), entry.getValue()) + i10;
                }
                return a + i10;
            }
            int w = dVar.w(i6);
            int v = v(w);
            int i12 = iArr[i6];
            int i13 = iArr[i6 + 2];
            int i14 = i13 & i4;
            Unsafe unsafe = k;
            if (v <= 17) {
                if (i14 != i5) {
                    i7 = i14 == i4 ? 0 : unsafe.getInt(zzgpVar2, i14);
                    i5 = i14;
                }
                i = 1 << (i13 >>> 20);
            } else {
                i = 0;
            }
            int i15 = w & i4;
            if (v >= zzgi.b.a) {
                int i16 = zzgi.c.a;
            }
            long j2 = i15;
            switch (v) {
                case 0:
                    if (dVar.n(i6, i5, i7, i, zzgpVar2)) {
                        i8 = x5n.C(i12 << 3, 8, i8);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (dVar.n(i6, i5, i7, i, zzgpVar2)) {
                        i8 = x5n.C(i12 << 3, 4, i8);
                    }
                    dVar = this;
                    zzgpVar2 = zzgpVar;
                    break;
                case 2:
                    if (dVar.n(i6, i5, i7, i, zzgpVar2)) {
                        long j3 = unsafe.getLong(zzgpVar2, j2);
                        c = zzfx.c(i12 << 3);
                        d = zzfx.d(j3);
                        i8 += d + c;
                    }
                    dVar = this;
                    break;
                case 3:
                    if (dVar.n(i6, i5, i7, i, zzgpVar2)) {
                        long j4 = unsafe.getLong(zzgpVar2, j2);
                        c = zzfx.c(i12 << 3);
                        d = zzfx.d(j4);
                        i8 += d + c;
                    }
                    dVar = this;
                    break;
                case 4:
                    if (dVar.n(i6, i5, i7, i, zzgpVar2)) {
                        long j5 = unsafe.getInt(zzgpVar2, j2);
                        c = zzfx.c(i12 << 3);
                        d = zzfx.d(j5);
                        i8 += d + c;
                    }
                    dVar = this;
                    break;
                case 5:
                    if (dVar.n(i6, i5, i7, i, zzgpVar2)) {
                        i8 = x5n.C(i12 << 3, 8, i8);
                    }
                    dVar = this;
                    zzgpVar2 = zzgpVar;
                    break;
                case 6:
                    if (dVar.n(i6, i5, i7, i, zzgpVar2)) {
                        i8 = x5n.C(i12 << 3, 4, i8);
                    }
                    dVar = this;
                    zzgpVar2 = zzgpVar;
                    break;
                case 7:
                    if (dVar.n(i6, i5, i7, i, zzgpVar2)) {
                        i8 = x5n.C(i12 << 3, 1, i8);
                    }
                    dVar = this;
                    zzgpVar2 = zzgpVar;
                    break;
                case 8:
                    if (dVar.n(i6, i5, i7, i, zzgpVar2)) {
                        int i17 = i12 << 3;
                        Object object = unsafe.getObject(zzgpVar2, j2);
                        if (object instanceof zzfp) {
                            int c8 = zzfx.c(i17);
                            int m = ((zzfp) object).m();
                            i8 = ceo.c(m, m, c8, i8);
                        } else {
                            int c9 = zzfx.c(i17);
                            int i18 = aso.a;
                            int P = i9a.P((String) object);
                            i8 = ceo.c(P, P, c9, i8);
                        }
                    }
                    dVar = this;
                    break;
                case 9:
                    if (dVar.n(i6, i5, i7, i, zzgpVar2)) {
                        Object object2 = unsafe.getObject(zzgpVar2, j2);
                        qoo z = dVar.z(i6);
                        jpe jpeVar = f.a;
                        int c10 = zzfx.c(i12 << 3);
                        int c11 = ((zzfa) object2).c(z);
                        i8 = ceo.c(c11, c11, c10, i8);
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (dVar.n(i6, i5, i7, i, zzgpVar2)) {
                        zzfp zzfpVar = (zzfp) unsafe.getObject(zzgpVar2, j2);
                        int c12 = zzfx.c(i12 << 3);
                        int m2 = zzfpVar.m();
                        i8 = ceo.c(m2, m2, c12, i8);
                    }
                    dVar = this;
                    break;
                case 11:
                    if (dVar.n(i6, i5, i7, i, zzgpVar2)) {
                        i8 = x5n.C(unsafe.getInt(zzgpVar2, j2), zzfx.c(i12 << 3), i8);
                    }
                    dVar = this;
                    break;
                case 12:
                    if (dVar.n(i6, i5, i7, i, zzgpVar2)) {
                        long j6 = unsafe.getInt(zzgpVar2, j2);
                        c = zzfx.c(i12 << 3);
                        d = zzfx.d(j6);
                        i8 += d + c;
                    }
                    dVar = this;
                    break;
                case 13:
                    if (dVar.n(i6, i5, i7, i, zzgpVar2)) {
                        i8 = x5n.C(i12 << 3, 4, i8);
                    }
                    dVar = this;
                    zzgpVar2 = zzgpVar;
                    break;
                case 14:
                    if (dVar.n(i6, i5, i7, i, zzgpVar2)) {
                        i8 = x5n.C(i12 << 3, 8, i8);
                    }
                    dVar = this;
                    zzgpVar2 = zzgpVar;
                    break;
                case 15:
                    if (dVar.n(i6, i5, i7, i, zzgpVar2)) {
                        int i19 = unsafe.getInt(zzgpVar2, j2);
                        i8 = x5n.C((i19 >> 31) ^ (i19 + i19), zzfx.c(i12 << 3), i8);
                    }
                    dVar = this;
                    break;
                case 16:
                    if (dVar.n(i6, i5, i7, i, zzgpVar2)) {
                        long j7 = unsafe.getLong(zzgpVar2, j2);
                        c = zzfx.c(i12 << 3);
                        d = zzfx.d((j7 >> 63) ^ (j7 + j7));
                        i8 += d + c;
                    }
                    dVar = this;
                    break;
                case 17:
                    if (dVar.n(i6, i5, i7, i, zzgpVar2)) {
                        zzhr zzhrVar = (zzhr) unsafe.getObject(zzgpVar2, j2);
                        qoo z2 = dVar.z(i6);
                        jpe jpeVar2 = f.a;
                        int c13 = zzfx.c(i12 << 3);
                        i2 = c13 + c13;
                        c2 = ((zzfa) zzhrVar).c(z2);
                        h = c2 + i2;
                        i8 += h;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    h = f.h(i12, (List) unsafe.getObject(zzgpVar2, j2));
                    i8 += h;
                    break;
                case 19:
                    h = f.g(i12, (List) unsafe.getObject(zzgpVar2, j2));
                    i8 += h;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(zzgpVar2, j2);
                    jpe jpeVar3 = f.a;
                    if (list.size() != 0) {
                        c3 = (zzfx.c(i12 << 3) * list.size()) + f.j(list);
                        i8 += c3;
                        break;
                    }
                    c3 = 0;
                    i8 += c3;
                case 21:
                    List list2 = (List) unsafe.getObject(zzgpVar2, j2);
                    jpe jpeVar4 = f.a;
                    size = list2.size();
                    if (size != 0) {
                        n = f.n(list2);
                        c4 = zzfx.c(i12 << 3);
                        c5 = (c4 * size) + n;
                        i8 += c5;
                        break;
                    }
                    c5 = 0;
                    i8 += c5;
                case 22:
                    List list3 = (List) unsafe.getObject(zzgpVar2, j2);
                    jpe jpeVar5 = f.a;
                    size = list3.size();
                    if (size != 0) {
                        n = f.i(list3);
                        c4 = zzfx.c(i12 << 3);
                        c5 = (c4 * size) + n;
                        i8 += c5;
                        break;
                    }
                    c5 = 0;
                    i8 += c5;
                case 23:
                    h = f.h(i12, (List) unsafe.getObject(zzgpVar2, j2));
                    i8 += h;
                    break;
                case 24:
                    h = f.g(i12, (List) unsafe.getObject(zzgpVar2, j2));
                    i8 += h;
                    break;
                case 25:
                    List list4 = (List) unsafe.getObject(zzgpVar2, j2);
                    jpe jpeVar6 = f.a;
                    int size2 = list4.size();
                    if (size2 != 0) {
                        c3 = (zzfx.c(i12 << 3) + 1) * size2;
                        i8 += c3;
                        break;
                    }
                    c3 = 0;
                    i8 += c3;
                case 26:
                    List list5 = (List) unsafe.getObject(zzgpVar2, j2);
                    jpe jpeVar7 = f.a;
                    int size3 = list5.size();
                    if (size3 != 0) {
                        c5 = zzfx.c(i12 << 3) * size3;
                        if (list5 instanceof zzhd) {
                            zzhd zzhdVar = (zzhd) list5;
                            for (int i20 = 0; i20 < size3; i20++) {
                                Object zza = zzhdVar.zza();
                                if (zza instanceof zzfp) {
                                    int m3 = ((zzfp) zza).m();
                                    c5 = x5n.C(m3, m3, c5);
                                } else {
                                    int i21 = aso.a;
                                    int P2 = i9a.P((String) zza);
                                    c5 = x5n.C(P2, P2, c5);
                                }
                            }
                        } else {
                            for (int i22 = 0; i22 < size3; i22++) {
                                Object obj = list5.get(i22);
                                if (obj instanceof zzfp) {
                                    int m4 = ((zzfp) obj).m();
                                    c5 = x5n.C(m4, m4, c5);
                                } else {
                                    int i23 = aso.a;
                                    int P3 = i9a.P((String) obj);
                                    c5 = x5n.C(P3, P3, c5);
                                }
                            }
                        }
                        i8 += c5;
                        break;
                    }
                    c5 = 0;
                    i8 += c5;
                case 27:
                    List list6 = (List) unsafe.getObject(zzgpVar2, j2);
                    qoo z3 = dVar.z(i6);
                    jpe jpeVar8 = f.a;
                    int size4 = list6.size();
                    if (size4 == 0) {
                        c6 = 0;
                    } else {
                        c6 = zzfx.c(i12 << 3) * size4;
                        for (int i24 = 0; i24 < size4; i24++) {
                            int c14 = ((zzfa) list6.get(i24)).c(z3);
                            c6 = x5n.C(c14, c14, c6);
                        }
                    }
                    i8 += c6;
                    break;
                case 28:
                    List list7 = (List) unsafe.getObject(zzgpVar2, j2);
                    jpe jpeVar9 = f.a;
                    int size5 = list7.size();
                    if (size5 != 0) {
                        c5 = zzfx.c(i12 << 3) * size5;
                        for (int i25 = 0; i25 < list7.size(); i25++) {
                            int m5 = ((zzfp) list7.get(i25)).m();
                            c5 = x5n.C(m5, m5, c5);
                        }
                        i8 += c5;
                        break;
                    }
                    c5 = 0;
                    i8 += c5;
                case 29:
                    List list8 = (List) unsafe.getObject(zzgpVar2, j2);
                    jpe jpeVar10 = f.a;
                    size = list8.size();
                    if (size != 0) {
                        n = f.m(list8);
                        c4 = zzfx.c(i12 << 3);
                        c5 = (c4 * size) + n;
                        i8 += c5;
                        break;
                    }
                    c5 = 0;
                    i8 += c5;
                case 30:
                    List list9 = (List) unsafe.getObject(zzgpVar2, j2);
                    jpe jpeVar11 = f.a;
                    size = list9.size();
                    if (size != 0) {
                        n = f.f(list9);
                        c4 = zzfx.c(i12 << 3);
                        c5 = (c4 * size) + n;
                        i8 += c5;
                        break;
                    }
                    c5 = 0;
                    i8 += c5;
                case 31:
                    h = f.g(i12, (List) unsafe.getObject(zzgpVar2, j2));
                    i8 += h;
                    break;
                case 32:
                    h = f.h(i12, (List) unsafe.getObject(zzgpVar2, j2));
                    i8 += h;
                    break;
                case 33:
                    List list10 = (List) unsafe.getObject(zzgpVar2, j2);
                    jpe jpeVar12 = f.a;
                    size = list10.size();
                    if (size != 0) {
                        n = f.k(list10);
                        c4 = zzfx.c(i12 << 3);
                        c5 = (c4 * size) + n;
                        i8 += c5;
                        break;
                    }
                    c5 = 0;
                    i8 += c5;
                case 34:
                    List list11 = (List) unsafe.getObject(zzgpVar2, j2);
                    jpe jpeVar13 = f.a;
                    size = list11.size();
                    if (size != 0) {
                        n = f.l(list11);
                        c4 = zzfx.c(i12 << 3);
                        c5 = (c4 * size) + n;
                        i8 += c5;
                        break;
                    }
                    c5 = 0;
                    i8 += c5;
                case 35:
                    List list12 = (List) unsafe.getObject(zzgpVar2, j2);
                    jpe jpeVar14 = f.a;
                    int size6 = list12.size() * 8;
                    if (size6 > 0) {
                        i8 = ceo.c(size6, zzfx.c(i12 << 3), size6, i8);
                        break;
                    } else {
                        break;
                    }
                case 36:
                    List list13 = (List) unsafe.getObject(zzgpVar2, j2);
                    jpe jpeVar15 = f.a;
                    int size7 = list13.size() * 4;
                    if (size7 > 0) {
                        i8 = ceo.c(size7, zzfx.c(i12 << 3), size7, i8);
                        break;
                    } else {
                        break;
                    }
                case 37:
                    int j8 = f.j((List) unsafe.getObject(zzgpVar2, j2));
                    if (j8 > 0) {
                        i8 = ceo.c(j8, zzfx.c(i12 << 3), j8, i8);
                        break;
                    } else {
                        break;
                    }
                case 38:
                    int n2 = f.n((List) unsafe.getObject(zzgpVar2, j2));
                    if (n2 > 0) {
                        i8 = ceo.c(n2, zzfx.c(i12 << 3), n2, i8);
                        break;
                    } else {
                        break;
                    }
                case 39:
                    int i26 = f.i((List) unsafe.getObject(zzgpVar2, j2));
                    if (i26 > 0) {
                        i8 = ceo.c(i26, zzfx.c(i12 << 3), i26, i8);
                        break;
                    } else {
                        break;
                    }
                case 40:
                    List list14 = (List) unsafe.getObject(zzgpVar2, j2);
                    jpe jpeVar16 = f.a;
                    int size8 = list14.size() * 8;
                    if (size8 > 0) {
                        i8 = ceo.c(size8, zzfx.c(i12 << 3), size8, i8);
                        break;
                    } else {
                        break;
                    }
                case 41:
                    List list15 = (List) unsafe.getObject(zzgpVar2, j2);
                    jpe jpeVar17 = f.a;
                    int size9 = list15.size() * 4;
                    if (size9 > 0) {
                        i8 = ceo.c(size9, zzfx.c(i12 << 3), size9, i8);
                        break;
                    } else {
                        break;
                    }
                case 42:
                    List list16 = (List) unsafe.getObject(zzgpVar2, j2);
                    jpe jpeVar18 = f.a;
                    int size10 = list16.size();
                    if (size10 > 0) {
                        i8 = ceo.c(size10, zzfx.c(i12 << 3), size10, i8);
                        break;
                    } else {
                        break;
                    }
                case 43:
                    int m6 = f.m((List) unsafe.getObject(zzgpVar2, j2));
                    if (m6 > 0) {
                        i8 = ceo.c(m6, zzfx.c(i12 << 3), m6, i8);
                        break;
                    } else {
                        break;
                    }
                case 44:
                    int f = f.f((List) unsafe.getObject(zzgpVar2, j2));
                    if (f > 0) {
                        i8 = ceo.c(f, zzfx.c(i12 << 3), f, i8);
                        break;
                    } else {
                        break;
                    }
                case 45:
                    List list17 = (List) unsafe.getObject(zzgpVar2, j2);
                    jpe jpeVar19 = f.a;
                    int size11 = list17.size() * 4;
                    if (size11 > 0) {
                        i8 = ceo.c(size11, zzfx.c(i12 << 3), size11, i8);
                        break;
                    } else {
                        break;
                    }
                case 46:
                    List list18 = (List) unsafe.getObject(zzgpVar2, j2);
                    jpe jpeVar20 = f.a;
                    int size12 = list18.size() * 8;
                    if (size12 > 0) {
                        i8 = ceo.c(size12, zzfx.c(i12 << 3), size12, i8);
                        break;
                    } else {
                        break;
                    }
                case 47:
                    int k2 = f.k((List) unsafe.getObject(zzgpVar2, j2));
                    if (k2 > 0) {
                        i8 = ceo.c(k2, zzfx.c(i12 << 3), k2, i8);
                        break;
                    } else {
                        break;
                    }
                case 48:
                    int l = f.l((List) unsafe.getObject(zzgpVar2, j2));
                    if (l > 0) {
                        i8 = ceo.c(l, zzfx.c(i12 << 3), l, i8);
                        break;
                    } else {
                        break;
                    }
                case 49:
                    List list19 = (List) unsafe.getObject(zzgpVar2, j2);
                    qoo z4 = dVar.z(i6);
                    jpe jpeVar21 = f.a;
                    int size13 = list19.size();
                    if (size13 == 0) {
                        i3 = 0;
                    } else {
                        i3 = 0;
                        for (int i27 = 0; i27 < size13; i27++) {
                            zzhr zzhrVar2 = (zzhr) list19.get(i27);
                            int c15 = zzfx.c(i12 << 3);
                            i3 += ((zzfa) zzhrVar2).c(z4) + c15 + c15;
                        }
                    }
                    i8 += i3;
                    break;
                case 50:
                    int i28 = i6 / 3;
                    zzhm zzhmVar = (zzhm) unsafe.getObject(zzgpVar2, j2);
                    zzhl zzhlVar = (zzhl) dVar.b[i28 + i28];
                    if (!zzhmVar.isEmpty()) {
                        c5 = 0;
                        for (Map.Entry entry2 : zzhmVar.entrySet()) {
                            Object key = entry2.getKey();
                            Object value = entry2.getValue();
                            ejg ejgVar = zzhlVar.a;
                            int c16 = zzfx.c(i12 << 3);
                            int a2 = cdo.a((zzjg) ejgVar.b, 2, value) + cdo.a((zzjg) ejgVar.c, 1, key);
                            c5 = ceo.c(a2, a2, c16, c5);
                        }
                        i8 += c5;
                        break;
                    }
                    c5 = 0;
                    i8 += c5;
                case 51:
                    if (dVar.p(i12, i6, zzgpVar2)) {
                        i8 = x5n.C(i12 << 3, 8, i8);
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (dVar.p(i12, i6, zzgpVar2)) {
                        i8 = x5n.C(i12 << 3, 4, i8);
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (dVar.p(i12, i6, zzgpVar2)) {
                        long x = x(zzgpVar2, j2);
                        c7 = zzfx.c(i12 << 3);
                        d2 = zzfx.d(x);
                        i8 += d2 + c7;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (dVar.p(i12, i6, zzgpVar2)) {
                        long x2 = x(zzgpVar2, j2);
                        c7 = zzfx.c(i12 << 3);
                        d2 = zzfx.d(x2);
                        i8 += d2 + c7;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (dVar.p(i12, i6, zzgpVar2)) {
                        long t = t(zzgpVar2, j2);
                        c7 = zzfx.c(i12 << 3);
                        d2 = zzfx.d(t);
                        i8 += d2 + c7;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (dVar.p(i12, i6, zzgpVar2)) {
                        i8 = x5n.C(i12 << 3, 8, i8);
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (dVar.p(i12, i6, zzgpVar2)) {
                        i8 = x5n.C(i12 << 3, 4, i8);
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (dVar.p(i12, i6, zzgpVar2)) {
                        i8 = x5n.C(i12 << 3, 1, i8);
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (dVar.p(i12, i6, zzgpVar2)) {
                        int i29 = i12 << 3;
                        Object object3 = unsafe.getObject(zzgpVar2, j2);
                        if (object3 instanceof zzfp) {
                            int c17 = zzfx.c(i29);
                            int m7 = ((zzfp) object3).m();
                            i8 = ceo.c(m7, m7, c17, i8);
                            break;
                        } else {
                            int c18 = zzfx.c(i29);
                            int i30 = aso.a;
                            int P4 = i9a.P((String) object3);
                            i8 = ceo.c(P4, P4, c18, i8);
                            break;
                        }
                    } else {
                        break;
                    }
                case 60:
                    if (dVar.p(i12, i6, zzgpVar2)) {
                        Object object4 = unsafe.getObject(zzgpVar2, j2);
                        qoo z5 = dVar.z(i6);
                        jpe jpeVar22 = f.a;
                        int c19 = zzfx.c(i12 << 3);
                        int c20 = ((zzfa) object4).c(z5);
                        i8 = ceo.c(c20, c20, c19, i8);
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (dVar.p(i12, i6, zzgpVar2)) {
                        zzfp zzfpVar2 = (zzfp) unsafe.getObject(zzgpVar2, j2);
                        int c21 = zzfx.c(i12 << 3);
                        int m8 = zzfpVar2.m();
                        i8 = ceo.c(m8, m8, c21, i8);
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (dVar.p(i12, i6, zzgpVar2)) {
                        i8 = x5n.C(t(zzgpVar2, j2), zzfx.c(i12 << 3), i8);
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (dVar.p(i12, i6, zzgpVar2)) {
                        long t2 = t(zzgpVar2, j2);
                        c7 = zzfx.c(i12 << 3);
                        d2 = zzfx.d(t2);
                        i8 += d2 + c7;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (dVar.p(i12, i6, zzgpVar2)) {
                        i8 = x5n.C(i12 << 3, 4, i8);
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (dVar.p(i12, i6, zzgpVar2)) {
                        i8 = x5n.C(i12 << 3, 8, i8);
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (dVar.p(i12, i6, zzgpVar2)) {
                        int t3 = t(zzgpVar2, j2);
                        i8 = x5n.C((t3 >> 31) ^ (t3 + t3), zzfx.c(i12 << 3), i8);
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (dVar.p(i12, i6, zzgpVar2)) {
                        long x3 = x(zzgpVar2, j2);
                        c7 = zzfx.c(i12 << 3);
                        d2 = zzfx.d((x3 >> 63) ^ (x3 + x3));
                        i8 += d2 + c7;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (dVar.p(i12, i6, zzgpVar2)) {
                        zzhr zzhrVar3 = (zzhr) unsafe.getObject(zzgpVar2, j2);
                        qoo z6 = dVar.z(i6);
                        jpe jpeVar23 = f.a;
                        int c22 = zzfx.c(i12 << 3);
                        i2 = c22 + c22;
                        c2 = ((zzfa) zzhrVar3).c(z6);
                        h = c2 + i2;
                        i8 += h;
                        break;
                    } else {
                        break;
                    }
            }
            i6 += 3;
            i4 = 1048575;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.qoo
    public final void g(Object obj, d1l d1lVar) {
        boolean z;
        int[] iArr;
        int i;
        boolean z2;
        int i2;
        int i3;
        d dVar = this;
        eao eaoVar = (eao) d1lVar.b;
        Map.Entry entry = null;
        if (dVar.f) {
            cdo cdoVar = ((zzgm) obj).zzb;
            if (!cdoVar.a.isEmpty()) {
                entry = (Map.Entry) cdoVar.d().next();
            }
        }
        Map.Entry entry2 = entry;
        int i4 = 1048575;
        int i5 = 1048575;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            int[] iArr2 = dVar.a;
            if (i6 >= iArr2.length) {
                if (entry2 != null) {
                    throw fc6.d(entry2);
                }
                ((zzgp) obj).zzc.d(d1lVar);
                return;
            }
            int w = dVar.w(i6);
            int v = v(w);
            int i8 = iArr2[i6];
            Unsafe unsafe = k;
            if (v <= 17) {
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
            long j2 = w & i4;
            switch (v) {
                case 0:
                    if (dVar.n(i6, i5, i7, i, obj)) {
                        eaoVar.l(i8, Double.doubleToRawLongBits(nro.c.n(obj, j2)));
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (dVar.n(i6, i5, i7, i, obj)) {
                        eaoVar.j(i8, Float.floatToRawIntBits(nro.c.q(obj, j2)));
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (dVar.n(i6, i5, i7, i, obj)) {
                        eaoVar.v(i8, unsafe.getLong(obj, j2));
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (dVar.n(i6, i5, i7, i, obj)) {
                        eaoVar.v(i8, unsafe.getLong(obj, j2));
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (dVar.n(i6, i5, i7, i, obj)) {
                        eaoVar.n(i8, unsafe.getInt(obj, j2));
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (dVar.n(i6, i5, i7, i, obj)) {
                        eaoVar.l(i8, unsafe.getLong(obj, j2));
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (dVar.n(i6, i5, i7, i, obj)) {
                        eaoVar.j(i8, unsafe.getInt(obj, j2));
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (dVar.n(i6, i5, i7, i, obj)) {
                        eaoVar.g(i8, nro.c.F(obj, j2));
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (dVar.n(i6, i5, i7, i, obj)) {
                        Object object = unsafe.getObject(obj, j2);
                        if (object instanceof String) {
                            eaoVar.q(i8, (String) object);
                            break;
                        } else {
                            eaoVar.h(i8, (zzfp) object);
                            break;
                        }
                    } else {
                        break;
                    }
                case 9:
                    if (dVar.n(i6, i5, i7, i, obj)) {
                        d1lVar.q(i8, unsafe.getObject(obj, j2), dVar.z(i6));
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (dVar.n(i6, i5, i7, i, obj)) {
                        eaoVar.h(i8, (zzfp) unsafe.getObject(obj, j2));
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (dVar.n(i6, i5, i7, i, obj)) {
                        eaoVar.t(i8, unsafe.getInt(obj, j2));
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (dVar.n(i6, i5, i7, i, obj)) {
                        eaoVar.n(i8, unsafe.getInt(obj, j2));
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (dVar.n(i6, i5, i7, i, obj)) {
                        eaoVar.j(i8, unsafe.getInt(obj, j2));
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (dVar.n(i6, i5, i7, i, obj)) {
                        eaoVar.l(i8, unsafe.getLong(obj, j2));
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (dVar.n(i6, i5, i7, i, obj)) {
                        int i12 = unsafe.getInt(obj, j2);
                        eaoVar.t(i8, (i12 >> 31) ^ (i12 + i12));
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (dVar.n(i6, i5, i7, i, obj)) {
                        long j3 = unsafe.getLong(obj, j2);
                        eaoVar.v(i8, (j3 >> 63) ^ (j3 + j3));
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (dVar.n(i6, i5, i7, i, obj)) {
                        Object object2 = unsafe.getObject(obj, j2);
                        eaoVar.s(i8, 3);
                        dVar.z(i6).g((zzfa) object2, d1lVar);
                        eaoVar.s(i8, 4);
                        break;
                    } else {
                        break;
                    }
                case 18:
                    z2 = false;
                    i2 = i5;
                    f.q(iArr[i6], (List) unsafe.getObject(obj, j2), d1lVar, false);
                    i5 = i2;
                    break;
                case 19:
                    z2 = false;
                    i2 = i5;
                    f.u(iArr[i6], (List) unsafe.getObject(obj, j2), d1lVar, false);
                    i5 = i2;
                    break;
                case 20:
                    z2 = false;
                    i2 = i5;
                    f.w(iArr[i6], (List) unsafe.getObject(obj, j2), d1lVar, false);
                    i5 = i2;
                    break;
                case 21:
                    z2 = false;
                    i2 = i5;
                    f.d(iArr[i6], (List) unsafe.getObject(obj, j2), d1lVar, false);
                    i5 = i2;
                    break;
                case 22:
                    z2 = false;
                    i2 = i5;
                    f.v(iArr[i6], (List) unsafe.getObject(obj, j2), d1lVar, false);
                    i5 = i2;
                    break;
                case 23:
                    z2 = false;
                    i2 = i5;
                    f.t(iArr[i6], (List) unsafe.getObject(obj, j2), d1lVar, false);
                    i5 = i2;
                    break;
                case 24:
                    z2 = false;
                    i2 = i5;
                    f.s(iArr[i6], (List) unsafe.getObject(obj, j2), d1lVar, false);
                    i5 = i2;
                    break;
                case 25:
                    i2 = i5;
                    z2 = false;
                    f.p(iArr[i6], (List) unsafe.getObject(obj, j2), d1lVar, false);
                    i5 = i2;
                    break;
                case 26:
                    i3 = i5;
                    int i13 = iArr[i6];
                    List list = (List) unsafe.getObject(obj, j2);
                    jpe jpeVar = f.a;
                    if (list != null && !list.isEmpty()) {
                        if (list instanceof zzhd) {
                            zzhd zzhdVar = (zzhd) list;
                            for (int i14 = 0; i14 < list.size(); i14++) {
                                Object zza = zzhdVar.zza();
                                if (zza instanceof String) {
                                    eaoVar.q(i13, (String) zza);
                                } else {
                                    eaoVar.h(i13, (zzfp) zza);
                                }
                            }
                        } else {
                            for (int i15 = 0; i15 < list.size(); i15++) {
                                eaoVar.q(i13, (String) list.get(i15));
                            }
                        }
                    }
                    i5 = i3;
                    break;
                case 27:
                    i3 = i5;
                    int i16 = iArr[i6];
                    List list2 = (List) unsafe.getObject(obj, j2);
                    qoo z3 = dVar.z(i6);
                    jpe jpeVar2 = f.a;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i17 = 0; i17 < list2.size(); i17++) {
                            d1lVar.q(i16, list2.get(i17), z3);
                        }
                    }
                    i5 = i3;
                    break;
                case 28:
                    i3 = i5;
                    int i18 = iArr[i6];
                    List list3 = (List) unsafe.getObject(obj, j2);
                    jpe jpeVar3 = f.a;
                    if (list3 != null && !list3.isEmpty()) {
                        for (int i19 = 0; i19 < list3.size(); i19++) {
                            eaoVar.h(i18, (zzfp) list3.get(i19));
                        }
                    }
                    i5 = i3;
                    break;
                case 29:
                    z2 = false;
                    i2 = i5;
                    f.c(iArr[i6], (List) unsafe.getObject(obj, j2), d1lVar, false);
                    i5 = i2;
                    break;
                case 30:
                    z2 = false;
                    i2 = i5;
                    f.r(iArr[i6], (List) unsafe.getObject(obj, j2), d1lVar, false);
                    i5 = i2;
                    break;
                case 31:
                    z2 = false;
                    i2 = i5;
                    f.x(iArr[i6], (List) unsafe.getObject(obj, j2), d1lVar, false);
                    i5 = i2;
                    break;
                case 32:
                    z2 = false;
                    i2 = i5;
                    f.y(iArr[i6], (List) unsafe.getObject(obj, j2), d1lVar, false);
                    i5 = i2;
                    break;
                case 33:
                    z2 = false;
                    i2 = i5;
                    f.a(iArr[i6], (List) unsafe.getObject(obj, j2), d1lVar, false);
                    i5 = i2;
                    break;
                case 34:
                    i2 = i5;
                    z2 = false;
                    f.b(iArr[i6], (List) unsafe.getObject(obj, j2), d1lVar, false);
                    i5 = i2;
                    break;
                case 35:
                    i3 = i5;
                    f.q(iArr[i6], (List) unsafe.getObject(obj, j2), d1lVar, z);
                    i5 = i3;
                    break;
                case 36:
                    i3 = i5;
                    f.u(iArr[i6], (List) unsafe.getObject(obj, j2), d1lVar, z);
                    i5 = i3;
                    break;
                case 37:
                    i3 = i5;
                    f.w(iArr[i6], (List) unsafe.getObject(obj, j2), d1lVar, z);
                    i5 = i3;
                    break;
                case 38:
                    i3 = i5;
                    f.d(iArr[i6], (List) unsafe.getObject(obj, j2), d1lVar, z);
                    i5 = i3;
                    break;
                case 39:
                    i3 = i5;
                    f.v(iArr[i6], (List) unsafe.getObject(obj, j2), d1lVar, z);
                    i5 = i3;
                    break;
                case 40:
                    i3 = i5;
                    f.t(iArr[i6], (List) unsafe.getObject(obj, j2), d1lVar, z);
                    i5 = i3;
                    break;
                case 41:
                    i3 = i5;
                    f.s(iArr[i6], (List) unsafe.getObject(obj, j2), d1lVar, z);
                    i5 = i3;
                    break;
                case 42:
                    i3 = i5;
                    f.p(iArr[i6], (List) unsafe.getObject(obj, j2), d1lVar, z);
                    i5 = i3;
                    break;
                case 43:
                    i3 = i5;
                    f.c(iArr[i6], (List) unsafe.getObject(obj, j2), d1lVar, z);
                    i5 = i3;
                    break;
                case 44:
                    i3 = i5;
                    f.r(iArr[i6], (List) unsafe.getObject(obj, j2), d1lVar, z);
                    i5 = i3;
                    break;
                case 45:
                    i3 = i5;
                    f.x(iArr[i6], (List) unsafe.getObject(obj, j2), d1lVar, z);
                    i5 = i3;
                    break;
                case 46:
                    i3 = i5;
                    f.y(iArr[i6], (List) unsafe.getObject(obj, j2), d1lVar, z);
                    i5 = i3;
                    break;
                case 47:
                    i3 = i5;
                    f.a(iArr[i6], (List) unsafe.getObject(obj, j2), d1lVar, z);
                    i5 = i3;
                    break;
                case 48:
                    i3 = i5;
                    f.b(iArr[i6], (List) unsafe.getObject(obj, j2), d1lVar, true);
                    i5 = i3;
                    break;
                case 49:
                    i3 = i5;
                    int i20 = iArr[i6];
                    List list4 = (List) unsafe.getObject(obj, j2);
                    qoo z4 = dVar.z(i6);
                    jpe jpeVar4 = f.a;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i21 = 0; i21 < list4.size(); i21++) {
                            zzfa zzfaVar = (zzfa) list4.get(i21);
                            eaoVar.s(i20, 3);
                            z4.g(zzfaVar, d1lVar);
                            eaoVar.s(i20, 4);
                        }
                    }
                    i5 = i3;
                    break;
                case 50:
                    Object object3 = unsafe.getObject(obj, j2);
                    if (object3 != null) {
                        int i22 = i6 / 3;
                        ejg ejgVar = ((zzhl) dVar.b[i22 + i22]).a;
                        zzjg zzjgVar = (zzjg) ejgVar.b;
                        zzjg zzjgVar2 = (zzjg) ejgVar.c;
                        for (Map.Entry entry3 : ((zzhm) object3).entrySet()) {
                            eaoVar.s(i8, 2);
                            int i23 = i5;
                            boolean z5 = z;
                            eaoVar.u(cdo.a(zzjgVar, 2, entry3.getValue()) + cdo.a(zzjgVar2, z5 ? 1 : 0, entry3.getKey()));
                            Object key = entry3.getKey();
                            Object value = entry3.getValue();
                            cdo.g(eaoVar, zzjgVar2, z5 ? 1 : 0, key);
                            cdo.g(eaoVar, zzjgVar, 2, value);
                            i5 = i23;
                            z = true;
                        }
                    }
                    break;
                case 51:
                    if (dVar.p(i8, i6, obj)) {
                        eaoVar.l(i8, Double.doubleToRawLongBits(((Double) nro.c(obj, j2)).doubleValue()));
                    }
                    break;
                case 52:
                    if (dVar.p(i8, i6, obj)) {
                        eaoVar.j(i8, Float.floatToRawIntBits(((Float) nro.c(obj, j2)).floatValue()));
                    }
                    break;
                case 53:
                    if (dVar.p(i8, i6, obj)) {
                        eaoVar.v(i8, x(obj, j2));
                    }
                    break;
                case 54:
                    if (dVar.p(i8, i6, obj)) {
                        eaoVar.v(i8, x(obj, j2));
                    }
                    break;
                case 55:
                    if (dVar.p(i8, i6, obj)) {
                        eaoVar.n(i8, t(obj, j2));
                    }
                    break;
                case 56:
                    if (dVar.p(i8, i6, obj)) {
                        eaoVar.l(i8, x(obj, j2));
                    }
                    break;
                case 57:
                    if (dVar.p(i8, i6, obj)) {
                        eaoVar.j(i8, t(obj, j2));
                    }
                    break;
                case 58:
                    if (dVar.p(i8, i6, obj)) {
                        eaoVar.g(i8, ((Boolean) nro.c(obj, j2)).booleanValue());
                    }
                    break;
                case 59:
                    if (dVar.p(i8, i6, obj)) {
                        Object object4 = unsafe.getObject(obj, j2);
                        if (object4 instanceof String) {
                            eaoVar.q(i8, (String) object4);
                        } else {
                            eaoVar.h(i8, (zzfp) object4);
                        }
                    }
                    break;
                case 60:
                    if (dVar.p(i8, i6, obj)) {
                        d1lVar.q(i8, unsafe.getObject(obj, j2), dVar.z(i6));
                    }
                    break;
                case 61:
                    if (dVar.p(i8, i6, obj)) {
                        eaoVar.h(i8, (zzfp) unsafe.getObject(obj, j2));
                    }
                    break;
                case 62:
                    if (dVar.p(i8, i6, obj)) {
                        eaoVar.t(i8, t(obj, j2));
                    }
                    break;
                case 63:
                    if (dVar.p(i8, i6, obj)) {
                        eaoVar.n(i8, t(obj, j2));
                    }
                    break;
                case 64:
                    if (dVar.p(i8, i6, obj)) {
                        eaoVar.j(i8, t(obj, j2));
                    }
                    break;
                case 65:
                    if (dVar.p(i8, i6, obj)) {
                        eaoVar.l(i8, x(obj, j2));
                    }
                    break;
                case 66:
                    if (dVar.p(i8, i6, obj)) {
                        int t = t(obj, j2);
                        eaoVar.t(i8, (t >> 31) ^ (t + t));
                    }
                    break;
                case 67:
                    if (dVar.p(i8, i6, obj)) {
                        long x = x(obj, j2);
                        eaoVar.v(i8, (x >> 63) ^ (x + x));
                    }
                    break;
                case 68:
                    if (dVar.p(i8, i6, obj)) {
                        Object object5 = unsafe.getObject(obj, j2);
                        eaoVar.s(i8, 3);
                        dVar.z(i6).g((zzfa) object5, d1lVar);
                        eaoVar.s(i8, 4);
                    }
                    break;
            }
            i6 += 3;
            i4 = 1048575;
            dVar = this;
        }
    }

    @Override // defpackage.qoo
    public final int h(zzgp zzgpVar) {
        int i;
        long doubleToLongBits;
        int i2;
        int floatToIntBits;
        int i3;
        int i4;
        int i5 = 0;
        for (int i6 = 0; i6 < this.a.length; i6 += 3) {
            int w = w(i6);
            int v = v(w);
            if (v <= 50 || v >= 69) {
                long j2 = w & 1048575;
                int i7 = 37;
                switch (v) {
                    case 0:
                        i = i5 * 53;
                        doubleToLongBits = Double.doubleToLongBits(nro.c.n(zzgpVar, j2));
                        byte[] bArr = zzgv.a;
                        i3 = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i5 = i + i3;
                        break;
                    case 1:
                        i2 = i5 * 53;
                        floatToIntBits = Float.floatToIntBits(nro.c.q(zzgpVar, j2));
                        i5 = i2 + floatToIntBits;
                        break;
                    case 2:
                        i = i5 * 53;
                        doubleToLongBits = nro.b(zzgpVar, j2);
                        byte[] bArr2 = zzgv.a;
                        i3 = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i5 = i + i3;
                        break;
                    case 3:
                        i = i5 * 53;
                        doubleToLongBits = nro.b(zzgpVar, j2);
                        byte[] bArr3 = zzgv.a;
                        i3 = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i5 = i + i3;
                        break;
                    case 4:
                        i2 = i5 * 53;
                        floatToIntBits = nro.a(zzgpVar, j2);
                        i5 = i2 + floatToIntBits;
                        break;
                    case 5:
                        i = i5 * 53;
                        doubleToLongBits = nro.b(zzgpVar, j2);
                        byte[] bArr4 = zzgv.a;
                        i3 = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i5 = i + i3;
                        break;
                    case 6:
                        i2 = i5 * 53;
                        floatToIntBits = nro.a(zzgpVar, j2);
                        i5 = i2 + floatToIntBits;
                        break;
                    case 7:
                        i = i5 * 53;
                        boolean F = nro.c.F(zzgpVar, j2);
                        byte[] bArr5 = zzgv.a;
                        i3 = F ? 1231 : 1237;
                        i5 = i + i3;
                        break;
                    case 8:
                        i2 = i5 * 53;
                        floatToIntBits = ((String) nro.c(zzgpVar, j2)).hashCode();
                        i5 = i2 + floatToIntBits;
                        break;
                    case 9:
                        i4 = i5 * 53;
                        Object c = nro.c(zzgpVar, j2);
                        if (c != null) {
                            i7 = c.hashCode();
                        }
                        i5 = i4 + i7;
                        break;
                    case 10:
                        i2 = i5 * 53;
                        floatToIntBits = nro.c(zzgpVar, j2).hashCode();
                        i5 = i2 + floatToIntBits;
                        break;
                    case 11:
                        i2 = i5 * 53;
                        floatToIntBits = nro.a(zzgpVar, j2);
                        i5 = i2 + floatToIntBits;
                        break;
                    case 12:
                        i2 = i5 * 53;
                        floatToIntBits = nro.a(zzgpVar, j2);
                        i5 = i2 + floatToIntBits;
                        break;
                    case 13:
                        i2 = i5 * 53;
                        floatToIntBits = nro.a(zzgpVar, j2);
                        i5 = i2 + floatToIntBits;
                        break;
                    case 14:
                        i = i5 * 53;
                        doubleToLongBits = nro.b(zzgpVar, j2);
                        byte[] bArr6 = zzgv.a;
                        i3 = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i5 = i + i3;
                        break;
                    case 15:
                        i2 = i5 * 53;
                        floatToIntBits = nro.a(zzgpVar, j2);
                        i5 = i2 + floatToIntBits;
                        break;
                    case 16:
                        i = i5 * 53;
                        doubleToLongBits = nro.b(zzgpVar, j2);
                        byte[] bArr7 = zzgv.a;
                        i3 = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i5 = i + i3;
                        break;
                    case 17:
                        i4 = i5 * 53;
                        Object c2 = nro.c(zzgpVar, j2);
                        if (c2 != null) {
                            i7 = c2.hashCode();
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
                        floatToIntBits = nro.c(zzgpVar, j2).hashCode();
                        i5 = i2 + floatToIntBits;
                        break;
                    case 50:
                        i2 = i5 * 53;
                        floatToIntBits = nro.c(zzgpVar, j2).hashCode();
                        i5 = i2 + floatToIntBits;
                        break;
                }
            }
        }
        int i8 = this.i;
        while (true) {
            int[] iArr = this.g;
            if (i8 >= iArr.length) {
                int hashCode = zzgpVar.zzc.hashCode() + (i5 * 53);
                if (this.f) {
                    return ((zzgm) zzgpVar).zzb.a.hashCode() + (hashCode * 53);
                }
                return hashCode;
            }
            if (!p(0, iArr[i8], zzgpVar)) {
                i5 = nro.c(zzgpVar, w(r3) & 1048575).hashCode() + (i5 * 53);
            }
            i8++;
        }
    }

    public final void i(int i, Object obj, Object obj2) {
        if (m(i, obj2)) {
            long w = w(i) & 1048575;
            Unsafe unsafe = k;
            Object object = unsafe.getObject(obj2, w);
            if (object == null) {
                hbo.h(this.a[i], obj2);
                return;
            }
            qoo z = z(i);
            if (!m(i, obj)) {
                if (o(object)) {
                    Object zze = z.zze();
                    z.b(zze, object);
                    unsafe.putObject(obj, w, zze);
                } else {
                    unsafe.putObject(obj, w, object);
                }
                k(i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, w);
            if (!o(object2)) {
                Object zze2 = z.zze();
                z.b(zze2, object2);
                unsafe.putObject(obj, w, zze2);
                object2 = zze2;
            }
            z.b(object2, object);
        }
    }

    public final void j(int i, Object obj, Object obj2) {
        int[] iArr = this.a;
        int i2 = iArr[i];
        if (p(i2, i, obj2)) {
            long w = w(i) & 1048575;
            Unsafe unsafe = k;
            Object object = unsafe.getObject(obj2, w);
            if (object == null) {
                hbo.h(iArr[i], obj2);
                return;
            }
            qoo z = z(i);
            if (!p(i2, i, obj)) {
                if (o(object)) {
                    Object zze = z.zze();
                    z.b(zze, object);
                    unsafe.putObject(obj, w, zze);
                } else {
                    unsafe.putObject(obj, w, object);
                }
                nro.g(i2, iArr[i + 2] & 1048575, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, w);
            if (!o(object2)) {
                Object zze2 = z.zze();
                z.b(zze2, object2);
                unsafe.putObject(obj, w, zze2);
                object2 = zze2;
            }
            z.b(object2, object);
        }
    }

    public final void k(int i, Object obj) {
        int i2 = this.a[i + 2];
        long j2 = 1048575 & i2;
        if (j2 == 1048575) {
            return;
        }
        nro.g((1 << (i2 >>> 20)) | nro.a(obj, j2), j2, obj);
    }

    public final boolean l(zzgp zzgpVar, zzgp zzgpVar2, int i) {
        return m(i, zzgpVar) == m(i, zzgpVar2);
    }

    public final boolean m(int i, Object obj) {
        int i2 = this.a[i + 2];
        long j2 = i2 & 1048575;
        if (j2 != 1048575) {
            return ((1 << (i2 >>> 20)) & nro.a(obj, j2)) != 0;
        }
        int w = w(i);
        long j3 = w & 1048575;
        switch (v(w)) {
            case 0:
                if (Double.doubleToRawLongBits(nro.c.n(obj, j3)) != 0) {
                }
                break;
            case 1:
                if (Float.floatToRawIntBits(nro.c.q(obj, j3)) != 0) {
                }
                break;
            case 2:
                if (nro.b(obj, j3) != 0) {
                }
                break;
            case 3:
                if (nro.b(obj, j3) != 0) {
                }
                break;
            case 4:
                if (nro.a(obj, j3) != 0) {
                }
                break;
            case 5:
                if (nro.b(obj, j3) != 0) {
                }
                break;
            case 6:
                if (nro.a(obj, j3) != 0) {
                }
                break;
            case 7:
                break;
            case 8:
                Object c = nro.c(obj, j3);
                if (!(c instanceof String)) {
                    if (!(c instanceof zzfp)) {
                        ilg.c();
                        break;
                    } else if (!zzfp.b.equals(c)) {
                    }
                } else if (!((String) c).isEmpty()) {
                }
                break;
            case 9:
                if (nro.c(obj, j3) != null) {
                }
                break;
            case 10:
                if (!zzfp.b.equals(nro.c(obj, j3))) {
                }
                break;
            case 11:
                if (nro.a(obj, j3) != 0) {
                }
                break;
            case 12:
                if (nro.a(obj, j3) != 0) {
                }
                break;
            case 13:
                if (nro.a(obj, j3) != 0) {
                }
                break;
            case 14:
                if (nro.b(obj, j3) != 0) {
                }
                break;
            case 15:
                if (nro.a(obj, j3) != 0) {
                }
                break;
            case 16:
                if (nro.b(obj, j3) != 0) {
                }
                break;
            case 17:
                if (nro.c(obj, j3) != null) {
                }
                break;
            default:
                ilg.c();
                break;
        }
        return false;
    }

    public final boolean n(int i, int i2, int i3, int i4, Object obj) {
        return i2 == 1048575 ? m(i, obj) : (i3 & i4) != 0;
    }

    public final boolean p(int i, int i2, Object obj) {
        return nro.a(obj, (long) (this.a[i2 + 2] & 1048575)) == i;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public final int r(java.lang.Object r38, byte[] r39, int r40, int r41, int r42, defpackage.tg0 r43) {
        /*
            Method dump skipped, instructions count: 3820
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.d.r(java.lang.Object, byte[], int, int, int, tg0):int");
    }

    public final int u(int i, int i2) {
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

    public final int w(int i) {
        return this.a[i + 1];
    }

    public final zzgs y(int i) {
        int i2 = i / 3;
        return (zzgs) this.b[i2 + i2 + 1];
    }

    public final qoo z(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        Object[] objArr = this.b;
        qoo qooVar = (qoo) objArr[i3];
        if (qooVar != null) {
            return qooVar;
        }
        qoo a = zno.b.a((Class) objArr[i3 + 1]);
        objArr[i3] = a;
        return a;
    }

    @Override // defpackage.qoo
    public final Object zze() {
        return (zzgp) ((zzgp) this.e).i(4);
    }
}

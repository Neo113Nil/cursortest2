package com.google.android.gms.internal.cast;

import defpackage.a70;
import defpackage.bf3;
import defpackage.bgp;
import defpackage.ceo;
import defpackage.d4;
import defpackage.f5n;
import defpackage.fc6;
import defpackage.fn0;
import defpackage.ggp;
import defpackage.hbo;
import defpackage.igp;
import defpackage.ilg;
import defpackage.mxn;
import defpackage.mz1;
import defpackage.omf;
import defpackage.sck;
import defpackage.tcp;
import defpackage.ubf;
import defpackage.ufp;
import defpackage.vp2;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.security.AccessController;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class d implements bgp {
    public static final int[] i = new int[0];
    public static final Unsafe j;
    public final int[] a;
    public final Object[] b;
    public final zzzi c;
    public final boolean d;
    public final int[] e;
    public final int f;
    public final ubf g;
    public final omf h;

    static {
        Unsafe unsafe;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new d4(7));
        } catch (Throwable unused) {
            unsafe = null;
        }
        j = unsafe;
    }

    public d(int[] iArr, Object[] objArr, zzzi zzziVar, int[] iArr2, int i2, ubf ubfVar, omf omfVar) {
        this.a = iArr;
        this.b = objArr;
        boolean z = false;
        if (omfVar != null && (zzziVar instanceof zzyb)) {
            z = true;
        }
        this.d = z;
        this.e = iArr2;
        this.f = i2;
        this.g = ubfVar;
        this.h = omfVar;
        this.c = zzziVar;
    }

    public static Field k(Class cls, String str) {
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

    public static int p(int i2) {
        return (i2 >>> 20) & 255;
    }

    public static boolean q(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzyd) {
            return ((zzyd) obj).k();
        }
        return true;
    }

    public static int r(Object obj, long j2) {
        return ((Integer) f5n.h(obj, j2)).intValue();
    }

    public static long s(Object obj, long j2) {
        return ((Long) f5n.h(obj, j2)).longValue();
    }

    @Override // defpackage.bgp
    public final void a(Object obj, Object obj2) {
        Object obj3;
        if (!q(obj)) {
            a70.p("Mutating immutable message: ".concat(String.valueOf(obj)));
            return;
        }
        obj2.getClass();
        int i2 = 0;
        while (true) {
            int[] iArr = this.a;
            if (i2 >= iArr.length) {
                Object obj4 = obj;
                f.b(obj4, obj2);
                if (!this.d || ((zzyb) obj2).zzb.a.isEmpty()) {
                    return;
                }
                throw null;
            }
            int o = o(i2);
            int i3 = o & 1048575;
            int p = p(o);
            int i4 = iArr[i2];
            long j2 = i3;
            switch (p) {
                case 0:
                    obj3 = obj;
                    if (!h(i2, obj2)) {
                        break;
                    } else {
                        sck sckVar = f5n.c;
                        sckVar.G(obj3, j2, sckVar.C(obj2, j2));
                        i(i2, obj3);
                        continue;
                    }
                case 1:
                    obj3 = obj;
                    if (h(i2, obj2)) {
                        sck sckVar2 = f5n.c;
                        sckVar2.B(obj3, j2, sckVar2.v(obj2, j2));
                        i(i2, obj3);
                        break;
                    } else {
                        continue;
                    }
                case 2:
                    obj3 = obj;
                    if (h(i2, obj2)) {
                        f5n.c.b.putLong(obj3, j2, f5n.g(obj2, j2));
                        i(i2, obj3);
                        break;
                    } else {
                        continue;
                    }
                case 3:
                    obj3 = obj;
                    if (h(i2, obj2)) {
                        f5n.c.b.putLong(obj3, j2, f5n.g(obj2, j2));
                        i(i2, obj3);
                        break;
                    } else {
                        continue;
                    }
                case 4:
                    obj3 = obj;
                    if (h(i2, obj2)) {
                        f5n.f(f5n.e(obj2, j2), j2, obj3);
                        i(i2, obj3);
                        break;
                    } else {
                        continue;
                    }
                case 5:
                    obj3 = obj;
                    if (h(i2, obj2)) {
                        f5n.c.b.putLong(obj3, j2, f5n.g(obj2, j2));
                        i(i2, obj3);
                        break;
                    } else {
                        continue;
                    }
                case 6:
                    obj3 = obj;
                    if (h(i2, obj2)) {
                        f5n.f(f5n.e(obj2, j2), j2, obj3);
                        i(i2, obj3);
                        break;
                    } else {
                        continue;
                    }
                case 7:
                    obj3 = obj;
                    if (h(i2, obj2)) {
                        sck sckVar3 = f5n.c;
                        sckVar3.u(obj3, j2, sckVar3.s(obj2, j2));
                        i(i2, obj3);
                        break;
                    } else {
                        continue;
                    }
                case 8:
                    obj3 = obj;
                    if (h(i2, obj2)) {
                        f5n.i(j2, obj3, f5n.h(obj2, j2));
                        i(i2, obj3);
                        break;
                    } else {
                        continue;
                    }
                case 9:
                    obj3 = obj;
                    l(i2, obj3, obj2);
                    continue;
                case 10:
                    obj3 = obj;
                    if (h(i2, obj2)) {
                        f5n.i(j2, obj3, f5n.h(obj2, j2));
                        i(i2, obj3);
                        break;
                    } else {
                        continue;
                    }
                case 11:
                    obj3 = obj;
                    if (h(i2, obj2)) {
                        f5n.f(f5n.e(obj2, j2), j2, obj3);
                        i(i2, obj3);
                        break;
                    } else {
                        continue;
                    }
                case 12:
                    obj3 = obj;
                    if (h(i2, obj2)) {
                        f5n.f(f5n.e(obj2, j2), j2, obj3);
                        i(i2, obj3);
                        break;
                    } else {
                        continue;
                    }
                case 13:
                    obj3 = obj;
                    if (h(i2, obj2)) {
                        f5n.f(f5n.e(obj2, j2), j2, obj3);
                        i(i2, obj3);
                        break;
                    } else {
                        continue;
                    }
                case 14:
                    obj3 = obj;
                    if (h(i2, obj2)) {
                        f5n.c.b.putLong(obj3, j2, f5n.g(obj2, j2));
                        i(i2, obj3);
                        break;
                    } else {
                        continue;
                    }
                case 15:
                    obj3 = obj;
                    if (h(i2, obj2)) {
                        f5n.f(f5n.e(obj2, j2), j2, obj3);
                        i(i2, obj3);
                        break;
                    } else {
                        continue;
                    }
                case 16:
                    if (h(i2, obj2)) {
                        obj3 = obj;
                        f5n.c.b.putLong(obj3, j2, f5n.g(obj2, j2));
                        i(i2, obj3);
                        break;
                    }
                    break;
                case 17:
                    l(i2, obj, obj2);
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
                    zzyl zzylVar = (zzyl) f5n.h(obj, j2);
                    zzyl zzylVar2 = (zzyl) f5n.h(obj2, j2);
                    int size = zzylVar.size();
                    int size2 = zzylVar2.size();
                    if (size > 0 && size2 > 0) {
                        if (!zzylVar.zza()) {
                            zzylVar = zzylVar.zzf(size2 + size);
                        }
                        zzylVar.addAll(zzylVar2);
                    }
                    if (size > 0) {
                        zzylVar2 = zzylVar;
                    }
                    f5n.i(j2, obj, zzylVar2);
                    break;
                case 50:
                    ubf ubfVar = f.a;
                    zzzc zzzcVar = (zzzc) f5n.h(obj, j2);
                    zzzc zzzcVar2 = (zzzc) f5n.h(obj2, j2);
                    if (!zzzcVar2.isEmpty()) {
                        if (!zzzcVar.a) {
                            zzzcVar = zzzcVar.g();
                        }
                        zzzcVar.i();
                        if (!zzzcVar2.isEmpty()) {
                            zzzcVar.putAll(zzzcVar2);
                        }
                    }
                    f5n.i(j2, obj, zzzcVar);
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
                    if (j(i4, i2, obj2)) {
                        f5n.i(j2, obj, f5n.h(obj2, j2));
                        f5n.f(i4, iArr[i2 + 2] & 1048575, obj);
                        break;
                    }
                    break;
                case 60:
                    m(i2, obj, obj2);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (j(i4, i2, obj2)) {
                        f5n.i(j2, obj, f5n.h(obj2, j2));
                        f5n.f(i4, iArr[i2 + 2] & 1048575, obj);
                        break;
                    }
                    break;
                case 68:
                    m(i2, obj, obj2);
                    break;
            }
            obj3 = obj;
            i2 += 3;
            obj = obj3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x00ed, code lost:
    
        return false;
     */
    @Override // defpackage.bgp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(Object obj) {
        int i2;
        int i3;
        int i4;
        int i5 = 0;
        int i6 = 0;
        int i7 = 1048575;
        loop0: while (true) {
            if (i6 < this.f) {
                int i8 = this.e[i6];
                int[] iArr = this.a;
                int i9 = iArr[i8];
                int o = o(i8);
                int i10 = iArr[i8 + 2];
                int i11 = i10 & 1048575;
                int i12 = 1 << (i10 >>> 20);
                if (i11 != i7) {
                    if (i11 != 1048575) {
                        i5 = j.getInt(obj, i11);
                    }
                    i3 = i8;
                    i4 = i5;
                    i2 = i11;
                } else {
                    int i13 = i5;
                    i2 = i7;
                    i3 = i8;
                    i4 = i13;
                }
                if ((268435456 & o) != 0 && !u(i3, i2, i4, i12, obj)) {
                    break;
                }
                int p = p(o);
                if (p == 9 || p == 17) {
                    if (u(i3, i2, i4, i12, obj) && !n(i3).b(f5n.h(obj, o & 1048575))) {
                        break;
                    }
                    i6++;
                    i7 = i2;
                    i5 = i4;
                } else {
                    if (p != 27) {
                        if (p == 60 || p == 68) {
                            if (j(i9, i3, obj) && !n(i3).b(f5n.h(obj, o & 1048575))) {
                                break;
                            }
                        } else if (p != 49) {
                            if (p == 50 && !((zzzc) f5n.h(obj, o & 1048575)).isEmpty()) {
                                int i14 = i3 / 3;
                                throw null;
                            }
                        }
                        i6++;
                        i7 = i2;
                        i5 = i4;
                    }
                    List list = (List) f5n.h(obj, o & 1048575);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        bgp n = n(i3);
                        for (int i15 = 0; i15 < list.size(); i15++) {
                            if (!n.b(list.get(i15))) {
                                break loop0;
                            }
                        }
                    }
                    i6++;
                    i7 = i2;
                    i5 = i4;
                }
            } else if (!this.d || ((zzyb) obj).zzb.d()) {
                return true;
            }
        }
    }

    @Override // defpackage.bgp
    public final boolean c(zzyd zzydVar, zzyd zzydVar2) {
        boolean a;
        int i2 = 0;
        while (true) {
            int[] iArr = this.a;
            if (i2 < iArr.length) {
                int o = o(i2);
                long j2 = o & 1048575;
                switch (p(o)) {
                    case 0:
                        if (!t(zzydVar, zzydVar2, i2)) {
                            break;
                        } else {
                            sck sckVar = f5n.c;
                            if (Double.doubleToLongBits(sckVar.C(zzydVar, j2)) != Double.doubleToLongBits(sckVar.C(zzydVar2, j2))) {
                                break;
                            } else {
                                continue;
                                i2 += 3;
                            }
                        }
                    case 1:
                        if (!t(zzydVar, zzydVar2, i2)) {
                            break;
                        } else {
                            sck sckVar2 = f5n.c;
                            if (Float.floatToIntBits(sckVar2.v(zzydVar, j2)) != Float.floatToIntBits(sckVar2.v(zzydVar2, j2))) {
                                break;
                            } else {
                                continue;
                                i2 += 3;
                            }
                        }
                    case 2:
                        if (t(zzydVar, zzydVar2, i2) && f5n.g(zzydVar, j2) == f5n.g(zzydVar2, j2)) {
                            continue;
                            i2 += 3;
                        }
                        break;
                    case 3:
                        if (t(zzydVar, zzydVar2, i2) && f5n.g(zzydVar, j2) == f5n.g(zzydVar2, j2)) {
                            continue;
                            i2 += 3;
                        }
                        break;
                    case 4:
                        if (t(zzydVar, zzydVar2, i2) && f5n.e(zzydVar, j2) == f5n.e(zzydVar2, j2)) {
                            continue;
                            i2 += 3;
                        }
                        break;
                    case 5:
                        if (t(zzydVar, zzydVar2, i2) && f5n.g(zzydVar, j2) == f5n.g(zzydVar2, j2)) {
                            continue;
                            i2 += 3;
                        }
                        break;
                    case 6:
                        if (t(zzydVar, zzydVar2, i2) && f5n.e(zzydVar, j2) == f5n.e(zzydVar2, j2)) {
                            continue;
                            i2 += 3;
                        }
                        break;
                    case 7:
                        if (!t(zzydVar, zzydVar2, i2)) {
                            break;
                        } else {
                            sck sckVar3 = f5n.c;
                            if (sckVar3.s(zzydVar, j2) != sckVar3.s(zzydVar2, j2)) {
                                break;
                            } else {
                                continue;
                                i2 += 3;
                            }
                        }
                    case 8:
                        if (t(zzydVar, zzydVar2, i2) && f.a(f5n.h(zzydVar, j2), f5n.h(zzydVar2, j2))) {
                            continue;
                            i2 += 3;
                        }
                        break;
                    case 9:
                        if (t(zzydVar, zzydVar2, i2) && f.a(f5n.h(zzydVar, j2), f5n.h(zzydVar2, j2))) {
                            continue;
                            i2 += 3;
                        }
                        break;
                    case 10:
                        if (t(zzydVar, zzydVar2, i2) && f.a(f5n.h(zzydVar, j2), f5n.h(zzydVar2, j2))) {
                            continue;
                            i2 += 3;
                        }
                        break;
                    case 11:
                        if (t(zzydVar, zzydVar2, i2) && f5n.e(zzydVar, j2) == f5n.e(zzydVar2, j2)) {
                            continue;
                            i2 += 3;
                        }
                        break;
                    case 12:
                        if (t(zzydVar, zzydVar2, i2) && f5n.e(zzydVar, j2) == f5n.e(zzydVar2, j2)) {
                            continue;
                            i2 += 3;
                        }
                        break;
                    case 13:
                        if (t(zzydVar, zzydVar2, i2) && f5n.e(zzydVar, j2) == f5n.e(zzydVar2, j2)) {
                            continue;
                            i2 += 3;
                        }
                        break;
                    case 14:
                        if (t(zzydVar, zzydVar2, i2) && f5n.g(zzydVar, j2) == f5n.g(zzydVar2, j2)) {
                            continue;
                            i2 += 3;
                        }
                        break;
                    case 15:
                        if (t(zzydVar, zzydVar2, i2) && f5n.e(zzydVar, j2) == f5n.e(zzydVar2, j2)) {
                            continue;
                            i2 += 3;
                        }
                        break;
                    case 16:
                        if (t(zzydVar, zzydVar2, i2) && f5n.g(zzydVar, j2) == f5n.g(zzydVar2, j2)) {
                            continue;
                            i2 += 3;
                        }
                        break;
                    case 17:
                        if (t(zzydVar, zzydVar2, i2) && f.a(f5n.h(zzydVar, j2), f5n.h(zzydVar2, j2))) {
                            continue;
                            i2 += 3;
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
                        a = f.a(f5n.h(zzydVar, j2), f5n.h(zzydVar2, j2));
                        break;
                    case 50:
                        a = f.a(f5n.h(zzydVar, j2), f5n.h(zzydVar2, j2));
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
                        long j3 = iArr[i2 + 2] & 1048575;
                        if (f5n.e(zzydVar, j3) == f5n.e(zzydVar2, j3) && f.a(f5n.h(zzydVar, j2), f5n.h(zzydVar2, j2))) {
                            continue;
                            i2 += 3;
                        }
                        break;
                    default:
                        i2 += 3;
                }
                if (a) {
                    i2 += 3;
                }
            } else if (zzydVar.zzc.equals(zzydVar2.zzc)) {
                if (this.d) {
                    return ((zzyb) zzydVar).zzb.equals(((zzyb) zzydVar2).zzb);
                }
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0604 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0034  */
    @Override // defpackage.bgp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(Object obj, mxn mxnVar) {
        Map.Entry entry;
        int i2;
        int i3;
        int[] iArr;
        boolean z;
        int[] iArr2;
        int i4;
        boolean z2;
        d dVar = this;
        zzxp zzxpVar = (zzxp) mxnVar.b;
        if (dVar.d) {
            tcp tcpVar = ((zzyb) obj).zzb;
            if (!tcpVar.a.isEmpty()) {
                entry = (Map.Entry) tcpVar.b().next();
                i2 = 1048575;
                int i5 = 1048575;
                i3 = 0;
                int i6 = 0;
                while (true) {
                    iArr = dVar.a;
                    if (i3 < iArr.length) {
                        if (entry != null) {
                            throw fc6.d(entry);
                        }
                        zzaae zzaaeVar = ((zzyd) obj).zzc;
                        return;
                    }
                    int o = dVar.o(i3);
                    int p = p(o);
                    int i7 = iArr[i3];
                    Unsafe unsafe = j;
                    if (p <= 17) {
                        int i8 = iArr[i3 + 2];
                        z = true;
                        int i9 = i8 & i2;
                        if (i9 != i5) {
                            i6 = i9 == i2 ? 0 : unsafe.getInt(obj, i9);
                            i5 = i9;
                        }
                        iArr2 = iArr;
                        i4 = 1 << (i8 >>> 20);
                    } else {
                        z = true;
                        iArr2 = iArr;
                        i4 = 0;
                    }
                    if (entry != null) {
                        throw fc6.d(entry);
                    }
                    long j2 = o & i2;
                    switch (p) {
                        case 0:
                            if (dVar.u(i3, i5, i6, i4, obj)) {
                                zzxpVar.g(i7, Double.doubleToRawLongBits(f5n.c.C(obj, j2)));
                            }
                            i3 += 3;
                            i2 = 1048575;
                            dVar = this;
                        case 1:
                            if (dVar.u(i3, i5, i6, i4, obj)) {
                                zzxpVar.e(i7, Float.floatToRawIntBits(f5n.c.v(obj, j2)));
                            }
                            i3 += 3;
                            i2 = 1048575;
                            dVar = this;
                        case 2:
                            if (dVar.u(i3, i5, i6, i4, obj)) {
                                zzxpVar.f(i7, unsafe.getLong(obj, j2));
                            }
                            i3 += 3;
                            i2 = 1048575;
                            dVar = this;
                        case 3:
                            if (dVar.u(i3, i5, i6, i4, obj)) {
                                zzxpVar.f(i7, unsafe.getLong(obj, j2));
                            }
                            i3 += 3;
                            i2 = 1048575;
                            dVar = this;
                        case 4:
                            if (dVar.u(i3, i5, i6, i4, obj)) {
                                zzxpVar.c(i7, unsafe.getInt(obj, j2));
                            }
                            i3 += 3;
                            i2 = 1048575;
                            dVar = this;
                        case 5:
                            if (dVar.u(i3, i5, i6, i4, obj)) {
                                zzxpVar.g(i7, unsafe.getLong(obj, j2));
                            }
                            i3 += 3;
                            i2 = 1048575;
                            dVar = this;
                        case 6:
                            if (dVar.u(i3, i5, i6, i4, obj)) {
                                zzxpVar.e(i7, unsafe.getInt(obj, j2));
                            }
                            i3 += 3;
                            i2 = 1048575;
                            dVar = this;
                        case 7:
                            if (dVar.u(i3, i5, i6, i4, obj)) {
                                zzxpVar.h(i7, f5n.c.s(obj, j2));
                            }
                            i3 += 3;
                            i2 = 1048575;
                            dVar = this;
                        case 8:
                            if (dVar.u(i3, i5, i6, i4, obj)) {
                                Object object = unsafe.getObject(obj, j2);
                                if (object instanceof String) {
                                    zzxpVar.i(i7, (String) object);
                                } else {
                                    zzxpVar.j(i7, (zzxk) object);
                                }
                            }
                            i3 += 3;
                            i2 = 1048575;
                            dVar = this;
                        case 9:
                            if (dVar.u(i3, i5, i6, i4, obj)) {
                                mxnVar.f(i7, unsafe.getObject(obj, j2), dVar.n(i3));
                            }
                            i3 += 3;
                            i2 = 1048575;
                            dVar = this;
                        case 10:
                            if (dVar.u(i3, i5, i6, i4, obj)) {
                                zzxpVar.j(i7, (zzxk) unsafe.getObject(obj, j2));
                            }
                            i3 += 3;
                            i2 = 1048575;
                            dVar = this;
                        case 11:
                            if (dVar.u(i3, i5, i6, i4, obj)) {
                                zzxpVar.d(i7, unsafe.getInt(obj, j2));
                            }
                            i3 += 3;
                            i2 = 1048575;
                            dVar = this;
                        case 12:
                            if (dVar.u(i3, i5, i6, i4, obj)) {
                                zzxpVar.c(i7, unsafe.getInt(obj, j2));
                            }
                            i3 += 3;
                            i2 = 1048575;
                            dVar = this;
                        case 13:
                            if (dVar.u(i3, i5, i6, i4, obj)) {
                                zzxpVar.e(i7, unsafe.getInt(obj, j2));
                            }
                            i3 += 3;
                            i2 = 1048575;
                            dVar = this;
                        case 14:
                            if (dVar.u(i3, i5, i6, i4, obj)) {
                                zzxpVar.g(i7, unsafe.getLong(obj, j2));
                            }
                            i3 += 3;
                            i2 = 1048575;
                            dVar = this;
                        case 15:
                            if (dVar.u(i3, i5, i6, i4, obj)) {
                                int i10 = unsafe.getInt(obj, j2);
                                zzxpVar.d(i7, (i10 >> 31) ^ (i10 + i10));
                            }
                            i3 += 3;
                            i2 = 1048575;
                            dVar = this;
                        case 16:
                            if (dVar.u(i3, i5, i6, i4, obj)) {
                                long j3 = unsafe.getLong(obj, j2);
                                zzxpVar.f(i7, (j3 >> 63) ^ (j3 + j3));
                            }
                            i3 += 3;
                            i2 = 1048575;
                            dVar = this;
                        case 17:
                            if (dVar.u(i3, i5, i6, i4, obj)) {
                                Object object2 = unsafe.getObject(obj, j2);
                                zzxpVar.b(i7, 3);
                                dVar.n(i3).d((zzwz) object2, mxnVar);
                                zzxpVar.b(i7, 4);
                            }
                            i3 += 3;
                            i2 = 1048575;
                            dVar = this;
                        case 18:
                            z2 = false;
                            f.c(iArr2[i3], (List) unsafe.getObject(obj, j2), mxnVar, false);
                            i3 += 3;
                            i2 = 1048575;
                            dVar = this;
                        case 19:
                            z2 = false;
                            f.d(iArr2[i3], (List) unsafe.getObject(obj, j2), mxnVar, false);
                            i3 += 3;
                            i2 = 1048575;
                            dVar = this;
                        case 20:
                            z2 = false;
                            f.e(iArr2[i3], (List) unsafe.getObject(obj, j2), mxnVar, false);
                            i3 += 3;
                            i2 = 1048575;
                            dVar = this;
                        case 21:
                            z2 = false;
                            f.f(iArr2[i3], (List) unsafe.getObject(obj, j2), mxnVar, false);
                            i3 += 3;
                            i2 = 1048575;
                            dVar = this;
                        case 22:
                            z2 = false;
                            f.j(iArr2[i3], (List) unsafe.getObject(obj, j2), mxnVar, false);
                            i3 += 3;
                            i2 = 1048575;
                            dVar = this;
                        case 23:
                            z2 = false;
                            f.h(iArr2[i3], (List) unsafe.getObject(obj, j2), mxnVar, false);
                            i3 += 3;
                            i2 = 1048575;
                            dVar = this;
                        case 24:
                            z2 = false;
                            f.m(iArr2[i3], (List) unsafe.getObject(obj, j2), mxnVar, false);
                            i3 += 3;
                            i2 = 1048575;
                            dVar = this;
                        case 25:
                            z2 = false;
                            f.p(iArr2[i3], (List) unsafe.getObject(obj, j2), mxnVar, false);
                            i3 += 3;
                            i2 = 1048575;
                            dVar = this;
                        case 26:
                            int i11 = iArr2[i3];
                            List list = (List) unsafe.getObject(obj, j2);
                            ubf ubfVar = f.a;
                            if (list != null && !list.isEmpty()) {
                                if (list instanceof zzyu) {
                                    zzyu zzyuVar = (zzyu) list;
                                    for (int i12 = 0; i12 < list.size(); i12++) {
                                        Object zza = zzyuVar.zza();
                                        if (zza instanceof String) {
                                            zzxpVar.i(i11, (String) zza);
                                        } else {
                                            zzxpVar.j(i11, (zzxk) zza);
                                        }
                                    }
                                } else {
                                    for (int i13 = 0; i13 < list.size(); i13++) {
                                        zzxpVar.i(i11, (String) list.get(i13));
                                    }
                                }
                            }
                            i3 += 3;
                            i2 = 1048575;
                            dVar = this;
                            break;
                        case 27:
                            int i14 = iArr2[i3];
                            List list2 = (List) unsafe.getObject(obj, j2);
                            bgp n = dVar.n(i3);
                            ubf ubfVar2 = f.a;
                            if (list2 != null && !list2.isEmpty()) {
                                for (int i15 = 0; i15 < list2.size(); i15++) {
                                    mxnVar.f(i14, list2.get(i15), n);
                                }
                            }
                            i3 += 3;
                            i2 = 1048575;
                            dVar = this;
                            break;
                        case 28:
                            int i16 = iArr2[i3];
                            List list3 = (List) unsafe.getObject(obj, j2);
                            ubf ubfVar3 = f.a;
                            if (list3 != null && !list3.isEmpty()) {
                                for (int i17 = 0; i17 < list3.size(); i17++) {
                                    zzxpVar.j(i16, (zzxk) list3.get(i17));
                                }
                            }
                            i3 += 3;
                            i2 = 1048575;
                            dVar = this;
                            break;
                        case 29:
                            z2 = false;
                            f.k(iArr2[i3], (List) unsafe.getObject(obj, j2), mxnVar, false);
                            i3 += 3;
                            i2 = 1048575;
                            dVar = this;
                        case 30:
                            z2 = false;
                            f.o(iArr2[i3], (List) unsafe.getObject(obj, j2), mxnVar, false);
                            i3 += 3;
                            i2 = 1048575;
                            dVar = this;
                        case 31:
                            z2 = false;
                            f.n(iArr2[i3], (List) unsafe.getObject(obj, j2), mxnVar, false);
                            i3 += 3;
                            i2 = 1048575;
                            dVar = this;
                        case 32:
                            z2 = false;
                            f.i(iArr2[i3], (List) unsafe.getObject(obj, j2), mxnVar, false);
                            i3 += 3;
                            i2 = 1048575;
                            dVar = this;
                        case 33:
                            z2 = false;
                            f.l(iArr2[i3], (List) unsafe.getObject(obj, j2), mxnVar, false);
                            i3 += 3;
                            i2 = 1048575;
                            dVar = this;
                        case 34:
                            z2 = false;
                            f.g(iArr2[i3], (List) unsafe.getObject(obj, j2), mxnVar, false);
                            i3 += 3;
                            i2 = 1048575;
                            dVar = this;
                        case 35:
                            f.c(iArr2[i3], (List) unsafe.getObject(obj, j2), mxnVar, z);
                            i3 += 3;
                            i2 = 1048575;
                            dVar = this;
                        case 36:
                            f.d(iArr2[i3], (List) unsafe.getObject(obj, j2), mxnVar, z);
                            i3 += 3;
                            i2 = 1048575;
                            dVar = this;
                        case 37:
                            f.e(iArr2[i3], (List) unsafe.getObject(obj, j2), mxnVar, z);
                            i3 += 3;
                            i2 = 1048575;
                            dVar = this;
                        case 38:
                            f.f(iArr2[i3], (List) unsafe.getObject(obj, j2), mxnVar, z);
                            i3 += 3;
                            i2 = 1048575;
                            dVar = this;
                        case 39:
                            f.j(iArr2[i3], (List) unsafe.getObject(obj, j2), mxnVar, z);
                            i3 += 3;
                            i2 = 1048575;
                            dVar = this;
                        case 40:
                            f.h(iArr2[i3], (List) unsafe.getObject(obj, j2), mxnVar, z);
                            i3 += 3;
                            i2 = 1048575;
                            dVar = this;
                        case 41:
                            f.m(iArr2[i3], (List) unsafe.getObject(obj, j2), mxnVar, z);
                            i3 += 3;
                            i2 = 1048575;
                            dVar = this;
                        case 42:
                            f.p(iArr2[i3], (List) unsafe.getObject(obj, j2), mxnVar, z);
                            i3 += 3;
                            i2 = 1048575;
                            dVar = this;
                        case 43:
                            f.k(iArr2[i3], (List) unsafe.getObject(obj, j2), mxnVar, z);
                            i3 += 3;
                            i2 = 1048575;
                            dVar = this;
                        case 44:
                            f.o(iArr2[i3], (List) unsafe.getObject(obj, j2), mxnVar, z);
                            i3 += 3;
                            i2 = 1048575;
                            dVar = this;
                        case 45:
                            f.n(iArr2[i3], (List) unsafe.getObject(obj, j2), mxnVar, z);
                            i3 += 3;
                            i2 = 1048575;
                            dVar = this;
                        case 46:
                            f.i(iArr2[i3], (List) unsafe.getObject(obj, j2), mxnVar, z);
                            i3 += 3;
                            i2 = 1048575;
                            dVar = this;
                        case 47:
                            f.l(iArr2[i3], (List) unsafe.getObject(obj, j2), mxnVar, z);
                            i3 += 3;
                            i2 = 1048575;
                            dVar = this;
                        case 48:
                            f.g(iArr2[i3], (List) unsafe.getObject(obj, j2), mxnVar, z);
                            i3 += 3;
                            i2 = 1048575;
                            dVar = this;
                        case 49:
                            int i18 = iArr2[i3];
                            List list4 = (List) unsafe.getObject(obj, j2);
                            bgp n2 = dVar.n(i3);
                            ubf ubfVar4 = f.a;
                            if (list4 != null && !list4.isEmpty()) {
                                for (int i19 = 0; i19 < list4.size(); i19++) {
                                    zzwz zzwzVar = (zzwz) list4.get(i19);
                                    zzxpVar.b(i18, 3);
                                    n2.d(zzwzVar, mxnVar);
                                    zzxpVar.b(i18, 4);
                                }
                            }
                            i3 += 3;
                            i2 = 1048575;
                            dVar = this;
                            break;
                        case 50:
                            if (unsafe.getObject(obj, j2) != null) {
                                int i20 = i3 / 3;
                                throw null;
                            }
                            i3 += 3;
                            i2 = 1048575;
                            dVar = this;
                        case 51:
                            if (dVar.j(i7, i3, obj)) {
                                zzxpVar.g(i7, Double.doubleToRawLongBits(((Double) f5n.h(obj, j2)).doubleValue()));
                            }
                            i3 += 3;
                            i2 = 1048575;
                            dVar = this;
                        case 52:
                            if (dVar.j(i7, i3, obj)) {
                                zzxpVar.e(i7, Float.floatToRawIntBits(((Float) f5n.h(obj, j2)).floatValue()));
                            }
                            i3 += 3;
                            i2 = 1048575;
                            dVar = this;
                        case 53:
                            if (dVar.j(i7, i3, obj)) {
                                zzxpVar.f(i7, s(obj, j2));
                            }
                            i3 += 3;
                            i2 = 1048575;
                            dVar = this;
                        case 54:
                            if (dVar.j(i7, i3, obj)) {
                                zzxpVar.f(i7, s(obj, j2));
                            }
                            i3 += 3;
                            i2 = 1048575;
                            dVar = this;
                        case 55:
                            if (dVar.j(i7, i3, obj)) {
                                zzxpVar.c(i7, r(obj, j2));
                            }
                            i3 += 3;
                            i2 = 1048575;
                            dVar = this;
                        case 56:
                            if (dVar.j(i7, i3, obj)) {
                                zzxpVar.g(i7, s(obj, j2));
                            }
                            i3 += 3;
                            i2 = 1048575;
                            dVar = this;
                        case 57:
                            if (dVar.j(i7, i3, obj)) {
                                zzxpVar.e(i7, r(obj, j2));
                            }
                            i3 += 3;
                            i2 = 1048575;
                            dVar = this;
                        case 58:
                            if (dVar.j(i7, i3, obj)) {
                                zzxpVar.h(i7, ((Boolean) f5n.h(obj, j2)).booleanValue());
                            }
                            i3 += 3;
                            i2 = 1048575;
                            dVar = this;
                        case 59:
                            if (dVar.j(i7, i3, obj)) {
                                Object object3 = unsafe.getObject(obj, j2);
                                if (object3 instanceof String) {
                                    zzxpVar.i(i7, (String) object3);
                                } else {
                                    zzxpVar.j(i7, (zzxk) object3);
                                }
                            }
                            i3 += 3;
                            i2 = 1048575;
                            dVar = this;
                        case 60:
                            if (dVar.j(i7, i3, obj)) {
                                mxnVar.f(i7, unsafe.getObject(obj, j2), dVar.n(i3));
                            }
                            i3 += 3;
                            i2 = 1048575;
                            dVar = this;
                        case 61:
                            if (dVar.j(i7, i3, obj)) {
                                zzxpVar.j(i7, (zzxk) unsafe.getObject(obj, j2));
                            }
                            i3 += 3;
                            i2 = 1048575;
                            dVar = this;
                        case 62:
                            if (dVar.j(i7, i3, obj)) {
                                zzxpVar.d(i7, r(obj, j2));
                            }
                            i3 += 3;
                            i2 = 1048575;
                            dVar = this;
                        case 63:
                            if (dVar.j(i7, i3, obj)) {
                                zzxpVar.c(i7, r(obj, j2));
                            }
                            i3 += 3;
                            i2 = 1048575;
                            dVar = this;
                        case 64:
                            if (dVar.j(i7, i3, obj)) {
                                zzxpVar.e(i7, r(obj, j2));
                            }
                            i3 += 3;
                            i2 = 1048575;
                            dVar = this;
                        case 65:
                            if (dVar.j(i7, i3, obj)) {
                                zzxpVar.g(i7, s(obj, j2));
                            }
                            i3 += 3;
                            i2 = 1048575;
                            dVar = this;
                        case 66:
                            if (dVar.j(i7, i3, obj)) {
                                int r = r(obj, j2);
                                zzxpVar.d(i7, (r >> 31) ^ (r + r));
                            }
                            i3 += 3;
                            i2 = 1048575;
                            dVar = this;
                        case 67:
                            if (dVar.j(i7, i3, obj)) {
                                long s = s(obj, j2);
                                zzxpVar.f(i7, (s >> 63) ^ (s + s));
                            }
                            i3 += 3;
                            i2 = 1048575;
                            dVar = this;
                        case 68:
                            if (dVar.j(i7, i3, obj)) {
                                Object object4 = unsafe.getObject(obj, j2);
                                zzxpVar.b(i7, 3);
                                dVar.n(i3).d((zzwz) object4, mxnVar);
                                zzxpVar.b(i7, 4);
                            }
                            i3 += 3;
                            i2 = 1048575;
                            dVar = this;
                        default:
                            i3 += 3;
                            i2 = 1048575;
                            dVar = this;
                    }
                }
            }
        }
        entry = null;
        i2 = 1048575;
        int i52 = 1048575;
        i3 = 0;
        int i62 = 0;
        while (true) {
            iArr = dVar.a;
            if (i3 < iArr.length) {
            }
            i3 += 3;
            i2 = 1048575;
            dVar = this;
        }
    }

    @Override // defpackage.bgp
    public final int e(zzyd zzydVar) {
        int i2;
        int s;
        int t;
        int s2;
        int m;
        int s3;
        int z;
        int i3;
        int a;
        int s4;
        int size;
        int r;
        int s5;
        int s6;
        int s7;
        int size2;
        int s8;
        int s9;
        int i4;
        int s10;
        int t2;
        d dVar = this;
        zzyd zzydVar2 = zzydVar;
        int i5 = 1048575;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 1048575;
        while (true) {
            int[] iArr = dVar.a;
            if (i6 >= iArr.length) {
                zzaae zzaaeVar = zzydVar2.zzc;
                int i10 = zzaaeVar.c;
                if (i10 == -1) {
                    zzaaeVar.c = 0;
                    i10 = 0;
                }
                int i11 = i10 + i8;
                if (!dVar.d) {
                    return i11;
                }
                ggp ggpVar = ((zzyb) zzydVar2).zzb.a;
                int i12 = ggpVar.b;
                int i13 = 0;
                for (int i14 = 0; i14 < i12; i14++) {
                    igp a2 = ggpVar.a(i14);
                    i13 += tcp.e((zzxv) a2.a, a2.b);
                }
                for (Map.Entry entry : ggpVar.c()) {
                    i13 += tcp.e((zzxv) entry.getKey(), entry.getValue());
                }
                return i11 + i13;
            }
            int o = dVar.o(i6);
            int p = p(o);
            int i15 = iArr[i6];
            int i16 = iArr[i6 + 2];
            int i17 = i16 & i5;
            Unsafe unsafe = j;
            if (p <= 17) {
                if (i17 != i9) {
                    i7 = i17 == i5 ? 0 : unsafe.getInt(zzydVar2, i17);
                    i9 = i17;
                }
                i2 = 1 << (i16 >>> 20);
            } else {
                i2 = 0;
            }
            int i18 = o & i5;
            if (p >= zzxx.b.a) {
                int i19 = zzxx.c.a;
            }
            long j2 = i18;
            switch (p) {
                case 0:
                    if (dVar.u(i6, i9, i7, i2, zzydVar2)) {
                        i8 = ceo.j(i15 << 3, 8, i8);
                    }
                    i6 += 3;
                    i5 = 1048575;
                case 1:
                    if (dVar.u(i6, i9, i7, i2, zzydVar2)) {
                        i8 = ceo.j(i15 << 3, 4, i8);
                    }
                    dVar = this;
                    zzydVar2 = zzydVar;
                    i6 += 3;
                    i5 = 1048575;
                case 2:
                    if (dVar.u(i6, i9, i7, i2, zzydVar2)) {
                        long j3 = unsafe.getLong(zzydVar2, j2);
                        s = zzxp.s(i15 << 3);
                        t = zzxp.t(j3);
                        i8 += t + s;
                    }
                    dVar = this;
                    i6 += 3;
                    i5 = 1048575;
                case 3:
                    if (dVar.u(i6, i9, i7, i2, zzydVar2)) {
                        long j4 = unsafe.getLong(zzydVar2, j2);
                        s = zzxp.s(i15 << 3);
                        t = zzxp.t(j4);
                        i8 += t + s;
                    }
                    dVar = this;
                    i6 += 3;
                    i5 = 1048575;
                case 4:
                    if (dVar.u(i6, i9, i7, i2, zzydVar2)) {
                        long j5 = unsafe.getInt(zzydVar2, j2);
                        s = zzxp.s(i15 << 3);
                        t = zzxp.t(j5);
                        i8 += t + s;
                    }
                    dVar = this;
                    i6 += 3;
                    i5 = 1048575;
                case 5:
                    if (dVar.u(i6, i9, i7, i2, zzydVar2)) {
                        i8 = ceo.j(i15 << 3, 8, i8);
                    }
                    dVar = this;
                    zzydVar2 = zzydVar;
                    i6 += 3;
                    i5 = 1048575;
                case 6:
                    if (dVar.u(i6, i9, i7, i2, zzydVar2)) {
                        i8 = ceo.j(i15 << 3, 4, i8);
                    }
                    dVar = this;
                    zzydVar2 = zzydVar;
                    i6 += 3;
                    i5 = 1048575;
                case 7:
                    if (dVar.u(i6, i9, i7, i2, zzydVar2)) {
                        i8 = ceo.j(i15 << 3, 1, i8);
                    }
                    dVar = this;
                    zzydVar2 = zzydVar;
                    i6 += 3;
                    i5 = 1048575;
                case 8:
                    if (dVar.u(i6, i9, i7, i2, zzydVar2)) {
                        int i20 = i15 << 3;
                        Object object = unsafe.getObject(zzydVar2, j2);
                        if (object instanceof zzxk) {
                            s2 = zzxp.s(i20);
                            m = ((zzxk) object).m();
                            s3 = zzxp.s(m);
                            i8 += s3 + m + s2;
                        } else {
                            s = zzxp.s(i20);
                            t = zzxp.u((String) object);
                            i8 += t + s;
                        }
                    }
                    dVar = this;
                    i6 += 3;
                    i5 = 1048575;
                case 9:
                    if (dVar.u(i6, i9, i7, i2, zzydVar2)) {
                        z = f.z(i15, unsafe.getObject(zzydVar2, j2), dVar.n(i6));
                        i8 += z;
                        i6 += 3;
                        i5 = 1048575;
                    } else {
                        i6 += 3;
                        i5 = 1048575;
                    }
                case 10:
                    if (dVar.u(i6, i9, i7, i2, zzydVar2)) {
                        zzxk zzxkVar = (zzxk) unsafe.getObject(zzydVar2, j2);
                        s2 = zzxp.s(i15 << 3);
                        m = zzxkVar.m();
                        s3 = zzxp.s(m);
                        i8 += s3 + m + s2;
                    }
                    dVar = this;
                    i6 += 3;
                    i5 = 1048575;
                case 11:
                    if (dVar.u(i6, i9, i7, i2, zzydVar2)) {
                        i8 = ceo.j(unsafe.getInt(zzydVar2, j2), zzxp.s(i15 << 3), i8);
                    }
                    dVar = this;
                    i6 += 3;
                    i5 = 1048575;
                case 12:
                    if (dVar.u(i6, i9, i7, i2, zzydVar2)) {
                        long j6 = unsafe.getInt(zzydVar2, j2);
                        s = zzxp.s(i15 << 3);
                        t = zzxp.t(j6);
                        i8 += t + s;
                    }
                    dVar = this;
                    i6 += 3;
                    i5 = 1048575;
                case 13:
                    if (dVar.u(i6, i9, i7, i2, zzydVar2)) {
                        i8 = ceo.j(i15 << 3, 4, i8);
                    }
                    dVar = this;
                    zzydVar2 = zzydVar;
                    i6 += 3;
                    i5 = 1048575;
                case 14:
                    if (dVar.u(i6, i9, i7, i2, zzydVar2)) {
                        i8 = ceo.j(i15 << 3, 8, i8);
                    }
                    dVar = this;
                    zzydVar2 = zzydVar;
                    i6 += 3;
                    i5 = 1048575;
                case 15:
                    if (dVar.u(i6, i9, i7, i2, zzydVar2)) {
                        int i21 = unsafe.getInt(zzydVar2, j2);
                        i8 = ceo.j((i21 >> 31) ^ (i21 + i21), zzxp.s(i15 << 3), i8);
                    }
                    dVar = this;
                    i6 += 3;
                    i5 = 1048575;
                case 16:
                    if (dVar.u(i6, i9, i7, i2, zzydVar2)) {
                        long j7 = unsafe.getLong(zzydVar2, j2);
                        s = zzxp.s(i15 << 3);
                        t = zzxp.t((j7 >> 63) ^ (j7 + j7));
                        i8 += t + s;
                    }
                    dVar = this;
                    i6 += 3;
                    i5 = 1048575;
                case 17:
                    if (dVar.u(i6, i9, i7, i2, zzydVar2)) {
                        zzzi zzziVar = (zzzi) unsafe.getObject(zzydVar2, j2);
                        bgp n = dVar.n(i6);
                        ubf ubfVar = f.a;
                        int s11 = zzxp.s(i15 << 3);
                        i3 = s11 + s11;
                        a = ((zzwz) zzziVar).a(n);
                        z = a + i3;
                        i8 += z;
                        i6 += 3;
                        i5 = 1048575;
                    } else {
                        i6 += 3;
                        i5 = 1048575;
                    }
                case 18:
                    z = f.y(i15, (List) unsafe.getObject(zzydVar2, j2));
                    i8 += z;
                    i6 += 3;
                    i5 = 1048575;
                case 19:
                    z = f.x(i15, (List) unsafe.getObject(zzydVar2, j2));
                    i8 += z;
                    i6 += 3;
                    i5 = 1048575;
                case 20:
                    List list = (List) unsafe.getObject(zzydVar2, j2);
                    ubf ubfVar2 = f.a;
                    if (list.size() != 0) {
                        s4 = (zzxp.s(i15 << 3) * list.size()) + f.q(list);
                        i8 += s4;
                        i6 += 3;
                        i5 = 1048575;
                    }
                    s4 = 0;
                    i8 += s4;
                    i6 += 3;
                    i5 = 1048575;
                case 21:
                    List list2 = (List) unsafe.getObject(zzydVar2, j2);
                    ubf ubfVar3 = f.a;
                    size = list2.size();
                    if (size != 0) {
                        r = f.r(list2);
                        s5 = zzxp.s(i15 << 3);
                        s6 = (s5 * size) + r;
                        i8 += s6;
                        i6 += 3;
                        i5 = 1048575;
                    }
                    s6 = 0;
                    i8 += s6;
                    i6 += 3;
                    i5 = 1048575;
                case 22:
                    List list3 = (List) unsafe.getObject(zzydVar2, j2);
                    ubf ubfVar4 = f.a;
                    size = list3.size();
                    if (size != 0) {
                        r = f.u(list3);
                        s5 = zzxp.s(i15 << 3);
                        s6 = (s5 * size) + r;
                        i8 += s6;
                        i6 += 3;
                        i5 = 1048575;
                    }
                    s6 = 0;
                    i8 += s6;
                    i6 += 3;
                    i5 = 1048575;
                case 23:
                    z = f.y(i15, (List) unsafe.getObject(zzydVar2, j2));
                    i8 += z;
                    i6 += 3;
                    i5 = 1048575;
                case 24:
                    z = f.x(i15, (List) unsafe.getObject(zzydVar2, j2));
                    i8 += z;
                    i6 += 3;
                    i5 = 1048575;
                case 25:
                    List list4 = (List) unsafe.getObject(zzydVar2, j2);
                    ubf ubfVar5 = f.a;
                    int size3 = list4.size();
                    if (size3 != 0) {
                        s4 = (zzxp.s(i15 << 3) + 1) * size3;
                        i8 += s4;
                        i6 += 3;
                        i5 = 1048575;
                    }
                    s4 = 0;
                    i8 += s4;
                    i6 += 3;
                    i5 = 1048575;
                case 26:
                    List list5 = (List) unsafe.getObject(zzydVar2, j2);
                    ubf ubfVar6 = f.a;
                    int size4 = list5.size();
                    if (size4 != 0) {
                        s6 = zzxp.s(i15 << 3) * size4;
                        if (list5 instanceof zzyu) {
                            zzyu zzyuVar = (zzyu) list5;
                            for (int i22 = 0; i22 < size4; i22++) {
                                Object zza = zzyuVar.zza();
                                if (zza instanceof zzxk) {
                                    int m2 = ((zzxk) zza).m();
                                    s6 = ceo.j(m2, m2, s6);
                                } else {
                                    s6 = zzxp.u((String) zza) + s6;
                                }
                            }
                        } else {
                            for (int i23 = 0; i23 < size4; i23++) {
                                Object obj = list5.get(i23);
                                if (obj instanceof zzxk) {
                                    int m3 = ((zzxk) obj).m();
                                    s6 = ceo.j(m3, m3, s6);
                                } else {
                                    s6 = zzxp.u((String) obj) + s6;
                                }
                            }
                        }
                        i8 += s6;
                        i6 += 3;
                        i5 = 1048575;
                    }
                    s6 = 0;
                    i8 += s6;
                    i6 += 3;
                    i5 = 1048575;
                case 27:
                    List list6 = (List) unsafe.getObject(zzydVar2, j2);
                    bgp n2 = dVar.n(i6);
                    ubf ubfVar7 = f.a;
                    int size5 = list6.size();
                    if (size5 == 0) {
                        s7 = 0;
                    } else {
                        s7 = zzxp.s(i15 << 3) * size5;
                        for (int i24 = 0; i24 < size5; i24++) {
                            Object obj2 = list6.get(i24);
                            if (obj2 instanceof zzyt) {
                                int a3 = ((zzyt) obj2).a();
                                s7 = ceo.j(a3, a3, s7);
                            } else {
                                int a4 = ((zzwz) obj2).a(n2);
                                s7 = ceo.j(a4, a4, s7);
                            }
                        }
                    }
                    i8 += s7;
                    i6 += 3;
                    i5 = 1048575;
                case 28:
                    List list7 = (List) unsafe.getObject(zzydVar2, j2);
                    ubf ubfVar8 = f.a;
                    int size6 = list7.size();
                    if (size6 != 0) {
                        s6 = zzxp.s(i15 << 3) * size6;
                        for (int i25 = 0; i25 < list7.size(); i25++) {
                            int m4 = ((zzxk) list7.get(i25)).m();
                            s6 = ceo.j(m4, m4, s6);
                        }
                        i8 += s6;
                        i6 += 3;
                        i5 = 1048575;
                    }
                    s6 = 0;
                    i8 += s6;
                    i6 += 3;
                    i5 = 1048575;
                case 29:
                    List list8 = (List) unsafe.getObject(zzydVar2, j2);
                    ubf ubfVar9 = f.a;
                    size = list8.size();
                    if (size != 0) {
                        r = f.v(list8);
                        s5 = zzxp.s(i15 << 3);
                        s6 = (s5 * size) + r;
                        i8 += s6;
                        i6 += 3;
                        i5 = 1048575;
                    }
                    s6 = 0;
                    i8 += s6;
                    i6 += 3;
                    i5 = 1048575;
                case 30:
                    List list9 = (List) unsafe.getObject(zzydVar2, j2);
                    ubf ubfVar10 = f.a;
                    size = list9.size();
                    if (size != 0) {
                        r = f.t(list9);
                        s5 = zzxp.s(i15 << 3);
                        s6 = (s5 * size) + r;
                        i8 += s6;
                        i6 += 3;
                        i5 = 1048575;
                    }
                    s6 = 0;
                    i8 += s6;
                    i6 += 3;
                    i5 = 1048575;
                case 31:
                    z = f.x(i15, (List) unsafe.getObject(zzydVar2, j2));
                    i8 += z;
                    i6 += 3;
                    i5 = 1048575;
                case 32:
                    z = f.y(i15, (List) unsafe.getObject(zzydVar2, j2));
                    i8 += z;
                    i6 += 3;
                    i5 = 1048575;
                case 33:
                    List list10 = (List) unsafe.getObject(zzydVar2, j2);
                    ubf ubfVar11 = f.a;
                    size = list10.size();
                    if (size != 0) {
                        r = f.w(list10);
                        s5 = zzxp.s(i15 << 3);
                        s6 = (s5 * size) + r;
                        i8 += s6;
                        i6 += 3;
                        i5 = 1048575;
                    }
                    s6 = 0;
                    i8 += s6;
                    i6 += 3;
                    i5 = 1048575;
                case 34:
                    List list11 = (List) unsafe.getObject(zzydVar2, j2);
                    ubf ubfVar12 = f.a;
                    size = list11.size();
                    if (size != 0) {
                        r = f.s(list11);
                        s5 = zzxp.s(i15 << 3);
                        s6 = (s5 * size) + r;
                        i8 += s6;
                        i6 += 3;
                        i5 = 1048575;
                    }
                    s6 = 0;
                    i8 += s6;
                    i6 += 3;
                    i5 = 1048575;
                case 35:
                    List list12 = (List) unsafe.getObject(zzydVar2, j2);
                    ubf ubfVar13 = f.a;
                    size2 = list12.size() * 8;
                    if (size2 > 0) {
                        s8 = zzxp.s(i15 << 3);
                        s9 = zzxp.s(size2);
                        i8 += s9 + s8 + size2;
                        i6 += 3;
                        i5 = 1048575;
                    } else {
                        i6 += 3;
                        i5 = 1048575;
                    }
                case 36:
                    List list13 = (List) unsafe.getObject(zzydVar2, j2);
                    ubf ubfVar14 = f.a;
                    size2 = list13.size() * 4;
                    if (size2 > 0) {
                        s8 = zzxp.s(i15 << 3);
                        s9 = zzxp.s(size2);
                        i8 += s9 + s8 + size2;
                        i6 += 3;
                        i5 = 1048575;
                    } else {
                        i6 += 3;
                        i5 = 1048575;
                    }
                case 37:
                    size2 = f.q((List) unsafe.getObject(zzydVar2, j2));
                    if (size2 > 0) {
                        s8 = zzxp.s(i15 << 3);
                        s9 = zzxp.s(size2);
                        i8 += s9 + s8 + size2;
                        i6 += 3;
                        i5 = 1048575;
                    } else {
                        i6 += 3;
                        i5 = 1048575;
                    }
                case 38:
                    size2 = f.r((List) unsafe.getObject(zzydVar2, j2));
                    if (size2 > 0) {
                        s8 = zzxp.s(i15 << 3);
                        s9 = zzxp.s(size2);
                        i8 += s9 + s8 + size2;
                        i6 += 3;
                        i5 = 1048575;
                    } else {
                        i6 += 3;
                        i5 = 1048575;
                    }
                case 39:
                    size2 = f.u((List) unsafe.getObject(zzydVar2, j2));
                    if (size2 > 0) {
                        s8 = zzxp.s(i15 << 3);
                        s9 = zzxp.s(size2);
                        i8 += s9 + s8 + size2;
                        i6 += 3;
                        i5 = 1048575;
                    } else {
                        i6 += 3;
                        i5 = 1048575;
                    }
                case 40:
                    List list14 = (List) unsafe.getObject(zzydVar2, j2);
                    ubf ubfVar15 = f.a;
                    size2 = list14.size() * 8;
                    if (size2 > 0) {
                        s8 = zzxp.s(i15 << 3);
                        s9 = zzxp.s(size2);
                        i8 += s9 + s8 + size2;
                        i6 += 3;
                        i5 = 1048575;
                    } else {
                        i6 += 3;
                        i5 = 1048575;
                    }
                case 41:
                    List list15 = (List) unsafe.getObject(zzydVar2, j2);
                    ubf ubfVar16 = f.a;
                    size2 = list15.size() * 4;
                    if (size2 > 0) {
                        s8 = zzxp.s(i15 << 3);
                        s9 = zzxp.s(size2);
                        i8 += s9 + s8 + size2;
                        i6 += 3;
                        i5 = 1048575;
                    } else {
                        i6 += 3;
                        i5 = 1048575;
                    }
                case 42:
                    List list16 = (List) unsafe.getObject(zzydVar2, j2);
                    ubf ubfVar17 = f.a;
                    size2 = list16.size();
                    if (size2 > 0) {
                        s8 = zzxp.s(i15 << 3);
                        s9 = zzxp.s(size2);
                        i8 += s9 + s8 + size2;
                        i6 += 3;
                        i5 = 1048575;
                    } else {
                        i6 += 3;
                        i5 = 1048575;
                    }
                case 43:
                    size2 = f.v((List) unsafe.getObject(zzydVar2, j2));
                    if (size2 > 0) {
                        s8 = zzxp.s(i15 << 3);
                        s9 = zzxp.s(size2);
                        i8 += s9 + s8 + size2;
                        i6 += 3;
                        i5 = 1048575;
                    } else {
                        i6 += 3;
                        i5 = 1048575;
                    }
                case 44:
                    size2 = f.t((List) unsafe.getObject(zzydVar2, j2));
                    if (size2 > 0) {
                        s8 = zzxp.s(i15 << 3);
                        s9 = zzxp.s(size2);
                        i8 += s9 + s8 + size2;
                        i6 += 3;
                        i5 = 1048575;
                    } else {
                        i6 += 3;
                        i5 = 1048575;
                    }
                case 45:
                    List list17 = (List) unsafe.getObject(zzydVar2, j2);
                    ubf ubfVar18 = f.a;
                    size2 = list17.size() * 4;
                    if (size2 > 0) {
                        s8 = zzxp.s(i15 << 3);
                        s9 = zzxp.s(size2);
                        i8 += s9 + s8 + size2;
                        i6 += 3;
                        i5 = 1048575;
                    } else {
                        i6 += 3;
                        i5 = 1048575;
                    }
                case 46:
                    List list18 = (List) unsafe.getObject(zzydVar2, j2);
                    ubf ubfVar19 = f.a;
                    size2 = list18.size() * 8;
                    if (size2 > 0) {
                        s8 = zzxp.s(i15 << 3);
                        s9 = zzxp.s(size2);
                        i8 += s9 + s8 + size2;
                        i6 += 3;
                        i5 = 1048575;
                    } else {
                        i6 += 3;
                        i5 = 1048575;
                    }
                case 47:
                    size2 = f.w((List) unsafe.getObject(zzydVar2, j2));
                    if (size2 > 0) {
                        s8 = zzxp.s(i15 << 3);
                        s9 = zzxp.s(size2);
                        i8 += s9 + s8 + size2;
                        i6 += 3;
                        i5 = 1048575;
                    } else {
                        i6 += 3;
                        i5 = 1048575;
                    }
                case 48:
                    size2 = f.s((List) unsafe.getObject(zzydVar2, j2));
                    if (size2 > 0) {
                        s8 = zzxp.s(i15 << 3);
                        s9 = zzxp.s(size2);
                        i8 += s9 + s8 + size2;
                        i6 += 3;
                        i5 = 1048575;
                    } else {
                        i6 += 3;
                        i5 = 1048575;
                    }
                case 49:
                    List list19 = (List) unsafe.getObject(zzydVar2, j2);
                    bgp n3 = dVar.n(i6);
                    ubf ubfVar20 = f.a;
                    int size7 = list19.size();
                    if (size7 == 0) {
                        i4 = 0;
                    } else {
                        i4 = 0;
                        for (int i26 = 0; i26 < size7; i26++) {
                            zzzi zzziVar2 = (zzzi) list19.get(i26);
                            int s12 = zzxp.s(i15 << 3);
                            i4 += ((zzwz) zzziVar2).a(n3) + s12 + s12;
                        }
                    }
                    i8 += i4;
                    i6 += 3;
                    i5 = 1048575;
                case 50:
                    int i27 = i6 / 3;
                    zzzc zzzcVar = (zzzc) unsafe.getObject(zzydVar2, j2);
                    if (zzzcVar.isEmpty()) {
                        continue;
                    } else {
                        Iterator it = zzzcVar.entrySet().iterator();
                        if (it.hasNext()) {
                            Map.Entry entry2 = (Map.Entry) it.next();
                            entry2.getKey();
                            entry2.getValue();
                            throw null;
                        }
                    }
                    i6 += 3;
                    i5 = 1048575;
                case 51:
                    if (dVar.j(i15, i6, zzydVar2)) {
                        i8 = ceo.j(i15 << 3, 8, i8);
                    }
                    i6 += 3;
                    i5 = 1048575;
                case 52:
                    if (dVar.j(i15, i6, zzydVar2)) {
                        i8 = ceo.j(i15 << 3, 4, i8);
                    }
                    i6 += 3;
                    i5 = 1048575;
                case 53:
                    if (dVar.j(i15, i6, zzydVar2)) {
                        long s13 = s(zzydVar2, j2);
                        s10 = zzxp.s(i15 << 3);
                        t2 = zzxp.t(s13);
                        i8 += t2 + s10;
                        i6 += 3;
                        i5 = 1048575;
                    } else {
                        i6 += 3;
                        i5 = 1048575;
                    }
                case 54:
                    if (dVar.j(i15, i6, zzydVar2)) {
                        long s14 = s(zzydVar2, j2);
                        s10 = zzxp.s(i15 << 3);
                        t2 = zzxp.t(s14);
                        i8 += t2 + s10;
                        i6 += 3;
                        i5 = 1048575;
                    } else {
                        i6 += 3;
                        i5 = 1048575;
                    }
                case 55:
                    if (dVar.j(i15, i6, zzydVar2)) {
                        long r2 = r(zzydVar2, j2);
                        s10 = zzxp.s(i15 << 3);
                        t2 = zzxp.t(r2);
                        i8 += t2 + s10;
                        i6 += 3;
                        i5 = 1048575;
                    } else {
                        i6 += 3;
                        i5 = 1048575;
                    }
                case 56:
                    if (dVar.j(i15, i6, zzydVar2)) {
                        i8 = ceo.j(i15 << 3, 8, i8);
                    }
                    i6 += 3;
                    i5 = 1048575;
                case 57:
                    if (dVar.j(i15, i6, zzydVar2)) {
                        i8 = ceo.j(i15 << 3, 4, i8);
                    }
                    i6 += 3;
                    i5 = 1048575;
                case 58:
                    if (dVar.j(i15, i6, zzydVar2)) {
                        i8 = ceo.j(i15 << 3, 1, i8);
                    }
                    i6 += 3;
                    i5 = 1048575;
                case 59:
                    if (dVar.j(i15, i6, zzydVar2)) {
                        int i28 = i15 << 3;
                        Object object2 = unsafe.getObject(zzydVar2, j2);
                        if (object2 instanceof zzxk) {
                            size2 = zzxp.s(i28);
                            s8 = ((zzxk) object2).m();
                            s9 = zzxp.s(s8);
                            i8 += s9 + s8 + size2;
                            i6 += 3;
                            i5 = 1048575;
                        } else {
                            s10 = zzxp.s(i28);
                            t2 = zzxp.u((String) object2);
                            i8 += t2 + s10;
                            i6 += 3;
                            i5 = 1048575;
                        }
                    } else {
                        i6 += 3;
                        i5 = 1048575;
                    }
                case 60:
                    if (dVar.j(i15, i6, zzydVar2)) {
                        z = f.z(i15, unsafe.getObject(zzydVar2, j2), dVar.n(i6));
                        i8 += z;
                        i6 += 3;
                        i5 = 1048575;
                    } else {
                        i6 += 3;
                        i5 = 1048575;
                    }
                case 61:
                    if (dVar.j(i15, i6, zzydVar2)) {
                        zzxk zzxkVar2 = (zzxk) unsafe.getObject(zzydVar2, j2);
                        size2 = zzxp.s(i15 << 3);
                        s8 = zzxkVar2.m();
                        s9 = zzxp.s(s8);
                        i8 += s9 + s8 + size2;
                        i6 += 3;
                        i5 = 1048575;
                    } else {
                        i6 += 3;
                        i5 = 1048575;
                    }
                case 62:
                    if (dVar.j(i15, i6, zzydVar2)) {
                        i8 = ceo.j(r(zzydVar2, j2), zzxp.s(i15 << 3), i8);
                    }
                    i6 += 3;
                    i5 = 1048575;
                case 63:
                    if (dVar.j(i15, i6, zzydVar2)) {
                        long r3 = r(zzydVar2, j2);
                        s10 = zzxp.s(i15 << 3);
                        t2 = zzxp.t(r3);
                        i8 += t2 + s10;
                        i6 += 3;
                        i5 = 1048575;
                    } else {
                        i6 += 3;
                        i5 = 1048575;
                    }
                case 64:
                    if (dVar.j(i15, i6, zzydVar2)) {
                        i8 = ceo.j(i15 << 3, 4, i8);
                    }
                    i6 += 3;
                    i5 = 1048575;
                case 65:
                    if (dVar.j(i15, i6, zzydVar2)) {
                        i8 = ceo.j(i15 << 3, 8, i8);
                    }
                    i6 += 3;
                    i5 = 1048575;
                case 66:
                    if (dVar.j(i15, i6, zzydVar2)) {
                        int r4 = r(zzydVar2, j2);
                        i8 = ceo.j((r4 >> 31) ^ (r4 + r4), zzxp.s(i15 << 3), i8);
                    }
                    i6 += 3;
                    i5 = 1048575;
                case 67:
                    if (dVar.j(i15, i6, zzydVar2)) {
                        long s15 = s(zzydVar2, j2);
                        s10 = zzxp.s(i15 << 3);
                        t2 = zzxp.t((s15 >> 63) ^ (s15 + s15));
                        i8 += t2 + s10;
                        i6 += 3;
                        i5 = 1048575;
                    } else {
                        i6 += 3;
                        i5 = 1048575;
                    }
                case 68:
                    if (dVar.j(i15, i6, zzydVar2)) {
                        zzzi zzziVar3 = (zzzi) unsafe.getObject(zzydVar2, j2);
                        bgp n4 = dVar.n(i6);
                        ubf ubfVar21 = f.a;
                        int s16 = zzxp.s(i15 << 3);
                        i3 = s16 + s16;
                        a = ((zzwz) zzziVar3).a(n4);
                        z = a + i3;
                        i8 += z;
                        i6 += 3;
                        i5 = 1048575;
                    } else {
                        i6 += 3;
                        i5 = 1048575;
                    }
                default:
                    i6 += 3;
                    i5 = 1048575;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x01ea, code lost:
    
        if (r2 != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00d9, code lost:
    
        if (r2 != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00db, code lost:
    
        r6 = 1231;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00dc, code lost:
    
        r1 = r6 + r1;
     */
    @Override // defpackage.bgp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int f(zzyd zzydVar) {
        int i2;
        long doubleToLongBits;
        int i3;
        int floatToIntBits;
        int i4;
        int i5;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            int[] iArr = this.a;
            if (i6 >= iArr.length) {
                zzydVar.zzc.getClass();
                int i8 = (i7 * 53) + 506991;
                if (!this.d) {
                    return i8;
                }
                return ((zzyb) zzydVar).zzb.a.hashCode() + (i8 * 53);
            }
            int o = o(i6);
            int i9 = 1048575 & o;
            int p = p(o);
            int i10 = iArr[i6];
            long j2 = i9;
            int i11 = 1237;
            int i12 = 37;
            switch (p) {
                case 0:
                    i2 = i7 * 53;
                    doubleToLongBits = Double.doubleToLongBits(f5n.c.C(zzydVar, j2));
                    Charset charset = zzym.a;
                    i7 = i2 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 1:
                    i3 = i7 * 53;
                    floatToIntBits = Float.floatToIntBits(f5n.c.v(zzydVar, j2));
                    i7 = floatToIntBits + i3;
                    break;
                case 2:
                    i2 = i7 * 53;
                    doubleToLongBits = f5n.g(zzydVar, j2);
                    Charset charset2 = zzym.a;
                    i7 = i2 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 3:
                    i2 = i7 * 53;
                    doubleToLongBits = f5n.g(zzydVar, j2);
                    Charset charset3 = zzym.a;
                    i7 = i2 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 4:
                    i3 = i7 * 53;
                    floatToIntBits = f5n.e(zzydVar, j2);
                    i7 = floatToIntBits + i3;
                    break;
                case 5:
                    i2 = i7 * 53;
                    doubleToLongBits = f5n.g(zzydVar, j2);
                    Charset charset4 = zzym.a;
                    i7 = i2 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 6:
                    i3 = i7 * 53;
                    floatToIntBits = f5n.e(zzydVar, j2);
                    i7 = floatToIntBits + i3;
                    break;
                case 7:
                    i4 = i7 * 53;
                    boolean s = f5n.c.s(zzydVar, j2);
                    Charset charset5 = zzym.a;
                    break;
                case 8:
                    i3 = i7 * 53;
                    floatToIntBits = ((String) f5n.h(zzydVar, j2)).hashCode();
                    i7 = floatToIntBits + i3;
                    break;
                case 9:
                    i5 = i7 * 53;
                    Object h = f5n.h(zzydVar, j2);
                    if (h != null) {
                        i12 = h.hashCode();
                    }
                    i7 = i5 + i12;
                    break;
                case 10:
                    i3 = i7 * 53;
                    floatToIntBits = f5n.h(zzydVar, j2).hashCode();
                    i7 = floatToIntBits + i3;
                    break;
                case 11:
                    i3 = i7 * 53;
                    floatToIntBits = f5n.e(zzydVar, j2);
                    i7 = floatToIntBits + i3;
                    break;
                case 12:
                    i3 = i7 * 53;
                    floatToIntBits = f5n.e(zzydVar, j2);
                    i7 = floatToIntBits + i3;
                    break;
                case 13:
                    i3 = i7 * 53;
                    floatToIntBits = f5n.e(zzydVar, j2);
                    i7 = floatToIntBits + i3;
                    break;
                case 14:
                    i2 = i7 * 53;
                    doubleToLongBits = f5n.g(zzydVar, j2);
                    Charset charset6 = zzym.a;
                    i7 = i2 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 15:
                    i3 = i7 * 53;
                    floatToIntBits = f5n.e(zzydVar, j2);
                    i7 = floatToIntBits + i3;
                    break;
                case 16:
                    i2 = i7 * 53;
                    doubleToLongBits = f5n.g(zzydVar, j2);
                    Charset charset7 = zzym.a;
                    i7 = i2 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 17:
                    i5 = i7 * 53;
                    Object h2 = f5n.h(zzydVar, j2);
                    if (h2 != null) {
                        i12 = h2.hashCode();
                    }
                    i7 = i5 + i12;
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
                    i3 = i7 * 53;
                    floatToIntBits = f5n.h(zzydVar, j2).hashCode();
                    i7 = floatToIntBits + i3;
                    break;
                case 50:
                    i3 = i7 * 53;
                    floatToIntBits = f5n.h(zzydVar, j2).hashCode();
                    i7 = floatToIntBits + i3;
                    break;
                case 51:
                    if (!j(i10, i6, zzydVar)) {
                        break;
                    } else {
                        i2 = i7 * 53;
                        doubleToLongBits = Double.doubleToLongBits(((Double) f5n.h(zzydVar, j2)).doubleValue());
                        Charset charset8 = zzym.a;
                        i7 = i2 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case 52:
                    if (!j(i10, i6, zzydVar)) {
                        break;
                    } else {
                        i3 = i7 * 53;
                        floatToIntBits = Float.floatToIntBits(((Float) f5n.h(zzydVar, j2)).floatValue());
                        i7 = floatToIntBits + i3;
                        break;
                    }
                case 53:
                    if (!j(i10, i6, zzydVar)) {
                        break;
                    } else {
                        i2 = i7 * 53;
                        doubleToLongBits = s(zzydVar, j2);
                        Charset charset9 = zzym.a;
                        i7 = i2 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case 54:
                    if (!j(i10, i6, zzydVar)) {
                        break;
                    } else {
                        i2 = i7 * 53;
                        doubleToLongBits = s(zzydVar, j2);
                        Charset charset10 = zzym.a;
                        i7 = i2 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case 55:
                    if (!j(i10, i6, zzydVar)) {
                        break;
                    } else {
                        i3 = i7 * 53;
                        floatToIntBits = r(zzydVar, j2);
                        i7 = floatToIntBits + i3;
                        break;
                    }
                case 56:
                    if (!j(i10, i6, zzydVar)) {
                        break;
                    } else {
                        i2 = i7 * 53;
                        doubleToLongBits = s(zzydVar, j2);
                        Charset charset11 = zzym.a;
                        i7 = i2 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case 57:
                    if (!j(i10, i6, zzydVar)) {
                        break;
                    } else {
                        i3 = i7 * 53;
                        floatToIntBits = r(zzydVar, j2);
                        i7 = floatToIntBits + i3;
                        break;
                    }
                case 58:
                    if (!j(i10, i6, zzydVar)) {
                        break;
                    } else {
                        i4 = i7 * 53;
                        boolean booleanValue = ((Boolean) f5n.h(zzydVar, j2)).booleanValue();
                        Charset charset12 = zzym.a;
                        break;
                    }
                case 59:
                    if (!j(i10, i6, zzydVar)) {
                        break;
                    } else {
                        i3 = i7 * 53;
                        floatToIntBits = ((String) f5n.h(zzydVar, j2)).hashCode();
                        i7 = floatToIntBits + i3;
                        break;
                    }
                case 60:
                    if (!j(i10, i6, zzydVar)) {
                        break;
                    } else {
                        i3 = i7 * 53;
                        floatToIntBits = f5n.h(zzydVar, j2).hashCode();
                        i7 = floatToIntBits + i3;
                        break;
                    }
                case 61:
                    if (!j(i10, i6, zzydVar)) {
                        break;
                    } else {
                        i3 = i7 * 53;
                        floatToIntBits = f5n.h(zzydVar, j2).hashCode();
                        i7 = floatToIntBits + i3;
                        break;
                    }
                case 62:
                    if (!j(i10, i6, zzydVar)) {
                        break;
                    } else {
                        i3 = i7 * 53;
                        floatToIntBits = r(zzydVar, j2);
                        i7 = floatToIntBits + i3;
                        break;
                    }
                case 63:
                    if (!j(i10, i6, zzydVar)) {
                        break;
                    } else {
                        i3 = i7 * 53;
                        floatToIntBits = r(zzydVar, j2);
                        i7 = floatToIntBits + i3;
                        break;
                    }
                case 64:
                    if (!j(i10, i6, zzydVar)) {
                        break;
                    } else {
                        i3 = i7 * 53;
                        floatToIntBits = r(zzydVar, j2);
                        i7 = floatToIntBits + i3;
                        break;
                    }
                case 65:
                    if (!j(i10, i6, zzydVar)) {
                        break;
                    } else {
                        i2 = i7 * 53;
                        doubleToLongBits = s(zzydVar, j2);
                        Charset charset13 = zzym.a;
                        i7 = i2 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case 66:
                    if (!j(i10, i6, zzydVar)) {
                        break;
                    } else {
                        i3 = i7 * 53;
                        floatToIntBits = r(zzydVar, j2);
                        i7 = floatToIntBits + i3;
                        break;
                    }
                case 67:
                    if (!j(i10, i6, zzydVar)) {
                        break;
                    } else {
                        i2 = i7 * 53;
                        doubleToLongBits = s(zzydVar, j2);
                        Charset charset14 = zzym.a;
                        i7 = i2 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case 68:
                    if (!j(i10, i6, zzydVar)) {
                        break;
                    } else {
                        i3 = i7 * 53;
                        floatToIntBits = f5n.h(zzydVar, j2).hashCode();
                        i7 = floatToIntBits + i3;
                        break;
                    }
            }
            i6 += 3;
        }
    }

    @Override // defpackage.bgp
    public final void g(Object obj) {
        if (!q(obj)) {
            return;
        }
        if (obj instanceof zzyd) {
            zzyd zzydVar = (zzyd) obj;
            zzydVar.e();
            zzydVar.zza = 0;
            zzydVar.l();
        }
        int i2 = 0;
        while (true) {
            int[] iArr = this.a;
            if (i2 >= iArr.length) {
                this.g.getClass();
                zzaae zzaaeVar = ((zzyd) obj).zzc;
                if (zzaaeVar.d) {
                    zzaaeVar.d = false;
                }
                if (this.d) {
                    this.h.getClass();
                    ((zzyb) obj).zzb.a();
                    return;
                }
                return;
            }
            int o = o(i2);
            int i3 = 1048575 & o;
            int p = p(o);
            long j2 = i3;
            Unsafe unsafe = j;
            if (p != 9) {
                if (p != 60 && p != 68) {
                    switch (p) {
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
                            ((zzyl) f5n.h(obj, j2)).zzb();
                            break;
                        case 50:
                            Object object = unsafe.getObject(obj, j2);
                            if (object == null) {
                                break;
                            } else {
                                ((zzzc) object).a = false;
                                unsafe.putObject(obj, j2, object);
                                break;
                            }
                    }
                } else if (j(iArr[i2], i2, obj)) {
                    n(i2).g(unsafe.getObject(obj, j2));
                }
                i2 += 3;
            }
            if (h(i2, obj)) {
                n(i2).g(unsafe.getObject(obj, j2));
            }
            i2 += 3;
        }
    }

    public final boolean h(int i2, Object obj) {
        int i3 = this.a[i2 + 2];
        long j2 = i3 & 1048575;
        if (j2 != 1048575) {
            return ((1 << (i3 >>> 20)) & f5n.e(obj, j2)) != 0;
        }
        int o = o(i2);
        long j3 = o & 1048575;
        switch (p(o)) {
            case 0:
                if (Double.doubleToRawLongBits(f5n.c.C(obj, j3)) != 0) {
                }
                break;
            case 1:
                if (Float.floatToRawIntBits(f5n.c.v(obj, j3)) != 0) {
                }
                break;
            case 2:
                if (f5n.g(obj, j3) != 0) {
                }
                break;
            case 3:
                if (f5n.g(obj, j3) != 0) {
                }
                break;
            case 4:
                if (f5n.e(obj, j3) != 0) {
                }
                break;
            case 5:
                if (f5n.g(obj, j3) != 0) {
                }
                break;
            case 6:
                if (f5n.e(obj, j3) != 0) {
                }
                break;
            case 7:
                break;
            case 8:
                Object h = f5n.h(obj, j3);
                if (!(h instanceof String)) {
                    if (!(h instanceof zzxk)) {
                        ilg.c();
                        break;
                    } else if (!zzxk.b.equals(h)) {
                    }
                } else if (!((String) h).isEmpty()) {
                }
                break;
            case 9:
                if (f5n.h(obj, j3) != null) {
                }
                break;
            case 10:
                if (!zzxk.b.equals(f5n.h(obj, j3))) {
                }
                break;
            case 11:
                if (f5n.e(obj, j3) != 0) {
                }
                break;
            case 12:
                if (f5n.e(obj, j3) != 0) {
                }
                break;
            case 13:
                if (f5n.e(obj, j3) != 0) {
                }
                break;
            case 14:
                if (f5n.g(obj, j3) != 0) {
                }
                break;
            case 15:
                if (f5n.e(obj, j3) != 0) {
                }
                break;
            case 16:
                if (f5n.g(obj, j3) != 0) {
                }
                break;
            case 17:
                if (f5n.h(obj, j3) != null) {
                }
                break;
            default:
                ilg.c();
                break;
        }
        return false;
    }

    public final void i(int i2, Object obj) {
        int i3 = this.a[i2 + 2];
        long j2 = 1048575 & i3;
        if (j2 == 1048575) {
            return;
        }
        f5n.f((1 << (i3 >>> 20)) | f5n.e(obj, j2), j2, obj);
    }

    public final boolean j(int i2, int i3, Object obj) {
        return f5n.e(obj, (long) (this.a[i3 + 2] & 1048575)) == i2;
    }

    public final void l(int i2, Object obj, Object obj2) {
        if (h(i2, obj2)) {
            long o = o(i2) & 1048575;
            Unsafe unsafe = j;
            Object object = unsafe.getObject(obj2, o);
            if (object == null) {
                int i3 = this.a[i2];
                String obj3 = obj2.toString();
                hbo.g(fn0.a(i3, 38) + obj3.length(), i3, obj3);
                return;
            }
            bgp n = n(i2);
            if (!h(i2, obj)) {
                if (q(object)) {
                    Object zza = n.zza();
                    n.a(zza, object);
                    unsafe.putObject(obj, o, zza);
                } else {
                    unsafe.putObject(obj, o, object);
                }
                i(i2, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, o);
            if (!q(object2)) {
                Object zza2 = n.zza();
                n.a(zza2, object2);
                unsafe.putObject(obj, o, zza2);
                object2 = zza2;
            }
            n.a(object2, object);
        }
    }

    public final void m(int i2, Object obj, Object obj2) {
        int[] iArr = this.a;
        int i3 = iArr[i2];
        if (j(i3, i2, obj2)) {
            long o = o(i2) & 1048575;
            Unsafe unsafe = j;
            Object object = unsafe.getObject(obj2, o);
            if (object == null) {
                int i4 = iArr[i2];
                String obj3 = obj2.toString();
                hbo.g(fn0.a(i4, 38) + obj3.length(), i4, obj3);
                return;
            }
            bgp n = n(i2);
            if (!j(i3, i2, obj)) {
                if (q(object)) {
                    Object zza = n.zza();
                    n.a(zza, object);
                    unsafe.putObject(obj, o, zza);
                } else {
                    unsafe.putObject(obj, o, object);
                }
                f5n.f(i3, iArr[i2 + 2] & 1048575, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, o);
            if (!q(object2)) {
                Object zza2 = n.zza();
                n.a(zza2, object2);
                unsafe.putObject(obj, o, zza2);
                object2 = zza2;
            }
            n.a(object2, object);
        }
    }

    public final bgp n(int i2) {
        int i3 = i2 / 3;
        int i4 = i3 + i3;
        Object[] objArr = this.b;
        bgp bgpVar = (bgp) objArr[i4];
        if (bgpVar != null) {
            return bgpVar;
        }
        bgp a = ufp.c.a((Class) objArr[i4 + 1]);
        objArr[i4] = a;
        return a;
    }

    public final int o(int i2) {
        return this.a[i2 + 1];
    }

    public final boolean t(zzyd zzydVar, zzyd zzydVar2, int i2) {
        return h(i2, zzydVar) == h(i2, zzydVar2);
    }

    public final boolean u(int i2, int i3, int i4, int i5, Object obj) {
        return i3 == 1048575 ? h(i2, obj) : (i4 & i5) != 0;
    }

    @Override // defpackage.bgp
    public final Object zza() {
        return (zzyd) ((zzyd) this.c).i(4, null);
    }
}

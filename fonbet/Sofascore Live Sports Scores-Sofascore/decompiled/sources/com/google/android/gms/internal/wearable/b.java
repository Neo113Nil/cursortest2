package com.google.android.gms.internal.wearable;

import defpackage.a70;
import defpackage.bf3;
import defpackage.d6o;
import defpackage.e3c;
import defpackage.fao;
import defpackage.fc6;
import defpackage.fn0;
import defpackage.haf;
import defpackage.hbo;
import defpackage.hxn;
import defpackage.i7o;
import defpackage.igf;
import defpackage.ilg;
import defpackage.l7o;
import defpackage.mz1;
import defpackage.n9o;
import defpackage.s6o;
import defpackage.sck;
import defpackage.vp2;
import defpackage.x5n;
import defpackage.zz0;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class b implements s6o {
    public static final int[] m = new int[0];
    public static final Unsafe n = n9o.j();
    public final int[] a;
    public final Object[] b;
    public final int c;
    public final int d;
    public final zzel e;
    public final boolean f;
    public final boolean g;
    public final int[] h;
    public final int i;
    public final int j;
    public final e k;
    public final igf l;

    public b(int[] iArr, Object[] objArr, int i, int i2, zzel zzelVar, int[] iArr2, int i3, int i4, e eVar, igf igfVar) {
        this.a = iArr;
        this.b = objArr;
        this.c = i;
        this.d = i2;
        this.g = zzelVar instanceof zzdg;
        boolean z = false;
        if (igfVar != null && (zzelVar instanceof zzdd)) {
            z = true;
        }
        this.f = z;
        this.h = iArr2;
        this.i = i3;
        this.j = i4;
        this.k = eVar;
        this.l = igfVar;
        this.e = zzelVar;
    }

    public static int j(int i) {
        return (i >>> 20) & 255;
    }

    public static boolean k(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzdg) {
            return ((zzdg) obj).e();
        }
        return true;
    }

    public static int l(Object obj, long j) {
        return ((Integer) n9o.h(obj, j)).intValue();
    }

    public static long m(Object obj, long j) {
        return ((Long) n9o.h(obj, j)).longValue();
    }

    public static Field u(Class cls, String str) {
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

    public final Object A(int i, int i2, Object obj) {
        s6o x = x(i2);
        if (!r(i, i2, obj)) {
            return x.zza();
        }
        Object object = n.getObject(obj, i(i2) & 1048575);
        if (k(object)) {
            return object;
        }
        Object zza = x.zza();
        if (object != null) {
            x.a(zza, object);
        }
        return zza;
    }

    public final void B(int i, Object obj, Object obj2) {
        int i2 = this.a[i];
        Object h = n9o.h(obj, i(i) & 1048575);
        if (h == null || y(i) == null) {
            return;
        }
        int i3 = i / 3;
        throw null;
    }

    public final void C(int i, zz0 zz0Var, Object obj) {
        zzcj zzcjVar = (zzcj) zz0Var.e;
        long j = i & 1048575;
        if ((536870912 & i) != 0) {
            zz0Var.h1(2);
            n9o.i(j, obj, zzcjVar.p());
        } else if (!this.g) {
            n9o.i(j, obj, zz0Var.I1());
        } else {
            zz0Var.h1(2);
            n9o.i(j, obj, zzcjVar.o());
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.s6o
    public final void a(Object obj, Object obj2) {
        Object obj3;
        if (!k(obj)) {
            a70.p("Mutating immutable message: ".concat(String.valueOf(obj)));
            return;
        }
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.a;
            if (i >= iArr.length) {
                Object obj4 = obj;
                d.b(obj4, obj2);
                if (!this.f || ((zzdd) obj2).zzb.a.isEmpty()) {
                    return;
                }
                throw null;
            }
            int i2 = i(i);
            int i3 = 1048575 & i2;
            int j = j(i2);
            int i4 = iArr[i];
            long j2 = i3;
            switch (j) {
                case 0:
                    if (p(i, obj2)) {
                        sck sckVar = n9o.c;
                        obj3 = obj;
                        sckVar.G(obj3, j2, sckVar.C(obj2, j2));
                        q(i, obj3);
                        break;
                    }
                    obj3 = obj;
                    break;
                case 1:
                    if (p(i, obj2)) {
                        sck sckVar2 = n9o.c;
                        sckVar2.B(obj, j2, sckVar2.v(obj2, j2));
                        q(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 2:
                    if (p(i, obj2)) {
                        n9o.g(obj, j2, n9o.f(obj2, j2));
                        q(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 3:
                    if (p(i, obj2)) {
                        n9o.g(obj, j2, n9o.f(obj2, j2));
                        q(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 4:
                    if (p(i, obj2)) {
                        n9o.e(n9o.d(obj2, j2), j2, obj);
                        q(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 5:
                    if (p(i, obj2)) {
                        n9o.g(obj, j2, n9o.f(obj2, j2));
                        q(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 6:
                    if (p(i, obj2)) {
                        n9o.e(n9o.d(obj2, j2), j2, obj);
                        q(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 7:
                    if (p(i, obj2)) {
                        sck sckVar3 = n9o.c;
                        sckVar3.u(obj, j2, sckVar3.s(obj2, j2));
                        q(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 8:
                    if (p(i, obj2)) {
                        n9o.i(j2, obj, n9o.h(obj2, j2));
                        q(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 9:
                    v(i, obj, obj2);
                    obj3 = obj;
                    break;
                case 10:
                    if (p(i, obj2)) {
                        n9o.i(j2, obj, n9o.h(obj2, j2));
                        q(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 11:
                    if (p(i, obj2)) {
                        n9o.e(n9o.d(obj2, j2), j2, obj);
                        q(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 12:
                    if (p(i, obj2)) {
                        n9o.e(n9o.d(obj2, j2), j2, obj);
                        q(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 13:
                    if (p(i, obj2)) {
                        n9o.e(n9o.d(obj2, j2), j2, obj);
                        q(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 14:
                    if (p(i, obj2)) {
                        n9o.g(obj, j2, n9o.f(obj2, j2));
                        q(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 15:
                    if (p(i, obj2)) {
                        n9o.e(n9o.d(obj2, j2), j2, obj);
                        q(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 16:
                    if (p(i, obj2)) {
                        n9o.g(obj, j2, n9o.f(obj2, j2));
                        q(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 17:
                    v(i, obj, obj2);
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
                    zzdp zzdpVar = (zzdp) n9o.h(obj, j2);
                    zzdp zzdpVar2 = (zzdp) n9o.h(obj2, j2);
                    int size = zzdpVar.size();
                    int size2 = zzdpVar2.size();
                    if (size > 0 && size2 > 0) {
                        if (!zzdpVar.zza()) {
                            zzdpVar = zzdpVar.f(size2 + size);
                        }
                        zzdpVar.addAll(zzdpVar2);
                    }
                    if (size > 0) {
                        zzdpVar2 = zzdpVar;
                    }
                    n9o.i(j2, obj, zzdpVar2);
                    obj3 = obj;
                    break;
                case 50:
                    e eVar = d.a;
                    n9o.i(j2, obj, haf.b(n9o.h(obj, j2), n9o.h(obj2, j2)));
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
                    if (r(i4, i, obj2)) {
                        n9o.i(j2, obj, n9o.h(obj2, j2));
                        s(i4, i, obj);
                    }
                    obj3 = obj;
                    break;
                case 60:
                    w(i, obj, obj2);
                    obj3 = obj;
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (r(i4, i, obj2)) {
                        n9o.i(j2, obj, n9o.h(obj2, j2));
                        s(i4, i, obj);
                    }
                    obj3 = obj;
                    break;
                case 68:
                    w(i, obj, obj2);
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

    /* JADX WARN: Code restructure failed: missing block: B:14:0x00ee, code lost:
    
        return false;
     */
    @Override // defpackage.s6o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(Object obj) {
        int i = 0;
        int i2 = 0;
        int i3 = 1048575;
        loop0: while (true) {
            if (i < this.i) {
                int i4 = this.h[i];
                int i5 = this.i(i4);
                int[] iArr = this.a;
                int i6 = iArr[i4 + 2];
                int i7 = i6 & 1048575;
                int i8 = 1 << (i6 >>> 20);
                if (i7 == i3) {
                    i7 = i3;
                } else if (i7 != 1048575) {
                    i2 = n.getInt(obj, i7);
                }
                int i9 = i2;
                b bVar = this;
                Object obj2 = obj;
                if ((268435456 & i5) != 0 && !bVar.o(i4, i7, i9, i8, obj2)) {
                    break;
                }
                int j = j(i5);
                if (j == 9 || j == 17) {
                    if (bVar.o(i4, i7, i9, i8, obj2) && !bVar.x(i4).b(n9o.h(obj2, i5 & 1048575))) {
                        break;
                    }
                    i++;
                    this = bVar;
                    i3 = i7;
                    i2 = i9;
                    obj = obj2;
                } else {
                    if (j != 27) {
                        if (j == 60 || j == 68) {
                            if (bVar.r(iArr[i4], i4, obj2) && !bVar.x(i4).b(n9o.h(obj2, i5 & 1048575))) {
                                break;
                            }
                        } else if (j != 49) {
                            if (j == 50 && !((zzef) n9o.h(obj2, i5 & 1048575)).isEmpty()) {
                                int i10 = i4 / 3;
                                throw null;
                            }
                        }
                        i++;
                        this = bVar;
                        i3 = i7;
                        i2 = i9;
                        obj = obj2;
                    }
                    List list = (List) n9o.h(obj2, i5 & 1048575);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        s6o x = bVar.x(i4);
                        for (int i11 = 0; i11 < list.size(); i11++) {
                            if (!x.b(list.get(i11))) {
                                break loop0;
                            }
                        }
                    }
                    i++;
                    this = bVar;
                    i3 = i7;
                    i2 = i9;
                    obj = obj2;
                }
            } else {
                Object obj3 = obj;
                if (!this.f || ((zzdd) obj3).zzb.d()) {
                    return true;
                }
            }
        }
    }

    @Override // defpackage.s6o
    public final void c(Object obj) {
        if (!k(obj)) {
            return;
        }
        if (obj instanceof zzdg) {
            zzdg zzdgVar = (zzdg) obj;
            zzdgVar.i();
            zzdgVar.zza = 0;
            zzdgVar.h();
        }
        int i = 0;
        while (true) {
            int[] iArr = this.a;
            if (i >= iArr.length) {
                this.k.getClass();
                zzfj zzfjVar = ((zzdg) obj).zzc;
                if (zzfjVar.e) {
                    zzfjVar.e = false;
                }
                if (this.f) {
                    this.l.getClass();
                    ((zzdd) obj).zzb.a();
                    return;
                }
                return;
            }
            int i2 = i(i);
            int i3 = 1048575 & i2;
            int j = j(i2);
            long j2 = i3;
            Unsafe unsafe = n;
            if (j != 9) {
                if (j != 60 && j != 68) {
                    switch (j) {
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
                            ((zzdp) n9o.h(obj, j2)).zzb();
                            break;
                        case 50:
                            Object object = unsafe.getObject(obj, j2);
                            if (object == null) {
                                break;
                            } else {
                                ((zzef) object).a = false;
                                unsafe.putObject(obj, j2, object);
                                break;
                            }
                    }
                } else if (r(iArr[i], i, obj)) {
                    x(i).c(unsafe.getObject(obj, j2));
                }
                i += 3;
            }
            if (p(i, obj)) {
                x(i).c(unsafe.getObject(obj, j2));
            }
            i += 3;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0604 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0034  */
    @Override // defpackage.s6o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(Object obj, e3c e3cVar) {
        Map.Entry entry;
        int i;
        int i2;
        int[] iArr;
        boolean z;
        int[] iArr2;
        int i3;
        boolean z2;
        b bVar = this;
        zzcn zzcnVar = (zzcn) e3cVar.b;
        if (bVar.f) {
            hxn hxnVar = ((zzdd) obj).zzb;
            if (!hxnVar.a.isEmpty()) {
                entry = (Map.Entry) hxnVar.b().next();
                i = 1048575;
                int i4 = 1048575;
                i2 = 0;
                int i5 = 0;
                while (true) {
                    iArr = bVar.a;
                    if (i2 < iArr.length) {
                        if (entry != null) {
                            throw fc6.d(entry);
                        }
                        ((zzdg) obj).zzc.a(e3cVar);
                        return;
                    }
                    int i6 = bVar.i(i2);
                    int j = j(i6);
                    int i7 = iArr[i2];
                    Unsafe unsafe = n;
                    if (j <= 17) {
                        int i8 = iArr[i2 + 2];
                        z = true;
                        int i9 = i8 & i;
                        if (i9 != i4) {
                            i5 = i9 == i ? 0 : unsafe.getInt(obj, i9);
                            i4 = i9;
                        }
                        iArr2 = iArr;
                        i3 = 1 << (i8 >>> 20);
                    } else {
                        z = true;
                        iArr2 = iArr;
                        i3 = 0;
                    }
                    if (entry != null) {
                        throw fc6.d(entry);
                    }
                    long j2 = i6 & i;
                    switch (j) {
                        case 0:
                            if (bVar.o(i2, i4, i5, i3, obj)) {
                                zzcnVar.f(i7, Double.doubleToRawLongBits(n9o.c.C(obj, j2)));
                            }
                            i2 += 3;
                            i = 1048575;
                            bVar = this;
                        case 1:
                            if (bVar.o(i2, i4, i5, i3, obj)) {
                                zzcnVar.d(i7, Float.floatToRawIntBits(n9o.c.v(obj, j2)));
                            }
                            i2 += 3;
                            i = 1048575;
                            bVar = this;
                        case 2:
                            if (bVar.o(i2, i4, i5, i3, obj)) {
                                zzcnVar.e(i7, unsafe.getLong(obj, j2));
                            }
                            i2 += 3;
                            i = 1048575;
                            bVar = this;
                        case 3:
                            if (bVar.o(i2, i4, i5, i3, obj)) {
                                zzcnVar.e(i7, unsafe.getLong(obj, j2));
                            }
                            i2 += 3;
                            i = 1048575;
                            bVar = this;
                        case 4:
                            if (bVar.o(i2, i4, i5, i3, obj)) {
                                zzcnVar.b(i7, unsafe.getInt(obj, j2));
                            }
                            i2 += 3;
                            i = 1048575;
                            bVar = this;
                        case 5:
                            if (bVar.o(i2, i4, i5, i3, obj)) {
                                zzcnVar.f(i7, unsafe.getLong(obj, j2));
                            }
                            i2 += 3;
                            i = 1048575;
                            bVar = this;
                        case 6:
                            if (bVar.o(i2, i4, i5, i3, obj)) {
                                zzcnVar.d(i7, unsafe.getInt(obj, j2));
                            }
                            i2 += 3;
                            i = 1048575;
                            bVar = this;
                        case 7:
                            if (bVar.o(i2, i4, i5, i3, obj)) {
                                zzcnVar.g(i7, n9o.c.s(obj, j2));
                            }
                            i2 += 3;
                            i = 1048575;
                            bVar = this;
                        case 8:
                            if (bVar.o(i2, i4, i5, i3, obj)) {
                                Object object = unsafe.getObject(obj, j2);
                                if (object instanceof String) {
                                    zzcnVar.h(i7, (String) object);
                                } else {
                                    zzcnVar.i(i7, (zzcg) object);
                                }
                            }
                            i2 += 3;
                            i = 1048575;
                            bVar = this;
                        case 9:
                            if (bVar.o(i2, i4, i5, i3, obj)) {
                                e3cVar.t(i7, unsafe.getObject(obj, j2), bVar.x(i2));
                            }
                            i2 += 3;
                            i = 1048575;
                            bVar = this;
                        case 10:
                            if (bVar.o(i2, i4, i5, i3, obj)) {
                                zzcnVar.i(i7, (zzcg) unsafe.getObject(obj, j2));
                            }
                            i2 += 3;
                            i = 1048575;
                            bVar = this;
                        case 11:
                            if (bVar.o(i2, i4, i5, i3, obj)) {
                                zzcnVar.c(i7, unsafe.getInt(obj, j2));
                            }
                            i2 += 3;
                            i = 1048575;
                            bVar = this;
                        case 12:
                            if (bVar.o(i2, i4, i5, i3, obj)) {
                                zzcnVar.b(i7, unsafe.getInt(obj, j2));
                            }
                            i2 += 3;
                            i = 1048575;
                            bVar = this;
                        case 13:
                            if (bVar.o(i2, i4, i5, i3, obj)) {
                                zzcnVar.d(i7, unsafe.getInt(obj, j2));
                            }
                            i2 += 3;
                            i = 1048575;
                            bVar = this;
                        case 14:
                            if (bVar.o(i2, i4, i5, i3, obj)) {
                                zzcnVar.f(i7, unsafe.getLong(obj, j2));
                            }
                            i2 += 3;
                            i = 1048575;
                            bVar = this;
                        case 15:
                            if (bVar.o(i2, i4, i5, i3, obj)) {
                                int i10 = unsafe.getInt(obj, j2);
                                zzcnVar.c(i7, (i10 >> 31) ^ (i10 + i10));
                            }
                            i2 += 3;
                            i = 1048575;
                            bVar = this;
                        case 16:
                            if (bVar.o(i2, i4, i5, i3, obj)) {
                                long j3 = unsafe.getLong(obj, j2);
                                zzcnVar.e(i7, (j3 >> 63) ^ (j3 + j3));
                            }
                            i2 += 3;
                            i = 1048575;
                            bVar = this;
                        case 17:
                            if (bVar.o(i2, i4, i5, i3, obj)) {
                                Object object2 = unsafe.getObject(obj, j2);
                                zzcnVar.a(i7, 3);
                                bVar.x(i2).d((zzbr) object2, e3cVar);
                                zzcnVar.a(i7, 4);
                            }
                            i2 += 3;
                            i = 1048575;
                            bVar = this;
                        case 18:
                            z2 = false;
                            d.d(iArr2[i2], (List) unsafe.getObject(obj, j2), e3cVar, false);
                            i2 += 3;
                            i = 1048575;
                            bVar = this;
                        case 19:
                            z2 = false;
                            d.e(iArr2[i2], (List) unsafe.getObject(obj, j2), e3cVar, false);
                            i2 += 3;
                            i = 1048575;
                            bVar = this;
                        case 20:
                            z2 = false;
                            d.f(iArr2[i2], (List) unsafe.getObject(obj, j2), e3cVar, false);
                            i2 += 3;
                            i = 1048575;
                            bVar = this;
                        case 21:
                            z2 = false;
                            d.g(iArr2[i2], (List) unsafe.getObject(obj, j2), e3cVar, false);
                            i2 += 3;
                            i = 1048575;
                            bVar = this;
                        case 22:
                            z2 = false;
                            d.k(iArr2[i2], (List) unsafe.getObject(obj, j2), e3cVar, false);
                            i2 += 3;
                            i = 1048575;
                            bVar = this;
                        case 23:
                            z2 = false;
                            d.i(iArr2[i2], (List) unsafe.getObject(obj, j2), e3cVar, false);
                            i2 += 3;
                            i = 1048575;
                            bVar = this;
                        case 24:
                            z2 = false;
                            d.n(iArr2[i2], (List) unsafe.getObject(obj, j2), e3cVar, false);
                            i2 += 3;
                            i = 1048575;
                            bVar = this;
                        case 25:
                            z2 = false;
                            d.q(iArr2[i2], (List) unsafe.getObject(obj, j2), e3cVar, false);
                            i2 += 3;
                            i = 1048575;
                            bVar = this;
                        case 26:
                            int i11 = iArr2[i2];
                            List list = (List) unsafe.getObject(obj, j2);
                            e eVar = d.a;
                            if (list != null && !list.isEmpty()) {
                                if (list instanceof zzdx) {
                                    zzdx zzdxVar = (zzdx) list;
                                    for (int i12 = 0; i12 < list.size(); i12++) {
                                        Object zzc = zzdxVar.zzc();
                                        if (zzc instanceof String) {
                                            zzcnVar.h(i11, (String) zzc);
                                        } else {
                                            zzcnVar.i(i11, (zzcg) zzc);
                                        }
                                    }
                                } else {
                                    for (int i13 = 0; i13 < list.size(); i13++) {
                                        zzcnVar.h(i11, (String) list.get(i13));
                                    }
                                }
                            }
                            i2 += 3;
                            i = 1048575;
                            bVar = this;
                            break;
                        case 27:
                            int i14 = iArr2[i2];
                            List list2 = (List) unsafe.getObject(obj, j2);
                            s6o x = bVar.x(i2);
                            e eVar2 = d.a;
                            if (list2 != null && !list2.isEmpty()) {
                                for (int i15 = 0; i15 < list2.size(); i15++) {
                                    e3cVar.t(i14, list2.get(i15), x);
                                }
                            }
                            i2 += 3;
                            i = 1048575;
                            bVar = this;
                            break;
                        case 28:
                            int i16 = iArr2[i2];
                            List list3 = (List) unsafe.getObject(obj, j2);
                            e eVar3 = d.a;
                            if (list3 != null && !list3.isEmpty()) {
                                for (int i17 = 0; i17 < list3.size(); i17++) {
                                    zzcnVar.i(i16, (zzcg) list3.get(i17));
                                }
                            }
                            i2 += 3;
                            i = 1048575;
                            bVar = this;
                            break;
                        case 29:
                            z2 = false;
                            d.l(iArr2[i2], (List) unsafe.getObject(obj, j2), e3cVar, false);
                            i2 += 3;
                            i = 1048575;
                            bVar = this;
                        case 30:
                            z2 = false;
                            d.p(iArr2[i2], (List) unsafe.getObject(obj, j2), e3cVar, false);
                            i2 += 3;
                            i = 1048575;
                            bVar = this;
                        case 31:
                            z2 = false;
                            d.o(iArr2[i2], (List) unsafe.getObject(obj, j2), e3cVar, false);
                            i2 += 3;
                            i = 1048575;
                            bVar = this;
                        case 32:
                            z2 = false;
                            d.j(iArr2[i2], (List) unsafe.getObject(obj, j2), e3cVar, false);
                            i2 += 3;
                            i = 1048575;
                            bVar = this;
                        case 33:
                            z2 = false;
                            d.m(iArr2[i2], (List) unsafe.getObject(obj, j2), e3cVar, false);
                            i2 += 3;
                            i = 1048575;
                            bVar = this;
                        case 34:
                            z2 = false;
                            d.h(iArr2[i2], (List) unsafe.getObject(obj, j2), e3cVar, false);
                            i2 += 3;
                            i = 1048575;
                            bVar = this;
                        case 35:
                            d.d(iArr2[i2], (List) unsafe.getObject(obj, j2), e3cVar, z);
                            i2 += 3;
                            i = 1048575;
                            bVar = this;
                        case 36:
                            d.e(iArr2[i2], (List) unsafe.getObject(obj, j2), e3cVar, z);
                            i2 += 3;
                            i = 1048575;
                            bVar = this;
                        case 37:
                            d.f(iArr2[i2], (List) unsafe.getObject(obj, j2), e3cVar, z);
                            i2 += 3;
                            i = 1048575;
                            bVar = this;
                        case 38:
                            d.g(iArr2[i2], (List) unsafe.getObject(obj, j2), e3cVar, z);
                            i2 += 3;
                            i = 1048575;
                            bVar = this;
                        case 39:
                            d.k(iArr2[i2], (List) unsafe.getObject(obj, j2), e3cVar, z);
                            i2 += 3;
                            i = 1048575;
                            bVar = this;
                        case 40:
                            d.i(iArr2[i2], (List) unsafe.getObject(obj, j2), e3cVar, z);
                            i2 += 3;
                            i = 1048575;
                            bVar = this;
                        case 41:
                            d.n(iArr2[i2], (List) unsafe.getObject(obj, j2), e3cVar, z);
                            i2 += 3;
                            i = 1048575;
                            bVar = this;
                        case 42:
                            d.q(iArr2[i2], (List) unsafe.getObject(obj, j2), e3cVar, z);
                            i2 += 3;
                            i = 1048575;
                            bVar = this;
                        case 43:
                            d.l(iArr2[i2], (List) unsafe.getObject(obj, j2), e3cVar, z);
                            i2 += 3;
                            i = 1048575;
                            bVar = this;
                        case 44:
                            d.p(iArr2[i2], (List) unsafe.getObject(obj, j2), e3cVar, z);
                            i2 += 3;
                            i = 1048575;
                            bVar = this;
                        case 45:
                            d.o(iArr2[i2], (List) unsafe.getObject(obj, j2), e3cVar, z);
                            i2 += 3;
                            i = 1048575;
                            bVar = this;
                        case 46:
                            d.j(iArr2[i2], (List) unsafe.getObject(obj, j2), e3cVar, z);
                            i2 += 3;
                            i = 1048575;
                            bVar = this;
                        case 47:
                            d.m(iArr2[i2], (List) unsafe.getObject(obj, j2), e3cVar, z);
                            i2 += 3;
                            i = 1048575;
                            bVar = this;
                        case 48:
                            d.h(iArr2[i2], (List) unsafe.getObject(obj, j2), e3cVar, z);
                            i2 += 3;
                            i = 1048575;
                            bVar = this;
                        case 49:
                            int i18 = iArr2[i2];
                            List list4 = (List) unsafe.getObject(obj, j2);
                            s6o x2 = bVar.x(i2);
                            e eVar4 = d.a;
                            if (list4 != null && !list4.isEmpty()) {
                                for (int i19 = 0; i19 < list4.size(); i19++) {
                                    zzbr zzbrVar = (zzbr) list4.get(i19);
                                    zzcnVar.a(i18, 3);
                                    x2.d(zzbrVar, e3cVar);
                                    zzcnVar.a(i18, 4);
                                }
                            }
                            i2 += 3;
                            i = 1048575;
                            bVar = this;
                            break;
                        case 50:
                            if (unsafe.getObject(obj, j2) != null) {
                                int i20 = i2 / 3;
                                throw null;
                            }
                            i2 += 3;
                            i = 1048575;
                            bVar = this;
                        case 51:
                            if (bVar.r(i7, i2, obj)) {
                                zzcnVar.f(i7, Double.doubleToRawLongBits(((Double) n9o.h(obj, j2)).doubleValue()));
                            }
                            i2 += 3;
                            i = 1048575;
                            bVar = this;
                        case 52:
                            if (bVar.r(i7, i2, obj)) {
                                zzcnVar.d(i7, Float.floatToRawIntBits(((Float) n9o.h(obj, j2)).floatValue()));
                            }
                            i2 += 3;
                            i = 1048575;
                            bVar = this;
                        case 53:
                            if (bVar.r(i7, i2, obj)) {
                                zzcnVar.e(i7, m(obj, j2));
                            }
                            i2 += 3;
                            i = 1048575;
                            bVar = this;
                        case 54:
                            if (bVar.r(i7, i2, obj)) {
                                zzcnVar.e(i7, m(obj, j2));
                            }
                            i2 += 3;
                            i = 1048575;
                            bVar = this;
                        case 55:
                            if (bVar.r(i7, i2, obj)) {
                                zzcnVar.b(i7, l(obj, j2));
                            }
                            i2 += 3;
                            i = 1048575;
                            bVar = this;
                        case 56:
                            if (bVar.r(i7, i2, obj)) {
                                zzcnVar.f(i7, m(obj, j2));
                            }
                            i2 += 3;
                            i = 1048575;
                            bVar = this;
                        case 57:
                            if (bVar.r(i7, i2, obj)) {
                                zzcnVar.d(i7, l(obj, j2));
                            }
                            i2 += 3;
                            i = 1048575;
                            bVar = this;
                        case 58:
                            if (bVar.r(i7, i2, obj)) {
                                zzcnVar.g(i7, ((Boolean) n9o.h(obj, j2)).booleanValue());
                            }
                            i2 += 3;
                            i = 1048575;
                            bVar = this;
                        case 59:
                            if (bVar.r(i7, i2, obj)) {
                                Object object3 = unsafe.getObject(obj, j2);
                                if (object3 instanceof String) {
                                    zzcnVar.h(i7, (String) object3);
                                } else {
                                    zzcnVar.i(i7, (zzcg) object3);
                                }
                            }
                            i2 += 3;
                            i = 1048575;
                            bVar = this;
                        case 60:
                            if (bVar.r(i7, i2, obj)) {
                                e3cVar.t(i7, unsafe.getObject(obj, j2), bVar.x(i2));
                            }
                            i2 += 3;
                            i = 1048575;
                            bVar = this;
                        case 61:
                            if (bVar.r(i7, i2, obj)) {
                                zzcnVar.i(i7, (zzcg) unsafe.getObject(obj, j2));
                            }
                            i2 += 3;
                            i = 1048575;
                            bVar = this;
                        case 62:
                            if (bVar.r(i7, i2, obj)) {
                                zzcnVar.c(i7, l(obj, j2));
                            }
                            i2 += 3;
                            i = 1048575;
                            bVar = this;
                        case 63:
                            if (bVar.r(i7, i2, obj)) {
                                zzcnVar.b(i7, l(obj, j2));
                            }
                            i2 += 3;
                            i = 1048575;
                            bVar = this;
                        case 64:
                            if (bVar.r(i7, i2, obj)) {
                                zzcnVar.d(i7, l(obj, j2));
                            }
                            i2 += 3;
                            i = 1048575;
                            bVar = this;
                        case 65:
                            if (bVar.r(i7, i2, obj)) {
                                zzcnVar.f(i7, m(obj, j2));
                            }
                            i2 += 3;
                            i = 1048575;
                            bVar = this;
                        case 66:
                            if (bVar.r(i7, i2, obj)) {
                                int l = l(obj, j2);
                                zzcnVar.c(i7, (l >> 31) ^ (l + l));
                            }
                            i2 += 3;
                            i = 1048575;
                            bVar = this;
                        case 67:
                            if (bVar.r(i7, i2, obj)) {
                                long m2 = m(obj, j2);
                                zzcnVar.e(i7, (m2 >> 63) ^ (m2 + m2));
                            }
                            i2 += 3;
                            i = 1048575;
                            bVar = this;
                        case 68:
                            if (bVar.r(i7, i2, obj)) {
                                Object object4 = unsafe.getObject(obj, j2);
                                zzcnVar.a(i7, 3);
                                bVar.x(i2).d((zzbr) object4, e3cVar);
                                zzcnVar.a(i7, 4);
                            }
                            i2 += 3;
                            i = 1048575;
                            bVar = this;
                        default:
                            i2 += 3;
                            i = 1048575;
                            bVar = this;
                    }
                }
            }
        }
        entry = null;
        i = 1048575;
        int i42 = 1048575;
        i2 = 0;
        int i52 = 0;
        while (true) {
            iArr = bVar.a;
            if (i2 < iArr.length) {
            }
            i2 += 3;
            i = 1048575;
            bVar = this;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:305:0x003a, code lost:
    
        r19 = r7;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0743 A[LOOP:1: B:35:0x0741->B:36:0x0743, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x074d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0728 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0734  */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0713 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    @Override // defpackage.s6o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(Object obj, zz0 zz0Var, zzcs zzcsVar) {
        Object obj2;
        e eVar;
        Throwable th;
        int j;
        Unsafe unsafe;
        Object obj3;
        Object obj4 = obj;
        zzcj zzcjVar = (zzcj) zz0Var.e;
        int[] iArr = this.h;
        int i = this.j;
        int i2 = this.i;
        zzcsVar.getClass();
        if (!k(obj4)) {
            a70.p("Mutating immutable message: ".concat(String.valueOf(obj4)));
            return;
        }
        e eVar2 = this.k;
        ?? r13 = 0;
        Object obj5 = null;
        while (true) {
            try {
                int H1 = zz0Var.H1();
                int t = t(H1);
                if (t >= 0) {
                    int i3 = i(t);
                    try {
                        j = j(i3);
                        th = r13;
                        unsafe = n;
                    } catch (zzdu unused) {
                        obj2 = obj5;
                        eVar = eVar2;
                        th = r13;
                    }
                    switch (j) {
                        case 0:
                            obj2 = obj5;
                            eVar = eVar2;
                            int i4 = i3 & 1048575;
                            zz0Var.h1(1);
                            try {
                            } catch (zzdu unused2) {
                                obj4 = obj;
                            } catch (Throwable th2) {
                                th = th2;
                                obj4 = obj;
                            }
                            try {
                                n9o.c.G(obj, i4, zzcjVar.g());
                                obj4 = obj;
                                q(t, obj4);
                                r13 = th;
                                eVar2 = eVar;
                                obj5 = obj2;
                            } catch (zzdu unused3) {
                                obj4 = obj;
                                obj5 = obj2;
                                if (obj5 == null) {
                                }
                                eVar.getClass();
                                if (!e.b(0, zz0Var, obj5)) {
                                }
                                r13 = th;
                                eVar2 = eVar;
                            } catch (Throwable th3) {
                                th = th3;
                                obj4 = obj;
                                obj5 = obj2;
                                while (i2 < i) {
                                }
                                if (obj5 != null) {
                                }
                                throw th;
                            }
                            break;
                        case 1:
                            obj2 = obj5;
                            eVar = eVar2;
                            zz0Var.h1(5);
                            n9o.c.B(obj4, i3 & 1048575, zzcjVar.h());
                            q(t, obj4);
                            r13 = th;
                            eVar2 = eVar;
                            obj5 = obj2;
                        case 2:
                            obj2 = obj5;
                            eVar = eVar2;
                            zz0Var.h1(0);
                            n9o.g(obj4, i3 & 1048575, zzcjVar.j());
                            q(t, obj4);
                            r13 = th;
                            eVar2 = eVar;
                            obj5 = obj2;
                        case 3:
                            obj2 = obj5;
                            eVar = eVar2;
                            zz0Var.h1(0);
                            n9o.g(obj4, i3 & 1048575, zzcjVar.i());
                            q(t, obj4);
                            r13 = th;
                            eVar2 = eVar;
                            obj5 = obj2;
                        case 4:
                            obj2 = obj5;
                            eVar = eVar2;
                            zz0Var.h1(0);
                            n9o.e(zzcjVar.k(), i3 & 1048575, obj4);
                            q(t, obj4);
                            r13 = th;
                            eVar2 = eVar;
                            obj5 = obj2;
                        case 5:
                            obj2 = obj5;
                            eVar = eVar2;
                            zz0Var.h1(1);
                            n9o.g(obj4, i3 & 1048575, zzcjVar.l());
                            q(t, obj4);
                            r13 = th;
                            eVar2 = eVar;
                            obj5 = obj2;
                        case 6:
                            obj2 = obj5;
                            eVar = eVar2;
                            zz0Var.h1(5);
                            n9o.e(zzcjVar.m(), i3 & 1048575, obj4);
                            q(t, obj4);
                            r13 = th;
                            eVar2 = eVar;
                            obj5 = obj2;
                        case 7:
                            obj2 = obj5;
                            eVar = eVar2;
                            zz0Var.h1(0);
                            n9o.c.u(obj4, i3 & 1048575, zzcjVar.n());
                            q(t, obj4);
                            r13 = th;
                            eVar2 = eVar;
                            obj5 = obj2;
                        case 8:
                            obj2 = obj5;
                            eVar = eVar2;
                            C(i3, zz0Var, obj4);
                            q(t, obj4);
                            r13 = th;
                            eVar2 = eVar;
                            obj5 = obj2;
                        case 9:
                            obj2 = obj5;
                            eVar = eVar2;
                            zzel zzelVar = (zzel) z(t, obj4);
                            s6o x = x(t);
                            zz0Var.h1(2);
                            zz0Var.n1(zzelVar, x, zzcsVar);
                            unsafe.putObject(obj4, i(t) & 1048575, zzelVar);
                            q(t, obj4);
                            r13 = th;
                            eVar2 = eVar;
                            obj5 = obj2;
                        case 10:
                            obj2 = obj5;
                            eVar = eVar2;
                            n9o.i(i3 & 1048575, obj4, zz0Var.I1());
                            q(t, obj4);
                            r13 = th;
                            eVar2 = eVar;
                            obj5 = obj2;
                        case 11:
                            obj2 = obj5;
                            eVar = eVar2;
                            zz0Var.h1(0);
                            n9o.e(zzcjVar.r(), i3 & 1048575, obj4);
                            q(t, obj4);
                            r13 = th;
                            eVar2 = eVar;
                            obj5 = obj2;
                        case 12:
                            obj2 = obj5;
                            eVar = eVar2;
                            zz0Var.h1(0);
                            int s = zzcjVar.s();
                            zzdl y = y(t);
                            if (y != null && !y.a(s)) {
                                e eVar3 = d.a;
                                if (obj2 == null) {
                                    eVar.getClass();
                                    obj5 = e.a(obj4);
                                } else {
                                    obj5 = obj2;
                                }
                                eVar.getClass();
                                ((zzfj) obj5).c(H1 << 3, Long.valueOf(s));
                                r13 = th;
                                eVar2 = eVar;
                            }
                            n9o.e(s, i3 & 1048575, obj4);
                            q(t, obj4);
                            r13 = th;
                            eVar2 = eVar;
                            obj5 = obj2;
                            break;
                        case 13:
                            obj2 = obj5;
                            eVar = eVar2;
                            zz0Var.h1(5);
                            n9o.e(zzcjVar.t(), i3 & 1048575, obj4);
                            q(t, obj4);
                            r13 = th;
                            eVar2 = eVar;
                            obj5 = obj2;
                        case 14:
                            obj2 = obj5;
                            eVar = eVar2;
                            zz0Var.h1(1);
                            n9o.g(obj4, i3 & 1048575, zzcjVar.u());
                            q(t, obj4);
                            r13 = th;
                            eVar2 = eVar;
                            obj5 = obj2;
                        case 15:
                            obj2 = obj5;
                            eVar = eVar2;
                            zz0Var.h1(0);
                            n9o.e(zzcjVar.v(), i3 & 1048575, obj4);
                            q(t, obj4);
                            r13 = th;
                            eVar2 = eVar;
                            obj5 = obj2;
                        case 16:
                            obj2 = obj5;
                            eVar = eVar2;
                            zz0Var.h1(0);
                            n9o.g(obj4, i3 & 1048575, zzcjVar.w());
                            q(t, obj4);
                            r13 = th;
                            eVar2 = eVar;
                            obj5 = obj2;
                        case 17:
                            obj2 = obj5;
                            eVar = eVar2;
                            zzel zzelVar2 = (zzel) z(t, obj4);
                            s6o x2 = x(t);
                            zz0Var.h1(3);
                            zz0Var.q1(zzelVar2, x2, zzcsVar);
                            unsafe.putObject(obj4, i(t) & 1048575, zzelVar2);
                            q(t, obj4);
                            r13 = th;
                            eVar2 = eVar;
                            obj5 = obj2;
                        case 18:
                            obj2 = obj5;
                            eVar = eVar2;
                            zz0Var.L1(igf.e(obj4, i3 & 1048575));
                            r13 = th;
                            eVar2 = eVar;
                            obj5 = obj2;
                        case 19:
                            obj2 = obj5;
                            eVar = eVar2;
                            zz0Var.P1(igf.e(obj4, i3 & 1048575));
                            r13 = th;
                            eVar2 = eVar;
                            obj5 = obj2;
                        case 20:
                            obj2 = obj5;
                            eVar = eVar2;
                            zz0Var.X1(igf.e(obj4, i3 & 1048575));
                            r13 = th;
                            eVar2 = eVar;
                            obj5 = obj2;
                        case 21:
                            obj2 = obj5;
                            eVar = eVar2;
                            zz0Var.T1(igf.e(obj4, i3 & 1048575));
                            r13 = th;
                            eVar2 = eVar;
                            obj5 = obj2;
                        case 22:
                            obj2 = obj5;
                            eVar = eVar2;
                            zz0Var.f0(igf.e(obj4, i3 & 1048575));
                            r13 = th;
                            eVar2 = eVar;
                            obj5 = obj2;
                        case 23:
                            obj2 = obj5;
                            eVar = eVar2;
                            zz0Var.j0(igf.e(obj4, i3 & 1048575));
                            r13 = th;
                            eVar2 = eVar;
                            obj5 = obj2;
                        case 24:
                            obj2 = obj5;
                            eVar = eVar2;
                            zz0Var.n0(igf.e(obj4, i3 & 1048575));
                            r13 = th;
                            eVar2 = eVar;
                            obj5 = obj2;
                        case 25:
                            obj2 = obj5;
                            eVar = eVar2;
                            zz0Var.r0(igf.e(obj4, i3 & 1048575));
                            r13 = th;
                            eVar2 = eVar;
                            obj5 = obj2;
                        case 26:
                            obj2 = obj5;
                            eVar = eVar2;
                            if ((536870912 & i3) != 0) {
                                zz0Var.v0(igf.e(obj4, i3 & 1048575), true);
                            } else {
                                zz0Var.v0(igf.e(obj4, i3 & 1048575), false);
                            }
                            r13 = th;
                            eVar2 = eVar;
                            obj5 = obj2;
                        case 27:
                            obj2 = obj5;
                            eVar = eVar2;
                            zz0Var.z0(igf.e(obj4, i3 & 1048575), x(t), zzcsVar);
                            r13 = th;
                            eVar2 = eVar;
                            obj5 = obj2;
                        case 28:
                            obj2 = obj5;
                            eVar = eVar2;
                            zz0Var.H0(igf.e(obj4, i3 & 1048575));
                            r13 = th;
                            eVar2 = eVar;
                            obj5 = obj2;
                        case 29:
                            obj2 = obj5;
                            eVar = eVar2;
                            try {
                                zz0Var.L0(igf.e(obj4, i3 & 1048575));
                                r13 = th;
                                eVar2 = eVar;
                                obj5 = obj2;
                            } catch (zzdu unused4) {
                                obj5 = obj2;
                                if (obj5 == null) {
                                }
                                eVar.getClass();
                                if (!e.b(0, zz0Var, obj5)) {
                                }
                                r13 = th;
                                eVar2 = eVar;
                            } catch (Throwable th4) {
                                th = th4;
                                obj5 = obj2;
                                while (i2 < i) {
                                }
                                if (obj5 != null) {
                                }
                                throw th;
                            }
                            break;
                        case 30:
                            zzdp e = igf.e(obj4, i3 & 1048575);
                            zz0Var.P0(e);
                            obj5 = d.c(obj4, H1, e, y(t), obj5, eVar2);
                            eVar = eVar2;
                            r13 = th;
                            eVar2 = eVar;
                        case 31:
                            zz0Var.T0(igf.e(obj4, i3 & 1048575));
                            obj2 = obj5;
                            eVar = eVar2;
                            r13 = th;
                            eVar2 = eVar;
                            obj5 = obj2;
                        case 32:
                            zz0Var.X0(igf.e(obj4, i3 & 1048575));
                            obj2 = obj5;
                            eVar = eVar2;
                            r13 = th;
                            eVar2 = eVar;
                            obj5 = obj2;
                        case 33:
                            zz0Var.b1(igf.e(obj4, i3 & 1048575));
                            obj2 = obj5;
                            eVar = eVar2;
                            r13 = th;
                            eVar2 = eVar;
                            obj5 = obj2;
                        case 34:
                            zz0Var.f1(igf.e(obj4, i3 & 1048575));
                            obj2 = obj5;
                            eVar = eVar2;
                            r13 = th;
                            eVar2 = eVar;
                            obj5 = obj2;
                        case 35:
                            zz0Var.L1(igf.e(obj4, i3 & 1048575));
                            obj2 = obj5;
                            eVar = eVar2;
                            r13 = th;
                            eVar2 = eVar;
                            obj5 = obj2;
                        case 36:
                            zz0Var.P1(igf.e(obj4, i3 & 1048575));
                            obj2 = obj5;
                            eVar = eVar2;
                            r13 = th;
                            eVar2 = eVar;
                            obj5 = obj2;
                        case 37:
                            zz0Var.X1(igf.e(obj4, i3 & 1048575));
                            obj2 = obj5;
                            eVar = eVar2;
                            r13 = th;
                            eVar2 = eVar;
                            obj5 = obj2;
                        case 38:
                            zz0Var.T1(igf.e(obj4, i3 & 1048575));
                            obj2 = obj5;
                            eVar = eVar2;
                            r13 = th;
                            eVar2 = eVar;
                            obj5 = obj2;
                        case 39:
                            zz0Var.f0(igf.e(obj4, i3 & 1048575));
                            obj2 = obj5;
                            eVar = eVar2;
                            r13 = th;
                            eVar2 = eVar;
                            obj5 = obj2;
                        case 40:
                            zz0Var.j0(igf.e(obj4, i3 & 1048575));
                            obj2 = obj5;
                            eVar = eVar2;
                            r13 = th;
                            eVar2 = eVar;
                            obj5 = obj2;
                        case 41:
                            zz0Var.n0(igf.e(obj4, i3 & 1048575));
                            obj2 = obj5;
                            eVar = eVar2;
                            r13 = th;
                            eVar2 = eVar;
                            obj5 = obj2;
                        case 42:
                            zz0Var.r0(igf.e(obj4, i3 & 1048575));
                            obj2 = obj5;
                            eVar = eVar2;
                            r13 = th;
                            eVar2 = eVar;
                            obj5 = obj2;
                        case 43:
                            zz0Var.L0(igf.e(obj4, i3 & 1048575));
                            obj2 = obj5;
                            eVar = eVar2;
                            r13 = th;
                            eVar2 = eVar;
                            obj5 = obj2;
                        case 44:
                            Object obj6 = obj5;
                            eVar = eVar2;
                            try {
                                zzdp e2 = igf.e(obj4, i3 & 1048575);
                                zz0Var.P0(e2);
                                eVar2 = eVar;
                                obj5 = d.c(obj4, H1, e2, y(t), obj6, eVar2);
                                r13 = th;
                            } catch (Throwable th5) {
                                th = th5;
                                obj2 = obj6;
                                obj5 = obj2;
                                while (i2 < i) {
                                    B(iArr[i2], obj4, obj5);
                                    i2++;
                                }
                                if (obj5 != null) {
                                    eVar.getClass();
                                    ((zzdg) obj4).zzc = (zzfj) obj5;
                                }
                                throw th;
                            }
                        case 45:
                            obj3 = obj5;
                            eVar = eVar2;
                            zz0Var.T0(igf.e(obj4, i3 & 1048575));
                            obj2 = obj3;
                            r13 = th;
                            eVar2 = eVar;
                            obj5 = obj2;
                        case 46:
                            obj3 = obj5;
                            eVar = eVar2;
                            zz0Var.X0(igf.e(obj4, i3 & 1048575));
                            obj2 = obj3;
                            r13 = th;
                            eVar2 = eVar;
                            obj5 = obj2;
                        case 47:
                            obj3 = obj5;
                            eVar = eVar2;
                            zz0Var.b1(igf.e(obj4, i3 & 1048575));
                            obj2 = obj3;
                            r13 = th;
                            eVar2 = eVar;
                            obj5 = obj2;
                        case 48:
                            obj3 = obj5;
                            eVar = eVar2;
                            zz0Var.f1(igf.e(obj4, i3 & 1048575));
                            obj2 = obj3;
                            r13 = th;
                            eVar2 = eVar;
                            obj5 = obj2;
                        case 49:
                            obj3 = obj5;
                            eVar = eVar2;
                            zz0Var.D0(igf.e(obj4, i3 & 1048575), x(t), zzcsVar);
                            obj2 = obj3;
                            r13 = th;
                            eVar2 = eVar;
                            obj5 = obj2;
                        case 50:
                            obj3 = obj5;
                            eVar = eVar2;
                            int i5 = t / 3;
                            Object obj7 = this.b[i5 + i5];
                            long i6 = i(t) & 1048575;
                            Object h = n9o.h(obj4, i6);
                            if (h == null) {
                                h = zzef.b.g();
                                n9o.i(i6, obj4, h);
                            } else if (haf.a(h)) {
                                Object g = zzef.b.g();
                                haf.b(g, h);
                                n9o.i(i6, obj4, g);
                                h = g;
                            }
                            throw th;
                            break;
                        case 51:
                            obj3 = obj5;
                            eVar = eVar2;
                            zz0Var.h1(1);
                            n9o.i(i3 & 1048575, obj4, Double.valueOf(zzcjVar.g()));
                            s(H1, t, obj4);
                            obj2 = obj3;
                            r13 = th;
                            eVar2 = eVar;
                            obj5 = obj2;
                        case 52:
                            obj3 = obj5;
                            eVar = eVar2;
                            zz0Var.h1(5);
                            n9o.i(i3 & 1048575, obj4, Float.valueOf(zzcjVar.h()));
                            s(H1, t, obj4);
                            obj2 = obj3;
                            r13 = th;
                            eVar2 = eVar;
                            obj5 = obj2;
                        case 53:
                            obj3 = obj5;
                            eVar = eVar2;
                            zz0Var.h1(0);
                            n9o.i(i3 & 1048575, obj4, Long.valueOf(zzcjVar.j()));
                            s(H1, t, obj4);
                            obj2 = obj3;
                            r13 = th;
                            eVar2 = eVar;
                            obj5 = obj2;
                        case 54:
                            obj3 = obj5;
                            eVar = eVar2;
                            zz0Var.h1(0);
                            n9o.i(i3 & 1048575, obj4, Long.valueOf(zzcjVar.i()));
                            s(H1, t, obj4);
                            obj2 = obj3;
                            r13 = th;
                            eVar2 = eVar;
                            obj5 = obj2;
                        case 55:
                            obj3 = obj5;
                            eVar = eVar2;
                            zz0Var.h1(0);
                            n9o.i(i3 & 1048575, obj4, Integer.valueOf(zzcjVar.k()));
                            s(H1, t, obj4);
                            obj2 = obj3;
                            r13 = th;
                            eVar2 = eVar;
                            obj5 = obj2;
                        case 56:
                            obj3 = obj5;
                            eVar = eVar2;
                            zz0Var.h1(1);
                            n9o.i(i3 & 1048575, obj4, Long.valueOf(zzcjVar.l()));
                            s(H1, t, obj4);
                            obj2 = obj3;
                            r13 = th;
                            eVar2 = eVar;
                            obj5 = obj2;
                        case 57:
                            obj3 = obj5;
                            eVar = eVar2;
                            zz0Var.h1(5);
                            n9o.i(i3 & 1048575, obj4, Integer.valueOf(zzcjVar.m()));
                            s(H1, t, obj4);
                            obj2 = obj3;
                            r13 = th;
                            eVar2 = eVar;
                            obj5 = obj2;
                        case 58:
                            obj3 = obj5;
                            eVar = eVar2;
                            zz0Var.h1(0);
                            n9o.i(i3 & 1048575, obj4, Boolean.valueOf(zzcjVar.n()));
                            s(H1, t, obj4);
                            obj2 = obj3;
                            r13 = th;
                            eVar2 = eVar;
                            obj5 = obj2;
                        case 59:
                            obj3 = obj5;
                            eVar = eVar2;
                            C(i3, zz0Var, obj4);
                            s(H1, t, obj4);
                            obj2 = obj3;
                            r13 = th;
                            eVar2 = eVar;
                            obj5 = obj2;
                        case 60:
                            obj3 = obj5;
                            eVar = eVar2;
                            zzel zzelVar3 = (zzel) A(H1, t, obj4);
                            s6o x3 = x(t);
                            zz0Var.h1(2);
                            zz0Var.n1(zzelVar3, x3, zzcsVar);
                            unsafe.putObject(obj4, i(t) & 1048575, zzelVar3);
                            s(H1, t, obj4);
                            obj2 = obj3;
                            r13 = th;
                            eVar2 = eVar;
                            obj5 = obj2;
                        case 61:
                            obj3 = obj5;
                            eVar = eVar2;
                            n9o.i(i3 & 1048575, obj4, zz0Var.I1());
                            s(H1, t, obj4);
                            obj2 = obj3;
                            r13 = th;
                            eVar2 = eVar;
                            obj5 = obj2;
                        case 62:
                            obj3 = obj5;
                            eVar = eVar2;
                            zz0Var.h1(0);
                            n9o.i(i3 & 1048575, obj4, Integer.valueOf(zzcjVar.r()));
                            s(H1, t, obj4);
                            obj2 = obj3;
                            r13 = th;
                            eVar2 = eVar;
                            obj5 = obj2;
                        case 63:
                            obj3 = obj5;
                            eVar = eVar2;
                            zz0Var.h1(0);
                            int s2 = zzcjVar.s();
                            zzdl y2 = y(t);
                            if (y2 != null && !y2.a(s2)) {
                                e eVar4 = d.a;
                                if (obj3 == null) {
                                    eVar.getClass();
                                    obj5 = e.a(obj4);
                                } else {
                                    obj5 = obj3;
                                }
                                eVar.getClass();
                                ((zzfj) obj5).c(H1 << 3, Long.valueOf(s2));
                                r13 = th;
                                eVar2 = eVar;
                            }
                            n9o.i(i3 & 1048575, obj4, Integer.valueOf(s2));
                            s(H1, t, obj4);
                            obj2 = obj3;
                            r13 = th;
                            eVar2 = eVar;
                            obj5 = obj2;
                            break;
                        case 64:
                            obj3 = obj5;
                            eVar = eVar2;
                            zz0Var.h1(5);
                            n9o.i(i3 & 1048575, obj4, Integer.valueOf(zzcjVar.t()));
                            s(H1, t, obj4);
                            obj2 = obj3;
                            r13 = th;
                            eVar2 = eVar;
                            obj5 = obj2;
                        case 65:
                            obj3 = obj5;
                            eVar = eVar2;
                            zz0Var.h1(1);
                            n9o.i(i3 & 1048575, obj4, Long.valueOf(zzcjVar.u()));
                            s(H1, t, obj4);
                            obj2 = obj3;
                            r13 = th;
                            eVar2 = eVar;
                            obj5 = obj2;
                        case 66:
                            obj3 = obj5;
                            eVar = eVar2;
                            zz0Var.h1(0);
                            n9o.i(i3 & 1048575, obj4, Integer.valueOf(zzcjVar.v()));
                            s(H1, t, obj4);
                            obj2 = obj3;
                            r13 = th;
                            eVar2 = eVar;
                            obj5 = obj2;
                        case 67:
                            obj3 = obj5;
                            int i7 = i3 & 1048575;
                            try {
                                zz0Var.h1(0);
                                eVar = eVar2;
                                try {
                                    try {
                                        n9o.i(i7, obj4, Long.valueOf(zzcjVar.w()));
                                        s(H1, t, obj4);
                                        obj2 = obj3;
                                        r13 = th;
                                        eVar2 = eVar;
                                        obj5 = obj2;
                                    } catch (zzdu unused5) {
                                        obj2 = obj3;
                                        obj5 = obj2;
                                        if (obj5 == null) {
                                            try {
                                                eVar.getClass();
                                                obj5 = e.a(obj4);
                                            } catch (Throwable th6) {
                                                th = th6;
                                                while (i2 < i) {
                                                }
                                                if (obj5 != null) {
                                                }
                                                throw th;
                                            }
                                        }
                                        eVar.getClass();
                                        if (!e.b(0, zz0Var, obj5)) {
                                            while (i2 < i) {
                                                B(iArr[i2], obj4, obj5);
                                                i2++;
                                            }
                                            if (obj5 == null) {
                                            }
                                        }
                                        r13 = th;
                                        eVar2 = eVar;
                                    }
                                } catch (Throwable th7) {
                                    th = th7;
                                    obj2 = obj3;
                                    obj5 = obj2;
                                    while (i2 < i) {
                                    }
                                    if (obj5 != null) {
                                    }
                                    throw th;
                                }
                            } catch (Throwable th8) {
                                th = th8;
                                eVar = eVar2;
                                obj2 = obj3;
                                obj5 = obj2;
                                while (i2 < i) {
                                }
                                if (obj5 != null) {
                                }
                                throw th;
                            }
                            break;
                        case 68:
                            try {
                                zzel zzelVar4 = (zzel) A(H1, t, obj4);
                                s6o x4 = x(t);
                                try {
                                    zz0Var.h1(3);
                                    zz0Var.q1(zzelVar4, x4, zzcsVar);
                                    obj3 = obj5;
                                } catch (zzdu unused6) {
                                    obj3 = obj5;
                                }
                                try {
                                    try {
                                        unsafe.putObject(obj4, i(t) & 1048575, zzelVar4);
                                        s(H1, t, obj4);
                                        eVar = eVar2;
                                        obj2 = obj3;
                                        r13 = th;
                                        eVar2 = eVar;
                                        obj5 = obj2;
                                    } catch (Throwable th9) {
                                        th = th9;
                                        eVar = eVar2;
                                        obj2 = obj3;
                                        obj5 = obj2;
                                        while (i2 < i) {
                                        }
                                        if (obj5 != null) {
                                        }
                                        throw th;
                                    }
                                } catch (zzdu unused7) {
                                    eVar = eVar2;
                                    obj2 = obj3;
                                    obj5 = obj2;
                                    if (obj5 == null) {
                                    }
                                    eVar.getClass();
                                    if (!e.b(0, zz0Var, obj5)) {
                                    }
                                    r13 = th;
                                    eVar2 = eVar;
                                }
                            } catch (Throwable th10) {
                                th = th10;
                                obj3 = obj5;
                            }
                            break;
                        default:
                            if (obj5 == null) {
                                try {
                                    eVar2.getClass();
                                    obj5 = e.a(obj4);
                                } catch (zzdu unused8) {
                                    obj2 = obj5;
                                    eVar = eVar2;
                                    obj5 = obj2;
                                    if (obj5 == null) {
                                    }
                                    eVar.getClass();
                                    if (!e.b(0, zz0Var, obj5)) {
                                    }
                                    r13 = th;
                                    eVar2 = eVar;
                                }
                            }
                            try {
                                eVar2.getClass();
                                if (!e.b(0, zz0Var, obj5)) {
                                    while (i2 < i) {
                                        B(iArr[i2], obj4, obj5);
                                        i2++;
                                    }
                                    break;
                                }
                                r13 = th;
                            } catch (zzdu unused9) {
                                eVar = eVar2;
                                if (obj5 == null) {
                                }
                                eVar.getClass();
                                if (!e.b(0, zz0Var, obj5)) {
                                }
                                r13 = th;
                                eVar2 = eVar;
                            }
                            break;
                    }
                } else if (H1 == Integer.MAX_VALUE) {
                    while (i2 < i) {
                        B(iArr[i2], obj4, obj5);
                        i2++;
                    }
                } else {
                    if ((!this.f ? r13 : zzcsVar.a(H1, this.e)) != null) {
                        throw r13;
                    }
                    if (obj5 == null) {
                        eVar2.getClass();
                        obj5 = e.a(obj4);
                    }
                    try {
                        eVar2.getClass();
                        if (!e.b(0, zz0Var, obj5)) {
                            while (i2 < i) {
                                B(iArr[i2], obj4, obj5);
                                i2++;
                            }
                        }
                    } catch (Throwable th11) {
                        th = th11;
                        eVar = eVar2;
                        while (i2 < i) {
                        }
                        if (obj5 != null) {
                        }
                        throw th;
                    }
                }
            } catch (Throwable th12) {
                th = th12;
                obj2 = obj5;
                eVar = eVar2;
            }
        }
        if (obj5 == null) {
            eVar.getClass();
            ((zzdg) obj4).zzc = (zzfj) obj5;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:153:0x01d1, code lost:
    
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0218 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01d1 A[SYNTHETIC] */
    @Override // defpackage.s6o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean f(zzdg zzdgVar, zzdg zzdgVar2) {
        boolean a;
        int i = 0;
        while (true) {
            int[] iArr = this.a;
            if (i < iArr.length) {
                int i2 = i(i);
                int j = j(i2);
                if (j <= 50 || j >= 69) {
                    long j2 = i2 & 1048575;
                    switch (j) {
                        case 0:
                            if (!n(zzdgVar, zzdgVar2, i)) {
                                break;
                            } else {
                                sck sckVar = n9o.c;
                                if (Double.doubleToLongBits(sckVar.C(zzdgVar, j2)) != Double.doubleToLongBits(sckVar.C(zzdgVar2, j2))) {
                                    break;
                                } else {
                                    break;
                                }
                            }
                        case 1:
                            if (!n(zzdgVar, zzdgVar2, i)) {
                                break;
                            } else {
                                sck sckVar2 = n9o.c;
                                if (Float.floatToIntBits(sckVar2.v(zzdgVar, j2)) != Float.floatToIntBits(sckVar2.v(zzdgVar2, j2))) {
                                    break;
                                } else {
                                    break;
                                }
                            }
                        case 2:
                            if (n(zzdgVar, zzdgVar2, i) && n9o.f(zzdgVar, j2) == n9o.f(zzdgVar2, j2)) {
                                break;
                            }
                            break;
                        case 3:
                            if (n(zzdgVar, zzdgVar2, i) && n9o.f(zzdgVar, j2) == n9o.f(zzdgVar2, j2)) {
                                break;
                            }
                            break;
                        case 4:
                            if (n(zzdgVar, zzdgVar2, i) && n9o.d(zzdgVar, j2) == n9o.d(zzdgVar2, j2)) {
                                break;
                            }
                            break;
                        case 5:
                            if (n(zzdgVar, zzdgVar2, i) && n9o.f(zzdgVar, j2) == n9o.f(zzdgVar2, j2)) {
                                break;
                            }
                            break;
                        case 6:
                            if (n(zzdgVar, zzdgVar2, i) && n9o.d(zzdgVar, j2) == n9o.d(zzdgVar2, j2)) {
                                break;
                            }
                            break;
                        case 7:
                            if (!n(zzdgVar, zzdgVar2, i)) {
                                break;
                            } else {
                                sck sckVar3 = n9o.c;
                                if (sckVar3.s(zzdgVar, j2) != sckVar3.s(zzdgVar2, j2)) {
                                    break;
                                } else {
                                    break;
                                }
                            }
                        case 8:
                            if (n(zzdgVar, zzdgVar2, i) && d.a(n9o.h(zzdgVar, j2), n9o.h(zzdgVar2, j2))) {
                                break;
                            }
                            break;
                        case 9:
                            if (n(zzdgVar, zzdgVar2, i) && d.a(n9o.h(zzdgVar, j2), n9o.h(zzdgVar2, j2))) {
                                break;
                            }
                            break;
                        case 10:
                            if (n(zzdgVar, zzdgVar2, i) && d.a(n9o.h(zzdgVar, j2), n9o.h(zzdgVar2, j2))) {
                                break;
                            }
                            break;
                        case 11:
                            if (n(zzdgVar, zzdgVar2, i) && n9o.d(zzdgVar, j2) == n9o.d(zzdgVar2, j2)) {
                                break;
                            }
                            break;
                        case 12:
                            if (n(zzdgVar, zzdgVar2, i) && n9o.d(zzdgVar, j2) == n9o.d(zzdgVar2, j2)) {
                                break;
                            }
                            break;
                        case 13:
                            if (n(zzdgVar, zzdgVar2, i) && n9o.d(zzdgVar, j2) == n9o.d(zzdgVar2, j2)) {
                                break;
                            }
                            break;
                        case 14:
                            if (n(zzdgVar, zzdgVar2, i) && n9o.f(zzdgVar, j2) == n9o.f(zzdgVar2, j2)) {
                                break;
                            }
                            break;
                        case 15:
                            if (n(zzdgVar, zzdgVar2, i) && n9o.d(zzdgVar, j2) == n9o.d(zzdgVar2, j2)) {
                                break;
                            }
                            break;
                        case 16:
                            if (n(zzdgVar, zzdgVar2, i) && n9o.f(zzdgVar, j2) == n9o.f(zzdgVar2, j2)) {
                                break;
                            }
                            break;
                        case 17:
                            if (n(zzdgVar, zzdgVar2, i) && d.a(n9o.h(zzdgVar, j2), n9o.h(zzdgVar2, j2))) {
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
                            a = d.a(n9o.h(zzdgVar, j2), n9o.h(zzdgVar2, j2));
                            if (!a) {
                                break;
                            } else {
                                break;
                            }
                        case 50:
                            a = d.a(n9o.h(zzdgVar, j2), n9o.h(zzdgVar2, j2));
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
                            if (n9o.d(zzdgVar, j3) == n9o.d(zzdgVar2, j3) && d.a(n9o.h(zzdgVar, j2), n9o.h(zzdgVar2, j2))) {
                                break;
                            }
                            break;
                    }
                    return false;
                }
                i += 3;
            } else {
                int i3 = this.j;
                while (true) {
                    int[] iArr2 = this.h;
                    if (i3 < iArr2.length) {
                        int i4 = iArr2[i3];
                        long j4 = iArr[i4 + 2] & 1048575;
                        if (n9o.d(zzdgVar, j4) != n9o.d(zzdgVar2, j4)) {
                            return false;
                        }
                        if (!r(0, i4, zzdgVar)) {
                            long i5 = i(i4) & 1048575;
                            if (!d.a(n9o.h(zzdgVar, i5), n9o.h(zzdgVar2, i5))) {
                            }
                        }
                        i3++;
                    } else if (zzdgVar.zzc.equals(zzdgVar2.zzc)) {
                        if (this.f) {
                            return ((zzdd) zzdgVar).zzb.equals(((zzdd) zzdgVar2).zzb);
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.s6o
    public final int g(zzdg zzdgVar) {
        int i;
        long doubleToLongBits;
        int i2;
        int floatToIntBits;
        int i3;
        int i4;
        int i5 = 0;
        for (int i6 = 0; i6 < this.a.length; i6 += 3) {
            int i7 = i(i6);
            int j = j(i7);
            if (j <= 50 || j >= 69) {
                long j2 = i7 & 1048575;
                int i8 = 37;
                switch (j) {
                    case 0:
                        i = i5 * 53;
                        doubleToLongBits = Double.doubleToLongBits(n9o.c.C(zzdgVar, j2));
                        byte[] bArr = zzdq.a;
                        i3 = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i5 = i + i3;
                        break;
                    case 1:
                        i2 = i5 * 53;
                        floatToIntBits = Float.floatToIntBits(n9o.c.v(zzdgVar, j2));
                        i5 = i2 + floatToIntBits;
                        break;
                    case 2:
                        i = i5 * 53;
                        doubleToLongBits = n9o.f(zzdgVar, j2);
                        byte[] bArr2 = zzdq.a;
                        i3 = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i5 = i + i3;
                        break;
                    case 3:
                        i = i5 * 53;
                        doubleToLongBits = n9o.f(zzdgVar, j2);
                        byte[] bArr3 = zzdq.a;
                        i3 = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i5 = i + i3;
                        break;
                    case 4:
                        i2 = i5 * 53;
                        floatToIntBits = n9o.d(zzdgVar, j2);
                        i5 = i2 + floatToIntBits;
                        break;
                    case 5:
                        i = i5 * 53;
                        doubleToLongBits = n9o.f(zzdgVar, j2);
                        byte[] bArr4 = zzdq.a;
                        i3 = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i5 = i + i3;
                        break;
                    case 6:
                        i2 = i5 * 53;
                        floatToIntBits = n9o.d(zzdgVar, j2);
                        i5 = i2 + floatToIntBits;
                        break;
                    case 7:
                        i = i5 * 53;
                        boolean s = n9o.c.s(zzdgVar, j2);
                        byte[] bArr5 = zzdq.a;
                        i3 = s ? 1231 : 1237;
                        i5 = i + i3;
                        break;
                    case 8:
                        i2 = i5 * 53;
                        floatToIntBits = ((String) n9o.h(zzdgVar, j2)).hashCode();
                        i5 = i2 + floatToIntBits;
                        break;
                    case 9:
                        i4 = i5 * 53;
                        Object h = n9o.h(zzdgVar, j2);
                        if (h != null) {
                            i8 = h.hashCode();
                        }
                        i5 = i4 + i8;
                        break;
                    case 10:
                        i2 = i5 * 53;
                        floatToIntBits = n9o.h(zzdgVar, j2).hashCode();
                        i5 = i2 + floatToIntBits;
                        break;
                    case 11:
                        i2 = i5 * 53;
                        floatToIntBits = n9o.d(zzdgVar, j2);
                        i5 = i2 + floatToIntBits;
                        break;
                    case 12:
                        i2 = i5 * 53;
                        floatToIntBits = n9o.d(zzdgVar, j2);
                        i5 = i2 + floatToIntBits;
                        break;
                    case 13:
                        i2 = i5 * 53;
                        floatToIntBits = n9o.d(zzdgVar, j2);
                        i5 = i2 + floatToIntBits;
                        break;
                    case 14:
                        i = i5 * 53;
                        doubleToLongBits = n9o.f(zzdgVar, j2);
                        byte[] bArr6 = zzdq.a;
                        i3 = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i5 = i + i3;
                        break;
                    case 15:
                        i2 = i5 * 53;
                        floatToIntBits = n9o.d(zzdgVar, j2);
                        i5 = i2 + floatToIntBits;
                        break;
                    case 16:
                        i = i5 * 53;
                        doubleToLongBits = n9o.f(zzdgVar, j2);
                        byte[] bArr7 = zzdq.a;
                        i3 = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i5 = i + i3;
                        break;
                    case 17:
                        i4 = i5 * 53;
                        Object h2 = n9o.h(zzdgVar, j2);
                        if (h2 != null) {
                            i8 = h2.hashCode();
                        }
                        i5 = i4 + i8;
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
                        floatToIntBits = n9o.h(zzdgVar, j2).hashCode();
                        i5 = i2 + floatToIntBits;
                        break;
                    case 50:
                        i2 = i5 * 53;
                        floatToIntBits = n9o.h(zzdgVar, j2).hashCode();
                        i5 = i2 + floatToIntBits;
                        break;
                }
            }
        }
        int i9 = this.j;
        while (true) {
            int[] iArr = this.h;
            if (i9 >= iArr.length) {
                int hashCode = zzdgVar.zzc.hashCode() + (i5 * 53);
                if (this.f) {
                    return ((zzdd) zzdgVar).zzb.a.hashCode() + (hashCode * 53);
                }
                return hashCode;
            }
            if (!r(0, iArr[i9], zzdgVar)) {
                i5 = n9o.h(zzdgVar, i(r3) & 1048575).hashCode() + (i5 * 53);
            }
            i9++;
        }
    }

    @Override // defpackage.s6o
    public final int h(zzdg zzdgVar) {
        int i;
        int r;
        int s;
        int i2;
        int b;
        int z;
        int r2;
        int size;
        int s2;
        int r3;
        int r4;
        int r5;
        int i3;
        int r6;
        int s3;
        b bVar = this;
        zzdg zzdgVar2 = zzdgVar;
        int i4 = 1048575;
        int i5 = 1048575;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (true) {
            int[] iArr = bVar.a;
            if (i6 >= iArr.length) {
                int b2 = zzdgVar2.zzc.b() + i8;
                if (!bVar.f) {
                    return b2;
                }
                i7o i7oVar = ((zzdd) zzdgVar2).zzb.a;
                int i9 = i7oVar.b;
                int i10 = 0;
                for (int i11 = 0; i11 < i9; i11++) {
                    l7o a = i7oVar.a(i11);
                    i10 = hxn.e((zzcw) a.a, a.b) + i10;
                }
                for (Map.Entry entry : i7oVar.c()) {
                    i10 = hxn.e((zzcw) entry.getKey(), entry.getValue()) + i10;
                }
                return b2 + i10;
            }
            int i12 = bVar.i(i6);
            int j = j(i12);
            int i13 = iArr[i6];
            int i14 = iArr[i6 + 2];
            int i15 = i14 & i4;
            Unsafe unsafe = n;
            if (j <= 17) {
                if (i15 != i5) {
                    i7 = i15 == i4 ? 0 : unsafe.getInt(zzdgVar2, i15);
                    i5 = i15;
                }
                i = 1 << (i14 >>> 20);
            } else {
                i = 0;
            }
            int i16 = i12 & i4;
            if (j >= zzcy.b.a) {
                int i17 = zzcy.c.a;
            }
            long j2 = i16;
            switch (j) {
                case 0:
                    if (bVar.o(i6, i5, i7, i, zzdgVar2)) {
                        i8 = x5n.B(i13 << 3, 8, i8);
                    }
                    i6 += 3;
                    i4 = 1048575;
                case 1:
                    if (bVar.o(i6, i5, i7, i, zzdgVar2)) {
                        i8 = x5n.B(i13 << 3, 4, i8);
                    }
                    bVar = this;
                    zzdgVar2 = zzdgVar;
                    i6 += 3;
                    i4 = 1048575;
                case 2:
                    if (bVar.o(i6, i5, i7, i, zzdgVar2)) {
                        long j3 = unsafe.getLong(zzdgVar2, j2);
                        r = zzcn.r(i13 << 3);
                        s = zzcn.s(j3);
                        i8 += s + r;
                    }
                    bVar = this;
                    i6 += 3;
                    i4 = 1048575;
                case 3:
                    if (bVar.o(i6, i5, i7, i, zzdgVar2)) {
                        long j4 = unsafe.getLong(zzdgVar2, j2);
                        r = zzcn.r(i13 << 3);
                        s = zzcn.s(j4);
                        i8 += s + r;
                    }
                    bVar = this;
                    i6 += 3;
                    i4 = 1048575;
                case 4:
                    if (bVar.o(i6, i5, i7, i, zzdgVar2)) {
                        long j5 = unsafe.getInt(zzdgVar2, j2);
                        r = zzcn.r(i13 << 3);
                        s = zzcn.s(j5);
                        i8 += s + r;
                    }
                    bVar = this;
                    i6 += 3;
                    i4 = 1048575;
                case 5:
                    if (bVar.o(i6, i5, i7, i, zzdgVar2)) {
                        i8 = x5n.B(i13 << 3, 8, i8);
                    }
                    bVar = this;
                    zzdgVar2 = zzdgVar;
                    i6 += 3;
                    i4 = 1048575;
                case 6:
                    if (bVar.o(i6, i5, i7, i, zzdgVar2)) {
                        i8 = x5n.B(i13 << 3, 4, i8);
                    }
                    bVar = this;
                    zzdgVar2 = zzdgVar;
                    i6 += 3;
                    i4 = 1048575;
                case 7:
                    if (bVar.o(i6, i5, i7, i, zzdgVar2)) {
                        i8 = x5n.B(i13 << 3, 1, i8);
                    }
                    bVar = this;
                    zzdgVar2 = zzdgVar;
                    i6 += 3;
                    i4 = 1048575;
                case 8:
                    if (bVar.o(i6, i5, i7, i, zzdgVar2)) {
                        int i18 = i13 << 3;
                        Object object = unsafe.getObject(zzdgVar2, j2);
                        if (object instanceof zzcg) {
                            int r7 = zzcn.r(i18);
                            int d = ((zzcg) object).d();
                            i8 = x5n.A(d, d, r7, i8);
                        } else {
                            int r8 = zzcn.r(i18);
                            int a2 = fao.a((String) object);
                            i8 = x5n.A(a2, a2, r8, i8);
                        }
                    }
                    bVar = this;
                    i6 += 3;
                    i4 = 1048575;
                case 9:
                    if (bVar.o(i6, i5, i7, i, zzdgVar2)) {
                        Object object2 = unsafe.getObject(zzdgVar2, j2);
                        s6o x = bVar.x(i6);
                        e eVar = d.a;
                        int r9 = zzcn.r(i13 << 3);
                        int b3 = ((zzbr) object2).b(x);
                        i8 = x5n.A(b3, b3, r9, i8);
                    }
                    i6 += 3;
                    i4 = 1048575;
                case 10:
                    if (bVar.o(i6, i5, i7, i, zzdgVar2)) {
                        zzcg zzcgVar = (zzcg) unsafe.getObject(zzdgVar2, j2);
                        int r10 = zzcn.r(i13 << 3);
                        int d2 = zzcgVar.d();
                        i8 = x5n.A(d2, d2, r10, i8);
                    }
                    bVar = this;
                    i6 += 3;
                    i4 = 1048575;
                case 11:
                    if (bVar.o(i6, i5, i7, i, zzdgVar2)) {
                        i8 = x5n.B(unsafe.getInt(zzdgVar2, j2), zzcn.r(i13 << 3), i8);
                    }
                    bVar = this;
                    i6 += 3;
                    i4 = 1048575;
                case 12:
                    if (bVar.o(i6, i5, i7, i, zzdgVar2)) {
                        long j6 = unsafe.getInt(zzdgVar2, j2);
                        r = zzcn.r(i13 << 3);
                        s = zzcn.s(j6);
                        i8 += s + r;
                    }
                    bVar = this;
                    i6 += 3;
                    i4 = 1048575;
                case 13:
                    if (bVar.o(i6, i5, i7, i, zzdgVar2)) {
                        i8 = x5n.B(i13 << 3, 4, i8);
                    }
                    bVar = this;
                    zzdgVar2 = zzdgVar;
                    i6 += 3;
                    i4 = 1048575;
                case 14:
                    if (bVar.o(i6, i5, i7, i, zzdgVar2)) {
                        i8 = x5n.B(i13 << 3, 8, i8);
                    }
                    bVar = this;
                    zzdgVar2 = zzdgVar;
                    i6 += 3;
                    i4 = 1048575;
                case 15:
                    if (bVar.o(i6, i5, i7, i, zzdgVar2)) {
                        int i19 = unsafe.getInt(zzdgVar2, j2);
                        i8 = x5n.B((i19 >> 31) ^ (i19 + i19), zzcn.r(i13 << 3), i8);
                    }
                    bVar = this;
                    i6 += 3;
                    i4 = 1048575;
                case 16:
                    if (bVar.o(i6, i5, i7, i, zzdgVar2)) {
                        long j7 = unsafe.getLong(zzdgVar2, j2);
                        r = zzcn.r(i13 << 3);
                        s = zzcn.s((j7 >> 63) ^ (j7 + j7));
                        i8 += s + r;
                    }
                    bVar = this;
                    i6 += 3;
                    i4 = 1048575;
                case 17:
                    if (bVar.o(i6, i5, i7, i, zzdgVar2)) {
                        zzel zzelVar = (zzel) unsafe.getObject(zzdgVar2, j2);
                        s6o x2 = bVar.x(i6);
                        e eVar2 = d.a;
                        int r11 = zzcn.r(i13 << 3);
                        i2 = r11 + r11;
                        b = ((zzbr) zzelVar).b(x2);
                        z = b + i2;
                        i8 += z;
                        i6 += 3;
                        i4 = 1048575;
                    } else {
                        i6 += 3;
                        i4 = 1048575;
                    }
                case 18:
                    z = d.z(i13, (List) unsafe.getObject(zzdgVar2, j2));
                    i8 += z;
                    i6 += 3;
                    i4 = 1048575;
                case 19:
                    z = d.y(i13, (List) unsafe.getObject(zzdgVar2, j2));
                    i8 += z;
                    i6 += 3;
                    i4 = 1048575;
                case 20:
                    List list = (List) unsafe.getObject(zzdgVar2, j2);
                    e eVar3 = d.a;
                    if (list.size() != 0) {
                        r2 = (zzcn.r(i13 << 3) * list.size()) + d.r(list);
                        i8 += r2;
                        i6 += 3;
                        i4 = 1048575;
                    }
                    r2 = 0;
                    i8 += r2;
                    i6 += 3;
                    i4 = 1048575;
                case 21:
                    List list2 = (List) unsafe.getObject(zzdgVar2, j2);
                    e eVar4 = d.a;
                    size = list2.size();
                    if (size != 0) {
                        s2 = d.s(list2);
                        r3 = zzcn.r(i13 << 3);
                        r4 = (r3 * size) + s2;
                        i8 += r4;
                        i6 += 3;
                        i4 = 1048575;
                    }
                    r4 = 0;
                    i8 += r4;
                    i6 += 3;
                    i4 = 1048575;
                case 22:
                    List list3 = (List) unsafe.getObject(zzdgVar2, j2);
                    e eVar5 = d.a;
                    size = list3.size();
                    if (size != 0) {
                        s2 = d.v(list3);
                        r3 = zzcn.r(i13 << 3);
                        r4 = (r3 * size) + s2;
                        i8 += r4;
                        i6 += 3;
                        i4 = 1048575;
                    }
                    r4 = 0;
                    i8 += r4;
                    i6 += 3;
                    i4 = 1048575;
                case 23:
                    z = d.z(i13, (List) unsafe.getObject(zzdgVar2, j2));
                    i8 += z;
                    i6 += 3;
                    i4 = 1048575;
                case 24:
                    z = d.y(i13, (List) unsafe.getObject(zzdgVar2, j2));
                    i8 += z;
                    i6 += 3;
                    i4 = 1048575;
                case 25:
                    List list4 = (List) unsafe.getObject(zzdgVar2, j2);
                    e eVar6 = d.a;
                    int size2 = list4.size();
                    if (size2 != 0) {
                        r2 = (zzcn.r(i13 << 3) + 1) * size2;
                        i8 += r2;
                        i6 += 3;
                        i4 = 1048575;
                    }
                    r2 = 0;
                    i8 += r2;
                    i6 += 3;
                    i4 = 1048575;
                case 26:
                    List list5 = (List) unsafe.getObject(zzdgVar2, j2);
                    e eVar7 = d.a;
                    int size3 = list5.size();
                    if (size3 != 0) {
                        r4 = zzcn.r(i13 << 3) * size3;
                        if (list5 instanceof zzdx) {
                            zzdx zzdxVar = (zzdx) list5;
                            for (int i20 = 0; i20 < size3; i20++) {
                                Object zzc = zzdxVar.zzc();
                                if (zzc instanceof zzcg) {
                                    int d3 = ((zzcg) zzc).d();
                                    r4 = x5n.B(d3, d3, r4);
                                } else {
                                    int a3 = fao.a((String) zzc);
                                    r4 = x5n.B(a3, a3, r4);
                                }
                            }
                        } else {
                            for (int i21 = 0; i21 < size3; i21++) {
                                Object obj = list5.get(i21);
                                if (obj instanceof zzcg) {
                                    int d4 = ((zzcg) obj).d();
                                    r4 = x5n.B(d4, d4, r4);
                                } else {
                                    int a4 = fao.a((String) obj);
                                    r4 = x5n.B(a4, a4, r4);
                                }
                            }
                        }
                        i8 += r4;
                        i6 += 3;
                        i4 = 1048575;
                    }
                    r4 = 0;
                    i8 += r4;
                    i6 += 3;
                    i4 = 1048575;
                case 27:
                    List list6 = (List) unsafe.getObject(zzdgVar2, j2);
                    s6o x3 = bVar.x(i6);
                    e eVar8 = d.a;
                    int size4 = list6.size();
                    if (size4 == 0) {
                        r5 = 0;
                    } else {
                        r5 = zzcn.r(i13 << 3) * size4;
                        for (int i22 = 0; i22 < size4; i22++) {
                            int b4 = ((zzbr) list6.get(i22)).b(x3);
                            r5 = x5n.B(b4, b4, r5);
                        }
                    }
                    i8 += r5;
                    i6 += 3;
                    i4 = 1048575;
                case 28:
                    List list7 = (List) unsafe.getObject(zzdgVar2, j2);
                    e eVar9 = d.a;
                    int size5 = list7.size();
                    if (size5 != 0) {
                        r4 = zzcn.r(i13 << 3) * size5;
                        for (int i23 = 0; i23 < list7.size(); i23++) {
                            int d5 = ((zzcg) list7.get(i23)).d();
                            r4 = x5n.B(d5, d5, r4);
                        }
                        i8 += r4;
                        i6 += 3;
                        i4 = 1048575;
                    }
                    r4 = 0;
                    i8 += r4;
                    i6 += 3;
                    i4 = 1048575;
                case 29:
                    List list8 = (List) unsafe.getObject(zzdgVar2, j2);
                    e eVar10 = d.a;
                    size = list8.size();
                    if (size != 0) {
                        s2 = d.w(list8);
                        r3 = zzcn.r(i13 << 3);
                        r4 = (r3 * size) + s2;
                        i8 += r4;
                        i6 += 3;
                        i4 = 1048575;
                    }
                    r4 = 0;
                    i8 += r4;
                    i6 += 3;
                    i4 = 1048575;
                case 30:
                    List list9 = (List) unsafe.getObject(zzdgVar2, j2);
                    e eVar11 = d.a;
                    size = list9.size();
                    if (size != 0) {
                        s2 = d.u(list9);
                        r3 = zzcn.r(i13 << 3);
                        r4 = (r3 * size) + s2;
                        i8 += r4;
                        i6 += 3;
                        i4 = 1048575;
                    }
                    r4 = 0;
                    i8 += r4;
                    i6 += 3;
                    i4 = 1048575;
                case 31:
                    z = d.y(i13, (List) unsafe.getObject(zzdgVar2, j2));
                    i8 += z;
                    i6 += 3;
                    i4 = 1048575;
                case 32:
                    z = d.z(i13, (List) unsafe.getObject(zzdgVar2, j2));
                    i8 += z;
                    i6 += 3;
                    i4 = 1048575;
                case 33:
                    List list10 = (List) unsafe.getObject(zzdgVar2, j2);
                    e eVar12 = d.a;
                    size = list10.size();
                    if (size != 0) {
                        s2 = d.x(list10);
                        r3 = zzcn.r(i13 << 3);
                        r4 = (r3 * size) + s2;
                        i8 += r4;
                        i6 += 3;
                        i4 = 1048575;
                    }
                    r4 = 0;
                    i8 += r4;
                    i6 += 3;
                    i4 = 1048575;
                case 34:
                    List list11 = (List) unsafe.getObject(zzdgVar2, j2);
                    e eVar13 = d.a;
                    size = list11.size();
                    if (size != 0) {
                        s2 = d.t(list11);
                        r3 = zzcn.r(i13 << 3);
                        r4 = (r3 * size) + s2;
                        i8 += r4;
                        i6 += 3;
                        i4 = 1048575;
                    }
                    r4 = 0;
                    i8 += r4;
                    i6 += 3;
                    i4 = 1048575;
                case 35:
                    List list12 = (List) unsafe.getObject(zzdgVar2, j2);
                    e eVar14 = d.a;
                    int size6 = list12.size() * 8;
                    if (size6 > 0) {
                        i8 = x5n.A(size6, zzcn.r(i13 << 3), size6, i8);
                    }
                    i6 += 3;
                    i4 = 1048575;
                case 36:
                    List list13 = (List) unsafe.getObject(zzdgVar2, j2);
                    e eVar15 = d.a;
                    int size7 = list13.size() * 4;
                    if (size7 > 0) {
                        i8 = x5n.A(size7, zzcn.r(i13 << 3), size7, i8);
                    }
                    i6 += 3;
                    i4 = 1048575;
                case 37:
                    int r12 = d.r((List) unsafe.getObject(zzdgVar2, j2));
                    if (r12 > 0) {
                        i8 = x5n.A(r12, zzcn.r(i13 << 3), r12, i8);
                    }
                    i6 += 3;
                    i4 = 1048575;
                case 38:
                    int s4 = d.s((List) unsafe.getObject(zzdgVar2, j2));
                    if (s4 > 0) {
                        i8 = x5n.A(s4, zzcn.r(i13 << 3), s4, i8);
                    }
                    i6 += 3;
                    i4 = 1048575;
                case 39:
                    int v = d.v((List) unsafe.getObject(zzdgVar2, j2));
                    if (v > 0) {
                        i8 = x5n.A(v, zzcn.r(i13 << 3), v, i8);
                    }
                    i6 += 3;
                    i4 = 1048575;
                case 40:
                    List list14 = (List) unsafe.getObject(zzdgVar2, j2);
                    e eVar16 = d.a;
                    int size8 = list14.size() * 8;
                    if (size8 > 0) {
                        i8 = x5n.A(size8, zzcn.r(i13 << 3), size8, i8);
                    }
                    i6 += 3;
                    i4 = 1048575;
                case 41:
                    List list15 = (List) unsafe.getObject(zzdgVar2, j2);
                    e eVar17 = d.a;
                    int size9 = list15.size() * 4;
                    if (size9 > 0) {
                        i8 = x5n.A(size9, zzcn.r(i13 << 3), size9, i8);
                    }
                    i6 += 3;
                    i4 = 1048575;
                case 42:
                    List list16 = (List) unsafe.getObject(zzdgVar2, j2);
                    e eVar18 = d.a;
                    int size10 = list16.size();
                    if (size10 > 0) {
                        i8 = x5n.A(size10, zzcn.r(i13 << 3), size10, i8);
                    }
                    i6 += 3;
                    i4 = 1048575;
                case 43:
                    int w = d.w((List) unsafe.getObject(zzdgVar2, j2));
                    if (w > 0) {
                        i8 = x5n.A(w, zzcn.r(i13 << 3), w, i8);
                    }
                    i6 += 3;
                    i4 = 1048575;
                case 44:
                    int u = d.u((List) unsafe.getObject(zzdgVar2, j2));
                    if (u > 0) {
                        i8 = x5n.A(u, zzcn.r(i13 << 3), u, i8);
                    }
                    i6 += 3;
                    i4 = 1048575;
                case 45:
                    List list17 = (List) unsafe.getObject(zzdgVar2, j2);
                    e eVar19 = d.a;
                    int size11 = list17.size() * 4;
                    if (size11 > 0) {
                        i8 = x5n.A(size11, zzcn.r(i13 << 3), size11, i8);
                    }
                    i6 += 3;
                    i4 = 1048575;
                case 46:
                    List list18 = (List) unsafe.getObject(zzdgVar2, j2);
                    e eVar20 = d.a;
                    int size12 = list18.size() * 8;
                    if (size12 > 0) {
                        i8 = x5n.A(size12, zzcn.r(i13 << 3), size12, i8);
                    }
                    i6 += 3;
                    i4 = 1048575;
                case 47:
                    int x4 = d.x((List) unsafe.getObject(zzdgVar2, j2));
                    if (x4 > 0) {
                        i8 = x5n.A(x4, zzcn.r(i13 << 3), x4, i8);
                    }
                    i6 += 3;
                    i4 = 1048575;
                case 48:
                    int t = d.t((List) unsafe.getObject(zzdgVar2, j2));
                    if (t > 0) {
                        i8 = x5n.A(t, zzcn.r(i13 << 3), t, i8);
                    }
                    i6 += 3;
                    i4 = 1048575;
                case 49:
                    List list19 = (List) unsafe.getObject(zzdgVar2, j2);
                    s6o x5 = bVar.x(i6);
                    e eVar21 = d.a;
                    int size13 = list19.size();
                    if (size13 == 0) {
                        i3 = 0;
                    } else {
                        i3 = 0;
                        for (int i24 = 0; i24 < size13; i24++) {
                            zzel zzelVar2 = (zzel) list19.get(i24);
                            int r13 = zzcn.r(i13 << 3);
                            i3 += ((zzbr) zzelVar2).b(x5) + r13 + r13;
                        }
                    }
                    i8 += i3;
                    i6 += 3;
                    i4 = 1048575;
                case 50:
                    int i25 = i6 / 3;
                    zzef zzefVar = (zzef) unsafe.getObject(zzdgVar2, j2);
                    if (zzefVar.isEmpty()) {
                        continue;
                    } else {
                        Iterator it = zzefVar.entrySet().iterator();
                        if (it.hasNext()) {
                            Map.Entry entry2 = (Map.Entry) it.next();
                            entry2.getKey();
                            entry2.getValue();
                            throw null;
                        }
                    }
                    i6 += 3;
                    i4 = 1048575;
                case 51:
                    if (bVar.r(i13, i6, zzdgVar2)) {
                        i8 = x5n.B(i13 << 3, 8, i8);
                    }
                    i6 += 3;
                    i4 = 1048575;
                case 52:
                    if (bVar.r(i13, i6, zzdgVar2)) {
                        i8 = x5n.B(i13 << 3, 4, i8);
                    }
                    i6 += 3;
                    i4 = 1048575;
                case 53:
                    if (bVar.r(i13, i6, zzdgVar2)) {
                        long m2 = m(zzdgVar2, j2);
                        r6 = zzcn.r(i13 << 3);
                        s3 = zzcn.s(m2);
                        i8 += s3 + r6;
                        i6 += 3;
                        i4 = 1048575;
                    } else {
                        i6 += 3;
                        i4 = 1048575;
                    }
                case 54:
                    if (bVar.r(i13, i6, zzdgVar2)) {
                        long m3 = m(zzdgVar2, j2);
                        r6 = zzcn.r(i13 << 3);
                        s3 = zzcn.s(m3);
                        i8 += s3 + r6;
                        i6 += 3;
                        i4 = 1048575;
                    } else {
                        i6 += 3;
                        i4 = 1048575;
                    }
                case 55:
                    if (bVar.r(i13, i6, zzdgVar2)) {
                        long l = l(zzdgVar2, j2);
                        r6 = zzcn.r(i13 << 3);
                        s3 = zzcn.s(l);
                        i8 += s3 + r6;
                        i6 += 3;
                        i4 = 1048575;
                    } else {
                        i6 += 3;
                        i4 = 1048575;
                    }
                case 56:
                    if (bVar.r(i13, i6, zzdgVar2)) {
                        i8 = x5n.B(i13 << 3, 8, i8);
                    }
                    i6 += 3;
                    i4 = 1048575;
                case 57:
                    if (bVar.r(i13, i6, zzdgVar2)) {
                        i8 = x5n.B(i13 << 3, 4, i8);
                    }
                    i6 += 3;
                    i4 = 1048575;
                case 58:
                    if (bVar.r(i13, i6, zzdgVar2)) {
                        i8 = x5n.B(i13 << 3, 1, i8);
                    }
                    i6 += 3;
                    i4 = 1048575;
                case 59:
                    if (bVar.r(i13, i6, zzdgVar2)) {
                        int i26 = i13 << 3;
                        Object object3 = unsafe.getObject(zzdgVar2, j2);
                        if (object3 instanceof zzcg) {
                            int r14 = zzcn.r(i26);
                            int d6 = ((zzcg) object3).d();
                            i8 = x5n.A(d6, d6, r14, i8);
                        } else {
                            int r15 = zzcn.r(i26);
                            int a5 = fao.a((String) object3);
                            i8 = x5n.A(a5, a5, r15, i8);
                        }
                    }
                    i6 += 3;
                    i4 = 1048575;
                case 60:
                    if (bVar.r(i13, i6, zzdgVar2)) {
                        Object object4 = unsafe.getObject(zzdgVar2, j2);
                        s6o x6 = bVar.x(i6);
                        e eVar22 = d.a;
                        int r16 = zzcn.r(i13 << 3);
                        int b5 = ((zzbr) object4).b(x6);
                        i8 = x5n.A(b5, b5, r16, i8);
                    }
                    i6 += 3;
                    i4 = 1048575;
                case 61:
                    if (bVar.r(i13, i6, zzdgVar2)) {
                        zzcg zzcgVar2 = (zzcg) unsafe.getObject(zzdgVar2, j2);
                        int r17 = zzcn.r(i13 << 3);
                        int d7 = zzcgVar2.d();
                        i8 = x5n.A(d7, d7, r17, i8);
                    }
                    i6 += 3;
                    i4 = 1048575;
                case 62:
                    if (bVar.r(i13, i6, zzdgVar2)) {
                        i8 = x5n.B(l(zzdgVar2, j2), zzcn.r(i13 << 3), i8);
                    }
                    i6 += 3;
                    i4 = 1048575;
                case 63:
                    if (bVar.r(i13, i6, zzdgVar2)) {
                        long l2 = l(zzdgVar2, j2);
                        r6 = zzcn.r(i13 << 3);
                        s3 = zzcn.s(l2);
                        i8 += s3 + r6;
                        i6 += 3;
                        i4 = 1048575;
                    } else {
                        i6 += 3;
                        i4 = 1048575;
                    }
                case 64:
                    if (bVar.r(i13, i6, zzdgVar2)) {
                        i8 = x5n.B(i13 << 3, 4, i8);
                    }
                    i6 += 3;
                    i4 = 1048575;
                case 65:
                    if (bVar.r(i13, i6, zzdgVar2)) {
                        i8 = x5n.B(i13 << 3, 8, i8);
                    }
                    i6 += 3;
                    i4 = 1048575;
                case 66:
                    if (bVar.r(i13, i6, zzdgVar2)) {
                        int l3 = l(zzdgVar2, j2);
                        i8 = x5n.B((l3 >> 31) ^ (l3 + l3), zzcn.r(i13 << 3), i8);
                    }
                    i6 += 3;
                    i4 = 1048575;
                case 67:
                    if (bVar.r(i13, i6, zzdgVar2)) {
                        long m4 = m(zzdgVar2, j2);
                        r6 = zzcn.r(i13 << 3);
                        s3 = zzcn.s((m4 >> 63) ^ (m4 + m4));
                        i8 += s3 + r6;
                        i6 += 3;
                        i4 = 1048575;
                    } else {
                        i6 += 3;
                        i4 = 1048575;
                    }
                case 68:
                    if (bVar.r(i13, i6, zzdgVar2)) {
                        zzel zzelVar3 = (zzel) unsafe.getObject(zzdgVar2, j2);
                        s6o x7 = bVar.x(i6);
                        e eVar23 = d.a;
                        int r18 = zzcn.r(i13 << 3);
                        i2 = r18 + r18;
                        b = ((zzbr) zzelVar3).b(x7);
                        z = b + i2;
                        i8 += z;
                        i6 += 3;
                        i4 = 1048575;
                    } else {
                        i6 += 3;
                        i4 = 1048575;
                    }
                default:
                    i6 += 3;
                    i4 = 1048575;
            }
        }
    }

    public final int i(int i) {
        return this.a[i + 1];
    }

    public final boolean n(zzdg zzdgVar, zzdg zzdgVar2, int i) {
        return p(i, zzdgVar) == p(i, zzdgVar2);
    }

    public final boolean o(int i, int i2, int i3, int i4, Object obj) {
        return i2 == 1048575 ? p(i, obj) : (i3 & i4) != 0;
    }

    public final boolean p(int i, Object obj) {
        int i2 = this.a[i + 2];
        long j = i2 & 1048575;
        if (j != 1048575) {
            return ((1 << (i2 >>> 20)) & n9o.d(obj, j)) != 0;
        }
        int i3 = i(i);
        long j2 = i3 & 1048575;
        switch (j(i3)) {
            case 0:
                if (Double.doubleToRawLongBits(n9o.c.C(obj, j2)) != 0) {
                }
                break;
            case 1:
                if (Float.floatToRawIntBits(n9o.c.v(obj, j2)) != 0) {
                }
                break;
            case 2:
                if (n9o.f(obj, j2) != 0) {
                }
                break;
            case 3:
                if (n9o.f(obj, j2) != 0) {
                }
                break;
            case 4:
                if (n9o.d(obj, j2) != 0) {
                }
                break;
            case 5:
                if (n9o.f(obj, j2) != 0) {
                }
                break;
            case 6:
                if (n9o.d(obj, j2) != 0) {
                }
                break;
            case 7:
                break;
            case 8:
                Object h = n9o.h(obj, j2);
                if (!(h instanceof String)) {
                    if (!(h instanceof zzcg)) {
                        ilg.c();
                        break;
                    } else if (!zzcg.b.equals(h)) {
                    }
                } else if (!((String) h).isEmpty()) {
                }
                break;
            case 9:
                if (n9o.h(obj, j2) != null) {
                }
                break;
            case 10:
                if (!zzcg.b.equals(n9o.h(obj, j2))) {
                }
                break;
            case 11:
                if (n9o.d(obj, j2) != 0) {
                }
                break;
            case 12:
                if (n9o.d(obj, j2) != 0) {
                }
                break;
            case 13:
                if (n9o.d(obj, j2) != 0) {
                }
                break;
            case 14:
                if (n9o.f(obj, j2) != 0) {
                }
                break;
            case 15:
                if (n9o.d(obj, j2) != 0) {
                }
                break;
            case 16:
                if (n9o.f(obj, j2) != 0) {
                }
                break;
            case 17:
                if (n9o.h(obj, j2) != null) {
                }
                break;
            default:
                ilg.c();
                break;
        }
        return false;
    }

    public final void q(int i, Object obj) {
        int i2 = this.a[i + 2];
        long j = 1048575 & i2;
        if (j == 1048575) {
            return;
        }
        n9o.e((1 << (i2 >>> 20)) | n9o.d(obj, j), j, obj);
    }

    public final boolean r(int i, int i2, Object obj) {
        return n9o.d(obj, (long) (this.a[i2 + 2] & 1048575)) == i;
    }

    public final void s(int i, int i2, Object obj) {
        n9o.e(i, this.a[i2 + 2] & 1048575, obj);
    }

    public final int t(int i) {
        if (i >= this.c && i <= this.d) {
            int[] iArr = this.a;
            int length = (iArr.length / 3) - 1;
            int i2 = 0;
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
        }
        return -1;
    }

    public final void v(int i, Object obj, Object obj2) {
        if (p(i, obj2)) {
            long i2 = i(i) & 1048575;
            Unsafe unsafe = n;
            Object object = unsafe.getObject(obj2, i2);
            if (object == null) {
                int i3 = this.a[i];
                String obj3 = obj2.toString();
                hbo.g(fn0.a(i3, 38) + obj3.length(), i3, obj3);
                return;
            }
            s6o x = x(i);
            if (!p(i, obj)) {
                if (k(object)) {
                    Object zza = x.zza();
                    x.a(zza, object);
                    unsafe.putObject(obj, i2, zza);
                } else {
                    unsafe.putObject(obj, i2, object);
                }
                q(i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, i2);
            if (!k(object2)) {
                Object zza2 = x.zza();
                x.a(zza2, object2);
                unsafe.putObject(obj, i2, zza2);
                object2 = zza2;
            }
            x.a(object2, object);
        }
    }

    public final void w(int i, Object obj, Object obj2) {
        int[] iArr = this.a;
        int i2 = iArr[i];
        if (r(i2, i, obj2)) {
            long i3 = i(i) & 1048575;
            Unsafe unsafe = n;
            Object object = unsafe.getObject(obj2, i3);
            if (object == null) {
                int i4 = iArr[i];
                String obj3 = obj2.toString();
                hbo.g(fn0.a(i4, 38) + obj3.length(), i4, obj3);
                return;
            }
            s6o x = x(i);
            if (!r(i2, i, obj)) {
                if (k(object)) {
                    Object zza = x.zza();
                    x.a(zza, object);
                    unsafe.putObject(obj, i3, zza);
                } else {
                    unsafe.putObject(obj, i3, object);
                }
                s(i2, i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, i3);
            if (!k(object2)) {
                Object zza2 = x.zza();
                x.a(zza2, object2);
                unsafe.putObject(obj, i3, zza2);
                object2 = zza2;
            }
            x.a(object2, object);
        }
    }

    public final s6o x(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        Object[] objArr = this.b;
        s6o s6oVar = (s6o) objArr[i3];
        if (s6oVar != null) {
            return s6oVar;
        }
        s6o a = d6o.c.a((Class) objArr[i3 + 1]);
        objArr[i3] = a;
        return a;
    }

    public final zzdl y(int i) {
        int i2 = i / 3;
        return (zzdl) this.b[i2 + i2 + 1];
    }

    public final Object z(int i, Object obj) {
        s6o x = x(i);
        int i2 = i(i) & 1048575;
        if (!p(i, obj)) {
            return x.zza();
        }
        Object object = n.getObject(obj, i2);
        if (k(object)) {
            return object;
        }
        Object zza = x.zza();
        if (object != null) {
            x.a(zza, object);
        }
        return zza;
    }

    @Override // defpackage.s6o
    public final Object zza() {
        return (zzdg) ((zzdg) this.e).d(4, null);
    }
}

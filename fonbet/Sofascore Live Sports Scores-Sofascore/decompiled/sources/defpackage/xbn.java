package defpackage;

import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class xbn implements pcn {
    public static final int[] m = new int[0];
    public static final Unsafe n = qdn.k();
    public final int[] a;
    public final Object[] b;
    public final int c;
    public final int d;
    public final k7n e;
    public final boolean f;
    public final boolean g;
    public final int[] h;
    public final int i;
    public final int j;
    public final edn k;
    public final b9n l;

    public xbn(int[] iArr, Object[] objArr, int i, int i2, k7n k7nVar, int[] iArr2, int i3, int i4, edn ednVar, d9n d9nVar) {
        this.a = iArr;
        this.b = objArr;
        this.c = i;
        this.d = i2;
        this.g = k7nVar instanceof y9n;
        boolean z = false;
        if (d9nVar != null && (k7nVar instanceof w9n)) {
            z = true;
        }
        this.f = z;
        this.h = iArr2;
        this.i = i3;
        this.j = i4;
        this.k = ednVar;
        this.l = d9nVar;
        this.e = k7nVar;
    }

    public static int k(int i) {
        return (i >>> 20) & 255;
    }

    public static boolean l(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof y9n) {
            return ((y9n) obj).k();
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
        return ((Integer) qdn.i(obj, j)).intValue();
    }

    public static long o(Object obj, long j) {
        return ((Long) qdn.i(obj, j)).longValue();
    }

    public static fdn w(Object obj) {
        y9n y9nVar = (y9n) obj;
        fdn fdnVar = y9nVar.zzc;
        if (fdnVar != fdn.f) {
            return fdnVar;
        }
        fdn a = fdn.a();
        y9nVar.zzc = a;
        return a;
    }

    public static Field y(Class cls, String str) {
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
            pcn B = B(i);
            if (!t(i2, i, obj)) {
                if (l(object)) {
                    y9n zza = B.zza();
                    B.a(zza, object);
                    unsafe.putObject(obj, j, zza);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                u(i2, i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!l(object2)) {
                y9n zza2 = B.zza();
                B.a(zza2, object2);
                unsafe.putObject(obj, j, zza2);
                object2 = zza2;
            }
            B.a(object2, object);
        }
    }

    public final pcn B(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        Object[] objArr = this.b;
        pcn pcnVar = (pcn) objArr[i3];
        if (pcnVar != null) {
            return pcnVar;
        }
        pcn a = gcn.c.a((Class) objArr[i3 + 1]);
        objArr[i3] = a;
        return a;
    }

    public final Object C(int i) {
        int i2 = i / 3;
        return this.b[i2 + i2];
    }

    public final can D(int i) {
        int i2 = i / 3;
        return (can) this.b[i2 + i2 + 1];
    }

    public final Object E(int i, Object obj) {
        pcn B = B(i);
        int j = j(i) & 1048575;
        if (!r(i, obj)) {
            return B.zza();
        }
        Object object = n.getObject(obj, j);
        if (l(object)) {
            return object;
        }
        y9n zza = B.zza();
        if (object != null) {
            B.a(zza, object);
        }
        return zza;
    }

    public final void F(int i, Object obj, Object obj2) {
        n.putObject(obj, j(i) & 1048575, obj2);
        s(i, obj);
    }

    public final Object G(int i, int i2, Object obj) {
        pcn B = B(i2);
        if (!t(i, i2, obj)) {
            return B.zza();
        }
        Object object = n.getObject(obj, j(i2) & 1048575);
        if (l(object)) {
            return object;
        }
        y9n zza = B.zza();
        if (object != null) {
            B.a(zza, object);
        }
        return zza;
    }

    public final void H(int i, Object obj, Object obj2, int i2) {
        n.putObject(obj, j(i2) & 1048575, obj2);
        u(i, i2, obj);
    }

    public final void I(int i, Object obj, Object obj2) {
        int i2 = this.a[i];
        Object i3 = qdn.i(obj, j(i) & 1048575);
        if (i3 == null || D(i) == null) {
            return;
        }
        C(i).getClass();
        pvd.j();
    }

    public final void J(int i, zz0 zz0Var, Object obj) {
        m8n m8nVar = (m8n) zz0Var.e;
        long j = i & 1048575;
        if ((536870912 & i) != 0) {
            zz0Var.h1(2);
            qdn.j(j, obj, m8nVar.r());
        } else if (this.g) {
            zz0Var.h1(2);
            qdn.j(j, obj, m8nVar.q());
        } else {
            zz0Var.h1(2);
            qdn.j(j, obj, m8nVar.s());
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.pcn
    public final void a(Object obj, Object obj2) {
        Object obj3;
        m(obj);
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.a;
            if (i >= iArr.length) {
                Object obj4 = obj;
                tcn.b(obj4, obj2);
                if (!this.f || ((w9n) obj2).zzb.a.isEmpty()) {
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
                        sck sckVar = qdn.c;
                        obj3 = obj;
                        sckVar.G(obj3, j2, sckVar.C(obj2, j2));
                        s(i, obj3);
                        break;
                    }
                    obj3 = obj;
                    break;
                case 1:
                    if (r(i, obj2)) {
                        sck sckVar2 = qdn.c;
                        sckVar2.B(obj, j2, sckVar2.v(obj2, j2));
                        s(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 2:
                    if (r(i, obj2)) {
                        qdn.h(obj, j2, qdn.g(obj2, j2));
                        s(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 3:
                    if (r(i, obj2)) {
                        qdn.h(obj, j2, qdn.g(obj2, j2));
                        s(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 4:
                    if (r(i, obj2)) {
                        qdn.f(qdn.e(obj2, j2), j2, obj);
                        s(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 5:
                    if (r(i, obj2)) {
                        qdn.h(obj, j2, qdn.g(obj2, j2));
                        s(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 6:
                    if (r(i, obj2)) {
                        qdn.f(qdn.e(obj2, j2), j2, obj);
                        s(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 7:
                    if (r(i, obj2)) {
                        sck sckVar3 = qdn.c;
                        sckVar3.u(obj, j2, sckVar3.s(obj2, j2));
                        s(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 8:
                    if (r(i, obj2)) {
                        qdn.j(j2, obj, qdn.i(obj2, j2));
                        s(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 9:
                    z(i, obj, obj2);
                    obj3 = obj;
                    break;
                case 10:
                    if (r(i, obj2)) {
                        qdn.j(j2, obj, qdn.i(obj2, j2));
                        s(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 11:
                    if (r(i, obj2)) {
                        qdn.f(qdn.e(obj2, j2), j2, obj);
                        s(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 12:
                    if (r(i, obj2)) {
                        qdn.f(qdn.e(obj2, j2), j2, obj);
                        s(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 13:
                    if (r(i, obj2)) {
                        qdn.f(qdn.e(obj2, j2), j2, obj);
                        s(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 14:
                    if (r(i, obj2)) {
                        qdn.h(obj, j2, qdn.g(obj2, j2));
                        s(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 15:
                    if (r(i, obj2)) {
                        qdn.f(qdn.e(obj2, j2), j2, obj);
                        s(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 16:
                    if (r(i, obj2)) {
                        qdn.h(obj, j2, qdn.g(obj2, j2));
                        s(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 17:
                    z(i, obj, obj2);
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
                    ian ianVar = (ian) qdn.i(obj, j2);
                    ian ianVar2 = (ian) qdn.i(obj2, j2);
                    int size = ianVar.size();
                    int size2 = ianVar2.size();
                    if (size > 0 && size2 > 0) {
                        if (!((m7n) ianVar).a) {
                            ianVar = ianVar.f(size2 + size);
                        }
                        ianVar.addAll(ianVar2);
                    }
                    if (size > 0) {
                        ianVar2 = ianVar;
                    }
                    qdn.j(j2, obj, ianVar2);
                    obj3 = obj;
                    break;
                case 50:
                    idn idnVar = tcn.a;
                    qdn.j(j2, obj, mbn.a(qdn.i(obj, j2), qdn.i(obj2, j2)));
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
                        qdn.j(j2, obj, qdn.i(obj2, j2));
                        u(i3, i, obj);
                    }
                    obj3 = obj;
                    break;
                case 60:
                    A(i, obj, obj2);
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
                        qdn.j(j2, obj, qdn.i(obj2, j2));
                        u(i3, i, obj);
                    }
                    obj3 = obj;
                    break;
                case 68:
                    A(i, obj, obj2);
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

    @Override // defpackage.pcn
    public final boolean b(Object obj) {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        int i5 = 0;
        int i6 = 1048575;
        while (i5 < this.i) {
            int i7 = this.h[i5];
            int[] iArr = this.a;
            int i8 = iArr[i7];
            int j = j(i7);
            int i9 = iArr[i7 + 2];
            int i10 = i9 & 1048575;
            int i11 = 1 << (i9 >>> 20);
            if (i10 != i6) {
                if (i10 != 1048575) {
                    i4 = n.getInt(obj, i10);
                }
                i2 = i7;
                i3 = i4;
                i = i10;
            } else {
                int i12 = i4;
                i = i6;
                i2 = i7;
                i3 = i12;
            }
            if ((268435456 & j) == 0 || q(i2, i, i3, i11, obj)) {
                int k = k(j);
                if (k == 9 || k == 17) {
                    if (q(i2, i, i3, i11, obj) && !B(i2).b(qdn.i(obj, j & 1048575))) {
                    }
                    i5++;
                    i6 = i;
                    i4 = i3;
                } else {
                    if (k != 27) {
                        if (k == 60 || k == 68) {
                            if (t(i8, i2, obj) && !B(i2).b(qdn.i(obj, j & 1048575))) {
                            }
                        } else if (k != 49) {
                            if (k == 50 && !((kbn) qdn.i(obj, j & 1048575)).isEmpty()) {
                                C(i2).getClass();
                                pvd.j();
                                return false;
                            }
                        }
                        i5++;
                        i6 = i;
                        i4 = i3;
                    }
                    List list = (List) qdn.i(obj, j & 1048575);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        pcn B = B(i2);
                        for (int i13 = 0; i13 < list.size(); i13++) {
                            if (B.b(list.get(i13))) {
                            }
                        }
                    }
                    i5++;
                    i6 = i;
                    i4 = i3;
                }
            }
            return false;
        }
        if (this.f) {
            ((w9n) obj).zzb.c();
        }
        return true;
    }

    @Override // defpackage.pcn
    public final void c(Object obj) {
        if (!l(obj)) {
            return;
        }
        if (obj instanceof y9n) {
            y9n y9nVar = (y9n) obj;
            y9nVar.o();
            y9nVar.zza = 0;
            y9nVar.l();
        }
        int i = 0;
        while (true) {
            int[] iArr = this.a;
            if (i >= iArr.length) {
                this.k.j(obj);
                if (this.f) {
                    this.l.a(obj);
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
                            m7n m7nVar = (m7n) ((ian) qdn.i(obj, j2));
                            if (!m7nVar.a) {
                                break;
                            } else {
                                m7nVar.a = false;
                                break;
                            }
                        case 50:
                            Object object = unsafe.getObject(obj, j2);
                            if (object == null) {
                                break;
                            } else {
                                ((kbn) object).a = false;
                                unsafe.putObject(obj, j2, object);
                                break;
                            }
                    }
                } else if (t(iArr[i], i, obj)) {
                    B(i).c(unsafe.getObject(obj, j2));
                }
                i += 3;
            }
            if (r(i, obj)) {
                B(i).c(unsafe.getObject(obj, j2));
            }
            i += 3;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.pcn
    public final void d(Object obj, b1l b1lVar) {
        boolean z;
        int[] iArr;
        int i;
        boolean z2;
        xbn xbnVar = this;
        r8n r8nVar = (r8n) b1lVar.b;
        Map.Entry entry = null;
        if (xbnVar.f) {
            i9n i9nVar = ((w9n) obj).zzb;
            if (!i9nVar.a.isEmpty()) {
                entry = (Map.Entry) i9nVar.b().next();
            }
        }
        Map.Entry entry2 = entry;
        int i2 = 1048575;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            int[] iArr2 = xbnVar.a;
            if (i4 >= iArr2.length) {
                if (entry2 != null) {
                    throw fc6.d(entry2);
                }
                ((y9n) obj).zzc.b(b1lVar);
                return;
            }
            int j = xbnVar.j(i4);
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
                    if (xbnVar.q(i4, i3, i5, i, obj)) {
                        r8nVar.f(i6, Double.doubleToRawLongBits(qdn.c.C(obj, j2)));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    xbnVar = this;
                case 1:
                    if (xbnVar.q(i4, i3, i5, i, obj)) {
                        r8nVar.d(i6, Float.floatToRawIntBits(qdn.c.v(obj, j2)));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    xbnVar = this;
                case 2:
                    if (xbnVar.q(i4, i3, i5, i, obj)) {
                        r8nVar.e(i6, unsafe.getLong(obj, j2));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    xbnVar = this;
                case 3:
                    if (xbnVar.q(i4, i3, i5, i, obj)) {
                        r8nVar.e(i6, unsafe.getLong(obj, j2));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    xbnVar = this;
                case 4:
                    if (xbnVar.q(i4, i3, i5, i, obj)) {
                        r8nVar.b(i6, unsafe.getInt(obj, j2));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    xbnVar = this;
                case 5:
                    if (xbnVar.q(i4, i3, i5, i, obj)) {
                        r8nVar.f(i6, unsafe.getLong(obj, j2));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    xbnVar = this;
                case 6:
                    if (xbnVar.q(i4, i3, i5, i, obj)) {
                        r8nVar.d(i6, unsafe.getInt(obj, j2));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    xbnVar = this;
                case 7:
                    if (xbnVar.q(i4, i3, i5, i, obj)) {
                        r8nVar.g(i6, qdn.c.s(obj, j2));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    xbnVar = this;
                case 8:
                    if (xbnVar.q(i4, i3, i5, i, obj)) {
                        Object object = unsafe.getObject(obj, j2);
                        if (object instanceof String) {
                            r8nVar.h(i6, (String) object);
                        } else {
                            r8nVar.i(i6, (g8n) object);
                        }
                    }
                    i4 += 3;
                    i2 = 1048575;
                    xbnVar = this;
                case 9:
                    if (xbnVar.q(i4, i3, i5, i, obj)) {
                        b1lVar.l(i6, unsafe.getObject(obj, j2), xbnVar.B(i4));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    xbnVar = this;
                case 10:
                    if (xbnVar.q(i4, i3, i5, i, obj)) {
                        r8nVar.i(i6, (g8n) unsafe.getObject(obj, j2));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    xbnVar = this;
                case 11:
                    if (xbnVar.q(i4, i3, i5, i, obj)) {
                        r8nVar.c(i6, unsafe.getInt(obj, j2));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    xbnVar = this;
                case 12:
                    if (xbnVar.q(i4, i3, i5, i, obj)) {
                        r8nVar.b(i6, unsafe.getInt(obj, j2));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    xbnVar = this;
                case 13:
                    if (xbnVar.q(i4, i3, i5, i, obj)) {
                        r8nVar.d(i6, unsafe.getInt(obj, j2));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    xbnVar = this;
                case 14:
                    if (xbnVar.q(i4, i3, i5, i, obj)) {
                        r8nVar.f(i6, unsafe.getLong(obj, j2));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    xbnVar = this;
                case 15:
                    if (xbnVar.q(i4, i3, i5, i, obj)) {
                        int i10 = unsafe.getInt(obj, j2);
                        r8nVar.c(i6, (i10 >> 31) ^ (i10 + i10));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    xbnVar = this;
                case 16:
                    if (xbnVar.q(i4, i3, i5, i, obj)) {
                        long j3 = unsafe.getLong(obj, j2);
                        r8nVar.e(i6, (j3 >> 63) ^ (j3 + j3));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    xbnVar = this;
                case 17:
                    if (xbnVar.q(i4, i3, i5, i, obj)) {
                        Object object2 = unsafe.getObject(obj, j2);
                        r8nVar.a(i6, 3);
                        xbnVar.B(i4).d((k7n) object2, b1lVar);
                        r8nVar.a(i6, 4);
                    }
                    i4 += 3;
                    i2 = 1048575;
                    xbnVar = this;
                case 18:
                    z2 = false;
                    tcn.d(iArr[i4], (List) unsafe.getObject(obj, j2), b1lVar, false);
                    i4 += 3;
                    i2 = 1048575;
                    xbnVar = this;
                case 19:
                    z2 = false;
                    tcn.e(iArr[i4], (List) unsafe.getObject(obj, j2), b1lVar, false);
                    i4 += 3;
                    i2 = 1048575;
                    xbnVar = this;
                case 20:
                    z2 = false;
                    tcn.f(iArr[i4], (List) unsafe.getObject(obj, j2), b1lVar, false);
                    i4 += 3;
                    i2 = 1048575;
                    xbnVar = this;
                case 21:
                    z2 = false;
                    tcn.g(iArr[i4], (List) unsafe.getObject(obj, j2), b1lVar, false);
                    i4 += 3;
                    i2 = 1048575;
                    xbnVar = this;
                case 22:
                    z2 = false;
                    tcn.k(iArr[i4], (List) unsafe.getObject(obj, j2), b1lVar, false);
                    i4 += 3;
                    i2 = 1048575;
                    xbnVar = this;
                case 23:
                    z2 = false;
                    tcn.i(iArr[i4], (List) unsafe.getObject(obj, j2), b1lVar, false);
                    i4 += 3;
                    i2 = 1048575;
                    xbnVar = this;
                case 24:
                    z2 = false;
                    tcn.n(iArr[i4], (List) unsafe.getObject(obj, j2), b1lVar, false);
                    i4 += 3;
                    i2 = 1048575;
                    xbnVar = this;
                case 25:
                    z2 = false;
                    tcn.q(iArr[i4], (List) unsafe.getObject(obj, j2), b1lVar, false);
                    i4 += 3;
                    i2 = 1048575;
                    xbnVar = this;
                case 26:
                    int i11 = iArr[i4];
                    List list = (List) unsafe.getObject(obj, j2);
                    idn idnVar = tcn.a;
                    if (list != null && !list.isEmpty()) {
                        for (int i12 = 0; i12 < list.size(); i12++) {
                            r8nVar.h(i11, (String) list.get(i12));
                        }
                    }
                    i4 += 3;
                    i2 = 1048575;
                    xbnVar = this;
                    break;
                case 27:
                    int i13 = iArr[i4];
                    List list2 = (List) unsafe.getObject(obj, j2);
                    pcn B = xbnVar.B(i4);
                    idn idnVar2 = tcn.a;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i14 = 0; i14 < list2.size(); i14++) {
                            b1lVar.l(i13, list2.get(i14), B);
                        }
                    }
                    i4 += 3;
                    i2 = 1048575;
                    xbnVar = this;
                    break;
                case 28:
                    int i15 = iArr[i4];
                    List list3 = (List) unsafe.getObject(obj, j2);
                    idn idnVar3 = tcn.a;
                    if (list3 != null && !list3.isEmpty()) {
                        for (int i16 = 0; i16 < list3.size(); i16++) {
                            r8nVar.i(i15, (g8n) list3.get(i16));
                        }
                    }
                    i4 += 3;
                    i2 = 1048575;
                    xbnVar = this;
                    break;
                case 29:
                    z2 = false;
                    tcn.l(iArr[i4], (List) unsafe.getObject(obj, j2), b1lVar, false);
                    i4 += 3;
                    i2 = 1048575;
                    xbnVar = this;
                case 30:
                    z2 = false;
                    tcn.p(iArr[i4], (List) unsafe.getObject(obj, j2), b1lVar, false);
                    i4 += 3;
                    i2 = 1048575;
                    xbnVar = this;
                case 31:
                    z2 = false;
                    tcn.o(iArr[i4], (List) unsafe.getObject(obj, j2), b1lVar, false);
                    i4 += 3;
                    i2 = 1048575;
                    xbnVar = this;
                case 32:
                    z2 = false;
                    tcn.j(iArr[i4], (List) unsafe.getObject(obj, j2), b1lVar, false);
                    i4 += 3;
                    i2 = 1048575;
                    xbnVar = this;
                case 33:
                    z2 = false;
                    tcn.m(iArr[i4], (List) unsafe.getObject(obj, j2), b1lVar, false);
                    i4 += 3;
                    i2 = 1048575;
                    xbnVar = this;
                case 34:
                    z2 = false;
                    tcn.h(iArr[i4], (List) unsafe.getObject(obj, j2), b1lVar, false);
                    i4 += 3;
                    i2 = 1048575;
                    xbnVar = this;
                case 35:
                    tcn.d(iArr[i4], (List) unsafe.getObject(obj, j2), b1lVar, z);
                    i4 += 3;
                    i2 = 1048575;
                    xbnVar = this;
                case 36:
                    tcn.e(iArr[i4], (List) unsafe.getObject(obj, j2), b1lVar, z);
                    i4 += 3;
                    i2 = 1048575;
                    xbnVar = this;
                case 37:
                    tcn.f(iArr[i4], (List) unsafe.getObject(obj, j2), b1lVar, z);
                    i4 += 3;
                    i2 = 1048575;
                    xbnVar = this;
                case 38:
                    tcn.g(iArr[i4], (List) unsafe.getObject(obj, j2), b1lVar, z);
                    i4 += 3;
                    i2 = 1048575;
                    xbnVar = this;
                case 39:
                    tcn.k(iArr[i4], (List) unsafe.getObject(obj, j2), b1lVar, z);
                    i4 += 3;
                    i2 = 1048575;
                    xbnVar = this;
                case 40:
                    tcn.i(iArr[i4], (List) unsafe.getObject(obj, j2), b1lVar, z);
                    i4 += 3;
                    i2 = 1048575;
                    xbnVar = this;
                case 41:
                    tcn.n(iArr[i4], (List) unsafe.getObject(obj, j2), b1lVar, z);
                    i4 += 3;
                    i2 = 1048575;
                    xbnVar = this;
                case 42:
                    tcn.q(iArr[i4], (List) unsafe.getObject(obj, j2), b1lVar, z);
                    i4 += 3;
                    i2 = 1048575;
                    xbnVar = this;
                case 43:
                    tcn.l(iArr[i4], (List) unsafe.getObject(obj, j2), b1lVar, z);
                    i4 += 3;
                    i2 = 1048575;
                    xbnVar = this;
                case 44:
                    tcn.p(iArr[i4], (List) unsafe.getObject(obj, j2), b1lVar, z);
                    i4 += 3;
                    i2 = 1048575;
                    xbnVar = this;
                case 45:
                    tcn.o(iArr[i4], (List) unsafe.getObject(obj, j2), b1lVar, z);
                    i4 += 3;
                    i2 = 1048575;
                    xbnVar = this;
                case 46:
                    tcn.j(iArr[i4], (List) unsafe.getObject(obj, j2), b1lVar, z);
                    i4 += 3;
                    i2 = 1048575;
                    xbnVar = this;
                case 47:
                    tcn.m(iArr[i4], (List) unsafe.getObject(obj, j2), b1lVar, z);
                    i4 += 3;
                    i2 = 1048575;
                    xbnVar = this;
                case 48:
                    tcn.h(iArr[i4], (List) unsafe.getObject(obj, j2), b1lVar, z);
                    i4 += 3;
                    i2 = 1048575;
                    xbnVar = this;
                case 49:
                    int i17 = iArr[i4];
                    List list4 = (List) unsafe.getObject(obj, j2);
                    pcn B2 = xbnVar.B(i4);
                    idn idnVar4 = tcn.a;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i18 = 0; i18 < list4.size(); i18++) {
                            k7n k7nVar = (k7n) list4.get(i18);
                            r8nVar.a(i17, 3);
                            B2.d(k7nVar, b1lVar);
                            r8nVar.a(i17, 4);
                        }
                    }
                    i4 += 3;
                    i2 = 1048575;
                    xbnVar = this;
                    break;
                case 50:
                    if (unsafe.getObject(obj, j2) != null) {
                        xbnVar.C(i4).getClass();
                        pvd.j();
                        return;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    xbnVar = this;
                case 51:
                    if (xbnVar.t(i6, i4, obj)) {
                        r8nVar.f(i6, Double.doubleToRawLongBits(((Double) qdn.i(obj, j2)).doubleValue()));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    xbnVar = this;
                case 52:
                    if (xbnVar.t(i6, i4, obj)) {
                        r8nVar.d(i6, Float.floatToRawIntBits(((Float) qdn.i(obj, j2)).floatValue()));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    xbnVar = this;
                case 53:
                    if (xbnVar.t(i6, i4, obj)) {
                        r8nVar.e(i6, o(obj, j2));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    xbnVar = this;
                case 54:
                    if (xbnVar.t(i6, i4, obj)) {
                        r8nVar.e(i6, o(obj, j2));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    xbnVar = this;
                case 55:
                    if (xbnVar.t(i6, i4, obj)) {
                        r8nVar.b(i6, n(obj, j2));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    xbnVar = this;
                case 56:
                    if (xbnVar.t(i6, i4, obj)) {
                        r8nVar.f(i6, o(obj, j2));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    xbnVar = this;
                case 57:
                    if (xbnVar.t(i6, i4, obj)) {
                        r8nVar.d(i6, n(obj, j2));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    xbnVar = this;
                case 58:
                    if (xbnVar.t(i6, i4, obj)) {
                        r8nVar.g(i6, ((Boolean) qdn.i(obj, j2)).booleanValue());
                    }
                    i4 += 3;
                    i2 = 1048575;
                    xbnVar = this;
                case 59:
                    if (xbnVar.t(i6, i4, obj)) {
                        Object object3 = unsafe.getObject(obj, j2);
                        if (object3 instanceof String) {
                            r8nVar.h(i6, (String) object3);
                        } else {
                            r8nVar.i(i6, (g8n) object3);
                        }
                    }
                    i4 += 3;
                    i2 = 1048575;
                    xbnVar = this;
                case 60:
                    if (xbnVar.t(i6, i4, obj)) {
                        b1lVar.l(i6, unsafe.getObject(obj, j2), xbnVar.B(i4));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    xbnVar = this;
                case 61:
                    if (xbnVar.t(i6, i4, obj)) {
                        r8nVar.i(i6, (g8n) unsafe.getObject(obj, j2));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    xbnVar = this;
                case 62:
                    if (xbnVar.t(i6, i4, obj)) {
                        r8nVar.c(i6, n(obj, j2));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    xbnVar = this;
                case 63:
                    if (xbnVar.t(i6, i4, obj)) {
                        r8nVar.b(i6, n(obj, j2));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    xbnVar = this;
                case 64:
                    if (xbnVar.t(i6, i4, obj)) {
                        r8nVar.d(i6, n(obj, j2));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    xbnVar = this;
                case 65:
                    if (xbnVar.t(i6, i4, obj)) {
                        r8nVar.f(i6, o(obj, j2));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    xbnVar = this;
                case 66:
                    if (xbnVar.t(i6, i4, obj)) {
                        int n2 = n(obj, j2);
                        r8nVar.c(i6, (n2 >> 31) ^ (n2 + n2));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    xbnVar = this;
                case 67:
                    if (xbnVar.t(i6, i4, obj)) {
                        long o = o(obj, j2);
                        r8nVar.e(i6, (o >> 63) ^ (o + o));
                    }
                    i4 += 3;
                    i2 = 1048575;
                    xbnVar = this;
                case 68:
                    if (xbnVar.t(i6, i4, obj)) {
                        Object object4 = unsafe.getObject(obj, j2);
                        r8nVar.a(i6, 3);
                        xbnVar.B(i4).d((k7n) object4, b1lVar);
                        r8nVar.a(i6, 4);
                    }
                    i4 += 3;
                    i2 = 1048575;
                    xbnVar = this;
                default:
                    i4 += 3;
                    i2 = 1048575;
                    xbnVar = this;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:273:0x0580, code lost:
    
        if (r0.q(r1, r2, r3, r4, r5) != false) goto L234;
     */
    /* JADX WARN: Code restructure failed: missing block: B:274:0x0582, code lost:
    
        r9 = defpackage.x5n.x(r13 << 3, 8, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x0592, code lost:
    
        if (r0.q(r1, r2, r3, r4, r5) != false) goto L238;
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x0594, code lost:
    
        r9 = defpackage.x5n.x(r13 << 3, 4, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:304:0x0629, code lost:
    
        if (r0.q(r1, r2, r3, r4, r5) != false) goto L238;
     */
    /* JADX WARN: Code restructure failed: missing block: B:306:0x0631, code lost:
    
        if (r0.q(r1, r2, r3, r4, r5) != false) goto L234;
     */
    /* JADX WARN: Code restructure failed: missing block: B:317:0x067c, code lost:
    
        if (r0.q(r1, r2, r3, r4, r5) != false) goto L238;
     */
    @Override // defpackage.pcn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int e(y9n y9nVar) {
        int i;
        int r;
        int s;
        int r2;
        int b;
        int A;
        int i2;
        int r3;
        int i3;
        int c;
        int r4;
        int size;
        int s2;
        int r5;
        int r6;
        int r7;
        int c2;
        int size2;
        int r8;
        int i4;
        int r9;
        int s3;
        int r10;
        int b2;
        int n2;
        int r11;
        xbn xbnVar = this;
        y9n y9nVar2 = y9nVar;
        Unsafe unsafe = n;
        int i5 = 1048575;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 1048575;
        while (true) {
            int[] iArr = xbnVar.a;
            if (i6 >= iArr.length) {
                int c3 = y9nVar2.zzc.c() + i8;
                if (xbnVar.f) {
                    zcn zcnVar = ((w9n) y9nVar2).zzb.a;
                    if (zcnVar.b > 0) {
                        zcnVar.c(0).a.getClass();
                        pvd.j();
                        return 0;
                    }
                    Iterator it = zcnVar.d().iterator();
                    if (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        if (entry.getKey() != null) {
                            pvd.j();
                            return 0;
                        }
                        entry.getValue();
                        throw null;
                    }
                }
                return c3;
            }
            int j = xbnVar.j(i6);
            int k = k(j);
            int i10 = iArr[i6];
            int i11 = iArr[i6 + 2];
            int i12 = i11 & i5;
            if (k <= 17) {
                if (i12 != i9) {
                    i7 = i12 == i5 ? 0 : unsafe.getInt(y9nVar2, i12);
                    i9 = i12;
                }
                i = 1 << (i11 >>> 20);
            } else {
                i = 0;
            }
            int i13 = j & i5;
            if (k >= k9n.b.a) {
                int i14 = k9n.c.a;
            }
            long j2 = i13;
            switch (k) {
                case 0:
                    if (!xbnVar.q(i6, i9, i7, i, y9nVar2)) {
                        i6 += 3;
                        i5 = 1048575;
                    }
                    i8 = x5n.x(i10 << 3, 8, i8);
                    i6 += 3;
                    i5 = 1048575;
                case 1:
                    break;
                case 2:
                    if (xbnVar.q(i6, i9, i7, i, y9nVar2)) {
                        long j3 = unsafe.getLong(y9nVar2, j2);
                        r = r8n.r(i10 << 3);
                        s = r8n.s(j3);
                        i8 += s + r;
                    }
                    xbnVar = this;
                    i6 += 3;
                    i5 = 1048575;
                case 3:
                    if (xbnVar.q(i6, i9, i7, i, y9nVar2)) {
                        long j4 = unsafe.getLong(y9nVar2, j2);
                        r = r8n.r(i10 << 3);
                        s = r8n.s(j4);
                        i8 += s + r;
                    }
                    xbnVar = this;
                    i6 += 3;
                    i5 = 1048575;
                case 4:
                    if (xbnVar.q(i6, i9, i7, i, y9nVar2)) {
                        long j5 = unsafe.getInt(y9nVar2, j2);
                        r = r8n.r(i10 << 3);
                        s = r8n.s(j5);
                        i8 += s + r;
                    }
                    xbnVar = this;
                    i6 += 3;
                    i5 = 1048575;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    if (xbnVar.q(i6, i9, i7, i, y9nVar2)) {
                        i8 = x5n.x(i10 << 3, 1, i8);
                    }
                    xbnVar = this;
                    y9nVar2 = y9nVar;
                    i6 += 3;
                    i5 = 1048575;
                case 8:
                    if (xbnVar.q(i6, i9, i7, i, y9nVar2)) {
                        int i15 = i10 << 3;
                        Object object = unsafe.getObject(y9nVar2, j2);
                        if (object instanceof g8n) {
                            r2 = r8n.r(i15);
                            b = ((g8n) object).d();
                        } else {
                            r2 = r8n.r(i15);
                            b = vdn.b((String) object);
                        }
                        i8 = x5n.u(b, b, r2, i8);
                    }
                    xbnVar = this;
                    i6 += 3;
                    i5 = 1048575;
                case 9:
                    if (xbnVar.q(i6, i9, i7, i, y9nVar2)) {
                        A = tcn.A(i10, unsafe.getObject(y9nVar2, j2), xbnVar.B(i6));
                        i8 += A;
                        i6 += 3;
                        i5 = 1048575;
                    } else {
                        i6 += 3;
                        i5 = 1048575;
                    }
                case 10:
                    if (xbnVar.q(i6, i9, i7, i, y9nVar2)) {
                        g8n g8nVar = (g8n) unsafe.getObject(y9nVar2, j2);
                        r2 = r8n.r(i10 << 3);
                        b = g8nVar.d();
                        i8 = x5n.u(b, b, r2, i8);
                    }
                    xbnVar = this;
                    i6 += 3;
                    i5 = 1048575;
                case 11:
                    if (xbnVar.q(i6, i9, i7, i, y9nVar2)) {
                        i2 = unsafe.getInt(y9nVar2, j2);
                        r3 = r8n.r(i10 << 3);
                        i8 = x5n.x(i2, r3, i8);
                    }
                    xbnVar = this;
                    i6 += 3;
                    i5 = 1048575;
                case 12:
                    if (xbnVar.q(i6, i9, i7, i, y9nVar2)) {
                        long j6 = unsafe.getInt(y9nVar2, j2);
                        r = r8n.r(i10 << 3);
                        s = r8n.s(j6);
                        i8 += s + r;
                    }
                    xbnVar = this;
                    i6 += 3;
                    i5 = 1048575;
                case 13:
                    break;
                case 14:
                    break;
                case 15:
                    if (xbnVar.q(i6, i9, i7, i, y9nVar2)) {
                        int i16 = unsafe.getInt(y9nVar2, j2);
                        r3 = r8n.r(i10 << 3);
                        i2 = (i16 >> 31) ^ (i16 + i16);
                        i8 = x5n.x(i2, r3, i8);
                    }
                    xbnVar = this;
                    i6 += 3;
                    i5 = 1048575;
                case 16:
                    if (xbnVar.q(i6, i9, i7, i, y9nVar2)) {
                        long j7 = unsafe.getLong(y9nVar2, j2);
                        r = r8n.r(i10 << 3);
                        s = r8n.s((j7 >> 63) ^ (j7 + j7));
                        i8 += s + r;
                    }
                    xbnVar = this;
                    i6 += 3;
                    i5 = 1048575;
                case 17:
                    if (xbnVar.q(i6, i9, i7, i, y9nVar2)) {
                        k7n k7nVar = (k7n) unsafe.getObject(y9nVar2, j2);
                        pcn B = xbnVar.B(i6);
                        idn idnVar = tcn.a;
                        int r12 = r8n.r(i10 << 3);
                        i3 = r12 + r12;
                        c = k7nVar.c(B);
                        A = c + i3;
                        i8 += A;
                        i6 += 3;
                        i5 = 1048575;
                    } else {
                        i6 += 3;
                        i5 = 1048575;
                    }
                case 18:
                    A = tcn.z(i10, (List) unsafe.getObject(y9nVar2, j2));
                    i8 += A;
                    i6 += 3;
                    i5 = 1048575;
                case 19:
                    A = tcn.y(i10, (List) unsafe.getObject(y9nVar2, j2));
                    i8 += A;
                    i6 += 3;
                    i5 = 1048575;
                case 20:
                    List list = (List) unsafe.getObject(y9nVar2, j2);
                    idn idnVar2 = tcn.a;
                    if (list.size() != 0) {
                        r4 = (r8n.r(i10 << 3) * list.size()) + tcn.r(list);
                        i8 += r4;
                        i6 += 3;
                        i5 = 1048575;
                    }
                    r4 = 0;
                    i8 += r4;
                    i6 += 3;
                    i5 = 1048575;
                case 21:
                    List list2 = (List) unsafe.getObject(y9nVar2, j2);
                    idn idnVar3 = tcn.a;
                    size = list2.size();
                    if (size != 0) {
                        s2 = tcn.s(list2);
                        r5 = r8n.r(i10 << 3);
                        r6 = (r5 * size) + s2;
                        i8 += r6;
                        i6 += 3;
                        i5 = 1048575;
                    }
                    r6 = 0;
                    i8 += r6;
                    i6 += 3;
                    i5 = 1048575;
                case 22:
                    List list3 = (List) unsafe.getObject(y9nVar2, j2);
                    idn idnVar4 = tcn.a;
                    size = list3.size();
                    if (size != 0) {
                        s2 = tcn.v(list3);
                        r5 = r8n.r(i10 << 3);
                        r6 = (r5 * size) + s2;
                        i8 += r6;
                        i6 += 3;
                        i5 = 1048575;
                    }
                    r6 = 0;
                    i8 += r6;
                    i6 += 3;
                    i5 = 1048575;
                case 23:
                    A = tcn.z(i10, (List) unsafe.getObject(y9nVar2, j2));
                    i8 += A;
                    i6 += 3;
                    i5 = 1048575;
                case 24:
                    A = tcn.y(i10, (List) unsafe.getObject(y9nVar2, j2));
                    i8 += A;
                    i6 += 3;
                    i5 = 1048575;
                case 25:
                    List list4 = (List) unsafe.getObject(y9nVar2, j2);
                    idn idnVar5 = tcn.a;
                    int size3 = list4.size();
                    if (size3 != 0) {
                        r4 = (r8n.r(i10 << 3) + 1) * size3;
                        i8 += r4;
                        i6 += 3;
                        i5 = 1048575;
                    }
                    r4 = 0;
                    i8 += r4;
                    i6 += 3;
                    i5 = 1048575;
                case 26:
                    List list5 = (List) unsafe.getObject(y9nVar2, j2);
                    idn idnVar6 = tcn.a;
                    int size4 = list5.size();
                    if (size4 != 0) {
                        r6 = r8n.r(i10 << 3) * size4;
                        for (int i17 = 0; i17 < size4; i17++) {
                            Object obj = list5.get(i17);
                            int d = obj instanceof g8n ? ((g8n) obj).d() : vdn.b((String) obj);
                            r6 = x5n.x(d, d, r6);
                        }
                        i8 += r6;
                        i6 += 3;
                        i5 = 1048575;
                    }
                    r6 = 0;
                    i8 += r6;
                    i6 += 3;
                    i5 = 1048575;
                case 27:
                    List list6 = (List) unsafe.getObject(y9nVar2, j2);
                    pcn B2 = xbnVar.B(i6);
                    idn idnVar7 = tcn.a;
                    int size5 = list6.size();
                    if (size5 == 0) {
                        r7 = 0;
                    } else {
                        r7 = r8n.r(i10 << 3) * size5;
                        for (int i18 = 0; i18 < size5; i18++) {
                            Object obj2 = list6.get(i18);
                            if (obj2 instanceof san) {
                                san sanVar = (san) obj2;
                                c2 = sanVar.b != null ? sanVar.b.c.length : sanVar.a != null ? ((y9n) sanVar.a).e() : 0;
                            } else {
                                c2 = ((k7n) obj2).c(B2);
                            }
                            r7 = x5n.x(c2, c2, r7);
                        }
                    }
                    i8 += r7;
                    i6 += 3;
                    i5 = 1048575;
                case 28:
                    List list7 = (List) unsafe.getObject(y9nVar2, j2);
                    idn idnVar8 = tcn.a;
                    int size6 = list7.size();
                    if (size6 != 0) {
                        r6 = r8n.r(i10 << 3) * size6;
                        for (int i19 = 0; i19 < list7.size(); i19++) {
                            int d2 = ((g8n) list7.get(i19)).d();
                            r6 = x5n.x(d2, d2, r6);
                        }
                        i8 += r6;
                        i6 += 3;
                        i5 = 1048575;
                    }
                    r6 = 0;
                    i8 += r6;
                    i6 += 3;
                    i5 = 1048575;
                case 29:
                    List list8 = (List) unsafe.getObject(y9nVar2, j2);
                    idn idnVar9 = tcn.a;
                    size = list8.size();
                    if (size != 0) {
                        s2 = tcn.w(list8);
                        r5 = r8n.r(i10 << 3);
                        r6 = (r5 * size) + s2;
                        i8 += r6;
                        i6 += 3;
                        i5 = 1048575;
                    }
                    r6 = 0;
                    i8 += r6;
                    i6 += 3;
                    i5 = 1048575;
                case 30:
                    List list9 = (List) unsafe.getObject(y9nVar2, j2);
                    idn idnVar10 = tcn.a;
                    size = list9.size();
                    if (size != 0) {
                        s2 = tcn.u(list9);
                        r5 = r8n.r(i10 << 3);
                        r6 = (r5 * size) + s2;
                        i8 += r6;
                        i6 += 3;
                        i5 = 1048575;
                    }
                    r6 = 0;
                    i8 += r6;
                    i6 += 3;
                    i5 = 1048575;
                case 31:
                    A = tcn.y(i10, (List) unsafe.getObject(y9nVar2, j2));
                    i8 += A;
                    i6 += 3;
                    i5 = 1048575;
                case 32:
                    A = tcn.z(i10, (List) unsafe.getObject(y9nVar2, j2));
                    i8 += A;
                    i6 += 3;
                    i5 = 1048575;
                case 33:
                    List list10 = (List) unsafe.getObject(y9nVar2, j2);
                    idn idnVar11 = tcn.a;
                    size = list10.size();
                    if (size != 0) {
                        s2 = tcn.x(list10);
                        r5 = r8n.r(i10 << 3);
                        r6 = (r5 * size) + s2;
                        i8 += r6;
                        i6 += 3;
                        i5 = 1048575;
                    }
                    r6 = 0;
                    i8 += r6;
                    i6 += 3;
                    i5 = 1048575;
                case 34:
                    List list11 = (List) unsafe.getObject(y9nVar2, j2);
                    idn idnVar12 = tcn.a;
                    size = list11.size();
                    if (size != 0) {
                        s2 = tcn.t(list11);
                        r5 = r8n.r(i10 << 3);
                        r6 = (r5 * size) + s2;
                        i8 += r6;
                        i6 += 3;
                        i5 = 1048575;
                    }
                    r6 = 0;
                    i8 += r6;
                    i6 += 3;
                    i5 = 1048575;
                case 35:
                    List list12 = (List) unsafe.getObject(y9nVar2, j2);
                    idn idnVar13 = tcn.a;
                    size2 = list12.size() * 8;
                    if (size2 > 0) {
                        r8 = r8n.r(i10 << 3);
                        i8 = x5n.u(size2, r8, size2, i8);
                        i6 += 3;
                        i5 = 1048575;
                    } else {
                        i6 += 3;
                        i5 = 1048575;
                    }
                case 36:
                    List list13 = (List) unsafe.getObject(y9nVar2, j2);
                    idn idnVar14 = tcn.a;
                    size2 = list13.size() * 4;
                    if (size2 > 0) {
                        r8 = r8n.r(i10 << 3);
                        i8 = x5n.u(size2, r8, size2, i8);
                        i6 += 3;
                        i5 = 1048575;
                    } else {
                        i6 += 3;
                        i5 = 1048575;
                    }
                case 37:
                    size2 = tcn.r((List) unsafe.getObject(y9nVar2, j2));
                    if (size2 > 0) {
                        r8 = r8n.r(i10 << 3);
                        i8 = x5n.u(size2, r8, size2, i8);
                        i6 += 3;
                        i5 = 1048575;
                    } else {
                        i6 += 3;
                        i5 = 1048575;
                    }
                case 38:
                    size2 = tcn.s((List) unsafe.getObject(y9nVar2, j2));
                    if (size2 > 0) {
                        r8 = r8n.r(i10 << 3);
                        i8 = x5n.u(size2, r8, size2, i8);
                        i6 += 3;
                        i5 = 1048575;
                    } else {
                        i6 += 3;
                        i5 = 1048575;
                    }
                case 39:
                    size2 = tcn.v((List) unsafe.getObject(y9nVar2, j2));
                    if (size2 > 0) {
                        r8 = r8n.r(i10 << 3);
                        i8 = x5n.u(size2, r8, size2, i8);
                        i6 += 3;
                        i5 = 1048575;
                    } else {
                        i6 += 3;
                        i5 = 1048575;
                    }
                case 40:
                    List list14 = (List) unsafe.getObject(y9nVar2, j2);
                    idn idnVar15 = tcn.a;
                    size2 = list14.size() * 8;
                    if (size2 > 0) {
                        r8 = r8n.r(i10 << 3);
                        i8 = x5n.u(size2, r8, size2, i8);
                        i6 += 3;
                        i5 = 1048575;
                    } else {
                        i6 += 3;
                        i5 = 1048575;
                    }
                case 41:
                    List list15 = (List) unsafe.getObject(y9nVar2, j2);
                    idn idnVar16 = tcn.a;
                    size2 = list15.size() * 4;
                    if (size2 > 0) {
                        r8 = r8n.r(i10 << 3);
                        i8 = x5n.u(size2, r8, size2, i8);
                        i6 += 3;
                        i5 = 1048575;
                    } else {
                        i6 += 3;
                        i5 = 1048575;
                    }
                case 42:
                    List list16 = (List) unsafe.getObject(y9nVar2, j2);
                    idn idnVar17 = tcn.a;
                    size2 = list16.size();
                    if (size2 > 0) {
                        r8 = r8n.r(i10 << 3);
                        i8 = x5n.u(size2, r8, size2, i8);
                        i6 += 3;
                        i5 = 1048575;
                    } else {
                        i6 += 3;
                        i5 = 1048575;
                    }
                case 43:
                    size2 = tcn.w((List) unsafe.getObject(y9nVar2, j2));
                    if (size2 > 0) {
                        r8 = r8n.r(i10 << 3);
                        i8 = x5n.u(size2, r8, size2, i8);
                        i6 += 3;
                        i5 = 1048575;
                    } else {
                        i6 += 3;
                        i5 = 1048575;
                    }
                case 44:
                    size2 = tcn.u((List) unsafe.getObject(y9nVar2, j2));
                    if (size2 > 0) {
                        r8 = r8n.r(i10 << 3);
                        i8 = x5n.u(size2, r8, size2, i8);
                        i6 += 3;
                        i5 = 1048575;
                    } else {
                        i6 += 3;
                        i5 = 1048575;
                    }
                case 45:
                    List list17 = (List) unsafe.getObject(y9nVar2, j2);
                    idn idnVar18 = tcn.a;
                    size2 = list17.size() * 4;
                    if (size2 > 0) {
                        r8 = r8n.r(i10 << 3);
                        i8 = x5n.u(size2, r8, size2, i8);
                        i6 += 3;
                        i5 = 1048575;
                    } else {
                        i6 += 3;
                        i5 = 1048575;
                    }
                case 46:
                    List list18 = (List) unsafe.getObject(y9nVar2, j2);
                    idn idnVar19 = tcn.a;
                    size2 = list18.size() * 8;
                    if (size2 > 0) {
                        r8 = r8n.r(i10 << 3);
                        i8 = x5n.u(size2, r8, size2, i8);
                        i6 += 3;
                        i5 = 1048575;
                    } else {
                        i6 += 3;
                        i5 = 1048575;
                    }
                case 47:
                    size2 = tcn.x((List) unsafe.getObject(y9nVar2, j2));
                    if (size2 > 0) {
                        r8 = r8n.r(i10 << 3);
                        i8 = x5n.u(size2, r8, size2, i8);
                        i6 += 3;
                        i5 = 1048575;
                    } else {
                        i6 += 3;
                        i5 = 1048575;
                    }
                case 48:
                    size2 = tcn.t((List) unsafe.getObject(y9nVar2, j2));
                    if (size2 > 0) {
                        r8 = r8n.r(i10 << 3);
                        i8 = x5n.u(size2, r8, size2, i8);
                        i6 += 3;
                        i5 = 1048575;
                    } else {
                        i6 += 3;
                        i5 = 1048575;
                    }
                case 49:
                    List list19 = (List) unsafe.getObject(y9nVar2, j2);
                    pcn B3 = xbnVar.B(i6);
                    idn idnVar20 = tcn.a;
                    int size7 = list19.size();
                    if (size7 == 0) {
                        i4 = 0;
                    } else {
                        i4 = 0;
                        for (int i20 = 0; i20 < size7; i20++) {
                            k7n k7nVar2 = (k7n) list19.get(i20);
                            int r13 = r8n.r(i10 << 3);
                            i4 += k7nVar2.c(B3) + r13 + r13;
                        }
                    }
                    i8 += i4;
                    i6 += 3;
                    i5 = 1048575;
                case 50:
                    kbn kbnVar = (kbn) unsafe.getObject(y9nVar2, j2);
                    if (xbnVar.C(i6) != null) {
                        pvd.j();
                        return 0;
                    }
                    if (kbnVar.isEmpty()) {
                        continue;
                    } else {
                        Iterator it2 = kbnVar.entrySet().iterator();
                        if (it2.hasNext()) {
                            Map.Entry entry2 = (Map.Entry) it2.next();
                            entry2.getKey();
                            entry2.getValue();
                            throw null;
                        }
                    }
                    i6 += 3;
                    i5 = 1048575;
                case 51:
                    if (!xbnVar.t(i10, i6, y9nVar2)) {
                        i6 += 3;
                        i5 = 1048575;
                    }
                    i8 = x5n.x(i10 << 3, 8, i8);
                    i6 += 3;
                    i5 = 1048575;
                case 52:
                    if (!xbnVar.t(i10, i6, y9nVar2)) {
                        i6 += 3;
                        i5 = 1048575;
                    }
                    i8 = x5n.x(i10 << 3, 4, i8);
                    i6 += 3;
                    i5 = 1048575;
                case 53:
                    if (xbnVar.t(i10, i6, y9nVar2)) {
                        long o = o(y9nVar2, j2);
                        r9 = r8n.r(i10 << 3);
                        s3 = r8n.s(o);
                        i8 += s3 + r9;
                        i6 += 3;
                        i5 = 1048575;
                    } else {
                        i6 += 3;
                        i5 = 1048575;
                    }
                case 54:
                    if (xbnVar.t(i10, i6, y9nVar2)) {
                        long o2 = o(y9nVar2, j2);
                        r9 = r8n.r(i10 << 3);
                        s3 = r8n.s(o2);
                        i8 += s3 + r9;
                        i6 += 3;
                        i5 = 1048575;
                    } else {
                        i6 += 3;
                        i5 = 1048575;
                    }
                case 55:
                    if (xbnVar.t(i10, i6, y9nVar2)) {
                        long n3 = n(y9nVar2, j2);
                        r9 = r8n.r(i10 << 3);
                        s3 = r8n.s(n3);
                        i8 += s3 + r9;
                        i6 += 3;
                        i5 = 1048575;
                    } else {
                        i6 += 3;
                        i5 = 1048575;
                    }
                case 56:
                    if (!xbnVar.t(i10, i6, y9nVar2)) {
                        i6 += 3;
                        i5 = 1048575;
                    }
                    i8 = x5n.x(i10 << 3, 8, i8);
                    i6 += 3;
                    i5 = 1048575;
                case 57:
                    if (!xbnVar.t(i10, i6, y9nVar2)) {
                        i6 += 3;
                        i5 = 1048575;
                    }
                    i8 = x5n.x(i10 << 3, 4, i8);
                    i6 += 3;
                    i5 = 1048575;
                case 58:
                    if (xbnVar.t(i10, i6, y9nVar2)) {
                        i8 = x5n.x(i10 << 3, 1, i8);
                    }
                    i6 += 3;
                    i5 = 1048575;
                case 59:
                    if (xbnVar.t(i10, i6, y9nVar2)) {
                        int i21 = i10 << 3;
                        Object object2 = unsafe.getObject(y9nVar2, j2);
                        if (object2 instanceof g8n) {
                            r10 = r8n.r(i21);
                            b2 = ((g8n) object2).d();
                        } else {
                            r10 = r8n.r(i21);
                            b2 = vdn.b((String) object2);
                        }
                        i8 = x5n.u(b2, b2, r10, i8);
                        i6 += 3;
                        i5 = 1048575;
                    } else {
                        i6 += 3;
                        i5 = 1048575;
                    }
                case 60:
                    if (xbnVar.t(i10, i6, y9nVar2)) {
                        A = tcn.A(i10, unsafe.getObject(y9nVar2, j2), xbnVar.B(i6));
                        i8 += A;
                        i6 += 3;
                        i5 = 1048575;
                    } else {
                        i6 += 3;
                        i5 = 1048575;
                    }
                case 61:
                    if (xbnVar.t(i10, i6, y9nVar2)) {
                        g8n g8nVar2 = (g8n) unsafe.getObject(y9nVar2, j2);
                        r10 = r8n.r(i10 << 3);
                        b2 = g8nVar2.d();
                        i8 = x5n.u(b2, b2, r10, i8);
                        i6 += 3;
                        i5 = 1048575;
                    } else {
                        i6 += 3;
                        i5 = 1048575;
                    }
                case 62:
                    if (xbnVar.t(i10, i6, y9nVar2)) {
                        n2 = n(y9nVar2, j2);
                        r11 = r8n.r(i10 << 3);
                        i8 = x5n.x(n2, r11, i8);
                        i6 += 3;
                        i5 = 1048575;
                    } else {
                        i6 += 3;
                        i5 = 1048575;
                    }
                case 63:
                    if (xbnVar.t(i10, i6, y9nVar2)) {
                        long n4 = n(y9nVar2, j2);
                        r9 = r8n.r(i10 << 3);
                        s3 = r8n.s(n4);
                        i8 += s3 + r9;
                        i6 += 3;
                        i5 = 1048575;
                    } else {
                        i6 += 3;
                        i5 = 1048575;
                    }
                case 64:
                    if (!xbnVar.t(i10, i6, y9nVar2)) {
                        i6 += 3;
                        i5 = 1048575;
                    }
                    i8 = x5n.x(i10 << 3, 4, i8);
                    i6 += 3;
                    i5 = 1048575;
                case 65:
                    if (!xbnVar.t(i10, i6, y9nVar2)) {
                        i6 += 3;
                        i5 = 1048575;
                    }
                    i8 = x5n.x(i10 << 3, 8, i8);
                    i6 += 3;
                    i5 = 1048575;
                case 66:
                    if (xbnVar.t(i10, i6, y9nVar2)) {
                        int n5 = n(y9nVar2, j2);
                        r11 = r8n.r(i10 << 3);
                        n2 = (n5 >> 31) ^ (n5 + n5);
                        i8 = x5n.x(n2, r11, i8);
                        i6 += 3;
                        i5 = 1048575;
                    } else {
                        i6 += 3;
                        i5 = 1048575;
                    }
                case 67:
                    if (xbnVar.t(i10, i6, y9nVar2)) {
                        long o3 = o(y9nVar2, j2);
                        r9 = r8n.r(i10 << 3);
                        s3 = r8n.s((o3 >> 63) ^ (o3 + o3));
                        i8 += s3 + r9;
                        i6 += 3;
                        i5 = 1048575;
                    } else {
                        i6 += 3;
                        i5 = 1048575;
                    }
                case 68:
                    if (xbnVar.t(i10, i6, y9nVar2)) {
                        k7n k7nVar3 = (k7n) unsafe.getObject(y9nVar2, j2);
                        pcn B4 = xbnVar.B(i6);
                        idn idnVar21 = tcn.a;
                        int r14 = r8n.r(i10 << 3);
                        i3 = r14 + r14;
                        c = k7nVar3.c(B4);
                        A = c + i3;
                        i8 += A;
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

    @Override // defpackage.pcn
    public final void f(Object obj, byte[] bArr, int i, int i2, p7n p7nVar) {
        x(obj, bArr, i, i2, 0, p7nVar);
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
    @Override // defpackage.pcn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int g(y9n y9nVar) {
        int i;
        long doubleToLongBits;
        int i2;
        int floatToIntBits;
        int i3;
        int i4;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            int[] iArr = this.a;
            if (i5 >= iArr.length) {
                int hashCode = y9nVar.zzc.hashCode() + (i6 * 53);
                if (!this.f) {
                    return hashCode;
                }
                return ((w9n) y9nVar).zzb.a.hashCode() + (hashCode * 53);
            }
            int j = j(i5);
            int i7 = 1048575 & j;
            int k = k(j);
            int i8 = iArr[i5];
            long j2 = i7;
            int i9 = 1237;
            int i10 = 37;
            switch (k) {
                case 0:
                    i = i6 * 53;
                    doubleToLongBits = Double.doubleToLongBits(qdn.c.C(y9nVar, j2));
                    Charset charset = jan.a;
                    i6 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 1:
                    i2 = i6 * 53;
                    floatToIntBits = Float.floatToIntBits(qdn.c.v(y9nVar, j2));
                    i6 = floatToIntBits + i2;
                    break;
                case 2:
                    i = i6 * 53;
                    doubleToLongBits = qdn.g(y9nVar, j2);
                    Charset charset2 = jan.a;
                    i6 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 3:
                    i = i6 * 53;
                    doubleToLongBits = qdn.g(y9nVar, j2);
                    Charset charset3 = jan.a;
                    i6 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 4:
                    i2 = i6 * 53;
                    floatToIntBits = qdn.e(y9nVar, j2);
                    i6 = floatToIntBits + i2;
                    break;
                case 5:
                    i = i6 * 53;
                    doubleToLongBits = qdn.g(y9nVar, j2);
                    Charset charset4 = jan.a;
                    i6 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 6:
                    i2 = i6 * 53;
                    floatToIntBits = qdn.e(y9nVar, j2);
                    i6 = floatToIntBits + i2;
                    break;
                case 7:
                    i3 = i6 * 53;
                    boolean s = qdn.c.s(y9nVar, j2);
                    Charset charset5 = jan.a;
                    break;
                case 8:
                    i2 = i6 * 53;
                    floatToIntBits = ((String) qdn.i(y9nVar, j2)).hashCode();
                    i6 = floatToIntBits + i2;
                    break;
                case 9:
                    i4 = i6 * 53;
                    Object i11 = qdn.i(y9nVar, j2);
                    if (i11 != null) {
                        i10 = i11.hashCode();
                    }
                    i6 = i4 + i10;
                    break;
                case 10:
                    i2 = i6 * 53;
                    floatToIntBits = qdn.i(y9nVar, j2).hashCode();
                    i6 = floatToIntBits + i2;
                    break;
                case 11:
                    i2 = i6 * 53;
                    floatToIntBits = qdn.e(y9nVar, j2);
                    i6 = floatToIntBits + i2;
                    break;
                case 12:
                    i2 = i6 * 53;
                    floatToIntBits = qdn.e(y9nVar, j2);
                    i6 = floatToIntBits + i2;
                    break;
                case 13:
                    i2 = i6 * 53;
                    floatToIntBits = qdn.e(y9nVar, j2);
                    i6 = floatToIntBits + i2;
                    break;
                case 14:
                    i = i6 * 53;
                    doubleToLongBits = qdn.g(y9nVar, j2);
                    Charset charset6 = jan.a;
                    i6 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 15:
                    i2 = i6 * 53;
                    floatToIntBits = qdn.e(y9nVar, j2);
                    i6 = floatToIntBits + i2;
                    break;
                case 16:
                    i = i6 * 53;
                    doubleToLongBits = qdn.g(y9nVar, j2);
                    Charset charset7 = jan.a;
                    i6 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 17:
                    i4 = i6 * 53;
                    Object i12 = qdn.i(y9nVar, j2);
                    if (i12 != null) {
                        i10 = i12.hashCode();
                    }
                    i6 = i4 + i10;
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
                    i2 = i6 * 53;
                    floatToIntBits = qdn.i(y9nVar, j2).hashCode();
                    i6 = floatToIntBits + i2;
                    break;
                case 50:
                    i2 = i6 * 53;
                    floatToIntBits = qdn.i(y9nVar, j2).hashCode();
                    i6 = floatToIntBits + i2;
                    break;
                case 51:
                    if (!t(i8, i5, y9nVar)) {
                        break;
                    } else {
                        i = i6 * 53;
                        doubleToLongBits = Double.doubleToLongBits(((Double) qdn.i(y9nVar, j2)).doubleValue());
                        Charset charset8 = jan.a;
                        i6 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case 52:
                    if (!t(i8, i5, y9nVar)) {
                        break;
                    } else {
                        i2 = i6 * 53;
                        floatToIntBits = Float.floatToIntBits(((Float) qdn.i(y9nVar, j2)).floatValue());
                        i6 = floatToIntBits + i2;
                        break;
                    }
                case 53:
                    if (!t(i8, i5, y9nVar)) {
                        break;
                    } else {
                        i = i6 * 53;
                        doubleToLongBits = o(y9nVar, j2);
                        Charset charset9 = jan.a;
                        i6 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case 54:
                    if (!t(i8, i5, y9nVar)) {
                        break;
                    } else {
                        i = i6 * 53;
                        doubleToLongBits = o(y9nVar, j2);
                        Charset charset10 = jan.a;
                        i6 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case 55:
                    if (!t(i8, i5, y9nVar)) {
                        break;
                    } else {
                        i2 = i6 * 53;
                        floatToIntBits = n(y9nVar, j2);
                        i6 = floatToIntBits + i2;
                        break;
                    }
                case 56:
                    if (!t(i8, i5, y9nVar)) {
                        break;
                    } else {
                        i = i6 * 53;
                        doubleToLongBits = o(y9nVar, j2);
                        Charset charset11 = jan.a;
                        i6 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case 57:
                    if (!t(i8, i5, y9nVar)) {
                        break;
                    } else {
                        i2 = i6 * 53;
                        floatToIntBits = n(y9nVar, j2);
                        i6 = floatToIntBits + i2;
                        break;
                    }
                case 58:
                    if (!t(i8, i5, y9nVar)) {
                        break;
                    } else {
                        i3 = i6 * 53;
                        boolean booleanValue = ((Boolean) qdn.i(y9nVar, j2)).booleanValue();
                        Charset charset12 = jan.a;
                        break;
                    }
                case 59:
                    if (!t(i8, i5, y9nVar)) {
                        break;
                    } else {
                        i2 = i6 * 53;
                        floatToIntBits = ((String) qdn.i(y9nVar, j2)).hashCode();
                        i6 = floatToIntBits + i2;
                        break;
                    }
                case 60:
                    if (!t(i8, i5, y9nVar)) {
                        break;
                    } else {
                        i2 = i6 * 53;
                        floatToIntBits = qdn.i(y9nVar, j2).hashCode();
                        i6 = floatToIntBits + i2;
                        break;
                    }
                case 61:
                    if (!t(i8, i5, y9nVar)) {
                        break;
                    } else {
                        i2 = i6 * 53;
                        floatToIntBits = qdn.i(y9nVar, j2).hashCode();
                        i6 = floatToIntBits + i2;
                        break;
                    }
                case 62:
                    if (!t(i8, i5, y9nVar)) {
                        break;
                    } else {
                        i2 = i6 * 53;
                        floatToIntBits = n(y9nVar, j2);
                        i6 = floatToIntBits + i2;
                        break;
                    }
                case 63:
                    if (!t(i8, i5, y9nVar)) {
                        break;
                    } else {
                        i2 = i6 * 53;
                        floatToIntBits = n(y9nVar, j2);
                        i6 = floatToIntBits + i2;
                        break;
                    }
                case 64:
                    if (!t(i8, i5, y9nVar)) {
                        break;
                    } else {
                        i2 = i6 * 53;
                        floatToIntBits = n(y9nVar, j2);
                        i6 = floatToIntBits + i2;
                        break;
                    }
                case 65:
                    if (!t(i8, i5, y9nVar)) {
                        break;
                    } else {
                        i = i6 * 53;
                        doubleToLongBits = o(y9nVar, j2);
                        Charset charset13 = jan.a;
                        i6 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case 66:
                    if (!t(i8, i5, y9nVar)) {
                        break;
                    } else {
                        i2 = i6 * 53;
                        floatToIntBits = n(y9nVar, j2);
                        i6 = floatToIntBits + i2;
                        break;
                    }
                case 67:
                    if (!t(i8, i5, y9nVar)) {
                        break;
                    } else {
                        i = i6 * 53;
                        doubleToLongBits = o(y9nVar, j2);
                        Charset charset14 = jan.a;
                        i6 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case 68:
                    if (!t(i8, i5, y9nVar)) {
                        break;
                    } else {
                        i2 = i6 * 53;
                        floatToIntBits = qdn.i(y9nVar, j2).hashCode();
                        i6 = floatToIntBits + i2;
                        break;
                    }
            }
            i5 += 3;
        }
    }

    @Override // defpackage.pcn
    public final boolean h(y9n y9nVar, y9n y9nVar2) {
        boolean a;
        int i = 0;
        while (true) {
            int[] iArr = this.a;
            if (i < iArr.length) {
                int j = j(i);
                long j2 = j & 1048575;
                switch (k(j)) {
                    case 0:
                        if (!p(y9nVar, y9nVar2, i)) {
                            break;
                        } else {
                            sck sckVar = qdn.c;
                            if (Double.doubleToLongBits(sckVar.C(y9nVar, j2)) != Double.doubleToLongBits(sckVar.C(y9nVar2, j2))) {
                                break;
                            } else {
                                continue;
                                i += 3;
                            }
                        }
                    case 1:
                        if (!p(y9nVar, y9nVar2, i)) {
                            break;
                        } else {
                            sck sckVar2 = qdn.c;
                            if (Float.floatToIntBits(sckVar2.v(y9nVar, j2)) != Float.floatToIntBits(sckVar2.v(y9nVar2, j2))) {
                                break;
                            } else {
                                continue;
                                i += 3;
                            }
                        }
                    case 2:
                        if (p(y9nVar, y9nVar2, i) && qdn.g(y9nVar, j2) == qdn.g(y9nVar2, j2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 3:
                        if (p(y9nVar, y9nVar2, i) && qdn.g(y9nVar, j2) == qdn.g(y9nVar2, j2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 4:
                        if (p(y9nVar, y9nVar2, i) && qdn.e(y9nVar, j2) == qdn.e(y9nVar2, j2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 5:
                        if (p(y9nVar, y9nVar2, i) && qdn.g(y9nVar, j2) == qdn.g(y9nVar2, j2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 6:
                        if (p(y9nVar, y9nVar2, i) && qdn.e(y9nVar, j2) == qdn.e(y9nVar2, j2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 7:
                        if (!p(y9nVar, y9nVar2, i)) {
                            break;
                        } else {
                            sck sckVar3 = qdn.c;
                            if (sckVar3.s(y9nVar, j2) != sckVar3.s(y9nVar2, j2)) {
                                break;
                            } else {
                                continue;
                                i += 3;
                            }
                        }
                    case 8:
                        if (p(y9nVar, y9nVar2, i) && tcn.a(qdn.i(y9nVar, j2), qdn.i(y9nVar2, j2))) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 9:
                        if (p(y9nVar, y9nVar2, i) && tcn.a(qdn.i(y9nVar, j2), qdn.i(y9nVar2, j2))) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 10:
                        if (p(y9nVar, y9nVar2, i) && tcn.a(qdn.i(y9nVar, j2), qdn.i(y9nVar2, j2))) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 11:
                        if (p(y9nVar, y9nVar2, i) && qdn.e(y9nVar, j2) == qdn.e(y9nVar2, j2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 12:
                        if (p(y9nVar, y9nVar2, i) && qdn.e(y9nVar, j2) == qdn.e(y9nVar2, j2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 13:
                        if (p(y9nVar, y9nVar2, i) && qdn.e(y9nVar, j2) == qdn.e(y9nVar2, j2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 14:
                        if (p(y9nVar, y9nVar2, i) && qdn.g(y9nVar, j2) == qdn.g(y9nVar2, j2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 15:
                        if (p(y9nVar, y9nVar2, i) && qdn.e(y9nVar, j2) == qdn.e(y9nVar2, j2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 16:
                        if (p(y9nVar, y9nVar2, i) && qdn.g(y9nVar, j2) == qdn.g(y9nVar2, j2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 17:
                        if (p(y9nVar, y9nVar2, i) && tcn.a(qdn.i(y9nVar, j2), qdn.i(y9nVar2, j2))) {
                            continue;
                            i += 3;
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
                        a = tcn.a(qdn.i(y9nVar, j2), qdn.i(y9nVar2, j2));
                        break;
                    case 50:
                        a = tcn.a(qdn.i(y9nVar, j2), qdn.i(y9nVar2, j2));
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
                        if (qdn.e(y9nVar, j3) == qdn.e(y9nVar2, j3) && tcn.a(qdn.i(y9nVar, j2), qdn.i(y9nVar2, j2))) {
                            continue;
                            i += 3;
                        }
                        break;
                    default:
                        i += 3;
                }
                if (a) {
                    i += 3;
                }
            } else if (y9nVar.zzc.equals(y9nVar2.zzc)) {
                if (this.f) {
                    return ((w9n) y9nVar).zzb.equals(((w9n) y9nVar2).zzb);
                }
                return true;
            }
        }
        return false;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    @Override // defpackage.pcn
    public final void i(java.lang.Object r22, defpackage.zz0 r23, defpackage.z8n r24) {
        /*
            Method dump skipped, instructions count: 1992
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xbn.i(java.lang.Object, zz0, z8n):void");
    }

    public final int j(int i) {
        return this.a[i + 1];
    }

    public final boolean p(y9n y9nVar, y9n y9nVar2, int i) {
        return r(i, y9nVar) == r(i, y9nVar2);
    }

    public final boolean q(int i, int i2, int i3, int i4, Object obj) {
        return i2 == 1048575 ? r(i, obj) : (i3 & i4) != 0;
    }

    public final boolean r(int i, Object obj) {
        int i2 = this.a[i + 2];
        long j = i2 & 1048575;
        if (j != 1048575) {
            return ((1 << (i2 >>> 20)) & qdn.e(obj, j)) != 0;
        }
        int j2 = j(i);
        long j3 = j2 & 1048575;
        switch (k(j2)) {
            case 0:
                if (Double.doubleToRawLongBits(qdn.c.C(obj, j3)) != 0) {
                }
                break;
            case 1:
                if (Float.floatToRawIntBits(qdn.c.v(obj, j3)) != 0) {
                }
                break;
            case 2:
                if (qdn.g(obj, j3) != 0) {
                }
                break;
            case 3:
                if (qdn.g(obj, j3) != 0) {
                }
                break;
            case 4:
                if (qdn.e(obj, j3) != 0) {
                }
                break;
            case 5:
                if (qdn.g(obj, j3) != 0) {
                }
                break;
            case 6:
                if (qdn.e(obj, j3) != 0) {
                }
                break;
            case 7:
                break;
            case 8:
                Object i3 = qdn.i(obj, j3);
                if (!(i3 instanceof String)) {
                    if (!(i3 instanceof g8n)) {
                        ilg.c();
                        break;
                    } else if (!g8n.b.equals(i3)) {
                    }
                } else if (!((String) i3).isEmpty()) {
                }
                break;
            case 9:
                if (qdn.i(obj, j3) != null) {
                }
                break;
            case 10:
                if (!g8n.b.equals(qdn.i(obj, j3))) {
                }
                break;
            case 11:
                if (qdn.e(obj, j3) != 0) {
                }
                break;
            case 12:
                if (qdn.e(obj, j3) != 0) {
                }
                break;
            case 13:
                if (qdn.e(obj, j3) != 0) {
                }
                break;
            case 14:
                if (qdn.g(obj, j3) != 0) {
                }
                break;
            case 15:
                if (qdn.e(obj, j3) != 0) {
                }
                break;
            case 16:
                if (qdn.g(obj, j3) != 0) {
                }
                break;
            case 17:
                if (qdn.i(obj, j3) != null) {
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
        qdn.f((1 << (i2 >>> 20)) | qdn.e(obj, j), j, obj);
    }

    public final boolean t(int i, int i2, Object obj) {
        return qdn.e(obj, (long) (this.a[i2 + 2] & 1048575)) == i;
    }

    public final void u(int i, int i2, Object obj) {
        qdn.f(i, this.a[i2 + 2] & 1048575, obj);
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

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0e56, code lost:
    
        r1 = r30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0ec1, code lost:
    
        if (r9 == 1048575) goto L564;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0ec3, code lost:
    
        r15.putInt(r14, r9, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0ec7, code lost:
    
        r1 = r34.i;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0ecb, code lost:
    
        if (r1 >= r34.j) goto L682;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0ecd, code lost:
    
        I(r34.h[r1], r14, null);
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0eda, code lost:
    
        if (r10 != 0) goto L574;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0edc, code lost:
    
        if (r4 != r5) goto L572;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0edf, code lost:
    
        defpackage.hbo.m("Failed to parse the message.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0ee4, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0eeb, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0ee7, code lost:
    
        if (r4 > r5) goto L578;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0ee9, code lost:
    
        if (r13 != r10) goto L578;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0eec, code lost:
    
        defpackage.hbo.m("Failed to parse the message.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0eef, code lost:
    
        return 0;
     */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0bc2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0bd5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0e34 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0e48 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int x(Object obj, byte[] bArr, int i, int i2, int i3, p7n p7nVar) {
        int i4;
        Object obj2;
        int i5;
        Unsafe unsafe;
        int i6;
        int v;
        int i7;
        int i8;
        int i9;
        int i10;
        byte[] bArr2;
        p7n p7nVar2;
        int i11;
        int c0;
        int i12;
        int i13;
        int i14;
        byte[] bArr3;
        Unsafe unsafe2;
        Object obj3;
        int i15;
        int i16;
        int i17;
        Unsafe unsafe3;
        Object obj4;
        byte[] bArr4;
        int i18;
        int P;
        int i19;
        Unsafe unsafe4;
        p7n p7nVar3;
        byte[] bArr5;
        int i20;
        int i21;
        byte[] bArr6;
        Unsafe unsafe5;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        byte[] bArr7;
        int i28;
        int i29;
        int a0;
        int i30;
        int i31;
        int i32;
        String str;
        int i33;
        byte[] bArr8;
        int i34;
        int i35;
        int i36;
        ian ianVar;
        int Z;
        int i37;
        byte[] bArr9;
        p7n p7nVar4;
        int i38;
        int i39;
        int i40;
        int i41;
        int i42;
        int T;
        byte[] bArr10;
        int i43;
        p7n p7nVar5;
        Object obj5 = obj;
        byte[] bArr11 = bArr;
        int i44 = i2;
        p7n p7nVar6 = p7nVar;
        int i45 = this.d;
        m(obj5);
        Unsafe unsafe6 = n;
        int i46 = i;
        int i47 = -1;
        int i48 = 0;
        int i49 = 1048575;
        int i50 = 0;
        int i51 = 0;
        while (true) {
            if (i46 < i44) {
                int i52 = i46 + 1;
                int i53 = bArr11[i46];
                if (i53 < 0) {
                    i52 = u0a.R(i53, bArr11, i52, p7nVar6);
                    i53 = p7nVar6.a;
                }
                int i54 = i52;
                int i55 = i53;
                int i56 = i55 >>> 3;
                int i57 = this.c;
                if (i56 > i47) {
                    v = (i56 < i57 || i56 > i45) ? -1 : v(i56, i48 / 3);
                } else {
                    v = (i56 < i57 || i56 > i45) ? -1 : v(i56, 0);
                }
                if (v == -1) {
                    i4 = i3;
                    i7 = i54;
                    i8 = i49;
                    i9 = i45;
                    i10 = i56;
                    i6 = i55;
                    i5 = i50;
                    i48 = 0;
                    bArr2 = bArr;
                    unsafe = unsafe6;
                    obj2 = obj5;
                    p7nVar2 = p7nVar6;
                } else {
                    int i58 = i55 & 7;
                    int[] iArr = this.a;
                    int i59 = iArr[v + 1];
                    int k = k(i59);
                    long j = i59 & 1048575;
                    String str2 = "";
                    if (k <= 17) {
                        int i60 = iArr[v + 2];
                        int i61 = 1 << (i60 >>> 20);
                        int i62 = i60 & 1048575;
                        if (i62 != i49) {
                            int i63 = 1048575;
                            i12 = i58;
                            if (i49 != 1048575) {
                                unsafe6.putInt(obj5, i49, i50);
                                i63 = 1048575;
                            }
                            i13 = i62 == i63 ? 0 : unsafe6.getInt(obj5, i62);
                            i14 = i62;
                        } else {
                            i12 = i58;
                            i13 = i50;
                            i14 = i49;
                        }
                        switch (k) {
                            case 0:
                                bArr3 = bArr;
                                unsafe2 = unsafe6;
                                i15 = i13;
                                i16 = i54;
                                i9 = i45;
                                if (i12 != 1) {
                                    obj3 = obj5;
                                    i5 = i15;
                                    p7nVar2 = p7nVar;
                                    i7 = i16;
                                    bArr2 = bArr3;
                                    i48 = v;
                                    i10 = i56;
                                    i6 = i55;
                                    i8 = i14;
                                    obj2 = obj3;
                                    unsafe = unsafe2;
                                    i4 = i3;
                                    break;
                                } else {
                                    qdn.c.G(obj5, j, Double.longBitsToDouble(u0a.V(i16, bArr3)));
                                    i44 = i2;
                                    p7nVar6 = p7nVar;
                                    bArr11 = bArr3;
                                    i46 = i16 + 8;
                                    unsafe6 = unsafe2;
                                    i48 = v;
                                    i47 = i56;
                                    i51 = i55;
                                    i49 = i14;
                                    i50 = i15 | i61;
                                    i45 = i9;
                                }
                            case 1:
                                bArr3 = bArr;
                                unsafe2 = unsafe6;
                                i15 = i13;
                                i16 = i54;
                                i9 = i45;
                                if (i12 != 5) {
                                    obj3 = obj5;
                                    i5 = i15;
                                    p7nVar2 = p7nVar;
                                    i7 = i16;
                                    bArr2 = bArr3;
                                    i48 = v;
                                    i10 = i56;
                                    i6 = i55;
                                    i8 = i14;
                                    obj2 = obj3;
                                    unsafe = unsafe2;
                                    i4 = i3;
                                    break;
                                } else {
                                    i17 = i15 | i61;
                                    qdn.c.B(obj5, j, Float.intBitsToFloat(u0a.U(i16, bArr3)));
                                    i44 = i2;
                                    p7nVar6 = p7nVar;
                                    i46 = i16 + 4;
                                    unsafe6 = unsafe2;
                                    i47 = i56;
                                    i51 = i55;
                                    i49 = i14;
                                    i45 = i9;
                                    i50 = i17;
                                    bArr11 = bArr3;
                                    i48 = v;
                                }
                            case 2:
                            case 3:
                                i9 = i45;
                                bArr3 = bArr;
                                i15 = i13;
                                i16 = i54;
                                if (i12 != 0) {
                                    unsafe2 = unsafe6;
                                    obj3 = obj5;
                                    i5 = i15;
                                    p7nVar2 = p7nVar;
                                    i7 = i16;
                                    bArr2 = bArr3;
                                    i48 = v;
                                    i10 = i56;
                                    i6 = i55;
                                    i8 = i14;
                                    obj2 = obj3;
                                    unsafe = unsafe2;
                                    i4 = i3;
                                    break;
                                } else {
                                    int T2 = u0a.T(bArr3, i16, p7nVar);
                                    unsafe6.putLong(obj5, j, p7nVar.b);
                                    int i64 = i14;
                                    i50 = i15 | i61;
                                    i49 = i64;
                                    i44 = i2;
                                    p7nVar6 = p7nVar;
                                    bArr11 = bArr3;
                                    i48 = v;
                                    i47 = i56;
                                    i46 = T2;
                                    i45 = i9;
                                    i51 = i55;
                                }
                            case 4:
                            case 11:
                                i9 = i45;
                                bArr3 = bArr;
                                i15 = i13;
                                i16 = i54;
                                if (i12 != 0) {
                                    unsafe2 = unsafe6;
                                    obj3 = obj5;
                                    i5 = i15;
                                    p7nVar2 = p7nVar;
                                    i7 = i16;
                                    bArr2 = bArr3;
                                    i48 = v;
                                    i10 = i56;
                                    i6 = i55;
                                    i8 = i14;
                                    obj2 = obj3;
                                    unsafe = unsafe2;
                                    i4 = i3;
                                    break;
                                } else {
                                    i17 = i15 | i61;
                                    i46 = u0a.P(bArr3, i16, p7nVar);
                                    unsafe6.putInt(obj5, j, p7nVar.a);
                                    i44 = i2;
                                    p7nVar6 = p7nVar;
                                    i47 = i56;
                                    i51 = i55;
                                    i49 = i14;
                                    i45 = i9;
                                    i50 = i17;
                                    bArr11 = bArr3;
                                    i48 = v;
                                }
                            case 5:
                            case 14:
                                i9 = i45;
                                unsafe3 = unsafe6;
                                Object obj6 = obj5;
                                i15 = i13;
                                i16 = i54;
                                if (i12 != 1) {
                                    bArr3 = bArr;
                                    obj3 = obj6;
                                    unsafe2 = unsafe3;
                                    i5 = i15;
                                    p7nVar2 = p7nVar;
                                    i7 = i16;
                                    bArr2 = bArr3;
                                    i48 = v;
                                    i10 = i56;
                                    i6 = i55;
                                    i8 = i14;
                                    obj2 = obj3;
                                    unsafe = unsafe2;
                                    i4 = i3;
                                    break;
                                } else {
                                    unsafe6 = unsafe3;
                                    obj5 = obj6;
                                    unsafe6.putLong(obj5, j, u0a.V(i16, bArr));
                                    i44 = i2;
                                    p7nVar6 = p7nVar;
                                    bArr11 = bArr;
                                    i46 = i16 + 8;
                                    i48 = v;
                                    i47 = i56;
                                    i49 = i14;
                                    i50 = i15 | i61;
                                    i45 = i9;
                                    i51 = i55;
                                }
                            case 6:
                            case 13:
                                i9 = i45;
                                unsafe3 = unsafe6;
                                obj4 = obj5;
                                i15 = i13;
                                i16 = i54;
                                bArr4 = bArr;
                                if (i12 != 5) {
                                    Object obj7 = obj4;
                                    bArr3 = bArr4;
                                    obj3 = obj7;
                                    unsafe2 = unsafe3;
                                    i5 = i15;
                                    p7nVar2 = p7nVar;
                                    i7 = i16;
                                    bArr2 = bArr3;
                                    i48 = v;
                                    i10 = i56;
                                    i6 = i55;
                                    i8 = i14;
                                    obj2 = obj3;
                                    unsafe = unsafe2;
                                    i4 = i3;
                                    break;
                                } else {
                                    i18 = i15 | i61;
                                    unsafe3.putInt(obj4, j, u0a.U(i16, bArr4));
                                    p7nVar6 = p7nVar;
                                    i46 = i16 + 4;
                                    obj5 = obj4;
                                    i48 = v;
                                    i47 = i56;
                                    i51 = i55;
                                    i45 = i9;
                                    bArr11 = bArr4;
                                    unsafe6 = unsafe3;
                                    i49 = i14;
                                    i50 = i18;
                                    i44 = i2;
                                }
                            case 7:
                                i9 = i45;
                                unsafe3 = unsafe6;
                                obj4 = obj5;
                                i15 = i13;
                                i16 = i54;
                                bArr4 = bArr;
                                if (i12 != 0) {
                                    Object obj72 = obj4;
                                    bArr3 = bArr4;
                                    obj3 = obj72;
                                    unsafe2 = unsafe3;
                                    i5 = i15;
                                    p7nVar2 = p7nVar;
                                    i7 = i16;
                                    bArr2 = bArr3;
                                    i48 = v;
                                    i10 = i56;
                                    i6 = i55;
                                    i8 = i14;
                                    obj2 = obj3;
                                    unsafe = unsafe2;
                                    i4 = i3;
                                    break;
                                } else {
                                    int i65 = i15 | i61;
                                    i46 = u0a.T(bArr4, i16, p7nVar);
                                    qdn.c.u(obj4, j, p7nVar.b != 0);
                                    bArr11 = bArr4;
                                    unsafe6 = unsafe3;
                                    i49 = i14;
                                    i50 = i65;
                                    i44 = i2;
                                    p7nVar6 = p7nVar;
                                    obj5 = obj4;
                                    i48 = v;
                                    i47 = i56;
                                    i51 = i55;
                                    i45 = i9;
                                }
                            case 8:
                                i9 = i45;
                                unsafe3 = unsafe6;
                                obj4 = obj5;
                                i15 = i13;
                                i16 = i54;
                                bArr4 = bArr;
                                if (i12 != 2) {
                                    Object obj722 = obj4;
                                    bArr3 = bArr4;
                                    obj3 = obj722;
                                    unsafe2 = unsafe3;
                                    i5 = i15;
                                    p7nVar2 = p7nVar;
                                    i7 = i16;
                                    bArr2 = bArr3;
                                    i48 = v;
                                    i10 = i56;
                                    i6 = i55;
                                    i8 = i14;
                                    obj2 = obj3;
                                    unsafe = unsafe2;
                                    i4 = i3;
                                    break;
                                } else if ((i59 & 536870912) != 0) {
                                    P = u0a.P(bArr4, i16, p7nVar);
                                    i19 = p7nVar.a;
                                    if (i19 < 0) {
                                        hbo.m("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                        return 0;
                                    }
                                    i18 = i15 | i61;
                                    if (i19 == 0) {
                                        p7nVar.c = "";
                                        i46 = P;
                                        unsafe3.putObject(obj4, j, str2);
                                        bArr11 = bArr4;
                                        p7nVar6 = p7nVar;
                                        obj5 = obj4;
                                        unsafe6 = unsafe3;
                                        i48 = v;
                                        i47 = i56;
                                        i51 = i55;
                                        i49 = i14;
                                        i45 = i9;
                                        i50 = i18;
                                        i44 = i2;
                                    } else {
                                        str2 = vdn.d(P, i19, bArr4);
                                        p7nVar.c = str2;
                                        P += i19;
                                        i46 = P;
                                        unsafe3.putObject(obj4, j, str2);
                                        bArr11 = bArr4;
                                        p7nVar6 = p7nVar;
                                        obj5 = obj4;
                                        unsafe6 = unsafe3;
                                        i48 = v;
                                        i47 = i56;
                                        i51 = i55;
                                        i49 = i14;
                                        i45 = i9;
                                        i50 = i18;
                                        i44 = i2;
                                    }
                                } else {
                                    P = u0a.P(bArr4, i16, p7nVar);
                                    i19 = p7nVar.a;
                                    if (i19 < 0) {
                                        hbo.m("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                        return 0;
                                    }
                                    i18 = i15 | i61;
                                    if (i19 == 0) {
                                        p7nVar.c = "";
                                        i46 = P;
                                        unsafe3.putObject(obj4, j, str2);
                                        bArr11 = bArr4;
                                        p7nVar6 = p7nVar;
                                        obj5 = obj4;
                                        unsafe6 = unsafe3;
                                        i48 = v;
                                        i47 = i56;
                                        i51 = i55;
                                        i49 = i14;
                                        i45 = i9;
                                        i50 = i18;
                                        i44 = i2;
                                    } else {
                                        str2 = new String(bArr4, P, i19, jan.a);
                                        p7nVar.c = str2;
                                        P += i19;
                                        i46 = P;
                                        unsafe3.putObject(obj4, j, str2);
                                        bArr11 = bArr4;
                                        p7nVar6 = p7nVar;
                                        obj5 = obj4;
                                        unsafe6 = unsafe3;
                                        i48 = v;
                                        i47 = i56;
                                        i51 = i55;
                                        i49 = i14;
                                        i45 = i9;
                                        i50 = i18;
                                        i44 = i2;
                                    }
                                }
                            case 9:
                                Object obj8 = obj5;
                                Unsafe unsafe7 = unsafe6;
                                i9 = i45;
                                i16 = i54;
                                if (i12 != 2) {
                                    unsafe3 = unsafe7;
                                    bArr3 = bArr;
                                    obj3 = obj8;
                                    i15 = i13;
                                    unsafe2 = unsafe3;
                                    i5 = i15;
                                    p7nVar2 = p7nVar;
                                    i7 = i16;
                                    bArr2 = bArr3;
                                    i48 = v;
                                    i10 = i56;
                                    i6 = i55;
                                    i8 = i14;
                                    obj2 = obj3;
                                    unsafe = unsafe2;
                                    i4 = i3;
                                    break;
                                } else {
                                    i13 |= i61;
                                    Object E = E(v, obj8);
                                    p7nVar6 = p7nVar;
                                    i44 = i2;
                                    i46 = u0a.X(E, B(v), bArr, i16, i44, p7nVar6);
                                    F(v, obj8, E);
                                    bArr11 = bArr;
                                    obj5 = obj8;
                                    unsafe6 = unsafe7;
                                    i48 = v;
                                    i51 = i55;
                                    i49 = i14;
                                    i45 = i9;
                                    i50 = i13;
                                    i47 = i56;
                                }
                            case 10:
                                Object obj9 = obj5;
                                unsafe4 = unsafe6;
                                obj3 = obj9;
                                i9 = i45;
                                bArr3 = bArr;
                                p7nVar3 = p7nVar;
                                i16 = i54;
                                if (i12 != 2) {
                                    unsafe2 = unsafe4;
                                    i15 = i13;
                                    i5 = i15;
                                    p7nVar2 = p7nVar;
                                    i7 = i16;
                                    bArr2 = bArr3;
                                    i48 = v;
                                    i10 = i56;
                                    i6 = i55;
                                    i8 = i14;
                                    obj2 = obj3;
                                    unsafe = unsafe2;
                                    i4 = i3;
                                    break;
                                } else {
                                    i17 = i13 | i61;
                                    i46 = u0a.W(bArr3, i16, p7nVar3);
                                    unsafe4.putObject(obj3, j, p7nVar3.c);
                                    Unsafe unsafe8 = unsafe4;
                                    obj5 = obj3;
                                    unsafe6 = unsafe8;
                                    i44 = i2;
                                    p7nVar6 = p7nVar3;
                                    i47 = i56;
                                    i51 = i55;
                                    i49 = i14;
                                    i45 = i9;
                                    i50 = i17;
                                    bArr11 = bArr3;
                                    i48 = v;
                                }
                            case 12:
                                Object obj10 = obj5;
                                unsafe4 = unsafe6;
                                obj3 = obj10;
                                i9 = i45;
                                bArr3 = bArr;
                                p7nVar3 = p7nVar;
                                i16 = i54;
                                if (i12 != 0) {
                                    unsafe2 = unsafe4;
                                    i15 = i13;
                                    i5 = i15;
                                    p7nVar2 = p7nVar;
                                    i7 = i16;
                                    bArr2 = bArr3;
                                    i48 = v;
                                    i10 = i56;
                                    i6 = i55;
                                    i8 = i14;
                                    obj2 = obj3;
                                    unsafe = unsafe2;
                                    i4 = i3;
                                    break;
                                } else {
                                    i46 = u0a.P(bArr3, i16, p7nVar3);
                                    int i66 = p7nVar3.a;
                                    can D = D(v);
                                    if ((i59 & Integer.MIN_VALUE) == 0 || D == null || D.a(i66)) {
                                        i17 = i13 | i61;
                                        unsafe4.putInt(obj3, j, i66);
                                        Unsafe unsafe82 = unsafe4;
                                        obj5 = obj3;
                                        unsafe6 = unsafe82;
                                        i44 = i2;
                                        p7nVar6 = p7nVar3;
                                        i47 = i56;
                                        i51 = i55;
                                        i49 = i14;
                                        i45 = i9;
                                        i50 = i17;
                                        bArr11 = bArr3;
                                        i48 = v;
                                    } else {
                                        w(obj3).d(i55, Long.valueOf(i66));
                                        obj5 = obj3;
                                        unsafe6 = unsafe4;
                                        i44 = i2;
                                        bArr11 = bArr3;
                                        p7nVar6 = p7nVar3;
                                        i48 = v;
                                        i51 = i55;
                                        i49 = i14;
                                        i45 = i9;
                                        i50 = i13;
                                        i47 = i56;
                                    }
                                }
                                break;
                            case 15:
                                Object obj11 = obj5;
                                unsafe4 = unsafe6;
                                obj3 = obj11;
                                i9 = i45;
                                bArr3 = bArr;
                                p7nVar3 = p7nVar;
                                i16 = i54;
                                if (i12 != 0) {
                                    unsafe2 = unsafe4;
                                    i15 = i13;
                                    i5 = i15;
                                    p7nVar2 = p7nVar;
                                    i7 = i16;
                                    bArr2 = bArr3;
                                    i48 = v;
                                    i10 = i56;
                                    i6 = i55;
                                    i8 = i14;
                                    obj2 = obj3;
                                    unsafe = unsafe2;
                                    i4 = i3;
                                    break;
                                } else {
                                    i17 = i13 | i61;
                                    i46 = u0a.P(bArr3, i16, p7nVar3);
                                    unsafe4.putInt(obj3, j, m8n.e(p7nVar3.a));
                                    Unsafe unsafe822 = unsafe4;
                                    obj5 = obj3;
                                    unsafe6 = unsafe822;
                                    i44 = i2;
                                    p7nVar6 = p7nVar3;
                                    i47 = i56;
                                    i51 = i55;
                                    i49 = i14;
                                    i45 = i9;
                                    i50 = i17;
                                    bArr11 = bArr3;
                                    i48 = v;
                                }
                            case 16:
                                bArr3 = bArr;
                                i16 = i54;
                                if (i12 != 0) {
                                    Object obj12 = obj5;
                                    Unsafe unsafe9 = unsafe6;
                                    obj3 = obj12;
                                    unsafe2 = unsafe9;
                                    i15 = i13;
                                    i9 = i45;
                                    i5 = i15;
                                    p7nVar2 = p7nVar;
                                    i7 = i16;
                                    bArr2 = bArr3;
                                    i48 = v;
                                    i10 = i56;
                                    i6 = i55;
                                    i8 = i14;
                                    obj2 = obj3;
                                    unsafe = unsafe2;
                                    i4 = i3;
                                    break;
                                } else {
                                    int T3 = u0a.T(bArr3, i16, p7nVar);
                                    unsafe6.putLong(obj5, j, m8n.f(p7nVar.b));
                                    obj5 = obj5;
                                    unsafe6 = unsafe6;
                                    i44 = i2;
                                    bArr11 = bArr3;
                                    p7nVar6 = p7nVar;
                                    i48 = v;
                                    i49 = i14;
                                    i46 = T3;
                                    i50 = i13 | i61;
                                    i47 = i56;
                                    i51 = i55;
                                }
                            default:
                                if (i12 != 3) {
                                    bArr3 = bArr;
                                    unsafe2 = unsafe6;
                                    obj3 = obj5;
                                    i15 = i13;
                                    i9 = i45;
                                    i16 = i54;
                                    i5 = i15;
                                    p7nVar2 = p7nVar;
                                    i7 = i16;
                                    bArr2 = bArr3;
                                    i48 = v;
                                    i10 = i56;
                                    i6 = i55;
                                    i8 = i14;
                                    obj2 = obj3;
                                    unsafe = unsafe2;
                                    i4 = i3;
                                    break;
                                } else {
                                    int i67 = i13 | i61;
                                    Object E2 = E(v, obj5);
                                    i46 = u0a.Y(E2, B(v), bArr, i54, i2, (i56 << 3) | 4, p7nVar);
                                    F(v, obj5, E2);
                                    i44 = i2;
                                    bArr11 = bArr;
                                    p7nVar6 = p7nVar;
                                    i48 = v;
                                    i47 = i56;
                                    i51 = i55;
                                    i49 = i14;
                                    i50 = i67;
                                }
                        }
                    } else {
                        Unsafe unsafe10 = unsafe6;
                        Object obj13 = obj5;
                        i9 = i45;
                        if (k != 27) {
                            obj2 = obj13;
                            if (k > 49) {
                                bArr5 = bArr;
                                p7nVar2 = p7nVar;
                                i8 = i49;
                                i20 = i56;
                                i5 = i50;
                                i21 = i54;
                                i6 = i55;
                                if (k != 50) {
                                    unsafe = unsafe10;
                                    long j2 = iArr[v + 2] & 1048575;
                                    switch (k) {
                                        case 51:
                                            bArr2 = bArr;
                                            i40 = i21;
                                            i41 = v;
                                            i10 = i20;
                                            if (i58 == 1) {
                                                i42 = i40 + 8;
                                                unsafe.putObject(obj2, j, Double.valueOf(Double.longBitsToDouble(u0a.V(i40, bArr2))));
                                                unsafe.putInt(obj2, j2, i10);
                                                if (i42 != i40) {
                                                    i4 = i3;
                                                    i7 = i42;
                                                    i48 = i41;
                                                    break;
                                                } else {
                                                    bArr11 = bArr2;
                                                    i46 = i42;
                                                    i47 = i10;
                                                    p7nVar6 = p7nVar2;
                                                    obj5 = obj2;
                                                    unsafe6 = unsafe;
                                                    i48 = i41;
                                                    i45 = i9;
                                                    i49 = i8;
                                                    i50 = i5;
                                                    i44 = i2;
                                                    i51 = i6;
                                                }
                                            }
                                            i42 = i40;
                                            if (i42 != i40) {
                                            }
                                        case 52:
                                            bArr2 = bArr;
                                            i40 = i21;
                                            i41 = v;
                                            i10 = i20;
                                            if (i58 == 5) {
                                                i42 = i40 + 4;
                                                unsafe.putObject(obj2, j, Float.valueOf(Float.intBitsToFloat(u0a.U(i40, bArr2))));
                                                unsafe.putInt(obj2, j2, i10);
                                                if (i42 != i40) {
                                                }
                                            }
                                            i42 = i40;
                                            if (i42 != i40) {
                                            }
                                            break;
                                        case 53:
                                        case 54:
                                            bArr2 = bArr;
                                            i40 = i21;
                                            i41 = v;
                                            i10 = i20;
                                            if (i58 == 0) {
                                                T = u0a.T(bArr2, i40, p7nVar2);
                                                unsafe.putObject(obj2, j, Long.valueOf(p7nVar2.b));
                                                unsafe.putInt(obj2, j2, i10);
                                                i42 = T;
                                                if (i42 != i40) {
                                                }
                                            }
                                            i42 = i40;
                                            if (i42 != i40) {
                                            }
                                            break;
                                        case 55:
                                        case 62:
                                            bArr2 = bArr;
                                            i40 = i21;
                                            i41 = v;
                                            i10 = i20;
                                            if (i58 == 0) {
                                                i42 = u0a.P(bArr2, i40, p7nVar2);
                                                unsafe.putObject(obj2, j, Integer.valueOf(p7nVar2.a));
                                                unsafe.putInt(obj2, j2, i10);
                                                if (i42 != i40) {
                                                }
                                            }
                                            i42 = i40;
                                            if (i42 != i40) {
                                            }
                                            break;
                                        case 56:
                                        case 65:
                                            bArr2 = bArr;
                                            i40 = i21;
                                            i41 = v;
                                            i10 = i20;
                                            if (i58 == 1) {
                                                i42 = i40 + 8;
                                                unsafe.putObject(obj2, j, Long.valueOf(u0a.V(i40, bArr2)));
                                                unsafe.putInt(obj2, j2, i10);
                                                if (i42 != i40) {
                                                }
                                            }
                                            i42 = i40;
                                            if (i42 != i40) {
                                            }
                                            break;
                                        case 57:
                                        case 64:
                                            bArr2 = bArr;
                                            i40 = i21;
                                            i41 = v;
                                            i10 = i20;
                                            if (i58 == 5) {
                                                i42 = i40 + 4;
                                                unsafe.putObject(obj2, j, Integer.valueOf(u0a.U(i40, bArr2)));
                                                unsafe.putInt(obj2, j2, i10);
                                                if (i42 != i40) {
                                                }
                                            }
                                            i42 = i40;
                                            if (i42 != i40) {
                                            }
                                            break;
                                        case 58:
                                            bArr2 = bArr;
                                            i40 = i21;
                                            i41 = v;
                                            i10 = i20;
                                            if (i58 == 0) {
                                                T = u0a.T(bArr2, i40, p7nVar2);
                                                unsafe.putObject(obj2, j, Boolean.valueOf(p7nVar2.b != 0));
                                                unsafe.putInt(obj2, j2, i10);
                                                i42 = T;
                                                if (i42 != i40) {
                                                }
                                            }
                                            i42 = i40;
                                            if (i42 != i40) {
                                            }
                                            break;
                                        case 59:
                                            bArr2 = bArr;
                                            i40 = i21;
                                            i10 = i20;
                                            if (i58 == 2) {
                                                i42 = u0a.P(bArr2, i40, p7nVar2);
                                                int i68 = p7nVar2.a;
                                                if (i68 == 0) {
                                                    unsafe.putObject(obj2, j, "");
                                                    i41 = v;
                                                } else {
                                                    int i69 = i42 + i68;
                                                    if ((i59 & 536870912) != 0 && !vdn.a(i42, i69, bArr2)) {
                                                        hbo.m("Protocol message had invalid UTF-8.");
                                                        return 0;
                                                    }
                                                    i41 = v;
                                                    unsafe.putObject(obj2, j, new String(bArr2, i42, i68, jan.a));
                                                    i42 = i69;
                                                }
                                                unsafe.putInt(obj2, j2, i10);
                                                if (i42 != i40) {
                                                }
                                            }
                                            i41 = v;
                                            i42 = i40;
                                            if (i42 != i40) {
                                            }
                                            break;
                                        case 60:
                                            i10 = i20;
                                            if (i58 == 2) {
                                                Object G = G(i10, v, obj2);
                                                int X = u0a.X(G, B(v), bArr, i21, i2, p7nVar2);
                                                p7nVar2 = p7nVar2;
                                                bArr2 = bArr;
                                                H(i10, obj2, G, v);
                                                i42 = X;
                                                i40 = i21;
                                                i41 = v;
                                                if (i42 != i40) {
                                                }
                                            } else {
                                                p7nVar2 = p7nVar2;
                                                bArr2 = bArr;
                                                i40 = i21;
                                                i41 = v;
                                                i42 = i40;
                                                if (i42 != i40) {
                                                }
                                            }
                                            break;
                                        case 61:
                                            bArr10 = bArr;
                                            i43 = i21;
                                            p7nVar5 = p7nVar2;
                                            i10 = i20;
                                            if (i58 == 2) {
                                                i42 = u0a.W(bArr10, i43, p7nVar5);
                                                unsafe.putObject(obj2, j, p7nVar5.c);
                                                unsafe.putInt(obj2, j2, i10);
                                                int i70 = i43;
                                                bArr2 = bArr10;
                                                i40 = i70;
                                                p7nVar2 = p7nVar5;
                                                i41 = v;
                                                if (i42 != i40) {
                                                }
                                            }
                                            int i71 = i43;
                                            bArr2 = bArr10;
                                            i40 = i71;
                                            p7nVar2 = p7nVar5;
                                            i41 = v;
                                            i42 = i40;
                                            if (i42 != i40) {
                                            }
                                            break;
                                        case 63:
                                            bArr10 = bArr;
                                            i43 = i21;
                                            p7nVar5 = p7nVar2;
                                            i10 = i20;
                                            if (i58 == 0) {
                                                i42 = u0a.P(bArr10, i43, p7nVar5);
                                                int i72 = p7nVar5.a;
                                                can D2 = D(v);
                                                if (D2 == null || D2.a(i72)) {
                                                    unsafe.putObject(obj2, j, Integer.valueOf(i72));
                                                    unsafe.putInt(obj2, j2, i10);
                                                } else {
                                                    w(obj2).d(i6, Long.valueOf(i72));
                                                }
                                                int i702 = i43;
                                                bArr2 = bArr10;
                                                i40 = i702;
                                                p7nVar2 = p7nVar5;
                                                i41 = v;
                                                if (i42 != i40) {
                                                }
                                            }
                                            int i712 = i43;
                                            bArr2 = bArr10;
                                            i40 = i712;
                                            p7nVar2 = p7nVar5;
                                            i41 = v;
                                            i42 = i40;
                                            if (i42 != i40) {
                                            }
                                            break;
                                        case 66:
                                            bArr10 = bArr;
                                            i43 = i21;
                                            p7nVar5 = p7nVar2;
                                            i10 = i20;
                                            if (i58 == 0) {
                                                i42 = u0a.P(bArr10, i43, p7nVar5);
                                                unsafe.putObject(obj2, j, Integer.valueOf(m8n.e(p7nVar5.a)));
                                                unsafe.putInt(obj2, j2, i10);
                                                int i7022 = i43;
                                                bArr2 = bArr10;
                                                i40 = i7022;
                                                p7nVar2 = p7nVar5;
                                                i41 = v;
                                                if (i42 != i40) {
                                                }
                                            }
                                            int i7122 = i43;
                                            bArr2 = bArr10;
                                            i40 = i7122;
                                            p7nVar2 = p7nVar5;
                                            i41 = v;
                                            i42 = i40;
                                            if (i42 != i40) {
                                            }
                                            break;
                                        case 67:
                                            bArr10 = bArr;
                                            i43 = i21;
                                            p7nVar5 = p7nVar2;
                                            i10 = i20;
                                            if (i58 == 0) {
                                                i42 = u0a.T(bArr10, i43, p7nVar5);
                                                unsafe.putObject(obj2, j, Long.valueOf(m8n.f(p7nVar5.b)));
                                                unsafe.putInt(obj2, j2, i10);
                                                int i70222 = i43;
                                                bArr2 = bArr10;
                                                i40 = i70222;
                                                p7nVar2 = p7nVar5;
                                                i41 = v;
                                                if (i42 != i40) {
                                                }
                                            }
                                            int i71222 = i43;
                                            bArr2 = bArr10;
                                            i40 = i71222;
                                            p7nVar2 = p7nVar5;
                                            i41 = v;
                                            i42 = i40;
                                            if (i42 != i40) {
                                            }
                                            break;
                                        case 68:
                                            if (i58 == 3) {
                                                Object G2 = G(i20, v, obj2);
                                                int Y = u0a.Y(G2, B(v), bArr, i21, i2, (i6 & (-8)) | 4, p7nVar2);
                                                H(i20, obj2, G2, v);
                                                bArr2 = bArr;
                                                i40 = i21;
                                                i42 = Y;
                                                p7nVar2 = p7nVar2;
                                                i10 = i20;
                                                i41 = v;
                                                if (i42 != i40) {
                                                }
                                            }
                                            break;
                                        default:
                                            bArr2 = bArr;
                                            i40 = i21;
                                            i41 = v;
                                            i10 = i20;
                                            i42 = i40;
                                            if (i42 != i40) {
                                            }
                                            break;
                                    }
                                } else {
                                    if (i58 == 2) {
                                        Object C = C(v);
                                        Object object = unsafe10.getObject(obj2, j);
                                        if (!((kbn) object).a) {
                                            kbn g = kbn.b.g();
                                            mbn.a(g, object);
                                            unsafe10.putObject(obj2, j, g);
                                        }
                                        throw fn0.h(C);
                                    }
                                    unsafe = unsafe10;
                                }
                            } else {
                                long j3 = i59;
                                ian ianVar2 = (ian) unsafe10.getObject(obj2, j);
                                if (!((m7n) ianVar2).a) {
                                    int size = ianVar2.size();
                                    ianVar2 = ianVar2.f(size + size);
                                    unsafe10.putObject(obj2, j, ianVar2);
                                }
                                String str3 = "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.";
                                switch (k) {
                                    case 18:
                                    case 35:
                                        bArr6 = bArr;
                                        unsafe5 = unsafe10;
                                        ian ianVar3 = ianVar2;
                                        i22 = i56;
                                        i5 = i50;
                                        i23 = i54;
                                        i6 = i55;
                                        p7nVar2 = p7nVar;
                                        i8 = i49;
                                        i24 = i2;
                                        if (i58 == 2) {
                                            u8n u8nVar = (u8n) ianVar3;
                                            int P2 = u0a.P(bArr6, i23, p7nVar2);
                                            int i73 = p7nVar2.a;
                                            int i74 = P2 + i73;
                                            if (i74 > bArr6.length) {
                                                hbo.m("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                return 0;
                                            }
                                            int i75 = (i73 / 8) + u8nVar.c;
                                            int length = u8nVar.b.length;
                                            if (i75 <= length) {
                                                i25 = P2;
                                            } else if (length != 0) {
                                                while (length < i75) {
                                                    length = x5n.e(length, 3, 2, 1, 10);
                                                    P2 = P2;
                                                }
                                                i25 = P2;
                                                u8nVar.b = Arrays.copyOf(u8nVar.b, length);
                                            } else {
                                                i25 = P2;
                                                u8nVar.b = new double[Math.max(i75, 10)];
                                            }
                                            i26 = i25;
                                            while (i26 < i74) {
                                                u8nVar.d(Double.longBitsToDouble(u0a.V(i26, bArr6)));
                                                i26 += 8;
                                            }
                                            if (i26 != i74) {
                                                hbo.m("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                return 0;
                                            }
                                            i46 = i26;
                                            if (i46 == i23) {
                                                i4 = i3;
                                                i7 = i46;
                                                i48 = v;
                                                i10 = i22;
                                                unsafe = unsafe5;
                                                bArr2 = bArr6;
                                                break;
                                            } else {
                                                bArr11 = bArr6;
                                                i44 = i24;
                                                p7nVar6 = p7nVar2;
                                                i48 = v;
                                                i51 = i6;
                                                obj5 = obj2;
                                                i45 = i9;
                                                i47 = i22;
                                                i49 = i8;
                                                i50 = i5;
                                                unsafe6 = unsafe5;
                                            }
                                        } else {
                                            if (i58 == 1) {
                                                i46 = i23 + 8;
                                                u8n u8nVar2 = (u8n) ianVar3;
                                                u8nVar2.d(Double.longBitsToDouble(u0a.V(i23, bArr6)));
                                                while (i46 < i24) {
                                                    int P3 = u0a.P(bArr6, i46, p7nVar2);
                                                    if (i6 == p7nVar2.a) {
                                                        u8nVar2.d(Double.longBitsToDouble(u0a.V(P3, bArr6)));
                                                        i46 = P3 + 8;
                                                    } else if (i46 == i23) {
                                                    }
                                                }
                                                if (i46 == i23) {
                                                }
                                            }
                                            i46 = i23;
                                            if (i46 == i23) {
                                            }
                                        }
                                    case 19:
                                    case 36:
                                        bArr6 = bArr;
                                        unsafe5 = unsafe10;
                                        ian ianVar4 = ianVar2;
                                        i22 = i56;
                                        i5 = i50;
                                        i23 = i54;
                                        i6 = i55;
                                        p7nVar2 = p7nVar;
                                        i8 = i49;
                                        i24 = i2;
                                        if (i58 == 2) {
                                            l9n l9nVar = (l9n) ianVar4;
                                            int P4 = u0a.P(bArr6, i23, p7nVar2);
                                            int i76 = p7nVar2.a;
                                            int i77 = P4 + i76;
                                            if (i77 > bArr6.length) {
                                                hbo.m("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                return 0;
                                            }
                                            int i78 = (i76 / 4) + l9nVar.c;
                                            int length2 = l9nVar.b.length;
                                            if (i78 <= length2) {
                                                i27 = P4;
                                            } else if (length2 != 0) {
                                                while (length2 < i78) {
                                                    length2 = x5n.e(length2, 3, 2, 1, 10);
                                                    P4 = P4;
                                                }
                                                i27 = P4;
                                                l9nVar.b = Arrays.copyOf(l9nVar.b, length2);
                                            } else {
                                                i27 = P4;
                                                l9nVar.b = new float[Math.max(i78, 10)];
                                            }
                                            i26 = i27;
                                            while (i26 < i77) {
                                                l9nVar.d(Float.intBitsToFloat(u0a.U(i26, bArr6)));
                                                i26 += 4;
                                            }
                                            if (i26 != i77) {
                                                hbo.m("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                return 0;
                                            }
                                            i46 = i26;
                                            if (i46 == i23) {
                                            }
                                        } else {
                                            if (i58 == 5) {
                                                i46 = i23 + 4;
                                                l9n l9nVar2 = (l9n) ianVar4;
                                                l9nVar2.d(Float.intBitsToFloat(u0a.U(i23, bArr6)));
                                                while (i46 < i24) {
                                                    int P5 = u0a.P(bArr6, i46, p7nVar2);
                                                    if (i6 == p7nVar2.a) {
                                                        l9nVar2.d(Float.intBitsToFloat(u0a.U(P5, bArr6)));
                                                        i46 = P5 + 4;
                                                    } else if (i46 == i23) {
                                                    }
                                                }
                                                if (i46 == i23) {
                                                }
                                            }
                                            i46 = i23;
                                            if (i46 == i23) {
                                            }
                                        }
                                        break;
                                    case 20:
                                    case 21:
                                    case 37:
                                    case 38:
                                        bArr6 = bArr;
                                        unsafe5 = unsafe10;
                                        ian ianVar5 = ianVar2;
                                        i22 = i56;
                                        i5 = i50;
                                        i23 = i54;
                                        i6 = i55;
                                        p7nVar2 = p7nVar;
                                        i8 = i49;
                                        i24 = i2;
                                        if (i58 == 2) {
                                            zan zanVar = (zan) ianVar5;
                                            i26 = u0a.P(bArr6, i23, p7nVar2);
                                            int i79 = p7nVar2.a + i26;
                                            while (i26 < i79) {
                                                i26 = u0a.T(bArr6, i26, p7nVar2);
                                                zanVar.e(p7nVar2.b);
                                            }
                                            if (i26 != i79) {
                                                hbo.m("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                return 0;
                                            }
                                        } else {
                                            if (i58 == 0) {
                                                zan zanVar2 = (zan) ianVar5;
                                                i26 = u0a.T(bArr6, i23, p7nVar2);
                                                zanVar2.e(p7nVar2.b);
                                                while (i26 < i24) {
                                                    int P6 = u0a.P(bArr6, i26, p7nVar2);
                                                    if (i6 == p7nVar2.a) {
                                                        i26 = u0a.T(bArr6, P6, p7nVar2);
                                                        zanVar2.e(p7nVar2.b);
                                                    }
                                                }
                                            }
                                            i46 = i23;
                                            if (i46 == i23) {
                                            }
                                        }
                                        i46 = i26;
                                        if (i46 == i23) {
                                        }
                                        break;
                                    case 22:
                                    case 29:
                                    case 39:
                                    case 43:
                                        bArr7 = bArr;
                                        i28 = i2;
                                        unsafe5 = unsafe10;
                                        ian ianVar6 = ianVar2;
                                        i22 = i56;
                                        i5 = i50;
                                        i29 = i54;
                                        i6 = i55;
                                        p7nVar2 = p7nVar;
                                        i8 = i49;
                                        if (i58 == 2) {
                                            a0 = u0a.a0(bArr7, i29, ianVar6, p7nVar2);
                                            i23 = i29;
                                            i24 = i28;
                                            bArr6 = bArr7;
                                            i46 = a0;
                                            if (i46 == i23) {
                                            }
                                        } else {
                                            if (i58 == 0) {
                                                bArr6 = bArr7;
                                                i23 = i29;
                                                i24 = i28;
                                                i46 = u0a.Z(i6, bArr6, i29, i28, ianVar6, p7nVar2);
                                                if (i46 == i23) {
                                                }
                                            }
                                            i23 = i29;
                                            i24 = i28;
                                            bArr6 = bArr7;
                                            i46 = i23;
                                            if (i46 == i23) {
                                            }
                                        }
                                        break;
                                    case 23:
                                    case 32:
                                    case 40:
                                    case 46:
                                        bArr7 = bArr;
                                        i28 = i2;
                                        unsafe5 = unsafe10;
                                        ian ianVar7 = ianVar2;
                                        i22 = i56;
                                        i5 = i50;
                                        i29 = i54;
                                        i6 = i55;
                                        p7nVar2 = p7nVar;
                                        i8 = i49;
                                        if (i58 == 2) {
                                            zan zanVar3 = (zan) ianVar7;
                                            int P7 = u0a.P(bArr7, i29, p7nVar2);
                                            int i80 = p7nVar2.a;
                                            int i81 = P7 + i80;
                                            if (i81 > bArr7.length) {
                                                hbo.m("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                return 0;
                                            }
                                            int i82 = (i80 / 8) + zanVar3.c;
                                            int length3 = zanVar3.b.length;
                                            if (i82 <= length3) {
                                                i30 = P7;
                                            } else if (length3 != 0) {
                                                while (length3 < i82) {
                                                    length3 = x5n.e(length3, 3, 2, 1, 10);
                                                    P7 = P7;
                                                }
                                                i30 = P7;
                                                zanVar3.b = Arrays.copyOf(zanVar3.b, length3);
                                            } else {
                                                i30 = P7;
                                                zanVar3.b = new long[Math.max(i82, 10)];
                                            }
                                            i31 = i30;
                                            while (i31 < i81) {
                                                zanVar3.e(u0a.V(i31, bArr7));
                                                i31 += 8;
                                            }
                                            if (i31 != i81) {
                                                hbo.m("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                return 0;
                                            }
                                            i23 = i29;
                                            i24 = i28;
                                            i46 = i31;
                                            bArr6 = bArr7;
                                            if (i46 == i23) {
                                            }
                                        } else {
                                            if (i58 == 1) {
                                                a0 = i29 + 8;
                                                zan zanVar4 = (zan) ianVar7;
                                                zanVar4.e(u0a.V(i29, bArr7));
                                                while (a0 < i28) {
                                                    int P8 = u0a.P(bArr7, a0, p7nVar2);
                                                    if (i6 == p7nVar2.a) {
                                                        zanVar4.e(u0a.V(P8, bArr7));
                                                        a0 = P8 + 8;
                                                    } else {
                                                        i23 = i29;
                                                        i24 = i28;
                                                        bArr6 = bArr7;
                                                        i46 = a0;
                                                        if (i46 == i23) {
                                                        }
                                                    }
                                                }
                                                i23 = i29;
                                                i24 = i28;
                                                bArr6 = bArr7;
                                                i46 = a0;
                                                if (i46 == i23) {
                                                }
                                            }
                                            i23 = i29;
                                            i24 = i28;
                                            bArr6 = bArr7;
                                            i46 = i23;
                                            if (i46 == i23) {
                                            }
                                        }
                                        break;
                                    case 24:
                                    case 31:
                                    case 41:
                                    case 45:
                                        i8 = i49;
                                        int i83 = i56;
                                        i6 = i55;
                                        bArr7 = bArr;
                                        i28 = i2;
                                        ian ianVar8 = ianVar2;
                                        i5 = i50;
                                        i29 = i54;
                                        p7nVar2 = p7nVar;
                                        String str4 = "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.";
                                        if (i58 == 2) {
                                            aan aanVar = (aan) ianVar8;
                                            int P9 = u0a.P(bArr7, i29, p7nVar2);
                                            int i84 = p7nVar2.a;
                                            int i85 = P9 + i84;
                                            if (i85 > bArr7.length) {
                                                hbo.m(str4);
                                                return 0;
                                            }
                                            int i86 = (i84 / 4) + aanVar.c;
                                            int length4 = aanVar.b.length;
                                            if (i86 <= length4) {
                                                i32 = P9;
                                                i22 = i83;
                                                unsafe5 = unsafe10;
                                                str = str4;
                                            } else if (length4 != 0) {
                                                while (length4 < i86) {
                                                    length4 = x5n.e(length4, 3, 2, 1, 10);
                                                    P9 = P9;
                                                    str4 = str4;
                                                    i83 = i83;
                                                    unsafe10 = unsafe10;
                                                }
                                                i32 = P9;
                                                i22 = i83;
                                                unsafe5 = unsafe10;
                                                str = str4;
                                                aanVar.b = Arrays.copyOf(aanVar.b, length4);
                                            } else {
                                                i32 = P9;
                                                i22 = i83;
                                                unsafe5 = unsafe10;
                                                str = str4;
                                                aanVar.b = new int[Math.max(i86, 10)];
                                            }
                                            i31 = i32;
                                            while (i31 < i85) {
                                                aanVar.g(u0a.U(i31, bArr7));
                                                i31 += 4;
                                            }
                                            if (i31 != i85) {
                                                hbo.m(str);
                                                return 0;
                                            }
                                            i23 = i29;
                                            i24 = i28;
                                            i46 = i31;
                                            bArr6 = bArr7;
                                            if (i46 == i23) {
                                            }
                                        } else {
                                            i22 = i83;
                                            unsafe5 = unsafe10;
                                            if (i58 == 5) {
                                                a0 = i29 + 4;
                                                aan aanVar2 = (aan) ianVar8;
                                                aanVar2.g(u0a.U(i29, bArr7));
                                                while (a0 < i28) {
                                                    int P10 = u0a.P(bArr7, a0, p7nVar2);
                                                    if (i6 == p7nVar2.a) {
                                                        aanVar2.g(u0a.U(P10, bArr7));
                                                        a0 = P10 + 4;
                                                    } else {
                                                        i23 = i29;
                                                        i24 = i28;
                                                        bArr6 = bArr7;
                                                        i46 = a0;
                                                        if (i46 == i23) {
                                                        }
                                                    }
                                                }
                                                i23 = i29;
                                                i24 = i28;
                                                bArr6 = bArr7;
                                                i46 = a0;
                                                if (i46 == i23) {
                                                }
                                            }
                                            i23 = i29;
                                            i24 = i28;
                                            bArr6 = bArr7;
                                            i46 = i23;
                                            if (i46 == i23) {
                                            }
                                        }
                                        break;
                                    case 25:
                                    case 42:
                                        i8 = i49;
                                        i6 = i55;
                                        bArr7 = bArr;
                                        i28 = i2;
                                        String str5 = "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.";
                                        ian ianVar9 = ianVar2;
                                        i5 = i50;
                                        i29 = i54;
                                        p7nVar2 = p7nVar;
                                        if (i58 == 2) {
                                            s7n s7nVar = (s7n) ianVar9;
                                            i31 = u0a.P(bArr7, i29, p7nVar2);
                                            int i87 = p7nVar2.a + i31;
                                            while (i31 < i87) {
                                                i31 = u0a.T(bArr7, i31, p7nVar2);
                                                String str6 = str5;
                                                s7nVar.d(p7nVar2.b != 0);
                                                str5 = str6;
                                            }
                                            String str7 = str5;
                                            if (i31 != i87) {
                                                hbo.m(str7);
                                                return 0;
                                            }
                                        } else if (i58 == 0) {
                                            s7n s7nVar2 = (s7n) ianVar9;
                                            i31 = u0a.T(bArr7, i29, p7nVar2);
                                            s7nVar2.d(p7nVar2.b != 0);
                                            while (i31 < i28) {
                                                int P11 = u0a.P(bArr7, i31, p7nVar2);
                                                if (i6 == p7nVar2.a) {
                                                    i31 = u0a.T(bArr7, P11, p7nVar2);
                                                    s7nVar2.d(p7nVar2.b != 0);
                                                }
                                            }
                                        } else {
                                            bArr6 = bArr7;
                                            i22 = i56;
                                            unsafe5 = unsafe10;
                                            i23 = i29;
                                            i24 = i28;
                                            i46 = i23;
                                            if (i46 == i23) {
                                            }
                                        }
                                        i22 = i56;
                                        unsafe5 = unsafe10;
                                        i23 = i29;
                                        i24 = i28;
                                        i46 = i31;
                                        bArr6 = bArr7;
                                        if (i46 == i23) {
                                        }
                                        break;
                                    case 26:
                                        i8 = i49;
                                        i6 = i55;
                                        ian ianVar10 = ianVar2;
                                        i33 = i54;
                                        p7nVar2 = p7nVar;
                                        if (i58 == 2) {
                                            if ((j3 & 536870912) == 0) {
                                                a0 = u0a.P(bArr, i33, p7nVar2);
                                                int i88 = p7nVar2.a;
                                                if (i88 < 0) {
                                                    hbo.m("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                    return 0;
                                                }
                                                if (i88 == 0) {
                                                    ianVar10.add("");
                                                    i5 = i50;
                                                } else {
                                                    i5 = i50;
                                                    ianVar10.add(new String(bArr, a0, i88, jan.a));
                                                    a0 += i88;
                                                }
                                                while (a0 < i2) {
                                                    int P12 = u0a.P(bArr, a0, p7nVar2);
                                                    if (i6 == p7nVar2.a) {
                                                        a0 = u0a.P(bArr, P12, p7nVar2);
                                                        int i89 = p7nVar2.a;
                                                        if (i89 < 0) {
                                                            hbo.m("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                            return 0;
                                                        }
                                                        if (i89 == 0) {
                                                            ianVar10.add("");
                                                        } else {
                                                            ianVar10.add(new String(bArr, a0, i89, jan.a));
                                                            a0 += i89;
                                                        }
                                                    }
                                                }
                                            } else {
                                                i5 = i50;
                                                a0 = u0a.P(bArr, i33, p7nVar2);
                                                int i90 = p7nVar2.a;
                                                if (i90 < 0) {
                                                    hbo.m("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                    return 0;
                                                }
                                                if (i90 == 0) {
                                                    ianVar10.add("");
                                                } else {
                                                    int i91 = a0 + i90;
                                                    if (!vdn.a(a0, i91, bArr)) {
                                                        hbo.m("Protocol message had invalid UTF-8.");
                                                        return 0;
                                                    }
                                                    ianVar10.add(new String(bArr, a0, i90, jan.a));
                                                    a0 = i91;
                                                }
                                                while (a0 < i2) {
                                                    int P13 = u0a.P(bArr, a0, p7nVar2);
                                                    if (i6 == p7nVar2.a) {
                                                        a0 = u0a.P(bArr, P13, p7nVar2);
                                                        int i92 = p7nVar2.a;
                                                        if (i92 < 0) {
                                                            hbo.m("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                            return 0;
                                                        }
                                                        if (i92 == 0) {
                                                            ianVar10.add("");
                                                        } else {
                                                            int i93 = a0 + i92;
                                                            if (!vdn.a(a0, i93, bArr)) {
                                                                hbo.m("Protocol message had invalid UTF-8.");
                                                                return 0;
                                                            }
                                                            ianVar10.add(new String(bArr, a0, i92, jan.a));
                                                            a0 = i93;
                                                        }
                                                    }
                                                }
                                            }
                                            bArr6 = bArr;
                                            i22 = i56;
                                            unsafe5 = unsafe10;
                                            i24 = i2;
                                            i23 = i33;
                                            i46 = a0;
                                            if (i46 == i23) {
                                            }
                                        } else {
                                            i5 = i50;
                                            bArr6 = bArr;
                                            i22 = i56;
                                            unsafe5 = unsafe10;
                                            i24 = i2;
                                            i23 = i33;
                                            i46 = i23;
                                            if (i46 == i23) {
                                            }
                                        }
                                        break;
                                    case 27:
                                        ian ianVar11 = ianVar2;
                                        i6 = i55;
                                        p7nVar2 = p7nVar;
                                        i8 = i49;
                                        i24 = i2;
                                        if (i58 == 2) {
                                            obj2 = obj;
                                            a0 = u0a.b0(B(v), i6, bArr, i54, i24, ianVar11, p7nVar2);
                                            bArr6 = bArr;
                                            i22 = i56;
                                            unsafe5 = unsafe10;
                                            i5 = i50;
                                            i23 = i54;
                                            i24 = i24;
                                            i46 = a0;
                                            if (i46 == i23) {
                                            }
                                        } else {
                                            i33 = i54;
                                            obj2 = obj;
                                            i22 = i56;
                                            bArr6 = bArr;
                                            unsafe5 = unsafe10;
                                            i5 = i50;
                                            i23 = i33;
                                            i46 = i23;
                                            if (i46 == i23) {
                                            }
                                        }
                                        break;
                                    case 28:
                                        bArr8 = bArr;
                                        ian ianVar12 = ianVar2;
                                        i34 = i54;
                                        i6 = i55;
                                        p7nVar2 = p7nVar;
                                        i8 = i49;
                                        i24 = i2;
                                        if (i58 == 2) {
                                            int P14 = u0a.P(bArr8, i34, p7nVar2);
                                            int i94 = p7nVar2.a;
                                            if (i94 < 0) {
                                                hbo.m("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                return 0;
                                            }
                                            if (i94 > bArr8.length - P14) {
                                                hbo.m("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                return 0;
                                            }
                                            if (i94 == 0) {
                                                ianVar12.add(g8n.b);
                                            } else {
                                                ianVar12.add(g8n.v(P14, i94, bArr8));
                                                P14 += i94;
                                            }
                                            while (P14 < i24) {
                                                int P15 = u0a.P(bArr8, P14, p7nVar2);
                                                if (i6 == p7nVar2.a) {
                                                    P14 = u0a.P(bArr8, P15, p7nVar2);
                                                    int i95 = p7nVar2.a;
                                                    if (i95 < 0) {
                                                        hbo.m("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                        return 0;
                                                    }
                                                    if (i95 > bArr8.length - P14) {
                                                        hbo.m("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                        return 0;
                                                    }
                                                    if (i95 == 0) {
                                                        ianVar12.add(g8n.b);
                                                    } else {
                                                        ianVar12.add(g8n.v(P14, i95, bArr8));
                                                        P14 += i95;
                                                    }
                                                } else {
                                                    i46 = P14;
                                                    i22 = i56;
                                                    bArr6 = bArr8;
                                                    unsafe5 = unsafe10;
                                                    i23 = i34;
                                                    i5 = i50;
                                                    obj2 = obj;
                                                    if (i46 == i23) {
                                                    }
                                                }
                                            }
                                            i46 = P14;
                                            i22 = i56;
                                            bArr6 = bArr8;
                                            unsafe5 = unsafe10;
                                            i23 = i34;
                                            i5 = i50;
                                            obj2 = obj;
                                            if (i46 == i23) {
                                            }
                                        } else {
                                            i22 = i56;
                                            bArr6 = bArr8;
                                            unsafe5 = unsafe10;
                                            i23 = i34;
                                            i5 = i50;
                                            obj2 = obj;
                                            i46 = i23;
                                            if (i46 == i23) {
                                            }
                                        }
                                        break;
                                    case 30:
                                    case 44:
                                        i28 = i2;
                                        i8 = i49;
                                        i35 = i54;
                                        if (i58 == 2) {
                                            Z = u0a.a0(bArr, i35, ianVar2, p7nVar);
                                            i36 = i55;
                                            i37 = i35;
                                            ianVar = ianVar2;
                                            bArr8 = bArr;
                                        } else if (i58 == 0) {
                                            i36 = i55;
                                            ianVar = ianVar2;
                                            Z = u0a.Z(i36, bArr, i35, i28, ianVar, p7nVar);
                                            bArr8 = bArr;
                                            i37 = i35;
                                        } else {
                                            i6 = i55;
                                            obj2 = obj;
                                            i22 = i56;
                                            bArr6 = bArr;
                                            p7nVar2 = p7nVar;
                                            unsafe5 = unsafe10;
                                            i5 = i50;
                                            i23 = i35;
                                            i24 = i28;
                                            i46 = i23;
                                            if (i46 == i23) {
                                            }
                                        }
                                        i24 = i28;
                                        p7nVar2 = p7nVar;
                                        i6 = i36;
                                        i34 = i37;
                                        tcn.c(obj2, i56, ianVar, D(v), null, this.k);
                                        i22 = i56;
                                        i46 = Z;
                                        bArr6 = bArr8;
                                        unsafe5 = unsafe10;
                                        i23 = i34;
                                        i5 = i50;
                                        obj2 = obj;
                                        if (i46 == i23) {
                                        }
                                        break;
                                    case 33:
                                    case 47:
                                        bArr9 = bArr;
                                        i28 = i2;
                                        p7nVar4 = p7nVar;
                                        i38 = i55;
                                        i8 = i49;
                                        i35 = i54;
                                        if (i58 == 2) {
                                            aan aanVar3 = (aan) ianVar2;
                                            a0 = u0a.P(bArr9, i35, p7nVar4);
                                            int i96 = p7nVar4.a + a0;
                                            while (a0 < i96) {
                                                a0 = u0a.P(bArr9, a0, p7nVar4);
                                                aanVar3.g(m8n.e(p7nVar4.a));
                                            }
                                            if (a0 != i96) {
                                                hbo.m("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                return 0;
                                            }
                                        } else {
                                            if (i58 == 0) {
                                                aan aanVar4 = (aan) ianVar2;
                                                a0 = u0a.P(bArr9, i35, p7nVar4);
                                                aanVar4.g(m8n.e(p7nVar4.a));
                                                while (a0 < i28) {
                                                    int P16 = u0a.P(bArr9, a0, p7nVar4);
                                                    if (i38 == p7nVar4.a) {
                                                        a0 = u0a.P(bArr9, P16, p7nVar4);
                                                        aanVar4.g(m8n.e(p7nVar4.a));
                                                    }
                                                }
                                            }
                                            bArr6 = bArr9;
                                            p7nVar2 = p7nVar4;
                                            unsafe5 = unsafe10;
                                            i22 = i56;
                                            i5 = i50;
                                            i6 = i38;
                                            i23 = i35;
                                            i24 = i28;
                                            i46 = i23;
                                            if (i46 == i23) {
                                            }
                                        }
                                        bArr6 = bArr9;
                                        p7nVar2 = p7nVar4;
                                        unsafe5 = unsafe10;
                                        i22 = i56;
                                        i5 = i50;
                                        i6 = i38;
                                        i23 = i35;
                                        i24 = i28;
                                        i46 = a0;
                                        if (i46 == i23) {
                                        }
                                        break;
                                    case 34:
                                    case 48:
                                        bArr9 = bArr;
                                        i28 = i2;
                                        p7nVar4 = p7nVar;
                                        i38 = i55;
                                        i8 = i49;
                                        i35 = i54;
                                        if (i58 == 2) {
                                            zan zanVar5 = (zan) ianVar2;
                                            int P17 = u0a.P(bArr9, i35, p7nVar4);
                                            int i97 = p7nVar4.a + P17;
                                            while (P17 < i97) {
                                                int T4 = u0a.T(bArr9, P17, p7nVar4);
                                                zanVar5.e(m8n.f(p7nVar4.b));
                                                P17 = T4;
                                                str3 = str3;
                                            }
                                            String str8 = str3;
                                            if (P17 != i97) {
                                                hbo.m(str8);
                                                return 0;
                                            }
                                            p7nVar2 = p7nVar4;
                                            unsafe5 = unsafe10;
                                            i22 = i56;
                                            i5 = i50;
                                            i6 = i38;
                                            i23 = i35;
                                            i24 = i28;
                                            i46 = P17;
                                            bArr6 = bArr9;
                                            if (i46 == i23) {
                                            }
                                        } else {
                                            if (i58 == 0) {
                                                zan zanVar6 = (zan) ianVar2;
                                                int T5 = u0a.T(bArr9, i35, p7nVar4);
                                                zanVar6.e(m8n.f(p7nVar4.b));
                                                while (true) {
                                                    a0 = T5;
                                                    if (a0 < i28) {
                                                        int P18 = u0a.P(bArr9, a0, p7nVar4);
                                                        if (i38 == p7nVar4.a) {
                                                            T5 = u0a.T(bArr9, P18, p7nVar4);
                                                            zanVar6.e(m8n.f(p7nVar4.b));
                                                        }
                                                    }
                                                }
                                                bArr6 = bArr9;
                                                p7nVar2 = p7nVar4;
                                                unsafe5 = unsafe10;
                                                i22 = i56;
                                                i5 = i50;
                                                i6 = i38;
                                                i23 = i35;
                                                i24 = i28;
                                                i46 = a0;
                                                if (i46 == i23) {
                                                }
                                            }
                                            bArr6 = bArr9;
                                            p7nVar2 = p7nVar4;
                                            unsafe5 = unsafe10;
                                            i22 = i56;
                                            i5 = i50;
                                            i6 = i38;
                                            i23 = i35;
                                            i24 = i28;
                                            i46 = i23;
                                            if (i46 == i23) {
                                            }
                                        }
                                        break;
                                    default:
                                        if (i58 == 3) {
                                            int i98 = (i55 & (-8)) | 4;
                                            pcn B = B(v);
                                            y9n zza = B.zza();
                                            int i99 = i2;
                                            int i100 = i54;
                                            int Y2 = u0a.Y(zza, B, bArr, i100, i99, i98, p7nVar);
                                            int i101 = i98;
                                            p7n p7nVar7 = p7nVar;
                                            B.c(zza);
                                            p7nVar7.c = zza;
                                            ianVar2.add(zza);
                                            int i102 = Y2;
                                            while (true) {
                                                if (i102 < i99) {
                                                    int i103 = i100;
                                                    int P19 = u0a.P(bArr, i102, p7nVar7);
                                                    int i104 = i101;
                                                    if (i55 == p7nVar7.a) {
                                                        y9n zza2 = B.zza();
                                                        p7n p7nVar8 = p7nVar7;
                                                        int Y3 = u0a.Y(zza2, B, bArr, P19, i99, i104, p7nVar8);
                                                        i101 = i104;
                                                        p7nVar7 = p7nVar8;
                                                        i102 = Y3;
                                                        B.c(zza2);
                                                        p7nVar7.c = zza2;
                                                        ianVar2.add(zza2);
                                                        i99 = i99;
                                                        i100 = i103;
                                                        i49 = i49;
                                                    } else {
                                                        i8 = i49;
                                                        i39 = i103;
                                                    }
                                                } else {
                                                    i8 = i49;
                                                    i39 = i100;
                                                }
                                            }
                                            bArr6 = bArr;
                                            p7nVar2 = p7nVar7;
                                            unsafe5 = unsafe10;
                                            i22 = i56;
                                            i5 = i50;
                                            i6 = i55;
                                            i23 = i39;
                                            i24 = i99;
                                            i46 = i102;
                                            if (i46 == i23) {
                                            }
                                        } else {
                                            i8 = i49;
                                            bArr6 = bArr;
                                            i24 = i2;
                                            p7nVar2 = p7nVar;
                                            unsafe5 = unsafe10;
                                            i22 = i56;
                                            i5 = i50;
                                            i23 = i54;
                                            i6 = i55;
                                            i46 = i23;
                                            if (i46 == i23) {
                                            }
                                        }
                                        break;
                                }
                            }
                        } else if (i58 == 2) {
                            ian ianVar13 = (ian) unsafe10.getObject(obj13, j);
                            if (!((m7n) ianVar13).a) {
                                int size2 = ianVar13.size();
                                ianVar13 = ianVar13.f(size2 == 0 ? 10 : size2 + size2);
                                unsafe10.putObject(obj13, j, ianVar13);
                            }
                            bArr11 = bArr;
                            i44 = i2;
                            i46 = u0a.b0(B(v), i55, bArr11, i54, i44, ianVar13, p7nVar);
                            p7nVar6 = p7nVar;
                            i51 = i55;
                            unsafe6 = unsafe10;
                            i48 = v;
                            i47 = i56;
                            obj5 = obj;
                            i45 = i9;
                        } else {
                            obj2 = obj13;
                            bArr5 = bArr;
                            p7nVar2 = p7nVar;
                            i8 = i49;
                            i20 = i56;
                            i5 = i50;
                            i6 = i55;
                            unsafe = unsafe10;
                            i21 = i54;
                        }
                        bArr2 = bArr5;
                        i7 = i21;
                        i48 = v;
                        i10 = i20;
                        i4 = i3;
                    }
                }
                if (i6 != i4 || i4 == 0) {
                    if (this.f) {
                        z8n z8nVar = p7nVar2.d;
                        z8n z8nVar2 = z8n.b;
                        int i105 = o7n.a;
                        if (z8nVar != z8n.c) {
                            k7n k7nVar = this.e;
                            z8nVar.getClass();
                            if (z8nVar.a.get(new w8n(i10, k7nVar)) != null) {
                                pvd.j();
                                return 0;
                            }
                            i11 = i6;
                            c0 = u0a.c0(i11, bArr2, i7, i2, w(obj2), p7nVar2);
                            i44 = i2;
                            i46 = c0;
                            bArr11 = bArr;
                            p7nVar6 = p7nVar;
                            i51 = i11;
                            i47 = i10;
                            obj5 = obj2;
                            unsafe6 = unsafe;
                            i45 = i9;
                            i49 = i8;
                            i50 = i5;
                        }
                    }
                    i11 = i6;
                    c0 = u0a.c0(i11, bArr, i7, i2, w(obj2), p7nVar);
                    i44 = i2;
                    i46 = c0;
                    bArr11 = bArr;
                    p7nVar6 = p7nVar;
                    i51 = i11;
                    i47 = i10;
                    obj5 = obj2;
                    unsafe6 = unsafe;
                    i45 = i9;
                    i49 = i8;
                    i50 = i5;
                } else {
                    i44 = i2;
                    i46 = i7;
                    i49 = i8;
                }
            } else {
                i4 = i3;
                obj2 = obj5;
                i5 = i50;
                unsafe = unsafe6;
                i6 = i51;
            }
        }
    }

    public final void z(int i, Object obj, Object obj2) {
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
            pcn B = B(i);
            if (!r(i, obj)) {
                if (l(object)) {
                    y9n zza = B.zza();
                    B.a(zza, object);
                    unsafe.putObject(obj, j, zza);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                s(i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!l(object2)) {
                y9n zza2 = B.zza();
                B.a(zza2, object2);
                unsafe.putObject(obj, j, zza2);
                object2 = zza2;
            }
            B.a(object2, object);
        }
    }

    @Override // defpackage.pcn
    public final y9n zza() {
        return ((y9n) this.e).m();
    }
}

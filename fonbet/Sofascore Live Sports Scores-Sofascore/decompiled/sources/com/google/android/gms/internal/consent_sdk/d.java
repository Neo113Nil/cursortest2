package com.google.android.gms.internal.consent_sdk;

import defpackage.a70;
import defpackage.ceo;
import defpackage.d4;
import defpackage.d6p;
import defpackage.e2f;
import defpackage.fc6;
import defpackage.g5p;
import defpackage.gvo;
import defpackage.haf;
import defpackage.hbo;
import defpackage.ilg;
import defpackage.k5p;
import defpackage.m5p;
import defpackage.muo;
import defpackage.mz1;
import defpackage.sck;
import defpackage.w4p;
import defpackage.x2p;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.security.AccessController;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class d implements g5p {
    public static final int[] i = new int[0];
    public static final Unsafe j;
    public final int[] a;
    public final Object[] b;
    public final zzrq c;
    public final boolean d;
    public final int[] e;
    public final int f;
    public final haf g;
    public final e2f h;

    static {
        Unsafe unsafe;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new d4(17));
        } catch (Throwable unused) {
            unsafe = null;
        }
        j = unsafe;
    }

    public d(int[] iArr, Object[] objArr, zzrq zzrqVar, int[] iArr2, int i2, haf hafVar, e2f e2fVar) {
        this.a = iArr;
        this.b = objArr;
        boolean z = false;
        if (e2fVar != null && (zzrqVar instanceof zzqk)) {
            z = true;
        }
        this.d = z;
        this.e = iArr2;
        this.f = i2;
        this.g = hafVar;
        this.h = e2fVar;
        this.c = zzrqVar;
    }

    public static boolean a(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzqm) {
            return ((zzqm) obj).e();
        }
        return true;
    }

    public static int j(Object obj, long j2) {
        return ((Integer) d6p.g(obj, j2)).intValue();
    }

    public static int k(int i2) {
        return (i2 >>> 20) & 255;
    }

    public static long m(Object obj, long j2) {
        return ((Long) d6p.g(obj, j2)).longValue();
    }

    public static Field o(Class cls, String str) {
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

    @Override // defpackage.g5p
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
                int l = l(i8);
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
                if ((268435456 & l) != 0 && !u(i3, i2, i4, i12, obj)) {
                    break;
                }
                int k = k(l);
                if (k == 9 || k == 17) {
                    if (u(i3, i2, i4, i12, obj) && !n(i3).b(d6p.g(obj, l & 1048575))) {
                        break;
                    }
                    i6++;
                    i7 = i2;
                    i5 = i4;
                } else {
                    if (k != 27) {
                        if (k == 60 || k == 68) {
                            if (i(i9, i3, obj) && !n(i3).b(d6p.g(obj, l & 1048575))) {
                                break;
                            }
                            i6++;
                            i7 = i2;
                            i5 = i4;
                        } else if (k != 49) {
                            if (k != 50) {
                                continue;
                            } else {
                                zzrk zzrkVar = (zzrk) d6p.g(obj, l & 1048575);
                                if (zzrkVar.isEmpty()) {
                                    continue;
                                } else {
                                    int i14 = i3 / 3;
                                    if (((zzsz) ((zzrj) this.b[i14 + i14]).a.c).a == zzta.i) {
                                        g5p g5pVar = null;
                                        for (Object obj2 : zzrkVar.values()) {
                                            if (g5pVar == null) {
                                                g5pVar = w4p.c.a(obj2.getClass());
                                            }
                                            if (!g5pVar.b(obj2)) {
                                                break loop0;
                                            }
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                            }
                            i6++;
                            i7 = i2;
                            i5 = i4;
                        }
                    }
                    List list = (List) d6p.g(obj, l & 1048575);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        g5p n = n(i3);
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
            } else if (!this.d || ((zzqk) obj).zzb.h()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.g5p
    public final void c(Object obj) {
        if (!a(obj)) {
            return;
        }
        if (obj instanceof zzqm) {
            zzqm zzqmVar = (zzqm) obj;
            zzqmVar.d();
            zzqmVar.zza = 0;
            zzqmVar.l();
        }
        int i2 = 0;
        while (true) {
            int[] iArr = this.a;
            if (i2 >= iArr.length) {
                this.g.getClass();
                zzsq zzsqVar = ((zzqm) obj).zzc;
                if (zzsqVar.d) {
                    zzsqVar.d = false;
                }
                if (this.d) {
                    this.h.getClass();
                    ((zzqk) obj).zzb.e();
                    return;
                }
                return;
            }
            int l = l(i2);
            int i3 = 1048575 & l;
            int k = k(l);
            long j2 = i3;
            Unsafe unsafe = j;
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
                            ((zzqr) d6p.g(obj, j2)).zzb();
                            break;
                        case 50:
                            Object object = unsafe.getObject(obj, j2);
                            if (object == null) {
                                break;
                            } else {
                                ((zzrk) object).a = false;
                                unsafe.putObject(obj, j2, object);
                                break;
                            }
                    }
                } else if (i(iArr[i2], i2, obj)) {
                    n(i2).c(unsafe.getObject(obj, j2));
                }
                i2 += 3;
            }
            if (t(i2, obj)) {
                n(i2).c(unsafe.getObject(obj, j2));
            }
            i2 += 3;
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
    @Override // defpackage.g5p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int d(zzqm zzqmVar) {
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
                zzqmVar.zzc.getClass();
                int i8 = (i7 * 53) + 506991;
                if (!this.d) {
                    return i8;
                }
                return ((zzqk) zzqmVar).zzb.a.hashCode() + (i8 * 53);
            }
            int l = l(i6);
            int i9 = 1048575 & l;
            int k = k(l);
            int i10 = iArr[i6];
            long j2 = i9;
            int i11 = 1237;
            int i12 = 37;
            switch (k) {
                case 0:
                    i2 = i7 * 53;
                    doubleToLongBits = Double.doubleToLongBits(d6p.c.n(zzqmVar, j2));
                    Charset charset = zzqs.a;
                    i7 = i2 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 1:
                    i3 = i7 * 53;
                    floatToIntBits = Float.floatToIntBits(d6p.c.q(zzqmVar, j2));
                    i7 = floatToIntBits + i3;
                    break;
                case 2:
                    i2 = i7 * 53;
                    doubleToLongBits = d6p.f(zzqmVar, j2);
                    Charset charset2 = zzqs.a;
                    i7 = i2 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 3:
                    i2 = i7 * 53;
                    doubleToLongBits = d6p.f(zzqmVar, j2);
                    Charset charset3 = zzqs.a;
                    i7 = i2 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 4:
                    i3 = i7 * 53;
                    floatToIntBits = d6p.e(zzqmVar, j2);
                    i7 = floatToIntBits + i3;
                    break;
                case 5:
                    i2 = i7 * 53;
                    doubleToLongBits = d6p.f(zzqmVar, j2);
                    Charset charset4 = zzqs.a;
                    i7 = i2 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 6:
                    i3 = i7 * 53;
                    floatToIntBits = d6p.e(zzqmVar, j2);
                    i7 = floatToIntBits + i3;
                    break;
                case 7:
                    i4 = i7 * 53;
                    boolean H = d6p.c.H(zzqmVar, j2);
                    Charset charset5 = zzqs.a;
                    break;
                case 8:
                    i3 = i7 * 53;
                    floatToIntBits = ((String) d6p.g(zzqmVar, j2)).hashCode();
                    i7 = floatToIntBits + i3;
                    break;
                case 9:
                    i5 = i7 * 53;
                    Object g = d6p.g(zzqmVar, j2);
                    if (g != null) {
                        i12 = g.hashCode();
                    }
                    i7 = i5 + i12;
                    break;
                case 10:
                    i3 = i7 * 53;
                    floatToIntBits = d6p.g(zzqmVar, j2).hashCode();
                    i7 = floatToIntBits + i3;
                    break;
                case 11:
                    i3 = i7 * 53;
                    floatToIntBits = d6p.e(zzqmVar, j2);
                    i7 = floatToIntBits + i3;
                    break;
                case 12:
                    i3 = i7 * 53;
                    floatToIntBits = d6p.e(zzqmVar, j2);
                    i7 = floatToIntBits + i3;
                    break;
                case 13:
                    i3 = i7 * 53;
                    floatToIntBits = d6p.e(zzqmVar, j2);
                    i7 = floatToIntBits + i3;
                    break;
                case 14:
                    i2 = i7 * 53;
                    doubleToLongBits = d6p.f(zzqmVar, j2);
                    Charset charset6 = zzqs.a;
                    i7 = i2 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 15:
                    i3 = i7 * 53;
                    floatToIntBits = d6p.e(zzqmVar, j2);
                    i7 = floatToIntBits + i3;
                    break;
                case 16:
                    i2 = i7 * 53;
                    doubleToLongBits = d6p.f(zzqmVar, j2);
                    Charset charset7 = zzqs.a;
                    i7 = i2 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 17:
                    i5 = i7 * 53;
                    Object g2 = d6p.g(zzqmVar, j2);
                    if (g2 != null) {
                        i12 = g2.hashCode();
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
                    floatToIntBits = d6p.g(zzqmVar, j2).hashCode();
                    i7 = floatToIntBits + i3;
                    break;
                case 50:
                    i3 = i7 * 53;
                    floatToIntBits = d6p.g(zzqmVar, j2).hashCode();
                    i7 = floatToIntBits + i3;
                    break;
                case 51:
                    if (!i(i10, i6, zzqmVar)) {
                        break;
                    } else {
                        i2 = i7 * 53;
                        doubleToLongBits = Double.doubleToLongBits(((Double) d6p.g(zzqmVar, j2)).doubleValue());
                        Charset charset8 = zzqs.a;
                        i7 = i2 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case 52:
                    if (!i(i10, i6, zzqmVar)) {
                        break;
                    } else {
                        i3 = i7 * 53;
                        floatToIntBits = Float.floatToIntBits(((Float) d6p.g(zzqmVar, j2)).floatValue());
                        i7 = floatToIntBits + i3;
                        break;
                    }
                case 53:
                    if (!i(i10, i6, zzqmVar)) {
                        break;
                    } else {
                        i2 = i7 * 53;
                        doubleToLongBits = m(zzqmVar, j2);
                        Charset charset9 = zzqs.a;
                        i7 = i2 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case 54:
                    if (!i(i10, i6, zzqmVar)) {
                        break;
                    } else {
                        i2 = i7 * 53;
                        doubleToLongBits = m(zzqmVar, j2);
                        Charset charset10 = zzqs.a;
                        i7 = i2 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case 55:
                    if (!i(i10, i6, zzqmVar)) {
                        break;
                    } else {
                        i3 = i7 * 53;
                        floatToIntBits = j(zzqmVar, j2);
                        i7 = floatToIntBits + i3;
                        break;
                    }
                case 56:
                    if (!i(i10, i6, zzqmVar)) {
                        break;
                    } else {
                        i2 = i7 * 53;
                        doubleToLongBits = m(zzqmVar, j2);
                        Charset charset11 = zzqs.a;
                        i7 = i2 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case 57:
                    if (!i(i10, i6, zzqmVar)) {
                        break;
                    } else {
                        i3 = i7 * 53;
                        floatToIntBits = j(zzqmVar, j2);
                        i7 = floatToIntBits + i3;
                        break;
                    }
                case 58:
                    if (!i(i10, i6, zzqmVar)) {
                        break;
                    } else {
                        i4 = i7 * 53;
                        boolean booleanValue = ((Boolean) d6p.g(zzqmVar, j2)).booleanValue();
                        Charset charset12 = zzqs.a;
                        break;
                    }
                case 59:
                    if (!i(i10, i6, zzqmVar)) {
                        break;
                    } else {
                        i3 = i7 * 53;
                        floatToIntBits = ((String) d6p.g(zzqmVar, j2)).hashCode();
                        i7 = floatToIntBits + i3;
                        break;
                    }
                case 60:
                    if (!i(i10, i6, zzqmVar)) {
                        break;
                    } else {
                        i3 = i7 * 53;
                        floatToIntBits = d6p.g(zzqmVar, j2).hashCode();
                        i7 = floatToIntBits + i3;
                        break;
                    }
                case 61:
                    if (!i(i10, i6, zzqmVar)) {
                        break;
                    } else {
                        i3 = i7 * 53;
                        floatToIntBits = d6p.g(zzqmVar, j2).hashCode();
                        i7 = floatToIntBits + i3;
                        break;
                    }
                case 62:
                    if (!i(i10, i6, zzqmVar)) {
                        break;
                    } else {
                        i3 = i7 * 53;
                        floatToIntBits = j(zzqmVar, j2);
                        i7 = floatToIntBits + i3;
                        break;
                    }
                case 63:
                    if (!i(i10, i6, zzqmVar)) {
                        break;
                    } else {
                        i3 = i7 * 53;
                        floatToIntBits = j(zzqmVar, j2);
                        i7 = floatToIntBits + i3;
                        break;
                    }
                case 64:
                    if (!i(i10, i6, zzqmVar)) {
                        break;
                    } else {
                        i3 = i7 * 53;
                        floatToIntBits = j(zzqmVar, j2);
                        i7 = floatToIntBits + i3;
                        break;
                    }
                case 65:
                    if (!i(i10, i6, zzqmVar)) {
                        break;
                    } else {
                        i2 = i7 * 53;
                        doubleToLongBits = m(zzqmVar, j2);
                        Charset charset13 = zzqs.a;
                        i7 = i2 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case 66:
                    if (!i(i10, i6, zzqmVar)) {
                        break;
                    } else {
                        i3 = i7 * 53;
                        floatToIntBits = j(zzqmVar, j2);
                        i7 = floatToIntBits + i3;
                        break;
                    }
                case 67:
                    if (!i(i10, i6, zzqmVar)) {
                        break;
                    } else {
                        i2 = i7 * 53;
                        doubleToLongBits = m(zzqmVar, j2);
                        Charset charset14 = zzqs.a;
                        i7 = i2 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case 68:
                    if (!i(i10, i6, zzqmVar)) {
                        break;
                    } else {
                        i3 = i7 * 53;
                        floatToIntBits = d6p.g(zzqmVar, j2).hashCode();
                        i7 = floatToIntBits + i3;
                        break;
                    }
            }
            i6 += 3;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.g5p
    public final void e(Object obj, muo muoVar) {
        boolean z;
        int[] iArr;
        int i2;
        boolean z2;
        int i3;
        int i4;
        d dVar = this;
        zzpv zzpvVar = (zzpv) muoVar.b;
        Map.Entry entry = null;
        if (dVar.d) {
            x2p x2pVar = ((zzqk) obj).zzb;
            if (!x2pVar.a.isEmpty()) {
                entry = (Map.Entry) x2pVar.d().next();
            }
        }
        Map.Entry entry2 = entry;
        int i5 = 1048575;
        int i6 = 1048575;
        int i7 = 0;
        int i8 = 0;
        while (true) {
            int[] iArr2 = dVar.a;
            if (i7 >= iArr2.length) {
                if (entry2 != null) {
                    throw fc6.d(entry2);
                }
                zzsq zzsqVar = ((zzqm) obj).zzc;
                return;
            }
            int l = dVar.l(i7);
            int k = k(l);
            int i9 = iArr2[i7];
            Unsafe unsafe = j;
            if (k <= 17) {
                int i10 = iArr2[i7 + 2];
                z = true;
                int i11 = i10 & i5;
                if (i11 != i6) {
                    i8 = i11 == i5 ? 0 : unsafe.getInt(obj, i11);
                    i6 = i11;
                }
                int i12 = 1 << (i10 >>> 20);
                iArr = iArr2;
                i2 = i12;
            } else {
                z = true;
                iArr = iArr2;
                i2 = 0;
            }
            if (entry2 != null) {
                throw fc6.d(entry2);
            }
            long j2 = l & i5;
            switch (k) {
                case 0:
                    if (dVar.u(i7, i6, i8, i2, obj)) {
                        zzpvVar.m(i9, Double.doubleToRawLongBits(d6p.c.n(obj, j2)));
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (dVar.u(i7, i6, i8, i2, obj)) {
                        zzpvVar.k(i9, Float.floatToRawIntBits(d6p.c.q(obj, j2)));
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (dVar.u(i7, i6, i8, i2, obj)) {
                        zzpvVar.y(i9, unsafe.getLong(obj, j2));
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (dVar.u(i7, i6, i8, i2, obj)) {
                        zzpvVar.y(i9, unsafe.getLong(obj, j2));
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (dVar.u(i7, i6, i8, i2, obj)) {
                        zzpvVar.o(i9, unsafe.getInt(obj, j2));
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (dVar.u(i7, i6, i8, i2, obj)) {
                        zzpvVar.m(i9, unsafe.getLong(obj, j2));
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (dVar.u(i7, i6, i8, i2, obj)) {
                        zzpvVar.k(i9, unsafe.getInt(obj, j2));
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (dVar.u(i7, i6, i8, i2, obj)) {
                        zzpvVar.g(i9, d6p.c.H(obj, j2));
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (dVar.u(i7, i6, i8, i2, obj)) {
                        Object object = unsafe.getObject(obj, j2);
                        if (object instanceof String) {
                            zzpvVar.t(i9, (String) object);
                            break;
                        } else {
                            zzpvVar.i(i9, (zzpm) object);
                            break;
                        }
                    } else {
                        break;
                    }
                case 9:
                    if (dVar.u(i7, i6, i8, i2, obj)) {
                        muoVar.j(i9, unsafe.getObject(obj, j2), dVar.n(i7));
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (dVar.u(i7, i6, i8, i2, obj)) {
                        zzpvVar.i(i9, (zzpm) unsafe.getObject(obj, j2));
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (dVar.u(i7, i6, i8, i2, obj)) {
                        zzpvVar.w(i9, unsafe.getInt(obj, j2));
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (dVar.u(i7, i6, i8, i2, obj)) {
                        zzpvVar.o(i9, unsafe.getInt(obj, j2));
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (dVar.u(i7, i6, i8, i2, obj)) {
                        zzpvVar.k(i9, unsafe.getInt(obj, j2));
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (dVar.u(i7, i6, i8, i2, obj)) {
                        zzpvVar.m(i9, unsafe.getLong(obj, j2));
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (dVar.u(i7, i6, i8, i2, obj)) {
                        int i13 = unsafe.getInt(obj, j2);
                        zzpvVar.w(i9, (i13 >> 31) ^ (i13 + i13));
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (dVar.u(i7, i6, i8, i2, obj)) {
                        long j3 = unsafe.getLong(obj, j2);
                        zzpvVar.y(i9, (j3 >> 63) ^ (j3 + j3));
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (dVar.u(i7, i6, i8, i2, obj)) {
                        Object object2 = unsafe.getObject(obj, j2);
                        zzpvVar.v(i9, 3);
                        dVar.n(i7).e((zzpa) object2, muoVar);
                        zzpvVar.v(i9, 4);
                        break;
                    } else {
                        break;
                    }
                case 18:
                    z2 = false;
                    i3 = i6;
                    f.r(iArr[i7], (List) unsafe.getObject(obj, j2), muoVar, false);
                    i6 = i3;
                    break;
                case 19:
                    z2 = false;
                    i3 = i6;
                    f.v(iArr[i7], (List) unsafe.getObject(obj, j2), muoVar, false);
                    i6 = i3;
                    break;
                case 20:
                    z2 = false;
                    i3 = i6;
                    f.x(iArr[i7], (List) unsafe.getObject(obj, j2), muoVar, false);
                    i6 = i3;
                    break;
                case 21:
                    z2 = false;
                    i3 = i6;
                    f.d(iArr[i7], (List) unsafe.getObject(obj, j2), muoVar, false);
                    i6 = i3;
                    break;
                case 22:
                    z2 = false;
                    i3 = i6;
                    f.w(iArr[i7], (List) unsafe.getObject(obj, j2), muoVar, false);
                    i6 = i3;
                    break;
                case 23:
                    z2 = false;
                    i3 = i6;
                    f.u(iArr[i7], (List) unsafe.getObject(obj, j2), muoVar, false);
                    i6 = i3;
                    break;
                case 24:
                    z2 = false;
                    i3 = i6;
                    f.t(iArr[i7], (List) unsafe.getObject(obj, j2), muoVar, false);
                    i6 = i3;
                    break;
                case 25:
                    i3 = i6;
                    z2 = false;
                    f.q(iArr[i7], (List) unsafe.getObject(obj, j2), muoVar, false);
                    i6 = i3;
                    break;
                case 26:
                    i4 = i6;
                    int i14 = iArr[i7];
                    List list = (List) unsafe.getObject(obj, j2);
                    haf hafVar = f.a;
                    if (list != null && !list.isEmpty()) {
                        if (list instanceof zzrb) {
                            zzrb zzrbVar = (zzrb) list;
                            for (int i15 = 0; i15 < list.size(); i15++) {
                                Object zza = zzrbVar.zza();
                                if (zza instanceof String) {
                                    zzpvVar.t(i14, (String) zza);
                                } else {
                                    zzpvVar.i(i14, (zzpm) zza);
                                }
                            }
                        } else {
                            for (int i16 = 0; i16 < list.size(); i16++) {
                                zzpvVar.t(i14, (String) list.get(i16));
                            }
                        }
                    }
                    i6 = i4;
                    break;
                case 27:
                    i4 = i6;
                    int i17 = iArr[i7];
                    List list2 = (List) unsafe.getObject(obj, j2);
                    g5p n = dVar.n(i7);
                    haf hafVar2 = f.a;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i18 = 0; i18 < list2.size(); i18++) {
                            muoVar.j(i17, list2.get(i18), n);
                        }
                    }
                    i6 = i4;
                    break;
                case 28:
                    i4 = i6;
                    int i19 = iArr[i7];
                    List list3 = (List) unsafe.getObject(obj, j2);
                    haf hafVar3 = f.a;
                    if (list3 != null && !list3.isEmpty()) {
                        for (int i20 = 0; i20 < list3.size(); i20++) {
                            zzpvVar.i(i19, (zzpm) list3.get(i20));
                        }
                    }
                    i6 = i4;
                    break;
                case 29:
                    z2 = false;
                    i3 = i6;
                    f.c(iArr[i7], (List) unsafe.getObject(obj, j2), muoVar, false);
                    i6 = i3;
                    break;
                case 30:
                    z2 = false;
                    i3 = i6;
                    f.s(iArr[i7], (List) unsafe.getObject(obj, j2), muoVar, false);
                    i6 = i3;
                    break;
                case 31:
                    z2 = false;
                    i3 = i6;
                    f.y(iArr[i7], (List) unsafe.getObject(obj, j2), muoVar, false);
                    i6 = i3;
                    break;
                case 32:
                    z2 = false;
                    i3 = i6;
                    f.z(iArr[i7], (List) unsafe.getObject(obj, j2), muoVar, false);
                    i6 = i3;
                    break;
                case 33:
                    z2 = false;
                    i3 = i6;
                    f.a(iArr[i7], (List) unsafe.getObject(obj, j2), muoVar, false);
                    i6 = i3;
                    break;
                case 34:
                    i3 = i6;
                    z2 = false;
                    f.b(iArr[i7], (List) unsafe.getObject(obj, j2), muoVar, false);
                    i6 = i3;
                    break;
                case 35:
                    i4 = i6;
                    f.r(iArr[i7], (List) unsafe.getObject(obj, j2), muoVar, z);
                    i6 = i4;
                    break;
                case 36:
                    i4 = i6;
                    f.v(iArr[i7], (List) unsafe.getObject(obj, j2), muoVar, z);
                    i6 = i4;
                    break;
                case 37:
                    i4 = i6;
                    f.x(iArr[i7], (List) unsafe.getObject(obj, j2), muoVar, z);
                    i6 = i4;
                    break;
                case 38:
                    i4 = i6;
                    f.d(iArr[i7], (List) unsafe.getObject(obj, j2), muoVar, z);
                    i6 = i4;
                    break;
                case 39:
                    i4 = i6;
                    f.w(iArr[i7], (List) unsafe.getObject(obj, j2), muoVar, z);
                    i6 = i4;
                    break;
                case 40:
                    i4 = i6;
                    f.u(iArr[i7], (List) unsafe.getObject(obj, j2), muoVar, z);
                    i6 = i4;
                    break;
                case 41:
                    i4 = i6;
                    f.t(iArr[i7], (List) unsafe.getObject(obj, j2), muoVar, z);
                    i6 = i4;
                    break;
                case 42:
                    i4 = i6;
                    f.q(iArr[i7], (List) unsafe.getObject(obj, j2), muoVar, z);
                    i6 = i4;
                    break;
                case 43:
                    i4 = i6;
                    f.c(iArr[i7], (List) unsafe.getObject(obj, j2), muoVar, z);
                    i6 = i4;
                    break;
                case 44:
                    i4 = i6;
                    f.s(iArr[i7], (List) unsafe.getObject(obj, j2), muoVar, z);
                    i6 = i4;
                    break;
                case 45:
                    i4 = i6;
                    f.y(iArr[i7], (List) unsafe.getObject(obj, j2), muoVar, z);
                    i6 = i4;
                    break;
                case 46:
                    i4 = i6;
                    f.z(iArr[i7], (List) unsafe.getObject(obj, j2), muoVar, z);
                    i6 = i4;
                    break;
                case 47:
                    i4 = i6;
                    f.a(iArr[i7], (List) unsafe.getObject(obj, j2), muoVar, z);
                    i6 = i4;
                    break;
                case 48:
                    i4 = i6;
                    f.b(iArr[i7], (List) unsafe.getObject(obj, j2), muoVar, true);
                    i6 = i4;
                    break;
                case 49:
                    i4 = i6;
                    int i21 = iArr[i7];
                    List list4 = (List) unsafe.getObject(obj, j2);
                    g5p n2 = dVar.n(i7);
                    haf hafVar4 = f.a;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i22 = 0; i22 < list4.size(); i22++) {
                            zzpa zzpaVar = (zzpa) list4.get(i22);
                            zzpvVar.v(i21, 3);
                            n2.e(zzpaVar, muoVar);
                            zzpvVar.v(i21, 4);
                        }
                    }
                    i6 = i4;
                    break;
                case 50:
                    Object object3 = unsafe.getObject(obj, j2);
                    if (object3 != null) {
                        int i23 = i7 / 3;
                        gvo gvoVar = ((zzrj) dVar.b[i23 + i23]).a;
                        zzsz zzszVar = (zzsz) gvoVar.c;
                        zzsz zzszVar2 = (zzsz) gvoVar.b;
                        for (Map.Entry entry3 : ((zzrk) object3).entrySet()) {
                            zzpvVar.v(i9, 2);
                            int i24 = i6;
                            boolean z3 = z;
                            zzpvVar.x(x2p.a(zzszVar, 2, entry3.getValue()) + x2p.a(zzszVar2, z3 ? 1 : 0, entry3.getKey()));
                            Object key = entry3.getKey();
                            Object value = entry3.getValue();
                            x2p.g(zzpvVar, zzszVar2, z3 ? 1 : 0, key);
                            x2p.g(zzpvVar, zzszVar, 2, value);
                            i6 = i24;
                            z = true;
                        }
                    }
                    break;
                case 51:
                    if (dVar.i(i9, i7, obj)) {
                        zzpvVar.m(i9, Double.doubleToRawLongBits(((Double) d6p.g(obj, j2)).doubleValue()));
                    }
                    break;
                case 52:
                    if (dVar.i(i9, i7, obj)) {
                        zzpvVar.k(i9, Float.floatToRawIntBits(((Float) d6p.g(obj, j2)).floatValue()));
                    }
                    break;
                case 53:
                    if (dVar.i(i9, i7, obj)) {
                        zzpvVar.y(i9, m(obj, j2));
                    }
                    break;
                case 54:
                    if (dVar.i(i9, i7, obj)) {
                        zzpvVar.y(i9, m(obj, j2));
                    }
                    break;
                case 55:
                    if (dVar.i(i9, i7, obj)) {
                        zzpvVar.o(i9, j(obj, j2));
                    }
                    break;
                case 56:
                    if (dVar.i(i9, i7, obj)) {
                        zzpvVar.m(i9, m(obj, j2));
                    }
                    break;
                case 57:
                    if (dVar.i(i9, i7, obj)) {
                        zzpvVar.k(i9, j(obj, j2));
                    }
                    break;
                case 58:
                    if (dVar.i(i9, i7, obj)) {
                        zzpvVar.g(i9, ((Boolean) d6p.g(obj, j2)).booleanValue());
                    }
                    break;
                case 59:
                    if (dVar.i(i9, i7, obj)) {
                        Object object4 = unsafe.getObject(obj, j2);
                        if (object4 instanceof String) {
                            zzpvVar.t(i9, (String) object4);
                        } else {
                            zzpvVar.i(i9, (zzpm) object4);
                        }
                    }
                    break;
                case 60:
                    if (dVar.i(i9, i7, obj)) {
                        muoVar.j(i9, unsafe.getObject(obj, j2), dVar.n(i7));
                    }
                    break;
                case 61:
                    if (dVar.i(i9, i7, obj)) {
                        zzpvVar.i(i9, (zzpm) unsafe.getObject(obj, j2));
                    }
                    break;
                case 62:
                    if (dVar.i(i9, i7, obj)) {
                        zzpvVar.w(i9, j(obj, j2));
                    }
                    break;
                case 63:
                    if (dVar.i(i9, i7, obj)) {
                        zzpvVar.o(i9, j(obj, j2));
                    }
                    break;
                case 64:
                    if (dVar.i(i9, i7, obj)) {
                        zzpvVar.k(i9, j(obj, j2));
                    }
                    break;
                case 65:
                    if (dVar.i(i9, i7, obj)) {
                        zzpvVar.m(i9, m(obj, j2));
                    }
                    break;
                case 66:
                    if (dVar.i(i9, i7, obj)) {
                        int j4 = j(obj, j2);
                        zzpvVar.w(i9, (j4 >> 31) ^ (j4 + j4));
                    }
                    break;
                case 67:
                    if (dVar.i(i9, i7, obj)) {
                        long m = m(obj, j2);
                        zzpvVar.y(i9, (m >> 63) ^ (m + m));
                    }
                    break;
                case 68:
                    if (dVar.i(i9, i7, obj)) {
                        Object object5 = unsafe.getObject(obj, j2);
                        zzpvVar.v(i9, 3);
                        dVar.n(i7).e((zzpa) object5, muoVar);
                        zzpvVar.v(i9, 4);
                    }
                    break;
            }
            i7 += 3;
            i5 = 1048575;
            dVar = this;
        }
    }

    @Override // defpackage.g5p
    public final int f(zzqm zzqmVar) {
        int i2;
        int i3;
        int c;
        int d;
        int c2;
        int m;
        int c3;
        int k;
        int c4;
        int size;
        int o;
        int c5;
        int c6;
        int c7;
        int size2;
        int c8;
        int c9;
        int i4;
        int i5;
        int c10;
        int m2;
        int c11;
        d dVar = this;
        zzqm zzqmVar2 = zzqmVar;
        int i6 = 1048575;
        int i7 = 1048575;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        while (true) {
            int[] iArr = dVar.a;
            if (i8 >= iArr.length) {
                zzsq zzsqVar = zzqmVar2.zzc;
                int i11 = zzsqVar.c;
                if (i11 == -1) {
                    i2 = 0;
                    zzsqVar.c = 0;
                    i11 = 0;
                } else {
                    i2 = 0;
                }
                int i12 = i11 + i10;
                if (!dVar.d) {
                    return i12;
                }
                k5p k5pVar = ((zzqk) zzqmVar2).zzb.a;
                int i13 = k5pVar.b;
                for (int i14 = i2; i14 < i13; i14++) {
                    m5p d2 = k5pVar.d(i14);
                    i2 += x2p.c((zzqe) d2.a, d2.b);
                }
                for (Map.Entry entry : k5pVar.a()) {
                    i2 += x2p.c((zzqe) entry.getKey(), entry.getValue());
                }
                return i12 + i2;
            }
            int l = dVar.l(i8);
            int k2 = k(l);
            int i15 = iArr[i8];
            int i16 = iArr[i8 + 2];
            int i17 = i16 & i6;
            Unsafe unsafe = j;
            if (k2 <= 17) {
                if (i17 != i7) {
                    i9 = i17 == i6 ? 0 : unsafe.getInt(zzqmVar2, i17);
                    i7 = i17;
                }
                i3 = 1 << (i16 >>> 20);
            } else {
                i3 = 0;
            }
            int i18 = l & i6;
            if (k2 >= zzqg.b.a) {
                int i19 = zzqg.c.a;
            }
            long j2 = i18;
            switch (k2) {
                case 0:
                    if (dVar.u(i8, i7, i9, i3, zzqmVar2)) {
                        i10 = ceo.h(i15 << 3, 8, i10);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (dVar.u(i8, i7, i9, i3, zzqmVar2)) {
                        i10 = ceo.h(i15 << 3, 4, i10);
                    }
                    dVar = this;
                    zzqmVar2 = zzqmVar;
                    break;
                case 2:
                    if (dVar.u(i8, i7, i9, i3, zzqmVar2)) {
                        long j3 = unsafe.getLong(zzqmVar2, j2);
                        c = zzpv.c(i15 << 3);
                        d = zzpv.d(j3);
                        i10 += d + c;
                    }
                    dVar = this;
                    break;
                case 3:
                    if (dVar.u(i8, i7, i9, i3, zzqmVar2)) {
                        long j4 = unsafe.getLong(zzqmVar2, j2);
                        c = zzpv.c(i15 << 3);
                        d = zzpv.d(j4);
                        i10 += d + c;
                    }
                    dVar = this;
                    break;
                case 4:
                    if (dVar.u(i8, i7, i9, i3, zzqmVar2)) {
                        long j5 = unsafe.getInt(zzqmVar2, j2);
                        c = zzpv.c(i15 << 3);
                        d = zzpv.d(j5);
                        i10 += d + c;
                    }
                    dVar = this;
                    break;
                case 5:
                    if (dVar.u(i8, i7, i9, i3, zzqmVar2)) {
                        i10 = ceo.h(i15 << 3, 8, i10);
                    }
                    dVar = this;
                    zzqmVar2 = zzqmVar;
                    break;
                case 6:
                    if (dVar.u(i8, i7, i9, i3, zzqmVar2)) {
                        i10 = ceo.h(i15 << 3, 4, i10);
                    }
                    dVar = this;
                    zzqmVar2 = zzqmVar;
                    break;
                case 7:
                    if (dVar.u(i8, i7, i9, i3, zzqmVar2)) {
                        i10 = ceo.h(i15 << 3, 1, i10);
                    }
                    dVar = this;
                    zzqmVar2 = zzqmVar;
                    break;
                case 8:
                    if (dVar.u(i8, i7, i9, i3, zzqmVar2)) {
                        int i20 = i15 << 3;
                        Object object = unsafe.getObject(zzqmVar2, j2);
                        if (object instanceof zzpm) {
                            c2 = zzpv.c(i20);
                            m = ((zzpm) object).m();
                            c3 = zzpv.c(m);
                            i10 += c3 + m + c2;
                        } else {
                            c = zzpv.c(i20);
                            d = zzpv.b((String) object);
                            i10 += d + c;
                        }
                    }
                    dVar = this;
                    break;
                case 9:
                    if (dVar.u(i8, i7, i9, i3, zzqmVar2)) {
                        k = f.k(i15, unsafe.getObject(zzqmVar2, j2), dVar.n(i8));
                        i10 += k;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (dVar.u(i8, i7, i9, i3, zzqmVar2)) {
                        zzpm zzpmVar = (zzpm) unsafe.getObject(zzqmVar2, j2);
                        c2 = zzpv.c(i15 << 3);
                        m = zzpmVar.m();
                        c3 = zzpv.c(m);
                        i10 += c3 + m + c2;
                    }
                    dVar = this;
                    break;
                case 11:
                    if (dVar.u(i8, i7, i9, i3, zzqmVar2)) {
                        i10 = ceo.h(unsafe.getInt(zzqmVar2, j2), zzpv.c(i15 << 3), i10);
                    }
                    dVar = this;
                    break;
                case 12:
                    if (dVar.u(i8, i7, i9, i3, zzqmVar2)) {
                        long j6 = unsafe.getInt(zzqmVar2, j2);
                        c = zzpv.c(i15 << 3);
                        d = zzpv.d(j6);
                        i10 += d + c;
                    }
                    dVar = this;
                    break;
                case 13:
                    if (dVar.u(i8, i7, i9, i3, zzqmVar2)) {
                        i10 = ceo.h(i15 << 3, 4, i10);
                    }
                    dVar = this;
                    zzqmVar2 = zzqmVar;
                    break;
                case 14:
                    if (dVar.u(i8, i7, i9, i3, zzqmVar2)) {
                        i10 = ceo.h(i15 << 3, 8, i10);
                    }
                    dVar = this;
                    zzqmVar2 = zzqmVar;
                    break;
                case 15:
                    if (dVar.u(i8, i7, i9, i3, zzqmVar2)) {
                        int i21 = unsafe.getInt(zzqmVar2, j2);
                        i10 = ceo.h((i21 >> 31) ^ (i21 + i21), zzpv.c(i15 << 3), i10);
                    }
                    dVar = this;
                    break;
                case 16:
                    if (dVar.u(i8, i7, i9, i3, zzqmVar2)) {
                        long j7 = unsafe.getLong(zzqmVar2, j2);
                        c = zzpv.c(i15 << 3);
                        d = zzpv.d((j7 >> 63) ^ (j7 + j7));
                        i10 += d + c;
                    }
                    dVar = this;
                    break;
                case 17:
                    if (dVar.u(i8, i7, i9, i3, zzqmVar2)) {
                        zzrq zzrqVar = (zzrq) unsafe.getObject(zzqmVar2, j2);
                        g5p n = dVar.n(i8);
                        haf hafVar = f.a;
                        int c12 = zzpv.c(i15 << 3);
                        k = ((zzpa) zzrqVar).c(n) + c12 + c12;
                        i10 += k;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    k = f.h(i15, (List) unsafe.getObject(zzqmVar2, j2));
                    i10 += k;
                    break;
                case 19:
                    k = f.g(i15, (List) unsafe.getObject(zzqmVar2, j2));
                    i10 += k;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(zzqmVar2, j2);
                    haf hafVar2 = f.a;
                    if (list.size() != 0) {
                        c4 = (zzpv.c(i15 << 3) * list.size()) + f.j(list);
                        i10 += c4;
                        break;
                    }
                    c4 = 0;
                    i10 += c4;
                case 21:
                    List list2 = (List) unsafe.getObject(zzqmVar2, j2);
                    haf hafVar3 = f.a;
                    size = list2.size();
                    if (size != 0) {
                        o = f.o(list2);
                        c5 = zzpv.c(i15 << 3);
                        c6 = (c5 * size) + o;
                        i10 += c6;
                        break;
                    }
                    c6 = 0;
                    i10 += c6;
                case 22:
                    List list3 = (List) unsafe.getObject(zzqmVar2, j2);
                    haf hafVar4 = f.a;
                    size = list3.size();
                    if (size != 0) {
                        o = f.i(list3);
                        c5 = zzpv.c(i15 << 3);
                        c6 = (c5 * size) + o;
                        i10 += c6;
                        break;
                    }
                    c6 = 0;
                    i10 += c6;
                case 23:
                    k = f.h(i15, (List) unsafe.getObject(zzqmVar2, j2));
                    i10 += k;
                    break;
                case 24:
                    k = f.g(i15, (List) unsafe.getObject(zzqmVar2, j2));
                    i10 += k;
                    break;
                case 25:
                    List list4 = (List) unsafe.getObject(zzqmVar2, j2);
                    haf hafVar5 = f.a;
                    int size3 = list4.size();
                    if (size3 != 0) {
                        c4 = (zzpv.c(i15 << 3) + 1) * size3;
                        i10 += c4;
                        break;
                    }
                    c4 = 0;
                    i10 += c4;
                case 26:
                    List list5 = (List) unsafe.getObject(zzqmVar2, j2);
                    haf hafVar6 = f.a;
                    int size4 = list5.size();
                    if (size4 != 0) {
                        c6 = zzpv.c(i15 << 3) * size4;
                        if (list5 instanceof zzrb) {
                            zzrb zzrbVar = (zzrb) list5;
                            for (int i22 = 0; i22 < size4; i22++) {
                                Object zza = zzrbVar.zza();
                                if (zza instanceof zzpm) {
                                    int m3 = ((zzpm) zza).m();
                                    c6 = ceo.h(m3, m3, c6);
                                } else {
                                    c6 = zzpv.b((String) zza) + c6;
                                }
                            }
                        } else {
                            for (int i23 = 0; i23 < size4; i23++) {
                                Object obj = list5.get(i23);
                                if (obj instanceof zzpm) {
                                    int m4 = ((zzpm) obj).m();
                                    c6 = ceo.h(m4, m4, c6);
                                } else {
                                    c6 = zzpv.b((String) obj) + c6;
                                }
                            }
                        }
                        i10 += c6;
                        break;
                    }
                    c6 = 0;
                    i10 += c6;
                case 27:
                    List list6 = (List) unsafe.getObject(zzqmVar2, j2);
                    g5p n2 = dVar.n(i8);
                    haf hafVar7 = f.a;
                    int size5 = list6.size();
                    if (size5 != 0) {
                        c7 = zzpv.c(i15 << 3) * size5;
                        for (int i24 = 0; i24 < size5; i24++) {
                            Object obj2 = list6.get(i24);
                            if (obj2 instanceof zzra) {
                                int a = ((zzra) obj2).a();
                                c7 = ceo.h(a, a, c7);
                            } else {
                                int c13 = ((zzpa) obj2).c(n2);
                                c7 = ceo.h(c13, c13, c7);
                            }
                        }
                        i10 += c7;
                        break;
                    }
                    c7 = 0;
                    i10 += c7;
                case 28:
                    List list7 = (List) unsafe.getObject(zzqmVar2, j2);
                    haf hafVar8 = f.a;
                    int size6 = list7.size();
                    if (size6 != 0) {
                        c6 = zzpv.c(i15 << 3) * size6;
                        for (int i25 = 0; i25 < list7.size(); i25++) {
                            int m5 = ((zzpm) list7.get(i25)).m();
                            c6 = ceo.h(m5, m5, c6);
                        }
                        i10 += c6;
                        break;
                    }
                    c6 = 0;
                    i10 += c6;
                case 29:
                    List list8 = (List) unsafe.getObject(zzqmVar2, j2);
                    haf hafVar9 = f.a;
                    size = list8.size();
                    if (size != 0) {
                        o = f.n(list8);
                        c5 = zzpv.c(i15 << 3);
                        c6 = (c5 * size) + o;
                        i10 += c6;
                        break;
                    }
                    c6 = 0;
                    i10 += c6;
                case 30:
                    List list9 = (List) unsafe.getObject(zzqmVar2, j2);
                    haf hafVar10 = f.a;
                    size = list9.size();
                    if (size != 0) {
                        o = f.f(list9);
                        c5 = zzpv.c(i15 << 3);
                        c6 = (c5 * size) + o;
                        i10 += c6;
                        break;
                    }
                    c6 = 0;
                    i10 += c6;
                case 31:
                    k = f.g(i15, (List) unsafe.getObject(zzqmVar2, j2));
                    i10 += k;
                    break;
                case 32:
                    k = f.h(i15, (List) unsafe.getObject(zzqmVar2, j2));
                    i10 += k;
                    break;
                case 33:
                    List list10 = (List) unsafe.getObject(zzqmVar2, j2);
                    haf hafVar11 = f.a;
                    size = list10.size();
                    if (size != 0) {
                        o = f.l(list10);
                        c5 = zzpv.c(i15 << 3);
                        c6 = (c5 * size) + o;
                        i10 += c6;
                        break;
                    }
                    c6 = 0;
                    i10 += c6;
                case 34:
                    List list11 = (List) unsafe.getObject(zzqmVar2, j2);
                    haf hafVar12 = f.a;
                    size = list11.size();
                    if (size != 0) {
                        o = f.m(list11);
                        c5 = zzpv.c(i15 << 3);
                        c6 = (c5 * size) + o;
                        i10 += c6;
                        break;
                    }
                    c6 = 0;
                    i10 += c6;
                case 35:
                    List list12 = (List) unsafe.getObject(zzqmVar2, j2);
                    haf hafVar13 = f.a;
                    size2 = list12.size() * 8;
                    if (size2 > 0) {
                        c8 = zzpv.c(i15 << 3);
                        c9 = zzpv.c(size2);
                        i4 = c9 + c8;
                        i10 += i4 + size2;
                        break;
                    } else {
                        break;
                    }
                case 36:
                    List list13 = (List) unsafe.getObject(zzqmVar2, j2);
                    haf hafVar14 = f.a;
                    size2 = list13.size() * 4;
                    if (size2 > 0) {
                        c8 = zzpv.c(i15 << 3);
                        c9 = zzpv.c(size2);
                        i4 = c9 + c8;
                        i10 += i4 + size2;
                        break;
                    } else {
                        break;
                    }
                case 37:
                    size2 = f.j((List) unsafe.getObject(zzqmVar2, j2));
                    if (size2 > 0) {
                        c8 = zzpv.c(i15 << 3);
                        c9 = zzpv.c(size2);
                        i4 = c9 + c8;
                        i10 += i4 + size2;
                        break;
                    } else {
                        break;
                    }
                case 38:
                    size2 = f.o((List) unsafe.getObject(zzqmVar2, j2));
                    if (size2 > 0) {
                        c8 = zzpv.c(i15 << 3);
                        c9 = zzpv.c(size2);
                        i4 = c9 + c8;
                        i10 += i4 + size2;
                        break;
                    } else {
                        break;
                    }
                case 39:
                    size2 = f.i((List) unsafe.getObject(zzqmVar2, j2));
                    if (size2 > 0) {
                        c8 = zzpv.c(i15 << 3);
                        c9 = zzpv.c(size2);
                        i4 = c9 + c8;
                        i10 += i4 + size2;
                        break;
                    } else {
                        break;
                    }
                case 40:
                    List list14 = (List) unsafe.getObject(zzqmVar2, j2);
                    haf hafVar15 = f.a;
                    size2 = list14.size() * 8;
                    if (size2 > 0) {
                        c8 = zzpv.c(i15 << 3);
                        c9 = zzpv.c(size2);
                        i4 = c9 + c8;
                        i10 += i4 + size2;
                        break;
                    } else {
                        break;
                    }
                case 41:
                    List list15 = (List) unsafe.getObject(zzqmVar2, j2);
                    haf hafVar16 = f.a;
                    size2 = list15.size() * 4;
                    if (size2 > 0) {
                        c8 = zzpv.c(i15 << 3);
                        c9 = zzpv.c(size2);
                        i4 = c9 + c8;
                        i10 += i4 + size2;
                        break;
                    } else {
                        break;
                    }
                case 42:
                    List list16 = (List) unsafe.getObject(zzqmVar2, j2);
                    haf hafVar17 = f.a;
                    size2 = list16.size();
                    if (size2 > 0) {
                        c8 = zzpv.c(i15 << 3);
                        c9 = zzpv.c(size2);
                        i4 = c9 + c8;
                        i10 += i4 + size2;
                        break;
                    } else {
                        break;
                    }
                case 43:
                    size2 = f.n((List) unsafe.getObject(zzqmVar2, j2));
                    if (size2 > 0) {
                        c8 = zzpv.c(i15 << 3);
                        c9 = zzpv.c(size2);
                        i4 = c9 + c8;
                        i10 += i4 + size2;
                        break;
                    } else {
                        break;
                    }
                case 44:
                    size2 = f.f((List) unsafe.getObject(zzqmVar2, j2));
                    if (size2 > 0) {
                        c8 = zzpv.c(i15 << 3);
                        c9 = zzpv.c(size2);
                        i4 = c9 + c8;
                        i10 += i4 + size2;
                        break;
                    } else {
                        break;
                    }
                case 45:
                    List list17 = (List) unsafe.getObject(zzqmVar2, j2);
                    haf hafVar18 = f.a;
                    size2 = list17.size() * 4;
                    if (size2 > 0) {
                        c8 = zzpv.c(i15 << 3);
                        c9 = zzpv.c(size2);
                        i4 = c9 + c8;
                        i10 += i4 + size2;
                        break;
                    } else {
                        break;
                    }
                case 46:
                    List list18 = (List) unsafe.getObject(zzqmVar2, j2);
                    haf hafVar19 = f.a;
                    size2 = list18.size() * 8;
                    if (size2 > 0) {
                        c8 = zzpv.c(i15 << 3);
                        c9 = zzpv.c(size2);
                        i4 = c9 + c8;
                        i10 += i4 + size2;
                        break;
                    } else {
                        break;
                    }
                case 47:
                    size2 = f.l((List) unsafe.getObject(zzqmVar2, j2));
                    if (size2 > 0) {
                        c8 = zzpv.c(i15 << 3);
                        c9 = zzpv.c(size2);
                        i4 = c9 + c8;
                        i10 += i4 + size2;
                        break;
                    } else {
                        break;
                    }
                case 48:
                    size2 = f.m((List) unsafe.getObject(zzqmVar2, j2));
                    if (size2 > 0) {
                        c8 = zzpv.c(i15 << 3);
                        c9 = zzpv.c(size2);
                        i4 = c9 + c8;
                        i10 += i4 + size2;
                        break;
                    } else {
                        break;
                    }
                case 49:
                    List list19 = (List) unsafe.getObject(zzqmVar2, j2);
                    g5p n3 = dVar.n(i8);
                    haf hafVar20 = f.a;
                    int size7 = list19.size();
                    if (size7 == 0) {
                        i5 = 0;
                    } else {
                        i5 = 0;
                        for (int i26 = 0; i26 < size7; i26++) {
                            zzrq zzrqVar2 = (zzrq) list19.get(i26);
                            int c14 = zzpv.c(i15 << 3);
                            i5 += ((zzpa) zzrqVar2).c(n3) + c14 + c14;
                        }
                    }
                    i10 += i5;
                    break;
                case 50:
                    int i27 = i8 / 3;
                    zzrk zzrkVar = (zzrk) unsafe.getObject(zzqmVar2, j2);
                    zzrj zzrjVar = (zzrj) dVar.b[i27 + i27];
                    if (!zzrkVar.isEmpty()) {
                        c7 = 0;
                        for (Map.Entry entry2 : zzrkVar.entrySet()) {
                            Object key = entry2.getKey();
                            Object value = entry2.getValue();
                            gvo gvoVar = zzrjVar.a;
                            int c15 = zzpv.c(i15 << 3);
                            int a2 = x2p.a((zzsz) gvoVar.c, 2, value) + x2p.a((zzsz) gvoVar.b, 1, key);
                            c7 += zzpv.c(a2) + a2 + c15;
                        }
                        i10 += c7;
                        break;
                    }
                    c7 = 0;
                    i10 += c7;
                case 51:
                    if (dVar.i(i15, i8, zzqmVar2)) {
                        i10 = ceo.h(i15 << 3, 8, i10);
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (dVar.i(i15, i8, zzqmVar2)) {
                        i10 = ceo.h(i15 << 3, 4, i10);
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (dVar.i(i15, i8, zzqmVar2)) {
                        long m6 = m(zzqmVar2, j2);
                        size2 = zzpv.c(i15 << 3);
                        i4 = zzpv.d(m6);
                        i10 += i4 + size2;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (dVar.i(i15, i8, zzqmVar2)) {
                        long m7 = m(zzqmVar2, j2);
                        size2 = zzpv.c(i15 << 3);
                        i4 = zzpv.d(m7);
                        i10 += i4 + size2;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (dVar.i(i15, i8, zzqmVar2)) {
                        long j8 = j(zzqmVar2, j2);
                        size2 = zzpv.c(i15 << 3);
                        i4 = zzpv.d(j8);
                        i10 += i4 + size2;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (dVar.i(i15, i8, zzqmVar2)) {
                        i10 = ceo.h(i15 << 3, 8, i10);
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (dVar.i(i15, i8, zzqmVar2)) {
                        i10 = ceo.h(i15 << 3, 4, i10);
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (dVar.i(i15, i8, zzqmVar2)) {
                        i10 = ceo.h(i15 << 3, 1, i10);
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (dVar.i(i15, i8, zzqmVar2)) {
                        int i28 = i15 << 3;
                        Object object2 = unsafe.getObject(zzqmVar2, j2);
                        if (object2 instanceof zzpm) {
                            c10 = zzpv.c(i28);
                            m2 = ((zzpm) object2).m();
                            c11 = zzpv.c(m2);
                            i10 += c11 + m2 + c10;
                            break;
                        } else {
                            size2 = zzpv.c(i28);
                            i4 = zzpv.b((String) object2);
                            i10 += i4 + size2;
                            break;
                        }
                    } else {
                        break;
                    }
                case 60:
                    if (dVar.i(i15, i8, zzqmVar2)) {
                        k = f.k(i15, unsafe.getObject(zzqmVar2, j2), dVar.n(i8));
                        i10 += k;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (dVar.i(i15, i8, zzqmVar2)) {
                        zzpm zzpmVar2 = (zzpm) unsafe.getObject(zzqmVar2, j2);
                        c10 = zzpv.c(i15 << 3);
                        m2 = zzpmVar2.m();
                        c11 = zzpv.c(m2);
                        i10 += c11 + m2 + c10;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (dVar.i(i15, i8, zzqmVar2)) {
                        i10 = ceo.h(j(zzqmVar2, j2), zzpv.c(i15 << 3), i10);
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (dVar.i(i15, i8, zzqmVar2)) {
                        long j9 = j(zzqmVar2, j2);
                        size2 = zzpv.c(i15 << 3);
                        i4 = zzpv.d(j9);
                        i10 += i4 + size2;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (dVar.i(i15, i8, zzqmVar2)) {
                        i10 = ceo.h(i15 << 3, 4, i10);
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (dVar.i(i15, i8, zzqmVar2)) {
                        i10 = ceo.h(i15 << 3, 8, i10);
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (dVar.i(i15, i8, zzqmVar2)) {
                        int j10 = j(zzqmVar2, j2);
                        i10 = ceo.h((j10 >> 31) ^ (j10 + j10), zzpv.c(i15 << 3), i10);
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (dVar.i(i15, i8, zzqmVar2)) {
                        long m8 = m(zzqmVar2, j2);
                        size2 = zzpv.c(i15 << 3);
                        i4 = zzpv.d((m8 >> 63) ^ (m8 + m8));
                        i10 += i4 + size2;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (dVar.i(i15, i8, zzqmVar2)) {
                        zzrq zzrqVar3 = (zzrq) unsafe.getObject(zzqmVar2, j2);
                        g5p n4 = dVar.n(i8);
                        haf hafVar21 = f.a;
                        int c16 = zzpv.c(i15 << 3);
                        k = ((zzpa) zzrqVar3).c(n4) + c16 + c16;
                        i10 += k;
                        break;
                    } else {
                        break;
                    }
            }
            i8 += 3;
            i6 = 1048575;
        }
    }

    @Override // defpackage.g5p
    public final boolean g(zzqm zzqmVar, zzqm zzqmVar2) {
        boolean e;
        int i2 = 0;
        while (true) {
            int[] iArr = this.a;
            if (i2 < iArr.length) {
                int l = l(i2);
                long j2 = l & 1048575;
                switch (k(l)) {
                    case 0:
                        if (!s(zzqmVar, zzqmVar2, i2)) {
                            break;
                        } else {
                            sck sckVar = d6p.c;
                            if (Double.doubleToLongBits(sckVar.n(zzqmVar, j2)) != Double.doubleToLongBits(sckVar.n(zzqmVar2, j2))) {
                                break;
                            } else {
                                continue;
                                i2 += 3;
                            }
                        }
                    case 1:
                        if (!s(zzqmVar, zzqmVar2, i2)) {
                            break;
                        } else {
                            sck sckVar2 = d6p.c;
                            if (Float.floatToIntBits(sckVar2.q(zzqmVar, j2)) != Float.floatToIntBits(sckVar2.q(zzqmVar2, j2))) {
                                break;
                            } else {
                                continue;
                                i2 += 3;
                            }
                        }
                    case 2:
                        if (s(zzqmVar, zzqmVar2, i2) && d6p.f(zzqmVar, j2) == d6p.f(zzqmVar2, j2)) {
                            continue;
                            i2 += 3;
                        }
                        break;
                    case 3:
                        if (s(zzqmVar, zzqmVar2, i2) && d6p.f(zzqmVar, j2) == d6p.f(zzqmVar2, j2)) {
                            continue;
                            i2 += 3;
                        }
                        break;
                    case 4:
                        if (s(zzqmVar, zzqmVar2, i2) && d6p.e(zzqmVar, j2) == d6p.e(zzqmVar2, j2)) {
                            continue;
                            i2 += 3;
                        }
                        break;
                    case 5:
                        if (s(zzqmVar, zzqmVar2, i2) && d6p.f(zzqmVar, j2) == d6p.f(zzqmVar2, j2)) {
                            continue;
                            i2 += 3;
                        }
                        break;
                    case 6:
                        if (s(zzqmVar, zzqmVar2, i2) && d6p.e(zzqmVar, j2) == d6p.e(zzqmVar2, j2)) {
                            continue;
                            i2 += 3;
                        }
                        break;
                    case 7:
                        if (!s(zzqmVar, zzqmVar2, i2)) {
                            break;
                        } else {
                            sck sckVar3 = d6p.c;
                            if (sckVar3.H(zzqmVar, j2) != sckVar3.H(zzqmVar2, j2)) {
                                break;
                            } else {
                                continue;
                                i2 += 3;
                            }
                        }
                    case 8:
                        if (s(zzqmVar, zzqmVar2, i2) && f.e(d6p.g(zzqmVar, j2), d6p.g(zzqmVar2, j2))) {
                            continue;
                            i2 += 3;
                        }
                        break;
                    case 9:
                        if (s(zzqmVar, zzqmVar2, i2) && f.e(d6p.g(zzqmVar, j2), d6p.g(zzqmVar2, j2))) {
                            continue;
                            i2 += 3;
                        }
                        break;
                    case 10:
                        if (s(zzqmVar, zzqmVar2, i2) && f.e(d6p.g(zzqmVar, j2), d6p.g(zzqmVar2, j2))) {
                            continue;
                            i2 += 3;
                        }
                        break;
                    case 11:
                        if (s(zzqmVar, zzqmVar2, i2) && d6p.e(zzqmVar, j2) == d6p.e(zzqmVar2, j2)) {
                            continue;
                            i2 += 3;
                        }
                        break;
                    case 12:
                        if (s(zzqmVar, zzqmVar2, i2) && d6p.e(zzqmVar, j2) == d6p.e(zzqmVar2, j2)) {
                            continue;
                            i2 += 3;
                        }
                        break;
                    case 13:
                        if (s(zzqmVar, zzqmVar2, i2) && d6p.e(zzqmVar, j2) == d6p.e(zzqmVar2, j2)) {
                            continue;
                            i2 += 3;
                        }
                        break;
                    case 14:
                        if (s(zzqmVar, zzqmVar2, i2) && d6p.f(zzqmVar, j2) == d6p.f(zzqmVar2, j2)) {
                            continue;
                            i2 += 3;
                        }
                        break;
                    case 15:
                        if (s(zzqmVar, zzqmVar2, i2) && d6p.e(zzqmVar, j2) == d6p.e(zzqmVar2, j2)) {
                            continue;
                            i2 += 3;
                        }
                        break;
                    case 16:
                        if (s(zzqmVar, zzqmVar2, i2) && d6p.f(zzqmVar, j2) == d6p.f(zzqmVar2, j2)) {
                            continue;
                            i2 += 3;
                        }
                        break;
                    case 17:
                        if (s(zzqmVar, zzqmVar2, i2) && f.e(d6p.g(zzqmVar, j2), d6p.g(zzqmVar2, j2))) {
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
                        e = f.e(d6p.g(zzqmVar, j2), d6p.g(zzqmVar2, j2));
                        break;
                    case 50:
                        e = f.e(d6p.g(zzqmVar, j2), d6p.g(zzqmVar2, j2));
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
                        if (d6p.e(zzqmVar, j3) == d6p.e(zzqmVar2, j3) && f.e(d6p.g(zzqmVar, j2), d6p.g(zzqmVar2, j2))) {
                            continue;
                            i2 += 3;
                        }
                        break;
                    default:
                        i2 += 3;
                }
                if (e) {
                    i2 += 3;
                }
            } else if (zzqmVar.zzc.equals(zzqmVar2.zzc)) {
                if (this.d) {
                    return ((zzqk) zzqmVar).zzb.equals(((zzqk) zzqmVar2).zzb);
                }
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.g5p
    public final void h(Object obj, Object obj2) {
        Object obj3;
        if (!a(obj)) {
            a70.p("Mutating immutable message: ".concat(String.valueOf(obj)));
            return;
        }
        obj2.getClass();
        int i2 = 0;
        while (true) {
            int[] iArr = this.a;
            if (i2 >= iArr.length) {
                Object obj4 = obj;
                f.p(obj4, obj2);
                if (!this.d || ((zzqk) obj2).zzb.a.isEmpty()) {
                    return;
                }
                throw null;
            }
            int l = l(i2);
            int i3 = l & 1048575;
            int k = k(l);
            int i4 = iArr[i2];
            long j2 = i3;
            switch (k) {
                case 0:
                    obj3 = obj;
                    if (!t(i2, obj2)) {
                        break;
                    } else {
                        sck sckVar = d6p.c;
                        sckVar.A(obj3, j2, sckVar.n(obj2, j2));
                        r(i2, obj3);
                        continue;
                    }
                case 1:
                    obj3 = obj;
                    if (t(i2, obj2)) {
                        sck sckVar2 = d6p.c;
                        sckVar2.E(obj3, j2, sckVar2.q(obj2, j2));
                        r(i2, obj3);
                        break;
                    } else {
                        continue;
                    }
                case 2:
                    obj3 = obj;
                    if (t(i2, obj2)) {
                        d6p.c.b.putLong(obj3, j2, d6p.f(obj2, j2));
                        r(i2, obj3);
                        break;
                    } else {
                        continue;
                    }
                case 3:
                    obj3 = obj;
                    if (t(i2, obj2)) {
                        d6p.c.b.putLong(obj3, j2, d6p.f(obj2, j2));
                        r(i2, obj3);
                        break;
                    } else {
                        continue;
                    }
                case 4:
                    obj3 = obj;
                    if (t(i2, obj2)) {
                        d6p.i(d6p.e(obj2, j2), j2, obj3);
                        r(i2, obj3);
                        break;
                    } else {
                        continue;
                    }
                case 5:
                    obj3 = obj;
                    if (t(i2, obj2)) {
                        d6p.c.b.putLong(obj3, j2, d6p.f(obj2, j2));
                        r(i2, obj3);
                        break;
                    } else {
                        continue;
                    }
                case 6:
                    obj3 = obj;
                    if (t(i2, obj2)) {
                        d6p.i(d6p.e(obj2, j2), j2, obj3);
                        r(i2, obj3);
                        break;
                    } else {
                        continue;
                    }
                case 7:
                    obj3 = obj;
                    if (t(i2, obj2)) {
                        sck sckVar3 = d6p.c;
                        sckVar3.u(obj3, j2, sckVar3.H(obj2, j2));
                        r(i2, obj3);
                        break;
                    } else {
                        continue;
                    }
                case 8:
                    obj3 = obj;
                    if (t(i2, obj2)) {
                        d6p.j(j2, obj3, d6p.g(obj2, j2));
                        r(i2, obj3);
                        break;
                    } else {
                        continue;
                    }
                case 9:
                    obj3 = obj;
                    p(i2, obj3, obj2);
                    continue;
                case 10:
                    obj3 = obj;
                    if (t(i2, obj2)) {
                        d6p.j(j2, obj3, d6p.g(obj2, j2));
                        r(i2, obj3);
                        break;
                    } else {
                        continue;
                    }
                case 11:
                    obj3 = obj;
                    if (t(i2, obj2)) {
                        d6p.i(d6p.e(obj2, j2), j2, obj3);
                        r(i2, obj3);
                        break;
                    } else {
                        continue;
                    }
                case 12:
                    obj3 = obj;
                    if (t(i2, obj2)) {
                        d6p.i(d6p.e(obj2, j2), j2, obj3);
                        r(i2, obj3);
                        break;
                    } else {
                        continue;
                    }
                case 13:
                    obj3 = obj;
                    if (t(i2, obj2)) {
                        d6p.i(d6p.e(obj2, j2), j2, obj3);
                        r(i2, obj3);
                        break;
                    } else {
                        continue;
                    }
                case 14:
                    obj3 = obj;
                    if (t(i2, obj2)) {
                        d6p.c.b.putLong(obj3, j2, d6p.f(obj2, j2));
                        r(i2, obj3);
                        break;
                    } else {
                        continue;
                    }
                case 15:
                    obj3 = obj;
                    if (t(i2, obj2)) {
                        d6p.i(d6p.e(obj2, j2), j2, obj3);
                        r(i2, obj3);
                        break;
                    } else {
                        continue;
                    }
                case 16:
                    if (t(i2, obj2)) {
                        obj3 = obj;
                        d6p.c.b.putLong(obj3, j2, d6p.f(obj2, j2));
                        r(i2, obj3);
                        break;
                    }
                    break;
                case 17:
                    p(i2, obj, obj2);
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
                    zzqr zzqrVar = (zzqr) d6p.g(obj, j2);
                    zzqr zzqrVar2 = (zzqr) d6p.g(obj2, j2);
                    int size = zzqrVar.size();
                    int size2 = zzqrVar2.size();
                    if (size > 0 && size2 > 0) {
                        if (!zzqrVar.zzc()) {
                            zzqrVar = zzqrVar.i(size2 + size);
                        }
                        zzqrVar.addAll(zzqrVar2);
                    }
                    if (size > 0) {
                        zzqrVar2 = zzqrVar;
                    }
                    d6p.j(j2, obj, zzqrVar2);
                    break;
                case 50:
                    haf hafVar = f.a;
                    zzrk zzrkVar = (zzrk) d6p.g(obj, j2);
                    zzrk zzrkVar2 = (zzrk) d6p.g(obj2, j2);
                    if (!zzrkVar2.isEmpty()) {
                        if (!zzrkVar.a) {
                            zzrkVar = zzrkVar.g();
                        }
                        zzrkVar.i();
                        if (!zzrkVar2.isEmpty()) {
                            zzrkVar.putAll(zzrkVar2);
                        }
                    }
                    d6p.j(j2, obj, zzrkVar);
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
                    if (i(i4, i2, obj2)) {
                        d6p.j(j2, obj, d6p.g(obj2, j2));
                        d6p.i(i4, iArr[i2 + 2] & 1048575, obj);
                        break;
                    }
                    break;
                case 60:
                    q(i2, obj, obj2);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (i(i4, i2, obj2)) {
                        d6p.j(j2, obj, d6p.g(obj2, j2));
                        d6p.i(i4, iArr[i2 + 2] & 1048575, obj);
                        break;
                    }
                    break;
                case 68:
                    q(i2, obj, obj2);
                    break;
            }
            obj3 = obj;
            i2 += 3;
            obj = obj3;
        }
    }

    public final boolean i(int i2, int i3, Object obj) {
        return d6p.e(obj, (long) (this.a[i3 + 2] & 1048575)) == i2;
    }

    public final int l(int i2) {
        return this.a[i2 + 1];
    }

    public final g5p n(int i2) {
        int i3 = i2 / 3;
        int i4 = i3 + i3;
        Object[] objArr = this.b;
        g5p g5pVar = (g5p) objArr[i4];
        if (g5pVar != null) {
            return g5pVar;
        }
        g5p a = w4p.c.a((Class) objArr[i4 + 1]);
        objArr[i4] = a;
        return a;
    }

    public final void p(int i2, Object obj, Object obj2) {
        if (t(i2, obj2)) {
            long l = l(i2) & 1048575;
            Unsafe unsafe = j;
            Object object = unsafe.getObject(obj2, l);
            if (object == null) {
                hbo.h(this.a[i2], obj2);
                return;
            }
            g5p n = n(i2);
            if (!t(i2, obj)) {
                if (a(object)) {
                    Object zzc = n.zzc();
                    n.h(zzc, object);
                    unsafe.putObject(obj, l, zzc);
                } else {
                    unsafe.putObject(obj, l, object);
                }
                r(i2, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, l);
            if (!a(object2)) {
                Object zzc2 = n.zzc();
                n.h(zzc2, object2);
                unsafe.putObject(obj, l, zzc2);
                object2 = zzc2;
            }
            n.h(object2, object);
        }
    }

    public final void q(int i2, Object obj, Object obj2) {
        int[] iArr = this.a;
        int i3 = iArr[i2];
        if (i(i3, i2, obj2)) {
            long l = l(i2) & 1048575;
            Unsafe unsafe = j;
            Object object = unsafe.getObject(obj2, l);
            if (object == null) {
                hbo.h(iArr[i2], obj2);
                return;
            }
            g5p n = n(i2);
            if (!i(i3, i2, obj)) {
                if (a(object)) {
                    Object zzc = n.zzc();
                    n.h(zzc, object);
                    unsafe.putObject(obj, l, zzc);
                } else {
                    unsafe.putObject(obj, l, object);
                }
                d6p.i(i3, iArr[i2 + 2] & 1048575, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, l);
            if (!a(object2)) {
                Object zzc2 = n.zzc();
                n.h(zzc2, object2);
                unsafe.putObject(obj, l, zzc2);
                object2 = zzc2;
            }
            n.h(object2, object);
        }
    }

    public final void r(int i2, Object obj) {
        int i3 = this.a[i2 + 2];
        long j2 = 1048575 & i3;
        if (j2 == 1048575) {
            return;
        }
        d6p.i((1 << (i3 >>> 20)) | d6p.e(obj, j2), j2, obj);
    }

    public final boolean s(zzqm zzqmVar, zzqm zzqmVar2, int i2) {
        return t(i2, zzqmVar) == t(i2, zzqmVar2);
    }

    public final boolean t(int i2, Object obj) {
        int i3 = this.a[i2 + 2];
        long j2 = i3 & 1048575;
        if (j2 != 1048575) {
            return ((1 << (i3 >>> 20)) & d6p.e(obj, j2)) != 0;
        }
        int l = l(i2);
        long j3 = l & 1048575;
        switch (k(l)) {
            case 0:
                if (Double.doubleToRawLongBits(d6p.c.n(obj, j3)) != 0) {
                }
                break;
            case 1:
                if (Float.floatToRawIntBits(d6p.c.q(obj, j3)) != 0) {
                }
                break;
            case 2:
                if (d6p.f(obj, j3) != 0) {
                }
                break;
            case 3:
                if (d6p.f(obj, j3) != 0) {
                }
                break;
            case 4:
                if (d6p.e(obj, j3) != 0) {
                }
                break;
            case 5:
                if (d6p.f(obj, j3) != 0) {
                }
                break;
            case 6:
                if (d6p.e(obj, j3) != 0) {
                }
                break;
            case 7:
                break;
            case 8:
                Object g = d6p.g(obj, j3);
                if (!(g instanceof String)) {
                    if (!(g instanceof zzpm)) {
                        ilg.c();
                        break;
                    } else if (!zzpm.b.equals(g)) {
                    }
                } else if (!((String) g).isEmpty()) {
                }
                break;
            case 9:
                if (d6p.g(obj, j3) != null) {
                }
                break;
            case 10:
                if (!zzpm.b.equals(d6p.g(obj, j3))) {
                }
                break;
            case 11:
                if (d6p.e(obj, j3) != 0) {
                }
                break;
            case 12:
                if (d6p.e(obj, j3) != 0) {
                }
                break;
            case 13:
                if (d6p.e(obj, j3) != 0) {
                }
                break;
            case 14:
                if (d6p.f(obj, j3) != 0) {
                }
                break;
            case 15:
                if (d6p.e(obj, j3) != 0) {
                }
                break;
            case 16:
                if (d6p.f(obj, j3) != 0) {
                }
                break;
            case 17:
                if (d6p.g(obj, j3) != null) {
                }
                break;
            default:
                ilg.c();
                break;
        }
        return false;
    }

    public final boolean u(int i2, int i3, int i4, int i5, Object obj) {
        return i3 == 1048575 ? t(i2, obj) : (i4 & i5) != 0;
    }

    @Override // defpackage.g5p
    public final Object zzc() {
        return (zzqm) ((zzqm) this.c).f(4);
    }
}

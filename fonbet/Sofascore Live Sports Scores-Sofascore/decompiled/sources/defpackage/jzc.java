package defpackage;

import java.io.EOFException;
import java.util.ArrayList;
import java.util.Set;
import kotlin.text.Charsets;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class jzc {
    public static final fc2 a = new fc2(yfa.N("\r\n", Charsets.UTF_8), 0);
    public static final fc2 b = new fc2(new byte[]{45, 45});

    public static final void a(dsf dsfVar, byte[] bArr, byte b2) {
        int i = dsfVar.a;
        if (i >= bArr.length) {
            is8.e("Failed to parse multipart: boundary shouldn't be longer than 70 characters");
        } else {
            dsfVar.a = i + 1;
            bArr[i] = b2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0198, code lost:
    
        if (r0 == r7) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x017f, code lost:
    
        if (r2 == r7) goto L74;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /* JADX WARN: Type inference failed for: r2v11, types: [va2, yu3] */
    /* JADX WARN: Type inference failed for: r3v10, types: [hc2] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(fc2 fc2Var, yu3 yu3Var, va2 va2Var, aj9 aj9Var, long j, sq3 sq3Var) {
        gzc gzcVar;
        int i;
        Throwable th;
        long j2;
        Long l;
        yu3 yu3Var2;
        fc2 fc2Var2;
        Object B;
        hc2 hc2Var;
        long j3;
        hc2 hc2Var2;
        long longValue;
        Throwable th2;
        va2 va2Var2;
        long longValue2;
        long j4;
        va2 va2Var3;
        Throwable th3;
        va2 va2Var4 = va2Var;
        if (sq3Var instanceof gzc) {
            gzcVar = (gzc) sq3Var;
            int i2 = gzcVar.w;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gzcVar.w = i2 - Integer.MIN_VALUE;
                gzc gzcVar2 = gzcVar;
                Object obj = gzcVar2.v;
                lu3 lu3Var = lu3.a;
                i = gzcVar2.w;
                Throwable th4 = null;
                if (i != 0) {
                    y6a.M(obj);
                    mo2 a2 = aj9Var.a("Content-Length");
                    if (a2 != null) {
                        int i3 = up2.a;
                        int length = a2.length();
                        if (length > 19) {
                            throw new NumberFormatException("Invalid number " + ((Object) a2) + ": too large for Long type");
                        }
                        if (length == 19) {
                            int length2 = a2.length();
                            int i4 = 0;
                            j3 = 0;
                            while (i4 < length2) {
                                Throwable th5 = th4;
                                long charAt = a2.charAt(i4) - 48;
                                if (charAt < 0 || charAt > 9) {
                                    up2.b(a2, i4);
                                    throw th5;
                                }
                                j3 = (j3 << 3) + (j3 << 1) + charAt;
                                if (j3 < 0) {
                                    throw new NumberFormatException("Invalid number " + ((Object) a2) + ": too large for Long type");
                                }
                                i4++;
                                th4 = th5;
                            }
                            th = th4;
                            j2 = 0;
                        } else {
                            th = null;
                            j2 = 0;
                            j3 = 0;
                            for (int i5 = 0; i5 < length; i5++) {
                                long charAt2 = a2.charAt(i5) - 48;
                                if (charAt2 < 0 || charAt2 > 9) {
                                    up2.b(a2, i5);
                                    throw null;
                                }
                                j3 = (j3 << 3) + (j3 << 1) + charAt2;
                            }
                        }
                        l = new Long(j3);
                    } else {
                        th = null;
                        j2 = 0;
                        l = null;
                    }
                    if (l == null) {
                        gzcVar2.r = va2Var4;
                        gzcVar2.w = 1;
                        obj = new za2(yu3Var, fc2Var, va2Var4, j).d(true, gzcVar2);
                        if (obj != lu3Var) {
                            hc2Var = va2Var4;
                            hc2Var2 = hc2Var;
                            longValue = ((Number) obj).longValue();
                            th2 = th;
                            gzcVar2.r = th2;
                            gzcVar2.u = longValue;
                            gzcVar2.w = 4;
                            if (hc2Var2.c(gzcVar2) != lu3Var) {
                            }
                        }
                    } else {
                        yu3Var2 = yu3Var;
                        long j5 = j2;
                        hkb hkbVar = new hkb(j5, j);
                        long longValue3 = l.longValue();
                        if (j5 > longValue3 || longValue3 > hkbVar.b) {
                            is8.e(lnb.l(j, "; limit is defined using 'formFieldLimit' argument", ljg.o("Multipart content length exceeds limit ", l.longValue(), " > ")));
                            return null;
                        }
                        long longValue4 = l.longValue();
                        fc2Var2 = fc2Var;
                        gzcVar2.r = fc2Var2;
                        gzcVar2.s = yu3Var2;
                        gzcVar2.t = va2Var4;
                        gzcVar2.w = 2;
                        B = l6g.B(yu3Var2, va2Var4, longValue4, gzcVar2);
                        va2Var2 = va2Var4;
                    }
                    return lu3Var;
                }
                if (i == 1) {
                    hc2Var = (hc2) gzcVar2.r;
                    y6a.M(obj);
                    th = null;
                    hc2Var2 = hc2Var;
                    longValue = ((Number) obj).longValue();
                    th2 = th;
                    gzcVar2.r = th2;
                    gzcVar2.u = longValue;
                    gzcVar2.w = 4;
                    if (hc2Var2.c(gzcVar2) != lu3Var) {
                    }
                    return lu3Var;
                }
                if (i == 2) {
                    va2 va2Var5 = gzcVar2.t;
                    yu3 yu3Var3 = gzcVar2.s;
                    fc2 fc2Var3 = (fc2) gzcVar2.r;
                    y6a.M(obj);
                    B = obj;
                    fc2Var2 = fc2Var3;
                    va2Var2 = va2Var5;
                    yu3Var2 = yu3Var3;
                    th = null;
                    longValue2 = ((Number) B).longValue();
                    gzcVar2.r = va2Var2;
                    ?? r2 = th;
                    gzcVar2.s = r2;
                    gzcVar2.t = r2;
                    gzcVar2.u = longValue2;
                    gzcVar2.w = 3;
                    obj = d(yu3Var2, fc2Var2, gzcVar2);
                    th3 = r2;
                    va2Var3 = va2Var2;
                } else {
                    if (i == 3) {
                        long j6 = gzcVar2.u;
                        ?? r3 = (hc2) gzcVar2.r;
                        y6a.M(obj);
                        th3 = null;
                        longValue2 = j6;
                        va2Var3 = r3;
                        longValue = ((Number) obj).longValue() + longValue2;
                        th2 = th3;
                        hc2Var2 = va2Var3;
                        gzcVar2.r = th2;
                        gzcVar2.u = longValue;
                        gzcVar2.w = 4;
                        if (hc2Var2.c(gzcVar2) != lu3Var) {
                            j4 = longValue;
                        }
                        return lu3Var;
                    }
                    if (i != 4) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j4 = gzcVar2.u;
                    y6a.M(obj);
                }
                return new Long(j4);
            }
        }
        gzcVar = new gzc(sq3Var);
        gzc gzcVar22 = gzcVar;
        Object obj2 = gzcVar22.v;
        lu3 lu3Var2 = lu3.a;
        i = gzcVar22.w;
        Throwable th42 = null;
        if (i != 0) {
        }
        return new Long(j4);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005b A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:11:0x0027, B:12:0x0056, B:16:0x005b, B:17:0x0062), top: B:10:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(yu3 yu3Var, sq3 sq3Var) {
        hzc hzcVar;
        int i;
        Throwable th;
        oo2 oo2Var;
        ArrayList arrayList;
        aj9 aj9Var;
        if (sq3Var instanceof hzc) {
            hzcVar = (hzc) sq3Var;
            int i2 = hzcVar.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hzcVar.t = i2 - Integer.MIN_VALUE;
                Object obj = hzcVar.s;
                lu3 lu3Var = lu3.a;
                i = hzcVar.t;
                if (i != 0) {
                    y6a.M(obj);
                    oo2 oo2Var2 = new oo2();
                    try {
                        hzcVar.r = oo2Var2;
                        hzcVar.t = 1;
                        Set set = lj9.a;
                        uif uifVar = new uif((byte) 0, 8);
                        uifVar.b = 0;
                        uifVar.c = 0;
                        Object c = lj9.c(yu3Var, oo2Var2, uifVar, hzcVar);
                        if (c == lu3Var) {
                            return lu3Var;
                        }
                        obj = c;
                        oo2Var = oo2Var2;
                    } catch (Throwable th2) {
                        th = th2;
                        oo2Var = oo2Var2;
                        akd akdVar = oo2Var.a;
                        arrayList = oo2Var.b;
                        if (arrayList == null) {
                            oo2Var.c = null;
                            int size = arrayList.size();
                            for (int i3 = 0; i3 < size; i3++) {
                                akdVar.O0(arrayList.get(i3));
                            }
                        } else {
                            char[] cArr = oo2Var.c;
                            if (cArr != null) {
                                akdVar.O0(cArr);
                            }
                            oo2Var.c = null;
                        }
                        oo2Var.e = true;
                        oo2Var.b = null;
                        oo2Var.d = null;
                        oo2Var.g = 0;
                        oo2Var.f = 0;
                        throw th;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    oo2Var = hzcVar.r;
                    try {
                        y6a.M(obj);
                    } catch (Throwable th3) {
                        th = th3;
                        akd akdVar2 = oo2Var.a;
                        arrayList = oo2Var.b;
                        if (arrayList == null) {
                        }
                        oo2Var.e = true;
                        oo2Var.b = null;
                        oo2Var.d = null;
                        oo2Var.g = 0;
                        oo2Var.f = 0;
                        throw th;
                    }
                }
                aj9Var = (aj9) obj;
                if (aj9Var == null) {
                    return aj9Var;
                }
                throw new EOFException("Failed to parse multipart headers: unexpected end of stream");
            }
        }
        hzcVar = new hzc(sq3Var);
        Object obj2 = hzcVar.s;
        lu3 lu3Var2 = lu3.a;
        i = hzcVar.t;
        if (i != 0) {
        }
        aj9Var = (aj9) obj2;
        if (aj9Var == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(db2 db2Var, fc2 fc2Var, sq3 sq3Var) {
        izc izcVar;
        int i;
        if (sq3Var instanceof izc) {
            izcVar = (izc) sq3Var;
            int i2 = izcVar.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                izcVar.t = i2 - Integer.MIN_VALUE;
                Object obj = izcVar.s;
                lu3 lu3Var = lu3.a;
                i = izcVar.t;
                if (i != 0) {
                    y6a.M(obj);
                    izcVar.r = fc2Var;
                    izcVar.t = 1;
                    obj = l6g.U(db2Var, fc2Var, izcVar);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fc2Var = izcVar.r;
                    y6a.M(obj);
                }
                return new Long(!((Boolean) obj).booleanValue() ? fc2Var.a.length : 0L);
            }
        }
        izcVar = new izc(sq3Var);
        Object obj2 = izcVar.s;
        lu3 lu3Var2 = lu3.a;
        i = izcVar.t;
        if (i != 0) {
        }
        return new Long(!((Boolean) obj2).booleanValue() ? fc2Var.a.length : 0L);
    }
}

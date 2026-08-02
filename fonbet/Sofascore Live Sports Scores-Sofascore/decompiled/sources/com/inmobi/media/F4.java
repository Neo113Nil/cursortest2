package com.inmobi.media;

import com.ironsource.C4094gc;
import com.mbridge.msdk.foundation.download.Command;
import defpackage.a70;
import defpackage.d2g;
import defpackage.duf;
import defpackage.gc2;
import defpackage.hg6;
import defpackage.i2g;
import defpackage.il9;
import defpackage.iod;
import defpackage.jl9;
import defpackage.jod;
import defpackage.l62;
import defpackage.lu3;
import defpackage.pzf;
import defpackage.q7a;
import defpackage.qff;
import defpackage.qij;
import defpackage.qzf;
import defpackage.sq3;
import defpackage.w45;
import defpackage.wba;
import defpackage.y6a;
import defpackage.yzf;
import defpackage.zdc;
import defpackage.zzl;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class F4 {
    public final q7a[] a;
    public final jod b;
    public final long c;

    public F4(q7a[] q7aVarArr, q7a[] q7aVarArr2, w45 w45Var, Ok ok) {
        w45Var.getClass();
        ok.getClass();
        this.a = q7aVarArr2;
        this.c = ok.c;
        iod iodVar = new iod();
        if (q7aVarArr != null) {
            for (q7a q7aVar : q7aVarArr) {
                iodVar.a(q7aVar);
            }
        }
        q7a[] q7aVarArr3 = this.a;
        if (q7aVarArr3 != null) {
            for (q7a q7aVar2 : q7aVarArr3) {
                iodVar.b(q7aVar2);
            }
        }
        iodVar.c.add(new Ui());
        iodVar.d.add(new C3546kc());
        qff qffVar = qff.HTTP_2;
        qff qffVar2 = qff.HTTP_1_1;
        ArrayList arrayList = new ArrayList(kotlin.collections.b.l(qffVar, qffVar2));
        qff qffVar3 = qff.H2_PRIOR_KNOWLEDGE;
        if (!arrayList.contains(qffVar3) && !arrayList.contains(qffVar2)) {
            hg6.e(arrayList, "protocols must contain h2_prior_knowledge or http/1.1: ");
            throw null;
        }
        if (arrayList.contains(qffVar3) && arrayList.size() > 1) {
            hg6.e(arrayList, "protocols containing h2_prior_knowledge cannot use other protocols: ");
            throw null;
        }
        if (arrayList.contains(qff.HTTP_1_0)) {
            hg6.e(arrayList, "protocols must not contain http/1.0: ");
            throw null;
        }
        if (arrayList.contains(null)) {
            a70.p("protocols must not contain null");
            throw null;
        }
        arrayList.remove(qff.SPDY_3);
        if (!arrayList.equals(iodVar.t)) {
            iodVar.E = null;
        }
        List unmodifiableList = Collections.unmodifiableList(arrayList);
        unmodifiableList.getClass();
        iodVar.t = unmodifiableList;
        iodVar.f = false;
        iodVar.a = w45Var;
        long j = ok.a;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        iodVar.c(j, timeUnit);
        iodVar.d(ok.b, timeUnit);
        this.b = new jod(iodVar);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(15:(2:3|(17:5|6|7|(1:(2:10|11)(2:96|97))(3:98|99|(1:101))|12|14|15|(1:41)|21|(1:23)(1:40)|(1:27)|28|(1:30)|31|(1:39)(1:35)|36|37))|14|15|(1:17)|41|21|(0)(0)|(2:25|27)|28|(0)|31|(1:33)|39|36|37)|118|6|7|(0)(0)|12|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x002a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x002b, code lost:
    
        r11 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x003e, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x003f, code lost:
    
        r11 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x003a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x003b, code lost:
    
        r11 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0032, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0033, code lost:
    
        r11 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0036, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0037, code lost:
    
        r11 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0046, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0047, code lost:
    
        r11 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0042, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0043, code lost:
    
        r11 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x002e, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x002f, code lost:
    
        r11 = r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008b A[Catch: all -> 0x00e5, Exception -> 0x00e8, IOException -> 0x00eb, NoSuchElementException -> 0x00ee, SocketTimeoutException -> 0x00f1, MalformedURLException -> 0x00f4, CancellationException -> 0x00f7, qij -> 0x00fa, TryCatch #4 {MalformedURLException -> 0x00f4, SocketTimeoutException -> 0x00f1, IOException -> 0x00eb, NoSuchElementException -> 0x00ee, qij -> 0x00fa, CancellationException -> 0x00f7, Exception -> 0x00e8, all -> 0x00e5, blocks: (B:15:0x006d, B:17:0x0073, B:19:0x0079, B:21:0x0081, B:23:0x008b, B:25:0x0093, B:27:0x0099, B:28:0x009b, B:31:0x00a9, B:35:0x00b7, B:39:0x00dc, B:41:0x007f), top: B:14:0x006d }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(jod jodVar, qzf qzfVar, String str, sq3 sq3Var) {
        D4 d4;
        int i;
        d2g d2gVar;
        d2g d2gVar2;
        d2g d2gVar3;
        d2g d2gVar4;
        d2g d2gVar5;
        d2g d2gVar6;
        d2g d2gVar7;
        d2g d2gVar8;
        int i2;
        i2g i2gVar;
        String str2;
        long j;
        int i3;
        Object c3343cf;
        zdc contentType;
        l62 source;
        try {
            if (sq3Var instanceof D4) {
                d4 = (D4) sq3Var;
                int i4 = d4.d;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    d4.d = i4 - Integer.MIN_VALUE;
                    Object obj = d4.b;
                    lu3 lu3Var = lu3.a;
                    i = d4.d;
                    d2gVar = null;
                    str2 = null;
                    str2 = null;
                    d2gVar2 = null;
                    d2gVar7 = null;
                    d2gVar6 = null;
                    d2gVar5 = null;
                    d2gVar4 = null;
                    d2gVar3 = null;
                    if (i != 0) {
                        y6a.M(obj);
                        long millis = TimeUnit.SECONDS.toMillis(this.c);
                        E4 e4 = new E4(jodVar, qzfVar, null);
                        d4.a = str;
                        d4.d = 1;
                        obj = wba.U(millis, e4, d4);
                        if (obj == lu3Var) {
                            return lu3Var;
                        }
                    } else {
                        if (i != 1) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        str = d4.a;
                        y6a.M(obj);
                    }
                    d2gVar8 = (d2g) obj;
                    i2 = d2gVar8.d;
                    i2gVar = d2gVar8.g;
                    if (i2gVar != null || (source = i2gVar.source()) == null || (r13 = source.G0()) == null) {
                        gc2 gc2Var = gc2.d;
                    }
                    TreeMap c = d2gVar8.f.c();
                    long contentLength = i2gVar == null ? i2gVar.contentLength() : 0L;
                    if (i2gVar != null && (contentType = i2gVar.contentType()) != null) {
                        str2 = contentType.a;
                    }
                    String str3 = str2;
                    j = d2gVar8.m - d2gVar8.l;
                    if (j < 0) {
                        j = 0;
                    }
                    We we = new We(j, c, (int) contentLength, str3);
                    i3 = d2gVar8.d;
                    if (400 <= i3 || i3 >= 600) {
                        c3343cf = new C3343cf(str, i2, gc2Var, we);
                    } else {
                        EnumC3489i6.b.getClass();
                        c3343cf = new C3514j6(str, C3437g6.a(i2));
                    }
                    d2gVar8.close();
                    return c3343cf;
                }
            }
            i2 = d2gVar8.d;
            i2gVar = d2gVar8.g;
            if (i2gVar != null) {
            }
            gc2 gc2Var2 = gc2.d;
            TreeMap c2 = d2gVar8.f.c();
            if (i2gVar == null) {
            }
            if (i2gVar != null) {
                str2 = contentType.a;
            }
            String str32 = str2;
            j = d2gVar8.m - d2gVar8.l;
            if (j < 0) {
            }
            We we2 = new We(j, c2, (int) contentLength, str32);
            i3 = d2gVar8.d;
            if (400 <= i3) {
            }
            c3343cf = new C3343cf(str, i2, gc2Var2, we2);
            d2gVar8.close();
            return c3343cf;
        } catch (MalformedURLException e) {
            MalformedURLException malformedURLException = e;
            d2gVar7 = d2gVar8;
            Arrays.toString(malformedURLException.getStackTrace()).getClass();
            C3514j6 c3514j6 = new C3514j6(str, EnumC3489i6.p);
            if (d2gVar7 != null) {
                d2gVar7.close();
            }
            return c3514j6;
        } catch (SocketTimeoutException e2) {
            SocketTimeoutException socketTimeoutException = e2;
            d2gVar6 = d2gVar8;
            Arrays.toString(socketTimeoutException.getStackTrace()).getClass();
            C3514j6 c3514j62 = new C3514j6(str, EnumC3489i6.t);
            if (d2gVar6 != null) {
                d2gVar6.close();
            }
            return c3514j62;
        } catch (IOException e3) {
            IOException iOException = e3;
            d2gVar5 = d2gVar8;
            Arrays.toString(iOException.getStackTrace()).getClass();
            C3514j6 c3514j63 = new C3514j6(str, EnumC3489i6.e);
            if (d2gVar5 != null) {
                d2gVar5.close();
            }
            return c3514j63;
        } catch (NoSuchElementException e5) {
            NoSuchElementException noSuchElementException = e5;
            d2gVar4 = d2gVar8;
            Arrays.toString(noSuchElementException.getStackTrace()).getClass();
            C3514j6 c3514j64 = new C3514j6(str, EnumC3489i6.q);
            if (d2gVar4 != null) {
                d2gVar4.close();
            }
            return c3514j64;
        } catch (qij e6) {
            qij qijVar = e6;
            d2gVar3 = d2gVar8;
            Arrays.toString(qijVar.getStackTrace()).getClass();
            C3514j6 c3514j65 = new C3514j6(str, EnumC3489i6.r);
            if (d2gVar3 != null) {
                d2gVar3.close();
            }
            return c3514j65;
        } catch (CancellationException e7) {
            CancellationException cancellationException = e7;
            Arrays.toString(cancellationException.getStackTrace()).getClass();
            throw cancellationException;
        } catch (Exception e8) {
            Exception exc = e8;
            d2gVar = d2gVar8;
            Arrays.toString(exc.getStackTrace()).getClass();
            C3514j6 c3514j66 = new C3514j6(str, EnumC3489i6.d);
            if (d2gVar != null) {
                d2gVar.close();
            }
            return c3514j66;
        } catch (Throwable th) {
            Throwable th2 = th;
            d2gVar2 = d2gVar8;
            if (d2gVar2 == null) {
                throw th2;
            }
            d2gVar2.close();
            throw th2;
        }
        d4 = new D4(this, sq3Var);
        Object obj2 = d4.b;
        lu3 lu3Var2 = lu3.a;
        i = d4.d;
        d2gVar = null;
        str2 = null;
        str2 = null;
        d2gVar2 = null;
        d2gVar7 = null;
        d2gVar6 = null;
        d2gVar5 = null;
        d2gVar4 = null;
        d2gVar3 = null;
        if (i != 0) {
        }
        d2gVar8 = (d2g) obj2;
    }

    public static Pair a(AbstractC3291af abstractC3291af) {
        jl9 jl9Var;
        yzf c4;
        Set keySet;
        String c = abstractC3291af.c();
        c.getClass();
        try {
            il9 il9Var = new il9(0);
            il9Var.h(null, c);
            jl9Var = il9Var.c();
        } catch (IllegalArgumentException unused) {
            jl9Var = null;
        }
        if (jl9Var == null) {
            abstractC3291af.c();
            return new Pair(null, new C3514j6(abstractC3291af.c(), EnumC3489i6.s));
        }
        pzf pzfVar = new pzf();
        pzfVar.a = jl9Var;
        Map a = abstractC3291af.a();
        if (a != null) {
            for (Map.Entry entry : a.entrySet()) {
                pzfVar.a((String) entry.getKey(), (String) entry.getValue());
            }
        }
        Map a2 = abstractC3291af.a();
        if (a2 != null && (keySet = a2.keySet()) != null && !keySet.isEmpty()) {
            Iterator it = keySet.iterator();
            while (it.hasNext()) {
                if (Intrinsics.c((String) it.next(), Command.HTTP_HEADER_USER_AGENT)) {
                    break;
                }
            }
        }
        pzfVar.a(Command.HTTP_HEADER_USER_AGENT, AbstractC3424fj.c());
        Vi b = abstractC3291af.b();
        if (b != null) {
            KClass orCreateKotlinClass = duf.a.getOrCreateKotlinClass(Object.class);
            orCreateKotlinClass.getClass();
            pzfVar.e = pzfVar.e.H(orCreateKotlinClass, b);
        }
        if (abstractC3291af instanceof Xe) {
            pzfVar.e(C4094gc.a, null);
        } else if (abstractC3291af instanceof Ze) {
            try {
                Pi pi = ((Ze) abstractC3291af).d;
                if (pi == null) {
                    c4 = yzf.create((zdc) null, new byte[0]);
                    c4.getClass();
                } else {
                    c4 = new C4(pi);
                }
                pzfVar.e(C4094gc.b, c4);
            } catch (FileNotFoundException e) {
                e.getStackTrace();
                return new Pair(new qzf(pzfVar), new C3514j6(((Ze) abstractC3291af).a, EnumC3489i6.m));
            } catch (IOException e2) {
                e2.getStackTrace();
                return new Pair(new qzf(pzfVar), new C3514j6(((Ze) abstractC3291af).a, EnumC3489i6.e));
            } catch (Exception e3) {
                e3.getStackTrace();
                return new Pair(new qzf(pzfVar), new C3514j6(((Ze) abstractC3291af).a, EnumC3489i6.d));
            }
        } else if (abstractC3291af instanceof Ye) {
            pzfVar.e("HEAD", null);
        } else {
            zzl.b();
            return null;
        }
        return new Pair(new qzf(pzfVar), null);
    }

    public final Object a(AbstractC3291af abstractC3291af, sq3 sq3Var) {
        jod jodVar = this.b;
        Pair a = a(abstractC3291af);
        qzf qzfVar = (qzf) a.a;
        C3514j6 c3514j6 = (C3514j6) a.b;
        if (c3514j6 != null || qzfVar == null) {
            return c3514j6 != null ? c3514j6 : new C3514j6(abstractC3291af.c(), EnumC3489i6.d);
        }
        return a(jodVar, qzfVar, abstractC3291af.c(), sq3Var);
    }
}

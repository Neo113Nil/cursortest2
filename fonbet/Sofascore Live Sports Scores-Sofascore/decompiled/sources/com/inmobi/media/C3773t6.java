package com.inmobi.media;

import android.content.Context;
import defpackage.a70;
import defpackage.dmi;
import defpackage.joa;
import defpackage.ku3;
import defpackage.lu3;
import defpackage.sq3;
import defpackage.y6a;
import defpackage.yda;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.t6, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3773t6 {
    public final String a;
    public final AbstractC3566l6 b;
    public final Zf c;
    public final C3839vk d;
    public final String e;
    public final AtomicBoolean f;
    public final AtomicBoolean g;
    public final ku3 h;
    public C3540k6 i;
    public yda j;

    public C3773t6(String str, AbstractC3566l6 abstractC3566l6, Zf zf, C3540k6 c3540k6, C3839vk c3839vk) {
        str.getClass();
        abstractC3566l6.getClass();
        zf.getClass();
        c3540k6.getClass();
        this.a = str;
        this.b = abstractC3566l6;
        this.c = zf;
        this.d = c3839vk;
        this.e = "t6";
        this.f = new AtomicBoolean(false);
        this.g = new AtomicBoolean(false);
        this.h = L9.c;
        this.i = c3540k6;
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x00cb, code lost:
    
        if (r2.a(r11, r5) == r6) goto L66;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(C3773t6 c3773t6, boolean z, sq3 sq3Var) {
        C3618n6 c3618n6;
        Object obj;
        int i;
        C3540k6 c3540k6;
        boolean z2;
        Object a;
        C3540k6 c3540k62;
        boolean z3;
        Zk zk;
        int i2;
        long j;
        Object a2;
        int i3;
        boolean z4;
        boolean z5;
        int i4;
        boolean z6;
        Zk zk2;
        long j2;
        C3592m6 c3592m6;
        c3773t6.getClass();
        if (sq3Var instanceof C3618n6) {
            c3618n6 = (C3618n6) sq3Var;
            int i5 = c3618n6.j;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                c3618n6.j = i5 - Integer.MIN_VALUE;
                C3618n6 c3618n62 = c3618n6;
                Object obj2 = c3618n62.h;
                obj = lu3.a;
                i = c3618n62.j;
                Zk zk3 = null;
                if (i != 0) {
                    y6a.M(obj2);
                    c3540k6 = c3773t6.i;
                    if (c3773t6.g.get() || c3773t6.f.get() || c3540k6 == null) {
                        return Unit.a;
                    }
                    c3773t6.e.getClass();
                    long currentTimeMillis = System.currentTimeMillis() - (c3540k6.b * 1000);
                    AbstractC3566l6 abstractC3566l6 = c3773t6.b;
                    c3618n62.a = null;
                    c3618n62.b = c3540k6;
                    z2 = z;
                    c3618n62.c = z2;
                    c3618n62.j = 1;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            boolean z7 = c3618n62.c;
                            C3540k6 c3540k63 = c3618n62.b;
                            zk3 = c3618n62.a;
                            y6a.M(obj2);
                            c3540k62 = c3540k63;
                            z3 = z7;
                            zk = zk3;
                            int intValue = ((Number) obj2).intValue();
                            F5.a.getClass();
                            int n = F5.n();
                            C3540k6 c3540k64 = c3773t6.i;
                            i2 = c3540k64 != null ? 0 : n != 0 ? n != 1 ? c3540k64.g : c3540k64.e : c3540k64.g;
                            j = c3540k64 != null ? 0L : n != 0 ? n != 1 ? c3540k64.j : c3540k64.i : c3540k64.j;
                            long j3 = c3540k62.d;
                            c3618n62.a = zk;
                            c3618n62.b = c3540k62;
                            c3618n62.c = z3;
                            c3618n62.e = intValue;
                            c3618n62.f = i2;
                            c3618n62.g = j;
                            c3618n62.j = 3;
                            a2 = c3773t6.a(j3, c3618n62);
                            if (a2 != obj) {
                                i3 = intValue;
                                obj2 = a2;
                                boolean booleanValue = ((Boolean) obj2).booleanValue();
                                long j4 = c3540k62.c;
                                long j5 = c3540k62.d;
                                c3618n62.a = zk;
                                c3618n62.b = c3540k62;
                                c3618n62.c = z3;
                                c3618n62.e = i3;
                                c3618n62.f = i2;
                                c3618n62.g = j;
                                c3618n62.d = booleanValue;
                                c3618n62.j = 4;
                                obj2 = c3773t6.a(j4, j5, c3618n62);
                                if (obj2 != obj) {
                                }
                            }
                            return obj;
                        }
                        if (i == 3) {
                            long j6 = c3618n62.g;
                            int i6 = c3618n62.f;
                            int i7 = c3618n62.e;
                            z3 = c3618n62.c;
                            c3540k62 = c3618n62.b;
                            zk = c3618n62.a;
                            y6a.M(obj2);
                            j = j6;
                            i2 = i6;
                            i3 = i7;
                            boolean booleanValue2 = ((Boolean) obj2).booleanValue();
                            long j42 = c3540k62.c;
                            long j52 = c3540k62.d;
                            c3618n62.a = zk;
                            c3618n62.b = c3540k62;
                            c3618n62.c = z3;
                            c3618n62.e = i3;
                            c3618n62.f = i2;
                            c3618n62.g = j;
                            c3618n62.d = booleanValue2;
                            c3618n62.j = 4;
                            obj2 = c3773t6.a(j42, j52, c3618n62);
                            if (obj2 != obj) {
                                z4 = z3;
                                z5 = booleanValue2;
                                i4 = i2;
                                boolean booleanValue3 = ((Boolean) obj2).booleanValue();
                                if (i4 > i3) {
                                }
                                Zf zf = c3773t6.c;
                                c3618n62.a = zk;
                                c3618n62.b = c3540k62;
                                c3618n62.c = z4;
                                c3618n62.g = j;
                                c3618n62.j = 5;
                                obj2 = zf.a(c3618n62);
                                if (obj2 != obj) {
                                }
                            }
                            return obj;
                        }
                        if (i != 4) {
                            if (i != 5) {
                                a70.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            long j7 = c3618n62.g;
                            boolean z8 = c3618n62.c;
                            C3540k6 c3540k65 = c3618n62.b;
                            Zk zk4 = c3618n62.a;
                            y6a.M(obj2);
                            z6 = z8;
                            c3540k62 = c3540k65;
                            zk2 = zk4;
                            j2 = j7;
                            c3592m6 = (C3592m6) obj2;
                            if (c3592m6 != null) {
                                c3773t6.f.set(true);
                                joa joaVar = AbstractC3825v6.a;
                                String str = c3540k62.k;
                                int i8 = c3540k62.a + 1;
                                AbstractC3825v6.a(c3592m6, str, i8, i8, j2, zk2, c3773t6, z6);
                            }
                            return Unit.a;
                        }
                        z5 = c3618n62.d;
                        long j8 = c3618n62.g;
                        i4 = c3618n62.f;
                        i3 = c3618n62.e;
                        boolean z9 = c3618n62.c;
                        c3540k62 = c3618n62.b;
                        zk = c3618n62.a;
                        y6a.M(obj2);
                        j = j8;
                        z4 = z9;
                        boolean booleanValue32 = ((Boolean) obj2).booleanValue();
                        if (i4 > i3 || z5 || booleanValue32) {
                            Zf zf2 = c3773t6.c;
                            c3618n62.a = zk;
                            c3618n62.b = c3540k62;
                            c3618n62.c = z4;
                            c3618n62.g = j;
                            c3618n62.j = 5;
                            obj2 = zf2.a(c3618n62);
                            if (obj2 != obj) {
                                z6 = z4;
                                zk2 = zk;
                                j2 = j;
                                c3592m6 = (C3592m6) obj2;
                                if (c3592m6 != null) {
                                }
                            }
                            return obj;
                        }
                        return Unit.a;
                    }
                    boolean z10 = c3618n62.c;
                    C3540k6 c3540k66 = c3618n62.b;
                    Zk zk5 = c3618n62.a;
                    y6a.M(obj2);
                    z2 = z10;
                    c3540k6 = c3540k66;
                    zk3 = zk5;
                }
                AbstractC3566l6 abstractC3566l62 = c3773t6.b;
                c3618n62.a = zk3;
                c3618n62.b = c3540k6;
                c3618n62.c = z2;
                c3618n62.j = 2;
                a = abstractC3566l62.a(c3618n62);
                if (a != obj) {
                    c3540k62 = c3540k6;
                    obj2 = a;
                    z3 = z2;
                    zk = zk3;
                    int intValue2 = ((Number) obj2).intValue();
                    F5.a.getClass();
                    int n2 = F5.n();
                    C3540k6 c3540k642 = c3773t6.i;
                    if (c3540k642 != null) {
                    }
                    if (c3540k642 != null) {
                    }
                    long j32 = c3540k62.d;
                    c3618n62.a = zk;
                    c3618n62.b = c3540k62;
                    c3618n62.c = z3;
                    c3618n62.e = intValue2;
                    c3618n62.f = i2;
                    c3618n62.g = j;
                    c3618n62.j = 3;
                    a2 = c3773t6.a(j32, c3618n62);
                    if (a2 != obj) {
                    }
                }
                return obj;
            }
        }
        c3618n6 = new C3618n6(c3773t6, sq3Var);
        C3618n6 c3618n622 = c3618n6;
        Object obj22 = c3618n622.h;
        obj = lu3.a;
        i = c3618n622.j;
        Zk zk32 = null;
        if (i != 0) {
        }
        AbstractC3566l6 abstractC3566l622 = c3773t6.b;
        c3618n622.a = zk32;
        c3618n622.b = c3540k6;
        c3618n622.c = z2;
        c3618n622.j = 2;
        a = abstractC3566l622.a(c3618n622);
        if (a != obj) {
        }
        return obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(long j, long j2, sq3 sq3Var) {
        C3747s6 c3747s6;
        int i;
        long j3;
        if (sq3Var instanceof C3747s6) {
            c3747s6 = (C3747s6) sq3Var;
            int i2 = c3747s6.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c3747s6.e = i2 - Integer.MIN_VALUE;
                Object obj = c3747s6.c;
                lu3 lu3Var = lu3.a;
                i = c3747s6.e;
                if (i != 0) {
                    y6a.M(obj);
                    long currentTimeMillis = j + (System.currentTimeMillis() / 1000);
                    AbstractC3566l6 abstractC3566l6 = this.b;
                    c3747s6.a = j2;
                    c3747s6.b = currentTimeMillis;
                    c3747s6.e = 1;
                    obj = abstractC3566l6.b(1, c3747s6);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                    j3 = currentTimeMillis;
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j3 = c3747s6.b;
                    j2 = c3747s6.a;
                    y6a.M(obj);
                }
                List list = (List) obj;
                return Boolean.valueOf(list.isEmpty() && j3 - (((AbstractC3614n2) list.get(0)).c / 1000) >= j2);
            }
        }
        c3747s6 = new C3747s6(this, sq3Var);
        Object obj2 = c3747s6.c;
        lu3 lu3Var2 = lu3.a;
        i = c3747s6.e;
        if (i != 0) {
        }
        List list2 = (List) obj2;
        return Boolean.valueOf(list2.isEmpty() && j3 - (((AbstractC3614n2) list2.get(0)).c / 1000) >= j2);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(long j, sq3 sq3Var) {
        C3644o6 c3644o6;
        int i;
        if (sq3Var instanceof C3644o6) {
            c3644o6 = (C3644o6) sq3Var;
            int i2 = c3644o6.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c3644o6.d = i2 - Integer.MIN_VALUE;
                Object obj = c3644o6.b;
                lu3 lu3Var = lu3.a;
                i = c3644o6.d;
                if (i != 0) {
                    y6a.M(obj);
                    AbstractC3566l6 abstractC3566l6 = this.b;
                    c3644o6.a = j;
                    c3644o6.d = 1;
                    obj = abstractC3566l6.b(1, c3644o6);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j = c3644o6.a;
                    y6a.M(obj);
                }
                List list = (List) obj;
                return Boolean.valueOf(list.isEmpty() && (System.currentTimeMillis() - ((AbstractC3614n2) list.get(0)).c) / 1000 > j);
            }
        }
        c3644o6 = new C3644o6(this, sq3Var);
        Object obj2 = c3644o6.b;
        lu3 lu3Var2 = lu3.a;
        i = c3644o6.d;
        if (i != 0) {
        }
        List list2 = (List) obj2;
        return Boolean.valueOf(list2.isEmpty() && (System.currentTimeMillis() - ((AbstractC3614n2) list2.get(0)).c) / 1000 > j);
    }

    public final long a() {
        Context context = AbstractC3424fj.a;
        if (context == null) {
            return -1L;
        }
        ConcurrentHashMap concurrentHashMap = Qa.b;
        Qa a = Pa.a(context, "batch_processing_info");
        return a.a.getLong(dmi.y(this.a, "_last_batch_process"), -1L);
    }

    public final void a(long j) {
        Context context = AbstractC3424fj.a;
        if (context != null) {
            ConcurrentHashMap concurrentHashMap = Qa.b;
            Pa.a(context, "batch_processing_info").a(dmi.y(this.a, "_last_batch_process"), j, false);
        }
    }

    public final void a(boolean z) {
        C3540k6 c3540k6 = this.i;
        if (this.g.get() || c3540k6 == null) {
            return;
        }
        long j = c3540k6.c;
        yda ydaVar = this.j;
        if (ydaVar == null || !ydaVar.isActive()) {
            this.e.getClass();
            ku3 ku3Var = this.h;
            C3540k6 c3540k62 = this.i;
            long a = a();
            if (a == -1) {
                a(System.currentTimeMillis());
            }
            this.j = N3.a(ku3Var, Math.max(0L, ((a / 1000) + (c3540k62 != null ? c3540k62.c : 0L)) - (System.currentTimeMillis() / 1000)) * 1000, 1000 * j, new C3721r6(this, z, null));
        }
    }
}

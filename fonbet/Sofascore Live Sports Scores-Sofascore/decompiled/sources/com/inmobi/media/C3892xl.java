package com.inmobi.media;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.appset.AppSetIdInfo;
import com.iab.omid.library.inmobi.Omid;
import defpackage.a70;
import defpackage.ba4;
import defpackage.duf;
import defpackage.eq3;
import defpackage.joa;
import defpackage.jod;
import defpackage.jp5;
import defpackage.ku3;
import defpackage.l62;
import defpackage.lu3;
import defpackage.sq3;
import defpackage.y6a;
import defpackage.yda;
import defpackage.z45;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.xl, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3892xl {
    public static boolean b;
    public static final C3892xl a = new C3892xl();
    public static final C3736rl c = new C3736rl();

    /* JADX WARN: Can't wrap try/catch for region: R(8:0|1|(2:3|(5:5|6|7|(1:(1:(8:11|12|(3:14|(2:17|15)|18)|19|(3:21|(1:23)|24)|25|26|27)(2:30|31))(1:32))(6:36|37|(3:39|(1:41)|42)|43|(1:45)(1:48)|(2:47|35))|33))|51|6|7|(0)(0)|33) */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x009f, code lost:
    
        if (r7.b(r0) != r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x002d, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00ef, code lost:
    
        r7.getMessage();
        com.inmobi.media.Xb.a((byte) 1, "xl", "SDK encountered unexpected error while stopping internal components");
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(sq3 sq3Var) {
        C3762sl c3762sl;
        int i;
        if (sq3Var instanceof C3762sl) {
            c3762sl = (C3762sl) sq3Var;
            int i2 = c3762sl.b;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c3762sl.b = i2 - Integer.MIN_VALUE;
                Object obj = c3762sl.a;
                Object obj2 = lu3.a;
                i = c3762sl.b;
                if (i != 0) {
                    y6a.M(obj);
                    C3839vk.f.set(false);
                    C3773t6 c3773t6 = C3839vk.g;
                    if (c3773t6 != null) {
                        c3773t6.f.set(false);
                        c3773t6.g.set(true);
                        yda ydaVar = c3773t6.j;
                        if (ydaVar != null) {
                            ydaVar.e(null);
                        }
                        c3773t6.j = null;
                        c3773t6.i = null;
                    }
                    C3839vk.g = null;
                    C3839vk.j = null;
                    ((Kc) AbstractC3424fj.e.getValue()).a(C3839vk.i);
                    Hh hh = AbstractC3890xj.a;
                    c3762sl.b = 1;
                    Object a2 = N3.a(AbstractC3890xj.a, new C3864wj(null), c3762sl);
                    if (a2 != obj2) {
                        a2 = Unit.a;
                    }
                    if (a2 == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y6a.M(obj);
                        C5 c5 = AbstractC3286aa.c;
                        if (c5 != null) {
                            Iterator it = c5.c.iterator();
                            while (it.hasNext()) {
                                ((B5) it.next()).b();
                            }
                        }
                        Xa xa = AbstractC3286aa.d;
                        C3773t6 c3773t62 = xa.b;
                        if (c3773t62 != null) {
                            c3773t62.f.set(false);
                            c3773t62.g.set(true);
                            yda ydaVar2 = c3773t62.j;
                            if (ydaVar2 != null) {
                                ydaVar2.e(null);
                            }
                            c3773t62.j = null;
                            c3773t62.i = null;
                        }
                        xa.b = null;
                        ((Kc) AbstractC3424fj.e.getValue()).a(xa.d);
                        AbstractC3554kk.a();
                        Mc.a.compareAndSet(true, false);
                        return Unit.a;
                    }
                    y6a.M(obj);
                }
                AbstractC3294ai.c.set(false);
                ((Kc) AbstractC3424fj.e.getValue()).a(AbstractC3294ai.f);
                AbstractC3294ai.b = null;
                C3550kg c3550kg = C3550kg.a;
                c3762sl.b = 2;
            }
        }
        c3762sl = new C3762sl(sq3Var);
        Object obj3 = c3762sl.a;
        Object obj22 = lu3.a;
        i = c3762sl.b;
        if (i != 0) {
        }
        AbstractC3294ai.c.set(false);
        ((Kc) AbstractC3424fj.e.getValue()).a(AbstractC3294ai.f);
        AbstractC3294ai.b = null;
        C3550kg c3550kg2 = C3550kg.a;
        c3762sl.b = 2;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(8:5|6|7|(1:(1:(1:(4:12|13|14|15)(2:18|19))(2:20|21))(1:24))(3:31|32|(2:34|23))|25|(1:27)(1:30)|(2:29|23)|21))|37|6|7|(0)(0)|25|(0)(0)|(0)|21) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0098, code lost:
    
        if (r6.a(r0) == r7) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x002e, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b8, code lost:
    
        r6.getMessage();
        com.inmobi.media.Xb.a((byte) 2, "xl", "SDK encountered unexpected error while starting internal components");
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0065 A[Catch: Exception -> 0x002e, TryCatch #0 {Exception -> 0x002e, blocks: (B:12:0x002a, B:13:0x009b, B:20:0x0037, B:21:0x006a, B:24:0x003b, B:25:0x0053, B:30:0x0065, B:32:0x0042), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(sq3 sq3Var) {
        C3788tl c3788tl;
        Object obj;
        int i;
        Object a2;
        if (sq3Var instanceof C3788tl) {
            c3788tl = (C3788tl) sq3Var;
            int i2 = c3788tl.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c3788tl.c = i2 - Integer.MIN_VALUE;
                Object obj2 = c3788tl.a;
                obj = lu3.a;
                i = c3788tl.c;
                if (i != 0) {
                    y6a.M(obj2);
                    Yk.a();
                    AppSetIdInfo appSetIdInfo = F1.a;
                    E3.f();
                    c3788tl.c = 1;
                    if (C3839vk.b(c3788tl) == obj) {
                        return obj;
                    }
                } else if (i == 1) {
                    y6a.M(obj2);
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y6a.M(obj2);
                        AbstractC3286aa.c();
                        HashMap hashMap = new HashMap();
                        C3839vk c3839vk = C3839vk.a;
                        C3839vk.b("SessionStarted", hashMap, EnumC3943zk.SDK);
                        AbstractC3554kk.b();
                        Mc.a();
                        Qf.a(E1.c);
                        return Unit.a;
                    }
                    y6a.M(obj2);
                    Io io2 = Io.a;
                    AbstractC3294ai.c.set(true);
                    AbstractC3294ai.b();
                    ((Kc) AbstractC3424fj.e.getValue()).a(new int[]{2, 1, 100, 151, 150, 152}, AbstractC3294ai.f);
                    C3694q4 c3694q4 = AbstractC3435g4.a;
                    AbstractC3435g4.a("telemetry", AbstractC3294ai.d);
                    C3550kg c3550kg = C3550kg.a;
                    c3788tl.c = 3;
                }
                Hh hh = AbstractC3890xj.a;
                c3788tl.c = 2;
                a2 = N3.a(AbstractC3890xj.a, new C3838vj(null), c3788tl);
                if (a2 == obj) {
                    a2 = Unit.a;
                }
                if (a2 == obj) {
                    return obj;
                }
                Io io22 = Io.a;
                AbstractC3294ai.c.set(true);
                AbstractC3294ai.b();
                ((Kc) AbstractC3424fj.e.getValue()).a(new int[]{2, 1, 100, 151, 150, 152}, AbstractC3294ai.f);
                C3694q4 c3694q42 = AbstractC3435g4.a;
                AbstractC3435g4.a("telemetry", AbstractC3294ai.d);
                C3550kg c3550kg2 = C3550kg.a;
                c3788tl.c = 3;
            }
        }
        c3788tl = new C3788tl(this, sq3Var);
        Object obj22 = c3788tl.a;
        obj = lu3.a;
        i = c3788tl.c;
        if (i != 0) {
        }
        Hh hh2 = AbstractC3890xj.a;
        c3788tl.c = 2;
        a2 = N3.a(AbstractC3890xj.a, new C3838vj(null), c3788tl);
        if (a2 == obj) {
        }
        if (a2 == obj) {
        }
        Io io222 = Io.a;
        AbstractC3294ai.c.set(true);
        AbstractC3294ai.b();
        ((Kc) AbstractC3424fj.e.getValue()).a(new int[]{2, 1, 100, 151, 150, 152}, AbstractC3294ai.f);
        C3694q4 c3694q422 = AbstractC3435g4.a;
        AbstractC3435g4.a("telemetry", AbstractC3294ai.d);
        C3550kg c3550kg22 = C3550kg.a;
        c3788tl.c = 3;
    }

    public static boolean b(Context context) {
        context.getClass();
        ConcurrentHashMap concurrentHashMap = Qa.b;
        if (Pa.a(context, "sdk_version_store").a.getString("sdk_version", null) == null) {
            return true;
        }
        context.getClass();
        return !Intrinsics.c(Pa.a(context, "sdk_version_store").a.getString("sdk_version", null), "11.3.0");
    }

    public static boolean a() {
        int i;
        try {
            duf.a.getOrCreateKotlinClass(jod.class).getSimpleName();
            i = 0;
        } catch (NoClassDefFoundError unused) {
            i = 1;
        }
        try {
            duf.a.getOrCreateKotlinClass(l62.class).getSimpleName();
        } catch (NoClassDefFoundError unused2) {
            i++;
        }
        try {
            duf.a.getOrCreateKotlinClass(ku3.class).getSimpleName();
        } catch (NoClassDefFoundError unused3) {
            i++;
        }
        try {
            duf.a.getOrCreateKotlinClass(z45.class).getSimpleName();
        } catch (NoClassDefFoundError unused4) {
            i++;
        }
        try {
            duf.a.getOrCreateKotlinClass(AdvertisingIdClient.class).getSimpleName();
        } catch (NoClassDefFoundError unused5) {
            i++;
        }
        try {
            duf.a.getOrCreateKotlinClass(eq3.class).getSimpleName();
        } catch (NoClassDefFoundError unused6) {
            i++;
        }
        try {
            duf.a.getOrCreateKotlinClass(jp5.class).getSimpleName();
        } catch (NoClassDefFoundError unused7) {
            i++;
        }
        try {
            duf.a.getOrCreateKotlinClass(ba4.class).getSimpleName();
        } catch (NoClassDefFoundError unused8) {
            i++;
        }
        try {
            duf.a.getOrCreateKotlinClass(Omid.class).getSimpleName();
        } catch (NoClassDefFoundError unused9) {
            i++;
        }
        return i > 0;
    }

    public static void a(Context context) {
        context.getClass();
        try {
            if (b(context)) {
                AbstractC3309b7.a(context);
                context.getClass();
                ConcurrentHashMap concurrentHashMap = Qa.b;
                Qa.a(Pa.a(context, "sdk_version_store"), "db_deletion_failed", true);
                Context context2 = AbstractC3424fj.a;
                Context applicationContext = context.getApplicationContext();
                applicationContext.getClass();
                AbstractC3424fj.a(applicationContext);
            }
        } catch (Exception e) {
            joa joaVar = AbstractC3286aa.a;
            AbstractC3776t9.a(e);
        }
    }
}

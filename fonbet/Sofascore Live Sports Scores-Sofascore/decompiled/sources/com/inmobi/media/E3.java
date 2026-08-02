package com.inmobi.media;

import android.os.HandlerThread;
import android.os.Looper;
import com.inmobi.media.core.config.models.AdConfig;
import com.inmobi.media.core.config.models.RootConfig;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import defpackage.a70;
import defpackage.joa;
import defpackage.ku3;
import defpackage.ljg;
import defpackage.lu3;
import defpackage.ok3;
import defpackage.qz4;
import defpackage.s9a;
import defpackage.sq3;
import defpackage.te6;
import defpackage.tz9;
import defpackage.wc4;
import defpackage.xw3;
import defpackage.y6a;
import defpackage.ypa;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class E3 {
    public static ku3 c;
    public static HandlerC3641o3 d;
    public static HandlerThread e;
    public static final B3 l;
    public static final E3 a = new E3();
    public static final joa b = ypa.b(new wc4(28));
    public static List f = new ArrayList();
    public static final AtomicBoolean g = new AtomicBoolean(false);
    public static final AtomicBoolean h = new AtomicBoolean(true);
    public static final Object i = new Object();
    public static final LinkedHashMap j = new LinkedHashMap();
    public static final Function1 k = new qz4(19);

    static {
        AbstractC3424fj.g.submit(new defpackage.x(8));
        l = new B3();
    }

    public static final void b(Z2 z2) {
        int i2 = z2.f;
        if (i2 > 0) {
            z2.f = i2 - 1;
            z2.g = System.currentTimeMillis();
            ok3.J(new D3(z2, null));
        }
    }

    public static AdConfig.ImaiConfig c() {
        return ((AdConfig) AbstractC3435g4.a.a(AdConfig.class)).getImai();
    }

    public static void d() {
        try {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 5, 5L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new M9("E3", false));
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            c = s9a.c(new te6(threadPoolExecutor).plus(tz9.o()));
            HandlerThread handlerThread = new HandlerThread("pingHandlerThread");
            e = handlerThread;
            P6.a(handlerThread, "pingHandlerThread");
            HandlerThread handlerThread2 = e;
            handlerThread2.getClass();
            Looper looper = handlerThread2.getLooper();
            looper.getClass();
            d = new HandlerC3641o3(looper);
            ((Kc) AbstractC3424fj.e.getValue()).a(new int[]{10, 11, 2, 1}, k);
        } catch (Exception e2) {
            e2.getMessage();
        }
    }

    public static boolean e() {
        return !((RootConfig) AbstractC3435g4.a.a(RootConfig.class)).getMonetizationDisabled();
    }

    public static void f() {
        HandlerThread handlerThread;
        try {
            if (AbstractC3420ff.a() != null) {
                return;
            }
            synchronized (i) {
                try {
                    if (g.compareAndSet(false, true)) {
                        if (e == null) {
                            HandlerThread handlerThread2 = new HandlerThread("pingHandlerThread");
                            e = handlerThread2;
                            P6.a(handlerThread2, "pingHandlerThread");
                        }
                        if (d == null && (handlerThread = e) != null) {
                            Looper looper = handlerThread.getLooper();
                            looper.getClass();
                            d = new HandlerC3641o3(looper);
                        }
                        ok3.J(new C3(null));
                    }
                    Unit unit = Unit.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Exception e2) {
            e2.getMessage();
        }
    }

    public static void g() {
        try {
            AtomicBoolean atomicBoolean = g;
            atomicBoolean.set(false);
            synchronized (i) {
                try {
                    if (!atomicBoolean.get()) {
                        HandlerThread handlerThread = e;
                        if (handlerThread != null) {
                            handlerThread.getLooper().quit();
                            handlerThread.interrupt();
                        }
                        e = null;
                        d = null;
                    }
                    Unit unit = Unit.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Exception e2) {
            e2.getMessage();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Z2 z2, C3276a0 c3276a0, InterfaceC3880x9 interfaceC3880x9, sq3 sq3Var) {
        C3900y3 c3900y3;
        int i2;
        if (sq3Var instanceof C3900y3) {
            c3900y3 = (C3900y3) sq3Var;
            int i3 = c3900y3.f;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c3900y3.f = i3 - Integer.MIN_VALUE;
                Object obj = c3900y3.d;
                lu3 lu3Var = lu3.a;
                i2 = c3900y3.f;
                if (i2 != 0) {
                    y6a.M(obj);
                    if (interfaceC3880x9 != null) {
                        ((C3906y9) interfaceC3880x9).c("E3", "record Click");
                    }
                    C3357d3 c3357d3 = (C3357d3) b.getValue();
                    int maxDbEvents = c().getMaxDbEvents();
                    c3900y3.a = z2;
                    c3900y3.b = c3276a0;
                    c3900y3.c = interfaceC3880x9;
                    c3900y3.f = 1;
                    C3724r9 c3724r9 = c3357d3.a;
                    C3331c3 c3331c3 = new C3331c3(maxDbEvents, c3357d3, z2, null);
                    c3724r9.getClass();
                    Object a2 = c3724r9.a(new C3699q9(c3724r9, c3331c3, null), c3900y3);
                    if (a2 != lu3Var) {
                        a2 = Unit.a;
                    }
                    if (a2 == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    interfaceC3880x9 = c3900y3.c;
                    c3276a0 = c3900y3.b;
                    z2 = c3900y3.a;
                    y6a.M(obj);
                }
                if (c3276a0 != null) {
                    j.put(Integer.valueOf(z2.a), c3276a0);
                }
                if (AbstractC3420ff.a() == null) {
                    if (interfaceC3880x9 != null) {
                        ((C3906y9) interfaceC3880x9).b("E3", "No network available. Saving click for later processing ...");
                    }
                    g.set(false);
                    g();
                } else {
                    if (interfaceC3880x9 != null) {
                        ((C3906y9) interfaceC3880x9).a("E3", ljg.j(z2.a, "submit click - "));
                    }
                    ku3 ku3Var = c;
                    if (ku3Var != null) {
                        xw3.L(ku3Var, null, null, new C3926z3(z2, interfaceC3880x9, null), 3);
                    }
                }
                return Unit.a;
            }
        }
        c3900y3 = new C3900y3(this, sq3Var);
        Object obj2 = c3900y3.d;
        lu3 lu3Var2 = lu3.a;
        i2 = c3900y3.f;
        if (i2 != 0) {
        }
        if (c3276a0 != null) {
        }
        if (AbstractC3420ff.a() == null) {
        }
        return Unit.a;
    }

    public static final C3357d3 b() {
        return new C3357d3(AbstractC3750s9.b());
    }

    public static final HashMap a(Z2 z2) {
        HashMap hashMap = new HashMap();
        try {
            int maxRetries = (c().getMaxRetries() - z2.f) + 1;
            if (maxRetries > 0) {
                hashMap.put("X-im-retry-count", String.valueOf(maxRetries));
            }
        } catch (Exception unused) {
        }
        return hashMap;
    }

    public static final void a() {
        d();
    }

    public static void a(String str, boolean z, InterfaceC3880x9 interfaceC3880x9) {
        str.getClass();
        Ug.a(Rg.REGULAR, new C3796u3(str, z, interfaceC3880x9, null));
    }

    public static final Unit a(N2 n2) {
        n2.getClass();
        int i2 = n2.a;
        if (i2 == 1 || i2 == 2) {
            h.set(false);
        } else if (i2 != 10) {
            if (i2 == 11 && !Boolean.parseBoolean(n2.b)) {
                f();
            }
        } else if ("available".equals(n2.b)) {
            f();
        }
        return Unit.a;
    }

    public static void a(Z2 z2, String str) {
        z2.getClass();
        str.getClass();
        LinkedHashMap linkedHashMap = j;
        C3276a0 c3276a0 = (C3276a0) linkedHashMap.get(Integer.valueOf(z2.a));
        if (c3276a0 != null) {
            str.getClass();
            Fk fk = c3276a0.b;
            str.getClass();
            LinkedHashMap a2 = fk.a();
            a2.put("networkType", F5.g());
            a2.put(IronSourceConstants.EVENTS_ERROR_CODE, (short) 2178);
            a2.put("reason", str);
            String str2 = fk.d;
            if (str2 == null) {
                str2 = "";
            }
            a2.put("impressionId", str2);
            C3839vk c3839vk = C3839vk.a;
            C3839vk.b("AdImpressionSuccessful", a2, EnumC3943zk.SDK);
        }
        linkedHashMap.remove(Integer.valueOf(z2.a));
    }
}

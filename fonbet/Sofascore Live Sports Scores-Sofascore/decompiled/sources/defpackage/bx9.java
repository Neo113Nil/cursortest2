package defpackage;

import android.content.Context;
import com.facebook.internal.o;
import com.facebook.internal.q;
import com.facebook.w;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class bx9 {
    public static final bx9 a = new bx9();
    public static final AtomicBoolean b = new AtomicBoolean(false);

    /* JADX WARN: Removed duplicated region for block: B:30:0x0070 A[Catch: all -> 0x0042, TRY_LEAVE, TryCatch #1 {all -> 0x0042, blocks: (B:12:0x0010, B:16:0x001a, B:18:0x0022, B:19:0x0024, B:26:0x003e, B:27:0x003f, B:28:0x006c, B:30:0x0070, B:33:0x0076, B:35:0x007f, B:40:0x0097, B:47:0x008f, B:48:0x00a7, B:56:0x0046, B:59:0x004a, B:60:0x004c, B:67:0x0066, B:68:0x0067, B:76:0x006b, B:77:0x00b7, B:62:0x004d, B:65:0x005f, B:73:0x005a, B:21:0x0025, B:24:0x0037, B:53:0x0032, B:44:0x008b), top: B:10:0x000e, outer: #6, inners: #2, #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0076 A[Catch: all -> 0x0042, TRY_ENTER, TryCatch #1 {all -> 0x0042, blocks: (B:12:0x0010, B:16:0x001a, B:18:0x0022, B:19:0x0024, B:26:0x003e, B:27:0x003f, B:28:0x006c, B:30:0x0070, B:33:0x0076, B:35:0x007f, B:40:0x0097, B:47:0x008f, B:48:0x00a7, B:56:0x0046, B:59:0x004a, B:60:0x004c, B:67:0x0066, B:68:0x0067, B:76:0x006b, B:77:0x00b7, B:62:0x004d, B:65:0x005f, B:73:0x005a, B:21:0x0025, B:24:0x0037, B:53:0x0032, B:44:0x008b), top: B:10:0x000e, outer: #6, inners: #2, #4, #5 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final synchronized void b(int i, Context context) {
        boolean z;
        synchronized (bx9.class) {
            Set set = cw3.a;
            if (set.contains(bx9.class)) {
                return;
            }
            Object obj = null;
            try {
                if (i == 0) {
                    throw null;
                }
                AtomicBoolean atomicBoolean = b;
                if (atomicBoolean.get()) {
                    return;
                }
                fsf fsfVar = new fsf();
                if (i == 3) {
                    synchronized (gx9.l) {
                        if (!set.contains(gx9.class)) {
                            try {
                                obj = gx9.m;
                            } catch (Throwable th) {
                                cw3.a(gx9.class, th);
                            }
                        }
                        if (obj == null) {
                            obj = dti.j(context);
                        }
                    }
                    fsfVar.a = obj;
                    if (fsfVar.a != null) {
                        atomicBoolean.set(true);
                        return;
                    }
                    if (q.b(o.AndroidIAPSubscriptionAutoLogging)) {
                        tef tefVar = tef.a;
                        if (!set.contains(tef.class)) {
                            try {
                                z = tef.b;
                            } catch (Throwable th2) {
                                cw3.a(tef.class, th2);
                            }
                            if (z || i == 3) {
                                ((cx9) fsfVar.a).a(px9.INAPP, new uu1(fsfVar, i, context, 6));
                                return;
                            }
                        }
                        z = false;
                        if (z) {
                        }
                        ((cx9) fsfVar.a).a(px9.INAPP, new uu1(fsfVar, i, context, 6));
                        return;
                    }
                    ((cx9) fsfVar.a).a(px9.INAPP, new ax9(context, i, 0));
                    return;
                }
                if (i == 4) {
                    ex9 ex9Var = hx9.G;
                    synchronized (ex9Var) {
                        if (!set.contains(hx9.class)) {
                            try {
                                obj = hx9.I;
                            } catch (Throwable th3) {
                                cw3.a(hx9.class, th3);
                            }
                        }
                        if (obj == null) {
                            obj = ex9Var.a(context);
                        }
                    }
                    fsfVar.a = obj;
                }
                if (fsfVar.a != null) {
                }
            } catch (Throwable th4) {
                cw3.a(bx9.class, th4);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00e2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00cd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0089 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(int i, String str) {
        ConcurrentHashMap concurrentHashMap;
        ConcurrentHashMap concurrentHashMap2;
        ConcurrentHashMap concurrentHashMap3;
        ConcurrentHashMap concurrentHashMap4;
        ConcurrentHashMap concurrentHashMap5;
        Set set = cw3.a;
        if (set.contains(this)) {
            return;
        }
        try {
            boolean z = false;
            if (!set.contains(mx9.class)) {
                try {
                    z = !w.a().getSharedPreferences("com.facebook.internal.iap.IAP_CACHE_GPBLV2V7", 0).contains("APP_HAS_BEEN_LAUNCHED_KEY");
                } catch (Throwable th) {
                    cw3.a(mx9.class, th);
                }
            }
            boolean z2 = z;
            if (z2) {
                mx9.v();
            }
            if (i == 3) {
                mx9.m(gx9.b(), gx9.c(), false, str, i, z2);
                mx9.m(gx9.d(), gx9.c(), true, str, i, z2);
                gx9.b().clear();
                gx9.d().clear();
            } else {
                ex9 ex9Var = hx9.G;
                ConcurrentHashMap concurrentHashMap6 = null;
                if (!cw3.a.contains(hx9.class)) {
                    try {
                        concurrentHashMap = hx9.J;
                    } catch (Throwable th2) {
                        cw3.a(hx9.class, th2);
                    }
                    if (!cw3.a.contains(hx9.class)) {
                        try {
                            concurrentHashMap2 = hx9.L;
                        } catch (Throwable th3) {
                            cw3.a(hx9.class, th3);
                        }
                        mx9.m(concurrentHashMap, concurrentHashMap2, false, str, i, z2);
                        if (!cw3.a.contains(hx9.class)) {
                            try {
                                concurrentHashMap3 = hx9.K;
                            } catch (Throwable th4) {
                                cw3.a(hx9.class, th4);
                            }
                            if (!cw3.a.contains(hx9.class)) {
                                try {
                                    concurrentHashMap4 = hx9.L;
                                } catch (Throwable th5) {
                                    cw3.a(hx9.class, th5);
                                }
                                mx9.m(concurrentHashMap3, concurrentHashMap4, true, str, i, z2);
                                if (!cw3.a.contains(hx9.class)) {
                                    try {
                                        concurrentHashMap5 = hx9.J;
                                    } catch (Throwable th6) {
                                        cw3.a(hx9.class, th6);
                                    }
                                    concurrentHashMap5.clear();
                                    if (!cw3.a.contains(hx9.class)) {
                                        try {
                                            concurrentHashMap6 = hx9.K;
                                        } catch (Throwable th7) {
                                            cw3.a(hx9.class, th7);
                                        }
                                    }
                                    concurrentHashMap6.clear();
                                }
                                concurrentHashMap5 = null;
                                concurrentHashMap5.clear();
                                if (!cw3.a.contains(hx9.class)) {
                                }
                                concurrentHashMap6.clear();
                            }
                            concurrentHashMap4 = null;
                            mx9.m(concurrentHashMap3, concurrentHashMap4, true, str, i, z2);
                            if (!cw3.a.contains(hx9.class)) {
                            }
                            concurrentHashMap5 = null;
                            concurrentHashMap5.clear();
                            if (!cw3.a.contains(hx9.class)) {
                            }
                            concurrentHashMap6.clear();
                        }
                        concurrentHashMap3 = null;
                        if (!cw3.a.contains(hx9.class)) {
                        }
                        concurrentHashMap4 = null;
                        mx9.m(concurrentHashMap3, concurrentHashMap4, true, str, i, z2);
                        if (!cw3.a.contains(hx9.class)) {
                        }
                        concurrentHashMap5 = null;
                        concurrentHashMap5.clear();
                        if (!cw3.a.contains(hx9.class)) {
                        }
                        concurrentHashMap6.clear();
                    }
                    concurrentHashMap2 = null;
                    mx9.m(concurrentHashMap, concurrentHashMap2, false, str, i, z2);
                    if (!cw3.a.contains(hx9.class)) {
                    }
                    concurrentHashMap3 = null;
                    if (!cw3.a.contains(hx9.class)) {
                    }
                    concurrentHashMap4 = null;
                    mx9.m(concurrentHashMap3, concurrentHashMap4, true, str, i, z2);
                    if (!cw3.a.contains(hx9.class)) {
                    }
                    concurrentHashMap5 = null;
                    concurrentHashMap5.clear();
                    if (!cw3.a.contains(hx9.class)) {
                    }
                    concurrentHashMap6.clear();
                }
                concurrentHashMap = null;
                if (!cw3.a.contains(hx9.class)) {
                }
                concurrentHashMap2 = null;
                mx9.m(concurrentHashMap, concurrentHashMap2, false, str, i, z2);
                if (!cw3.a.contains(hx9.class)) {
                }
                concurrentHashMap3 = null;
                if (!cw3.a.contains(hx9.class)) {
                }
                concurrentHashMap4 = null;
                mx9.m(concurrentHashMap3, concurrentHashMap4, true, str, i, z2);
                if (!cw3.a.contains(hx9.class)) {
                }
                concurrentHashMap5 = null;
                concurrentHashMap5.clear();
                if (!cw3.a.contains(hx9.class)) {
                }
                concurrentHashMap6.clear();
            }
            if (z2) {
                mx9.w();
            }
        } catch (Throwable th8) {
            cw3.a(this, th8);
        }
    }
}

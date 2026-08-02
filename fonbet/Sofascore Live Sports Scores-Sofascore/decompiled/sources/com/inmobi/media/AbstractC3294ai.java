package com.inmobi.media;

import android.content.Context;
import com.inmobi.media.core.config.models.CrashConfig;
import com.inmobi.media.core.config.models.TelemetryConfig;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import defpackage.i5k;
import defpackage.joa;
import defpackage.ku3;
import defpackage.lnb;
import defpackage.pcl;
import defpackage.xw3;
import java.lang.ref.PhantomReference;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.ai, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3294ai {
    public static Wb b;
    public static final Nb a = Nb.ERROR;
    public static final AtomicBoolean c = new AtomicBoolean(false);
    public static final Zh d = new Zh();
    public static final ReentrantLock e = new ReentrantLock();
    public static final Function1 f = new pcl(23);
    public static final ReferenceQueue g = new ReferenceQueue();
    public static final ConcurrentHashMap h = new ConcurrentHashMap();
    public static final AtomicBoolean i = new AtomicBoolean(false);

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    public static Nb a(String str, String str2, TelemetryConfig.LoggingConfig loggingConfig) {
        switch (str.hashCode()) {
            case -1396342996:
                if (str.equals("banner")) {
                    return Intrinsics.c(str2, "AB") ? Ob.a(loggingConfig.getBanner().getAb().getLogLevel()) : Ob.a(loggingConfig.getBanner().getNonAb().getLogLevel());
                }
                break;
            case -1052618729:
                if (str.equals(IronSourceConstants.EVENTS_NATIVE)) {
                    return Intrinsics.c(str2, "AB") ? Ob.a(loggingConfig.getNative().getAb().getLogLevel()) : Ob.a(loggingConfig.getNative().getNonAb().getLogLevel());
                }
                break;
            case -171121434:
                if (str.equals("intNative")) {
                    return Intrinsics.c(str2, "AB") ? Ob.a(loggingConfig.getInt_native().getAb().getLogLevel()) : Ob.a(loggingConfig.getInt_native().getNonAb().getLogLevel());
                }
                break;
            case 93166550:
                if (str.equals("audio")) {
                    return Ob.a(loggingConfig.getAudio().getNonAb().getLogLevel());
                }
                break;
            case 1957200954:
                if (str.equals("intHtml")) {
                    return Intrinsics.c(str2, "AB") ? Ob.a(loggingConfig.getInt_html().getAb().getLogLevel()) : Ob.a(loggingConfig.getInt_html().getNonAb().getLogLevel());
                }
                break;
            case 1966366787:
                if (str.equals("getToken")) {
                    return Ob.a(loggingConfig.getGetToken().getLogLevel());
                }
                break;
        }
        return a;
    }

    public static double b(String str, String str2, TelemetryConfig.LoggingConfig loggingConfig) {
        switch (str.hashCode()) {
            case -1396342996:
                if (str.equals("banner")) {
                    return Intrinsics.c(str2, "AB") ? loggingConfig.getBanner().getAb().getSamplePercent() : loggingConfig.getBanner().getNonAb().getSamplePercent();
                }
                return 0.01d;
            case -1052618729:
                if (str.equals(IronSourceConstants.EVENTS_NATIVE)) {
                    return Intrinsics.c(str2, "AB") ? loggingConfig.getNative().getAb().getSamplePercent() : loggingConfig.getNative().getNonAb().getSamplePercent();
                }
                return 0.01d;
            case -171121434:
                if (str.equals("intNative")) {
                    return Intrinsics.c(str2, "AB") ? loggingConfig.getInt_native().getAb().getSamplePercent() : loggingConfig.getInt_native().getNonAb().getSamplePercent();
                }
                return 0.01d;
            case 93166550:
                if (str.equals("audio")) {
                    return loggingConfig.getAudio().getNonAb().getSamplePercent();
                }
                return 0.01d;
            case 1957200954:
                if (str.equals("intHtml")) {
                    return Intrinsics.c(str2, "AB") ? loggingConfig.getInt_html().getAb().getSamplePercent() : loggingConfig.getInt_html().getNonAb().getSamplePercent();
                }
                return 0.01d;
            case 1966366787:
                if (str.equals("getToken")) {
                    return loggingConfig.getGetToken().getSamplePercent();
                }
                return 0.01d;
            default:
                return 0.01d;
        }
    }

    public static final void c() {
        while (c.get()) {
            a();
        }
    }

    public static void b() {
        if (b != null) {
            return;
        }
        ReentrantLock reentrantLock = e;
        if (reentrantLock.tryLock()) {
            try {
                if (b == null && c.get()) {
                    Context context = AbstractC3424fj.a;
                    if (context != null) {
                        TelemetryConfig.LoggingConfig loggingConfig = ((TelemetryConfig) AbstractC3435g4.a.a(TelemetryConfig.class)).getLoggingConfig();
                        b = new Wb(context, loggingConfig.getLoggingUrl(), loggingConfig.getRetryInterval() * 1000, loggingConfig.getExpiry(), loggingConfig.getMaxRetries(), loggingConfig.getMaxNoOfEntries());
                    }
                    Wb wb = b;
                    if (wb != null) {
                        B9.a(wb);
                    }
                }
                reentrantLock.unlock();
            } catch (Throwable th) {
                e.unlock();
                throw th;
            }
        }
    }

    public static void a(Object obj, InterfaceC3880x9 interfaceC3880x9) {
        obj.getClass();
        try {
            if (((TelemetryConfig) AbstractC3435g4.a.a(TelemetryConfig.class)).getLoggingConfig().getEnabled()) {
                if (interfaceC3880x9 != null) {
                    ((C3906y9) interfaceC3880x9).a("RemoteLoggerComponent", "starting to track reference of " + obj);
                }
                if (interfaceC3880x9 != null) {
                    h.put(new PhantomReference(obj, g), new Pair(obj.toString(), new WeakReference(interfaceC3880x9)));
                    if (i.getAndSet(true)) {
                        return;
                    }
                    try {
                        xw3.L(AbstractC3417fc.a, null, null, new C3314bc(new defpackage.x(26), null), 3);
                    } catch (Exception unused) {
                    }
                }
            }
        } catch (Exception e2) {
            joa joaVar = AbstractC3286aa.a;
            AbstractC3776t9.a(e2);
        }
    }

    public static C3906y9 a(String str, String str2) {
        str.getClass();
        str2.getClass();
        Context context = AbstractC3424fj.a;
        if (context != null) {
            try {
                b();
                TelemetryConfig.LoggingConfig loggingConfig = ((TelemetryConfig) AbstractC3435g4.a.a(TelemetryConfig.class)).getLoggingConfig();
                double b2 = b(str, str2, loggingConfig);
                Nb a2 = a(str, str2, loggingConfig);
                boolean z = !loggingConfig.getEnabled();
                long expiry = loggingConfig.getExpiry() * 1000;
                int maxNoOfEntries = loggingConfig.getMaxNoOfEntries();
                a2.getClass();
                return new C3906y9(context, b2, a2, z, maxNoOfEntries, expiry);
            } catch (Exception e2) {
                joa joaVar = AbstractC3286aa.a;
                AbstractC3776t9.a(e2);
            }
        }
        return null;
    }

    public static final Unit a(N2 n2) {
        n2.getClass();
        int i2 = n2.a;
        if (i2 != 1 && i2 != 2) {
            switch (i2) {
                case 150:
                case 151:
                case 152:
                    Map map = n2.c;
                    if (map != null && map.containsKey("data")) {
                        Object obj = n2.c.get("data");
                        obj.getClass();
                        a((C3312ba) obj);
                        break;
                    }
                    break;
            }
        } else {
            a(i2);
            c.set(false);
            ((Kc) AbstractC3424fj.e.getValue()).a(f);
            b = null;
        }
        return Unit.a;
    }

    public static void a() {
        WeakReference weakReference;
        InterfaceC3880x9 interfaceC3880x9;
        Reference remove = g.remove();
        ConcurrentHashMap concurrentHashMap = h;
        if (CollectionsKt.R(concurrentHashMap.keySet(), remove)) {
            Pair pair = (Pair) concurrentHashMap.get(remove);
            if (pair != null && (weakReference = (WeakReference) pair.b) != null && (interfaceC3880x9 = (InterfaceC3880x9) weakReference.get()) != null) {
                ((C3906y9) interfaceC3880x9).a("ReferenceTracker", lnb.m(pair.a, " reference ", " reference is GCed."));
            }
            i5k.c(concurrentHashMap).remove(remove);
        }
        for (Map.Entry entry : concurrentHashMap.entrySet()) {
            if (((WeakReference) ((Pair) entry.getValue()).b).get() == null) {
                h.remove(entry.getKey());
            }
        }
    }

    public static void a(C3312ba c3312ba) {
        c3312ba.getClass();
        if (!(c3312ba instanceof C3307b5) && !(c3312ba instanceof C3869wo)) {
            C3694q4 c3694q4 = AbstractC3435g4.a;
            if (((CrashConfig) c3694q4.a(CrashConfig.class)).getAnr().getAppExitReason().getReportToLogs() && (c3312ba instanceof D1)) {
                C3518ja c3518ja = new C3518ja(((CrashConfig) c3694q4.a(CrashConfig.class)).getAnr().getAppExitReason().getIncompleteLogThresholdTime());
                String str = c3312ba.a;
                String str2 = c3312ba.b;
                String str3 = str2 == null ? "" : str2;
                int i2 = ((D1) c3312ba).g;
                long j = c3312ba.c;
                str.getClass();
                ku3 ku3Var = AbstractC3417fc.a;
                AbstractC3391ec.a(new C3493ia(c3518ja, j, str, i2, str3, null));
                return;
            }
            return;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = B9.a;
        ArrayList arrayList = new ArrayList();
        CopyOnWriteArrayList copyOnWriteArrayList2 = Zb.a;
        Iterator it = Yb.a().iterator();
        while (it.hasNext()) {
            arrayList.add(new Zi((Xh) it.next()));
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Zi zi = (Zi) it2.next();
            Nb nb = Nb.ERROR;
            String str4 = c3312ba.a;
            long j2 = c3312ba.c;
            String str5 = c3312ba.b;
            if (str5 == null) {
                str5 = "";
            }
            zi.getClass();
            nb.getClass();
            zi.a.a(nb, "LOGGER CRASH", "TYPE - " + str4 + ", TIMESTAMP - " + j2 + ", PAYLOAD - " + str5);
            if (c3312ba instanceof C3307b5) {
                zi.a.b();
            }
        }
    }

    public static void a(int i2) {
        CopyOnWriteArrayList copyOnWriteArrayList = B9.a;
        ArrayList arrayList = new ArrayList();
        CopyOnWriteArrayList copyOnWriteArrayList2 = Zb.a;
        Iterator it = Yb.a().iterator();
        while (it.hasNext()) {
            arrayList.add(new Zi((Xh) it.next()));
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Zi zi = (Zi) it2.next();
            Nb nb = Nb.ERROR;
            zi.getClass();
            nb.getClass();
            zi.a.a(nb, "LOGGER CRASH", "SYSTEM SHUTDOWN RECEIVED - " + i2);
            zi.a.b();
        }
        c.set(false);
        ((Kc) AbstractC3424fj.e.getValue()).a(f);
        b = null;
    }
}

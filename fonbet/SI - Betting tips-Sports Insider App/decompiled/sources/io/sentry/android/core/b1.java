package io.sentry.android.core;

import android.content.IntentFilter;
import android.os.Handler;
import android.os.HandlerThread;
import androidx.appcompat.widget.q4;
import io.sentry.b5;
import io.sentry.b6;
import io.sentry.f3;
import io.sentry.g3;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class b1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15544a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15545b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f15546c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f15547d;

    public /* synthetic */ b1(SystemEventsBreadcrumbsIntegration systemEventsBreadcrumbsIntegration, io.sentry.b1 b1Var, SentryAndroidOptions sentryAndroidOptions) {
        this.f15544a = 4;
        this.f15545b = systemEventsBreadcrumbsIntegration;
        this.f15547d = b1Var;
        this.f15546c = sentryAndroidOptions;
    }

    /* JADX WARN: Finally extract failed */
    @Override // java.lang.Runnable
    public final void run() {
        io.sentry.r a7;
        switch (this.f15544a) {
            case 0:
                SendCachedEnvelopeIntegration sendCachedEnvelopeIntegration = (SendCachedEnvelopeIntegration) this.f15545b;
                SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) this.f15546c;
                io.sentry.b1 b1Var = (io.sentry.b1) this.f15547d;
                try {
                    if (sendCachedEnvelopeIntegration.f15504i.get()) {
                        sentryAndroidOptions.getLogger().h(b5.INFO, "SendCachedEnvelopeIntegration, not trying to send after closing.", new Object[0]);
                        return;
                    }
                    if (!sendCachedEnvelopeIntegration.f15503h.getAndSet(true)) {
                        io.sentry.p0 connectionStatusProvider = sentryAndroidOptions.getConnectionStatusProvider();
                        sendCachedEnvelopeIntegration.f15499d = connectionStatusProvider;
                        connectionStatusProvider.X(sendCachedEnvelopeIntegration);
                        sendCachedEnvelopeIntegration.f15502g = sendCachedEnvelopeIntegration.f15496a.a(b1Var, sentryAndroidOptions);
                    }
                    io.sentry.p0 p0Var = sendCachedEnvelopeIntegration.f15499d;
                    if (p0Var != null && p0Var.T() == io.sentry.n0.DISCONNECTED) {
                        sentryAndroidOptions.getLogger().h(b5.INFO, "SendCachedEnvelopeIntegration, no connection.", new Object[0]);
                        return;
                    }
                    e5.j d10 = b1Var.d();
                    if (d10 != null && d10.k(io.sentry.l.All)) {
                        sentryAndroidOptions.getLogger().h(b5.INFO, "SendCachedEnvelopeIntegration, rate limiting active.", new Object[0]);
                        return;
                    }
                    androidx.credentials.playservices.c cVar = sendCachedEnvelopeIntegration.f15502g;
                    if (cVar == null) {
                        sentryAndroidOptions.getLogger().h(b5.ERROR, "SendCachedEnvelopeIntegration factory is null.", new Object[0]);
                        return;
                    } else {
                        cVar.a();
                        return;
                    }
                } catch (Throwable th2) {
                    sentryAndroidOptions.getLogger().e(b5.ERROR, "Failed trying to send cached events.", th2);
                    return;
                }
            case 1:
                q4 q4Var = (q4) this.f15545b;
                Runnable runnable = (Runnable) this.f15546c;
                String str = (String) this.f15547d;
                q4Var.getClass();
                try {
                    runnable.run();
                    return;
                } catch (Throwable unused) {
                    if (str != null) {
                        ((SentryAndroidOptions) q4Var.f893c).getLogger().h(b5.WARNING, "Failed to execute ".concat(str), new Object[0]);
                        return;
                    }
                    return;
                }
            case 2:
                h hVar = (h) this.f15545b;
                b6 b6Var = (b6) this.f15546c;
                io.sentry.b1 b1Var2 = (io.sentry.b1) this.f15547d;
                ArrayList arrayList = hVar.f15607m;
                if (hVar.f15610p.get()) {
                    return;
                }
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                a7 = hVar.f15616w.a();
                try {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        f3 f3Var = (f3) it.next();
                        arrayList2.add(new g3(f3Var.f16393a, f3Var.f16394b, f3Var.f16396d, f3Var.f16395c, Double.valueOf(f3Var.f16397e), f3Var.f16398f, b6Var));
                    }
                    arrayList.clear();
                    a7.close();
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        b1Var2.k((g3) it2.next());
                    }
                    return;
                } catch (Throwable th3) {
                }
            case 3:
                EnvelopeFileObserverIntegration envelopeFileObserverIntegration = (EnvelopeFileObserverIntegration) this.f15545b;
                b6 b6Var2 = (b6) this.f15546c;
                String str2 = (String) this.f15547d;
                a7 = envelopeFileObserverIntegration.f15486d.a();
                try {
                    if (!envelopeFileObserverIntegration.f15485c) {
                        envelopeFileObserverIntegration.c(b6Var2, str2);
                    }
                    a7.close();
                    return;
                } finally {
                    try {
                        a7.close();
                        throw th3;
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                }
            default:
                SystemEventsBreadcrumbsIntegration systemEventsBreadcrumbsIntegration = (SystemEventsBreadcrumbsIntegration) this.f15545b;
                io.sentry.b1 b1Var3 = (io.sentry.b1) this.f15547d;
                SentryAndroidOptions sentryAndroidOptions2 = (SentryAndroidOptions) this.f15546c;
                a7 = systemEventsBreadcrumbsIntegration.f15514k.a();
                try {
                    if (!systemEventsBreadcrumbsIntegration.f15510f && !systemEventsBreadcrumbsIntegration.f15511g && systemEventsBreadcrumbsIntegration.f15506b == null) {
                        systemEventsBreadcrumbsIntegration.f15506b = new i1(systemEventsBreadcrumbsIntegration, b1Var3, sentryAndroidOptions2);
                        if (systemEventsBreadcrumbsIntegration.f15512h == null) {
                            systemEventsBreadcrumbsIntegration.f15512h = new IntentFilter();
                            for (String str3 : systemEventsBreadcrumbsIntegration.f15509e) {
                                systemEventsBreadcrumbsIntegration.f15512h.addAction(str3);
                            }
                        }
                        if (systemEventsBreadcrumbsIntegration.f15513i == null) {
                            systemEventsBreadcrumbsIntegration.f15513i = new HandlerThread("SystemEventsReceiver", 10);
                            systemEventsBreadcrumbsIntegration.f15513i.start();
                        }
                        try {
                            m0.i(systemEventsBreadcrumbsIntegration.f15505a, new n0(sentryAndroidOptions2.getLogger()), systemEventsBreadcrumbsIntegration.f15506b, systemEventsBreadcrumbsIntegration.f15512h, new Handler(systemEventsBreadcrumbsIntegration.f15513i.getLooper()));
                            if (!systemEventsBreadcrumbsIntegration.j.getAndSet(true)) {
                                sentryAndroidOptions2.getLogger().h(b5.DEBUG, "SystemEventsBreadcrumbsIntegration installed.", new Object[0]);
                                rh.g.a("SystemEventsBreadcrumbs");
                            }
                        } catch (Throwable th5) {
                            sentryAndroidOptions2.setEnableSystemEventBreadcrumbs(false);
                            sentryAndroidOptions2.getLogger().e(b5.ERROR, "Failed to initialize SystemEventsBreadcrumbsIntegration.", th5);
                        }
                    }
                    a7.close();
                    return;
                } finally {
                }
        }
    }

    public /* synthetic */ b1(Object obj, Object obj2, Object obj3, int i5) {
        this.f15544a = i5;
        this.f15545b = obj;
        this.f15546c = obj2;
        this.f15547d = obj3;
    }
}

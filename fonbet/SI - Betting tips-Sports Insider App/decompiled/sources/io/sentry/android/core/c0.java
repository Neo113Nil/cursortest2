package io.sentry.android.core;

import android.content.res.Configuration;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.sentry.b5;
import io.sentry.b6;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class c0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15551a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f15552b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f15553c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f15554d;

    public /* synthetic */ c0(AppComponentsBreadcrumbsIntegration appComponentsBreadcrumbsIntegration, long j, Configuration configuration) {
        this.f15553c = appComponentsBreadcrumbsIntegration;
        this.f15552b = j;
        this.f15554d = configuration;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15551a) {
            case 0:
                AppComponentsBreadcrumbsIntegration appComponentsBreadcrumbsIntegration = (AppComponentsBreadcrumbsIntegration) this.f15553c;
                Configuration configuration = (Configuration) this.f15554d;
                if (appComponentsBreadcrumbsIntegration.f15476b != null) {
                    int i5 = appComponentsBreadcrumbsIntegration.f15475a.getResources().getConfiguration().orientation;
                    io.sentry.protocol.e eVar = i5 != 1 ? i5 != 2 ? null : io.sentry.protocol.e.LANDSCAPE : io.sentry.protocol.e.PORTRAIT;
                    String lowerCase = eVar != null ? eVar.name().toLowerCase(Locale.ROOT) : StringUtils.UNDEFINED;
                    io.sentry.e eVar2 = new io.sentry.e(this.f15552b);
                    eVar2.f16334e = "navigation";
                    eVar2.f16336g = "device.orientation";
                    eVar2.c(lowerCase, "position");
                    eVar2.f16338i = b5.INFO;
                    io.sentry.h0 h0Var = new io.sentry.h0();
                    h0Var.d(configuration, "android:configuration");
                    appComponentsBreadcrumbsIntegration.f15476b.h(eVar2, h0Var);
                    return;
                }
                return;
            default:
                io.sentry.android.replay.capture.g gVar = (io.sentry.android.replay.capture.g) this.f15553c;
                io.sentry.android.replay.m mVar = (io.sentry.android.replay.m) this.f15554d;
                io.sentry.android.replay.j jVar = gVar.f15982h;
                if (jVar != null) {
                    mVar.invoke(jVar, Long.valueOf(this.f15552b));
                }
                long d10 = gVar.f16004t.d() - gVar.f16002r.getSessionReplay().f16406g;
                io.sentry.android.replay.j jVar2 = gVar.f15982h;
                String t3 = jVar2 != null ? jVar2.t(d10) : null;
                io.sentry.android.replay.capture.b bVar = gVar.f15985l;
                ag.u property = io.sentry.android.replay.capture.c.q[2];
                bVar.getClass();
                Intrinsics.checkNotNullParameter(property, "property");
                Object andSet = bVar.f15972b.getAndSet(t3);
                if (!Intrinsics.areEqual(andSet, t3)) {
                    io.sentry.android.replay.capture.a aVar = new io.sentry.android.replay.capture.a(andSet, t3, bVar.f15974d, 4);
                    io.sentry.android.replay.capture.c cVar = bVar.f15973c;
                    b6 b6Var = cVar.f15975a;
                    if (b6Var.getThreadChecker().c()) {
                        ((ScheduledExecutorService) cVar.f15979e.getValue()).submit(new io.sentry.android.replay.util.g(new androidx.core.widget.b(15, aVar), "CaptureStrategy.runInBackground"));
                    } else {
                        try {
                            aVar.invoke();
                        } catch (Throwable th2) {
                            b6Var.getLogger().e(b5.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th2);
                        }
                    }
                }
                ArrayList arrayList = gVar.f16006v;
                Ref.BooleanRef booleanRef = new Ref.BooleanRef();
                kotlin.collections.z.q(arrayList, new io.sentry.android.replay.capture.f(d10, gVar, booleanRef));
                if (booleanRef.element) {
                    Iterator it = arrayList.iterator();
                    int i10 = 0;
                    while (it.hasNext()) {
                        Object next = it.next();
                        int i11 = i10 + 1;
                        if (i10 < 0) {
                            kotlin.collections.u.j();
                            throw null;
                        }
                        io.sentry.android.replay.capture.i iVar = (io.sentry.android.replay.capture.i) next;
                        iVar.f16007a.f16323t = i10;
                        List<io.sentry.rrweb.b> list = iVar.f16008b.f16685b;
                        if (list != null) {
                            for (io.sentry.rrweb.b bVar2 : list) {
                                if (bVar2 instanceof io.sentry.rrweb.m) {
                                    ((io.sentry.rrweb.m) bVar2).f17038d = i10;
                                }
                            }
                        }
                        i10 = i11;
                    }
                    return;
                }
                return;
        }
    }

    public /* synthetic */ c0(io.sentry.android.replay.capture.g gVar, io.sentry.android.replay.m mVar, long j) {
        this.f15553c = gVar;
        this.f15554d = mVar;
        this.f15552b = j;
    }
}

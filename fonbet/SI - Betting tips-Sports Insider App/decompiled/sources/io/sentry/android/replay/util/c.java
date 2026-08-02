package io.sentry.android.replay.util;

import android.app.job.JobParameters;
import android.os.Process;
import android.os.StrictMode;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.firebase.messaging.x;
import com.logrocket.core.LogRocketCore;
import com.logrocket.core.f0;
import com.sports.insider.ui.settings.SettingFragment;
import com.sports.insider.ui.views.DrawerMenu;
import com.sports.insider.ui.views.MenuCategory;
import io.sentry.ILogger;
import io.sentry.android.core.w0;
import io.sentry.b5;
import io.sentry.b6;
import io.sentry.protocol.v;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import k2.a0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o8.m;
import o8.n;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16127a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f16128b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f16129c;

    public /* synthetic */ c(int i5, Object obj, Object obj2) {
        this.f16127a = i5;
        this.f16128b = obj;
        this.f16129c = obj2;
    }

    private final void a() {
        m mVar = (m) this.f16128b;
        a9.a aVar = (a9.a) this.f16129c;
        synchronized (mVar) {
            try {
                if (mVar.f21132b == null) {
                    mVar.f21131a.add(aVar);
                } else {
                    mVar.f21132b.add(aVar.get());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        io.sentry.clientreport.a aVar;
        switch (this.f16127a) {
            case 0:
                io.sentry.android.core.f fVar = (io.sentry.android.core.f) this.f16128b;
                b6 b6Var = (b6) this.f16129c;
                try {
                    fVar.run();
                    return;
                } catch (Throwable th2) {
                    b6Var.getLogger().e(b5.ERROR, "Failed to execute task ReplayIntegration.finalize_previous_replay", th2);
                    return;
                }
            case 1:
                Runnable runnable = (Runnable) this.f16128b;
                f fVar2 = (f) this.f16129c;
                try {
                    runnable.run();
                    return;
                } catch (Throwable th3) {
                    ILogger logger = fVar2.f16132b.getLogger();
                    b5 b5Var = b5.ERROR;
                    StringBuilder sb2 = new StringBuilder("Failed to execute task ");
                    sb2.append(runnable instanceof g ? ((g) runnable).f16133a : "");
                    logger.e(b5Var, sb2.toString(), th3);
                    return;
                }
            case 2:
                io.sentry.cache.g gVar = (io.sentry.cache.g) this.f16128b;
                b5 b5Var2 = (b5) this.f16129c;
                if (b5Var2 == null) {
                    gVar.k("level.json");
                    return;
                } else {
                    gVar.p(b5Var2, "level.json");
                    return;
                }
            case 3:
                io.sentry.cache.g gVar2 = (io.sentry.cache.g) this.f16128b;
                try {
                    ((io.sentry.cache.tape.e) gVar2.f16255b.a()).c((io.sentry.e) this.f16129c);
                    return;
                } catch (IOException e7) {
                    gVar2.f16254a.getLogger().e(b5.ERROR, "Failed to add breadcrumb to file queue", e7);
                    return;
                }
            case 4:
                ((io.sentry.cache.g) this.f16128b).p((io.sentry.protocol.c) this.f16129c, "contexts.json");
                return;
            case 5:
                ((io.sentry.cache.g) this.f16128b).p((v) this.f16129c, "replay.json");
                return;
            case 6:
                io.sentry.cache.g gVar3 = (io.sentry.cache.g) this.f16128b;
                String str = (String) this.f16129c;
                if (str == null) {
                    gVar3.k("transaction.json");
                    return;
                } else {
                    gVar3.p(str, "transaction.json");
                    return;
                }
            case 7:
                io.sentry.cache.g gVar4 = (io.sentry.cache.g) this.f16128b;
                try {
                    ((Runnable) this.f16129c).run();
                    return;
                } catch (Throwable th4) {
                    gVar4.f16254a.getLogger().e(b5.ERROR, "Serialization task failed", th4);
                    return;
                }
            case 8:
                Runnable runnable2 = (Runnable) this.f16128b;
                a0 a0Var = (a0) this.f16129c;
                try {
                    runnable2.run();
                    return;
                } finally {
                    a0Var.c();
                }
            case 9:
                List list = (List) this.f16128b;
                k3.f fVar3 = (k3.f) this.f16129c;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((j3.a) it.next()).a(fVar3.f18801e);
                }
                return;
            case 10:
                JobInfoSchedulerService jobInfoSchedulerService = (JobInfoSchedulerService) this.f16128b;
                JobParameters jobParameters = (JobParameters) this.f16129c;
                int i5 = JobInfoSchedulerService.f4186a;
                jobInfoSchedulerService.jobFinished(jobParameters, false);
                return;
            case 11:
                ((mg.e) ((mg.f) this.f16128b)).g((mg.b) this.f16129c, Unit.f19194a);
                return;
            case 12:
                f3.v vVar = (f3.v) this.f16128b;
                String uuid = ((UUID) this.f16129c).toString();
                Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
                n3.j.a(vVar, uuid);
                return;
            case 13:
                a.a.r((SettingFragment) this.f16128b).d((ne.i) this.f16129c);
                return;
            case 14:
                String str2 = (String) this.f16128b;
                o1.m violation = (o1.m) this.f16129c;
                Intrinsics.checkNotNullParameter(violation, "$violation");
                w0.e("FragmentStrictMode", "Policy violation with PENALTY_DEATH in " + str2, violation);
                throw violation;
            case 15:
                n nVar = (n) this.f16128b;
                a9.a aVar2 = (a9.a) this.f16129c;
                if (nVar.f21136b != n.f21134d) {
                    throw new IllegalStateException("provide() can be called only once.");
                }
                synchronized (nVar) {
                    aVar = nVar.f21135a;
                    nVar.f21135a = null;
                    nVar.f21136b = aVar2;
                }
                aVar.getClass();
                return;
            case 16:
                a();
                return;
            case 17:
                p8.a aVar3 = (p8.a) this.f16128b;
                Runnable runnable3 = (Runnable) this.f16129c;
                Process.setThreadPriority(aVar3.f21534c);
                StrictMode.ThreadPolicy threadPolicy = aVar3.f21535d;
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                runnable3.run();
                return;
            case 18:
                Callable callable = (Callable) this.f16128b;
                p8.g gVar5 = (p8.g) ((i2.d) this.f16129c).f10882b;
                try {
                    gVar5.k(callable.call());
                    return;
                } catch (Exception e9) {
                    gVar5.l(e9);
                    return;
                }
            case 19:
                DrawerMenu drawerMenu = (DrawerMenu) this.f16128b;
                String str3 = (String) this.f16129c;
                Function1 function1 = drawerMenu.f7353d;
                if (function1 != null) {
                    function1.invoke(str3);
                }
                drawerMenu.f7350a.remove(str3);
                return;
            case 20:
                MenuCategory menuCategory = (MenuCategory) this.f16128b;
                String str4 = (String) this.f16129c;
                Function1 function12 = menuCategory.j;
                if (function12 != null) {
                    function12.invoke(str4);
                }
                menuCategory.f7710h.remove(str4);
                return;
            default:
                y9.m mVar = (y9.m) this.f16128b;
                f0 f0Var = (f0) this.f16129c;
                AtomicBoolean atomicBoolean = mVar.f25767h;
                x xVar = mVar.f25760a;
                f0 f0Var2 = (f0) xVar.f6182a;
                try {
                    try {
                        mVar.j.o("Starting batch upload.");
                        androidx.appcompat.widget.a g10 = mVar.f25763d.g(f0Var);
                        if ((g10.f676a == 1) && g10.f677b) {
                            mVar.a((ArrayList) g10.f678c, true);
                        }
                    } finally {
                        atomicBoolean.set(false);
                    }
                } catch (y9.l e10) {
                    xVar.K(f0Var2);
                    LogRocketCore logRocketCore = mVar.f25761b;
                    if (logRocketCore != null) {
                        logRocketCore.s(e10.f25758a);
                    }
                }
                return;
        }
    }
}

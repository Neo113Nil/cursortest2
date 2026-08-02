package T4;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Debug;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import r5.C6208b;
import r5.InterfaceC6207a;

/* loaded from: classes2.dex */
public final class c extends Thread {

    /* renamed from: a, reason: collision with root package name */
    public final long f10924a;

    /* renamed from: b, reason: collision with root package name */
    public final long f10925b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f10926c;

    /* renamed from: d, reason: collision with root package name */
    public final b5.d f10927d;

    /* renamed from: e, reason: collision with root package name */
    public final s5.b f10928e;

    /* renamed from: f, reason: collision with root package name */
    public final Context f10929f;

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC6207a f10930g;

    /* renamed from: h, reason: collision with root package name */
    public long f10931h;

    /* renamed from: i, reason: collision with root package name */
    public final AtomicBoolean f10932i;

    /* renamed from: j, reason: collision with root package name */
    public final Runnable f10933j;

    public /* synthetic */ c(long j10, long j11, boolean z10, b5.d dVar, s5.b bVar, Context context, InterfaceC6207a interfaceC6207a, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, z10, dVar, bVar, context, (i10 & 64) != 0 ? new C6208b() : interfaceC6207a);
    }

    public static final void c(c cVar) {
        cVar.f10931h = cVar.f10930g.a();
        cVar.f10932i.set(false);
    }

    public final boolean b() {
        ActivityManager activityManager = (ActivityManager) this.f10929f.getSystemService(ActivityManager.class);
        if (activityManager == null) {
            return true;
        }
        try {
            List<ActivityManager.ProcessErrorStateInfo> processesInErrorState = activityManager.getProcessesInErrorState();
            if (processesInErrorState != null) {
                List<ActivityManager.ProcessErrorStateInfo> list = processesInErrorState;
                if ((list instanceof Collection) && list.isEmpty()) {
                    return false;
                }
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    if (((ActivityManager.ProcessErrorStateInfo) it.next()).condition == 2) {
                        return true;
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        Object m147constructorimpl;
        this.f10933j.run();
        while (!isInterrupted()) {
            this.f10928e.b(this.f10933j);
            try {
                try {
                    Thread.sleep(this.f10925b);
                    if (this.f10930g.a() - this.f10931h > this.f10924a) {
                        if (!this.f10926c && (Debug.isDebuggerConnected() || Debug.waitingForDebugger())) {
                            this.f10932i.set(true);
                        } else if (b() && this.f10932i.compareAndSet(false, true)) {
                            this.f10927d.a(new f("Application Not Responding for at least " + this.f10924a + " ms.", this.f10928e.a()));
                        }
                    }
                } catch (InterruptedException unused) {
                    Result.Companion companion = Result.INSTANCE;
                    Thread.currentThread().interrupt();
                    m147constructorimpl = Result.m147constructorimpl(Unit.INSTANCE);
                    Result.m150exceptionOrNullimpl(m147constructorimpl);
                    return;
                }
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                m147constructorimpl = Result.m147constructorimpl(ResultKt.createFailure(th2));
                Result.m150exceptionOrNullimpl(m147constructorimpl);
                return;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(long j10, long j11, boolean z10, b5.d monitorListener, s5.b uiHandler, Context context, InterfaceC6207a clock) {
        super("|ANR-WatchDog|");
        Intrinsics.checkNotNullParameter(monitorListener, "monitorListener");
        Intrinsics.checkNotNullParameter(uiHandler, "uiHandler");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(clock, "clock");
        this.f10924a = j10;
        this.f10925b = j11;
        this.f10926c = z10;
        this.f10927d = monitorListener;
        this.f10928e = uiHandler;
        this.f10929f = context;
        this.f10930g = clock;
        this.f10932i = new AtomicBoolean(false);
        this.f10933j = new Runnable() { // from class: T4.b
            @Override // java.lang.Runnable
            public final void run() {
                c.c(c.this);
            }
        };
        long j12 = 2;
        if (j10 >= j11 * j12) {
            return;
        }
        throw new IllegalArgumentException(("ANRWatchDog: timeoutIntervalMillis has to be at least " + (j11 * j12) + " ms").toString());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(long j10, boolean z10, b5.d monitorListener, Context context) {
        this(j10, 500L, z10, monitorListener, new s5.b(null, 1, null), context, null, 64, null);
        Intrinsics.checkNotNullParameter(monitorListener, "monitorListener");
        Intrinsics.checkNotNullParameter(context, "context");
    }
}

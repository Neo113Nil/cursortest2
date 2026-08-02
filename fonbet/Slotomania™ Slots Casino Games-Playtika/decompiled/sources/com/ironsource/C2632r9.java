package com.ironsource;

import android.os.Handler;
import com.ironsource.environment.thread.IronSourceThreadManager;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.r9, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2632r9 {
    private final Handler a;

    /* renamed from: com.ironsource.r9$a */
    public static final class a extends AbstractRunnableC2512ke {
        final /* synthetic */ Runnable b;

        a(Runnable runnable) {
            this.b = runnable;
        }

        @Override // com.ironsource.AbstractRunnableC2512ke
        public void a() {
            this.b.run();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C2632r9() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v6, types: [com.ironsource.ke] */
    private final void c(Runnable runnable) {
        a aVar = runnable instanceof AbstractRunnableC2512ke ? (AbstractRunnableC2512ke) runnable : new a(runnable);
        if (Thread.currentThread().getId() == this.a.getLooper().getThread().getId()) {
            aVar.run();
        } else {
            a(this, aVar, 0L, 2, null);
        }
    }

    public final Handler a() {
        return this.a;
    }

    public final void b(Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        c(runnable);
    }

    public C2632r9(Handler handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.a = handler;
    }

    public static /* synthetic */ void a(C2632r9 c2632r9, AbstractRunnableC2512ke abstractRunnableC2512ke, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        c2632r9.a(abstractRunnableC2512ke, j);
    }

    public /* synthetic */ C2632r9(Handler handler, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new Handler(IronSourceThreadManager.INSTANCE.getSharedManagersThread().getLooper()) : handler);
    }

    public final void a(AbstractRunnableC2512ke task, long j) {
        Intrinsics.checkNotNullParameter(task, "task");
        this.a.postDelayed(task, j);
    }

    public final void a(AbstractRunnableC2512ke task) {
        Intrinsics.checkNotNullParameter(task, "task");
        this.a.removeCallbacks(task);
    }

    public final void a(Runnable callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        c(callback);
    }
}

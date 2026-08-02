package com.ironsource;

import android.os.Handler;
import android.os.Looper;
import com.ironsource.Ef;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;

/* loaded from: classes3.dex */
public final class S6 implements Ef {
    private final a a;

    public interface a {

        /* renamed from: com.ironsource.S6$a$a, reason: collision with other inner class name */
        public interface InterfaceC0185a {
            void cancel();
        }

        InterfaceC0185a a(Runnable runnable, long j);
    }

    public static final class b extends AbstractRunnableC2512ke {
        final /* synthetic */ Runnable b;

        b(Runnable runnable) {
            this.b = runnable;
        }

        @Override // com.ironsource.AbstractRunnableC2512ke
        public void a() {
            this.b.run();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public S6() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.ironsource.Ef
    public Ef.a a(Runnable task, long j) {
        Intrinsics.checkNotNullParameter(task, "task");
        return new Ef.a(this.a.a(a(task), Duration.m12538getInWholeMillisecondsimpl(j)));
    }

    public S6(a handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.a = handler;
    }

    public /* synthetic */ S6(a aVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? T6.a(new Handler(Looper.getMainLooper())) : aVar);
    }

    @Override // com.ironsource.Ef
    public Ef.a a(Ef.b task, long j) {
        Intrinsics.checkNotNullParameter(task, "task");
        return a(task.a(), j);
    }

    private final AbstractRunnableC2512ke a(Runnable runnable) {
        return runnable instanceof AbstractRunnableC2512ke ? (AbstractRunnableC2512ke) runnable : new b(runnable);
    }
}

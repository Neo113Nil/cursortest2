package jm0;

import B5.r;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class d implements b {

    public static final class a implements i {

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f70212a = new AtomicBoolean();

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ScheduledFuture<?> f70213b;

        a(ScheduledFuture<?> scheduledFuture) {
            this.f70213b = scheduledFuture;
        }

        @Override // jm0.i
        public final void dispose() {
            if (this.f70212a.compareAndSet(false, true)) {
                this.f70213b.cancel(false);
            }
        }
    }

    @Override // jm0.b
    public final void a(final Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        e.b().execute(new Runnable(block) { // from class: jm0.c

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ AbstractC7737t f70211a;

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.f70211a = (AbstractC7737t) block;
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.t] */
            @Override // java.lang.Runnable
            public final void run() {
                this.f70211a.invoke();
            }
        });
    }

    @Override // jm0.b
    public final i b(long j11, TimeUnit timeUnit, Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        Intrinsics.checkNotNullParameter(block, "block");
        return new a(e.a().schedule(new r(block, 1), j11, timeUnit));
    }
}

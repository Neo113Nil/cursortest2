package jm0;

import B90.q0;
import android.os.Handler;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class g implements b {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Handler f70224a;

    g(Handler handler) {
        this.f70224a = handler;
    }

    @Override // jm0.b
    public final void a(final Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        this.f70224a.post(new Runnable(block) { // from class: jm0.f

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ AbstractC7737t f70223a;

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.f70223a = (AbstractC7737t) block;
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.t] */
            @Override // java.lang.Runnable
            public final void run() {
                this.f70223a.invoke();
            }
        });
    }

    @Override // jm0.b
    public final i b(long j11, TimeUnit timeUnit, Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        Intrinsics.checkNotNullParameter(block, "block");
        long millis = timeUnit.toMillis(j11);
        this.f70224a.postDelayed(new q0(block, 3), millis);
        return new k();
    }
}

package io.sentry.android.replay.capture;

import io.sentry.I2;
import io.sentry.W2;
import io.sentry.X2;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class h implements id.f<Object, X2.b> {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicReference<X2.b> f67481a = new AtomicReference<>(null);

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ io.sentry.android.replay.capture.a f67482b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ io.sentry.android.replay.capture.a f67483c;

    public static final class a extends AbstractC7737t implements Function0<Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f67484b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f67485c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ io.sentry.android.replay.capture.a f67486d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Object obj, Object obj2, io.sentry.android.replay.capture.a aVar) {
            super(0);
            this.f67484b = obj;
            this.f67485c = obj2;
            this.f67486d = aVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            io.sentry.android.replay.j n11 = this.f67486d.n();
            if (n11 != null) {
                n11.t("replay.type", String.valueOf(this.f67485c));
            }
            return Unit.f71690a;
        }
    }

    public h(io.sentry.android.replay.capture.a aVar, io.sentry.android.replay.capture.a aVar2) {
        this.f67482b = aVar;
        this.f67483c = aVar2;
    }

    @Override // id.e
    public final X2.b getValue(Object obj, kotlin.reflect.m<?> property) {
        Intrinsics.checkNotNullParameter(property, "property");
        return this.f67481a.get();
    }

    @Override // id.f
    public final void setValue(Object obj, kotlin.reflect.m<?> property, X2.b bVar) {
        W2 w22;
        W2 w23;
        Intrinsics.checkNotNullParameter(property, "property");
        X2.b andSet = this.f67481a.getAndSet(bVar);
        if (Intrinsics.d(andSet, bVar)) {
            return;
        }
        a aVar = new a(andSet, bVar, this.f67483c);
        io.sentry.android.replay.capture.a aVar2 = this.f67482b;
        w22 = aVar2.f67448a;
        if (w22.getThreadChecker().a()) {
            io.sentry.android.replay.capture.a.l(aVar2).submit(new io.sentry.android.replay.util.i(new g(aVar), "CaptureStrategy.runInBackground"));
            return;
        }
        try {
            aVar.invoke();
        } catch (Throwable th2) {
            w23 = aVar2.f67448a;
            w23.getLogger().a(I2.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th2);
        }
    }
}

package io.sentry.android.replay.capture;

import io.sentry.I2;
import io.sentry.W2;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class j implements id.f<Object, io.sentry.android.replay.t> {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicReference<io.sentry.android.replay.t> f67488a = new AtomicReference<>(null);

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ io.sentry.android.replay.capture.a f67489b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ io.sentry.android.replay.capture.a f67490c;

    public static final class a extends AbstractC7737t implements Function0<Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f67491b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f67492c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ io.sentry.android.replay.capture.a f67493d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Object obj, Object obj2, io.sentry.android.replay.capture.a aVar) {
            super(0);
            this.f67491b = obj;
            this.f67492c = obj2;
            this.f67493d = aVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            io.sentry.android.replay.t tVar = (io.sentry.android.replay.t) this.f67492c;
            if (tVar != null) {
                io.sentry.android.replay.capture.a aVar = this.f67493d;
                io.sentry.android.replay.j n11 = aVar.n();
                if (n11 != null) {
                    n11.t("config.height", String.valueOf(tVar.c()));
                }
                io.sentry.android.replay.j n12 = aVar.n();
                if (n12 != null) {
                    n12.t("config.width", String.valueOf(tVar.d()));
                }
                io.sentry.android.replay.j n13 = aVar.n();
                if (n13 != null) {
                    n13.t("config.frame-rate", String.valueOf(tVar.b()));
                }
                io.sentry.android.replay.j n14 = aVar.n();
                if (n14 != null) {
                    n14.t("config.bit-rate", String.valueOf(tVar.a()));
                }
            }
            return Unit.f71690a;
        }
    }

    public j(io.sentry.android.replay.capture.a aVar, io.sentry.android.replay.capture.a aVar2) {
        this.f67489b = aVar;
        this.f67490c = aVar2;
    }

    @Override // id.e
    public final io.sentry.android.replay.t getValue(Object obj, kotlin.reflect.m<?> property) {
        Intrinsics.checkNotNullParameter(property, "property");
        return this.f67488a.get();
    }

    @Override // id.f
    public final void setValue(Object obj, kotlin.reflect.m<?> property, io.sentry.android.replay.t tVar) {
        W2 w22;
        W2 w23;
        Intrinsics.checkNotNullParameter(property, "property");
        io.sentry.android.replay.t andSet = this.f67488a.getAndSet(tVar);
        if (Intrinsics.d(andSet, tVar)) {
            return;
        }
        a aVar = new a(andSet, tVar, this.f67490c);
        io.sentry.android.replay.capture.a aVar2 = this.f67489b;
        w22 = aVar2.f67448a;
        if (w22.getThreadChecker().a()) {
            io.sentry.android.replay.capture.a.l(aVar2).submit(new io.sentry.android.replay.util.i(new i(aVar), "CaptureStrategy.runInBackground"));
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

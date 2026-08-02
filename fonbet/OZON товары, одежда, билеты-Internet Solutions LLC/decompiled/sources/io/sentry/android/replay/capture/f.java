package io.sentry.android.replay.capture;

import io.sentry.I2;
import io.sentry.W2;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class f implements id.f<Object, Integer> {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicReference<Integer> f67474a = new AtomicReference<>(-1);

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ io.sentry.android.replay.capture.a f67475b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ io.sentry.android.replay.capture.a f67476c;

    public static final class a extends AbstractC7737t implements Function0<Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f67477b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f67478c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ io.sentry.android.replay.capture.a f67479d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Object obj, Object obj2, io.sentry.android.replay.capture.a aVar) {
            super(0);
            this.f67477b = obj;
            this.f67478c = obj2;
            this.f67479d = aVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            io.sentry.android.replay.j n11 = this.f67479d.n();
            if (n11 != null) {
                n11.t("segment.id", String.valueOf(this.f67478c));
            }
            return Unit.f71690a;
        }
    }

    public f(io.sentry.android.replay.capture.a aVar, io.sentry.android.replay.capture.a aVar2) {
        this.f67475b = aVar;
        this.f67476c = aVar2;
    }

    @Override // id.e
    public final Integer getValue(Object obj, kotlin.reflect.m<?> property) {
        Intrinsics.checkNotNullParameter(property, "property");
        return this.f67474a.get();
    }

    @Override // id.f
    public final void setValue(Object obj, kotlin.reflect.m<?> property, Integer num) {
        W2 w22;
        W2 w23;
        Intrinsics.checkNotNullParameter(property, "property");
        Integer andSet = this.f67474a.getAndSet(num);
        if (Intrinsics.d(andSet, num)) {
            return;
        }
        a aVar = new a(andSet, num, this.f67476c);
        io.sentry.android.replay.capture.a aVar2 = this.f67475b;
        w22 = aVar2.f67448a;
        if (w22.getThreadChecker().a()) {
            io.sentry.android.replay.capture.a.l(aVar2).submit(new io.sentry.android.replay.util.i(new e(aVar), "CaptureStrategy.runInBackground"));
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

package io.sentry.android.replay.capture;

import io.sentry.I2;
import io.sentry.W2;
import java.util.Date;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class l implements id.f<Object, Date> {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicReference<Date> f67495a = new AtomicReference<>(null);

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ io.sentry.android.replay.capture.a f67496b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ io.sentry.android.replay.capture.a f67497c;

    public static final class a extends AbstractC7737t implements Function0<Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f67498b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f67499c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ io.sentry.android.replay.capture.a f67500d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Object obj, Object obj2, io.sentry.android.replay.capture.a aVar) {
            super(0);
            this.f67498b = obj;
            this.f67499c = obj2;
            this.f67500d = aVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            Date date = (Date) this.f67499c;
            io.sentry.android.replay.j n11 = this.f67500d.n();
            if (n11 != null) {
                n11.t("segment.timestamp", date == null ? null : io.sentry.vendor.gson.internal.bind.util.a.b(date));
            }
            return Unit.f71690a;
        }
    }

    public l(io.sentry.android.replay.capture.a aVar, io.sentry.android.replay.capture.a aVar2) {
        this.f67496b = aVar;
        this.f67497c = aVar2;
    }

    @Override // id.e
    public final Date getValue(Object obj, kotlin.reflect.m<?> property) {
        Intrinsics.checkNotNullParameter(property, "property");
        return this.f67495a.get();
    }

    @Override // id.f
    public final void setValue(Object obj, kotlin.reflect.m<?> property, Date date) {
        W2 w22;
        W2 w23;
        Intrinsics.checkNotNullParameter(property, "property");
        Date andSet = this.f67495a.getAndSet(date);
        if (Intrinsics.d(andSet, date)) {
            return;
        }
        a aVar = new a(andSet, date, this.f67497c);
        io.sentry.android.replay.capture.a aVar2 = this.f67496b;
        w22 = aVar2.f67448a;
        if (w22.getThreadChecker().a()) {
            io.sentry.android.replay.capture.a.l(aVar2).submit(new io.sentry.android.replay.util.i(new k(aVar), "CaptureStrategy.runInBackground"));
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

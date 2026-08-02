package io.sentry.android.replay.capture;

import io.sentry.I2;
import io.sentry.W2;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class d implements id.f<Object, io.sentry.protocol.t> {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicReference<io.sentry.protocol.t> f67467a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ io.sentry.android.replay.capture.a f67468b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ io.sentry.android.replay.capture.a f67469c;

    public static final class a extends AbstractC7737t implements Function0<Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f67470b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f67471c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ io.sentry.android.replay.capture.a f67472d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Object obj, Object obj2, io.sentry.android.replay.capture.a aVar) {
            super(0);
            this.f67470b = obj;
            this.f67471c = obj2;
            this.f67472d = aVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            io.sentry.android.replay.j n11 = this.f67472d.n();
            if (n11 != null) {
                n11.t("replay.id", String.valueOf(this.f67471c));
            }
            return Unit.f71690a;
        }
    }

    public d(io.sentry.protocol.t tVar, io.sentry.android.replay.capture.a aVar, io.sentry.android.replay.capture.a aVar2) {
        this.f67468b = aVar;
        this.f67469c = aVar2;
        this.f67467a = new AtomicReference<>(tVar);
    }

    @Override // id.e
    public final io.sentry.protocol.t getValue(Object obj, kotlin.reflect.m<?> property) {
        Intrinsics.checkNotNullParameter(property, "property");
        return this.f67467a.get();
    }

    @Override // id.f
    public final void setValue(Object obj, kotlin.reflect.m<?> property, io.sentry.protocol.t tVar) {
        W2 w22;
        W2 w23;
        Intrinsics.checkNotNullParameter(property, "property");
        io.sentry.protocol.t andSet = this.f67467a.getAndSet(tVar);
        if (Intrinsics.d(andSet, tVar)) {
            return;
        }
        a aVar = new a(andSet, tVar, this.f67469c);
        io.sentry.android.replay.capture.a aVar2 = this.f67468b;
        w22 = aVar2.f67448a;
        if (w22.getThreadChecker().a()) {
            io.sentry.android.replay.capture.a.l(aVar2).submit(new io.sentry.android.replay.util.i(new c(aVar), "CaptureStrategy.runInBackground"));
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

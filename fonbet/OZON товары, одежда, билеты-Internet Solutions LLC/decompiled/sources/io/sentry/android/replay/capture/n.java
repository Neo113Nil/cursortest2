package io.sentry.android.replay.capture;

import io.sentry.I2;
import io.sentry.W2;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class n implements id.f<Object, String> {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicReference<String> f67502a = new AtomicReference<>(null);

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ io.sentry.android.replay.capture.a f67503b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ io.sentry.android.replay.capture.a f67504c;

    public static final class a extends AbstractC7737t implements Function0<Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f67505b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f67506c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ io.sentry.android.replay.capture.a f67507d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Object obj, Object obj2, io.sentry.android.replay.capture.a aVar) {
            super(0);
            this.f67505b = obj;
            this.f67506c = obj2;
            this.f67507d = aVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            io.sentry.android.replay.j n11 = this.f67507d.n();
            if (n11 != null) {
                n11.t("replay.screen-at-start", String.valueOf(this.f67506c));
            }
            return Unit.f71690a;
        }
    }

    public n(io.sentry.android.replay.capture.a aVar, io.sentry.android.replay.capture.a aVar2) {
        this.f67503b = aVar;
        this.f67504c = aVar2;
    }

    @Override // id.e
    public final String getValue(Object obj, kotlin.reflect.m<?> property) {
        Intrinsics.checkNotNullParameter(property, "property");
        return this.f67502a.get();
    }

    @Override // id.f
    public final void setValue(Object obj, kotlin.reflect.m<?> property, String str) {
        W2 w22;
        W2 w23;
        Intrinsics.checkNotNullParameter(property, "property");
        String andSet = this.f67502a.getAndSet(str);
        if (Intrinsics.d(andSet, str)) {
            return;
        }
        a aVar = new a(andSet, str, this.f67504c);
        io.sentry.android.replay.capture.a aVar2 = this.f67503b;
        w22 = aVar2.f67448a;
        if (w22.getThreadChecker().a()) {
            io.sentry.android.replay.capture.a.l(aVar2).submit(new io.sentry.android.replay.util.i(new m(aVar), "CaptureStrategy.runInBackground"));
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

package ru.ozon.app.android.analytics.modules;

import Lm0.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
/* synthetic */ class AuthAnalyticsImpl$startObserveUser$2 extends C7735q implements Function1<Throwable, Unit> {
    AuthAnalyticsImpl$startObserveUser$2(Object obj) {
        super(1, obj, a.b.class, "e", "e(Ljava/lang/Throwable;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
        invoke2(th2);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Throwable th2) {
        ((a.b) this.receiver).e(th2);
    }
}

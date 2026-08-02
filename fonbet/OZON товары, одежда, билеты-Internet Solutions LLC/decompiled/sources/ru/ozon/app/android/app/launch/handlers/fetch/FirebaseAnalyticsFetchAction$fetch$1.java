package ru.ozon.app.android.app.launch.handlers.fetch;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
/* synthetic */ class FirebaseAnalyticsFetchAction$fetch$1 extends C7735q implements Function1<Boolean, Unit> {
    FirebaseAnalyticsFetchAction$fetch$1(Object obj) {
        super(1, obj, FirebaseAnalyticsFetchAction.class, "onResult", "onResult(Z)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return Unit.f71690a;
    }

    public final void invoke(boolean z11) {
        ((FirebaseAnalyticsFetchAction) this.receiver).onResult(z11);
    }
}

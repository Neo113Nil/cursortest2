package ru.ozon.app.android.ugc.widgets.reviewFormMobile.actionHandler;

import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
/* synthetic */ class BaseSendReviewActionHandler$processAction$2 extends C7735q implements Function1<Map<String, ? extends Object>, Unit> {
    BaseSendReviewActionHandler$processAction$2(Object obj) {
        super(1, obj, BaseSendReviewActionHandler.class, "sendSubmitEvent", "sendSubmitEvent(Ljava/util/Map;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Map<String, ? extends Object> map) {
        invoke2(map);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Map<String, ? extends Object> p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        ((BaseSendReviewActionHandler) this.receiver).sendSubmitEvent(p02);
    }
}

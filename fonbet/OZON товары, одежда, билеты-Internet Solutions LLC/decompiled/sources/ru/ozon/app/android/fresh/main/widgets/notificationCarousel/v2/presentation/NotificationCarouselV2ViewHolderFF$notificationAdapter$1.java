package ru.ozon.app.android.fresh.main.widgets.notificationCarousel.v2.presentation;

import WZ.l;
import WZ.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u000e\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lru/ozon/uni/atoms/af/AtomAction;", "atomAction", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "", "invoke", "(Lru/ozon/uni/atoms/af/AtomAction;LWZ/t;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes12.dex */
final class NotificationCarouselV2ViewHolderFF$notificationAdapter$1 extends AbstractC7737t implements Function2<AtomAction, t, Unit> {
    final /* synthetic */ l $tokenizedAnalytics;
    final /* synthetic */ NotificationCarouselV2ViewHolderFF this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NotificationCarouselV2ViewHolderFF$notificationAdapter$1(l lVar, NotificationCarouselV2ViewHolderFF notificationCarouselV2ViewHolderFF) {
        super(2);
        this.$tokenizedAnalytics = lVar;
        this.this$0 = notificationCarouselV2ViewHolderFF;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(AtomAction atomAction, t tVar) {
        invoke2(atomAction, tVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AtomAction atomAction, t tVar) {
        Function1 function1;
        if (tVar != null) {
            TokenizedAnalyticsExtensionsKt.processClickEvents$default(this.$tokenizedAnalytics, tVar, null, 2, null);
        }
        if (atomAction != null) {
            function1 = this.this$0.actionHandler;
            function1.invoke(atomAction);
        }
    }
}

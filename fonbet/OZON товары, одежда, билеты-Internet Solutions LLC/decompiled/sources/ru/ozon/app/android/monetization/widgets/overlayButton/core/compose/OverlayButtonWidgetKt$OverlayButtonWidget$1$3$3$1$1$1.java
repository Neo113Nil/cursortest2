package ru.ozon.app.android.monetization.widgets.overlayButton.core.compose;

import WZ.l;
import WZ.m;
import WZ.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.monetization.widgets.overlayButton.presentation.OverlayButtonVO;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lru/ozon/app/android/monetization/widgets/overlayButton/presentation/OverlayButtonVO;", "<unused var>", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "event", "", "invoke", "(Lru/ozon/app/android/monetization/widgets/overlayButton/presentation/OverlayButtonVO;LWZ/t;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes12.dex */
final class OverlayButtonWidgetKt$OverlayButtonWidget$1$3$3$1$1$1 extends AbstractC7737t implements Function2<OverlayButtonVO, t, Unit> {
    final /* synthetic */ l $tokenizedAnalytics;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OverlayButtonWidgetKt$OverlayButtonWidget$1$3$3$1$1$1(l lVar) {
        super(2);
        this.$tokenizedAnalytics = lVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(OverlayButtonVO overlayButtonVO, t tVar) {
        invoke2(overlayButtonVO, tVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(OverlayButtonVO overlayButtonVO, t event) {
        Intrinsics.checkNotNullParameter(overlayButtonVO, "<unused var>");
        Intrinsics.checkNotNullParameter(event, "event");
        m.c(this.$tokenizedAnalytics, event, null);
    }
}

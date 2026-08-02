package ru.ozon.app.android.travel.feature.avia.widgets.aviaAddBonusCardForm.presentation;

import WZ.l;
import WZ.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.travel.molecules.extensions.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.travel.molecules.input.v2.CommonInputV2VO;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "isFocused", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
final class AviaAddBonusCardFormContentKt$BonusCardInput$2$1 extends AbstractC7737t implements Function1<Boolean, Unit> {
    final /* synthetic */ CommonInputV2VO.TextInputV2 $bonusCardNumber;
    final /* synthetic */ l $tokenizedAnalytics;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AviaAddBonusCardFormContentKt$BonusCardInput$2$1(CommonInputV2VO.TextInputV2 textInputV2, l lVar) {
        super(1);
        this.$bonusCardNumber = textInputV2;
        this.$tokenizedAnalytics = lVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return Unit.f71690a;
    }

    public final void invoke(boolean z11) {
        t clickEvent;
        l lVar;
        if (!z11 || (clickEvent = this.$bonusCardNumber.getClickEvent()) == null || (lVar = this.$tokenizedAnalytics) == null) {
            return;
        }
        TokenizedAnalyticsExtensionsKt.processEventsWithFilterNonView$default(lVar, clickEvent, null, 2, null);
    }
}

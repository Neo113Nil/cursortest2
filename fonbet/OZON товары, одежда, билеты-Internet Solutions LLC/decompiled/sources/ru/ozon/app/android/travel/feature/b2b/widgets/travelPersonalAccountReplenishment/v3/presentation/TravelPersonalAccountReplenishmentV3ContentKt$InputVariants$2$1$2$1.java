package ru.ozon.app.android.travel.feature.b2b.widgets.travelPersonalAccountReplenishment.v3.presentation;

import WZ.l;
import WZ.t;
import WZ.x;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "atomAction", "Lru/ozon/uni/atoms/af/AtomAction;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class TravelPersonalAccountReplenishmentV3ContentKt$InputVariants$2$1$2$1 extends AbstractC7737t implements Function1<AtomAction, Unit> {
    final /* synthetic */ Function1<AtomAction, Unit> $actionHandler;
    final /* synthetic */ Function1<String, Unit> $onAmountSelected;
    final /* synthetic */ ParsedTag $parsedTag;
    final /* synthetic */ l $tokenizedAnalytics;
    final /* synthetic */ d $widgetInfo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    TravelPersonalAccountReplenishmentV3ContentKt$InputVariants$2$1$2$1(ParsedTag parsedTag, d dVar, Function1<? super AtomAction, Unit> function1, Function1<? super String, Unit> function12, l lVar) {
        super(1);
        this.$parsedTag = parsedTag;
        this.$widgetInfo = dVar;
        this.$actionHandler = function1;
        this.$onAmountSelected = function12;
        this.$tokenizedAnalytics = lVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AtomAction atomAction) {
        invoke2(atomAction);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AtomAction atomAction) {
        l lVar;
        Intrinsics.checkNotNullParameter(atomAction, "atomAction");
        CommonControlSettings common = this.$parsedTag.getDto().getCommon();
        AtomActionDTO action = common != null ? common.getAction() : null;
        CommonControlSettings common2 = this.$parsedTag.getDto().getCommon();
        Map<String, TokenizedTrackingInfo> trackingInfo = common2 != null ? common2.getTrackingInfo() : null;
        if ((action != null ? action.getBehavior() : null) == AtomActionDTO.Behavior.CUSTOM && Intrinsics.d(action.getId(), "updateAmount")) {
            String amountCents = this.$parsedTag.getAmountCents();
            if (amountCents != null) {
                this.$onAmountSelected.invoke(amountCents);
            }
            d dVar = this.$widgetInfo;
            if (dVar != null) {
                t d11 = trackingInfo != null ? x.d(trackingInfo, dVar) : null;
                if (d11 != null && (lVar = this.$tokenizedAnalytics) != null) {
                    TokenizedAnalyticsExtensionsKt.processClickEvents$default(lVar, d11, null, 2, null);
                }
            }
        }
        this.$actionHandler.invoke(atomAction);
    }
}

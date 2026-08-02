package ru.ozon.app.android.bank.widgets.adBanner.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.bank.widgets.adBanner.data.AnalyticEventType;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "atomAction", "Lru/ozon/uni/atoms/af/AtomAction;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class AdBannerItemViewHolder$closeActionHandler$1 extends AbstractC7737t implements Function1<AtomAction, Unit> {
    final /* synthetic */ AdBannerItemViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdBannerItemViewHolder$closeActionHandler$1(AdBannerItemViewHolder adBannerItemViewHolder) {
        super(1);
        this.this$0 = adBannerItemViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AtomAction atomAction) {
        invoke2(atomAction);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AtomAction atomAction) {
        AdBannerItemVO adBannerItemVO;
        Intrinsics.checkNotNullParameter(atomAction, "atomAction");
        if ((atomAction instanceof AtomAction.Click) && (adBannerItemVO = this.this$0.adBannerItemVO) != null) {
            this.this$0.trackAnalyticEvent.invoke(adBannerItemVO, AnalyticEventType.CLOSE);
        }
        this.this$0.actionHandler.invoke(atomAction);
    }
}

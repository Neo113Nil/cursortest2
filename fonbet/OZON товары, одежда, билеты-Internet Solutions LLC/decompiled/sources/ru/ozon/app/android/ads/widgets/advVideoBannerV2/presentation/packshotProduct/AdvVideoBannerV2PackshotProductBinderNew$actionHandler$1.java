package ru.ozon.app.android.ads.widgets.advVideoBannerV2.presentation.packshotProduct;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.ads.widgets.advVideoBannerV2.analytics.AdvVideoBannerV2TrackerAnalyticsDelegate;
import ru.ozon.app.android.ads.widgets.advVideoBannerV2.presentation.AdvBannerVideoV2VO;
import ru.ozon.app.android.ads.widgets.advVideoBannerV2.presentation.AdvVideoBannerV2ViewHolderNew;
import ru.ozon.app.android.ads.widgets.advVideoBannerV2.presentation.AdvVideoBannerV2ViewModelNew;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "atomAction", "Lru/ozon/uni/atoms/af/AtomAction;", "invoke", "(Lru/ozon/uni/atoms/af/AtomAction;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class AdvVideoBannerV2PackshotProductBinderNew$actionHandler$1 extends AbstractC7737t implements Function1<AtomAction, Boolean> {
    final /* synthetic */ AdvVideoBannerV2PackshotProductBinderNew this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdvVideoBannerV2PackshotProductBinderNew$actionHandler$1(AdvVideoBannerV2PackshotProductBinderNew advVideoBannerV2PackshotProductBinderNew) {
        super(1);
        this.this$0 = advVideoBannerV2PackshotProductBinderNew;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(AtomAction atomAction) {
        AdvVideoBannerV2ViewHolderNew advVideoBannerV2ViewHolderNew;
        AdvVideoBannerV2TrackerAnalyticsDelegate.EventType eventType;
        AdvVideoBannerV2ViewModelNew advVideoBannerV2ViewModelNew;
        AdvVideoBannerV2ViewModelNew advVideoBannerV2ViewModelNew2;
        Intrinsics.checkNotNullParameter(atomAction, "atomAction");
        if (atomAction instanceof AtomAction.Move) {
            advVideoBannerV2ViewHolderNew = this.this$0.widgetViewHolder;
            AdvBannerVideoV2VO boundData = advVideoBannerV2ViewHolderNew.getBoundData();
            if (boundData != null) {
                AdvVideoBannerV2PackshotProductBinderNew advVideoBannerV2PackshotProductBinderNew = this.this$0;
                AdvBannerVideoV2VO.PackShotVO packshotVO = boundData.getPackshotVO();
                if (packshotVO == null || (eventType = packshotVO.getEventType()) == null) {
                    return Boolean.TRUE;
                }
                advVideoBannerV2ViewModelNew = advVideoBannerV2PackshotProductBinderNew.viewModel;
                advVideoBannerV2ViewModelNew.onProductClick(boundData.getId());
                advVideoBannerV2ViewModelNew2 = advVideoBannerV2PackshotProductBinderNew.viewModel;
                advVideoBannerV2ViewModelNew2.trackOneTimeEvent(eventType, new AdvVideoBannerV2PackshotProductBinderNew$actionHandler$1$1$1(boundData, advVideoBannerV2PackshotProductBinderNew));
            }
        }
        return Boolean.TRUE;
    }
}

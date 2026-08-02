package ru.ozon.app.android.ads.widgets.advVideoBannerV2.presentation.packshotProduct;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.ads.R$layout;
import ru.ozon.app.android.ads.widgets.advVideoBannerV2.presentation.AdvBannerVideoV2VO;
import ru.ozon.uni.android.component.layout.AsyncFrameLayout;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/uni/android/component/layout/AsyncFrameLayout;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class AdvVideoBannerV2PackshotProductBinderNew$asyncRatioFrameLayout$1 extends AbstractC7737t implements Function0<AsyncFrameLayout> {
    final /* synthetic */ AdvVideoBannerV2PackshotProductBinderNew this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdvVideoBannerV2PackshotProductBinderNew$asyncRatioFrameLayout$1(AdvVideoBannerV2PackshotProductBinderNew advVideoBannerV2PackshotProductBinderNew) {
        super(0);
        this.this$0 = advVideoBannerV2PackshotProductBinderNew;
    }

    @Override // kotlin.jvm.functions.Function0
    public final AsyncFrameLayout invoke() {
        View view;
        View view2;
        AdvBannerVideoV2VO advBannerVideoV2VO;
        AdvBannerVideoV2VO.PackShotVO packshotVO;
        AdvBannerVideoV2VO advBannerVideoV2VO2;
        AdvBannerVideoV2VO.PackShotVO packshotVO2;
        view = this.this$0.containerView;
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        AsyncFrameLayout asyncFrameLayout = new AsyncFrameLayout(context, null, 0, 6, null);
        AdvVideoBannerV2PackshotProductBinderNew advVideoBannerV2PackshotProductBinderNew = this.this$0;
        asyncFrameLayout.inflateAsync(R$layout.widget_adv_video_banner_v2_packshot);
        view2 = advVideoBannerV2PackshotProductBinderNew.containerView;
        Intrinsics.g(view2, "null cannot be cast to non-null type android.view.ViewGroup");
        ((ViewGroup) view2).addView(asyncFrameLayout);
        ViewGroup.LayoutParams layoutParams = asyncFrameLayout.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        advBannerVideoV2VO = advVideoBannerV2PackshotProductBinderNew.item;
        if (advBannerVideoV2VO != null && (packshotVO = advBannerVideoV2VO.getPackshotVO()) != null) {
            marginLayoutParams.setMarginEnd(packshotVO.getMarginEnd());
            advBannerVideoV2VO2 = advVideoBannerV2PackshotProductBinderNew.item;
            if (advBannerVideoV2VO2 != null && (packshotVO2 = advBannerVideoV2VO2.getPackshotVO()) != null) {
                marginLayoutParams.setMarginStart(packshotVO2.getMarginStart());
            }
        }
        asyncFrameLayout.setLayoutParams(marginLayoutParams);
        asyncFrameLayout.invokeWhenInflated(new AdvVideoBannerV2PackshotProductBinderNew$asyncRatioFrameLayout$1$1$2(advVideoBannerV2PackshotProductBinderNew));
        return asyncFrameLayout;
    }
}

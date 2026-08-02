package ru.ozon.app.android.ads.widgets.advVideoBannerV2.presentation.product.preview;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.ads.R$layout;
import ru.ozon.uni.android.component.layout.AsyncFrameLayout;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/uni/android/component/layout/AsyncFrameLayout;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class AdvVideoBannerV2PreviewBinderNew$asyncRatioFrameLayout$1 extends AbstractC7737t implements Function0<AsyncFrameLayout> {
    final /* synthetic */ Context $context;
    final /* synthetic */ AdvVideoBannerV2PreviewBinderNew this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdvVideoBannerV2PreviewBinderNew$asyncRatioFrameLayout$1(Context context, AdvVideoBannerV2PreviewBinderNew advVideoBannerV2PreviewBinderNew) {
        super(0);
        this.$context = context;
        this.this$0 = advVideoBannerV2PreviewBinderNew;
    }

    @Override // kotlin.jvm.functions.Function0
    public final AsyncFrameLayout invoke() {
        View view;
        AsyncFrameLayout asyncFrameLayout = new AsyncFrameLayout(this.$context, null, 0, 6, null);
        AdvVideoBannerV2PreviewBinderNew advVideoBannerV2PreviewBinderNew = this.this$0;
        asyncFrameLayout.inflateAsync(R$layout.videobanner_preview_product_view);
        view = advVideoBannerV2PreviewBinderNew.containerView;
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup != null) {
            viewGroup.addView(asyncFrameLayout);
        }
        asyncFrameLayout.invokeWhenInflated(new AdvVideoBannerV2PreviewBinderNew$asyncRatioFrameLayout$1$1$1(advVideoBannerV2PreviewBinderNew));
        return asyncFrameLayout;
    }
}

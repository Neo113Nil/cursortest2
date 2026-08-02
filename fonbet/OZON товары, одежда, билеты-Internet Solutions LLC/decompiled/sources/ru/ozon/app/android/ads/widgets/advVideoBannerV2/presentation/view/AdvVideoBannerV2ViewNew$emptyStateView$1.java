package ru.ozon.app.android.ads.widgets.advVideoBannerV2.presentation.view;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.ads.R$id;
import ru.ozon.app.android.ads.widgets.advVideoBannerV2.presentation.packshotProduct.emptyState.EmptyStateView;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/ads/widgets/advVideoBannerV2/presentation/packshotProduct/emptyState/EmptyStateView;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class AdvVideoBannerV2ViewNew$emptyStateView$1 extends AbstractC7737t implements Function0<EmptyStateView> {
    final /* synthetic */ Context $context;
    final /* synthetic */ AdvVideoBannerV2ViewNew this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdvVideoBannerV2ViewNew$emptyStateView$1(Context context, AdvVideoBannerV2ViewNew advVideoBannerV2ViewNew) {
        super(0);
        this.$context = context;
        this.this$0 = advVideoBannerV2ViewNew;
    }

    @Override // kotlin.jvm.functions.Function0
    public final EmptyStateView invoke() {
        EmptyStateView emptyStateView = new EmptyStateView(this.$context, null, 0, 0, 14, null);
        emptyStateView.setId(R$id.emptyState);
        ViewExtKt.gone(emptyStateView);
        this.this$0.addView(emptyStateView);
        return emptyStateView;
    }
}

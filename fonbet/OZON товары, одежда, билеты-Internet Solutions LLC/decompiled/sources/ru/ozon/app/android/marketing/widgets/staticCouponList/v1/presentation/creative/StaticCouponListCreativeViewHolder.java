package ru.ozon.app.android.marketing.widgets.staticCouponList.v1.presentation.creative;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.marketing.widgets.staticCouponList.v1.presentation.StaticCouponListVO;
import ru.ozon.app.android.marketing.widgets.staticCouponList.v1.presentation.adapter.StaticCouponListContentAdapter;
import ru.ozon.app.android.marketing.widgets.staticCouponList.v1.presentation.adapter.StaticCouponListContentViewBinder;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/creative/StaticCouponListCreativeViewHolder;", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/adapter/StaticCouponListContentAdapter$ViewHolder;", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListVO$ContentItem$Creative;", "Landroidx/appcompat/widget/AppCompatImageView;", "view", "Landroid/view/View;", "<init>", "(Landroid/view/View;)V", "viewBinder", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/creative/StaticCouponListCreativeViewBinder;", "getViewBinder", "()Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/creative/StaticCouponListCreativeViewBinder;", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class StaticCouponListCreativeViewHolder extends StaticCouponListContentAdapter.ViewHolder<StaticCouponListVO.ContentItem.Creative, AppCompatImageView> {

    @NotNull
    private final StaticCouponListCreativeViewBinder viewBinder;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StaticCouponListCreativeViewHolder(@NotNull View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        this.viewBinder = new StaticCouponListCreativeViewBinder(view);
    }

    @Override // ru.ozon.app.android.marketing.widgets.staticCouponList.v1.presentation.adapter.StaticCouponListContentAdapter.ViewHolder
    @NotNull
    public StaticCouponListContentViewBinder<StaticCouponListVO.ContentItem.Creative, AppCompatImageView> getViewBinder() {
        return this.viewBinder;
    }
}

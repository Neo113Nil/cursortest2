package ru.ozon.app.android.ugc.widgets.reviewsFilter.presentation.adapter.vh;

import android.content.Context;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.reviewsFilter.presentation.ReviewsFilterVO;
import ru.ozon.uni.android.atom.aspect.AspectView;
import ru.ozon.uni.android.atom.productMedia.ProductMediaView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.productMedia.ProductMediaHolderKt;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u0002H\u0016R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewsFilter/presentation/adapter/vh/ReviewsFilterProductViewHolder;", "Lru/ozon/app/android/ugc/widgets/reviewsFilter/presentation/adapter/vh/ReviewsFilterVH;", "Lru/ozon/app/android/ugc/widgets/reviewsFilter/presentation/ReviewsFilterVO$ReviewsFilterItemVO$Image;", "aspectView", "Lru/ozon/uni/android/atom/aspect/AspectView;", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "<init>", "(Lru/ozon/uni/android/atom/aspect/AspectView;Lkotlin/jvm/functions/Function1;)V", "productMediaView", "Lru/ozon/uni/android/atom/productMedia/ProductMediaView;", "bind", "filter", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ReviewsFilterProductViewHolder extends ReviewsFilterVH<ReviewsFilterVO.ReviewsFilterItemVO.Image> {
    public static final int $stable = ProductMediaView.$stable;

    @NotNull
    private final ProductMediaView productMediaView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewsFilterProductViewHolder(@NotNull AspectView aspectView, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        super(aspectView, actionHandler);
        Intrinsics.checkNotNullParameter(aspectView, "aspectView");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Context context = this.itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.productMediaView = new ProductMediaView(context, null, 0, 6, null);
    }

    @Override // ru.ozon.app.android.ugc.widgets.reviewsFilter.presentation.adapter.vh.ReviewsFilterVH
    public void bind(@NotNull ReviewsFilterVO.ReviewsFilterItemVO.Image filter) {
        Intrinsics.checkNotNullParameter(filter, "filter");
        ProductMediaHolderKt.bind$default(this.productMediaView, filter.getProduct(), null, 2, null);
        if (getContentView().indexOfChild(this.productMediaView) == -1) {
            getContentView().addView(this.productMediaView);
        }
        super.bind((ReviewsFilterProductViewHolder) filter);
    }
}

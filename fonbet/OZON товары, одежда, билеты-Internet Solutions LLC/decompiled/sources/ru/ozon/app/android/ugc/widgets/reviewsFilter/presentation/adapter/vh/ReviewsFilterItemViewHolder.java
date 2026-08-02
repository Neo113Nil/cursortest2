package ru.ozon.app.android.ugc.widgets.reviewsFilter.presentation.adapter.vh;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.ugc.widgets.reviewsFilter.presentation.ReviewsFilterVO;
import ru.ozon.uni.android.atom.aspect.AspectView;
import ru.ozon.uni.android.atom.productMedia.ProductMediaView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.productMedia.ProductMediaHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewsFilter/presentation/adapter/vh/ReviewsFilterItemViewHolder;", "Lru/ozon/app/android/ugc/widgets/reviewsFilter/presentation/adapter/vh/ReviewsFilterVH;", "Lru/ozon/app/android/ugc/widgets/reviewsFilter/presentation/ReviewsFilterVO$ReviewsFilterItemVO$Item;", "aspectView", "Lru/ozon/uni/android/atom/aspect/AspectView;", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "<init>", "(Lru/ozon/uni/android/atom/aspect/AspectView;Lkotlin/jvm/functions/Function1;)V", "productMediaView", "Lru/ozon/uni/android/atom/productMedia/ProductMediaView;", "titleView", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "bind", "filter", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ReviewsFilterItemViewHolder extends ReviewsFilterVH<ReviewsFilterVO.ReviewsFilterItemVO.Item> {
    public static final int $stable = TextAtomV2View.$stable | ProductMediaView.$stable;

    @NotNull
    private final ProductMediaView productMediaView;

    @NotNull
    private final TextAtomV2View titleView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewsFilterItemViewHolder(@NotNull AspectView aspectView, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        super(aspectView, actionHandler);
        Intrinsics.checkNotNullParameter(aspectView, "aspectView");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Context context = this.itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.productMediaView = new ProductMediaView(context, null, 0, 6, null);
        Context context2 = this.itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        TextAtomV2View textAtomV2View = new TextAtomV2View(context2, null, 0, 6, null);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        Dimens dimens = Dimens.INSTANCE;
        layoutParams.setMarginStart(dimens.getDP_8());
        textAtomV2View.setLayoutParams(layoutParams);
        textAtomV2View.setMaxWidth(ReviewsFilterVH.INSTANCE.getTitleMaxWidth());
        this.titleView = textAtomV2View;
        LinearLayout contentView = getContentView();
        ViewGroup.LayoutParams layoutParams2 = contentView.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
        if (marginLayoutParams == null) {
            return;
        }
        int i11 = marginLayoutParams.leftMargin;
        int i12 = marginLayoutParams.topMargin;
        int i13 = marginLayoutParams.rightMargin;
        int i14 = marginLayoutParams.bottomMargin;
        marginLayoutParams.setMarginEnd(dimens.getDP_4());
        if (i11 == marginLayoutParams.leftMargin) {
            ViewGroup.LayoutParams layoutParams3 = contentView.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
            if (i12 == (marginLayoutParams2 != null ? marginLayoutParams2.topMargin : 0)) {
                ViewGroup.LayoutParams layoutParams4 = contentView.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams4 : null;
                if (i13 == (marginLayoutParams3 != null ? marginLayoutParams3.rightMargin : 0)) {
                    ViewGroup.LayoutParams layoutParams5 = contentView.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams5 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams5 : null;
                    if (i14 == (marginLayoutParams4 != null ? marginLayoutParams4.bottomMargin : 0)) {
                        return;
                    }
                }
            }
        }
        contentView.setLayoutParams(marginLayoutParams);
    }

    @Override // ru.ozon.app.android.ugc.widgets.reviewsFilter.presentation.adapter.vh.ReviewsFilterVH
    public void bind(@NotNull ReviewsFilterVO.ReviewsFilterItemVO.Item filter) {
        Intrinsics.checkNotNullParameter(filter, "filter");
        if (filter.getProduct() != null) {
            ProductMediaHolderKt.bind$default(this.productMediaView, filter.getProduct(), null, 2, null);
            if (getContentView().indexOfChild(this.productMediaView) == -1) {
                getContentView().addView(this.productMediaView);
            }
        }
        if (filter.getTitle() != null) {
            TextAtomV2View textAtomV2View = this.titleView;
            TextHolderKt.bind$default(textAtomV2View, filter.getTitle(), null, 2, null);
            textAtomV2View.setPadding(0, 0, 0, 0);
            textAtomV2View.setGravity(17);
            if (getContentView().indexOfChild(this.titleView) == -1) {
                getContentView().addView(this.titleView);
            }
        }
        super.bind((ReviewsFilterItemViewHolder) filter);
    }
}

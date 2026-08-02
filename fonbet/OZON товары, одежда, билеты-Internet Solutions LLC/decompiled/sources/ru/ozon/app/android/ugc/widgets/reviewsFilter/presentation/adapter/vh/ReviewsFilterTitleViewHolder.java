package ru.ozon.app.android.ugc.widgets.reviewsFilter.presentation.adapter.vh;

import Bi.a;
import android.content.Context;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.ugc.widgets.reviewsFilter.presentation.ReviewsFilterVO;
import ru.ozon.uni.android.atom.aspect.AspectView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u0002H\u0016R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewsFilter/presentation/adapter/vh/ReviewsFilterTitleViewHolder;", "Lru/ozon/app/android/ugc/widgets/reviewsFilter/presentation/adapter/vh/ReviewsFilterVH;", "Lru/ozon/app/android/ugc/widgets/reviewsFilter/presentation/ReviewsFilterVO$ReviewsFilterItemVO$Title;", "aspectView", "Lru/ozon/uni/android/atom/aspect/AspectView;", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "<init>", "(Lru/ozon/uni/android/atom/aspect/AspectView;Lkotlin/jvm/functions/Function1;)V", "titleView", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "bind", "filter", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ReviewsFilterTitleViewHolder extends ReviewsFilterVH<ReviewsFilterVO.ReviewsFilterItemVO.Title> {
    public static final int $stable = TextAtomV2View.$stable;

    @NotNull
    private final TextAtomV2View titleView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewsFilterTitleViewHolder(@NotNull AspectView aspectView, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        super(aspectView, actionHandler);
        Intrinsics.checkNotNullParameter(aspectView, "aspectView");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Context context = this.itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
        a.d(-1, -1, textAtomV2View);
        textAtomV2View.setMaxWidth(ReviewsFilterVH.INSTANCE.getTitleMaxWidth());
        this.titleView = textAtomV2View;
        ViewGroup.LayoutParams layoutParams = aspectView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.width = Dimens.INSTANCE.getDP_56();
        aspectView.setLayoutParams(layoutParams);
    }

    @Override // ru.ozon.app.android.ugc.widgets.reviewsFilter.presentation.adapter.vh.ReviewsFilterVH
    public void bind(@NotNull ReviewsFilterVO.ReviewsFilterItemVO.Title filter) {
        Intrinsics.checkNotNullParameter(filter, "filter");
        TextAtomV2View textAtomV2View = this.titleView;
        TextHolderKt.bind$default(textAtomV2View, filter.getTitle(), null, 2, null);
        textAtomV2View.setPadding(0, 0, 0, 0);
        textAtomV2View.setGravity(17);
        if (getContentView().indexOfChild(this.titleView) == -1) {
            getContentView().addView(this.titleView);
        }
        super.bind((ReviewsFilterTitleViewHolder) filter);
    }
}

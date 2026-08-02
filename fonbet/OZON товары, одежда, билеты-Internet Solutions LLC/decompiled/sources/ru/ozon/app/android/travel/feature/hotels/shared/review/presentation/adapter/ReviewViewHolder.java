package ru.ozon.app.android.travel.feature.hotels.shared.review.presentation.adapter;

import WZ.t;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import jk0.j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.travel.feature.hotels.databinding.ItemHotelsReviewBinding;
import ru.ozon.app.android.travel.feature.hotels.shared.review.presentation.ReviewVO;
import ru.ozon.app.android.travel.feature.hotels.shared.review.presentation.adapter.reviewBlock.ReviewBlocksAdapter;
import ru.ozon.app.android.travel.feature.hotels.shared.review.presentation.adapter.reviewBlock.ReviewBlocksDecoration;
import ru.ozon.uni.R$style;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikit.view.atoms.avatar.AvatarView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.avatar.AvatarHolderKt;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/shared/review/presentation/adapter/ReviewViewHolder;", "Ljk0/j;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "Landroidx/recyclerview/widget/RecyclerView$u;", "blocksRecyclerViewPool", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "onAction", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;Landroidx/recyclerview/widget/RecyclerView$u;Lkotlin/jvm/functions/Function1;)V", "onViewInVisibleBounds", "()V", "Lru/ozon/app/android/travel/feature/hotels/shared/review/presentation/ReviewVO;", "item", "bind", "(Lru/ozon/app/android/travel/feature/hotels/shared/review/presentation/ReviewVO;)V", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/travel/feature/hotels/databinding/ItemHotelsReviewBinding;", "binding", "Lru/ozon/app/android/travel/feature/hotels/databinding/ItemHotelsReviewBinding;", "Lru/ozon/app/android/travel/feature/hotels/shared/review/presentation/adapter/reviewBlock/ReviewBlocksAdapter;", "blocksAdapter", "Lru/ozon/app/android/travel/feature/hotels/shared/review/presentation/adapter/reviewBlock/ReviewBlocksAdapter;", "boundData", "Lru/ozon/app/android/travel/feature/hotels/shared/review/presentation/ReviewVO;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ReviewViewHolder extends j {

    @NotNull
    private final ItemHotelsReviewBinding binding;

    @NotNull
    private final ReviewBlocksAdapter blocksAdapter;
    private ReviewVO boundData;

    @NotNull
    private final View containerView;

    @NotNull
    private final ComposerReferences references;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewViewHolder(@NotNull View containerView, @NotNull ComposerReferences references, @NotNull RecyclerView.u blocksRecyclerViewPool, @NotNull Function1<? super AtomAction, Unit> onAction) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(blocksRecyclerViewPool, "blocksRecyclerViewPool");
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        this.containerView = containerView;
        this.references = references;
        ItemHotelsReviewBinding bind = ItemHotelsReviewBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        ReviewBlocksAdapter reviewBlocksAdapter = new ReviewBlocksAdapter(onAction);
        this.blocksAdapter = reviewBlocksAdapter;
        RecyclerView recyclerView = bind.hotelsReviewBlocksRv;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setAdapter(reviewBlocksAdapter);
        Context context = recyclerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        recyclerView.addItemDecoration(new ReviewBlocksDecoration(context));
        recyclerView.setRecycledViewPool(blocksRecyclerViewPool);
        bind.hotelsReviewAvatarAv.getBinding().initialsTv.setTextAppearance(R$style.TextStyle_Head_M_Secondary);
    }

    public final void bind(@NotNull ReviewVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.boundData = item;
        View itemView = this.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        ViewGroup.LayoutParams layoutParams = itemView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = item.getContainerHeight();
        itemView.setLayoutParams(layoutParams);
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = this.containerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer parseColor = styleParser.parseColor(context, item.getBackgroundTint());
        if (parseColor != null) {
            View itemView2 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView2, "itemView");
            ViewExtKt.setBackgroundTint(itemView2, parseColor.intValue());
        }
        AvatarView hotelsReviewAvatarAv = this.binding.hotelsReviewAvatarAv;
        Intrinsics.checkNotNullExpressionValue(hotelsReviewAvatarAv, "hotelsReviewAvatarAv");
        AvatarHolderKt.bind$default(hotelsReviewAvatarAv, item.getAvatar(), null, 2, null);
        TextAtomView hotelsReviewNameTav = this.binding.hotelsReviewNameTav;
        Intrinsics.checkNotNullExpressionValue(hotelsReviewNameTav, "hotelsReviewNameTav");
        TextAtomHolderKt.bind$default(hotelsReviewNameTav, item.getFullName(), null, 2, null);
        TextAtomView hotelsReviewDateTav = this.binding.hotelsReviewDateTav;
        Intrinsics.checkNotNullExpressionValue(hotelsReviewDateTav, "hotelsReviewDateTav");
        TextAtomHolderKt.bind$default(hotelsReviewDateTav, item.getDate(), null, 2, null);
        this.blocksAdapter.setItems(item.getReviewBlocks());
    }

    @Override // jk0.j, lk0.b
    public void onViewInVisibleBounds() {
        t viewEvent;
        super.onViewInVisibleBounds();
        ReviewVO reviewVO = this.boundData;
        if (reviewVO == null || (viewEvent = reviewVO.getViewEvent()) == null) {
            return;
        }
        TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.references.getTokenizedAnalytics(), viewEvent, null, 2, null);
    }
}

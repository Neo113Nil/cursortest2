package ru.ozon.app.android.ugc.payout.widgets.pinnedReview.view.review;

import Sc.InterfaceC4008j;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.a;
import androidx.core.graphics.c;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7705l;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.ui.configurators.R$id;
import ru.ozon.app.android.pdp.ui.configurators.ugc.singleReview.ReviewBadgeListAdapter;
import ru.ozon.app.android.pdp.ui.configurators.ugc.singleReview.ReviewBadgeListItemDecoration;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.ugc.payout.widgets.pinnedReview.presentation.ReviewBodyVO;
import ru.ozon.app.android.ugc.payout.widgets.pinnedReview.view.review.ReviewBodyView$badgeScrollListener$2;
import ru.ozon.app.android.utils.CollectionExtKt;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.app.android.video.preload.PlayerPreloader;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.cell.icon.IconTitleSubtitleCellView;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.cell.IconTitleSubtitleCellDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.v3.holders.cell.iconCell.IconTitleSubtitleCellHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import ru.ozon.uni.core.R$color;

@Metadata(d1 = {"\u0000Á\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u001d*\u0001A\b \u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J+\u0010\f\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0011\u001a\u00020\n2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012J;\u0010\u0017\u001a\u00020\n2\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u000e2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001b\u001a\u00020\n2\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u000e¢\u0006\u0004\b\u001b\u0010\u0012J\u001d\u0010\u001e\u001a\u00020\n2\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u000e¢\u0006\u0004\b\u001e\u0010\u0012J\r\u0010\u001f\u001a\u00020\n¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\"2\u0006\u0010!\u001a\u00020\u000fH\u0002¢\u0006\u0004\b#\u0010$J\u001f\u0010(\u001a\u00020\"2\u0006\u0010%\u001a\u00020\u00192\u0006\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\b(\u0010)J\u0013\u0010+\u001a\u00020\n*\u00020*H\u0002¢\u0006\u0004\b+\u0010,J\u0017\u00100\u001a\u00020/2\u0006\u0010.\u001a\u00020-H\u0002¢\u0006\u0004\b0\u00101J\u0017\u00104\u001a\u00020\n2\u0006\u00103\u001a\u000202H\u0002¢\u0006\u0004\b4\u00105R\u001b\u0010;\u001a\u0002068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u001b\u0010@\u001a\u00020<8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b=\u00108\u001a\u0004\b>\u0010?R\u001b\u0010E\u001a\u00020A8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bB\u00108\u001a\u0004\bC\u0010DR\u001b\u0010J\u001a\u00020F8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bG\u00108\u001a\u0004\bH\u0010IR\u0014\u0010L\u001a\u00020K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010N\u001a\u00020K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010MR\u001a\u0010P\u001a\b\u0012\u0004\u0012\u00020*0O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u00108R\u001a\u0010Q\u001a\b\u0012\u0004\u0012\u00020*0O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u00108R\u001b\u0010U\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bR\u00108\u001a\u0004\bS\u0010TR\u001b\u0010X\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bV\u00108\u001a\u0004\bW\u0010TR\u001a\u0010Z\u001a\b\u0012\u0004\u0012\u00020Y0O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u00108R\u001a\u0010[\u001a\b\u0012\u0004\u0012\u00020\"0O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u00108R,\u0010^\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020]\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0O0\\0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_R\u001a\u0010`\u001a\u00020]8\u0014X\u0095\u0004¢\u0006\f\n\u0004\b`\u0010a\u001a\u0004\bb\u0010cR\u0014\u0010e\u001a\u00020]8$X¤\u0004¢\u0006\u0006\u001a\u0004\bd\u0010cR\u0014\u0010g\u001a\u00020]8$X¤\u0004¢\u0006\u0006\u001a\u0004\bf\u0010cR\u0014\u0010j\u001a\u00020&8$X¤\u0004¢\u0006\u0006\u001a\u0004\bh\u0010iR\u001b\u0010o\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\f\u001a\u0004\bk\u0010l*\u0004\bm\u0010nR\u001b\u0010r\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\f\u001a\u0004\bp\u0010l*\u0004\bq\u0010nR\u001b\u0010v\u001a\u00020Y8BX\u0082\u0084\u0002¢\u0006\f\u001a\u0004\bs\u0010t*\u0004\bu\u0010nR\u001b\u0010y\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\u001a\u0004\bw\u0010T*\u0004\bx\u0010n¨\u0006z"}, d2 = {"Lru/ozon/app/android/ugc/payout/widgets/pinnedReview/view/review/ReviewBodyView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lru/ozon/app/android/ugc/payout/widgets/pinnedReview/presentation/ReviewBodyVO;", "body", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "bindOrGone", "(Lru/ozon/app/android/ugc/payout/widgets/pinnedReview/presentation/ReviewBodyVO;Lkotlin/jvm/functions/Function1;)V", "", "Lru/ozon/uni/atoms/data/cell/IconTitleSubtitleCellDTO;", "content", "bindCells", "(Ljava/util/List;)V", "Lru/ozon/app/android/ugc/payout/widgets/pinnedReview/presentation/ReviewBodyVO$MediaVO;", "previews", "Lru/ozon/app/android/video/preload/PlayerPreloader;", "playerPreloader", "bindMediaPreviews", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;Lru/ozon/app/android/video/preload/PlayerPreloader;)V", "Lru/ozon/uni/atoms/data/text/TextDTO;", "contextReviews", "bindContextReviews", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "badges", "bindBadges", "updateAdditionalFlow", "()V", "cell", "Landroid/view/View;", "getCellView", "(Lru/ozon/uni/atoms/data/cell/IconTitleSubtitleCellDTO;)Landroid/view/View;", "text", "", "isLast", "getTextView", "(Lru/ozon/uni/atoms/data/text/TextDTO;Z)Landroid/view/View;", "Landroidx/recyclerview/widget/RecyclerView;", "setupBadges", "(Landroidx/recyclerview/widget/RecyclerView;)V", "Landroid/graphics/drawable/GradientDrawable$Orientation;", "orientation", "Landroid/graphics/drawable/GradientDrawable;", "getGradientDrawable", "(Landroid/graphics/drawable/GradientDrawable$Orientation;)Landroid/graphics/drawable/GradientDrawable;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "layoutManager", "updateGradientVisibility", "(Landroidx/recyclerview/widget/LinearLayoutManager;)V", "Landroid/graphics/drawable/ShapeDrawable;", "contextReviewsBackgroundDrawable$delegate", "LSc/j;", "getContextReviewsBackgroundDrawable", "()Landroid/graphics/drawable/ShapeDrawable;", "contextReviewsBackgroundDrawable", "Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/ReviewBadgeListAdapter;", "badgeAdapter$delegate", "getBadgeAdapter", "()Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/ReviewBadgeListAdapter;", "badgeAdapter", "ru/ozon/app/android/ugc/payout/widgets/pinnedReview/view/review/ReviewBodyView$badgeScrollListener$2$1", "badgeScrollListener$delegate", "getBadgeScrollListener", "()Lru/ozon/app/android/ugc/payout/widgets/pinnedReview/view/review/ReviewBodyView$badgeScrollListener$2$1;", "badgeScrollListener", "Lru/ozon/app/android/ugc/payout/widgets/pinnedReview/view/review/MediaPreviewListAdapter;", "mediaPreviewAdapter$delegate", "getMediaPreviewAdapter", "()Lru/ozon/app/android/ugc/payout/widgets/pinnedReview/view/review/MediaPreviewListAdapter;", "mediaPreviewAdapter", "Landroidx/constraintlayout/helper/widget/Flow;", "cellListFlow", "Landroidx/constraintlayout/helper/widget/Flow;", "additionalContentFlow", "LSc/j;", "mediaPreviewsRecyclerDelegate", "badgesRecyclerDelegate", "leftBadgesGradient$delegate", "getLeftBadgesGradient", "()Landroid/view/View;", "leftBadgesGradient", "rightBadgesGradient$delegate", "getRightBadgesGradient", "rightBadgesGradient", "Landroid/widget/LinearLayout;", "contextReviewsContainerDelegate", "contextReviewsBottomSpacerDelegate", "Lkotlin/Pair;", "", "delegates", "Ljava/util/List;", "moreFadeColor", "I", "getMoreFadeColor", "()I", "getMediaPreviewsInLineCount", "mediaPreviewsInLineCount", "getMediaPreviewsGap", "mediaPreviewsGap", "getShowContextReviewsBackground", "()Z", "showContextReviewsBackground", "getMediaPreviewsRecycler", "()Landroidx/recyclerview/widget/RecyclerView;", "getMediaPreviewsRecycler$delegate", "(Lru/ozon/app/android/ugc/payout/widgets/pinnedReview/view/review/ReviewBodyView;)Ljava/lang/Object;", "mediaPreviewsRecycler", "getBadgesRecycler", "getBadgesRecycler$delegate", "badgesRecycler", "getContextReviewsContainer", "()Landroid/widget/LinearLayout;", "getContextReviewsContainer$delegate", "contextReviewsContainer", "getContextReviewsBottomSpacer", "getContextReviewsBottomSpacer$delegate", "contextReviewsBottomSpacer", "payout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class ReviewBodyView extends ConstraintLayout {

    @NotNull
    private final Flow additionalContentFlow;

    /* renamed from: badgeAdapter$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j badgeAdapter;

    /* renamed from: badgeScrollListener$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j badgeScrollListener;

    @NotNull
    private final InterfaceC4008j<RecyclerView> badgesRecyclerDelegate;

    @NotNull
    private final Flow cellListFlow;

    /* renamed from: contextReviewsBackgroundDrawable$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j contextReviewsBackgroundDrawable;

    @NotNull
    private final InterfaceC4008j<View> contextReviewsBottomSpacerDelegate;

    @NotNull
    private final InterfaceC4008j<LinearLayout> contextReviewsContainerDelegate;

    @NotNull
    private final List<Pair<Integer, InterfaceC4008j<View>>> delegates;

    /* renamed from: leftBadgesGradient$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j leftBadgesGradient;

    /* renamed from: mediaPreviewAdapter$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j mediaPreviewAdapter;

    @NotNull
    private final InterfaceC4008j<RecyclerView> mediaPreviewsRecyclerDelegate;
    private final int moreFadeColor;

    /* renamed from: rightBadgesGradient$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j rightBadgesGradient;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewBodyView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.contextReviewsBackgroundDrawable = LazyUtilsKt.unsafeLazy(new ReviewBodyView$contextReviewsBackgroundDrawable$2(context));
        this.badgeAdapter = LazyUtilsKt.unsafeLazy(ReviewBodyView$badgeAdapter$2.INSTANCE);
        this.badgeScrollListener = LazyUtilsKt.unsafeLazy(new ReviewBodyView$badgeScrollListener$2(this));
        this.mediaPreviewAdapter = LazyUtilsKt.unsafeLazy(ReviewBodyView$mediaPreviewAdapter$2.INSTANCE);
        Flow flow = new Flow(context);
        flow.setId(R$id.reviewBodyContentFLow);
        ConstraintLayout.b bVar = new ConstraintLayout.b(-2, -2);
        bVar.f41636i = 0;
        flow.setLayoutParams(bVar);
        flow.setOrientation(1);
        flow.setHorizontalAlign(0);
        Dimens dimens = Dimens.INSTANCE;
        flow.setVerticalGap(dimens.getDP_6());
        flow.setPaddingBottom(dimens.getDP_8());
        addView(flow);
        this.cellListFlow = flow;
        Flow flow2 = new Flow(context);
        flow2.setId(View.generateViewId());
        ConstraintLayout.b bVar2 = new ConstraintLayout.b(-2, -2);
        bVar2.f41638j = flow.getId();
        flow2.setOrientation(1);
        flow2.setLayoutParams(bVar2);
        addView(flow2);
        this.additionalContentFlow = flow2;
        InterfaceC4008j<RecyclerView> unsafeLazy = LazyUtilsKt.unsafeLazy(new ReviewBodyView$mediaPreviewsRecyclerDelegate$1(context, this));
        this.mediaPreviewsRecyclerDelegate = unsafeLazy;
        InterfaceC4008j<RecyclerView> unsafeLazy2 = LazyUtilsKt.unsafeLazy(new ReviewBodyView$badgesRecyclerDelegate$1(context, this));
        this.badgesRecyclerDelegate = unsafeLazy2;
        this.leftBadgesGradient = LazyUtilsKt.unsafeLazy(new ReviewBodyView$leftBadgesGradient$2(context, this));
        this.rightBadgesGradient = LazyUtilsKt.unsafeLazy(new ReviewBodyView$rightBadgesGradient$2(context, this));
        InterfaceC4008j<LinearLayout> unsafeLazy3 = LazyUtilsKt.unsafeLazy(new ReviewBodyView$contextReviewsContainerDelegate$1(context, this));
        this.contextReviewsContainerDelegate = unsafeLazy3;
        InterfaceC4008j<View> unsafeLazy4 = LazyUtilsKt.unsafeLazy(new ReviewBodyView$contextReviewsBottomSpacerDelegate$1(context, this));
        this.contextReviewsBottomSpacerDelegate = unsafeLazy4;
        this.delegates = C7714v.b0(new Pair(Integer.valueOf(R$id.reviewBodyMediaPreviewsRv), unsafeLazy), new Pair(Integer.valueOf(R$id.reviewBodyContextReviewsContainer), unsafeLazy3), new Pair(Integer.valueOf(R$id.reviewBodyContextReviewsSpacer), unsafeLazy4), new Pair(Integer.valueOf(R$id.reviewBodyBadgesRv), unsafeLazy2));
        this.moreFadeColor = a.getColor(context, R$color.layer_floor_1);
    }

    private final ReviewBadgeListAdapter getBadgeAdapter() {
        return (ReviewBadgeListAdapter) this.badgeAdapter.getValue();
    }

    private final ReviewBodyView$badgeScrollListener$2.AnonymousClass1 getBadgeScrollListener() {
        return (ReviewBodyView$badgeScrollListener$2.AnonymousClass1) this.badgeScrollListener.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RecyclerView getBadgesRecycler() {
        return this.badgesRecyclerDelegate.getValue();
    }

    private final View getCellView(IconTitleSubtitleCellDTO cell) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        IconTitleSubtitleCellView iconTitleSubtitleCellView = new IconTitleSubtitleCellView(context, null, 0, 0, null, false, 62, null);
        iconTitleSubtitleCellView.setId(View.generateViewId());
        iconTitleSubtitleCellView.setLayoutParams(new ConstraintLayout.b(-1, -2));
        IconTitleSubtitleCellHolderKt.bind$default(iconTitleSubtitleCellView, cell, null, 2, null);
        return iconTitleSubtitleCellView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ShapeDrawable getContextReviewsBackgroundDrawable() {
        return (ShapeDrawable) this.contextReviewsBackgroundDrawable.getValue();
    }

    private final View getContextReviewsBottomSpacer() {
        return this.contextReviewsBottomSpacerDelegate.getValue();
    }

    private final LinearLayout getContextReviewsContainer() {
        return this.contextReviewsContainerDelegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final GradientDrawable getGradientDrawable(GradientDrawable.Orientation orientation) {
        GradientDrawable gradientDrawable = new GradientDrawable(orientation, new int[]{c.f(getMoreFadeColor(), 0), getMoreFadeColor()});
        gradientDrawable.setShape(0);
        gradientDrawable.setGradientType(0);
        return gradientDrawable;
    }

    private final View getLeftBadgesGradient() {
        return (View) this.leftBadgesGradient.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MediaPreviewListAdapter getMediaPreviewAdapter() {
        return (MediaPreviewListAdapter) this.mediaPreviewAdapter.getValue();
    }

    private final RecyclerView getMediaPreviewsRecycler() {
        return this.mediaPreviewsRecyclerDelegate.getValue();
    }

    private final View getRightBadgesGradient() {
        return (View) this.rightBadgesGradient.getValue();
    }

    private final View getTextView(TextDTO text, boolean isLast) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
        ConstraintLayout.b b11 = Fj.c.b(-1, -2, textAtomV2View);
        b11.setMargins(((ViewGroup.MarginLayoutParams) b11).leftMargin, ((ViewGroup.MarginLayoutParams) b11).topMargin, ((ViewGroup.MarginLayoutParams) b11).rightMargin, isLast ? 0 : Dimens.INSTANCE.getDP_4());
        textAtomV2View.setLayoutParams(b11);
        TextHolderKt.bind$default(textAtomV2View, text, null, 2, null);
        return textAtomV2View;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setupBadges(RecyclerView recyclerView) {
        recyclerView.setAdapter(getBadgeAdapter());
        recyclerView.addItemDecoration(new ReviewBadgeListItemDecoration(Dimens.INSTANCE.getDP_4(), 0, 2, null));
        recyclerView.addOnScrollListener(getBadgeScrollListener());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateGradientVisibility(LinearLayoutManager layoutManager) {
        int findFirstCompletelyVisibleItemPosition = layoutManager.findFirstCompletelyVisibleItemPosition();
        int findLastCompletelyVisibleItemPosition = layoutManager.findLastCompletelyVisibleItemPosition();
        ViewExtKt.showOrGone(getLeftBadgesGradient(), Boolean.valueOf(findFirstCompletelyVisibleItemPosition != 0));
        ViewExtKt.showOrGone(getRightBadgesGradient(), Boolean.valueOf(findLastCompletelyVisibleItemPosition != getBadgeAdapter().getCardsCount() - 1));
    }

    public final void bindBadges(List<BadgeDTO> badges) {
        boolean isNullOrEmpty = CollectionExtKt.isNullOrEmpty(badges);
        boolean z11 = !isNullOrEmpty;
        if (!isNullOrEmpty || this.badgesRecyclerDelegate.isInitialized()) {
            ViewExtKt.showOrGone(getBadgesRecycler(), Boolean.valueOf(z11));
            getBadgeAdapter().submitList(badges);
            RecyclerView.o layoutManager = getBadgesRecycler().getLayoutManager();
            LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
            if (linearLayoutManager != null) {
                updateGradientVisibility(linearLayoutManager);
            }
        }
    }

    public final void bindCells(List<IconTitleSubtitleCellDTO> content) {
        ArrayList arrayList;
        int[] iArr;
        ru.ozon.app.android.pdp.utils.ViewExtKt.cleanUpFlow(this, this.cellListFlow);
        ViewExtKt.showOrGone(this.cellListFlow, Boolean.valueOf(!CollectionExtKt.isNullOrEmpty(content)));
        if (content != null) {
            List<IconTitleSubtitleCellDTO> list = content;
            arrayList = new ArrayList(C7714v.z(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(getCellView((IconTitleSubtitleCellDTO) it.next()));
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                addView((View) it2.next());
            }
        } else {
            arrayList = null;
        }
        Flow flow = this.cellListFlow;
        if (arrayList != null) {
            ArrayList arrayList2 = new ArrayList(C7714v.z(arrayList, 10));
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                arrayList2.add(Integer.valueOf(((View) it3.next()).getId()));
            }
            iArr = C7714v.T0(arrayList2);
        } else {
            iArr = new int[0];
        }
        flow.setReferencedIds(iArr);
    }

    public final void bindContextReviews(List<TextDTO> contextReviews) {
        boolean isNullOrEmpty = CollectionExtKt.isNullOrEmpty(contextReviews);
        boolean z11 = !isNullOrEmpty;
        if (!isNullOrEmpty || this.contextReviewsContainerDelegate.isInitialized()) {
            LinearLayout contextReviewsContainer = getContextReviewsContainer();
            contextReviewsContainer.removeAllViews();
            ViewExtKt.showOrGone(contextReviewsContainer, Boolean.valueOf(z11));
            ViewExtKt.showOrGone(getContextReviewsBottomSpacer(), Boolean.valueOf(z11));
            if (isNullOrEmpty || contextReviews == null) {
                return;
            }
            List<TextDTO> list = contextReviews;
            ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
            int i11 = 0;
            for (Object obj : list) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    C7714v.O0();
                    throw null;
                }
                arrayList.add(getTextView((TextDTO) obj, i11 == C7714v.P(contextReviews)));
                i11 = i12;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                contextReviewsContainer.addView((View) it.next());
            }
        }
    }

    public final void bindMediaPreviews(List<ReviewBodyVO.MediaVO> previews, @NotNull Function1<? super AtomAction, Unit> actionHandler, PlayerPreloader playerPreloader) {
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        boolean isNullOrEmpty = CollectionExtKt.isNullOrEmpty(previews);
        boolean z11 = !isNullOrEmpty;
        if (!isNullOrEmpty || this.mediaPreviewsRecyclerDelegate.isInitialized()) {
            getMediaPreviewAdapter().submitList(previews, actionHandler, playerPreloader);
            ViewExtKt.showOrGone(getMediaPreviewsRecycler(), Boolean.valueOf(z11));
        }
    }

    public final void bindOrGone(ReviewBodyVO body, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        if (body == null) {
            ViewExtKt.gone(this);
            return;
        }
        ViewExtKt.show(this);
        bindCells(body.getContent());
        bindMediaPreviews(body.getMediaPreviews(), actionHandler, null);
        bindContextReviews(body.getContextReviews());
        bindBadges(body.getBadges());
        updateAdditionalFlow();
    }

    protected abstract int getMediaPreviewsGap();

    protected abstract int getMediaPreviewsInLineCount();

    protected abstract int getMoreFadeColor();

    protected abstract boolean getShowContextReviewsBackground();

    public final void updateAdditionalFlow() {
        List<Pair<Integer, InterfaceC4008j<View>>> list = this.delegates;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((InterfaceC4008j) ((Pair) obj).f()).isInitialized()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(C7714v.z(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(Integer.valueOf(((Number) ((Pair) it.next()).e()).intValue()));
        }
        Flow flow = this.additionalContentFlow;
        int[] referencedIds = flow.getReferencedIds();
        Intrinsics.checkNotNullExpressionValue(referencedIds, "getReferencedIds(...)");
        if (Intrinsics.d(C7705l.d0(referencedIds), arrayList2)) {
            return;
        }
        flow.setReferencedIds(C7714v.T0(arrayList2));
        flow.requestLayout();
    }
}

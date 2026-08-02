package ru.ozon.app.android.ugc.widgets.reviewsPreview.common;

import B3.D;
import De.C2860c;
import Sc.InterfaceC4008j;
import Sc.o;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.utils.DelegatesKt;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.ugc.R$id;
import ru.ozon.app.android.ugc.widgets.reviewsPreview.data.ReviewsPreviewVO;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.price.ui.PriceAtomView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikitsdk.Color;
import ru.ozon.uni.android.uikitsdk.ext.TokensExtKt;
import ru.ozon.uni.atoms.data.image.CornerRadius;
import ru.ozon.uni.atoms.v3.holders.icon.IconHolderKt;
import ru.ozon.uni.atoms.v3.holders.price.PriceAtomHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import ru.ozon.uni.core.UniGradient;
import ru.ozon.uni.core.UniGradients;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\"\b\u0001\u0018\u0000 92\u00020\u0001:\u00019B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\f\u001a\u00020\u000b*\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0017\u0010\bJ\u000f\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001c\u0010\u001aJ\u0015\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001fR\u001b\u0010#\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\bR\u001b\u0010&\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b%\u0010\u0010R\u001b\u0010)\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010!\u001a\u0004\b(\u0010\u0013R\u001b\u0010,\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010!\u001a\u0004\b+\u0010\u0016R\u001b\u0010/\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010!\u001a\u0004\b.\u0010\bR\u001b\u00102\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u0010!\u001a\u0004\b1\u0010\u001aR\u001b\u00105\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b3\u0010!\u001a\u0004\b4\u0010\u001aR\u001b\u00108\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b6\u0010!\u001a\u0004\b7\u0010\u001a¨\u0006:"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewsPreview/common/ReviewsPreviewTileBinder;", "", "Landroidx/constraintlayout/widget/ConstraintLayout;", "container", "<init>", "(Landroidx/constraintlayout/widget/ConstraintLayout;)V", "Landroid/view/View;", "createGradientView", "()Landroid/view/View;", "Lru/ozon/app/android/ugc/widgets/reviewsPreview/data/ReviewsPreviewVO;", "item", "", "setGradient", "(Landroid/view/View;Lru/ozon/app/android/ugc/widgets/reviewsPreview/data/ReviewsPreviewVO;)V", "Lru/ozon/uni/android/atom/price/ui/PriceAtomView;", "createPriceView", "()Lru/ozon/uni/android/atom/price/ui/PriceAtomView;", "Landroidx/constraintlayout/helper/widget/Flow;", "createTitleContainer", "()Landroidx/constraintlayout/helper/widget/Flow;", "Lru/ozon/uni/android/atom/icon/IconView;", "createRatingIconView", "()Lru/ozon/uni/android/atom/icon/IconView;", "createRatingSpacerView", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "createRatingValueView", "()Lru/ozon/uni/android/atom/text/TextAtomV2View;", "createSeparatorView", "createTitleView", "bindTile", "(Lru/ozon/app/android/ugc/widgets/reviewsPreview/data/ReviewsPreviewVO;)V", "Landroidx/constraintlayout/widget/ConstraintLayout;", "gradientView$delegate", "LSc/j;", "getGradientView", "gradientView", "priceView$delegate", "getPriceView", "priceView", "titleContainer$delegate", "getTitleContainer", "titleContainer", "ratingIconView$delegate", "getRatingIconView", "ratingIconView", "ratingSpacerView$delegate", "getRatingSpacerView", "ratingSpacerView", "ratingValueView$delegate", "getRatingValueView", "ratingValueView", "separatorView$delegate", "getSeparatorView", "separatorView", "titleView$delegate", "getTitleView", "titleView", "Companion", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ReviewsPreviewTileBinder {

    @NotNull
    private final ConstraintLayout container;

    /* renamed from: gradientView$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j gradientView;

    /* renamed from: priceView$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j priceView;

    /* renamed from: ratingIconView$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j ratingIconView;

    /* renamed from: ratingSpacerView$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j ratingSpacerView;

    /* renamed from: ratingValueView$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j ratingValueView;

    /* renamed from: separatorView$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j separatorView;

    /* renamed from: titleContainer$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j titleContainer;

    /* renamed from: titleView$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j titleView;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final int gradientHeight = ResourceExtKt.toPx(90);
    private static final int priceBottomMargin = ResourceExtKt.toPx(26);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewsPreview/common/ReviewsPreviewTileBinder$Companion;", "", "<init>", "()V", "", "DEFAULT_CORNER_RADIUS", "I", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public ReviewsPreviewTileBinder(@NotNull ConstraintLayout container) {
        Intrinsics.checkNotNullParameter(container, "container");
        this.container = container;
        this.gradientView = DelegatesKt.lazyUnsafe(new ReviewsPreviewTileBinder$special$$inlined$lazyView$1(container, this));
        this.priceView = DelegatesKt.lazyUnsafe(new ReviewsPreviewTileBinder$special$$inlined$lazyView$2(container, this));
        this.titleContainer = DelegatesKt.lazyUnsafe(new ReviewsPreviewTileBinder$special$$inlined$lazyView$3(container, this));
        this.ratingIconView = DelegatesKt.lazyUnsafe(new ReviewsPreviewTileBinder$special$$inlined$lazyView$4(container, this));
        this.ratingSpacerView = DelegatesKt.lazyUnsafe(new ReviewsPreviewTileBinder$special$$inlined$lazyView$5(container, this));
        this.ratingValueView = DelegatesKt.lazyUnsafe(new ReviewsPreviewTileBinder$special$$inlined$lazyView$6(container, this));
        this.separatorView = DelegatesKt.lazyUnsafe(new ReviewsPreviewTileBinder$special$$inlined$lazyView$7(container, this));
        this.titleView = DelegatesKt.lazyUnsafe(new ReviewsPreviewTileBinder$special$$inlined$lazyView$8(container, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final View createGradientView() {
        View view = new View(this.container.getContext());
        view.setId(R$id.reviewsPreviewGradient);
        ConstraintLayout.b bVar = new ConstraintLayout.b(0, gradientHeight);
        bVar.f41642l = 0;
        bVar.f41656t = 0;
        bVar.f41658v = 0;
        view.setLayoutParams(bVar);
        return view;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PriceAtomView createPriceView() {
        Context context = this.container.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        PriceAtomView priceAtomView = new PriceAtomView(context, null, 0, 6, null);
        ConstraintLayout.b b11 = C2860c.b(priceAtomView, R$id.reviewsPreviewPrice, -2, -2);
        b11.f41642l = 0;
        b11.f41656t = 0;
        b11.f41658v = 0;
        b11.f41598E = 0.0f;
        ((ViewGroup.MarginLayoutParams) b11).bottomMargin = priceBottomMargin;
        Dimens dimens = Dimens.INSTANCE;
        b11.setMarginEnd(dimens.getDP_8());
        b11.setMarginStart(dimens.getDP_10());
        b11.f41616W = true;
        priceAtomView.setLayoutParams(b11);
        return priceAtomView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final IconView createRatingIconView() {
        Context context = this.container.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        IconView iconView = new IconView(context, null, 0, 6, null);
        iconView.setId(R$id.reviewsPreviewRatingIcon);
        iconView.setLayoutParams(new ConstraintLayout.b(-2, -2));
        return iconView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final View createRatingSpacerView() {
        View view = new View(this.container.getContext());
        view.setId(R$id.reviewsPreviewRatingSpacer);
        ConstraintLayout.b bVar = new ConstraintLayout.b(Dimens.INSTANCE.getDP_2(), 0);
        int i11 = R$id.reviewsPreviewRatingIcon;
        bVar.f41636i = i11;
        bVar.f41642l = i11;
        view.setLayoutParams(bVar);
        return view;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextAtomV2View createRatingValueView() {
        Context context = this.container.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
        Lc.a.d(textAtomV2View, R$id.reviewsPreviewRatingValue, -2, -2, false);
        return textAtomV2View;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextAtomV2View createSeparatorView() {
        Context context = this.container.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
        Lc.a.d(textAtomV2View, R$id.reviewsPreviewTitleSeparator, -2, -2, false);
        return textAtomV2View;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Flow createTitleContainer() {
        Flow flow = new Flow(this.container.getContext());
        flow.setId(R$id.reviewsPreviewTitleContainer);
        ConstraintLayout.b bVar = new ConstraintLayout.b(0, -2);
        bVar.f41638j = R$id.reviewsPreviewPrice;
        bVar.f41656t = 0;
        bVar.f41658v = 0;
        Dimens dimens = Dimens.INSTANCE;
        bVar.setMarginStart(dimens.getDP_8());
        bVar.setMarginEnd(dimens.getDP_8());
        flow.setHorizontalBias(0.0f);
        flow.setHorizontalStyle(2);
        flow.setVerticalAlign(2);
        flow.setOrientation(0);
        flow.setLayoutParams(bVar);
        return flow;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextAtomV2View createTitleView() {
        Context context = this.container.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
        Lc.a.d(textAtomV2View, R$id.reviewsPreviewTitle, 0, -2, false);
        return textAtomV2View;
    }

    private final View getGradientView() {
        return (View) this.gradientView.getValue();
    }

    private final PriceAtomView getPriceView() {
        return (PriceAtomView) this.priceView.getValue();
    }

    private final IconView getRatingIconView() {
        return (IconView) this.ratingIconView.getValue();
    }

    private final View getRatingSpacerView() {
        return (View) this.ratingSpacerView.getValue();
    }

    private final TextAtomV2View getRatingValueView() {
        return (TextAtomV2View) this.ratingValueView.getValue();
    }

    private final TextAtomV2View getSeparatorView() {
        return (TextAtomV2View) this.separatorView.getValue();
    }

    private final Flow getTitleContainer() {
        return (Flow) this.titleContainer.getValue();
    }

    private final TextAtomV2View getTitleView() {
        return (TextAtomV2View) this.titleView.getValue();
    }

    private final void setGradient(View view, ReviewsPreviewVO reviewsPreviewVO) {
        Object obj;
        float pxF;
        Iterator<E> it = UniGradients.getEntries().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            String token = ((UniGradients) next).getToken();
            ReviewsPreviewTileVO tile = reviewsPreviewVO.getTile();
            if (Intrinsics.d(token, tile != null ? tile.getBackgroundColor() : null)) {
                obj = next;
                break;
            }
        }
        UniGradients uniGradients = (UniGradients) obj;
        if (uniGradients == null) {
            uniGradients = UniGradients.GR_OVERLAY_PRIMARY;
        }
        UniGradient gradient = uniGradients.getGradient();
        Context context = this.container.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Color.Gradient gradient2 = TokensExtKt.toGradient(gradient, context);
        if (reviewsPreviewVO instanceof ReviewsPreviewVO.ReviewsPreviewImageVO) {
            CornerRadius cornerRadius = ((ReviewsPreviewVO.ReviewsPreviewImageVO) reviewsPreviewVO).getImage().getCornerRadius();
            pxF = ResourceExtKt.toPxF(cornerRadius != null ? cornerRadius.getPx() : 16);
        } else {
            if (!(reviewsPreviewVO instanceof ReviewsPreviewVO.ReviewsPreviewVideoVO)) {
                throw new o();
            }
            CornerRadius cornerRadius2 = ((ReviewsPreviewVO.ReviewsPreviewVideoVO) reviewsPreviewVO).getPreview().getCornerRadius();
            pxF = ResourceExtKt.toPxF(cornerRadius2 != null ? cornerRadius2.getPx() : 16);
        }
        GradientDrawable b11 = D.b(0);
        b11.setCornerRadii(new float[]{0.0f, 0.0f, 0.0f, 0.0f, pxF, pxF, pxF, pxF});
        b11.setOrientation(gradient2.getOrientation());
        b11.setGradientType(0);
        b11.setColors(gradient2.getColors());
        view.setBackground(b11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x008c, code lost:
    
        if (r8 != (r5 != null ? r5.bottomMargin : 0)) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void bindTile(@NotNull ReviewsPreviewVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        ReviewsPreviewTileVO tile = item.getTile();
        if (tile != null) {
            setGradient(getGradientView(), item);
            PriceAtomView priceView = getPriceView();
            PriceAtomHolderKt.bind$default(priceView, tile.getPrice(), null, 2, null);
            ViewGroup.LayoutParams layoutParams = priceView.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams != null) {
                int i11 = marginLayoutParams.leftMargin;
                int i12 = marginLayoutParams.topMargin;
                int i13 = marginLayoutParams.rightMargin;
                int i14 = marginLayoutParams.bottomMargin;
                marginLayoutParams.setMarginStart(tile.getRatingIcon() != null ? Dimens.INSTANCE.getDP_10() : Dimens.INSTANCE.getDP_8());
                if (i11 == marginLayoutParams.leftMargin) {
                    ViewGroup.LayoutParams layoutParams2 = priceView.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
                    if (i12 == (marginLayoutParams2 != null ? marginLayoutParams2.topMargin : 0)) {
                        ViewGroup.LayoutParams layoutParams3 = priceView.getLayoutParams();
                        ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
                        if (i13 == (marginLayoutParams3 != null ? marginLayoutParams3.rightMargin : 0)) {
                            ViewGroup.LayoutParams layoutParams4 = priceView.getLayoutParams();
                            ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams4 : null;
                        }
                    }
                }
                priceView.setLayoutParams(marginLayoutParams);
            }
            TextHolderKt.bind$default(getTitleView(), tile.getTitle(), null, 2, null);
            IconHolderKt.bindOrGone$default(getRatingIconView(), tile.getRatingIcon(), null, 2, null);
            ViewExtKt.showOrGone(getRatingSpacerView(), Boolean.valueOf(tile.getRatingIcon() != null));
            TextHolderKt.bindOrGone$default(getRatingValueView(), tile.getRatingValue(), null, 2, null);
            TextHolderKt.bindOrGone$default(getSeparatorView(), tile.getSeparator(), null, 2, null);
            getTitleContainer().setReferencedIds(new int[]{R$id.reviewsPreviewRatingIcon, R$id.reviewsPreviewRatingSpacer, R$id.reviewsPreviewRatingValue, R$id.reviewsPreviewTitleSeparator, R$id.reviewsPreviewTitle});
        }
    }
}

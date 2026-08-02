package ru.ozon.app.android.fresh.unsorted.widgets.pdpAspects.presentation.recyclerview;

import Bi.b;
import De.C2860c;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.card.MaterialCardView;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.unsorted.R$id;
import ru.ozon.app.android.fresh.unsorted.widgets.pdpAspects.domain.PdpAspectsVO;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.atom.price.ui.PriceAtomView;
import ru.ozon.uni.android.atom.productMedia.ProductMediaView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;
import ru.ozon.uni.atoms.v3.holders.price.PriceAtomHolderKt;
import ru.ozon.uni.atoms.v3.holders.productMedia.ProductMediaHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018J\u0010\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u001bH\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/pdpAspects/presentation/recyclerview/AspectItemComponentsView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "imageView", "Lru/ozon/uni/android/atom/productMedia/ProductMediaView;", "cardView", "Lcom/google/android/material/card/MaterialCardView;", "badgeView", "Lru/ozon/uni/android/atom/badge/BadgeView;", "priceView", "Lru/ozon/uni/android/atom/price/ui/PriceAtomView;", "titleView", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "subtitleView", "bind", "", "item", "Lru/ozon/app/android/fresh/unsorted/widgets/pdpAspects/domain/PdpAspectsVO$Aspect;", "setupSpacers", "spacers", "Lru/ozon/app/android/fresh/unsorted/widgets/pdpAspects/domain/PdpAspectsVO$Aspect$ItemSpacersVO;", "Companion", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AspectItemComponentsView extends ConstraintLayout {

    @NotNull
    private final BadgeView badgeView;

    @NotNull
    private final MaterialCardView cardView;

    @NotNull
    private final ProductMediaView imageView;

    @NotNull
    private final PriceAtomView priceView;

    @NotNull
    private final TextAtomV2View subtitleView;

    @NotNull
    private final TextAtomV2View titleView;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final int CONTENTS_WIDTH = ResourceExtKt.toPx(88);
    private static final int BADGE_STROKE_WIDTH = ResourceExtKt.toPx(1.5d);
    private static final int BADGE_STROKE_COLOR = UniColors.LAYER_FLOOR_1.getResId();
    private static final float BADGE_CORNER_RADIUS = ResourceExtKt.toPxF(8);
    private static final int BADGE_BOTTOM_MARGIN = ResourceExtKt.toPx(-6);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/pdpAspects/presentation/recyclerview/AspectItemComponentsView$Companion;", "", "<init>", "()V", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ AspectItemComponentsView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    private final void setupSpacers(PdpAspectsVO.Aspect.ItemSpacersVO spacers) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMargins(spacers.getHorizontal(), spacers.getVertical(), spacers.getHorizontal(), spacers.getVertical());
        setLayoutParams(marginLayoutParams);
        TextAtomV2View textAtomV2View = this.titleView;
        ViewGroup.LayoutParams layoutParams2 = textAtomV2View.getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
        marginLayoutParams2.topMargin = spacers.getBetweenPriceTitle();
        textAtomV2View.setLayoutParams(marginLayoutParams2);
        PriceAtomView priceAtomView = this.priceView;
        ViewGroup.LayoutParams layoutParams3 = priceAtomView.getLayoutParams();
        if (layoutParams3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
        marginLayoutParams3.topMargin = spacers.getBetweenPhotoPrice();
        priceAtomView.setLayoutParams(marginLayoutParams3);
    }

    public final void bind(@NotNull PdpAspectsVO.Aspect item) {
        Intrinsics.checkNotNullParameter(item, "item");
        ProductMediaHolderKt.bind$default(this.imageView, item.getImage(), null, 2, null);
        PriceAtomHolderKt.bind$default(this.priceView, item.getPrice(), null, 2, null);
        TextHolderKt.bind$default(this.titleView, item.getTitle(), null, 2, null);
        TextHolderKt.bindOrGone$default(this.subtitleView, item.getSubtitle(), null, 2, null);
        BadgeHolderKt.bindOrGone$default(this.badgeView, item.getBadge(), (Function1) null, 2, (Object) null);
        setupSpacers(item.getSpacers());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AspectItemComponentsView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        ProductMediaView productMediaView = new ProductMediaView(context, null, 0, 6, null);
        productMediaView.setId(R$id.pdpAspectItemImageView);
        ConstraintLayout.b bVar = new ConstraintLayout.b(-2, -2);
        bVar.f41636i = 0;
        bVar.f41656t = 0;
        bVar.f41658v = 0;
        productMediaView.setLayoutParams(bVar);
        addView(productMediaView);
        this.imageView = productMediaView;
        MaterialCardView materialCardView = new MaterialCardView(context);
        materialCardView.setId(R$id.pdpAspectItemBadgeView);
        ConstraintLayout.b bVar2 = new ConstraintLayout.b(-2, -2);
        bVar2.f41642l = R$id.pdpAspectItemImageView;
        bVar2.f41656t = 0;
        bVar2.f41658v = 0;
        ((ViewGroup.MarginLayoutParams) bVar2).bottomMargin = BADGE_BOTTOM_MARGIN;
        int i12 = BADGE_STROKE_WIDTH;
        materialCardView.setStrokeWidth(i12);
        materialCardView.setStrokeColor(StyleParser.INSTANCE.parseColor(context, (String) null, BADGE_STROKE_COLOR));
        materialCardView.setRadius(BADGE_CORNER_RADIUS);
        materialCardView.setElevation(0.0f);
        materialCardView.setLayoutParams(bVar2);
        addView(materialCardView);
        this.cardView = materialCardView;
        BadgeView badgeView = new BadgeView(context, null, 0, 0, 14, null);
        ConstraintLayout.b bVar3 = new ConstraintLayout.b(-2, -2);
        bVar3.setMargins(i12, i12, i12, i12);
        badgeView.setLayoutParams(bVar3);
        materialCardView.addView(badgeView);
        this.badgeView = badgeView;
        PriceAtomView priceAtomView = new PriceAtomView(context, null, 0, 6, null);
        ConstraintLayout.b b11 = C2860c.b(priceAtomView, R$id.pdpAspectItemPriceView, -2, -2);
        b11.f41638j = R$id.pdpAspectItemImageView;
        b11.f41656t = 0;
        b11.f41658v = 0;
        priceAtomView.setLayoutParams(b11);
        addView(priceAtomView);
        this.priceView = priceAtomView;
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
        ConstraintLayout.b d11 = b.d(textAtomV2View, R$id.pdpAspectItemTitleView, -2, -2);
        d11.f41638j = R$id.pdpAspectItemPriceView;
        d11.f41656t = 0;
        d11.f41658v = 0;
        textAtomV2View.setLayoutParams(d11);
        addView(textAtomV2View);
        this.titleView = textAtomV2View;
        TextAtomV2View textAtomV2View2 = new TextAtomV2View(context, null, 0, 6, null);
        ConstraintLayout.b d12 = b.d(textAtomV2View2, R$id.pdpAspectItemSubtitleView, -2, -2);
        d12.f41638j = R$id.pdpAspectItemTitleView;
        d12.f41656t = 0;
        d12.f41658v = 0;
        textAtomV2View2.setLayoutParams(d12);
        addView(textAtomV2View2);
        this.subtitleView = textAtomV2View2;
        setLayoutParams(new ConstraintLayout.b(CONTENTS_WIDTH, -2));
    }
}

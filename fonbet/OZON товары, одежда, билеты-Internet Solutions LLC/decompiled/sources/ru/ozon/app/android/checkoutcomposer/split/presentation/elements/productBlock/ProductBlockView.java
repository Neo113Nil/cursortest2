package ru.ozon.app.android.checkoutcomposer.split.presentation.elements.productBlock;

import F3.G;
import Im.a;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkout.R$id;
import ru.ozon.app.android.checkoutcomposer.split.data.SplitElementDTO;
import ru.ozon.app.android.checkoutgeo.checkout.data.PaddingsKt;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.uikit.extensions.ConstraintSetExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.ButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJG\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\r2\u001a\u0010\u0013\u001a\u0016\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0011¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u001b\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u0017\u0010\u001e\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010#\u001a\u00020\"8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010'\u001a\u00020\"8\u0006¢\u0006\f\n\u0004\b'\u0010$\u001a\u0004\b(\u0010&R\u0017\u0010)\u001a\u00020\"8\u0006¢\u0006\f\n\u0004\b)\u0010$\u001a\u0004\b*\u0010&R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0017\u0010/\u001a\u00020.8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102¨\u00063"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/split/presentation/elements/productBlock/ProductBlockView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Lru/ozon/app/android/checkoutcomposer/split/presentation/elements/productBlock/ProductsBlockVO;", "item", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "Lkotlin/Function2;", "Lru/ozon/app/android/checkoutcomposer/split/data/SplitElementDTO$SplitProductsBlockDTO$PromotedProduct$ProductTooltip;", "onShowTooltip", "bind", "(Lru/ozon/app/android/checkoutcomposer/split/presentation/elements/productBlock/ProductsBlockVO;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)V", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "getTitle", "()Lru/ozon/uni/android/atom/text/TextAtomV2View;", "subtitle", "getSubtitle", "Lru/ozon/uni/android/atom/badge/BadgeView;", "badge", "Lru/ozon/uni/android/atom/badge/BadgeView;", "getBadge", "()Lru/ozon/uni/android/atom/badge/BadgeView;", "Lru/ozon/app/android/checkoutcomposer/split/presentation/elements/productBlock/ProductView;", "product1", "Lru/ozon/app/android/checkoutcomposer/split/presentation/elements/productBlock/ProductView;", "getProduct1", "()Lru/ozon/app/android/checkoutcomposer/split/presentation/elements/productBlock/ProductView;", "product2", "getProduct2", "product3", "getProduct3", "Landroidx/constraintlayout/widget/Barrier;", "barrier", "Landroidx/constraintlayout/widget/Barrier;", "Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "button", "Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "getButton", "()Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ProductBlockView extends ConstraintLayout {

    @NotNull
    private final BadgeView badge;

    @NotNull
    private final Barrier barrier;

    @NotNull
    private final ButtonV3View button;

    @NotNull
    private final ProductView product1;

    @NotNull
    private final ProductView product2;

    @NotNull
    private final ProductView product3;

    @NotNull
    private final TextAtomV2View subtitle;

    @NotNull
    private final TextAtomV2View title;

    public /* synthetic */ ProductBlockView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    public final void bind(@NotNull ProductsBlockVO item, Function1<? super AtomAction, Unit> actionHandler, Function2<? super SplitElementDTO.SplitProductsBlockDTO.PromotedProduct.ProductTooltip, ? super Integer, Unit> onShowTooltip) {
        Intrinsics.checkNotNullParameter(item, "item");
        PaddingsKt.updatePadding(this, item.getPaddings());
        TextHolderKt.bindOrGone$default(this.title, item.getTitle(), null, 2, null);
        TextHolderKt.bindOrGone$default(this.subtitle, item.getSubtitle(), null, 2, null);
        BadgeHolderKt.bindOrGone$default(this.badge, item.getBadge(), (Function1) null, 2, (Object) null);
        ProductView productView = this.product1;
        List<SplitElementDTO.SplitProductsBlockDTO.PromotedProduct> promotedProducts = item.getPromotedProducts();
        productView.bindOrGone(promotedProducts != null ? (SplitElementDTO.SplitProductsBlockDTO.PromotedProduct) C7714v.Q(0, promotedProducts) : null, onShowTooltip);
        ProductView productView2 = this.product2;
        List<SplitElementDTO.SplitProductsBlockDTO.PromotedProduct> promotedProducts2 = item.getPromotedProducts();
        productView2.bindOrGone(promotedProducts2 != null ? (SplitElementDTO.SplitProductsBlockDTO.PromotedProduct) C7714v.Q(1, promotedProducts2) : null, onShowTooltip);
        ProductView productView3 = this.product3;
        List<SplitElementDTO.SplitProductsBlockDTO.PromotedProduct> promotedProducts3 = item.getPromotedProducts();
        productView3.bindOrGone(promotedProducts3 != null ? (SplitElementDTO.SplitProductsBlockDTO.PromotedProduct) C7714v.Q(2, promotedProducts3) : null, onShowTooltip);
        ButtonV3HolderKt.bindOrGone(this.button, item.getButton(), actionHandler);
    }

    @NotNull
    public final TextAtomV2View getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final TextAtomV2View getTitle() {
        return this.title;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductBlockView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        AttributeSet attributeSet2 = null;
        int i13 = 0;
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
        G.g(textAtomV2View, R$id.title, -2, -2);
        addView(textAtomV2View);
        this.title = textAtomV2View;
        TextAtomV2View textAtomV2View2 = new TextAtomV2View(context, null, 0, 6, null);
        G.g(textAtomV2View2, R$id.subtitle, -2, -2);
        addView(textAtomV2View2);
        this.subtitle = textAtomV2View2;
        int i14 = 14;
        DefaultConstructorMarker defaultConstructorMarker = null;
        int i15 = 0;
        BadgeView badgeView = new BadgeView(context, null, 0, 0, 14, null);
        a.c(badgeView, R$id.badge, -2, -2);
        addView(badgeView);
        this.badge = badgeView;
        ProductView productView = new ProductView(context, attributeSet2, i13, i15, i14, defaultConstructorMarker);
        productView.setId(R$id.product1);
        productView.setLayoutParams(new ConstraintLayout.b(-2, -2));
        addView(productView);
        this.product1 = productView;
        ProductView productView2 = new ProductView(context, attributeSet2, i13, i15, i14, defaultConstructorMarker);
        productView2.setId(R$id.product2);
        productView2.setLayoutParams(new ConstraintLayout.b(-2, -2));
        addView(productView2);
        this.product2 = productView2;
        ProductView productView3 = new ProductView(context, attributeSet2, i13, i15, i14, defaultConstructorMarker);
        productView3.setId(R$id.product3);
        productView3.setLayoutParams(new ConstraintLayout.b(-2, -2));
        addView(productView3);
        this.product3 = productView3;
        Barrier barrier = new Barrier(context);
        barrier.setId(View.generateViewId());
        barrier.setLayoutParams(new ConstraintLayout.b(0, 0));
        barrier.setReferencedIds(new int[]{productView.getId(), productView2.getId(), productView3.getId()});
        barrier.f(5);
        addView(barrier);
        this.barrier = barrier;
        ButtonV3View buttonV3View = new ButtonV3View(context, null, 0, 0, 14, null);
        buttonV3View.setId(View.generateViewId());
        buttonV3View.setLayoutParams(new ConstraintLayout.b(-2, -2));
        addView(buttonV3View);
        this.button = buttonV3View;
        int px = UiExtKt.toPx(4);
        int px2 = UiExtKt.toPx(5);
        int px3 = UiExtKt.toPx(8);
        d dVar = new d();
        dVar.p(this);
        ConstraintSetExtKt.startToStart$default(dVar, textAtomV2View.getId(), 0, 0, 4, null);
        ConstraintSetExtKt.endToStart(dVar, textAtomV2View.getId(), badgeView.getId(), px);
        ConstraintSetExtKt.topToTop$default(dVar, textAtomV2View.getId(), 0, 0, 4, null);
        dVar.C(textAtomV2View.getId(), true);
        dVar.c0(0.0f, textAtomV2View.getId());
        dVar.d0(textAtomV2View.getId(), 2);
        ConstraintSetExtKt.startToEnd$default(dVar, badgeView.getId(), textAtomV2View.getId(), 0, 4, null);
        ConstraintSetExtKt.endToStart(dVar, badgeView.getId(), barrier.getId(), px3);
        ConstraintSetExtKt.topToTop(dVar, badgeView.getId(), textAtomV2View.getId(), px2);
        ConstraintSetExtKt.startToStart$default(dVar, textAtomV2View2.getId(), 0, 0, 4, null);
        ConstraintSetExtKt.endToStart(dVar, textAtomV2View2.getId(), barrier.getId(), px3);
        ConstraintSetExtKt.topToBottom$default(dVar, textAtomV2View2.getId(), textAtomV2View.getId(), 0, 4, null);
        ConstraintSetExtKt.bottomToTop(dVar, textAtomV2View2.getId(), buttonV3View.getId(), px3);
        dVar.C(textAtomV2View2.getId(), true);
        dVar.c0(0.0f, textAtomV2View2.getId());
        ConstraintSetExtKt.endToEnd$default(dVar, productView3.getId(), 0, 0, 4, null);
        ConstraintSetExtKt.topToTop$default(dVar, productView3.getId(), 0, 0, 4, null);
        ConstraintSetExtKt.endToStart(dVar, productView2.getId(), productView3.getId(), px);
        ConstraintSetExtKt.topToTop$default(dVar, productView2.getId(), 0, 0, 4, null);
        ConstraintSetExtKt.endToStart(dVar, productView.getId(), productView2.getId(), px);
        ConstraintSetExtKt.topToTop$default(dVar, productView.getId(), 0, 0, 4, null);
        ConstraintSetExtKt.startToStart$default(dVar, buttonV3View.getId(), 0, 0, 4, null);
        ConstraintSetExtKt.bottomToBottom(dVar, buttonV3View.getId(), 0, px3);
        dVar.f(this);
    }
}

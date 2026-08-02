package ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.presentation.productBlock;

import F3.G;
import Im.a;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkout.R$id;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.extensions.ConstraintSetExtKt;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0015\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0019\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0011\u0010\u001b\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0018R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/common/splitDynamicElements/presentation/productBlock/ProductBlockView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "getTitle", "()Lru/ozon/uni/android/atom/text/TextAtomV2View;", "subtitle", "getSubtitle", "badge", "Lru/ozon/uni/android/atom/badge/BadgeView;", "getBadge", "()Lru/ozon/uni/android/atom/badge/BadgeView;", "product1", "Lru/ozon/app/android/checkoutcomposer/common/splitDynamicElements/presentation/productBlock/ProductView;", "getProduct1", "()Lru/ozon/app/android/checkoutcomposer/common/splitDynamicElements/presentation/productBlock/ProductView;", "product2", "getProduct2", "product3", "getProduct3", "barrier", "Landroidx/constraintlayout/widget/Barrier;", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ProductBlockView extends ConstraintLayout {

    @NotNull
    private final BadgeView badge;

    @NotNull
    private final Barrier barrier;

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

    @NotNull
    public final BadgeView getBadge() {
        return this.badge;
    }

    @NotNull
    public final ProductView getProduct1() {
        return this.product1;
    }

    @NotNull
    public final ProductView getProduct2() {
        return this.product2;
    }

    @NotNull
    public final ProductView getProduct3() {
        return this.product3;
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
        int px = ResourceExtKt.toPx(4, context);
        int px2 = ResourceExtKt.toPx(8, context);
        int px3 = ResourceExtKt.toPx(16, context);
        setPadding(px3, getPaddingTop(), px3, getPaddingBottom());
        d dVar = new d();
        dVar.p(this);
        ConstraintSetExtKt.startToStart$default(dVar, textAtomV2View.getId(), 0, 0, 4, null);
        ConstraintSetExtKt.endToStart(dVar, textAtomV2View.getId(), badgeView.getId(), px);
        ConstraintSetExtKt.topToTop$default(dVar, textAtomV2View.getId(), 0, 0, 4, null);
        dVar.C(textAtomV2View.getId(), true);
        dVar.c0(0.0f, textAtomV2View.getId());
        dVar.d0(textAtomV2View.getId(), 2);
        ConstraintSetExtKt.startToEnd$default(dVar, badgeView.getId(), textAtomV2View.getId(), 0, 4, null);
        ConstraintSetExtKt.endToStart(dVar, badgeView.getId(), barrier.getId(), px2);
        ConstraintSetExtKt.bottomToBottom$default(dVar, badgeView.getId(), textAtomV2View.getId(), 0, 4, null);
        ConstraintSetExtKt.startToStart$default(dVar, textAtomV2View2.getId(), 0, 0, 4, null);
        ConstraintSetExtKt.endToStart(dVar, textAtomV2View2.getId(), barrier.getId(), px2);
        ConstraintSetExtKt.topToBottom$default(dVar, textAtomV2View2.getId(), textAtomV2View.getId(), 0, 4, null);
        dVar.C(textAtomV2View2.getId(), true);
        dVar.c0(0.0f, textAtomV2View2.getId());
        ConstraintSetExtKt.endToEnd$default(dVar, productView3.getId(), 0, 0, 4, null);
        ConstraintSetExtKt.topToTop$default(dVar, productView3.getId(), 0, 0, 4, null);
        ConstraintSetExtKt.endToStart(dVar, productView2.getId(), productView3.getId(), px);
        ConstraintSetExtKt.topToTop$default(dVar, productView2.getId(), 0, 0, 4, null);
        ConstraintSetExtKt.endToStart(dVar, productView.getId(), productView2.getId(), px);
        ConstraintSetExtKt.topToTop$default(dVar, productView.getId(), 0, 0, 4, null);
        dVar.f(this);
    }
}

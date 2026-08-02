package ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.product.productView;

import Sc.InterfaceC4008j;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.Y;
import androidx.recyclerview.widget.RecyclerView;
import gk0.q;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.product.productView.ProductV2View$checkboxOutlineProvider$2;
import ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.product.productView.view.CheckBoxCutOutView;
import ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.product.productView.view.ProductDynamicElementsRecyclerView;
import ru.ozon.app.android.cart.feature.R$id;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.atom.productMedia.ProductMediaView;
import ru.ozon.uni.android.atom.selectionControls.CheckBoxView;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u0000i\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0011\b\u0007\u0018\u0000 82\u00020\u0001:\u00018B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0017¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0010\u0010\u000eR\u001b\u0010\u0016\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0017\u0010\u001b\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010 \u001a\u00020\u001f8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010%\u001a\u00020$8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010*\u001a\u00020)8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010/\u001a\u00020.8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u001b\u00107\u001a\u0002038FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b4\u0010\u0013\u001a\u0004\b5\u00106¨\u00069"}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/product/productView/ProductV2View;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attr", "", "defStileAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/view/MotionEvent;", "event", "", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "ev", "onInterceptTouchEvent", "ru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/product/productView/ProductV2View$checkboxOutlineProvider$2$1", "checkboxOutlineProvider$delegate", "LSc/j;", "getCheckboxOutlineProvider", "()Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/product/productView/ProductV2View$checkboxOutlineProvider$2$1;", "checkboxOutlineProvider", "Landroid/view/TouchDelegate;", "underPhotoTouchDelegate", "Landroid/view/TouchDelegate;", "Lru/ozon/uni/android/atom/productMedia/ProductMediaView;", "media", "Lru/ozon/uni/android/atom/productMedia/ProductMediaView;", "getMedia", "()Lru/ozon/uni/android/atom/productMedia/ProductMediaView;", "Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/product/productView/view/CheckBoxCutOutView;", "cutOutView", "Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/product/productView/view/CheckBoxCutOutView;", "getCutOutView", "()Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/product/productView/view/CheckBoxCutOutView;", "Lru/ozon/uni/android/atom/selectionControls/CheckBoxView;", "checkBox", "Lru/ozon/uni/android/atom/selectionControls/CheckBoxView;", "getCheckBox", "()Lru/ozon/uni/android/atom/selectionControls/CheckBoxView;", "Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/product/productView/view/ProductDynamicElementsRecyclerView;", "productDynamicElementsRv", "Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/product/productView/view/ProductDynamicElementsRecyclerView;", "getProductDynamicElementsRv", "()Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/product/productView/view/ProductDynamicElementsRecyclerView;", "Landroidx/constraintlayout/widget/Barrier;", "bottomBarrier", "Landroidx/constraintlayout/widget/Barrier;", "getBottomBarrier", "()Landroidx/constraintlayout/widget/Barrier;", "Landroidx/recyclerview/widget/RecyclerView;", "bottomDynamicElementsRv$delegate", "getBottomDynamicElementsRv", "()Landroidx/recyclerview/widget/RecyclerView;", "bottomDynamicElementsRv", "Companion", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ProductV2View extends ConstraintLayout {

    @NotNull
    private final Barrier bottomBarrier;

    /* renamed from: bottomDynamicElementsRv$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j bottomDynamicElementsRv;

    @NotNull
    private final CheckBoxView checkBox;

    /* renamed from: checkboxOutlineProvider$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j checkboxOutlineProvider;

    @NotNull
    private final CheckBoxCutOutView cutOutView;

    @NotNull
    private final ProductMediaView media;

    @NotNull
    private final ProductDynamicElementsRecyclerView productDynamicElementsRv;
    private TouchDelegate underPhotoTouchDelegate;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final int DP_16 = ResourceExtKt.toPx(16);
    private static final int cutOutSize = ResourceExtKt.toPx(32);
    private static final float checkBoxRadius = ResourceExtKt.toPxF(8);

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u000b¨\u0006\r"}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/product/productView/ProductV2View$Companion;", "", "<init>", "()V", "", "checkBoxRadius", "F", "getCheckBoxRadius", "()F", "", "CHECKBOX_LOCATOR", "Ljava/lang/String;", "MEDIA_LOCATOR", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final float getCheckBoxRadius() {
            return ProductV2View.checkBoxRadius;
        }

        private Companion() {
        }
    }

    public /* synthetic */ ProductV2View(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    private final ProductV2View$checkboxOutlineProvider$2.AnonymousClass1 getCheckboxOutlineProvider() {
        return (ProductV2View$checkboxOutlineProvider$2.AnonymousClass1) this.checkboxOutlineProvider.getValue();
    }

    @NotNull
    public final Barrier getBottomBarrier() {
        return this.bottomBarrier;
    }

    @NotNull
    public final RecyclerView getBottomDynamicElementsRv() {
        return (RecyclerView) this.bottomDynamicElementsRv.getValue();
    }

    @NotNull
    public final CheckBoxView getCheckBox() {
        return this.checkBox;
    }

    @NotNull
    public final CheckBoxCutOutView getCutOutView() {
        return this.cutOutView;
    }

    @NotNull
    public final ProductMediaView getMedia() {
        return this.media;
    }

    @NotNull
    public final ProductDynamicElementsRecyclerView getProductDynamicElementsRv() {
        return this.productDynamicElementsRv;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(@NotNull MotionEvent ev) {
        Intrinsics.checkNotNullParameter(ev, "ev");
        TouchDelegate touchDelegate = getTouchDelegate();
        if (touchDelegate == null || !touchDelegate.onTouchEvent(ev)) {
            return super.onInterceptTouchEvent(ev);
        }
        return true;
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(@NotNull MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        TouchDelegate touchDelegate = this.underPhotoTouchDelegate;
        if (touchDelegate == null || !touchDelegate.onTouchEvent(event)) {
            return super.onTouchEvent(event);
        }
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductV2View(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Context context2;
        Intrinsics.checkNotNullParameter(context, "context");
        this.checkboxOutlineProvider = LazyUtilsKt.unsafeLazy(ProductV2View$checkboxOutlineProvider$2.INSTANCE);
        q qVar = q.f64554a;
        View i12 = qVar.i(N.b(ProductMediaView.class), context);
        if (i12 == null) {
            context2 = context;
            i12 = new ProductMediaView(context, null, 0, 6, null);
        } else {
            context2 = context;
        }
        final ProductMediaView productMediaView = (ProductMediaView) i12;
        productMediaView.setId(R$id.CartProductMedia);
        ConstraintLayout.b bVar = new ConstraintLayout.b(-2, -2);
        bVar.f41656t = 0;
        bVar.f41636i = 0;
        productMediaView.setLayoutParams(bVar);
        productMediaView.setLocatorTag("cartSplit.productMedia");
        int i13 = Y.f42258g;
        if (!productMediaView.isLaidOut() || productMediaView.isLayoutRequested()) {
            productMediaView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.product.productView.ProductV2View$media$lambda$3$$inlined$doOnLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    Intrinsics.checkNotNullParameter(view, "view");
                    view.removeOnLayoutChangeListener(this);
                    ProductV2View.this.underPhotoTouchDelegate = new TouchDelegate(new Rect(productMediaView.getLeft(), productMediaView.getBottom(), productMediaView.getRight(), ProductV2View.this.getBottom()), productMediaView);
                }
            });
        } else {
            this.underPhotoTouchDelegate = new TouchDelegate(new Rect(productMediaView.getLeft(), productMediaView.getBottom(), productMediaView.getRight(), getBottom()), productMediaView);
        }
        addView(i12);
        this.media = productMediaView;
        View i14 = qVar.i(N.b(CheckBoxCutOutView.class), context2);
        i14 = i14 == null ? new CheckBoxCutOutView(context2, null, 0, 6, null) : i14;
        CheckBoxCutOutView checkBoxCutOutView = (CheckBoxCutOutView) i14;
        checkBoxCutOutView.setId(R$id.CartProductCutOutView);
        int i15 = cutOutSize;
        ConstraintLayout.b bVar2 = new ConstraintLayout.b(i15, i15);
        bVar2.f41656t = productMediaView.getId();
        bVar2.f41636i = productMediaView.getId();
        checkBoxCutOutView.setLayoutParams(bVar2);
        checkBoxCutOutView.setForeground(new ColorDrawable(context2.getColor(R$color.layer_floor_1)));
        checkBoxCutOutView.setVisibility(8);
        addView(i14);
        this.cutOutView = checkBoxCutOutView;
        View i16 = qVar.i(N.b(CheckBoxView.class), context2);
        i16 = i16 == null ? new CheckBoxView(context2, null, 0, 6, null) : i16;
        CheckBoxView checkBoxView = (CheckBoxView) i16;
        checkBoxView.setId(R$id.CartProductCheckBox);
        ConstraintLayout.b bVar3 = new ConstraintLayout.b(-2, -2);
        bVar3.f41656t = productMediaView.getId();
        bVar3.f41636i = productMediaView.getId();
        checkBoxView.setLayoutParams(bVar3);
        checkBoxView.setOutlineProvider(getCheckboxOutlineProvider());
        checkBoxView.setClipToOutline(true);
        checkBoxView.setVisibility(8);
        checkBoxView.setLocatorTag("cartSplit.productCheckbox");
        addView(i16);
        this.checkBox = checkBoxView;
        View i17 = qVar.i(N.b(ProductDynamicElementsRecyclerView.class), context2);
        i17 = i17 == null ? new ProductDynamicElementsRecyclerView(context2, null, 0, 6, null) : i17;
        ProductDynamicElementsRecyclerView productDynamicElementsRecyclerView = (ProductDynamicElementsRecyclerView) i17;
        productDynamicElementsRecyclerView.setId(R$id.CartProductProductDynamicElementsRv);
        ConstraintLayout.b bVar4 = new ConstraintLayout.b(0, -2);
        bVar4.setMargins(DP_16, 0, 0, 0);
        bVar4.f41655s = productMediaView.getId();
        bVar4.f41658v = 0;
        bVar4.f41636i = 0;
        productDynamicElementsRecyclerView.setLayoutParams(bVar4);
        productDynamicElementsRecyclerView.setNestedScrollingEnabled(false);
        addView(i17);
        this.productDynamicElementsRv = productDynamicElementsRecyclerView;
        Barrier barrier = new Barrier(context2);
        barrier.setId(R$id.CartProductBottomBarrier);
        barrier.f(3);
        barrier.setReferencedIds(new int[]{productMediaView.getId(), productDynamicElementsRecyclerView.getId()});
        addView(barrier);
        this.bottomBarrier = barrier;
        this.bottomDynamicElementsRv = LazyUtilsKt.unsafeLazy(new ProductV2View$bottomDynamicElementsRv$2(context2, this));
        setLayoutParams(new ConstraintLayout.b(-1, -2));
    }
}

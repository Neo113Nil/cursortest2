package ru.ozon.app.android.barcode.barcodeProductsList.presentation.viewHolder.items.products;

import Im.a;
import Sc.InterfaceC4008j;
import Sc.k;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.barcode.R$id;
import ru.ozon.app.android.cscore.databinding.ItemImageBinding;
import ru.ozon.app.android.cscore.orderdetails.molecule.images.presentation.adapter.ImageViewHolder;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.atom.price.ui.PriceAtomView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.extensions.ConstraintSetExtKt;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0015\u001a\u00020\n2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\n0\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0006¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001bR\"\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\n0\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u001b\u0010,\u001a\u00020'8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010.\u001a\u00020-8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0017\u00103\u001a\u0002028\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0017\u00108\u001a\u0002078\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u0017\u0010<\u001a\u0002078\u0006¢\u0006\f\n\u0004\b<\u00109\u001a\u0004\b=\u0010;R\u0017\u0010?\u001a\u00020>8\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u0014\u0010F\u001a\u00020C8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bD\u0010E¨\u0006G"}, d2 = {"Lru/ozon/app/android/barcode/barcodeProductsList/presentation/viewHolder/items/products/ProductView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "updateConstraints", "()V", "Landroid/view/MotionEvent;", "ev", "", "onInterceptTouchEvent", "(Landroid/view/MotionEvent;)Z", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "setAction", "(Lkotlin/jvm/functions/Function1;)V", "start", "setPriceBadgeStartPadding", "(I)V", "horizontalMargin", "I", "verticalMargin", "textsStartMargin", "spaceMargin", "onAction", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/cscore/databinding/ItemImageBinding;", "imageViewBinding", "Lru/ozon/app/android/cscore/databinding/ItemImageBinding;", "Landroidx/constraintlayout/widget/Barrier;", "separatorBarrier", "Landroidx/constraintlayout/widget/Barrier;", "Lru/ozon/app/android/cscore/orderdetails/molecule/images/presentation/adapter/ImageViewHolder;", "imageViewHolder$delegate", "LSc/j;", "getImageViewHolder", "()Lru/ozon/app/android/cscore/orderdetails/molecule/images/presentation/adapter/ImageViewHolder;", "imageViewHolder", "Lru/ozon/uni/android/atom/price/ui/PriceAtomView;", "priceView", "Lru/ozon/uni/android/atom/price/ui/PriceAtomView;", "getPriceView", "()Lru/ozon/uni/android/atom/price/ui/PriceAtomView;", "Lru/ozon/uni/android/atom/badge/BadgeView;", "priceBadgeView", "Lru/ozon/uni/android/atom/badge/BadgeView;", "getPriceBadgeView", "()Lru/ozon/uni/android/atom/badge/BadgeView;", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "titleView", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "getTitleView", "()Lru/ozon/uni/android/atom/text/TextAtomV2View;", "subtitleView", "getSubtitleView", "Landroid/view/View;", "separatorView", "Landroid/view/View;", "getSeparatorView", "()Landroid/view/View;", "Landroid/widget/FrameLayout;", "getImageView", "()Landroid/widget/FrameLayout;", "imageView", "barcode_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ProductView extends ConstraintLayout {
    private final int horizontalMargin;

    @NotNull
    private final ItemImageBinding imageViewBinding;

    /* renamed from: imageViewHolder$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j imageViewHolder;

    @NotNull
    private Function1<? super AtomAction, Unit> onAction;

    @NotNull
    private final BadgeView priceBadgeView;

    @NotNull
    private final PriceAtomView priceView;

    @NotNull
    private final Barrier separatorBarrier;

    @NotNull
    private final View separatorView;
    private final int spaceMargin;

    @NotNull
    private final TextAtomV2View subtitleView;
    private final int textsStartMargin;

    @NotNull
    private final TextAtomV2View titleView;
    private final int verticalMargin;

    public /* synthetic */ ProductView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    private final FrameLayout getImageView() {
        FrameLayout constraintLayout = this.imageViewBinding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        return constraintLayout;
    }

    private final void updateConstraints() {
        d dVar = new d();
        dVar.p(this);
        ConstraintSetExtKt.startToStart(dVar, getImageView().getId(), 0, this.horizontalMargin);
        ConstraintSetExtKt.topToTop(dVar, getImageView().getId(), 0, this.verticalMargin);
        ConstraintSetExtKt.startToEnd(dVar, this.priceView.getId(), getImageView().getId(), this.textsStartMargin);
        ConstraintSetExtKt.topToTop$default(dVar, this.priceView.getId(), getImageView().getId(), 0, 4, null);
        ConstraintSetExtKt.bottomToTop$default(dVar, this.priceView.getId(), this.titleView.getId(), 0, 4, null);
        ConstraintSetExtKt.topToTop$default(dVar, this.priceBadgeView.getId(), this.priceView.getId(), 0, 4, null);
        ConstraintSetExtKt.bottomToBottom$default(dVar, this.priceBadgeView.getId(), this.priceView.getId(), 0, 4, null);
        ConstraintSetExtKt.startToEnd$default(dVar, this.priceBadgeView.getId(), this.priceView.getId(), 0, 4, null);
        ConstraintSetExtKt.endToEnd(dVar, this.priceBadgeView.getId(), 0, this.horizontalMargin);
        dVar.A(this.priceBadgeView.getId(), 0);
        ConstraintSetExtKt.startToEnd(dVar, this.titleView.getId(), getImageView().getId(), this.textsStartMargin);
        ConstraintSetExtKt.topToBottom(dVar, this.titleView.getId(), this.priceView.getId(), this.spaceMargin);
        ConstraintSetExtKt.endToEnd(dVar, this.titleView.getId(), 0, this.horizontalMargin);
        ConstraintSetExtKt.bottomToTop$default(dVar, this.titleView.getId(), this.subtitleView.getId(), 0, 4, null);
        ConstraintSetExtKt.startToEnd(dVar, this.subtitleView.getId(), getImageView().getId(), this.textsStartMargin);
        ConstraintSetExtKt.topToBottom(dVar, this.subtitleView.getId(), this.titleView.getId(), this.spaceMargin);
        ConstraintSetExtKt.endToEnd(dVar, this.subtitleView.getId(), 0, this.horizontalMargin);
        ConstraintSetExtKt.bottomToBottom$default(dVar, this.subtitleView.getId(), getImageView().getId(), 0, 4, null);
        ConstraintSetExtKt.startToEnd(dVar, this.separatorView.getId(), getImageView().getId(), this.textsStartMargin);
        ConstraintSetExtKt.topToBottom(dVar, this.separatorView.getId(), this.separatorBarrier.getId(), this.verticalMargin);
        ConstraintSetExtKt.endToEnd$default(dVar, this.separatorView.getId(), 0, 0, 4, null);
        dVar.F(0, 0, new int[]{this.priceView.getId(), this.titleView.getId(), this.subtitleView.getId()}, null);
        dVar.f(this);
    }

    @NotNull
    public final ImageViewHolder getImageViewHolder() {
        return (ImageViewHolder) this.imageViewHolder.getValue();
    }

    @NotNull
    public final BadgeView getPriceBadgeView() {
        return this.priceBadgeView;
    }

    @NotNull
    public final PriceAtomView getPriceView() {
        return this.priceView;
    }

    @NotNull
    public final View getSeparatorView() {
        return this.separatorView;
    }

    @NotNull
    public final TextAtomV2View getSubtitleView() {
        return this.subtitleView;
    }

    @NotNull
    public final TextAtomV2View getTitleView() {
        return this.titleView;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        return true;
    }

    public final void setAction(@NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.onAction = actionHandler;
    }

    public final void setPriceBadgeStartPadding(int start) {
        d dVar = new d();
        dVar.p(this);
        ConstraintSetExtKt.startToEnd(dVar, this.priceBadgeView.getId(), this.priceView.getId(), start);
        dVar.f(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.horizontalMargin = ResourceExtKt.toPx(16);
        this.verticalMargin = ResourceExtKt.toPx(12);
        this.textsStartMargin = ResourceExtKt.toPx(12);
        this.spaceMargin = ResourceExtKt.toPx(2);
        this.onAction = ProductView$onAction$1.INSTANCE;
        ItemImageBinding inflate = ItemImageBinding.inflate(LayoutInflater.from(context));
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        this.imageViewBinding = inflate;
        Barrier barrier = new Barrier(context);
        barrier.setId(View.generateViewId());
        barrier.f(3);
        barrier.d(false);
        this.separatorBarrier = barrier;
        this.imageViewHolder = k.b(new ProductView$imageViewHolder$2(this));
        PriceAtomView priceAtomView = new PriceAtomView(context, null, 0, 6, null);
        priceAtomView.setId(R$id.productPrice);
        this.priceView = priceAtomView;
        BadgeView badgeView = new BadgeView(context, null, 0, 0, 14, null);
        a.c(badgeView, R$id.productPriceBadge, -2, -2);
        this.priceBadgeView = badgeView;
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
        textAtomV2View.setLayoutParams(new ConstraintLayout.b(0, -2));
        textAtomV2View.setId(R$id.productTitle);
        this.titleView = textAtomV2View;
        TextAtomV2View textAtomV2View2 = new TextAtomV2View(context, null, 0, 6, null);
        textAtomV2View2.setLayoutParams(new ConstraintLayout.b(0, -2));
        textAtomV2View2.setId(R$id.productSubtitle);
        this.subtitleView = textAtomV2View2;
        View view = new View(context);
        view.setId(R$id.productSeparator);
        view.setLayoutParams(new ConstraintLayout.b(0, ResourceExtKt.toPx(1)));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(ThemeExtKt.themeColor(context, R$attr.graphicNeutral));
        view.setBackground(gradientDrawable);
        this.separatorView = view;
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        getImageView().setId(View.generateViewId());
        barrier.setReferencedIds(new int[]{getImageView().getId(), textAtomV2View2.getId()});
        addView(getImageView());
        addView(priceAtomView);
        addView(badgeView);
        addView(textAtomV2View);
        addView(textAtomV2View2);
        addView(barrier);
        addView(view);
        updateConstraints();
    }
}

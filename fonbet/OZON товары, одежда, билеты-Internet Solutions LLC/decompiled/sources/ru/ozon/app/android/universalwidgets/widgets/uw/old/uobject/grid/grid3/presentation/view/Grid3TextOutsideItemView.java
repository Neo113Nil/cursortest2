package ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.grid.grid3.presentation.view;

import Sc.InterfaceC4008j;
import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.universalwidgets.R$id;
import ru.ozon.app.android.universalwidgets.widgets.uw.objectscroll.presentation.views.AdultContentView;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.grid.grid3.presentation.Grid3VO$Grid3ItemVO;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.grid.grid3.presentation.UnsafeLazyExtKt;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.atom.image.Image;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.extensions.view.LayoutExtKt;
import ru.ozon.uni.android.uikit.extensions.view.MeasureExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;
import ru.ozon.uni.atoms.v3.holders.image.ImageHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ+\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J7\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010!\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J\u001f\u0010&\u001a\u00020\u000f2\b\u0010$\u001a\u0004\u0018\u00010#2\u0006\u0010%\u001a\u00020\u0006¢\u0006\u0004\b&\u0010'J)\u0010(\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0004\b(\u0010\u0012R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010/\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010.R\u0014\u00101\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u001a\u00105\u001a\b\u0012\u0004\u0012\u000204038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u00107\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u00109\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u00108¨\u0006:"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/grid/grid3/presentation/view/Grid3TextOutsideItemView;", "Landroid/view/ViewGroup;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/grid/grid3/presentation/Grid3VO$Grid3ItemVO;", "item", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "bindImage", "(Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/grid/grid3/presentation/Grid3VO$Grid3ItemVO;Lkotlin/jvm/functions/Function1;)V", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "", "changed", "l", "t", "r", "b", "onLayout", "(ZIIII)V", "Landroid/view/View$OnClickListener;", "onClickListener", "setClickListener", "(Landroid/view/View$OnClickListener;)V", "Landroid/graphics/drawable/ShapeDrawable;", "shape", "bgColor", "setBackgroundShape", "(Landroid/graphics/drawable/ShapeDrawable;I)V", "bind", "Lru/ozon/uni/android/atom/image/Image;", "imageView", "Lru/ozon/uni/android/atom/image/Image;", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "titleView", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "subtitleView", "Lru/ozon/uni/android/atom/badge/BadgeView;", "badgeView", "Lru/ozon/uni/android/atom/badge/BadgeView;", "LSc/j;", "Lru/ozon/app/android/universalwidgets/widgets/uw/objectscroll/presentation/views/AdultContentView;", "adultContentView", "LSc/j;", "badgeMargin", "I", "imageBottomMargin", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class Grid3TextOutsideItemView extends ViewGroup {

    @NotNull
    private final InterfaceC4008j<AdultContentView> adultContentView;
    private final int badgeMargin;

    @NotNull
    private final BadgeView badgeView;
    private final int imageBottomMargin;

    @NotNull
    private final Image imageView;

    @NotNull
    private final TextAtomV2View subtitleView;

    @NotNull
    private final TextAtomV2View titleView;

    public /* synthetic */ Grid3TextOutsideItemView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    private final void bindImage(Grid3VO$Grid3ItemVO item, Function1<? super AtomAction, Unit> actionHandler) {
        if (item.getShouldBlur() && item.getBlurImage() != null) {
            ImageHolderKt.bind$default(this.imageView, item.getBlurImage(), null, 2, null);
            ViewExtKt.gone(this.badgeView);
            ViewExtKt.show(this.adultContentView.getValue());
        } else {
            ImageHolderKt.bindOrGone$default(this.imageView, item.getImage(), null, 2, null);
            View ifInitialized = UnsafeLazyExtKt.getIfInitialized(this.adultContentView);
            if (ifInitialized != null) {
                ViewExtKt.gone(ifInitialized);
            }
            BadgeHolderKt.bindOrGone(this.badgeView, item.getAdBadge(), actionHandler);
        }
    }

    public final void bind(@NotNull Grid3VO$Grid3ItemVO item, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        setPadding(item.getPaddingLeft(), item.getPaddingTop(), item.getPaddingRight(), item.getPaddingBottom());
        TextHolderKt.bindOrGone$default(this.titleView, item.getTitle(), null, 2, null);
        TextHolderKt.bindOrGone$default(this.subtitleView, item.getSubtitle(), null, 2, null);
        bindImage(item, actionHandler);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int l11, int t2, int r11, int b11) {
        LayoutExtKt.layoutLeftTop(this.imageView, getPaddingLeft(), getPaddingTop());
        LayoutExtKt.layoutRightTop(this.badgeView, this.imageView.getRight() - this.badgeMargin, this.imageView.getTop() + this.badgeMargin);
        View ifNotGone = ViewExtKt.getIfNotGone(this.titleView);
        if (ifNotGone != null) {
            LayoutExtKt.layoutLeftTop(ifNotGone, getPaddingLeft(), this.imageView.getBottom() + this.imageBottomMargin);
        }
        View ifNotGone2 = ViewExtKt.getIfNotGone(this.subtitleView);
        if (ifNotGone2 != null) {
            LayoutExtKt.layoutLeftTop(ifNotGone2, getPaddingLeft(), this.titleView.getMeasuredHeight() + this.imageView.getBottom() + this.imageBottomMargin);
        }
        View ifInitialized = UnsafeLazyExtKt.getIfInitialized(this.adultContentView);
        if (ifInitialized != null) {
            LayoutExtKt.layoutLeftTop(ifInitialized, ((this.imageView.getMeasuredWidth() - this.adultContentView.getValue().getMeasuredWidth()) / 2) + getPaddingLeft(), ((this.imageView.getMeasuredHeight() - this.adultContentView.getValue().getMeasuredHeight()) / 2) + getPaddingTop());
        }
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int size = View.MeasureSpec.getSize(widthMeasureSpec);
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        View ifNotGone = ViewExtKt.getIfNotGone(this.titleView);
        if (ifNotGone != null) {
            MeasureExtKt.measure(ifNotGone, paddingLeft, 1073741824, 0, 0);
        }
        View ifNotGone2 = ViewExtKt.getIfNotGone(this.subtitleView);
        if (ifNotGone2 != null) {
            MeasureExtKt.measure(ifNotGone2, paddingLeft, 1073741824, 0, 0);
        }
        MeasureExtKt.measureAtMost(this.badgeView, paddingLeft, paddingLeft);
        MeasureExtKt.measureAtMost(this.imageView, paddingLeft, paddingLeft);
        View ifInitialized = UnsafeLazyExtKt.getIfInitialized(this.adultContentView);
        if (ifInitialized != null) {
            MeasureExtKt.measureAtMost(ifInitialized, paddingLeft, paddingLeft);
        }
        setMeasuredDimension(size, getPaddingBottom() + getPaddingTop() + paddingLeft + ((this.titleView.getVisibility() == 8 && this.subtitleView.getVisibility() == 8) ? 0 : this.titleView.getMeasuredHeight() + this.subtitleView.getMeasuredHeight() + this.imageBottomMargin));
    }

    public final void setBackgroundShape(ShapeDrawable shape, int bgColor) {
        if (shape != null) {
            setBackground(shape);
        } else {
            setBackgroundColor(bgColor);
        }
    }

    public final void setClickListener(@NotNull View.OnClickListener onClickListener) {
        Intrinsics.checkNotNullParameter(onClickListener, "onClickListener");
        setOnClickListener(onClickListener);
        this.titleView.setOnClickListener(onClickListener);
        this.subtitleView.setOnClickListener(onClickListener);
        View ifInitialized = UnsafeLazyExtKt.getIfInitialized(this.adultContentView);
        AdultContentView adultContentView = ifInitialized instanceof AdultContentView ? (AdultContentView) ifInitialized : null;
        if (adultContentView != null) {
            adultContentView.setClickListener(onClickListener);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Grid3TextOutsideItemView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        Image image = new Image(context, null, 0, 6, null);
        image.setId(R$id.uwGrid3Image);
        addView(image);
        this.imageView = image;
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
        textAtomV2View.setId(R$id.uwGrid3Title);
        textAtomV2View.setFocusable(false);
        addView(textAtomV2View);
        this.titleView = textAtomV2View;
        TextAtomV2View textAtomV2View2 = new TextAtomV2View(context, null, 0, 6, null);
        textAtomV2View2.setId(R$id.uwGrid3Subtitle);
        textAtomV2View2.setFocusable(false);
        addView(textAtomV2View2);
        this.subtitleView = textAtomV2View2;
        BadgeView badgeView = new BadgeView(context, null, 0, 0, 14, null);
        badgeView.setId(R$id.uwGrid3Badge);
        addView(badgeView);
        this.badgeView = badgeView;
        this.adultContentView = LazyUtilsKt.unsafeLazy(new Grid3TextOutsideItemView$adultContentView$1(context, this));
        this.badgeMargin = UiExtKt.toPx(6);
        this.imageBottomMargin = UiExtKt.toPx(4);
    }
}

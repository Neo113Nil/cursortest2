package ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.grid.grid3.presentation.view;

import Sc.InterfaceC4008j;
import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
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
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;
import ru.ozon.uni.atoms.v3.holders.image.ImageHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ7\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001a\u001a\u00020\u00102\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0019\u001a\u00020\u0006¢\u0006\u0004\b\u001a\u0010\u001bJ)\u0010!\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u001c2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00100\u001e¢\u0006\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020-0,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00100\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101¨\u00062"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/grid/grid3/presentation/view/Grid3TextInsideItemView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "changed", "l", "t", "r", "b", "", "onLayout", "(ZIIII)V", "Landroid/view/View$OnClickListener;", "onClickListener", "setClickListener", "(Landroid/view/View$OnClickListener;)V", "Landroid/graphics/drawable/ShapeDrawable;", "shape", "bgColor", "setBackgroundShape", "(Landroid/graphics/drawable/ShapeDrawable;I)V", "Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/grid/grid3/presentation/Grid3VO$Grid3ItemVO;", "item", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "bind", "(Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/grid/grid3/presentation/Grid3VO$Grid3ItemVO;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/uni/android/atom/image/Image;", "imageView", "Lru/ozon/uni/android/atom/image/Image;", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "titleView", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "Lru/ozon/uni/android/atom/badge/BadgeView;", "badgeView", "Lru/ozon/uni/android/atom/badge/BadgeView;", "LSc/j;", "Lru/ozon/app/android/universalwidgets/widgets/uw/objectscroll/presentation/views/AdultContentView;", "adultContentView", "LSc/j;", "badgeMargin", "I", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class Grid3TextInsideItemView extends FrameLayout {

    @NotNull
    private final InterfaceC4008j<AdultContentView> adultContentView;
    private final int badgeMargin;

    @NotNull
    private final BadgeView badgeView;

    @NotNull
    private final Image imageView;

    @NotNull
    private final TextAtomV2View titleView;

    public /* synthetic */ Grid3TextInsideItemView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    public final void bind(@NotNull Grid3VO$Grid3ItemVO item, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        setPadding(item.getPaddingLeft(), item.getPaddingTop(), item.getPaddingRight(), item.getPaddingBottom());
        ViewExtKt.updatePadding(this.titleView, 0, 0, 0, 0);
        if (item.getShouldBlur() && item.getBlurImage() != null) {
            ImageHolderKt.bindOrGone$default(this.imageView, item.getBlurImage(), null, 2, null);
            ViewExtKt.show(this.adultContentView.getValue());
            ViewExtKt.gone(this.titleView);
            ViewExtKt.gone(this.badgeView);
            return;
        }
        ImageHolderKt.bindOrGone$default(this.imageView, item.getImage(), null, 2, null);
        View ifInitialized = UnsafeLazyExtKt.getIfInitialized(this.adultContentView);
        if (ifInitialized != null) {
            ViewExtKt.gone(ifInitialized);
        }
        TextHolderKt.bindOrGone$default(this.titleView, item.getTitle(), null, 2, null);
        BadgeHolderKt.bindOrGone(this.badgeView, item.getAdBadge(), actionHandler);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int l11, int t2, int r11, int b11) {
        LayoutExtKt.layoutLeftTop(this.imageView, getPaddingLeft(), getPaddingTop());
        LayoutExtKt.layoutRightTop(this.badgeView, this.imageView.getRight() - this.badgeMargin, this.imageView.getTop() + this.badgeMargin);
        LayoutExtKt.layoutLeftTop(this.titleView, getPaddingLeft(), getPaddingTop());
        View ifInitialized = UnsafeLazyExtKt.getIfInitialized(this.adultContentView);
        if (ifInitialized != null) {
            LayoutExtKt.layoutLeftTop(ifInitialized, ((this.imageView.getMeasuredWidth() - this.adultContentView.getValue().getMeasuredWidth()) / 2) + getPaddingLeft(), ((this.imageView.getMeasuredHeight() - this.adultContentView.getValue().getMeasuredHeight()) / 2) + getPaddingTop());
        }
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
        View ifInitialized = UnsafeLazyExtKt.getIfInitialized(this.adultContentView);
        AdultContentView adultContentView = ifInitialized instanceof AdultContentView ? (AdultContentView) ifInitialized : null;
        if (adultContentView != null) {
            adultContentView.setClickListener(onClickListener);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Grid3TextInsideItemView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
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
        BadgeView badgeView = new BadgeView(context, null, 0, 0, 14, null);
        badgeView.setId(R$id.uwGrid3Badge);
        addView(badgeView);
        this.badgeView = badgeView;
        this.adultContentView = LazyUtilsKt.unsafeLazy(new Grid3TextInsideItemView$adultContentView$1(context, this));
        this.badgeMargin = UiExtKt.toPx(6);
    }
}

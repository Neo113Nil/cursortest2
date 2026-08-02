package ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.gridone.views;

import Sc.InterfaceC4008j;
import Sc.k;
import Sc.n;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.storefrontcommonwidgets.core.views.AspectRatioImageView;
import ru.ozon.app.android.universalwidgets.R$id;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.AdvBadgeDelegate;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.AdvBadgeFrameLayoutDelegate;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.gridone.rv.UwAdapterData;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ/\u0010\u0014\u001a\u00020\u00122\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0014\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0012¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0012¢\u0006\u0004\b\u0018\u0010\u0017J\u001f\u0010\u001d\u001a\u00020\u00122\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u001f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\rR\u001a\u0010\"\u001a\u00020\u00078\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001a\u0010&\u001a\u00020\u00078\u0004X\u0084\u0004¢\u0006\f\n\u0004\b&\u0010#\u001a\u0004\b'\u0010%R\u001a\u0010(\u001a\u00020\u00078\u0004X\u0084\u0004¢\u0006\f\n\u0004\b(\u0010#\u001a\u0004\b)\u0010%R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u001b\u00102\u001a\u00020-8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0014\u00106\u001a\u0002038&X¦\u0004¢\u0006\u0006\u001a\u0004\b4\u00105R\u0014\u00108\u001a\u0002038&X¦\u0004¢\u0006\u0006\u001a\u0004\b7\u00105¨\u00069"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/gridone/views/UwObjectGridOneView;", "Landroid/widget/FrameLayout;", "Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/AdvBadgeDelegate;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lru/ozon/app/android/storefrontcommonwidgets/core/views/AspectRatioImageView;", "appendImageView", "()Lru/ozon/app/android/storefrontcommonwidgets/core/views/AspectRatioImageView;", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "badge", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "onAction", "setAdvBadgeOrGone", "(Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lkotlin/jvm/functions/Function1;)V", "applyCorners", "()V", "resetCorners", "", "image", "Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/gridone/rv/UwAdapterData;", "adapterData", "bindImageView", "(Ljava/lang/String;Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/gridone/rv/UwAdapterData;)V", "imageView", "Lru/ozon/app/android/storefrontcommonwidgets/core/views/AspectRatioImageView;", "getImageView", "margin4", "I", "getMargin4", "()I", "margin16", "getMargin16", "margin54", "getMargin54", "Landroid/graphics/drawable/GradientDrawable;", "cornersDrawable", "Landroid/graphics/drawable/GradientDrawable;", "Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/AdvBadgeFrameLayoutDelegate;", "badgeDelegate$delegate", "LSc/j;", "getBadgeDelegate", "()Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/AdvBadgeFrameLayoutDelegate;", "badgeDelegate", "Landroidx/appcompat/widget/AppCompatTextView;", "getTitleTv", "()Landroidx/appcompat/widget/AppCompatTextView;", "titleTv", "getSubtitleTv", "subtitleTv", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class UwObjectGridOneView extends FrameLayout implements AdvBadgeDelegate {

    /* renamed from: badgeDelegate$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j badgeDelegate;

    @NotNull
    private final GradientDrawable cornersDrawable;

    @NotNull
    private final AspectRatioImageView imageView;
    private final int margin16;
    private final int margin4;
    private final int margin54;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UwObjectGridOneView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.margin4 = ResourceExtKt.toPx(4);
        this.margin16 = ResourceExtKt.toPx(16, context);
        this.margin54 = ResourceExtKt.toPx(54, context);
        this.cornersDrawable = new GradientDrawable();
        this.badgeDelegate = k.a(n.NONE, new UwObjectGridOneView$badgeDelegate$2(this, context));
        this.imageView = appendImageView();
    }

    private final AspectRatioImageView appendImageView() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        AspectRatioImageView aspectRatioImageView = new AspectRatioImageView(context, null, 0, 6, null);
        ViewGroup.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        aspectRatioImageView.setId(R$id.imageView);
        aspectRatioImageView.setClipToOutline(true);
        aspectRatioImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        addView(aspectRatioImageView, layoutParams);
        return aspectRatioImageView;
    }

    private final AdvBadgeFrameLayoutDelegate getBadgeDelegate() {
        return (AdvBadgeFrameLayoutDelegate) this.badgeDelegate.getValue();
    }

    public final void applyCorners() {
        this.imageView.setBackground(this.cornersDrawable);
    }

    public final void bindImageView(String image, @NotNull UwAdapterData adapterData) {
        Intrinsics.checkNotNullParameter(adapterData, "adapterData");
        this.imageView.layout(0, 0, 0, 0);
        this.imageView.setRatio(Float.valueOf(adapterData.getRatio()));
        this.cornersDrawable.setCornerRadius(ResourceExtKt.toPxF(adapterData.getCornerRadius().getPx()));
        ImageViewExtKt.load$default(this.imageView, image, null, null, null, null, false, null, 126, null);
        ThemeExtKt.setParandjaForDarkTheme(this.imageView);
        if (adapterData.getPaddings() != null) {
            AspectRatioImageView aspectRatioImageView = this.imageView;
            ViewGroup.LayoutParams layoutParams = aspectRatioImageView.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams == null) {
                return;
            }
            int i11 = marginLayoutParams.leftMargin;
            int i12 = marginLayoutParams.topMargin;
            int i13 = marginLayoutParams.rightMargin;
            int i14 = marginLayoutParams.bottomMargin;
            marginLayoutParams.setMarginStart(adapterData.getPaddings().getLeft());
            marginLayoutParams.topMargin = adapterData.getPaddings().getTop();
            marginLayoutParams.setMarginEnd(adapterData.getPaddings().getRight());
            marginLayoutParams.bottomMargin = adapterData.getPaddings().getBottom();
            if (i11 == marginLayoutParams.leftMargin) {
                ViewGroup.LayoutParams layoutParams2 = aspectRatioImageView.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
                if (i12 == (marginLayoutParams2 != null ? marginLayoutParams2.topMargin : 0)) {
                    ViewGroup.LayoutParams layoutParams3 = aspectRatioImageView.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
                    if (i13 == (marginLayoutParams3 != null ? marginLayoutParams3.rightMargin : 0)) {
                        ViewGroup.LayoutParams layoutParams4 = aspectRatioImageView.getLayoutParams();
                        ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams4 : null;
                        if (i14 == (marginLayoutParams4 != null ? marginLayoutParams4.bottomMargin : 0)) {
                            return;
                        }
                    }
                }
            }
            aspectRatioImageView.setLayoutParams(marginLayoutParams);
        }
    }

    @NotNull
    public final AspectRatioImageView getImageView() {
        return this.imageView;
    }

    protected final int getMargin16() {
        return this.margin16;
    }

    protected final int getMargin4() {
        return this.margin4;
    }

    protected final int getMargin54() {
        return this.margin54;
    }

    @NotNull
    public abstract AppCompatTextView getSubtitleTv();

    @NotNull
    public abstract AppCompatTextView getTitleTv();

    public final void resetCorners() {
        this.imageView.setBackground(null);
    }

    @Override // ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.AdvBadgeDelegate
    public void setAdvBadgeOrGone(BadgeDTO badge, Function1<? super AtomAction, Unit> onAction) {
        getBadgeDelegate().setAdvBadgeOrGone(badge, onAction);
    }
}

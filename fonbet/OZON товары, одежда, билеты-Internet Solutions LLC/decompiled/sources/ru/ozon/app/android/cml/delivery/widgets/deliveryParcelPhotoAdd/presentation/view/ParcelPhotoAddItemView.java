package ru.ozon.app.android.cml.delivery.widgets.deliveryParcelPhotoAdd.presentation.view;

import B3.D;
import Kk.C3531a;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cml.delivery.R$id;
import ru.ozon.app.android.cml.delivery.common.ext.Dimens;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.image.Image;
import ru.ozon.uni.android.uikit.common.StyleParser;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\u001c\u001a\u0004\u0018\u00010\u001d*\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 ¢\u0006\u0002\u0010!R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\u0014\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0011\u0010\u0016\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0011\u0010\u0018\u001a\u00020\u0019¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006#"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/presentation/view/ParcelPhotoAddItemView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "image", "Lru/ozon/uni/android/atom/image/Image;", "getImage", "()Lru/ozon/uni/android/atom/image/Image;", "borderView", "Landroid/view/View;", "getBorderView", "()Landroid/view/View;", "deleteIcon", "Lru/ozon/uni/android/atom/icon/IconView;", "getDeleteIcon", "()Lru/ozon/uni/android/atom/icon/IconView;", "centerIcon", "getCenterIcon", "retryIcon", "getRetryIcon", "cancelIcon", "getCancelIcon", "progressView", "Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/presentation/view/CircularProgressBar;", "getProgressView", "()Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/presentation/view/CircularProgressBar;", "setBorderColor", "", "Landroid/graphics/drawable/Drawable;", "color", "", "(Landroid/graphics/drawable/Drawable;Ljava/lang/String;)Lkotlin/Unit;", "Companion", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ParcelPhotoAddItemView extends ConstraintLayout {

    @NotNull
    private static final GradientDrawable emptyItemBackground;

    @NotNull
    private final View borderView;

    @NotNull
    private final IconView cancelIcon;

    @NotNull
    private final IconView centerIcon;

    @NotNull
    private final IconView deleteIcon;

    @NotNull
    private final Image image;

    @NotNull
    private final CircularProgressBar progressView;

    @NotNull
    private final IconView retryIcon;

    static {
        GradientDrawable b11 = D.b(0);
        b11.setCornerRadius(Dimens.INSTANCE.getDpf16());
        emptyItemBackground = b11;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ParcelPhotoAddItemView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Image image = new Image(context, null, 0, 6, null);
        image.setId(R$id.deliveryParcelPhotoAdd_image);
        ConstraintLayout.b bVar = new ConstraintLayout.b(-2, -2);
        bVar.f41636i = 0;
        bVar.f41656t = 0;
        Dimens dimens = Dimens.INSTANCE;
        ((ViewGroup.MarginLayoutParams) bVar).topMargin = dimens.getDp6();
        bVar.setMarginEnd(dimens.getDp6());
        image.setLayoutParams(bVar);
        addView(image);
        this.image = image;
        View view = new View(context);
        ConstraintLayout.b bVar2 = new ConstraintLayout.b(0, 0);
        int i11 = R$id.deliveryParcelPhotoAdd_image;
        bVar2.f41636i = i11;
        bVar2.f41656t = i11;
        bVar2.f41658v = i11;
        bVar2.f41642l = i11;
        view.setLayoutParams(bVar2);
        Drawable drawable = emptyItemBackground;
        setBorderColor(drawable, null);
        view.setBackground(drawable);
        addView(view);
        this.borderView = view;
        AttributeSet attributeSet = null;
        int i12 = 0;
        int i13 = 6;
        DefaultConstructorMarker defaultConstructorMarker = null;
        IconView iconView = new IconView(context, attributeSet, i12, i13, defaultConstructorMarker);
        ConstraintLayout.b a11 = C3531a.a(iconView, R$id.deliveryParcelPhotoAdd_delete, -2, -2);
        int i14 = R$id.deliveryParcelPhotoAdd_image;
        a11.f41636i = i14;
        a11.f41658v = i14;
        ((ViewGroup.MarginLayoutParams) a11).topMargin = -dimens.getDp6();
        a11.setMarginEnd(-dimens.getDp6());
        iconView.setLayoutParams(a11);
        addView(iconView);
        this.deleteIcon = iconView;
        IconView iconView2 = new IconView(context, attributeSet, i12, i13, defaultConstructorMarker);
        ConstraintLayout.b a12 = C3531a.a(iconView2, R$id.deliveryParcelPhotoAdd_icon, -2, -2);
        int i15 = R$id.deliveryParcelPhotoAdd_image;
        a12.f41636i = i15;
        a12.f41656t = i15;
        a12.f41658v = i15;
        a12.f41642l = i15;
        iconView2.setLayoutParams(a12);
        addView(iconView2);
        this.centerIcon = iconView2;
        IconView iconView3 = new IconView(context, attributeSet, i12, i13, defaultConstructorMarker);
        ConstraintLayout.b a13 = C3531a.a(iconView3, R$id.deliveryParcelPhotoAdd_retry, -2, -2);
        int i16 = R$id.deliveryParcelPhotoAdd_image;
        a13.f41636i = i16;
        a13.f41656t = i16;
        a13.f41658v = i16;
        a13.f41642l = i16;
        iconView3.setLayoutParams(a13);
        iconView3.setVisibility(8);
        addView(iconView3);
        this.retryIcon = iconView3;
        IconView iconView4 = new IconView(context, attributeSet, i12, i13, defaultConstructorMarker);
        ConstraintLayout.b a14 = C3531a.a(iconView4, R$id.deliveryParcelPhotoAdd_cancel, -2, -2);
        int i17 = R$id.deliveryParcelPhotoAdd_image;
        a14.f41636i = i17;
        a14.f41656t = i17;
        a14.f41658v = i17;
        a14.f41642l = i17;
        iconView4.setLayoutParams(a14);
        iconView4.setVisibility(8);
        addView(iconView4);
        this.cancelIcon = iconView4;
        CircularProgressBar circularProgressBar = new CircularProgressBar(context, attributeSet, i12, i13, defaultConstructorMarker);
        circularProgressBar.setId(R$id.deliveryParcelPhotoAdd_progress);
        ConstraintLayout.b bVar3 = new ConstraintLayout.b(dimens.getDp36(), dimens.getDp36());
        int i18 = R$id.deliveryParcelPhotoAdd_image;
        bVar3.f41636i = i18;
        bVar3.f41656t = i18;
        bVar3.f41658v = i18;
        bVar3.f41642l = i18;
        circularProgressBar.setLayoutParams(bVar3);
        circularProgressBar.setVisibility(8);
        addView(circularProgressBar);
        this.progressView = circularProgressBar;
        setLayoutParams(new ConstraintLayout.b(-2, -2));
    }

    @NotNull
    public final View getBorderView() {
        return this.borderView;
    }

    @NotNull
    public final IconView getCancelIcon() {
        return this.cancelIcon;
    }

    @NotNull
    public final IconView getCenterIcon() {
        return this.centerIcon;
    }

    @NotNull
    public final IconView getDeleteIcon() {
        return this.deleteIcon;
    }

    @NotNull
    public final Image getImage() {
        return this.image;
    }

    @NotNull
    public final CircularProgressBar getProgressView() {
        return this.progressView;
    }

    @NotNull
    public final IconView getRetryIcon() {
        return this.retryIcon;
    }

    public final Unit setBorderColor(@NotNull Drawable drawable, String str) {
        Intrinsics.checkNotNullParameter(drawable, "<this>");
        GradientDrawable gradientDrawable = drawable instanceof GradientDrawable ? (GradientDrawable) drawable : null;
        if (gradientDrawable == null) {
            return null;
        }
        Dimens dimens = Dimens.INSTANCE;
        int dp1 = dimens.getDp1();
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        gradientDrawable.setStroke(dp1, styleParser.parseColor(context, str, R$color.graphic_quaternary), dimens.getDpf2(), dimens.getDpf2());
        return Unit.f71690a;
    }
}

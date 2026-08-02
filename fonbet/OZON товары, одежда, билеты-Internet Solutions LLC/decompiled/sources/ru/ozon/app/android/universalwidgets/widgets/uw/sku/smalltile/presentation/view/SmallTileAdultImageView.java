package ru.ozon.app.android.universalwidgets.widgets.uw.sku.smalltile.presentation.view;

import Sc.InterfaceC4008j;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ColorDrawable;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.product.common.TileThemeConfigVO;
import ru.ozon.app.android.product.molecules.blur.presentation.BlurMoleculeView;
import ru.ozon.app.android.product.utils.ImageLoadExtKt;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.smalltile.presentation.vo.SmallTileAdultImageModel;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.smalltile.presentation.vo.SmallTileModelImage;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ/\u0010\u0010\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001a\u0010\u001bR\u001b\u0010!\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u001d\u0010*\u001a\b\u0012\u0004\u0012\u00020)0(8\u0006¢\u0006\f\n\u0004\b*\u0010\u001e\u001a\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/smalltile/presentation/view/SmallTileAdultImageView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "enableParanja", "", "showParanja", "(Z)V", "", "width", "height", "oldw", "oldh", "onSizeChanged", "(IIII)V", "Landroid/graphics/Canvas;", "canvas", "dispatchDraw", "(Landroid/graphics/Canvas;)V", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/smalltile/presentation/vo/SmallTileAdultImageModel;", "imageModel", "Lru/ozon/app/android/product/common/TileThemeConfigVO;", "theme", "bind", "(Lru/ozon/app/android/universalwidgets/widgets/uw/sku/smalltile/presentation/vo/SmallTileAdultImageModel;Lru/ozon/app/android/product/common/TileThemeConfigVO;)V", "Landroidx/appcompat/widget/AppCompatImageView;", "ratioIV$delegate", "LSc/j;", "getRatioIV", "()Landroidx/appcompat/widget/AppCompatImageView;", "ratioIV", "Landroid/graphics/drawable/ColorDrawable;", "overlayDrawable", "Landroid/graphics/drawable/ColorDrawable;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/smalltile/presentation/view/SmallTileAdultImagePathClipper;", "pathClipper", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/smalltile/presentation/view/SmallTileAdultImagePathClipper;", "LSc/j;", "Lru/ozon/app/android/product/molecules/blur/presentation/BlurMoleculeView;", "blurMoleculeView", "getBlurMoleculeView", "()LSc/j;", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})
/* loaded from: classes2.dex */
public final class SmallTileAdultImageView extends FrameLayout {

    @NotNull
    private final InterfaceC4008j<BlurMoleculeView> blurMoleculeView;

    @NotNull
    private final ColorDrawable overlayDrawable;

    @NotNull
    private final SmallTileAdultImagePathClipper pathClipper;

    /* renamed from: ratioIV$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j ratioIV;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SmallTileAdultImageView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.ratioIV = LazyUtilsKt.unsafeLazy(new SmallTileAdultImageView$ratioIV$2(this));
        this.overlayDrawable = new ColorDrawable(ThemeExtKt.themeColor(context, R$attr.layerOverlayParanja));
        this.pathClipper = new SmallTileAdultImagePathClipper();
        this.blurMoleculeView = LazyUtilsKt.unsafeLazy(new SmallTileAdultImageView$blurMoleculeView$1(context, this));
        setFocusable(false);
        setFocusableInTouchMode(false);
        setClickable(false);
    }

    private final AppCompatImageView getRatioIV() {
        return (AppCompatImageView) this.ratioIV.getValue();
    }

    private final void showParanja(boolean enableParanja) {
        setForeground(enableParanja ? this.overlayDrawable : null);
    }

    public final void bind(@NotNull SmallTileAdultImageModel imageModel, TileThemeConfigVO theme) {
        Intrinsics.checkNotNullParameter(imageModel, "imageModel");
        SmallTileModelImage image = imageModel.getImage();
        this.pathClipper.setCornerRadius(Float.valueOf(theme != null ? theme.getContainerCornerRadius() : 0.0f));
        this.pathClipper.updateClipPath(getMeasuredWidth(), getMeasuredHeight());
        getRatioIV().setScaleType(image.getScaleType());
        showParanja(image.getEnableParanja());
        ImageLoadExtKt.loadImageWithCrossFadeSafely$default(getRatioIV(), image.getUrl(), null, null, null, 14, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        this.pathClipper.clipPath(canvas);
        super.dispatchDraw(canvas);
    }

    @NotNull
    public final InterfaceC4008j<BlurMoleculeView> getBlurMoleculeView() {
        return this.blurMoleculeView;
    }

    @Override // android.view.View
    protected void onSizeChanged(int width, int height, int oldw, int oldh) {
        this.pathClipper.updateClipPath(width, height);
    }
}

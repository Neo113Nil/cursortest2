package ru.ozon.app.android.universalwidgets.widgets.uw.sku.tilescroll.ui.utils;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tilescroll.ui.utils.TileScrollBannerViewBuilder;
import ru.ozon.uni.android.atom.image.Image;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.data.image.ImageAspectRatio;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0006\u001a\u00020\u0007J\u0006\u0010\b\u001a\u00020\tJ\u0006\u0010\n\u001a\u00020\u0007J\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilescroll/ui/utils/TileScrollBannerViewBuilder;", "", "container", "Landroid/view/ViewGroup;", "<init>", "(Landroid/view/ViewGroup;)V", "buildBanner", "Lru/ozon/uni/android/atom/image/Image;", "buildTitle", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "buildLogo", "buildButton", "Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "Companion", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TileScrollBannerViewBuilder {

    @NotNull
    private final ViewGroup container;

    @NotNull
    private static final Companion Companion = new Companion(null);
    private static final int logoMargin = ResourceExtKt.toPx(12);
    private static final int buttonMargin = ResourceExtKt.toPx(6);
    private static final int logoMinWidth = ResourceExtKt.toPx(92);
    private static final int logoMinHeight = ResourceExtKt.toPx(46);

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\b¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilescroll/ui/utils/TileScrollBannerViewBuilder$Companion;", "", "<init>", "()V", "", "logoMinWidth", "I", "getLogoMinWidth", "()I", "logoMinHeight", "getLogoMinHeight", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getLogoMinHeight() {
            return TileScrollBannerViewBuilder.logoMinHeight;
        }

        public final int getLogoMinWidth() {
            return TileScrollBannerViewBuilder.logoMinWidth;
        }

        private Companion() {
        }
    }

    public TileScrollBannerViewBuilder(@NotNull ViewGroup container) {
        Intrinsics.checkNotNullParameter(container, "container");
        this.container = container;
    }

    @NotNull
    public final Image buildBanner() {
        final Context context = this.container.getContext();
        Image image = new Image(context) { // from class: ru.ozon.app.android.universalwidgets.widgets.uw.sku.tilescroll.ui.utils.TileScrollBannerViewBuilder$buildBanner$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(context, null, 0, 6, null);
                Intrinsics.f(context);
                setId(View.generateViewId());
                setRatio(ImageAspectRatio.RATIO_16_9);
                setScaleType(ImageView.ScaleType.FIT_CENTER);
            }

            @Override // ru.ozon.uni.android.atom.image.Image, android.widget.ImageView, android.view.View
            protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
                int size = View.MeasureSpec.getSize(heightMeasureSpec);
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(getAspectRatio().getHeightRatio() * (size / getAspectRatio().getWidthRatio()), 1073741824), View.MeasureSpec.makeMeasureSpec(size, 1073741824));
            }
        };
        this.container.addView(image, new ConstraintLayout.b(-2, -1));
        return image;
    }

    @NotNull
    public final ButtonV3View buildButton() {
        Context context = this.container.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ButtonV3View buttonV3View = new ButtonV3View(context, null, 0, 0, 14, null);
        buttonV3View.setId(View.generateViewId());
        ViewGroup viewGroup = this.container;
        ConstraintLayout.b bVar = new ConstraintLayout.b(0, -2);
        bVar.f41656t = 0;
        bVar.f41642l = 0;
        bVar.f41658v = 0;
        int i11 = buttonMargin;
        ((ViewGroup.MarginLayoutParams) bVar).leftMargin = i11;
        ((ViewGroup.MarginLayoutParams) bVar).rightMargin = i11;
        ((ViewGroup.MarginLayoutParams) bVar).bottomMargin = i11;
        Unit unit = Unit.f71690a;
        viewGroup.addView(buttonV3View, bVar);
        return buttonV3View;
    }

    @NotNull
    public final Image buildLogo() {
        final Context context = this.container.getContext();
        Image image = new Image(context) { // from class: ru.ozon.app.android.universalwidgets.widgets.uw.sku.tilescroll.ui.utils.TileScrollBannerViewBuilder$buildLogo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(context, null, 0, 6, null);
                TileScrollBannerViewBuilder.Companion companion;
                TileScrollBannerViewBuilder.Companion companion2;
                Intrinsics.f(context);
                setId(View.generateViewId());
                companion = TileScrollBannerViewBuilder.Companion;
                setMinimumHeight(companion.getLogoMinHeight());
                companion2 = TileScrollBannerViewBuilder.Companion;
                setMinimumWidth(companion2.getLogoMinWidth());
            }

            @Override // ru.ozon.uni.android.atom.image.Image, android.widget.ImageView, android.view.View
            protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
                TileScrollBannerViewBuilder.Companion companion;
                TileScrollBannerViewBuilder.Companion companion2;
                int size = View.MeasureSpec.getSize(widthMeasureSpec) / 2;
                companion = TileScrollBannerViewBuilder.Companion;
                if (size <= companion.getLogoMinHeight()) {
                    companion2 = TileScrollBannerViewBuilder.Companion;
                    size = companion2.getLogoMinHeight();
                }
                setMeasuredDimension(widthMeasureSpec, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
            }
        };
        ViewGroup viewGroup = this.container;
        ConstraintLayout.b bVar = new ConstraintLayout.b(0, -2);
        bVar.f41607N = logoMinWidth;
        bVar.f41608O = logoMinHeight;
        bVar.f41656t = 0;
        bVar.f41642l = 0;
        bVar.f41658v = 0;
        int i11 = logoMargin;
        ((ViewGroup.MarginLayoutParams) bVar).leftMargin = i11;
        ((ViewGroup.MarginLayoutParams) bVar).rightMargin = i11;
        ((ViewGroup.MarginLayoutParams) bVar).bottomMargin = i11;
        Unit unit = Unit.f71690a;
        viewGroup.addView(image, bVar);
        return image;
    }

    @NotNull
    public final TextAtomV2View buildTitle() {
        Context context = this.container.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
        textAtomV2View.setId(View.generateViewId());
        textAtomV2View.setTextIsSelectable(false);
        ViewGroup viewGroup = this.container;
        ConstraintLayout.b bVar = new ConstraintLayout.b(0, -2);
        bVar.f41656t = 0;
        bVar.f41636i = 0;
        bVar.f41658v = 0;
        Unit unit = Unit.f71690a;
        viewGroup.addView(textAtomV2View, bVar);
        return textAtomV2View;
    }
}

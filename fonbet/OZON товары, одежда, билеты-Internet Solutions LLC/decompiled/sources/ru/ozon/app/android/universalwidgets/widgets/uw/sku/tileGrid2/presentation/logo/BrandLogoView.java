package ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.logo;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.collections.K;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.extensions.ContextExtKt;
import ru.ozon.app.android.pikazon.extensions.ContextExtKt$loadAsBitmapInscribedSize$1;
import ru.ozon.app.android.pikazon.extensions.ContextExtKt$loadAsBitmapInscribedSize$2;
import ru.ozon.app.android.pikazon.glide.loadPriority.LoadPriority;
import ru.ozon.app.android.pikazon.image.ImageSize;
import ru.ozon.app.android.pikazon.processors.InscribedUrlProcessor;
import ru.ozon.app.android.universalwidgets.R$id;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.logo.BrandLogoTransformation;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0001\u0018\u0000 \"2\u00020\u00012\u00020\u0002:\u0001\"B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0010H\u0016J(\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0016H\u0014J\u0010\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u001cH\u0014J\u0010\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u000eH\u0002J\u0018\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u00162\u0006\u0010!\u001a\u00020\u0016H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/logo/BrandLogoView;", "Landroid/view/View;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/logo/BrandLogo;", "context", "Landroid/content/Context;", "bitmapCache", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/logo/BrandLogoTransformedBitmapCache;", "<init>", "(Landroid/content/Context;Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/logo/BrandLogoTransformedBitmapCache;)V", "underlayDrawer", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/logo/BrandLogoUnderlayDrawer;", "transformLogo", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/logo/BrandLogoTransformation;", "transformedLogoBitmap", "Landroid/graphics/Bitmap;", "bind", "", "logo", "", "hide", "onSizeChanged", "width", "", "height", "oldw", "oldh", "onDraw", "canvas", "Landroid/graphics/Canvas;", "updateSizeIfNeeded", "getStartPositionToPlaceInCenter", "", "total", "toCenterInTotal", "Companion", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})
/* loaded from: classes2.dex */
public final class BrandLogoView extends View implements BrandLogo {
    private static final int brandLogoViewHeight;
    private static final int logoHeightPx;

    @NotNull
    private static final ImageSize logoImageSize;
    private static final int logoOffset;
    private static final int logoRadius;
    private static final int maxLogoWidthPx;
    private static final int minLogoWidthPx;

    @NotNull
    private final BrandLogoTransformedBitmapCache bitmapCache;

    @NotNull
    private final BrandLogoTransformation transformLogo;
    private Bitmap transformedLogoBitmap;

    @NotNull
    private final BrandLogoUnderlayDrawer underlayDrawer;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final int underlayTotalPaddings = UiExtKt.toPx(2);

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0010R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0010¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/logo/BrandLogoView$Companion;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/logo/BrandLogoTransformedBitmapCache;", "bitmapCache", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/logo/BrandLogoView;", "create", "(Landroid/content/Context;Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/logo/BrandLogoTransformedBitmapCache;)Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/logo/BrandLogoView;", "", "LOCATOR", "Ljava/lang/String;", "", "underlayTotalPaddings", "I", "maxLogoWidthPx", "logoHeightPx", "minLogoWidthPx", "logoRadius", "Lru/ozon/app/android/pikazon/image/ImageSize;", "logoImageSize", "Lru/ozon/app/android/pikazon/image/ImageSize;", "brandLogoViewHeight", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final BrandLogoView create(@NotNull Context context, @NotNull BrandLogoTransformedBitmapCache bitmapCache) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(bitmapCache, "bitmapCache");
            return new BrandLogoView(context, bitmapCache, null);
        }

        private Companion() {
        }
    }

    static {
        int px = UiExtKt.toPx(60);
        maxLogoWidthPx = px;
        int px2 = UiExtKt.toPx(28);
        logoHeightPx = px2;
        minLogoWidthPx = UiExtKt.toPx(28);
        logoRadius = UiExtKt.toPx(5);
        logoImageSize = new ImageSize(px, px2);
        brandLogoViewHeight = UiExtKt.toPx(30);
        logoOffset = UiExtKt.toPx(2);
    }

    public /* synthetic */ BrandLogoView(Context context, BrandLogoTransformedBitmapCache brandLogoTransformedBitmapCache, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, brandLogoTransformedBitmapCache);
    }

    private final float getStartPositionToPlaceInCenter(int total, int toCenterInTotal) {
        return (total - toCenterInTotal) / 2.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateSizeIfNeeded(Bitmap logo) {
        int width = logo.getWidth() + underlayTotalPaddings;
        if (width != getMeasuredWidth()) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.width = width;
            setLayoutParams(layoutParams);
        }
    }

    @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.logo.BrandLogo
    public void bind(String logo) {
        hide();
        if (logo == null || h.K(logo)) {
            return;
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ContextExtKt.loadAsBitmapInscribedSize(context, logo, (r14 & 2) != 0 ? K.f71697a : null, (r14 & 4) != 0 ? null : logoImageSize, (r14 & 8) != 0 ? LoadPriority.NORMAL : null, (r14 & 16) != 0 ? InscribedUrlProcessor.InscribedNormal.INSTANCE : InscribedUrlProcessor.InscribedHeight.INSTANCE, (r14 & 32) != 0 ? ContextExtKt$loadAsBitmapInscribedSize$1.INSTANCE : new BrandLogoView$bind$1(this), (r14 & 64) != 0 ? ContextExtKt$loadAsBitmapInscribedSize$2.INSTANCE : new BrandLogoView$bind$2(this, logo));
    }

    @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.logo.BrandLogo
    public void hide() {
        ViewExtKt.gone(this);
    }

    @Override // android.view.View
    protected void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        this.underlayDrawer.draw(canvas);
        super.onDraw(canvas);
        Bitmap bitmap = this.transformedLogoBitmap;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, getStartPositionToPlaceInCenter(getWidth(), bitmap.getWidth()), getStartPositionToPlaceInCenter(getHeight(), bitmap.getHeight()), (Paint) null);
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int width, int height, int oldw, int oldh) {
        super.onSizeChanged(width, height, oldw, oldh);
        this.underlayDrawer.onSizeChanged(width, height);
    }

    private BrandLogoView(Context context, BrandLogoTransformedBitmapCache brandLogoTransformedBitmapCache) {
        super(context);
        this.bitmapCache = brandLogoTransformedBitmapCache;
        this.underlayDrawer = new BrandLogoUnderlayDrawer(context);
        this.transformLogo = new BrandLogoTransformation(new BrandLogoTransformation.TransformationConfig(minLogoWidthPx, maxLogoWidthPx, logoHeightPx, logoRadius, ThemeExtKt.themeColor(context, R$attr.bgLightKey)));
        setId(R$id.logoIv);
        setContentDescription("brandLogoView");
        ConstraintLayout.b bVar = new ConstraintLayout.b(-2, brandLogoViewHeight);
        bVar.f41656t = 0;
        bVar.f41636i = 0;
        ((ViewGroup.MarginLayoutParams) bVar).topMargin = -logoOffset;
        setLayoutParams(bVar);
    }
}

package ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.logo;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011J\u000e\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0015R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/logo/BrandLogoUnderlayDrawer;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "backgroundRadius", "", "backgroundCorners", "", "backgroundPaint", "Landroid/graphics/Paint;", "backgroundPath", "Landroid/graphics/Path;", "onSizeChanged", "", "width", "", "height", "draw", "canvas", "Landroid/graphics/Canvas;", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BrandLogoUnderlayDrawer {

    @NotNull
    private final float[] backgroundCorners;

    @NotNull
    private final Paint backgroundPaint;

    @NotNull
    private final Path backgroundPath;
    private final float backgroundRadius;

    @NotNull
    private final Context context;

    public BrandLogoUnderlayDrawer(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        float pxF = UiExtKt.toPxF(6.0f);
        this.backgroundRadius = pxF;
        this.backgroundCorners = new float[]{pxF, pxF, pxF, pxF, pxF, pxF, 0.0f, 0.0f};
        Paint paint = new Paint(1);
        paint.setColor(ThemeExtKt.themeColor(context, R$attr.bgLightKey));
        this.backgroundPaint = paint;
        this.backgroundPath = new Path();
    }

    public final void draw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        canvas.drawPath(this.backgroundPath, this.backgroundPaint);
    }

    public final void onSizeChanged(int width, int height) {
        this.backgroundPath.reset();
        this.backgroundPath.addRoundRect(0.0f, 0.0f, width, height, this.backgroundCorners, Path.Direction.CW);
    }
}

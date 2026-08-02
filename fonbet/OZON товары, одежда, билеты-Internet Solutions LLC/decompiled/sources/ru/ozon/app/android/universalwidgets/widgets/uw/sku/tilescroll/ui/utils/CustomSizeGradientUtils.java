package ru.ozon.app.android.universalwidgets.widgets.uw.sku.tilescroll.ui.utils;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.GradientDrawable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tilescroll.data.TileScrollVO;
import ru.ozon.uni.android.uikit.common.gradient.OzGradientOrientationMapperKt;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\u00102\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005J\u0016\u0010\u0014\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\tJ \u0010\u0015\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0005H\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilescroll/ui/utils/CustomSizeGradientUtils;", "Landroid/graphics/drawable/GradientDrawable;", "<init>", "()V", "model", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilescroll/data/TileScrollVO$ItemVO$BannerVO$GradientModelVO;", "direction", "Landroid/graphics/drawable/GradientDrawable$Orientation;", "height", "", "width", "paint", "Landroid/graphics/Paint;", "rect", "Landroid/graphics/Rect;", "draw", "", "canvas", "Landroid/graphics/Canvas;", "updateModel", "updateSize", "updateGradientCoordinates", "gradientModel", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CustomSizeGradientUtils extends GradientDrawable {
    private GradientDrawable.Orientation direction;
    private int height;
    private TileScrollVO.ItemVO.BannerVO.GradientModelVO model;

    @NotNull
    private Paint paint = new Paint(1);

    @NotNull
    private Rect rect = new Rect();
    private int width;

    private final void updateGradientCoordinates(int width, int height, TileScrollVO.ItemVO.BannerVO.GradientModelVO gradientModel) {
        this.height = height;
        this.width = width;
        int i11 = (int) (height / 2.0f);
        if (gradientModel.getDirection() == GradientDrawable.Orientation.TOP_BOTTOM) {
            this.rect.set(0, i11, width, height);
        } else {
            this.rect.set(0, 0, width, i11);
        }
        float[] coordinates = OzGradientOrientationMapperKt.getCoordinates(gradientModel.getDirection(), this.rect);
        this.paint.setShader(new LinearGradient(coordinates[0], coordinates[1], coordinates[2], coordinates[3], gradientModel.getGradient().getColors(), gradientModel.getGradient().getPositions(), Shader.TileMode.CLAMP));
    }

    @Override // android.graphics.drawable.GradientDrawable, android.graphics.drawable.Drawable
    public void draw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.draw(canvas);
        Rect rect = this.rect;
        canvas.drawRect(rect.left, rect.top, rect.right, rect.bottom, this.paint);
    }

    public final void updateModel(TileScrollVO.ItemVO.BannerVO.GradientModelVO model) {
        this.model = model;
    }

    public final void updateSize(int width, int height) {
        TileScrollVO.ItemVO.BannerVO.GradientModelVO gradientModelVO = this.model;
        if (gradientModelVO == null) {
            return;
        }
        if (this.width != width || this.height != height || this.direction != gradientModelVO.getDirection()) {
            updateGradientCoordinates(width, height, gradientModelVO);
        }
        this.direction = gradientModelVO.getDirection();
    }
}

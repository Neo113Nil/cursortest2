package ru.ozon.app.android.universalwidgets.widgets.uw.sku.smalltile.presentation.view;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0014\n\u0002\b\u0005\b\u0000\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rR$\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/smalltile/presentation/view/SmallTileAdultImagePathClipper;", "", "<init>", "()V", "Landroid/graphics/Canvas;", "canvas", "", "clipPath", "(Landroid/graphics/Canvas;)V", "", "width", "height", "updateClipPath", "(FF)V", "cornerRadius", "Ljava/lang/Float;", "getCornerRadius", "()Ljava/lang/Float;", "setCornerRadius", "(Ljava/lang/Float;)V", "Landroid/graphics/Path;", "Landroid/graphics/Path;", "getNotNullRadius", "()F", "notNullRadius", "", "getRoundedTopCorners", "()[F", "roundedTopCorners", "Companion", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SmallTileAdultImagePathClipper {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final Path clipPath = new Path();
    private Float cornerRadius;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/smalltile/presentation/view/SmallTileAdultImagePathClipper$Companion;", "", "<init>", "()V", "ZERO_RADIUS", "", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    private final float getNotNullRadius() {
        Float f7 = this.cornerRadius;
        if (f7 != null) {
            return f7.floatValue();
        }
        return 0.0f;
    }

    private final float[] getRoundedTopCorners() {
        return new float[]{getNotNullRadius(), getNotNullRadius(), getNotNullRadius(), getNotNullRadius(), 0.0f, 0.0f, 0.0f, 0.0f};
    }

    public final void clipPath(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (this.cornerRadius == null) {
            return;
        }
        canvas.clipPath(this.clipPath);
    }

    public final void setCornerRadius(Float f7) {
        this.cornerRadius = f7;
    }

    public final void updateClipPath(float width, float height) {
        if (this.cornerRadius == null || width == 0.0f || height == 0.0f) {
            return;
        }
        this.clipPath.reset();
        this.clipPath.addRoundRect(0.0f, 0.0f, width, height, getRoundedTopCorners(), Path.Direction.CW);
    }
}

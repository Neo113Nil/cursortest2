package ru.ozon.app.android.travel.molecules.view.tripRoute;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.R$style;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J(\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0007H\u0014J\u0010\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0012H\u0014R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/travel/molecules/view/tripRoute/AmountTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "backgroundColor", "", "path", "Landroid/graphics/Path;", "onSizeChanged", "", "width", "height", "oldw", "oldh", "onDraw", "canvas", "Landroid/graphics/Canvas;", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AmountTextView extends AppCompatTextView {
    private final int backgroundColor;

    @NotNull
    private final Path path;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AmountTextView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.backgroundColor = ThemeExtKt.themeColor(context, R$attr.layerFloor0);
        this.path = new Path();
        setGravity(17);
        setTextAppearance(R$style.TextStyle_Caption);
        setTextColor(ThemeExtKt.themeColor(context, R$attr.textSecondary));
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        canvas.save();
        canvas.clipPath(this.path);
        canvas.drawColor(this.backgroundColor);
        canvas.restore();
        super.onDraw(canvas);
    }

    @Override // android.view.View
    protected void onSizeChanged(int width, int height, int oldw, int oldh) {
        float f7 = width / 2.0f;
        float f11 = height / 2.0f;
        float min = Math.min(f7, f11);
        Path path = this.path;
        path.rewind();
        path.addCircle(f7, f11, min, Path.Direction.CCW);
    }
}

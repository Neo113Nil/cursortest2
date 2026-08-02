package ru.ozon.app.android.ugc.widgets.createlistwrapper.presentation;

import Pk0.h;
import android.content.Context;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.R$id;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.LargeButtonView;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ(\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0007H\u0014J\u0010\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u001aH\u0014R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/ugc/widgets/createlistwrapper/presentation/CreateListWrapperView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attr", "Landroid/util/AttributeSet;", "defStileAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "shadowPaint", "Landroid/graphics/Paint;", "shadowBounds", "Landroid/graphics/RectF;", "saveButton", "Lru/ozon/uni/android/uikit/view/atoms/buttons/usual/LargeButtonView;", "getSaveButton", "()Lru/ozon/uni/android/uikit/view/atoms/buttons/usual/LargeButtonView;", "onSizeChanged", "", "width", "height", "oldWidth", "oldHeight", "onDraw", "canvas", "Landroid/graphics/Canvas;", "Companion", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CreateListWrapperView extends LinearLayout {

    @NotNull
    private final LargeButtonView saveButton;

    @NotNull
    private final RectF shadowBounds;

    @NotNull
    private final Paint shadowPaint;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final float SHADOW_HEIGHT_PX = ResourceExtKt.toPxF(12);
    private static final float SHADOW_BLUR_RADIUS_PX = ResourceExtKt.toPxF(16);
    private static final int DP_8 = ResourceExtKt.toPx(8);
    private static final int DP_16 = ResourceExtKt.toPx(16);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/ugc/widgets/createlistwrapper/presentation/CreateListWrapperView$Companion;", "", "<init>", "()V", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ CreateListWrapperView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    @NotNull
    public final LargeButtonView getSaveButton() {
        return this.saveButton;
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (Build.VERSION.SDK_INT < 28) {
            canvas.drawRect(this.shadowBounds, this.shadowPaint);
            super.onDraw(canvas);
        } else {
            super.onDraw(canvas);
            int saveLayer = canvas.saveLayer(this.shadowBounds, null);
            canvas.drawRect(this.shadowBounds, this.shadowPaint);
            canvas.restoreToCount(saveLayer);
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int width, int height, int oldWidth, int oldHeight) {
        super.onSizeChanged(width, height, oldWidth, oldHeight);
        this.shadowBounds.set(0.0f, -SHADOW_HEIGHT_PX, width, 0.0f);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateListWrapperView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        Paint a11 = h.a(true);
        a11.setShader(new LinearGradient(0.0f, -SHADOW_HEIGHT_PX, 0.0f, 0.0f, 0, ThemeExtKt.themeColor(context, R$attr.clearDarkKey400), Shader.TileMode.CLAMP));
        a11.setMaskFilter(new BlurMaskFilter(SHADOW_BLUR_RADIUS_PX, BlurMaskFilter.Blur.NORMAL));
        this.shadowPaint = a11;
        this.shadowBounds = new RectF();
        LargeButtonView largeButtonView = new LargeButtonView(context, null, 0, 0, 14, null);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        int i12 = DP_16;
        int i13 = DP_8;
        layoutParams.setMargins(i12, i13, i12, i13);
        largeButtonView.setLayoutParams(layoutParams);
        largeButtonView.setId(R$id.saveBtn);
        this.saveButton = largeButtonView;
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        setOrientation(1);
        setBackgroundColor(ThemeExtKt.themeColor(context, R$attr.layerFloor1));
        addView(largeButtonView);
    }
}

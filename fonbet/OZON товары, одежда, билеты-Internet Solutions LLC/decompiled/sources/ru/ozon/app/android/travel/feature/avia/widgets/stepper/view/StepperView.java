package ru.ozon.app.android.travel.feature.avia.widgets.stepper.view;

import Pk0.h;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.avia.widgets.stepper.presentation.StepperVO;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ(\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0007H\u0014J\u0010\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u001dH\u0014J\u000e\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\u0011J\u0018\u0010 \u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0007H\u0002R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/stepper/view/StepperView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attributeSet", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "dp4", "dpf2", "", "paint", "Landroid/graphics/Paint;", "cachedVO", "Lru/ozon/app/android/travel/feature/avia/widgets/stepper/presentation/StepperVO;", "stepRects", "", "Landroid/graphics/RectF;", "onSizeChanged", "", "width", "height", "oldw", "oldh", "onDraw", "canvas", "Landroid/graphics/Canvas;", "bind", "vo", "recalculateBounds", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class StepperView extends View {
    private StepperVO cachedVO;
    private final int dp4;
    private final float dpf2;

    @NotNull
    private final Paint paint;

    @NotNull
    private final List<RectF> stepRects;

    public /* synthetic */ StepperView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    private final void recalculateBounds(int width, int height) {
        StepperVO stepperVO = this.cachedVO;
        if (stepperVO == null || width == 0 || height == 0) {
            return;
        }
        while (this.stepRects.size() < stepperVO.getStepColors().size()) {
            this.stepRects.add(new RectF());
        }
        int stepWidth = stepperVO.getStepWidth() + this.dp4;
        float size = (width - (!stepperVO.getStepColors().isEmpty() ? (stepperVO.getStepColors().size() * stepWidth) - this.dp4 : 0.0f)) / 2.0f;
        float f7 = size >= 0.0f ? size : 0.0f;
        float f11 = (height - r9) / 2.0f;
        float f12 = this.dp4 + f11;
        int i11 = 0;
        for (Object obj : stepperVO.getStepColors()) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            ((Number) obj).intValue();
            float f13 = (i11 * stepWidth) + f7;
            this.stepRects.get(i11).set(f13, f11, stepperVO.getStepWidth() + f13, f12);
            i11 = i12;
        }
    }

    public final void bind(@NotNull StepperVO vo) {
        Intrinsics.checkNotNullParameter(vo, "vo");
        this.cachedVO = vo;
        recalculateBounds(getWidth(), getHeight());
        invalidate();
    }

    @Override // android.view.View
    protected void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        StepperVO stepperVO = this.cachedVO;
        if (stepperVO == null) {
            return;
        }
        int size = stepperVO.getStepColors().size();
        for (int i11 = 0; i11 < size; i11++) {
            this.paint.setColor(stepperVO.getStepColors().get(i11).intValue());
            RectF rectF = this.stepRects.get(i11);
            float f7 = this.dpf2;
            canvas.drawRoundRect(rectF, f7, f7, this.paint);
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int width, int height, int oldw, int oldh) {
        super.onSizeChanged(width, height, oldw, oldh);
        recalculateBounds(width, height);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StepperView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        int px = UiExtKt.toPx(4, context);
        this.dp4 = px;
        this.dpf2 = ResourceExtKt.toPxF(2, context);
        Paint a11 = h.a(true);
        a11.setStyle(Paint.Style.FILL);
        this.paint = a11;
        this.stepRects = new ArrayList();
        setMinimumHeight(px);
    }
}

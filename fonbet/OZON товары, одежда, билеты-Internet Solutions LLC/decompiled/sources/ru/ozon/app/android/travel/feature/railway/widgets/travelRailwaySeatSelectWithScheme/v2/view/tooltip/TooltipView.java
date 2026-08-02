package ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.view.tooltip;

import An.b;
import Bi.a;
import Pk0.h;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import gk0.q;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.presentation.scheme.TravelRailwaySeatSelectWithSchemeVO;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001:\u0001/B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J(\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u0007H\u0014J\u0010\u0010!\u001a\u00020\u001c2\u0006\u0010\"\u001a\u00020#H\u0014J\u0012\u0010$\u001a\u00020\u00112\b\u0010%\u001a\u0004\u0018\u00010&H\u0017J\u000e\u0010'\u001a\u00020\u001c2\u0006\u0010(\u001a\u00020)J\u0010\u0010*\u001a\u00020\u001c2\b\u0010+\u001a\u0004\u0018\u00010\u001aJ\b\u0010,\u001a\u00020\u001cH\u0002J\b\u0010-\u001a\u00020\u001cH\u0002J\u0018\u0010.\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u0007H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e¢\u0006\u0002\n\u0000¨\u00060"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/view/tooltip/TooltipView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "beakWidth", "", "beakHeight", "", "beakRadius", "dp12", "dpf16", "backgroundPaint", "Landroid/graphics/Paint;", "beakPaint", "isBeakOnTop", "", "beakPath", "Landroid/graphics/Path;", "backgroundBounds", "Landroid/graphics/RectF;", "titleTav", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "descriptionTav", "onTooltipOutsideTouchListener", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/view/tooltip/TooltipView$OnTooltipOutsideTouchListener;", "onSizeChanged", "", "width", "height", "oldw", "oldh", "onDraw", "canvas", "Landroid/graphics/Canvas;", "onTouchEvent", "event", "Landroid/view/MotionEvent;", "bind", "tooltip", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/scheme/TravelRailwaySeatSelectWithSchemeVO$TooltipVO;", "setOnTooltipOutsideTouchListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "updatePaddingForBeak", "calculateBounds", "calculateBeak", "OnTooltipOutsideTouchListener", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TooltipView extends LinearLayout {

    @NotNull
    private final RectF backgroundBounds;

    @NotNull
    private final Paint backgroundPaint;
    private final float beakHeight;

    @NotNull
    private final Paint beakPaint;

    @NotNull
    private final Path beakPath;
    private final float beakRadius;
    private final int beakWidth;

    @NotNull
    private final TextAtomV2View descriptionTav;
    private final int dp12;
    private final float dpf16;
    private boolean isBeakOnTop;
    private OnTooltipOutsideTouchListener onTooltipOutsideTouchListener;

    @NotNull
    private final TextAtomV2View titleTav;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/view/tooltip/TooltipView$OnTooltipOutsideTouchListener;", "", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface OnTooltipOutsideTouchListener {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TooltipView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.beakWidth = UiExtKt.toPx(16, context);
        this.beakHeight = ResourceExtKt.toPxF(8, context);
        float pxF = ResourceExtKt.toPxF(2, context);
        this.beakRadius = pxF;
        this.dp12 = UiExtKt.toPx(12, context);
        this.dpf16 = ResourceExtKt.toPxF(16, context);
        Paint a11 = h.a(true);
        a11.setColor(ThemeExtKt.themeColor(context, R$attr.layerFloor0Inverted));
        this.backgroundPaint = a11;
        Paint a12 = h.a(true);
        a12.setColor(ThemeExtKt.themeColor(context, R$attr.layerFloor0Inverted));
        a12.setPathEffect(new CornerPathEffect(pxF));
        this.beakPaint = a12;
        this.beakPath = new Path();
        this.backgroundBounds = new RectF();
        q qVar = q.f64554a;
        TextAtomV2View textAtomV2View = (TextAtomV2View) qVar.g(N.b(TextAtomV2View.class), context);
        a.d(-2, -2, textAtomV2View);
        this.titleTav = textAtomV2View;
        TextAtomV2View textAtomV2View2 = (TextAtomV2View) qVar.g(N.b(TextAtomV2View.class), context);
        a.d(-2, -2, textAtomV2View2);
        this.descriptionTav = textAtomV2View2;
        addView(textAtomV2View);
        addView(textAtomV2View2);
        setWillNotDraw(false);
        setOrientation(1);
    }

    private final void calculateBeak(int width, int height) {
        float f7 = width / 2.0f;
        int i11 = this.beakWidth;
        float f11 = f7 - (i11 / 2);
        float f12 = (i11 / 2) + f7;
        this.beakPath.rewind();
        if (this.isBeakOnTop) {
            this.beakPath.moveTo(f11, this.beakHeight);
            this.beakPath.lineTo(f7, 0.0f);
            this.beakPath.lineTo(f12, this.beakHeight);
        } else {
            float f13 = height;
            float f14 = f13 - this.beakHeight;
            this.beakPath.moveTo(f11, f14);
            this.beakPath.lineTo(f7, f13);
            this.beakPath.lineTo(f12, f14);
        }
    }

    private final void calculateBounds() {
        boolean z11 = this.isBeakOnTop;
        this.backgroundBounds.set(0.0f, z11 ? this.beakHeight : 0.0f, getWidth(), getHeight() - (!z11 ? this.beakHeight : 0.0f));
        calculateBeak(getWidth(), getHeight());
    }

    private final void updatePaddingForBeak() {
        boolean z11 = this.isBeakOnTop;
        float f7 = z11 ? this.beakHeight : 0.0f;
        float f11 = z11 ? 0.0f : this.beakHeight;
        int i11 = this.dp12;
        setPadding(i11, ((int) f7) + i11, i11, ((int) f11) + i11);
    }

    public final void bind(@NotNull TravelRailwaySeatSelectWithSchemeVO.TooltipVO tooltip) {
        Intrinsics.checkNotNullParameter(tooltip, "tooltip");
        this.isBeakOnTop = !tooltip.getIsTooltipOnTop();
        TextHolderKt.bind$default(this.titleTav, tooltip.getTooltipTitle(), null, 2, null);
        TextHolderKt.bind$default(this.descriptionTav, tooltip.getTooltipDescription(), null, 2, null);
        updatePaddingForBeak();
        calculateBounds();
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        RectF rectF = this.backgroundBounds;
        float f7 = this.dpf16;
        canvas.drawRoundRect(rectF, f7, f7, this.backgroundPaint);
        canvas.drawPath(this.beakPath, this.beakPaint);
    }

    @Override // android.view.View
    protected void onSizeChanged(int width, int height, int oldw, int oldh) {
        calculateBounds();
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent event) {
        super.onTouchEvent(event);
        if (event == null || event.getAction() != 4) {
            return false;
        }
        OnTooltipOutsideTouchListener onTooltipOutsideTouchListener = this.onTooltipOutsideTouchListener;
        if (onTooltipOutsideTouchListener != null) {
            TooltipWrapper.prepareUi$lambda$6$lambda$5((TooltipWrapper) ((b) onTooltipOutsideTouchListener).f1248a, event);
        }
        return this.onTooltipOutsideTouchListener != null;
    }

    public final void setOnTooltipOutsideTouchListener(OnTooltipOutsideTouchListener listener) {
        this.onTooltipOutsideTouchListener = listener;
    }
}

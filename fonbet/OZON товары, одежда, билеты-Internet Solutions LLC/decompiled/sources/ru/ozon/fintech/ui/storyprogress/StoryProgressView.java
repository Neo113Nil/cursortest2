package ru.ozon.fintech.ui.storyprogress;

import C.D;
import G80.a;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.Keep;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;

@Keep
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 '2\u00020\u0001:\u0001'B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\f\u001a\u0004\u0018\u00010\u000bJ\u000e\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\n\u001a\u00020\u000bJ\u0010\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001dH\u0014J(\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u00072\u0006\u0010!\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\u0007H\u0014J\u0018\u0010#\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u0007H\u0002J&\u0010$\u001a\u00020\u001a2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010&\u001a\u00020\u000fH\u0002R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lru/ozon/fintech/ui/storyprogress/StoryProgressView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "state", "Lru/ozon/fintech/ui/storyprogress/StoryProgressState;", "getState", "pointsEnable", "", "", "pointsDisable", "startY", "startX", "step", "stepDelay", "disableColor", "enableColor", "paint", "Landroid/graphics/Paint;", "bindState", "", "onDraw", "canvas", "Landroid/graphics/Canvas;", "onSizeChanged", "w", "h", "oldw", "oldh", "calculateStep", "addPoint", "points", "delayStart", "Companion", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class StoryProgressView extends FrameLayout {
    private static final float DEFAULT_STEP_DELAY = 8.0f;
    private static final float DEFAULT_STROKE_WIDTH = 2.0f;
    private static final float END_POSITION = 1.0f;
    private static final float START_POSITION = 0.0f;
    private int disableColor;
    private int enableColor;

    @NotNull
    private final Paint paint;

    @NotNull
    private List<Float> pointsDisable;

    @NotNull
    private List<Float> pointsEnable;
    private float startX;
    private float startY;
    private StoryProgressState state;
    private float step;
    private float stepDelay;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StoryProgressView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void addPoint(List<Float> points, float step, float delayStart) {
        float f7 = this.startX + delayStart;
        this.startX = f7;
        points.add(Float.valueOf(f7));
        points.add(Float.valueOf(this.startY));
        float f11 = this.startX + step;
        this.startX = f11;
        points.add(Float.valueOf(f11));
        points.add(Float.valueOf(this.startY));
    }

    private final void calculateStep(int w11, int h11) {
        if (this.state == null || h11 == 0) {
            return;
        }
        this.startY = h11 / 2;
        this.step = (w11 - ((this.stepDelay * (r0.getProgress().size() - 1)) + (D.d(r0.getPaddings().right) + D.d(r0.getPaddings().left)))) / r0.getProgress().size();
    }

    public final void bindState(@NotNull StoryProgressState state) {
        List<Float> progress;
        Intrinsics.checkNotNullParameter(state, "state");
        if (Intrinsics.d(this.state, state)) {
            return;
        }
        StoryProgressState storyProgressState = this.state;
        boolean d11 = Intrinsics.d(storyProgressState != null ? storyProgressState.getPaddings() : null, state.getPaddings());
        StoryProgressState storyProgressState2 = this.state;
        boolean z11 = false;
        if (storyProgressState2 != null && (progress = storyProgressState2.getProgress()) != null && progress.size() == state.getProgress().size()) {
            z11 = true;
        }
        this.state = state;
        if (!d11 || !z11) {
            calculateStep(getWidth(), getHeight());
        }
        invalidate();
    }

    public final StoryProgressState getState() {
        return this.state;
    }

    @Override // android.view.View
    protected void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        StoryProgressState storyProgressState = this.state;
        if (storyProgressState != null) {
            this.startX = D.d(storyProgressState.getPaddings().left);
            this.pointsEnable.clear();
            this.pointsDisable.clear();
            int i11 = 0;
            for (Object obj : storyProgressState.getProgress()) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    C7714v.O0();
                    throw null;
                }
                float floatValue = ((Number) obj).floatValue();
                float f7 = i11 == 0 ? 0.0f : this.stepDelay;
                if (floatValue == 0.0f) {
                    addPoint(this.pointsDisable, this.step, f7);
                } else if (floatValue == 1.0f) {
                    addPoint(this.pointsEnable, this.step, f7);
                } else {
                    float f11 = this.step;
                    float f12 = floatValue * f11;
                    addPoint(this.pointsEnable, f12, f7);
                    addPoint(this.pointsDisable, f11 - f12, 0.0f);
                }
                i11 = i12;
            }
            float[] R02 = C7714v.R0(this.pointsDisable);
            Paint paint = this.paint;
            paint.setColor(this.disableColor);
            Unit unit = Unit.f71690a;
            canvas.drawLines(R02, paint);
            float[] R03 = C7714v.R0(this.pointsEnable);
            Paint paint2 = this.paint;
            paint2.setColor(this.enableColor);
            canvas.drawLines(R03, paint2);
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int w11, int h11, int oldw, int oldh) {
        super.onSizeChanged(w11, h11, oldw, oldh);
        calculateStep(w11, h11);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StoryProgressView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ StoryProgressView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StoryProgressView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.pointsEnable = new ArrayList();
        this.pointsDisable = new ArrayList();
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        this.paint = paint;
        setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        setWillNotDraw(false);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f9768f, i11, 0);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
        this.stepDelay = obtainStyledAttributes.getDimension(2, D.c(8.0f));
        paint.setStrokeWidth(obtainStyledAttributes.getDimension(3, D.c(2.0f)));
        this.disableColor = obtainStyledAttributes.getColor(0, androidx.core.content.a.getColor(context, R.color.stories_progress_disable_color));
        this.enableColor = obtainStyledAttributes.getColor(1, androidx.core.content.a.getColor(context, R.color.white));
        obtainStyledAttributes.recycle();
    }
}

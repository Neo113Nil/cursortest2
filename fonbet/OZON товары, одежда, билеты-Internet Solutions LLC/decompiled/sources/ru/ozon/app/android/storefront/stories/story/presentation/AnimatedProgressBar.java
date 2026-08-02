package ru.ozon.app.android.storefront.stories.story.presentation;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 82\u00020\u0001:\u00018B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ/\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u000e¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u000e¢\u0006\u0004\b\u0017\u0010\u0016J\r\u0010\u0018\u001a\u00020\u000e¢\u0006\u0004\b\u0018\u0010\u0016J\r\u0010\u0019\u001a\u00020\u000e¢\u0006\u0004\b\u0019\u0010\u0016J\r\u0010\u001a\u001a\u00020\u000e¢\u0006\u0004\b\u001a\u0010\u0016R*\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R*\u0010$\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u0014\u0010*\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010,\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010+R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R$\u00101\u001a\u0002002\u0006\u0010#\u001a\u0002008\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b1\u00102\"\u0004\b3\u00104R\u0014\u00106\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107¨\u00069"}, d2 = {"Lru/ozon/app/android/storefront/stories/story/presentation/AnimatedProgressBar;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "w", "h", "oldw", "oldh", "", "onSizeChanged", "(IIII)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "play", "()V", "pause", "stopAndReset", "stopAndFill", "clear", "Lkotlin/Function0;", "onAnimationEnd", "Lkotlin/jvm/functions/Function0;", "getOnAnimationEnd", "()Lkotlin/jvm/functions/Function0;", "setOnAnimationEnd", "(Lkotlin/jvm/functions/Function0;)V", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "duration", "J", "getDuration", "()J", "setDuration", "(J)V", "backgroundColor", "I", "foregroundColor", "Landroid/graphics/Paint;", "paint", "Landroid/graphics/Paint;", "", "progress", "F", "setProgress", "(F)V", "Lru/ozon/app/android/storefront/stories/story/presentation/FloatAnimator;", "animator", "Lru/ozon/app/android/storefront/stories/story/presentation/FloatAnimator;", "Companion", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AnimatedProgressBar extends View {

    @NotNull
    private final FloatAnimator animator;
    private final int backgroundColor;
    private long duration;
    private final int foregroundColor;
    private Function0<Unit> onAnimationEnd;

    @NotNull
    private final Paint paint;
    private float progress;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lru/ozon/app/android/storefront/stories/story/presentation/AnimatedProgressBar$Companion;", "", "<init>", "()V", "MIN_VALUE", "", "MAX_VALUE", "DEFAULT_DURATION", "", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ AnimatedProgressBar(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setProgress(float f7) {
        this.progress = f7;
        invalidate();
    }

    public final void clear() {
        this.animator.setListener(null);
        this.onAnimationEnd = null;
    }

    public final Function0<Unit> getOnAnimationEnd() {
        return this.onAnimationEnd;
    }

    @Override // android.view.View
    protected void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        float height = canvas.getHeight() / 2;
        this.paint.setColor(this.backgroundColor);
        canvas.drawLine(height, height, canvas.getWidth() - height, height, this.paint);
        if (this.progress > 0.0f) {
            this.paint.setColor(this.foregroundColor);
            canvas.drawLine(height, height, ((canvas.getWidth() - canvas.getHeight()) * this.progress) + height, height, this.paint);
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int w11, int h11, int oldw, int oldh) {
        this.paint.setStrokeWidth(h11);
    }

    public final void pause() {
        this.animator.pause();
    }

    public final void play() {
        this.animator.start();
    }

    public final void setDuration(long j11) {
        this.duration = j11;
        this.animator.setDuration(j11);
    }

    public final void setOnAnimationEnd(Function0<Unit> function0) {
        this.onAnimationEnd = function0;
    }

    public final void stopAndFill() {
        this.animator.stop();
        setProgress(1.0f);
    }

    public final void stopAndReset() {
        this.animator.stop();
        setProgress(0.0f);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimatedProgressBar(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.duration = 6000L;
        this.backgroundColor = ThemeExtKt.themeColor(context, R$attr.layerFloor2);
        this.foregroundColor = ThemeExtKt.themeColor(context, R$attr.bgLightKey);
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        this.paint = paint;
        FloatAnimator floatAnimator = new FloatAnimator();
        floatAnimator.setDuration(this.duration);
        floatAnimator.setListener(new AnimatedProgressBar$animator$1$1(this));
        this.animator = floatAnimator;
    }
}

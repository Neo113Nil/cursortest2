package ru.ozon.app.android.ugc.core.widgets.singlereview.mediaCentric.views;

import Xc.a;
import Xc.b;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
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

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u0000 A2\u00020\u0001:\u0002ABB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u000b¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u000b¢\u0006\u0004\b\u0014\u0010\u0013J\r\u0010\u0015\u001a\u00020\u000b¢\u0006\u0004\b\u0015\u0010\u0013J\r\u0010\u0016\u001a\u00020\u000b¢\u0006\u0004\b\u0016\u0010\u0013J\r\u0010\u0017\u001a\u00020\u000b¢\u0006\u0004\b\u0017\u0010\u0013J\r\u0010\u0018\u001a\u00020\u000b¢\u0006\u0004\b\u0018\u0010\u0013R\"\u0010\u001a\u001a\u00020\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR*\u0010!\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R*\u0010)\u001a\u00020'2\u0006\u0010(\u001a\u00020'8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u0014\u0010/\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00101\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00100R\u0014\u00103\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00105\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00104R$\u00107\u001a\u0002062\u0006\u0010(\u001a\u0002068\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b7\u00108\"\u0004\b9\u0010:R\u0016\u0010<\u001a\u00020;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0016\u0010>\u001a\u0002068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u00108R\u0016\u0010?\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u00100R\u0016\u0010@\u001a\u0002068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u00108¨\u0006C"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/singlereview/mediaCentric/views/MediaCentricProgressBarItem;", "Landroid/view/View;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "newW", "newH", "oldW", "oldH", "", "onSizeChanged", "(IIII)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "play", "()V", "pause", "stopAndReset", "stopAndFill", "setAsCurrent", "clear", "Lru/ozon/app/android/ugc/core/widgets/singlereview/mediaCentric/views/MediaCentricProgressBarItem$Type;", "type", "Lru/ozon/app/android/ugc/core/widgets/singlereview/mediaCentric/views/MediaCentricProgressBarItem$Type;", "getType", "()Lru/ozon/app/android/ugc/core/widgets/singlereview/mediaCentric/views/MediaCentricProgressBarItem$Type;", "setType", "(Lru/ozon/app/android/ugc/core/widgets/singlereview/mediaCentric/views/MediaCentricProgressBarItem$Type;)V", "Lkotlin/Function0;", "onAnimationEnd", "Lkotlin/jvm/functions/Function0;", "getOnAnimationEnd", "()Lkotlin/jvm/functions/Function0;", "setOnAnimationEnd", "(Lkotlin/jvm/functions/Function0;)V", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "duration", "J", "getDuration", "()J", "setDuration", "(J)V", "backgroundColor", "I", "foregroundColor", "Landroid/graphics/Paint;", "backgroundPaint", "Landroid/graphics/Paint;", "foregroundPaint", "", "progress", "F", "setProgress", "(F)V", "Lru/ozon/app/android/ugc/core/widgets/singlereview/mediaCentric/views/MediaCentricFloatAnimator;", "animator", "Lru/ozon/app/android/ugc/core/widgets/singlereview/mediaCentric/views/MediaCentricFloatAnimator;", "halfHeight", "widthMinusHeight", "widthMinusHalfHeight", "Companion", "Type", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MediaCentricProgressBarItem extends View {

    @NotNull
    private MediaCentricFloatAnimator animator;
    private final int backgroundColor;

    @NotNull
    private final Paint backgroundPaint;
    private long duration;
    private final int foregroundColor;

    @NotNull
    private final Paint foregroundPaint;
    private float halfHeight;
    private Function0<Unit> onAnimationEnd;
    private float progress;

    @NotNull
    private Type type;
    private float widthMinusHalfHeight;
    private int widthMinusHeight;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/singlereview/mediaCentric/views/MediaCentricProgressBarItem$Companion;", "", "<init>", "()V", "MIN_VALUE", "", "MAX_VALUE", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/singlereview/mediaCentric/views/MediaCentricProgressBarItem$Type;", "", "<init>", "(Ljava/lang/String;I)V", "ANIMATED", "STATIC", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Type {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type ANIMATED = new Type("ANIMATED", 0);
        public static final Type STATIC = new Type("STATIC", 1);

        private static final /* synthetic */ Type[] $values() {
            return new Type[]{ANIMATED, STATIC};
        }

        static {
            Type[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private Type(String str, int i11) {
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaCentricProgressBarItem(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.type = Type.STATIC;
        this.duration = 15000L;
        int themeColor = ThemeExtKt.themeColor(context, R$attr.clearLightKey700);
        this.backgroundColor = themeColor;
        int themeColor2 = ThemeExtKt.themeColor(context, R$attr.bgLightKey);
        this.foregroundColor = themeColor2;
        Paint paint = new Paint(1);
        Paint.Style style = Paint.Style.FILL_AND_STROKE;
        paint.setStyle(style);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        paint.setColor(themeColor);
        this.backgroundPaint = paint;
        Paint paint2 = new Paint(1);
        paint2.setStyle(style);
        paint2.setStrokeCap(cap);
        paint2.setColor(themeColor2);
        this.foregroundPaint = paint2;
        MediaCentricFloatAnimator mediaCentricFloatAnimator = new MediaCentricFloatAnimator();
        mediaCentricFloatAnimator.setDuration(this.duration);
        mediaCentricFloatAnimator.setListener(new MediaCentricProgressBarItem$animator$1$1(this));
        this.animator = mediaCentricFloatAnimator;
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

    public final long getDuration() {
        return this.duration;
    }

    public final Function0<Unit> getOnAnimationEnd() {
        return this.onAnimationEnd;
    }

    @Override // android.view.View
    protected void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        float f7 = this.halfHeight;
        canvas.drawLine(f7, f7, this.widthMinusHalfHeight, f7, this.backgroundPaint);
        float f11 = this.progress;
        if (f11 > 0.0f) {
            float f12 = this.halfHeight;
            canvas.drawLine(f12, f12, (this.widthMinusHeight * f11) + f12, f12, this.foregroundPaint);
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int newW, int newH, int oldW, int oldH) {
        this.backgroundPaint.setStrokeWidth(getHeight());
        this.foregroundPaint.setStrokeWidth(getHeight());
        float f7 = newH / 2;
        this.halfHeight = f7;
        int i11 = newW - newH;
        this.widthMinusHeight = i11;
        this.widthMinusHalfHeight = i11 + f7;
    }

    public final void pause() {
        if (this.type == Type.ANIMATED) {
            this.animator.pause();
        }
    }

    public final void play() {
        if (this.type == Type.ANIMATED) {
            this.animator.start();
        }
    }

    public final void setAsCurrent() {
        if (this.type != Type.ANIMATED) {
            stopAndFill();
        }
    }

    public final void setDuration(long j11) {
        if (j11 >= 15000 || j11 == this.duration) {
            j11 = 15000;
        }
        this.duration = j11;
        this.animator.setDuration(j11);
    }

    public final void setOnAnimationEnd(Function0<Unit> function0) {
        this.onAnimationEnd = function0;
    }

    public final void setType(@NotNull Type type) {
        Intrinsics.checkNotNullParameter(type, "<set-?>");
        this.type = type;
    }

    public final void stopAndFill() {
        if (this.type == Type.ANIMATED) {
            this.animator.stop();
        }
        setProgress(1.0f);
    }

    public final void stopAndReset() {
        if (this.type == Type.ANIMATED) {
            this.animator.stop();
        }
        setProgress(0.0f);
    }
}

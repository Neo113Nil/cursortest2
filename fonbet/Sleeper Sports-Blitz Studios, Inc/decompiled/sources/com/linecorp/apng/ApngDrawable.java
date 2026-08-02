package com.linecorp.apng;

import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.view.animation.AnimationUtils;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import com.facebook.common.util.UriUtil;
import com.linecorp.apng.decoder.Apng;
import com.linecorp.apng.decoder.ApngException;
import io.sentry.rrweb.RRWebVideoEvent;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ApngDrawable.kt */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u0000 g2\u00020\u00012\u00020\u0002:\u0002fgB\u0011\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020=H\u0016J\u0010\u0010>\u001a\u00020;2\u0006\u0010?\u001a\u00020\bH\u0016J\b\u0010@\u001a\u00020\bH\u0016J\u0012\u0010A\u001a\u00020;2\b\u0010B\u001a\u0004\u0018\u00010CH\u0016J\b\u0010D\u001a\u00020\bH\u0016J\b\u0010E\u001a\u00020\bH\u0016J\b\u0010F\u001a\u00020\u001dH\u0016J\b\u0010G\u001a\u00020;H\u0016J\b\u0010H\u001a\u00020;H\u0016J\u0010\u0010I\u001a\u00020;2\u0006\u0010J\u001a\u00020-H\u0016J\u0010\u0010K\u001a\u00020\u001d2\u0006\u0010J\u001a\u00020-H\u0016J\u000e\u0010L\u001a\u00020;2\u0006\u0010M\u001a\u00020/J\u000e\u0010N\u001a\u00020\u001d2\u0006\u0010M\u001a\u00020/J\b\u0010O\u001a\u00020;H\u0016J\n\u0010P\u001a\u0004\u0018\u00010QH\u0016J\b\u0010R\u001a\u00020\u0001H\u0016J\u000e\u00109\u001a\u00020;2\u0006\u0010S\u001a\u00020TJ\u0010\u0010U\u001a\u00020;2\b\b\u0001\u0010V\u001a\u00020\u0014J\u001a\u0010W\u001a\u00020;2\b\b\u0001\u0010X\u001a\u00020\b2\b\b\u0001\u0010Y\u001a\u00020\bJ\u0006\u0010Z\u001a\u00020;J\b\u0010[\u001a\u00020;H\u0002J\b\u0010\\\u001a\u00020\u001dH\u0002J\b\u0010]\u001a\u00020\u001dH\u0002J\b\u0010^\u001a\u00020\u001dH\u0002J\b\u0010_\u001a\u00020\u001dH\u0002J\b\u0010`\u001a\u00020\u001dH\u0002J\b\u0010a\u001a\u00020;H\u0002J!\u0010b\u001a\u00020\b2\u0006\u0010c\u001a\u00020\b2\u0006\u0010d\u001a\u00020\b2\u0006\u0010e\u001a\u00020\u0014H\u0082\u0010R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u000b\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0011\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\nR\u0016\u0010\u0013\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R&\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\b8\u0006@FX\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\n\"\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001c\u001a\u00020\u001d¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001eR\u001a\u0010\u001f\u001a\u00020\b8FX\u0087\u0004¢\u0006\f\u0012\u0004\b \u0010!\u001a\u0004\b\"\u0010\nR\u0011\u0010#\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b$\u0010\nR\u0011\u0010%\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b&\u0010\nR\u0014\u0010'\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b(\u0010\nR\u000e\u0010)\u001a\u00020*X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010+\u001a\b\u0012\u0004\u0012\u00020-0,X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010.\u001a\b\u0012\u0004\u0012\u00020/0,X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u000201X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u00020\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00105\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u00106\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0004\n\u0002\u00107R\u001e\u00108\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\b@BX\u0082\u000e¢\u0006\b\n\u0000\"\u0004\b9\u0010\u001b¨\u0006h"}, d2 = {"Lcom/linecorp/apng/ApngDrawable;", "Landroid/graphics/drawable/Drawable;", "Landroidx/vectordrawable/graphics/drawable/Animatable2Compat;", "apngState", "Lcom/linecorp/apng/ApngDrawable$ApngState;", "<init>", "(Lcom/linecorp/apng/ApngDrawable$ApngState;)V", "durationMillis", "", "getDurationMillis", "()I", RRWebVideoEvent.JsonKeys.FRAME_COUNT, "getFrameCount", "frameDurations", "", "getFrameDurations", "()Ljava/util/List;", "frameByteCount", "getFrameByteCount", "allocationByteCount", "", "getAllocationByteCount", "()J", "value", "loopCount", "getLoopCount", "setLoopCount", "(I)V", "isRecycled", "", "()Z", "currentRepeatCount", "getCurrentRepeatCount$annotations", "()V", "getCurrentRepeatCount", "currentLoopIndex", "getCurrentLoopIndex", "currentFrameIndex", "getCurrentFrameIndex", "currentLoopIndexInternal", "getCurrentLoopIndexInternal", "paint", "Landroid/graphics/Paint;", "animationCallbacks", "", "Landroidx/vectordrawable/graphics/drawable/Animatable2Compat$AnimationCallback;", "repeatAnimationCallbacks", "Lcom/linecorp/apng/RepeatAnimationCallback;", "frameStartTimes", "", "scaledWidth", "scaledHeight", "isStarted", "animationElapsedTimeMillis", "animationPrevDrawTimeMillis", "Ljava/lang/Long;", "targetDensity", "setTargetDensity", "draw", "", "canvas", "Landroid/graphics/Canvas;", "setAlpha", "alpha", "getOpacity", "setColorFilter", "colorFilter", "Landroid/graphics/ColorFilter;", "getIntrinsicWidth", "getIntrinsicHeight", "isRunning", "start", "stop", "registerAnimationCallback", "callback", "unregisterAnimationCallback", "registerRepeatAnimationCallback", "repeatCallback", "unregisterRepeatAnimationCallback", "clearAnimationCallbacks", "getConstantState", "Landroid/graphics/drawable/Drawable$ConstantState;", "mutate", "metrics", "Landroid/util/DisplayMetrics;", "seekTo", "positionMillis", "seekToFrame", "loopIndex", "frameIndex", "recycle", "progressAnimationElapsedTime", "isFirstFrame", "isLastFrame", "isFirstLoop", "hasNextLoop", "exceedsRepeatCountLimitation", "computeBitmapSize", "calculateCurrentFrameIndex", "lowerBoundIndex", "upperBoundIndex", "progressMillisInCurrentLoop", "ApngState", "Companion", "apng-drawable_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ApngDrawable extends Drawable implements Animatable2Compat {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int LOOP_FOREVER = 0;
    public static final int LOOP_INTRINSIC = -1;
    private final long allocationByteCount;
    private final List<Animatable2Compat.AnimationCallback> animationCallbacks;
    private long animationElapsedTimeMillis;
    private Long animationPrevDrawTimeMillis;
    private ApngState apngState;
    private final int durationMillis;
    private final int frameByteCount;
    private final int frameCount;
    private final List<Integer> frameDurations;
    private final int[] frameStartTimes;
    private final boolean isRecycled;
    private boolean isStarted;
    private int loopCount;
    private final Paint paint;
    private final List<RepeatAnimationCallback> repeatAnimationCallbacks;
    private int scaledHeight;
    private int scaledWidth;
    private int targetDensity;

    @Deprecated(message = "Use currentLoopIndex", replaceWith = @ReplaceWith(expression = "currentLoopIndex + 1", imports = {}))
    public static /* synthetic */ void getCurrentRepeatCount$annotations() {
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -2;
    }

    public ApngDrawable(ApngState apngState) {
        Intrinsics.checkNotNullParameter(apngState, "apngState");
        this.apngState = apngState;
        this.durationMillis = apngState.getApng().getDuration();
        int frameCount = this.apngState.getApng().getFrameCount();
        this.frameCount = frameCount;
        this.frameDurations = ArraysKt.toList(this.apngState.getApng().getFrameDurations());
        int byteCount = this.apngState.getApng().getByteCount();
        this.frameByteCount = byteCount;
        this.allocationByteCount = this.apngState.getApng().getAllFrameByteCount() + byteCount;
        this.loopCount = this.apngState.getApng().getLoopCount();
        this.isRecycled = this.apngState.getApng().isRecycled();
        this.paint = new Paint(6);
        this.animationCallbacks = new ArrayList();
        this.repeatAnimationCallbacks = new ArrayList();
        this.frameStartTimes = new int[frameCount];
        this.scaledWidth = this.apngState.getWidth();
        this.scaledHeight = this.apngState.getHeight();
        this.targetDensity = 160;
        for (int i = 1; i < frameCount; i++) {
            int[] iArr = this.frameStartTimes;
            int i2 = i - 1;
            iArr[i] = iArr[i2] + this.apngState.getApng().getFrameDurations()[i2];
        }
        getBounds().set(0, 0, this.apngState.getWidth(), this.apngState.getHeight());
    }

    public final int getDurationMillis() {
        return this.durationMillis;
    }

    public final int getFrameCount() {
        return this.frameCount;
    }

    public final List<Integer> getFrameDurations() {
        return this.frameDurations;
    }

    public final int getFrameByteCount() {
        return this.frameByteCount;
    }

    public final long getAllocationByteCount() {
        return this.allocationByteCount;
    }

    public final int getLoopCount() {
        return this.loopCount;
    }

    public final void setLoopCount(int i) {
        if (i >= -1) {
            if (i == -1) {
                i = this.apngState.getApng().getLoopCount();
            }
            this.loopCount = i;
        } else {
            throw new IllegalArgumentException(("`loopCount` must be a signed value or special values. (value = " + i + ")").toString());
        }
    }

    /* renamed from: isRecycled, reason: from getter */
    public final boolean getIsRecycled() {
        return this.isRecycled;
    }

    public final int getCurrentRepeatCount() {
        return getCurrentLoopIndex() + 1;
    }

    public final int getCurrentLoopIndex() {
        return Math.min(getCurrentLoopIndexInternal(), this.loopCount - 1);
    }

    public final int getCurrentFrameIndex() {
        int i = this.durationMillis;
        return calculateCurrentFrameIndex(0, this.frameCount - 1, (i == 0 ? 0L : this.animationElapsedTimeMillis % i) + (exceedsRepeatCountLimitation() ? this.durationMillis : 0));
    }

    private final int getCurrentLoopIndexInternal() {
        int i = this.durationMillis;
        if (i == 0) {
            return 0;
        }
        return (int) (this.animationElapsedTimeMillis / i);
    }

    private final void setTargetDensity(int i) {
        if (this.targetDensity != i) {
            if (i == 0) {
                i = 160;
            }
            this.targetDensity = i;
            computeBitmapSize();
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (this.isStarted) {
            progressAnimationElapsedTime();
        }
        Apng apng = this.apngState.getApng();
        int currentFrameIndex = getCurrentFrameIndex();
        Rect bounds = getBounds();
        Intrinsics.checkNotNullExpressionValue(bounds, "getBounds(...)");
        apng.drawWithIndex(currentFrameIndex, canvas, null, bounds, this.paint);
        if (this.isStarted) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int alpha) {
        this.paint.setAlpha(alpha);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.paint.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.scaledWidth;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.scaledHeight;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.isStarted;
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.isStarted = true;
        this.animationPrevDrawTimeMillis = null;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.isStarted = false;
        invalidateSelf();
    }

    @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public void registerAnimationCallback(Animatable2Compat.AnimationCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.animationCallbacks.add(callback);
    }

    @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public boolean unregisterAnimationCallback(Animatable2Compat.AnimationCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        return this.animationCallbacks.remove(callback);
    }

    public final void registerRepeatAnimationCallback(RepeatAnimationCallback repeatCallback) {
        Intrinsics.checkNotNullParameter(repeatCallback, "repeatCallback");
        this.repeatAnimationCallbacks.add(repeatCallback);
    }

    public final boolean unregisterRepeatAnimationCallback(RepeatAnimationCallback repeatCallback) {
        Intrinsics.checkNotNullParameter(repeatCallback, "repeatCallback");
        return this.repeatAnimationCallbacks.remove(repeatCallback);
    }

    @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public void clearAnimationCallbacks() {
        this.animationCallbacks.clear();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.apngState;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.apngState = new ApngState(this.apngState);
        return this;
    }

    public final void setTargetDensity(DisplayMetrics metrics) {
        Intrinsics.checkNotNullParameter(metrics, "metrics");
        setTargetDensity(metrics.densityDpi);
    }

    public final void seekTo(long positionMillis) {
        if (positionMillis < 0) {
            throw new IllegalArgumentException("positionMillis must be positive value".toString());
        }
        this.animationPrevDrawTimeMillis = null;
        this.animationElapsedTimeMillis = positionMillis;
        invalidateSelf();
    }

    public final void seekToFrame(int loopIndex, int frameIndex) {
        if (loopIndex < 0) {
            throw new IllegalArgumentException("loopIndex must be positive value".toString());
        }
        if (frameIndex < 0) {
            throw new IllegalArgumentException("frameIndex must be positive value".toString());
        }
        int i = this.loopCount;
        if (loopIndex >= i) {
            throw new IllegalArgumentException(("loopIndex must be less than loopCount. loopIndex = " + loopIndex + ", loopCount = " + i + ".").toString());
        }
        int i2 = this.frameCount;
        if (frameIndex >= i2) {
            throw new IllegalArgumentException(("frameIndex must be less than frameCount. frameIndex = " + frameIndex + ", frameCount = " + i2 + ".").toString());
        }
        seekTo((loopIndex * this.durationMillis) + this.frameStartTimes[frameIndex]);
    }

    public final void recycle() {
        this.apngState.getApng().recycle();
    }

    private final void progressAnimationElapsedTime() {
        long longValue;
        int currentFrameIndex = getCurrentFrameIndex();
        long longValue2 = this.apngState.getCurrentTimeProvider().invoke().longValue();
        Long l = this.animationPrevDrawTimeMillis;
        if (l == null) {
            longValue = this.animationElapsedTimeMillis;
        } else {
            longValue = (this.animationElapsedTimeMillis + longValue2) - l.longValue();
        }
        this.animationElapsedTimeMillis = longValue;
        this.animationPrevDrawTimeMillis = Long.valueOf(longValue2);
        boolean z = getCurrentFrameIndex() != currentFrameIndex;
        if (this.isStarted) {
            if (!isFirstFrame() || !isFirstLoop() || l != null) {
                if (isLastFrame() && hasNextLoop() && z) {
                    for (RepeatAnimationCallback repeatAnimationCallback : CollectionsKt.toList(this.repeatAnimationCallbacks)) {
                        repeatAnimationCallback.onRepeat(this, getCurrentLoopIndexInternal() + 2);
                        repeatAnimationCallback.onAnimationRepeat(this, getCurrentLoopIndexInternal() + 1);
                    }
                }
            } else {
                Iterator it = CollectionsKt.toList(this.animationCallbacks).iterator();
                while (it.hasNext()) {
                    ((Animatable2Compat.AnimationCallback) it.next()).onAnimationStart(this);
                }
            }
        }
        if (exceedsRepeatCountLimitation()) {
            this.isStarted = false;
            Iterator it2 = CollectionsKt.toList(this.animationCallbacks).iterator();
            while (it2.hasNext()) {
                ((Animatable2Compat.AnimationCallback) it2.next()).onAnimationEnd(this);
            }
        }
    }

    private final boolean isFirstFrame() {
        return getCurrentFrameIndex() == 0;
    }

    private final boolean isLastFrame() {
        return getCurrentFrameIndex() == this.frameCount - 1;
    }

    private final boolean isFirstLoop() {
        return getCurrentLoopIndexInternal() == 0;
    }

    private final boolean hasNextLoop() {
        return this.loopCount == 0 || getCurrentLoopIndexInternal() < this.loopCount - 1;
    }

    private final boolean exceedsRepeatCountLimitation() {
        return this.loopCount != 0 && getCurrentLoopIndexInternal() > this.loopCount - 1;
    }

    private final void computeBitmapSize() {
        Companion companion = INSTANCE;
        this.scaledWidth = companion.scaleFromDensity(this.apngState.getWidth(), this.apngState.getSourceDensity(), this.targetDensity);
        this.scaledHeight = companion.scaleFromDensity(this.apngState.getHeight(), this.apngState.getSourceDensity(), this.targetDensity);
        getBounds().set(0, 0, this.scaledWidth, this.scaledHeight);
    }

    private final int calculateCurrentFrameIndex(int lowerBoundIndex, int upperBoundIndex, long progressMillisInCurrentLoop) {
        int i;
        while (true) {
            i = (lowerBoundIndex + upperBoundIndex) / 2;
            int i2 = i + 1;
            if (this.frameStartTimes.length > i2 && progressMillisInCurrentLoop >= r1[i2]) {
                lowerBoundIndex = i2;
            } else {
                if (lowerBoundIndex == upperBoundIndex || progressMillisInCurrentLoop >= r1[i]) {
                    break;
                }
                upperBoundIndex = i;
            }
        }
        return i;
    }

    /* compiled from: ApngDrawable.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u000b\u0010\fB\u0011\b\u0016\u0012\u0006\u0010\r\u001a\u00020\u0000¢\u0006\u0004\b\u000b\u0010\u000eJ\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0005H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, d2 = {"Lcom/linecorp/apng/ApngDrawable$ApngState;", "Landroid/graphics/drawable/Drawable$ConstantState;", "apng", "Lcom/linecorp/apng/decoder/Apng;", "width", "", "height", "sourceDensity", "currentTimeProvider", "Lkotlin/Function0;", "", "<init>", "(Lcom/linecorp/apng/decoder/Apng;IIILkotlin/jvm/functions/Function0;)V", "apngState", "(Lcom/linecorp/apng/ApngDrawable$ApngState;)V", "getApng", "()Lcom/linecorp/apng/decoder/Apng;", "getWidth", "()I", "getHeight", "getSourceDensity", "getCurrentTimeProvider", "()Lkotlin/jvm/functions/Function0;", "newDrawable", "Landroid/graphics/drawable/Drawable;", "getChangingConfigurations", "apng-drawable_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ApngState extends Drawable.ConstantState {
        private final Apng apng;
        private final Function0<Long> currentTimeProvider;
        private final int height;
        private final int sourceDensity;
        private final int width;

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        public final Apng getApng() {
            return this.apng;
        }

        public final int getWidth() {
            return this.width;
        }

        public final int getHeight() {
            return this.height;
        }

        public final int getSourceDensity() {
            return this.sourceDensity;
        }

        public /* synthetic */ ApngState(Apng apng, int i, int i2, int i3, Function0 function0, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this(apng, i, i2, (i4 & 8) != 0 ? 0 : i3, (i4 & 16) != 0 ? new Function0() { // from class: com.linecorp.apng.ApngDrawable$ApngState$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    long currentAnimationTimeMillis;
                    currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                    return Long.valueOf(currentAnimationTimeMillis);
                }
            } : function0);
        }

        public final Function0<Long> getCurrentTimeProvider() {
            return this.currentTimeProvider;
        }

        public ApngState(Apng apng, int i, int i2, int i3, Function0<Long> currentTimeProvider) {
            Intrinsics.checkNotNullParameter(apng, "apng");
            Intrinsics.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
            this.apng = apng;
            this.width = i;
            this.height = i2;
            this.sourceDensity = i3;
            this.currentTimeProvider = currentTimeProvider;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public ApngState(ApngState apngState) {
            this(apngState.apng.copy(), apngState.width, apngState.height, apngState.sourceDensity, apngState.currentTimeProvider);
            Intrinsics.checkNotNullParameter(apngState, "apngState");
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new ApngDrawable(new ApngState(this));
        }
    }

    /* compiled from: ApngDrawable.kt */
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0005H\u0002J7\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0001\u0010\u000f\u001a\u00020\u00052\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0002\u0010\u0012J5\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0002\u0010\u0017J-\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u00162\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0002\u0010\u0019J-\u0010\u000b\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u001b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0002\u0010\u001cJ-\u0010\u000b\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u001e2\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0002\u0010\u001fJ\u001a\u0010 \u001a\u00020!2\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0001\u0010\u000f\u001a\u00020\u0005H\u0007J\u0018\u0010 \u001a\u00020!2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0007J\u0010\u0010 \u001a\u00020!2\u0006\u0010\u0018\u001a\u00020\u0016H\u0007J\u0010\u0010 \u001a\u00020!2\u0006\u0010\u001a\u001a\u00020\u001bH\u0007J\u0010\u0010 \u001a\u00020!2\u0006\u0010\u001d\u001a\u00020\u001eH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/linecorp/apng/ApngDrawable$Companion;", "", "<init>", "()V", "LOOP_FOREVER", "", "LOOP_INTRINSIC", "scaleFromDensity", RRWebVideoEvent.JsonKeys.SIZE, "sourceDensity", "targetDensity", "decode", "Lcom/linecorp/apng/ApngDrawable;", UriUtil.LOCAL_RESOURCE_SCHEME, "Landroid/content/res/Resources;", "id", "width", "height", "(Landroid/content/res/Resources;ILjava/lang/Integer;Ljava/lang/Integer;)Lcom/linecorp/apng/ApngDrawable;", "assetManager", "Landroid/content/res/AssetManager;", "assetName", "", "(Landroid/content/res/AssetManager;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/linecorp/apng/ApngDrawable;", "filePath", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/linecorp/apng/ApngDrawable;", "file", "Ljava/io/File;", "(Ljava/io/File;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/linecorp/apng/ApngDrawable;", "stream", "Ljava/io/InputStream;", "(Ljava/io/InputStream;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/linecorp/apng/ApngDrawable;", "isApng", "", "apng-drawable_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int scaleFromDensity(int size, int sourceDensity, int targetDensity) {
            return (sourceDensity == 0 || targetDensity == 0 || sourceDensity == targetDensity) ? size : ((size * targetDensity) + (sourceDensity >> 1)) / sourceDensity;
        }

        public static /* synthetic */ ApngDrawable decode$default(Companion companion, Resources resources, int i, Integer num, Integer num2, int i2, Object obj) throws ApngException, Resources.NotFoundException, IOException {
            if ((i2 & 4) != 0) {
                num = null;
            }
            if ((i2 & 8) != 0) {
                num2 = null;
            }
            return companion.decode(resources, i, num, num2);
        }

        public final ApngDrawable decode(Resources res, int id, Integer width, Integer height) throws ApngException, Resources.NotFoundException, IOException {
            Intrinsics.checkNotNullParameter(res, "res");
            InputStream openRawResource = res.openRawResource(id);
            Intrinsics.checkNotNullExpressionValue(openRawResource, "openRawResource(...)");
            BufferedInputStream bufferedInputStream = openRawResource instanceof BufferedInputStream ? (BufferedInputStream) openRawResource : new BufferedInputStream(openRawResource, 8192);
            try {
                ApngDrawable decode = ApngDrawable.INSTANCE.decode(bufferedInputStream, width, height);
                CloseableKt.closeFinally(bufferedInputStream, null);
                return decode;
            } finally {
            }
        }

        public static /* synthetic */ ApngDrawable decode$default(Companion companion, AssetManager assetManager, String str, Integer num, Integer num2, int i, Object obj) throws ApngException, IOException {
            if ((i & 4) != 0) {
                num = null;
            }
            if ((i & 8) != 0) {
                num2 = null;
            }
            return companion.decode(assetManager, str, num, num2);
        }

        public final ApngDrawable decode(AssetManager assetManager, String assetName, Integer width, Integer height) throws ApngException, IOException {
            Intrinsics.checkNotNullParameter(assetManager, "assetManager");
            Intrinsics.checkNotNullParameter(assetName, "assetName");
            InputStream open = assetManager.open(assetName);
            Intrinsics.checkNotNullExpressionValue(open, "open(...)");
            BufferedInputStream bufferedInputStream = open instanceof BufferedInputStream ? (BufferedInputStream) open : new BufferedInputStream(open, 8192);
            try {
                ApngDrawable decode = ApngDrawable.INSTANCE.decode(bufferedInputStream, width, height);
                CloseableKt.closeFinally(bufferedInputStream, null);
                return decode;
            } finally {
            }
        }

        public static /* synthetic */ ApngDrawable decode$default(Companion companion, String str, Integer num, Integer num2, int i, Object obj) throws ApngException, FileNotFoundException, IOException {
            if ((i & 2) != 0) {
                num = null;
            }
            if ((i & 4) != 0) {
                num2 = null;
            }
            return companion.decode(str, num, num2);
        }

        public final ApngDrawable decode(String filePath, Integer width, Integer height) throws ApngException, FileNotFoundException, IOException {
            Intrinsics.checkNotNullParameter(filePath, "filePath");
            return decode(new File(filePath), width, height);
        }

        public static /* synthetic */ ApngDrawable decode$default(Companion companion, File file, Integer num, Integer num2, int i, Object obj) throws ApngException, FileNotFoundException, IOException {
            if ((i & 2) != 0) {
                num = null;
            }
            if ((i & 4) != 0) {
                num2 = null;
            }
            return companion.decode(file, num, num2);
        }

        public final ApngDrawable decode(File file, Integer width, Integer height) throws ApngException, FileNotFoundException, IOException {
            Intrinsics.checkNotNullParameter(file, "file");
            InputStream fileInputStream = new FileInputStream(file);
            BufferedInputStream bufferedInputStream = fileInputStream instanceof BufferedInputStream ? (BufferedInputStream) fileInputStream : new BufferedInputStream(fileInputStream, 8192);
            try {
                ApngDrawable decode = ApngDrawable.INSTANCE.decode(bufferedInputStream, width, height);
                CloseableKt.closeFinally(bufferedInputStream, null);
                return decode;
            } finally {
            }
        }

        public static /* synthetic */ ApngDrawable decode$default(Companion companion, InputStream inputStream, Integer num, Integer num2, int i, Object obj) throws ApngException {
            if ((i & 2) != 0) {
                num = null;
            }
            if ((i & 4) != 0) {
                num2 = null;
            }
            return companion.decode(inputStream, num, num2);
        }

        public final ApngDrawable decode(InputStream stream, Integer width, Integer height) throws ApngException {
            Intrinsics.checkNotNullParameter(stream, "stream");
            int i = 0;
            if ((height == null) ^ (width == null)) {
                throw new IllegalArgumentException(("Can not specify only one side of size. width = " + width + ", height = " + height).toString());
            }
            if (width != null && width.intValue() <= 0) {
                throw new IllegalArgumentException(("Can not specify 0 or negative as width value. width = " + width).toString());
            }
            if (height != null && height.intValue() <= 0) {
                throw new IllegalArgumentException(("Can not specify 0 or negative as height value. height = " + height).toString());
            }
            if (width == null && height == null) {
                i = 160;
            }
            int i2 = i;
            Apng decode = Apng.INSTANCE.decode(stream);
            return new ApngDrawable(new ApngState(decode, width != null ? width.intValue() : decode.getWidth(), height != null ? height.intValue() : decode.getHeight(), i2, null, 16, null));
        }

        public final boolean isApng(Resources res, int id) {
            Intrinsics.checkNotNullParameter(res, "res");
            try {
                InputStream openRawResource = res.openRawResource(id);
                Intrinsics.checkNotNullExpressionValue(openRawResource, "openRawResource(...)");
                BufferedInputStream bufferedInputStream = openRawResource instanceof BufferedInputStream ? (BufferedInputStream) openRawResource : new BufferedInputStream(openRawResource, 8192);
                try {
                    boolean isApng = ApngDrawable.INSTANCE.isApng(bufferedInputStream);
                    CloseableKt.closeFinally(bufferedInputStream, null);
                    return isApng;
                } finally {
                }
            } catch (Exception unused) {
                return false;
            }
        }

        public final boolean isApng(AssetManager assetManager, String assetName) {
            Intrinsics.checkNotNullParameter(assetManager, "assetManager");
            Intrinsics.checkNotNullParameter(assetName, "assetName");
            try {
                InputStream open = assetManager.open(assetName);
                Intrinsics.checkNotNullExpressionValue(open, "open(...)");
                BufferedInputStream bufferedInputStream = open instanceof BufferedInputStream ? (BufferedInputStream) open : new BufferedInputStream(open, 8192);
                try {
                    boolean isApng = ApngDrawable.INSTANCE.isApng(bufferedInputStream);
                    CloseableKt.closeFinally(bufferedInputStream, null);
                    return isApng;
                } finally {
                }
            } catch (Exception unused) {
                return false;
            }
        }

        public final boolean isApng(String filePath) {
            Intrinsics.checkNotNullParameter(filePath, "filePath");
            try {
                return isApng(new File(filePath));
            } catch (Exception unused) {
                return false;
            }
        }

        public final boolean isApng(File file) {
            Intrinsics.checkNotNullParameter(file, "file");
            try {
                InputStream fileInputStream = new FileInputStream(file);
                BufferedInputStream bufferedInputStream = fileInputStream instanceof BufferedInputStream ? (BufferedInputStream) fileInputStream : new BufferedInputStream(fileInputStream, 8192);
                try {
                    boolean isApng = ApngDrawable.INSTANCE.isApng(bufferedInputStream);
                    CloseableKt.closeFinally(bufferedInputStream, null);
                    return isApng;
                } finally {
                }
            } catch (Exception unused) {
                return false;
            }
        }

        public final boolean isApng(InputStream stream) {
            Intrinsics.checkNotNullParameter(stream, "stream");
            try {
                return Apng.INSTANCE.isApng(stream);
            } catch (ApngException unused) {
                return false;
            }
        }
    }
}

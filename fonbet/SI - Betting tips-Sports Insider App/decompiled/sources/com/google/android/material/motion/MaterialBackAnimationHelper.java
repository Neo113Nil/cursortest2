package com.google.android.material.motion;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.view.View;
import android.view.animation.PathInterpolator;
import androidx.annotation.NonNull;
import com.google.android.material.R;
import io.sentry.android.core.w0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class MaterialBackAnimationHelper<V extends View> {
    private static final int CANCEL_DURATION_DEFAULT = 100;
    private static final int HIDE_DURATION_MAX_DEFAULT = 300;
    private static final int HIDE_DURATION_MIN_DEFAULT = 150;
    private static final String TAG = "MaterialBackHelper";
    private e.a backEvent;
    protected final int cancelDuration;
    protected final int hideDurationMax;
    protected final int hideDurationMin;

    @NonNull
    private final TimeInterpolator progressInterpolator = new PathInterpolator(0.1f, 0.1f, 0.0f, 1.0f);

    @NonNull
    protected final V view;

    public MaterialBackAnimationHelper(@NonNull V v5) {
        this.view = v5;
        Context context = v5.getContext();
        this.hideDurationMax = MotionUtils.resolveThemeDuration(context, R.attr.motionDurationMedium2, 300);
        this.hideDurationMin = MotionUtils.resolveThemeDuration(context, R.attr.motionDurationShort3, HIDE_DURATION_MIN_DEFAULT);
        this.cancelDuration = MotionUtils.resolveThemeDuration(context, R.attr.motionDurationShort2, 100);
    }

    public float interpolateProgress(float f6) {
        return this.progressInterpolator.getInterpolation(f6);
    }

    public e.a onCancelBackProgress() {
        if (this.backEvent == null) {
            w0.m(TAG, "Must call startBackProgress() and updateBackProgress() before cancelBackProgress()");
        }
        e.a aVar = this.backEvent;
        this.backEvent = null;
        return aVar;
    }

    public e.a onHandleBackInvoked() {
        e.a aVar = this.backEvent;
        this.backEvent = null;
        return aVar;
    }

    public void onStartBackProgress(@NonNull e.a aVar) {
        this.backEvent = aVar;
    }

    public e.a onUpdateBackProgress(@NonNull e.a aVar) {
        if (this.backEvent == null) {
            w0.m(TAG, "Must call startBackProgress() before updateBackProgress()");
        }
        e.a aVar2 = this.backEvent;
        this.backEvent = aVar;
        return aVar2;
    }
}

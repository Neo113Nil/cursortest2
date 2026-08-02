package com.vk.stories.design.view.text;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.subjects.f;
import xsna.asp;
import xsna.hlq;
import xsna.icm0;
import xsna.j8z;
import xsna.zrp;

/* compiled from: StorySeekBar.kt */
/* loaded from: classes6.dex */
public final class StorySeekBar extends View {
    public static final /* synthetic */ int p = 0;
    public final f<Float> b;
    public float c;
    public float d;
    public ValueAnimator e;
    public State f;
    public float g;
    public float h;
    public final Bitmap i;
    public final Rect j;
    public final RectF k;
    public final Bitmap l;
    public final Rect m;
    public final RectF n;
    public final Paint o;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: StorySeekBar.kt */
    public static final class State {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ State[] $VALUES;
        public static final State HIDDEN;
        public static final State SHOWN;

        static {
            State state = new State("HIDDEN", 0);
            HIDDEN = state;
            State state2 = new State("SHOWN", 1);
            SHOWN = state2;
            State[] stateArr = {state, state2};
            $VALUES = stateArr;
            $ENTRIES = new asp(stateArr);
        }

        public State() {
            throw null;
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }
    }

    /* compiled from: StorySeekBar.kt */
    public interface a {
    }

    public StorySeekBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = new f<>();
        this.c = 0.5f;
        this.f = State.HIDDEN;
        Bitmap decodeResource = BitmapFactory.decodeResource(getResources(), R.drawable.ic_progress_circle_32);
        this.i = decodeResource;
        this.j = new Rect(0, 0, decodeResource.getWidth(), decodeResource.getHeight());
        this.k = new RectF();
        Bitmap decodeResource2 = BitmapFactory.decodeResource(getResources(), R.drawable.ic_stories_progress_32);
        this.l = decodeResource2;
        this.m = new Rect(0, 0, decodeResource2.getWidth(), decodeResource2.getHeight());
        this.n = new RectF();
        this.o = new Paint(1);
    }

    private final int getProgressLineHeight() {
        if (getMeasuredHeight() == 0) {
            return 0;
        }
        return ((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - this.i.getHeight();
    }

    public final void a() {
        int measuredHeight = getMeasuredHeight();
        RectF rectF = this.k;
        if (measuredHeight <= 0) {
            rectF.top = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            rectF.bottom = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            return;
        }
        float measuredHeight2 = ((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - (this.c * getProgressLineHeight());
        Bitmap bitmap = this.i;
        float height = measuredHeight2 - (bitmap.getHeight() / 2.0f);
        rectF.top = height;
        rectF.bottom = height + bitmap.getHeight();
    }

    public final a getOnProgressChangedListener() {
        return null;
    }

    public final float getProgress() {
        return this.c;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int save = canvas.save();
        canvas.translate(-this.h, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        Bitmap bitmap = this.l;
        Rect rect = this.m;
        RectF rectF = this.n;
        Paint paint = this.o;
        canvas.drawBitmap(bitmap, rect, rectF, paint);
        canvas.drawBitmap(this.i, this.j, this.k, paint);
        canvas.restoreToCount(save);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        Bitmap bitmap = this.l;
        setMeasuredDimension(getPaddingEnd() + getPaddingStart() + Math.max(bitmap.getWidth(), this.i.getWidth()), getPaddingBottom() + getPaddingTop() + bitmap.getHeight());
        this.k.set(getPaddingLeft(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, r1.getWidth() + getPaddingLeft(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        a();
        this.n.set(getPaddingLeft(), getPaddingTop(), bitmap.getWidth() + getPaddingLeft(), bitmap.getHeight() + getPaddingTop());
        float width = (bitmap.getWidth() / 2.0f) + getPaddingStart();
        this.g = width;
        this.h = width;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (motionEvent.getAction() != 0 && motionEvent.getAction() != 2 && motionEvent.getAction() != 1) {
            return onTouchEvent;
        }
        RectF rectF = this.k;
        float f = rectF.top;
        Bitmap bitmap = this.i;
        float width = (bitmap.getWidth() / 2.0f) + f;
        float y = motionEvent.getY();
        if (motionEvent.getAction() != 0 && this.d != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            y = (motionEvent.getY() - this.d) + width;
        }
        if (y < (bitmap.getHeight() / 2.0f) + getPaddingTop()) {
            y = getPaddingTop() + (bitmap.getHeight() / 2.0f);
        } else if (y > (getMeasuredHeight() - getPaddingBottom()) - (bitmap.getHeight() / 2.0f)) {
            y = (getMeasuredHeight() - getPaddingBottom()) - (bitmap.getHeight() / 2.0f);
        }
        if (y != width) {
            float height = y - (bitmap.getHeight() / 2.0f);
            rectF.top = height;
            rectF.bottom = height + bitmap.getHeight();
            float measuredHeight = (((getMeasuredHeight() - getPaddingBottom()) - (bitmap.getHeight() / 2.0f)) - y) / getProgressLineHeight();
            if (Math.abs(this.c - measuredHeight) > 0.01f) {
                this.c = measuredHeight;
                this.b.onNext(Float.valueOf(measuredHeight));
            }
            invalidate();
        }
        this.d = motionEvent.getY();
        if (motionEvent.getAction() == 0 && this.f == State.HIDDEN) {
            setState(State.SHOWN);
            return true;
        }
        if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && this.f == State.SHOWN) {
            setState(State.HIDDEN);
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x000b, code lost:
    
        if (r3 > 1.0f) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setProgress(float f) {
        float f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (f >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            f2 = 1.0f;
        }
        f = f2;
        this.c = f;
        a();
        this.b.onNext(Float.valueOf(this.c));
        invalidate();
    }

    public final void setState(State state) {
        ValueAnimator ofFloat;
        TimeInterpolator hlqVar;
        long j;
        if (this.f == state) {
            return;
        }
        this.f = state;
        ValueAnimator valueAnimator = this.e;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (this.f == State.SHOWN) {
            ofFloat = ValueAnimator.ofFloat(this.h, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            hlqVar = new j8z();
            j = (long) ((300 * this.h) / this.g);
        } else {
            ofFloat = ValueAnimator.ofFloat(this.h, this.g);
            hlqVar = new hlq();
            float f = this.g;
            j = (long) (((f - this.h) * 300) / f);
        }
        ofFloat.addUpdateListener(new icm0(this, 0));
        ofFloat.setInterpolator(hlqVar);
        ofFloat.setDuration(j);
        ofFloat.start();
        this.e = ofFloat;
    }

    public final void setOnProgressChangedListener(a aVar) {
    }
}

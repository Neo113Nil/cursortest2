package com.vk.im.ui.components.msg_send.recording;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.im.ui.R$styleable;
import kotlin.LazyThreadSafetyMode;
import xsna.msy;
import xsna.s1;

/* compiled from: AudioRecordOverlay.kt */
/* loaded from: classes2.dex */
public final class AudioRecordOverlay extends ConstraintLayout {
    public static final /* synthetic */ int w = 0;
    public final int t;
    public final Object u;
    public final GestureDetector v;

    /* compiled from: AudioRecordOverlay.kt */
    public final class a extends GestureDetector.SimpleOnGestureListener {
        public a() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            View targetView = AudioRecordOverlay.this.getTargetView();
            if (!(targetView instanceof RecyclerView)) {
                return true;
            }
            ((RecyclerView) targetView).fling(0, -((int) f2));
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            View targetView = AudioRecordOverlay.this.getTargetView();
            if (targetView == null) {
                return true;
            }
            targetView.scrollBy(0, (int) f2);
            return true;
        }
    }

    public AudioRecordOverlay(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.b);
            this.t = obtainStyledAttributes.getResourceId(0, -1);
            obtainStyledAttributes.recycle();
        } else {
            this.t = -1;
        }
        this.u = msy.a(LazyThreadSafetyMode.NONE, new s1(this, 7));
        this.v = new GestureDetector(context, new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final View getTargetView() {
        return (View) this.u.getValue();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.v.onTouchEvent(motionEvent);
    }
}

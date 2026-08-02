package com.vk.clips.tool.view.nps.internal;

import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.LazyThreadSafetyMode;
import xsna.bv0;
import xsna.mnh0;
import xsna.msy;
import xsna.pu5;

/* compiled from: EdgesAwareNestedVerticalRecyclerView.kt */
/* loaded from: classes17.dex */
public final class EdgesAwareNestedVerticalRecyclerView extends RecyclerView {
    public static final /* synthetic */ int e = 0;
    public float b;
    public final Object c;
    public final pu5 d;

    public EdgesAwareNestedVerticalRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.c = msy.a(LazyThreadSafetyMode.NONE, new bv0(19));
        this.d = new pu5(this, 6);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final Handler getMainThreadHandler() {
        return (Handler) this.c.getValue();
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return super.onTouchEvent(null);
        }
        if (mnh0.m(motionEvent)) {
            getParent().requestDisallowInterceptTouchEvent(true);
        } else if (mnh0.r(motionEvent)) {
            getParent().requestDisallowInterceptTouchEvent(false);
        }
        this.b = motionEvent.getY();
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return super.onTouchEvent(null);
        }
        int y = (int) (this.b - motionEvent.getY());
        if (y == 0 && mnh0.o(motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        if (mnh0.m(motionEvent)) {
            getParent().requestDisallowInterceptTouchEvent(true);
        } else if (mnh0.r(motionEvent)) {
            getParent().requestDisallowInterceptTouchEvent(false);
        } else if (mnh0.o(motionEvent) && !canScrollVertically(y)) {
            Handler mainThreadHandler = getMainThreadHandler();
            pu5 pu5Var = this.d;
            mainThreadHandler.removeCallbacks(pu5Var);
            getMainThreadHandler().post(pu5Var);
        }
        this.b = motionEvent.getY();
        return super.onTouchEvent(motionEvent);
    }
}

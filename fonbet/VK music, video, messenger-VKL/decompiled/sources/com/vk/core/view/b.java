package com.vk.core.view;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.text.Layout;
import android.text.TextUtils;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.unity3d.services.UnityAdsConstants;
import xsna.q01;
import xsna.qku0;

/* compiled from: VkClickableLinksDelegate.java */
@Deprecated
/* loaded from: classes17.dex */
public final class b implements GestureDetector.OnGestureListener {
    public Paint b;
    public Path c;
    public qku0 d;
    public VkLinkedTextView e;

    @Nullable
    public GestureDetector f;
    public boolean g;
    public q01 h;
    public float i;

    /* compiled from: VkClickableLinksDelegate.java */
    public interface a {
        Context getContext();

        Layout getLayout();

        int getLineBounds(int i, Rect rect);

        int getPaddingLeft();

        int getPaddingTop();

        CharSequence getText();

        View getView();

        void invalidate();

        void playSoundEffect(int i);
    }

    public static Activity a(View view) {
        Object parent = view.getParent();
        if (!(parent instanceof ViewGroup)) {
            return null;
        }
        Context context = ((ViewGroup) parent).getContext();
        return context instanceof Activity ? (Activity) context : a((View) parent);
    }

    public final void b(Canvas canvas) {
        qku0 qku0Var;
        if (this.c == null || (qku0Var = this.d) == null || !qku0Var.d) {
            return;
        }
        canvas.save();
        canvas.translate(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.e.getPaddingTop());
        canvas.drawPath(this.c, this.b);
        canvas.restore();
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        VkLinkedTextView vkLinkedTextView = this.e;
        qku0 qku0Var = this.d;
        String str = qku0Var == null ? null : qku0Var.b;
        if (!this.g || TextUtils.isEmpty(str)) {
            return;
        }
        this.d.b(vkLinkedTextView.getContext());
        this.c = null;
        this.d = null;
        vkLinkedTextView.invalidate();
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }
}

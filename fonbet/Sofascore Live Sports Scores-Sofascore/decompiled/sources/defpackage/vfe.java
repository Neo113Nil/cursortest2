package defpackage;

import android.app.Dialog;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class vfe extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ zfe a;

    public vfe(zfe zfeVar) {
        this.a = zfeVar;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        zfe zfeVar = this.a;
        if (zfeVar.r != null && zfeVar.d() <= 1.0f && motionEvent.getPointerCount() <= 1 && motionEvent2.getPointerCount() <= 1) {
            ((Dialog) ((l1) zfeVar.r).b).dismiss();
        }
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        zfe zfeVar = this.a;
        View.OnLongClickListener onLongClickListener = zfeVar.q;
        if (onLongClickListener != null) {
            onLongClickListener.onLongClick(zfeVar.h);
        }
    }
}

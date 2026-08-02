package defpackage;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.github.chrisbanes.photoview.PhotoView;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class wfe implements GestureDetector.OnDoubleTapListener {
    public final /* synthetic */ zfe a;

    public wfe(zfe zfeVar) {
        this.a = zfeVar;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        float d;
        float x;
        float y;
        float f;
        zfe zfeVar = this.a;
        try {
            d = zfeVar.d();
            x = motionEvent.getX();
            y = motionEvent.getY();
            f = zfeVar.d;
        } catch (ArrayIndexOutOfBoundsException unused) {
        }
        if (d < f) {
            zfeVar.e(f, x, y, true);
            return true;
        }
        if (d >= f) {
            float f2 = zfeVar.e;
            if (d < f2) {
                zfeVar.e(f2, x, y, true);
                return true;
            }
        }
        zfeVar.e(zfeVar.c, x, y, true);
        return true;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        zfe zfeVar = this.a;
        PhotoView photoView = zfeVar.h;
        View.OnClickListener onClickListener = zfeVar.p;
        if (onClickListener != null) {
            onClickListener.onClick(photoView);
        }
        zfeVar.b();
        Matrix c = zfeVar.c();
        RectF rectF = zfeVar.n;
        if (photoView.getDrawable() != null) {
            rectF.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, r0.getIntrinsicWidth(), r0.getIntrinsicHeight());
            c.mapRect(rectF);
        } else {
            rectF = null;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (rectF == null || !rectF.contains(x, y)) {
            return false;
        }
        rectF.width();
        rectF.height();
        return true;
    }
}

package com.vk.feed.tool.view.posting.zoomimage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.View;
import com.vk.imageloader.view.VKImageView;
import xsna.b780;
import xsna.fot;
import xsna.gzs;
import xsna.h64;
import xsna.i64;
import xsna.q6y0;
import xsna.s3q0;
import xsna.sjl;

/* compiled from: ZoomImageView.kt */
/* loaded from: classes18.dex */
public final class ZoomImageView extends VKImageView {
    public q6y0 m;
    public gzs<s3q0> n;

    public ZoomImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        T0();
        setOnLoadCallback(new a());
    }

    public final void T0() {
        q6y0 q6y0Var = this.m;
        if (q6y0Var == null || q6y0Var.g() == null) {
            q6y0 q6y0Var2 = new q6y0(this);
            this.m = q6y0Var2;
            gzs<s3q0> gzsVar = this.n;
            if (gzsVar != null) {
                q6y0Var2.v = gzsVar;
            }
        }
        setFocusable(true);
    }

    public RectF getDisplayRect() {
        q6y0 q6y0Var = this.m;
        if (q6y0Var != null) {
            return q6y0Var.e();
        }
        return null;
    }

    public i64 getImageListener() {
        q6y0 q6y0Var = this.m;
        if (q6y0Var != null) {
            return q6y0Var.t;
        }
        return null;
    }

    public float getMaximumScale() {
        q6y0 q6y0Var = this.m;
        if (q6y0Var != null) {
            return q6y0Var.g;
        }
        return 1.0f;
    }

    public float getMediumScale() {
        q6y0 q6y0Var = this.m;
        if (q6y0Var != null) {
            return q6y0Var.f;
        }
        return 1.0f;
    }

    public float getMinimumScale() {
        q6y0 q6y0Var = this.m;
        if (q6y0Var != null) {
            return q6y0Var.e;
        }
        return 1.0f;
    }

    public float getScale() {
        q6y0 q6y0Var = this.m;
        if (q6y0Var != null) {
            return q6y0Var.h();
        }
        return 1.0f;
    }

    public final Matrix getTransformMatrix() {
        q6y0 q6y0Var = this.m;
        if (q6y0Var != null) {
            return q6y0Var.o;
        }
        return null;
    }

    @Override // xsna.zjt, android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        T0();
        super.onAttachedToWindow();
    }

    @Override // xsna.zjt, android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        q6y0 q6y0Var = this.m;
        if (q6y0Var != null) {
            q6y0Var.b();
        }
        super.onDetachedFromWindow();
    }

    @Override // com.vk.imageloader.view.VKImageView, xsna.zjt, android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        int save = canvas.save();
        q6y0 q6y0Var = this.m;
        canvas.concat(q6y0Var != null ? q6y0Var.o : null);
        super.onDraw(canvas);
        canvas.restoreToCount(save);
    }

    public void setAllowParentInterceptOnEdge(boolean z) {
        q6y0 q6y0Var = this.m;
        if (q6y0Var != null) {
            q6y0Var.l = z;
        }
    }

    public void setImageListener(i64 i64Var) {
        q6y0 q6y0Var = this.m;
        if (q6y0Var != null) {
            q6y0Var.t = i64Var;
        }
    }

    public void setMaximumScale(float f) {
        q6y0 q6y0Var = this.m;
        if (q6y0Var != null) {
            h64.d(q6y0Var.e, q6y0Var.f, f);
            q6y0Var.g = f;
        }
    }

    public void setMediumScale(float f) {
        q6y0 q6y0Var = this.m;
        if (q6y0Var != null) {
            h64.d(q6y0Var.e, f, q6y0Var.g);
            q6y0Var.f = f;
        }
    }

    public void setMinimumScale(float f) {
        q6y0 q6y0Var = this.m;
        if (q6y0Var != null) {
            h64.d(f, q6y0Var.f, q6y0Var.g);
            q6y0Var.e = f;
        }
    }

    public void setOnDoubleTapListener(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        q6y0 q6y0Var = this.m;
        if (q6y0Var != null) {
            fot fotVar = q6y0Var.j;
            if (onDoubleTapListener != null) {
                fotVar.a.setOnDoubleTapListener(onDoubleTapListener);
            } else {
                fotVar.a.setOnDoubleTapListener(new sjl(q6y0Var));
            }
        }
    }

    @Override // android.view.View
    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        q6y0 q6y0Var = this.m;
        if (q6y0Var != null) {
            q6y0Var.u = onLongClickListener;
        }
    }

    public void setScale(float f) {
        q6y0 q6y0Var = this.m;
        if (q6y0Var != null) {
            q6y0Var.i(f);
        }
    }

    public final void setUpdateListener(gzs<s3q0> gzsVar) {
        this.n = gzsVar;
        q6y0 q6y0Var = this.m;
        if (q6y0Var != null) {
            q6y0Var.v = gzsVar;
        }
    }

    public void setZoomTransitionDuration(long j) {
        q6y0 q6y0Var = this.m;
        if (q6y0Var != null) {
            if (j < 0) {
                j = 200;
            }
            q6y0Var.h = j;
        }
    }

    public void setZoomable(boolean z) {
        q6y0 q6y0Var = this.m;
        if (q6y0Var != null) {
            q6y0Var.n = z;
        }
    }

    /* compiled from: ZoomImageView.kt */
    public final class a implements b780 {
        public a() {
        }

        @Override // xsna.b780
        public final void t(int i, int i2, String str) {
            q6y0 q6y0Var = ZoomImageView.this.m;
            if (q6y0Var != null) {
                q6y0Var.q = i;
                q6y0Var.p = i2;
                if (i == -1 && i2 == -1) {
                    return;
                }
                q6y0Var.o.reset();
                q6y0Var.c();
                VKImageView g = q6y0Var.g();
                if (g != null) {
                    g.invalidate();
                }
            }
        }

        @Override // xsna.b780
        public final void g(String str) {
        }

        @Override // xsna.b780
        public final void onCancel(String str) {
        }

        @Override // xsna.b780
        public final void b(String str, Throwable th) {
        }
    }
}

package com.vk.core.view;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import android.view.Window;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.FitSystemWindowsFrameLayout;
import com.vkontakte.android.R;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import xsna.b0u0;
import xsna.bqx0;
import xsna.dhr0;
import xsna.iut0;
import xsna.too0;
import xsna.wqx0;

/* loaded from: classes.dex */
public class FitSystemWindowsFragmentWrapperFrameLayout extends FitSystemWindowsFrameLayout implements too0 {
    public static final int[] m = {R.attr.statusBarColorBack, R.attr.statusBarColorFront};
    public boolean i;
    public boolean j;
    public int k;
    public final Paint l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FitSystemWindowsFragmentWrapperFrameLayout(Context context, int i) {
        super(context, null, 0);
        Window window = null;
        this.i = true;
        this.k = -1;
        this.l = new Paint();
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        if (getFitsSystemWindows()) {
            dhr0.a.getClass();
            this.k = c(dhr0.E());
            TypedArray obtainStyledAttributes = dhr0.E().obtainStyledAttributes(m);
            try {
                int color = obtainStyledAttributes.getColor(1, -1);
                obtainStyledAttributes.recycle();
                if (context instanceof Activity) {
                    window = ((Activity) context).getWindow();
                } else if (context instanceof ContextWrapper) {
                    Context baseContext = ((ContextWrapper) context).getBaseContext();
                    if (baseContext instanceof Activity) {
                        window = ((Activity) baseContext).getWindow();
                    }
                }
                if (window == null || color == -1) {
                    return;
                }
                window.setStatusBarColor(color);
            } catch (Throwable th) {
                obtainStyledAttributes.recycle();
                throw th;
            }
        }
    }

    public static int c(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(m);
        try {
            return obtainStyledAttributes.getColor(0, -1);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    @Override // xsna.too0
    public final void Ng() {
        dhr0.a.getClass();
        this.k = c(dhr0.E());
    }

    @Override // com.vk.core.view.FitSystemWindowsFrameLayout
    public final boolean b(Rect rect, Rect rect2) {
        boolean z = false;
        if (!super.b(rect, rect2)) {
            return false;
        }
        boolean z2 = rect2.top > 0;
        this.j = z2;
        if ((!this.i || !z2) && getBackground() == null) {
            z = true;
        }
        setWillNotDraw(z);
        return true;
    }

    public int getInsetTop() {
        WeakReference<FitSystemWindowsFrameLayout> weakReference = FitSystemWindowsFrameLayout.a.a;
        WeakReference<FitSystemWindowsFrameLayout> weakReference2 = FitSystemWindowsFrameLayout.a.a;
        bqx0 lastInsets = getLastInsets();
        if (lastInsets != null) {
            return wqx0.a(lastInsets);
        }
        return 0;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int insetTop;
        super.onDraw(canvas);
        if (!this.i || !this.j || this.k == -1 || (insetTop = getInsetTop()) <= 0) {
            return;
        }
        int i = this.k;
        Paint paint = this.l;
        paint.setColor(i);
        canvas.drawRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, getWidth(), insetTop, paint);
    }

    public void setStatusBarBackgroundColor(int i) {
        this.k = i;
    }

    public void setStatusBarDrawingEnabled(boolean z) {
        this.i = z;
        setWillNotDraw(!(z && this.j) && getBackground() == null);
    }
}

package com.vk.superapp.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.superapp.ui.VkRoundedTopDelegate;
import java.util.Set;
import xsna.icn0;
import xsna.qjo0;

/* compiled from: VkRoundedTopFrameLayout.kt */
/* loaded from: classes6.dex */
public final class VkRoundedTopFrameLayout extends FrameLayout {
    public static final /* synthetic */ int c = 0;
    public final VkRoundedTopDelegate b;

    public VkRoundedTopFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = new VkRoundedTopDelegate(new icn0(this, 20), new qjo0(this, 14));
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        Path path;
        super.draw(canvas);
        VkRoundedTopDelegate vkRoundedTopDelegate = this.b;
        Paint paint = vkRoundedTopDelegate.h;
        if (vkRoundedTopDelegate.c.contains(VkRoundedTopDelegate.CornerSide.TOP) && vkRoundedTopDelegate.f != null) {
            canvas.drawPath((Path) vkRoundedTopDelegate.g.getValue(), paint);
            canvas.drawPath(vkRoundedTopDelegate.f, paint);
        }
        if (!vkRoundedTopDelegate.c.contains(VkRoundedTopDelegate.CornerSide.BOTTOM) || (path = vkRoundedTopDelegate.d) == null || vkRoundedTopDelegate.e == null) {
            return;
        }
        canvas.drawPath(path, paint);
        canvas.drawPath(vkRoundedTopDelegate.e, paint);
    }

    public final Set<VkRoundedTopDelegate.CornerSide> getSides() {
        return this.b.c;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        VkRoundedTopDelegate vkRoundedTopDelegate = this.b;
        qjo0 qjo0Var = vkRoundedTopDelegate.b;
        icn0 icn0Var = vkRoundedTopDelegate.a;
        float f = VkRoundedTopDelegate.i;
        if (i == 0 || i2 == 0) {
            return;
        }
        if (i != i3) {
            Path path = new Path();
            path.moveTo(((Number) icn0Var.invoke()).intValue(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            path.lineTo(((Number) icn0Var.invoke()).floatValue() - f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            path.addArc(new RectF(((Number) icn0Var.invoke()).floatValue() - f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, ((Number) icn0Var.invoke()).intValue(), f), 270.0f, 90.0f);
            path.lineTo(((Number) icn0Var.invoke()).intValue(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            vkRoundedTopDelegate.f = path;
        }
        if (i2 != i4) {
            Path path2 = new Path();
            path2.moveTo(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, ((Number) qjo0Var.invoke()).intValue());
            path2.lineTo(f, ((Number) qjo0Var.invoke()).intValue());
            path2.addArc(new RectF(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, ((Number) qjo0Var.invoke()).floatValue() - f, f, ((Number) qjo0Var.invoke()).intValue()), 90.0f, 90.0f);
            path2.lineTo(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, ((Number) qjo0Var.invoke()).intValue());
            vkRoundedTopDelegate.d = path2;
        }
        if (i == i3 || i2 == i4) {
            return;
        }
        Path path3 = new Path();
        path3.moveTo(((Number) icn0Var.invoke()).intValue(), ((Number) qjo0Var.invoke()).intValue());
        path3.lineTo(((Number) icn0Var.invoke()).intValue(), ((Number) qjo0Var.invoke()).floatValue() - f);
        path3.addArc(new RectF(((Number) icn0Var.invoke()).floatValue() - f, ((Number) qjo0Var.invoke()).floatValue() - f, ((Number) icn0Var.invoke()).intValue(), ((Number) qjo0Var.invoke()).intValue()), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 90.0f);
        path3.lineTo(((Number) icn0Var.invoke()).intValue(), ((Number) qjo0Var.invoke()).intValue());
        vkRoundedTopDelegate.e = path3;
    }

    public final void setSides(Set<? extends VkRoundedTopDelegate.CornerSide> set) {
        this.b.c = set;
    }
}

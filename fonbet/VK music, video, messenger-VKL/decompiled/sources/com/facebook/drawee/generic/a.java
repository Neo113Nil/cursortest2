package com.facebook.drawee.generic;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import com.facebook.drawee.drawable.RoundedCornersDrawable;
import com.facebook.drawee.generic.RoundingParams;
import xsna.a5h0;
import xsna.ahq;
import xsna.ako;
import xsna.f5h0;
import xsna.fpg0;
import xsna.j9s;
import xsna.jog0;
import xsna.lhs;
import xsna.log0;
import xsna.qog0;

/* compiled from: WrappingUtils.java */
/* loaded from: classes.dex */
public final class a {
    public static final ColorDrawable a = new ColorDrawable(0);

    public static Drawable a(Drawable drawable, RoundingParams roundingParams, Resources resources) {
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            Paint paint = bitmapDrawable.getPaint();
            roundingParams.getClass();
            log0 log0Var = new log0(resources, bitmap, paint);
            b(log0Var, roundingParams);
            return log0Var;
        }
        if (drawable instanceof NinePatchDrawable) {
            fpg0 fpg0Var = new fpg0((NinePatchDrawable) drawable);
            b(fpg0Var, roundingParams);
            return fpg0Var;
        }
        if (!(drawable instanceof ColorDrawable)) {
            ahq.l("WrappingUtils", "Don't know how to round that drawable: %s", drawable);
            return drawable;
        }
        qog0 qog0Var = new qog0(((ColorDrawable) drawable).getColor());
        b(qog0Var, roundingParams);
        return qog0Var;
    }

    public static void b(jog0 jog0Var, RoundingParams roundingParams) {
        jog0Var.f(roundingParams.b);
        jog0Var.i(roundingParams.c);
        jog0Var.a(roundingParams.e, roundingParams.f);
        jog0Var.g(roundingParams.g);
        jog0Var.n(roundingParams.h);
        jog0Var.e(roundingParams.i);
        jog0Var.k();
    }

    public static Drawable c(Drawable drawable, RoundingParams roundingParams, Resources resources) {
        try {
            if (lhs.d()) {
                lhs.a("WrappingUtils#maybeApplyLeafRounding");
            }
            if (drawable != null && roundingParams != null && roundingParams.a == RoundingParams.RoundingMethod.BITMAP_ONLY) {
                if (!(drawable instanceof j9s)) {
                    Drawable a2 = a(drawable, roundingParams, resources);
                    if (lhs.d()) {
                        lhs.b();
                    }
                    return a2;
                }
                ako akoVar = (j9s) drawable;
                while (true) {
                    Object l = akoVar.l();
                    if (l == akoVar || !(l instanceof ako)) {
                        break;
                    }
                    akoVar = (ako) l;
                }
                akoVar.d(a(akoVar.d(a), roundingParams, resources));
                return drawable;
            }
            if (lhs.d()) {
                lhs.b();
            }
            return drawable;
        } finally {
            if (lhs.d()) {
                lhs.b();
            }
        }
    }

    public static Drawable d(Drawable drawable, RoundingParams roundingParams) {
        try {
            if (lhs.d()) {
                lhs.a("WrappingUtils#maybeWrapWithRoundedOverlayColor");
            }
            if (drawable != null && roundingParams != null && roundingParams.a == RoundingParams.RoundingMethod.OVERLAY_COLOR) {
                RoundedCornersDrawable roundedCornersDrawable = new RoundedCornersDrawable(drawable);
                b(roundedCornersDrawable, roundingParams);
                roundedCornersDrawable.p = roundingParams.d;
                roundedCornersDrawable.invalidateSelf();
                return roundedCornersDrawable;
            }
            if (lhs.d()) {
                lhs.b();
            }
            return drawable;
        } finally {
            if (lhs.d()) {
                lhs.b();
            }
        }
    }

    public static Drawable e(Drawable drawable, f5h0.d dVar, PointF pointF) {
        if (lhs.d()) {
            lhs.a("WrappingUtils#maybeWrapWithScaleType");
        }
        if (drawable == null || dVar == null) {
            if (lhs.d()) {
                lhs.b();
            }
            return drawable;
        }
        a5h0 a5h0Var = new a5h0(drawable, dVar);
        if (pointF != null) {
            a5h0Var.s(pointF);
        }
        if (lhs.d()) {
            lhs.b();
        }
        return a5h0Var;
    }
}

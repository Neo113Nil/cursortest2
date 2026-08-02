package com.vk.photoviewer;

import android.graphics.Rect;
import android.graphics.RectF;
import com.unity3d.services.UnityAdsConstants;
import com.vk.photoviewer.PhotoViewer;
import java.util.ArrayList;
import kotlin.jvm.internal.Ref$IntRef;
import xsna.an10;
import xsna.izs;
import xsna.j5g;
import xsna.mrx0;
import xsna.x6e0;

/* compiled from: AnimationCalculator.kt */
/* loaded from: classes3.dex */
public final class a {

    /* compiled from: AnimationCalculator.kt */
    /* renamed from: com.vk.photoviewer.a$a, reason: collision with other inner class name */
    public static final class C1519a {
        public static int a(float f, izs izsVar) {
            if (Float.isNaN(f)) {
                return ((Number) izsVar.invoke(Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT))).intValue();
            }
            if (Math.abs(f) <= Float.MAX_VALUE) {
                return ((Number) izsVar.invoke(Float.valueOf(f))).intValue();
            }
            return 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0128 A[LOOP:0: B:22:0x0126->B:23:0x0128, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static x6e0 a(mrx0 mrx0Var, PhotoViewer.g gVar, boolean z) {
        float f;
        float f2;
        int i;
        int b;
        float f3 = mrx0Var.e;
        RectF rectF = mrx0Var.b;
        float f4 = mrx0Var.f;
        Rect rect = mrx0Var.a;
        boolean z2 = true;
        if ((rect == null || !rect.isEmpty()) && !rectF.isEmpty() && gVar.getWidth() != 0) {
            z2 = false;
        }
        if (rect == null || z2) {
            return b(mrx0Var, gVar);
        }
        final float f5 = 1.0f;
        if (!z) {
            float width = rect.width() / f3;
            if (!(gVar instanceof PhotoViewer.n) || width != 1.0f) {
                float max = Math.max(width, rect.height() / f4);
                if (!Float.isNaN(max) && Math.abs(max) <= Float.MAX_VALUE) {
                    f5 = max;
                }
            }
        }
        float centerX = rect.centerX() - ((f5 * f3) / 2.0f);
        float width2 = ((rectF.width() - f3) / 2.0f) + rectF.left;
        float centerY = rect.centerY() - ((f5 * f4) / 2.0f);
        float height = ((rectF.height() - f4) / 2.0f) + rectF.top;
        float f6 = 2;
        float max2 = Math.max(f3 - (rect.width() / f5), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) / f6;
        float max3 = Math.max(f4 - (rect.height() / f5), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) / f6;
        float max4 = Math.max(f4 - (rect.height() / f5), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) / f6;
        Rect rect2 = mrx0Var.c;
        final Ref$IntRef ref$IntRef = new Ref$IntRef();
        final Ref$IntRef ref$IntRef2 = new Ref$IntRef();
        if (rect2 != null) {
            f2 = 0.0f;
            f = max2;
            ref$IntRef.element = Math.max(rect2.top - rect.top, 0);
            ref$IntRef2.element = Math.max(rect.bottom - rect2.bottom, 0);
        } else {
            f = max2;
            f2 = 0.0f;
        }
        int a = C1519a.a(max3, new izs() { // from class: xsna.cn2
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                return Integer.valueOf(an10.b(((Float) obj).floatValue()) + ((int) (Ref$IntRef.this.element / f5)));
            }
        });
        int a2 = C1519a.a(max4, new izs() { // from class: xsna.dn2
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                return Integer.valueOf(an10.b(((Float) obj).floatValue()) + ((int) (Ref$IntRef.this.element / f5)));
            }
        });
        if (a > f4 || a2 > f4) {
            return b(mrx0Var, gVar);
        }
        if (Float.isNaN(f)) {
            b = an10.b(f2);
        } else {
            if (Math.abs(f) > Float.MAX_VALUE) {
                i = 0;
                float f7 = mrx0Var.g;
                float[] fArr = mrx0Var.d;
                ArrayList arrayList = new ArrayList(fArr.length);
                for (float f8 : fArr) {
                    arrayList.add(Float.valueOf(f8 / f5));
                }
                return new x6e0(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f7, centerX, centerY, width2, height, i, a, a2, f5, j5g.L0(arrayList), (int) f3, (int) f4, 43648);
            }
            b = an10.b(f);
        }
        i = b;
        float f72 = mrx0Var.g;
        float[] fArr2 = mrx0Var.d;
        ArrayList arrayList2 = new ArrayList(fArr2.length);
        while (r6 < r8) {
        }
        return new x6e0(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f72, centerX, centerY, width2, height, i, a, a2, f5, j5g.L0(arrayList2), (int) f3, (int) f4, 43648);
    }

    public static x6e0 b(mrx0 mrx0Var, PhotoViewer.g gVar) {
        int i;
        int width;
        int i2;
        float width2 = mrx0Var.b.width();
        RectF rectF = mrx0Var.b;
        float height = rectF.height();
        float f = width2 / height;
        if (gVar.g()) {
            width = (int) height;
            i = (int) width2;
        } else if (f > gVar.getWidth() / gVar.getHeight()) {
            width = (int) height;
            i = (int) ((gVar.getWidth() / gVar.getHeight()) * width);
        } else {
            i = (int) width2;
            width = (int) (i / (gVar.getWidth() / gVar.getHeight()));
        }
        float f2 = ((width2 - i) / 2.0f) + rectF.left;
        float f3 = mrx0Var.i;
        float f4 = ((height - width) / 2.0f) + rectF.top;
        Rect rect = mrx0Var.c;
        int i3 = 0;
        if (rect != null) {
            int max = Math.max(rect.top, 0);
            i2 = Math.max(-rect.bottom, 0);
            i3 = max;
        } else {
            i2 = 0;
        }
        return new x6e0(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, mrx0Var.g, f2, f3, f2, f4, 0, (int) (i3 / 1.0f), (int) (i2 / 1.0f), 1.0f, null, i, width, 60032);
    }
}

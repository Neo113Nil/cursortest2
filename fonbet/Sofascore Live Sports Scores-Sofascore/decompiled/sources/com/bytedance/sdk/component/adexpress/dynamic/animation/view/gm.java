package com.bytedance.sdk.component.adexpress.dynamic.animation.view;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.vh;
import com.bytedance.sdk.component.adexpress.dynamic.oo.qf;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class gm {
    private int oo;
    Paint pcc;
    private int vj;
    private int wh;
    Path sf = new Path();
    Path gm = new Path();

    public gm() {
        Paint paint = new Paint();
        this.pcc = paint;
        paint.setAntiAlias(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void pcc(Canvas canvas, IAnimation iAnimation, View view) {
        int i;
        String str;
        float[] fArr;
        int i2 = 0;
        if (iAnimation.getRippleValue() != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            if (com.bytedance.sdk.component.adexpress.pcc.pcc.pcc.pcc().gm() != null) {
                try {
                    str = (String) view.getTag(2097610712);
                    try {
                        fArr = qf.sf(str);
                    } catch (Exception unused) {
                        fArr = null;
                        if (!str.startsWith("#")) {
                        }
                        ((ViewGroup) view.getParent()).setClipChildren(true);
                        canvas.drawCircle(this.oo, this.vj, iAnimation.getRippleValue() * Math.min(r2, r5) * 2, this.pcc);
                        if (iAnimation.getShineValue() != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        }
                        if (iAnimation.getMarqueeValue() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        }
                    }
                } catch (Exception unused2) {
                    str = "";
                }
                if (!str.startsWith("#")) {
                    this.pcc.setColor(Color.parseColor(str));
                    this.pcc.setAlpha(90);
                } else if (fArr != null) {
                    this.pcc.setColor(com.bytedance.sdk.component.adexpress.oo.qf.pcc((1.0f - iAnimation.getRippleValue()) * fArr[3], fArr[0] / 256.0f, fArr[1] / 256.0f, fArr[2] / 256.0f));
                }
            }
            ((ViewGroup) view.getParent()).setClipChildren(true);
            canvas.drawCircle(this.oo, this.vj, iAnimation.getRippleValue() * Math.min(r2, r5) * 2, this.pcc);
        }
        if (iAnimation.getShineValue() != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).setClipChildren(true);
            }
            if (view.getParent().getParent() != null) {
                ((ViewGroup) view.getParent().getParent()).setClipChildren(true);
            }
            this.sf.reset();
            try {
                i = ((Integer) view.getTag(2097610711)).intValue();
            } catch (Exception unused3) {
                i = 0;
            }
            if (i >= 0) {
                int shineValue = ((int) (iAnimation.getShineValue() * ((this.vj * 2) + ((i * 2) + (this.oo * 4))))) - ((this.vj * 2) + i);
                float f = shineValue;
                int i3 = this.vj;
                this.pcc.setShader(new LinearGradient(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, ((i + i3) / 2) + shineValue, i3 / 2, new int[]{Color.parseColor("#20ffffff"), Color.parseColor("#60ffffff"), Color.parseColor("#65ffffff")}, (float[]) null, Shader.TileMode.MIRROR));
                this.pcc.setStrokeWidth(this.oo * 2);
                Path path = this.gm;
                if (path != null) {
                    canvas.clipPath(path, Region.Op.INTERSECT);
                }
                int i4 = shineValue + i;
                canvas.drawLine(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i4 + r2, this.vj, this.pcc);
            }
        }
        if (iAnimation.getMarqueeValue() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            try {
                i2 = ((Integer) view.getTag(2097610709)).intValue();
            } catch (Exception unused4) {
            }
            if (i2 >= 0) {
                this.sf.reset();
                this.sf.moveTo(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                this.sf.lineTo(this.oo * 2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                this.sf.lineTo(this.oo * 2, this.vj * 2);
                this.sf.lineTo(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.vj * 2);
                this.sf.lineTo(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                this.pcc.setShader(new LinearGradient(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.oo * 2, this.vj * 2, new int[]{(int) (iAnimation.getMarqueeValue() * (-65536.0f)), (int) ((1.0f - iAnimation.getMarqueeValue()) * (-65536.0f))}, (float[]) null, Shader.TileMode.CLAMP));
                this.pcc.setColor(-65536);
                this.pcc.setStyle(Paint.Style.STROKE);
                this.pcc.setStrokeWidth(i2);
                canvas.drawPath(this.sf, this.pcc);
            }
        }
    }

    public void pcc(View view, float f) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = (int) (this.wh * f);
        view.setTranslationX((r1 - r6) / 2);
        if (view instanceof vh) {
            int i = 0;
            while (true) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (i >= viewGroup.getChildCount()) {
                    break;
                }
                viewGroup.getChildAt(i).setTranslationX((-(this.wh - layoutParams.width)) / 2);
                i++;
            }
        }
        view.setLayoutParams(layoutParams);
    }

    public void pcc(View view, int i, int i2) {
        String str;
        this.oo = i / 2;
        this.vj = i2 / 2;
        if (this.wh == 0 && view.getLayoutParams().width > 0) {
            this.wh = view.getLayoutParams().width;
        }
        try {
            str = (String) view.getTag(2097610710);
            try {
                this.gm.addRoundRect(new RectF(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i, i2), i2 / 2, i2 / 2, Path.Direction.CW);
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
            str = "";
        }
        if ("right".equals(str)) {
            view.setPivotX(this.oo * 2);
            view.setPivotY(this.vj);
        } else if ("left".equals(str)) {
            view.setPivotX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            view.setPivotY(this.vj);
        } else {
            view.setPivotX(this.oo);
            view.setPivotY(this.vj);
        }
    }
}

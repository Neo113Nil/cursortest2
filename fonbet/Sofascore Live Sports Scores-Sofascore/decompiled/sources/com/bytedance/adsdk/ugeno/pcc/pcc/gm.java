package com.bytedance.adsdk.ugeno.pcc.pcc;

import android.animation.PropertyValuesHolder;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.view.View;
import com.sofascore.model.mvvm.model.PlayerKt;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class gm extends pcc {
    private String gm;
    private Paint kj;
    private float oo;
    private LinearGradient ork;
    private Paint qf;
    private Matrix vh;
    private float vj;
    private PorterDuffXfermode vy;
    private View wh;

    public gm(com.bytedance.adsdk.ugeno.sf.gm gmVar, JSONObject jSONObject) {
        super(gmVar, jSONObject);
        this.wh = this.sf.vh();
        Paint paint = new Paint();
        this.qf = paint;
        paint.setAntiAlias(true);
        this.wh.setLayerType(2, null);
        this.vy = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
        this.kj = new Paint();
        this.vh = new Matrix();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private void gm(Canvas canvas) {
        try {
            if (this.sf.zsj() <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                this.qf.setXfermode(this.vy);
                canvas.drawRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.oo, this.vj, this.qf);
                return;
            }
            int zsj = (int) (this.oo * this.sf.zsj());
            int zsj2 = (int) (this.vj * this.sf.zsj());
            this.qf.setXfermode(this.vy);
            String str = this.gm;
            switch (str.hashCode()) {
                case -1383228885:
                    if (str.equals("bottom")) {
                        float f = zsj2;
                        canvas.drawRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, this.oo, this.vj, this.qf);
                        this.vh.setTranslate(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f);
                        this.ork.setLocalMatrix(this.vh);
                        this.kj.setShader(this.ork);
                        if (this.sf.zsj() <= 1.0f && this.sf.zsj() > 0.9f) {
                            this.kj.setAlpha((int) (255.0f - (this.sf.zsj() * 255.0f)));
                        }
                        canvas.drawRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.oo, f, this.kj);
                        break;
                    }
                    break;
                case 115029:
                    if (str.equals(PlayerKt.E_SPORTS_TOP)) {
                        float f2 = zsj2;
                        canvas.drawRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.oo, this.vj - f2, this.qf);
                        this.vh.setTranslate(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.vj - f2);
                        this.ork.setLocalMatrix(this.vh);
                        this.kj.setShader(this.ork);
                        if (this.sf.zsj() <= 1.0f && this.sf.zsj() > 0.9f) {
                            this.kj.setAlpha((int) (255.0f - (this.sf.zsj() * 255.0f)));
                        }
                        float f3 = this.oo;
                        float f4 = this.vj;
                        canvas.drawRect(f3, f4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f4 - f2, this.kj);
                        break;
                    }
                    break;
                case 3317767:
                    if (str.equals("left")) {
                        float f5 = zsj;
                        canvas.drawRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.oo - f5, this.vj, this.qf);
                        this.vh.setTranslate(this.oo - f5, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                        this.ork.setLocalMatrix(this.vh);
                        this.kj.setShader(this.ork);
                        if (this.sf.zsj() <= 1.0f && this.sf.zsj() > 0.9f) {
                            this.kj.setAlpha((int) (255.0f - (this.sf.zsj() * 255.0f)));
                        }
                        float f6 = this.oo;
                        canvas.drawRect(f6, this.vj, f6 - f5, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.kj);
                        break;
                    }
                    break;
                case 108511772:
                    if (str.equals("right")) {
                        float f7 = zsj;
                        canvas.drawRect(f7, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.oo, this.vj, this.qf);
                        this.vh.setTranslate(f7, this.vj);
                        this.ork.setLocalMatrix(this.vh);
                        this.kj.setShader(this.ork);
                        if (this.sf.zsj() <= 1.0f && this.sf.zsj() > 0.9f) {
                            this.kj.setAlpha((int) (255.0f - (this.sf.zsj() * 255.0f)));
                        }
                        canvas.drawRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f7, this.vj, this.kj);
                        break;
                    }
                    break;
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    @Override // com.bytedance.adsdk.ugeno.pcc.pcc.pcc
    public void pcc(int i, int i2) {
        this.oo = i;
        this.vj = i2;
        String str = this.gm;
        str.getClass();
        switch (str) {
            case "bottom":
                this.ork = new LinearGradient(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, -this.vj, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, -1, Shader.TileMode.CLAMP);
                break;
            case "top":
                this.ork = new LinearGradient(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.vj, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, -1, Shader.TileMode.CLAMP);
                break;
            case "left":
                this.ork = new LinearGradient(this.oo, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, -1, Shader.TileMode.CLAMP);
                break;
            case "right":
                this.ork = new LinearGradient(-this.oo, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.vj, 0, -1, Shader.TileMode.CLAMP);
                break;
        }
    }

    @Override // com.bytedance.adsdk.ugeno.pcc.pcc.pcc
    public void sf() {
        this.gm = this.pcc.optString("direction", "left");
    }

    @Override // com.bytedance.adsdk.ugeno.pcc.pcc.pcc
    public void sf(Canvas canvas) {
        gm(canvas);
    }

    @Override // com.bytedance.adsdk.ugeno.pcc.pcc.pcc
    public void pcc(Canvas canvas) {
        gm(canvas);
    }

    @Override // com.bytedance.adsdk.ugeno.pcc.pcc.pcc
    public List<PropertyValuesHolder> gm() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(PropertyValuesHolder.ofFloat("rubIn", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f));
        arrayList.add(PropertyValuesHolder.ofFloat(com.bytedance.adsdk.ugeno.pcc.vj.ALPHA.sf(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f));
        return arrayList;
    }
}

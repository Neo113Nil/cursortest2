package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.text.TextUtils;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation;
import com.unity3d.services.UnityAdsConstants;
import defpackage.w1l;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class vj extends FrameLayout implements IAnimation, mu, pq {
    protected boolean dax;
    private com.bytedance.sdk.component.utils.yt fum;
    protected DynamicRootView gbb;
    protected float gm;
    private float gpj;
    protected com.bytedance.sdk.component.adexpress.dynamic.oo.kj hc;
    protected View jr;
    protected int kj;
    private float lo;
    com.bytedance.sdk.component.adexpress.dynamic.animation.view.gm lu;
    protected com.bytedance.sdk.component.adexpress.dynamic.animation.pcc.sf nac;
    protected float oo;
    protected int ork;
    private float pcc;
    protected int qf;
    private float sf;
    protected com.bytedance.sdk.component.adexpress.dynamic.oo.qf tmg;
    protected Context vh;
    protected float vj;
    protected int vy;
    protected float wh;
    private static final View.OnTouchListener tz = new View.OnTouchListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.vj.2
        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    };
    private static final View.OnClickListener of = new View.OnClickListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.vj.3
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    };

    public vj(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.oo.kj kjVar) {
        super(context);
        this.vh = context;
        this.gbb = dynamicRootView;
        this.hc = kjVar;
        this.gm = kjVar.wh();
        this.oo = kjVar.qf();
        this.vj = kjVar.kj();
        this.wh = kjVar.vy();
        this.vy = (int) com.bytedance.sdk.component.adexpress.oo.qf.pcc(this.vh, this.gm);
        this.ork = (int) com.bytedance.sdk.component.adexpress.oo.qf.pcc(this.vh, this.oo);
        this.qf = (int) com.bytedance.sdk.component.adexpress.oo.qf.pcc(this.vh, this.vj);
        this.kj = (int) com.bytedance.sdk.component.adexpress.oo.qf.pcc(this.vh, this.wh);
        com.bytedance.sdk.component.adexpress.dynamic.oo.qf qfVar = new com.bytedance.sdk.component.adexpress.dynamic.oo.qf(kjVar.ork());
        this.tmg = qfVar;
        if (qfVar.lu() > 0) {
            this.qf = (this.tmg.lu() * 2) + this.qf;
            this.kj = (this.tmg.lu() * 2) + this.kj;
            this.vy -= this.tmg.lu();
            this.ork -= this.tmg.lu();
            List<com.bytedance.sdk.component.adexpress.dynamic.oo.kj> vh = kjVar.vh();
            if (vh != null) {
                for (com.bytedance.sdk.component.adexpress.dynamic.oo.kj kjVar2 : vh) {
                    kjVar2.gm(kjVar2.wh() + com.bytedance.sdk.component.adexpress.oo.qf.sf(this.vh, this.tmg.lu()));
                    kjVar2.oo(kjVar2.qf() + com.bytedance.sdk.component.adexpress.oo.qf.sf(this.vh, this.tmg.lu()));
                    kjVar2.pcc(com.bytedance.sdk.component.adexpress.oo.qf.sf(this.vh, this.tmg.lu()));
                    kjVar2.sf(com.bytedance.sdk.component.adexpress.oo.qf.sf(this.vh, this.tmg.lu()));
                }
            }
        }
        this.dax = this.tmg.gbb() > 0.0d;
        this.lu = new com.bytedance.sdk.component.adexpress.dynamic.animation.view.gm();
    }

    private List<String> sf(String str) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        boolean z = false;
        int i2 = 0;
        for (int i3 = 0; i3 < str.length(); i3++) {
            if (str.charAt(i3) == '(') {
                i++;
                z = true;
            } else if (str.charAt(i3) == ')' && i - 1 == 0 && z) {
                int i4 = i3 + 1;
                arrayList.add(str.substring(i2, i4));
                i2 = i4;
                z = false;
            }
        }
        return arrayList;
    }

    public Drawable getBackgroundDrawable() {
        return pcc(false, "");
    }

    public boolean getBeginInvisibleAndShow() {
        return this.dax;
    }

    public int getClickArea() {
        return this.tmg.tsz();
    }

    public GradientDrawable getDrawable() {
        return new GradientDrawable();
    }

    public com.bytedance.sdk.component.adexpress.dynamic.wh.pcc getDynamicClickListener() {
        return this.gbb.getDynamicClickListener();
    }

    public int getDynamicHeight() {
        return this.kj;
    }

    public com.bytedance.sdk.component.adexpress.dynamic.oo.wh getDynamicLayoutBrickValue() {
        com.bytedance.sdk.component.adexpress.dynamic.oo.vj ork;
        com.bytedance.sdk.component.adexpress.dynamic.oo.kj kjVar = this.hc;
        if (kjVar == null || (ork = kjVar.ork()) == null) {
            return null;
        }
        return ork.vj();
    }

    public int getDynamicWidth() {
        return this.qf;
    }

    public String getImageObjectFit() {
        return this.tmg.se();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public float getMarqueeValue() {
        return this.gpj;
    }

    public Drawable getMutilBackgroundDrawable() {
        try {
            return new LayerDrawable(pcc(sf(this.tmg.nn().replaceAll("/\\*.*\\*/", ""))));
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public float getRippleValue() {
        return this.pcc;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public float getShineValue() {
        return this.sf;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public float getStretchValue() {
        return this.lo;
    }

    public boolean gm() {
        vy();
        wh();
        oo();
        return true;
    }

    public boolean kj() {
        com.bytedance.sdk.component.adexpress.dynamic.oo.kj kjVar = this.hc;
        return kjVar == null || kjVar.ork() == null || this.hc.ork().vj() == null || this.hc.ork().vj().gga() == null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        qf();
        pcc();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        sf();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.lu.pcc(canvas, this, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [android.view.View] */
    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        com.bytedance.sdk.component.adexpress.dynamic.animation.view.gm gmVar = this.lu;
        ?? r4 = this.jr;
        if (r4 != 0) {
            this = r4;
        }
        gmVar.pcc(this, i, i2);
    }

    public boolean oo() {
        View.OnTouchListener onTouchListener;
        View.OnClickListener onClickListener;
        View view = this.jr;
        if (view == null) {
            view = this;
        }
        if (vj()) {
            onTouchListener = (View.OnTouchListener) getDynamicClickListener();
            onClickListener = (View.OnClickListener) getDynamicClickListener();
        } else {
            onTouchListener = tz;
            onClickListener = of;
        }
        if (onTouchListener != null && onClickListener != null) {
            view.setOnTouchListener(onTouchListener);
            view.setOnClickListener(onClickListener);
            int pcc = com.bytedance.sdk.component.adexpress.dynamic.sf.pcc.pcc(this.tmg);
            if (pcc == 2 || pcc == 3) {
                view.setOnClickListener(of);
            } else {
                view.setOnClickListener(onClickListener);
            }
        }
        pcc(view);
        sf(view);
        return true;
    }

    public Drawable pcc(boolean z, String str) {
        String[] split;
        int[] iArr;
        if (!TextUtils.isEmpty(this.tmg.nn())) {
            try {
                String nn = this.tmg.nn();
                String substring = nn.substring(nn.indexOf("(") + 1, nn.length() - 1);
                if (substring.contains("rgba") && substring.contains("%")) {
                    split = new String[]{substring.substring(0, substring.indexOf(BlazeDataSourcePersonalizedType.STRING_SEPARATOR)).trim(), substring.substring(substring.indexOf(BlazeDataSourcePersonalizedType.STRING_SEPARATOR) + 1, substring.indexOf("%") + 1).trim(), substring.substring(substring.indexOf("%") + 2).trim()};
                    iArr = new int[]{com.bytedance.sdk.component.adexpress.dynamic.oo.qf.pcc(split[1]), com.bytedance.sdk.component.adexpress.dynamic.oo.qf.pcc(split[2])};
                } else {
                    split = substring.split(", ");
                    iArr = new int[]{com.bytedance.sdk.component.adexpress.dynamic.oo.qf.pcc(split[1].substring(0, 7)), com.bytedance.sdk.component.adexpress.dynamic.oo.qf.pcc(split[2].substring(0, 7))};
                }
                try {
                    double parseDouble = Double.parseDouble(substring.substring(substring.indexOf("linear-gradient(") + 1, substring.indexOf("deg")));
                    if (parseDouble > 225.0d && parseDouble < 315.0d) {
                        int i = iArr[1];
                        iArr[1] = iArr[0];
                        iArr[0] = i;
                    }
                } catch (Exception unused) {
                }
                GradientDrawable pcc = pcc(pcc(split[0]), iArr);
                pcc.setShape(0);
                pcc.setCornerRadius(com.bytedance.sdk.component.adexpress.oo.qf.pcc(this.vh, this.tmg.jr()));
                return pcc;
            } catch (Exception unused2) {
                Drawable mutilBackgroundDrawable = getMutilBackgroundDrawable();
                if (mutilBackgroundDrawable != null) {
                    return mutilBackgroundDrawable;
                }
            }
        }
        GradientDrawable drawable = getDrawable();
        drawable.setShape(0);
        float pcc2 = com.bytedance.sdk.component.adexpress.oo.qf.pcc(this.vh, this.tmg.jr());
        drawable.setCornerRadius(pcc2);
        if (pcc2 < 1.0f) {
            float pcc3 = com.bytedance.sdk.component.adexpress.oo.qf.pcc(this.vh, this.tmg.ye());
            float pcc4 = com.bytedance.sdk.component.adexpress.oo.qf.pcc(this.vh, this.tmg.lq());
            float pcc5 = com.bytedance.sdk.component.adexpress.oo.qf.pcc(this.vh, this.tmg.zti());
            float pcc6 = com.bytedance.sdk.component.adexpress.oo.qf.pcc(this.vh, this.tmg.pq());
            float[] fArr = new float[8];
            if (pcc3 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                fArr[0] = pcc3;
                fArr[1] = pcc3;
            }
            if (pcc4 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                fArr[2] = pcc4;
                fArr[3] = pcc4;
            }
            if (pcc5 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                fArr[4] = pcc5;
                fArr[5] = pcc5;
            }
            if (pcc6 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                fArr[6] = pcc6;
                fArr[7] = pcc6;
            }
            drawable.setCornerRadii(fArr);
        }
        drawable.setColor(z ? Color.parseColor(str) : this.tmg.mk());
        if (this.tmg.nac() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            drawable.setStroke((int) com.bytedance.sdk.component.adexpress.oo.qf.pcc(this.vh, this.tmg.nac()), this.tmg.dax());
        } else if (this.tmg.lu() > 0) {
            drawable.setStroke(this.tmg.lu(), this.tmg.dax());
            drawable.setAlpha(50);
            if (w1l.B(this.hc, "video-vd")) {
                setLayerType(1, null);
                return new gpj((int) pcc2, this.tmg.lu());
            }
        }
        return drawable;
    }

    public void qf() {
        if (kj()) {
            return;
        }
        View view = this.jr;
        if (view == null) {
            view = this;
        }
        this.nac = new com.bytedance.sdk.component.adexpress.dynamic.animation.pcc.sf(view, this.hc.ork().vj().gga());
        post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.vj.1
            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.sdk.component.adexpress.dynamic.animation.pcc.sf sfVar = vj.this.nac;
                if (sfVar != null) {
                    sfVar.pcc();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public void setMarqueeValue(float f) {
        this.gpj = f;
        postInvalidate();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public void setRippleValue(float f) {
        this.pcc = f;
        postInvalidate();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public void setShineValue(float f) {
        this.sf = f;
        postInvalidate();
    }

    public void setShouldInvisible(boolean z) {
        this.dax = z;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public void setStretchValue(float f) {
        this.lo = f;
        this.lu.pcc(this, f);
    }

    public boolean vj() {
        com.bytedance.sdk.component.adexpress.dynamic.oo.qf qfVar = this.tmg;
        return (qfVar == null || qfVar.tsz() == 0) ? false : true;
    }

    public void wh() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.qf, this.kj);
        layoutParams.topMargin = this.ork;
        int i = this.vy;
        layoutParams.leftMargin = i;
        layoutParams.setMarginStart(i);
        layoutParams.setMarginEnd(layoutParams.rightMargin);
        setLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
    }

    public void sf(@NonNull View view) {
        com.bytedance.sdk.component.adexpress.dynamic.oo.wh vj;
        com.bytedance.sdk.component.adexpress.dynamic.oo.kj kjVar = this.hc;
        if (kjVar == null || (vj = kjVar.ork().vj()) == null) {
            return;
        }
        view.setTag(2097610716, Boolean.valueOf(vj.xy()));
    }

    public void sf() {
        com.bytedance.sdk.component.adexpress.dynamic.animation.pcc.sf sfVar = this.nac;
        if (sfVar != null) {
            sfVar.sf();
        }
    }

    public void pcc(View view) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("width", this.hc.kj());
            jSONObject.put("height", this.hc.vy());
            if (com.bytedance.sdk.component.adexpress.oo.sf()) {
                view.setTag(com.bytedance.sdk.component.adexpress.dynamic.pcc.lo, this.tmg.rnn());
                view.setTag(com.bytedance.sdk.component.adexpress.dynamic.pcc.fum, this.hc.ork().sf());
                view.setTag(com.bytedance.sdk.component.adexpress.dynamic.pcc.tz, this.hc.gm());
                view.setTag(com.bytedance.sdk.component.adexpress.dynamic.pcc.of, jSONObject.toString());
                return;
            }
            view.setTag(2097610717, this.tmg.rnn());
            view.setTag(2097610715, this.hc.ork().sf());
            view.setTag(2097610714, this.hc.gm());
            view.setTag(2097610713, jSONObject.toString());
            int pcc = com.bytedance.sdk.component.adexpress.dynamic.sf.pcc.pcc(this.tmg);
            if (pcc == 1) {
                view.setTag(2097610707, new Pair(this.tmg.qy(), Long.valueOf(this.tmg.jsj())));
                view.setTag(2097610708, Integer.valueOf(pcc));
            }
        } catch (JSONException unused) {
        }
    }

    public sf pcc(Bitmap bitmap) {
        return new pcc(bitmap, null);
    }

    private Drawable[] pcc(List<String> list) {
        Drawable[] drawableArr = new Drawable[list.size()];
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            if (str.contains("linear-gradient")) {
                String[] split = str.substring(str.indexOf("(") + 1, str.length() - 1).split(", ");
                int length = split.length - 1;
                int[] iArr = new int[length];
                int i2 = 0;
                while (i2 < length) {
                    int i3 = i2 + 1;
                    iArr[i2] = com.bytedance.sdk.component.adexpress.dynamic.oo.qf.pcc(split[i3].substring(0, 7));
                    i2 = i3;
                }
                GradientDrawable pcc = pcc(pcc(split[0]), iArr);
                pcc.setShape(0);
                pcc.setCornerRadius(com.bytedance.sdk.component.adexpress.oo.qf.pcc(this.vh, this.tmg.jr()));
                drawableArr[(list.size() - 1) - i] = pcc;
            }
        }
        return drawableArr;
    }

    public GradientDrawable pcc(GradientDrawable.Orientation orientation, int[] iArr) {
        if (iArr != null && iArr.length != 0) {
            if (iArr.length == 1) {
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setColor(iArr[0]);
                return gradientDrawable;
            }
            return new GradientDrawable(orientation, iArr);
        }
        return new GradientDrawable();
    }

    public GradientDrawable.Orientation pcc(String str) {
        try {
            int parseFloat = (int) Float.parseFloat(str.substring(0, str.length() - 3));
            if (parseFloat <= 90) {
                return GradientDrawable.Orientation.LEFT_RIGHT;
            }
            if (parseFloat <= 180) {
                return GradientDrawable.Orientation.TOP_BOTTOM;
            }
            if (parseFloat <= 270) {
                return GradientDrawable.Orientation.RIGHT_LEFT;
            }
            return GradientDrawable.Orientation.BOTTOM_TOP;
        } catch (Exception unused) {
            return GradientDrawable.Orientation.LEFT_RIGHT;
        }
    }

    private void pcc() {
        if (isShown()) {
            int pcc = com.bytedance.sdk.component.adexpress.dynamic.sf.pcc.pcc(this.tmg);
            if (pcc == 2) {
                if (this.fum == null) {
                    this.fum = new com.bytedance.sdk.component.utils.yt(getContext().getApplicationContext(), 1);
                }
                new Object() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.vj.4
                };
                com.bytedance.sdk.component.adexpress.sf.hc renderRequest = this.gbb.getRenderRequest();
                if (renderRequest != null) {
                    renderRequest.jr();
                    renderRequest.fum();
                    renderRequest.gpj();
                    return;
                }
                return;
            }
            if (pcc == 3) {
                if (this.fum == null) {
                    this.fum = new com.bytedance.sdk.component.utils.yt(getContext().getApplicationContext(), 2);
                }
                new Object() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.vj.5
                };
                com.bytedance.sdk.component.adexpress.sf.hc renderRequest2 = this.gbb.getRenderRequest();
                if (renderRequest2 != null) {
                    renderRequest2.nac();
                    renderRequest2.tz();
                    renderRequest2.lu();
                    renderRequest2.lo();
                }
            }
        }
    }
}

package com.bytedance.adsdk.ugeno.yoga.sf;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.adsdk.ugeno.oo;
import com.bytedance.adsdk.ugeno.pcc.kj;
import com.bytedance.adsdk.ugeno.pcc.qf;
import com.bytedance.adsdk.ugeno.yoga.gbb;
import com.bytedance.adsdk.ugeno.yoga.hc;
import com.bytedance.adsdk.ugeno.yoga.ork;
import com.bytedance.adsdk.ugeno.yoga.vh;
import com.bytedance.adsdk.ugeno.yoga.vj;
import com.bytedance.adsdk.ugeno.yoga.vy;
import com.bytedance.adsdk.ugeno.yoga.wh;
import com.unity3d.services.UnityAdsConstants;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class gm extends ViewGroup implements qf, com.bytedance.adsdk.ugeno.sf.sf {
    private oo gm;
    private kj oo;
    private final Map<View, ork> pcc;
    private final ork sf;

    public gm(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.oo = new kj(this);
        ork pcc2 = vh.pcc();
        this.sf = pcc2;
        this.pcc = new HashMap();
        pcc2.pcc(this);
        pcc2.pcc((com.bytedance.adsdk.ugeno.yoga.qf) new sf());
        pcc((pcc) generateDefaultLayoutParams(), pcc2, this);
    }

    public static void pcc(pcc pccVar, ork orkVar, View view) {
        if (view.getResources().getConfiguration().getLayoutDirection() == 1) {
            orkVar.pcc(com.bytedance.adsdk.ugeno.yoga.gm.RTL);
        }
        Drawable background = view.getBackground();
        if (background != null) {
            if (background.getPadding(new Rect())) {
                orkVar.sf(com.bytedance.adsdk.ugeno.yoga.oo.LEFT, r0.left);
                orkVar.sf(com.bytedance.adsdk.ugeno.yoga.oo.TOP, r0.top);
                orkVar.sf(com.bytedance.adsdk.ugeno.yoga.oo.RIGHT, r0.right);
                orkVar.sf(com.bytedance.adsdk.ugeno.yoga.oo.BOTTOM, r0.bottom);
            }
        }
        for (int i = 0; i < pccVar.pcc.size(); i++) {
            int keyAt = pccVar.pcc.keyAt(i);
            float floatValue = pccVar.pcc.valueAt(i).floatValue();
            if (keyAt == 4) {
                orkVar.gm(com.bytedance.adsdk.ugeno.yoga.pcc.pcc(Math.round(floatValue)));
            } else if (keyAt == 0) {
                orkVar.pcc(com.bytedance.adsdk.ugeno.yoga.pcc.pcc(Math.round(floatValue)));
            } else if (keyAt == 9) {
                orkVar.sf(com.bytedance.adsdk.ugeno.yoga.pcc.pcc(Math.round(floatValue)));
            } else if (keyAt == 25) {
                orkVar.tmg(floatValue);
            } else if (keyAt == 8) {
                if (floatValue < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    orkVar.gm();
                } else {
                    orkVar.gm(floatValue);
                }
            } else if (keyAt == 1) {
                orkVar.pcc(vj.pcc(Math.round(floatValue)));
            } else if (keyAt == 6) {
                orkVar.pcc(floatValue);
            } else if (keyAt == 7) {
                orkVar.sf(floatValue);
            } else if (keyAt == 16) {
                if (floatValue == -1.0f) {
                    orkVar.qf(100.0f);
                } else if (floatValue == -2.0f) {
                    orkVar.vj();
                } else {
                    orkVar.wh(floatValue);
                }
            } else if (keyAt == 18) {
                orkVar.pcc(com.bytedance.adsdk.ugeno.yoga.oo.LEFT, floatValue);
            } else if (keyAt == 3) {
                orkVar.pcc(wh.pcc(Math.round(floatValue)));
            } else if (keyAt == 17) {
                orkVar.pcc(com.bytedance.adsdk.ugeno.yoga.oo.TOP, floatValue);
            } else if (keyAt == 20) {
                orkVar.pcc(com.bytedance.adsdk.ugeno.yoga.oo.RIGHT, floatValue);
            } else if (keyAt == 19) {
                orkVar.pcc(com.bytedance.adsdk.ugeno.yoga.oo.BOTTOM, floatValue);
            } else if (keyAt == 28) {
                orkVar.vy(floatValue);
            } else if (keyAt == 27) {
                orkVar.kj(floatValue);
            } else if (keyAt == 22) {
                orkVar.sf(com.bytedance.adsdk.ugeno.yoga.oo.LEFT, floatValue);
            } else if (keyAt == 21) {
                orkVar.sf(com.bytedance.adsdk.ugeno.yoga.oo.TOP, floatValue);
            } else if (keyAt == 24) {
                orkVar.sf(com.bytedance.adsdk.ugeno.yoga.oo.RIGHT, floatValue);
            } else if (keyAt == 23) {
                orkVar.sf(com.bytedance.adsdk.ugeno.yoga.oo.BOTTOM, floatValue);
            } else if (keyAt == 11) {
                orkVar.gm(com.bytedance.adsdk.ugeno.yoga.oo.LEFT, floatValue);
            } else if (keyAt == 10) {
                orkVar.gm(com.bytedance.adsdk.ugeno.yoga.oo.TOP, floatValue);
            } else if (keyAt == 13) {
                orkVar.gm(com.bytedance.adsdk.ugeno.yoga.oo.RIGHT, floatValue);
            } else if (keyAt == 12) {
                orkVar.gm(com.bytedance.adsdk.ugeno.yoga.oo.BOTTOM, floatValue);
            } else if (keyAt == 14) {
                orkVar.pcc(hc.pcc(Math.round(floatValue)));
            } else if (keyAt == 15) {
                if (floatValue == -1.0f) {
                    orkVar.vj(100.0f);
                } else if (floatValue == -2.0f) {
                    orkVar.oo();
                } else {
                    orkVar.oo(floatValue);
                }
            } else if (keyAt == 2) {
                orkVar.pcc(gbb.pcc(Math.round(floatValue)));
            }
        }
    }

    private void sf(ork orkVar, int i) {
        if (i == -1) {
            orkVar.qf(100.0f);
        } else if (i == -2) {
            orkVar.vj();
        } else {
            orkVar.wh(i);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        ork pcc2;
        this.sf.pcc((com.bytedance.adsdk.ugeno.yoga.qf) null);
        if (view instanceof com.bytedance.adsdk.ugeno.yoga.sf.sf) {
            throw null;
        }
        super.addView(view, i, layoutParams);
        if (this.pcc.containsKey(view)) {
            return;
        }
        if (view instanceof gm) {
            pcc2 = ((gm) view).getYogaNode();
        } else {
            pcc2 = this.pcc.containsKey(view) ? this.pcc.get(view) : vh.pcc();
            pcc2.pcc(view);
            pcc2.pcc((com.bytedance.adsdk.ugeno.yoga.qf) new sf());
        }
        pcc((pcc) view.getLayoutParams(), pcc2, view);
        this.pcc.put(view, pcc2);
        int visibility = view.getVisibility();
        ork orkVar = this.sf;
        if (visibility == 8) {
            view.setTag(151060224, Integer.valueOf(orkVar.pcc()));
        } else {
            orkVar.pcc(pcc2, orkVar.pcc());
        }
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof pcc;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        oo ooVar = this.gm;
        if (ooVar != null) {
            ooVar.sf(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new pcc(-1, -1);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new pcc(layoutParams);
    }

    public float getBorderRadius() {
        return this.oo.pcc();
    }

    @Override // com.bytedance.adsdk.ugeno.pcc.qf
    public float getRipple() {
        return this.oo.getRipple();
    }

    @Override // com.bytedance.adsdk.ugeno.pcc.qf
    public float getRubIn() {
        return this.oo.getRubIn();
    }

    @Override // com.bytedance.adsdk.ugeno.pcc.qf
    public float getShine() {
        return this.oo.getShine();
    }

    @Override // com.bytedance.adsdk.ugeno.pcc.qf
    public float getStretch() {
        return this.oo.getStretch();
    }

    public ork getYogaNode() {
        return this.sf;
    }

    @Override // com.bytedance.adsdk.ugeno.sf.sf
    public void gm(View view, int i) {
        oo(view, i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        oo ooVar = this.gm;
        if (ooVar != null) {
            ooVar.qf();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        oo ooVar = this.gm;
        if (ooVar != null) {
            ooVar.kj();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        oo ooVar = this.gm;
        if (ooVar != null) {
            ooVar.pcc(canvas);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        oo ooVar = this.gm;
        if (ooVar != null) {
            ooVar.wh();
        }
        if (!(getParent() instanceof gm)) {
            pcc(View.MeasureSpec.makeMeasureSpec(i3 - i, 1073741824), View.MeasureSpec.makeMeasureSpec(i4 - i2, 1073741824));
        }
        pcc(this.sf, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        oo ooVar2 = this.gm;
        if (ooVar2 != null) {
            ooVar2.pcc(i, i2, i3, i4);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        if (!(getParent() instanceof gm)) {
            pcc(i, i2);
        }
        oo ooVar = this.gm;
        if (ooVar != null) {
            int[] pcc2 = ooVar.pcc(i, i2);
            setMeasuredDimension(pcc2[0], pcc2[1]);
        } else {
            setMeasuredDimension(Math.round(this.sf.kj()), Math.round(this.sf.vy()));
        }
        oo ooVar2 = this.gm;
        if (ooVar2 != null) {
            ooVar2.vj();
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        oo ooVar = this.gm;
        if (ooVar != null) {
            ooVar.sf(i, i2, i3, i4);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
    }

    public void oo(View view, int i) {
        int pcc2;
        view.setVisibility(i);
        try {
            ork orkVar = this.pcc.get(view);
            Object tag = view.getTag(151060224);
            if (i != 0) {
                if (i != 8 || (pcc2 = this.sf.pcc(orkVar)) == -1) {
                    return;
                }
                this.sf.sf(pcc2);
                view.setTag(151060224, Integer.valueOf(pcc2));
                pcc(this.sf);
                return;
            }
            if (tag == null || this.sf.pcc(orkVar) != -1) {
                return;
            }
            int intValue = ((Integer) tag).intValue();
            int pcc3 = this.sf.pcc();
            ork orkVar2 = this.sf;
            if (intValue < pcc3) {
                orkVar2.pcc(this.pcc.get(view), intValue);
            } else {
                orkVar2.pcc(this.pcc.get(view), this.sf.pcc());
            }
            pcc(this.sf);
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.ViewGroup
    public void removeAllViews() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            pcc(getChildAt(i), false);
        }
        super.removeAllViews();
    }

    @Override // android.view.ViewGroup
    public void removeAllViewsInLayout() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            pcc(getChildAt(i), true);
        }
        super.removeAllViewsInLayout();
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        pcc(view, false);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public void removeViewAt(int i) {
        pcc(getChildAt(i), false);
        super.removeViewAt(i);
    }

    @Override // android.view.ViewGroup
    public void removeViewInLayout(View view) {
        pcc(view, true);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public void removeViews(int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            pcc(getChildAt(i3), false);
        }
        super.removeViews(i, i2);
    }

    @Override // android.view.ViewGroup
    public void removeViewsInLayout(int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            pcc(getChildAt(i3), true);
        }
        super.removeViewsInLayout(i, i2);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        this.oo.pcc(i);
    }

    public void setBorderRadius(float f) {
        this.oo.pcc(f);
    }

    public void setRipple(float f) {
        kj kjVar = this.oo;
        if (kjVar != null) {
            kjVar.sf(f);
        }
    }

    public void setRubIn(float f) {
        kj kjVar = this.oo;
        if (kjVar != null) {
            kjVar.vj(f);
        }
    }

    public void setShine(float f) {
        kj kjVar = this.oo;
        if (kjVar != null) {
            kjVar.gm(f);
        }
    }

    public void setStretch(float f) {
        kj kjVar = this.oo;
        if (kjVar != null) {
            kjVar.oo(f);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.sf.sf
    public void sf(View view, int i) {
        ork pcc2;
        if (view == null || (pcc2 = pcc(view)) == null) {
            return;
        }
        sf(pcc2, i);
        view.requestLayout();
    }

    @Override // com.bytedance.adsdk.ugeno.sf.sf
    public void sf(int i) {
        ork orkVar = this.sf;
        if (orkVar != null) {
            sf(orkVar, i);
            requestLayout();
        }
    }

    public gm(Context context) {
        this(context, null, 0);
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class sf implements com.bytedance.adsdk.ugeno.yoga.qf {
        @Override // com.bytedance.adsdk.ugeno.yoga.qf
        public long pcc(ork orkVar, float f, com.bytedance.adsdk.ugeno.yoga.kj kjVar, float f2, com.bytedance.adsdk.ugeno.yoga.kj kjVar2) {
            View view = (View) orkVar.ork();
            if (view == null || (view instanceof gm)) {
                return vy.pcc(0, 0);
            }
            view.measure(View.MeasureSpec.makeMeasureSpec((int) f, pcc(kjVar)), View.MeasureSpec.makeMeasureSpec((int) f2, pcc(kjVar2)));
            return vy.pcc(view.getMeasuredWidth(), view.getMeasuredHeight());
        }

        private int pcc(com.bytedance.adsdk.ugeno.yoga.kj kjVar) {
            if (kjVar == com.bytedance.adsdk.ugeno.yoga.kj.AT_MOST) {
                return Integer.MIN_VALUE;
            }
            return kjVar == com.bytedance.adsdk.ugeno.yoga.kj.EXACTLY ? 1073741824 : 0;
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class pcc extends ViewGroup.LayoutParams {
        private float dax;
        private float gbb;
        private float gm;
        private float gpj;
        private float hc;
        private float jr;
        private float kj;
        private float lu;
        private float nac;
        private float oo;
        private float ork;
        SparseArray<Float> pcc;
        private float qf;
        SparseArray<String> sf;
        private float tmg;
        private float vh;
        private float vj;
        private float vy;
        private float wh;

        public pcc(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            if (layoutParams instanceof pcc) {
                pcc pccVar = (pcc) layoutParams;
                this.pcc = pccVar.pcc.clone();
                this.sf = pccVar.sf.clone();
                return;
            }
            this.pcc = new SparseArray<>();
            this.sf = new SparseArray<>();
            if (layoutParams.width >= 0) {
                this.pcc.put(15, Float.valueOf(((ViewGroup.LayoutParams) this).width));
            }
            if (layoutParams.height >= 0) {
                this.pcc.put(16, Float.valueOf(((ViewGroup.LayoutParams) this).height));
            }
        }

        public void dax(float f) {
            this.lu = f;
            this.pcc.put(27, Float.valueOf(f));
        }

        public void gbb(float f) {
            this.wh = f;
            this.pcc.put(20, Float.valueOf(f));
        }

        public void gm(float f) {
            this.vy = f;
            this.pcc.put(7, Float.valueOf(f));
        }

        public void hc(float f) {
            this.vj = f;
            this.pcc.put(19, Float.valueOf(f));
        }

        public void jr(float f) {
            this.nac = f;
            this.pcc.put(25, Float.valueOf(f));
        }

        public void kj(float f) {
            this.gbb = f;
            this.pcc.put(11, Float.valueOf(f));
        }

        public void nac(float f) {
            this.gpj = f;
            this.pcc.put(28, Float.valueOf(f));
        }

        public void oo(float f) {
            this.ork = f;
            this.pcc.put(8, Float.valueOf(f));
        }

        public void ork(float f) {
            this.dax = f;
            this.pcc.put(13, Float.valueOf(f));
        }

        public void pcc(float f) {
            this.qf = f;
            this.pcc.put(5, Float.valueOf(f));
        }

        public void qf(float f) {
            this.hc = f;
            this.pcc.put(10, Float.valueOf(f));
        }

        public void sf(float f) {
            this.kj = f;
            this.pcc.put(6, Float.valueOf(f));
        }

        public void tmg(float f) {
            this.oo = f;
            this.pcc.put(18, Float.valueOf(f));
        }

        public void vh(float f) {
            this.gm = f;
            this.pcc.put(17, Float.valueOf(f));
        }

        public void vj(float f) {
            this.vh = f;
            this.pcc.put(9, Float.valueOf(f));
        }

        public void vy(float f) {
            this.jr = f;
            this.pcc.put(12, Float.valueOf(f));
        }

        public void wh(float f) {
            this.tmg = f;
            this.pcc.put(14, Float.valueOf(f));
        }

        public pcc(int i, int i2) {
            super(i, i2);
            this.pcc = new SparseArray<>();
            this.sf = new SparseArray<>();
            if (i == -2 || i == -1 || i >= 0) {
                this.pcc.put(15, Float.valueOf(i));
            }
            if (i2 == -2 || i2 == -1 || i2 >= 0) {
                this.pcc.put(16, Float.valueOf(i2));
            }
        }
    }

    @Override // com.bytedance.adsdk.ugeno.sf.sf
    public void pcc(int i) {
        ork orkVar = this.sf;
        if (orkVar != null) {
            pcc(orkVar, i);
            requestLayout();
        }
    }

    @Override // com.bytedance.adsdk.ugeno.sf.sf
    public void pcc(View view, int i) {
        ork pcc2;
        if (view == null || (pcc2 = pcc(view)) == null) {
            return;
        }
        pcc(pcc2, i);
        view.requestLayout();
    }

    private void pcc(ork orkVar, int i) {
        if (i == -1) {
            orkVar.vj(100.0f);
        } else if (i == -2) {
            orkVar.oo();
        } else {
            orkVar.oo(i);
        }
    }

    private void pcc(ork orkVar) {
        if (orkVar.sf() != null) {
            pcc(orkVar.sf());
        } else {
            orkVar.pcc(Float.NaN, Float.NaN);
        }
    }

    private void pcc(View view, boolean z) {
        try {
            ork orkVar = this.pcc.get(view);
            if (orkVar == null) {
                return;
            }
            ork sf2 = orkVar.sf();
            int i = 0;
            while (true) {
                if (i >= sf2.pcc()) {
                    break;
                }
                if (sf2.pcc(i).equals(orkVar)) {
                    sf2.sf(i);
                    break;
                }
                i++;
            }
            orkVar.pcc((Object) null);
            this.pcc.remove(view);
            if (z) {
                this.sf.pcc(Float.NaN, Float.NaN);
            }
        } catch (Throwable unused) {
        }
    }

    private void pcc(ork orkVar, float f, float f2) {
        View view = (View) orkVar.ork();
        if (view != null && view != this) {
            if (view.getVisibility() == 8) {
                return;
            }
            int round = Math.round(orkVar.wh() + f);
            int round2 = Math.round(orkVar.qf() + f2);
            view.measure(View.MeasureSpec.makeMeasureSpec(Math.round(orkVar.kj()), 1073741824), View.MeasureSpec.makeMeasureSpec(Math.round(orkVar.vy()), 1073741824));
            view.layout(round, round2, view.getMeasuredWidth() + round, view.getMeasuredHeight() + round2);
        }
        int pcc2 = orkVar.pcc();
        for (int i = 0; i < pcc2; i++) {
            if (equals(view)) {
                pcc(orkVar.pcc(i), f, f2);
            } else if (!(view instanceof gm)) {
                pcc(orkVar.pcc(i), orkVar.wh() + f, orkVar.qf() + f2);
            }
        }
    }

    private void pcc(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        if (mode2 == 1073741824) {
            this.sf.wh(size2);
        }
        if (mode == 1073741824) {
            this.sf.oo(size);
        }
        if (mode2 == Integer.MIN_VALUE) {
            this.sf.vh(size2);
        }
        if (mode == Integer.MIN_VALUE) {
            this.sf.ork(size);
        }
        this.sf.pcc(Float.NaN, Float.NaN);
    }

    public ork pcc(View view) {
        return this.pcc.get(view);
    }

    public void pcc(com.bytedance.adsdk.ugeno.sf.gm gmVar) {
        this.gm = gmVar;
    }
}

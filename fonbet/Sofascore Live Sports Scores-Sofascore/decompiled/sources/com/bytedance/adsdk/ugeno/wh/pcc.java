package com.bytedance.adsdk.ugeno.wh;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.Scroller;
import com.bytedance.adsdk.ugeno.kj.gm;
import com.unity3d.services.UnityAdsConstants;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class pcc<T> extends FrameLayout implements gm.oo {
    private static final Interpolator atb = new Interpolator() { // from class: com.bytedance.adsdk.ugeno.wh.pcc.1
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    };
    private boolean dax;
    private int fum;
    private boolean gbb;
    protected Context gm;
    private int gpj;
    private boolean hc;
    private boolean jr;
    private com.bytedance.adsdk.ugeno.wh.gm jsj;
    private int kj;
    private int lo;
    private final Runnable lq;
    private boolean lu;
    private boolean mk;
    private boolean nac;
    private FrameLayout of;
    private int oo;
    private int ork;
    protected List<T> pcc;
    private int qf;
    private C0038pcc qy;
    protected com.bytedance.adsdk.ugeno.kj.gm sf;
    private float tmg;
    private Scroller tsz;
    private int tz;
    private String vh;
    private int vj;
    private int vy;
    private int wh;
    private final Runnable ye;
    private com.bytedance.adsdk.ugeno.wh.pcc.pcc yt;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class gm extends com.bytedance.adsdk.ugeno.kj.gm {
        public gm(Context context) {
            super(context);
        }

        private MotionEvent pcc(MotionEvent motionEvent) {
            float width = getWidth();
            float height = getHeight();
            motionEvent.setLocation((motionEvent.getY() / height) * width, (motionEvent.getX() / width) * height);
            return motionEvent;
        }

        @Override // com.bytedance.adsdk.ugeno.kj.gm, android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (!pcc.this.dax) {
                return false;
            }
            try {
                if (pcc.this.tz != 1) {
                    return super.onInterceptTouchEvent(motionEvent);
                }
                boolean onInterceptTouchEvent = super.onInterceptTouchEvent(pcc(motionEvent));
                pcc(motionEvent);
                return onInterceptTouchEvent;
            } catch (IllegalArgumentException unused) {
                return false;
            }
        }

        @Override // com.bytedance.adsdk.ugeno.kj.gm, android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            if (!pcc.this.dax) {
                return false;
            }
            try {
                return pcc.this.tz == 1 ? super.onTouchEvent(pcc(motionEvent)) : super.onTouchEvent(motionEvent);
            } catch (IllegalArgumentException unused) {
                return false;
            }
        }
    }

    public pcc(Context context) {
        super(context);
        this.pcc = new CopyOnWriteArrayList();
        this.oo = -1;
        this.vj = 2000;
        this.wh = 500;
        this.qf = 500;
        this.kj = 0;
        this.vy = -1;
        this.ork = -1;
        this.vh = "normal";
        this.tmg = 1.0f;
        this.hc = true;
        this.gbb = true;
        this.jr = true;
        this.dax = true;
        this.gpj = 0;
        this.lo = 0;
        this.fum = 0;
        this.tz = 0;
        this.mk = true;
        this.ye = new Runnable() { // from class: com.bytedance.adsdk.ugeno.wh.pcc.2
            @Override // java.lang.Runnable
            public void run() {
                int currentItem = pcc.this.sf.getCurrentItem() + 1;
                if (pcc.this.jr) {
                    pcc pccVar = pcc.this;
                    if (currentItem >= 1024) {
                        pccVar.sf.pcc(512, false);
                        return;
                    } else {
                        pccVar.sf.pcc(currentItem, true);
                        return;
                    }
                }
                com.bytedance.adsdk.ugeno.kj.sf adapter = pcc.this.sf.getAdapter();
                if (adapter != null) {
                    int pcc = adapter.pcc();
                    pcc pccVar2 = pcc.this;
                    if (currentItem >= pcc) {
                        pccVar2.sf.pcc(0, false);
                    } else {
                        pccVar2.sf.pcc(currentItem, true);
                    }
                }
            }
        };
        this.lq = new Runnable() { // from class: com.bytedance.adsdk.ugeno.wh.pcc.3
            @Override // java.lang.Runnable
            public void run() {
                if (pcc.this.gbb) {
                    pcc.this.mk = false;
                    int currentItem = pcc.this.sf.getCurrentItem() + 1;
                    if (pcc.this.jr) {
                        pcc pccVar = pcc.this;
                        if (currentItem >= 1024) {
                            pccVar.sf.pcc(512, false);
                        } else {
                            pccVar.sf.pcc(currentItem, true);
                        }
                        pcc pccVar2 = pcc.this;
                        pccVar2.postDelayed(pccVar2.lq, pcc.this.vj);
                        return;
                    }
                    com.bytedance.adsdk.ugeno.kj.sf adapter = pcc.this.sf.getAdapter();
                    if (adapter != null) {
                        int pcc = adapter.pcc();
                        pcc pccVar3 = pcc.this;
                        if (currentItem >= pcc) {
                            pccVar3.sf.pcc(0, false);
                            pcc pccVar4 = pcc.this;
                            pccVar4.postDelayed(pccVar4.lq, pcc.this.vj);
                        } else {
                            pccVar3.sf.pcc(currentItem, true);
                            pcc pccVar5 = pcc.this;
                            pccVar5.postDelayed(pccVar5.lq, pcc.this.vj);
                        }
                    }
                }
            }
        };
        this.gm = context;
        this.of = new FrameLayout(context);
        this.sf = pcc();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        this.of.addView(this.sf, layoutParams);
        addView(this.of);
    }

    private boolean qf() {
        return this.pcc.size() <= 2 && this.jr;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.gbb) {
            int action = motionEvent.getAction();
            if (action == 1 || action == 3 || action == 4) {
                if (!this.nac) {
                    vj();
                }
            } else if (action == 0) {
                wh();
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void gbb(int i) {
        pcc(this.vh, this.kj, this.vy, this.ork, true);
        if (this.qy == null) {
            this.qy = new C0038pcc();
            this.sf.pcc((gm.oo) this);
            this.sf.setAdapter(this.qy);
        }
        if (!this.jr) {
            if (i < 0 || i >= this.pcc.size()) {
                return;
            }
            this.sf.pcc(i, true);
            return;
        }
        com.bytedance.adsdk.ugeno.kj.gm gmVar = this.sf;
        if (i >= 1024) {
            gmVar.pcc(512, false);
        } else {
            gmVar.pcc(i, true);
        }
    }

    public com.bytedance.adsdk.ugeno.kj.sf getAdapter() {
        return this.sf.getAdapter();
    }

    public int getCurrentItem() {
        return this.sf.getCurrentItem();
    }

    public com.bytedance.adsdk.ugeno.kj.gm getViewPager() {
        return this.sf;
    }

    public void gm() {
        pcc(this.vh, this.kj, this.vy, this.ork, true);
        if (this.qy == null) {
            this.qy = new C0038pcc();
            this.sf.pcc((gm.oo) this);
            this.sf.setAdapter(this.qy);
        }
        int i = this.gpj;
        if (i < 0 || i >= this.pcc.size()) {
            this.gpj = 0;
        }
        boolean z = this.jr;
        int i2 = this.gpj;
        if (z) {
            i2 += 512;
        }
        this.sf.pcc(i2, true);
        if (!this.jr) {
            tmg(i2);
        }
        if (this.gbb) {
            vj();
        }
    }

    @Override // com.bytedance.adsdk.ugeno.kj.gm.oo
    public void hc(int i) {
        if (i == 1 && this.nac) {
            wh();
        }
        com.bytedance.adsdk.ugeno.wh.gm gmVar = this.jsj;
        if (gmVar != null) {
            gmVar.pcc(this.jr, i);
        }
    }

    public pcc kj(int i) {
        this.kj = i;
        pcc(this.vh, i, this.vy, this.ork, true);
        return this;
    }

    public pcc oo(boolean z) {
        this.yt.setLoop(z);
        if (this.jr != z) {
            int pcc = oo.pcc(z, this.sf.getCurrentItem(), this.pcc.size());
            this.jr = z;
            C0038pcc c0038pcc = this.qy;
            if (c0038pcc != null) {
                c0038pcc.gm();
                this.sf.setCurrentItem(pcc);
            }
        }
        return this;
    }

    public pcc ork(int i) {
        this.ork = i;
        pcc(this.vh, this.kj, this.vy, i, true);
        return this;
    }

    public void pcc(String str, int i, int i2, int i3, boolean z) {
        C0038pcc c0038pcc = this.qy;
        if (c0038pcc != null) {
            c0038pcc.gm();
        }
        this.sf.setPageMargin(i);
        if (i2 > 0 || i3 > 0) {
            int i4 = this.tz;
            com.bytedance.adsdk.ugeno.kj.gm gmVar = this.sf;
            if (i4 == 1) {
                gmVar.setPadding(0, i2 + i, 0, i3 + i);
            } else {
                gmVar.setPadding(i2 + i, 0, i3 + i, 0);
            }
            this.of.setClipChildren(false);
            this.sf.setClipChildren(false);
            this.sf.setClipToPadding(false);
        }
        if (this.tz == 1) {
            com.bytedance.adsdk.ugeno.wh.sf.oo ooVar = new com.bytedance.adsdk.ugeno.wh.sf.oo();
            ooVar.pcc(str);
            this.sf.pcc(true, (gm.vj) ooVar);
            this.sf.setOverScrollMode(2);
        } else if (TextUtils.equals(str, "linear")) {
            this.sf.pcc(false, (gm.vj) new com.bytedance.adsdk.ugeno.wh.sf.gm());
        } else if (TextUtils.equals(str, "cube")) {
            this.sf.pcc(false, (gm.vj) new com.bytedance.adsdk.ugeno.wh.sf.pcc());
        } else {
            boolean equals = TextUtils.equals(str, "fade");
            com.bytedance.adsdk.ugeno.kj.gm gmVar2 = this.sf;
            if (equals) {
                gmVar2.pcc(false, (gm.vj) new com.bytedance.adsdk.ugeno.wh.sf.sf());
            } else {
                gmVar2.pcc(false, (gm.vj) null);
            }
        }
        this.sf.setOffscreenPageLimit((int) this.tmg);
    }

    public void setOnPageChangeListener(com.bytedance.adsdk.ugeno.wh.gm gmVar) {
        this.jsj = gmVar;
    }

    public void setTwoItems(boolean z) {
        this.lu = z;
    }

    public pcc sf(float f) {
        this.yt.setIndicatorHeight((int) f);
        return this;
    }

    @Override // com.bytedance.adsdk.ugeno.kj.gm.oo
    public void tmg(int i) {
        int i2;
        if (this.jsj != null) {
            int pcc = oo.pcc(this.jr, i, this.pcc.size());
            i2 = i;
            this.jsj.pcc(this.jr, pcc, i2, pcc == 0, pcc == this.pcc.size() - 1);
        } else {
            i2 = i;
        }
        if (this.hc) {
            this.yt.pcc(i2);
        }
    }

    public abstract View vh(int i);

    public void vj() {
        int i;
        removeCallbacks(this.lq);
        int i2 = this.vj;
        if (this.mk && (i = this.oo) > 0) {
            i2 = i;
        }
        postDelayed(this.lq, i2);
    }

    public pcc<T> vy(int i) {
        this.vy = i;
        pcc(this.vh, this.kj, i, this.ork, true);
        return this;
    }

    public pcc wh(int i) {
        this.yt.setSelectedColor(i);
        return this;
    }

    public void wh() {
        removeCallbacks(this.lq);
    }

    public pcc sf() {
        this.yt.pcc();
        return this;
    }

    public pcc sf(String str) {
        this.yt.setIndicatorDirection(str);
        return this;
    }

    public pcc sf(int i) {
        this.wh = i;
        return this;
    }

    public pcc sf(boolean z) {
        this.dax = z;
        return this;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class sf extends Scroller {
        public sf(Context context, Interpolator interpolator) {
            super(context, interpolator);
        }

        @Override // android.widget.Scroller
        public void startScroll(int i, int i2, int i3, int i4, int i5) {
            super.startScroll(i, i2, i3, i4, pcc.this.qf);
        }

        @Override // android.widget.Scroller
        public void startScroll(int i, int i2, int i3, int i4) {
            super.startScroll(i, i2, i3, i4, pcc.this.qf);
        }
    }

    public pcc qf(int i) {
        this.yt.setUnSelectedColor(i);
        return this;
    }

    public pcc vj(int i) {
        if (i < 0) {
            i = this.vj;
        }
        this.oo = i;
        vj();
        return this;
    }

    public pcc vj(float f) {
        this.tmg = f;
        return this;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.bytedance.adsdk.ugeno.wh.pcc$pcc, reason: collision with other inner class name */
    public class C0038pcc extends com.bytedance.adsdk.ugeno.kj.sf {
        public C0038pcc() {
        }

        @Override // com.bytedance.adsdk.ugeno.kj.sf
        public Object pcc(ViewGroup viewGroup, int i) {
            View pcc = pcc.this.pcc(i, oo.pcc(pcc.this.jr, i, pcc.this.pcc.size()));
            viewGroup.addView(pcc);
            return pcc;
        }

        @Override // com.bytedance.adsdk.ugeno.kj.sf
        public boolean pcc(View view, Object obj) {
            return view == obj;
        }

        @Override // com.bytedance.adsdk.ugeno.kj.sf
        public int pcc() {
            if (pcc.this.jr) {
                return 1024;
            }
            return pcc.this.pcc.size();
        }

        @Override // com.bytedance.adsdk.ugeno.kj.sf
        public int pcc(Object obj) {
            return -2;
        }

        @Override // com.bytedance.adsdk.ugeno.kj.sf
        public void pcc(ViewGroup viewGroup, int i, Object obj) {
            viewGroup.removeView((View) obj);
        }

        @Override // com.bytedance.adsdk.ugeno.kj.sf
        public float pcc(int i) {
            if (pcc.this.tmg <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                return 1.0f;
            }
            return 1.0f / pcc.this.tmg;
        }
    }

    public pcc vj(boolean z) {
        this.nac = z;
        return this;
    }

    public pcc oo(float f) {
        this.yt.setIndicatorY(f);
        return this;
    }

    public pcc oo(int i) {
        this.vj = i;
        vj();
        return this;
    }

    public void oo() {
        wh();
        if (this.qy != null) {
            this.sf.sf((gm.oo) this);
            this.sf.setAdapter(null);
            this.qy = null;
            this.sf.removeAllViews();
            this.pcc.clear();
            this.yt.gm();
        }
    }

    public pcc gm(float f) {
        this.yt.setIndicatorX(f);
        return this;
    }

    public pcc gm(int i) {
        this.qf = i;
        Scroller scroller = this.tsz;
        if (scroller == null) {
            scroller = new sf(this.gm, atb);
            this.tsz = scroller;
        }
        this.sf.setScroller(scroller);
        return this;
    }

    public pcc gm(boolean z) {
        this.hc = z;
        return this;
    }

    public pcc gm(String str) {
        this.vh = str;
        pcc(str, this.kj, this.vy, this.ork, true);
        return this;
    }

    public com.bytedance.adsdk.ugeno.kj.gm pcc() {
        return new gm(getContext());
    }

    public pcc pcc(String str) {
        com.bytedance.adsdk.ugeno.wh.pcc.pcc sfVar;
        if (TextUtils.equals(str, "rectangle")) {
            sfVar = new com.bytedance.adsdk.ugeno.wh.pcc.gm(this.gm);
            this.yt = sfVar;
        } else {
            sfVar = new com.bytedance.adsdk.ugeno.wh.pcc.sf(this.gm);
            this.yt = sfVar;
        }
        addView(sfVar, new FrameLayout.LayoutParams(-2, -2));
        return this;
    }

    public pcc pcc(float f) {
        this.yt.setIndicatorWidth((int) f);
        return this;
    }

    public pcc pcc(int i) {
        this.tz = i;
        return this;
    }

    public pcc pcc(boolean z) {
        this.gbb = z;
        vj();
        return this;
    }

    public View pcc(int i, int i2) {
        if (this.pcc.size() == 0) {
            return new View(getContext());
        }
        View vh = vh(i2);
        FrameLayout frameLayout = new FrameLayout(getContext());
        if (vh instanceof ViewGroup) {
            frameLayout.setClipChildren(true);
        }
        if (qf()) {
            vh.setTag("two_items_tag");
        }
        if (vh.getParent() instanceof ViewGroup) {
            ((ViewGroup) vh.getParent()).removeView(vh);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        frameLayout.addView(vh, layoutParams);
        frameLayout.addView(new View(getContext()), new FrameLayout.LayoutParams(-1, -1));
        if (qf()) {
            frameLayout.setTag(Integer.valueOf(i));
        }
        return frameLayout;
    }

    public pcc<T> pcc(T t) {
        if (t != null) {
            this.pcc.add(t);
            if (this.hc) {
                this.yt.sf();
            }
        }
        C0038pcc c0038pcc = this.qy;
        if (c0038pcc != null) {
            c0038pcc.gm();
            this.yt.pcc(this.gpj, this.sf.getCurrentItem());
        }
        return this;
    }

    @Override // com.bytedance.adsdk.ugeno.kj.gm.oo
    public void pcc(int i, float f, int i2) {
        com.bytedance.adsdk.ugeno.wh.gm gmVar = this.jsj;
        if (gmVar != null) {
            boolean z = this.jr;
            gmVar.pcc(z, oo.pcc(z, i, this.pcc.size()), f, i2);
        }
        if (qf()) {
            pcc(i, findViewWithTag(Integer.valueOf(i)));
            if (f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                int i3 = i + 1;
                pcc(i3, findViewWithTag(Integer.valueOf(i3)));
            }
        }
    }

    private void pcc(int i, View view) {
        View findViewWithTag;
        if ((view instanceof ViewGroup) && (findViewWithTag = view.findViewWithTag("two_items_tag")) == null) {
            T t = this.pcc.get(oo.pcc(true, i, this.pcc.size()));
            if (t == null) {
                return;
            }
            if (t instanceof com.bytedance.adsdk.ugeno.sf.gm) {
                findViewWithTag = ((com.bytedance.adsdk.ugeno.sf.gm) t).vh();
            } else if (t instanceof View) {
                findViewWithTag = (View) t;
            }
            if (findViewWithTag == null) {
                return;
            }
            if (findViewWithTag.getParent() instanceof ViewGroup) {
                ((ViewGroup) findViewWithTag.getParent()).removeView(findViewWithTag);
            }
            ((ViewGroup) view).addView(findViewWithTag);
        }
    }
}

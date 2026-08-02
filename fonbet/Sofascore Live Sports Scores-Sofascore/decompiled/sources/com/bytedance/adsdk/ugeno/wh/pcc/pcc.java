package com.bytedance.adsdk.ugeno.wh.pcc;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.adsdk.ugeno.wh.oo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class pcc extends LinearLayout {
    protected int gm;
    private boolean kj;
    private List<View> oo;
    private float ork;
    protected Context pcc;
    private int qf;
    protected int sf;
    private String tmg;
    private float vh;
    private int vj;
    private int vy;
    private int wh;

    public pcc(Context context) {
        super(context);
        this.vj = -65536;
        this.wh = -16776961;
        this.qf = 5;
        this.sf = 40;
        this.gm = 20;
        this.tmg = "row";
        this.pcc = context;
        this.oo = new ArrayList();
        setOrientation(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void oo() {
        FrameLayout frameLayout = (FrameLayout) getParent();
        if (frameLayout == null) {
            return;
        }
        float width = frameLayout.getWidth();
        float height = frameLayout.getHeight();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
        float width2 = getWidth();
        layoutParams.topMargin = (int) (((int) ((height * r5) / 100.0f)) - ((getHeight() * this.vh) / 100.0f));
        layoutParams.leftMargin = (int) (((int) ((width * r0) / 100.0f)) - ((width2 * this.ork) / 100.0f));
        setLayoutParams(layoutParams);
    }

    public int getSize() {
        return this.oo.size();
    }

    public void gm() {
        this.oo.clear();
        removeAllViews();
    }

    public void pcc(int i) {
        if (this instanceof sf) {
            this.gm = this.sf;
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.sf, this.gm);
        int orientation = getOrientation();
        int i2 = this.qf;
        if (orientation == 1) {
            layoutParams.topMargin = i2;
            layoutParams.bottomMargin = i2;
        } else {
            layoutParams.leftMargin = i2;
            layoutParams.rightMargin = i2;
        }
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(this.sf, this.gm);
        int orientation2 = getOrientation();
        int i3 = this.qf;
        if (orientation2 == 1) {
            layoutParams2.topMargin = i3;
            layoutParams2.bottomMargin = i3;
        } else {
            layoutParams2.leftMargin = i3;
            layoutParams2.rightMargin = i3;
        }
        int pcc = oo.pcc(this.kj, this.vy, this.oo.size());
        int pcc2 = oo.pcc(this.kj, i, this.oo.size());
        if (this.oo.size() == 0) {
            pcc2 = 0;
        }
        if (!this.oo.isEmpty() && oo.pcc(pcc, this.oo) && oo.pcc(pcc2, this.oo)) {
            this.oo.get(pcc).setBackground(sf(this.wh));
            this.oo.get(pcc).setLayoutParams(layoutParams2);
            this.oo.get(pcc2).setBackground(sf(this.vj));
            this.oo.get(pcc2).setLayoutParams(layoutParams);
            this.vy = i;
        }
    }

    public void setIndicatorDirection(String str) {
        this.tmg = str;
        if (TextUtils.equals(str, "column")) {
            setOrientation(1);
        } else {
            setOrientation(0);
        }
    }

    public void setIndicatorHeight(int i) {
        this.gm = i;
    }

    public void setIndicatorWidth(int i) {
        this.sf = i;
    }

    public void setIndicatorX(float f) {
        this.ork = f;
    }

    public void setIndicatorY(float f) {
        this.vh = f;
    }

    public void setLoop(boolean z) {
        this.kj = z;
    }

    public void setSelectedColor(int i) {
        this.vj = i;
    }

    public void setUnSelectedColor(int i) {
        this.wh = i;
    }

    public abstract Drawable sf(int i);

    public void sf() {
        View view = new View(getContext());
        view.setClickable(false);
        if (this instanceof sf) {
            this.gm = this.sf;
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.sf, this.gm);
        int orientation = getOrientation();
        int i = this.qf;
        if (orientation == 1) {
            layoutParams.topMargin = i;
            layoutParams.bottomMargin = i;
        } else {
            layoutParams.leftMargin = i;
            layoutParams.rightMargin = i;
        }
        addView(view, layoutParams);
        view.setBackground(sf(this.wh));
        this.oo.add(view);
    }

    public void pcc(int i, int i2) {
        Iterator<View> it = this.oo.iterator();
        while (it.hasNext()) {
            it.next().setBackground(sf(this.wh));
        }
        if (i < 0 || i >= this.oo.size()) {
            i = 0;
        }
        if (this.oo.size() > 0) {
            this.oo.get(i).setBackground(sf(this.vj));
            this.vy = i2;
        }
    }

    public void pcc() {
        post(new Runnable() { // from class: com.bytedance.adsdk.ugeno.wh.pcc.pcc.1
            @Override // java.lang.Runnable
            public void run() {
                pcc.this.oo();
            }
        });
    }
}

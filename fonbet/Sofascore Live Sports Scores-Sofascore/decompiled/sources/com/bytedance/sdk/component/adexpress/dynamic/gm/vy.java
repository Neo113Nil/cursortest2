package com.bytedance.sdk.component.adexpress.dynamic.gm;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.wh.qy;
import com.ironsource.Fc;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class vy extends FrameLayout implements kj {
    private com.bytedance.sdk.component.adexpress.dynamic.oo.qf gm;
    private View.OnTouchListener kj;
    private View oo;
    private boolean ork;
    private Context pcc;
    private com.bytedance.sdk.component.adexpress.wh.nac qf;
    private com.bytedance.sdk.component.adexpress.dynamic.dynamicview.vj sf;
    private com.bytedance.sdk.component.adexpress.sf.hc tmg;
    private com.bytedance.sdk.component.adexpress.dynamic.oo.ork vh;
    private qf vj;
    private int vy;
    private String wh;

    public vy(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.vj vjVar, com.bytedance.sdk.component.adexpress.dynamic.oo.qf qfVar, com.bytedance.sdk.component.adexpress.dynamic.oo.ork orkVar, com.bytedance.sdk.component.adexpress.sf.hc hcVar) {
        super(context);
        this.pcc = context;
        this.sf = vjVar;
        this.gm = qfVar;
        this.vh = orkVar;
        this.tmg = hcVar;
        qf();
    }

    private boolean kj() {
        return (this.gm.hoh() || TextUtils.equals("9", this.wh) || TextUtils.equals("16", this.wh) || TextUtils.equals("17", this.wh) || TextUtils.equals("18", this.wh) || TextUtils.equals("20", this.wh) || TextUtils.equals("29", this.wh) || TextUtils.equals("10", this.wh)) ? false : true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0117, code lost:
    
        if (r2.equals("2") == false) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void pcc(ViewGroup viewGroup) {
        char c = 2;
        if (this.oo == null) {
            return;
        }
        String str = this.wh;
        str.getClass();
        switch (str.hashCode()) {
            case 48:
                if (str.equals("0")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 49:
                if (str.equals("1")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 50:
                break;
            case 53:
                if (str.equals(CampaignEx.CLICKMODE_ON)) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 54:
                if (str.equals("6")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 55:
                if (str.equals(Fc.e)) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 56:
                if (str.equals("8")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 57:
                if (str.equals("9")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 1567:
                if (str.equals("10")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 1568:
                if (str.equals("11")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 1569:
                if (str.equals("12")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 1570:
                if (str.equals("13")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case 1571:
                if (str.equals("14")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 1573:
                if (str.equals("16")) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case 1574:
                if (str.equals("17")) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case 1575:
                if (str.equals("18")) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case 1598:
                if (str.equals("20")) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case 1600:
                if (str.equals("22")) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case 1601:
                if (str.equals("23")) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case 1602:
                if (str.equals("24")) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case 1603:
                if (str.equals("25")) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case 1607:
                if (str.equals("29")) {
                    c = 21;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                this.kj = new com.bytedance.sdk.component.adexpress.dynamic.gm.pcc.vj(this, this.vy);
                setBackgroundColor(Color.parseColor("#80000000"));
                break;
            case 1:
            case 4:
                if (!this.gm.qcw() || TextUtils.isEmpty(this.gm.vr())) {
                    setBackgroundColor(Color.parseColor("#80000000"));
                }
                this.kj = new com.bytedance.sdk.component.adexpress.dynamic.gm.pcc.wh(this);
                break;
            case 2:
            case 5:
                setBackgroundColor(Color.parseColor("#80000000"));
                this.kj = new com.bytedance.sdk.component.adexpress.dynamic.gm.pcc.sf(this, this);
                break;
            case 3:
                if (!this.gm.qcw() || TextUtils.isEmpty(this.gm.vr())) {
                    setBackgroundColor(Color.parseColor("#80000000"));
                } else {
                    setBackgroundColor(com.bytedance.sdk.component.adexpress.dynamic.oo.qf.pcc(this.gm.vr()));
                }
                this.kj = new com.bytedance.sdk.component.adexpress.dynamic.gm.pcc.gm(this);
                this.oo.setTag(2);
                break;
            case 6:
            case '\t':
                this.sf.setClipChildren(false);
                this.sf.setClipChildren(false);
                ViewGroup viewGroup2 = (ViewGroup) this.sf.getParent();
                if (viewGroup2 != null) {
                    viewGroup2.setClipChildren(false);
                    viewGroup2.setClipToPadding(false);
                }
                this.kj = new com.bytedance.sdk.component.adexpress.dynamic.gm.pcc.wh(this);
                break;
            case 7:
            case 14:
                this.oo.setTag(2);
                break;
            case '\b':
                this.kj = new com.bytedance.sdk.component.adexpress.dynamic.gm.pcc.oo(this, this.vy, this.ork);
                break;
            case '\n':
                this.kj = new com.bytedance.sdk.component.adexpress.dynamic.gm.pcc.gm(this);
                this.oo.setTag(2);
                break;
            case 11:
            case 19:
                if (!this.wh.equals("24") || !com.bytedance.sdk.component.adexpress.oo.sf()) {
                    this.kj = new com.bytedance.sdk.component.adexpress.dynamic.gm.pcc.vj(this, this.vy);
                    break;
                } else {
                    this.sf.setClipChildren(false);
                    this.kj = new com.bytedance.sdk.component.adexpress.dynamic.gm.pcc.wh(this);
                    break;
                }
                break;
            case '\f':
                this.kj = new com.bytedance.sdk.component.adexpress.dynamic.gm.pcc.sf(this, this);
                break;
            case '\r':
                View view = this.oo;
                if (view != null && (view instanceof com.bytedance.sdk.component.adexpress.wh.lu) && ((com.bytedance.sdk.component.adexpress.wh.lu) view).getShakeLayout() != null) {
                    ((com.bytedance.sdk.component.adexpress.wh.lu) this.oo).getShakeLayout().setTag(2);
                }
                this.oo.setTag(2);
                break;
            case 15:
                View view2 = this.oo;
                if (view2 != null && (view2 instanceof qy) && ((qy) view2).getWriggleLayout() != null) {
                    ((qy) this.oo).getWriggleLayout().setTag(2);
                }
                this.oo.setTag(2);
                break;
            case 16:
                this.kj = new com.bytedance.sdk.component.adexpress.dynamic.gm.pcc.pcc(this, this.vy, viewGroup);
                break;
            case 17:
                if (!com.bytedance.sdk.component.adexpress.oo.sf()) {
                    this.kj = new com.bytedance.sdk.component.adexpress.dynamic.gm.pcc.qf(this, this.vy, viewGroup);
                    break;
                } else {
                    this.kj = new com.bytedance.sdk.component.adexpress.dynamic.gm.pcc.kj(this, this.ork);
                    break;
                }
            case 18:
                if (com.bytedance.sdk.component.adexpress.oo.sf()) {
                    this.kj = new com.bytedance.sdk.component.adexpress.dynamic.gm.pcc.wh(this);
                    break;
                }
                break;
            case 20:
                if (com.bytedance.sdk.component.adexpress.oo.sf()) {
                    this.kj = new com.bytedance.sdk.component.adexpress.dynamic.gm.pcc.kj(this, this.ork);
                    break;
                }
                break;
            case 21:
                View view3 = this.oo;
                if (view3 != null && (view3 instanceof com.bytedance.sdk.component.adexpress.wh.wh) && ((com.bytedance.sdk.component.adexpress.wh.wh) view3).getShakeView() != null) {
                    ((com.bytedance.sdk.component.adexpress.wh.wh) this.oo).getShakeView().setTag(2);
                }
                this.kj = new com.bytedance.sdk.component.adexpress.dynamic.gm.pcc.vj(this, this.vy);
                break;
        }
        View.OnTouchListener onTouchListener = this.kj;
        if (onTouchListener != null) {
            setOnTouchListener(onTouchListener);
        }
        if (kj()) {
            this.oo.setTag(2);
            setOnClickListener((View.OnClickListener) this.sf.getDynamicClickListener());
        }
    }

    private void qf() {
        setBackgroundColor(0);
        setClipChildren(false);
        setClipToPadding(false);
        this.wh = this.gm.lrr();
        this.vy = this.gm.ri();
        this.ork = this.gm.hoh();
        qf pcc = ork.pcc(this.pcc, this.sf, this.gm, this.vh, this.tmg);
        this.vj = pcc;
        if (pcc != null) {
            this.oo = pcc.gm();
            if (this.gm.iv()) {
                setBackgroundColor(Color.parseColor("#50000000"));
            }
            if (TextUtils.equals(this.wh, "6")) {
                if (!this.gm.qcw() || TextUtils.isEmpty(this.gm.vr())) {
                    this.qf = new com.bytedance.sdk.component.adexpress.wh.nac(this.pcc, Color.parseColor("#99000000"));
                } else {
                    this.qf = new com.bytedance.sdk.component.adexpress.wh.nac(this.pcc, com.bytedance.sdk.component.adexpress.dynamic.oo.qf.pcc(this.gm.vr()));
                }
                FrameLayout frameLayout = new FrameLayout(this.pcc);
                frameLayout.addView(this.qf, new FrameLayout.LayoutParams(-1, -1));
                frameLayout.setClipChildren(true);
                addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
                post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.gm.vy.1
                    @Override // java.lang.Runnable
                    public void run() {
                        vy.this.qf.sf();
                    }
                });
            }
            if (pcc(this.wh) && com.bytedance.sdk.component.adexpress.oo.sf()) {
                int parseColor = Color.parseColor("#99000000");
                if (this.gm.qcw() && !TextUtils.isEmpty(this.gm.vr())) {
                    try {
                        parseColor = com.bytedance.sdk.component.adexpress.dynamic.oo.qf.pcc(this.gm.vr());
                    } catch (Exception unused) {
                    }
                }
                View view = new View(this.pcc);
                view.setBackgroundColor(parseColor);
                addView(view, new FrameLayout.LayoutParams(-1, -1));
            }
            addView(this.vj.gm());
            pcc(this.vj.gm());
            setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void vy() {
        if (this.kj != null) {
            setOnClickListener((View.OnClickListener) this.sf.getDynamicClickListener());
            performClick();
            if (this.gm.rt()) {
                return;
            }
            setVisibility(8);
        }
    }

    public void gm() {
        qf qfVar = this.vj;
        if (qfVar != null) {
            qfVar.pcc();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        try {
            qf qfVar = this.vj;
            if (qfVar != null) {
                qfVar.sf();
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.kj instanceof com.bytedance.sdk.component.adexpress.dynamic.gm.pcc.gm) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void oo() {
        qf qfVar = this.vj;
        if (qfVar != null) {
            qfVar.sf();
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.gm.kj
    public void sf() {
        if (kj()) {
            setOnClickListener((View.OnClickListener) this.sf.getDynamicClickListener());
            performClick();
            if (this.gm.rt()) {
                return;
            }
            setVisibility(8);
        }
    }

    public void vj() {
        if (this.oo != null && TextUtils.equals(this.wh, "2")) {
            View view = this.oo;
            if (view instanceof com.bytedance.sdk.component.adexpress.wh.gm) {
                ((com.bytedance.sdk.component.adexpress.wh.gm) view).gm();
            }
        }
    }

    public void wh() {
        if (this.oo != null && TextUtils.equals(this.wh, "2")) {
            View view = this.oo;
            if (view instanceof com.bytedance.sdk.component.adexpress.wh.gm) {
                ((com.bytedance.sdk.component.adexpress.wh.gm) view).oo();
            }
        }
    }

    public vy(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.vj vjVar, com.bytedance.sdk.component.adexpress.dynamic.oo.qf qfVar) {
        super(context);
        this.pcc = context;
        this.sf = vjVar;
        this.gm = qfVar;
        qf();
    }

    private boolean pcc(String str) {
        return TextUtils.equals(str, "24") || TextUtils.equals(str, "23") || TextUtils.equals(str, "25") || TextUtils.equals(str, "22") || TextUtils.equals(str, "1");
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.gm.kj
    public void pcc() {
        if (TextUtils.equals(this.wh, "6")) {
            com.bytedance.sdk.component.adexpress.wh.nac nacVar = this.qf;
            if (nacVar != null) {
                nacVar.gm();
                postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.gm.vy.2
                    @Override // java.lang.Runnable
                    public void run() {
                        vy.this.vy();
                    }
                }, 300L);
                return;
            }
            return;
        }
        if (TextUtils.equals(this.wh, "20")) {
            postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.gm.vy.3
                @Override // java.lang.Runnable
                public void run() {
                    vy.this.vy();
                }
            }, 400L);
        } else {
            vy();
        }
    }
}

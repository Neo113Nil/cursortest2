package com.bytedance.sdk.component.adexpress.dynamic.gm;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.wh.fum;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class nac<E extends fum> implements qf<E> {
    protected com.bytedance.sdk.component.adexpress.dynamic.dynamicview.vj gm;
    protected com.bytedance.sdk.component.adexpress.dynamic.oo.qf oo;
    protected fum pcc;
    protected Context sf;
    protected int vj;

    public nac(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.vj vjVar, com.bytedance.sdk.component.adexpress.dynamic.oo.qf qfVar, int i) {
        this.vj = i;
        this.sf = context;
        this.gm = vjVar;
        this.oo = qfVar;
        oo();
    }

    public void oo() {
        this.pcc = new fum(this.sf, this.oo.lrr());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, (int) com.bytedance.sdk.component.adexpress.oo.qf.pcc(this.sf, 200.0f));
        layoutParams.gravity = 81;
        layoutParams.bottomMargin = (int) com.bytedance.sdk.component.adexpress.oo.qf.pcc(this.sf, 100 - this.vj);
        this.pcc.setLayoutParams(layoutParams);
        try {
            this.pcc.setGuideText(this.oo.erj());
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.gm.qf
    public void pcc() {
        this.pcc.pcc();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.gm.qf
    public void sf() {
        this.pcc.sf();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.gm.qf
    /* renamed from: vj, reason: merged with bridge method [inline-methods] */
    public E gm() {
        return (E) this.pcc;
    }

    public nac(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.vj vjVar, com.bytedance.sdk.component.adexpress.dynamic.oo.qf qfVar) {
        this(context, vjVar, qfVar, 0);
    }
}

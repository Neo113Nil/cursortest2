package com.bytedance.sdk.component.pcc;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class gm<P, R> extends com.bytedance.sdk.component.pcc.sf<P, R> {
    private vj gm;
    private boolean pcc = true;
    private pcc sf;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public interface pcc {
        void pcc(Object obj);

        void pcc(Throwable th);
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public interface sf {
        gm pcc();
    }

    private boolean wh() {
        if (this.pcc) {
            return true;
        }
        kj.pcc(new IllegalStateException("Jsb async call already finished: " + pcc() + ", hashcode: " + hashCode()));
        return false;
    }

    public final void gm() {
        pcc((Throwable) null);
    }

    public void oo() {
        this.pcc = false;
        this.gm = null;
    }

    public final void pcc(R r) {
        if (wh()) {
            this.sf.pcc(r);
            oo();
        }
    }

    public abstract void pcc(P p, vj vjVar) throws Exception;

    public void vj() {
        oo();
    }

    @Override // com.bytedance.sdk.component.pcc.sf
    public /* bridge */ /* synthetic */ String pcc() {
        return super.pcc();
    }

    public final void pcc(Throwable th) {
        if (wh()) {
            this.sf.pcc(th);
            oo();
        }
    }

    public void pcc(P p, vj vjVar, pcc pccVar) throws Exception {
        this.gm = vjVar;
        this.sf = pccVar;
        pcc(p, vjVar);
    }
}

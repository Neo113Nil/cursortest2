package com.bytedance.adsdk.sf.pcc.sf;

import android.view.animation.Interpolator;
import com.unity3d.services.UnityAdsConstants;
import defpackage.mz1;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class pcc<K, A> {
    protected com.bytedance.adsdk.sf.qf.sf<A> gm;
    private final gm<K> vj;
    final List<InterfaceC0027pcc> pcc = new ArrayList(1);
    private boolean oo = false;
    protected float sf = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    private A wh = null;
    private float qf = -1.0f;
    private float kj = -1.0f;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public interface gm<T> {
        float gm();

        float oo();

        boolean pcc();

        boolean pcc(float f);

        com.bytedance.adsdk.sf.qf.pcc<T> sf();

        boolean sf(float f);
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.bytedance.adsdk.sf.pcc.sf.pcc$pcc, reason: collision with other inner class name */
    public interface InterfaceC0027pcc {
        void pcc();
    }

    public pcc(List<? extends com.bytedance.adsdk.sf.qf.pcc<K>> list) {
        this.vj = pcc(list);
    }

    private float vy() {
        float f = this.qf;
        if (f != -1.0f) {
            return f;
        }
        float gm2 = this.vj.gm();
        this.qf = gm2;
        return gm2;
    }

    public com.bytedance.adsdk.sf.qf.pcc<K> gm() {
        com.bytedance.adsdk.sf.vj.pcc("BaseKeyframeAnimation#getCurrentKeyframe");
        com.bytedance.adsdk.sf.qf.pcc<K> sf2 = this.vj.sf();
        com.bytedance.adsdk.sf.vj.sf("BaseKeyframeAnimation#getCurrentKeyframe");
        return sf2;
    }

    public float kj() {
        return this.sf;
    }

    public float oo() {
        if (this.oo) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        com.bytedance.adsdk.sf.qf.pcc<K> gm2 = gm();
        return gm2.vj() ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : (this.sf - gm2.gm()) / (gm2.oo() - gm2.gm());
    }

    public abstract A pcc(com.bytedance.adsdk.sf.qf.pcc<K> pccVar, float f);

    public void pcc(float f) {
        if (this.vj.pcc()) {
            return;
        }
        if (f < vy()) {
            f = vy();
        } else if (f > wh()) {
            f = wh();
        }
        if (f == this.sf) {
            return;
        }
        this.sf = f;
        if (this.vj.pcc(f)) {
            sf();
        }
    }

    public A qf() {
        float oo2 = oo();
        if (this.gm == null && this.vj.sf(oo2)) {
            return this.wh;
        }
        com.bytedance.adsdk.sf.qf.pcc<K> gm2 = gm();
        Interpolator interpolator = gm2.oo;
        A pcc = (interpolator == null || gm2.vj == null) ? pcc(gm2, vj()) : pcc(gm2, oo2, interpolator.getInterpolation(oo2), gm2.vj.getInterpolation(oo2));
        this.wh = pcc;
        return pcc;
    }

    public void sf() {
        for (int i = 0; i < this.pcc.size(); i++) {
            this.pcc.get(i).pcc();
        }
    }

    public float vj() {
        com.bytedance.adsdk.sf.qf.pcc<K> gm2 = gm();
        return (gm2 == null || gm2.vj()) ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : gm2.gm.getInterpolation(oo());
    }

    public float wh() {
        float f = this.kj;
        if (f != -1.0f) {
            return f;
        }
        float oo2 = this.vj.oo();
        this.kj = oo2;
        return oo2;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class sf<T> implements gm<T> {
        private sf() {
        }

        @Override // com.bytedance.adsdk.sf.pcc.sf.pcc.gm
        public float gm() {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }

        @Override // com.bytedance.adsdk.sf.pcc.sf.pcc.gm
        public float oo() {
            return 1.0f;
        }

        @Override // com.bytedance.adsdk.sf.pcc.sf.pcc.gm
        public boolean pcc() {
            return true;
        }

        @Override // com.bytedance.adsdk.sf.pcc.sf.pcc.gm
        public com.bytedance.adsdk.sf.qf.pcc<T> sf() {
            throw new IllegalStateException("not implemented");
        }

        @Override // com.bytedance.adsdk.sf.pcc.sf.pcc.gm
        public boolean pcc(float f) {
            return false;
        }

        @Override // com.bytedance.adsdk.sf.pcc.sf.pcc.gm
        public boolean sf(float f) {
            throw new IllegalStateException("not implemented");
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class vj<T> implements gm<T> {
        private final com.bytedance.adsdk.sf.qf.pcc<T> pcc;
        private float sf = -1.0f;

        public vj(List<? extends com.bytedance.adsdk.sf.qf.pcc<T>> list) {
            this.pcc = list.get(0);
        }

        @Override // com.bytedance.adsdk.sf.pcc.sf.pcc.gm
        public float gm() {
            return this.pcc.gm();
        }

        @Override // com.bytedance.adsdk.sf.pcc.sf.pcc.gm
        public float oo() {
            return this.pcc.oo();
        }

        @Override // com.bytedance.adsdk.sf.pcc.sf.pcc.gm
        public boolean pcc(float f) {
            return !this.pcc.vj();
        }

        @Override // com.bytedance.adsdk.sf.pcc.sf.pcc.gm
        public boolean sf(float f) {
            if (this.sf == f) {
                return true;
            }
            this.sf = f;
            return false;
        }

        @Override // com.bytedance.adsdk.sf.pcc.sf.pcc.gm
        public boolean pcc() {
            return false;
        }

        @Override // com.bytedance.adsdk.sf.pcc.sf.pcc.gm
        public com.bytedance.adsdk.sf.qf.pcc<T> sf() {
            return this.pcc;
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class oo<T> implements gm<T> {
        private final List<? extends com.bytedance.adsdk.sf.qf.pcc<T>> pcc;
        private com.bytedance.adsdk.sf.qf.pcc<T> gm = null;
        private float oo = -1.0f;
        private com.bytedance.adsdk.sf.qf.pcc<T> sf = gm(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);

        public oo(List<? extends com.bytedance.adsdk.sf.qf.pcc<T>> list) {
            this.pcc = list;
        }

        private com.bytedance.adsdk.sf.qf.pcc<T> gm(float f) {
            com.bytedance.adsdk.sf.qf.pcc<T> pccVar = (com.bytedance.adsdk.sf.qf.pcc) mz1.g(1, this.pcc);
            if (f >= pccVar.gm()) {
                return pccVar;
            }
            int size = this.pcc.size() - 2;
            while (true) {
                List<? extends com.bytedance.adsdk.sf.qf.pcc<T>> list = this.pcc;
                if (size <= 0) {
                    return list.get(0);
                }
                com.bytedance.adsdk.sf.qf.pcc<T> pccVar2 = list.get(size);
                if (this.sf != pccVar2 && pccVar2.pcc(f)) {
                    return pccVar2;
                }
                size--;
            }
        }

        @Override // com.bytedance.adsdk.sf.pcc.sf.pcc.gm
        public float oo() {
            return ((com.bytedance.adsdk.sf.qf.pcc) mz1.g(1, this.pcc)).oo();
        }

        @Override // com.bytedance.adsdk.sf.pcc.sf.pcc.gm
        public boolean pcc(float f) {
            if (this.sf.pcc(f)) {
                return !this.sf.vj();
            }
            this.sf = gm(f);
            return true;
        }

        @Override // com.bytedance.adsdk.sf.pcc.sf.pcc.gm
        public boolean sf(float f) {
            com.bytedance.adsdk.sf.qf.pcc<T> pccVar = this.gm;
            com.bytedance.adsdk.sf.qf.pcc<T> pccVar2 = this.sf;
            if (pccVar == pccVar2 && this.oo == f) {
                return true;
            }
            this.gm = pccVar2;
            this.oo = f;
            return false;
        }

        @Override // com.bytedance.adsdk.sf.pcc.sf.pcc.gm
        public com.bytedance.adsdk.sf.qf.pcc<T> sf() {
            return this.sf;
        }

        @Override // com.bytedance.adsdk.sf.pcc.sf.pcc.gm
        public boolean pcc() {
            return false;
        }

        @Override // com.bytedance.adsdk.sf.pcc.sf.pcc.gm
        public float gm() {
            return this.pcc.get(0).gm();
        }
    }

    public void pcc() {
        this.oo = true;
    }

    public void pcc(InterfaceC0027pcc interfaceC0027pcc) {
        this.pcc.add(interfaceC0027pcc);
    }

    public A pcc(com.bytedance.adsdk.sf.qf.pcc<K> pccVar, float f, float f2, float f3) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }

    private static <T> gm<T> pcc(List<? extends com.bytedance.adsdk.sf.qf.pcc<T>> list) {
        if (list.isEmpty()) {
            return new sf();
        }
        if (list.size() == 1) {
            return new vj(list);
        }
        return new oo(list);
    }
}

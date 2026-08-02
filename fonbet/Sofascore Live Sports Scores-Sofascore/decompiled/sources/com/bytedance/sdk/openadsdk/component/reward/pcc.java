package com.bytedance.sdk.openadsdk.component.reward;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.jsj;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.core.jr.gm.pcc;
import com.bytedance.sdk.openadsdk.core.model.atb;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.core.model.qy;
import com.bytedance.sdk.openadsdk.core.model.tsz;
import com.bytedance.sdk.openadsdk.core.tz;
import com.unity3d.services.UnityAdsConstants;
import defpackage.nem;
import defpackage.nwm;
import defpackage.p03;
import defpackage.w1l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class pcc<L, A> {
    protected com.bytedance.sdk.component.kj.sf.gm oo;
    protected final Context pcc;
    protected final AtomicBoolean sf = new AtomicBoolean(false);
    protected final List<pcc<L, A>.oo> gm = w1l.n();
    private final jsj.pcc vj = new jsj.pcc() { // from class: com.bytedance.sdk.openadsdk.component.reward.pcc.6
        @Override // com.bytedance.sdk.component.utils.jsj.pcc
        public void pcc(Context context, Intent intent, boolean z, int i) {
            if (z) {
                pcc pccVar = pcc.this;
                if (pccVar.oo == null) {
                    pccVar.oo = new sf("net connect task", pccVar.gm);
                    com.bytedance.sdk.component.utils.vy.pcc().post(pcc.this.oo);
                }
            }
        }
    };

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class oo extends com.bytedance.sdk.component.kj.sf.gm {
        final com.bytedance.sdk.openadsdk.core.model.pcc gm;
        final of pcc;
        final AdSlot sf;

        public oo(of ofVar, AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.pcc pccVar) {
            super("VideoPreloadTask");
            this.pcc = ofVar;
            this.sf = adSlot;
            this.gm = pccVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            of ofVar = this.pcc;
            if (ofVar == null || ofVar.kez() == null) {
                return;
            }
            com.bytedance.sdk.openadsdk.core.jr.pcc.sf pcc = of.pcc(((p03) CacheDirFactory.getICacheDir(this.pcc.we())).u(), this.pcc);
            pcc.pcc("material_meta", this.pcc);
            pcc.pcc("ad_slot", this.sf);
            com.bytedance.sdk.openadsdk.core.jr.vj.pcc.pcc(pcc, new nwm() { // from class: com.bytedance.sdk.openadsdk.component.reward.pcc.oo.1
                @Override // defpackage.etm
                public void pcc(nem nemVar, int i) {
                    jr pcc2 = pcc.this.pcc();
                    oo ooVar = oo.this;
                    pcc2.pcc(ooVar.sf, ooVar.gm);
                }

                @Override // defpackage.etm
                public void pcc(nem nemVar, int i, String str) {
                }
            });
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class sf extends com.bytedance.sdk.component.kj.sf.gm {
        private final List<pcc<L, A>.oo> sf;

        public sf(String str, List<pcc<L, A>.oo> list) {
            super(str);
            this.sf = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            List<pcc<L, A>.oo> list = this.sf;
            if (list == null || list.isEmpty()) {
                pcc.this.oo = null;
                return;
            }
            ArrayList arrayList = new ArrayList(this.sf);
            this.sf.clear();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                try {
                    ((oo) it.next()).run();
                } catch (Exception e) {
                    com.bytedance.sdk.component.utils.lo.pcc("BVL", "continue download task error", e);
                }
            }
            pcc.this.oo = null;
        }
    }

    public pcc(Context context) {
        this.pcc = context == null ? com.bytedance.sdk.openadsdk.core.lu.pcc() : context.getApplicationContext();
        gm();
    }

    private void sf(final AdSlot adSlot, final L l) {
        final long currentTimeMillis = System.currentTimeMillis();
        com.bytedance.sdk.openadsdk.core.lu.gm().pcc(adSlot, pcc(adSlot, false), sf(), new tz() { // from class: com.bytedance.sdk.openadsdk.component.reward.pcc.2
            boolean pcc = false;

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.bytedance.sdk.openadsdk.core.tz, com.bytedance.sdk.openadsdk.core.of.pcc
            public void pcc(com.bytedance.sdk.openadsdk.core.model.pcc pccVar, com.bytedance.sdk.openadsdk.core.model.gm gmVar) {
                com.bytedance.sdk.openadsdk.core.model.pcc pccVar2;
                if (pccVar.vj() == null || pccVar.vj().isEmpty()) {
                    Object obj = l;
                    if (obj != null) {
                        pcc.this.pcc((pcc) obj, -3, com.bytedance.sdk.openadsdk.core.vy.pcc(-3));
                        gmVar.pcc(-3);
                        gmVar.gm(pcc.this.wh());
                        com.bytedance.sdk.openadsdk.core.model.gm.pcc(gmVar);
                        return;
                    }
                    return;
                }
                pcc pccVar3 = pcc.this;
                Object pcc = pccVar3.pcc(pccVar3.pcc, pccVar, adSlot);
                if (!TextUtils.isEmpty(adSlot.getBidAdm())) {
                    com.bytedance.sdk.openadsdk.tz.pcc.oo.pcc().pcc(pccVar.vj().isEmpty() ? null : pccVar.vj().get(0));
                    com.bytedance.sdk.openadsdk.dax.oo.pcc(pccVar.qf(), System.currentTimeMillis() - currentTimeMillis);
                }
                if (l == null || com.bytedance.sdk.openadsdk.core.lu.oo().tsz() != 0) {
                    pccVar2 = pccVar;
                } else {
                    pcc.this.pcc(adSlot, pccVar, (com.bytedance.sdk.openadsdk.core.model.pcc) l, pcc, this.pcc);
                    pccVar2 = pccVar;
                    pcc = pcc;
                }
                pcc.this.pcc(pccVar2, (com.bytedance.sdk.openadsdk.core.model.pcc) pcc, adSlot, false, (boolean) l);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.bytedance.sdk.openadsdk.core.tz, com.bytedance.sdk.openadsdk.core.of.pcc
            public void pcc(int i, String str) {
                Object obj = l;
                if (obj != null) {
                    pcc.this.pcc((pcc) obj, i, str);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.tz, com.bytedance.sdk.openadsdk.core.fum
            public String pcc() {
                if (!TextUtils.isEmpty(adSlot.getBidAdm())) {
                    return null;
                }
                String pcc = pcc.this.pcc().pcc(adSlot.getCodeId(), true);
                TextUtils.isEmpty(pcc);
                if (TextUtils.isEmpty(pcc)) {
                    return null;
                }
                return pcc;
            }

            @Override // com.bytedance.sdk.openadsdk.core.tz, com.bytedance.sdk.openadsdk.core.fum
            public boolean pcc(com.bytedance.sdk.openadsdk.core.model.pcc pccVar) {
                boolean pcc = pcc.this.pcc().pcc(pccVar);
                this.pcc = pcc;
                return pcc;
            }
        });
    }

    public void finalize() throws Throwable {
        super.finalize();
        if (this.oo != null) {
            try {
                com.bytedance.sdk.component.utils.vy.pcc().removeCallbacks(this.oo);
            } catch (Throwable unused) {
            }
            this.oo = null;
        }
        oo();
    }

    public void gm() {
        if (this.sf.get()) {
            return;
        }
        this.sf.set(true);
        jsj.pcc(this.vj, this.pcc);
    }

    public void oo() {
        if (this.sf.get()) {
            this.sf.set(false);
            try {
                jsj.pcc(this.vj);
            } catch (Exception unused) {
            }
        }
    }

    public abstract jr pcc();

    public abstract A pcc(Context context, com.bytedance.sdk.openadsdk.core.model.pcc pccVar, AdSlot adSlot);

    public abstract Object pcc(A a);

    public void pcc(com.bytedance.sdk.openadsdk.core.model.pcc pccVar, A a, AdSlot adSlot, boolean z, L l) {
        A a2;
        boolean z2;
        if (!z) {
            com.bytedance.sdk.openadsdk.gbb.gm.pcc().pcc(pccVar.qf());
        }
        pcc<L, A> pccVar2 = this;
        AdSlot adSlot2 = adSlot;
        pcc<L, A>.gm gmVar = new gm(pccVar2.new C0070pcc(adSlot2, pccVar, l, false), pccVar);
        pccVar2.pcc(pccVar);
        int i = 0;
        while (i < pccVar.vj().size()) {
            of ofVar = pccVar.vj().get(i);
            int bg = ofVar.bg();
            if (i == 0 && bg == 43) {
                ofVar.kez().o = 0;
            }
            if (com.bytedance.sdk.openadsdk.component.reward.gm.kj.pcc(ofVar)) {
                if (com.bytedance.sdk.openadsdk.component.reward.gm.kj.vj()) {
                    ofVar.kez().o = 0;
                } else {
                    a2 = a;
                    z2 = z;
                    if (!pccVar.vy() && bg != 43) {
                        return;
                    }
                    i++;
                    a = a2;
                    z = z2;
                }
            }
            a2 = a;
            z2 = z;
            AdSlot adSlot3 = adSlot2;
            pcc<L, A> pccVar3 = pccVar2;
            pccVar3.pcc(pccVar, ofVar, (of) a2, adSlot3, z2, (pcc<L, of>.gm) gmVar);
            pccVar2 = pccVar3;
            adSlot2 = adSlot3;
            if (!pccVar.vy()) {
            }
            i++;
            a = a2;
            z = z2;
        }
    }

    public abstract void pcc(L l, int i, String str);

    public abstract void pcc(L l, Object obj);

    public abstract int sf();

    public abstract void sf(A a);

    public void vj() {
        try {
            pcc().pcc();
        } catch (Throwable unused) {
        }
    }

    public abstract int wh();

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.bytedance.sdk.openadsdk.component.reward.pcc$pcc, reason: collision with other inner class name */
    public class C0070pcc {
        protected final L gm;
        protected final boolean oo;
        protected final AdSlot pcc;
        protected final com.bytedance.sdk.openadsdk.core.model.pcc sf;

        public C0070pcc(AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.pcc pccVar, L l, boolean z) {
            this.pcc = adSlot;
            this.sf = pccVar;
            this.gm = l;
            this.oo = z;
        }

        public void pcc(A a) {
            pcc.this.pcc(this.pcc, this.sf, (com.bytedance.sdk.openadsdk.core.model.pcc) this.gm, (L) a, this.oo);
        }

        public void pcc(int i, String str) {
            L l = this.gm;
            if (l != null) {
                pcc.this.pcc((pcc) l, i, str);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void gm(AdSlot adSlot) {
        pcc().pcc(adSlot.getCodeId());
    }

    private void sf(final AdSlot adSlot) {
        com.bytedance.sdk.openadsdk.core.lu.gm().pcc(adSlot, pcc(adSlot, true), sf(), new tz() { // from class: com.bytedance.sdk.openadsdk.component.reward.pcc.1
            boolean pcc = false;

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.bytedance.sdk.openadsdk.core.tz, com.bytedance.sdk.openadsdk.core.of.pcc
            public void pcc(com.bytedance.sdk.openadsdk.core.model.pcc pccVar, com.bytedance.sdk.openadsdk.core.model.gm gmVar) {
                if (this.pcc || pccVar.vj() == null || pccVar.vj().isEmpty()) {
                    return;
                }
                pcc pccVar2 = pcc.this;
                pcc.this.pcc(pccVar, (com.bytedance.sdk.openadsdk.core.model.pcc) pccVar2.pcc(pccVar2.pcc, pccVar, adSlot), adSlot, true, (boolean) null);
            }

            @Override // com.bytedance.sdk.openadsdk.core.tz, com.bytedance.sdk.openadsdk.core.fum
            public String pcc() {
                return pcc.this.pcc().pcc(adSlot.getCodeId(), false);
            }

            @Override // com.bytedance.sdk.openadsdk.core.tz, com.bytedance.sdk.openadsdk.core.fum
            public boolean pcc(com.bytedance.sdk.openadsdk.core.model.pcc pccVar) {
                boolean pcc = pcc.this.pcc().pcc(pccVar);
                this.pcc = pcc;
                return pcc;
            }

            @Override // com.bytedance.sdk.openadsdk.core.tz, com.bytedance.sdk.openadsdk.core.of.pcc
            public void pcc(int i, String str) {
            }
        });
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class gm {
        protected final AtomicInteger gm;
        protected final com.bytedance.sdk.openadsdk.core.model.pcc oo;
        protected final pcc<L, A>.C0070pcc pcc;
        protected final AtomicBoolean sf;

        private gm(pcc<L, A>.C0070pcc c0070pcc, com.bytedance.sdk.openadsdk.core.model.pcc pccVar) {
            this.sf = new AtomicBoolean(false);
            this.pcc = c0070pcc;
            this.oo = pccVar;
            this.gm = new AtomicInteger(pcc());
        }

        private int pcc() {
            if (!this.oo.wh()) {
                return 0;
            }
            int i = 0;
            for (int i2 = 0; i2 < this.oo.vj().size(); i2++) {
                of ofVar = this.oo.vj().get(i2);
                if (ofVar != null && !atb.gm(ofVar) && ofVar.kez() != null) {
                    i++;
                }
            }
            return i;
        }

        public void pcc(int i, String str) {
            if (this.gm.decrementAndGet() > 0 || !this.sf.compareAndSet(false, true)) {
                return;
            }
            this.pcc.pcc(i, str);
            com.bytedance.sdk.openadsdk.dax.oo.pcc("choose_ad_load_error", false, new com.bytedance.sdk.openadsdk.dax.sf() { // from class: com.bytedance.sdk.openadsdk.component.reward.pcc.gm.1
                @Override // com.bytedance.sdk.openadsdk.dax.sf
                @Nullable
                public com.bytedance.sdk.openadsdk.dax.pcc.gm pcc() throws Exception {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("req_id", gm.this.oo.gm());
                    return com.bytedance.sdk.openadsdk.dax.pcc.oo.sf().pcc("choose_ad_load_error").sf(jSONObject.toString());
                }
            });
        }

        public void pcc(A a) {
            this.gm.decrementAndGet();
            if (this.pcc == null || !this.sf.compareAndSet(false, true)) {
                return;
            }
            this.pcc.pcc(a);
        }
    }

    public void pcc(AdSlot adSlot) {
        if (adSlot == null || TextUtils.isEmpty(adSlot.getCodeId()) || !TextUtils.isEmpty(adSlot.getBidAdm())) {
            return;
        }
        sf(adSlot);
    }

    public void pcc(AdSlot adSlot, L l) {
        Objects.toString(adSlot);
        Objects.toString(l);
        sf(adSlot, l);
    }

    public void pcc(com.bytedance.sdk.openadsdk.core.model.pcc pccVar) {
        qy vh = pccVar.vh();
        int i = pccVar.vy() ? 10 : 1;
        if (vh != null) {
            i = vh.dax();
        }
        for (final int i2 = 0; i2 < pccVar.vj().size() && i2 < i; i2++) {
            com.bytedance.sdk.openadsdk.core.jr.gm.pcc.pcc().pcc(pccVar.vj().get(i2), new pcc.InterfaceC0085pcc() { // from class: com.bytedance.sdk.openadsdk.component.reward.pcc.3
                @Override // com.bytedance.sdk.openadsdk.core.jr.gm.pcc.InterfaceC0085pcc
                public void pcc(boolean z) {
                    com.bytedance.sdk.component.utils.lo.pcc("BVL", "onCachedResponse: i=" + i2 + ", isSuccess=" + z);
                }
            });
        }
    }

    private boolean pcc(boolean z, of ofVar, AdSlot adSlot) {
        if (z) {
            return !atb.gm(ofVar) && of.vj(ofVar) && com.bytedance.sdk.openadsdk.core.lu.oo().tsz(adSlot.getCodeId()).oo == 1 && !com.bytedance.sdk.component.utils.lu.oo(this.pcc);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean pcc(pcc<L, A>.gm gmVar) {
        return gmVar != null && com.bytedance.sdk.openadsdk.core.lu.oo().tsz() == 1;
    }

    private void pcc(of ofVar, final AdSlot adSlot, final com.bytedance.sdk.openadsdk.core.model.pcc pccVar, final A a, final boolean z, final pcc<L, A>.gm gmVar) {
        com.bytedance.sdk.openadsdk.core.jr.pcc.sf pcc = of.pcc(((p03) CacheDirFactory.getICacheDir(ofVar.we())).u(), ofVar);
        pcc.pcc("material_meta", ofVar);
        pcc.pcc("ad_slot", adSlot);
        com.bytedance.sdk.openadsdk.core.jr.vj.pcc.pcc(pcc, new nwm() { // from class: com.bytedance.sdk.openadsdk.component.reward.pcc.4
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.etm
            public void pcc(nem nemVar, int i) {
                pcc.this.sf((pcc) a);
                boolean z2 = z;
                pcc pccVar2 = pcc.this;
                if (z2) {
                    pccVar2.pcc().pcc(adSlot, pccVar);
                } else if (pccVar2.pcc(gmVar)) {
                    gmVar.pcc(a);
                }
            }

            @Override // defpackage.etm
            public void pcc(nem nemVar, int i, String str) {
                if (pcc.this.pcc(gmVar)) {
                    gmVar.pcc(i, str);
                }
            }
        });
    }

    public void pcc(com.bytedance.sdk.openadsdk.core.model.pcc pccVar, of ofVar, A a, AdSlot adSlot, boolean z, pcc<L, A>.gm gmVar) {
        A a2;
        if (pcc(z, ofVar, adSlot)) {
            pcc((oo) new oo(ofVar, adSlot, pccVar));
            return;
        }
        boolean pcc = pcc((gm) gmVar);
        if (atb.gm(ofVar)) {
            a2 = a;
            if (z) {
                pcc().pcc(adSlot, pccVar);
            }
        } else if (!of.vj(ofVar)) {
            a2 = a;
            if (z) {
                pcc().pcc(adSlot, pccVar);
            }
        } else {
            if (ofVar.kez() == null) {
                return;
            }
            a2 = a;
            pcc(ofVar, adSlot, pccVar, (com.bytedance.sdk.openadsdk.core.model.pcc) a2, z, (pcc<L, com.bytedance.sdk.openadsdk.core.model.pcc>.gm) gmVar);
            pcc = false;
        }
        if (pcc) {
            gmVar.pcc(a2);
        }
    }

    public void pcc(final AdSlot adSlot, final com.bytedance.sdk.openadsdk.core.model.pcc pccVar, L l, A a, final boolean z) {
        com.bytedance.sdk.openadsdk.core.jr.sf().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.pcc.5
            @Override // java.lang.Runnable
            public void run() {
                boolean z2 = z;
                pcc pccVar2 = pcc.this;
                if (z2) {
                    pccVar2.gm(adSlot);
                } else {
                    pccVar2.pcc().pcc(adSlot, pccVar);
                    pcc.this.gm(adSlot);
                }
            }
        });
        if (l != null) {
            pcc((pcc<L, A>) l, pcc((pcc<L, A>) a));
        }
    }

    public void pcc(pcc<L, A>.oo ooVar) {
        if (ooVar == null) {
            return;
        }
        if (this.gm.size() > 0) {
            this.gm.remove(0);
        }
        this.gm.add(ooVar);
    }

    public tsz pcc(AdSlot adSlot, boolean z) {
        tsz tszVar = new tsz();
        if (adSlot != null && (com.bytedance.sdk.openadsdk.core.lu.oo().hc(adSlot.getCodeId()) || adSlot.getExpressViewAcceptedWidth() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || adSlot.isExpressAd())) {
            tszVar.vy = 2;
        }
        if (sf() == 7) {
            tszVar.sf = z ? 2 : 1;
            return tszVar;
        }
        tszVar.gm = z ? 2 : 1;
        return tszVar;
    }

    public void pcc(String str, of ofVar) {
        pcc().pcc(str, ofVar);
    }
}

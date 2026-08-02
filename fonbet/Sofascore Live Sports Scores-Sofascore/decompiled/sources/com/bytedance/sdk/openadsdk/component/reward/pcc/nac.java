package com.bytedance.sdk.openadsdk.component.reward.pcc;

import android.app.Activity;
import android.os.Message;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.utils.lo;
import com.bytedance.sdk.component.utils.tsz;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.core.jr.oo.pcc;
import com.bytedance.sdk.openadsdk.core.model.atb;
import com.bytedance.sdk.openadsdk.core.model.fum;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.oo.vj.sf.jr;
import com.bytedance.sdk.openadsdk.utils.kun;
import com.unity3d.services.UnityAdsConstants;
import defpackage.bf3;
import defpackage.fem;
import defpackage.oem;
import defpackage.otm;
import defpackage.p03;
import defpackage.stm;
import defpackage.swm;
import java.io.File;
import java.util.HashSet;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class nac {
    private pcc.InterfaceC0088pcc atb;
    private boolean gbb;
    boolean gm;
    private long gpj;
    private boolean hc;
    private boolean jr;
    private final of kj;
    private String lo;
    private long lu;
    private final sf of;
    final boolean oo;
    private final String ork;
    private final Activity qf;
    private long tmg;
    private boolean tz;
    private long vh;
    private FrameLayout vy;
    oem wh;
    private com.bytedance.sdk.openadsdk.oo.qf ye;
    private boolean yt;
    protected boolean pcc = false;
    boolean sf = false;
    protected boolean vj = false;
    private long dax = -1;
    private int nac = -1;
    private boolean qy = false;
    private int jsj = 0;
    private float tsz = 1.0f;
    private boolean mk = false;
    private volatile boolean lq = false;
    private HashSet<String> fum = new HashSet<>();

    public nac(sf sfVar) {
        this.of = sfVar;
        this.qf = sfVar.rnn;
        this.kj = sfVar.sf;
        this.oo = sfVar.oo;
        this.ork = sfVar.vj;
    }

    private void fmh() {
        oem oemVar = this.wh;
        if (oemVar == null || oemVar.vh() == null) {
            return;
        }
        this.vh = this.wh.wh();
        if (this.wh.vh().gm() || !this.wh.vh().sf()) {
            this.wh.sf();
            this.wh.oo();
            this.pcc = true;
        }
    }

    private void sf(long j, long j2) {
        int abs = (int) Math.abs(this.nac - j);
        int i = this.nac;
        if (i < 0 || abs > 500 || i > j2 || abs >= 500 || this.fum.contains(this.lo)) {
            return;
        }
        if (this.nac > j) {
            com.bytedance.sdk.openadsdk.core.jr.gm().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.pcc.nac.1
                @Override // java.lang.Runnable
                public void run() {
                    nac.this.nn();
                    nac.this.of.yt.pcc(nac.this.nac, nac.this.lo);
                }
            }, abs);
        } else {
            nn();
            this.of.yt.pcc(this.nac, this.lo);
        }
        this.fum.add(this.lo);
    }

    public boolean atb() {
        return this.wh != null;
    }

    public void dax() {
        try {
            if (wh()) {
                this.wh.sf();
            }
        } catch (Throwable th) {
            lo.gm(bf3.o(new StringBuilder("RewardFullVideoPlayerManager onPause throw Exception :"), th), new Object[0]);
        }
    }

    public void fum() {
        oem oemVar = this.wh;
        if (oemVar != null) {
            oemVar.gm();
        }
    }

    public long gbb() {
        return this.tmg;
    }

    public void gpj() {
        oem oemVar = this.wh;
        if (oemVar == null) {
            return;
        }
        oemVar.oo();
        this.wh = null;
    }

    public long hc() {
        oem oemVar = this.wh;
        return oemVar != null ? oemVar.wh() : this.vh;
    }

    public boolean hpk() {
        return this.hc;
    }

    public void iv() {
        oem oemVar = this.wh;
        if (oemVar instanceof com.bytedance.sdk.openadsdk.core.jr.oo.pcc) {
            ((com.bytedance.sdk.openadsdk.core.jr.oo.pcc) oemVar).kun();
        }
    }

    public long jr() {
        return this.vh;
    }

    public long jsj() {
        oem oemVar = this.wh;
        if (oemVar == null) {
            return 0L;
        }
        return this.wh.qf() + oemVar.vy();
    }

    public otm kj() {
        oem oemVar = this.wh;
        if (oemVar != null) {
            return oemVar instanceof com.bytedance.sdk.openadsdk.component.reward.oo ? ((com.bytedance.sdk.openadsdk.component.reward.oo) oemVar).nac() : oemVar.tmg();
        }
        return null;
    }

    public void kun() {
        oem oemVar = this.wh;
        if (oemVar instanceof com.bytedance.sdk.openadsdk.core.jr.oo.pcc) {
            ((com.bytedance.sdk.openadsdk.core.jr.oo.pcc) oemVar).mu();
        }
    }

    public void lo() {
        oem oemVar = this.wh;
        if (oemVar != null) {
            oemVar.vj();
        }
    }

    public boolean lq() {
        return this.lq;
    }

    public void lrr() {
        oem oemVar = this.wh;
        if (oemVar instanceof com.bytedance.sdk.openadsdk.core.jr.oo.pcc) {
            ((com.bytedance.sdk.openadsdk.core.jr.oo.pcc) oemVar).tsx();
        }
    }

    public stm lu() {
        oem oemVar = this.wh;
        if (oemVar != null) {
            return oemVar.vh();
        }
        return null;
    }

    public boolean mk() {
        oem oemVar = this.wh;
        if (oemVar != null) {
            if (oemVar.vh() != null) {
                stm vh = this.wh.vh();
                if (vh.qf() || vh.kj()) {
                    oem oemVar2 = this.wh;
                    if (oemVar2 instanceof com.bytedance.sdk.openadsdk.core.jr.oo.pcc) {
                        ((com.bytedance.sdk.openadsdk.core.jr.oo.pcc) oemVar2).nn();
                    }
                    return true;
                }
            } else if (tmg()) {
                pcc(false);
                oem oemVar3 = this.wh;
                if (oemVar3 instanceof com.bytedance.sdk.openadsdk.core.jr.oo.pcc) {
                    ((com.bytedance.sdk.openadsdk.core.jr.oo.pcc) oemVar3).nn();
                }
                return true;
            }
        }
        return false;
    }

    public void mu() {
        this.qy = false;
        gpj();
    }

    public long nac() {
        oem oemVar = this.wh;
        if (oemVar != null) {
            return oemVar.qf();
        }
        return 0L;
    }

    public void nn() {
        try {
            if (wh()) {
                this.vj = true;
                tz();
            }
        } catch (Exception e) {
            lo.gm("TTAD.RFVideoPlayerMag", "onPause throw Exception :" + e.getMessage());
        }
    }

    public long of() {
        oem oemVar = this.wh;
        if (oemVar != null) {
            return oemVar.vy();
        }
        return 0L;
    }

    public void oo(boolean z) {
        this.yt = z;
        if (this.wh instanceof com.bytedance.sdk.openadsdk.core.jr.oo.pcc) {
            of ofVar = this.kj;
            if (z) {
                ((com.bytedance.sdk.openadsdk.core.jr.oo.pcc) this.wh).sf(ofVar.kez().r);
            } else {
                swm kez = ofVar.kez();
                kez.getClass();
                kez.r = Math.min(4, Math.max(1, 1));
                ((com.bytedance.sdk.openadsdk.core.jr.oo.pcc) this.wh).sf(1);
            }
        }
    }

    public boolean ork() {
        oem oemVar = this.wh;
        return oemVar != null && oemVar.gbb();
    }

    public boolean pcc(JSONObject jSONObject) {
        int i;
        if (this.wh == null || jSONObject == null || !((i = this.jsj) == 1 || i == 2)) {
            this.qy = false;
            return false;
        }
        int optInt = jSONObject.optInt("switch", 0);
        float optDouble = (float) jSONObject.optDouble("speed", 0.0d);
        this.tsz = optDouble;
        if (optDouble <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && this.of.sf.uk() != null) {
            this.tsz = this.of.sf.uk().pcc();
        }
        if (optInt == 0) {
            this.tsz = 1.0f;
            if (this.qy) {
                long currentTimeMillis = (System.currentTimeMillis() - this.gpj) + this.lu;
                this.lu = currentTimeMillis;
                oem oemVar = this.wh;
                if (oemVar != null) {
                    oemVar.pcc(currentTimeMillis);
                }
                com.bytedance.sdk.openadsdk.core.jr.oo.sf sfVar = this.of.tsx;
                if (sfVar != null) {
                    sfVar.oo(false);
                }
            }
        } else if (optInt == 1 && !this.qy) {
            this.gpj = System.currentTimeMillis();
            com.bytedance.sdk.openadsdk.core.jr.oo.sf sfVar2 = this.of.tsx;
            if (sfVar2 != null) {
                sfVar2.oo(true);
            }
        }
        this.qy = optInt == 1;
        if (this.jsj == 1) {
            return true;
        }
        oem oemVar2 = this.wh;
        if (oemVar2 == null) {
            return false;
        }
        return oemVar2.pcc(this.tsz);
    }

    public boolean pq() {
        return this.gm;
    }

    public boolean qf() {
        oem oemVar = this.wh;
        return oemVar != null && oemVar.hc();
    }

    public int qy() {
        oem oemVar = this.wh;
        if (oemVar != null) {
            return oemVar.kj();
        }
        return 0;
    }

    public void ri() {
        oem oemVar = this.wh;
        if (oemVar == null || oemVar.vh() == null) {
            return;
        }
        this.vh = this.wh.wh();
        lo();
        pcc(true);
        this.hc = true;
    }

    public View rj() {
        oem oemVar = this.wh;
        if (oemVar instanceof com.bytedance.sdk.openadsdk.core.jr.oo.pcc) {
            return (View) ((com.bytedance.sdk.openadsdk.core.jr.oo.pcc) oemVar).rnn();
        }
        return null;
    }

    public boolean rnn() {
        oem oemVar = this.wh;
        if (oemVar == null || oemVar.vh() == null) {
            return false;
        }
        return this.wh.vh().pcc();
    }

    public boolean tmg() {
        return this.pcc;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public double tsx() {
        double d;
        long oo;
        com.bytedance.sdk.openadsdk.component.reward.tmg tmgVar;
        fum yt = this.kj.yt();
        if (com.bytedance.sdk.openadsdk.core.model.lo.oo(this.kj) && yt != null) {
            oo = yt.sf();
        } else {
            if (!com.bytedance.sdk.openadsdk.core.model.lo.kj(this.kj) || yt == null) {
                swm kez = this.kj.kez();
                d = kez != null ? kez.d * kez.r : 0.0d;
                tmgVar = this.of.ra;
                if (tmgVar != null) {
                    tmgVar.pcc((long) d);
                }
                return d;
            }
            oo = yt.oo();
        }
        d = oo;
        tmgVar = this.of.ra;
        if (tmgVar != null) {
        }
        return d;
    }

    public long tsz() {
        oem oemVar = this.wh;
        if (oemVar != null) {
            return oemVar.vy();
        }
        return 0L;
    }

    public void tz() {
        oem oemVar = this.wh;
        if (oemVar != null) {
            oemVar.sf();
        }
    }

    public void vh() {
        this.lq = false;
        tsz tszVar = this.of.rj;
        if (tszVar != null) {
            tszVar.removeMessages(300);
        }
    }

    public void vj(boolean z) {
        this.jr = z;
        oem oemVar = this.wh;
        if (oemVar instanceof com.bytedance.sdk.openadsdk.core.jr.oo.pcc) {
            ((com.bytedance.sdk.openadsdk.core.jr.oo.pcc) oemVar).wh(z);
        }
    }

    public boolean vy() {
        oem oemVar = this.wh;
        return (oemVar == null || oemVar.vh() == null || !this.wh.vh().qf()) ? false : true;
    }

    public boolean wh() {
        oem oemVar = this.wh;
        return (oemVar == null || oemVar.vh() == null || !this.wh.vh().wh()) ? false : true;
    }

    public void xb() {
        oem oemVar = this.wh;
        if (oemVar != null) {
            oemVar.pcc();
        }
    }

    public boolean ye() {
        oem oemVar = this.wh;
        return oemVar != null && oemVar.vh() == null;
    }

    public int yt() {
        oem oemVar = this.wh;
        if (oemVar != null) {
            return oemVar.ork();
        }
        return 0;
    }

    public void zti() {
        int i = this.jsj;
        if (i == 1 || i == 2) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("switch", 0);
                pcc(jSONObject);
            } catch (Throwable th) {
                lo.pcc("TTAD.RFVideoPlayerMag", "onStopPlaySpeed: ", th);
            }
        }
    }

    public boolean gm() {
        return this.qy;
    }

    public void gm(boolean z) {
        this.gm = z;
    }

    public com.bytedance.sdk.openadsdk.oo.qf vj() {
        return this.ye;
    }

    public boolean oo() {
        int i;
        boolean z = this.mk;
        boolean z2 = this.qy;
        return z ? z2 && this.jsj == 1 : z2 && ((i = this.jsj) == 2 || i == 1);
    }

    public long sf() {
        return this.lu;
    }

    public void sf(long j) {
        this.vh = j;
    }

    public void sf(boolean z) {
        oem oemVar = this.wh;
        if (oemVar != null) {
            oemVar.sf();
            this.gbb = z;
        }
    }

    public void sf(com.bytedance.sdk.openadsdk.core.jr.oo.sf sfVar) {
        if (!mk() || sfVar == null) {
            return;
        }
        sfVar.pcc(jr(), true);
    }

    public long pcc() {
        return this.dax;
    }

    public void pcc(long j) {
        this.dax = j;
    }

    public void pcc(FrameLayout frameLayout, com.bytedance.sdk.openadsdk.oo.qf qfVar) {
        if (this.tz) {
            return;
        }
        this.tz = true;
        this.vy = frameLayout;
        if (this.kj.uk() != null) {
            this.jsj = this.kj.uk().sf();
            this.tsz = this.kj.uk().pcc();
        }
        this.ye = qfVar;
        if (of.vj(this.kj)) {
            this.mk = true;
            this.wh = new com.bytedance.sdk.openadsdk.core.jr.oo.pcc(this.qf, this.vy, this.kj, qfVar);
            oo(this.yt);
            pcc.InterfaceC0088pcc interfaceC0088pcc = this.atb;
            if (interfaceC0088pcc != null) {
                ((com.bytedance.sdk.openadsdk.core.jr.oo.pcc) this.wh).pcc(interfaceC0088pcc);
            }
            ((com.bytedance.sdk.openadsdk.core.jr.oo.pcc) this.wh).wh(this.jr);
            return;
        }
        this.mk = false;
        com.bytedance.sdk.openadsdk.component.reward.oo ooVar = new com.bytedance.sdk.openadsdk.component.reward.oo(this.kj, qfVar);
        this.wh = ooVar;
        pcc.InterfaceC0088pcc interfaceC0088pcc2 = this.atb;
        if (interfaceC0088pcc2 != null) {
            ooVar.pcc(interfaceC0088pcc2);
        }
    }

    public void pcc(com.bytedance.sdk.openadsdk.oo.qf qfVar) {
        this.ye = qfVar;
    }

    public void pcc(long j, long j2) {
        this.tmg = j;
        if (this.lq && (rnn() || wh() || j > 0)) {
            vh();
        }
        sf(j, j2);
    }

    public void pcc(int i, String str) {
        this.nac = i;
        this.lo = str;
    }

    public void pcc(boolean z) {
        this.pcc = z;
    }

    public void pcc(int i, int i2) {
        if (this.wh != null) {
            jr.pcc pccVar = new jr.pcc();
            pccVar.gm(nac());
            pccVar.oo(jsj());
            pccVar.sf(hc());
            pccVar.pcc(i);
            pccVar.sf(i2);
            com.bytedance.sdk.openadsdk.oo.vj.pcc.pcc.oo(this.wh.tmg(), pccVar);
        }
    }

    public void pcc(fem femVar) {
        oem oemVar = this.wh;
        if (oemVar != null) {
            oemVar.pcc(femVar);
        }
    }

    public void pcc(boolean z, String str) {
        oem oemVar = this.wh;
        if (oemVar != null) {
            oemVar.pcc(z, str);
        }
    }

    public void pcc(String str, boolean z) {
        if (this.wh != null) {
            long hc = hc();
            if (this.kj.gd()) {
                hc = this.of.wh();
            }
            long j = hc;
            JSONObject pcc = kun.pcc(this.kj, this.wh.qf(), this.wh.vh());
            try {
                pcc.put("auto_click", z);
                if (!z) {
                    sf sfVar = this.of;
                    com.bytedance.sdk.openadsdk.oo.gm.pcc(pcc, sfVar.oo ? sfVar.sf.quq() : sfVar.sf.bm(), (int) j);
                }
            } catch (Exception unused) {
            }
            com.bytedance.sdk.openadsdk.oo.gm.pcc(this.kj, this.ork, str, j, yt(), pcc, this.ye);
            jsj();
            yt();
        }
        lrr();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean pcc(long j, boolean z, Map<String, Object> map, com.bytedance.sdk.openadsdk.component.reward.sf.sf sfVar) {
        boolean z2;
        boolean atb = atb();
        sf sfVar2 = this.of;
        boolean z3 = false;
        if (!atb) {
            com.bytedance.sdk.openadsdk.oo.ork.pcc(sfVar2.sf, "show_ad_fail", sfVar2.vj, "video_controller_not_ready");
            return false;
        }
        if (com.bytedance.sdk.openadsdk.core.model.lo.oo(sfVar2.sf) || com.bytedance.sdk.openadsdk.core.model.lo.kj(this.of.sf)) {
            return true;
        }
        if (!z || !ye()) {
            pcc(sfVar);
        }
        try {
            z2 = pcc(j, this.of.xb);
        } catch (Exception unused) {
        }
        try {
            this.hc = false;
        } catch (Exception unused2) {
            z3 = z2;
            z2 = z3;
            if (!z2) {
            }
            if (!z2) {
            }
            return z2;
        }
        if (!z2 && !z) {
            this.of.jsj.pcc(map);
        } else if (!z2) {
            sf sfVar3 = this.of;
            com.bytedance.sdk.openadsdk.oo.ork.pcc(sfVar3.sf, "show_ad_fail", sfVar3.vj, "video_play_fail");
        }
        return z2;
    }

    public void pcc(com.bytedance.sdk.openadsdk.component.reward.sf.sf sfVar) {
        if (this.of.vy.get()) {
            return;
        }
        sf sfVar2 = this.of;
        if (sfVar2.ri && !atb.gm(sfVar2.sf)) {
            boolean vj = of.vj(this.of.sf);
            boolean oo = this.of.yt.oo();
            int gbb = com.bytedance.sdk.openadsdk.core.lu.oo().gbb(String.valueOf(this.of.wh));
            if ((!vj && gbb == 1 && oo) || com.bytedance.sdk.openadsdk.core.model.lo.oo(this.of.sf) || com.bytedance.sdk.openadsdk.core.model.lo.kj(this.of.sf) || this.vj || !sfVar.vj()) {
                return;
            }
            this.of.fum.vh();
            Message obtain = Message.obtain();
            obtain.what = 300;
            this.of.rj.sendMessageDelayed(obtain, 5000L);
            this.lq = true;
        }
    }

    private boolean pcc(long j, boolean z) {
        if (this.wh == null || this.kj.kez() == null) {
            return false;
        }
        String u = ((p03) CacheDirFactory.getICacheDir(this.kj.we())).u();
        File file = new File(u, this.kj.kez().a());
        if (file.exists() && file.length() > 0) {
            this.sf = true;
        }
        com.bytedance.sdk.openadsdk.core.jr.pcc.sf pcc = of.pcc(u, this.kj);
        pcc.sf(this.kj.esn());
        pcc.sf(this.vy.getWidth());
        pcc.gm(this.vy.getHeight());
        pcc.gm(this.kj.hl());
        pcc.pcc(j);
        pcc.pcc(z);
        return this.wh.pcc(pcc);
    }

    public void pcc(com.bytedance.sdk.openadsdk.core.jr.oo.sf sfVar) {
        try {
            this.vj = false;
            if (tmg()) {
                fmh();
                sf(sfVar);
            } else if (vy()) {
                fum();
            }
        } catch (Throwable th) {
            lo.gm("TTAD.RFVideoPlayerMag", "onContinue throw Exception :" + th.getMessage());
        }
    }

    public void pcc(boolean z, com.bytedance.sdk.openadsdk.core.jr.oo.sf sfVar, boolean z2) {
        if (this.gbb || !(!z2 || z || this.vj)) {
            if (vy()) {
                fum();
            } else {
                fmh();
                sf(sfVar);
            }
            this.gbb = false;
        }
    }

    public void pcc(pcc.InterfaceC0088pcc interfaceC0088pcc) {
        this.atb = interfaceC0088pcc;
    }
}

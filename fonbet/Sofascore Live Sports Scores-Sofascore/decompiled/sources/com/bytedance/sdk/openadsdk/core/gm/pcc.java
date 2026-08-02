package com.bytedance.sdk.openadsdk.core.gm;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.component.reward.gm.kj;
import com.bytedance.sdk.openadsdk.core.gm.gm;
import com.bytedance.sdk.openadsdk.core.gm.sf;
import com.bytedance.sdk.openadsdk.core.lu;
import com.bytedance.sdk.openadsdk.core.model.atb;
import com.bytedance.sdk.openadsdk.core.model.dax;
import com.bytedance.sdk.openadsdk.core.model.lo;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.core.model.tmg;
import com.bytedance.sdk.openadsdk.core.ork.fum;
import com.bytedance.sdk.openadsdk.core.ork.vy;
import com.bytedance.sdk.openadsdk.core.rnn;
import com.bytedance.sdk.openadsdk.utils.kun;
import com.bytedance.sdk.openadsdk.utils.nac;
import com.bytedance.sdk.openadsdk.utils.rj;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class pcc extends sf {
    private boolean gm;
    private boolean mu;
    private int nn;
    private boolean pcc;
    private WeakReference<InterfaceC0074pcc> pq;
    private boolean sf;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.bytedance.sdk.openadsdk.core.gm.pcc$pcc, reason: collision with other inner class name */
    public interface InterfaceC0074pcc {
        long getVideoProgress();
    }

    public pcc(@NonNull Context context, @NonNull of ofVar, @NonNull String str, int i) {
        super(context, ofVar, str, i);
        this.pcc = true;
        this.sf = false;
        this.gm = false;
        this.mu = false;
    }

    private boolean kj() {
        return this instanceof vy;
    }

    private boolean oo(View view) {
        if (view == null) {
            return false;
        }
        if ((view instanceof com.bytedance.sdk.openadsdk.core.jr.sf.wh) || view.getId() == nac.eko || view.getId() == nac.lrr || view.getId() == nac.iv || view.getId() == nac.xb || view.getId() == nac.ri || view.getId() == 520093726 || view.getId() == nac.bgf) {
            return true;
        }
        if (view instanceof ViewGroup) {
            int i = 0;
            while (true) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (i >= viewGroup.getChildCount()) {
                    break;
                }
                if (oo(viewGroup.getChildAt(i))) {
                    return true;
                }
                i++;
            }
        }
        return false;
    }

    private boolean qf() {
        of ofVar = ((sf) this).wh;
        return of.vj(ofVar) && ofVar.ra() == 1;
    }

    private String sf(String str) {
        str.getClass();
        switch (str) {
            case "banner_ad":
                return "banner_call";
            case "open_ad":
                return "open_ad";
            case "embeded_ad":
                return "feed_call";
            case "interaction":
                return "interaction_call";
            case "slide_banner_ad":
                return "banner_call";
            default:
                return "";
        }
    }

    private boolean vy() {
        of ofVar = ((sf) this).wh;
        if (ofVar == null || kj()) {
            return false;
        }
        if (ofVar.ct() != 5 && ofVar.ct() != 15) {
            return false;
        }
        if (this.nn == 0) {
            this.nn = ofVar.hh();
        }
        sf();
        pcc();
        gm();
        if (this.nn == 5 && qf() && pcc() && !sf() && !gm()) {
            return false;
        }
        int i = this.nn;
        return i == 1 || i == 2 || i == 5;
    }

    public void gm(boolean z) {
        this.gm = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v20, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r0v7, types: [android.content.Context] */
    @Override // com.bytedance.sdk.openadsdk.core.gm.sf, com.bytedance.sdk.openadsdk.core.gm.gm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void pcc(View view, float f, float f2, float f3, float f4, SparseArray<gm.pcc> sparseArray, boolean z) {
        String str;
        com.bytedance.sdk.openadsdk.core.gbb.pcc ibs;
        com.bytedance.sdk.openadsdk.core.gbb.oo pcc;
        boolean z2;
        JSONObject jSONObject;
        int i;
        JSONObject jSONObject2;
        View view2;
        Object obj;
        Activity pcc2;
        boolean z3;
        sf.pcc pccVar;
        dax daxVar;
        if (pcc(view, 2, f, f2, f3, f4, sparseArray, z)) {
            return;
        }
        of ofVar = ((sf) this).wh;
        ofVar.jr(true);
        ofVar.hu();
        if (!ofVar.lo()) {
            ofVar.oo(true);
        }
        if (of.vj(ofVar)) {
            if (!kj.pcc(ofVar) || (daxVar = ((sf) this).vj) == null) {
                com.bytedance.sdk.openadsdk.oo.gm.sf(ofVar, ((sf) this).qf, ofVar.zex());
            } else {
                com.bytedance.sdk.openadsdk.oo.gm.sf(ofVar, ((sf) this).qf, daxVar.nac);
            }
        }
        if (this.hc != null) {
            Map map = this.dax;
            if (map == null) {
                map = new HashMap();
                this.dax = map;
            }
            map.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(this.hc.wh()));
        }
        int apl = ofVar.apl();
        ofVar.zsj(0);
        com.bytedance.sdk.openadsdk.fum.pcc.pcc.gm gmVar = this.jr;
        if (gmVar != null) {
            gmVar.pcc(apl > 0 ? apl : 0);
        }
        Map<String, Object> map2 = this.dax;
        if (map2 != null) {
            map2.remove("dsp_click_type");
            this.dax.remove("click_probability_jump");
            this.dax.remove("auto_click");
        }
        boolean on = ofVar.on();
        if (apl > 0) {
            Map map3 = this.dax;
            if (map3 == null) {
                map3 = new HashMap();
                this.dax = map3;
            }
            if (on && apl < 11) {
                map3.put("dsp_click_type", Integer.valueOf(apl));
            }
            if (apl >= 11 && ofVar.fg() == 0) {
                this.dax.put("click_probability_jump", Integer.valueOf(com.bytedance.sdk.openadsdk.core.model.vy.pcc(apl)));
            }
        }
        com.bytedance.sdk.openadsdk.core.model.oo gto = ofVar.gto();
        if (on || gto != null) {
            WeakReference<InterfaceC0074pcc> weakReference = this.pq;
            long videoProgress = (weakReference == null || weakReference.get() == null) ? 0L : this.pq.get().getVideoProgress();
            if (!on && gto != null && (pcc = gto.pcc()) != null) {
                pcc.qf(videoProgress);
            }
            if (on) {
                if (view != null) {
                    Object tag = view.getTag(570425345);
                    if (tag instanceof String) {
                        str = (String) tag;
                        ibs = ofVar.ibs();
                        if (ibs != null) {
                            ibs.vj(str);
                            if (!TextUtils.isEmpty(str)) {
                                pcc(str);
                            }
                            if ("VAST_ICON".equals(str)) {
                                com.bytedance.sdk.openadsdk.core.gbb.sf sf = ibs.sf();
                                if (sf != null) {
                                    sf.pcc(videoProgress);
                                }
                            } else if ("VAST_END_CARD".equals(str)) {
                                com.bytedance.sdk.openadsdk.core.gbb.gm gm = ibs.gm();
                                if (gm != null) {
                                    gm.pcc(videoProgress);
                                }
                            } else {
                                com.bytedance.sdk.openadsdk.core.gbb.oo pcc3 = ibs.pcc();
                                if (pcc3 != null) {
                                    pcc3.qf(videoProgress);
                                }
                            }
                        }
                    }
                }
                str = "VAST_ACTION_BUTTON";
                ibs = ofVar.ibs();
                if (ibs != null) {
                }
            }
        }
        if (vy() && oo(view) && !this.gm) {
            super.pcc(view, f, f2, f3, f4, sparseArray, z);
            return;
        }
        Context context = ((sf) this).oo;
        if (context == null) {
            context = lu.pcc();
            ((sf) this).oo = context;
        }
        if (context == null || !pcc(view, z)) {
            return;
        }
        JSONObject pcc4 = fum.pcc(view);
        dax daxVar2 = ((sf) this).vj;
        if (daxVar2 != null) {
            int i2 = daxVar2.kj;
            JSONObject jSONObject3 = daxVar2.vy;
            JSONObject jSONObject4 = daxVar2.hc;
            i = i2;
            z2 = daxVar2.gbb;
            jSONObject = jSONObject3;
            jSONObject2 = jSONObject4;
        } else {
            z2 = false;
            jSONObject = pcc4;
            i = -1;
            jSONObject2 = null;
        }
        long j = this.yt;
        long j2 = this.qy;
        WeakReference<View> weakReference2 = this.vy;
        tmg pcc5 = pcc(f, f2, f3, f4, sparseArray, j, j2, weakReference2 == null ? oo() : weakReference2.get(), vj(), rj.kj(((sf) this).oo), rj.ork(((sf) this).oo), rj.vy(((sf) this).oo), i, jSONObject, jSONObject2);
        this.ork = pcc5;
        if (z2) {
            com.bytedance.sdk.openadsdk.oo.gm.pcc("click", ofVar, pcc5, ((sf) this).qf, true, this.dax, z ? 1 : 2);
            return;
        }
        int az = ofVar.az();
        if (az != 2 && az != 3) {
            if (az != 4) {
                if (az == 5) {
                    String sf2 = sf(((sf) this).qf);
                    if (!TextUtils.isEmpty(sf2)) {
                        com.bytedance.sdk.openadsdk.oo.gm.pcc("click_call", ofVar, this.ork, sf2, true, this.dax, z ? 1 : 2);
                    }
                    com.bytedance.sdk.openadsdk.oo.gm.pcc("click", ofVar, this.ork, ((sf) this).qf, kun.sf(view.getContext(), ofVar.ln()), this.dax, z ? 1 : 2);
                } else if (az != 8) {
                    view2 = view;
                    az = -1;
                    pccVar = this.vh;
                    if (pccVar == null) {
                        pccVar.pcc(view2, az);
                        return;
                    }
                    return;
                }
            } else if (!atb.sf(ofVar) || (this.tmg == null && this.nac == null)) {
                com.bytedance.sdk.openadsdk.fum.pcc.pcc.gm gmVar2 = this.jr;
                if (gmVar2 != null) {
                    gmVar2.pcc(ofVar);
                    Map<String, Object> map4 = this.dax;
                    if (ofVar.lo() && !ofVar.gpj()) {
                        map4.put("auto_click", Boolean.TRUE);
                        ofVar.vj(false);
                    }
                    if (this.pcc) {
                        com.bytedance.sdk.openadsdk.oo.gm.pcc("click", ofVar, this.ork, ((sf) this).qf, true, map4, z ? 1 : 2);
                    }
                }
            } else {
                pcc2 = view != null ? com.bytedance.sdk.component.utils.sf.pcc(view) : null;
                boolean pcc6 = rnn.pcc(pcc2 == null ? ((sf) this).oo : pcc2, ofVar, this.kj, this.tmg, this.nac, ((sf) this).qf, this.jr, true, apl);
                if (this.pcc) {
                    com.bytedance.sdk.openadsdk.oo.gm.pcc("click", ofVar, this.ork, ((sf) this).qf, pcc6, this.dax, z ? 1 : 2);
                }
            }
            view2 = view;
            pccVar = this.vh;
            if (pccVar == null) {
            }
        }
        if (az == 3) {
            String xy = ofVar.xy();
            if (!TextUtils.isEmpty(xy) && xy.contains("play.google.com/store")) {
                if (com.bytedance.sdk.openadsdk.fum.pcc.pcc.sf.pcc(((sf) this).oo, xy, xy.substring(xy.indexOf("?id=") + 4), ((sf) this).qf, ofVar)) {
                    if (this.pcc) {
                        com.bytedance.sdk.openadsdk.oo.gm.pcc("click", ofVar, this.ork, ((sf) this).qf, true, this.dax, z ? 1 : 2);
                    }
                    view2 = view;
                    pccVar = this.vh;
                    if (pccVar == null) {
                    }
                }
            }
        }
        if (this.tmg != null || this.sf) {
            com.bytedance.sdk.openadsdk.oo.gm.pcc("click_button", ofVar, this.ork, ((sf) this).qf, true, this.dax, z ? 1 : 2);
        }
        if (view != null) {
            view2 = view;
            try {
                obj = view2.getTag(520093762);
            } catch (Exception unused) {
            }
        } else {
            view2 = view;
            obj = null;
        }
        if ((view2 != null && (view2.getId() == 520093726 || (view2 instanceof com.bytedance.sdk.openadsdk.core.jr.sf.wh))) || Boolean.TRUE.equals(obj)) {
            rnn.pcc(true);
        }
        pcc2 = view2 != null ? com.bytedance.sdk.component.utils.sf.pcc(view2) : null;
        Activity activity = pcc2 == null ? ((sf) this).oo : pcc2;
        if (lo.gm(ofVar) && this.mu) {
            z3 = false;
        } else {
            boolean pcc7 = rnn.pcc(activity, ofVar, this.kj, this.tmg, this.nac, ((sf) this).qf, this.jr, true, apl);
            ofVar.wh(SystemClock.elapsedRealtime());
            rnn.pcc(false);
            z3 = pcc7;
        }
        if (this.pcc) {
            com.bytedance.sdk.openadsdk.oo.gm.pcc("click", ofVar, this.ork, ((sf) this).qf, z3, this.dax, z ? 1 : 2);
        }
        pccVar = this.vh;
        if (pccVar == null) {
        }
    }

    public boolean gm() {
        return false;
    }

    public void sf(boolean z) {
        this.sf = z;
    }

    public boolean sf() {
        return false;
    }

    public void oo(boolean z) {
        this.mu = z;
    }

    public void pcc(boolean z) {
        this.pcc = z;
    }

    public boolean pcc() {
        of ofVar = ((sf) this).wh;
        if (ofVar == null) {
            return true;
        }
        int sf = lu.oo().sf(ofVar.kot());
        int gm = com.bytedance.sdk.component.utils.lu.gm(lu.pcc());
        if (sf == 1) {
            return kun.oo(gm);
        }
        if (sf == 2) {
            return kun.vj(gm) || kun.oo(gm) || kun.wh(gm);
        }
        if (sf != 3) {
            return sf != 5 || kun.oo(gm) || kun.wh(gm);
        }
        return false;
    }

    public void pcc(InterfaceC0074pcc interfaceC0074pcc) {
        this.pq = new WeakReference<>(interfaceC0074pcc);
    }

    public void pcc(View view) {
        pcc(view, this.lo, this.fum, this.tz, this.of, this.zti, this.ye);
    }
}

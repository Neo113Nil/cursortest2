package com.bytedance.sdk.openadsdk.oo.vj.pcc;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.lo;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.core.model.ye;
import com.bytedance.sdk.openadsdk.dax.oo;
import com.bytedance.sdk.openadsdk.oo.gm;
import com.bytedance.sdk.openadsdk.oo.qf;
import com.bytedance.sdk.openadsdk.oo.vj.sf.gbb;
import com.bytedance.sdk.openadsdk.oo.vj.sf.hc;
import com.bytedance.sdk.openadsdk.oo.vj.sf.jr;
import com.bytedance.sdk.openadsdk.oo.vj.sf.kj;
import com.bytedance.sdk.openadsdk.oo.vj.sf.sf;
import com.bytedance.sdk.openadsdk.oo.vj.sf.vj;
import com.bytedance.sdk.openadsdk.oo.vj.sf.wh;
import com.bytedance.sdk.openadsdk.utils.kun;
import com.bytedance.sdk.openadsdk.utils.tsz;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.metadata.a;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import defpackage.cga;
import defpackage.nem;
import defpackage.otm;
import defpackage.p03;
import defpackage.sea;
import defpackage.swm;
import java.io.File;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class pcc {
    private static final Map<otm, jr> pcc = Collections.synchronizedMap(new WeakHashMap());

    public static void gm(otm otmVar, jr.pcc pccVar) {
        jr jrVar;
        if (otmVar == null || pccVar == null || (jrVar = pcc.get(otmVar)) == null) {
            return;
        }
        nem oo = jrVar.oo();
        of vj = jrVar.vj();
        if (oo == null || vj == null) {
            return;
        }
        long sf = pccVar.sf();
        long oo2 = pccVar.oo();
        gbb gbbVar = new gbb(pccVar.hc());
        gbbVar.pcc(pccVar.gm());
        gbbVar.sf(oo2);
        com.bytedance.sdk.openadsdk.oo.vj.sf.pcc pcc2 = pcc(vj, jrVar.sf(), jrVar.gm(), oo, pccVar);
        pcc2.pcc(gbbVar);
        pcc2.pcc(pccVar.vh());
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(IronSourceConstants.EVENTS_DURATION, sf);
            jSONObject.put("percent", pccVar.qf());
            pcc(pcc2, "play_error", jSONObject);
        } catch (JSONException e) {
            lo.pcc("TTAD.VideoEventManager", "", e);
        }
    }

    public static void oo(otm otmVar, jr.pcc pccVar) {
        jr jrVar;
        if (otmVar == null || pccVar == null || (jrVar = pcc.get(otmVar)) == null) {
            return;
        }
        nem oo = jrVar.oo();
        of vj = jrVar.vj();
        if (oo == null || vj == null) {
            return;
        }
        long sf = pccVar.sf();
        long oo2 = pccVar.oo();
        sf sfVar = new sf();
        sfVar.pcc(pccVar.gm());
        sfVar.sf(oo2);
        sfVar.pcc(pccVar.vj());
        sfVar.sf(pccVar.wh());
        com.bytedance.sdk.openadsdk.oo.vj.sf.pcc pcc2 = pcc(vj, jrVar.sf(), jrVar.gm(), oo, pccVar);
        pcc2.pcc(sfVar);
        pcc2.pcc(pccVar.vh());
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(IronSourceConstants.EVENTS_DURATION, sf);
            jSONObject.put("percent", pccVar.qf());
            pcc(pcc2, "endcard_skip", jSONObject);
        } catch (JSONException e) {
            lo.pcc("TTAD.VideoEventManager", "", e);
        }
        pcc.remove(otmVar);
    }

    public static void pcc(Context context, otm otmVar, jr.pcc pccVar, qf qfVar) {
        jr jrVar;
        if (context == null || otmVar == null || pccVar == null || (jrVar = pcc.get(otmVar)) == null) {
            return;
        }
        nem oo = jrVar.oo();
        of vj = jrVar.vj();
        if (oo == null || vj == null) {
            return;
        }
        if (!pccVar.vh()) {
            pcc(vj, oo, pccVar);
        }
        kj kjVar = new kj(oo);
        kjVar.pcc(pccVar.tmg() ? 1 : 0);
        ((p03) CacheDirFactory.getICacheDir(vj.we())).getClass();
        long j = 0;
        if (!TextUtils.isEmpty(oo.vj()) && !TextUtils.isEmpty(oo.nac())) {
            String vj2 = oo.vj();
            String nac = oo.nac();
            File C = cga.C(vj2, nac);
            if (C.exists()) {
                j = C.length();
            } else {
                File R = cga.R(vj2, nac);
                if (R.exists()) {
                    j = R.length();
                }
            }
        }
        kjVar.sf(j);
        kjVar.pcc(SystemClock.elapsedRealtime() - jrVar.pcc());
        com.bytedance.sdk.openadsdk.oo.vj.sf.pcc pcc2 = pcc(vj, jrVar.sf(), jrVar.gm(), oo, pccVar);
        pcc2.pcc(kjVar);
        JSONObject oo2 = pcc2.oo();
        try {
            oo2.put("is_received_video_not_playing_info", pccVar.gbb() ? 1 : 0);
            oo2.put("new_media_source", sea.s);
        } catch (JSONException e) {
            lo.pcc("TTAD.VideoEventManager", "", e);
        }
        pcc2.pcc(pccVar.vh());
        pcc(pcc2, "feed_play", qfVar);
    }

    public static void sf(otm otmVar, jr.pcc pccVar, qf qfVar) {
        if (otmVar == null || pccVar == null) {
            return;
        }
        vj(otmVar, pccVar);
        jr jrVar = pcc.get(otmVar);
        if (jrVar == null) {
            return;
        }
        nem oo = jrVar.oo();
        of vj = jrVar.vj();
        if (oo == null || vj == null) {
            return;
        }
        long sf = pccVar.sf();
        long oo2 = pccVar.oo();
        wh whVar = new wh(oo);
        whVar.sf(pccVar.gm());
        whVar.pcc(oo2);
        whVar.pcc(pccVar.vy());
        com.bytedance.sdk.openadsdk.oo.vj.sf.pcc pcc2 = pcc(vj, jrVar.sf(), jrVar.gm(), oo, pccVar);
        pcc2.pcc(whVar);
        JSONObject oo3 = pcc2.oo();
        pcc(pccVar, vj, oo3);
        pcc2.pcc(pccVar.vh());
        try {
            oo3.put("surface_texture_updated", pccVar.jr() ? 1 : 0);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(IronSourceConstants.EVENTS_DURATION, sf);
            jSONObject.put("percent", pccVar.qf());
            pcc(pcc2, "feed_over", jSONObject, qfVar);
        } catch (JSONException e) {
            lo.pcc("TTAD.VideoEventManager", "", e);
        }
        pcc.remove(otmVar);
    }

    public static void vj(otm otmVar, jr.pcc pccVar) {
        jr jrVar;
        if (otmVar == null || pccVar == null || pccVar.ork() <= 0 || (jrVar = pcc.get(otmVar)) == null) {
            return;
        }
        nem oo = jrVar.oo();
        of vj = jrVar.vj();
        if (oo == null || vj == null) {
            return;
        }
        long oo2 = pccVar.oo();
        hc hcVar = new hc();
        hcVar.pcc(pccVar.gm());
        hcVar.sf(oo2);
        hcVar.pcc(pccVar.ork());
        com.bytedance.sdk.openadsdk.oo.vj.sf.pcc pcc2 = pcc(vj, jrVar.sf(), jrVar.gm(), oo, pccVar);
        pcc2.pcc(hcVar);
        pcc2.pcc(pccVar.vh());
        pcc(pcc2, "play_buffer");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long gm(nem nemVar) {
        if (nemVar == null) {
            return 0L;
        }
        swm yt = nemVar.gbb() ? nemVar.yt() : nemVar.of();
        if (yt != null) {
            return Double.valueOf(yt.d * 1000.0d).longValue();
        }
        return 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String oo(nem nemVar) {
        return new File(nemVar.vj(), nemVar.nac()).getAbsolutePath();
    }

    public static void sf(com.bytedance.sdk.openadsdk.oo.vj.sf.pcc pccVar) {
        oo.pcc("load_video_cancel", pccVar);
    }

    public static void sf(otm otmVar, jr.pcc pccVar) {
        jr jrVar;
        if (otmVar == null || pccVar == null || (jrVar = pcc.get(otmVar)) == null) {
            return;
        }
        nem oo = jrVar.oo();
        of vj = jrVar.vj();
        if (oo == null || vj == null) {
            return;
        }
        long sf = pccVar.sf();
        long oo2 = pccVar.oo();
        if (oo2 <= 0 || sf <= 0) {
            return;
        }
        vj vjVar = new vj();
        vjVar.pcc(pccVar.gm());
        vjVar.sf(oo2);
        com.bytedance.sdk.openadsdk.oo.vj.sf.pcc pcc2 = pcc(vj, jrVar.sf(), jrVar.gm(), oo, pccVar);
        pcc2.pcc(vjVar);
        pcc2.pcc(pccVar.vh());
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(IronSourceConstants.EVENTS_DURATION, sf);
            jSONObject.put("percent", pccVar.qf());
            pcc(pcc2, "feed_continue", jSONObject);
        } catch (JSONException e) {
            lo.pcc("TTAD.VideoEventManager", "", e);
        }
    }

    public static com.bytedance.sdk.openadsdk.oo.vj.sf.pcc pcc(of ofVar, String str, int i, nem nemVar) {
        return pcc(ofVar, str, i, nemVar, null);
    }

    public static com.bytedance.sdk.openadsdk.oo.vj.sf.pcc pcc(of ofVar, String str, int i, nem nemVar, jr.pcc pccVar) {
        JSONObject jSONObject = new JSONObject();
        if (i > 0) {
            try {
                jSONObject.put("play_type", String.valueOf(i));
            } catch (JSONException e) {
                lo.pcc("TTAD.VideoEventManager", "", e);
            }
        }
        if (ofVar != null) {
            swm kez = ofVar.kez();
            if (kez != null) {
                jSONObject.put(CampaignEx.JSON_KEY_VIDEO_RESOLUTION, kez.e);
                jSONObject.put(CampaignEx.JSON_KEY_VIDEO_SIZE, Long.valueOf(kez.c));
                jSONObject.put("video_url", kez.g);
                jSONObject.put("player_type", nemVar.lu());
                jSONObject.put("video_encode_type", nemVar.gbb() ? 1 : 0);
            }
            jSONObject.put("play_time", nemVar.vj);
            r0 = nemVar.pcc() ? new JSONObject(nemVar.gm().toString()) : null;
            if (r0 == null) {
                r0 = new JSONObject();
            }
            if (!TextUtils.isEmpty(str)) {
                r0.put("session_id", str);
            }
            jSONObject.put("dp_creative_type", ofVar.fg());
        }
        return new com.bytedance.sdk.openadsdk.oo.vj.sf.pcc(ofVar, kun.pcc(ofVar), jSONObject, r0);
    }

    public static void pcc(com.bytedance.sdk.openadsdk.oo.vj.sf.pcc pccVar) {
        oo.pcc("load_video_error", pccVar);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:4|(1:6)(3:20|(1:28)(1:24)|(8:26|8|9|10|11|(1:13)|14|15)(1:27))|7|8|9|10|11|(0)|14|15) */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0075, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0076, code lost:
    
        com.bytedance.sdk.component.utils.lo.pcc("TTAD.VideoEventManager", "", r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void pcc(of ofVar, otm otmVar, nem nemVar) {
        int i;
        int i2;
        if (ofVar == null || otmVar == null || nemVar == null) {
            return;
        }
        String pcc2 = tsz.pcc();
        if (nemVar.qy()) {
            i = 3;
        } else {
            ((p03) CacheDirFactory.getICacheDir(ofVar.we())).getClass();
            if ((TextUtils.isEmpty(nemVar.vj()) || TextUtils.isEmpty(nemVar.nac())) ? false : new File(nemVar.vj(), nemVar.nac()).exists()) {
                i2 = 1;
                pcc.put(otmVar, new jr(SystemClock.elapsedRealtime(), pcc2, i2, nemVar, ofVar));
                com.bytedance.sdk.openadsdk.oo.vj.sf.pcc pcc3 = pcc(ofVar, pcc2, i2, nemVar, null);
                pcc3.gm().put("is_mute", nemVar.vh() ? 1 : 0);
                pcc3.pcc(nemVar.lu() == -1);
                pcc(pcc3, "play_start");
            }
            i = 2;
        }
        i2 = i;
        pcc.put(otmVar, new jr(SystemClock.elapsedRealtime(), pcc2, i2, nemVar, ofVar));
        com.bytedance.sdk.openadsdk.oo.vj.sf.pcc pcc32 = pcc(ofVar, pcc2, i2, nemVar, null);
        pcc32.gm().put("is_mute", nemVar.vh() ? 1 : 0);
        pcc32.pcc(nemVar.lu() == -1);
        pcc(pcc32, "play_start");
    }

    public static void pcc(otm otmVar, jr.pcc pccVar) {
        jr jrVar;
        if (otmVar == null || pccVar == null || (jrVar = pcc.get(otmVar)) == null) {
            return;
        }
        nem oo = jrVar.oo();
        of vj = jrVar.vj();
        if (oo == null || vj == null) {
            return;
        }
        long sf = pccVar.sf();
        long oo2 = pccVar.oo();
        if (oo2 <= 0 || sf <= 0) {
            return;
        }
        com.bytedance.sdk.openadsdk.oo.vj.sf.qf qfVar = new com.bytedance.sdk.openadsdk.oo.vj.sf.qf();
        qfVar.pcc(pccVar.gm());
        qfVar.sf(oo2);
        com.bytedance.sdk.openadsdk.oo.vj.sf.pcc pcc2 = pcc(vj, jrVar.sf(), jrVar.gm(), oo, pccVar);
        pcc2.pcc(qfVar);
        pcc(pccVar, vj, pcc2.oo());
        pcc2.pcc(pccVar.vh());
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(IronSourceConstants.EVENTS_DURATION, sf);
            jSONObject.put("percent", pccVar.qf());
            pcc(pcc2, "feed_pause", jSONObject);
        } catch (JSONException e) {
            lo.pcc("TTAD.VideoEventManager", "", e);
        }
    }

    private static void pcc(jr.pcc pccVar, of ofVar, JSONObject jSONObject) {
        if (ofVar != null) {
            try {
                ye uk = ofVar.uk();
                if (uk != null) {
                    jSONObject.put("speed_type", uk.sf());
                    jSONObject.put("speed", uk.pcc());
                    jSONObject.put("speed_duration", pccVar.pcc());
                }
            } catch (Throwable th) {
                lo.pcc("TTAD.VideoEventManager", "", th);
            }
        }
    }

    public static void pcc(otm otmVar, jr.pcc pccVar, qf qfVar) {
        if (otmVar == null || pccVar == null) {
            return;
        }
        vj(otmVar, pccVar);
        jr jrVar = pcc.get(otmVar);
        if (jrVar == null) {
            return;
        }
        nem oo = jrVar.oo();
        of vj = jrVar.vj();
        if (oo == null || vj == null) {
            return;
        }
        long sf = pccVar.sf();
        long oo2 = pccVar.oo();
        com.bytedance.sdk.openadsdk.oo.vj.sf.oo ooVar = new com.bytedance.sdk.openadsdk.oo.vj.sf.oo();
        ooVar.sf(pccVar.gm());
        ooVar.pcc(oo2);
        ooVar.pcc(pccVar.kj());
        ooVar.sf(pccVar.vy());
        com.bytedance.sdk.openadsdk.oo.vj.sf.pcc pcc2 = pcc(vj, jrVar.sf(), jrVar.gm(), oo, pccVar);
        pcc2.pcc(ooVar);
        pcc(pccVar, vj, pcc2.oo());
        pcc2.pcc(pccVar.vh());
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(IronSourceConstants.EVENTS_DURATION, sf);
            jSONObject.put("percent", pccVar.qf());
            pcc(pcc2, "feed_break", jSONObject, qfVar);
        } catch (JSONException e) {
            lo.pcc("TTAD.VideoEventManager", "", e);
        }
    }

    public static void pcc(otm otmVar, boolean z, String str) {
        jr jrVar;
        if (otmVar == null || (jrVar = pcc.get(otmVar)) == null) {
            return;
        }
        nem oo = jrVar.oo();
        of vj = jrVar.vj();
        if (oo == null || vj == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.oo.vj.sf.pcc pcc2 = pcc(vj, jrVar.sf(), jrVar.gm(), oo, null);
        try {
            pcc2.gm().put("is_mute", z ? 1 : 0);
            pcc2.oo().put("from", str);
        } catch (JSONException e) {
            lo.pcc("TTAD.VideoEventManager", "", e);
        }
        pcc(pcc2, "mute_state_change");
    }

    private static void pcc(com.bytedance.sdk.openadsdk.oo.vj.sf.pcc pccVar, String str) {
        pcc(pccVar, str, (JSONObject) null, (qf) null);
    }

    private static void pcc(com.bytedance.sdk.openadsdk.oo.vj.sf.pcc pccVar, String str, JSONObject jSONObject) {
        pcc(pccVar, str, jSONObject, (qf) null);
    }

    private static void pcc(com.bytedance.sdk.openadsdk.oo.vj.sf.pcc pccVar, String str, qf qfVar) {
        pcc(pccVar, str, (JSONObject) null, qfVar);
    }

    private static void pcc(final com.bytedance.sdk.openadsdk.oo.vj.sf.pcc pccVar, String str, final JSONObject jSONObject, final qf qfVar) {
        if (pccVar == null) {
            return;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (pccVar.wh() && !TextUtils.isEmpty(pccVar.sf())) {
            String sf = pccVar.sf();
            sf.getClass();
            if (sf.equals("stream") || sf.equals("embeded_ad")) {
                str = "customer_".concat(String.valueOf(str));
            }
        }
        final String str2 = str;
        gm.pcc(System.currentTimeMillis(), pccVar.pcc(), pccVar.sf(), str2, new com.bytedance.sdk.openadsdk.dax.sf.pcc() { // from class: com.bytedance.sdk.openadsdk.oo.vj.pcc.pcc.1
            @Override // com.bytedance.sdk.openadsdk.dax.sf.pcc, com.bytedance.sdk.openadsdk.dax.sf.sf
            public JSONObject gm() {
                qf qfVar2;
                try {
                    JSONObject gm = com.bytedance.sdk.openadsdk.oo.vj.sf.pcc.this.gm();
                    if (com.bytedance.sdk.openadsdk.oo.vj.sf.pcc.this.vj() != null) {
                        com.bytedance.sdk.openadsdk.oo.vj.sf.pcc.this.vj().pcc(gm);
                    }
                    if (("feed_play".equals(str2) || "feed_over".equals(str2) || "feed_break".equals(str2)) && (qfVar2 = qfVar) != null) {
                        qfVar2.pcc(gm);
                    }
                    return gm;
                } catch (Throwable unused) {
                    return null;
                }
            }

            @Override // com.bytedance.sdk.openadsdk.dax.sf.pcc, com.bytedance.sdk.openadsdk.dax.sf.sf
            public JSONObject pcc() {
                com.bytedance.sdk.openadsdk.oo.vj.sf.pcc.this.qf();
                return com.bytedance.sdk.openadsdk.oo.vj.sf.pcc.this.oo();
            }

            @Override // com.bytedance.sdk.openadsdk.dax.sf.pcc, com.bytedance.sdk.openadsdk.dax.sf.sf
            public JSONObject sf() {
                return jSONObject;
            }
        });
    }

    private static void pcc(final of ofVar, final nem nemVar, final jr.pcc pccVar) {
        oo.pcc();
        oo.pcc("pangle_video_play_state", false, new com.bytedance.sdk.openadsdk.dax.sf() { // from class: com.bytedance.sdk.openadsdk.oo.vj.pcc.pcc.2
            @Override // com.bytedance.sdk.openadsdk.dax.sf
            public com.bytedance.sdk.openadsdk.dax.pcc.gm pcc() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("service_duration", pcc.gm(nem.this));
                jSONObject.put("player_duration", pccVar.oo());
                jSONObject.put("cache_path_type", CacheDirFactory.getCacheType());
                jSONObject.put("url", nem.this.dax());
                jSONObject.put("path", pcc.oo(nem.this));
                jSONObject.put("player_type", nem.this.lu());
                com.bytedance.sdk.openadsdk.dax.pcc.oo pcc2 = com.bytedance.sdk.openadsdk.dax.pcc.oo.sf().pcc("pangle_video_play_state");
                of ofVar2 = ofVar;
                return pcc2.pcc(ofVar2 != null ? ofVar2.hh() : 0).sf(jSONObject.toString());
            }
        });
    }

    public static boolean pcc(of ofVar) {
        try {
            JSONObject jSONObject = (JSONObject) com.bytedance.sdk.openadsdk.yt.vj.pcc("video_black_fallback", (Object) null, com.bytedance.sdk.openadsdk.yt.sf.pcc);
            if (ofVar != null && jSONObject != null && jSONObject.optInt(a.k) == 1 && ofVar.pjm() != 0) {
                return System.currentTimeMillis() - com.bytedance.sdk.openadsdk.gpj.oo.pcc.pcc("sp_video_black_file", "video_black_time", 0L) < jSONObject.optLong("work_time", 604800000L);
            }
            return false;
        } catch (Exception e) {
            lo.pcc("TTAD.VideoEventManager", "isVideoBlack e = ", e);
            return false;
        }
    }

    public static void pcc(of ofVar, final int i, long j) {
        try {
            JSONObject jSONObject = (JSONObject) com.bytedance.sdk.openadsdk.yt.vj.pcc("video_black_fallback", (Object) null, com.bytedance.sdk.openadsdk.yt.sf.pcc);
            if (ofVar != null && jSONObject != null) {
                final boolean z = true;
                if (jSONObject.optInt(a.k) == 1 && ofVar.pjm() != 0) {
                    int optInt = jSONObject.optInt("texture_update_count", 5);
                    int optInt2 = jSONObject.optInt("play_duration", IronSourceError.ERROR_CAPPING_VALIDATION_FAILED);
                    final long currentTimeMillis = System.currentTimeMillis() - j;
                    if (currentTimeMillis <= optInt2 || i >= optInt) {
                        z = false;
                    }
                    if (z) {
                        com.bytedance.sdk.openadsdk.gpj.oo.pcc.pcc("sp_video_black_file", "video_black_time", Long.valueOf(System.currentTimeMillis()));
                    }
                    gm.pcc(System.currentTimeMillis(), ofVar, ofVar.vj(), "video_black", new com.bytedance.sdk.openadsdk.dax.sf.pcc() { // from class: com.bytedance.sdk.openadsdk.oo.vj.pcc.pcc.3
                        @Override // com.bytedance.sdk.openadsdk.dax.sf.pcc, com.bytedance.sdk.openadsdk.dax.sf.sf
                        public JSONObject pcc() {
                            JSONObject jSONObject2 = new JSONObject();
                            try {
                                jSONObject2.putOpt("is_black", Integer.valueOf(z ? 1 : 0));
                                jSONObject2.putOpt("play_duration", Long.valueOf(currentTimeMillis));
                                jSONObject2.putOpt("texture_update_count", Integer.valueOf(i));
                                return jSONObject2;
                            } catch (JSONException e) {
                                lo.pcc("TTAD.VideoEventManager", "reportVideoBlackEvent e = ", e);
                                return jSONObject2;
                            }
                        }
                    });
                }
            }
        } catch (Exception e) {
            lo.pcc("TTAD.VideoEventManager", "reportVideoBlackEvent e = ", e);
        }
    }
}

package com.bytedance.sdk.openadsdk.core;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.sf;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.activity.single.IABLandingPageActivity;
import com.bytedance.sdk.openadsdk.activity.single.TTLandingPageActivity;
import com.bytedance.sdk.openadsdk.activity.single.TTPlayableLandingPageActivity;
import com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageLink2Activity;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.gpj.gm.pcc;
import com.bytedance.sdk.openadsdk.oo.sf;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class rnn {
    private static boolean pcc = false;

    /* JADX WARN: Multi-variable type inference failed */
    private static Intent pcc(Context context, String str, com.bytedance.sdk.openadsdk.core.model.of ofVar, int i, @Nullable PAGNativeAd pAGNativeAd, com.bytedance.sdk.openadsdk.core.oo.pcc pccVar, String str2, boolean z, boolean z2, lo loVar) {
        Intent intent;
        if (!z2 && com.bytedance.sdk.openadsdk.core.model.atb.sf(ofVar) && (pAGNativeAd != 0 || pccVar != null)) {
            intent = new Intent(context, (Class<?>) TTPlayableLandingPageActivity.class);
            boolean pcc2 = pcc(ofVar, z);
            intent.putExtra("ad_pending_download", pcc2);
            String vh = com.bytedance.sdk.openadsdk.core.model.atb.vh(ofVar);
            if (!TextUtils.isEmpty(vh)) {
                str = vh.contains("?") ? vh.concat("&orientation=portrait") : vh.concat("?orientation=portrait");
            }
            ofVar.sf(pcc2);
        } else if (!z2 && ofVar.az() == 3 && ((ofVar.bg() == 2 || (ofVar.bg() == 1 && pcc)) && !ofVar.rx())) {
            intent = new Intent(context, (Class<?>) TTVideoLandingPageLink2Activity.class);
        } else if (com.bytedance.sdk.openadsdk.utils.sf.wh() && lu.oo().atb()) {
            intent = new Intent(context, (Class<?>) IABLandingPageActivity.class);
            intent.putExtra("scene", 0);
        } else {
            intent = new Intent(context, (Class<?>) TTLandingPageActivity.class);
        }
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        if (z2 && loVar != null) {
            ofVar.lo(loVar.sf());
            ofVar.pcc(loVar.pcc());
        }
        ofVar.vj(str);
        ofVar.wh(str2);
        ofVar.oo(i);
        intent.putExtra("meta_index", atb.pcc().pcc(ofVar));
        if (com.bytedance.sdk.openadsdk.utils.sf.wh() && lu.oo().atb()) {
            intent.putExtra("landing_url", ofVar.vh());
        }
        if (ofVar.ct() == 5 || ofVar.ct() == 15 || ofVar.ct() == 50) {
            com.bytedance.sdk.openadsdk.gpj.gm.pcc pccVar2 = null;
            if (pAGNativeAd != 0) {
                if (pAGNativeAd instanceof pcc.InterfaceC0111pcc) {
                    pccVar2 = ((pcc.InterfaceC0111pcc) pAGNativeAd).wh();
                } else if (pAGNativeAd instanceof com.bytedance.sdk.openadsdk.pcc.sf.pcc.sf) {
                    pccVar2 = ((com.bytedance.sdk.openadsdk.pcc.sf.pcc.sf) pAGNativeAd).sf();
                }
                if (pccVar2 != null) {
                    intent.putExtra(TTAdConstant.MULTI_PROCESS_DATA, pccVar2.pcc().toString());
                }
            }
            if (pccVar != null && pccVar.sf() && (pccVar2 = pccVar.gm()) != null) {
                intent.putExtra(TTAdConstant.MULTI_PROCESS_DATA, pccVar2.pcc().toString());
            }
            if (pccVar2 != null) {
                intent.putExtra("video_is_auto_play", pccVar2.oo);
                if (com.bytedance.sdk.component.utils.jr.gm()) {
                    pccVar2.pcc().toString();
                }
            }
        }
        return intent;
    }

    private static com.bytedance.sdk.openadsdk.dax.pcc.sf pcc(int i, com.bytedance.sdk.openadsdk.core.model.of ofVar) {
        com.bytedance.sdk.openadsdk.dax.pcc.sf sfVar = new com.bytedance.sdk.openadsdk.dax.pcc.sf();
        sfVar.pcc(sf.pcc.pcc);
        sfVar.pcc(ofVar);
        sfVar.sf(com.bytedance.sdk.openadsdk.utils.kun.pcc(ofVar));
        sfVar.pcc(i);
        sfVar.pcc(false);
        sfVar.sf(ofVar.az());
        return sfVar;
    }

    public static boolean pcc(Context context, com.bytedance.sdk.openadsdk.core.model.of ofVar, int i, @Nullable PAGNativeAd pAGNativeAd, @Nullable com.bytedance.sdk.openadsdk.core.oo.pcc pccVar, String str, @Nullable com.bytedance.sdk.openadsdk.fum.pcc.pcc.gm gmVar, boolean z, int i2) {
        String pcc2;
        com.bytedance.sdk.openadsdk.oo.gm.pcc(pcc(-1, ofVar));
        if (context != null && ofVar != null && i != -1) {
            com.bytedance.sdk.openadsdk.core.model.hc dt = ofVar.dt();
            HashMap hashMap = new HashMap();
            if (ofVar.fg() == 0) {
                hashMap.put("dpl_probability_jump", Boolean.valueOf(i2 >= 11));
            }
            if (i2 != 0 && ofVar.on()) {
                hashMap.put("dsp_click_type", Integer.valueOf(i2));
            }
            if (dt != null && !TextUtils.isEmpty(dt.pcc())) {
                if (pcc(context, ofVar, i, str, z, hashMap)) {
                    com.bytedance.sdk.openadsdk.oo.gm.pcc(pcc(2, ofVar));
                    com.bytedance.sdk.openadsdk.utils.vj.pcc(ofVar);
                    return true;
                }
                if (dt.gm() != 2 || ofVar.ct() == 5 || ofVar.ct() == 15) {
                    if (dt.gm() == 1 && !TextUtils.isEmpty(dt.sf())) {
                        pcc2 = dt.sf();
                    } else {
                        pcc2 = pcc(dt, ofVar);
                    }
                } else if (gmVar != null) {
                    if (!gmVar.oo(ofVar)) {
                        if (gmVar.gm(ofVar)) {
                            com.bytedance.sdk.openadsdk.oo.gm.pcc(ofVar, str, "open_fallback_url", hashMap);
                            com.bytedance.sdk.openadsdk.oo.gm.pcc(pcc(3, ofVar));
                            com.bytedance.sdk.openadsdk.utils.vj.pcc(ofVar);
                            return true;
                        }
                        pcc2 = pcc(dt, ofVar);
                        com.bytedance.sdk.openadsdk.oo.gm.pcc(pcc(3, ofVar));
                    } else {
                        com.bytedance.sdk.openadsdk.oo.gm.pcc(ofVar, str, "open_fallback_url", hashMap);
                        com.bytedance.sdk.openadsdk.oo.gm.pcc(pcc(3, ofVar));
                        com.bytedance.sdk.openadsdk.utils.vj.pcc(ofVar);
                        return true;
                    }
                } else {
                    pcc2 = pcc(dt, ofVar);
                }
                com.bytedance.sdk.openadsdk.oo.gm.pcc(ofVar, str, "open_fallback_url", hashMap);
            } else {
                pcc2 = pcc(ofVar);
            }
            String str2 = pcc2;
            if (ofVar.fg() == 0 && !TextUtils.isEmpty(str2) && str2.contains("play.google.com/store")) {
                String substring = str2.substring(str2.indexOf("?id=") + 4);
                com.bytedance.sdk.openadsdk.oo.gm.pcc(pcc(4, ofVar));
                boolean pcc3 = com.bytedance.sdk.openadsdk.fum.pcc.pcc.sf.pcc(context, str2, substring, str, ofVar);
                if (pcc3) {
                    com.bytedance.sdk.openadsdk.utils.vj.pcc(ofVar);
                }
                return pcc3;
            }
            boolean pcc4 = pcc(context, ofVar, i, pAGNativeAd, pccVar, str, z, str2);
            if (pcc4) {
                com.bytedance.sdk.openadsdk.utils.vj.pcc(ofVar);
            }
            return pcc4;
        }
        com.bytedance.sdk.openadsdk.oo.gm.pcc(pcc(1, ofVar));
        return false;
    }

    private static String pcc(com.bytedance.sdk.openadsdk.core.model.hc hcVar, com.bytedance.sdk.openadsdk.core.model.of ofVar) {
        if (!TextUtils.isEmpty(hcVar.sf())) {
            return hcVar.sf();
        }
        return pcc(ofVar);
    }

    private static String pcc(com.bytedance.sdk.openadsdk.core.model.of ofVar) {
        if (ofVar.on() && ofVar.ibs() != null) {
            return ofVar.ibs().vy();
        }
        return ofVar.xy();
    }

    public static boolean pcc(Context context, com.bytedance.sdk.openadsdk.core.model.of ofVar, int i, String str, boolean z, Map<String, Object> map) {
        if (ofVar == null) {
            return false;
        }
        com.bytedance.sdk.openadsdk.core.model.hc dt = ofVar.dt();
        if (dt != null && !TextUtils.isEmpty(dt.pcc())) {
            if (map == null) {
                map = new HashMap<>();
            }
            return com.bytedance.sdk.openadsdk.fum.pcc.pcc.pcc.pcc(context, dt.pcc(), ofVar, i, map, z);
        }
        vj.pcc(ofVar, str, dt == null ? -1 : -2, dt != null ? dt.oo() : null);
        return false;
    }

    public static boolean pcc(Context context, com.bytedance.sdk.openadsdk.core.model.of ofVar, int i, PAGNativeAd pAGNativeAd, com.bytedance.sdk.openadsdk.core.oo.pcc pccVar, String str, boolean z, String str2) {
        if (TextUtils.isEmpty(str2) && !com.bytedance.sdk.openadsdk.core.model.atb.sf(ofVar)) {
            com.bytedance.sdk.openadsdk.oo.gm.pcc(pcc(5, ofVar));
            return false;
        }
        int az = ofVar.az();
        if (az != 2 && az != 8) {
            com.bytedance.sdk.component.utils.sf.pcc(context, pcc(context, str2, ofVar, i, pAGNativeAd, pccVar, str, z), null);
            pcc = false;
            return true;
        }
        return com.bytedance.sdk.openadsdk.utils.yt.pcc(context, str2, ofVar, sf.pcc.pcc, false);
    }

    public static void pcc(Context context, String str, com.bytedance.sdk.openadsdk.core.model.of ofVar, int i, String str2, boolean z) {
        com.bytedance.sdk.component.utils.sf.pcc(context, pcc(context, str, ofVar, i, (PAGNativeAd) null, (com.bytedance.sdk.openadsdk.core.oo.pcc) null, str2, z), null);
    }

    public static void pcc(Context context, String str, final com.bytedance.sdk.openadsdk.core.model.of ofVar, int i, final String str2, boolean z, lo loVar) {
        com.bytedance.sdk.component.utils.sf.pcc(context, pcc(context, str, ofVar, i, null, null, str2, z, true, loVar), new sf.InterfaceC0055sf() { // from class: com.bytedance.sdk.openadsdk.core.rnn.1
            @Override // com.bytedance.sdk.component.utils.sf.InterfaceC0055sf
            public void pcc() {
                com.bytedance.sdk.openadsdk.oo.gm.pcc(com.bytedance.sdk.openadsdk.core.model.of.this, str2, 3, (JSONObject) null);
            }

            @Override // com.bytedance.sdk.component.utils.sf.InterfaceC0055sf
            public void pcc(Throwable th) {
                com.bytedance.sdk.openadsdk.oo.gm.pcc(com.bytedance.sdk.openadsdk.core.model.of.this, str2, -2, (JSONObject) null);
            }
        });
    }

    private static Intent pcc(Context context, String str, com.bytedance.sdk.openadsdk.core.model.of ofVar, int i, @Nullable PAGNativeAd pAGNativeAd, com.bytedance.sdk.openadsdk.core.oo.pcc pccVar, String str2, boolean z) {
        return pcc(context, str, ofVar, i, pAGNativeAd, pccVar, str2, z, false, null);
    }

    public static boolean pcc(Context context, com.bytedance.sdk.openadsdk.core.model.of ofVar, String str, int i, int i2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("click_countdown_remaining", i2);
            com.bytedance.sdk.openadsdk.oo.gm.wh(ofVar, str, jSONObject);
            Intent pcc2 = pcc(context, ofVar, str, i);
            if (pcc2 == null) {
                return false;
            }
            return com.bytedance.sdk.component.utils.sf.pcc(context, pcc2, null, false);
        } catch (Throwable unused) {
            return false;
        }
    }

    public static Intent pcc(Context context, com.bytedance.sdk.openadsdk.core.model.of ofVar, String str, int i) {
        if (context == null || ofVar == null || !com.bytedance.sdk.openadsdk.core.model.atb.sf(ofVar)) {
            return null;
        }
        Intent intent = new Intent(context, (Class<?>) TTPlayableLandingPageActivity.class);
        intent.putExtra("ad_pending_download", false);
        String vh = com.bytedance.sdk.openadsdk.core.model.atb.vh(ofVar);
        if (!TextUtils.isEmpty(vh)) {
            if (vh.contains("?")) {
                vh = vh.concat("&orientation=portrait");
            } else {
                vh = vh.concat("?orientation=portrait");
            }
        }
        ofVar.vj(vh);
        ofVar.wh(str);
        ofVar.oo(i);
        intent.putExtra("meta_index", atb.pcc().pcc(ofVar));
        return intent;
    }

    public static void pcc(boolean z) {
        pcc = z;
    }

    private static boolean pcc(com.bytedance.sdk.openadsdk.core.model.of ofVar, boolean z) {
        if (z && ofVar != null && ofVar.az() == 4) {
            return com.bytedance.sdk.openadsdk.core.model.atb.sf(ofVar);
        }
        return false;
    }
}

package com.bytedance.adsdk.sf.vj;

import android.graphics.PointF;
import android.util.JsonReader;
import android.util.JsonToken;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.unity3d.services.UnityAdsConstants;
import java.io.IOException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class gm {
    /* JADX WARN: Multi-variable type inference failed */
    private static boolean gm(com.bytedance.adsdk.sf.gm.pcc.sf sfVar) {
        if (sfVar != null) {
            return sfVar.sf() && ((Float) ((com.bytedance.adsdk.sf.qf.pcc) sfVar.gm().get(0)).pcc).floatValue() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:85:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00ec A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static com.bytedance.adsdk.sf.gm.pcc.tmg pcc(JsonReader jsonReader, com.bytedance.adsdk.sf.qf qfVar) throws IOException {
        com.bytedance.adsdk.sf.gm.pcc.sf pcc;
        com.bytedance.adsdk.sf.qf qfVar2 = qfVar;
        Float valueOf = Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        boolean z = jsonReader.peek() == JsonToken.BEGIN_OBJECT;
        if (z) {
            jsonReader.beginObject();
        }
        com.bytedance.adsdk.sf.gm.pcc.sf sfVar = null;
        com.bytedance.adsdk.sf.gm.pcc.vj vjVar = null;
        com.bytedance.adsdk.sf.gm.pcc.hc<PointF, PointF> hcVar = null;
        com.bytedance.adsdk.sf.gm.pcc.qf qfVar3 = null;
        com.bytedance.adsdk.sf.gm.pcc.sf sfVar2 = null;
        com.bytedance.adsdk.sf.gm.pcc.sf sfVar3 = null;
        com.bytedance.adsdk.sf.gm.pcc.oo ooVar = null;
        com.bytedance.adsdk.sf.gm.pcc.sf sfVar4 = null;
        com.bytedance.adsdk.sf.gm.pcc.sf sfVar5 = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            switch (nextName) {
                case "a":
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String nextName2 = jsonReader.nextName();
                        nextName2.getClass();
                        if (nextName2.equals(CampaignEx.JSON_KEY_AD_K)) {
                            vjVar = pcc.pcc(jsonReader, qfVar);
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    qfVar2 = qfVar;
                    break;
                case "o":
                    ooVar = oo.sf(jsonReader, qfVar);
                    qfVar2 = qfVar;
                    break;
                case "p":
                    hcVar = pcc.sf(jsonReader, qfVar);
                    qfVar2 = qfVar;
                    break;
                case "r":
                    pcc = oo.pcc(jsonReader, qfVar2, false);
                    if (!pcc.gm().isEmpty()) {
                        pcc.gm().add(new com.bytedance.adsdk.sf.qf.pcc(qfVar2, valueOf, valueOf, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Float.valueOf(qfVar2.qf())));
                    } else if (((com.bytedance.adsdk.sf.qf.pcc) pcc.gm().get(0)).pcc != 0) {
                        sfVar = pcc;
                        qfVar2 = qfVar;
                        break;
                    } else {
                        pcc.gm().set(0, new com.bytedance.adsdk.sf.qf.pcc(qfVar, valueOf, valueOf, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Float.valueOf(qfVar.qf())));
                    }
                    qfVar2 = qfVar;
                    sfVar = pcc;
                    break;
                case "s":
                    qfVar3 = oo.oo(jsonReader, qfVar);
                    break;
                case "eo":
                    sfVar5 = oo.pcc(jsonReader, qfVar2, false);
                    break;
                case "rz":
                    qfVar2.pcc("Lottie doesn't support 3D layers.");
                    pcc = oo.pcc(jsonReader, qfVar2, false);
                    if (!pcc.gm().isEmpty()) {
                    }
                    qfVar2 = qfVar;
                    sfVar = pcc;
                    break;
                case "sa":
                    sfVar3 = oo.pcc(jsonReader, qfVar2, false);
                    break;
                case "sk":
                    sfVar2 = oo.pcc(jsonReader, qfVar2, false);
                    break;
                case "so":
                    sfVar4 = oo.pcc(jsonReader, qfVar2, false);
                    break;
                default:
                    jsonReader.skipValue();
                    qfVar2 = qfVar;
                    break;
            }
        }
        if (z) {
            jsonReader.endObject();
        }
        return new com.bytedance.adsdk.sf.gm.pcc.tmg(pcc(vjVar) ? null : vjVar, pcc(hcVar) ? null : hcVar, pcc(qfVar3) ? null : qfVar3, pcc(sfVar) ? null : sfVar, ooVar, sfVar4, sfVar5, sf(sfVar2) ? null : sfVar2, gm(sfVar3) ? null : sfVar3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean sf(com.bytedance.adsdk.sf.gm.pcc.sf sfVar) {
        if (sfVar != null) {
            return sfVar.sf() && ((Float) ((com.bytedance.adsdk.sf.qf.pcc) sfVar.gm().get(0)).pcc).floatValue() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        return true;
    }

    private static boolean pcc(com.bytedance.adsdk.sf.gm.pcc.vj vjVar) {
        if (vjVar != null) {
            return vjVar.sf() && vjVar.gm().get(0).pcc.equals(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        return true;
    }

    private static boolean pcc(com.bytedance.adsdk.sf.gm.pcc.hc<PointF, PointF> hcVar) {
        if (hcVar != null) {
            return !(hcVar instanceof com.bytedance.adsdk.sf.gm.pcc.vy) && hcVar.sf() && hcVar.gm().get(0).pcc.equals(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean pcc(com.bytedance.adsdk.sf.gm.pcc.sf sfVar) {
        if (sfVar != null) {
            return sfVar.sf() && ((Float) ((com.bytedance.adsdk.sf.qf.pcc) sfVar.gm().get(0)).pcc).floatValue() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean pcc(com.bytedance.adsdk.sf.gm.pcc.qf qfVar) {
        if (qfVar != null) {
            return qfVar.sf() && ((com.bytedance.adsdk.sf.qf.gm) ((com.bytedance.adsdk.sf.qf.pcc) qfVar.gm().get(0)).pcc).sf(1.0f, 1.0f);
        }
        return true;
    }
}

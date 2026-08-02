package com.bytedance.adsdk.sf.vj;

import android.graphics.Rect;
import android.util.JsonReader;
import android.util.LongSparseArray;
import android.util.SparseArray;
import com.bytedance.adsdk.sf.gm.gm.vj;
import com.bytedance.adsdk.sf.ork;
import com.bytedance.adsdk.sf.qf;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.mbridge.msdk.foundation.controller.a;
import com.mbridge.msdk.foundation.same.report.h;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.unity3d.services.UnityAdsConstants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class of {
    private static JSONArray gm(JsonReader jsonReader) {
        JSONArray jSONArray = new JSONArray();
        try {
            jsonReader.beginArray();
            while (jsonReader.hasNext()) {
                JSONObject jSONObject = new JSONObject();
                jSONArray.put(jSONObject);
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String nextName = jsonReader.nextName();
                    int hashCode = nextName.hashCode();
                    if (hashCode != 3324) {
                        if (hashCode == 116753 && nextName.equals("vid")) {
                            try {
                                jSONObject.put("vid", jsonReader.nextString());
                            } catch (JSONException unused) {
                            }
                        }
                    } else if (nextName.equals("hd")) {
                        jSONObject.put("hd", jsonReader.nextInt());
                    }
                    jsonReader.skipValue();
                }
                jsonReader.endObject();
            }
            jsonReader.endArray();
        } catch (Exception unused2) {
        }
        return jSONArray;
    }

    private static List<ork.pcc> oo(JsonReader jsonReader) {
        try {
            ArrayList arrayList = new ArrayList();
            while (jsonReader.hasNext()) {
                ork.pcc pccVar = new ork.pcc();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String nextName = jsonReader.nextName();
                    int hashCode = nextName.hashCode();
                    if (hashCode != 99) {
                        if (hashCode != 102) {
                            if (hashCode != 108) {
                                if (hashCode != 115) {
                                    if (hashCode != 3153) {
                                        if (hashCode != 3449) {
                                            if (hashCode == 96670 && nextName.equals("ali")) {
                                                pccVar.qf = jsonReader.nextString();
                                            }
                                            jsonReader.skipValue();
                                        } else if (nextName.equals("le")) {
                                            pccVar.sf = jsonReader.nextInt();
                                        } else {
                                            jsonReader.skipValue();
                                        }
                                    } else if (nextName.equals("bs")) {
                                        pccVar.wh = jsonReader.nextInt();
                                    } else {
                                        jsonReader.skipValue();
                                    }
                                } else if (nextName.equals("s")) {
                                    pccVar.vj = jsonReader.nextInt();
                                } else {
                                    jsonReader.skipValue();
                                }
                            } else if (nextName.equals("l")) {
                                pccVar.pcc = jsonReader.nextInt();
                            } else {
                                jsonReader.skipValue();
                            }
                        } else if (nextName.equals(InneractiveMediationDefs.GENDER_FEMALE)) {
                            pccVar.oo = jsonReader.nextString();
                        } else {
                            jsonReader.skipValue();
                        }
                    } else if (nextName.equals(a.q)) {
                        pccVar.gm = jsonReader.nextString();
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
                arrayList.add(pccVar);
            }
            return arrayList;
        } catch (Exception unused) {
            return null;
        }
    }

    public static com.bytedance.adsdk.sf.qf pcc(JsonReader jsonReader) throws IOException {
        float f;
        float pcc = com.bytedance.adsdk.sf.wh.wh.pcc();
        LongSparseArray<com.bytedance.adsdk.sf.gm.gm.vj> longSparseArray = new LongSparseArray<>();
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        SparseArray<com.bytedance.adsdk.sf.gm.oo> sparseArray = new SparseArray<>();
        qf.gm gmVar = new qf.gm();
        qf.pcc pccVar = new qf.pcc();
        qf.sf sfVar = new qf.sf();
        com.bytedance.adsdk.sf.qf qfVar = new com.bytedance.adsdk.sf.qf();
        jsonReader.beginObject();
        float f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        float f3 = 0.0f;
        String str = null;
        int i = 0;
        int i2 = 0;
        float f4 = 0.0f;
        while (jsonReader.hasNext()) {
            float f5 = f2;
            String nextName = jsonReader.nextName();
            nextName.getClass();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1408207997:
                    f = f4;
                    if (nextName.equals("assets")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1109732030:
                    f = f4;
                    if (nextName.equals("layers")) {
                        c = 1;
                        break;
                    }
                    break;
                case -865448777:
                    f = f4;
                    if (nextName.equals("globalEvent")) {
                        c = 2;
                        break;
                    }
                    break;
                case 104:
                    f = f4;
                    if (nextName.equals(h.b)) {
                        c = 3;
                        break;
                    }
                    break;
                case PROTOBUF_SERIALIZATION_ERROR_VALUE:
                    f = f4;
                    if (nextName.equals("v")) {
                        c = 4;
                        break;
                    }
                    break;
                case JSON_ENCODE_ERROR_VALUE:
                    f = f4;
                    if (nextName.equals("w")) {
                        c = 5;
                        break;
                    }
                    break;
                case 3208:
                    f = f4;
                    if (nextName.equals("dl")) {
                        c = 6;
                        break;
                    }
                    break;
                case 3276:
                    f = f4;
                    if (nextName.equals("fr")) {
                        c = 7;
                        break;
                    }
                    break;
                case 3292:
                    f = f4;
                    if (nextName.equals("gc")) {
                        c = '\b';
                        break;
                    }
                    break;
                case 3367:
                    f = f4;
                    if (nextName.equals("ip")) {
                        c = '\t';
                        break;
                    }
                    break;
                case 3553:
                    f = f4;
                    if (nextName.equals("op")) {
                        c = '\n';
                        break;
                    }
                    break;
                case 94623709:
                    f = f4;
                    if (nextName.equals("chars")) {
                        c = 11;
                        break;
                    }
                    break;
                case 97615364:
                    f = f4;
                    if (nextName.equals("fonts")) {
                        c = '\f';
                        break;
                    }
                    break;
                case 110364485:
                    f = f4;
                    if (nextName.equals("timer")) {
                        c = '\r';
                        break;
                    }
                    break;
                case 839250809:
                    f = f4;
                    if (nextName.equals("markers")) {
                        c = 14;
                        break;
                    }
                    break;
                default:
                    f = f4;
                    break;
            }
            switch (c) {
                case 0:
                    pcc(jsonReader, qfVar, hashMap, hashMap2);
                    f2 = f5;
                    f4 = f;
                    break;
                case 1:
                    pcc(jsonReader, qfVar, arrayList, longSparseArray);
                    f2 = f5;
                    f4 = f;
                    break;
                case 2:
                    pcc(jsonReader, sfVar);
                    f2 = f5;
                    f4 = f;
                    break;
                case 3:
                    i = jsonReader.nextInt();
                    f2 = f5;
                    f4 = f;
                    break;
                case 4:
                    String[] split = jsonReader.nextString().split("\\.");
                    if (!com.bytedance.adsdk.sf.wh.wh.pcc(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2]), 4, 4, 0)) {
                        qfVar.pcc("Lottie only supports bodymovin >= 4.4.0");
                    }
                    f2 = f5;
                    f4 = f;
                    break;
                case 5:
                    i2 = jsonReader.nextInt();
                    f2 = f5;
                    f4 = f;
                    break;
                case 6:
                    str = jsonReader.nextString();
                    f2 = f5;
                    f4 = f;
                    break;
                case 7:
                    f3 = (float) jsonReader.nextDouble();
                    f2 = f5;
                    f4 = f;
                    break;
                case '\b':
                    pcc(jsonReader, pccVar);
                    f2 = f5;
                    f4 = f;
                    break;
                case '\t':
                    f2 = (float) jsonReader.nextDouble();
                    f4 = f;
                    break;
                case '\n':
                    f4 = ((float) jsonReader.nextDouble()) - 0.01f;
                    f2 = f5;
                    break;
                case 11:
                    pcc(jsonReader, qfVar, sparseArray);
                    f2 = f5;
                    f4 = f;
                    break;
                case '\f':
                    pcc(jsonReader, hashMap3);
                    f2 = f5;
                    f4 = f;
                    break;
                case '\r':
                    pcc(jsonReader, gmVar);
                    f2 = f5;
                    f4 = f;
                    break;
                case 14:
                    pcc(jsonReader, arrayList2);
                    f2 = f5;
                    f4 = f;
                    break;
                default:
                    jsonReader.skipValue();
                    f2 = f5;
                    f4 = f;
                    break;
            }
        }
        jsonReader.endObject();
        qfVar.pcc(new Rect(0, 0, (int) (i2 * pcc), (int) (i * pcc)), f2, f4, f3, arrayList, longSparseArray, hashMap, hashMap2, sparseArray, hashMap3, arrayList2, gmVar, str, pccVar, sfVar);
        return qfVar;
    }

    private static Map<String, Object> sf(JsonReader jsonReader) throws IOException {
        HashMap hashMap = new HashMap();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            if (nextName.equals("lel")) {
                hashMap.put("lel", gm(jsonReader));
            } else if (nextName.equals("lottie_back")) {
                JSONObject jSONObject = new JSONObject();
                hashMap.put("lottie_back", jSONObject);
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String nextName2 = jsonReader.nextName();
                    nextName2.getClass();
                    if (nextName2.equals("hd")) {
                        try {
                            jSONObject.putOpt("hd", Integer.valueOf(jsonReader.nextInt()));
                            jSONObject.putOpt("vid", "lottie_back");
                        } catch (JSONException unused) {
                        }
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        Object remove = hashMap.remove("lottie_back");
        if (remove instanceof JSONObject) {
            Object obj = hashMap.get("lel");
            if (obj instanceof JSONArray) {
                ((JSONArray) obj).put(remove);
            } else {
                JSONArray jSONArray = new JSONArray();
                jSONArray.put(remove);
                hashMap.put("lel", jSONArray);
            }
        }
        return hashMap;
    }

    private static void sf(JsonReader jsonReader, qf.pcc pccVar) {
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                int hashCode = nextName.hashCode();
                if (hashCode != 3239) {
                    if (hashCode == 3276) {
                        if (nextName.equals("fr")) {
                            pccVar.vj = jsonReader.nextInt();
                        } else {
                            jsonReader.skipValue();
                        }
                    } else {
                        if (hashCode == 107027 && nextName.equals("lel")) {
                            pccVar.qf = gm(jsonReader);
                        }
                        jsonReader.skipValue();
                    }
                } else if (nextName.equals("el")) {
                    pccVar.wh = jsonReader.nextString();
                } else {
                    jsonReader.skipValue();
                }
            }
            jsonReader.endObject();
        } catch (IOException unused) {
        }
    }

    private static void pcc(JsonReader jsonReader, qf.sf sfVar) {
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                int hashCode = nextName.hashCode();
                if (hashCode != 3239) {
                    if (hashCode == 107027) {
                        if (nextName.equals("lel")) {
                            sfVar.gm = gm(jsonReader);
                        } else {
                            jsonReader.skipValue();
                        }
                    } else {
                        if (hashCode == 3237004 && nextName.equals("inel")) {
                            sfVar.sf = new int[][]{new int[]{-1, -1}};
                            jsonReader.beginArray();
                            if (jsonReader.hasNext()) {
                                jsonReader.beginArray();
                                for (int i = 0; i < 2; i++) {
                                    if (jsonReader.hasNext()) {
                                        sfVar.sf[0][i] = jsonReader.nextInt();
                                    }
                                }
                                jsonReader.endArray();
                            }
                            jsonReader.endArray();
                        }
                        jsonReader.skipValue();
                    }
                } else if (nextName.equals("el")) {
                    sfVar.pcc = jsonReader.nextString();
                } else {
                    jsonReader.skipValue();
                }
            }
            jsonReader.endObject();
        } catch (Exception unused) {
        }
    }

    private static void pcc(JsonReader jsonReader, qf.pcc pccVar) {
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                int hashCode = nextName.hashCode();
                if (hashCode != 3139) {
                    if (hashCode != 3232) {
                        if (hashCode != 3571) {
                            if (hashCode == 3666) {
                                if (nextName.equals("se")) {
                                    pccVar.pcc = jsonReader.nextInt();
                                } else {
                                    jsonReader.skipValue();
                                }
                            } else {
                                if (hashCode == 98713 && nextName.equals("cpf")) {
                                    sf(jsonReader, pccVar);
                                }
                                jsonReader.skipValue();
                            }
                        } else if (nextName.equals("pc")) {
                            pccVar.oo = jsonReader.nextInt();
                        } else {
                            jsonReader.skipValue();
                        }
                    } else if (nextName.equals("ee")) {
                        pccVar.gm = sf(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                } else if (nextName.equals("be")) {
                    pccVar.sf = sf(jsonReader);
                } else {
                    jsonReader.skipValue();
                }
            }
            jsonReader.endObject();
        } catch (Exception unused) {
        }
    }

    private static void pcc(JsonReader jsonReader, qf.gm gmVar) {
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                int hashCode = nextName.hashCode();
                if (hashCode != 3123) {
                    if (hashCode != 3239) {
                        if (hashCode != 3355) {
                            if (hashCode != 3418) {
                                if (hashCode != 3704) {
                                    if (hashCode == 107027) {
                                        if (nextName.equals("lel")) {
                                            gmVar.qf = gm(jsonReader);
                                        } else {
                                            jsonReader.skipValue();
                                        }
                                    } else {
                                        if (hashCode == 3237004 && nextName.equals("inel")) {
                                            gmVar.vj = new int[]{-1, -1};
                                            jsonReader.beginArray();
                                            for (int i = 0; i < 2; i++) {
                                                if (jsonReader.hasNext()) {
                                                    gmVar.vj[i] = jsonReader.nextInt();
                                                }
                                            }
                                            jsonReader.endArray();
                                        }
                                        jsonReader.skipValue();
                                    }
                                } else if (nextName.equals("tl")) {
                                    gmVar.gm = jsonReader.nextString();
                                } else {
                                    jsonReader.skipValue();
                                }
                            } else if (nextName.equals("ke")) {
                                gmVar.pcc = jsonReader.nextInt();
                            } else {
                                jsonReader.skipValue();
                            }
                        } else if (nextName.equals("id")) {
                            gmVar.sf = jsonReader.nextString();
                        } else {
                            jsonReader.skipValue();
                        }
                    } else if (nextName.equals("el")) {
                        gmVar.wh = jsonReader.nextString();
                    } else {
                        jsonReader.skipValue();
                    }
                } else if (nextName.equals("at")) {
                    gmVar.oo = jsonReader.nextString();
                } else {
                    jsonReader.skipValue();
                }
            }
            jsonReader.endObject();
        } catch (Exception unused) {
        }
    }

    private static void pcc(JsonReader jsonReader, com.bytedance.adsdk.sf.qf qfVar, List<com.bytedance.adsdk.sf.gm.gm.vj> list, LongSparseArray<com.bytedance.adsdk.sf.gm.gm.vj> longSparseArray) throws IOException {
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            com.bytedance.adsdk.sf.gm.gm.vj pcc = tz.pcc(jsonReader, qfVar);
            pcc.vh();
            vj.pcc pccVar = vj.pcc.PRE_COMP;
            list.add(pcc);
            longSparseArray.put(pcc.vj(), pcc);
        }
        jsonReader.endArray();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static void pcc(JsonReader jsonReader, com.bytedance.adsdk.sf.qf qfVar, Map<String, List<com.bytedance.adsdk.sf.gm.gm.vj>> map, Map<String, com.bytedance.adsdk.sf.ork> map2) throws IOException {
        char c;
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            ArrayList arrayList = new ArrayList();
            LongSparseArray longSparseArray = new LongSparseArray();
            jsonReader.beginObject();
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            List<ork.pcc> list = null;
            String str5 = null;
            int[][] iArr = null;
            JSONArray jSONArray = null;
            int i = 0;
            int i2 = 0;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                nextName.getClass();
                switch (nextName.hashCode()) {
                    case -1109732030:
                        if (nextName.equals("layers")) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    case 104:
                        if (nextName.equals(h.b)) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case 112:
                        if (nextName.equals(TtmlNode.TAG_P)) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    case ASSET_FAILED_STATUS_CODE_VALUE:
                        if (nextName.equals("u")) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    case JSON_ENCODE_ERROR_VALUE:
                        if (nextName.equals("w")) {
                            c = 4;
                            break;
                        }
                        c = 65535;
                        break;
                    case 3239:
                        if (nextName.equals("el")) {
                            c = 5;
                            break;
                        }
                        c = 65535;
                        break;
                    case 3355:
                        if (nextName.equals("id")) {
                            c = 6;
                            break;
                        }
                        c = 65535;
                        break;
                    case 3695:
                        if (nextName.equals("tc")) {
                            c = 7;
                            break;
                        }
                        c = 65535;
                        break;
                    case 107027:
                        if (nextName.equals("lel")) {
                            c = '\b';
                            break;
                        }
                        c = 65535;
                        break;
                    case 112793:
                        if (nextName.equals("rel")) {
                            c = '\t';
                            break;
                        }
                        c = 65535;
                        break;
                    case 3237004:
                        if (nextName.equals("inel")) {
                            c = '\n';
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
                        jsonReader.beginArray();
                        while (jsonReader.hasNext()) {
                            com.bytedance.adsdk.sf.gm.gm.vj pcc = tz.pcc(jsonReader, qfVar);
                            longSparseArray.put(pcc.vj(), pcc);
                            arrayList.add(pcc);
                        }
                        jsonReader.endArray();
                        break;
                    case 1:
                        i2 = jsonReader.nextInt();
                        break;
                    case 2:
                        str2 = jsonReader.nextString();
                        break;
                    case 3:
                        str3 = jsonReader.nextString();
                        break;
                    case 4:
                        i = jsonReader.nextInt();
                        break;
                    case 5:
                        str5 = jsonReader.nextString();
                        break;
                    case 6:
                        str = jsonReader.nextString();
                        break;
                    case 7:
                        jsonReader.beginArray();
                        list = oo(jsonReader);
                        jsonReader.endArray();
                        break;
                    case '\b':
                        jSONArray = gm(jsonReader);
                        break;
                    case '\t':
                        str4 = jsonReader.nextString();
                        break;
                    case '\n':
                        iArr = new int[][]{new int[]{-1, -1}};
                        jsonReader.beginArray();
                        if (jsonReader.hasNext()) {
                            jsonReader.beginArray();
                            for (int i3 = 0; i3 < 2; i3++) {
                                if (jsonReader.hasNext()) {
                                    iArr[0][i3] = jsonReader.nextInt();
                                }
                            }
                            jsonReader.endArray();
                        }
                        jsonReader.endArray();
                        break;
                    default:
                        jsonReader.skipValue();
                        break;
                }
            }
            jsonReader.endObject();
            if (str2 != null) {
                com.bytedance.adsdk.sf.ork orkVar = new com.bytedance.adsdk.sf.ork(i, i2, str, str2, str3, str4, list, str5, iArr, jSONArray);
                map2.put(orkVar.kj(), orkVar);
            } else {
                map.put(str, arrayList);
            }
        }
        jsonReader.endArray();
    }

    private static void pcc(JsonReader jsonReader, Map<String, com.bytedance.adsdk.sf.gm.gm> map) throws IOException {
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            if (!nextName.equals("list")) {
                jsonReader.skipValue();
            } else {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    com.bytedance.adsdk.sf.gm.gm pcc = gbb.pcc(jsonReader);
                    map.put(pcc.sf(), pcc);
                }
                jsonReader.endArray();
            }
        }
        jsonReader.endObject();
    }

    private static void pcc(JsonReader jsonReader, com.bytedance.adsdk.sf.qf qfVar, SparseArray<com.bytedance.adsdk.sf.gm.oo> sparseArray) throws IOException {
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            com.bytedance.adsdk.sf.gm.oo pcc = hc.pcc(jsonReader, qfVar);
            sparseArray.put(pcc.hashCode(), pcc);
        }
        jsonReader.endArray();
    }

    private static void pcc(JsonReader jsonReader, List<com.bytedance.adsdk.sf.gm.wh> list) throws IOException {
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            jsonReader.beginObject();
            float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            String str = null;
            float f2 = 0.0f;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                nextName.getClass();
                switch (nextName) {
                    case "cm":
                        str = jsonReader.nextString();
                        break;
                    case "dr":
                        f2 = (float) jsonReader.nextDouble();
                        break;
                    case "tm":
                        f = (float) jsonReader.nextDouble();
                        break;
                    default:
                        jsonReader.skipValue();
                        break;
                }
            }
            jsonReader.endObject();
            list.add(new com.bytedance.adsdk.sf.gm.wh(str, f, f2));
        }
        jsonReader.endArray();
    }
}

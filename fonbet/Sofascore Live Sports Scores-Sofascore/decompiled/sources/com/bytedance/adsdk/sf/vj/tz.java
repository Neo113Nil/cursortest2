package com.bytedance.adsdk.sf.vj;

import android.graphics.Color;
import android.graphics.Rect;
import android.util.JsonReader;
import com.bytedance.adsdk.sf.gm.gm.vj;
import com.unity3d.services.UnityAdsConstants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class tz {

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.bytedance.adsdk.sf.vj.tz$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] pcc;

        static {
            int[] iArr = new int[vj.sf.values().length];
            pcc = iArr;
            try {
                iArr[vj.sf.LUMA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                pcc[vj.sf.LUMA_INVERTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static com.bytedance.adsdk.sf.gm.gm.vj pcc(JsonReader jsonReader, com.bytedance.adsdk.sf.qf qfVar) throws IOException {
        Float f;
        Float valueOf = Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        Float valueOf2 = Float.valueOf(1.0f);
        vj.sf sfVar = vj.sf.NONE;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        jsonReader.beginObject();
        vj.sf sfVar2 = sfVar;
        String str = null;
        com.bytedance.adsdk.sf.gm.pcc.tmg tmgVar = null;
        com.bytedance.adsdk.sf.gm.pcc.ork orkVar = null;
        com.bytedance.adsdk.sf.gm.pcc.vh vhVar = null;
        com.bytedance.adsdk.sf.gm.pcc.sf sfVar3 = null;
        com.bytedance.adsdk.sf.gm.sf.pcc pccVar = null;
        ork orkVar2 = null;
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        long j = 0;
        long j2 = -1;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        float f7 = 1.0f;
        String str2 = "UNSET";
        String str3 = null;
        vj.pcc pccVar2 = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            switch (nextName) {
                case "parent":
                    j2 = jsonReader.nextInt();
                    break;
                case "shapes":
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        com.bytedance.adsdk.sf.gm.sf.gm pcc = kj.pcc(jsonReader, qfVar);
                        if (pcc != null) {
                            arrayList2.add(pcc);
                        }
                    }
                    jsonReader.endArray();
                    break;
                case "h":
                    f5 = (float) (jsonReader.nextDouble() * com.bytedance.adsdk.sf.wh.wh.pcc());
                    break;
                case "t":
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String nextName2 = jsonReader.nextName();
                        nextName2.getClass();
                        if (nextName2.equals("a")) {
                            jsonReader.beginArray();
                            if (jsonReader.hasNext()) {
                                vhVar = sf.pcc(jsonReader, qfVar);
                            }
                            while (jsonReader.hasNext()) {
                                jsonReader.skipValue();
                            }
                            jsonReader.endArray();
                        } else if (nextName2.equals("d")) {
                            orkVar = oo.wh(jsonReader, qfVar);
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    break;
                case "w":
                    f4 = (float) (jsonReader.nextDouble() * com.bytedance.adsdk.sf.wh.wh.pcc());
                    break;
                case "cl":
                    str3 = jsonReader.nextString();
                    break;
                case "ef":
                    jsonReader.beginArray();
                    ArrayList arrayList3 = new ArrayList();
                    while (jsonReader.hasNext()) {
                        jsonReader.beginObject();
                        while (jsonReader.hasNext()) {
                            String nextName3 = jsonReader.nextName();
                            nextName3.getClass();
                            if (nextName3.equals("nm")) {
                                arrayList3.add(jsonReader.nextString());
                            } else if (nextName3.equals("ty")) {
                                int nextInt = jsonReader.nextInt();
                                if (nextInt == 29) {
                                    pccVar = vj.pcc(jsonReader, qfVar);
                                } else if (nextInt == 25) {
                                    orkVar2 = new vh().pcc(jsonReader, qfVar);
                                }
                            } else {
                                jsonReader.skipValue();
                            }
                        }
                        jsonReader.endObject();
                    }
                    jsonReader.endArray();
                    qfVar.pcc("Lottie doesn't support layer effects. If you are using them for  fills, strokes, trim paths etc. then try adding them directly as contents  in your shape. Found: ".concat(String.valueOf(arrayList3)));
                    break;
                case "hd":
                    z = jsonReader.nextBoolean();
                    break;
                case "ip":
                    f2 = (float) jsonReader.nextDouble();
                    break;
                case "ks":
                    tmgVar = gm.pcc(jsonReader, qfVar);
                    break;
                case "nm":
                    str2 = jsonReader.nextString();
                    break;
                case "op":
                    f3 = (float) jsonReader.nextDouble();
                    break;
                case "sc":
                    i3 = Color.parseColor(jsonReader.nextString());
                    break;
                case "sh":
                    i2 = (int) (com.bytedance.adsdk.sf.wh.wh.pcc() * jsonReader.nextInt());
                    break;
                case "sr":
                    f7 = (float) jsonReader.nextDouble();
                    break;
                case "st":
                    f6 = (float) jsonReader.nextDouble();
                    break;
                case "sw":
                    i = (int) (com.bytedance.adsdk.sf.wh.wh.pcc() * jsonReader.nextInt());
                    break;
                case "tm":
                    sfVar3 = oo.pcc(jsonReader, qfVar, false);
                    break;
                case "tt":
                    int nextInt2 = jsonReader.nextInt();
                    if (nextInt2 < vj.sf.values().length) {
                        sfVar2 = vj.sf.values()[nextInt2];
                        int i4 = AnonymousClass1.pcc[sfVar2.ordinal()];
                        if (i4 == 1) {
                            qfVar.pcc("Unsupported matte type: Luma");
                        } else if (i4 == 2) {
                            qfVar.pcc("Unsupported matte type: Luma Inverted");
                        }
                        qfVar.pcc(1);
                        break;
                    } else {
                        qfVar.pcc("Unsupported matte type: ".concat(String.valueOf(nextInt2)));
                        break;
                    }
                case "ty":
                    int nextInt3 = jsonReader.nextInt();
                    pccVar2 = vj.pcc.UNKNOWN;
                    if (nextInt3 >= pccVar2.ordinal()) {
                        break;
                    } else {
                        pccVar2 = vj.pcc.values()[nextInt3];
                        break;
                    }
                case "ind":
                    j = jsonReader.nextInt();
                    break;
                case "refId":
                    str = jsonReader.nextString();
                    break;
                case "masksProperties":
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        arrayList.add(yt.pcc(jsonReader, qfVar));
                    }
                    qfVar.pcc(arrayList.size());
                    jsonReader.endArray();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        ArrayList arrayList4 = new ArrayList();
        if (f2 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            f = valueOf;
            arrayList4.add(new com.bytedance.adsdk.sf.qf.pcc(qfVar, valueOf, valueOf, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Float.valueOf(f2)));
        } else {
            f = valueOf;
        }
        if (f3 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            f3 = qfVar.qf();
        }
        arrayList4.add(new com.bytedance.adsdk.sf.qf.pcc(qfVar, valueOf2, valueOf2, null, f2, Float.valueOf(f3)));
        arrayList4.add(new com.bytedance.adsdk.sf.qf.pcc(qfVar, f, f, null, f3, Float.valueOf(Float.MAX_VALUE)));
        if (str2.endsWith(".ai") || "ai".equals(str3)) {
            qfVar.pcc("Convert your Illustrator layers to shape layers.");
        }
        return new com.bytedance.adsdk.sf.gm.gm.vj(arrayList2, qfVar, str2, j, pccVar2, j2, str, arrayList, tmgVar, i, i2, i3, f7, f6, f4, f5, orkVar, vhVar, arrayList4, sfVar2, sfVar3, z, pccVar, orkVar2);
    }

    public static com.bytedance.adsdk.sf.gm.gm.vj pcc(com.bytedance.adsdk.sf.qf qfVar) {
        Rect oo = qfVar.oo();
        List list = Collections.EMPTY_LIST;
        return new com.bytedance.adsdk.sf.gm.gm.vj(list, qfVar, "__container", -1L, vj.pcc.PRE_COMP, -1L, null, list, new com.bytedance.adsdk.sf.gm.pcc.tmg(), 0, 0, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, oo.width(), oo.height(), null, null, list, vj.sf.NONE, null, false, null, null);
    }
}

package com.bytedance.adsdk.sf.vj;

import android.util.JsonReader;
import java.io.IOException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class vh {
    private com.bytedance.adsdk.sf.gm.pcc.sf gm;
    private com.bytedance.adsdk.sf.gm.pcc.sf oo;
    private com.bytedance.adsdk.sf.gm.pcc.pcc pcc;
    private com.bytedance.adsdk.sf.gm.pcc.sf sf;
    private com.bytedance.adsdk.sf.gm.pcc.sf vj;

    private void sf(JsonReader jsonReader, com.bytedance.adsdk.sf.qf qfVar) throws IOException {
        jsonReader.beginObject();
        String str = "";
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            if (nextName.equals("v")) {
                str.getClass();
                switch (str) {
                    case "Distance":
                        this.oo = oo.pcc(jsonReader, qfVar);
                        break;
                    case "Opacity":
                        this.sf = oo.pcc(jsonReader, qfVar, false);
                        break;
                    case "Direction":
                        this.gm = oo.pcc(jsonReader, qfVar, false);
                        break;
                    case "Shadow Color":
                        this.pcc = oo.qf(jsonReader, qfVar);
                        break;
                    case "Softness":
                        this.vj = oo.pcc(jsonReader, qfVar);
                        break;
                    default:
                        jsonReader.skipValue();
                        break;
                }
            } else if (nextName.equals("nm")) {
                str = jsonReader.nextString();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
    }

    public ork pcc(JsonReader jsonReader, com.bytedance.adsdk.sf.qf qfVar) throws IOException {
        com.bytedance.adsdk.sf.gm.pcc.sf sfVar;
        com.bytedance.adsdk.sf.gm.pcc.sf sfVar2;
        com.bytedance.adsdk.sf.gm.pcc.sf sfVar3;
        com.bytedance.adsdk.sf.gm.pcc.sf sfVar4;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            if (nextName.equals("ef")) {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    sf(jsonReader, qfVar);
                }
                jsonReader.endArray();
            } else {
                jsonReader.skipValue();
            }
        }
        com.bytedance.adsdk.sf.gm.pcc.pcc pccVar = this.pcc;
        if (pccVar == null || (sfVar = this.sf) == null || (sfVar2 = this.gm) == null || (sfVar3 = this.oo) == null || (sfVar4 = this.vj) == null) {
            return null;
        }
        return new ork(pccVar, sfVar, sfVar2, sfVar3, sfVar4);
    }
}

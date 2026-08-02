package com.bytedance.adsdk.sf.vj;

import android.util.JsonReader;
import com.bytedance.adsdk.sf.gm.sf.lu;
import com.ironsource.C4427z5;
import com.mbridge.msdk.foundation.controller.a;
import com.vungle.ads.internal.task.g;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
class kun {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static com.bytedance.adsdk.sf.gm.sf.lu pcc(JsonReader jsonReader, com.bytedance.adsdk.sf.qf qfVar) throws IOException {
        char c;
        char c2;
        int i;
        ArrayList arrayList = new ArrayList();
        float f = 0.0f;
        com.bytedance.adsdk.sf.gm.pcc.oo ooVar = null;
        String str = null;
        com.bytedance.adsdk.sf.gm.pcc.sf sfVar = null;
        com.bytedance.adsdk.sf.gm.pcc.pcc pccVar = null;
        com.bytedance.adsdk.sf.gm.pcc.sf sfVar2 = null;
        lu.pcc pccVar2 = null;
        lu.sf sfVar3 = null;
        boolean z = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            int i2 = 1;
            switch (nextName.hashCode()) {
                case 99:
                    if (nextName.equals(a.q)) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 100:
                    if (nextName.equals("d")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 111:
                    if (nextName.equals("o")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case JSON_ENCODE_ERROR_VALUE:
                    if (nextName.equals("w")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 3324:
                    if (nextName.equals("hd")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 3447:
                    if (nextName.equals("lc")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 3454:
                    if (nextName.equals("lj")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case 3487:
                    if (nextName.equals("ml")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case 3519:
                    if (nextName.equals("nm")) {
                        c = '\b';
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
                    pccVar = oo.qf(jsonReader, qfVar);
                    continue;
                case 1:
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        jsonReader.beginObject();
                        String str2 = null;
                        com.bytedance.adsdk.sf.gm.pcc.sf sfVar4 = null;
                        while (jsonReader.hasNext()) {
                            String nextName2 = jsonReader.nextName();
                            nextName2.getClass();
                            if (nextName2.equals(C4427z5.q)) {
                                str2 = jsonReader.nextString();
                            } else if (nextName2.equals("v")) {
                                sfVar4 = oo.pcc(jsonReader, qfVar);
                            } else {
                                jsonReader.skipValue();
                            }
                        }
                        jsonReader.endObject();
                        str2.getClass();
                        switch (str2.hashCode()) {
                            case 100:
                                if (str2.equals("d")) {
                                    c2 = 0;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 103:
                                if (str2.equals(g.e)) {
                                    c2 = 1;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 111:
                                if (str2.equals("o")) {
                                    c2 = 2;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            default:
                                c2 = 65535;
                                break;
                        }
                        switch (c2) {
                            case 0:
                            case 1:
                                i = 1;
                                qfVar.pcc(true);
                                arrayList.add(sfVar4);
                                i2 = i;
                                break;
                            case 2:
                                sfVar = sfVar4;
                                i2 = 1;
                                break;
                            default:
                                i = 1;
                                i2 = i;
                                break;
                        }
                    }
                    int i3 = i2;
                    jsonReader.endArray();
                    if (arrayList.size() != i3) {
                        break;
                    } else {
                        arrayList.add(arrayList.get(0));
                        break;
                    }
                case 2:
                    ooVar = oo.sf(jsonReader, qfVar);
                    continue;
                case 3:
                    sfVar2 = oo.pcc(jsonReader, qfVar);
                    continue;
                case 4:
                    z = jsonReader.nextBoolean();
                    continue;
                case 5:
                    pccVar2 = lu.pcc.values()[jsonReader.nextInt() - 1];
                    continue;
                case 6:
                    sfVar3 = lu.sf.values()[jsonReader.nextInt() - 1];
                    continue;
                case 7:
                    f = (float) jsonReader.nextDouble();
                    continue;
                case '\b':
                    str = jsonReader.nextString();
                    continue;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        if (ooVar == null) {
            ooVar = new com.bytedance.adsdk.sf.gm.pcc.oo(Collections.singletonList(new com.bytedance.adsdk.sf.qf.pcc(100)));
        }
        return new com.bytedance.adsdk.sf.gm.sf.lu(str, sfVar, arrayList, pccVar, ooVar, sfVar2, pccVar2, sfVar3, f, z);
    }
}

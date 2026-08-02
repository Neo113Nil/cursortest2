package com.bytedance.adsdk.sf.vj;

import android.util.JsonReader;
import com.bytedance.adsdk.sf.gm.sf.kj;
import com.ironsource.C4427z5;
import com.ironsource.U3;
import com.mbridge.msdk.setting.i;
import java.io.IOException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
class yt {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006a, code lost:
    
        if (r0.equals("s") == false) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static com.bytedance.adsdk.sf.gm.sf.kj pcc(JsonReader jsonReader, com.bytedance.adsdk.sf.qf qfVar) throws IOException {
        boolean z;
        jsonReader.beginObject();
        kj.pcc pccVar = null;
        com.bytedance.adsdk.sf.gm.pcc.kj kjVar = null;
        com.bytedance.adsdk.sf.gm.pcc.oo ooVar = null;
        boolean z2 = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            char c = 3;
            switch (nextName.hashCode()) {
                case 111:
                    if (nextName.equals("o")) {
                        z = false;
                        break;
                    }
                    z = -1;
                    break;
                case 3588:
                    if (nextName.equals("pt")) {
                        z = true;
                        break;
                    }
                    z = -1;
                    break;
                case 104433:
                    if (nextName.equals("inv")) {
                        z = 2;
                        break;
                    }
                    z = -1;
                    break;
                case 3357091:
                    if (nextName.equals(U3.a.t)) {
                        z = 3;
                        break;
                    }
                    z = -1;
                    break;
                default:
                    z = -1;
                    break;
            }
            switch (z) {
                case false:
                    ooVar = oo.sf(jsonReader, qfVar);
                    break;
                case true:
                    kjVar = oo.vj(jsonReader, qfVar);
                    break;
                case true:
                    z2 = jsonReader.nextBoolean();
                    break;
                case true:
                    String nextString = jsonReader.nextString();
                    nextString.getClass();
                    switch (nextString.hashCode()) {
                        case 97:
                            if (nextString.equals("a")) {
                                c = 0;
                                break;
                            }
                            c = 65535;
                            break;
                        case 105:
                            if (nextString.equals(i.a)) {
                                c = 1;
                                break;
                            }
                            c = 65535;
                            break;
                        case 110:
                            if (nextString.equals(C4427z5.q)) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        case INVALID_INDEX_URL_VALUE:
                            break;
                        default:
                            c = 65535;
                            break;
                    }
                    switch (c) {
                        case 0:
                            pccVar = kj.pcc.MASK_MODE_ADD;
                            break;
                        case 1:
                            qfVar.pcc("Animation contains intersect masks. They are not supported but will be treated like add masks.");
                            pccVar = kj.pcc.MASK_MODE_INTERSECT;
                            break;
                        case 2:
                            pccVar = kj.pcc.MASK_MODE_NONE;
                            break;
                        case 3:
                            pccVar = kj.pcc.MASK_MODE_SUBTRACT;
                            break;
                        default:
                            pccVar = kj.pcc.MASK_MODE_ADD;
                            break;
                    }
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return new com.bytedance.adsdk.sf.gm.sf.kj(pccVar, kjVar, ooVar, z2);
    }
}

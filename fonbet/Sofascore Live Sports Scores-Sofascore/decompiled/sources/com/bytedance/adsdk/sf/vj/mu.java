package com.bytedance.adsdk.sf.vj;

import android.graphics.PointF;
import android.util.JsonReader;
import android.util.JsonToken;
import com.mbridge.msdk.foundation.controller.a;
import defpackage.a70;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class mu implements lrr<com.bytedance.adsdk.sf.gm.sf.gbb> {
    public static final mu pcc = new mu();

    private mu() {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0048, code lost:
    
        if (r5.equals(com.mbridge.msdk.setting.i.a) == false) goto L10;
     */
    @Override // com.bytedance.adsdk.sf.vj.lrr
    /* renamed from: pcc, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public com.bytedance.adsdk.sf.gm.sf.gbb sf(JsonReader jsonReader, float f) throws IOException {
        if (jsonReader.peek() == JsonToken.BEGIN_ARRAY) {
            jsonReader.beginArray();
        }
        jsonReader.beginObject();
        List<PointF> list = null;
        List<PointF> list2 = null;
        List<PointF> list3 = null;
        boolean z = false;
        while (true) {
            char c = 1;
            if (!jsonReader.hasNext()) {
                jsonReader.endObject();
                if (jsonReader.peek() == JsonToken.END_ARRAY) {
                    jsonReader.endArray();
                }
                if (list == null || list2 == null || list3 == null) {
                    a70.p("Shape data was missing information.");
                    return null;
                }
                if (list.isEmpty()) {
                    return new com.bytedance.adsdk.sf.gm.sf.gbb(new PointF(), false, Collections.EMPTY_LIST);
                }
                int size = list.size();
                PointF pointF = list.get(0);
                ArrayList arrayList = new ArrayList(size);
                for (int i = 1; i < size; i++) {
                    PointF pointF2 = list.get(i);
                    int i2 = i - 1;
                    arrayList.add(new com.bytedance.adsdk.sf.gm.pcc(com.bytedance.adsdk.sf.wh.vj.pcc(list.get(i2), list3.get(i2)), com.bytedance.adsdk.sf.wh.vj.pcc(pointF2, list2.get(i)), pointF2));
                }
                if (z) {
                    PointF pointF3 = list.get(0);
                    int i3 = size - 1;
                    arrayList.add(new com.bytedance.adsdk.sf.gm.pcc(com.bytedance.adsdk.sf.wh.vj.pcc(list.get(i3), list3.get(i3)), com.bytedance.adsdk.sf.wh.vj.pcc(pointF3, list2.get(0)), pointF3));
                }
                return new com.bytedance.adsdk.sf.gm.sf.gbb(pointF, z, arrayList);
            }
            String nextName = jsonReader.nextName();
            nextName.getClass();
            switch (nextName.hashCode()) {
                case 99:
                    if (nextName.equals(a.q)) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 105:
                    break;
                case 111:
                    if (nextName.equals("o")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case PROTOBUF_SERIALIZATION_ERROR_VALUE:
                    if (nextName.equals("v")) {
                        c = 3;
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
                    z = jsonReader.nextBoolean();
                    break;
                case 1:
                    list2 = gpj.pcc(jsonReader, f);
                    break;
                case 2:
                    list3 = gpj.pcc(jsonReader, f);
                    break;
                case 3:
                    list = gpj.pcc(jsonReader, f);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
    }
}

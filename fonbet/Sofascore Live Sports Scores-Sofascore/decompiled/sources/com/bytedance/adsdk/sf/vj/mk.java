package com.bytedance.adsdk.sf.vj;

import android.graphics.PointF;
import android.util.JsonReader;
import android.util.JsonToken;
import defpackage.a70;
import java.io.IOException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class mk implements lrr<PointF> {
    public static final mk pcc = new mk();

    private mk() {
    }

    @Override // com.bytedance.adsdk.sf.vj.lrr
    /* renamed from: pcc, reason: merged with bridge method [inline-methods] */
    public PointF sf(JsonReader jsonReader, float f) throws IOException {
        JsonToken peek = jsonReader.peek();
        if (peek == JsonToken.BEGIN_ARRAY) {
            return gpj.sf(jsonReader, f);
        }
        if (peek == JsonToken.BEGIN_OBJECT) {
            return gpj.sf(jsonReader, f);
        }
        if (peek != JsonToken.NUMBER) {
            a70.p("Cannot convert json to point. Next token is ".concat(String.valueOf(peek)));
            return null;
        }
        PointF pointF = new PointF(((float) jsonReader.nextDouble()) * f, ((float) jsonReader.nextDouble()) * f);
        while (jsonReader.hasNext()) {
            jsonReader.skipValue();
        }
        return pointF;
    }
}

package com.inmobi.media;

import com.ironsource.C4427z5;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.LinkedHashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.t4, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3771t4 extends H9 {
    public final String b;
    public final List c;
    public final boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3771t4(String str, String str2, List list, boolean z) {
        super(str);
        str.getClass();
        str2.getClass();
        list.getClass();
        this.b = str2;
        this.c = list;
        this.d = z;
    }

    public final Ze a() {
        List<C3797u4> list = this.c;
        JSONArray jSONArray = new JSONArray();
        for (C3797u4 c3797u4 : list) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(C4427z5.q, c3797u4.b.getType());
            jSONObject.put("t", c3797u4.b.getLastUpdateTimeStamp());
            jSONArray.put(jSONObject);
        }
        String jSONArray2 = jSONArray.toString();
        jSONArray2.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("im-accid", this.b);
        linkedHashMap.put(TtmlNode.TAG_P, jSONArray2);
        JSONObject b = AbstractC3386e7.b();
        if (b != null) {
            String jSONObject2 = b.toString();
            jSONObject2.getClass();
            linkedHashMap.put("consentObject", jSONObject2);
        }
        linkedHashMap.putAll(E1.e);
        linkedHashMap.putAll(F5.a.a(false));
        linkedHashMap.putAll(H8.a());
        linkedHashMap.put("u-appsecure", String.valueOf((int) E1.f));
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        if (this.d) {
            linkedHashMap2.put("rip", "true");
        }
        return new Ze(this.a, linkedHashMap2, null, new C3438g7(linkedHashMap), null, 52);
    }
}

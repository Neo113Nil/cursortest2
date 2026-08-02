package com.inmobi.media;

import defpackage.duf;
import defpackage.kef;
import kotlin.reflect.KProperty;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.di, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3372di {
    public static final /* synthetic */ KProperty[] a = {duf.a.property1(new kef(C3372di.class, "areImraidLogsEnabled", "getAreImraidLogsEnabled()Z", 0))};

    public static JSONObject a(String str, String str2) {
        str.getClass();
        str2.getClass();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("browser", str);
        jSONObject.put("event", str2);
        return jSONObject;
    }
}

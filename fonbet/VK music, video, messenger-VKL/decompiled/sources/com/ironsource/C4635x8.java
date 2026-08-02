package com.ironsource;

import android.content.Context;
import android.util.Pair;
import com.ironsource.C4492p8;
import com.ironsource.C4581u8;
import com.ironsource.D5;
import java.util.ArrayList;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ironsource.x8, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public class C4635x8 {
    public static C4581u8 a(Context context, String str, String str2, String str3, Map<String, String> map) throws Exception {
        C4581u8.a aVar = new C4581u8.a();
        if (map != null && map.containsKey("sessionid")) {
            aVar.d(map.get("sessionid"));
        }
        aVar.a(context);
        aVar.b(str3);
        return aVar.e(str).a(str2).a();
    }

    public static D5 a(JSONObject jSONObject) {
        return new D5.a(jSONObject.optString("endpoint")).b().b(jSONObject.optBoolean("enabled")).a(new C4599v8()).a(a()).a(false).a();
    }

    private static ArrayList<Pair<String, String>> a() {
        ArrayList<Pair<String, String>> arrayList = new ArrayList<>();
        arrayList.add(new Pair<>("Content-Type", "application/json"));
        arrayList.add(new Pair<>(B5.N, B5.O));
        return arrayList;
    }

    public static boolean a(T4 t4) {
        if (t4 == null || t4.g().get("inAppBidding") == null) {
            return false;
        }
        return Boolean.parseBoolean(t4.g().get("inAppBidding"));
    }

    public static C4492p8.e a(T4 t4, C4492p8.e eVar) {
        if (t4 == null || t4.g() == null || t4.g().get("rewarded") == null) {
            return eVar;
        }
        if (Boolean.parseBoolean(t4.g().get("rewarded"))) {
            return C4492p8.e.RewardedVideo;
        }
        return C4492p8.e.Interstitial;
    }
}

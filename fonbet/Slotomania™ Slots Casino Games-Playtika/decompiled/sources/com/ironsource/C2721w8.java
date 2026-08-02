package com.ironsource;

import android.content.Context;
import android.util.Pair;
import com.ironsource.C2578o8;
import com.ironsource.C2667t8;
import com.ironsource.D5;
import java.util.ArrayList;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ironsource.w8, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C2721w8 {
    public static C2667t8 a(Context context, String str, String str2, String str3, Map<String, String> map) throws Exception {
        C2667t8.a aVar = new C2667t8.a();
        if (map != null && map.containsKey("sessionid")) {
            aVar.d(map.get("sessionid"));
        }
        aVar.a(context);
        aVar.b(str3);
        return aVar.e(str).a(str2).a();
    }

    public static D5 a(JSONObject jSONObject) {
        return new D5.a(jSONObject.optString(B5.r)).b().b(jSONObject.optBoolean("enabled")).a(new C2685u8()).a(a()).a(false).a();
    }

    private static ArrayList<Pair<String, String>> a() {
        ArrayList<Pair<String, String>> arrayList = new ArrayList<>();
        arrayList.add(new Pair<>("Content-Type", B5.M));
        arrayList.add(new Pair<>("charset", B5.O));
        return arrayList;
    }

    public static boolean a(T4 t4) {
        if (t4 == null || t4.g().get("inAppBidding") == null) {
            return false;
        }
        return Boolean.parseBoolean(t4.g().get("inAppBidding"));
    }

    public static C2578o8.e a(T4 t4, C2578o8.e eVar) {
        if (t4 == null || t4.g() == null || t4.g().get("rewarded") == null) {
            return eVar;
        }
        if (Boolean.parseBoolean(t4.g().get("rewarded"))) {
            return C2578o8.e.RewardedVideo;
        }
        return C2578o8.e.Interstitial;
    }
}

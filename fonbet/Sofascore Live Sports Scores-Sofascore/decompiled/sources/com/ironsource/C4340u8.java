package com.ironsource;

import android.content.Context;
import android.util.Pair;
import com.ironsource.B5;
import com.ironsource.C4197m8;
import com.ironsource.C4286r8;
import java.util.ArrayList;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.u8, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4340u8 {
    public static B5 a(JSONObject jSONObject) {
        return new B5.a(jSONObject.optString(C4427z5.r)).b().b(jSONObject.optBoolean("enabled")).a(new C4304s8()).a(a()).a(false).a();
    }

    public static C4286r8 a(Context context, String str, String str2, String str3, Map<String, String> map) throws Exception {
        C4286r8.a aVar = new C4286r8.a();
        if (map != null && map.containsKey("sessionid")) {
            aVar.d(map.get("sessionid"));
        }
        aVar.a(context);
        aVar.b(str3);
        return aVar.e(str).a(str2).a();
    }

    private static ArrayList<Pair<String, String>> a() {
        ArrayList<Pair<String, String>> arrayList = new ArrayList<>();
        arrayList.add(new Pair<>("Content-Type", C4427z5.M));
        arrayList.add(new Pair<>(C4427z5.N, C4427z5.O));
        return arrayList;
    }

    public static boolean a(Q4 q4) {
        if (q4 == null || q4.g().get("inAppBidding") == null) {
            return false;
        }
        return Boolean.parseBoolean(q4.g().get("inAppBidding"));
    }

    public static C4197m8.e a(Q4 q4, C4197m8.e eVar) {
        if (q4 == null || q4.g() == null || q4.g().get("rewarded") == null) {
            return eVar;
        }
        if (Boolean.parseBoolean(q4.g().get("rewarded"))) {
            return C4197m8.e.RewardedVideo;
        }
        return C4197m8.e.Interstitial;
    }
}

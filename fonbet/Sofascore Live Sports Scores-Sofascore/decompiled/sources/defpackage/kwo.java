package defpackage;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class kwo extends gw1 {
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kwo(String str, String str2, String str3) {
        super(1, str2, str3, str);
        this.f = 4;
    }

    @Override // defpackage.gw1
    public final Object f(Bundle bundle) {
        int i = this.f;
        Object obj = this.c;
        switch (i) {
            case 0:
                String str = (String) obj;
                return bundle.containsKey("com.google.android.gms.ads.flag.".concat(str)) ? Boolean.valueOf(bundle.getBoolean("com.google.android.gms.ads.flag.".concat(str))) : (Boolean) i();
            case 1:
                String str2 = (String) obj;
                return bundle.containsKey("com.google.android.gms.ads.flag.".concat(str2)) ? Integer.valueOf(bundle.getInt("com.google.android.gms.ads.flag.".concat(str2))) : (Integer) i();
            case 2:
                String str3 = (String) obj;
                return bundle.containsKey("com.google.android.gms.ads.flag.".concat(str3)) ? Long.valueOf(bundle.getLong("com.google.android.gms.ads.flag.".concat(str3))) : (Long) i();
            case 3:
                String str4 = (String) obj;
                return bundle.containsKey("com.google.android.gms.ads.flag.".concat(str4)) ? Float.valueOf(bundle.getFloat("com.google.android.gms.ads.flag.".concat(str4))) : (Float) i();
            default:
                String str5 = (String) obj;
                return bundle.containsKey("com.google.android.gms.ads.flag.".concat(str5)) ? bundle.getString("com.google.android.gms.ads.flag.".concat(str5)) : (String) i();
        }
    }

    @Override // defpackage.gw1
    public final Object g(JSONObject jSONObject) {
        int i = this.f;
        Object obj = this.c;
        switch (i) {
            case 0:
                return Boolean.valueOf(jSONObject.optBoolean((String) obj, ((Boolean) i()).booleanValue()));
            case 1:
                return Integer.valueOf(jSONObject.optInt((String) obj, ((Integer) i()).intValue()));
            case 2:
                return Long.valueOf(jSONObject.optLong((String) obj, ((Long) i()).longValue()));
            case 3:
                return Float.valueOf((float) jSONObject.optDouble((String) obj, ((Float) i()).floatValue()));
            default:
                return jSONObject.optString((String) obj, (String) i());
        }
    }

    @Override // defpackage.gw1
    public final Object h(SharedPreferences sharedPreferences) {
        int i = this.f;
        Object obj = this.c;
        switch (i) {
            case 0:
                return Boolean.valueOf(sharedPreferences.getBoolean((String) obj, ((Boolean) i()).booleanValue()));
            case 1:
                return Integer.valueOf(sharedPreferences.getInt((String) obj, ((Integer) i()).intValue()));
            case 2:
                return Long.valueOf(sharedPreferences.getLong((String) obj, ((Long) i()).longValue()));
            case 3:
                return Float.valueOf(sharedPreferences.getFloat((String) obj, ((Float) i()).floatValue()));
            default:
                return sharedPreferences.getString((String) obj, (String) i());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kwo(int i, String str, Object obj, Object obj2, int i2) {
        super(i, obj, obj2, str);
        this.f = i2;
    }
}

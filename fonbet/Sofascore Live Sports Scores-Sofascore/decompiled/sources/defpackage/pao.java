package defpackage;

import android.content.SharedPreferences;
import android.os.Bundle;
import com.google.android.gms.internal.pal.zzgc;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class pao extends zzgc {
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pao(Object obj, String str, int i, int i2) {
        super(i, obj, str);
        this.d = i2;
    }

    @Override // com.google.android.gms.internal.pal.zzgc
    public final Object a(JSONObject jSONObject) {
        int i = this.d;
        Object obj = this.c;
        String str = this.b;
        switch (i) {
            case 0:
                return Boolean.valueOf(jSONObject.optBoolean(str, ((Boolean) obj).booleanValue()));
            case 1:
                return Integer.valueOf(jSONObject.optInt(str, ((Integer) obj).intValue()));
            case 2:
                return Long.valueOf(jSONObject.optLong(str, ((Long) obj).longValue()));
            case 3:
                return Float.valueOf((float) jSONObject.optDouble(str, ((Float) obj).floatValue()));
            default:
                return jSONObject.optString(str, (String) obj);
        }
    }

    @Override // com.google.android.gms.internal.pal.zzgc
    public final Object b(Bundle bundle) {
        int i = this.d;
        Object obj = this.c;
        String str = this.b;
        switch (i) {
            case 0:
                return bundle.containsKey("com.google.android.gms.ads.flag.".concat(str)) ? Boolean.valueOf(bundle.getBoolean("com.google.android.gms.ads.flag.".concat(str))) : (Boolean) obj;
            case 1:
                return bundle.containsKey("com.google.android.gms.ads.flag.".concat(str)) ? Integer.valueOf(bundle.getInt("com.google.android.gms.ads.flag.".concat(str))) : (Integer) obj;
            case 2:
                return bundle.containsKey("com.google.android.gms.ads.flag.".concat(str)) ? Long.valueOf(bundle.getLong("com.google.android.gms.ads.flag.".concat(str))) : (Long) obj;
            case 3:
                return bundle.containsKey("com.google.android.gms.ads.flag.".concat(str)) ? Float.valueOf(bundle.getFloat("com.google.android.gms.ads.flag.".concat(str))) : (Float) obj;
            default:
                return bundle.containsKey("com.google.android.gms.ads.flag.".concat(str)) ? bundle.getString("com.google.android.gms.ads.flag.".concat(str)) : (String) obj;
        }
    }

    @Override // com.google.android.gms.internal.pal.zzgc
    public final Object c(SharedPreferences sharedPreferences) {
        int i = this.d;
        Object obj = this.c;
        String str = this.b;
        switch (i) {
            case 0:
                return Boolean.valueOf(sharedPreferences.getBoolean(str, ((Boolean) obj).booleanValue()));
            case 1:
                return Integer.valueOf(sharedPreferences.getInt(str, ((Integer) obj).intValue()));
            case 2:
                return Long.valueOf(sharedPreferences.getLong(str, ((Long) obj).longValue()));
            case 3:
                return Float.valueOf(sharedPreferences.getFloat(str, ((Float) obj).floatValue()));
            default:
                return sharedPreferences.getString(str, (String) obj);
        }
    }
}

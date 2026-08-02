package defpackage;

import android.content.SharedPreferences;
import android.os.Bundle;
import com.google.android.gms.internal.ads.zzbix;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class inn extends zzbix {
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public inn(String str, String str2, String str3) {
        super(1, str2, str3, str);
        this.e = 4;
    }

    @Override // com.google.android.gms.internal.ads.zzbix
    public final Object a(Bundle bundle) {
        int i = this.e;
        String str = this.b;
        switch (i) {
            case 0:
                return bundle.containsKey("com.google.android.gms.ads.flag.".concat(str)) ? Boolean.valueOf(bundle.getBoolean("com.google.android.gms.ads.flag.".concat(str))) : (Boolean) e();
            case 1:
                return bundle.containsKey("com.google.android.gms.ads.flag.".concat(str)) ? Integer.valueOf(bundle.getInt("com.google.android.gms.ads.flag.".concat(str))) : (Integer) e();
            case 2:
                return bundle.containsKey("com.google.android.gms.ads.flag.".concat(str)) ? Long.valueOf(bundle.getLong("com.google.android.gms.ads.flag.".concat(str))) : (Long) e();
            case 3:
                return bundle.containsKey("com.google.android.gms.ads.flag.".concat(str)) ? Float.valueOf(bundle.getFloat("com.google.android.gms.ads.flag.".concat(str))) : (Float) e();
            default:
                return bundle.containsKey("com.google.android.gms.ads.flag.".concat(str)) ? bundle.getString("com.google.android.gms.ads.flag.".concat(str)) : (String) e();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbix
    public final void b(SharedPreferences.Editor editor, Object obj) {
        int i = this.e;
        String str = this.b;
        switch (i) {
            case 0:
                editor.putBoolean(str, ((Boolean) obj).booleanValue());
                break;
            case 1:
                editor.putInt(str, ((Integer) obj).intValue());
                break;
            case 2:
                editor.putLong(str, ((Long) obj).longValue());
                break;
            case 3:
                editor.putFloat(str, ((Float) obj).floatValue());
                break;
            default:
                editor.putString(str, (String) obj);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbix
    public final Object c(JSONObject jSONObject) {
        int i = this.e;
        String str = this.b;
        switch (i) {
            case 0:
                return Boolean.valueOf(jSONObject.optBoolean(str, ((Boolean) e()).booleanValue()));
            case 1:
                return Integer.valueOf(jSONObject.optInt(str, ((Integer) e()).intValue()));
            case 2:
                return Long.valueOf(jSONObject.optLong(str, ((Long) e()).longValue()));
            case 3:
                return Float.valueOf((float) jSONObject.optDouble(str, ((Float) e()).floatValue()));
            default:
                return jSONObject.optString(str, (String) e());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbix
    public final Object d(SharedPreferences sharedPreferences) {
        int i = this.e;
        String str = this.b;
        switch (i) {
            case 0:
                return Boolean.valueOf(sharedPreferences.getBoolean(str, ((Boolean) e()).booleanValue()));
            case 1:
                return Integer.valueOf(sharedPreferences.getInt(str, ((Integer) e()).intValue()));
            case 2:
                return Long.valueOf(sharedPreferences.getLong(str, ((Long) e()).longValue()));
            case 3:
                return Float.valueOf(sharedPreferences.getFloat(str, ((Float) e()).floatValue()));
            default:
                return sharedPreferences.getString(str, (String) e());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ inn(int i, String str, Object obj, Object obj2, int i2) {
        super(i, obj, obj2, str);
        this.e = i2;
    }
}

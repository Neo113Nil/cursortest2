package defpackage;

import android.os.Bundle;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.internal.ads.zzfdg;
import com.google.android.gms.internal.ads.zzfml;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class k6o implements zzfdg {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ k6o(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // com.google.android.gms.internal.ads.zzfdg
    public final /* synthetic */ void zza(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((Bundle) obj).putStringArrayList("ad_types", (ArrayList) obj2);
                break;
            case 1:
                zzfml.e("key_schema", (Bundle) obj, (String) obj2);
                break;
            case 2:
                Bundle bundle = (Bundle) obj2;
                Bundle bundle2 = (Bundle) obj;
                if (!bundle.isEmpty()) {
                    bundle2.putBundle("shared_pref", bundle);
                    break;
                }
                break;
            default:
                try {
                    ((JSONObject) obj).put("gms_sdk_env", ((x7o) obj2).a);
                    break;
                } catch (JSONException unused) {
                    zze.zza("Failed putting version constants.");
                }
        }
    }
}

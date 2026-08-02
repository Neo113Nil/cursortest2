package defpackage;

import com.google.android.gms.internal.ads.zzbmd;
import com.google.android.gms.internal.ads.zzbqh;
import com.google.android.gms.internal.ads.zzbun;
import com.google.android.gms.internal.ads.zzdua;
import com.google.android.gms.internal.ads.zzgub;
import java.util.List;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class tpn implements zzgub {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ tpn(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // com.google.android.gms.internal.ads.zzgub
    public final /* synthetic */ Object apply(Object obj) {
        int i = this.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                zzbun zzbunVar = (zzbun) obj;
                zzbunVar.a0((String) obj3, (zzbqh) obj2);
                return zzbunVar;
            default:
                zzdua zzduaVar = (zzdua) obj3;
                JSONObject jSONObject = (JSONObject) obj2;
                List list = (List) obj;
                zzduaVar.getClass();
                if (list == null || list.isEmpty()) {
                    return null;
                }
                String optString = jSONObject.optString("text");
                Integer c = zzdua.c("bg_color", jSONObject);
                Integer c2 = zzdua.c("text_color", jSONObject);
                int optInt = jSONObject.optInt("text_size", -1);
                jSONObject.optBoolean("allow_pub_rendering");
                int optInt2 = jSONObject.optInt("animation_ms", 1000);
                return new zzbmd(optString, list, c, c2, optInt > 0 ? Integer.valueOf(optInt) : null, jSONObject.optInt("presentation_ms", 4000) + optInt2, zzduaVar.h.e);
        }
    }
}

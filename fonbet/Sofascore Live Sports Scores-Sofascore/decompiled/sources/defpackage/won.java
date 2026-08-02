package defpackage;

import com.google.android.gms.internal.ads.zzbqy;
import com.google.android.gms.internal.ads.zzbup;
import com.google.android.gms.internal.ads.zzcgo;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class won implements zzbqy {
    public final /* synthetic */ int a;
    public final zzcgo b;

    public /* synthetic */ won(Object obj, zzcgo zzcgoVar, int i) {
        this.a = i;
        this.b = zzcgoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbqy
    public final void a(JSONObject jSONObject) {
        int i = this.a;
        zzcgo zzcgoVar = this.b;
        switch (i) {
            case 0:
                zzcgoVar.zzc(jSONObject);
                break;
            default:
                try {
                    zzcgoVar.zzc(jSONObject);
                    break;
                } catch (IllegalStateException unused) {
                    return;
                } catch (JSONException e) {
                    zzcgoVar.zzd(e);
                    return;
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbqy
    public final void zzb(String str) {
        int i = this.a;
        zzcgo zzcgoVar = this.b;
        switch (i) {
            case 0:
                zzcgoVar.zzd(new zzbup(str));
                break;
            default:
                try {
                    if (str == null) {
                        zzcgoVar.zzd(new zzbup());
                    } else {
                        zzcgoVar.zzd(new zzbup(str));
                    }
                    break;
                } catch (IllegalStateException unused) {
                    return;
                }
        }
    }
}

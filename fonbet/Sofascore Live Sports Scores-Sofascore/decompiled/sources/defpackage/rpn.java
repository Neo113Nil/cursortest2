package defpackage;

import com.google.android.gms.internal.ads.zzbqy;
import com.google.android.gms.internal.ads.zzbug;
import com.google.android.gms.internal.ads.zzbup;
import com.google.android.gms.internal.ads.zzbve;
import com.google.android.gms.internal.ads.zzcgo;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class rpn implements zzbqy {
    public final zzbug a;
    public final zzcgo b;
    public final /* synthetic */ zzbve c;

    public rpn(zzbve zzbveVar, zzbug zzbugVar, zzcgo zzcgoVar) {
        this.c = zzbveVar;
        this.a = zzbugVar;
        this.b = zzcgoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbqy
    public final void a(JSONObject jSONObject) {
        zzbug zzbugVar = this.a;
        zzcgo zzcgoVar = this.b;
        try {
            try {
                zzcgoVar.zzc(this.c.a.a(jSONObject));
            } catch (IllegalStateException unused) {
            } catch (JSONException e) {
                zzcgoVar.zzd(e);
            }
        } finally {
            zzbugVar.d();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbqy
    public final void zzb(String str) {
        zzbug zzbugVar = this.a;
        zzcgo zzcgoVar = this.b;
        try {
            if (str == null) {
                zzcgoVar.zzd(new zzbup());
            } else {
                zzcgoVar.zzd(new zzbup(str));
            }
        } catch (IllegalStateException unused) {
        } catch (Throwable th) {
            zzbugVar.d();
            throw th;
        }
        zzbugVar.d();
    }
}

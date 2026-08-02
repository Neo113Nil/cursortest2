package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import androidx.core.app.NotificationCompat;
import com.appsflyer.sdk_base.referrer.Payload;
import com.google.android.gms.ads.internal.client.hsdp.IHsdpDeepLinkServiceWrapper;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbjg;
import com.google.android.gms.internal.ads.zzbzz;
import com.google.android.gms.internal.ads.zzcaq;
import com.google.android.gms.internal.ads.zzcas;
import com.google.android.gms.internal.ads.zzclm;
import com.google.android.gms.internal.ads.zzdcg;
import com.google.android.gms.internal.ads.zzdej;
import com.google.android.gms.internal.ads.zzdek;
import com.google.android.gms.internal.ads.zzdfd;
import com.google.android.gms.internal.ads.zzeai;
import com.google.android.gms.internal.ads.zzeaj;
import com.google.android.gms.internal.ads.zzfld;
import com.google.android.gms.internal.ads.zzflo;
import java.util.ArrayList;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class jyn implements zzdfd, zzdek, zzdej {
    public final Context a;
    public zzcas b;
    public zzcas c;
    public final zzfld d;
    public final zzclm e;
    public final Clock f;
    public final zzeaj g;
    public final String h;
    public final zzdcg i;

    public jyn(Context context, zzfld zzfldVar, zzclm zzclmVar, zzflo zzfloVar, Clock clock, zzeaj zzeajVar, zzdcg zzdcgVar) {
        this.a = context;
        this.d = zzfldVar;
        this.e = zzclmVar;
        this.f = clock;
        this.g = zzeajVar;
        this.i = zzdcgVar;
        this.h = zzfloVar.b.b.b;
    }

    public final /* synthetic */ void a(long j, Bundle bundle, String str, String str2) {
        String jSONObject = bundle != null ? new zzf().zzn(bundle, new JSONObject()).toString() : null;
        long elapsedRealtime = this.f.elapsedRealtime() - j;
        String encodeToString = jSONObject != null ? Base64.encodeToString(jSONObject.getBytes(), 1) : null;
        if (((Boolean) zzba.zzc().a(zzbjg.Ee)).booleanValue()) {
            zzeai a = this.g.a();
            a.b("action", str);
            a.b("ppwpfl", String.valueOf(elapsedRealtime));
            a.b("ppwpfst", str2);
            String str3 = this.h;
            if (str3 != null) {
                a.b("gqi", str3);
            }
            if (encodeToString != null) {
                a.b("ppwpferr", encodeToString);
            }
            a.e();
        }
    }

    public final void b(boolean z, boolean z2) {
        zzclm zzclmVar;
        Activity zzj;
        zzbzz zzbzzVar = this.d.d0;
        if (zzbzzVar == null) {
            return;
        }
        if (z) {
            String str = zzbzzVar.e;
            if (!TextUtils.isEmpty(str)) {
                Bundle f = bf3.f("targetPackage", str);
                f.putString(Payload.RFR, zzbzzVar.g);
                f.putBundle("extra_query_params", zzbzzVar.h);
                if (z2 && (zzclmVar = this.e) != null && (zzj = zzclmVar.zzj()) != null && zzj.getWindow() != null && zzj.getWindow().getDecorView() != null) {
                    f.putBinder("window_token", zzj.getWindow().getDecorView().getWindowToken());
                }
                d(f, "ppfla");
                return;
            }
        }
        d(null, "ppwla");
    }

    @Override // com.google.android.gms.internal.ads.zzdek
    public final void c(Context context) {
        zzbzz zzbzzVar = this.d.d0;
        if (zzbzzVar == null || !f()) {
            return;
        }
        if (((Boolean) zzba.zzc().a(zzbjg.De)).booleanValue()) {
            String str = zzbzzVar.e;
            if (TextUtils.isEmpty(str)) {
                return;
            }
            try {
                zzdcg zzdcgVar = this.i;
                Context context2 = this.a;
                IHsdpDeepLinkServiceWrapper a = zzdcgVar.a(context2);
                if (a != null) {
                    a.endSession(new ObjectWrapper(context2), str);
                }
            } catch (Throwable th) {
                e("invokeEndSession", th);
            }
        }
    }

    public final void d(Bundle bundle, String str) {
        try {
            iyn iynVar = new iyn(this, str, this.f.elapsedRealtime());
            ArrayList arrayList = new ArrayList();
            if (bundle != null) {
                arrayList.add(bundle);
            }
            zzdcg zzdcgVar = this.i;
            Context context = this.a;
            IHsdpDeepLinkServiceWrapper a = zzdcgVar.a(context);
            if (a != null) {
                a.prewarm(new ObjectWrapper(context), arrayList, iynVar);
            }
        } catch (Throwable th) {
            e("invokeHsdpPrewarmOrPrefetch", th);
        }
    }

    public final void e(String str, Throwable th) {
        boolean booleanValue = ((Boolean) zzba.zzc().a(zzbjg.Fe)).booleanValue();
        Context context = this.a;
        if (booleanValue) {
            zzcas zzcasVar = this.c;
            if (zzcasVar == null) {
                zzcasVar = zzcaq.e(context);
                this.c = zzcasVar;
            }
            zzcasVar.a("HsdpServiceUnsampled.".concat(str), th);
            return;
        }
        zzcas zzcasVar2 = this.b;
        if (zzcasVar2 == null) {
            zzcasVar2 = zzcaq.c(context);
            this.b = zzcasVar2;
        }
        zzcasVar2.a("HsdpService.".concat(str), th);
    }

    public final boolean f() {
        zzbzz zzbzzVar;
        return ((Boolean) zzba.zzc().a(zzbjg.Ce)).booleanValue() && (zzbzzVar = this.d.d0) != null && zzbzzVar.d;
    }

    public final boolean g(int i) {
        zzbzz zzbzzVar = this.d.d0;
        return (zzbzzVar == null || (zzbzzVar.f & i) == 0) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzdej
    public final void j() {
        zzbzz zzbzzVar = this.d.d0;
        if (zzbzzVar == null || !zzbzzVar.a) {
            return;
        }
        if (f()) {
            if (g(4)) {
                b(g(8), ((Boolean) zzba.zzc().a(zzbjg.Ge)).booleanValue());
                return;
            }
            return;
        }
        if (g(NotificationCompat.FLAG_LOCAL_ONLY)) {
            ArrayList arrayList = new ArrayList();
            if (g(512)) {
                String str = zzbzzVar.b;
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                arrayList.add(str);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdfd
    public final void zzg() {
        zzbzz zzbzzVar = this.d.d0;
        if (zzbzzVar == null || !zzbzzVar.a) {
            return;
        }
        if (f()) {
            if (g(1)) {
                b(g(2), ((Boolean) zzba.zzc().a(zzbjg.He)).booleanValue());
                return;
            }
            return;
        }
        ArrayList arrayList = new ArrayList();
        String str = zzbzzVar.b;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        arrayList.add(str);
    }

    @Override // com.google.android.gms.internal.ads.zzdek
    public final void M(Context context) {
    }

    @Override // com.google.android.gms.internal.ads.zzdek
    public final void zza(Context context) {
    }
}

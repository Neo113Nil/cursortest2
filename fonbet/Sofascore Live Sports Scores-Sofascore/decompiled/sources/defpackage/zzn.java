package defpackage;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.client.zzv;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.internal.ads.zzbqg;
import com.google.android.gms.internal.ads.zzbqh;
import com.google.android.gms.internal.ads.zzcgj;
import com.google.android.gms.internal.ads.zzclm;
import com.google.android.gms.internal.ads.zzcub;
import com.google.android.gms.internal.ads.zzdlw;
import com.google.android.gms.internal.ads.zzdpl;
import com.google.android.gms.internal.ads.zzdvv;
import com.google.android.gms.internal.ads.zzele;
import com.google.android.gms.internal.ads.zzfrg;
import com.google.android.gms.internal.ads.zzfte;
import java.lang.ref.WeakReference;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzn implements zzbqh {
    public final /* synthetic */ int a = 2;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;

    public /* synthetic */ zzn(zzdpl zzdplVar, zzfte zzfteVar, zzv zzvVar, zzfrg zzfrgVar) {
        this.b = new WeakReference(zzdplVar);
        this.c = zzfteVar;
        this.d = zzvVar;
        this.e = zzfrgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbqh
    public final void a(Object obj, Map map) {
        int i = this.a;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.e;
        Object obj5 = this.b;
        switch (i) {
            case 0:
                zzdpl zzdplVar = (zzdpl) ((WeakReference) obj5).get();
                String str = (String) map.get("u");
                if (zzdplVar != null && !TextUtils.isEmpty(str)) {
                    ((zzfte) obj3).b(str, (zzv) obj2, (zzfrg) obj4, zzdplVar.D);
                    break;
                }
                break;
            case 1:
                Object obj6 = ((WeakReference) obj5).get();
                if (obj6 != null) {
                    ((zzbqh) obj2).a(obj6, map);
                    break;
                } else {
                    ((zzdvv) obj4).c((String) obj3, this);
                    break;
                }
            default:
                zzclm zzclmVar = (zzclm) obj;
                zzbqg.b(map, (zzdlw) obj5);
                String str2 = (String) map.get("u");
                if (str2 != null) {
                    zzcub zzcubVar = (zzcub) obj2;
                    ddb a = zzbqg.a(zzclmVar, str2);
                    int i2 = 7;
                    qpn qpnVar = new qpn(i2, zzclmVar, zzcubVar, (zzfte) obj3, (zzele) obj4, false);
                    a.addListener(new vlo(0, a, qpnVar), zzcgj.a);
                    break;
                } else {
                    int i3 = zze.zza;
                    zzo.zzi("URL missing from click GMSG.");
                    break;
                }
        }
    }

    public /* synthetic */ zzn(zzdlw zzdlwVar, zzcub zzcubVar, zzfte zzfteVar, zzele zzeleVar) {
        this.b = zzdlwVar;
        this.d = zzcubVar;
        this.c = zzfteVar;
        this.e = zzeleVar;
    }

    public /* synthetic */ zzn(zzdvv zzdvvVar, WeakReference weakReference, String str, zzbqh zzbqhVar) {
        this.e = zzdvvVar;
        this.b = weakReference;
        this.c = str;
        this.d = zzbqhVar;
    }
}

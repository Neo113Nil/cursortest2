package defpackage;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbjg;
import com.google.android.gms.internal.ads.zzbqh;
import com.google.android.gms.internal.ads.zzdlu;
import com.google.android.gms.internal.ads.zzdpl;
import com.ironsource.U3;
import java.lang.ref.WeakReference;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class yzn implements zzbqh {
    public final /* synthetic */ int a;
    public final WeakReference b;

    public /* synthetic */ yzn(zzdpl zzdplVar, int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = new WeakReference(zzdplVar);
                break;
            default:
                this.b = new WeakReference(zzdplVar);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbqh
    public final void a(Object obj, Map map) {
        int i = this.a;
        WeakReference weakReference = this.b;
        switch (i) {
            case 0:
                zzdpl zzdplVar = (zzdpl) weakReference.get();
                if (zzdplVar != null) {
                    zzdlu zzdluVar = zzdplVar.i;
                    if ("_ac".equals((String) map.get(U3.i.j0))) {
                        zzdplVar.h.onAdClicked();
                        if (((Boolean) zzba.zzc().a(zzbjg.sc)).booleanValue()) {
                            zzdluVar.M();
                            if (!TextUtils.isEmpty((CharSequence) map.get("sccg"))) {
                                zzdluVar.O();
                                break;
                            }
                        }
                    }
                }
                break;
            default:
                zzdpl zzdplVar2 = (zzdpl) weakReference.get();
                if (zzdplVar2 != null) {
                    zzdlu zzdluVar2 = zzdplVar2.i;
                    zzdplVar2.h.onAdClicked();
                    if (((Boolean) zzba.zzc().a(zzbjg.sc)).booleanValue()) {
                        zzdluVar2.M();
                        if (!TextUtils.isEmpty((CharSequence) map.get("sccg"))) {
                            zzdluVar2.O();
                            break;
                        }
                    }
                }
                break;
        }
    }
}

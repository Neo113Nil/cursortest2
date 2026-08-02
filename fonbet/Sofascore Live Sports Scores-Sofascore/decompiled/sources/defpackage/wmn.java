package defpackage;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbga;
import com.google.android.gms.internal.ads.zzbhn;
import com.google.android.gms.internal.ads.zzbjg;
import com.google.android.gms.internal.ads.zzftu;
import com.google.android.gms.internal.ads.zzfuj;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class wmn implements zzbga {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;

    public wmn(zzbhn zzbhnVar) {
        Objects.requireNonNull(zzbhnVar);
        this.b = zzbhnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbga
    public final void zza(boolean z) {
        switch (this.a) {
            case 0:
                zzbhn zzbhnVar = (zzbhn) this.b;
                if (!z) {
                    zzbhnVar.c();
                    break;
                } else {
                    zzbhnVar.d();
                    break;
                }
            case 1:
                if (((Boolean) zzba.zzc().a(zzbjg.D)).booleanValue()) {
                    ((zzftu) this.b).a(z);
                    break;
                }
                break;
            default:
                if (((Boolean) zzba.zzc().a(zzbjg.D)).booleanValue()) {
                    ((zzfuj) this.b).c(z);
                    break;
                }
                break;
        }
    }

    public wmn(zzftu zzftuVar) {
        Objects.requireNonNull(zzftuVar);
        this.b = zzftuVar;
    }

    public wmn(zzfuj zzfujVar) {
        Objects.requireNonNull(zzfujVar);
        this.b = zzfujVar;
    }
}

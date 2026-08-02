package defpackage;

import com.google.android.gms.internal.ads.zzbqh;
import com.google.android.gms.internal.ads.zzclm;
import com.google.android.gms.internal.ads.zzdvv;
import com.google.android.gms.internal.ads.zzhcv;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class f1o implements zzhcv {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ zzbqh c;

    public f1o(zzdvv zzdvvVar, String str, zzbqh zzbqhVar, int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = str;
                this.c = zzbqhVar;
                Objects.requireNonNull(zzdvvVar);
                break;
            default:
                this.b = str;
                this.c = zzbqhVar;
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhcv
    public final void zza(Throwable th) {
        int i = this.a;
    }

    @Override // com.google.android.gms.internal.ads.zzhcv
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        int i = this.a;
        zzbqh zzbqhVar = this.c;
        String str = this.b;
        switch (i) {
            case 0:
                ((zzclm) obj).T(str, zzbqhVar);
                break;
            default:
                ((zzclm) obj).P(str, zzbqhVar);
                break;
        }
    }

    private final void a(Throwable th) {
    }

    private final void b(Throwable th) {
    }
}

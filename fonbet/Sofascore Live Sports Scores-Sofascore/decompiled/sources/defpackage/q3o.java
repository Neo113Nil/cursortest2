package defpackage;

import android.os.Bundle;
import com.google.android.gms.internal.ads.zzcbv;
import com.google.android.gms.internal.ads.zzefj;
import com.google.android.gms.internal.ads.zzegd;
import com.google.android.gms.internal.ads.zzejg;
import com.google.android.gms.internal.ads.zzhcg;
import com.google.android.gms.internal.ads.zzhcy;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class q3o implements zzhcg {
    public final /* synthetic */ int a;
    public final /* synthetic */ zzcbv b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ q3o(Object obj, zzcbv zzcbvVar, int i, int i2) {
        this.a = i2;
        this.d = obj;
        this.b = zzcbvVar;
        this.c = i;
    }

    @Override // com.google.android.gms.internal.ads.zzhcg
    public final /* synthetic */ ddb zza(Object obj) {
        Bundle bundle;
        int i = this.a;
        int i2 = this.c;
        zzcbv zzcbvVar = this.b;
        Object obj2 = this.d;
        switch (i) {
            case 0:
                zzefj zzefjVar = (zzefj) obj2;
                if (zzcbvVar != null && (bundle = zzcbvVar.m) != null) {
                    bundle.putBoolean("ls", true);
                }
                return zzhcy.h(((zzejg) zzefjVar.d.zzb()).E4(zzcbvVar, i2), new r3o(zzcbvVar, 0), zzefjVar.b);
            default:
                zzegd zzegdVar = (zzegd) obj2;
                zzegdVar.getClass();
                Bundle bundle2 = zzcbvVar.m;
                if (bundle2 != null) {
                    bundle2.putBoolean("ls", true);
                }
                return zzhcy.h(((zzejg) zzegdVar.e.zzb()).H4(zzcbvVar, i2), new r3o(zzcbvVar, 1), zzegdVar.b);
        }
    }
}

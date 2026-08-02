package defpackage;

import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.client.zzx;
import com.google.android.gms.internal.ads.zzfit;
import com.google.android.gms.internal.ads.zzfiv;
import com.google.android.gms.internal.ads.zzfnv;
import com.google.android.gms.internal.ads.zzfof;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class h8o implements zzfof {
    public final zzfit a;
    public final zzfiv b;
    public final zzm c;
    public final String d;
    public final Executor e;
    public final zzx f;
    public final zzfnv g;

    public h8o(zzfit zzfitVar, zzfiv zzfivVar, zzm zzmVar, String str, Executor executor, zzx zzxVar, zzfnv zzfnvVar) {
        this.a = zzfitVar;
        this.b = zzfivVar;
        this.c = zzmVar;
        this.d = str;
        this.e = executor;
        this.f = zzxVar;
        this.g = zzfnvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfof
    public final Executor zza() {
        return this.e;
    }

    @Override // com.google.android.gms.internal.ads.zzfof
    public final zzfnv zzb() {
        return this.g;
    }
}

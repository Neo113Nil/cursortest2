package defpackage;

import android.os.Trace;
import com.google.android.gms.internal.ads.zzadn;
import com.google.android.gms.internal.ads.zzafb;
import com.google.android.gms.internal.ads.zzvp;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class ean implements zzafb {
    public final /* synthetic */ zzvp a;
    public final /* synthetic */ int b;
    public final /* synthetic */ zzadn c;

    public ean(zzadn zzadnVar, zzvp zzvpVar, int i, long j) {
        this.a = zzvpVar;
        this.b = i;
        this.c = zzadnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzafb
    public final void c(long j) {
        this.c.z0(this.a, this.b, j);
    }

    @Override // com.google.android.gms.internal.ads.zzafb
    public final void zzb() {
        Trace.beginSection("dropVideoBuffer");
        this.a.k(this.b);
        Trace.endSection();
        this.c.x0(0, 1);
    }
}

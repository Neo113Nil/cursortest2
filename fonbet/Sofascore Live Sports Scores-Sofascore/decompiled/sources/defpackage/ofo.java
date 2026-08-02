package defpackage;

import com.google.android.gms.internal.ads.zzggt;
import com.google.android.gms.internal.ads.zzgpx;
import com.google.android.gms.internal.ads.zzgrh;
import com.google.android.gms.internal.ads.zzinq;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class ofo implements zzgpx {
    public final zzinq a;
    public final zzgrh b;
    public final long c;

    public ofo(zzinq zzinqVar, zzgrh zzgrhVar, long j) {
        this.a = zzinqVar;
        this.b = zzgrhVar;
        this.c = j;
    }

    @Override // com.google.android.gms.internal.ads.zzgpx
    public final boolean a(zzggt zzggtVar) {
        zzgrh zzgrhVar = this.b;
        if (zzggtVar == null || zzggtVar.equals(zzggt.J())) {
            zzgrhVar.b(15102);
            return false;
        }
        if (zzggtVar.F() == this.a.zzb()) {
            return true;
        }
        zzgrhVar.b(15103);
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzgpx
    public final boolean b(zzggt zzggtVar) {
        zzgrh zzgrhVar = this.b;
        if (zzggtVar == null || zzggtVar.equals(zzggt.J())) {
            zzgrhVar.b(15104);
            return true;
        }
        if (zzggtVar.F() != this.a.zzb()) {
            zzgrhVar.b(15105);
            return true;
        }
        boolean z = (zzggtVar.D().F() * 1000) - System.currentTimeMillis() <= this.c;
        if (z) {
            zzgrhVar.b(15106);
        }
        return z;
    }
}

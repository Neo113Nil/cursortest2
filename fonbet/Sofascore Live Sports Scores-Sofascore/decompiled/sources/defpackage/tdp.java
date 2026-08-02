package defpackage;

import com.google.android.gms.internal.ads.zzage;
import com.google.android.gms.internal.ads.zzagx;
import com.google.android.gms.internal.ads.zzahs;
import com.google.android.gms.internal.ads.zzaht;
import com.google.android.gms.internal.ads.zzeu;
import com.google.android.gms.internal.ads.zzj;
import com.google.android.gms.internal.ads.zzzf;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class tdp extends zzagx {
    public final zzzf b;
    public final zzage c;
    public final AtomicReference d;

    public tdp(zzzf zzzfVar) {
        super(zzzfVar);
        this.b = zzzfVar;
        this.c = new zzage();
        this.d = new AtomicReference(rdp.a);
    }

    public final zzaht a() {
        return this.d.get() == rdp.c ? this.c : this.b;
    }

    @Override // com.google.android.gms.internal.ads.zzagx, com.google.android.gms.internal.ads.zzaht
    public final void b(int i, zzeu zzeuVar) {
        a().b(i, zzeuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzagx, com.google.android.gms.internal.ads.zzaht
    public final int c(zzj zzjVar, int i, boolean z) {
        return a().c(zzjVar, i, z);
    }

    @Override // com.google.android.gms.internal.ads.zzagx, com.google.android.gms.internal.ads.zzaht
    public final int d(zzj zzjVar, int i, boolean z) {
        return a().d(zzjVar, i, z);
    }

    @Override // com.google.android.gms.internal.ads.zzagx, com.google.android.gms.internal.ads.zzaht
    public final void f(long j, int i, int i2, int i3, zzahs zzahsVar) {
        a().f(j, i, i2, i3, zzahsVar);
        AtomicReference atomicReference = this.d;
        if (atomicReference.get() == rdp.b) {
            this.b.k(false);
            atomicReference.set(rdp.c);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzagx, com.google.android.gms.internal.ads.zzaht
    public final void g(zzeu zzeuVar, int i, int i2) {
        a().g(zzeuVar, i, i2);
    }
}

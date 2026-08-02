package defpackage;

import com.google.android.gms.measurement.internal.zzhz;
import com.google.android.gms.measurement.internal.zzic;
import com.google.android.gms.measurement.internal.zzoc;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class mzo implements Runnable {
    public final long a;
    public final long b;
    public final /* synthetic */ gvo c;

    public mzo(gvo gvoVar, long j, long j2) {
        Objects.requireNonNull(gvoVar);
        this.c = gvoVar;
        this.a = j;
        this.b = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzhz zzhzVar = ((zzic) ((zzoc) this.c.c).b).g;
        zzic.m(zzhzVar);
        zzhzVar.Z(new dno(this, 12));
    }
}

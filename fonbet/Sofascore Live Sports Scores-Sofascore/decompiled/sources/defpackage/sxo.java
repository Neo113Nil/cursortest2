package defpackage;

import com.google.android.gms.measurement.internal.zzgu;
import com.google.android.gms.measurement.internal.zzic;
import com.google.android.gms.measurement.internal.zznl;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class sxo extends skn {
    public final /* synthetic */ int e;
    public final /* synthetic */ zznl f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sxo(zznl zznlVar, iso isoVar, int i) {
        super(isoVar);
        this.e = i;
        this.f = zznlVar;
    }

    @Override // defpackage.skn
    public final void a() {
        int i = this.e;
        zznl zznlVar = this.f;
        switch (i) {
            case 0:
                zznlVar.Q();
                if (zznlVar.h0()) {
                    zzgu zzguVar = ((zzic) zznlVar.b).f;
                    zzic.m(zzguVar);
                    zzguVar.o.a("Inactivity, disconnecting from the service");
                    zznlVar.Y();
                    break;
                }
                break;
            default:
                zzgu zzguVar2 = ((zzic) zznlVar.b).f;
                zzic.m(zzguVar2);
                zzguVar2.j.a("Tasks have been queued for a long time");
                break;
        }
    }
}

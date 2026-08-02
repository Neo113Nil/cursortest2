package defpackage;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzjd;
import com.google.android.gms.measurement.internal.zzpg;
import com.google.android.gms.measurement.internal.zzr;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class dro implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zzjd b;
    public final /* synthetic */ zzr c;

    public /* synthetic */ dro(zzjd zzjdVar, zzr zzrVar, int i) {
        this.a = i;
        this.c = zzrVar;
        this.b = zzjdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        zzr zzrVar = this.c;
        zzjd zzjdVar = this.b;
        switch (i) {
            case 0:
                zzpg zzpgVar = zzjdVar.a;
                zzpgVar.W();
                zzpgVar.d().Q();
                zzpgVar.m0();
                Preconditions.f(zzrVar.a);
                zzpgVar.n0(zzrVar);
                zzpgVar.o0(zzrVar);
                break;
            default:
                zzpg zzpgVar2 = zzjdVar.a;
                zzpgVar2.W();
                zzpgVar2.n0(zzrVar);
                break;
        }
    }
}

package defpackage;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzjd;
import com.google.android.gms.measurement.internal.zzpg;
import com.google.android.gms.measurement.internal.zzr;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class gpo implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zzr b;
    public final /* synthetic */ zzjd c;

    public /* synthetic */ gpo(zzjd zzjdVar, zzr zzrVar, int i) {
        this.a = i;
        this.b = zzrVar;
        this.c = zzjdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        zzr zzrVar = this.b;
        zzjd zzjdVar = this.c;
        switch (i) {
            case 0:
                zzpg zzpgVar = zzjdVar.a;
                zzpgVar.W();
                zzpgVar.Z(zzrVar);
                break;
            case 1:
                zzpg zzpgVar2 = zzjdVar.a;
                zzpgVar2.W();
                zzpgVar2.d().Q();
                zzpgVar2.m0();
                Preconditions.f(zzrVar.a);
                zzpgVar2.d0(zzrVar);
                break;
            default:
                zzpg zzpgVar3 = zzjdVar.a;
                zzpgVar3.W();
                zzpgVar3.o0(zzrVar);
                break;
        }
    }
}

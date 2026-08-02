package defpackage;

import com.google.android.gms.internal.ads.zzchj;
import com.google.android.gms.internal.ads.zzcht;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class psn implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zzchj b;

    public /* synthetic */ psn(zzchj zzchjVar, int i) {
        this.a = i;
        this.b = zzchjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        zzchj zzchjVar = this.b;
        switch (i) {
            case 0:
                zzcht zzchtVar = zzchjVar.q;
                if (zzchtVar != null) {
                    zzchtVar.i();
                    break;
                }
                break;
            case 1:
                zzcht zzchtVar2 = zzchjVar.q;
                if (zzchtVar2 != null) {
                    zzchtVar2.e();
                    break;
                }
                break;
            case 2:
                zzcht zzchtVar3 = zzchjVar.q;
                if (zzchtVar3 != null) {
                    zzchtVar3.h();
                    zzchjVar.q.k();
                    break;
                }
                break;
            case 3:
                zzcht zzchtVar4 = zzchjVar.q;
                if (zzchtVar4 != null) {
                    if (!zzchjVar.r) {
                        zzchtVar4.m();
                        zzchjVar.r = true;
                    }
                    zzchjVar.q.g();
                    break;
                }
                break;
            default:
                zzcht zzchtVar5 = zzchjVar.q;
                if (zzchtVar5 != null) {
                    zzchtVar5.h();
                    break;
                }
                break;
        }
    }
}

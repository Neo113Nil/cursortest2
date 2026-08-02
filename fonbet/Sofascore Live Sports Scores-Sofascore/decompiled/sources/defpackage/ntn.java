package defpackage;

import com.google.android.gms.internal.ads.zzcht;
import com.google.android.gms.internal.ads.zzclb;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class ntn implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zzclb b;

    public /* synthetic */ ntn(zzclb zzclbVar, int i) {
        this.a = i;
        this.b = zzclbVar;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        int i = this.a;
        zzclb zzclbVar = this.b;
        switch (i) {
            case 0:
                zzcht zzchtVar = zzclbVar.e;
                if (zzchtVar != null) {
                    if (!zzclbVar.f) {
                        zzchtVar.m();
                        zzclbVar.f = true;
                    }
                    zzclbVar.e.g();
                    break;
                }
                break;
            case 1:
                zzcht zzchtVar2 = zzclbVar.e;
                if (zzchtVar2 != null) {
                    zzchtVar2.h();
                    break;
                }
                break;
            default:
                zzcht zzchtVar3 = zzclbVar.e;
                if (zzchtVar3 != null) {
                    zzchtVar3.f();
                    break;
                }
                break;
        }
    }
}

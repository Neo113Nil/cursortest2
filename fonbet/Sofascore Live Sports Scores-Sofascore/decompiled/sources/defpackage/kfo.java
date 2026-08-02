package defpackage;

import com.google.android.gms.internal.ads.zzfzr;
import com.google.android.gms.internal.ads.zzfzt;
import com.google.android.gms.internal.ads.zzggt;
import com.google.android.gms.internal.ads.zzgmd;
import java.io.File;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class kfo implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ lfo b;

    public /* synthetic */ kfo(lfo lfoVar, int i) {
        this.a = i;
        this.b = lfoVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.a;
        lfo lfoVar = this.b;
        switch (i) {
            case 0:
                zzgmd zzgmdVar = lfoVar.a;
                zzggt b = zzgmdVar.b(1);
                if (b == null) {
                    zzgmdVar.e.b(15315);
                    return null;
                }
                String D = b.D().D();
                File a = zzfzt.a(zzgmdVar.c(), D, "pcam.jar");
                a.getClass();
                if (!a.exists()) {
                    a = zzfzt.a(zzgmdVar.c(), D, "pcam");
                    a.getClass();
                }
                File a2 = zzfzt.a(zzgmdVar.c(), D, "pcopt");
                a2.getClass();
                File a3 = zzfzt.a(zzgmdVar.c(), D, "pcbc");
                a3.getClass();
                return new zzfzr(b.D(), a, a3, a2);
            default:
                zzggt b2 = lfoVar.a.b(1);
                return b2 == null ? zzggt.J() : b2;
        }
    }
}

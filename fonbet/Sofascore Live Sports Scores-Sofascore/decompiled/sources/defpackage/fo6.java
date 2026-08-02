package defpackage;

import android.os.Build;
import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class fo6 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ kx4 b;
    public final /* synthetic */ e1d c;

    public /* synthetic */ fo6(kx4 kx4Var, e1d e1dVar, int i) {
        this.a = i;
        this.b = kx4Var;
        this.c = e1dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        e1d e1dVar = this.c;
        kx4 kx4Var = this.b;
        switch (i) {
            case 0:
                dma dmaVar = (dma) obj;
                dmaVar.getClass();
                e1dVar.setValue(new p75(kx4Var.C0((int) (dmaVar.e() & 4294967295L))));
                return Unit.a;
            case 1:
                float C0 = kx4Var.C0((int) (((c7a) obj).a & 4294967295L));
                if (p75.a(C0, 304.0f) < 0) {
                    C0 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                }
                e1dVar.setValue(new p75(C0));
                return Unit.a;
            case 2:
                s75 s75Var = (s75) obj;
                e1dVar.setValue(new c7a((kx4Var.e0(s75.a(s75Var.a)) & 4294967295L) | (kx4Var.e0(s75.b(s75Var.a)) << 32)));
                return Unit.a;
            default:
                ma0 ma0Var = new ma0(20, (Function0) obj);
                fo6 fo6Var = new fo6(kx4Var, e1dVar, 2);
                if (fob.a()) {
                    return fob.a() ? new cob(ma0Var, fo6Var, Build.VERSION.SDK_INT == 28 ? tla.b : uie.a) : utc.a;
                }
                a70.m("Magnifier is only supported on API level 28 and higher.");
                return null;
        }
    }
}

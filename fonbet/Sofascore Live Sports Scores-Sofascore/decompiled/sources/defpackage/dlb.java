package defpackage;

import com.unity3d.services.UnityAdsConstants;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class dlb extends xka implements Function0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ flb j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dlb(flb flbVar, int i) {
        super(0);
        this.i = i;
        this.j = flbVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.i;
        flb flbVar = this.j;
        switch (i) {
            case 0:
                plb plbVar = (plb) ((eoh) flbVar.i).getValue();
                float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                if (plbVar != null) {
                    if (flbVar.f() < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        flbVar.c();
                    } else {
                        flbVar.c();
                        f = 1.0f;
                    }
                }
                return Float.valueOf(f);
            case 1:
                return Float.valueOf((((Boolean) ((eoh) flbVar.d).getValue()).booleanValue() && flbVar.d() % 2 == 0) ? -flbVar.f() : flbVar.f());
            default:
                return Boolean.valueOf(flbVar.d() == ((Number) ((eoh) flbVar.c).getValue()).intValue() && flbVar.e() == ((Number) flbVar.m.getValue()).floatValue());
        }
    }
}

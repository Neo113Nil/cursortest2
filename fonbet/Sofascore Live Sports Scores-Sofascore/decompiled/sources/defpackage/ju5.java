package defpackage;

import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class ju5 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ cdi c;

    public /* synthetic */ ju5(boolean z, cdi cdiVar, int i) {
        this.a = i;
        this.b = z;
        this.c = cdiVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        cdi cdiVar = this.c;
        boolean z = this.b;
        f4g f4gVar = (f4g) obj;
        f4gVar.getClass();
        switch (i) {
            case 0:
                if (((Boolean) cdiVar.getValue()).booleanValue() && z) {
                    f = 1.0f;
                }
                f4gVar.b(f);
                break;
            default:
                if (z) {
                    f = ((Number) cdiVar.getValue()).floatValue();
                }
                f4gVar.i(f);
                break;
        }
        return Unit.a;
    }
}

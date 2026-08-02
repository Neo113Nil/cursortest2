package defpackage;

import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class sc3 extends dh implements Function2 {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sc3(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.a = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((tc3) this.receiver).a(((Number) obj2).intValue(), (of3) obj);
                break;
            case 1:
                float floatValue = ((Number) obj).floatValue();
                ghf ghfVar = (ghf) this.receiver;
                boolean b = ghfVar.b();
                xnh xnhVar = ghfVar.f;
                float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                if (!b) {
                    if (ghfVar.a() > ghfVar.g.h()) {
                        ((Function0) ghfVar.b.getValue()).invoke();
                    }
                    xw3.L(ghfVar.a, null, null, new we3(ghfVar, f, null, 2), 3);
                    if (xnhVar.h() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || floatValue < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        floatValue = 0.0f;
                    }
                    xnhVar.i(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    f = floatValue;
                }
                break;
            case 2:
                long j = ((vmk) obj).a;
                ivg ivgVar = (ivg) this.receiver;
                xw3.L(ivgVar.L.c(), null, null, new gvg(ivgVar, j, null, 2), 3);
                break;
            default:
                long j2 = ((vmk) obj).a;
                ivg ivgVar2 = (ivg) this.receiver;
                xw3.L(ivgVar2.L.c(), null, null, new gvg(ivgVar2, j2, null, 1), 3);
                break;
        }
        return Unit.a;
    }
}

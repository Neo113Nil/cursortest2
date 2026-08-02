package defpackage;

import com.unity3d.ads.core.domain.CleanUpWhenOpportunityExpires;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class cw2 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ g9i b;

    public /* synthetic */ cw2(g9i g9iVar, int i) {
        this.a = i;
        this.b = g9iVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit invoke$lambda$2;
        int i = this.a;
        g9i g9iVar = this.b;
        Throwable th = (Throwable) obj;
        switch (i) {
            case 0:
                invoke$lambda$2 = CleanUpWhenOpportunityExpires.invoke$lambda$2(g9iVar, th);
                return invoke$lambda$2;
            default:
                g9iVar.e(null);
                return Unit.a;
        }
    }
}

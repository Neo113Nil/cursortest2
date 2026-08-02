package defpackage;

import com.moloco.sdk.internal.publisher.h0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.o;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ohf implements ct8 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;

    public ohf(boolean z, long j, xhf xhfVar) {
        this.b = z;
        this.c = j;
        this.d = xhfVar;
    }

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        Object obj4 = this.d;
        switch (i) {
            case 0:
                of3 of3Var = (of3) obj2;
                int intValue = ((Number) obj3).intValue();
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 17) != 16)) {
                    wnn.d(Boolean.valueOf(this.b), null, ufa.I(bwc.c, av8Var), null, yqo.H(-2064098104, av8Var, new nhf(this.c, (xhf) obj4)), av8Var, 24576, 10);
                } else {
                    av8Var.W();
                }
                break;
            default:
                ((Number) obj3).intValue();
                ((r70) obj).getClass();
                h0.m(this.b, (o) obj4, null, this.c, (of3) obj2, 0);
                break;
        }
        return Unit.a;
    }

    public ohf(boolean z, o oVar, long j) {
        this.b = z;
        this.d = oVar;
        this.c = j;
    }
}

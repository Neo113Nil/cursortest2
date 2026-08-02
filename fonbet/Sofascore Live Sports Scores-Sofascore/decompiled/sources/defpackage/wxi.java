package defpackage;

import com.sofascore.results.league.fragment.details.compose.totr.share.TotrSharePayload;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class wxi implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ TotrSharePayload b;
    public final /* synthetic */ xtc c;
    public final /* synthetic */ int d;

    public /* synthetic */ wxi(TotrSharePayload totrSharePayload, xtc xtcVar, int i) {
        this.b = totrSharePayload;
        this.c = xtcVar;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        of3 of3Var = (of3) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                z8e.q(this.b, this.c, of3Var, aba.K(1), this.d);
                break;
            default:
                z8e.o(this.b, this.c, of3Var, aba.K(this.d | 1));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ wxi(TotrSharePayload totrSharePayload, xtc xtcVar, int i, int i2) {
        this.b = totrSharePayload;
        this.c = xtcVar;
        this.d = i2;
    }
}

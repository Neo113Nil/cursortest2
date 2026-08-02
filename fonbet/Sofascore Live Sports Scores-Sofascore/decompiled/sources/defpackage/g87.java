package defpackage;

import com.sofascore.model.fantasy.FantasyNewsArticle;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class g87 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ FantasyNewsArticle b;
    public final /* synthetic */ Function1 c;
    public final /* synthetic */ xtc d;

    public /* synthetic */ g87(FantasyNewsArticle fantasyNewsArticle, Function1 function1, xtc xtcVar, int i, int i2) {
        this.a = i2;
        this.b = fantasyNewsArticle;
        this.c = function1;
        this.d = xtcVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        xtc xtcVar = this.d;
        Function1 function1 = this.c;
        FantasyNewsArticle fantasyNewsArticle = this.b;
        of3 of3Var = (of3) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                o1j.h(fantasyNewsArticle, function1, xtcVar, of3Var, aba.K(1));
                break;
            default:
                fqj.h(fantasyNewsArticle, function1, xtcVar, of3Var, aba.K(385));
                break;
        }
        return Unit.a;
    }
}

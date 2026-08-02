package defpackage;

import android.content.Context;
import com.sofascore.results.feed.compose.model.ShortVideoFeedCardModel;
import java.util.List;
import java.util.ListIterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class o7d implements et8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ o7d(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v9 */
    @Override // defpackage.et8
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        d6d d6dVar;
        int i;
        int i2 = this.a;
        Object obj5 = this.c;
        Object obj6 = this.b;
        Object obj7 = this.d;
        Object obj8 = this.e;
        Object obj9 = this.f;
        switch (i2) {
            case 0:
                k60 k60Var = (k60) obj;
                d6d d6dVar2 = (d6d) obj2;
                of3 of3Var = (of3) obj3;
                ((Number) obj4).intValue();
                boolean c = Intrinsics.c(((eoh) ((o0h) obj6).d).getValue(), (d6d) obj5);
                if (!((Boolean) ((e1d) obj8).getValue()).booleanValue() && !c) {
                    List list = (List) ((cdi) obj9).getValue();
                    ListIterator listIterator = list.listIterator(list.size());
                    while (true) {
                        if (listIterator.hasPrevious()) {
                            d6dVar = listIterator.previous();
                            if (Intrinsics.c(d6dVar2, (d6d) d6dVar)) {
                            }
                        } else {
                            d6dVar = 0;
                        }
                    }
                    d6dVar2 = d6dVar;
                }
                av8 av8Var = (av8) of3Var;
                if (d6dVar2 == null) {
                    av8Var.d0(105930796);
                } else {
                    av8Var.d0(-1520603531);
                    x2a.g(d6dVar2, (mpg) obj7, yqo.H(-1263531443, av8Var, new kp1(11, d6dVar2, k60Var)), av8Var, 384);
                }
                av8Var.s(false);
                break;
            default:
                xpa xpaVar = (xpa) obj;
                int intValue = ((Number) obj2).intValue();
                of3 of3Var2 = (of3) obj3;
                int intValue2 = ((Number) obj4).intValue();
                f49 f49Var = (f49) obj9;
                ct8 ct8Var = (ct8) obj8;
                Context context = (Context) obj7;
                if ((intValue2 & 6) == 0) {
                    i = (((av8) of3Var2).g(xpaVar) ? 4 : 2) | intValue2;
                } else {
                    i = intValue2;
                }
                if ((intValue2 & 48) == 0) {
                    i |= ((av8) of3Var2).e(intValue) ? 32 : 16;
                }
                boolean z = true;
                av8 av8Var2 = (av8) of3Var2;
                if (av8Var2.T(i & 1, (i & 147) != 146)) {
                    ShortVideoFeedCardModel shortVideoFeedCardModel = (ShortVideoFeedCardModel) ((List) obj6).get(intValue);
                    av8Var2.d0(1142304230);
                    wla wlaVar = (wla) obj5;
                    int i3 = (i & 112) ^ 48;
                    boolean i4 = av8Var2.i(context) | av8Var2.g(shortVideoFeedCardModel) | ((i3 > 32 && av8Var2.e(intValue)) || (i & 48) == 32);
                    Object O = av8Var2.O();
                    a99 a99Var = nf3.a;
                    if (i4 || O == a99Var) {
                        O = new nfh(context, shortVideoFeedCardModel, intValue);
                        av8Var2.n0(O);
                    }
                    xtc P = tgj.P(wlaVar, (Function1) O, av8Var2);
                    boolean g = av8Var2.g(ct8Var);
                    if ((i3 <= 32 || !av8Var2.e(intValue)) && (i & 48) != 32) {
                        z = false;
                    }
                    boolean g2 = g | z | av8Var2.g(f49Var);
                    Object O2 = av8Var2.O();
                    if (g2 || O2 == a99Var) {
                        O2 = new nfh(ct8Var, intValue, f49Var);
                        av8Var2.n0(O2);
                    }
                    h5a.u(shortVideoFeedCardModel, (Function1) O2, P, av8Var2, 0);
                    av8Var2.s(false);
                } else {
                    av8Var2.W();
                }
                break;
        }
        return Unit.a;
    }
}

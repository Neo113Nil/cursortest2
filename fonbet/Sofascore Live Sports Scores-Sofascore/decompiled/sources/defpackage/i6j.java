package defpackage;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class i6j implements ct8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ m6j b;
    public final /* synthetic */ Function1 c;

    public /* synthetic */ i6j(int i, m6j m6jVar, Function1 function1) {
        this.a = i;
        this.b = m6jVar;
        this.c = function1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        a99 a99Var = nf3.a;
        final Function1 function1 = this.c;
        final m6j m6jVar = this.b;
        Object[] objArr = 0;
        final int i2 = 1;
        switch (i) {
            case 0:
                of3 of3Var = (of3) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((v23) obj).getClass();
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 17) != 16)) {
                    boolean i3 = av8Var.i(m6jVar) | av8Var.g(function1);
                    Object O = av8Var.O();
                    if (i3 || O == a99Var) {
                        final Object[] objArr2 = objArr == true ? 1 : 0;
                        O = new Function1() { // from class: l6j
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                int i4 = objArr2;
                                Function1 function12 = function1;
                                m6j m6jVar2 = m6jVar;
                                Context context = (Context) obj4;
                                switch (i4) {
                                    case 0:
                                        context.getClass();
                                        p6j p6jVar = new p6j(context, false);
                                        p6jVar.l(m6jVar2.m, m6jVar2.n, false, true, new j6j(2, m6jVar2, function12));
                                        return p6jVar;
                                    default:
                                        context.getClass();
                                        p6j p6jVar2 = new p6j(context, false);
                                        p6jVar2.l(m6jVar2.m, m6jVar2.n, false, false, new j6j(4, m6jVar2, function12));
                                        return p6jVar2;
                                }
                            }
                        };
                        av8Var.n0(O);
                    }
                    td4.a((Function1) O, null, null, av8Var, 0, 6);
                } else {
                    av8Var.W();
                }
                break;
            default:
                of3 of3Var2 = (of3) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((m12) obj).getClass();
                av8 av8Var2 = (av8) of3Var2;
                if (av8Var2.T(intValue2 & 1, (intValue2 & 17) != 16)) {
                    boolean i4 = av8Var2.i(m6jVar) | av8Var2.g(function1);
                    Object O2 = av8Var2.O();
                    if (i4 || O2 == a99Var) {
                        O2 = new Function1() { // from class: l6j
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                int i42 = i2;
                                Function1 function12 = function1;
                                m6j m6jVar2 = m6jVar;
                                Context context = (Context) obj4;
                                switch (i42) {
                                    case 0:
                                        context.getClass();
                                        p6j p6jVar = new p6j(context, false);
                                        p6jVar.l(m6jVar2.m, m6jVar2.n, false, true, new j6j(2, m6jVar2, function12));
                                        return p6jVar;
                                    default:
                                        context.getClass();
                                        p6j p6jVar2 = new p6j(context, false);
                                        p6jVar2.l(m6jVar2.m, m6jVar2.n, false, false, new j6j(4, m6jVar2, function12));
                                        return p6jVar2;
                                }
                            }
                        };
                        av8Var2.n0(O2);
                    }
                    td4.a((Function1) O2, null, null, av8Var2, 0, 6);
                } else {
                    av8Var2.W();
                }
                break;
        }
        return Unit.a;
    }
}

package defpackage;

import com.sofascore.results.weeklyChallenge.WeeklyChallengeViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class w6d implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ Function1 c;
    public final /* synthetic */ Function1 d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ dt8 k;
    public final /* synthetic */ dt8 l;

    public /* synthetic */ w6d(sn3 sn3Var, WeeklyChallengeViewModel weeklyChallengeViewModel, Function0 function0, Function0 function02, Function1 function1, Function0 function03, Function0 function04, Function1 function12, Function0 function05, Function1 function13, Function0 function06, int i) {
        this.e = sn3Var;
        this.f = weeklyChallengeViewModel;
        this.b = function0;
        this.g = function02;
        this.c = function1;
        this.h = function03;
        this.i = function04;
        this.d = function12;
        this.j = function05;
        this.k = function13;
        this.l = function06;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        dt8 dt8Var = this.l;
        dt8 dt8Var2 = this.k;
        Object obj3 = this.j;
        Object obj4 = this.i;
        Object obj5 = this.h;
        Object obj6 = this.g;
        Object obj7 = this.f;
        Object obj8 = this.e;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int K = aba.K(1);
                r4a.f((List) obj8, (xtc) obj4, (io) obj3, this.b, (List) obj7, (List) obj6, (List) obj5, this.c, this.d, (Function2) dt8Var2, (r82) dt8Var, (of3) obj, K);
                break;
            default:
                ((Integer) obj2).getClass();
                int K2 = aba.K(1);
                ao2.k((sn3) obj8, (WeeklyChallengeViewModel) obj7, this.b, (Function0) obj6, this.c, (Function0) obj5, (Function0) obj4, this.d, (Function0) obj3, (Function1) dt8Var2, (Function0) dt8Var, (of3) obj, K2);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ w6d(List list, xtc xtcVar, io ioVar, Function0 function0, List list2, List list3, List list4, Function1 function1, Function1 function12, Function2 function2, r82 r82Var, int i) {
        this.e = list;
        this.i = xtcVar;
        this.j = ioVar;
        this.b = function0;
        this.f = list2;
        this.g = list3;
        this.h = list4;
        this.c = function1;
        this.d = function12;
        this.k = function2;
        this.l = r82Var;
    }
}

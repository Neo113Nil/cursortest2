package defpackage;

import com.sofascore.model.crowdsourcing.TeamSide;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class vo implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ vo(int i, int i2, tc3 tc3Var) {
        this.a = 4;
        this.b = i;
        this.d = tc3Var;
        this.c = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.d;
        int i2 = this.c;
        int i3 = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                v9g.a((gv9) obj3, i3, (of3) obj, aba.K(1), i2);
                break;
            case 1:
                ((Integer) obj2).getClass();
                pd0.d(i3, i2, (TeamSide) obj3, (of3) obj, aba.K(1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                o02.E(i3, i2, (Function2) obj3, (of3) obj, aba.K(1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                gvd.m((Integer) obj3, i3, (of3) obj, aba.K(i2 | 1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                s02.h(i3, (tc3) obj3, (of3) obj, aba.K(i2 | 1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                int K = aba.K(i2 | 1);
                l98.t(i3, K, (of3) obj, (String) obj3);
                break;
            default:
                ((Integer) obj2).getClass();
                haa.e(i3, i2, (p5j) obj3, (of3) obj, aba.K(1));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ vo(int i, int i2, int i3, int i4, Object obj) {
        this.a = i4;
        this.b = i;
        this.c = i2;
        this.d = obj;
    }

    public /* synthetic */ vo(int i, int i2, Integer num) {
        this.a = 3;
        this.d = num;
        this.b = i;
        this.c = i2;
    }

    public /* synthetic */ vo(int i, String str, int i2) {
        this.a = 5;
        this.b = i;
        this.d = str;
        this.c = i2;
    }

    public /* synthetic */ vo(gv9 gv9Var, int i, int i2, int i3) {
        this.a = 0;
        this.d = gv9Var;
        this.b = i;
        this.c = i3;
    }
}

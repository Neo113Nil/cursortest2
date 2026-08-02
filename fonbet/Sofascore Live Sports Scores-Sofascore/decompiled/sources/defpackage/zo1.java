package defpackage;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class zo1 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ xtc b;
    public final /* synthetic */ dfj c;
    public final /* synthetic */ Function1 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ int g;
    public final /* synthetic */ int h;
    public final /* synthetic */ es0 i;
    public final /* synthetic */ int j;
    public final /* synthetic */ int k;
    public final /* synthetic */ CharSequence l;
    public final /* synthetic */ Object m;

    public /* synthetic */ zo1(CharSequence charSequence, xtc xtcVar, dfj dfjVar, Function1 function1, int i, boolean z, int i2, int i3, Object obj, es0 es0Var, int i4, int i5, int i6) {
        this.a = i6;
        this.l = charSequence;
        this.b = xtcVar;
        this.c = dfjVar;
        this.d = function1;
        this.e = i;
        this.f = z;
        this.g = i2;
        this.h = i3;
        this.m = obj;
        this.i = es0Var;
        this.j = i4;
        this.k = i5;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                int K = aba.K(this.j | 1);
                iz8.d((String) this.l, this.b, this.c, this.d, this.e, this.f, this.g, this.h, (c23) this.m, this.i, (of3) obj, K, this.k);
                break;
            default:
                ((Integer) obj2).getClass();
                int K2 = aba.K(this.j | 1);
                int K3 = aba.K(this.k);
                iz8.c((q80) this.l, this.b, this.c, this.d, this.e, this.f, this.g, this.h, (Map) this.m, this.i, (of3) obj, K2, K3);
                break;
        }
        return Unit.a;
    }
}

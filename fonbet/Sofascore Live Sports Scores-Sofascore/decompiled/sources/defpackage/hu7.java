package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class hu7 implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ xtc e;
    public final /* synthetic */ int f;
    public final /* synthetic */ dt8 g;

    public /* synthetic */ hu7(int i, int i2, int i3, Function1 function1, xtc xtcVar, int i4) {
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.g = function1;
        this.e = xtcVar;
        this.f = i4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                iu7.a(this.b, this.c, (Function0) this.g, this.e, (of3) obj, aba.K(this.d | 1), this.f);
                break;
            default:
                ((Integer) obj2).getClass();
                f6a.b(this.b, this.c, this.d, (Function1) this.g, this.e, (of3) obj, aba.K(this.f | 1));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ hu7(int i, int i2, Function0 function0, xtc xtcVar, int i3, int i4) {
        this.b = i;
        this.c = i2;
        this.g = function0;
        this.e = xtcVar;
        this.d = i3;
        this.f = i4;
    }
}

package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class d00 extends xka implements Function1 {
    public final /* synthetic */ int i;
    public final /* synthetic */ f25 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d00(f25 f25Var, int i) {
        super(1);
        this.i = i;
        this.j = f25Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.i;
        f25 f25Var = this.j;
        switch (i) {
            case 0:
                f25Var.show();
                return new le(f25Var, 1);
            default:
                if (f25Var.f.a) {
                    f25Var.e.invoke();
                }
                return Unit.a;
        }
    }
}

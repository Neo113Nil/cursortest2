package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class o99 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ p99 b;

    public /* synthetic */ o99(p99 p99Var, int i) {
        this.a = i;
        this.b = p99Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        p99 p99Var = this.b;
        switch (i) {
            case 0:
                i6k i6kVar = p99Var.v;
                if (i6kVar == null) {
                    throw wv8.d("Font resolution state is not set.");
                }
                i6kVar.getValue();
                return Unit.a;
            default:
                i6k i6kVar2 = p99Var.v;
                if (i6kVar2 == null) {
                    throw wv8.d("Font resolution state is not set.");
                }
                i6kVar2.getValue();
                return Unit.a;
        }
    }
}

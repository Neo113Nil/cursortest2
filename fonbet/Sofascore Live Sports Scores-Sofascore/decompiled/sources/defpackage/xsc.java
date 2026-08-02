package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class xsc implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ dfh b;
    public final /* synthetic */ Function0 c;

    public /* synthetic */ xsc(dfh dfhVar, Function0 function0, int i) {
        this.a = i;
        this.b = dfhVar;
        this.c = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                if (!this.b.d()) {
                    this.c.invoke();
                }
                break;
            default:
                if (!this.b.d()) {
                    this.c.invoke();
                }
                break;
        }
        return Unit.a;
    }
}

package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class cp1 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ hej b;

    public /* synthetic */ cp1(hej hejVar, int i) {
        this.a = i;
        this.b = hejVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        int i2 = 2;
        hej hejVar = this.b;
        switch (i) {
            case 0:
                return Boolean.valueOf(hejVar != null ? ((Boolean) new cp1(hejVar, i2).invoke()).booleanValue() : false);
            case 1:
                return Boolean.valueOf(hejVar != null ? ((Boolean) new cp1(hejVar, i2).invoke()).booleanValue() : false);
            default:
                q80 q80Var = hejVar.b;
                aej aejVar = (aej) ((eoh) hejVar.a).getValue();
                return Boolean.valueOf(Intrinsics.c(q80Var, aejVar != null ? aejVar.a.a : null));
        }
    }
}

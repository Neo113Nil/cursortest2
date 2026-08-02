package defpackage;

import java.util.function.Predicate;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class rug implements Predicate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ rug(int i, Function1 function1) {
        this.a = i;
        this.b = function1;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        int i = this.a;
        Function1 function1 = this.b;
        switch (i) {
            case 0:
                return ((Boolean) ((qfg) function1).invoke(obj)).booleanValue();
            default:
                return ((Boolean) ((iol) function1).invoke(obj)).booleanValue();
        }
    }
}

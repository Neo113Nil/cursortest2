package defpackage;

import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.CloseKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class jim implements Function2 {
    public static final jim a = new jim();

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        of3 of3Var = (of3) obj;
        if ((((Number) obj2).intValue() & 3) == 2) {
            av8 av8Var = (av8) of3Var;
            if (av8Var.D()) {
                av8Var.W();
                return Unit.a;
            }
        }
        kq9.b(CloseKt.getClose(Icons.INSTANCE.getDefault()), "Close", null, kam.c, of3Var, 3120, 4);
        return Unit.a;
    }
}

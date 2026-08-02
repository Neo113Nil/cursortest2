package defpackage;

import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.ClearKt;
import com.sofascore.results.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class pvl implements Function2 {
    public static final pvl a = new pvl();

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
        kq9.b(ClearKt.getClear(Icons.INSTANCE.getDefault()), oea.v(R.string.blaze_search_clear, of3Var), bkh.l(utc.a, 18.0f), l3m.g, of3Var, 3456, 0);
        return Unit.a;
    }
}

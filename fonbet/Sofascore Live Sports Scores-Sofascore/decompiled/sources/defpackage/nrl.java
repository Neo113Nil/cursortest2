package defpackage;

import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.automirrored.filled.ArrowBackKt;
import com.sofascore.results.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class nrl implements Function2 {
    public static final nrl a = new nrl();

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
        kq9.b(ArrowBackKt.getArrowBack(Icons.AutoMirrored.Filled.INSTANCE), oea.v(R.string.blaze_search_back, of3Var), bkh.l(utc.a, 24.0f), l3m.f, of3Var, 3456, 0);
        return Unit.a;
    }
}

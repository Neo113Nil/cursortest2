package defpackage;

import androidx.compose.ui.graphics.vector.ImageVector;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class gj4 implements Function2 {
    public final /* synthetic */ Function0 a;
    public final /* synthetic */ xtc b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ ImageVector d;
    public final /* synthetic */ String e;

    public gj4(Function0 function0, xtc xtcVar, boolean z, ImageVector imageVector, String str) {
        this.a = function0;
        this.b = xtcVar;
        this.c = z;
        this.d = imageVector;
        this.e = str;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        of3 of3Var = (of3) obj;
        int intValue = ((Number) obj2).intValue();
        boolean z = false;
        av8 av8Var = (av8) of3Var;
        if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
            ao2.g(this.a, this.b, this.c, null, null, yqo.H(-1301085432, av8Var, new kp1(this.d, this.e, z, 4)), av8Var, 1572864, 56);
        } else {
            av8Var.W();
        }
        return Unit.a;
    }
}

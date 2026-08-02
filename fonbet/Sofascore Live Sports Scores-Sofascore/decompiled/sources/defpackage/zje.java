package defpackage;

import androidx.compose.runtime.e;
import java.util.Arrays;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class zje {
    public final ale a;
    public final e1d b = e.f(Boolean.FALSE);
    public final e1d c = e.f(Boolean.TRUE);
    public final uwe d;

    public zje(ale aleVar) {
        this.a = aleVar;
        this.d = new uwe(aleVar, Arrays.copyOf(new int[]{5, 13}, 2), new mnc(this, 29));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(sq3 sq3Var) {
        yje yjeVar;
        int i;
        if (sq3Var instanceof yje) {
            yjeVar = (yje) sq3Var;
            int i2 = yjeVar.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                yjeVar.t = i2 - Integer.MIN_VALUE;
                Object obj = yjeVar.r;
                lu3 lu3Var = lu3.a;
                i = yjeVar.t;
                if (i == 0) {
                    if (i == 1) {
                        throw wt3.i(obj);
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                uwe uweVar = this.d;
                if (uweVar == null) {
                    return Unit.a;
                }
                yjeVar.t = 1;
                uweVar.a(yjeVar);
                return lu3Var;
            }
        }
        yjeVar = new yje(this, sq3Var);
        Object obj2 = yjeVar.r;
        lu3 lu3Var2 = lu3.a;
        i = yjeVar.t;
        if (i == 0) {
        }
    }
}

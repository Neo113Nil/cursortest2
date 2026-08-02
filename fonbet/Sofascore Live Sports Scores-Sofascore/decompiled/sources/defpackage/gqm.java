package defpackage;

import com.blaze.blazesdk.closed_captions.models.ui.b;
import com.blaze.blazesdk.closed_captions.models.ui.d;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class gqm implements b98 {
    public final /* synthetic */ b98 a;

    public gqm(b98 b98Var) {
        this.a = b98Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.b98
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, rq3 rq3Var) {
        rom romVar;
        int i;
        if (rq3Var instanceof rom) {
            romVar = (rom) rq3Var;
            int i2 = romVar.s;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                romVar.s = i2 - Integer.MIN_VALUE;
                Object obj2 = romVar.r;
                lu3 lu3Var = lu3.a;
                i = romVar.s;
                Object obj3 = null;
                if (i != 0) {
                    y6a.M(obj2);
                    String str = (String) obj;
                    if (str != null) {
                        if (str.equals("unknown")) {
                            obj3 = d.a;
                        } else if (b6a.i(str)) {
                            obj3 = new b(str);
                        }
                    }
                    romVar.s = 1;
                    if (this.a.emit(obj3, romVar) == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj2);
                }
                return Unit.a;
            }
        }
        romVar = new rom(this, rq3Var);
        Object obj22 = romVar.r;
        lu3 lu3Var2 = lu3.a;
        i = romVar.s;
        Object obj32 = null;
        if (i != 0) {
        }
        return Unit.a;
    }
}

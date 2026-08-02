package defpackage;

import com.blaze.blazesdk.ads.ima.BlazeIMAHandlerEventType;
import com.blaze.blazesdk.ads.ima.models.BlazeImaAdEvent;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class m6m implements b98 {
    public final /* synthetic */ b98 a;

    public m6m(b98 b98Var) {
        this.a = b98Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.b98
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, rq3 rq3Var) {
        f3m f3mVar;
        int i;
        if (rq3Var instanceof f3m) {
            f3mVar = (f3m) rq3Var;
            int i2 = f3mVar.s;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                f3mVar.s = i2 - Integer.MIN_VALUE;
                Object obj2 = f3mVar.r;
                lu3 lu3Var = lu3.a;
                i = f3mVar.s;
                if (i != 0) {
                    y6a.M(obj2);
                    BlazeIMAHandlerEventType type = ((BlazeImaAdEvent) obj).getType();
                    f3mVar.s = 1;
                    if (this.a.emit(type, f3mVar) == lu3Var) {
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
        f3mVar = new f3m(this, rq3Var);
        Object obj22 = f3mVar.r;
        lu3 lu3Var2 = lu3.a;
        i = f3mVar.s;
        if (i != 0) {
        }
        return Unit.a;
    }
}

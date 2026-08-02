package defpackage;

import com.sofascore.network.api.NetworkCoroutineAPI;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class ue9 {
    public final NetworkCoroutineAPI a;
    public final se9 b;

    public ue9(NetworkCoroutineAPI networkCoroutineAPI, se9 se9Var) {
        networkCoroutineAPI.getClass();
        this.a = networkCoroutineAPI;
        this.b = se9Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, sq3 sq3Var) {
        te9 te9Var;
        int i;
        if (sq3Var instanceof te9) {
            te9Var = (te9) sq3Var;
            int i2 = te9Var.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                te9Var.t = i2 - Integer.MIN_VALUE;
                Object obj = te9Var.r;
                lu3 lu3Var = lu3.a;
                i = te9Var.t;
                rq3 rq3Var = null;
                if (i != 0) {
                    y6a.M(obj);
                    cl clVar = new cl(this, str, rq3Var, 16);
                    te9Var.t = 1;
                    obj = yaa.P(clVar, te9Var);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return yaa.x((x2g) obj);
            }
        }
        te9Var = new te9(this, sq3Var);
        Object obj2 = te9Var.r;
        lu3 lu3Var2 = lu3.a;
        i = te9Var.t;
        rq3 rq3Var2 = null;
        if (i != 0) {
        }
        return yaa.x((x2g) obj2);
    }
}

package defpackage;

import com.blaze.blazesdk.shared.BlazeSDK;
import com.blaze.blazesdk.shared.results.r0;
import com.google.gson.Gson;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class cxm implements b98 {
    public final /* synthetic */ b98 a;
    public final /* synthetic */ String b;

    public cxm(b98 b98Var, String str) {
        this.a = b98Var;
        this.b = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.b98
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, rq3 rq3Var) {
        tvm tvmVar;
        int i;
        if (rq3Var instanceof tvm) {
            tvmVar = (tvm) rq3Var;
            int i2 = tvmVar.s;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tvmVar.s = i2 - Integer.MIN_VALUE;
                Object obj2 = tvmVar.r;
                lu3 lu3Var = lu3.a;
                i = tvmVar.s;
                Object obj3 = null;
                if (i != 0) {
                    y6a.M(obj2);
                    String str = (String) ((p0d) obj).c(f6a.J(this.b));
                    if (str != null) {
                        try {
                            obj3 = ((Gson) vnm.d.getValue()).fromJson(str, (Class<Object>) String.class);
                        } catch (Exception e) {
                            if (e instanceof yga) {
                                r0 r0Var = new r0();
                                r0Var.f = e;
                                j1m.a(r0Var);
                            } else {
                                BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(e, null);
                            }
                        }
                    }
                    tvmVar.s = 1;
                    if (this.a.emit(obj3, tvmVar) == lu3Var) {
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
        tvmVar = new tvm(this, rq3Var);
        Object obj22 = tvmVar.r;
        lu3 lu3Var2 = lu3.a;
        i = tvmVar.s;
        Object obj32 = null;
        if (i != 0) {
        }
        return Unit.a;
    }
}

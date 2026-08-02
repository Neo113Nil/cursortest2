package defpackage;

import com.blaze.blazesdk.shared.BlazeSDK;
import com.blaze.blazesdk.shared.results.r0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class gkm extends hoi implements Function1 {
    public vnm r;
    public Object s;
    public vsl t;
    public int u;

    public gkm(rq3 rq3Var) {
        super(1, rq3Var);
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        return new gkm(rq3Var);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new gkm((rq3) obj).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00b9, code lost:
    
        if (r9 == r0) goto L45;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0081 A[Catch: Exception -> 0x0025, TRY_LEAVE, TryCatch #0 {Exception -> 0x0025, blocks: (B:14:0x0021, B:15:0x007c, B:25:0x0081, B:28:0x0052, B:30:0x0061, B:32:0x0067), top: B:2:0x0008 }] */
    /* JADX WARN: Type inference failed for: r1v10, types: [vsl] */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.blaze.blazesdk.user_activity.UserActivityApi] */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object] */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        ?? r1;
        String str;
        int i;
        String str2;
        vnm vnmVar;
        ?? r12;
        vnm vnmVar2;
        String str3;
        lu3 lu3Var = lu3.a;
        int i2 = this.u;
        try {
        } catch (Exception e) {
            if (e instanceof yga) {
                r0 r0Var = new r0();
                r0Var.f = e;
                j1m.a(r0Var);
                i = i2;
            } else {
                BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(e, null);
                i = i2;
            }
        }
        if (i2 == 0) {
            y6a.M(obj);
            vsl vslVar = tsl.d;
            if (vslVar == null) {
                return null;
            }
            vnm vnmVar3 = vnm.a;
            this.r = vnmVar3;
            this.s = "blaze_data_store_blaze_user_id";
            this.t = vslVar;
            this.u = 1;
            if (vnmVar3.c(this) != lu3Var) {
                str2 = "blaze_data_store_blaze_user_id";
                vnmVar = vnmVar3;
                r12 = vslVar;
            }
            return lu3Var;
        }
        if (i2 == 1) {
            vsl vslVar2 = this.t;
            str2 = (String) this.s;
            vnmVar = this.r;
            y6a.M(obj);
            r12 = vslVar2;
        } else {
            if (i2 != 2) {
                if (i2 == 3) {
                    y6a.M(obj);
                    return (c2g) obj;
                }
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ?? r13 = (vsl) this.s;
            vnmVar2 = this.r;
            y6a.M(obj);
            i2 = r13;
            str3 = (String) obj;
            if (str3 != null) {
                i = i2;
                obj2 = null;
                r1 = i;
                str = (String) obj2;
                if (str == null) {
                    str = "";
                }
                this.r = null;
                this.s = null;
                this.t = null;
                this.u = 3;
                obj = r1.getUserActivity(str, this);
            } else {
                obj2 = vnm.b(vnmVar2).fromJson(str3, (Class<Object>) String.class);
                r1 = i2;
                str = (String) obj2;
                if (str == null) {
                }
                this.r = null;
                this.s = null;
                this.t = null;
                this.u = 3;
                obj = r1.getUserActivity(str, this);
            }
        }
        e5f J = f6a.J(str2);
        vnm vnmVar4 = vnm.a;
        vnmVar.getClass();
        ye4 a = vnm.a();
        i = r12;
        if (a != null) {
            z88 data = a.getData();
            i = r12;
            if (data != null) {
                vdm vdmVar = new vdm(data, J);
                this.r = vnmVar;
                this.s = r12;
                this.t = null;
                this.u = 2;
                obj = rd0.y(vdmVar, this);
                if (obj == lu3Var) {
                    return lu3Var;
                }
                vnmVar2 = vnmVar;
                i2 = r12;
                str3 = (String) obj;
                if (str3 != null) {
                }
            }
        }
        obj2 = null;
        r1 = i;
        str = (String) obj2;
        if (str == null) {
        }
        this.r = null;
        this.s = null;
        this.t = null;
        this.u = 3;
        obj = r1.getUserActivity(str, this);
    }
}

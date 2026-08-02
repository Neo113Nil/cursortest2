package defpackage;

import android.app.Application;
import com.blaze.blazesdk.analytics.AnalyticsApi;
import com.blaze.blazesdk.logger.apis.BlazeLoggerApi;
import com.blaze.blazesdk.shared.BlazeSDK;
import com.blaze.blazesdk.shared.results.BlazeResult;
import com.blaze.blazesdk.shared.results.d;
import com.blaze.blazesdk.shared.results.e;
import com.blaze.blazesdk.shared.results.g0;
import com.blaze.blazesdk.shared.results.h;
import com.blaze.blazesdk.shared.results.r0;
import defpackage.h1m;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class amm extends hoi implements Function1 {
    public final /* synthetic */ Function0 A;
    public Object r;
    public Object s;
    public jdm t;
    public int u;
    public final /* synthetic */ String v;
    public final /* synthetic */ Application w;
    public final /* synthetic */ Integer x;
    public final /* synthetic */ String y;
    public final /* synthetic */ Function1 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amm(String str, Application application, Integer num, String str2, Function1 function1, Function0 function0, rq3 rq3Var) {
        super(1, rq3Var);
        this.v = str;
        this.w = application;
        this.x = num;
        this.y = str2;
        this.z = function1;
        this.A = function0;
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        return new amm(this.v, this.w, this.x, this.y, this.z, this.A, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((amm) create((rq3) obj)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:16|17|(3:46|(2:47|(2:49|(5:51|52|(1:63)(2:56|(1:58)(1:62))|59|(1:61))(1:64)))|15)|21|22|(1:24)|26|27|(1:29)|31|(1:33)|34|(2:36|(2:38|39))|40) */
    /* JADX WARN: Can't wrap try/catch for region: R(9:96|87|(2:89|(4:91|(1:93)|70|(1:72)(6:84|74|75|76|(1:78)|80)))|73|74|75|76|(0)|80) */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0261, code lost:
    
        if (defpackage.xw3.R(r10, r1, r9) == r0) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x024c, code lost:
    
        if (r10 == r0) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01d2, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01d3, code lost:
    
        com.blaze.blazesdk.shared.BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(r10, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01a9, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01aa, code lost:
    
        com.blaze.blazesdk.shared.BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(r10, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x011a, code lost:
    
        if (r10 == r0) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x010b, code lost:
    
        if (r10.b(r9.w, r9.x, 1, r9) == r0) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00e7, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00e8, code lost:
    
        com.blaze.blazesdk.shared.BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(r10, null);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:72:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00cc A[Catch: all -> 0x00e7, TRY_LEAVE, TryCatch #2 {all -> 0x00e7, blocks: (B:76:0x00c8, B:78:0x00cc), top: B:75:0x00c8 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x009b A[Catch: Exception -> 0x003b, TRY_LEAVE, TryCatch #1 {Exception -> 0x003b, blocks: (B:69:0x0037, B:70:0x0096, B:84:0x009b, B:87:0x006b, B:89:0x007a, B:91:0x0080), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x007a A[Catch: Exception -> 0x003b, TryCatch #1 {Exception -> 0x003b, blocks: (B:69:0x0037, B:70:0x0096, B:84:0x009b, B:87:0x006b, B:89:0x007a, B:91:0x0080), top: B:2:0x0007 }] */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v20, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v24, types: [jdm] */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v36 */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        ?? r1;
        String modifiedProposedExternalUserID;
        int i;
        Object obj3;
        Object dispatchSDKInitializedEvent;
        ?? r12;
        String str;
        vnm vnmVar;
        ye4 a;
        String str2;
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
        switch (i2) {
            case 0:
                y6a.M(obj);
                jdm jdmVar = jdm.a;
                vnm vnmVar2 = vnm.a;
                this.r = vnmVar2;
                this.s = "blaze_data_store_sdk_base_domain";
                this.t = jdmVar;
                this.u = 1;
                if (vnmVar2.c(this) != lu3Var) {
                    r12 = jdmVar;
                    str = "blaze_data_store_sdk_base_domain";
                    vnmVar = vnmVar2;
                    e5f J = f6a.J(str);
                    vnm vnmVar3 = vnm.a;
                    vnmVar.getClass();
                    a = vnm.a();
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
                            i2 = r12;
                            if (obj == lu3Var) {
                            }
                            str2 = (String) obj;
                            if (str2 == null) {
                                obj2 = vnm.b(vnmVar).fromJson(str2, (Class<Object>) String.class);
                                r1 = i2;
                                r1.getClass();
                                jdm.e = (String) obj2;
                                if (tsl.d == null) {
                                    tsl.d = (vsl) tsl.a(vsl.class, (String) tsl.b.getValue(), (jod) tsl.g.getValue());
                                }
                                modifiedProposedExternalUserID = BlazeSDK.INSTANCE.getModifiedProposedExternalUserID(this.v);
                                pf5 pf5Var = pf5.a;
                                this.r = modifiedProposedExternalUserID;
                                this.s = null;
                                this.t = null;
                                this.u = 3;
                                break;
                            } else {
                                i = i2;
                            }
                        }
                    }
                    obj2 = null;
                    r1 = i;
                    r1.getClass();
                    jdm.e = (String) obj2;
                    if (tsl.d == null) {
                    }
                    modifiedProposedExternalUserID = BlazeSDK.INSTANCE.getModifiedProposedExternalUserID(this.v);
                    pf5 pf5Var2 = pf5.a;
                    this.r = modifiedProposedExternalUserID;
                    this.s = null;
                    this.t = null;
                    this.u = 3;
                }
                return lu3Var;
            case 1:
                jdm jdmVar2 = this.t;
                String str3 = (String) this.s;
                vnm vnmVar4 = (vnm) this.r;
                y6a.M(obj);
                str = str3;
                vnmVar = vnmVar4;
                r12 = jdmVar2;
                e5f J2 = f6a.J(str);
                vnm vnmVar32 = vnm.a;
                vnmVar.getClass();
                a = vnm.a();
                i = r12;
                if (a != null) {
                }
                obj2 = null;
                r1 = i;
                r1.getClass();
                jdm.e = (String) obj2;
                if (tsl.d == null) {
                }
                modifiedProposedExternalUserID = BlazeSDK.INSTANCE.getModifiedProposedExternalUserID(this.v);
                pf5 pf5Var22 = pf5.a;
                this.r = modifiedProposedExternalUserID;
                this.s = null;
                this.t = null;
                this.u = 3;
                break;
            case 2:
                ?? r13 = (jdm) this.s;
                vnmVar = (vnm) this.r;
                y6a.M(obj);
                i2 = r13;
                str2 = (String) obj;
                if (str2 == null) {
                }
                break;
            case 3:
                modifiedProposedExternalUserID = (String) this.r;
                y6a.M(obj);
                bwm bwmVar = bwm.a;
                this.r = null;
                this.u = 4;
                obj = bwmVar.b(modifiedProposedExternalUserID, this);
                break;
            case 4:
                y6a.M(obj);
                List list = (List) obj;
                Function1 function1 = this.z;
                if (list == null || !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (!(((a9m) it.next()) instanceof qbm)) {
                                String a2 = p1m.a();
                                g0 hVar = (a2 == null || a2.length() == 0) ? new h() : CollectionsKt.Y(list) instanceof qbm ? new e() : new d();
                                BlazeResult.Error d = hVar.d();
                                this.r = hVar;
                                this.u = 7;
                                if (evl.b(function1, d, this) != lu3Var) {
                                    obj3 = hVar;
                                    break;
                                }
                            }
                        }
                    }
                    return lu3Var;
                }
                if (tsl.e == null) {
                    tsl.e = (AnalyticsApi) tsl.a(AnalyticsApi.class, tsl.b(), (jod) tsl.g.getValue());
                }
                if (tsl.f == null) {
                    tsl.f = (BlazeLoggerApi) tsl.a(BlazeLoggerApi.class, (String) tsl.c.getValue(), (jod) tsl.g.getValue());
                }
                ljd ljdVar = ljd.a;
                BlazeSDK blazeSDK = BlazeSDK.INSTANCE;
                if (!blazeSDK.getDisableAnalytics()) {
                    hs4 hs4Var = z45.a;
                    xw3.L(s9a.c(hq4.c.plus(new gu3("BlazeAnalyticsFlush")).plus(new xl9(bu3.a))), null, null, new lka(null), 3);
                }
                String str4 = this.y;
                if (str4 != null) {
                    gfm k = wba.k(str4);
                    if (k instanceof g0) {
                        g0 g0Var = (g0) k;
                        blazeSDK.setSdkInitializationState(new h1m.a(g0Var.d()));
                        function1.invoke(g0Var.d());
                        return Unit.a;
                    }
                }
                blazeSDK.setSdkInitializationState(u4m.a);
                blazeSDK.getUserActivity();
                qa3 qa3Var = bwm.b;
                Unit unit = Unit.a;
                qa3Var.V(unit);
                bwm.c.V(unit);
                this.u = 5;
                dispatchSDKInitializedEvent = blazeSDK.dispatchSDKInitializedEvent(this);
                break;
            case 5:
                y6a.M(obj);
                hs4 hs4Var2 = z45.a;
                r69 r69Var = rob.a;
                ekm ekmVar = new ekm(this.A, null);
                this.u = 6;
                break;
            case 6:
                y6a.M(obj);
                return Unit.a;
            case 7:
                obj3 = this.r;
                y6a.M(obj);
                j1m j1mVar = j1m.a;
                g0 g0Var2 = (g0) obj3;
                j1m.a(g0Var2);
                BlazeSDK.INSTANCE.setSdkInitializationState(new h1m.a(g0Var2.d()));
                return Unit.a;
            default:
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}

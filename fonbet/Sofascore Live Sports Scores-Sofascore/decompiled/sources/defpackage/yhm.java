package defpackage;

import com.blaze.blazesdk.data_source.BlazeDataSourceType;
import com.blaze.blazesdk.shared.BlazeSDK;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class yhm extends hoi implements Function1 {
    public int r;
    public final /* synthetic */ long s;
    public final /* synthetic */ String t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yhm(long j, String str, rq3 rq3Var) {
        super(1, rq3Var);
        this.s = j;
        this.t = str;
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        return new yhm(this.s, this.t, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new yhm(this.s, this.t, (rq3) obj).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(1:2)|(1:(1:(5:6|7|8|9|10)(2:13|14))(1:15))(3:26|27|(2:29|22))|16|17|18|(1:20)|9|10) */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0067, code lost:
    
        if (r0 == r13) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0040, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0041, code lost:
    
        com.blaze.blazesdk.shared.BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(r0, null);
        r0 = null;
     */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object videos$default;
        lu3 lu3Var = lu3.a;
        int i = this.r;
        try {
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
        }
        if (i == 0) {
            y6a.M(obj);
            long j = this.s;
            this.r = 1;
            if (n4o.y(j, this) == lu3Var) {
                return lu3Var;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                videos$default = obj;
                return Unit.a;
            }
            y6a.M(obj);
        }
        qom qomVar = qom.b;
        String str = this.t;
        qomVar.getClass();
        str.getClass();
        mom momVar = (mom) qom.j.get(str);
        if (momVar != null) {
            String str2 = this.t;
            BlazeDataSourceType blazeDataSourceType = momVar.a;
            String str3 = momVar.c;
            boolean z = momVar.b;
            String str4 = momVar.d;
            this.r = 2;
            videos$default = fsl.getVideos$default(qomVar, blazeDataSourceType, str2, str3, false, z, str4, null, null, this, 200, null);
        }
        return Unit.a;
    }
}

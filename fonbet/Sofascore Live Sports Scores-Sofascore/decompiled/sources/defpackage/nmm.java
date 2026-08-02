package defpackage;

import com.blaze.blazesdk.data_source.BlazeDataSourceType;
import com.blaze.blazesdk.shared.BlazeSDK;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class nmm extends hoi implements Function1 {
    public int r;
    public final /* synthetic */ long s;
    public final /* synthetic */ String t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nmm(long j, String str, rq3 rq3Var) {
        super(1, rq3Var);
        this.s = j;
        this.t = str;
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        return new nmm(this.s, this.t, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new nmm(this.s, this.t, (rq3) obj).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0059, code lost:
    
        if (r0 == r13) goto L22;
     */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object momentsAndSaveToCache$default;
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
                momentsAndSaveToCache$default = obj;
                return Unit.a;
            }
            y6a.M(obj);
        }
        gum gumVar = gum.b;
        String str = this.t;
        gumVar.getClass();
        h9m o = gum.o(str);
        if (o != null) {
            String str2 = this.t;
            BlazeDataSourceType blazeDataSourceType = o.a;
            String str3 = o.c;
            boolean z = o.b;
            String str4 = o.d;
            this.r = 2;
            momentsAndSaveToCache$default = jrl.getMomentsAndSaveToCache$default(gumVar, blazeDataSourceType, str2, str3, false, z, str4, null, null, false, this, 456, null);
        }
        return Unit.a;
    }
}

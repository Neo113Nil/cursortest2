package defpackage;

import com.blaze.blazesdk.features.stories.repos.StoriesRepositoryImpl;
import com.blaze.blazesdk.shared.BlazeSDK;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class onm extends hoi implements Function1 {
    public int r;

    public onm(rq3 rq3Var) {
        super(1, rq3Var);
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        return new onm(rq3Var);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new onm((rq3) obj).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0055, code lost:
    
        if (r7.c(r6) == r0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0057, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004a, code lost:
    
        if (r7.b(r6) == r0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003f, code lost:
    
        if (r7.a(r6) == r0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0034, code lost:
    
        if (r7.b(r6) == r0) goto L25;
     */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        int i = this.r;
        if (i == 0) {
            y6a.M(obj);
            StoriesRepositoryImpl storiesRepositoryImpl = StoriesRepositoryImpl.a;
            this.r = 1;
        } else if (i == 1) {
            y6a.M(obj);
        } else if (i == 2) {
            y6a.M(obj);
            qom qomVar = qom.b;
            this.r = 3;
        } else {
            if (i != 3) {
                if (i != 4) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                BlazeSDK.INSTANCE.getUserActivity();
                return Unit.a;
            }
            y6a.M(obj);
            k5m k5mVar = k5m.a;
            this.r = 4;
        }
        gum gumVar = gum.b;
        this.r = 2;
    }
}

package defpackage;

import com.blaze.blazesdk.delegates.models.BlazePlayerType;
import com.blaze.blazesdk.features.stories.repos.StoriesRepositoryImpl;
import com.blaze.blazesdk.shared.BlazeSDK;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.a;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class bim extends hoi implements Function1 {
    public int r;

    public bim(rq3 rq3Var) {
        super(1, rq3Var);
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        return new bim(rq3Var);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new bim((rq3) obj).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x006b, code lost:
    
        if (defpackage.xw3.R(r8, r1, r7) == r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006d, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0059, code lost:
    
        if (r8.b(r1, r7) == r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0048, code lost:
    
        if (r8 == r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0036, code lost:
    
        if (r8.emit(r1, r7) == r0) goto L28;
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
            aeh aehVar = tjm.d;
            ksl kslVar = ksl.APP_RESUME;
            this.r = 1;
        } else if (i == 1) {
            y6a.M(obj);
        } else if (i == 2) {
            y6a.M(obj);
            jdm jdmVar = jdm.a;
            List c = a.c(spl.a);
            this.r = 3;
        } else {
            if (i != 3) {
                if (i != 4) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                if (bmm.a == null) {
                    gum.b.getClass();
                    bmm.a = evl.dispatchOnIO$default(BlazeSDK.INSTANCE, null, new fkm(gum.g, BlazePlayerType.MOMENTS, new w5m(7), null), 1, null);
                }
                if (bmm.b == null) {
                    bmm.b = evl.dispatchOnIO$default(BlazeSDK.INSTANCE, null, new fkm(StoriesRepositoryImpl.e, BlazePlayerType.STORIES, new w5m(6), null), 1, null);
                }
                if (bmm.c == null) {
                    qom.b.getClass();
                    bmm.c = evl.dispatchOnIO$default(BlazeSDK.INSTANCE, null, new fkm(qom.g, BlazePlayerType.VIDEOS, new w5m(5), null), 1, null);
                }
                return Unit.a;
            }
            y6a.M(obj);
            hs4 hs4Var = z45.a;
            r69 r69Var = rob.a;
            zfm zfmVar = new zfm(null);
            this.r = 4;
        }
        bwm bwmVar = bwm.a;
        this.r = 2;
        Object w = bwm.b.w(this);
        if (w != lu3Var) {
            w = Unit.a;
        }
    }
}

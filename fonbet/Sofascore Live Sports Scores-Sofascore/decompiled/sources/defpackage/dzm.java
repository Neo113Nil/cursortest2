package defpackage;

import com.blaze.blazesdk.delegates.BlazeSDKDelegate;
import com.blaze.blazesdk.delegates.models.BlazePlaybackModificationRequest;
import com.blaze.blazesdk.delegates.models.BlazePlaybackModificationResponse;
import com.blaze.blazesdk.shared.BlazeSDK;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class dzm extends hoi implements Function2 {
    public int r;
    public final /* synthetic */ BlazePlaybackModificationRequest s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dzm(BlazePlaybackModificationRequest blazePlaybackModificationRequest, rq3 rq3Var) {
        super(2, rq3Var);
        this.s = blazePlaybackModificationRequest;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new dzm(this.s, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new dzm(this.s, (rq3) obj2).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        int i = this.r;
        if (i == 0) {
            y6a.M(obj);
            BlazeSDKDelegate sdkDelegate$blazesdk_release = BlazeSDK.INSTANCE.getSdkDelegate$blazesdk_release();
            if (sdkDelegate$blazesdk_release == null) {
                return null;
            }
            this.r = 1;
            obj = sdkDelegate$blazesdk_release.playbackModificationHandler(this.s, this);
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
        return (BlazePlaybackModificationResponse) obj;
    }
}

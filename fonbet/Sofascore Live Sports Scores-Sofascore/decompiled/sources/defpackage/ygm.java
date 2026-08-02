package defpackage;

import com.blaze.blazesdk.shared.BlazeSDK;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.a;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ygm extends a implements cu3 {
    public ygm(bu3 bu3Var) {
        super(bu3Var);
    }

    @Override // defpackage.cu3
    public final void handleException(CoroutineContext coroutineContext, Throwable th) {
        BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
    }
}

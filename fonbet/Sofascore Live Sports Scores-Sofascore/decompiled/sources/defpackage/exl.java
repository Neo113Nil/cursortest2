package defpackage;

import com.blaze.blazesdk.shared.BlazeSDK;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class exl extends sq3 {
    public /* synthetic */ Object r;
    public final /* synthetic */ BlazeSDK s;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public exl(BlazeSDK blazeSDK, rq3 rq3Var) {
        super(rq3Var);
        this.s = blazeSDK;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        Object dispatchSDKInitializedEvent;
        this.r = obj;
        this.t |= Integer.MIN_VALUE;
        dispatchSDKInitializedEvent = this.s.dispatchSDKInitializedEvent(this);
        return dispatchSDKInitializedEvent;
    }
}

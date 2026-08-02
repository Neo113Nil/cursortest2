package defpackage;

import com.blaze.blazesdk.players.inline.BlazeBaseInlinePlayerContainer;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class dqm extends sq3 {
    public /* synthetic */ Object r;
    public final /* synthetic */ BlazeBaseInlinePlayerContainer s;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dqm(BlazeBaseInlinePlayerContainer blazeBaseInlinePlayerContainer, rq3 rq3Var) {
        super(rq3Var);
        this.s = blazeBaseInlinePlayerContainer;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.t |= Integer.MIN_VALUE;
        return BlazeBaseInlinePlayerContainer.access$prepareViewingRecordWithFailureHandling(this.s, null, false, false, null, null, null, this);
    }
}

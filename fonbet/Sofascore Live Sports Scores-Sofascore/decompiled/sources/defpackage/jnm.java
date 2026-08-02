package defpackage;

import com.blaze.blazesdk.players.inline.BlazeBaseInlinePlayerContainer;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class jnm extends sq3 {
    public Object r;
    public Object s;
    public /* synthetic */ Object t;
    public final /* synthetic */ BlazeBaseInlinePlayerContainer u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jnm(BlazeBaseInlinePlayerContainer blazeBaseInlinePlayerContainer, rq3 rq3Var) {
        super(rq3Var);
        this.u = blazeBaseInlinePlayerContainer;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= Integer.MIN_VALUE;
        return BlazeBaseInlinePlayerContainer.access$preloadContentWithEmptyOrFailureHandling(this.u, false, null, null, this);
    }
}

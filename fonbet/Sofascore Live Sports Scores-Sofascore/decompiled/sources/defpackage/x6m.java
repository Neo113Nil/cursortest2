package defpackage;

import com.blaze.blazesdk.ads.ima.exo_player.ImaPresenterActivity;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class x6m extends sq3 {
    public ImaPresenterActivity r;
    public /* synthetic */ Object s;
    public final /* synthetic */ ImaPresenterActivity t;
    public int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x6m(ImaPresenterActivity imaPresenterActivity, sq3 sq3Var) {
        super(sq3Var);
        this.t = imaPresenterActivity;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.s = obj;
        this.u |= Integer.MIN_VALUE;
        int i = ImaPresenterActivity.o;
        return this.t.s(this);
    }
}

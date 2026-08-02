package defpackage;

import com.blaze.blazesdk.players.inline.BlazeBaseInlinePlayerContainer;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class x0m extends sq3 {
    public BlazeBaseInlinePlayerContainer r;
    public Function1 s;
    public boolean t;
    public /* synthetic */ Object u;
    public final /* synthetic */ BlazeBaseInlinePlayerContainer v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0m(BlazeBaseInlinePlayerContainer blazeBaseInlinePlayerContainer, rq3 rq3Var) {
        super(rq3Var);
        this.v = blazeBaseInlinePlayerContainer;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        Object a;
        this.u = obj;
        this.w |= Integer.MIN_VALUE;
        a = this.v.a((Function1) null, (Function0) null, false, (rq3) this);
        return a;
    }
}

package defpackage;

import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ck3 extends sq3 {
    public int A;
    public boolean r;
    public Object s;
    public Object t;
    public fsf u;
    public CoroutineContext v;
    public fsf w;
    public k03 x;
    public /* synthetic */ Object y;
    public final /* synthetic */ dk3 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ck3(dk3 dk3Var, rq3 rq3Var) {
        super(rq3Var);
        this.z = dk3Var;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.y = obj;
        this.A |= Integer.MIN_VALUE;
        return this.z.T0(false, null, this);
    }
}

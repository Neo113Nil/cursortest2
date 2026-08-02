package defpackage;

import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class hdk extends sq3 {
    public dt8 r;
    public Function0 s;
    public float t;
    public /* synthetic */ Object u;
    public final /* synthetic */ idk v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hdk(idk idkVar, sq3 sq3Var) {
        super(sq3Var);
        this.v = idkVar;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.u = obj;
        this.w |= Integer.MIN_VALUE;
        return this.v.a(null, null, this);
    }
}

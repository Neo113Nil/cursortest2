package defpackage;

import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class p3k extends sq3 {
    public r3k r;
    public List s;
    public int t;
    public /* synthetic */ Object u;
    public final /* synthetic */ r3k v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p3k(r3k r3kVar, sq3 sq3Var) {
        super(sq3Var);
        this.v = r3kVar;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.u = obj;
        this.w |= Integer.MIN_VALUE;
        return r3k.a(this.v, null, null, this);
    }
}

package defpackage;

import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class p56 extends sq3 {
    public int r;
    public int s;
    public int t;
    public List u;
    public /* synthetic */ Object v;
    public final /* synthetic */ fp4 w;
    public int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p56(fp4 fp4Var, sq3 sq3Var) {
        super(sq3Var);
        this.w = fp4Var;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.v = obj;
        this.x |= Integer.MIN_VALUE;
        return this.w.C(0, 0, 0, this);
    }
}

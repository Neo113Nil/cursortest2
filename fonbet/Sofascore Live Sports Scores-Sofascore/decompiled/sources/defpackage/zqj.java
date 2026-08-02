package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class zqj extends sq3 {
    public irj r;
    public Iterator s;
    public int t;
    public /* synthetic */ Object u;
    public final /* synthetic */ irj v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zqj(irj irjVar, sq3 sq3Var) {
        super(sq3Var);
        this.v = irjVar;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.u = obj;
        this.w |= Integer.MIN_VALUE;
        return irj.g(this.v, null, this);
    }
}

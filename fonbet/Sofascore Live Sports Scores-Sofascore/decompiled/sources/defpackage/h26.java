package defpackage;

import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class h26 extends j26 {
    public final lj2 c;
    public final /* synthetic */ l26 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h26(l26 l26Var, long j, lj2 lj2Var) {
        super(j);
        this.d = l26Var;
        this.c = lj2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.D(this.d, Unit.a);
    }

    @Override // defpackage.j26
    public final String toString() {
        return super.toString() + this.c;
    }
}

package defpackage;

import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class tm2 extends jm4 implements lli {
    public lli i;
    public long j;
    public final /* synthetic */ int k = 0;
    public Object l;

    public tm2(mw4 mw4Var) {
        super(3);
        this.l = mw4Var;
    }

    @Override // defpackage.jm4
    public final void A() {
        this.b = 0;
        this.g = 0L;
        this.h = false;
        this.i = null;
    }

    @Override // defpackage.jm4
    public final void B() {
        switch (this.k) {
            case 0:
                vm2 vm2Var = (vm2) ((l1) this.l).b;
                A();
                vm2Var.b.add(this);
                break;
            default:
                ((mw4) this.l).j(this);
                break;
        }
    }

    @Override // defpackage.lli
    public final List getCues(long j) {
        lli lliVar = this.i;
        lliVar.getClass();
        return lliVar.getCues(j - this.j);
    }

    @Override // defpackage.lli
    public final long getEventTime(int i) {
        lli lliVar = this.i;
        lliVar.getClass();
        return lliVar.getEventTime(i) + this.j;
    }

    @Override // defpackage.lli
    public final int getEventTimeCount() {
        lli lliVar = this.i;
        lliVar.getClass();
        return lliVar.getEventTimeCount();
    }

    @Override // defpackage.lli
    public final int getNextEventTimeIndex(long j) {
        lli lliVar = this.i;
        lliVar.getClass();
        return lliVar.getNextEventTimeIndex(j - this.j);
    }

    public /* synthetic */ tm2() {
        super(3);
    }
}

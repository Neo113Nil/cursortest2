package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class g26 extends au3 {
    public static final /* synthetic */ int f = 0;
    public long c;
    public boolean d;
    public vg0 e;

    @Override // defpackage.au3
    public final au3 f0(int i) {
        oea.j(i);
        return this;
    }

    public final void g0(boolean z) {
        long j = this.c - (z ? 4294967296L : 1L);
        this.c = j;
        if (j <= 0 && this.d) {
            shutdown();
        }
    }

    public final void j0(v45 v45Var) {
        vg0 vg0Var = this.e;
        if (vg0Var == null) {
            vg0Var = new vg0();
            this.e = vg0Var;
        }
        vg0Var.addLast(v45Var);
    }

    public final void n0(boolean z) {
        this.c = (z ? 4294967296L : 1L) + this.c;
        if (z) {
            return;
        }
        this.d = true;
    }

    public abstract long r0();

    public abstract void shutdown();

    public final boolean u0() {
        vg0 vg0Var = this.e;
        if (vg0Var == null) {
            return false;
        }
        v45 v45Var = (v45) (vg0Var.isEmpty() ? null : vg0Var.removeFirst());
        if (v45Var == null) {
            return false;
        }
        v45Var.run();
        return true;
    }
}

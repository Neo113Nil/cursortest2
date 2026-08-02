package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class y41 implements k2c {
    public final long a;
    public final long b;
    public long c;

    public y41(long j, long j2) {
        this.a = j;
        this.b = j2;
        this.c = j - 1;
    }

    public final void c() {
        long j = this.c;
        if (j < this.a || j > this.b) {
            yhk.d();
        }
    }

    @Override // defpackage.k2c
    public final boolean next() {
        long j = this.c + 1;
        this.c = j;
        return !(j > this.b);
    }
}

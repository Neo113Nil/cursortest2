package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class fkb extends tjb {
    public final long a;
    public boolean b;
    public long c;

    public fkb(long j, long j2) {
        this.a = j2;
        boolean z = j <= j2;
        this.b = z;
        this.c = z ? j : j2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b;
    }

    @Override // defpackage.tjb
    public final long nextLong() {
        long j = this.c;
        if (j != this.a) {
            this.c = 1 + j;
            return j;
        }
        if (this.b) {
            this.b = false;
            return j;
        }
        yhk.d();
        return 0L;
    }
}

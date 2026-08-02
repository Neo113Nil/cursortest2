package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class lp2 extends xo2 {
    public final int a;
    public boolean b;
    public int c;

    public lp2(char c, char c2) {
        this.a = c2;
        boolean z = c <= c2;
        this.b = z;
        this.c = z ? c : c2;
    }

    @Override // defpackage.xo2
    public final char a() {
        int i = this.c;
        if (i != this.a) {
            this.c = i + 1;
        } else {
            if (!this.b) {
                yhk.d();
                return (char) 0;
            }
            this.b = false;
        }
        return (char) i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b;
    }
}

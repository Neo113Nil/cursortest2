package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class v6a extends l6a {
    public final int a;
    public final int b;
    public boolean c;
    public int d;

    public v6a(int i, int i2, int i3) {
        this.a = i3;
        this.b = i2;
        boolean z = false;
        if (i3 <= 0 ? i >= i2 : i <= i2) {
            z = true;
        }
        this.c = z;
        this.d = z ? i : i2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.c;
    }

    @Override // defpackage.l6a
    public final int nextInt() {
        int i = this.d;
        if (i != this.b) {
            this.d = this.a + i;
            return i;
        }
        if (this.c) {
            this.c = false;
            return i;
        }
        yhk.d();
        return 0;
    }
}

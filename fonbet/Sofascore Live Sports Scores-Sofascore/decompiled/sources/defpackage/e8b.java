package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class e8b extends l51 {
    public int q;
    public int r;
    public boolean s;
    public int t;
    public Integer u;
    public int v;
    public float w;
    public boolean x;
    public boolean y;

    @Override // defpackage.l51
    public final boolean c() {
        return super.c() && e() == a();
    }

    @Override // defpackage.l51
    public final void d() {
        super.d();
        if (this.t < 0) {
            a70.p("Stop indicator size must be >= 0.");
            return;
        }
        if (this.q == 0) {
            if ((a() > 0 || (this.y && e() > 0)) && this.i == 0) {
                a70.p("Rounded corners without gap are not supported in contiguous indeterminate animation.");
            } else {
                if (this.e.length >= 3) {
                    return;
                }
                a70.p("Contiguous indeterminate animation must be used with 3 or more indicator colors.");
            }
        }
    }

    public final int e() {
        return !this.y ? a() : this.x ? (int) (this.a * this.w) : this.v;
    }
}

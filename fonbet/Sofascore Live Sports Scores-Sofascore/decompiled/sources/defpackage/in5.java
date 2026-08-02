package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class in5 {
    public int a;
    public int b;
    public int c;
    public String d;
    public Object e;
    public Object f;
    public Object g;

    public char a() {
        return this.d.charAt(this.a);
    }

    public boolean b() {
        return this.a < this.d.length() - this.c;
    }

    public void c(int i, boolean z) {
        int i2 = this.c;
        if (z) {
            this.c = i | i2;
        } else {
            this.c = (~i) & i2;
        }
    }

    public void d(int i) {
        hpi hpiVar = (hpi) this.g;
        if (hpiVar == null || i > hpiVar.b) {
            this.g = hpi.e(i, (ipi) this.e);
        }
    }

    public void e(char c) {
        ((StringBuilder) this.f).append(c);
    }
}

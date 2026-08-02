package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class waj {
    public static final n2f g = new n2f(4);
    public final m1c a;
    public final ema b;
    public final sf8 c;
    public final long d;
    public final float e;
    public final float f;

    public waj(m1c m1cVar, ema emaVar, sf8 sf8Var, long j) {
        this.a = m1cVar;
        this.b = emaVar;
        this.c = sf8Var;
        this.d = j;
        this.e = m1cVar.j();
        this.f = m1cVar.getFontScale();
    }

    public final String toString() {
        return "MeasureInputs(density=" + this.a + ", densityValue=" + this.e + ", fontScale=" + this.f + ", layoutDirection=" + this.b + ", fontFamilyResolver=" + this.c + ", constraints=" + ((Object) an3.l(this.d)) + ')';
    }
}

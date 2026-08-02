package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class qm3 implements rm3 {
    public boolean a;
    public String b;
    public String c;
    public float d;
    public float e;

    @Override // defpackage.rm3
    public final float value() {
        float f = this.d;
        if (f >= this.e) {
            this.a = true;
        }
        if (this.a) {
            return f;
        }
        float f2 = f + 1.0f;
        this.d = f2;
        return f2;
    }
}

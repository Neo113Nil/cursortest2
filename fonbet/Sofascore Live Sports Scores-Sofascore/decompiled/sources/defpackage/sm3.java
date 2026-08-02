package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class sm3 implements rm3 {
    public float a;
    public float b;

    @Override // defpackage.rm3
    public final float value() {
        float f = this.b + this.a;
        this.b = f;
        return f;
    }
}

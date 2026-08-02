package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class vn0 {
    public boolean a;
    public boolean b;
    public boolean c;

    public /* synthetic */ vn0(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    public wn0 a() {
        if (this.a || !(this.b || this.c)) {
            return new wn0(this);
        }
        a70.r("Secondary offload attribute fields are true but primary isFormatSupported is false");
        return null;
    }

    public boolean b() {
        return (this.c || this.b) && this.a;
    }
}

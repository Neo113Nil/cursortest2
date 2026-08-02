package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class wko {
    public static final wko c;
    public static final wko d;
    public final boolean a;
    public final Throwable b;

    static {
        if (glo.f) {
            d = null;
            c = null;
        } else {
            d = new wko(null, false);
            c = new wko(null, true);
        }
    }

    public wko(Throwable th, boolean z) {
        this.a = z;
        this.b = th;
    }
}

package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class fwn {
    public static final fwn c;
    public static final fwn d;
    public final boolean a;
    public final Throwable b;

    static {
        if (twn.f) {
            d = null;
            c = null;
        } else {
            d = new fwn(null, false);
            c = new fwn(null, true);
        }
    }

    public fwn(Throwable th, boolean z) {
        this.a = z;
        this.b = th;
    }
}

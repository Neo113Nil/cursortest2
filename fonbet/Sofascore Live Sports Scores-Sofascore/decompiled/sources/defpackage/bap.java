package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class bap {
    public static final bap c;
    public static final bap d;
    public final boolean a;
    public final Throwable b;

    static {
        if (iap.f) {
            d = null;
            c = null;
        } else {
            d = new bap(null, false);
            c = new bap(null, true);
        }
    }

    public bap(Throwable th, boolean z) {
        this.a = z;
        this.b = th;
    }
}

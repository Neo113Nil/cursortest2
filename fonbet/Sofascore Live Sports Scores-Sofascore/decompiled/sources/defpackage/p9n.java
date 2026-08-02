package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class p9n implements obn {
    public static final p9n a = new p9n();

    private p9n() {
    }

    @Override // defpackage.obn
    public final boolean a(Class cls) {
        return y9n.class.isAssignableFrom(cls);
    }

    @Override // defpackage.obn
    public final lcn b(Class cls) {
        if (!y9n.class.isAssignableFrom(cls)) {
            a70.p("Unsupported message type: ".concat(cls.getName()));
            return null;
        }
        try {
            return (lcn) y9n.f(cls.asSubclass(y9n.class)).r(3);
        } catch (Exception e) {
            vp2.e("Unable to get message info for ".concat(cls.getName()), e);
            return null;
        }
    }
}

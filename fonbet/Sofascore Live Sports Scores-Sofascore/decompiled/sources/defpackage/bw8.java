package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class bw8 implements zgc {
    public static final bw8 b = new bw8(0);
    public final /* synthetic */ int a;

    public /* synthetic */ bw8(int i) {
        this.a = i;
    }

    @Override // defpackage.zgc
    public final lnf a(Class cls) {
        switch (this.a) {
            case 0:
                if (!hw8.class.isAssignableFrom(cls)) {
                    a70.p("Unsupported message type: ".concat(cls.getName()));
                    return null;
                }
                try {
                    return (lnf) hw8.d(cls.asSubclass(hw8.class)).c(3);
                } catch (Exception e) {
                    vp2.e("Unable to get message info for ".concat(cls.getName()), e);
                    return null;
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // defpackage.zgc
    public final boolean b(Class cls) {
        switch (this.a) {
            case 0:
                return hw8.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}

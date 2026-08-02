package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class zv8 implements xgc {
    public static final zv8 b = new zv8(0);
    public final /* synthetic */ int a;

    public /* synthetic */ zv8(int i) {
        this.a = i;
    }

    @Override // defpackage.xgc
    public final jnf a(Class cls) {
        switch (this.a) {
            case 0:
                if (!gw8.class.isAssignableFrom(cls)) {
                    a70.p("Unsupported message type: ".concat(cls.getName()));
                    return null;
                }
                try {
                    return (jnf) gw8.c(cls.asSubclass(gw8.class)).b(3);
                } catch (Exception e) {
                    vp2.e("Unable to get message info for ".concat(cls.getName()), e);
                    return null;
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // defpackage.xgc
    public final boolean b(Class cls) {
        switch (this.a) {
            case 0:
                return gw8.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}

package defpackage;

import com.google.android.gms.internal.pal.zzacz;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class h9n implements lbn {
    public static final h9n b = new h9n(0);
    public final /* synthetic */ int a;

    public /* synthetic */ h9n(int i) {
        this.a = i;
    }

    @Override // defpackage.lbn
    public final fcn a(Class cls) {
        switch (this.a) {
            case 0:
                if (!zzacz.class.isAssignableFrom(cls)) {
                    a70.p("Unsupported message type: ".concat(cls.getName()));
                    return null;
                }
                try {
                    return (fcn) zzacz.h(cls.asSubclass(zzacz.class)).i(3);
                } catch (Exception e) {
                    vp2.e("Unable to get message info for ".concat(cls.getName()), e);
                    return null;
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // defpackage.lbn
    public final boolean b(Class cls) {
        switch (this.a) {
            case 0:
                return zzacz.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}

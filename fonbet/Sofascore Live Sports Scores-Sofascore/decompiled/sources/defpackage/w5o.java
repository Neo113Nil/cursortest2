package defpackage;

import com.google.android.gms.internal.auth.zzev;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class w5o implements mao {
    public static final w5o b = new w5o(0);
    public final /* synthetic */ int a;

    public /* synthetic */ w5o(int i) {
        this.a = i;
    }

    @Override // defpackage.mao
    public final bdo a(Class cls) {
        switch (this.a) {
            case 0:
                if (!zzev.class.isAssignableFrom(cls)) {
                    a70.p("Unsupported message type: ".concat(cls.getName()));
                    return null;
                }
                try {
                    return (bdo) zzev.a(cls.asSubclass(zzev.class)).g(3);
                } catch (Exception e) {
                    vp2.e("Unable to get message info for ".concat(cls.getName()), e);
                    return null;
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // defpackage.mao
    public final boolean b(Class cls) {
        switch (this.a) {
            case 0:
                return zzev.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}

package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class egl {
    public static final egl a;
    public static final egl b;
    public static final egl c;
    public static final /* synthetic */ egl[] d;

    static {
        egl eglVar = new egl("WC_FEATURED", 0);
        a = eglVar;
        egl eglVar2 = new egl("WC_LEAGUE", 1);
        b = eglVar2;
        egl eglVar3 = new egl("NATIONAL_TEAM", 2);
        c = eglVar3;
        d = new egl[]{eglVar, eglVar2, eglVar3};
    }

    public static egl valueOf(String str) {
        return (egl) Enum.valueOf(egl.class, str);
    }

    public static egl[] values() {
        return (egl[]) d.clone();
    }
}

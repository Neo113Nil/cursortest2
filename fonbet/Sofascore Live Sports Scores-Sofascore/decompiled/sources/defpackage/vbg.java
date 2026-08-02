package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class vbg {
    public static final y9f a;
    public static final vbg b;
    public static final vbg c;
    public static final /* synthetic */ vbg[] d;

    static {
        vbg vbgVar = new vbg("DEFAULT", 0);
        b = vbgVar;
        vbg vbgVar2 = new vbg("VIDEO_HEADER_AD", 1);
        c = vbgVar2;
        d = new vbg[]{vbgVar, vbgVar2};
        a = new y9f(1);
    }

    public static vbg valueOf(String str) {
        return (vbg) Enum.valueOf(vbg.class, str);
    }

    public static vbg[] values() {
        return (vbg[]) d.clone();
    }
}

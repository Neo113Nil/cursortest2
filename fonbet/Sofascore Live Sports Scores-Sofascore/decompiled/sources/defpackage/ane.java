package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class ane {
    public static final ane a;
    public static final ane b;
    public static final ane c;
    public static final ane d;
    public static final ane e;
    public static final ane f;
    public static final /* synthetic */ ane[] g;

    static {
        ane aneVar = new ane("UNKNOWN", 0);
        a = aneVar;
        ane aneVar2 = new ane("INVALID_PARAMETER_IN_REQUEST", 1);
        b = aneVar2;
        ane aneVar3 = new ane("HTML_5_PLAYER", 2);
        c = aneVar3;
        ane aneVar4 = new ane("VIDEO_NOT_FOUND", 3);
        d = aneVar4;
        ane aneVar5 = new ane("VIDEO_NOT_PLAYABLE_IN_EMBEDDED_PLAYER", 4);
        e = aneVar5;
        ane aneVar6 = new ane("REQUEST_MISSING_HTTP_REFERER", 5);
        f = aneVar6;
        g = new ane[]{aneVar, aneVar2, aneVar3, aneVar4, aneVar5, aneVar6};
    }

    public static ane valueOf(String str) {
        return (ane) Enum.valueOf(ane.class, str);
    }

    public static ane[] values() {
        return (ane[]) g.clone();
    }
}

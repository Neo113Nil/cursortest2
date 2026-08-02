package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class gkg {
    public static final gkg a;
    public static final gkg b;
    public static final gkg c;
    public static final /* synthetic */ gkg[] d;

    /* JADX INFO: Fake field, exist only in values array */
    gkg EF0;

    static {
        gkg gkgVar = new gkg("TOP", 0);
        gkg gkgVar2 = new gkg("TOP_LEFT", 1);
        gkg gkgVar3 = new gkg("TOP_RIGHT", 2);
        a = gkgVar3;
        gkg gkgVar4 = new gkg("BOTTOM", 3);
        b = gkgVar4;
        gkg gkgVar5 = new gkg("BOTTOM_RIGHT", 4);
        c = gkgVar5;
        d = new gkg[]{gkgVar, gkgVar2, gkgVar3, gkgVar4, gkgVar5, new gkg("FULLSCREEN", 5)};
    }

    public static gkg valueOf(String str) {
        return (gkg) Enum.valueOf(gkg.class, str);
    }

    public static gkg[] values() {
        return (gkg[]) d.clone();
    }
}

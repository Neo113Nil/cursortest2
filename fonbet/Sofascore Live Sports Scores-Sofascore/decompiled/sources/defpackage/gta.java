package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class gta {
    public static final gta a;
    public static final gta b;
    public static final gta c;
    public static final /* synthetic */ gta[] d;

    static {
        gta gtaVar = new gta("TOP_PREDICTORS", 0);
        a = gtaVar;
        gta gtaVar2 = new gta("TOP_CONTRIBUTORS", 1);
        b = gtaVar2;
        gta gtaVar3 = new gta("TOP_EDITORS", 2);
        c = gtaVar3;
        d = new gta[]{gtaVar, gtaVar2, gtaVar3};
    }

    public static gta valueOf(String str) {
        return (gta) Enum.valueOf(gta.class, str);
    }

    public static gta[] values() {
        return (gta[]) d.clone();
    }
}

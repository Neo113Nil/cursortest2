package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class r8g {
    public static final r8g a;
    public static final r8g b;
    public static final r8g c;
    public static final r8g d;
    public static final /* synthetic */ r8g[] e;

    static {
        r8g r8gVar = new r8g("UPPER", 0);
        a = r8gVar;
        r8g r8gVar2 = new r8g("LOWER", 1);
        b = r8gVar2;
        r8g r8gVar3 = new r8g("MIDDLE", 2);
        c = r8gVar3;
        r8g r8gVar4 = new r8g("THIRD_PLACE", 3);
        d = r8gVar4;
        e = new r8g[]{r8gVar, r8gVar2, r8gVar3, r8gVar4};
    }

    public static r8g valueOf(String str) {
        return (r8g) Enum.valueOf(r8g.class, str);
    }

    public static r8g[] values() {
        return (r8g[]) e.clone();
    }
}

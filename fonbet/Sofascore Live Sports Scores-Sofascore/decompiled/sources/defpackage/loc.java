package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class loc {
    public static final loc a;
    public static final loc b;
    public static final /* synthetic */ loc[] c;

    static {
        loc locVar = new loc("HOME_FIGHTER", 0);
        a = locVar;
        loc locVar2 = new loc("AWAY_FIGHTER", 1);
        b = locVar2;
        c = new loc[]{locVar, locVar2};
    }

    public static loc valueOf(String str) {
        return (loc) Enum.valueOf(loc.class, str);
    }

    public static loc[] values() {
        return (loc[]) c.clone();
    }
}

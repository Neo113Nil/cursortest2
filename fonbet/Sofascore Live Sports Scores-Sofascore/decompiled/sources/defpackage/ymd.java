package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ymd {
    public static final ymd a;
    public static final ymd b;
    public static final /* synthetic */ ymd[] c;

    static {
        ymd ymdVar = new ymd("Team", 0);
        a = ymdVar;
        ymd ymdVar2 = new ymd("Player", 1);
        b = ymdVar2;
        c = new ymd[]{ymdVar, ymdVar2};
    }

    public static ymd valueOf(String str) {
        return (ymd) Enum.valueOf(ymd.class, str);
    }

    public static ymd[] values() {
        return (ymd[]) c.clone();
    }
}

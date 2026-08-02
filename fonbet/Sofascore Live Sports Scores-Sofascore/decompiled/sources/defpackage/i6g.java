package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class i6g {
    public static final i6g a;
    public static final i6g b;
    public static final /* synthetic */ i6g[] c;

    /* JADX INFO: Fake field, exist only in values array */
    i6g EF0;

    static {
        i6g i6gVar = new i6g("AUTOMATIC", 0);
        i6g i6gVar2 = new i6g("TRUNCATE", 1);
        a = i6gVar2;
        i6g i6gVar3 = new i6g("WRITE_AHEAD_LOGGING", 2);
        b = i6gVar3;
        c = new i6g[]{i6gVar, i6gVar2, i6gVar3};
    }

    public static i6g valueOf(String str) {
        return (i6g) Enum.valueOf(i6g.class, str);
    }

    public static i6g[] values() {
        return (i6g[]) c.clone();
    }
}

package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ini {
    public static final ini a;
    public static final ini b;
    public static final ini c;
    public static final ini d;
    public static final ini e;
    public static final /* synthetic */ ini[] f;

    static {
        ini iniVar = new ini("END", 0);
        a = iniVar;
        ini iniVar2 = new ini("ROLLBACK", 1);
        b = iniVar2;
        ini iniVar3 = new ini("BEGIN_EXCLUSIVE", 2);
        c = iniVar3;
        ini iniVar4 = new ini("BEGIN_IMMEDIATE", 3);
        d = iniVar4;
        ini iniVar5 = new ini("BEGIN_DEFERRED", 4);
        e = iniVar5;
        f = new ini[]{iniVar, iniVar2, iniVar3, iniVar4, iniVar5};
    }

    public static ini valueOf(String str) {
        return (ini) Enum.valueOf(ini.class, str);
    }

    public static ini[] values() {
        return (ini[]) f.clone();
    }
}

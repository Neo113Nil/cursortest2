package kg;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class i {
    private static final /* synthetic */ i[] $VALUES;
    public static final i ALWAYS;
    public static final i EXCEEDS_PAD;
    public static final i NEVER;
    public static final i NORMAL;
    public static final i NOT_NEGATIVE;

    static {
        i iVar = new i("NORMAL", 0);
        NORMAL = iVar;
        i iVar2 = new i("ALWAYS", 1);
        ALWAYS = iVar2;
        i iVar3 = new i("NEVER", 2);
        NEVER = iVar3;
        i iVar4 = new i("NOT_NEGATIVE", 3);
        NOT_NEGATIVE = iVar4;
        i iVar5 = new i("EXCEEDS_PAD", 4);
        EXCEEDS_PAD = iVar5;
        $VALUES = new i[]{iVar, iVar2, iVar3, iVar4, iVar5};
    }

    private i() {
        throw null;
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) $VALUES.clone();
    }
}

package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class i7f {
    public static final i7f a;
    public static final i7f b;
    public static final i7f c;
    public static final /* synthetic */ i7f[] d;

    static {
        i7f i7fVar = new i7f("DEFAULT", 0);
        a = i7fVar;
        i7f i7fVar2 = new i7f("VERY_LOW", 1);
        b = i7fVar2;
        i7f i7fVar3 = new i7f("HIGHEST", 2);
        c = i7fVar3;
        d = new i7f[]{i7fVar, i7fVar2, i7fVar3};
    }

    public static i7f valueOf(String str) {
        return (i7f) Enum.valueOf(i7f.class, str);
    }

    public static i7f[] values() {
        return (i7f[]) d.clone();
    }
}

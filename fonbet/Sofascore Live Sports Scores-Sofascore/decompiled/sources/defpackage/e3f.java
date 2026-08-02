package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class e3f {
    public static final e3f a;
    public static final e3f b;
    public static final /* synthetic */ e3f[] c;

    static {
        e3f e3fVar = new e3f("EXACT", 0);
        a = e3fVar;
        e3f e3fVar2 = new e3f("INEXACT", 1);
        b = e3fVar2;
        c = new e3f[]{e3fVar, e3fVar2};
    }

    public static e3f valueOf(String str) {
        return (e3f) Enum.valueOf(e3f.class, str);
    }

    public static e3f[] values() {
        return (e3f[]) c.clone();
    }
}

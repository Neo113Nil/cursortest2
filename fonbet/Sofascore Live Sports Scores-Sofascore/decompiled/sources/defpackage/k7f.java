package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class k7f {
    public static final k7f a;
    public static final k7f b;
    public static final k7f c;
    public static final k7f d;
    public static final /* synthetic */ k7f[] e;

    static {
        k7f k7fVar = new k7f("IMMEDIATE", 0);
        a = k7fVar;
        k7f k7fVar2 = new k7f("HIGH", 1);
        b = k7fVar2;
        k7f k7fVar3 = new k7f("NORMAL", 2);
        c = k7fVar3;
        k7f k7fVar4 = new k7f("LOW", 3);
        d = k7fVar4;
        e = new k7f[]{k7fVar, k7fVar2, k7fVar3, k7fVar4};
    }

    public static k7f valueOf(String str) {
        return (k7f) Enum.valueOf(k7f.class, str);
    }

    public static k7f[] values() {
        return (k7f[]) e.clone();
    }
}

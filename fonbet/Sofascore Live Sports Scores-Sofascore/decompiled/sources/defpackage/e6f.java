package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class e6f {
    public static final e6f a;
    public static final e6f b;
    public static final e6f c;
    public static final e6f d;
    public static final e6f e;
    public static final e6f f;
    public static final e6f g;
    public static final e6f h;
    public static final e6f i;
    public static final e6f j;
    public static final /* synthetic */ e6f[] k;

    static {
        e6f e6fVar = new e6f("none", 0);
        a = e6fVar;
        e6f e6fVar2 = new e6f("xMinYMin", 1);
        b = e6fVar2;
        e6f e6fVar3 = new e6f("xMidYMin", 2);
        c = e6fVar3;
        e6f e6fVar4 = new e6f("xMaxYMin", 3);
        d = e6fVar4;
        e6f e6fVar5 = new e6f("xMinYMid", 4);
        e = e6fVar5;
        e6f e6fVar6 = new e6f("xMidYMid", 5);
        f = e6fVar6;
        e6f e6fVar7 = new e6f("xMaxYMid", 6);
        g = e6fVar7;
        e6f e6fVar8 = new e6f("xMinYMax", 7);
        h = e6fVar8;
        e6f e6fVar9 = new e6f("xMidYMax", 8);
        i = e6fVar9;
        e6f e6fVar10 = new e6f("xMaxYMax", 9);
        j = e6fVar10;
        k = new e6f[]{e6fVar, e6fVar2, e6fVar3, e6fVar4, e6fVar5, e6fVar6, e6fVar7, e6fVar8, e6fVar9, e6fVar10};
    }

    public static e6f valueOf(String str) {
        return (e6f) Enum.valueOf(e6f.class, str);
    }

    public static e6f[] values() {
        return (e6f[]) k.clone();
    }
}

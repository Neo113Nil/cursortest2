package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class j7f {
    public static final j7f a;
    public static final j7f b;
    public static final j7f c;
    public static final /* synthetic */ j7f[] d;

    static {
        j7f j7fVar = new j7f("MANDATORY", 0);
        a = j7fVar;
        j7f j7fVar2 = new j7f("HIGH", 1);
        b = j7fVar2;
        j7f j7fVar3 = new j7f("LOW", 2);
        j7f j7fVar4 = new j7f("MANUAL", 3);
        c = j7fVar4;
        d = new j7f[]{j7fVar, j7fVar2, j7fVar3, j7fVar4};
    }

    public static j7f valueOf(String str) {
        return (j7f) Enum.valueOf(j7f.class, str);
    }

    public static j7f[] values() {
        return (j7f[]) d.clone();
    }
}

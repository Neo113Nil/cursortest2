package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class p5f {
    public static final p5f a;
    public static final /* synthetic */ p5f[] b;

    /* JADX INFO: Fake field, exist only in values array */
    p5f EF0;

    static {
        p5f p5fVar = new p5f("SRGB", 0);
        p5f p5fVar2 = new p5f("DISPLAY_P3", 1);
        a = p5fVar2;
        b = new p5f[]{p5fVar, p5fVar2};
    }

    public static p5f valueOf(String str) {
        return (p5f) Enum.valueOf(p5f.class, str);
    }

    public static p5f[] values() {
        return (p5f[]) b.clone();
    }
}

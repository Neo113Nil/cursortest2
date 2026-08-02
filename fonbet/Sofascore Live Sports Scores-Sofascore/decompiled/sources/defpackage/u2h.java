package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class u2h {
    public static final u2h a;
    public static final /* synthetic */ u2h[] b;

    static {
        u2h u2hVar = new u2h("EditableText", 0);
        a = u2hVar;
        b = new u2h[]{u2hVar, new u2h("StaticText", 1)};
    }

    public static u2h valueOf(String str) {
        return (u2h) Enum.valueOf(u2h.class, str);
    }

    public static u2h[] values() {
        return (u2h[]) b.clone();
    }
}

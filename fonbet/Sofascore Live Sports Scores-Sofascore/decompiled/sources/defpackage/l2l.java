package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class l2l {
    public static final l2l a;
    public static final l2l b;
    public static final /* synthetic */ l2l[] c;

    static {
        l2l l2lVar = new l2l("Start", 0);
        a = l2lVar;
        l2l l2lVar2 = new l2l("End", 1);
        b = l2lVar2;
        c = new l2l[]{l2lVar, l2lVar2};
    }

    public static l2l valueOf(String str) {
        return (l2l) Enum.valueOf(l2l.class, str);
    }

    public static l2l[] values() {
        return (l2l[]) c.clone();
    }
}

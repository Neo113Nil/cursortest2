package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class p7l {
    public static final p7l a;
    public static final p7l b;
    public static final p7l c;
    public static final /* synthetic */ p7l[] d;

    static {
        p7l p7lVar = new p7l("FINISHED", 0);
        a = p7lVar;
        p7l p7lVar2 = new p7l("LIVE", 1);
        b = p7lVar2;
        p7l p7lVar3 = new p7l("UPCOMING", 2);
        c = p7lVar3;
        d = new p7l[]{p7lVar, p7lVar2, p7lVar3};
    }

    public static p7l valueOf(String str) {
        return (p7l) Enum.valueOf(p7l.class, str);
    }

    public static p7l[] values() {
        return (p7l[]) d.clone();
    }
}

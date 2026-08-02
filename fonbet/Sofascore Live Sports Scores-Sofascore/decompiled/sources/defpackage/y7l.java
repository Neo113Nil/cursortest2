package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class y7l {
    public static final anf a;
    public static final y7l b;
    public static final y7l c;
    public static final y7l d;
    public static final /* synthetic */ y7l[] e;

    static {
        y7l y7lVar = new y7l("Small", 0);
        b = y7lVar;
        y7l y7lVar2 = new y7l("Medium", 1);
        c = y7lVar2;
        y7l y7lVar3 = new y7l("Large", 2);
        d = y7lVar3;
        e = new y7l[]{y7lVar, y7lVar2, y7lVar3};
        a = new anf(5);
    }

    public static y7l valueOf(String str) {
        return (y7l) Enum.valueOf(y7l.class, str);
    }

    public static y7l[] values() {
        return (y7l[]) e.clone();
    }
}

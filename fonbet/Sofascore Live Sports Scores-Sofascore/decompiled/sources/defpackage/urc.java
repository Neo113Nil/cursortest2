package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class urc {
    public static final urc a;
    public static final urc b;
    public static final urc c;
    public static final urc d;
    public static final /* synthetic */ urc[] e;

    static {
        urc urcVar = new urc("STANDARD", 0);
        a = urcVar;
        urc urcVar2 = new urc("EXPANDABLE", 1);
        b = urcVar2;
        urc urcVar3 = new urc("SINGLE_ITEM", 2);
        c = urcVar3;
        urc urcVar4 = new urc("MULTI_ITEM", 3);
        d = urcVar4;
        e = new urc[]{urcVar, urcVar2, urcVar3, urcVar4};
    }

    public static urc valueOf(String str) {
        return (urc) Enum.valueOf(urc.class, str);
    }

    public static urc[] values() {
        return (urc[]) e.clone();
    }
}

package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class d6i {
    public static final d6i a;
    public static final d6i b;
    public static final d6i c;
    public static final d6i d;
    public static final /* synthetic */ d6i[] e;

    static {
        d6i d6iVar = new d6i("Default", 0);
        a = d6iVar;
        d6i d6iVar2 = new d6i("DriverStandard", 1);
        b = d6iVar2;
        d6i d6iVar3 = new d6i("DriverPlacement", 2);
        c = d6iVar3;
        d6i d6iVar4 = new d6i("TeamStandard", 3);
        d = d6iVar4;
        e = new d6i[]{d6iVar, d6iVar2, d6iVar3, d6iVar4};
    }

    public static d6i valueOf(String str) {
        return (d6i) Enum.valueOf(d6i.class, str);
    }

    public static d6i[] values() {
        return (d6i[]) e.clone();
    }
}

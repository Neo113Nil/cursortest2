package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class x1k {
    public static final x1k a;
    public static final x1k b;
    public static final x1k c;
    public static final x1k d;
    public static final /* synthetic */ x1k[] e;

    static {
        x1k x1kVar = new x1k("SUCCESSFUL", 0);
        a = x1kVar;
        x1k x1kVar2 = new x1k("REREGISTER", 1);
        b = x1kVar2;
        x1k x1kVar3 = new x1k("CANCELLED", 2);
        c = x1kVar3;
        x1k x1kVar4 = new x1k("ALREADY_SELECTED", 3);
        d = x1kVar4;
        e = new x1k[]{x1kVar, x1kVar2, x1kVar3, x1kVar4};
    }

    public static x1k valueOf(String str) {
        return (x1k) Enum.valueOf(x1k.class, str);
    }

    public static x1k[] values() {
        return (x1k[]) e.clone();
    }
}

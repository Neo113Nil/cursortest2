package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class x5i {
    public static final x5i a;
    public static final x5i b;
    public static final /* synthetic */ x5i[] c;

    static {
        x5i x5iVar = new x5i("Driver", 0);
        a = x5iVar;
        x5i x5iVar2 = new x5i("Winner", 1);
        b = x5iVar2;
        c = new x5i[]{x5iVar, x5iVar2};
    }

    public static x5i valueOf(String str) {
        return (x5i) Enum.valueOf(x5i.class, str);
    }

    public static x5i[] values() {
        return (x5i[]) c.clone();
    }
}

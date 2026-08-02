package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class q9a {
    public static final q9a a;
    public static final q9a b;
    public static final /* synthetic */ q9a[] c;

    static {
        q9a q9aVar = new q9a("Width", 0);
        a = q9aVar;
        q9a q9aVar2 = new q9a("Height", 1);
        b = q9aVar2;
        c = new q9a[]{q9aVar, q9aVar2};
    }

    public static q9a valueOf(String str) {
        return (q9a) Enum.valueOf(q9a.class, str);
    }

    public static q9a[] values() {
        return (q9a[]) c.clone();
    }
}

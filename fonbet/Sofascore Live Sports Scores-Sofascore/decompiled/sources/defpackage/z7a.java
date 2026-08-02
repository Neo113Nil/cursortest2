package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class z7a {
    public static final z7a a;
    public static final z7a b;
    public static final z7a c;
    public static final /* synthetic */ z7a[] d;

    /* JADX INFO: Fake field, exist only in values array */
    z7a EF0;

    static {
        z7a z7aVar = new z7a("CT_UNKNOWN", 0);
        z7a z7aVar2 = new z7a("CT_INFO", 1);
        a = z7aVar2;
        z7a z7aVar3 = new z7a("CT_WARNING", 2);
        b = z7aVar3;
        z7a z7aVar4 = new z7a("CT_ERROR", 3);
        c = z7aVar4;
        d = new z7a[]{z7aVar, z7aVar2, z7aVar3, z7aVar4};
    }

    public static z7a valueOf(String str) {
        return (z7a) Enum.valueOf(z7a.class, str);
    }

    public static z7a[] values() {
        return (z7a[]) d.clone();
    }
}

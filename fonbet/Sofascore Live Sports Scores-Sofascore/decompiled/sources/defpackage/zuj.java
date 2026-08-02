package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class zuj {
    public static final zuj a;
    public static final zuj b;
    public static final /* synthetic */ zuj[] c;

    static {
        zuj zujVar = new zuj("DEFERRED", 0);
        a = zujVar;
        zuj zujVar2 = new zuj("IMMEDIATE", 1);
        b = zujVar2;
        c = new zuj[]{zujVar, zujVar2, new zuj("EXCLUSIVE", 2)};
    }

    public static zuj valueOf(String str) {
        return (zuj) Enum.valueOf(zuj.class, str);
    }

    public static zuj[] values() {
        return (zuj[]) c.clone();
    }
}

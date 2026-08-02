package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class zdd {
    public static final zdd a;
    public static final zdd b;
    public static final /* synthetic */ zdd[] c;

    static {
        zdd zddVar = new zdd("Min", 0);
        a = zddVar;
        zdd zddVar2 = new zdd("Max", 1);
        b = zddVar2;
        c = new zdd[]{zddVar, zddVar2};
    }

    public static zdd valueOf(String str) {
        return (zdd) Enum.valueOf(zdd.class, str);
    }

    public static zdd[] values() {
        return (zdd[]) c.clone();
    }
}

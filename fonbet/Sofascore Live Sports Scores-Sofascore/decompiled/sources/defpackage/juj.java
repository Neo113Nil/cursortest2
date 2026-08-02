package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class juj {
    public static final juj a;
    public static final juj b;
    public static final /* synthetic */ juj[] c;

    static {
        juj jujVar = new juj("POWER_RANKINGS", 0);
        a = jujVar;
        juj jujVar2 = new juj("STANDINGS", 1);
        b = jujVar2;
        c = new juj[]{jujVar, jujVar2};
    }

    public static juj valueOf(String str) {
        return (juj) Enum.valueOf(juj.class, str);
    }

    public static juj[] values() {
        return (juj[]) c.clone();
    }
}

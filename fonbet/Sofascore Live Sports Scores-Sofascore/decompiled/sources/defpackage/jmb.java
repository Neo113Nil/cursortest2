package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class jmb {
    public static final jmb a;
    public static final /* synthetic */ jmb[] b;

    static {
        jmb jmbVar = new jmb("MergePathsApi19", 0);
        a = jmbVar;
        b = new jmb[]{jmbVar};
    }

    public static jmb valueOf(String str) {
        return (jmb) Enum.valueOf(jmb.class, str);
    }

    public static jmb[] values() {
        return (jmb[]) b.clone();
    }
}

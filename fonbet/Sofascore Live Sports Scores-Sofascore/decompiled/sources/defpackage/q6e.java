package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class q6e {
    public static final q6e a;
    public static final q6e b;
    public static final /* synthetic */ q6e[] c;

    static {
        q6e q6eVar = new q6e("TOP", 0);
        a = q6eVar;
        q6e q6eVar2 = new q6e("BOTTOM", 1);
        b = q6eVar2;
        c = new q6e[]{q6eVar, q6eVar2};
    }

    public static q6e valueOf(String str) {
        return (q6e) Enum.valueOf(q6e.class, str);
    }

    public static q6e[] values() {
        return (q6e[]) c.clone();
    }
}

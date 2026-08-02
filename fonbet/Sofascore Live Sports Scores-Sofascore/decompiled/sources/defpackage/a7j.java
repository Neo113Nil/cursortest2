package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class a7j {
    public static final a7j a;
    public static final /* synthetic */ a7j[] b;

    static {
        a7j a7jVar = new a7j("FULLY_COMPLETE", 0);
        a = a7jVar;
        b = new a7j[]{a7jVar, new a7j("SOURCE_COMPLETE", 1)};
    }

    public static a7j valueOf(String str) {
        return (a7j) Enum.valueOf(a7j.class, str);
    }

    public static a7j[] values() {
        return (a7j[]) b.clone();
    }
}

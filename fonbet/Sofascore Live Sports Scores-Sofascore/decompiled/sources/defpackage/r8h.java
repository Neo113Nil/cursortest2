package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class r8h {
    public static final r8h a;
    public static final r8h b;
    public static final /* synthetic */ r8h[] c;

    static {
        r8h r8hVar = new r8h("CRASHLYTICS", 0);
        a = r8hVar;
        r8h r8hVar2 = new r8h("PERFORMANCE", 1);
        b = r8hVar2;
        c = new r8h[]{r8hVar, r8hVar2, new r8h("MATT_SAYS_HI", 2)};
    }

    public static r8h valueOf(String str) {
        return (r8h) Enum.valueOf(r8h.class, str);
    }

    public static r8h[] values() {
        return (r8h[]) c.clone();
    }
}

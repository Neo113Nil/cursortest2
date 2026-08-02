package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class o3k {
    public static final o3k a;
    public static final o3k b;
    public static final /* synthetic */ o3k[] c;

    static {
        o3k o3kVar = new o3k("UPVOTE", 0);
        a = o3kVar;
        o3k o3kVar2 = new o3k("DOWNVOTE", 1);
        b = o3kVar2;
        c = new o3k[]{o3kVar, o3kVar2};
    }

    public static o3k valueOf(String str) {
        return (o3k) Enum.valueOf(o3k.class, str);
    }

    public static o3k[] values() {
        return (o3k[]) c.clone();
    }
}

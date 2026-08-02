package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class u1c {
    public static final u1c a;
    public static final u1c b;
    public static final /* synthetic */ u1c[] c;

    static {
        u1c u1cVar = new u1c("Min", 0);
        a = u1cVar;
        u1c u1cVar2 = new u1c("Max", 1);
        b = u1cVar2;
        c = new u1c[]{u1cVar, u1cVar2};
    }

    public static u1c valueOf(String str) {
        return (u1c) Enum.valueOf(u1c.class, str);
    }

    public static u1c[] values() {
        return (u1c[]) c.clone();
    }
}

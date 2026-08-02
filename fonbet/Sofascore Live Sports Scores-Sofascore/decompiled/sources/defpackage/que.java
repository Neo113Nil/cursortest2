package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class que {
    public static final que a;
    public static final que b;
    public static final /* synthetic */ que[] c;

    static {
        que queVar = new que("PenaltyTaker", 0);
        a = queVar;
        que queVar2 = new que("Goalkeeper", 1);
        b = queVar2;
        c = new que[]{queVar, queVar2};
    }

    public static que valueOf(String str) {
        return (que) Enum.valueOf(que.class, str);
    }

    public static que[] values() {
        return (que[]) c.clone();
    }
}

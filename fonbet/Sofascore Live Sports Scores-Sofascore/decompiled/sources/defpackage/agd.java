package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class agd {
    public static final agd a;
    public static final /* synthetic */ agd[] b;

    static {
        agd agdVar = new agd("COMPLETE", 0);
        a = agdVar;
        b = new agd[]{agdVar};
    }

    public static agd valueOf(String str) {
        return (agd) Enum.valueOf(agd.class, str);
    }

    public static agd[] values() {
        return (agd[]) b.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "NotificationLite.Complete";
    }
}

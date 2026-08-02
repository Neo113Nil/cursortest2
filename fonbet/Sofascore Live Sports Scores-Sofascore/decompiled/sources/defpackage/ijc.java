package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class ijc {
    public static final ijc a;
    public static final /* synthetic */ ijc[] b;

    static {
        ijc ijcVar = new ijc("UNARY", 0);
        a = ijcVar;
        b = new ijc[]{ijcVar, new ijc("CLIENT_STREAMING", 1), new ijc("SERVER_STREAMING", 2), new ijc("BIDI_STREAMING", 3), new ijc("UNKNOWN", 4)};
    }

    public static ijc valueOf(String str) {
        return (ijc) Enum.valueOf(ijc.class, str);
    }

    public static ijc[] values() {
        return (ijc[]) b.clone();
    }
}

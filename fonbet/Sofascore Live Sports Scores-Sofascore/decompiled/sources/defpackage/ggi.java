package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class ggi {
    public static final /* synthetic */ ggi[] a = {new ggi("NETWORK_LABEL_HOME", 0), new ggi("NETWORK_LABEL_AWAY", 1), new ggi("NETWORK_LABEL_BOTH", 2)};

    /* JADX INFO: Fake field, exist only in values array */
    ggi EF5;

    public static ggi valueOf(String str) {
        return (ggi) Enum.valueOf(ggi.class, str);
    }

    public static ggi[] values() {
        return (ggi[]) a.clone();
    }
}

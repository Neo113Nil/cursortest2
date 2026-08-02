package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class ehc {
    public static final /* synthetic */ ehc[] a = {new ehc("SYSTEM_MESSAGE", 0), new ehc("SYSTEM_MESSAGE_REDESIGN", 1), new ehc("USER_MESSAGE", 2), new ehc("MESSAGE", 3), new ehc("MESSAGE_REDESIGN", 4), new ehc("SEPARATOR", 5)};

    /* JADX INFO: Fake field, exist only in values array */
    ehc EF5;

    public static ehc valueOf(String str) {
        return (ehc) Enum.valueOf(ehc.class, str);
    }

    public static ehc[] values() {
        return (ehc[]) a.clone();
    }
}

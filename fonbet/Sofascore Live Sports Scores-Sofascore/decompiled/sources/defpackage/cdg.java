package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class cdg {
    public static final /* synthetic */ cdg[] a = {new cdg("NOT_REQUIRED", 0), new cdg("SUPPORTED", 1), new cdg("REQUIRED", 2), new cdg("REQUIRED_PUBLISHER_ONLINE_PLATFORM", 3)};

    /* JADX INFO: Fake field, exist only in values array */
    cdg EF5;

    public static cdg valueOf(String str) {
        return (cdg) Enum.valueOf(cdg.class, str);
    }

    public static cdg[] values() {
        return (cdg[]) a.clone();
    }
}

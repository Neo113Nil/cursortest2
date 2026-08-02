package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class amc {
    public static final /* synthetic */ amc[] a = {new amc("EVENT", 0), new amc("HEADER", 1), new amc("LOADER", 2), new amc("EMPTY_STATE", 3), new amc("DIVIDER", 4)};

    /* JADX INFO: Fake field, exist only in values array */
    amc EF5;

    public static amc valueOf(String str) {
        return (amc) Enum.valueOf(amc.class, str);
    }

    public static amc[] values() {
        return (amc[]) a.clone();
    }
}

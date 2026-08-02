package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class mf6 {
    public static final /* synthetic */ mf6[] a = {new mf6("REPLACE", 0), new mf6("KEEP", 1), new mf6("UPDATE", 2), new mf6("CANCEL_AND_REENQUEUE", 3)};

    /* JADX INFO: Fake field, exist only in values array */
    mf6 EF5;

    public static mf6 valueOf(String str) {
        return (mf6) Enum.valueOf(mf6.class, str);
    }

    public static mf6[] values() {
        return (mf6[]) a.clone();
    }
}

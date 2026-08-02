package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class xyg {
    public static final /* synthetic */ xyg[] a = {new xyg("EVENT", 0), new xyg("INJURY", 1), new xyg("TRANSFER", 2)};

    /* JADX INFO: Fake field, exist only in values array */
    xyg EF5;

    public static xyg valueOf(String str) {
        return (xyg) Enum.valueOf(xyg.class, str);
    }

    public static xyg[] values() {
        return (xyg[]) a.clone();
    }
}

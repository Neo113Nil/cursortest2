package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class hfj {
    public static final /* synthetic */ hfj[] a = {new hfj("Shown", 0), new hfj("Hidden", 1)};

    /* JADX INFO: Fake field, exist only in values array */
    hfj EF5;

    public static hfj valueOf(String str) {
        return (hfj) Enum.valueOf(hfj.class, str);
    }

    public static hfj[] values() {
        return (hfj[]) a.clone();
    }
}

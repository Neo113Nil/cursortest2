package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class sfi {
    public static final sfi a;
    public static final sfi b;
    public static final /* synthetic */ sfi[] c;

    static {
        sfi sfiVar = new sfi("Animate", 0);
        a = sfiVar;
        sfi sfiVar2 = new sfi("Visible", 1);
        b = sfiVar2;
        c = new sfi[]{sfiVar, sfiVar2};
    }

    public static sfi valueOf(String str) {
        return (sfi) Enum.valueOf(sfi.class, str);
    }

    public static sfi[] values() {
        return (sfi[]) c.clone();
    }
}

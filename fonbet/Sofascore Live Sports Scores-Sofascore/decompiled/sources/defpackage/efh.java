package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class efh {
    public static final efh a;
    public static final efh b;
    public static final efh c;
    public static final /* synthetic */ efh[] d;

    static {
        efh efhVar = new efh("Hidden", 0);
        a = efhVar;
        efh efhVar2 = new efh("Expanded", 1);
        b = efhVar2;
        efh efhVar3 = new efh("PartiallyExpanded", 2);
        c = efhVar3;
        d = new efh[]{efhVar, efhVar2, efhVar3};
    }

    public static efh valueOf(String str) {
        return (efh) Enum.valueOf(efh.class, str);
    }

    public static efh[] values() {
        return (efh[]) d.clone();
    }
}

package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ucf {
    public static final ucf a;
    public static final ucf b;
    public static final ucf c;
    public static final /* synthetic */ ucf[] d;

    static {
        ucf ucfVar = new ucf("PASS_THROUGH", 0);
        a = ucfVar;
        ucf ucfVar2 = new ucf("DISCARD_AFTER_NEXT_SAMPLE_METADATA", 1);
        b = ucfVar2;
        ucf ucfVar3 = new ucf("DISCARDING", 2);
        c = ucfVar3;
        d = new ucf[]{ucfVar, ucfVar2, ucfVar3};
    }

    public static ucf valueOf(String str) {
        return (ucf) Enum.valueOf(ucf.class, str);
    }

    public static ucf[] values() {
        return (ucf[]) d.clone();
    }
}

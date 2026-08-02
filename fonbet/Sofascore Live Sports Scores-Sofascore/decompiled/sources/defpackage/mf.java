package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class mf {
    public static final mf a;
    public static final mf b;
    public static final mf c;
    public static final mf d;
    public static final /* synthetic */ mf[] e;

    static {
        mf mfVar = new mf("ADS", 0);
        a = mfVar;
        mf mfVar2 = new mf("ODDS", 1);
        b = mfVar2;
        mf mfVar3 = new mf("EMPTY", 2);
        c = mfVar3;
        mf mfVar4 = new mf("MMA_VOTING", 3);
        d = mfVar4;
        e = new mf[]{mfVar, mfVar2, mfVar3, mfVar4};
    }

    public static mf valueOf(String str) {
        return (mf) Enum.valueOf(mf.class, str);
    }

    public static mf[] values() {
        return (mf[]) e.clone();
    }
}

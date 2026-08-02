package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class mhg {
    public static final mhg a;
    public static final mhg b;
    public static final mhg c;
    public static final /* synthetic */ mhg[] d;

    static {
        mhg mhgVar = new mhg("COLLAPSED", 0);
        a = mhgVar;
        mhg mhgVar2 = new mhg("EXPANDED", 1);
        b = mhgVar2;
        mhg mhgVar3 = new mhg("TRANSITIONING", 2);
        c = mhgVar3;
        d = new mhg[]{mhgVar, mhgVar2, mhgVar3};
    }

    public static mhg valueOf(String str) {
        return (mhg) Enum.valueOf(mhg.class, str);
    }

    public static mhg[] values() {
        return (mhg[]) d.clone();
    }
}

package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class pvj {
    public static final pvj b;
    public static final pvj c;
    public static final pvj d;
    public static final /* synthetic */ pvj[] e;
    public static final /* synthetic */ kp5 f;
    public final String a;

    static {
        pvj pvjVar = new pvj("FOLLOWERS", 0, "userCount");
        b = pvjVar;
        pvj pvjVar2 = new pvj("TRANSFER_FEE", 1, "transferFee");
        c = pvjVar2;
        pvj pvjVar3 = new pvj("DATE", 2, "transferDate");
        d = pvjVar3;
        pvj[] pvjVarArr = {pvjVar, pvjVar2, pvjVar3};
        e = pvjVarArr;
        f = new kp5(pvjVarArr);
    }

    public pvj(String str, int i, String str2) {
        this.a = str2;
    }

    public static pvj valueOf(String str) {
        return (pvj) Enum.valueOf(pvj.class, str);
    }

    public static pvj[] values() {
        return (pvj[]) e.clone();
    }
}

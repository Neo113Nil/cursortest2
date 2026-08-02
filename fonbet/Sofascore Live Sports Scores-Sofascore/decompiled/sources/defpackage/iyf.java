package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class iyf {
    public static final iyf c;
    public static final iyf d;
    public static final /* synthetic */ iyf[] e;
    public static final /* synthetic */ kp5 f;
    public final String a;
    public final Function1 b;

    static {
        iyf iyfVar = new iyf("DISCOUNT_YEARLY_WITH_TRIAL", 0, "ads-half-price-trial", new osf(8));
        c = iyfVar;
        iyf iyfVar2 = new iyf("DISCOUNT_YEARLY", 1, "ads-half-price", new osf(9));
        d = iyfVar2;
        iyf[] iyfVarArr = {iyfVar, iyfVar2, new iyf("FREE_TRIAL_MONTHLY", 2, "freetrial1m", new osf(10)), new iyf("FREE_TRIAL_YEARLY", 3, "freetrial1y", new osf(11))};
        e = iyfVarArr;
        f = new kp5(iyfVarArr);
    }

    public iyf(String str, int i, String str2, Function1 function1) {
        this.a = str2;
        this.b = function1;
    }

    public static iyf valueOf(String str) {
        return (iyf) Enum.valueOf(iyf.class, str);
    }

    public static iyf[] values() {
        return (iyf[]) e.clone();
    }
}

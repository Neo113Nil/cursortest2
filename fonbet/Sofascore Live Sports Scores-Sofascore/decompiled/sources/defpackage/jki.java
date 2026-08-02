package defpackage;

import com.sofascore.results.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class jki {
    public static final jki c;
    public static final jki d;
    public static final jki e;
    public static final /* synthetic */ jki[] f;
    public static final /* synthetic */ kp5 g;
    public final int a;
    public final Integer b;

    static {
        jki jkiVar = new jki(0, R.string.black_friday, Integer.valueOf(R.drawable.ic_sale_mark), "FEATURED_OFFER");
        c = jkiVar;
        jki jkiVar2 = new jki(1, R.string.subscription_billing_monthly, null, "MONTH");
        d = jkiVar2;
        jki jkiVar3 = new jki(2, R.string.subscription_billing_yearly, null, "YEAR");
        e = jkiVar3;
        jki[] jkiVarArr = {jkiVar, jkiVar2, jkiVar3};
        f = jkiVarArr;
        g = new kp5(jkiVarArr);
    }

    public jki(int i, int i2, Integer num, String str) {
        this.a = i2;
        this.b = num;
    }

    public static jki valueOf(String str) {
        return (jki) Enum.valueOf(jki.class, str);
    }

    public static jki[] values() {
        return (jki[]) f.clone();
    }
}

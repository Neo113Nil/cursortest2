package defpackage;

import com.sofascore.results.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class er1 implements nk2 {
    public static final dr1 a;
    public static final cr1 b;
    public static final /* synthetic */ er1[] c;

    static {
        cr1 cr1Var = new cr1();
        b = cr1Var;
        c = new er1[]{cr1Var};
        a = new dr1();
    }

    public static er1 valueOf(String str) {
        return (er1) Enum.valueOf(er1.class, str);
    }

    public static er1[] values() {
        return (er1[]) c.clone();
    }

    @Override // defpackage.nk2
    public final int d() {
        return R.string.all;
    }
}

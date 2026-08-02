package defpackage;

import com.sofascore.results.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class fwc implements alf {
    public static final fwc b;
    public static final fwc c;
    public static final fwc d;
    public static final /* synthetic */ fwc[] e;
    public static final /* synthetic */ kp5 f;
    public final int a;

    static {
        fwc fwcVar = new fwc("SUMMARY", 0, R.string.summary);
        b = fwcVar;
        fwc fwcVar2 = new fwc("TYRES", 1, R.string.motorsport_tyres);
        c = fwcVar2;
        fwc fwcVar3 = new fwc("FASTEST_LAP", 2, R.string.formula_fastest_lap);
        d = fwcVar3;
        fwc[] fwcVarArr = {fwcVar, fwcVar2, fwcVar3};
        e = fwcVarArr;
        f = new kp5(fwcVarArr);
    }

    public fwc(String str, int i, int i2) {
        this.a = i2;
    }

    public static fwc valueOf(String str) {
        return (fwc) Enum.valueOf(fwc.class, str);
    }

    public static fwc[] values() {
        return (fwc[]) e.clone();
    }
}

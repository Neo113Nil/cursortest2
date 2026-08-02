package defpackage;

import com.sofascore.results.R;
import kotlin.jvm.functions.Function1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class dtf {
    public static final /* synthetic */ dtf[] c;
    public static final /* synthetic */ kp5 d;
    public final int a;
    public final Function1 b;

    static {
        dtf[] dtfVarArr = {new dtf("DETAILS", 0, R.string.details, new osf(5)), new dtf("MATCHES", 1, R.string.matches, new osf(6))};
        c = dtfVarArr;
        d = new kp5(dtfVarArr);
    }

    public dtf(String str, int i, int i2, Function1 function1) {
        this.a = i2;
        this.b = function1;
    }

    public static dtf valueOf(String str) {
        return (dtf) Enum.valueOf(dtf.class, str);
    }

    public static dtf[] values() {
        return (dtf[]) c.clone();
    }
}

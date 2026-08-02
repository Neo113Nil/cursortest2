package defpackage;

import com.sofascore.results.R;
import kotlin.jvm.functions.Function1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class atb {
    public static final /* synthetic */ atb[] c;
    public static final /* synthetic */ kp5 d;
    public final int a;
    public final Function1 b;

    static {
        atb[] atbVarArr = {new atb("DETAILS", 0, R.string.details, new abb(18)), new atb("MATCHES", 1, R.string.matches, new abb(19))};
        c = atbVarArr;
        d = new kp5(atbVarArr);
    }

    public atb(String str, int i, int i2, Function1 function1) {
        this.a = i2;
        this.b = function1;
    }

    public static atb valueOf(String str) {
        return (atb) Enum.valueOf(atb.class, str);
    }

    public static atb[] values() {
        return (atb[]) c.clone();
    }
}

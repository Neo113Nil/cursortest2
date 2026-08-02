package defpackage;

import com.sofascore.results.R;
import kotlin.jvm.functions.Function1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class hnc {
    public static final /* synthetic */ hnc[] c;
    public static final /* synthetic */ kp5 d;
    public final int a;
    public final Function1 b;

    static {
        hnc[] hncVarArr = {new hnc("MAIN_CARD", 0, R.string.main_card, dnc.b), new hnc("PRELIMS", 1, R.string.prelims, enc.b), new hnc("EARLY_PRELIMS", 2, R.string.early_prelims, fnc.b), new hnc("FIGHTS", 3, R.string.fights, gnc.b)};
        c = hncVarArr;
        d = new kp5(hncVarArr);
    }

    public hnc(String str, int i, int i2, Function1 function1) {
        this.a = i2;
        this.b = function1;
    }

    public static hnc valueOf(String str) {
        return (hnc) Enum.valueOf(hnc.class, str);
    }

    public static hnc[] values() {
        return (hnc[]) c.clone();
    }
}

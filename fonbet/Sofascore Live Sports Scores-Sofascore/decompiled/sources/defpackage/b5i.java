package defpackage;

import com.sofascore.results.R;
import kotlin.jvm.functions.Function1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class b5i {
    public static final b5i c;
    public static final b5i d;
    public static final b5i e;
    public static final /* synthetic */ b5i[] f;
    public static final /* synthetic */ kp5 g;
    public final int a;
    public final Function1 b;

    static {
        b5i b5iVar = new b5i("STAGE_DRIVER_DETAILS", 0, R.string.tab_info, new l2i(25));
        b5i b5iVar2 = new b5i("STAGE_DRIVER_RANKING", 1, R.string.standings, new l2i(26));
        c = b5iVar2;
        b5i b5iVar3 = new b5i("STAGE_DRIVER_EVENTS", 2, R.string.formula_races, new l2i(27));
        d = b5iVar3;
        b5i b5iVar4 = new b5i("STAGE_DRIVER_CAREER", 3, R.string.career_tab, new l2i(28));
        e = b5iVar4;
        b5i[] b5iVarArr = {b5iVar, b5iVar2, b5iVar3, b5iVar4};
        f = b5iVarArr;
        g = new kp5(b5iVarArr);
    }

    public b5i(String str, int i, int i2, Function1 function1) {
        this.a = i2;
        this.b = function1;
    }

    public static b5i valueOf(String str) {
        return (b5i) Enum.valueOf(b5i.class, str);
    }

    public static b5i[] values() {
        return (b5i[]) f.clone();
    }
}

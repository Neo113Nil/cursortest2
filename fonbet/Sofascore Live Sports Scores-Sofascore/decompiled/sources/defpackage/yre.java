package defpackage;

import com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar;
import com.sofascore.model.mvvm.model.Season;
import com.sofascore.results.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class yre implements vue {
    public static final /* synthetic */ yre[] c;
    public static final /* synthetic */ kp5 d;
    public final String a;
    public final int b;

    static {
        yre[] yreVarArr = {new yre("ALL", 0, Season.YEAR_ALL_TIME, R.string.all_positions), new yre("FORWARDS", 1, ToolBar.FORWARD, R.string.hockey_forwards), new yre("DEFENSEMEN", 2, "defenseman", R.string.hockey_defensemen), new yre("GOALIES", 3, "goalie", R.string.hockey_goalies)};
        c = yreVarArr;
        d = new kp5(yreVarArr);
    }

    public yre(String str, int i, String str2, int i2) {
        this.a = str2;
        this.b = i2;
    }

    public static yre valueOf(String str) {
        return (yre) Enum.valueOf(yre.class, str);
    }

    public static yre[] values() {
        return (yre[]) c.clone();
    }

    @Override // defpackage.vue
    public final String g() {
        return this.a;
    }
}

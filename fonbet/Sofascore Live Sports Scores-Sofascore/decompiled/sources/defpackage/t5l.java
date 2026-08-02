package defpackage;

import com.blaze.blazesdk.widgets.models.WidgetRemoteConfigRemoteResponse;
import com.sofascore.results.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class t5l {
    public static final /* synthetic */ t5l[] c;
    public static final /* synthetic */ kp5 d;
    public final String a;
    public final int b;

    static {
        t5l[] t5lVarArr = {new t5l("STRAW", 0, "straw", R.string.strawweight), new t5l("FLY", 1, "fly", R.string.flyweight), new t5l("BANTAM", 2, "bantam", R.string.bantamweight), new t5l("FEATHER", 3, "feather", R.string.featherweight), new t5l("LIGHT", 4, WidgetRemoteConfigRemoteResponse.DEFAULT_LAYOUT_KEY, R.string.lightweight), new t5l("SUPERLIGHT", 5, "superlight", R.string.superlightweight), new t5l("WELTER", 6, "welter", R.string.welterweight), new t5l("SUPERWELTER", 7, "superwelter", R.string.superwelterweight), new t5l("MIDDLE", 8, "middle", R.string.middleweight), new t5l("SUPERMIDDLE", 9, "supermiddle", R.string.supermiddleweight), new t5l("LIGHTHEAVY", 10, "lightheavy", R.string.lightheavyweight), new t5l("CRUISER", 11, "cruiser", R.string.cruiserweight), new t5l("HEAVY", 12, "heavy", R.string.heavyweight), new t5l("SUPERHEAVY", 13, "superheavy", R.string.superheavyweight), new t5l("OPEN", 14, "openweight", R.string.openweight_mma), new t5l("CATCH", 15, "catch", R.string.catchweight), new t5l("ATOM", 16, "atom", R.string.mma_weight_class_atomweight), new t5l("POUND_FOR_POUND", 17, "", R.string.pound_for_pound)};
        c = t5lVarArr;
        d = new kp5(t5lVarArr);
    }

    public t5l(String str, int i, String str2, int i2) {
        this.a = str2;
        this.b = i2;
    }

    public static t5l valueOf(String str) {
        return (t5l) Enum.valueOf(t5l.class, str);
    }

    public static t5l[] values() {
        return (t5l[]) c.clone();
    }
}

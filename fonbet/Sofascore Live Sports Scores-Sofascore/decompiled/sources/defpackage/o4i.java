package defpackage;

import com.sofascore.results.R;
import kotlin.jvm.functions.Function1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class o4i {
    public static final o4i c;
    public static final o4i d;
    public static final o4i e;
    public static final o4i f;
    public static final /* synthetic */ o4i[] g;
    public static final /* synthetic */ kp5 h;
    public final int a;
    public final Function1 b;

    static {
        o4i o4iVar = new o4i("STAGE_DETAILS_RESULTS", 0, R.string.results, new l2i(20));
        o4i o4iVar2 = new o4i("STAGE_DETAILS_RACE_FLOW", 1, R.string.motorsport_race_flow_tab, new l2i(21));
        c = o4iVar2;
        o4i o4iVar3 = new o4i("STAGE_DETAILS_RANKINGS", 2, R.string.standings, new l2i(22));
        d = o4iVar3;
        o4i o4iVar4 = new o4i("STAGE_DETAILS_MEDIA", 3, R.string.media, new l2i(23));
        e = o4iVar4;
        o4i o4iVar5 = new o4i("STAGE_DETAILS_ODDS", 4, R.string.odds, new l2i(24));
        f = o4iVar5;
        o4i[] o4iVarArr = {o4iVar, o4iVar2, o4iVar3, o4iVar4, o4iVar5};
        g = o4iVarArr;
        h = new kp5(o4iVarArr);
    }

    public o4i(String str, int i, int i2, Function1 function1) {
        this.a = i2;
        this.b = function1;
    }

    public static o4i valueOf(String str) {
        return (o4i) Enum.valueOf(o4i.class, str);
    }

    public static o4i[] values() {
        return (o4i[]) g.clone();
    }
}

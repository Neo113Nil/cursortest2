package defpackage;

import com.sofascore.model.mvvm.model.Season;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class z83 {
    public static final b7 a = l6g.K(Season.SubSeasonType.OVERALL);

    public static gv9 a(Season season, Map map) {
        List list;
        gv9 W;
        season.getClass();
        if (!season.isAllTimeSeason() && (list = (List) map.get(Integer.valueOf(season.getId()))) != null) {
            if (list.isEmpty()) {
                list = null;
            }
            if (list != null && (W = l6g.W(list)) != null) {
                return W;
            }
        }
        return a;
    }
}

package defpackage;

import android.content.Context;
import com.sofascore.model.mvvm.model.BaseballInningInfo;
import com.sofascore.results.R;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract class c91 {
    public static final String a(BaseballInningInfo baseballInningInfo, Context context) {
        baseballInningInfo.getClass();
        context.getClass();
        if (baseballInningInfo.getInningHalf() == BaseballInningInfo.InningHalf.Top) {
            String string = context.getString(R.string.baseball_top_of_inning_number, yid.p(baseballInningInfo.getInning()));
            string.getClass();
            return string;
        }
        String string2 = context.getString(R.string.baseball_bottom_of_inning_number, yid.p(baseballInningInfo.getInning()));
        string2.getClass();
        return string2;
    }
}

package defpackage;

import android.content.Context;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.sofascore.model.mvvm.model.Gender;
import com.sofascore.model.mvvm.model.Season;
import com.sofascore.results.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class nre implements vue {
    public static final /* synthetic */ nre[] c;
    public static final /* synthetic */ kp5 d;
    public final String a;
    public final int b;

    static {
        nre[] nreVarArr = {new nre("ALL", 0, Season.YEAR_ALL_TIME, R.string.all_positions), new nre("GOALKEEPER", 1, "gk", R.string.goalkeeper), new nre("DEFENDER_LEFT", 2, "dl", R.string.football_left_back), new nre("DEFENDER_CENTER", 3, "dc", R.string.football_centre_back), new nre("DEFENDER_RIGHT", 4, DownloadCommon.DOWNLOAD_REPORT_DOWNLOAD_RATE, R.string.football_right_back), new nre("DEFENSIVE_MIDFIELDER", 5, "dm", R.string.football_defensive_midfielder), new nre("MIDFIELDER_LEFT", 6, "ml", R.string.football_left_midfielder), new nre("MIDFIELDER_CENTER", 7, "mc", R.string.football_centre_midfielder), new nre("MIDFIELDER_RIGHT", 8, "mr", R.string.football_right_midfielder), new nre("ATTACKING_MIDFIELDER", 9, "am", R.string.football_attacking_midfielder), new nre("LEFT_WING", 10, "lw", R.string.football_left_winger), new nre("RIGHT_WING", 11, "rw", R.string.football_right_winger), new nre("STRIKER", 12, "st", R.string.football_striker)};
        c = nreVarArr;
        d = new kp5(nreVarArr);
    }

    public nre(String str, int i, String str2, int i2) {
        this.a = str2;
        this.b = i2;
    }

    public static nre valueOf(String str) {
        return (nre) Enum.valueOf(nre.class, str);
    }

    public static nre[] values() {
        return (nre[]) c.clone();
    }

    public final String a(Context context, Gender gender) {
        context.getClass();
        int i = mre.a[ordinal()];
        int i2 = this.b;
        String string = i == 1 ? context.getString(i2) : hkg.Q(context, i2, gender, new Object[0]);
        string.getClass();
        return string;
    }

    @Override // defpackage.vue
    public final String g() {
        return this.a;
    }
}

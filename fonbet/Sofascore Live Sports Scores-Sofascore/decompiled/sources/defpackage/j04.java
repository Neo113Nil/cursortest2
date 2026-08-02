package defpackage;

import android.content.Context;
import android.icu.text.DateTimePatternGenerator;
import android.text.format.DateFormat;
import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.CricketEvent;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.StatusKt;
import com.sofascore.results.R;
import java.time.Instant;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class j04 extends y21 {
    public final CricketEvent O;
    public final boolean P;

    public j04(CricketEvent cricketEvent, boolean z) {
        this.O = cricketEvent;
        this.P = z;
    }

    @Override // defpackage.y21
    public final Event d() {
        return this.O;
    }

    @Override // defpackage.y21
    public final void h(Context context, Event event) {
        int i;
        String str;
        String concat;
        CricketEvent cricketEvent = (CricketEvent) event;
        Integer valueOf = Integer.valueOf(R.drawable.ic_cricket_bat);
        context.getClass();
        cricketEvent.getClass();
        String currentCricketDisplay = Event.getHomeScore$default(cricketEvent, null, 1, null).getCurrentCricketDisplay();
        String currentCricketDisplay2 = Event.getAwayScore$default(cricketEvent, null, 1, null).getCurrentCricketDisplay();
        String statusType = cricketEvent.getStatusType();
        boolean c = Intrinsics.c(statusType, StatusKt.STATUS_FINISHED);
        int i2 = R.color.n_lv_1;
        int i3 = R.color.n_lv_3;
        if (c) {
            Integer winnerCode$default = Event.getWinnerCode$default(cricketEvent, null, 1, null);
            int i4 = (winnerCode$default != null && winnerCode$default.intValue() == 1) ? R.color.n_lv_1 : R.color.n_lv_3;
            Integer winnerCode$default2 = Event.getWinnerCode$default(cricketEvent, null, 1, null);
            if (winnerCode$default2 == null || winnerCode$default2.intValue() != 2) {
                i2 = R.color.n_lv_3;
            }
            this.a = jfj.a(this.a, null, Integer.valueOf(i4), 5);
            this.c = jfj.a(this.c, null, Integer.valueOf(i4), 5);
            this.b = jfj.a(this.b, null, Integer.valueOf(i2), 5);
            this.d = jfj.a(this.d, null, Integer.valueOf(i2), 5);
            int i5 = i2;
            i2 = i4;
            i = R.color.n_lv_3;
            i3 = i5;
        } else {
            if (Intrinsics.c(statusType, StatusKt.STATUS_IN_PROGRESS)) {
                Integer currentBattingTeamId = cricketEvent.getCurrentBattingTeamId();
                int id = Event.getHomeTeam$default(cricketEvent, null, 1, null).getId();
                i3 = R.color.live;
                if (currentBattingTeamId != null && currentBattingTeamId.intValue() == id) {
                    this.q = valueOf;
                    this.r = null;
                    i = R.color.live;
                    i3 = R.color.n_lv_1;
                    i2 = i;
                } else {
                    int id2 = Event.getAwayTeam$default(cricketEvent, null, 1, null).getId();
                    if (currentBattingTeamId != null && currentBattingTeamId.intValue() == id2) {
                        this.q = null;
                        this.r = valueOf;
                        i = R.color.live;
                    } else {
                        this.q = null;
                        this.r = null;
                    }
                }
            }
            i = i3;
            i3 = R.color.n_lv_1;
        }
        String str2 = ((currentCricketDisplay == null || currentCricketDisplay.length() == 0) && Intrinsics.c(cricketEvent.getStatusType(), StatusKt.STATUS_IN_PROGRESS)) ? "-" : null;
        if (str2 != null) {
            currentCricketDisplay = str2;
        }
        this.e = new jfj(4, currentCricketDisplay, Integer.valueOf(i2));
        String str3 = ((currentCricketDisplay2 == null || currentCricketDisplay2.length() == 0) && Intrinsics.c(cricketEvent.getStatusType(), StatusKt.STATUS_IN_PROGRESS)) ? "-" : null;
        if (str3 != null) {
            currentCricketDisplay2 = str3;
        }
        this.f = new jfj(4, currentCricketDisplay2, Integer.valueOf(i3));
        if (ok3.D(cricketEvent)) {
            str = "";
        } else {
            long startTimestamp = cricketEvent.getStartTimestamp();
            bi4 bi4Var = bi4.PATTERN_DMM;
            ConcurrentHashMap concurrentHashMap = hk4.a;
            String format = hk4.a(bi4Var.d()).format(Instant.ofEpochSecond(startTimestamp));
            format.getClass();
            str = format.concat(" • ");
        }
        if (fc6.B(fc6.t(Instant.ofEpochSecond(cricketEvent.getStartTimestamp())))) {
            long startTimestamp2 = cricketEvent.getStartTimestamp();
            DateTimePatternGenerator b = hk4.b();
            String bestPattern = DateFormat.is24HourFormat(context) ? b.getBestPattern("Hm") : b.getBestPattern("hm");
            bestPattern.getClass();
            concat = fc6.i(startTimestamp2, hk4.a(bestPattern));
        } else {
            long startTimestamp3 = cricketEvent.getStartTimestamp();
            DateTimePatternGenerator b2 = hk4.b();
            String bestPattern2 = DateFormat.is24HourFormat(context) ? b2.getBestPattern("Hm") : b2.getBestPattern("hm");
            bestPattern2.getClass();
            String format2 = hk4.a(bestPattern2).format(Instant.ofEpochSecond(startTimestamp3));
            format2.getClass();
            concat = str.concat(format2);
        }
        if (this.P) {
            return;
        }
        String note = cricketEvent.getNote();
        if (note != null && note.length() != 0) {
            String note2 = cricketEvent.getNote();
            if (!Intrinsics.c(note2 != null ? StringsKt.l0(note2).toString() : null, "-")) {
                concat = dmi.q(str, cricketEvent.getNote());
                this.D = new jfj(4, concat, Integer.valueOf(i));
            }
        }
        if (!Intrinsics.c(cricketEvent.getStatusDescription(), "") && !Intrinsics.c(cricketEvent.getStatusDescription(), "-")) {
            concat = str.concat(afi.c(context, cricketEvent.getStatusDescription(), Sports.CRICKET, true));
        }
        this.D = new jfj(4, concat, Integer.valueOf(i));
    }
}

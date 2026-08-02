package defpackage;

import android.os.CountDownTimer;
import android.widget.LinearLayout;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import com.sofascore.results.featuredtournament.view.FeaturedTournamentHeaderView;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class pv7 extends CountDownTimer {
    public final /* synthetic */ e92 a;
    public final /* synthetic */ FeaturedTournamentHeaderView b;
    public final /* synthetic */ Integer c;
    public final /* synthetic */ Integer d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pv7(long j, e92 e92Var, FeaturedTournamentHeaderView featuredTournamentHeaderView, Integer num, Integer num2) {
        super(j, 1000L);
        this.a = e92Var;
        this.b = featuredTournamentHeaderView;
        this.c = num;
        this.d = num2;
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        LinearLayout linearLayout = (LinearLayout) this.a.e;
        linearLayout.getClass();
        linearLayout.setVisibility(8);
        int i = FeaturedTournamentHeaderView.f;
        this.b.f(this.c, this.d);
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
        long j2 = j / 86400000;
        long millis = j - TimeUnit.DAYS.toMillis(j2);
        long j3 = millis / 3600000;
        long millis2 = millis - TimeUnit.HOURS.toMillis(j3);
        long j4 = millis2 / ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS;
        long millis3 = (millis2 - TimeUnit.MINUTES.toMillis(j4)) / 1000;
        e92 e92Var = this.a;
        ((t22) e92Var.d).d.setText(String.valueOf(j2));
        ((t22) e92Var.b).d.setText(String.valueOf(j3));
        ((t22) e92Var.f).d.setText(String.valueOf(j4));
        ((t22) e92Var.c).d.setText(String.valueOf(millis3));
    }
}

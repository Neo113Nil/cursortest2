package defpackage;

import android.content.Context;
import androidx.appcompat.app.AppCompatActivity;
import com.sofascore.results.event.EventActivity;
import com.sofascore.results.league.fragment.details.compose.goat.LeagueGoatVoteBottomSheet;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class xi7 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ int c;

    public /* synthetic */ xi7(Context context, int i, int i2) {
        this.a = i2;
        this.b = context;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        rq3 rq3Var = null;
        int i2 = this.c;
        Context context = this.b;
        switch (i) {
            case 0:
                wxf wxfVar = EventActivity.h0;
                wxf.B(this.b, this.c, null, null, null, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                break;
            case 1:
                context.getClass();
                nv.A(context, "open_rules", null);
                p4h.w(context, "https://www.sofascore.com/fantasy/rules".concat("?competitionId=" + i2));
                break;
            case 2:
                wxf wxfVar2 = EventActivity.h0;
                wxf.B(this.b, this.c, null, null, null, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                break;
            default:
                LeagueGoatVoteBottomSheet leagueGoatVoteBottomSheet = new LeagueGoatVoteBottomSheet();
                leagueGoatVoteBottomSheet.setArguments(fz8.C(fz8.D(i2, "UNIQUE_TOURNAMENT_ID"), fz8.H("ANALYTICS_SOURCE", "click")));
                context.getClass();
                if (context instanceof csk) {
                    context = ((csk) context).getBaseContext();
                }
                AppCompatActivity appCompatActivity = context instanceof AppCompatActivity ? (AppCompatActivity) context : null;
                if (appCompatActivity != null) {
                    wca.x(appCompatActivity.getLifecycle()).b(new r1(leagueGoatVoteBottomSheet, appCompatActivity, rq3Var, 3));
                }
                break;
        }
        return Unit.a;
    }
}

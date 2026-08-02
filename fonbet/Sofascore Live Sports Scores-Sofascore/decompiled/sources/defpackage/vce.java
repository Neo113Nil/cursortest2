package defpackage;

import android.os.Trace;
import com.sofascore.results.event.dialog.PlayerEventStatisticsModal;
import com.sofascore.results.player.fantasy.PlayerFantasyFragment;
import com.sofascore.results.player.matches.PlayerEventsFragment;
import com.sofascore.results.player.media.PlayerMediaFragment;
import com.sofascore.results.profile.following.ProfileFollowingFragment;
import com.sofascore.results.profile.predictions.ProfilePredictionsStatisticsFragment;
import com.sofascore.results.profile.topLeaderboards.ProfileTopLeaderboardFragment;
import com.sofascore.results.referee.details.RefereeDetailsFragment;
import com.sofascore.results.referee.events.RefereeEventsFragment;
import com.sofascore.results.referral.ReferralRedeemRewardBottomSheet;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class vce extends xka implements Function0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vce(Object obj, int i) {
        super(0);
        this.i = i;
        this.j = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        dma parentLayoutCoordinates;
        int i = this.i;
        dma dmaVar = null;
        Object obj = this.j;
        switch (i) {
            case 0:
                return (ttk) ((jmc) obj).invoke();
            case 1:
                return (ttk) ((joe) obj).invoke();
            case 2:
                return (PlayerEventStatisticsModal) obj;
            case 3:
                return (ttk) ((vce) obj).invoke();
            case 4:
                return (PlayerEventsFragment) obj;
            case 5:
                return (ttk) ((vce) obj).invoke();
            case 6:
                return (PlayerFantasyFragment) obj;
            case 7:
                return (ttk) ((vce) obj).invoke();
            case 8:
                return (PlayerMediaFragment) obj;
            case 9:
                return (ttk) ((vce) obj).invoke();
            case 10:
                return (ttk) ((hwe) obj).invoke();
            case 11:
                b2f b2fVar = (b2f) obj;
                parentLayoutCoordinates = b2fVar.getParentLayoutCoordinates();
                if (parentLayoutCoordinates != null && parentLayoutCoordinates.f()) {
                    dmaVar = parentLayoutCoordinates;
                }
                return Boolean.valueOf((dmaVar == null || b2fVar.m14getPopupContentSizebOM6tXw() == null) ? false : true);
            case 12:
                return (ProfileFollowingFragment) obj;
            case 13:
                return (ttk) ((vce) obj).invoke();
            case 14:
                return (ttk) ((uaf) obj).invoke();
            case 15:
                return (ttk) ((uaf) obj).invoke();
            case 16:
                return (ProfilePredictionsStatisticsFragment) obj;
            case 17:
                return (ttk) ((vce) obj).invoke();
            case 18:
                return (ProfileTopLeaderboardFragment) obj;
            case 19:
                return (ttk) ((vce) obj).invoke();
            case 20:
                return (ttk) ((plf) obj).invoke();
            case 21:
                qqf qqfVar = (qqf) obj;
                qqfVar.h = null;
                Trace.beginSection("OnPositionedDispatch");
                try {
                    qqfVar.a();
                    Unit unit = Unit.a;
                    Trace.endSection();
                    return Unit.a;
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            case 22:
                return (RefereeDetailsFragment) obj;
            case 23:
                return (ttk) ((vce) obj).invoke();
            case 24:
                return (RefereeEventsFragment) obj;
            case 25:
                return (ttk) ((vce) obj).invoke();
            case 26:
                return (ReferralRedeemRewardBottomSheet) obj;
            case 27:
                return (ttk) ((vce) obj).invoke();
            case 28:
                return (ttk) ((ndh) obj).invoke();
            default:
                return (ttk) ((rzh) obj).invoke();
        }
    }
}

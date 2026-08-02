package defpackage;

import android.view.View;
import com.sofascore.results.bettingtips.fragment.DroppingOddsFragment;
import com.sofascore.results.dialog.CupTreeDialog;
import com.sofascore.results.event.lineups.cricket.EventCricketLineupsFragment;
import com.sofascore.results.main.matches.redesign.competitions.CompetitionsFragment;
import com.sofascore.results.player.EditPlayerDialog;
import com.sofascore.results.player.EditPlayerTransferDialog;
import com.sofascore.results.settings.developer.DeveloperOptionsFullScreenDialog;
import com.sofascore.results.team.editteam.EditTeamDialog;
import com.sofascore.results.venue.editvenue.EditVenueDialog;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class j63 extends xka implements Function0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j63(Object obj, int i) {
        super(0);
        this.i = i;
        this.j = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.i;
        Object obj = this.j;
        switch (i) {
            case 0:
                return (ttk) ((w1) obj).invoke();
            case 1:
                return (CompetitionsFragment) obj;
            case 2:
                return (ttk) ((j63) obj).invoke();
            case 3:
                boolean a = c7a.a(0L, 0L);
                View view = ((lf3) obj).a;
                return a ? rd0.s(view) : new xx4(0L, wnn.e(view.getContext()).v(d7a.I(0L)));
            case 4:
                return (ttk) ((o24) obj).invoke();
            case 5:
                return (ttk) ((b44) obj).invoke();
            case 6:
                return (CupTreeDialog) obj;
            case 7:
                return (ttk) ((j63) obj).invoke();
            case 8:
                return (ttk) ((eh4) obj).invoke();
            case 9:
                return (DeveloperOptionsFullScreenDialog) obj;
            case 10:
                return (ttk) ((j63) obj).invoke();
            case 11:
                return (DroppingOddsFragment) obj;
            case 12:
                return (ttk) ((j63) obj).invoke();
            case 13:
                return (EditPlayerDialog) obj;
            case 14:
                return (ttk) ((j63) obj).invoke();
            case 15:
                return (EditPlayerTransferDialog) obj;
            case 16:
                return (ttk) ((j63) obj).invoke();
            case 17:
                return (EditTeamDialog) obj;
            case 18:
                return (ttk) ((j63) obj).invoke();
            case 19:
                return (EditVenueDialog) obj;
            case 20:
                return (ttk) ((j63) obj).invoke();
            case 21:
                return (ttk) ((at5) obj).invoke();
            case 22:
                return (ttk) ((tt5) obj).invoke();
            case 23:
                return (ttk) ((wv5) obj).invoke();
            case 24:
                return (EventCricketLineupsFragment) obj;
            case 25:
                return (ttk) ((j63) obj).invoke();
            case 26:
                return (ttk) ((yx5) obj).invoke();
            case 27:
                return (ttk) ((yx5) obj).invoke();
            case 28:
                return (ttk) ((yx5) obj).invoke();
            default:
                return (ttk) ((iz5) obj).invoke();
        }
    }
}

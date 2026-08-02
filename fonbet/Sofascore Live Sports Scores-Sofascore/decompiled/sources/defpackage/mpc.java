package defpackage;

import android.content.Context;
import android.view.View;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.model.network.response.SearchResponseKt;
import com.sofascore.results.mma.fightNight.MmaFightNightActivity;
import com.sofascore.results.mma.organisation.events.MmaOrganisationEventsFragment;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class mpc implements ct8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MmaOrganisationEventsFragment b;

    public /* synthetic */ mpc(MmaOrganisationEventsFragment mmaOrganisationEventsFragment, int i) {
        this.a = i;
        this.b = mmaOrganisationEventsFragment;
    }

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        MmaOrganisationEventsFragment mmaOrganisationEventsFragment = this.b;
        switch (i) {
            case 0:
                wt3.y((Integer) obj2, (View) obj, obj3);
                if (obj3 instanceof Event) {
                    int i2 = MmaFightNightActivity.R;
                    Context requireContext = mmaOrganisationEventsFragment.requireContext();
                    requireContext.getClass();
                    x2a.S(((Event) obj3).getTournament().getId(), requireContext);
                }
                return Unit.a;
            default:
                int intValue = ((Integer) obj).intValue();
                t6e t6eVar = (t6e) obj2;
                s6e s6eVar = (s6e) obj3;
                t6eVar.getClass();
                s6eVar.getClass();
                vpc D = mmaOrganisationEventsFragment.D();
                UniqueTournament uniqueTournament = mmaOrganisationEventsFragment.u;
                if (uniqueTournament == null) {
                    Intrinsics.i(SearchResponseKt.LEAGUE_ENTITY);
                    throw null;
                }
                D.j = xw3.L(un0.z(D), null, null, new ly7(D, uniqueTournament.getId(), t6eVar, intValue, s6eVar, null, 4), 3);
                return Unit.a;
        }
    }
}

package defpackage;

import android.content.Context;
import com.sofascore.model.Country;
import com.sofascore.model.mvvm.model.Stage;
import com.sofascore.results.event.details.view.tv.dialog.TvChannelCountriesDialog;
import com.sofascore.results.stagesport.fragments.details.StageDetailsResultsFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class u3i implements Function1 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ k3k b;
    public final /* synthetic */ StageDetailsResultsFragment c;

    public /* synthetic */ u3i(k3k k3kVar, StageDetailsResultsFragment stageDetailsResultsFragment) {
        this.b = k3kVar;
        this.c = stageDetailsResultsFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        StageDetailsResultsFragment stageDetailsResultsFragment = this.c;
        k3k k3kVar = this.b;
        switch (i) {
            case 0:
                Country country = (Country) obj;
                country.getClass();
                Stage stage = stageDetailsResultsFragment.u;
                if (stage == null) {
                    Intrinsics.i("event");
                    throw null;
                }
                int id = stage.getId();
                TvChannelCountriesDialog tvChannelCountriesDialog = new TvChannelCountriesDialog();
                tvChannelCountriesDialog.setArguments(fz8.C(fz8.D(id, "ARG_EVENT_ID"), fz8.G("ARG_TV_CHANNEL_SELECTED_COUNTRY", country)));
                tvChannelCountriesDialog.F = new u3i(k3kVar, stageDetailsResultsFragment);
                tvChannelCountriesDialog.p(stageDetailsResultsFragment.requireActivity().k(), tvChannelCountriesDialog.getTag());
                return Unit.a;
            default:
                Country country2 = (Country) obj;
                country2.getClass();
                int i2 = ke0.c;
                Integer valueOf = Integer.valueOf(i2);
                if (i2 <= 0) {
                    valueOf = null;
                }
                int intValue = valueOf != null ? valueOf.intValue() : c1c.a;
                Context context = k3kVar.getContext();
                context.getClass();
                n9e.u(context, new px5(intValue, country2, 1));
                g4i G = stageDetailsResultsFragment.G();
                Stage stage2 = stageDetailsResultsFragment.u;
                if (stage2 != null) {
                    xw3.L(un0.z(G), null, null, new anc(G, stage2.getId(), country2, (rq3) null, 12), 3);
                    return Unit.a;
                }
                Intrinsics.i("event");
                throw null;
        }
    }

    public /* synthetic */ u3i(StageDetailsResultsFragment stageDetailsResultsFragment, k3k k3kVar) {
        this.c = stageDetailsResultsFragment;
        this.b = k3kVar;
    }
}

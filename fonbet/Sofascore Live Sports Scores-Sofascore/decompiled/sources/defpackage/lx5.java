package defpackage;

import android.content.Context;
import com.sofascore.model.Country;
import com.sofascore.results.event.details.EventDetailsFragment;
import com.sofascore.results.event.details.view.tv.dialog.TvChannelCountriesDialog;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class lx5 implements Function1 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ k3k b;
    public final /* synthetic */ EventDetailsFragment c;

    public /* synthetic */ lx5(k3k k3kVar, EventDetailsFragment eventDetailsFragment) {
        this.b = k3kVar;
        this.c = eventDetailsFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        EventDetailsFragment eventDetailsFragment = this.c;
        k3k k3kVar = this.b;
        switch (i) {
            case 0:
                Country country = (Country) obj;
                country.getClass();
                int id = eventDetailsFragment.F().getId();
                TvChannelCountriesDialog tvChannelCountriesDialog = new TvChannelCountriesDialog();
                tvChannelCountriesDialog.setArguments(fz8.C(fz8.D(id, "ARG_EVENT_ID"), fz8.G("ARG_TV_CHANNEL_SELECTED_COUNTRY", country)));
                tvChannelCountriesDialog.F = new lx5(k3kVar, eventDetailsFragment);
                tvChannelCountriesDialog.p(eventDetailsFragment.requireActivity().k(), tvChannelCountriesDialog.getTag());
                break;
            default:
                Country country2 = (Country) obj;
                country2.getClass();
                int i2 = ke0.c;
                Integer valueOf = Integer.valueOf(i2);
                rq3 rq3Var = null;
                if (i2 <= 0) {
                    valueOf = null;
                }
                int intValue = valueOf != null ? valueOf.intValue() : c1c.a;
                Context context = k3kVar.getContext();
                context.getClass();
                n9e.u(context, new px5(intValue, country2, 0));
                dz5 E = eventDetailsFragment.E();
                xw3.L(un0.z(E), null, null, new ok0(E, eventDetailsFragment.F().getId(), country2, rq3Var, 14), 3);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ lx5(EventDetailsFragment eventDetailsFragment, k3k k3kVar) {
        this.c = eventDetailsFragment;
        this.b = k3kVar;
    }
}

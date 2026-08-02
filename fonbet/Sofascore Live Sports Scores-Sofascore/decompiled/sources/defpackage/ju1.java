package defpackage;

import android.content.Context;
import android.widget.ImageView;
import com.sofascore.model.odds.OddsCountryProvider;
import com.sofascore.results.R;
import com.sofascore.results.event.details.view.cricket.wagonwheel.CricketWagonWheelView;
import com.sofascore.results.event.graphs.view.CricketBowlerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class ju1 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ImageView b;

    public /* synthetic */ ju1(ImageView imageView, int i) {
        this.a = i;
        this.b = imageView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        OddsCountryProvider oddsCountryProvider;
        int i = this.a;
        Object obj = null;
        ImageView imageView = this.b;
        switch (i) {
            case 0:
                Context context = imageView.getContext();
                context.getClass();
                Context context2 = imageView.getContext();
                context2.getClass();
                for (Object obj2 : xld.b(context2)) {
                    String slug = ((OddsCountryProvider) obj2).getProvider().getSlug();
                    slug.getClass();
                    if (StringsKt.J(slug, "bet365", false) || StringsKt.J(slug, "bet-365", false)) {
                        obj = obj2;
                        oddsCountryProvider = (OddsCountryProvider) obj;
                        if (oddsCountryProvider != null || (r1 = oddsCountryProvider.getDefaultBetSlipLink()) == null) {
                            String str = "";
                        }
                        bea.G(context, str);
                        Context context3 = imageView.getContext();
                        context3.getClass();
                        nv.a0(context3, "provider_logo");
                        break;
                    }
                }
                oddsCountryProvider = (OddsCountryProvider) obj;
                if (oddsCountryProvider != null) {
                }
                String str2 = "";
                bea.G(context, str2);
                Context context32 = imageView.getContext();
                context32.getClass();
                nv.a0(context32, "provider_logo");
                break;
            case 1:
                int i2 = CricketBowlerView.n;
                Context context4 = imageView.getContext();
                context4.getClass();
                String string = imageView.getContext().getString(R.string.bowler_graph);
                string.getClass();
                String string2 = imageView.getContext().getString(R.string.bowler_graph_info);
                string2.getClass();
                f7a.w(context4, string, string2, "CricketModal", null);
                break;
            case 2:
                int i3 = CricketWagonWheelView.l;
                Context context5 = imageView.getContext();
                context5.getClass();
                String string3 = imageView.getContext().getString(R.string.wagon_wheel);
                string3.getClass();
                String string4 = imageView.getContext().getString(R.string.wagon_wheel_info);
                string4.getClass();
                f7a.w(context5, string3, string4, "CricketModal", null);
                break;
            default:
                Context context6 = imageView.getContext();
                context6.getClass();
                String string5 = imageView.getContext().getString(R.string.info);
                string5.getClass();
                String string6 = imageView.getContext().getString(R.string.referee_alert_dialog, imageView.getContext().getString(R.string.match_appearances), imageView.getContext().getString(R.string.yellow_cards_per_game), imageView.getContext().getString(R.string.football_red_cards), imageView.getContext().getString(R.string.penalties));
                string6.getClass();
                f7a.w(context6, string5, string6, "RefereeStatisticsModal", null);
                break;
        }
        return Unit.a;
    }
}

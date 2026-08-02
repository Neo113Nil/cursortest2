package defpackage;

import android.widget.LinearLayout;
import com.sofascore.model.mvvm.model.PlayerKt;
import com.sofascore.model.newNetwork.hockeyplaybyplay.HockeyIncidentKt;
import com.sofascore.results.R;
import com.sofascore.results.event.hockeyplaybyplay.EventHockeyPlayByPlayFragment;
import com.sofascore.results.view.typeheader.SegmentedButtonsView;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class h16 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ EventHockeyPlayByPlayFragment b;

    public /* synthetic */ h16(EventHockeyPlayByPlayFragment eventHockeyPlayByPlayFragment, int i) {
        this.a = i;
        this.b = eventHockeyPlayByPlayFragment;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str;
        int i = this.a;
        EventHockeyPlayByPlayFragment eventHockeyPlayByPlayFragment = this.b;
        switch (i) {
            case 0:
                float floatValue = ((Float) obj).floatValue();
                krk krkVar = eventHockeyPlayByPlayFragment.l;
                krkVar.getClass();
                ((yq8) krkVar).b.setElevation(floatValue);
                break;
            case 1:
                joa joaVar = eventHockeyPlayByPlayFragment.v;
                List<String> S0 = CollectionsKt.S0(((Map) obj).keySet());
                krk krkVar2 = eventHockeyPlayByPlayFragment.l;
                krkVar2.getClass();
                boolean z = ((yq8) krkVar2).b.getChildCount() == 0;
                SegmentedButtonsView segmentedButtonsView = (SegmentedButtonsView) joaVar.getValue();
                ArrayList arrayList = new ArrayList(k13.r(S0, 10));
                for (String str2 : S0) {
                    switch (str2.hashCode()) {
                        case 2533:
                            if (str2.equals(PlayerKt.AMERICAN_FOOTBALL_OFFENSIVE_TACKLE)) {
                                str = eventHockeyPlayByPlayFragment.getString(R.string.overtime_short);
                                str.getClass();
                                break;
                            }
                            str = str2;
                            break;
                        case 49746:
                            if (str2.equals("1ST")) {
                                str = yid.p(1);
                                break;
                            }
                            str = str2;
                            break;
                        case 50536:
                            if (str2.equals("2ND")) {
                                str = yid.p(2);
                                break;
                            }
                            str = str2;
                            break;
                        case 51621:
                            if (str2.equals("3RD")) {
                                str = yid.p(3);
                                break;
                            }
                            str = str2;
                            break;
                        case 79097:
                            if (str2.equals(HockeyIncidentKt.PERIOD_SHOOTOUT)) {
                                str = eventHockeyPlayByPlayFragment.getString(R.string.shootout_short);
                                str.getClass();
                                break;
                            }
                            str = str2;
                            break;
                        default:
                            str = str2;
                            break;
                    }
                    arrayList.add(new s1h(str2, str, true));
                }
                SegmentedButtonsView.t(segmentedButtonsView, arrayList, null, 2);
                if (z) {
                    krk krkVar3 = eventHockeyPlayByPlayFragment.l;
                    krkVar3.getClass();
                    ((yq8) krkVar3).b.addView((LinearLayout) eventHockeyPlayByPlayFragment.x.getValue());
                    ((SegmentedButtonsView) joaVar.getValue()).q((String) CollectionsKt.h0(S0), true);
                }
                break;
            default:
                eventHockeyPlayByPlayFragment.D(((Boolean) obj).booleanValue());
                break;
        }
        return Unit.a;
    }
}

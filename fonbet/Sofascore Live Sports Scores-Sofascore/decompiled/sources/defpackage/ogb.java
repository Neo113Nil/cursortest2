package defpackage;

import com.inmobi.media.Mc;
import com.sofascore.model.mvvm.model.Manager;
import com.sofascore.model.mvvm.model.ManagerData;
import com.sofascore.model.newNetwork.ManagerEventsResponse;
import com.sofascore.model.newNetwork.MatchdayHighlightsResponse;
import com.sofascore.results.calendar.MaterialCalendarView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlinx.serialization.KSerializer;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final /* synthetic */ class ogb implements Function0 {
    public final /* synthetic */ int a;

    public /* synthetic */ ogb(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        KSerializer _childSerializers$_anonymous_;
        KSerializer _childSerializers$_anonymous_$0;
        KSerializer _childSerializers$_anonymous_2;
        KSerializer _childSerializers$_anonymous_3;
        KSerializer _childSerializers$_anonymous_$02;
        KSerializer _childSerializers$_anonymous_$1;
        KSerializer _childSerializers$_anonymous_4;
        switch (this.a) {
            case 0:
                return null;
            case 1:
                throw new IllegalStateException("No AnalyticsScreenTracker provided");
            case 2:
                return hj0.a;
            case 3:
                return dk0.a;
            case 4:
                xgb xgbVar = new xgb(new ef0(0));
                ek4.f(xgbVar);
                v9g.x(xgbVar, '-');
                ek4.h(xgbVar);
                v9g.x(xgbVar, '-');
                ak4.q(xgbVar);
                Unit unit = Unit.a;
                return new ygb(xgbVar.build());
            case 5:
                xgb xgbVar2 = new xgb(new ef0(0));
                ek4.f(xgbVar2);
                ek4.h(xgbVar2);
                ak4.q(xgbVar2);
                Unit unit2 = Unit.a;
                return new ygb(xgbVar2.build());
            case 6:
                fhb fhbVar = new fhb(new ef0(0));
                d3 d3Var = (d3) zgb.a.getValue();
                d3Var.getClass();
                if (d3Var instanceof ygb) {
                    fhbVar.d(((ygb) d3Var).a);
                }
                v9g.v(fhbVar, new Function1[]{new abb(9)}, new abb(10));
                yhb yhbVar = (yhb) zhb.a.getValue();
                yhbVar.getClass();
                fhbVar.c(yhbVar.a);
                Unit unit3 = Unit.a;
                return new ghb(fhbVar.build());
            case 7:
                throw new IllegalStateException("No device information found");
            case 8:
                return null;
            case 9:
                throw new IllegalStateException("CompositionLocal LocalLifecycleOwner not present");
            case 10:
                throw new IllegalStateException("Unexpected access to LocalNavAnimatedContentScope. You should only access LocalNavAnimatedContentScope inside a NavEntry passed to NavDisplay. AnimatedContentScope in OverlayScenes are no-op.");
            case 11:
                return null;
            case 12:
                ff5 ff5Var = rhb.a;
                return ccd.d;
            case 13:
                throw new IllegalStateException("CompositionLocal LocalSavedStateRegistryOwner not present");
            case 14:
                return Double.valueOf(1.0d);
            case 15:
                throw new IllegalStateException("No SignInProvider provided");
            case 16:
                xhb xhbVar = new xhb(new ef0(0));
                ck4.n(xhbVar);
                v9g.x(xhbVar, ':');
                ck4.m(xhbVar);
                v9g.v(xhbVar, new Function1[]{new abb(12)}, new abb(13));
                Unit unit4 = Unit.a;
                return new yhb(xhbVar.build());
            case 17:
                _childSerializers$_anonymous_ = Manager._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_;
            case 18:
                _childSerializers$_anonymous_$0 = Manager._childSerializers$_anonymous_$0();
                return _childSerializers$_anonymous_$0;
            case 19:
                _childSerializers$_anonymous_2 = ManagerData._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_2;
            case 20:
                _childSerializers$_anonymous_3 = ManagerEventsResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_3;
            case 21:
                _childSerializers$_anonymous_$02 = ManagerEventsResponse._childSerializers$_anonymous_$0();
                return _childSerializers$_anonymous_$02;
            case 22:
                _childSerializers$_anonymous_$1 = ManagerEventsResponse._childSerializers$_anonymous_$1();
                return _childSerializers$_anonymous_$1;
            case 23:
                _childSerializers$_anonymous_4 = MatchdayHighlightsResponse._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_4;
            case 24:
                yea yeaVar = j58.a;
                e58 f = e58.f();
                f.getClass();
                nxf[] nxfVarArr = nxf.a;
                return Boolean.valueOf(f.c("trending_grid_enabled"));
            case 25:
                int i = MaterialCalendarView.C;
                return new gg2("LLLL yyyy");
            case 26:
                int i2 = MaterialCalendarView.C;
                return new n2l();
            case 27:
                return Boolean.FALSE;
            case 28:
                return awc.a;
            default:
                return Mc.d();
        }
    }
}

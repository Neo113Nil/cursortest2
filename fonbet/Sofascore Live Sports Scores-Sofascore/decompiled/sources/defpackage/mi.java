package defpackage;

import android.app.AlertDialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import com.ironsource.U3;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.sofascore.model.FirebaseBundle;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Stage;
import com.sofascore.model.mvvm.model.StageType;
import com.sofascore.model.odds.OddsCountryProvider;
import com.sofascore.results.R;
import com.sofascore.results.calendar.CalendarView;
import com.sofascore.results.event.odds.additionalodds.AdditionalOddsFragment;
import com.sofascore.results.event.odds.eventrecomended.EventRecommendedOddsFragment;
import com.sofascore.results.event.odds.model.OddsEventUIModel;
import com.sofascore.results.event.odds.oddscomparison.AdditionalOddsComparisonFragment;
import com.sofascore.results.main.matches.redesign.competitions.CompetitionsFragment;
import com.sofascore.results.view.BellButton;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.collections.c;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class mi implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ mi(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.d = obj2;
        this.c = obj3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x008e, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.c(r7.d().a, defpackage.ofb.b) == false) goto L24;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        int i;
        wo3 wo3Var;
        oqf oqfVar;
        boolean m1;
        Unit runFallbackClearCredFlow$lambda$2$0$0;
        String str;
        int i2 = this.a;
        boolean z = true;
        int i3 = 0;
        Object obj = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object obj2 = this.c;
        Object obj3 = this.d;
        Object obj4 = this.b;
        switch (i2) {
            case 0:
                pld pldVar = (pld) obj4;
                AdditionalOddsComparisonFragment additionalOddsComparisonFragment = (AdditionalOddsComparisonFragment) obj3;
                cj cjVar = (cj) ((vnb) ((cdi) obj2).getValue()).a();
                if (cjVar != null && pldVar.b != null) {
                    Context requireContext = additionalOddsComparisonFragment.requireContext();
                    requireContext.getClass();
                    OddsEventUIModel oddsEventUIModel = cjVar.e;
                    String str2 = oddsEventUIModel.b;
                    OddsCountryProvider oddsCountryProvider = pldVar.b;
                    String str3 = cjVar.f;
                    nv.c0(requireContext, str2, oddsCountryProvider, str3 == null ? "Additional odds" : str3, oddsEventUIModel.a, vmd.MONETIZED_ODDS_TAB, null);
                }
                return Unit.a;
            case 1:
                pld pldVar2 = (pld) obj4;
                AdditionalOddsFragment additionalOddsFragment = (AdditionalOddsFragment) obj3;
                ek ekVar = (ek) ((vnb) ((cdi) obj2).getValue()).a();
                if (ekVar != null && pldVar2.b != null) {
                    Context requireContext2 = additionalOddsFragment.requireContext();
                    requireContext2.getClass();
                    OddsEventUIModel oddsEventUIModel2 = ekVar.a;
                    String str4 = oddsEventUIModel2.b;
                    OddsCountryProvider oddsCountryProvider2 = pldVar2.b;
                    String str5 = pldVar2.a;
                    nv.c0(requireContext2, str4, oddsCountryProvider2, str5 == null ? "Additional odds" : str5, oddsEventUIModel2.a, vmd.MONETIZED_ODDS_TAB, null);
                }
                return Unit.a;
            case 2:
                ((fx7) obj4).invoke();
                nv.k0((Context) obj3, bv.FEED_APP_UPDATE, av.CTA_CLICK, dv.OTHER, null, null, 48);
                ((AlertDialog) obj2).dismiss();
                return Unit.a;
            case 3:
                ((bk7) obj4).invoke();
                nv.k0((Context) obj3, bv.FEED_APP_UPDATE, av.CLOSE, dv.OTHER, null, null, 48);
                ((AlertDialog) obj2).dismiss();
                return Unit.a;
            case 4:
                ((pw0) obj4).a();
                em0 em0Var = (em0) ((p03) obj3).d;
                int i4 = ((dsf) obj2).a;
                do {
                    i = em0Var.get();
                } while (!em0Var.compareAndSet(i, ((i >>> 27) & 15) == i4 ? i - 1 : i));
                return Unit.a;
            case 5:
                xw3.L((ku3) obj4, null, null, new l0((pr4) obj3, (gv9) obj2, objArr == true ? 1 : 0, 25), 3);
                return Unit.a;
            case 6:
                Function1 function1 = (Function1) obj3;
                kl1 kl1Var = (kl1) obj2;
                Iterator<E> it = ((gv9) obj4).iterator();
                while (true) {
                    if (it.hasNext()) {
                        Object next = it.next();
                        if (((kl1) next) != kl1Var) {
                            obj = next;
                        }
                    }
                }
                kl1 kl1Var2 = (kl1) obj;
                if (kl1Var2 != null) {
                    function1.invoke(kl1Var2);
                }
                return Unit.a;
            case 7:
                ykj ykjVar = (ykj) obj4;
                ku3 ku3Var = (ku3) obj3;
                e1d e1dVar = (e1d) obj2;
                if (ykjVar.b()) {
                    xw3.L(ku3Var, null, null, new ip1(ykjVar, objArr2 == true ? 1 : 0, i3), 3);
                    e1dVar.setValue(Boolean.FALSE);
                }
                return Unit.a;
            case 8:
                BellButton bellButton = (BellButton) obj4;
                Stage stage = (Stage) obj3;
                int i5 = BellButton.h;
                Context context = bellButton.getContext();
                context.getClass();
                nv.y(context, vu.MUTE_NOTIFICATION, xu.STAGE, stage.getId(), bellButton.getFollowSource());
                Context context2 = bellButton.getContext();
                context2.getClass();
                u0a.I(stage.getId(), context2);
                ((HashSet) obj2).add(StageType.MUTED);
                bellButton.setState(xe8.Muted);
                return Unit.a;
            case 9:
                x32 x32Var = (x32) obj4;
                oqf k1 = x32.k1(x32Var, (wdd) obj3, (y1) obj2);
                if (k1 == null) {
                    return null;
                }
                wo3 wo3Var2 = x32Var.o;
                if (c7a.a(wo3Var2.v, -1L)) {
                    u3a.c("Expected BringIntoViewRequester to not be used before parents are placed.");
                }
                return k1.k(wo3Var2.o1(k1, wo3Var2.l1(), 0L) ^ (-9223372034707292160L));
            case 10:
                ((k92) obj4).g.e((u6b) obj3, new y7(7, new ox1((d92) obj2, 12)));
                return Unit.a;
            case 11:
                int i6 = CalendarView.i;
                ((CalendarView) obj4).a(!((fg2) obj3).equals((fg2) obj2));
                return Unit.a;
            case 12:
                p63 p63Var = (p63) obj4;
                uwg uwgVar = p63Var.c;
                s96 s96Var = p63Var.d;
                p83 p83Var = p63Var.f;
                return new owg(uwgVar, s96Var, c.I((List) obj3, p83Var.c), (String) obj2, p83Var.a, p63Var.e, p83Var.e);
            case 13:
                ia3 ia3Var = (ia3) obj3;
                la3 D = ((CompetitionsFragment) obj4).D();
                xw3.L(un0.z(D), null, null, new ka3(D, ia3Var.a, ia3Var.b, true, null), 3);
                ((l94) obj2).b(3);
                return Unit.a;
            case 14:
                ok3 ok3Var = ((xm2) obj4).b;
                ok3Var.getClass();
                return ok3Var.j(((lk) obj2).h.d, ((w69) obj3).a());
            case 15:
                wo3 wo3Var3 = (wo3) obj4;
                idk idkVar = (idk) obj3;
                a42 a42Var = (a42) obj2;
                j0l j0lVar = wo3Var3.t;
                while (true) {
                    i1d i1dVar = (i1d) j0lVar.b;
                    int i7 = i1dVar.c;
                    if (i7 == 0) {
                        wo3Var = wo3Var3;
                    } else {
                        if (i7 == 0) {
                            ogj.m("MutableVector is empty.");
                            return null;
                        }
                        oqf oqfVar2 = (oqf) ((to3) i1dVar.a[i7 - 1]).a.invoke();
                        if (oqfVar2 == null) {
                            wo3Var = wo3Var3;
                            m1 = true;
                        } else {
                            wo3Var = wo3Var3;
                            m1 = wo3.m1(wo3Var, oqfVar2, 0L, 0L, 3);
                        }
                        if (m1) {
                            i1d i1dVar2 = (i1d) j0lVar.b;
                            lj2 lj2Var = ((to3) i1dVar2.r(i1dVar2.c - 1)).b;
                            Unit unit = Unit.a;
                            p2g p2gVar = w2g.b;
                            lj2Var.resumeWith(unit);
                            wo3Var3 = wo3Var;
                        }
                    }
                }
                if (wo3Var.u && (oqfVar = (oqf) wo3Var.s.invoke()) != null) {
                    wo3 wo3Var4 = wo3Var;
                    wo3Var = wo3Var4;
                    if (wo3.m1(wo3Var4, oqfVar, 0L, 0L, 3)) {
                        wo3Var.u = false;
                    }
                }
                idkVar.e = wo3Var.k1(a42Var, 0L);
                return Unit.a;
            case 16:
                ((e1d) obj3).setValue("");
                ((e1d) obj2).setValue((gv9) obj4);
                return Unit.a;
            case 17:
                runFallbackClearCredFlow$lambda$2$0$0 = CredentialProviderPlayServicesImpl.runFallbackClearCredFlow$lambda$2$0$0((Exception) obj4, (Executor) obj3, (oy3) obj2);
                return runFallbackClearCredFlow$lambda$2$0$0;
            case 18:
                n44 n44Var = (n44) obj4;
                Function0 function0 = (Function0) obj3;
                Function0 function02 = (Function0) obj2;
                if (n44Var instanceof l44) {
                    function0.invoke();
                } else {
                    if (!(n44Var instanceof m44)) {
                        zzl.b();
                        return null;
                    }
                    function02.invoke();
                }
                return Unit.a;
            case 19:
                Function1 function12 = (Function1) obj3;
                oge ogeVar = (oge) obj2;
                String str6 = (String) ((eoh) ((oge) obj4).a).getValue();
                function12.invoke(new lz4(Integer.parseInt((String) ((eoh) ogeVar.a).getValue()), Intrinsics.c(str6, "seconds") ? be5.SECONDS : Intrinsics.c(str6, "minutes") ? be5.MINUTES : be5.HOURS));
                return Unit.a;
            case 20:
                Window window = (Window) obj4;
                Window window2 = (Window) obj3;
                View view = (View) obj2;
                if (window != null && window2 != null) {
                    WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
                    layoutParams.copyFrom(window.getAttributes());
                    layoutParams.type = window2.getAttributes().type;
                    window2.setAttributes(layoutParams);
                    window2.setWindowAnimations(R.style.FullScreenDialogAnimationFade);
                    if (view != null) {
                        view.setLayoutParams(new FrameLayout.LayoutParams(window.getDecorView().getWidth(), window.getDecorView().getHeight()));
                    }
                }
                return Unit.a;
            case 21:
                fv5 fv5Var = (fv5) obj3;
                ((ct8) obj4).invoke(fv5Var.d, (String) obj2, Boolean.valueOf(fv5Var.c));
                return Unit.a;
            case 22:
                OddsCountryProvider oddsCountryProvider3 = ((pld) obj4).b;
                EventRecommendedOddsFragment eventRecommendedOddsFragment = (EventRecommendedOddsFragment) obj3;
                if (((zpf) ((vnb) ((cdi) obj2).getValue()).a()) != null && oddsCountryProvider3 != null) {
                    Context requireContext3 = eventRecommendedOddsFragment.requireContext();
                    requireContext3.getClass();
                    int id = ((Event) eventRecommendedOddsFragment.D().l.getValue()).getId();
                    String type = ((Event) eventRecommendedOddsFragment.D().l.getValue()).getStatus().getType();
                    oddsCountryProvider3.getClass();
                    type.getClass();
                    double impressionCostDecrypted = oddsCountryProvider3.getImpressionCostDecrypted() / 1000000.0d;
                    FirebaseBundle firebaseBundle = new FirebaseBundle();
                    firebaseBundle.putInt("id", id);
                    firebaseBundle.putString("location", "recommended_odds");
                    firebaseBundle.putString(IronSourceConstants.EVENTS_PROVIDER, oddsCountryProvider3.getProvider().getSlug());
                    firebaseBundle.putDouble(U3.i.X, impressionCostDecrypted);
                    firebaseBundle.putString(InAppPurchaseMetaData.KEY_CURRENCY, "EUR");
                    firebaseBundle.putString("status", type);
                    ia0 ia0Var = ia0.q;
                    me4.d((f5d) me4.e(), "compliance_odds_impression", firebaseBundle, requireContext3).a.e(n9e.K(firebaseBundle), null, "compliance_odds_impression", false);
                }
                return Unit.a;
            case 23:
                f7a.w(((mb6) obj4).b, (String) obj3, (String) obj2, "StatisticsInfoModal", null);
                return Unit.a;
            case 24:
                mvh mvhVar = (mvh) obj2;
                ((b93) obj4).invoke();
                if (((String) obj3).equals("PrimaryEditable") && mvhVar != null) {
                    ((lw4) mvhVar).b();
                }
                return Boolean.TRUE;
            case 25:
                ((Function2) obj4).invoke((String) ((e1d) obj3).getValue(), (String) ((e1d) obj2).getValue());
                return Unit.a;
            case 26:
                xw3.L((ku3) obj4, null, null, new d27((n29) obj3, (e1d) obj2, objArr3 == true ? 1 : 0, i3), 3);
                return Unit.a;
            case 27:
                Function1 function13 = (Function1) obj4;
                f27 f27Var = (f27) obj3;
                Bitmap bitmap = (Bitmap) ((e1d) obj2).getValue();
                if (bitmap == null || (str = f27Var.b) == null) {
                    a70.r("Required value was null.");
                    return null;
                }
                function13.invoke(new a27(bitmap, str));
                return Unit.a;
            case 28:
                String str7 = (String) obj3;
                osa osaVar = (osa) obj2;
                List list = ((ksa) obj4).j().k;
                ArrayList arrayList = new ArrayList();
                for (Object obj5 : list) {
                    if (Intrinsics.c(((dsa) obj5).l, "leaderboard_item")) {
                        arrayList.add(obj5);
                    }
                }
                if (!arrayList.isEmpty()) {
                    ArrayList arrayList2 = new ArrayList(k13.r(arrayList, 10));
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(((dsa) it2.next()).k);
                    }
                    if (!arrayList2.contains(str7)) {
                        break;
                    }
                }
                z = false;
                return Boolean.valueOf(z);
            default:
                h67 h67Var = (h67) obj4;
                return new y57(h67Var.f.a, h67Var.e, (gv9) obj3, (String) obj2);
        }
    }
}

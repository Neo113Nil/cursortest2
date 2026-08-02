package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.a;
import androidx.fragment.app.s;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.sofascore.model.FirebaseBundle;
import com.sofascore.model.database.DisplayType;
import com.sofascore.results.R;
import com.sofascore.results.main.matches.redesign.datematches.MainMatchesFragment;
import com.sofascore.results.main.matches.redesign.filter.MatchesFilterBottomSheetDialog;
import com.sofascore.results.main.matches.redesign.livematches.LiveMatchesFragment;
import java.util.Calendar;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class zpb implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MainMatchesFragment b;

    public /* synthetic */ zpb(MainMatchesFragment mainMatchesFragment, int i) {
        this.a = i;
        this.b = mainMatchesFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        rq3 rq3Var = null;
        int i2 = 1;
        MainMatchesFragment mainMatchesFragment = this.b;
        switch (i) {
            case 0:
                View view = (View) obj;
                view.getClass();
                int height = view.getHeight();
                Context requireContext = mainMatchesFragment.requireContext();
                requireContext.getClass();
                int s = ao2.s(24, requireContext) + height;
                so8 so8Var = (so8) mainMatchesFragment.l;
                if (so8Var != null) {
                    ExtendedFloatingActionButton extendedFloatingActionButton = so8Var.c;
                    ViewGroup.LayoutParams layoutParams = extendedFloatingActionButton.getLayoutParams();
                    if (layoutParams == null) {
                        yhk.s("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                        break;
                    } else {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                        marginLayoutParams.bottomMargin = s;
                        extendedFloatingActionButton.setLayoutParams(marginLayoutParams);
                    }
                }
                break;
            case 1:
                krk krkVar = mainMatchesFragment.l;
                krkVar.getClass();
                mainMatchesFragment.t = ((so8) krkVar).d.getCurrentItem();
                Calendar calendar = (Calendar) ((pn3) obj).a();
                if (calendar != null) {
                    int v = mainMatchesFragment.D().v(calendar);
                    krk krkVar2 = mainMatchesFragment.l;
                    krkVar2.getClass();
                    ((so8) krkVar2).d.c(v, true);
                }
                break;
            case 2:
                ((Unit) obj).getClass();
                krk krkVar3 = mainMatchesFragment.l;
                krkVar3.getClass();
                mainMatchesFragment.t = ((so8) krkVar3).d.getCurrentItem();
                vc4 D = mainMatchesFragment.D();
                Calendar calendar2 = ke0.a;
                calendar2.add(5, -1);
                int v2 = D.v(calendar2);
                krk krkVar4 = mainMatchesFragment.l;
                krkVar4.getClass();
                ((so8) krkVar4).d.c(v2, true);
                break;
            case 3:
                ((Unit) obj).getClass();
                krk krkVar5 = mainMatchesFragment.l;
                krkVar5.getClass();
                mainMatchesFragment.t = ((so8) krkVar5).d.getCurrentItem();
                vc4 D2 = mainMatchesFragment.D();
                Calendar calendar3 = ke0.a;
                calendar3.add(5, 1);
                int v3 = D2.v(calendar3);
                krk krkVar6 = mainMatchesFragment.l;
                krkVar6.getClass();
                ((so8) krkVar6).d.c(v3, true);
                break;
            case 4:
                ((Unit) obj).getClass();
                vc4 D3 = mainMatchesFragment.D();
                Calendar calendar4 = Calendar.getInstance();
                calendar4.getClass();
                int v4 = D3.v(calendar4);
                krk krkVar7 = mainMatchesFragment.l;
                krkVar7.getClass();
                ((so8) krkVar7).d.c(v4, true);
                break;
            case 5:
                qqb qqbVar = (qqb) obj;
                vc4 D4 = mainMatchesFragment.D();
                DisplayType displayType = qqbVar.c;
                D4.getClass();
                displayType.getClass();
                if (D4.l != displayType) {
                    D4.l = displayType;
                    D4.notifyDataSetChanged();
                }
                vc4 D5 = mainMatchesFragment.D();
                krk krkVar8 = mainMatchesFragment.l;
                krkVar8.getClass();
                long w = D5.w(((so8) krkVar8).d.getCurrentItem());
                krk krkVar9 = mainMatchesFragment.l;
                krkVar9.getClass();
                ((so8) krkVar9).e.r(qqbVar);
                krk krkVar10 = mainMatchesFragment.l;
                krkVar10.getClass();
                ((so8) krkVar10).e.p(qqbVar.a, w, new zpb(mainMatchesFragment, 6), new zpb(mainMatchesFragment, 7), new aqb(mainMatchesFragment, r2), new aqb(mainMatchesFragment, i2), new aqb(mainMatchesFragment, 2));
                mainMatchesFragment.E(w);
                break;
            case 6:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                FragmentActivity requireActivity = mainMatchesFragment.requireActivity();
                requireActivity.getClass();
                MatchesFilterBottomSheetDialog matchesFilterBottomSheetDialog = new MatchesFilterBottomSheetDialog();
                Bundle bundle = new Bundle();
                bundle.putBoolean("DISABLE_STATUS_FILTER", booleanValue);
                matchesFilterBottomSheetDialog.setArguments(bundle);
                AppCompatActivity appCompatActivity = requireActivity instanceof AppCompatActivity ? (AppCompatActivity) requireActivity : null;
                if (appCompatActivity != null) {
                    wca.x(appCompatActivity.getLifecycle()).b(new r1(matchesFilterBottomSheetDialog, appCompatActivity, rq3Var, 3));
                }
                break;
            default:
                joa joaVar = mainMatchesFragment.r;
                Boolean bool = (Boolean) obj;
                boolean booleanValue2 = bool.booleanValue();
                FragmentActivity requireActivity2 = mainMatchesFragment.requireActivity();
                requireActivity2.getClass();
                FirebaseBundle firebaseBundle = new FirebaseBundle();
                firebaseBundle.putBoolean("is_active", booleanValue2);
                ia0 ia0Var = ia0.q;
                ((f5d) me4.e()).c("live_button", firebaseBundle);
                FirebaseAnalytics firebaseAnalytics = FirebaseAnalytics.getInstance(requireActivity2);
                firebaseAnalytics.getClass();
                firebaseAnalytics.a.e(n9e.K(firebaseBundle), null, "live_button", false);
                krk krkVar11 = mainMatchesFragment.l;
                krkVar11.getClass();
                ((so8) krkVar11).d.setVisibility(booleanValue2 ? 8 : 0);
                mainMatchesFragment.C().v.j(bool);
                if (booleanValue2) {
                    s childFragmentManager = mainMatchesFragment.getChildFragmentManager();
                    childFragmentManager.getClass();
                    a aVar = new a(childFragmentManager);
                    aVar.r = true;
                    aVar.d = R.anim.in_with_fade;
                    aVar.e = R.anim.out_with_fade;
                    aVar.f = R.anim.in_with_fade;
                    aVar.g = R.anim.out_with_fade;
                    krk krkVar12 = mainMatchesFragment.l;
                    krkVar12.getClass();
                    aVar.i(((so8) krkVar12).f.getId(), new LiveMatchesFragment(), dmi.q("LiveMatchesFragment-", (String) joaVar.getValue()), 1);
                    aVar.g(true, true);
                } else {
                    Fragment F = mainMatchesFragment.getChildFragmentManager().F("LiveMatchesFragment-" + ((String) joaVar.getValue()));
                    if (F != null) {
                        s childFragmentManager2 = mainMatchesFragment.getChildFragmentManager();
                        childFragmentManager2.getClass();
                        a aVar2 = new a(childFragmentManager2);
                        aVar2.r = true;
                        aVar2.d = R.anim.in_with_fade;
                        aVar2.e = R.anim.out_with_fade;
                        aVar2.f = R.anim.in_with_fade;
                        aVar2.g = R.anim.out_with_fade;
                        aVar2.k(F);
                        aVar2.g(true, true);
                    }
                }
                qqb qqbVar2 = (qqb) mainMatchesFragment.C().m.d();
                if (qqbVar2 != null) {
                    krk krkVar13 = mainMatchesFragment.l;
                    krkVar13.getClass();
                    ((so8) krkVar13).e.r(qqbVar2);
                }
                break;
        }
        return Unit.a;
    }
}

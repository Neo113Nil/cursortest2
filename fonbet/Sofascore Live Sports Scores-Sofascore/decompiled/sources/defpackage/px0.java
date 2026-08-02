package defpackage;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import androidx.navigation.fragment.NavHostFragment;
import androidx.recyclerview.widget.l;
import androidx.viewpager2.widget.ViewPager2;
import com.sofascore.results.R;
import com.sofascore.results.calendar.CalendarView;
import com.sofascore.results.dialog.BaseFullScreenDialog;
import com.sofascore.results.fantasy.teammanagement.substitutions.FantasySubstitutionsActivity;
import com.sofascore.results.fantasy.teammanagement.transfers.FantasyTransfersActivity;
import com.sofascore.results.fantasy.walkthrough.createteam.FantasyWalkthroughCreateTeamFragment;
import com.sofascore.results.league.fragment.cuptree.BaseCupTreeFragment;
import com.sofascore.results.main.MainActivity;
import com.sofascore.results.main.SurveyActivity;
import com.sofascore.results.mvvm.base.AbstractActivity;
import com.sofascore.results.profile.edit.ProfileEditFragment;
import com.sofascore.results.settings.PreferenceFragment;
import com.sofascore.results.settings.SettingsActivity;
import com.unity3d.services.UnityAdsConstants;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class px0 extends ppd {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ px0(int i, Object obj, boolean z) {
        super(true);
        this.d = i;
        this.e = obj;
    }

    @Override // defpackage.ppd
    public void a() {
        Window window;
        View decorView;
        ViewPropertyAnimator animate;
        ViewPropertyAnimator duration;
        int i = this.d;
        Object obj = this.e;
        switch (i) {
            case 0:
                ((r9) obj).t();
                break;
            case 2:
                Dialog dialog = ((BaseFullScreenDialog) obj).l;
                if (dialog != null && (window = dialog.getWindow()) != null && (decorView = window.getDecorView()) != null && (animate = decorView.animate()) != null && (duration = animate.setDuration(150L)) != null) {
                    duration.start();
                    break;
                }
                break;
            case 9:
                View view = ((PreferenceFragment) obj).getView();
                if (view != null) {
                    view.animate().translationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setDuration(150L).start();
                    break;
                }
                break;
        }
    }

    @Override // defpackage.ppd
    public final void b() {
        Window window;
        View decorView;
        l adapter;
        int i = this.d;
        int i2 = 22;
        int i3 = 14;
        Object obj = null;
        r8 = null;
        Integer num = null;
        int i4 = 0;
        Object obj2 = this.e;
        switch (i) {
            case 0:
                ((r9) obj2).u();
                return;
            case 1:
                BaseCupTreeFragment baseCupTreeFragment = (BaseCupTreeFragment) obj2;
                krk krkVar = baseCupTreeFragment.l;
                krkVar.getClass();
                if (((co8) krkVar).g.isSelected()) {
                    baseCupTreeFragment.u.invoke(Boolean.FALSE);
                    return;
                } else {
                    baseCupTreeFragment.requireActivity().finish();
                    return;
                }
            case 2:
                BaseFullScreenDialog baseFullScreenDialog = (BaseFullScreenDialog) obj2;
                Dialog dialog = baseFullScreenDialog.l;
                if (dialog == null || (window = dialog.getWindow()) == null || (decorView = window.getDecorView()) == null) {
                    return;
                }
                decorView.animate().translationY(decorView.getMeasuredHeight() * 0.8f).setDuration(200L).withEndAction(new y2(baseFullScreenDialog, i2)).start();
                return;
            case 3:
                FantasySubstitutionsActivity fantasySubstitutionsActivity = (FantasySubstitutionsActivity) obj2;
                int i5 = FantasySubstitutionsActivity.M;
                if (((ll7) fantasySubstitutionsActivity.Q().n.a.getValue()).g) {
                    zic.P(fantasySubstitutionsActivity, R.string.discard_substitutions_title, R.string.discard_substitutions_text, R.string.discard_button, new n37(i3, this, fantasySubstitutionsActivity), 32);
                    return;
                } else {
                    z8e.z(this, fantasySubstitutionsActivity.getOnBackPressedDispatcher());
                    return;
                }
            case 4:
                FantasyTransfersActivity fantasyTransfersActivity = (FantasyTransfersActivity) obj2;
                NavHostFragment navHostFragment = fantasyTransfersActivity.L;
                if (navHostFragment == null) {
                    Intrinsics.i("navHostFragment");
                    throw null;
                }
                r9 = navHostFragment.getChildFragmentManager().J() != 0 ? 0 : 1;
                boolean z = ((vn7) ((ao7) fantasyTransfersActivity.P.getValue()).o.a.getValue()).j;
                if (r9 == 0 || !z) {
                    z8e.z(this, fantasyTransfersActivity.getOnBackPressedDispatcher());
                    return;
                } else {
                    zic.P(fantasyTransfersActivity, R.string.discard_transfers_title, R.string.discard_transfers_text, R.string.discard_button, new n37(19, this, fantasyTransfersActivity), 32);
                    return;
                }
            case 5:
                FantasyWalkthroughCreateTeamFragment fantasyWalkthroughCreateTeamFragment = (FantasyWalkthroughCreateTeamFragment) obj2;
                if (fantasyWalkthroughCreateTeamFragment.getView() != null) {
                    if (fantasyWalkthroughCreateTeamFragment.C().k().e <= 0) {
                        z8e.z(this, fantasyWalkthroughCreateTeamFragment.requireActivity().getOnBackPressedDispatcher());
                        return;
                    }
                    Context requireContext = fantasyWalkthroughCreateTeamFragment.requireContext();
                    requireContext.getClass();
                    zic.P(requireContext, R.string.discard_selection_title, R.string.discard_selection_text, R.string.discard_button, new n37(i2, fantasyWalkthroughCreateTeamFragment, this), 32);
                    return;
                }
                return;
            case 6:
                MainActivity mainActivity = (MainActivity) obj2;
                CalendarView calendarView = mainActivity.c0;
                if (Intrinsics.c(calendarView != null ? Boolean.valueOf(calendarView.f) : null, Boolean.TRUE)) {
                    CalendarView calendarView2 = mainActivity.c0;
                    if (calendarView2 != null) {
                        calendarView2.a(false);
                        return;
                    }
                    return;
                }
                if (mainActivity.Q().j.getCurrentItem() != 0) {
                    mainActivity.Q().j.c(0, false);
                    return;
                } else {
                    mainActivity.finish();
                    return;
                }
            case 7:
                ((k7d) obj2).d();
                return;
            case 8:
                ((Function1) obj2).invoke(this);
                return;
            case 9:
                PreferenceFragment preferenceFragment = (PreferenceFragment) obj2;
                View view = preferenceFragment.getView();
                if (view != null) {
                    view.animate().translationX(view.getMeasuredWidth()).setDuration(300L).withEndAction(new t4f(preferenceFragment, i4)).start();
                    return;
                }
                return;
            case 10:
                ProfileEditFragment profileEditFragment = (ProfileEditFragment) obj2;
                Context requireContext2 = profileEditFragment.requireContext();
                requireContext2.getClass();
                w8f w8fVar = new w8f(profileEditFragment, i4);
                w8f w8fVar2 = new w8f(profileEditFragment, r9);
                AlertDialog h = lnb.h(R.style.RedesignDialog, requireContext2);
                h04 b = h04.b(LayoutInflater.from(requireContext2));
                b.d.setText(requireContext2.getString(R.string.profile_edit_save_changes_header));
                b.c.setText(requireContext2.getString(R.string.profile_edit_save_changes_description));
                h.setView(b.b);
                h.setButton(-2, requireContext2.getString(R.string.discard_changes_button), new pn(w8fVar2, r9));
                h.setButton(-1, requireContext2.getString(R.string.save_changes_button), new pn(w8fVar, 2));
                h.show();
                return;
            case 11:
                SettingsActivity settingsActivity = (SettingsActivity) obj2;
                if (settingsActivity.k().J() <= 0) {
                    settingsActivity.finish();
                    return;
                } else {
                    fp8 k = settingsActivity.k();
                    k.x(new ep8(k, null, -1, 0), false);
                    return;
                }
            case 12:
                SurveyActivity surveyActivity = (SurveyActivity) obj2;
                vni vniVar = new vni(surveyActivity, r9);
                AlertDialog create = new AlertDialog.Builder(surveyActivity, R.style.RedesignDialog).create();
                h04 b2 = h04.b(LayoutInflater.from(surveyActivity));
                b2.d.setText(surveyActivity.getString(R.string.quit_survey_title));
                b2.c.setText(surveyActivity.getString(R.string.quit_survey_text));
                create.setView(b2.b);
                create.setButton(-2, surveyActivity.getString(R.string.cancel), new i0(create, 10));
                create.setButton(-1, surveyActivity.getString(R.string.quit_button), new pn(vniVar, 4));
                create.show();
                return;
            default:
                ng2 ng2Var = (ng2) obj2;
                View view2 = (View) ng2Var.c;
                ViewPager2 viewPager2 = (ViewPager2) ng2Var.d;
                dsi dsiVar = (dsi) ng2Var.b;
                if (dsiVar.d) {
                    long j = dsiVar.e;
                    dsiVar.d = false;
                    dsiVar.e = -1L;
                    ((px0) ng2Var.g).f(false);
                    viewPager2.setUserInputEnabled(true);
                    o02 n = ((AbstractActivity) ng2Var.a).n();
                    if (n != null) {
                        n.r0(null);
                        n.p0(0);
                    }
                    hz8.C(view2, 200L, 11);
                    tgj.E(view2, 200L, null, 14);
                    ((Function1) ng2Var.f).invoke(Boolean.FALSE);
                    if (j != -1 && (adapter = viewPager2.getAdapter()) != null) {
                        v6a it = llf.j(0, adapter.getItemCount()).iterator();
                        while (true) {
                            if (it.c) {
                                Object next = it.next();
                                if (adapter.getItemId(((Number) next).intValue()) == j) {
                                    obj = next;
                                }
                            }
                        }
                        num = (Integer) obj;
                    }
                    if (num != null) {
                        viewPager2.c(num.intValue(), true);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override // defpackage.ppd
    public void c(nx0 nx0Var) {
        int i = this.d;
        Object obj = this.e;
        switch (i) {
            case 0:
                ((r9) obj).v(nx0Var);
                break;
            case 2:
                ((BaseFullScreenDialog) obj).t(nx0Var.c);
                break;
            case 9:
                ((PreferenceFragment) obj).q(nx0Var.c);
                break;
        }
    }

    @Override // defpackage.ppd
    public void d(nx0 nx0Var) {
        int i = this.d;
        Object obj = this.e;
        switch (i) {
            case 0:
                ((r9) obj).w();
                break;
            case 2:
                ((BaseFullScreenDialog) obj).t(nx0Var.c);
                break;
            case 9:
                ((PreferenceFragment) obj).q(nx0Var.c);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ px0(Object obj, int i) {
        super(false);
        this.d = i;
        this.e = obj;
    }
}

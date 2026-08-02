package defpackage;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.l;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.sofascore.results.calendar.MaterialCalendarView;
import com.sofascore.results.chat.ChatActivity;
import com.sofascore.results.chat.fragment.AbstractChatFragment;
import com.sofascore.results.chat.fragment.ModeratorsChatFragment;
import com.sofascore.results.crowdsourcing.CrowdsourcingOnboardingModal;
import com.sofascore.results.dialog.BaseIntroModal;
import com.sofascore.results.fantasy.league.FantasyLeagueActivity;
import com.sofascore.results.main.MainActivity;
import com.sofascore.results.main.favorites.FavoritesRootFragment;
import com.sofascore.results.main.navigation.DynamicBottomNavigation;
import com.sofascore.results.main.tutorial.CompetitionsIntroModal;
import com.sofascore.results.main.tutorial.PulsatingFrameLayout;
import com.sofascore.results.sharemodal.BaseSharePageFragment;
import com.sofascore.results.sharemodal.match.BaseShareMultiPageModal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class j41 extends ouk {
    public final /* synthetic */ int a;
    public final Object b;

    public j41() {
        this.a = 3;
        this.b = new ArrayList(3);
    }

    @Override // defpackage.ouk
    public void a(int i) {
        int i2 = this.a;
        Object obj = this.b;
        switch (i2) {
            case 3:
                try {
                    Iterator it = ((ArrayList) obj).iterator();
                    while (it.hasNext()) {
                        ((ouk) it.next()).a(i);
                    }
                    return;
                } catch (ConcurrentModificationException e) {
                    sw9.m("Adding and removing callbacks during dispatch to callbacks is not supported", e);
                    return;
                }
            case 8:
                ((ei3) obj).h(false);
                return;
            case 11:
                c5e c5eVar = (c5e) obj;
                c5eVar.c = i;
                if (i == 0) {
                    ViewPager2 viewPager2 = c5eVar.a;
                    if (viewPager2 == null) {
                        Intrinsics.i("viewPager");
                        throw null;
                    }
                    c5eVar.d = viewPager2.getCurrentItem();
                    c5eVar.invalidate();
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override // defpackage.ouk
    public void b(int i, float f, int i2) {
        int i3 = this.a;
        Object obj = this.b;
        switch (i3) {
            case 3:
                try {
                    Iterator it = ((ArrayList) obj).iterator();
                    while (it.hasNext()) {
                        ((ouk) it.next()).b(i, f, i2);
                    }
                    break;
                } catch (ConcurrentModificationException e) {
                    sw9.m("Adding and removing callbacks during dispatch to callbacks is not supported", e);
                    return;
                }
            case 11:
                c5e c5eVar = (c5e) obj;
                c5eVar.setDirection(i >= c5eVar.d ? 1 : 0);
                c5eVar.setPageOffset(f);
                c5eVar.invalidate();
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:94:0x01ee, code lost:
    
        if (((com.google.android.material.button.MaterialButton) r6.c).getVisibility() == 0) goto L106;
     */
    /* JADX WARN: Removed duplicated region for block: B:71:0x018c  */
    @Override // defpackage.ouk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(int i) {
        SharedPreferences d;
        ezb binding;
        ezb binding2;
        czb monthsAdapter;
        ezb binding3;
        ezb binding4;
        fg2 currentlyShownMonth;
        ezb binding5;
        gg2 titleFormatter;
        dg2 dg2Var;
        int i2 = 2;
        rq3 rq3Var = null;
        switch (this.a) {
            case 0:
                BaseIntroModal baseIntroModal = (BaseIntroModal) this.b;
                baseIntroModal.O(i);
                if (i == b.i(((CompetitionsIntroModal) baseIntroModal).E)) {
                    baseIntroModal.y = true;
                    return;
                }
                return;
            case 1:
                BaseShareMultiPageModal baseShareMultiPageModal = (BaseShareMultiPageModal) this.b;
                baseShareMultiPageModal.N().b.setText(((BaseSharePageFragment) baseShareMultiPageModal.L().j.get(i)).C());
                ((ImageView) baseShareMultiPageModal.N().e).setEnabled(i > 0);
                ((ImageView) baseShareMultiPageModal.N().f).setEnabled(i < baseShareMultiPageModal.L().j.size() - 1);
                ((ImageView) baseShareMultiPageModal.N().e).setAlpha(i == 0 ? 0.4f : 1.0f);
                ((ImageView) baseShareMultiPageModal.N().f).setAlpha(i == baseShareMultiPageModal.L().j.size() - 1 ? 0.4f : 1.0f);
                return;
            case 2:
                ChatActivity chatActivity = (ChatActivity) this.b;
                int i3 = ChatActivity.Z;
                View findViewById = chatActivity.findViewById(R.id.content);
                findViewById.getClass();
                Context context = findViewById.getContext();
                context.getClass();
                InputMethodManager inputMethodManager = (InputMethodManager) context.getSystemService(InputMethodManager.class);
                if (inputMethodManager != null) {
                    inputMethodManager.hideSoftInputFromWindow(findViewById.getWindowToken(), 0);
                }
                Fragment z = chatActivity.T().z(i);
                if (z instanceof AbstractChatFragment) {
                    AbstractChatFragment abstractChatFragment = (AbstractChatFragment) z;
                    if (abstractChatFragment.M) {
                        abstractChatFragment.M = false;
                        chatActivity.T().notifyItemChanged(i);
                    }
                }
                chatActivity.V(fq2.a, Intrinsics.c(chatActivity.P, Boolean.TRUE) && (z instanceof ModeratorsChatFragment));
                return;
            case 3:
                try {
                    Iterator it = ((ArrayList) this.b).iterator();
                    while (it.hasNext()) {
                        ((ouk) it.next()).c(i);
                    }
                    return;
                } catch (ConcurrentModificationException e) {
                    sw9.m("Adding and removing callbacks during dispatch to callbacks is not supported", e);
                    return;
                }
            case 4:
                CrowdsourcingOnboardingModal crowdsourcingOnboardingModal = (CrowdsourcingOnboardingModal) this.b;
                if (i != 0) {
                    z82 z82Var = crowdsourcingOnboardingModal.w;
                    if (z82Var == null) {
                        Intrinsics.i("modalBinding");
                        throw null;
                    }
                    break;
                }
                float f = i == 0 ? 1.0f : 0.0f;
                float f2 = i == 0 ? 0.0f : 1.0f;
                z82 z82Var2 = crowdsourcingOnboardingModal.w;
                if (z82Var2 == null) {
                    Intrinsics.i("modalBinding");
                    throw null;
                }
                ((MaterialButton) z82Var2.c).setVisibility(0);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f, f2);
                ofFloat.addUpdateListener(new p6(4, ofFloat, crowdsourcingOnboardingModal));
                ofFloat.addListener(new z54(crowdsourcingOnboardingModal, i, r5 ? 1 : 0));
                ofFloat.setDuration(200L);
                ofFloat.start();
                z82 z82Var3 = crowdsourcingOnboardingModal.w;
                if (z82Var3 == null) {
                    Intrinsics.i("modalBinding");
                    throw null;
                }
                ((ShapeableImageView) z82Var3.f).setImageResource(((Number) crowdsourcingOnboardingModal.A.get(i)).intValue());
                int i4 = i == b.i(crowdsourcingOnboardingModal.z) ? com.sofascore.results.R.string.button_text_got_it : com.sofascore.results.R.string.next;
                z82 z82Var4 = crowdsourcingOnboardingModal.w;
                if (z82Var4 == null) {
                    Intrinsics.i("modalBinding");
                    throw null;
                }
                ((MaterialButton) z82Var4.d).setText(crowdsourcingOnboardingModal.requireContext().getString(i4));
                z82 z82Var5 = crowdsourcingOnboardingModal.w;
                if (z82Var5 == null) {
                    Intrinsics.i("modalBinding");
                    throw null;
                }
                int i5 = i + 1;
                ((LinearProgressIndicator) z82Var5.e).setProgress(i5);
                crowdsourcingOnboardingModal.t.d = Integer.valueOf(i5);
                return;
            case 5:
                ((DynamicBottomNavigation) this.b).setSelectedIndexState(i);
                return;
            case 6:
                FantasyLeagueActivity fantasyLeagueActivity = (FantasyLeagueActivity) this.b;
                int i6 = FantasyLeagueActivity.N;
                Fragment z2 = fantasyLeagueActivity.S().z(i);
                if (z2 instanceof AbstractChatFragment) {
                    AbstractChatFragment abstractChatFragment2 = (AbstractChatFragment) z2;
                    if (abstractChatFragment2.M) {
                        abstractChatFragment2.M = false;
                        fantasyLeagueActivity.S().notifyItemChanged(i);
                        return;
                    }
                    return;
                }
                return;
            case 7:
                zqb A = ((FavoritesRootFragment) this.b).A();
                ct7 ct7Var = (ct7) ct7.h.get(i);
                ct7Var.getClass();
                A.b0 = ct7Var;
                return;
            case 8:
                ((ei3) this.b).h(false);
                return;
            case 9:
                MainActivity mainActivity = (MainActivity) this.b;
                mainActivity.l0.f(mainActivity.Q().j.getCurrentItem() != 0);
                jqb jqbVar = (jqb) ((MainActivity) this.b).W().E(i);
                ((MainActivity) this.b).c0(jqbVar);
                ((MainActivity) this.b).b0(jqbVar);
                if (jqbVar == jqb.o) {
                    qv7 qv7Var = rv7.c;
                    if (ml4.e0()) {
                        String str = y6f.a;
                        if (!y6f.c((MainActivity) this.b, z6f.e) && ((MainActivity) this.b).P == null) {
                            Intrinsics.i("featuredTournamentManager");
                            throw null;
                        }
                    }
                }
                if (jqbVar == jqb.p) {
                    zqb V = ((MainActivity) this.b).V();
                    xw3.L(un0.z(V), null, null, new uqb(V, rq3Var, i2), 3);
                }
                if (i == 0) {
                    int i7 = gjf.p;
                    MainActivity mainActivity2 = (MainActivity) this.b;
                    SharedPreferences sharedPreferences = uic.j;
                    if (sharedPreferences == null) {
                        Context applicationContext = mainActivity2.getApplicationContext();
                        synchronized (uic.i) {
                            d = a5f.d(applicationContext);
                            uic.j = d;
                        }
                        d.getClass();
                        sharedPreferences = d;
                    }
                    if (sharedPreferences.getBoolean("PREF_PULSATE_QUICK_LINKS", false)) {
                        ((PulsatingFrameLayout) ((MainActivity) this.b).Q().h.c).a();
                        ((MainActivity) this.b).Q().d.setVisibility(jqbVar != jqb.m ? 8 : 0);
                        return;
                    }
                }
                ((PulsatingFrameLayout) ((MainActivity) this.b).Q().h.c).b();
                ((MainActivity) this.b).Q().d.setVisibility(jqbVar != jqb.m ? 8 : 0);
                return;
            case 10:
                MaterialCalendarView materialCalendarView = (MaterialCalendarView) this.b;
                boolean z3 = i > 0;
                binding = materialCalendarView.getBinding();
                binding.c.setEnabled(z3);
                binding2 = materialCalendarView.getBinding();
                binding2.c.setAlpha(z3 ? 1.0f : 0.1f);
                monthsAdapter = materialCalendarView.getMonthsAdapter();
                boolean z4 = i < monthsAdapter.getItemCount() - 1;
                binding3 = materialCalendarView.getBinding();
                binding3.b.setEnabled(z4);
                binding4 = materialCalendarView.getBinding();
                binding4.b.setAlpha(z4 ? 1.0f : 0.1f);
                currentlyShownMonth = materialCalendarView.getCurrentlyShownMonth();
                binding5 = materialCalendarView.getBinding();
                TextView textView = binding5.d;
                titleFormatter = materialCalendarView.getTitleFormatter();
                textView.setText(titleFormatter.a(currentlyShownMonth));
                yyb dateSelectedListener = materialCalendarView.getDateSelectedListener();
                if (dateSelectedListener == null || (dg2Var = ((wg2) dateSelectedListener).a.b) == null) {
                    return;
                }
                Calendar calendar = Calendar.getInstance();
                calendar.getClass();
                currentlyShownMonth.b(calendar);
                MainActivity mainActivity3 = (MainActivity) ((bka) dg2Var).b;
                boolean z5 = MainActivity.n0;
                mainActivity3.V().o(calendar);
                return;
            default:
                c5e c5eVar = (c5e) this.b;
                c5eVar.d = i;
                Function2<Integer, Integer, Unit> onPageSelectedCallback = c5eVar.getOnPageSelectedCallback();
                if (onPageSelectedCallback != null) {
                    Integer valueOf = Integer.valueOf(i);
                    ViewPager2 viewPager2 = c5eVar.a;
                    if (viewPager2 == null) {
                        Intrinsics.i("viewPager");
                        throw null;
                    }
                    l adapter = viewPager2.getAdapter();
                    onPageSelectedCallback.invoke(valueOf, Integer.valueOf(adapter != null ? adapter.getItemCount() : 0));
                    return;
                }
                return;
        }
    }

    public /* synthetic */ j41(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }
}

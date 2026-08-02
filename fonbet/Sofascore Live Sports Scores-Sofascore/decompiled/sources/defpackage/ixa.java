package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.sofascore.model.mvvm.model.Tournament;
import com.sofascore.model.newNetwork.NewsProvider;
import com.sofascore.results.R;
import com.sofascore.results.calendar.CalendarView;
import com.sofascore.results.chat.ChatActivity;
import com.sofascore.results.league.LeagueActivity;
import com.sofascore.results.league.historical.LeagueHistoricalDataActivity;
import com.sofascore.results.main.MainActivity;
import com.sofascore.results.main.tutorial.PulsatingFrameLayout;
import com.sofascore.results.mma.fightNight.MmaFightNightActivity;
import com.sofascore.results.mma.mainScreen.MmaEventsWeekFragment;
import com.sofascore.results.onboarding.OnboardingViewModel;
import com.sofascore.results.onboarding.follow.model.OnboardingItemUiModel;
import com.sofascore.results.player.PlayerActivity;
import com.sofascore.results.pots.highestRated.POTSHighestRatedPlayersFragment;
import com.sofascore.results.pots.mostAwards.POTSMostAwardsFragment;
import com.sofascore.results.pots.mostAwards.bottomSheet.POTSPlayerAwardsBottomSheet;
import com.unity3d.ads.core.data.datasource.MaxAdRevenueListener;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.LoadResult;
import com.unity3d.ads.core.domain.LegacyLoadUseCase;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class ixa implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ixa(h6d h6dVar, d6d d6dVar, boolean z) {
        this.a = 19;
        this.b = h6dVar;
        this.c = d6dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.content.Context, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v9, types: [android.content.Intent] */
    /* JADX WARN: Type inference failed for: r6v0, types: [rq3] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r6v9 */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Unit loadSuccess$lambda$2;
        Unit loadFailure$lambda$3;
        String onMessageReceived$lambda$0;
        String str;
        int i = 16;
        int i2 = 1;
        int i3 = 3;
        switch (this.a) {
            case 0:
                ((Function1) this.b).invoke(Integer.valueOf(((znh) this.c).h()));
                return Unit.a;
            case 1:
                ?? r0 = (Context) this.b;
                sxa sxaVar = (sxa) this.c;
                int i4 = LeagueHistoricalDataActivity.Q;
                int i5 = sxaVar.a;
                rxa rxaVar = sxaVar.d;
                r6 = rxaVar != null ? Integer.valueOf(rxaVar.a) : 0;
                r0.getClass();
                ?? intent = new Intent((Context) r0, (Class<?>) LeagueHistoricalDataActivity.class);
                intent.putExtra("uniqueTournamentId", i5);
                intent.putExtra("seasonId", r6);
                r0.startActivity(intent);
                return Unit.a;
            case 2:
                Context context = (Context) this.b;
                lxe lxeVar = (lxe) this.c;
                int i6 = PlayerActivity.Z;
                Integer num = lxeVar.b;
                jle.q(context, num != null ? num.intValue() : -1, 0, null, zxe.c, false, null, null, 492);
                return Unit.a;
            case 3:
                Function2 function2 = (Function2) this.b;
                kza kzaVar = (kza) this.c;
                function2.invoke(Integer.valueOf(kzaVar.a), Integer.valueOf(kzaVar.c));
                return Unit.a;
            case 4:
                ((Function1) this.b).invoke((sza) this.c);
                return Unit.a;
            case 5:
                loadSuccess$lambda$2 = LegacyLoadUseCase.loadSuccess$lambda$2((LegacyLoadUseCase) this.b, (AdObject) this.c);
                return loadSuccess$lambda$2;
            case 6:
                loadFailure$lambda$3 = LegacyLoadUseCase.loadFailure$lambda$3((LegacyLoadUseCase) this.b, (LoadResult.Failure) this.c);
                return loadFailure$lambda$3;
            case 7:
                Function1 function1 = (Function1) this.b;
                n8b n8bVar = (n8b) this.c;
                if (function1 != null) {
                    function1.invoke(Integer.valueOf(n8bVar.a));
                }
                return Unit.a;
            case 8:
                MainActivity mainActivity = (MainActivity) this.b;
                djf djfVar = (djf) this.c;
                boolean z = MainActivity.n0;
                nv.z0(mainActivity, kv.CLICK, "quick_links", "main_screen");
                ((PulsatingFrameLayout) djfVar.c).b();
                int i7 = gjf.p;
                l4a.J(mainActivity, false);
                TypedValue typedValue = new TypedValue();
                gjf gjfVar = new gjf(mainActivity, mainActivity.getTheme().resolveAttribute(R.attr.sideSheetDialogTheme, typedValue, true) ? typedValue.resourceId : R.style.Theme_Material3_Light_SideSheetDialog);
                gjfVar.k = true;
                gjfVar.l = true;
                gjfVar.n = true;
                gjfVar.d().i(1);
                View inflate = LayoutInflater.from(mainActivity).inflate(R.layout.quick_links_content, (ViewGroup) null, false);
                int i8 = R.id.empty_state;
                LinearLayout linearLayout = (LinearLayout) nq8.B(R.id.empty_state, inflate);
                if (linearLayout != null) {
                    i8 = R.id.header;
                    View B = nq8.B(R.id.header, inflate);
                    if (B != null) {
                        int i9 = R.id.button;
                        ImageView imageView = (ImageView) nq8.B(R.id.button, B);
                        if (imageView != null) {
                            i9 = R.id.title;
                            if (((TextView) nq8.B(R.id.title, B)) != null) {
                                woc wocVar = new woc((ConstraintLayout) B, imageView);
                                RecyclerView recyclerView = (RecyclerView) nq8.B(R.id.recycler_view, inflate);
                                if (recyclerView != null) {
                                    LinearLayout linearLayout2 = (LinearLayout) inflate;
                                    z3f z3fVar = new z3f(linearLayout2, linearLayout, wocVar, recyclerView);
                                    imageView.setImageResource(R.drawable.ic_edit);
                                    gjfVar.setContentView(linearLayout2);
                                    FrameLayout frameLayout = gjfVar.j;
                                    if (frameLayout == null) {
                                        a70.r("Sheet view reference is null; sheet edge cannot be changed if the sheet view is null.");
                                        return null;
                                    }
                                    if (frameLayout.isLaidOut()) {
                                        a70.r("Sheet view has been laid out; sheet edge cannot be changed once the sheet has been laid out.");
                                        return null;
                                    }
                                    ViewGroup.LayoutParams layoutParams = gjfVar.j.getLayoutParams();
                                    if (layoutParams instanceof xs3) {
                                        ((xs3) layoutParams).c = 8388611;
                                        gjfVar.g();
                                    }
                                    gjfVar.setCanceledOnTouchOutside(true);
                                    gjfVar.setOnShowListener(new dn(gjfVar, 2));
                                    nm5 nm5Var = new nm5(mainActivity, i2);
                                    nm5Var.a.d = new pte(mainActivity, 9);
                                    z8e.b0(recyclerView, mainActivity, false, false, null, 30);
                                    recyclerView.setAdapter(nm5Var);
                                    nm5Var.F(gjfVar.i(imageView.isSelected()));
                                    linearLayout.setVisibility(nm5Var.getItemCount() != 0 ? 8 : 0);
                                    wrf.a(recyclerView, new mme(z3fVar, 14));
                                    imageView.setOnClickListener(new r2(imageView, nm5Var, gjfVar, z3fVar, 4));
                                    gjfVar.show();
                                    return Unit.a;
                                }
                                i8 = R.id.recycler_view;
                            }
                        }
                        yhk.s("Missing required view with ID: ".concat(B.getResources().getResourceName(i9)));
                        return null;
                    }
                }
                yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i8)));
                return null;
            case 9:
                MainActivity mainActivity2 = (MainActivity) this.b;
                CalendarView calendarView = (CalendarView) this.c;
                boolean z2 = MainActivity.n0;
                iqb W = mainActivity2.W();
                jqb jqbVar = jqb.n;
                if (W.D(jqbVar) != -1) {
                    mainActivity2.Z(jqbVar);
                } else {
                    a99 a99Var = LeagueActivity.h0;
                    Context context2 = calendarView.getContext();
                    context2.getClass();
                    a99.A(a99Var, context2, 16, 0, null, null, null, null, 4088);
                }
                return Unit.a;
            case 10:
                hvb hvbVar = (hvb) this.b;
                gvb gvbVar = (gvb) this.c;
                kx4 kx4Var = c6o.c0(gvbVar).y;
                gvbVar.s.h();
                return Integer.valueOf(hvbVar.b(kx4Var, gvbVar.t.h()));
            case 11:
                onMessageReceived$lambda$0 = MaxAdRevenueListener.onMessageReceived$lambda$0((MaxAdRevenueListener) this.b, (Bundle) this.c);
                return onMessageReceived$lambda$0;
            case 12:
                ((Function1) this.b).invoke(new w1c((r5c) this.c));
                return Unit.a;
            case 13:
                MmaEventsWeekFragment mmaEventsWeekFragment = (MmaEventsWeekFragment) this.b;
                LocalDate localDate = (LocalDate) this.c;
                emc emcVar = (emc) mmaEventsWeekFragment.s.getValue();
                localDate.getClass();
                emcVar.e.j(localDate);
                return Unit.a;
            case 14:
                MmaFightNightActivity mmaFightNightActivity = (MmaFightNightActivity) this.b;
                Tournament tournament = (Tournament) this.c;
                int i10 = MmaFightNightActivity.R;
                int i11 = ChatActivity.Z;
                uic.w(mmaFightNightActivity, tournament, null, 60);
                return Unit.a;
            case 15:
                dfh dfhVar = (dfh) this.b;
                ku3 ku3Var = (ku3) this.c;
                if (((Boolean) ((Function1) dfhVar.d.b).invoke(efh.c)).booleanValue()) {
                    xw3.L(ku3Var, null, null, new u87(dfhVar, r6, 11), 3);
                }
                return Boolean.TRUE;
            case 16:
                ((Function1) this.b).invoke(new aw7(((mvc) this.c).i.a, 22));
                return Unit.a;
            case 17:
                ((e1d) this.c).setValue((y1d) this.b);
                return Unit.a;
            case 18:
                String str2 = (String) this.b;
                x4d x4dVar = (x4d) this.c;
                ugj.a.getClass();
                if (x4dVar != null) {
                    try {
                        x4d x4dVar2 = x4dVar.j.get() ? x4dVar : null;
                        if (x4dVar2 != null) {
                            x4dVar2.c(str2);
                        }
                    } catch (CancellationException e) {
                        throw e;
                    } catch (Throwable unused) {
                    }
                }
                return Unit.a;
            case 19:
                h6d h6dVar = (h6d) this.b;
                d6d d6dVar = (d6d) this.c;
                d6dVar.getClass();
                synchronized (h6dVar.a) {
                    try {
                        fdi fdiVar = h6dVar.b;
                        Iterable iterable = (Iterable) fdiVar.getValue();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : iterable) {
                            if (Intrinsics.c((d6d) obj, d6dVar)) {
                                fdiVar.m(null, arrayList);
                            } else {
                                arrayList.add(obj);
                            }
                        }
                        fdiVar.m(null, arrayList);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return Unit.a;
            case 20:
                Function2 function22 = (Function2) this.b;
                ecd ecdVar = (ecd) this.c;
                if (function22 != null) {
                    Integer valueOf = Integer.valueOf(ecdVar.a);
                    NewsProvider newsProvider = ecdVar.g;
                    if (newsProvider == null || (str = newsProvider.getName()) == null) {
                        str = "";
                    }
                    function22.invoke(valueOf, str);
                }
                return Unit.a;
            case 21:
                l2a l2aVar = (l2a) this.b;
                gqf gqfVar = (gqf) this.c;
                if (((em0) l2aVar.b).get() == 0) {
                    gqfVar.invoke();
                }
                return Unit.a;
            case 22:
                ((Function1) this.b).invoke(new mfd((ghd) this.c));
                return Unit.a;
            case 23:
                return "Only found " + ((dsf) this.b).a + " digits in a row, but need to parse " + ((ajd) this.c).b();
            case 24:
                return aik.w((String) this.b, nii.i, new SerialDescriptor[0], new mnc((qq3) this.c, i));
            case 25:
                OnboardingViewModel onboardingViewModel = (OnboardingViewModel) this.b;
                c6d c6dVar = (c6d) this.c;
                onboardingViewModel.x(crd.a);
                o13.E(c6dVar);
                return Unit.a;
            case 26:
                ((Function1) this.b).invoke((OnboardingItemUiModel) this.c);
                return Unit.a;
            case 27:
                osa osaVar = (osa) this.b;
                POTSHighestRatedPlayersFragment pOTSHighestRatedPlayersFragment = (POTSHighestRatedPlayersFragment) this.c;
                lk0 lk0Var = osaVar.c;
                lk0Var.getClass();
                if (Build.ID != null) {
                    Log.isLoggable("Paging", 3);
                }
                lk0Var.c.k();
                pOTSHighestRatedPlayersFragment.D().t(t0e.a);
                return Unit.a;
            case 28:
                osa osaVar2 = (osa) this.b;
                POTSMostAwardsFragment pOTSMostAwardsFragment = (POTSMostAwardsFragment) this.c;
                lk0 lk0Var2 = osaVar2.c;
                lk0Var2.getClass();
                if (Build.ID != null) {
                    Log.isLoggable("Paging", 3);
                }
                lk0Var2.c.k();
                m2e m2eVar = (m2e) pOTSMostAwardsFragment.r.getValue();
                xw3.L(un0.z(m2eVar), null, null, new i2e(m2eVar, r6, i2), 3);
                return Unit.a;
            default:
                Context context3 = (Context) this.b;
                d2e d2eVar = (d2e) this.c;
                int i12 = d2eVar.a;
                String str3 = d2eVar.b;
                str3.getClass();
                POTSPlayerAwardsBottomSheet pOTSPlayerAwardsBottomSheet = new POTSPlayerAwardsBottomSheet();
                pOTSPlayerAwardsBottomSheet.setArguments(fz8.C(fz8.D(i12, "PLAYER_ID"), fz8.H("PLAYER_NAME", str3)));
                context3.getClass();
                if (context3 instanceof csk) {
                    context3 = ((csk) context3).getBaseContext();
                }
                AppCompatActivity appCompatActivity = context3 instanceof AppCompatActivity ? (AppCompatActivity) context3 : null;
                if (appCompatActivity != null) {
                    wca.x(appCompatActivity.getLifecycle()).b(new r1(pOTSPlayerAwardsBottomSheet, appCompatActivity, r6, i3));
                }
                return Unit.a;
        }
    }

    public /* synthetic */ ixa(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}

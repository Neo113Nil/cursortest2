package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.s;
import androidx.navigation.fragment.NavHostFragment;
import com.google.android.material.imageview.ShapeableImageView;
import com.sofascore.model.mvvm.model.Gender;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.results.R;
import com.sofascore.results.main.matches.redesign.filter.MatchesFilterBottomSheetDialog;
import com.sofascore.results.media.highlights.MediaHighlightHeaderView;
import com.sofascore.results.player.statistics.career.model.PickerItem;
import com.sofascore.results.pots.highestRated.bottomSheet.POTSHighestRatedPlayersFilterBottomSheet;
import com.sofascore.results.pots.topLeagues.POTSTopLeaguesFragment;
import com.sofascore.results.pots.topLeagues.bottomSheet.POTSLeagueTopPlayersBottomSheet;
import com.sofascore.results.tv.fragments.NewChannelsDialog;
import com.sofascore.results.view.InformationView;
import com.sofascore.results.view.follownotification.NotificationsActionButton;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.collections.a;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KClass;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class xxb implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xxb(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [rq3] */
    /* JADX WARN: Type inference failed for: r4v6, types: [android.os.Bundle] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Gender gender;
        r0e r0eVar;
        String str;
        String str2;
        SharedPreferences d;
        int i = this.a;
        r4 = null;
        r4 = null;
        String str3 = null;
        Object obj = this.b;
        switch (i) {
            case 0:
                return Boolean.valueOf(((MatchesFilterBottomSheetDialog) obj).requireArguments().getBoolean("DISABLE_STATUS_FILTER"));
            case 1:
                MediaHighlightHeaderView mediaHighlightHeaderView = (MediaHighlightHeaderView) obj;
                String str4 = mediaHighlightHeaderView.g;
                if (str4 != null) {
                    Context context = mediaHighlightHeaderView.getContext();
                    context.getClass();
                    p4h.w(context, str4);
                }
                return Unit.a;
            case 2:
                Long l = ((nmc) obj).g;
                if (l != null) {
                    return vxd.o(Instant.ofEpochSecond(l.longValue()));
                }
                return null;
            case 3:
                ((lrc) obj).j();
                return Unit.a;
            case 4:
                View root = ((zoc) obj).getRoot();
                int i2 = R.id.button_future;
                ImageView imageView = (ImageView) nq8.B(R.id.button_future, root);
                if (imageView != null) {
                    i2 = R.id.button_past;
                    ImageView imageView2 = (ImageView) nq8.B(R.id.button_past, root);
                    if (imageView2 != null) {
                        i2 = R.id.month_spinner;
                        ComposeView composeView = (ComposeView) nq8.B(R.id.month_spinner, root);
                        if (composeView != null) {
                            return new apc((LinearLayout) root, imageView, imageView2, composeView);
                        }
                    }
                }
                yhk.s("Missing required view with ID: ".concat(root.getResources().getResourceName(i2)));
                return null;
            case 5:
                Function0 function0 = ((kqc) obj).e;
                if (function0 != null) {
                    function0.invoke();
                }
                return Unit.a;
            case 6:
                ym6 ym6Var = new ym6();
                ym6Var.c = 300L;
                ym6Var.d = new AccelerateDecelerateInterpolator();
                dd ddVar = ((prc) obj).A;
                hxj.a(((frc) ddVar.d).a, ym6Var);
                hxj.a(((frc) ddVar.c).a, ym6Var);
                return Unit.a;
            case 7:
                ym6 ym6Var2 = new ym6();
                ym6Var2.c = 300L;
                ym6Var2.d = new AccelerateDecelerateInterpolator();
                hxj.a(((frc) ((qrc) obj).t.c).a, ym6Var2);
                return Unit.a;
            case 8:
                ((rsc) obj).e.invoke();
                return Unit.a;
            case 9:
                ((q55) obj).d();
                return Unit.a;
            case 10:
                e4e e4eVar = (e4e) CollectionsKt.firstOrNull(((m78) ((b10) ((yyc) obj).b.b).c).b());
                if (e4eVar == null || !(e4eVar instanceof z3e)) {
                    return null;
                }
                z3e z3eVar = (z3e) e4eVar;
                if (z3eVar.a == sfb.a) {
                    return z3eVar;
                }
                return null;
            case 11:
                f6d f6dVar = ((d6d) obj).h;
                if (!f6dVar.i) {
                    a70.r("You cannot access the NavBackStackEntry's SavedStateHandle until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
                    return null;
                }
                if (f6dVar.j.i == e6b.a) {
                    a70.r("You cannot access the NavBackStackEntry's SavedStateHandle after the NavBackStackEntry is destroyed.");
                    return null;
                }
                d6d d6dVar = f6dVar.a;
                qtk qtkVar = (qtk) f6dVar.m.getValue();
                ly3 r = ufa.r(d6dVar);
                qtkVar.getClass();
                r.getClass();
                g7h g7hVar = new g7h(d6dVar.getViewModelStore(), qtkVar, r);
                KClass orCreateKotlinClass = duf.a.getOrCreateKotlinClass(e6d.class);
                orCreateKotlinClass.getClass();
                String qualifiedName = orCreateKotlinClass.getQualifiedName();
                if (qualifiedName != null) {
                    return ((e6d) g7hVar.u("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(qualifiedName), orCreateKotlinClass)).b;
                }
                a70.p("Local and anonymous classes can not be ViewModels");
                return null;
            case 12:
                NavHostFragment navHostFragment = (NavHostFragment) obj;
                Context context2 = navHostFragment.getContext();
                if (context2 == null) {
                    a70.r("NavController cannot be created before the fragment is attached");
                    return null;
                }
                k7d k7dVar = new k7d(context2);
                mqi mqiVar = k7dVar.h;
                k6d k6dVar = k7dVar.b;
                k7dVar.g(navHostFragment);
                stk viewModelStore = navHostFragment.getViewModelStore();
                viewModelStore.getClass();
                k7dVar.h(viewModelStore);
                z8d z8dVar = k6dVar.s;
                Context requireContext = navHostFragment.requireContext();
                requireContext.getClass();
                s childFragmentManager = navHostFragment.getChildFragmentManager();
                childFragmentManager.getClass();
                z8dVar.a(new u15(requireContext, childFragmentManager));
                z8d z8dVar2 = k6dVar.s;
                Context requireContext2 = navHostFragment.requireContext();
                requireContext2.getClass();
                s childFragmentManager2 = navHostFragment.getChildFragmentManager();
                childFragmentManager2.getClass();
                int id = navHostFragment.getId();
                if (id == 0 || id == -1) {
                    id = R.id.nav_host_fragment_container;
                }
                z8dVar2.a(new ip8(requireContext2, childFragmentManager2, id));
                Bundle a = navHostFragment.getSavedStateRegistry().a("android-support-nav:fragment:navControllerState");
                if (a != null) {
                    k7dVar.e(a);
                }
                navHostFragment.getSavedStateRegistry().c("android-support-nav:fragment:navControllerState", new qb3(k7dVar, 4));
                Bundle a2 = navHostFragment.getSavedStateRegistry().a("android-support-nav:fragment:graphId");
                if (a2 != null) {
                    navHostFragment.c = a2.getInt("android-support-nav:fragment:graphId");
                }
                navHostFragment.getSavedStateRegistry().c("android-support-nav:fragment:graphId", new qb3(navHostFragment, 5));
                int i3 = navHostFragment.c;
                if (i3 != 0) {
                    k6dVar.r(((q7d) mqiVar.getValue()).b(i3), null);
                } else {
                    Bundle arguments = navHostFragment.getArguments();
                    int i4 = arguments != null ? arguments.getInt("android-support-nav:fragment:graphId") : 0;
                    r4 = arguments != null ? arguments.getBundle("android-support-nav:fragment:startDestinationArgs") : 0;
                    if (i4 != 0) {
                        k6dVar.r(((q7d) mqiVar.getValue()).b(i4), r4);
                    }
                }
                return k7dVar;
            case 13:
                return (sof) ((apf) obj).a.e.getValue();
            case 14:
                Context requireContext3 = ((NewChannelsDialog) obj).requireContext();
                requireContext3.getClass();
                return new pbd(requireContext3);
            case 15:
                int i5 = NotificationsActionButton.g;
                ((NotificationsActionButton) obj).setState(jb.Inactive);
                return Unit.a;
            case 16:
                return "Unexpected end of input: yet to parse ".concat(((ajd) obj).b());
            case 17:
                View root2 = ((bld) obj).getRoot();
                int i6 = R.id.base_odds_background;
                ShapeableImageView shapeableImageView = (ShapeableImageView) nq8.B(R.id.base_odds_background, root2);
                if (shapeableImageView != null) {
                    FrameLayout frameLayout = (FrameLayout) root2;
                    i6 = R.id.odds_button_container;
                    ConstraintLayout constraintLayout = (ConstraintLayout) nq8.B(R.id.odds_button_container, root2);
                    if (constraintLayout != null) {
                        i6 = R.id.odds_button_text;
                        TextView textView = (TextView) nq8.B(R.id.odds_button_text, root2);
                        if (textView != null) {
                            i6 = R.id.odds_image;
                            if (((ImageView) nq8.B(R.id.odds_image, root2)) != null) {
                                i6 = R.id.odds_provider_image;
                                ImageView imageView3 = (ImageView) nq8.B(R.id.odds_provider_image, root2);
                                if (imageView3 != null) {
                                    i6 = R.id.overlay;
                                    View B = nq8.B(R.id.overlay, root2);
                                    if (B != null) {
                                        return new cld(frameLayout, shapeableImageView, frameLayout, constraintLayout, textView, imageView3, B);
                                    }
                                }
                            }
                        }
                    }
                }
                yhk.s("Missing required view with ID: ".concat(root2.getResources().getResourceName(i6)));
                return null;
            case 18:
                return new gh2((yg2) ((e6g) obj).invoke());
            case 19:
                return new spd((upd) obj);
            case 20:
                POTSHighestRatedPlayersFilterBottomSheet pOTSHighestRatedPlayersFilterBottomSheet = (POTSHighestRatedPlayersFilterBottomSheet) obj;
                v1e v1eVar = (v1e) pOTSHighestRatedPlayersFilterBottomSheet.C.getValue();
                b1e b1eVar = (b1e) pOTSHighestRatedPlayersFilterBottomSheet.D.getValue();
                r0e r0eVar2 = (r0e) b1eVar.l().a();
                c1e c1eVar = r0eVar2 != null ? (c1e) r0eVar2.a.b : null;
                r0e r0eVar3 = (r0e) b1eVar.l().a();
                d1e d1eVar = r0eVar3 != null ? (d1e) r0eVar3.b.b : null;
                r0e r0eVar4 = (r0e) b1eVar.l().a();
                if (r0eVar4 != null && (str2 = r0eVar4.c.d) != null) {
                    if (str2.equals("All")) {
                        str2 = null;
                    }
                    if (str2 != null) {
                        gender = Gender.INSTANCE.getFromValue(str2);
                        r0eVar = (r0e) b1eVar.l().a();
                        if (r0eVar != null && (str = r0eVar.d.d) != null && !str.equals("All")) {
                            str3 = str;
                        }
                        v1eVar.t(new s0e(new e1e(c1eVar, d1eVar, gender, str3)));
                        pOTSHighestRatedPlayersFilterBottomSheet.j();
                        return Unit.a;
                    }
                }
                gender = null;
                r0eVar = (r0e) b1eVar.l().a();
                if (r0eVar != null) {
                    str3 = str;
                }
                v1eVar.t(new s0e(new e1e(c1eVar, d1eVar, gender, str3)));
                pOTSHighestRatedPlayersFilterBottomSheet.j();
                return Unit.a;
            case 21:
                String string = ((POTSLeagueTopPlayersBottomSheet) obj).requireArguments().getString("UNIQUE_TOURNAMENT_NAME");
                return string == null ? "" : string;
            case 22:
                e3e e3eVar = (e3e) ((POTSTopLeaguesFragment) obj).r.getValue();
                u2e u2eVar = u2e.a;
                if (u2eVar.equals(u2eVar)) {
                    ynb.m(e3eVar, new r3(e3eVar, r4, 18));
                }
                return Unit.a;
            case 23:
                aeh aehVar = ((lk0) obj).l;
                Unit unit = Unit.a;
                aehVar.b(unit);
                return unit;
            case 24:
                rae raeVar = (rae) obj;
                return raeVar.a.open(raeVar.b);
            case 25:
                PickerItem.Category category = (PickerItem.Category) obj;
                xbb b = a.b();
                ArrayList arrayList = category.b;
                wk2 wk2Var = category.a;
                if (arrayList.size() > 1) {
                    b.add(new PickerItem.Tournament(wk2Var, null, Boolean.FALSE));
                }
                nh0 X0 = CollectionsKt.X0(arrayList);
                ArrayList arrayList2 = new ArrayList(k13.r(X0, 10));
                Iterator it = X0.iterator();
                while (true) {
                    sc5 sc5Var = (sc5) it;
                    if (!sc5Var.b.hasNext()) {
                        b.addAll(arrayList2);
                        return a.a(b);
                    }
                    IndexedValue indexedValue = (IndexedValue) sc5Var.next();
                    arrayList2.add(new PickerItem.Tournament(wk2Var, (UniqueTournament) indexedValue.b, Boolean.valueOf(indexedValue.a == arrayList.size() - 1)));
                }
            case 26:
                return lnb.q(new StringBuilder("Unexpected end of input: yet to parse '"), ((zhe) obj).a, '\'');
            case 27:
                return LayoutInflater.from(((qme) obj).a);
            case 28:
                InformationView informationView = (InformationView) obj;
                Context context3 = informationView.getContext();
                context3.getClass();
                SharedPreferences sharedPreferences = uic.j;
                if (sharedPreferences == null) {
                    Context applicationContext = context3.getApplicationContext();
                    synchronized (uic.i) {
                        d = a5f.d(applicationContext);
                        uic.j = d;
                    }
                    d.getClass();
                    sharedPreferences = d;
                }
                SharedPreferences.Editor i7 = dmi.i(sharedPreferences, "PREF_PLAYER_LAST_RATINGS_INFO", false);
                Unit unit2 = Unit.a;
                i7.apply();
                informationView.setVisibility(8);
                return Unit.a;
            default:
                View root3 = ((hse) obj).getRoot();
                int i8 = R.id.average_rating_line;
                View B2 = nq8.B(R.id.average_rating_line, root3);
                if (B2 != null) {
                    i8 = R.id.button_next;
                    ImageView imageView4 = (ImageView) nq8.B(R.id.button_next, root3);
                    if (imageView4 != null) {
                        i8 = R.id.button_previous;
                        ImageView imageView5 = (ImageView) nq8.B(R.id.button_previous, root3);
                        if (imageView5 != null) {
                            i8 = R.id.graph_background;
                            View B3 = nq8.B(R.id.graph_background, root3);
                            if (B3 != null) {
                                i8 = R.id.graph_container;
                                LinearLayout linearLayout = (LinearLayout) nq8.B(R.id.graph_container, root3);
                                if (linearLayout != null) {
                                    i8 = R.id.info_container;
                                    InformationView informationView2 = (InformationView) nq8.B(R.id.info_container, root3);
                                    if (informationView2 != null) {
                                        i8 = R.id.rating_layout;
                                        View B4 = nq8.B(R.id.rating_layout, root3);
                                        if (B4 != null) {
                                            return new ise((FrameLayout) root3, B2, imageView4, imageView5, B3, linearLayout, informationView2, hei.a(B4));
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                yhk.s("Missing required view with ID: ".concat(root3.getResources().getResourceName(i8)));
                return null;
        }
    }
}

package defpackage;

import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.FragmentActivity;
import com.sofascore.model.fantasy.FantasyCompetitionType;
import com.sofascore.model.network.response.SearchResponseKt;
import com.sofascore.results.fantasy.ui.model.FantasyRoundPlayerUiModel;
import com.sofascore.results.fantasy.walkthrough.createteam.FantasyWalkthroughCreateTeamFragment;
import com.sofascore.results.fantasy.walkthrough.createteam.player.FantasyFootballPlayerWalkthroughBottomSheet;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KFunction;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class cp7 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ FantasyWalkthroughCreateTeamFragment b;
    public final /* synthetic */ ComposeView c;

    public /* synthetic */ cp7(FantasyWalkthroughCreateTeamFragment fantasyWalkthroughCreateTeamFragment, ComposeView composeView, int i) {
        this.a = i;
        this.b = fantasyWalkthroughCreateTeamFragment;
        this.c = composeView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        zrh zrhVar;
        int i = this.a;
        final FantasyWalkthroughCreateTeamFragment fantasyWalkthroughCreateTeamFragment = this.b;
        Object[] objArr = 0;
        int i2 = 2;
        ComposeView composeView = this.c;
        final int i3 = 1;
        switch (i) {
            case 0:
                of3 of3Var = (of3) obj;
                int intValue = ((Integer) obj2).intValue();
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                    haa.f(yqo.H(966172965, av8Var, new cp7(fantasyWalkthroughCreateTeamFragment, composeView, i3)), av8Var, 6);
                } else {
                    av8Var.W();
                }
                break;
            case 1:
                joa joaVar = fantasyWalkthroughCreateTeamFragment.t;
                of3 of3Var2 = (of3) obj;
                int intValue2 = ((Integer) obj2).intValue();
                av8 av8Var2 = (av8) of3Var2;
                if (av8Var2.T(intValue2 & 1, (intValue2 & 3) != 2)) {
                    vp7 C = fantasyWalkthroughCreateTeamFragment.C();
                    ds8 ds8Var = (ds8) joaVar.getValue();
                    boolean i4 = av8Var2.i(ds8Var);
                    Object O = av8Var2.O();
                    a99 a99Var = nf3.a;
                    if (i4 || O == a99Var) {
                        O = new av6(0, ds8Var, ds8.class, "show", "show()V", 0, 25);
                        av8Var2.n0(O);
                    }
                    KFunction kFunction = (KFunction) O;
                    ds8 ds8Var2 = (ds8) joaVar.getValue();
                    boolean i5 = av8Var2.i(ds8Var2);
                    Object O2 = av8Var2.O();
                    if (i5 || O2 == a99Var) {
                        O2 = new av6(0, ds8Var2, ds8.class, "dismiss", "dismiss()V", 0, 26);
                        av8Var2.n0(O2);
                    }
                    KFunction kFunction2 = (KFunction) O2;
                    boolean i6 = av8Var2.i(fantasyWalkthroughCreateTeamFragment) | av8Var2.i(composeView);
                    Object O3 = av8Var2.O();
                    if (i6 || O3 == a99Var) {
                        O3 = new cp7(fantasyWalkthroughCreateTeamFragment, composeView, i2);
                        av8Var2.n0(O3);
                    }
                    Function2 function2 = (Function2) O3;
                    boolean i7 = av8Var2.i(fantasyWalkthroughCreateTeamFragment);
                    Object O4 = av8Var2.O();
                    if (i7 || O4 == a99Var) {
                        final Object[] objArr2 = objArr == true ? 1 : 0;
                        O4 = new Function1() { // from class: dp7
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj3) {
                                int i8 = objArr2;
                                FantasyWalkthroughCreateTeamFragment fantasyWalkthroughCreateTeamFragment2 = fantasyWalkthroughCreateTeamFragment;
                                switch (i8) {
                                    case 0:
                                        FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel = (FantasyRoundPlayerUiModel) obj3;
                                        fantasyRoundPlayerUiModel.getClass();
                                        FragmentActivity requireActivity = fantasyWalkthroughCreateTeamFragment2.requireActivity();
                                        requireActivity.getClass();
                                        int i9 = fantasyWalkthroughCreateTeamFragment2.C().k().a.n;
                                        int i10 = fantasyWalkthroughCreateTeamFragment2.C().k().a.c;
                                        FantasyCompetitionType fantasyCompetitionType = fantasyWalkthroughCreateTeamFragment2.C().k().a.d;
                                        boolean z = fantasyWalkthroughCreateTeamFragment2.C().k().a.A;
                                        fantasyCompetitionType.getClass();
                                        FantasyFootballPlayerWalkthroughBottomSheet fantasyFootballPlayerWalkthroughBottomSheet = new FantasyFootballPlayerWalkthroughBottomSheet();
                                        fantasyFootballPlayerWalkthroughBottomSheet.setArguments(fz8.C(fz8.F(SearchResponseKt.PLAYER_ENTITY, fantasyRoundPlayerUiModel), fz8.D(i10, "competitionId"), fz8.G("competitionType", fantasyCompetitionType), fz8.D(i9, "roundId"), fz8.J("tripleCaptain", false), fz8.J("assetsRestricted", z)));
                                        AppCompatActivity appCompatActivity = requireActivity instanceof AppCompatActivity ? (AppCompatActivity) requireActivity : null;
                                        if (appCompatActivity != null) {
                                            wca.x(appCompatActivity.getLifecycle()).b(new r1(fantasyFootballPlayerWalkthroughBottomSheet, appCompatActivity, null, 3));
                                        }
                                        break;
                                    default:
                                        oz6 oz6Var = (oz6) obj3;
                                        oz6Var.getClass();
                                        fantasyWalkthroughCreateTeamFragment2.D(oz6Var.getA().b);
                                        break;
                                }
                                return Unit.a;
                            }
                        };
                        av8Var2.n0(O4);
                    }
                    Function1 function1 = (Function1) O4;
                    boolean i8 = av8Var2.i(fantasyWalkthroughCreateTeamFragment);
                    Object O5 = av8Var2.O();
                    if (i8 || O5 == a99Var) {
                        O5 = new Function1() { // from class: dp7
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj3) {
                                int i82 = i3;
                                FantasyWalkthroughCreateTeamFragment fantasyWalkthroughCreateTeamFragment2 = fantasyWalkthroughCreateTeamFragment;
                                switch (i82) {
                                    case 0:
                                        FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel = (FantasyRoundPlayerUiModel) obj3;
                                        fantasyRoundPlayerUiModel.getClass();
                                        FragmentActivity requireActivity = fantasyWalkthroughCreateTeamFragment2.requireActivity();
                                        requireActivity.getClass();
                                        int i9 = fantasyWalkthroughCreateTeamFragment2.C().k().a.n;
                                        int i10 = fantasyWalkthroughCreateTeamFragment2.C().k().a.c;
                                        FantasyCompetitionType fantasyCompetitionType = fantasyWalkthroughCreateTeamFragment2.C().k().a.d;
                                        boolean z = fantasyWalkthroughCreateTeamFragment2.C().k().a.A;
                                        fantasyCompetitionType.getClass();
                                        FantasyFootballPlayerWalkthroughBottomSheet fantasyFootballPlayerWalkthroughBottomSheet = new FantasyFootballPlayerWalkthroughBottomSheet();
                                        fantasyFootballPlayerWalkthroughBottomSheet.setArguments(fz8.C(fz8.F(SearchResponseKt.PLAYER_ENTITY, fantasyRoundPlayerUiModel), fz8.D(i10, "competitionId"), fz8.G("competitionType", fantasyCompetitionType), fz8.D(i9, "roundId"), fz8.J("tripleCaptain", false), fz8.J("assetsRestricted", z)));
                                        AppCompatActivity appCompatActivity = requireActivity instanceof AppCompatActivity ? (AppCompatActivity) requireActivity : null;
                                        if (appCompatActivity != null) {
                                            wca.x(appCompatActivity.getLifecycle()).b(new r1(fantasyFootballPlayerWalkthroughBottomSheet, appCompatActivity, null, 3));
                                        }
                                        break;
                                    default:
                                        oz6 oz6Var = (oz6) obj3;
                                        oz6Var.getClass();
                                        fantasyWalkthroughCreateTeamFragment2.D(oz6Var.getA().b);
                                        break;
                                }
                                return Unit.a;
                            }
                        };
                        av8Var2.n0(O5);
                    }
                    yso.l(C, function2, function1, (Function1) O5, (Function0) kFunction, (Function0) kFunction2, av8Var2, 0);
                } else {
                    av8Var2.W();
                }
                break;
            default:
                List list = (List) obj;
                list.getClass();
                FantasyWalkthroughCreateTeamFragment fantasyWalkthroughCreateTeamFragment2 = this.b;
                l97 l97Var = new l97(3, composeView, list, fantasyWalkthroughCreateTeamFragment2);
                otk otkVar = fantasyWalkthroughCreateTeamFragment2.s;
                pn3 pn3Var = (pn3) ((g9a) otkVar.getValue()).h.d();
                if (pn3Var == null || (zrhVar = (zrh) pn3Var.a()) == null) {
                    l97Var.invoke();
                } else {
                    WeakReference weakReference = new WeakReference(fantasyWalkthroughCreateTeamFragment2.requireActivity());
                    g6b lifecycle = fantasyWalkthroughCreateTeamFragment2.getLifecycle();
                    lifecycle.getClass();
                    if (lifecycle.b().compareTo(e6b.e) >= 0) {
                        ((g9a) otkVar.getValue()).n(zrhVar, l97Var);
                        FragmentActivity fragmentActivity = (FragmentActivity) weakReference.get();
                        if (fragmentActivity != null) {
                            zrhVar.f(fragmentActivity);
                        }
                    } else {
                        lifecycle.a(new ep7(lifecycle, fantasyWalkthroughCreateTeamFragment2, zrhVar, l97Var, weakReference));
                    }
                }
                break;
        }
        return Unit.a;
    }
}

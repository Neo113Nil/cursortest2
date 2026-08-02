package defpackage;

import android.content.Context;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import com.sofascore.model.branding.BrandLocation;
import com.sofascore.model.branding.BrandType;
import com.sofascore.model.chat.TeamOfTheRoundChatInterface;
import com.sofascore.model.mvvm.model.TournamentRoundWrapper;
import com.sofascore.model.newNetwork.TeamOfTheWeekResponse;
import com.sofascore.results.R;
import com.sofascore.results.league.fragment.details.compose.totr.share.TotrSharePayload;
import com.sofascore.results.view.branding.BrandingLayout;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class dyi extends h6b {
    public static final /* synthetic */ int w = 0;
    public final hcb d;
    public boolean e;
    public String f;
    public int g;
    public String h;
    public int i;
    public String j;
    public String k;
    public boolean l;
    public boolean m;
    public boolean n;
    public List o;
    public TournamentRoundWrapper p;
    public TeamOfTheWeekResponse q;
    public nn6 r;
    public final fdi s;
    public Function1 t;
    public Function1 u;
    public Function1 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dyi(Context context) {
        super(context, null, 0);
        context.getClass();
        View root = getRoot();
        ComposeView composeView = (ComposeView) nq8.B(R.id.totr_compose_view, root);
        if (composeView == null) {
            yhk.s("Missing required view with ID: ".concat(root.getResources().getResourceName(R.id.totr_compose_view)));
            throw null;
        }
        this.d = new hcb((BrandingLayout) root, composeView);
        this.f = "";
        this.h = "";
        this.j = "";
        this.k = "";
        this.o = km5.a;
        rlh rlhVar = rlh.b;
        this.s = gdi.a(new xxi("", 0, rlhVar, null, "", null, "", null, false, false, null, false, rlhVar));
        setVisibility(8);
        composeView.setContent(new tc3(-1412524676, new ayi(this, 0), true));
    }

    @Override // defpackage.o8
    public int getLayoutId() {
        return R.layout.team_of_the_week;
    }

    @Nullable
    public final Function1<TeamOfTheRoundChatInterface, Unit> getOnChatClickCallback() {
        return this.v;
    }

    @Nullable
    public final Function1<Integer, Unit> getOnItemSelectedCallback() {
        return this.t;
    }

    @Nullable
    public final Function1<TotrSharePayload, Unit> getOnShareClickCallback() {
        return this.u;
    }

    public final void l(Integer num, String str, List list, Integer num2, int i, boolean z, String str2, String str3) {
        nn6 nn6Var;
        Object obj;
        Function1 function1;
        list.getClass();
        if (this.e) {
            return;
        }
        this.e = true;
        if (str == null) {
            str = "";
        }
        this.f = str;
        this.g = num != null ? num.intValue() : 0;
        this.i = i;
        this.j = str2;
        this.k = str3;
        this.n = z;
        this.o = list;
        Iterator it = list.iterator();
        while (true) {
            nn6Var = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            int id = ((TournamentRoundWrapper) obj).getId();
            if (num2 != null && id == num2.intValue()) {
                break;
            }
        }
        TournamentRoundWrapper tournamentRoundWrapper = (TournamentRoundWrapper) obj;
        if (tournamentRoundWrapper == null) {
            tournamentRoundWrapper = (TournamentRoundWrapper) CollectionsKt.firstOrNull(list);
        }
        this.p = tournamentRoundWrapper;
        if (this.n && tournamentRoundWrapper != null) {
            nn6Var = qqj.a(tournamentRoundWrapper);
        }
        this.r = nn6Var;
        o();
        TournamentRoundWrapper tournamentRoundWrapper2 = this.p;
        if (tournamentRoundWrapper2 != null && (function1 = this.t) != null) {
            function1.invoke(Integer.valueOf(tournamentRoundWrapper2.getId()));
        }
        BrandingLayout brandingLayout = (BrandingLayout) this.d.b;
        brandingLayout.getClass();
        Context context = getContext();
        context.getClass();
        brandingLayout.a(ccd.B(context, num, BrandLocation.TeamOfTheWeek), BrandLocation.LeagueScreen, BrandType.STRIPE, num, true);
    }

    public final void n() {
        Object obj;
        xxi xxiVar = (xxi) this.s.getValue();
        TournamentRoundWrapper tournamentRoundWrapper = this.p;
        if (tournamentRoundWrapper == null) {
            return;
        }
        Iterator<E> it = xxiVar.c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((k7g) obj).a.getId() == tournamentRoundWrapper.getId()) {
                    break;
                }
            }
        }
        k7g k7gVar = (k7g) obj;
        String str = k7gVar != null ? k7gVar.b : null;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        int i = this.g;
        int i2 = this.i;
        int id = tournamentRoundWrapper.getId();
        pff pffVar = rqj.a;
        boolean z = this.l || this.m;
        pffVar.getClass();
        String a = pff.a(tournamentRoundWrapper, z);
        nn6 nn6Var = this.r;
        TeamOfTheRoundChatInterface teamOfTheRoundChatInterface = new TeamOfTheRoundChatInterface(i, i2, id, str2, a, nn6Var != null ? nn6Var.c : null, nn6Var != null ? nn6Var.b : null, nn6Var != null ? Integer.valueOf(nn6Var.a) : null);
        Function1 function1 = this.v;
        if (function1 != null) {
            function1.invoke(teamOfTheRoundChatInterface);
        }
    }

    public final void o() {
        fdi fdiVar;
        Object value;
        Context context;
        do {
            fdiVar = this.s;
            value = fdiVar.getValue();
            context = getContext();
            context.getClass();
        } while (!fdiVar.k(value, qha.F(context, this.f, this.g, this.o, this.p, this.q, this.l, this.m, this.n, this.r, false, null, null)));
    }

    public final void setOnChatClickCallback(@Nullable Function1<? super TeamOfTheRoundChatInterface, Unit> function1) {
        this.v = function1;
    }

    public final void setOnItemSelectedCallback(@Nullable Function1<? super Integer, Unit> function1) {
        this.t = function1;
    }

    public final void setOnShareClickCallback(@Nullable Function1<? super TotrSharePayload, Unit> function1) {
        this.u = function1;
    }
}

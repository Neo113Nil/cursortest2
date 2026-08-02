package defpackage;

import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sofascore.model.mvvm.model.CricketEvent;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.network.response.Odds;
import com.sofascore.model.network.response.WinningOddsResponse;
import com.sofascore.model.odds.OddsChoice;
import com.sofascore.model.odds.ProviderOdds;
import com.sofascore.results.R;
import com.sofascore.results.event.matches.view.WinningOddsView;
import com.sofascore.results.view.BellButton;
import com.sofascore.results.view.WDLView;
import com.vungle.ads.internal.protos.Sdk;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public class k04 extends p8 {
    public final /* synthetic */ int c = 1;
    public int d;
    public final krk e;
    public final Object f;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public k04(l0k l0kVar, z3f z3fVar) {
        super(r2);
        this.f = l0kVar;
        LinearLayout linearLayout = (LinearLayout) z3fVar.b;
        linearLayout.getClass();
        this.e = z3fVar;
        LinearLayout linearLayout2 = (LinearLayout) ((zl) z3fVar.c).f;
        linearLayout2.getClass();
        aba.t(linearLayout2);
        linearLayout.getClass();
        sea.v(linearLayout, true, true, 0, 0, 0, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
        ((WinningOddsView) z3fVar.d).setTeamsRowClickListener(new ivj(1, this, l0kVar));
    }

    @Override // defpackage.p8
    public void a(Object obj) {
        switch (this.c) {
            case 0:
                obj.getClass();
                if (obj instanceof scb) {
                    inb.o((BellButton) ((nr1) ((p12) this.e).d).d, (scb) obj);
                    break;
                }
                break;
            default:
                super.a(obj);
                break;
        }
    }

    @Override // defpackage.p8
    public final void b(int i, int i2, Object obj) {
        Team team;
        int i3 = this.c;
        Object obj2 = this.f;
        Integer num = null;
        krk krkVar = this.e;
        switch (i3) {
            case 0:
                j04 j04Var = (j04) obj;
                j04Var.getClass();
                p12 p12Var = (p12) krkVar;
                ImageView imageView = (ImageView) p12Var.i;
                boolean z = j04Var.m;
                CricketEvent cricketEvent = j04Var.O;
                ImageView imageView2 = (ImageView) p12Var.e;
                if (z) {
                    imageView2.setVisibility(0);
                    as9.o(imageView2, Event.getHomeTeam$default(cricketEvent, null, 1, null).getId());
                    imageView.setVisibility(0);
                    as9.o(imageView, Event.getAwayTeam$default(cricketEvent, null, 1, null).getId());
                } else {
                    imageView2.setVisibility(8);
                    imageView.setVisibility(8);
                }
                TextView textView = (TextView) p12Var.f;
                nr1 nr1Var = (nr1) p12Var.d;
                BellButton bellButton = (BellButton) nr1Var.d;
                ImageView imageView3 = (ImageView) p12Var.l;
                ImageView imageView4 = (ImageView) p12Var.h;
                f6a.g(textView, j04Var.a);
                f6a.g((TextView) p12Var.g, j04Var.e);
                f6a.g((TextView) p12Var.j, j04Var.b);
                f6a.g((TextView) p12Var.k, j04Var.f);
                f6a.g((TextView) p12Var.c, j04Var.D);
                imageView4.setVisibility(j04Var.q != null ? 0 : 8);
                Integer num2 = j04Var.q;
                if (num2 != null) {
                    imageView4.setImageResource(num2.intValue());
                }
                imageView3.setVisibility(j04Var.r != null ? 0 : 8);
                Integer num3 = j04Var.r;
                if (num3 != null) {
                    imageView3.setImageResource(num3.intValue());
                }
                bellButton.setVisibility(0);
                wu wuVar = j04Var.k;
                if (wuVar == null) {
                    wuVar = wu.MAIN_FAVORITES;
                }
                bellButton.e(cricketEvent, wuVar);
                WDLView wDLView = (WDLView) nr1Var.i;
                Integer num4 = j04Var.l;
                if (num4 != null) {
                    num = num4;
                } else {
                    sl6 sl6Var = (sl6) obj2;
                    if (sl6Var != null && (team = (Team) sl6Var.a) != null) {
                        num = Integer.valueOf(team.getId());
                    }
                }
                inb.p(bellButton, wDLView, cricketEvent, num);
                boolean d = d(i, i2, j04Var);
                ConstraintLayout constraintLayout = (ConstraintLayout) p12Var.b;
                constraintLayout.getClass();
                sea.u(constraintLayout, false, j04Var.n, d, this.d, 6, constraintLayout.getContext().getColor(R.color.surface_1), j04Var.p);
                break;
            default:
                vd6 vd6Var = (vd6) obj;
                vd6Var.getClass();
                z3f z3fVar = (z3f) krkVar;
                r4a.r((zl) z3fVar.c, vd6Var.b);
                ((LinearLayout) ((zl) z3fVar.c).f).setOnClickListener(new ivj(2, this, vd6Var));
                Event event = vd6Var.a;
                Odds odds = vd6Var.d;
                this.d = event.getId();
                WinningOddsView winningOddsView = (WinningOddsView) z3fVar.d;
                l0k l0kVar = (l0k) obj2;
                LinkedHashMap linkedHashMap = l0kVar.m;
                winningOddsView.setListener(new ow9(14, l0kVar, this));
                ProviderOdds providerOdds = vd6Var.c;
                if (providerOdds != null && odds != null) {
                    List<OddsChoice> choicesReversible = providerOdds.getChoicesReversible();
                    if (!Intrinsics.c(odds.getFractionalValue(), choicesReversible.get(0).getFractionalValue())) {
                        if ((choicesReversible.size() == 2 && Intrinsics.c(odds.getFractionalValue(), choicesReversible.get(1).getFractionalValue())) || (choicesReversible.size() == 3 && Intrinsics.c(odds.getFractionalValue(), choicesReversible.get(2).getFractionalValue()))) {
                            winningOddsView.j(new WinningOddsResponse(null, odds), event, Intrinsics.c((Boolean) linkedHashMap.get(Integer.valueOf(this.d)), Boolean.TRUE), true);
                            break;
                        }
                    } else {
                        winningOddsView.j(new WinningOddsResponse(odds, null), event, Intrinsics.c((Boolean) linkedHashMap.get(Integer.valueOf(this.d)), Boolean.TRUE), true);
                        break;
                    }
                } else {
                    winningOddsView.j(new WinningOddsResponse(null, null), event, Intrinsics.c((Boolean) linkedHashMap.get(Integer.valueOf(this.d)), Boolean.TRUE), true);
                    break;
                }
                break;
        }
    }

    public boolean d(int i, int i2, j04 j04Var) {
        return j04Var.n || i == i2 - 1;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public k04(p12 p12Var, sl6 sl6Var, int i, int i2) {
        super(r5);
        sl6Var = (i2 & 2) != 0 ? null : sl6Var;
        i = (i2 & 4) != 0 ? 16 : i;
        ConstraintLayout constraintLayout = (ConstraintLayout) p12Var.b;
        constraintLayout.getClass();
        this.e = p12Var;
        this.f = sl6Var;
        this.d = i;
    }
}

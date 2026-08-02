package fe;

import android.graphics.Color;
import com.sports.insider.R;
import jc.d;
import jc.f;
import kotlin.collections.u;
import te.q;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a extends c {
    public final d A;
    public final d B;
    public final d C;
    public final d D;

    /* renamed from: o, reason: collision with root package name */
    public final f f9576o;

    /* renamed from: p, reason: collision with root package name */
    public final d f9577p;
    public final d q;

    /* renamed from: r, reason: collision with root package name */
    public final d f9578r;

    /* renamed from: s, reason: collision with root package name */
    public final d f9579s;

    /* renamed from: t, reason: collision with root package name */
    public final f f9580t;

    /* renamed from: u, reason: collision with root package name */
    public final d f9581u;

    /* renamed from: v, reason: collision with root package name */
    public final d f9582v;

    /* renamed from: w, reason: collision with root package name */
    public final d f9583w;

    /* renamed from: x, reason: collision with root package name */
    public final d f9584x;

    /* renamed from: y, reason: collision with root package name */
    public final d f9585y;

    /* renamed from: z, reason: collision with root package name */
    public final f f9586z;

    public a() {
        jc.a aVar = new jc.a(R.drawable.ic_si_academy, this.j, this.f9613k, this.f9614l, this.f9608e);
        int i5 = this.f9609f;
        int i10 = this.f9610g;
        jc.b bVar = new jc.b(R.drawable.faq_shape_blue, i5, i5, i10, i10);
        this.f9576o = new f(R.string.Basis, R.string.Basis_description, R.string.For_beginners, aVar, Integer.valueOf(Color.parseColor("#492C81")));
        this.f9577p = new d(R.string.Betting_first_steps, 0, "Sports_betting_first_steps", bVar);
        this.q = new d(R.string.Types_of_bets, 0, "Sports_betting_types", bVar);
        this.f9578r = new d(R.string.Typical_mistakes, 0, "Common_mistakes_newbies", bVar);
        this.f9579s = new d(R.string.What_is_losing_streak_and_how_to_deal_with_it, 0, "What_is_losing_streak_and_how_to_deal_with_it", bVar);
        this.f9580t = new f(R.string.Betting_strategies, R.string.Betting_strategies_description, R.string.For_beginners_and_experienced, aVar, Integer.valueOf(Color.parseColor("#492C81")));
        this.f9581u = new d(R.string.For_beginners_and_experienced_Betting_strategies, 0, "Flat_strategy_for_those_who_are_just_starting", bVar);
        this.f9582v = new d(R.string.Corridor_betting, 0, "Strategy_Corridor", bVar);
        this.f9583w = new d(R.string.Value_betting_how_good_is_your_intuition, 0, "Value_Betting", bVar);
        this.f9584x = new d(R.string.Beating_totals, 0, "beating_totals", bVar);
        this.f9585y = new d(R.string.Both_teams_to_score, 0, "Both_teams_to_score", bVar);
        this.f9586z = new f(R.string.Analytics, R.string.Analytics_description, R.string.For_professionals, aVar, Integer.valueOf(Color.parseColor("#492C81")));
        this.A = new d(R.string.Why_does_psychology_matter, 0, "Why_is_psychology_so_important", bVar);
        this.B = new d(R.string.Math_bets, 0, "Mathematical_rates", bVar);
        this.C = new d(R.string.Going_deeper_bets_on_cards_and_corners, 0, "Deepen_bets_on_yellow_cards_and_corner_cards", bVar);
        this.D = new d(R.string.Rational_income_maximization_principle, 0, "Rational_income_maximization_principle", bVar);
    }

    @Override // fe.c
    public final q e() {
        if (this.f9615m == null) {
            this.f9615m = new q();
        }
        q qVar = this.f9615m;
        if (qVar != null) {
            qVar.f(u.f(this.f9605b, this.f9576o, this.f9577p, this.q, this.f9578r, this.f9579s, this.f9580t, this.f9581u, this.f9582v, this.f9583w, this.f9584x, this.f9585y, this.f9586z, this.A, this.B, this.C, this.D));
        }
        return this.f9615m;
    }

    @Override // fe.c
    public final void f() {
        new cd.d().c("click_SI", null);
    }
}

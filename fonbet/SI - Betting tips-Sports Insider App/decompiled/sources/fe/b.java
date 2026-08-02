package fe;

import com.sports.insider.R;
import d2.i;
import java.util.ArrayList;
import jc.d;
import jc.f;
import kotlin.collections.u;
import kotlin.jvm.internal.Intrinsics;
import te.q;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b extends c {
    public final f A;
    public final jc.c B;
    public final jc.c C;
    public final jc.c D;
    public final jc.c E;
    public final jc.c F;
    public final jc.c G;
    public final jc.c H;
    public final jc.c I;
    public final jc.c J;
    public final jc.c K;
    public final jc.c L;
    public final f M;
    public final d N;
    public final d O;
    public final d P;
    public final d Q;
    public final d R;
    public final d S;
    public final d T;
    public final d U;
    public final d V;
    public final d W;
    public final jc.c X;
    public final jc.c Y;
    public final jc.c Z;

    /* renamed from: a0, reason: collision with root package name */
    public final jc.c f9587a0;

    /* renamed from: b0, reason: collision with root package name */
    public final jc.c f9588b0;

    /* renamed from: c0, reason: collision with root package name */
    public final jc.c f9589c0;

    /* renamed from: d0, reason: collision with root package name */
    public final jc.c f9590d0;
    public final jc.c e0;

    /* renamed from: f0, reason: collision with root package name */
    public final f f9591f0;

    /* renamed from: g0, reason: collision with root package name */
    public final d f9592g0;

    /* renamed from: h0, reason: collision with root package name */
    public final f f9593h0;

    /* renamed from: o, reason: collision with root package name */
    public final f f9594o;

    /* renamed from: p, reason: collision with root package name */
    public final jc.c f9595p;
    public final jc.c q;

    /* renamed from: r, reason: collision with root package name */
    public final jc.c f9596r;

    /* renamed from: s, reason: collision with root package name */
    public final jc.c f9597s;

    /* renamed from: t, reason: collision with root package name */
    public final f f9598t;

    /* renamed from: u, reason: collision with root package name */
    public final jc.c f9599u;

    /* renamed from: v, reason: collision with root package name */
    public final jc.c f9600v;

    /* renamed from: w, reason: collision with root package name */
    public final jc.c f9601w;

    /* renamed from: x, reason: collision with root package name */
    public final jc.c f9602x;

    /* renamed from: y, reason: collision with root package name */
    public final jc.c f9603y;

    /* renamed from: z, reason: collision with root package name */
    public final jc.c f9604z;

    public b() {
        int i5 = this.f9606c;
        this.f9594o = new f(R.string.compound_rates, 0, new jc.a(R.drawable.ic_faq, i5, i5, this.f9607d, this.f9608e));
        this.f9595p = new jc.c(R.string.p1_and_oz_yes, R.string.p1_and_oz_yes_name, R.string.p1_and_oz_yes_description, 56);
        this.q = new jc.c(R.string.f1_plus, R.string.f1_plus_name, R.string.f1_plus_description, 56);
        this.f9596r = new jc.c(R.string.f1_minus1, R.string.f1_minus1_name, R.string.f1_minus1_description, 56);
        this.f9597s = new jc.c(R.string.f1_0, R.string.f1_0_name, R.string.f1_0_description, 56);
        int i10 = this.f9606c;
        this.f9598t = new f(R.string.hand_betting, R.string.hand_betting_description, new jc.a(R.drawable.ic_faq, i10, i10, this.f9607d, this.f9608e));
        this.f9599u = new jc.c(R.string.prediction_2tm2_5, R.string.prediction_2tm2_5_name, R.string.prediction_2tm2_5_description, 56);
        this.f9600v = new jc.c(R.string.prediction_1tm2_5, R.string.prediction_1tm2_5_name, R.string.prediction_1tm2_5_description, 56);
        this.f9601w = new jc.c(R.string.prediction2tb2_5, R.string.prediction2_tb2_5_name, R.string.prediction2_tb2_5_description, 56);
        this.f9602x = new jc.c(R.string.prediction1tb2_5, R.string.prediction_tb2_5_name, R.string.prediction_tb2_5_description, 56);
        this.f9603y = new jc.c(R.string.prediction_tm2, R.string.prediction_tm2_name, R.string.prediction_tm2_description, 56);
        this.f9604z = new jc.c(R.string.prediction_tb2, R.string.prediction_tb2_name, R.string.prediction_tb2_description, 56);
        int i11 = this.f9606c;
        this.A = new f(R.string.bets_on_total_match, 0, new jc.a(R.drawable.ic_faq, i11, i11, this.f9607d, this.f9608e));
        this.B = new jc.c(R.string.prediction_oz, R.string.prediction_oz_name, 0, 60);
        this.C = new jc.c(R.string.prediction_12, R.string.prediction_12_name, 0, 60);
        this.D = new jc.c(R.string.prediction_2x, R.string.prediction_2x_name, R.string.prediction_2x_description, R.string.prediction_2x_italic, true);
        this.E = new jc.c(R.string.prediction_1x, R.string.prediction_1x_name, R.string.prediction_1x_description, R.string.prediction_1x_italic, true);
        this.F = new jc.c(R.string.prediction_n, R.string.prediction_n_name, 0, 60);
        this.G = new jc.c(R.string.dry_p2, R.string.dry_p2_name, R.string.dry_p2_description, R.string.dry_p2_italic, true);
        this.H = new jc.c(R.string.dry_p1, R.string.dry_p1_name, R.string.dry_p1_description, R.string.dry_p1_italic, true);
        this.I = new jc.c(R.string.pass2, R.string.pass2_name, R.string.pass2_description, 56);
        this.J = new jc.c(R.string.pass1, R.string.pass1_name, R.string.pass1_description, 56);
        this.K = new jc.c(R.string.rate_p2, R.string.rate_p2_name, R.string.rate_p2_description, 56);
        this.L = new jc.c(R.string.rate_p1, R.string.rate_p1_name, R.string.rate_p1_description, 56);
        int i12 = this.f9606c;
        this.M = new f(R.string.standard_forecasts, 0, new jc.a(R.drawable.ic_faq, i12, i12, this.f9607d, this.f9608e));
        int i13 = this.f9609f;
        int i14 = this.f9610g;
        this.N = new d(R.string.ResponsibleGamingActivityTittle, R.string.GoToDescription, "Responsible", new jc.b(R.drawable.faq_shape_green, i13, i13, i14, i14));
        int i15 = this.f9609f;
        int i16 = this.f9610g;
        this.O = new d(R.string.premium_prediction, R.string.GoToDescription, "premium_prediction", new jc.b(R.drawable.faq_shape_green, i15, i15, i16, i16));
        int i17 = this.f9609f;
        int i18 = this.f9610g;
        this.P = new d(R.string.How_to_get_a_bonus, R.string.GoToDescription, "how_to_get_a_bonus", new jc.b(R.drawable.faq_shape_green, i17, i17, i18, i18));
        int i19 = this.f9609f;
        int i20 = this.f9610g;
        this.Q = new d(R.string.express_prediction, R.string.GoToDescription, "express_prediction", new jc.b(R.drawable.faq_shape_green, i19, i19, i20, i20));
        int i21 = this.f9609f;
        int i22 = this.f9610g;
        this.R = new d(R.string.vip_access, R.string.GoToDescription, "vip_access", new jc.b(R.drawable.faq_shape_green, i21, i21, i22, i22));
        int i23 = this.f9609f;
        int i24 = this.f9610g;
        this.S = new d(R.string.how_to_pay, R.string.GoToDescription, "how_to_pay", new jc.b(R.drawable.faq_shape_green, i23, i23, i24, i24));
        int i25 = this.f9609f;
        int i26 = this.f9610g;
        this.T = new d(R.string.recommendation_live, R.string.GoToDescription, "subs_live_prediction", new jc.b(R.drawable.faq_shape_green, i25, i25, i26, i26));
        int i27 = this.f9609f;
        int i28 = this.f9610g;
        this.U = new d(R.string.recommendation_how_to_place_a_bet, R.string.GoToDescription, "how_place_bet", new jc.b(R.drawable.faq_shape_green, i27, i27, i28, i28));
        int i29 = this.f9609f;
        int i30 = this.f9610g;
        this.V = new d(R.string.recommendation_how_to_register_in_bookmaker_office, R.string.GoToDescription, "how_register_bk", new jc.b(R.drawable.faq_shape_green, i29, i29, i30, i30));
        int i31 = this.f9609f;
        int i32 = this.f9610g;
        this.W = new d(R.string.how_delete_account, R.string.GoToDescription, "how_logout_oauth", new jc.b(R.drawable.faq_shape_green, i31, i31, i32, i32));
        this.X = new jc.c(R.string.w1_1map, R.string.w1_1map_name, R.string.w1_1map_description, 56);
        this.Y = new jc.c(R.string.w1_2map, R.string.w1_2map_name, R.string.w1_2map_description, 56);
        this.Z = new jc.c(R.string.w2_1map, R.string.w2_1map_name, R.string.w2_1map_description, 56);
        this.f9587a0 = new jc.c(R.string.w2_2map, R.string.w2_2map_name, R.string.w2_2map_description, 56);
        this.f9588b0 = new jc.c(R.string.total_b255_1map, R.string.total_b255_1map_name, R.string.total_b255_1map_description, R.string.total_b255_1map_note, true);
        this.f9589c0 = new jc.c(R.string.total_m255_1map, R.string.total_m255_1map_name, R.string.total_m255_1map_description, R.string.total_m255_1map_note, true);
        this.f9590d0 = new jc.c(R.string.W1_OT, R.string.W1_OT_name, R.string.W1_OT_description, R.string.W1_OT_note, true);
        this.e0 = new jc.c(R.string.W2_OT, R.string.W2_OT_name, R.string.W2_OT_description, R.string.W2_OT_note, true);
        int i33 = this.f9606c;
        this.f9591f0 = new f(R.string.recommendation, 0, new jc.a(R.drawable.ic_faq, i33, i33, this.f9607d, this.f9608e));
        int i34 = this.f9611h;
        int i35 = this.f9612i;
        int i36 = this.f9608e;
        this.f9592g0 = new d(R.string.training00learning, R.string.betting_training, "Academy", new jc.b(R.drawable.ic_si_academy, i34, i35, i36, i36));
        int i37 = this.f9606c;
        this.f9593h0 = new f(R.string.training, 0, new jc.a(R.drawable.ic_faq, i37, i37, this.f9607d, this.f9608e));
    }

    @Override // fe.c
    public final q e() {
        if (this.f9615m == null) {
            this.f9615m = new q();
        }
        q qVar = this.f9615m;
        if (qVar != null) {
            qVar.f(g());
        }
        return this.f9615m;
    }

    @Override // fe.c
    public final void f() {
        new cd.d().c("open_faq", null);
    }

    public final ArrayList g() {
        ArrayList g10 = u.g(this.f9605b, this.f9593h0, this.f9592g0, this.f9591f0, this.N, this.O, this.Q, this.R, this.S, this.T, this.U, this.V, this.W, this.P);
        String str = gc.d.f9945a;
        boolean areEqual = Intrinsics.areEqual(i.c(), "ru");
        g10.addAll(u.f(this.M, this.L, this.K, this.J, this.I, this.H, this.G, this.F, this.E, this.D, this.C, this.B));
        if (areEqual) {
            g10.addAll(u.f(this.X, this.Y, this.Z, this.f9587a0, this.f9590d0, this.e0));
        }
        g10.addAll(u.f(this.A, this.f9604z, this.f9603y, this.f9602x, this.f9601w, this.f9600v, this.f9599u));
        if (areEqual) {
            g10.addAll(u.f(this.f9588b0, this.f9589c0));
        }
        g10.addAll(u.f(this.f9598t, this.f9597s, this.f9596r, this.q, this.f9594o, this.f9595p, this.f9605b));
        return g10;
    }
}

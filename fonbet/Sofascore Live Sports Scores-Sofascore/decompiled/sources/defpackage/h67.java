package defpackage;

import android.app.Application;
import androidx.compose.runtime.e;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lh67;", "Lq8;", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class h67 extends q8 {
    public final wi7 e;
    public final j67 f;
    public final int g;
    public final e1d h;
    public final g62 i;
    public final nn2 j;
    public final hof k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h67(wi7 wi7Var, fqg fqgVar, Application application) {
        super(application);
        wi7Var.getClass();
        fqgVar.getClass();
        this.e = wi7Var;
        Object a = fqgVar.a("FANTASY_LEAGUE_EXTRA");
        rq3 rq3Var = null;
        if (a == null) {
            a70.r("Required value was null.");
            throw null;
        }
        j67 j67Var = (j67) a;
        this.f = j67Var;
        Object a2 = fqgVar.a("competitionId");
        if (a2 == null) {
            a70.r("Required value was null.");
            throw null;
        }
        this.g = ((Number) a2).intValue();
        ia0 ia0Var = ia0.q;
        this.h = e.f(new e67(rlh.b, fc6.e(), "", Intrinsics.c(j67Var.d, ok3.p().e().getId()), false));
        final int i = 0;
        g62 g = ml4.g(0, 7, null);
        this.i = g;
        this.j = f5p.J(g);
        pog y = sea.y(new Function0(this) { // from class: f67
            public final /* synthetic */ h67 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                h67 h67Var = this.b;
                switch (i2) {
                    case 0:
                        return h67Var.k().c;
                    default:
                        return h67Var.k().e;
                }
            }
        });
        final int i2 = 1;
        pog y2 = sea.y(new Function0(this) { // from class: f67
            public final /* synthetic */ h67 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                h67 h67Var = this.b;
                switch (i22) {
                    case 0:
                        return h67Var.k().c;
                    default:
                        return h67Var.k().e;
                }
            }
        });
        int i3 = 3;
        this.k = pco.w(la8.a(new yf4(hkg.F(y, new yt6(15)), y2, new q41(this, rq3Var, i3), 1), new m63(i3, rq3Var, i2)), un0.z(this));
    }

    public final e67 k() {
        return (e67) ((eoh) this.h).getValue();
    }
}

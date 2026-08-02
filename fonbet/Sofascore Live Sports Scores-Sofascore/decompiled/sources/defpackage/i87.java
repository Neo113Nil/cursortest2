package defpackage;

import com.sofascore.results.fantasy.competition.articles.FantasyNewsArticlesActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class i87 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ FantasyNewsArticlesActivity b;

    public /* synthetic */ i87(FantasyNewsArticlesActivity fantasyNewsArticlesActivity, int i) {
        this.a = i;
        this.b = fantasyNewsArticlesActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        FantasyNewsArticlesActivity fantasyNewsArticlesActivity = this.b;
        switch (i) {
            case 0:
                int i2 = FantasyNewsArticlesActivity.M;
                return yd3.a(fantasyNewsArticlesActivity.getLayoutInflater());
            default:
                int i3 = FantasyNewsArticlesActivity.M;
                n87 n87Var = (n87) fantasyNewsArticlesActivity.L.getValue();
                xw3.L(un0.z(n87Var), null, null, new t3((q8) n87Var, true, (rq3) null, 10), 3);
                return Unit.a;
        }
    }
}

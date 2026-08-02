package defpackage;

import com.sofascore.results.fantasy.competition.articles.FantasyNewsArticlesActivity;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class k87 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ FantasyNewsArticlesActivity b;

    public /* synthetic */ k87(FantasyNewsArticlesActivity fantasyNewsArticlesActivity, int i) {
        this.a = i;
        this.b = fantasyNewsArticlesActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        FantasyNewsArticlesActivity fantasyNewsArticlesActivity = this.b;
        switch (i) {
            case 0:
                return fantasyNewsArticlesActivity.getDefaultViewModelProviderFactory();
            case 1:
                return fantasyNewsArticlesActivity.getViewModelStore();
            default:
                return fantasyNewsArticlesActivity.getDefaultViewModelCreationExtras();
        }
    }
}

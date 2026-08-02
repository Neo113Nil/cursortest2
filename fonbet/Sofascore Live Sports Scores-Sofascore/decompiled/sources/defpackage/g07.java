package defpackage;

import com.sofascore.results.fantasy.highlights.gameweek.FantasyGameweekHighlightsActivity;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class g07 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ FantasyGameweekHighlightsActivity b;

    public /* synthetic */ g07(FantasyGameweekHighlightsActivity fantasyGameweekHighlightsActivity, int i) {
        this.a = i;
        this.b = fantasyGameweekHighlightsActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        FantasyGameweekHighlightsActivity fantasyGameweekHighlightsActivity = this.b;
        switch (i) {
            case 0:
                return fantasyGameweekHighlightsActivity.getDefaultViewModelProviderFactory();
            case 1:
                return fantasyGameweekHighlightsActivity.getViewModelStore();
            default:
                return fantasyGameweekHighlightsActivity.getDefaultViewModelCreationExtras();
        }
    }
}

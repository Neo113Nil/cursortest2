package defpackage;

import com.sofascore.results.bettingtips.BettingTipsActivity;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class wu1 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ BettingTipsActivity b;

    public /* synthetic */ wu1(BettingTipsActivity bettingTipsActivity, int i) {
        this.a = i;
        this.b = bettingTipsActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        BettingTipsActivity bettingTipsActivity = this.b;
        switch (i) {
            case 0:
                return bettingTipsActivity.getDefaultViewModelProviderFactory();
            case 1:
                return bettingTipsActivity.getViewModelStore();
            default:
                return bettingTipsActivity.getDefaultViewModelCreationExtras();
        }
    }
}

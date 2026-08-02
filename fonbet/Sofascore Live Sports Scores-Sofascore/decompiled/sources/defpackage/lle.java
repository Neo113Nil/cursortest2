package defpackage;

import com.sofascore.results.player.PlayerActivity;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class lle implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ PlayerActivity b;

    public /* synthetic */ lle(PlayerActivity playerActivity, int i) {
        this.a = i;
        this.b = playerActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        PlayerActivity playerActivity = this.b;
        switch (i) {
            case 0:
                return playerActivity.getDefaultViewModelProviderFactory();
            case 1:
                return playerActivity.getViewModelStore();
            default:
                return playerActivity.getDefaultViewModelCreationExtras();
        }
    }
}

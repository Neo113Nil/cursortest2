package defpackage;

import com.sofascore.results.transfers.PlayerTransfersActivity;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class ixe implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ PlayerTransfersActivity b;

    public /* synthetic */ ixe(PlayerTransfersActivity playerTransfersActivity, int i) {
        this.a = i;
        this.b = playerTransfersActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        PlayerTransfersActivity playerTransfersActivity = this.b;
        switch (i) {
            case 0:
                return playerTransfersActivity.getDefaultViewModelProviderFactory();
            case 1:
                return playerTransfersActivity.getViewModelStore();
            default:
                return playerTransfersActivity.getDefaultViewModelCreationExtras();
        }
    }
}

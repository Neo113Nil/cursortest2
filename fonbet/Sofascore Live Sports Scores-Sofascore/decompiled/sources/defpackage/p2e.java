package defpackage;

import android.content.Context;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.sofascore.results.player.PlayerActivity;
import com.sofascore.results.pots.mostAwards.bottomSheet.POTSPlayerAwardsBottomSheet;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class p2e implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ POTSPlayerAwardsBottomSheet b;

    public /* synthetic */ p2e(POTSPlayerAwardsBottomSheet pOTSPlayerAwardsBottomSheet, int i) {
        this.a = i;
        this.b = pOTSPlayerAwardsBottomSheet;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        POTSPlayerAwardsBottomSheet pOTSPlayerAwardsBottomSheet = this.b;
        switch (i) {
            case 0:
                String string = pOTSPlayerAwardsBottomSheet.requireArguments().getString("PLAYER_NAME");
                return string == null ? "" : string;
            default:
                int i2 = PlayerActivity.Z;
                Context requireContext = pOTSPlayerAwardsBottomSheet.requireContext();
                requireContext.getClass();
                jle.q(requireContext, ((r2e) pOTSPlayerAwardsBottomSheet.C.getValue()).g, 0, null, null, false, null, null, IronSourceError.ERROR_CODE_INIT_FAILED);
                return Unit.a;
        }
    }
}

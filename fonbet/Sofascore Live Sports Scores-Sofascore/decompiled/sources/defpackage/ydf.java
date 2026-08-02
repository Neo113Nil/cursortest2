package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.sofascore.model.weeklyChallenge.WeeklyStatus;
import com.sofascore.results.weeklyChallenge.WeeklyChallengeActivity;
import com.sofascore.results.weeklyChallenge.ui.components.bottomSheet.PromotionDemotionBottomSheet;
import java.io.Serializable;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class ydf implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ PromotionDemotionBottomSheet b;

    public /* synthetic */ ydf(PromotionDemotionBottomSheet promotionDemotionBottomSheet, int i) {
        this.a = i;
        this.b = promotionDemotionBottomSheet;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        PromotionDemotionBottomSheet promotionDemotionBottomSheet = this.b;
        switch (i) {
            case 0:
                Bundle requireArguments = promotionDemotionBottomSheet.requireArguments();
                requireArguments.getClass();
                Serializable M = gz8.M(requireArguments, "WEEKLY_STATUS", WeeklyStatus.class);
                if (M != null) {
                    return (WeeklyStatus) M;
                }
                a70.p("Serializable WEEKLY_STATUS not found");
                return null;
            case 1:
                WeeklyStatus H = promotionDemotionBottomSheet.H();
                if (H instanceof WeeklyStatus.WeeklyDemotion) {
                    return bv.WEEKLY_CHALLENGE_DEMOTION;
                }
                if (H instanceof WeeklyStatus.WeeklyPromotion) {
                    return bv.WEEKLY_CHALLENGE_PROMOTION;
                }
                if (H instanceof WeeklyStatus.WeeklyUnchanged) {
                    return bv.WEEKLY_CHALLENGE_WITHOUT_PROMOTION;
                }
                if (H instanceof WeeklyStatus.WeeklyUnchangedOnTop) {
                    return bv.WEEKLY_CHALLENGE_WITHOUT_PROMOTION;
                }
                zzl.b();
                return null;
            default:
                if (!(promotionDemotionBottomSheet.requireContext() instanceof WeeklyChallengeActivity)) {
                    Context requireContext = promotionDemotionBottomSheet.requireContext();
                    requireContext.getClass();
                    nv.e0(requireContext, hta.WEEKLY_CHALLENGE, "bottom_sheet");
                    Context requireContext2 = promotionDemotionBottomSheet.requireContext();
                    requireContext2.getClass();
                    nv.k0(requireContext2, promotionDemotionBottomSheet.e(), av.CTA_CLICK, dv.POPUP_QUEUE, null, null, 48);
                    int i2 = WeeklyChallengeActivity.O;
                    Context requireContext3 = promotionDemotionBottomSheet.requireContext();
                    requireContext3.getClass();
                    requireContext3.startActivity(new Intent(requireContext3, (Class<?>) WeeklyChallengeActivity.class));
                }
                promotionDemotionBottomSheet.j();
                return Unit.a;
        }
    }
}

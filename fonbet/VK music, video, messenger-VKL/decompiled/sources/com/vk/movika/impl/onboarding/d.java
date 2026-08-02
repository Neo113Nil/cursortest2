package com.vk.movika.impl.onboarding;

import com.vk.dto.hints.HintId;
import com.vk.movika.impl.onboarding.InteractiveOnboardingModalBottomSheet;
import xsna.pla;

/* compiled from: InteractiveVideoOnboardingController.kt */
/* loaded from: classes3.dex */
public final class d implements InteractiveOnboardingModalBottomSheet.b {
    public final /* synthetic */ e a;

    public d(e eVar) {
        this.a = eVar;
    }

    @Override // com.vk.movika.impl.onboarding.InteractiveOnboardingModalBottomSheet.b
    public final void onClose() {
        pla.e().b().b(HintId.INFO_VIDEO_INTERACTIVE_VIDEO.getId());
        this.a.a.invoke();
    }
}

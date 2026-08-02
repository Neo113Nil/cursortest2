package defpackage;

import com.sofascore.results.onboarding.follow.model.OnboardingItemUiModel;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class lsd implements osd {
    public final OnboardingItemUiModel a;

    public lsd(OnboardingItemUiModel onboardingItemUiModel) {
        this.a = onboardingItemUiModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lsd) && this.a.equals(((lsd) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Item(model=" + this.a + ")";
    }
}

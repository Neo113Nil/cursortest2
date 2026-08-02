package defpackage;

import com.sofascore.results.onboarding.follow.model.OnboardingItemUiModel;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class erd implements hrd {
    public final OnboardingItemUiModel a;

    public erd(OnboardingItemUiModel onboardingItemUiModel) {
        this.a = onboardingItemUiModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof erd) && this.a.equals(((erd) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SelectItem(item=" + this.a + ")";
    }
}

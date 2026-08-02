package ru.ozon.app.android.storefront.domain.onboarding;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\b\u001a\u00020\tJ\u0006\u0010\n\u001a\u00020\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/storefront/domain/onboarding/CommonOnboardingResolver;", "", "<init>", "()V", "isShowing", "", "isShowingNow", "()Z", "onStartShow", "", "onStopShow", "onboarding_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CommonOnboardingResolver {

    @NotNull
    public static final CommonOnboardingResolver INSTANCE = new CommonOnboardingResolver();
    private static boolean isShowing;

    private CommonOnboardingResolver() {
    }

    public final boolean isShowingNow() {
        return isShowing;
    }

    public final void onStartShow() {
        isShowing = true;
    }

    public final void onStopShow() {
        isShowing = false;
    }
}

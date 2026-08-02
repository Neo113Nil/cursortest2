package ru.ozon.app.android.travel.utils.extensions;

import De.s;
import androidx.lifecycle.AbstractC5434v;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;
import xe.B0;
import xe.C10720e0;
import xe.C10727i;
import xe.M;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a5\u0010\t\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "Landroidx/lifecycle/v;", "lifecycle", "Lxe/M;", "coroutineScope", "Lkotlin/Function1;", "", "bindAction", "Lxe/B0;", "showOnboardingWithDelay", "(Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;Landroidx/lifecycle/v;Lxe/M;Lkotlin/jvm/functions/Function1;)Lxe/B0;", "utils_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class OnboardingExtensionsKt {
    @NotNull
    public static final B0 showOnboardingWithDelay(@NotNull OnBoardingDTO onBoardingDTO, @NotNull AbstractC5434v lifecycle, @NotNull M coroutineScope, @NotNull Function1<? super OnBoardingDTO, Unit> bindAction) {
        Intrinsics.checkNotNullParameter(onBoardingDTO, "<this>");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(bindAction, "bindAction");
        C10720e0 c10720e0 = C10720e0.f105451a;
        return C10727i.c(coroutineScope, s.f6650a.x(), null, new OnboardingExtensionsKt$showOnboardingWithDelay$1(lifecycle, bindAction, onBoardingDTO, null), 2);
    }
}

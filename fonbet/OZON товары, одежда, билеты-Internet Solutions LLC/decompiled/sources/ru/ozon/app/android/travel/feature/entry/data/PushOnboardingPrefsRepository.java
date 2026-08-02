package ru.ozon.app.android.travel.feature.entry.data;

import Bk.C2638a;
import He.b;
import Wc.a;
import android.content.SharedPreferences;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDisplayRepository;
import xe.C10720e0;
import xe.C10727i;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\b\u0001\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\nH\u0086@¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/travel/feature/entry/data/PushOnboardingPrefsRepository;", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDisplayRepository;", "Landroid/content/SharedPreferences;", "sharedPreferences", "<init>", "(Landroid/content/SharedPreferences;)V", "", "widgetKey", "", "isShown", "", "onShown", "(Ljava/lang/String;Z)V", "canShow", "(Ljava/lang/String;)Z", "onRationaleShow", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroid/content/SharedPreferences;", "Companion", "entry_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PushOnboardingPrefsRepository implements OnBoardingDisplayRepository {

    @NotNull
    private final SharedPreferences sharedPreferences;
    public static final int $stable = 8;

    public PushOnboardingPrefsRepository(@NotNull SharedPreferences sharedPreferences) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        this.sharedPreferences = sharedPreferences;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDisplayRepository
    public boolean canShow(@NotNull String widgetKey) {
        Intrinsics.checkNotNullParameter(widgetKey, "widgetKey");
        return this.sharedPreferences.getInt("push_on_boarding_shown_count", 0) < 1;
    }

    public final Object onRationaleShow(@NotNull d<? super Unit> dVar) {
        C10720e0 c10720e0 = C10720e0.f105451a;
        Object f7 = C10727i.f(b.f10879b, new PushOnboardingPrefsRepository$onRationaleShow$2(this, null), dVar);
        return f7 == a.COROUTINE_SUSPENDED ? f7 : Unit.f71690a;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDisplayRepository
    public void onShown(@NotNull String widgetKey, boolean isShown) {
        Intrinsics.checkNotNullParameter(widgetKey, "widgetKey");
        if (isShown) {
            int i11 = this.sharedPreferences.getInt("push_on_boarding_shown_count", 0);
            long a11 = C2638a.a();
            SharedPreferences.Editor edit = this.sharedPreferences.edit();
            edit.putInt("push_on_boarding_shown_count", i11 + 1);
            edit.putLong("push_on_boarding_shown_time", a11);
            edit.apply();
        }
    }
}

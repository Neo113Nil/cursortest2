package ru.ozon.app.android.composer.widgets.v2.onboarding.presentation;

import androidx.lifecycle.w0;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDisplayDisableRepository;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDisplayOnPageRepository;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDisplayRepository;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u001b\b'\u0018\u0000 *2\u00020\u0001:\u0002*+B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000fJ+\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0016\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\r¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u001a\u0010\u0019J\u0015\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\r¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010 \u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ-\u0010\"\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0000¢\u0006\u0004\b!\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010$R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010%R$\u0010'\u001a\u00020\r2\u0006\u0010&\u001a\u00020\r8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b'\u0010)¨\u0006,"}, d2 = {"Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/BaseOnBoardingViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDisplayRepository;", "displayRepository", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDisplayOnPageRepository;", "displayOnPageRepository", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDisplayDisableRepository;", "displayDisableRepository", "<init>", "(Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDisplayRepository;Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDisplayOnPageRepository;Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDisplayDisableRepository;)V", "", "pageTag", "widgetKey", "", "isNeedToShow", "(Ljava/lang/String;Ljava/lang/String;)Z", "Lkotlin/Function0;", "", "block", "showIfNeed", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "isShown", "onShown", "(Ljava/lang/String;Z)V", "onPageShown", "(Ljava/lang/String;)V", "removePageFromCache", "state", "setEnableState", "(Z)V", "onUnbind$composer_prodGoogleAllVendorsRelease", "()V", "onUnbind", "showIfNeedInternal$composer_prodGoogleAllVendorsRelease", "showIfNeedInternal", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDisplayRepository;", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDisplayOnPageRepository;", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDisplayDisableRepository;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "isEnabled", "Z", "()Z", "Companion", "Default", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class BaseOnBoardingViewModel extends w0 {
    private static boolean isShowing;

    @NotNull
    private final OnBoardingDisplayDisableRepository displayDisableRepository;

    @NotNull
    private final OnBoardingDisplayOnPageRepository displayOnPageRepository;

    @NotNull
    private final OnBoardingDisplayRepository displayRepository;
    private boolean isEnabled;
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/BaseOnBoardingViewModel$Default;", "Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/BaseOnBoardingViewModel;", "displayRepository", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDisplayRepository;", "displayOnPageRepository", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDisplayOnPageRepository;", "disableOnBoardingRepository", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDisplayDisableRepository;", "<init>", "(Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDisplayRepository;Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDisplayOnPageRepository;Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDisplayDisableRepository;)V", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Default extends BaseOnBoardingViewModel {
        public static final int $stable = 0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Default(@NotNull OnBoardingDisplayRepository displayRepository, @NotNull OnBoardingDisplayOnPageRepository displayOnPageRepository, @NotNull OnBoardingDisplayDisableRepository disableOnBoardingRepository) {
            super(displayRepository, displayOnPageRepository, disableOnBoardingRepository);
            Intrinsics.checkNotNullParameter(displayRepository, "displayRepository");
            Intrinsics.checkNotNullParameter(displayOnPageRepository, "displayOnPageRepository");
            Intrinsics.checkNotNullParameter(disableOnBoardingRepository, "disableOnBoardingRepository");
        }
    }

    public BaseOnBoardingViewModel(@NotNull OnBoardingDisplayRepository displayRepository, @NotNull OnBoardingDisplayOnPageRepository displayOnPageRepository, @NotNull OnBoardingDisplayDisableRepository displayDisableRepository) {
        Intrinsics.checkNotNullParameter(displayRepository, "displayRepository");
        Intrinsics.checkNotNullParameter(displayOnPageRepository, "displayOnPageRepository");
        Intrinsics.checkNotNullParameter(displayDisableRepository, "displayDisableRepository");
        this.displayRepository = displayRepository;
        this.displayOnPageRepository = displayOnPageRepository;
        this.displayDisableRepository = displayDisableRepository;
        this.isEnabled = true;
    }

    /* renamed from: isEnabled, reason: from getter */
    public final boolean getIsEnabled() {
        return this.isEnabled;
    }

    public final boolean isNeedToShow(@NotNull String pageTag, @NotNull String widgetKey) {
        Intrinsics.checkNotNullParameter(pageTag, "pageTag");
        Intrinsics.checkNotNullParameter(widgetKey, "widgetKey");
        return this.displayDisableRepository.canShow() && this.displayOnPageRepository.canShow(pageTag) && this.displayRepository.canShow(widgetKey) && !isShowing && this.isEnabled;
    }

    public final void onPageShown(@NotNull String pageTag) {
        Intrinsics.checkNotNullParameter(pageTag, "pageTag");
        this.displayOnPageRepository.onShown(pageTag);
    }

    public final void onShown(@NotNull String widgetKey, boolean isShown) {
        Intrinsics.checkNotNullParameter(widgetKey, "widgetKey");
        this.displayRepository.onShown(widgetKey, isShown);
        this.displayDisableRepository.onShown(isShown);
        isShowing = false;
    }

    public final void onUnbind$composer_prodGoogleAllVendorsRelease() {
        isShowing = false;
    }

    public final void removePageFromCache(@NotNull String pageTag) {
        Intrinsics.checkNotNullParameter(pageTag, "pageTag");
        this.displayOnPageRepository.removePageFromCache(pageTag);
    }

    public final void setEnableState(boolean state) {
        this.isEnabled = state;
    }

    public final void showIfNeed(@NotNull String pageTag, @NotNull String widgetKey, @NotNull Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(pageTag, "pageTag");
        Intrinsics.checkNotNullParameter(widgetKey, "widgetKey");
        Intrinsics.checkNotNullParameter(block, "block");
        if (isNeedToShow(pageTag, widgetKey)) {
            block.invoke();
        }
    }

    public final void showIfNeedInternal$composer_prodGoogleAllVendorsRelease(@NotNull String pageTag, @NotNull String widgetKey, @NotNull Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(pageTag, "pageTag");
        Intrinsics.checkNotNullParameter(widgetKey, "widgetKey");
        Intrinsics.checkNotNullParameter(block, "block");
        if (isNeedToShow(pageTag, widgetKey)) {
            block.invoke();
            isShowing = true;
        }
    }
}

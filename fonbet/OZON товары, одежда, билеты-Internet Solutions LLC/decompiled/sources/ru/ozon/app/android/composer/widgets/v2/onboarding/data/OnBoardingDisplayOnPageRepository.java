package ru.ozon.app.android.composer.widgets.v2.onboarding.data;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\t\nJ\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDisplayOnPageRepository;", "", "removePageFromCache", "", "pageTag", "", "onShown", "canShow", "", "Default", "Empty", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface OnBoardingDisplayOnPageRepository {

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0006H\u0016J\u0010\u0010\u000b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0006H\u0016J\u0010\u0010\f\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0006H\u0016R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDisplayOnPageRepository$Default;", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDisplayOnPageRepository;", "<init>", "()V", "showedOnBoardingPagesCache", "", "", "", "removePageFromCache", "", "pageTag", "onShown", "canShow", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Default implements OnBoardingDisplayOnPageRepository {

        @NotNull
        public static final Default INSTANCE = new Default();

        @NotNull
        private static final Map<String, Boolean> showedOnBoardingPagesCache = new LinkedHashMap();
        public static final int $stable = 8;

        private Default() {
        }

        @Override // ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDisplayOnPageRepository
        public boolean canShow(@NotNull String pageTag) {
            Intrinsics.checkNotNullParameter(pageTag, "pageTag");
            return !Intrinsics.d(showedOnBoardingPagesCache.get(pageTag), Boolean.TRUE);
        }

        @Override // ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDisplayOnPageRepository
        public void onShown(@NotNull String pageTag) {
            Intrinsics.checkNotNullParameter(pageTag, "pageTag");
            showedOnBoardingPagesCache.put(pageTag, Boolean.TRUE);
        }

        @Override // ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDisplayOnPageRepository
        public void removePageFromCache(@NotNull String pageTag) {
            Intrinsics.checkNotNullParameter(pageTag, "pageTag");
            showedOnBoardingPagesCache.remove(pageTag);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDisplayOnPageRepository$Empty;", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDisplayOnPageRepository;", "<init>", "()V", "removePageFromCache", "", "pageTag", "", "onShown", "canShow", "", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Empty implements OnBoardingDisplayOnPageRepository {

        @NotNull
        public static final Empty INSTANCE = new Empty();

        private Empty() {
        }

        @Override // ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDisplayOnPageRepository
        public boolean canShow(@NotNull String pageTag) {
            Intrinsics.checkNotNullParameter(pageTag, "pageTag");
            return true;
        }

        @Override // ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDisplayOnPageRepository
        public void onShown(@NotNull String pageTag) {
            Intrinsics.checkNotNullParameter(pageTag, "pageTag");
        }

        @Override // ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDisplayOnPageRepository
        public void removePageFromCache(@NotNull String pageTag) {
            Intrinsics.checkNotNullParameter(pageTag, "pageTag");
        }
    }

    boolean canShow(@NotNull String pageTag);

    void onShown(@NotNull String pageTag);

    void removePageFromCache(@NotNull String pageTag);
}

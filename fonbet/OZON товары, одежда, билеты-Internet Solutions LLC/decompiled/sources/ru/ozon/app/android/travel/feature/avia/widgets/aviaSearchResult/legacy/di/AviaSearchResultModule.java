package ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.di;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.avia.R$string;
import ru.ozon.app.android.travel.molecules.view.searchPreloader.animator.SearchPreloaderAnimator;
import ru.ozon.app.android.uikit.text.StringProvider;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0004\u001a\u00020\u0005H\u0000¢\u0006\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/di/AviaSearchResultModule;", "", "<init>", "()V", "providePreloaderAnimator", "Lru/ozon/app/android/travel/molecules/view/searchPreloader/animator/SearchPreloaderAnimator;", "providePreloaderAnimator$avia_prodGoogleAllVendorsRelease", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AviaSearchResultModule {

    @NotNull
    public static final AviaSearchResultModule INSTANCE = new AviaSearchResultModule();

    private AviaSearchResultModule() {
    }

    @NotNull
    public final SearchPreloaderAnimator providePreloaderAnimator$avia_prodGoogleAllVendorsRelease() {
        return new SearchPreloaderAnimator(new String[]{StringProvider.getString(R$string.serp_getting_avia_schedule), StringProvider.getString(R$string.serp_searching_for_discounted_avia_tickets), StringProvider.getString(R$string.serp_checking_avia_availability), StringProvider.getString(R$string.serp_getting_avia_transfer_info)}, new float[]{0.0f, 0.4f, 0.7f, 0.9f, 0.95f});
    }
}

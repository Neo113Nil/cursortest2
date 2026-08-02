package ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.pool;

import android.content.Context;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.molecules.view.tripRoute.TripRouteView;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u0002H\t\"\b\b\u0000\u0010\t*\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016¢\u0006\u0002\u0010\rR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/pool/TripRouteViewProvider;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/pool/AviaSearchResultViewProvider;", "<init>", "()V", "initialAmount", "", "getInitialAmount", "()I", "create", "T", "Landroid/view/View;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)Landroid/view/View;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class TripRouteViewProvider implements AviaSearchResultViewProvider {
    private final int initialAmount = 12;

    @Override // ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.pool.AviaSearchResultViewProvider
    @NotNull
    public <T extends View> T create(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new TripRouteView(context, null, 0, 0, 14, null);
    }

    @Override // ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.pool.AviaSearchResultViewProvider
    public int getInitialAmount() {
        return this.initialAmount;
    }
}

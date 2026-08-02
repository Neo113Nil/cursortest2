package ru.ozon.app.android.travel.feature.tours.widgets.toursSearchResult.utils;

import androidx.lifecycle.W;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0013\u0012\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0018\u0010\u0005\u001a\u00060\u0003j\u0002`\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/toursSearchResult/utils/ToursSearchResultRefreshObserver;", "Landroidx/lifecycle/W;", "", "Ll10/b;", "Lru/ozon/app/android/composer/ComposerController;", "composerController", "<init>", "(Ll10/b;)V", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "onChanged", "(Ljava/lang/Void;)V", "Ll10/b;", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ToursSearchResultRefreshObserver implements W {

    @NotNull
    private final InterfaceC7851b composerController;

    public ToursSearchResultRefreshObserver(@NotNull InterfaceC7851b composerController) {
        Intrinsics.checkNotNullParameter(composerController, "composerController");
        this.composerController = composerController;
    }

    @Override // androidx.lifecycle.W
    public void onChanged(Void value) {
        InterfaceC7851b.a.e(this.composerController, null, null, null, 7);
    }
}

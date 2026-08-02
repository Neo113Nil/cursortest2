package ru.ozon.app.android.geo.addresseditformprompt;

import W10.c;
import a00.C4911f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.yandexsearchsheet.ShowYandexSearchSheetAction;
import ru.ozon.app.android.yandexsearchsheet.YandexSearchSheetFragment;
import ru.ozon.app.android.yandexsearchsheet.YandexSearchSheetSharedViewModel;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\n\u0010\n\u001a\u00060\bj\u0002`\tH\u0002¢\u0006\u0004\b\f\u0010\rJ1\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\n\u0010\n\u001a\u00060\bj\u0002`\t¢\u0006\u0004\b\u0010\u0010\u0011R$\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/geo/addresseditformprompt/OpenSearchActionHandler;", "", "<init>", "()V", "LW10/c;", "trackingData", "Lru/ozon/app/android/yandexsearchsheet/YandexSearchSheetSharedViewModel;", "yandexSearchSheetSharedViewModel", "La00/f;", "Lru/ozon/app/android/composer/OwnerContainer;", "container", "", "openYandexSearchSheetFragment", "(LW10/c;Lru/ozon/app/android/yandexsearchsheet/YandexSearchSheetSharedViewModel;La00/f;)V", "Lru/ozon/uni/atoms/af/AtomAction$Click;", "action", "handle", "(Lru/ozon/uni/atoms/af/AtomAction$Click;LW10/c;Lru/ozon/app/android/yandexsearchsheet/YandexSearchSheetSharedViewModel;La00/f;)V", "Lru/ozon/app/android/yandexsearchsheet/YandexSearchSheetFragment$Data;", "openSearchOptions", "Lru/ozon/app/android/yandexsearchsheet/YandexSearchSheetFragment$Data;", "getOpenSearchOptions", "()Lru/ozon/app/android/yandexsearchsheet/YandexSearchSheetFragment$Data;", "setOpenSearchOptions", "(Lru/ozon/app/android/yandexsearchsheet/YandexSearchSheetFragment$Data;)V", "Companion", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class OpenSearchActionHandler {
    private YandexSearchSheetFragment.Data openSearchOptions;

    private final void openYandexSearchSheetFragment(c trackingData, YandexSearchSheetSharedViewModel yandexSearchSheetSharedViewModel, C4911f container) {
        YandexSearchSheetFragment.Data data = this.openSearchOptions;
        if (data != null) {
            ShowYandexSearchSheetAction showYandexSearchSheetAction = new ShowYandexSearchSheetAction(data, 1000, trackingData);
            if (yandexSearchSheetSharedViewModel.showYandexSearchSheet(showYandexSearchSheetAction)) {
                return;
            }
            YandexSearchSheetFragment.INSTANCE.show(showYandexSearchSheetAction, container.j(), container.k());
        }
    }

    public final void handle(@NotNull AtomAction.Click action, @NotNull c trackingData, @NotNull YandexSearchSheetSharedViewModel yandexSearchSheetSharedViewModel, @NotNull C4911f container) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        Intrinsics.checkNotNullParameter(yandexSearchSheetSharedViewModel, "yandexSearchSheetSharedViewModel");
        Intrinsics.checkNotNullParameter(container, "container");
        if (Intrinsics.d(action.getId(), "openSearch")) {
            openYandexSearchSheetFragment(trackingData, yandexSearchSheetSharedViewModel, container);
        }
    }

    public final void setOpenSearchOptions(YandexSearchSheetFragment.Data data) {
        this.openSearchOptions = data;
    }
}

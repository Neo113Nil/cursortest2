package ru.ozon.app.android.storefront.feature.notifications.widgets.promopushenable.presentation;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.feature.notifications.utils.ViewIntent;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"ru/ozon/app/android/storefront/feature/notifications/widgets/promopushenable/presentation/PromoPushEnableViewIntent$OnToggleClick", "", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "cell", "<init>", "(Lru/ozon/uni/atoms/data/dsCell/CellDTO;)V", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getCell", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "notifications_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PromoPushEnableViewIntent$OnToggleClick implements ViewIntent {
    public static final int $stable = CellDTO.$stable;

    @NotNull
    private final CellDTO cell;

    public PromoPushEnableViewIntent$OnToggleClick(@NotNull CellDTO cell) {
        Intrinsics.checkNotNullParameter(cell, "cell");
        this.cell = cell;
    }

    @NotNull
    public final CellDTO getCell() {
        return this.cell;
    }
}

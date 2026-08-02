package ru.ozon.app.android.cml.delivery.widgets.boxList.di;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cml.delivery.widgets.boxList.data.BoxListConfig;
import ru.ozon.app.android.cml.delivery.widgets.boxList.presentation.mapper.BoxListViewMapper;
import ru.ozon.app.android.cml.delivery.widgets.boxList.presentation.mapper.SelectButtonViewMapper;
import ru.ozon.app.android.composer.widgets.v2.ViewMapper2;
import ru.ozon.app.android.composer.widgets.v2.Widget2;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007¨\u0006\f"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/boxList/di/BoxListWidgetModule;", "", "<init>", "()V", "provideBoxListWidget", "Lru/ozon/app/android/composer/widgets/v2/Widget2;", "config", "Lru/ozon/app/android/cml/delivery/widgets/boxList/data/BoxListConfig;", "boxListViewMapper", "Lru/ozon/app/android/cml/delivery/widgets/boxList/presentation/mapper/BoxListViewMapper;", "selectButtonViewMapper", "Lru/ozon/app/android/cml/delivery/widgets/boxList/presentation/mapper/SelectButtonViewMapper;", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BoxListWidgetModule {

    @NotNull
    public static final BoxListWidgetModule INSTANCE = new BoxListWidgetModule();

    private BoxListWidgetModule() {
    }

    @NotNull
    public final Widget2 provideBoxListWidget(@NotNull BoxListConfig config, @NotNull BoxListViewMapper boxListViewMapper, @NotNull SelectButtonViewMapper selectButtonViewMapper) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(boxListViewMapper, "boxListViewMapper");
        Intrinsics.checkNotNullParameter(selectButtonViewMapper, "selectButtonViewMapper");
        return new Widget2("cml", "boxList", config, new ViewMapper2[]{boxListViewMapper, selectButtonViewMapper});
    }
}

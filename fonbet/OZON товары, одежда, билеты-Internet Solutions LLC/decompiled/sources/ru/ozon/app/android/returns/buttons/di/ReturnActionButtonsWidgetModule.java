package ru.ozon.app.android.returns.buttons.di;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.ViewMapper2;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.returns.buttons.core.ReturnActionButtonsConfig;
import ru.ozon.app.android.returns.buttons.viewMapper.ReturnActionButtonsViewMapper;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0001¢\u0006\u0002\b\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/returns/buttons/di/ReturnActionButtonsWidgetModule;", "", "<init>", "()V", "provideWidget", "Lru/ozon/app/android/composer/widgets/v2/Widget2;", "config", "Lru/ozon/app/android/returns/buttons/core/ReturnActionButtonsConfig;", "mapper", "Lru/ozon/app/android/returns/buttons/viewMapper/ReturnActionButtonsViewMapper;", "provideWidget$details_prodGoogleAllVendorsRelease", "details_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ReturnActionButtonsWidgetModule {
    @NotNull
    public final Widget2 provideWidget$details_prodGoogleAllVendorsRelease(@NotNull ReturnActionButtonsConfig config, @NotNull ReturnActionButtonsViewMapper mapper) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        return new Widget2("rms", "returnActionButtons", config, new ViewMapper2[]{mapper});
    }
}

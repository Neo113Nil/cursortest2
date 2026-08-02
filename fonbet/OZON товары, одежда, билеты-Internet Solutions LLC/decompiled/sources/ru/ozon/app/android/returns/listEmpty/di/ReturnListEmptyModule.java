package ru.ozon.app.android.returns.listEmpty.di;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.ViewMapper2;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.returns.listEmpty.data.ReturnListEmptyConfig;
import ru.ozon.app.android.returns.listEmpty.presentation.banner.mapper.BannerViewMapper;
import ru.ozon.app.android.returns.listEmpty.presentation.instruction.mapper.InstructionViewMapper;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0001¢\u0006\u0002\b\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/returns/listEmpty/di/ReturnListEmptyModule;", "", "<init>", "()V", "provideWidget", "Lru/ozon/app/android/composer/widgets/v2/Widget2;", "config", "Lru/ozon/app/android/returns/listEmpty/data/ReturnListEmptyConfig;", "bannerViewMapper", "Lru/ozon/app/android/returns/listEmpty/presentation/banner/mapper/BannerViewMapper;", "instructionViewMapper", "Lru/ozon/app/android/returns/listEmpty/presentation/instruction/mapper/InstructionViewMapper;", "provideWidget$details_prodGoogleAllVendorsRelease", "details_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ReturnListEmptyModule {
    @NotNull
    public final Widget2 provideWidget$details_prodGoogleAllVendorsRelease(@NotNull ReturnListEmptyConfig config, @NotNull BannerViewMapper bannerViewMapper, @NotNull InstructionViewMapper instructionViewMapper) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(bannerViewMapper, "bannerViewMapper");
        Intrinsics.checkNotNullParameter(instructionViewMapper, "instructionViewMapper");
        return new Widget2("rms", "returnListEmpty", config, new ViewMapper2[]{bannerViewMapper, instructionViewMapper});
    }
}

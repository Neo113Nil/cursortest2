package ru.ozon.app.android.fresh.main.widgets.header.di;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.ViewMapper2;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.fresh.common.widgets.header.HeaderApi;
import ru.ozon.app.android.fresh.main.widgets.header.data.HeaderConfig;
import ru.ozon.app.android.fresh.main.widgets.header.presentation.HeaderViewMapper;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\tH\u0007¨\u0006\f"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/header/di/HeaderWidgetModule;", "", "<init>", "()V", "provideWidget", "Lru/ozon/app/android/composer/widgets/v2/Widget2;", "headerConfig", "Lru/ozon/app/android/fresh/main/widgets/header/data/HeaderConfig;", "headerViewMapper", "Lru/ozon/app/android/fresh/main/widgets/header/presentation/HeaderViewMapper;", "provideHeaderApi", "Lru/ozon/app/android/fresh/common/widgets/header/HeaderApi;", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class HeaderWidgetModule {
    @NotNull
    public final HeaderApi provideHeaderApi(@NotNull HeaderViewMapper headerViewMapper) {
        Intrinsics.checkNotNullParameter(headerViewMapper, "headerViewMapper");
        return new HeaderApiImpl(headerViewMapper);
    }

    @NotNull
    public final Widget2 provideWidget(@NotNull HeaderConfig headerConfig, @NotNull HeaderViewMapper headerViewMapper) {
        Intrinsics.checkNotNullParameter(headerConfig, "headerConfig");
        Intrinsics.checkNotNullParameter(headerViewMapper, "headerViewMapper");
        return new Widget2(headerConfig.getVertical(), CommentV3DTO.HEADER_FIELD_NAME, headerConfig, new ViewMapper2[]{headerViewMapper});
    }
}

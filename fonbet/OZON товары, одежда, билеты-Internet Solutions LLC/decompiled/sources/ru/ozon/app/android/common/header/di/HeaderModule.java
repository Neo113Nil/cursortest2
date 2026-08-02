package ru.ozon.app.android.common.header.di;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.header.core.HeaderConfig;
import ru.ozon.android.composerCommonViewKit.header.core.HeaderViewMapper;
import ru.ozon.app.android.composer.di.Widget;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0001¢\u0006\u0002\b\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/common/header/di/HeaderModule;", "", "<init>", "()V", "provideHeader", "Lru/ozon/app/android/composer/di/Widget;", "viewMapper", "Lru/ozon/android/composerCommonViewKit/header/core/HeaderViewMapper;", "config", "Lru/ozon/android/composerCommonViewKit/header/core/HeaderConfig;", "provideHeader$header_prodGoogleAllVendorsRelease", "header_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class HeaderModule {

    @NotNull
    public static final HeaderModule INSTANCE = new HeaderModule();

    private HeaderModule() {
    }

    @NotNull
    public final Widget provideHeader$header_prodGoogleAllVendorsRelease(@NotNull HeaderViewMapper viewMapper, @NotNull HeaderConfig config) {
        Intrinsics.checkNotNullParameter(viewMapper, "viewMapper");
        Intrinsics.checkNotNullParameter(config, "config");
        return new Widget("common", CommentV3DTO.HEADER_FIELD_NAME, config, new HeaderViewMapper[]{viewMapper});
    }
}

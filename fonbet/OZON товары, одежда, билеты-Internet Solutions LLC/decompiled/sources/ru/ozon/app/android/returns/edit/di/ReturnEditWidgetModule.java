package ru.ozon.app.android.returns.edit.di;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.ViewMapper2;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.islandSeparator.core.CommonIslandSeparatorViewMapper2;
import ru.ozon.app.android.returns.edit.data.ReturnEditConfig;
import ru.ozon.app.android.returns.edit.presentation.comment.ReturnTextEditBlockViewMapper;
import ru.ozon.app.android.returns.edit.presentation.photo.ReturnImageEditViewMapper;
import ru.ozon.app.android.returns.edit.presentation.sticky.ReturnEditStickyViewMapper;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0001¢\u0006\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/returns/edit/di/ReturnEditWidgetModule;", "", "<init>", "()V", "provideWidget", "Lru/ozon/app/android/composer/widgets/v2/Widget2;", "config", "Lru/ozon/app/android/returns/edit/data/ReturnEditConfig;", "textEditBlockViewMapper", "Lru/ozon/app/android/returns/edit/presentation/comment/ReturnTextEditBlockViewMapper;", "imageEditViewMapper", "Lru/ozon/app/android/returns/edit/presentation/photo/ReturnImageEditViewMapper;", "returnEditStickyViewMapper", "Lru/ozon/app/android/returns/edit/presentation/sticky/ReturnEditStickyViewMapper;", "islandSeparatorViewMapper", "Lru/ozon/app/android/islandSeparator/core/CommonIslandSeparatorViewMapper2;", "provideWidget$details_prodGoogleAllVendorsRelease", "details_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ReturnEditWidgetModule {
    @NotNull
    public final Widget2 provideWidget$details_prodGoogleAllVendorsRelease(@NotNull ReturnEditConfig config, @NotNull ReturnTextEditBlockViewMapper textEditBlockViewMapper, @NotNull ReturnImageEditViewMapper imageEditViewMapper, @NotNull ReturnEditStickyViewMapper returnEditStickyViewMapper, @NotNull CommonIslandSeparatorViewMapper2 islandSeparatorViewMapper) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(textEditBlockViewMapper, "textEditBlockViewMapper");
        Intrinsics.checkNotNullParameter(imageEditViewMapper, "imageEditViewMapper");
        Intrinsics.checkNotNullParameter(returnEditStickyViewMapper, "returnEditStickyViewMapper");
        Intrinsics.checkNotNullParameter(islandSeparatorViewMapper, "islandSeparatorViewMapper");
        return new Widget2("rms", "returnEdit", config, new ViewMapper2[]{textEditBlockViewMapper, returnEditStickyViewMapper, imageEditViewMapper, islandSeparatorViewMapper});
    }
}

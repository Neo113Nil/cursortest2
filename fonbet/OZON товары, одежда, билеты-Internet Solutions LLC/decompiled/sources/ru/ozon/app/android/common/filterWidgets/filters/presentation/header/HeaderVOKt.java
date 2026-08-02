package ru.ozon.app.android.common.filterWidgets.filters.presentation.header;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.common.filterWidgets.filters.data.HeaderModel;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¨\u0006\u0005"}, d2 = {"toVo", "Lru/ozon/app/android/common/filterWidgets/filters/presentation/header/HeaderVO;", "Lru/ozon/app/android/common/filterWidgets/filters/data/HeaderModel;", "stateId", "", "filter-widgets_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class HeaderVOKt {
    @NotNull
    public static final HeaderVO toVo(@NotNull HeaderModel headerModel, @NotNull String stateId) {
        Intrinsics.checkNotNullParameter(headerModel, "<this>");
        Intrinsics.checkNotNullParameter(stateId, "stateId");
        return new HeaderVO(stateId.hashCode(), headerModel.getHeader().getTitle(), headerModel.getHeader().getLargeButton(), headerModel.getHeader().getRightButton(), headerModel.getOriginalUrl());
    }
}

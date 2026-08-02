package ru.ozon.app.android.commonwidgets.widgets.emptyState.core;

import GZ.g;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.common.emptyState.EmptyStateVO;
import ru.ozon.app.android.common.emptyState.EmptyStateViewMapper;
import ru.ozon.app.android.commonwidgets.widgets.emptyState.data.EmptyStateDTO;
import ru.ozon.app.android.network.abtool.FeatureChecker;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR6\u0010\u000e\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\nj\u0002`\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/emptyState/core/CommonEmptyStateViewMapper;", "Lru/ozon/app/android/common/emptyState/EmptyStateViewMapper;", "Lru/ozon/app/android/commonwidgets/widgets/emptyState/data/EmptyStateDTO;", "LGZ/g;", "router", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "<init>", "(LGZ/g;Lru/ozon/app/android/network/abtool/FeatureChecker;)V", "Lkotlin/Function2;", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "", "Lru/ozon/app/android/common/emptyState/EmptyStateVO;", "mapper", "Lkotlin/jvm/functions/Function2;", "getMapper", "()Lkotlin/jvm/functions/Function2;", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CommonEmptyStateViewMapper extends EmptyStateViewMapper<EmptyStateDTO> {

    @NotNull
    private final Function2<EmptyStateDTO, d, List<EmptyStateVO>> mapper;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonEmptyStateViewMapper(@NotNull g router, @NotNull FeatureChecker featureChecker) {
        super(featureChecker, router);
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        this.mapper = CommonEmptyStateViewMapper$mapper$1.INSTANCE;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<EmptyStateDTO, d, List<EmptyStateVO>> getMapper() {
        return this.mapper;
    }
}

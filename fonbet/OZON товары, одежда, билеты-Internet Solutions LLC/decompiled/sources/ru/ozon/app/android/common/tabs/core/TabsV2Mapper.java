package ru.ozon.app.android.common.tabs.core;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.common.tabs.data.TabsV2DTO;
import ru.ozon.app.android.common.tabs.presentation.TabsV2VO;
import ru.ozon.app.android.utils.AppType;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00112*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006:\u0001\u0011B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ*\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000b\u001a\u00020\u00022\n\u0010\r\u001a\u00060\u0003j\u0002`\fH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0010¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/common/tabs/core/TabsV2Mapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/common/tabs/data/TabsV2DTO;", "Ll20/d;", "", "Lru/ozon/app/android/common/tabs/presentation/TabsV2VO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Lru/ozon/app/android/utils/AppType;", "appType", "<init>", "(Lru/ozon/app/android/utils/AppType;)V", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/common/tabs/data/TabsV2DTO;Ll20/d;)Ljava/util/List;", "Lru/ozon/app/android/utils/AppType;", "Companion", "tabs_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TabsV2Mapper implements Function2<TabsV2DTO, d, List<? extends TabsV2VO>> {

    @NotNull
    private final AppType appType;

    public TabsV2Mapper(@NotNull AppType appType) {
        Intrinsics.checkNotNullParameter(appType, "appType");
        this.appType = appType;
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<TabsV2VO> invoke(@NotNull TabsV2DTO state, @NotNull d widgetInfo) {
        TabsV2VO vo;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        vo = TabsV2MapperKt.toVo(state, widgetInfo.d().hashCode(), this.appType);
        return C7714v.a0(vo);
    }
}

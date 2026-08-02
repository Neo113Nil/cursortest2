package ru.ozon.app.android.storefront.widgets.naviBlocksV3.di;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.storefront.widgets.naviBlocksV3.core.NaviBlocksV3Mapper;
import ru.ozon.app.android.utils.AppType;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/storefront/widgets/naviBlocksV3/core/NaviBlocksV3Mapper;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class NaviBlocksV3WidgetComponent$Companion$create$1$1$mapper$2 extends AbstractC7737t implements Function0<NaviBlocksV3Mapper> {
    final /* synthetic */ NaviBlocksV3WidgetComponent$Companion$create$1$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NaviBlocksV3WidgetComponent$Companion$create$1$1$mapper$2(NaviBlocksV3WidgetComponent$Companion$create$1$1 naviBlocksV3WidgetComponent$Companion$create$1$1) {
        super(0);
        this.this$0 = naviBlocksV3WidgetComponent$Companion$create$1$1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final NaviBlocksV3Mapper invoke() {
        AppType appType;
        appType = this.this$0.appType;
        return new NaviBlocksV3Mapper(appType);
    }
}

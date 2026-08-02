package ru.ozon.app.android.tabbar.data;

import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000b\u0010\u0003\u001a\u00070\u0004¢\u0006\u0002\b\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "Lru/ozon/app/android/tabbar/data/TabConfig;", "kotlin.jvm.PlatformType", "it", "Lru/ozon/app/android/tabbar/data/TabConfigResponse;", "Lkotlin/jvm/internal/EnhancedNullability;", "invoke", "(Lru/ozon/app/android/tabbar/data/TabConfigResponse;)Lru/ozon/app/android/tabbar/data/TabConfig;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class TabConfigManagerImpl$loadTabConfig$2 extends AbstractC7737t implements Function1<TabConfigResponse, TabConfig> {
    final /* synthetic */ String $configName;
    final /* synthetic */ TabConfigManagerImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TabConfigManagerImpl$loadTabConfig$2(TabConfigManagerImpl tabConfigManagerImpl, String str) {
        super(1);
        this.this$0 = tabConfigManagerImpl;
        this.$configName = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final TabConfig invoke(TabConfigResponse it) {
        Set set;
        Set set2;
        RemoteTabConfig mapConfig;
        Intrinsics.checkNotNullParameter(it, "it");
        set = this.this$0.remoteLoadedConfigNames;
        boolean z11 = !set.contains(this.$configName);
        set2 = this.this$0.remoteLoadedConfigNames;
        set2.add(this.$configName);
        mapConfig = this.this$0.mapConfig(it, this.$configName, Boolean.valueOf(z11));
        return mapConfig;
    }
}

package ru.ozon.app.android.tabbar.data;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0017\u0010\u0003\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"<anonymous>", "Lru/ozon/app/android/tabbar/data/TabConfig;", "kotlin.jvm.PlatformType", "it", "", "", "Lru/ozon/app/android/tabbar/data/TabConfigResponse;", "Lkotlin/jvm/internal/EnhancedNullability;", "invoke", "(Ljava/util/Map;)Lru/ozon/app/android/tabbar/data/TabConfig;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class TabConfigManagerImpl$loadCachedConfig$1 extends AbstractC7737t implements Function1<Map<String, ? extends TabConfigResponse>, TabConfig> {
    final /* synthetic */ String $configName;
    final /* synthetic */ TabConfigManagerImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TabConfigManagerImpl$loadCachedConfig$1(TabConfigManagerImpl tabConfigManagerImpl, String str) {
        super(1);
        this.this$0 = tabConfigManagerImpl;
        this.$configName = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ TabConfig invoke(Map<String, ? extends TabConfigResponse> map) {
        return invoke2((Map<String, TabConfigResponse>) map);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final TabConfig invoke2(Map<String, TabConfigResponse> it) {
        TabConfig mapCachedConfig;
        Intrinsics.checkNotNullParameter(it, "it");
        mapCachedConfig = this.this$0.mapCachedConfig(it, this.$configName);
        return mapCachedConfig;
    }
}

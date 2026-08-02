package ru.ozon.app.android.tabbar.data;

import Sc.s;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.tabbar.data.api.TabConfigApi;
import ru.ozon.app.android.tabbar.data.api.TabConfigRequest;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "Lru/ozon/app/android/tabbar/data/TabConfigResponse;", "<anonymous>", "(Lxe/M;)Lru/ozon/app/android/tabbar/data/TabConfigResponse;"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.tabbar.data.TabBarConfigRepositoryImpl$loadTabBarConfig$2", f = "TabBarConfigRepositoryImpl.kt", l = {20}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class TabBarConfigRepositoryImpl$loadTabBarConfig$2 extends j implements Function2<M, d<? super TabConfigResponse>, Object> {
    final /* synthetic */ String $miniAppName;
    final /* synthetic */ String $referrerMiniAppName;
    int label;
    final /* synthetic */ TabBarConfigRepositoryImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TabBarConfigRepositoryImpl$loadTabBarConfig$2(TabBarConfigRepositoryImpl tabBarConfigRepositoryImpl, String str, String str2, d<? super TabBarConfigRepositoryImpl$loadTabBarConfig$2> dVar) {
        super(2, dVar);
        this.this$0 = tabBarConfigRepositoryImpl;
        this.$miniAppName = str;
        this.$referrerMiniAppName = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new TabBarConfigRepositoryImpl$loadTabBarConfig$2(this.this$0, this.$miniAppName, this.$referrerMiniAppName, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        TabConfigApi tabConfigApi;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            return obj;
        }
        s.b(obj);
        tabConfigApi = this.this$0.tabConfigApi;
        TabConfigRequest tabConfigRequest = new TabConfigRequest(this.$miniAppName, this.$referrerMiniAppName);
        this.label = 1;
        Object tabBarConfig = tabConfigApi.getTabBarConfig(tabConfigRequest, this);
        return tabBarConfig == aVar ? aVar : tabBarConfig;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super TabConfigResponse> dVar) {
        return ((TabBarConfigRepositoryImpl$loadTabBarConfig$2) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}

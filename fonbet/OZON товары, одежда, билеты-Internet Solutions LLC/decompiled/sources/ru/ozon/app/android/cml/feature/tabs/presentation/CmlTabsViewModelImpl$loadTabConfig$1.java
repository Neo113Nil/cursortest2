package ru.ozon.app.android.cml.feature.tabs.presentation;

import Sc.s;
import Wc.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.cml.feature.tabs.data.CmlTabConfigMapper;
import ru.ozon.app.android.cml.feature.tabs.presentation.CmlTabsScreenState;
import ru.ozon.app.android.tabbar.data.RemoteTabConfig;
import ru.ozon.app.android.tabbar.data.TabConfigRepository;
import ru.ozon.app.android.tabbar.data.TabConfigResponse;
import ru.ozon.app.android.tabbar.data.local.TabConfigCache;
import xe.M;
import xe.N;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.cml.feature.tabs.presentation.CmlTabsViewModelImpl$loadTabConfig$1", f = "CmlTabsViewModel.kt", l = {98}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class CmlTabsViewModelImpl$loadTabConfig$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ String $miniAppName;
    final /* synthetic */ String $referrerMiniAppName;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CmlTabsViewModelImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CmlTabsViewModelImpl$loadTabConfig$1(CmlTabsViewModelImpl cmlTabsViewModelImpl, String str, String str2, d<? super CmlTabsViewModelImpl$loadTabConfig$1> dVar) {
        super(2, dVar);
        this.this$0 = cmlTabsViewModelImpl;
        this.$miniAppName = str;
        this.$referrerMiniAppName = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        CmlTabsViewModelImpl$loadTabConfig$1 cmlTabsViewModelImpl$loadTabConfig$1 = new CmlTabsViewModelImpl$loadTabConfig$1(this.this$0, this.$miniAppName, this.$referrerMiniAppName, dVar);
        cmlTabsViewModelImpl$loadTabConfig$1.L$0 = obj;
        return cmlTabsViewModelImpl$loadTabConfig$1;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0077  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        M m11;
        Throwable th2;
        TabConfigRepository tabConfigRepository;
        TabConfigResponse tabConfigResponse;
        List list;
        TabConfigCache tabConfigCache;
        CmlTabConfigMapper cmlTabConfigMapper;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            M m12 = (M) this.L$0;
            this.this$0.getScreenState().setValue(CmlTabsScreenState.Loading.INSTANCE);
            try {
                tabConfigRepository = this.this$0.repository;
                String str = this.$miniAppName;
                String str2 = this.$referrerMiniAppName;
                this.L$0 = m12;
                this.label = 1;
                Object loadTabBarConfig = tabConfigRepository.loadTabBarConfig(str, str2, this);
                if (loadTabBarConfig == aVar) {
                    return aVar;
                }
                m11 = m12;
                obj = loadTabBarConfig;
            } catch (Throwable th3) {
                m11 = m12;
                th2 = th3;
                Lm0.a.f17149a.e(th2);
                list = this.this$0.defaultTabs;
                tabConfigResponse = new TabConfigResponse(null, list);
                tabConfigCache = this.this$0.cache;
                tabConfigCache.saveConfig("cml", tabConfigResponse);
                cmlTabConfigMapper = this.this$0.tabConfigMapper;
                RemoteTabConfig mapTabConfig = cmlTabConfigMapper.mapTabConfig(tabConfigResponse);
                if (N.f(m11)) {
                }
                return Unit.f71690a;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            m11 = (M) this.L$0;
            try {
                s.b(obj);
            } catch (Throwable th4) {
                th2 = th4;
                Lm0.a.f17149a.e(th2);
                list = this.this$0.defaultTabs;
                tabConfigResponse = new TabConfigResponse(null, list);
                tabConfigCache = this.this$0.cache;
                tabConfigCache.saveConfig("cml", tabConfigResponse);
                cmlTabConfigMapper = this.this$0.tabConfigMapper;
                RemoteTabConfig mapTabConfig2 = cmlTabConfigMapper.mapTabConfig(tabConfigResponse);
                if (N.f(m11)) {
                }
                return Unit.f71690a;
            }
        }
        tabConfigResponse = (TabConfigResponse) obj;
        tabConfigCache = this.this$0.cache;
        tabConfigCache.saveConfig("cml", tabConfigResponse);
        cmlTabConfigMapper = this.this$0.tabConfigMapper;
        RemoteTabConfig mapTabConfig22 = cmlTabConfigMapper.mapTabConfig(tabConfigResponse);
        if (N.f(m11)) {
            this.this$0.getScreenState().setValue(new CmlTabsScreenState.Success(mapTabConfig22));
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((CmlTabsViewModelImpl$loadTabConfig$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}

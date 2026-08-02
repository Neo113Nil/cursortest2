package ru.ozon.app.android.fresh.feature.entry.data;

import Sc.s;
import Wc.a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.tabbar.data.TabConfigResponse;
import ru.ozon.app.android.tabbar.miniapp.fresh.FreshTabBarApi;
import ru.ozon.app.android.tabbar.miniapp.fresh.FreshTabConfigMapper;
import ru.ozon.app.android.tabbar.miniapp.fresh.FreshTabData;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "Lru/ozon/app/android/tabbar/miniapp/fresh/FreshTabData;", "<anonymous>", "(Lxe/M;)Lru/ozon/app/android/tabbar/miniapp/fresh/FreshTabData;"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.fresh.feature.entry.data.OzonFreshTabConfigRepository$getTabConfig$2", f = "OzonFreshTabConfigRepository.kt", l = {21}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class OzonFreshTabConfigRepository$getTabConfig$2 extends j implements Function2<M, d<? super FreshTabData>, Object> {
    int label;
    final /* synthetic */ OzonFreshTabConfigRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OzonFreshTabConfigRepository$getTabConfig$2(OzonFreshTabConfigRepository ozonFreshTabConfigRepository, d<? super OzonFreshTabConfigRepository$getTabConfig$2> dVar) {
        super(2, dVar);
        this.this$0 = ozonFreshTabConfigRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new OzonFreshTabConfigRepository$getTabConfig$2(this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        FreshTabBarApi freshTabBarApi;
        FreshTabConfigMapper freshTabConfigMapper;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            freshTabBarApi = this.this$0.freshTabBarApi;
            Map<String, String> c11 = U.c();
            this.label = 1;
            obj = freshTabBarApi.getNewTabsData(c11, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        freshTabConfigMapper = this.this$0.mapper;
        return freshTabConfigMapper.mapResponseToModel((TabConfigResponse) obj);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super FreshTabData> dVar) {
        return ((OzonFreshTabConfigRepository$getTabConfig$2) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}

package ru.ozon.app.android.tabbar.miniapp.fresh;

import Sc.s;
import Wc.a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.tabbar.data.TabConfigResponse;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "Lru/ozon/app/android/tabbar/miniapp/fresh/FreshTabData;", "<anonymous>", "(Lxe/M;)Lru/ozon/app/android/tabbar/miniapp/fresh/FreshTabData;"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.tabbar.miniapp.fresh.FreshTabConfigRepositoryImpl$getNewTabsData$2", f = "FreshTabConfigRepository.kt", l = {20}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class FreshTabConfigRepositoryImpl$getNewTabsData$2 extends j implements Function2<M, d<? super FreshTabData>, Object> {
    final /* synthetic */ Map<String, String> $freshCategory;
    int label;
    final /* synthetic */ FreshTabConfigRepositoryImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FreshTabConfigRepositoryImpl$getNewTabsData$2(FreshTabConfigRepositoryImpl freshTabConfigRepositoryImpl, Map<String, String> map, d<? super FreshTabConfigRepositoryImpl$getNewTabsData$2> dVar) {
        super(2, dVar);
        this.this$0 = freshTabConfigRepositoryImpl;
        this.$freshCategory = map;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new FreshTabConfigRepositoryImpl$getNewTabsData$2(this.this$0, this.$freshCategory, dVar);
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
            Map<String, String> map = this.$freshCategory;
            this.label = 1;
            obj = freshTabBarApi.getNewTabsData(map, this);
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
        return ((FreshTabConfigRepositoryImpl$getNewTabsData$2) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}

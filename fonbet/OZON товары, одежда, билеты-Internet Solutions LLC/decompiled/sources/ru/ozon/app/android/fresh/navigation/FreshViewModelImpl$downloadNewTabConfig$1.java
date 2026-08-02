package ru.ozon.app.android.fresh.navigation;

import Sc.s;
import Wc.a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.fresh.navigation.FreshScreenState;
import ru.ozon.app.android.tabbar.miniapp.fresh.FreshTabConfigRepository;
import ru.ozon.app.android.tabbar.miniapp.fresh.FreshTabData;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.fresh.navigation.FreshViewModelImpl$downloadNewTabConfig$1", f = "FreshViewModel.kt", l = {108}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class FreshViewModelImpl$downloadNewTabConfig$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ String $deeplink;
    int label;
    final /* synthetic */ FreshViewModelImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FreshViewModelImpl$downloadNewTabConfig$1(FreshViewModelImpl freshViewModelImpl, String str, d<? super FreshViewModelImpl$downloadNewTabConfig$1> dVar) {
        super(2, dVar);
        this.this$0 = freshViewModelImpl;
        this.$deeplink = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new FreshViewModelImpl$downloadNewTabConfig$1(this.this$0, this.$deeplink, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        FreshTabConfigRepository freshTabConfigRepository;
        FreshTabData defaultTabs;
        FreshTabConfigRepository freshTabConfigRepository2;
        Map<String, String> deeplinkParamMap;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        try {
            if (i11 == 0) {
                s.b(obj);
                this.this$0.getScreenState().setValue(FreshScreenState.Loading.INSTANCE);
                freshTabConfigRepository2 = this.this$0.freshTabConfigRepo;
                deeplinkParamMap = this.this$0.toDeeplinkParamMap(this.$deeplink);
                this.label = 1;
                obj = freshTabConfigRepository2.getNewTabsData(deeplinkParamMap, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            defaultTabs = (FreshTabData) obj;
        } catch (Exception unused) {
            freshTabConfigRepository = this.this$0.freshTabConfigRepo;
            defaultTabs = freshTabConfigRepository.getDefaultTabs();
        }
        this.this$0.handleNewTabState(defaultTabs);
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((FreshViewModelImpl$downloadNewTabConfig$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}

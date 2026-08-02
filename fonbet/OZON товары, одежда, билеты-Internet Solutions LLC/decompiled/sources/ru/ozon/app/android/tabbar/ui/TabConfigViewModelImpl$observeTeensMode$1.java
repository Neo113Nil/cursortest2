package ru.ozon.app.android.tabbar.ui;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.storefrontcommonwidgets.services.TeensModeInfo;
import ru.ozon.app.android.tabbar.domain.TabConfigUpdateDelegate;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "info", "Lru/ozon/app/android/storefrontcommonwidgets/services/TeensModeInfo;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.tabbar.ui.TabConfigViewModelImpl$observeTeensMode$1", f = "TabConfigViewModelImpl.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes7.dex */
final class TabConfigViewModelImpl$observeTeensMode$1 extends j implements Function2<TeensModeInfo, d<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ TabConfigViewModelImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TabConfigViewModelImpl$observeTeensMode$1(TabConfigViewModelImpl tabConfigViewModelImpl, d<? super TabConfigViewModelImpl$observeTeensMode$1> dVar) {
        super(2, dVar);
        this.this$0 = tabConfigViewModelImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        TabConfigViewModelImpl$observeTeensMode$1 tabConfigViewModelImpl$observeTeensMode$1 = new TabConfigViewModelImpl$observeTeensMode$1(this.this$0, dVar);
        tabConfigViewModelImpl$observeTeensMode$1.L$0 = obj;
        return tabConfigViewModelImpl$observeTeensMode$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        TabConfigUpdateDelegate tabConfigUpdateDelegate;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        TeensModeInfo teensModeInfo = (TeensModeInfo) this.L$0;
        this.this$0.loadCachedConfig();
        tabConfigUpdateDelegate = this.this$0.tabConfigUpdateDelegate;
        tabConfigUpdateDelegate.updateMainTabBarConfig();
        this.this$0.clearBackStackAndRedirect(teensModeInfo.getRedirectLink());
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(TeensModeInfo teensModeInfo, d<? super Unit> dVar) {
        return ((TabConfigViewModelImpl$observeTeensMode$1) create(teensModeInfo, dVar)).invokeSuspend(Unit.f71690a);
    }
}

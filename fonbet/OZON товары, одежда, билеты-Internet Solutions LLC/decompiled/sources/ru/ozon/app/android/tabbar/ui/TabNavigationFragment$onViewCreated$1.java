package ru.ozon.app.android.tabbar.ui;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.tabbar.data.TabConfig;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, d2 = {"<anonymous>", "", "tabConfig", "Lru/ozon/app/android/tabbar/data/TabConfig;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.tabbar.ui.TabNavigationFragment$onViewCreated$1", f = "TabNavigationFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes7.dex */
final class TabNavigationFragment$onViewCreated$1 extends j implements Function2<TabConfig, d<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ TabNavigationFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TabNavigationFragment$onViewCreated$1(TabNavigationFragment tabNavigationFragment, d<? super TabNavigationFragment$onViewCreated$1> dVar) {
        super(2, dVar);
        this.this$0 = tabNavigationFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        TabNavigationFragment$onViewCreated$1 tabNavigationFragment$onViewCreated$1 = new TabNavigationFragment$onViewCreated$1(this.this$0, dVar);
        tabNavigationFragment$onViewCreated$1.L$0 = obj;
        return tabNavigationFragment$onViewCreated$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        TabConfig tabConfig;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        TabConfig tabConfig2 = (TabConfig) this.L$0;
        tabConfig = this.this$0.config;
        if (Intrinsics.d(tabConfig, tabConfig2) || tabConfig2 == null) {
            return Unit.f71690a;
        }
        this.this$0.config = tabConfig2;
        this.this$0.bindBottomNavigation(tabConfig2);
        this.this$0.bindNavigator(tabConfig2);
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(TabConfig tabConfig, d<? super Unit> dVar) {
        return ((TabNavigationFragment$onViewCreated$1) create(tabConfig, dVar)).invokeSuspend(Unit.f71690a);
    }
}

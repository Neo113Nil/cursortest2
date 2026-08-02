package ru.ozon.app.android.common.tabs.core;

import Sc.s;
import Wc.a;
import We.A;
import We.C4873o;
import We.InterfaceC4875q;
import java.util.Iterator;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.network.di.NetworkComponentConfig;
import ru.ozon.app.android.storage.cookiePreference.RefreshByGenderCookieEvents;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.common.tabs.core.TabsV2ViewModel$checkTabCookie$1", f = "TabsV2ViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class TabsV2ViewModel$checkTabCookie$1 extends j implements Function2<M, d<? super Unit>, Object> {
    int label;
    final /* synthetic */ TabsV2ViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TabsV2ViewModel$checkTabCookie$1(TabsV2ViewModel tabsV2ViewModel, d<? super TabsV2ViewModel$checkTabCookie$1> dVar) {
        super(2, dVar);
        this.this$0 = tabsV2ViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new TabsV2ViewModel$checkTabCookie$1(this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC4875q interfaceC4875q;
        NetworkComponentConfig networkComponentConfig;
        Object obj2;
        String str;
        String str2;
        RefreshByGenderCookieEvents refreshByGenderCookieEvents;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        interfaceC4875q = this.this$0.cookieJar;
        A.b bVar = A.f33515l;
        networkComponentConfig = this.this$0.networkConfig;
        String i11 = networkComponentConfig.getAppDomain().i();
        bVar.getClass();
        Iterator<T> it = interfaceC4875q.loadForRequest(A.b.c(i11)).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (Intrinsics.d(((C4873o) obj2).f(), "apparelSelectedTab")) {
                break;
            }
        }
        C4873o c4873o = (C4873o) obj2;
        if (c4873o != null) {
            TabsV2ViewModel tabsV2ViewModel = this.this$0;
            str = tabsV2ViewModel.apparelSelectedTabCookie;
            if (!Intrinsics.d(str, c4873o.i())) {
                str2 = tabsV2ViewModel.apparelSelectedTabCookie;
                boolean z11 = str2.length() == 0;
                tabsV2ViewModel.apparelSelectedTabCookie = c4873o.i();
                if (!z11) {
                    refreshByGenderCookieEvents = tabsV2ViewModel.refreshByGenderCookieEvents;
                    String uuid = UUID.randomUUID().toString();
                    Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
                    refreshByGenderCookieEvents.refreshByGenderCookieChanged(uuid);
                }
            }
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((TabsV2ViewModel$checkTabCookie$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}

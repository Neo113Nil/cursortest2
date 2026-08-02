package ru.ozon.app.android.fresh.navigation.configurators;

import A00.a;
import Ae.C2399j;
import Ae.InterfaceC2395h;
import Sc.s;
import android.view.View;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5427n;
import androidx.lifecycle.J;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import l10.InterfaceC7851b;
import ru.ozon.app.android.composer.ConfiguratorReferences;
import ru.ozon.uni.core.UniColors;
import xe.M;
import xe.N;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.fresh.navigation.configurators.CategoryMainPageFreshConfigurator$changeBackgroundAfterLoading$1", f = "CategoryMainPageFreshConfigurator.kt", l = {40}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class CategoryMainPageFreshConfigurator$changeBackgroundAfterLoading$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ J $owner;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CategoryMainPageFreshConfigurator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CategoryMainPageFreshConfigurator$changeBackgroundAfterLoading$1(CategoryMainPageFreshConfigurator categoryMainPageFreshConfigurator, J j11, d<? super CategoryMainPageFreshConfigurator$changeBackgroundAfterLoading$1> dVar) {
        super(2, dVar);
        this.this$0 = categoryMainPageFreshConfigurator;
        this.$owner = j11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        CategoryMainPageFreshConfigurator$changeBackgroundAfterLoading$1 categoryMainPageFreshConfigurator$changeBackgroundAfterLoading$1 = new CategoryMainPageFreshConfigurator$changeBackgroundAfterLoading$1(this.this$0, this.$owner, dVar);
        categoryMainPageFreshConfigurator$changeBackgroundAfterLoading$1.L$0 = obj;
        return categoryMainPageFreshConfigurator$changeBackgroundAfterLoading$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        M m11;
        a aVar;
        InterfaceC7851b controller;
        InterfaceC2395h<a> eventsFlow;
        M m12;
        ComponentCallbacksC5392m c11;
        View view;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            m11 = (M) this.L$0;
            ConfiguratorReferences references = this.this$0.getReferences();
            aVar = null;
            if (references != null && (controller = references.getController()) != null && (eventsFlow = controller.getEventsFlow()) != null) {
                InterfaceC2395h a11 = C5427n.a(eventsFlow, this.$owner.getLifecycle(), AbstractC5434v.b.STARTED);
                CategoryMainPageFreshConfigurator$changeBackgroundAfterLoading$1$event$1 categoryMainPageFreshConfigurator$changeBackgroundAfterLoading$1$event$1 = new CategoryMainPageFreshConfigurator$changeBackgroundAfterLoading$1$event$1(null);
                this.L$0 = m11;
                this.label = 1;
                Object x11 = C2399j.x(a11, categoryMainPageFreshConfigurator$changeBackgroundAfterLoading$1$event$1, this);
                if (x11 == aVar2) {
                    return aVar2;
                }
                m12 = m11;
                obj = x11;
            }
            N.e(m11);
            if (aVar != null && (c11 = this.this$0.getContainer().c()) != null && (view = c11.getView()) != null) {
                view.setBackgroundResource(UniColors.BG_DARK_KEY.getResId());
            }
            return Unit.f71690a;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        m12 = (M) this.L$0;
        s.b(obj);
        aVar = (a) obj;
        m11 = m12;
        N.e(m11);
        if (aVar != null) {
            view.setBackgroundResource(UniColors.BG_DARK_KEY.getResId());
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((CategoryMainPageFreshConfigurator$changeBackgroundAfterLoading$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}

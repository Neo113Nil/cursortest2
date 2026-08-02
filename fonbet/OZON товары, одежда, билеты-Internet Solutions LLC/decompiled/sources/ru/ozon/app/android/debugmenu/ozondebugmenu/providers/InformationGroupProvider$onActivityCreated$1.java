package ru.ozon.app.android.debugmenu.ozondebugmenu.providers;

import Ae.C2399j;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Be.AbstractC2635g;
import Sc.s;
import Wc.a;
import androidx.activity.ActivityC5043j;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5427n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import r20.AbstractC9166c;
import ru.ozon.app.android.debugmenu.ozondebugmenu.support.OzonDebugMenuEvents;
import ru.ozon.app.android.storage.auth.OzonIdCookieEvents;
import xe.M;
import zb0.f;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.debugmenu.ozondebugmenu.providers.InformationGroupProvider$onActivityCreated$1", f = "InformationGroupProvider.kt", l = {47}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class InformationGroupProvider$onActivityCreated$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ ActivityC5043j $activity;
    int label;
    final /* synthetic */ InformationGroupProvider this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InformationGroupProvider$onActivityCreated$1(InformationGroupProvider informationGroupProvider, ActivityC5043j activityC5043j, d<? super InformationGroupProvider$onActivityCreated$1> dVar) {
        super(2, dVar);
        this.this$0 = informationGroupProvider;
        this.$activity = activityC5043j;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new InformationGroupProvider$onActivityCreated$1(this.this$0, this.$activity, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        OzonIdCookieEvents ozonIdCookieEvents;
        OzonDebugMenuEvents ozonDebugMenuEvents;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            ozonIdCookieEvents = this.this$0.cookieEvents;
            InterfaceC2395h<f> flow = ozonIdCookieEvents.getFlow();
            ozonDebugMenuEvents = this.this$0.ozonDebugMenuEvents;
            InterfaceC2395h a11 = C5427n.a(C2399j.F(flow, ozonDebugMenuEvents.getClearCookieEvents()), this.$activity.getLifecycle(), AbstractC5434v.b.RESUMED);
            final InformationGroupProvider informationGroupProvider = this.this$0;
            InterfaceC2397i interfaceC2397i = new InterfaceC2397i() { // from class: ru.ozon.app.android.debugmenu.ozondebugmenu.providers.InformationGroupProvider$onActivityCreated$1.1
                @Override // Ae.InterfaceC2397i
                public final Object emit(Object obj2, d<? super Unit> dVar) {
                    AbstractC9166c.reloadGroup$default(InformationGroupProvider.this, null, 1, null);
                    return Unit.f71690a;
                }
            };
            this.label = 1;
            if (((AbstractC2635g) a11).collect(interfaceC2397i, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((InformationGroupProvider$onActivityCreated$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}

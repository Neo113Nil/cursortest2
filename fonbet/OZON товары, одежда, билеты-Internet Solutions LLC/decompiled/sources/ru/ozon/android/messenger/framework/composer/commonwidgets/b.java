package ru.ozon.android.messenger.framework.composer.commonwidgets;

import Sc.s;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.r;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import l10.InterfaceC7851b;
import org.maplibre.android.log.Logger;
import ru.ozon.android.messenger.framework.presentation.common.notification.a;
import ru.ozon.android.messenger.utils.i;
import ru.ozon.uni.android.notificationbar.CoordinatorLayoutManagerKt;
import ru.ozon.uni.android.notificationbar.NotificationLayoutManager;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.M;

@e(c = "ru.ozon.android.messenger.framework.composer.commonwidgets.ActionHandlersFactoryImpl$handleRemoveFastAnswerAction$1", f = "ActionHandlersFactoryImpl.kt", l = {Logger.NONE}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class b extends j implements Function2<M, d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    c f86612d;

    /* renamed from: e, reason: collision with root package name */
    InterfaceC7851b f86613e;

    /* renamed from: f, reason: collision with root package name */
    Map f86614f;

    /* renamed from: g, reason: collision with root package name */
    int f86615g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ AtomAction.Click f86616h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ c f86617i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ InterfaceC7851b f86618j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(AtomAction.Click click, c cVar, InterfaceC7851b interfaceC7851b, d<? super b> dVar) {
        super(2, dVar);
        this.f86616h = click;
        this.f86617i = cVar;
        this.f86618j = interfaceC7851b;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new b(this.f86616h, this.f86617i, this.f86618j, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ru.ozon.android.messenger.framework.domain.repository.a aVar;
        Map<String, String> map;
        c cVar;
        InterfaceC7851b interfaceC7851b;
        ru.ozon.android.messenger.framework.composer.navigation.router.c cVar2;
        NotificationLayoutManager asNotificationLayoutManager$default;
        r activity;
        ru.ozon.android.messenger.framework.composer.navigation.router.c cVar3;
        NotificationLayoutManager asNotificationLayoutManager$default2;
        r activity2;
        ru.ozon.android.messenger.framework.composer.navigation.router.a aVar2;
        Wc.a aVar3 = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f86615g;
        if (i11 == 0) {
            s.b(obj);
            AtomAction.Click click = this.f86616h;
            String link = click.getLink();
            if (link != null) {
                Map<String, String> params = click.getParams();
                c cVar4 = this.f86617i;
                aVar = cVar4.f86620b;
                Map<String, String> params2 = click.getParams();
                this.f86612d = cVar4;
                InterfaceC7851b interfaceC7851b2 = this.f86618j;
                this.f86613e = interfaceC7851b2;
                this.f86614f = params;
                this.f86615g = 1;
                obj = aVar.i(link, params2, this);
                if (obj == aVar3) {
                    return aVar3;
                }
                map = params;
                cVar = cVar4;
                interfaceC7851b = interfaceC7851b2;
            }
            return Unit.f71690a;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        map = this.f86614f;
        interfaceC7851b = this.f86613e;
        cVar = this.f86612d;
        s.b(obj);
        i iVar = (i) obj;
        boolean z11 = iVar instanceof i.b;
        a.C1689a c1689a = ru.ozon.android.messenger.framework.presentation.common.notification.a.f90777a;
        if (z11) {
            ru.ozon.android.messenger.framework.presentation.models.responses.e eVar = (ru.ozon.android.messenger.framework.presentation.models.responses.e) ((i.b) iVar).b();
            if (eVar != null && !eVar.c()) {
                aVar2 = cVar.f86619a;
                new Vg.a(interfaceC7851b, aVar2).a(new ru.ozon.android.messenger.framework.composer.action.d());
            }
            cVar3 = cVar.f86621c;
            ComponentCallbacksC5392m currentFragment = cVar3.getCurrentFragment();
            View view = currentFragment != null ? currentFragment.getView() : null;
            ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
            if (viewGroup != null && (asNotificationLayoutManager$default2 = CoordinatorLayoutManagerKt.asNotificationLayoutManager$default(viewGroup, null, 1, null)) != null && (activity2 = currentFragment.getActivity()) != null) {
                a.C1689a.d(eVar, asNotificationLayoutManager$default2, activity2);
            }
        }
        if (iVar instanceof i.a) {
            cVar2 = cVar.f86621c;
            ComponentCallbacksC5392m currentFragment2 = cVar2.getCurrentFragment();
            View view2 = currentFragment2 != null ? currentFragment2.getView() : null;
            ViewGroup viewGroup2 = view2 instanceof ViewGroup ? (ViewGroup) view2 : null;
            if (viewGroup2 != null && (asNotificationLayoutManager$default = CoordinatorLayoutManagerKt.asNotificationLayoutManager$default(viewGroup2, null, 1, null)) != null && (activity = currentFragment2.getActivity()) != null) {
                c1689a.b(map, asNotificationLayoutManager$default, activity);
            }
        }
        return Unit.f71690a;
    }
}

package ru.ozon.android.messenger.framework.composer.widgets.fastAnswerTemplateEditor.presentation;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.J;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import l10.InterfaceC7851b;
import ru.ozon.android.messenger.framework.composer.widgets.fastAnswerTemplateEditor.presentation.x;
import ru.ozon.android.messenger.framework.presentation.common.notification.a;
import ru.ozon.android.messenger.utils.i;
import ru.ozon.uni.android.notificationbar.CoordinatorLayoutManagerKt;
import ru.ozon.uni.android.notificationbar.NotificationLayoutManager;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.composer.widgets.fastAnswerTemplateEditor.presentation.FastAnswerButtonContentKt$FastAnswerButtonContent$ah$1$1$1", f = "FastAnswerButtonContent.kt", l = {76}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class e extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    Map f86877d;

    /* renamed from: e, reason: collision with root package name */
    int f86878e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ AtomActionDTO f86879f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.domain.repository.a f86880g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ AtomActionDTO f86881h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ View f86882i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ Function1<x, Unit> f86883j;

    /* renamed from: k, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.composer.navigation.router.a f86884k;

    /* renamed from: l, reason: collision with root package name */
    final /* synthetic */ InterfaceC7851b f86885l;

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ Context f86886m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ J f86887n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    e(AtomActionDTO atomActionDTO, ru.ozon.android.messenger.framework.domain.repository.a aVar, AtomActionDTO atomActionDTO2, View view, Function1<? super x, Unit> function1, ru.ozon.android.messenger.framework.composer.navigation.router.a aVar2, InterfaceC7851b interfaceC7851b, Context context, J j11, kotlin.coroutines.d<? super e> dVar) {
        super(2, dVar);
        this.f86879f = atomActionDTO;
        this.f86880g = aVar;
        this.f86881h = atomActionDTO2;
        this.f86882i = view;
        this.f86883j = function1;
        this.f86884k = aVar2;
        this.f86885l = interfaceC7851b;
        this.f86886m = context;
        this.f86887n = j11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new e(this.f86879f, this.f86880g, this.f86881h, this.f86882i, this.f86883j, this.f86884k, this.f86885l, this.f86886m, this.f86887n, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((e) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Map<String, String> map;
        NotificationLayoutManager asNotificationLayoutManager$default;
        NotificationLayoutManager asNotificationLayoutManager$default2;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f86878e;
        if (i11 == 0) {
            Sc.s.b(obj);
            Map<String, String> params = this.f86879f.getParams();
            ru.ozon.android.messenger.framework.navigation.action.a aVar2 = new ru.ozon.android.messenger.framework.navigation.action.a(this.f86881h, null, null, 6);
            this.f86877d = params;
            this.f86878e = 1;
            Object a11 = this.f86880g.a(aVar2, this);
            if (a11 == aVar) {
                return aVar;
            }
            map = params;
            obj = a11;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            map = this.f86877d;
            Sc.s.b(obj);
        }
        ru.ozon.android.messenger.utils.i iVar = (ru.ozon.android.messenger.utils.i) obj;
        View view = this.f86882i;
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        boolean z11 = iVar instanceof i.b;
        a.C1689a c1689a = ru.ozon.android.messenger.framework.presentation.common.notification.a.f90777a;
        Function1<x, Unit> function1 = this.f86883j;
        if (z11) {
            ru.ozon.android.messenger.framework.presentation.models.responses.e eVar = (ru.ozon.android.messenger.framework.presentation.models.responses.e) ((i.b) iVar).b();
            if (viewGroup != null && (asNotificationLayoutManager$default2 = CoordinatorLayoutManagerKt.asNotificationLayoutManager$default(viewGroup, null, 1, null)) != null) {
                Context context = this.f86886m;
                androidx.fragment.app.r rVar = context instanceof androidx.fragment.app.r ? (androidx.fragment.app.r) context : null;
                if (rVar != null) {
                    a.C1689a.d(eVar, asNotificationLayoutManager$default2, rVar);
                }
            }
            function1.invoke(new x.b());
            if (eVar != null && !eVar.c()) {
                new Vg.a(this.f86885l, this.f86884k).a(new ru.ozon.android.messenger.framework.composer.action.d());
            }
        }
        if (iVar instanceof i.a) {
            if (viewGroup != null && (asNotificationLayoutManager$default = CoordinatorLayoutManagerKt.asNotificationLayoutManager$default(viewGroup, null, 1, null)) != null) {
                c1689a.b(map, asNotificationLayoutManager$default, this.f86887n);
            }
            function1.invoke(new x.b());
        }
        return Unit.f71690a;
    }
}

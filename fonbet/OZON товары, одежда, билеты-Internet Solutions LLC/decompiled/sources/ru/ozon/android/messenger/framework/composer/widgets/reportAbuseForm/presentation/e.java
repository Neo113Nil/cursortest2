package ru.ozon.android.messenger.framework.composer.widgets.reportAbuseForm.presentation;

import Sc.s;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.J;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import l10.InterfaceC7851b;
import ru.ozon.android.messenger.framework.composer.widgets.reportAbuseForm.presentation.a;
import ru.ozon.android.messenger.framework.presentation.common.notification.a;
import ru.ozon.android.messenger.utils.i;
import ru.ozon.uni.android.notificationbar.CoordinatorLayoutManagerKt;
import ru.ozon.uni.android.notificationbar.NotificationLayoutManager;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.composer.widgets.reportAbuseForm.presentation.ReportAbuseFormButtonContentKt$ReportAbuseFormButtonView$actionHandler$1$1$1", f = "ReportAbuseFormButtonContent.kt", l = {67}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class e extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f87076d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.domain.repository.a f87077e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ AtomActionDTO f87078f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ p f87079g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.composer.navigation.router.a f87080h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ InterfaceC7851b f87081i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.navigation.controller.a f87082j;

    /* renamed from: k, reason: collision with root package name */
    final /* synthetic */ View f87083k;

    /* renamed from: l, reason: collision with root package name */
    final /* synthetic */ ButtonV3DTO f87084l;

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ J f87085m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    e(ru.ozon.android.messenger.framework.domain.repository.a aVar, AtomActionDTO atomActionDTO, p pVar, ru.ozon.android.messenger.framework.composer.navigation.router.a aVar2, InterfaceC7851b interfaceC7851b, ru.ozon.android.messenger.framework.navigation.controller.a aVar3, View view, ButtonV3DTO buttonV3DTO, J j11, kotlin.coroutines.d<? super e> dVar) {
        super(2, dVar);
        this.f87077e = aVar;
        this.f87078f = atomActionDTO;
        this.f87079g = pVar;
        this.f87080h = aVar2;
        this.f87081i = interfaceC7851b;
        this.f87082j = aVar3;
        this.f87083k = view;
        this.f87084l = buttonV3DTO;
        this.f87085m = j11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new e(this.f87077e, this.f87078f, this.f87079g, this.f87080h, this.f87081i, this.f87082j, this.f87083k, this.f87084l, this.f87085m, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((e) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        NotificationLayoutManager asNotificationLayoutManager$default;
        AtomActionDTO action;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f87076d;
        Map<String, String> map = null;
        if (i11 == 0) {
            s.b(obj);
            ru.ozon.android.messenger.framework.navigation.action.a aVar2 = new ru.ozon.android.messenger.framework.navigation.action.a(this.f87078f, null, null, 6);
            this.f87076d = 1;
            obj = this.f87077e.f(aVar2, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        ru.ozon.android.messenger.utils.i iVar = (ru.ozon.android.messenger.utils.i) obj;
        boolean z11 = iVar instanceof i.b;
        p pVar = this.f87079g;
        if (z11) {
            ru.ozon.android.messenger.blocks.curtain.c cVar = (ru.ozon.android.messenger.blocks.curtain.c) ((i.b) iVar).b();
            pVar.g0(new a.d(false));
            new Vg.a(this.f87081i, this.f87080h).a(new ru.ozon.android.messenger.framework.composer.action.d());
            if (cVar == null) {
                cVar = null;
            }
            if (cVar != null) {
                this.f87082j.e(cVar);
            }
        }
        if (iVar instanceof i.a) {
            pVar.g0(new a.d(false));
            View view = this.f87083k;
            ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
            if (viewGroup != null && (asNotificationLayoutManager$default = CoordinatorLayoutManagerKt.asNotificationLayoutManager$default(viewGroup, null, 1, null)) != null) {
                a.C1689a c1689a = ru.ozon.android.messenger.framework.presentation.common.notification.a.f90777a;
                CommonControlSettings common = this.f87084l.getCommon();
                if (common != null && (action = common.getAction()) != null) {
                    map = action.getParams();
                }
                c1689a.b(map, asNotificationLayoutManager$default, this.f87085m);
            }
        }
        return Unit.f71690a;
    }
}

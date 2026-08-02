package ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ru.ozon.android.messenger.framework.data.repository.C9351a;
import ru.ozon.android.messenger.framework.navigation.action.c;
import ru.ozon.android.messenger.framework.navigation.action.d;
import ru.ozon.android.messenger.framework.presentation.chatdetail.j;
import ru.ozon.android.messenger.framework.presentation.common.screen.m;
import ru.ozon.android.messenger.framework.presentation.models.responses.c;
import ru.ozon.android.messenger.utils.i;
import ru.ozon.app.android.messenger.R$drawable;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.ChatViewModelImpl$handleApplyCoupon$1$1", f = "ChatViewModel.kt", l = {949}, m = "invokeSuspend")
/* renamed from: ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.m, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C9475m extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f90293d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C9467e f90294e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.navigation.action.a f90295f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C9475m(kotlin.coroutines.d dVar, ru.ozon.android.messenger.framework.navigation.action.a aVar, C9467e c9467e) {
        super(2, dVar);
        this.f90294e = c9467e;
        this.f90295f = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new C9475m(dVar, this.f90295f, this.f90294e);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((C9475m) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ru.ozon.android.messenger.framework.domain.repository.a aVar;
        ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.delegates.a aVar2;
        ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.delegates.a aVar3;
        Wc.a aVar4 = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f90293d;
        ru.ozon.android.messenger.framework.navigation.action.a aVar5 = this.f90295f;
        C9467e c9467e = this.f90294e;
        if (i11 == 0) {
            Sc.s.b(obj);
            aVar = c9467e.f90208d;
            this.f90293d = 1;
            obj = ((C9351a) aVar).n(aVar5, this);
            if (obj == aVar4) {
                return aVar4;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Sc.s.b(obj);
        }
        ru.ozon.android.messenger.utils.i iVar = (ru.ozon.android.messenger.utils.i) obj;
        if (iVar instanceof i.b) {
            ru.ozon.android.messenger.framework.presentation.models.responses.c cVar = (ru.ozon.android.messenger.framework.presentation.models.responses.c) ((i.b) iVar).b();
            aVar3 = c9467e.f90220p;
            aVar3.w(false, new m.a(null));
            if (cVar instanceof c.b) {
                C9467e.f1(c9467e, new j.o(((c.b) cVar).a()));
            } else {
                if (!(cVar instanceof c.a)) {
                    throw new Sc.o();
                }
                c9467e.getController().l(new c.e(((c.a) cVar).a(), new Integer(R$drawable.ic_m_exclamation_filled), "text_warning"));
            }
        }
        if (iVar instanceof i.a) {
            aVar2 = c9467e.f90220p;
            aVar2.w(false, new m.a(null));
            ru.ozon.android.messenger.framework.presentation.models.m mVar = (ru.ozon.android.messenger.framework.presentation.models.m) ru.ozon.android.messenger.framework.navigation.action.b.b(d.c.ACTION_ERROR_FLASHBAR.a(), aVar5.d());
            if (mVar != null) {
                c9467e.getController().l(C9467e.j1(c9467e, mVar));
            }
        }
        return Unit.f71690a;
    }
}

package ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ru.ozon.android.messenger.framework.data.repository.C9351a;
import ru.ozon.android.messenger.framework.navigation.action.d;
import ru.ozon.android.messenger.utils.i;
import ru.ozon.uni.atoms.data.AtomActionDTO;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.ChatViewModelImpl$sendReport$1$1", f = "ChatViewModel.kt", l = {981}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class i0 extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f90271d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C9467e f90272e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.navigation.action.a f90273f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    i0(kotlin.coroutines.d dVar, ru.ozon.android.messenger.framework.navigation.action.a aVar, C9467e c9467e) {
        super(2, dVar);
        this.f90272e = c9467e;
        this.f90273f = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new i0(dVar, this.f90273f, this.f90272e);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((i0) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ru.ozon.android.messenger.framework.domain.repository.a aVar;
        ru.ozon.android.messenger.framework.presentation.models.m mVar;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f90271d;
        ru.ozon.android.messenger.framework.navigation.action.a aVar3 = this.f90273f;
        C9467e c9467e = this.f90272e;
        if (i11 == 0) {
            Sc.s.b(obj);
            C9467e.c1(c9467e);
            aVar = c9467e.f90208d;
            AtomActionDTO b11 = aVar3.b();
            this.f90271d = 1;
            obj = ((C9351a) aVar).B(b11, this);
            if (obj == aVar2) {
                return aVar2;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Sc.s.b(obj);
        }
        ru.ozon.android.messenger.utils.i iVar = (ru.ozon.android.messenger.utils.i) obj;
        iVar.getClass();
        boolean z11 = iVar instanceof i.b;
        if (z11) {
            mVar = (ru.ozon.android.messenger.framework.presentation.models.m) ru.ozon.android.messenger.framework.navigation.action.b.a(d.c.REPORT_SUCCESS_FLASHBAR.a(), aVar3.d());
        } else {
            mVar = (ru.ozon.android.messenger.framework.presentation.models.m) ru.ozon.android.messenger.framework.navigation.action.b.a(d.c.REPORT_ERROR_FLASHBAR.a(), aVar3.d());
        }
        c9467e.getController().l(C9467e.j1(c9467e, mVar));
        if (z11) {
            c9467e.getController().q(ru.ozon.android.messenger.framework.navigation.action.b.c(new AtomActionDTO(AtomActionDTO.Behavior.CUSTOM, null, ru.ozon.android.messenger.framework.navigation.action.d.SHOW_CHAT_LIST.a(), null, 10, null)));
        }
        return Unit.f71690a;
    }
}

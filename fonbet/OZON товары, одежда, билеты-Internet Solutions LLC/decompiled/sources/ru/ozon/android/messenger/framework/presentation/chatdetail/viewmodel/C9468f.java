package ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ru.ozon.android.messenger.framework.data.repository.C9351a;
import ru.ozon.android.messenger.framework.navigation.action.d;
import ru.ozon.android.messenger.utils.i;
import ru.ozon.uni.atoms.data.AtomActionDTO;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.ChatViewModelImpl$acceptPolitics$1$1", f = "ChatViewModel.kt", l = {1003}, m = "invokeSuspend")
/* renamed from: ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.f, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C9468f extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f90249d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C9467e f90250e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.navigation.action.a f90251f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C9468f(kotlin.coroutines.d dVar, ru.ozon.android.messenger.framework.navigation.action.a aVar, C9467e c9467e) {
        super(2, dVar);
        this.f90250e = c9467e;
        this.f90251f = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new C9468f(dVar, this.f90251f, this.f90250e);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((C9468f) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ru.ozon.android.messenger.framework.domain.repository.a aVar;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f90249d;
        ru.ozon.android.messenger.framework.navigation.action.a aVar3 = this.f90251f;
        C9467e c9467e = this.f90250e;
        if (i11 == 0) {
            Sc.s.b(obj);
            aVar = c9467e.f90208d;
            AtomActionDTO b11 = aVar3.b();
            this.f90249d = 1;
            obj = ((C9351a) aVar).l(b11, this);
            if (obj == aVar2) {
                return aVar2;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Sc.s.b(obj);
        }
        if (((ru.ozon.android.messenger.utils.i) obj) instanceof i.a) {
            ru.ozon.android.messenger.framework.presentation.models.m mVar = (ru.ozon.android.messenger.framework.presentation.models.m) ru.ozon.android.messenger.framework.navigation.action.b.b(d.c.ACTION_ERROR_FLASHBAR.a(), aVar3.d());
            if (mVar != null) {
                c9467e.getController().l(C9467e.j1(c9467e, mVar));
            }
        }
        return Unit.f71690a;
    }
}

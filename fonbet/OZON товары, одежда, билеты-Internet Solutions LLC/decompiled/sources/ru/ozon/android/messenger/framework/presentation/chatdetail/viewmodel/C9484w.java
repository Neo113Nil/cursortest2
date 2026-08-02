package ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ru.ozon.android.messenger.framework.data.repository.C9351a;
import ru.ozon.android.messenger.framework.presentation.chatdetail.j;
import ru.ozon.android.messenger.framework.presentation.models.C9514a;
import ru.ozon.android.messenger.utils.i;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.ChatViewModelImpl$handleGetActionCurtainModalAction$1$1", f = "ChatViewModel.kt", l = {1269}, m = "invokeSuspend")
/* renamed from: ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.w, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C9484w extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f90371d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C9467e f90372e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.navigation.action.a f90373f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C9484w(kotlin.coroutines.d dVar, ru.ozon.android.messenger.framework.navigation.action.a aVar, C9467e c9467e) {
        super(2, dVar);
        this.f90372e = c9467e;
        this.f90373f = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new C9484w(dVar, this.f90373f, this.f90372e);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((C9484w) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ru.ozon.android.messenger.framework.domain.repository.a aVar;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f90371d;
        ru.ozon.android.messenger.framework.navigation.action.a aVar3 = this.f90373f;
        C9467e c9467e = this.f90372e;
        if (i11 == 0) {
            Sc.s.b(obj);
            aVar = c9467e.f90208d;
            this.f90371d = 1;
            obj = ((C9351a) aVar).t(aVar3, this);
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
        if (iVar instanceof i.b) {
            C9514a c9514a = (C9514a) ((i.b) iVar).b();
            if (c9514a != null) {
                C9467e.f1(c9467e, new j.m(c9514a));
            } else {
                Lm0.a.f17149a.w("called onSuccess for handleGetActionCurtainModalAction but response is null", new Object[0]);
            }
        }
        if (iVar instanceof i.a) {
            C9467e.i1(c9467e, aVar3);
        }
        return Unit.f71690a;
    }
}

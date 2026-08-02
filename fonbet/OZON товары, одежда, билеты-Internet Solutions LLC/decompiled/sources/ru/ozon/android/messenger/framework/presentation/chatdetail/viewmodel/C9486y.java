package ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ru.ozon.android.messenger.framework.data.repository.C9351a;
import ru.ozon.android.messenger.framework.presentation.chatdetail.j;
import ru.ozon.android.messenger.utils.i;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.ChatViewModelImpl$handleGetCurtainModalAction$1$1", f = "ChatViewModel.kt", l = {1248}, m = "invokeSuspend")
/* renamed from: ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.y, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C9486y extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f90386d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C9467e f90387e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.navigation.action.a f90388f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C9486y(kotlin.coroutines.d dVar, ru.ozon.android.messenger.framework.navigation.action.a aVar, C9467e c9467e) {
        super(2, dVar);
        this.f90387e = c9467e;
        this.f90388f = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new C9486y(dVar, this.f90388f, this.f90387e);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((C9486y) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ru.ozon.android.messenger.framework.domain.repository.a aVar;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f90386d;
        ru.ozon.android.messenger.framework.navigation.action.a aVar3 = this.f90388f;
        C9467e c9467e = this.f90387e;
        if (i11 == 0) {
            Sc.s.b(obj);
            aVar = c9467e.f90208d;
            this.f90386d = 1;
            obj = ((C9351a) aVar).b(aVar3, this);
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
            ru.ozon.android.messenger.blocks.curtain.c cVar = (ru.ozon.android.messenger.blocks.curtain.c) ((i.b) iVar).b();
            if (cVar != null) {
                C9467e.f1(c9467e, new j.p(cVar));
            } else {
                Lm0.a.f17149a.w("called onSuccess for handleGetCurtainModalAction but response is null", new Object[0]);
            }
        }
        if (iVar instanceof i.a) {
            C9467e.i1(c9467e, aVar3);
        }
        return Unit.f71690a;
    }
}

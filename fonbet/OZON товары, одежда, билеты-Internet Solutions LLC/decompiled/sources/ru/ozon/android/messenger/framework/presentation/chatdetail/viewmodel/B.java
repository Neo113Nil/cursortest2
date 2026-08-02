package ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ru.ozon.android.messenger.framework.data.repository.C9351a;
import ru.ozon.android.messenger.framework.navigation.action.d;
import ru.ozon.android.messenger.utils.i;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.ChatViewModelImpl$handleHideCoupon$1$1", f = "ChatViewModel.kt", l = {883}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class B extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f89964d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C9467e f89965e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.navigation.action.a f89966f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    B(kotlin.coroutines.d dVar, ru.ozon.android.messenger.framework.navigation.action.a aVar, C9467e c9467e) {
        super(2, dVar);
        this.f89965e = c9467e;
        this.f89966f = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new B(dVar, this.f89966f, this.f89965e);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((B) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ru.ozon.android.messenger.framework.domain.repository.a aVar;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f89964d;
        ru.ozon.android.messenger.framework.navigation.action.a aVar3 = this.f89966f;
        C9467e c9467e = this.f89965e;
        if (i11 == 0) {
            Sc.s.b(obj);
            aVar = c9467e.f90208d;
            this.f89964d = 1;
            obj = ((C9351a) aVar).x(aVar3, this);
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

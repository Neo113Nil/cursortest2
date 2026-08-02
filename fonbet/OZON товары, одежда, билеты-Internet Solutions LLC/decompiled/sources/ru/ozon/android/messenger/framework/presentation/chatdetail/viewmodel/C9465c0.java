package ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel;

import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.ChatViewModelImpl$onLastUnreadMsgChangeThrottled$1", f = "ChatViewModel.kt", l = {}, m = "invokeSuspend")
/* renamed from: ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.c0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C9465c0 extends kotlin.coroutines.jvm.internal.j implements Function2<String, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f90060d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C9467e f90061e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C9465c0(kotlin.coroutines.d dVar, C9467e c9467e) {
        super(2, dVar);
        this.f90061e = c9467e;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        C9465c0 c9465c0 = new C9465c0(dVar, this.f90061e);
        c9465c0.f90060d = obj;
        return c9465c0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(String str, kotlin.coroutines.d<? super Unit> dVar) {
        return ((C9465c0) create(str, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.delegates.o oVar;
        ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.delegates.a aVar;
        boolean z11;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        Sc.s.b(obj);
        String str = (String) this.f90060d;
        C9467e c9467e = this.f90061e;
        oVar = c9467e.f90219o;
        aVar = c9467e.f90220p;
        if (aVar.O()) {
            ru.ozon.android.messenger.framework.presentation.models.q qVar = (ru.ozon.android.messenger.framework.presentation.models.q) C7714v.Z(c9467e.h().getValue().a());
            if (Intrinsics.d(str, qVar != null ? ru.ozon.android.messenger.framework.presentation.models.r.d(qVar) : null)) {
                z11 = true;
                oVar.i(Boolean.valueOf(z11), str);
                return Unit.f71690a;
            }
        }
        z11 = false;
        oVar.i(Boolean.valueOf(z11), str);
        return Unit.f71690a;
    }
}

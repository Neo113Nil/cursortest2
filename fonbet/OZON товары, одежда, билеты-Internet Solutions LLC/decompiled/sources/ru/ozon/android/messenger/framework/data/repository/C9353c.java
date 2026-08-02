package ru.ozon.android.messenger.framework.data.repository;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ru.ozon.android.messenger.framework.data.requests.CouponActionResponseDTO;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.data.repository.ActionRepositoryImpl$activateCoupon$2", f = "ActionRepositoryImpl.kt", l = {58}, m = "invokeSuspend")
/* renamed from: ru.ozon.android.messenger.framework.data.repository.c, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C9353c extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super ru.ozon.android.messenger.utils.i<? extends CouponActionResponseDTO>>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f88501d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C9351a f88502e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.navigation.action.a f88503f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C9353c(C9351a c9351a, ru.ozon.android.messenger.framework.navigation.action.a aVar, kotlin.coroutines.d<? super C9353c> dVar) {
        super(2, dVar);
        this.f88502e = c9351a;
        this.f88503f = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new C9353c(this.f88502e, this.f88503f, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super ru.ozon.android.messenger.utils.i<? extends CouponActionResponseDTO>> dVar) {
        return ((C9353c) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f88501d;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Sc.s.b(obj);
            return obj;
        }
        Sc.s.b(obj);
        ru.ozon.android.messenger.framework.data.remote.action.y yVar = this.f88502e.f88448b;
        this.f88501d = 1;
        Object s11 = yVar.s(this.f88503f, this);
        return s11 == aVar ? aVar : s11;
    }
}

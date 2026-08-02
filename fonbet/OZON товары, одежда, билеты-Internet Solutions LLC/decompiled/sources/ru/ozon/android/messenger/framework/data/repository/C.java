package ru.ozon.android.messenger.framework.data.repository;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ru.ozon.android.messenger.framework.data.requests.AddFastAnswerResponseDTO;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.data.repository.ActionRepositoryImpl$saveFastAnswerAction$2", f = "ActionRepositoryImpl.kt", l = {132}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class C extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super ru.ozon.android.messenger.utils.i<? extends AddFastAnswerResponseDTO>>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f88260d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C9351a f88261e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.navigation.action.a f88262f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C(C9351a c9351a, ru.ozon.android.messenger.framework.navigation.action.a aVar, kotlin.coroutines.d<? super C> dVar) {
        super(2, dVar);
        this.f88261e = c9351a;
        this.f88262f = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new C(this.f88261e, this.f88262f, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super ru.ozon.android.messenger.utils.i<? extends AddFastAnswerResponseDTO>> dVar) {
        return ((C) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f88260d;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Sc.s.b(obj);
            return obj;
        }
        Sc.s.b(obj);
        ru.ozon.android.messenger.framework.data.remote.action.y yVar = this.f88261e.f88448b;
        this.f88260d = 1;
        Object p11 = yVar.p(this.f88262f, this);
        return p11 == aVar ? aVar : p11;
    }
}

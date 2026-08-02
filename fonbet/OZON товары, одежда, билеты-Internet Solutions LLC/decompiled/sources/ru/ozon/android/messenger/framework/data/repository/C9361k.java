package ru.ozon.android.messenger.framework.data.repository;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ru.ozon.android.messenger.framework.data.requests.ActionsCurtainResponseDTO;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.data.repository.ActionRepositoryImpl$executeGetActionCurtainModalAction$2", f = "ActionRepositoryImpl.kt", l = {167}, m = "invokeSuspend")
/* renamed from: ru.ozon.android.messenger.framework.data.repository.k, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C9361k extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super ru.ozon.android.messenger.utils.i<? extends ActionsCurtainResponseDTO>>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f88562d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C9351a f88563e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.navigation.action.a f88564f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C9361k(C9351a c9351a, ru.ozon.android.messenger.framework.navigation.action.a aVar, kotlin.coroutines.d<? super C9361k> dVar) {
        super(2, dVar);
        this.f88563e = c9351a;
        this.f88564f = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new C9361k(this.f88563e, this.f88564f, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super ru.ozon.android.messenger.utils.i<? extends ActionsCurtainResponseDTO>> dVar) {
        return ((C9361k) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f88562d;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Sc.s.b(obj);
            return obj;
        }
        Sc.s.b(obj);
        ru.ozon.android.messenger.framework.data.remote.action.y yVar = this.f88563e.f88448b;
        this.f88562d = 1;
        Object f7 = yVar.f(this.f88564f, this);
        return f7 == aVar ? aVar : f7;
    }
}

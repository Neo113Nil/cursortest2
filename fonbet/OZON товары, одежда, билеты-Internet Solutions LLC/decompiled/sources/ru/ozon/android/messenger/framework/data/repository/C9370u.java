package ru.ozon.android.messenger.framework.data.repository;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ru.ozon.android.messenger.blocks.disclaimer.modal.DisclaimerModalResponseDTO;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.data.repository.ActionRepositoryImpl$openDisclaimerModalAction$2", f = "ActionRepositoryImpl.kt", l = {69}, m = "invokeSuspend")
/* renamed from: ru.ozon.android.messenger.framework.data.repository.u, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C9370u extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super ru.ozon.android.messenger.utils.i<? extends DisclaimerModalResponseDTO>>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f88614d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C9351a f88615e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.navigation.action.a f88616f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C9370u(C9351a c9351a, ru.ozon.android.messenger.framework.navigation.action.a aVar, kotlin.coroutines.d<? super C9370u> dVar) {
        super(2, dVar);
        this.f88615e = c9351a;
        this.f88616f = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new C9370u(this.f88615e, this.f88616f, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super ru.ozon.android.messenger.utils.i<? extends DisclaimerModalResponseDTO>> dVar) {
        return ((C9370u) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f88614d;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Sc.s.b(obj);
            return obj;
        }
        Sc.s.b(obj);
        ru.ozon.android.messenger.framework.data.remote.action.y yVar = this.f88615e.f88448b;
        this.f88614d = 1;
        Object m11 = yVar.m(this.f88616f, this);
        return m11 == aVar ? aVar : m11;
    }
}

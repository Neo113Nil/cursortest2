package ru.ozon.android.messenger.framework.data.repository;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ru.ozon.android.messenger.framework.data.requests.ReplyChatMessageResponseDTO;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.data.repository.ActionRepositoryImpl$executeReplyChatMessage$2", f = "ActionRepositoryImpl.kt", l = {93}, m = "invokeSuspend")
/* renamed from: ru.ozon.android.messenger.framework.data.repository.q, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C9367q extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super ru.ozon.android.messenger.utils.i<? extends ReplyChatMessageResponseDTO>>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f88602d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C9351a f88603e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.navigation.action.a f88604f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C9367q(C9351a c9351a, ru.ozon.android.messenger.framework.navigation.action.a aVar, kotlin.coroutines.d<? super C9367q> dVar) {
        super(2, dVar);
        this.f88603e = c9351a;
        this.f88604f = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new C9367q(this.f88603e, this.f88604f, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super ru.ozon.android.messenger.utils.i<? extends ReplyChatMessageResponseDTO>> dVar) {
        return ((C9367q) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f88602d;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Sc.s.b(obj);
            return obj;
        }
        Sc.s.b(obj);
        ru.ozon.android.messenger.framework.data.remote.action.y yVar = this.f88603e.f88448b;
        this.f88602d = 1;
        Object i12 = yVar.i(this.f88604f, this);
        return i12 == aVar ? aVar : i12;
    }
}

package ru.ozon.android.messenger.framework.data.repository;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ru.ozon.android.messenger.blocks.originalText.OriginalTextResponseDTO;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.data.repository.ActionRepositoryImpl$getOriginalText$2", f = "ActionRepositoryImpl.kt", l = {81}, m = "invokeSuspend")
/* renamed from: ru.ozon.android.messenger.framework.data.repository.s, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C9368s extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super ru.ozon.android.messenger.utils.i<? extends OriginalTextResponseDTO>>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f88608d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C9351a f88609e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.navigation.action.a f88610f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C9368s(C9351a c9351a, ru.ozon.android.messenger.framework.navigation.action.a aVar, kotlin.coroutines.d<? super C9368s> dVar) {
        super(2, dVar);
        this.f88609e = c9351a;
        this.f88610f = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new C9368s(this.f88609e, this.f88610f, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super ru.ozon.android.messenger.utils.i<? extends OriginalTextResponseDTO>> dVar) {
        return ((C9368s) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f88608d;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Sc.s.b(obj);
            return obj;
        }
        Sc.s.b(obj);
        ru.ozon.android.messenger.framework.data.remote.action.y yVar = this.f88609e.f88448b;
        this.f88608d = 1;
        Object u11 = yVar.u(this.f88610f, this);
        return u11 == aVar ? aVar : u11;
    }
}

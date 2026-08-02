package ru.ozon.android.messenger.framework.data.repository;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ru.ozon.android.messenger.blocks.curtain.CurtainModalResponseDTO;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.data.repository.ActionRepositoryImpl$saveReportAbuseAction$2", f = "ActionRepositoryImpl.kt", l = {162}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class E extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super ru.ozon.android.messenger.utils.i<? extends CurtainModalResponseDTO>>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f88267d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C9351a f88268e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.navigation.action.a f88269f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    E(C9351a c9351a, ru.ozon.android.messenger.framework.navigation.action.a aVar, kotlin.coroutines.d<? super E> dVar) {
        super(2, dVar);
        this.f88268e = c9351a;
        this.f88269f = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new E(this.f88268e, this.f88269f, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super ru.ozon.android.messenger.utils.i<? extends CurtainModalResponseDTO>> dVar) {
        return ((E) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f88267d;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Sc.s.b(obj);
            return obj;
        }
        Sc.s.b(obj);
        ru.ozon.android.messenger.framework.data.remote.action.y yVar = this.f88268e.f88448b;
        this.f88267d = 1;
        Object x11 = yVar.x(this.f88269f, this);
        return x11 == aVar ? aVar : x11;
    }
}

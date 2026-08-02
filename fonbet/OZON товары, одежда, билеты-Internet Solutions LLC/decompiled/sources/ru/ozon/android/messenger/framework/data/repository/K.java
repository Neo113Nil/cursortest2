package ru.ozon.android.messenger.framework.data.repository;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ru.ozon.android.messenger.framework.data.remote.models.SocketEventDTO;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.data.repository.ChatRepositoryImpl$getEvents$2", f = "ChatRepositoryImpl.kt", l = {330, 331}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class K extends kotlin.coroutines.jvm.internal.j implements Function2<SocketEventDTO, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f88360d;

    /* renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f88361e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ I f88362f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    K(I i11, kotlin.coroutines.d<? super K> dVar) {
        super(2, dVar);
        this.f88362f = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        K k11 = new K(this.f88362f, dVar);
        k11.f88361e = obj;
        return k11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(SocketEventDTO socketEventDTO, kotlin.coroutines.d<? super Unit> dVar) {
        return ((K) create(socketEventDTO, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0046, code lost:
    
        if (r6.a(r1, r5) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0048, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0036, code lost:
    
        if (r6.a(r1, r5) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        SocketEventDTO socketEventDTO;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f88360d;
        I i12 = this.f88362f;
        if (i11 == 0) {
            Sc.s.b(obj);
            socketEventDTO = (SocketEventDTO) this.f88361e;
            ru.ozon.android.messenger.framework.data.cache.b bVar = i12.f88281d;
            this.f88361e = socketEventDTO;
            this.f88360d = 1;
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
                return Unit.f71690a;
            }
            socketEventDTO = (SocketEventDTO) this.f88361e;
            Sc.s.b(obj);
        }
        ru.ozon.android.messenger.framework.data.cache.f fVar = i12.f88282e;
        this.f88361e = null;
        this.f88360d = 2;
    }
}

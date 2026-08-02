package ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.delegates;

import Sc.s;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ru.ozon.android.messenger.blocks.paginationerror.PaginationErrorDTO;
import ru.ozon.android.messenger.framework.domain.f;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.delegates.ChatLoadingDelegateImpl$handleLoadingFailure$1", f = "ChatLoadingDelegate.kt", l = {491, 496}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class g extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f90134d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.domain.model.c f90135e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ PaginationErrorDTO.a f90136f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ d f90137g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    g(ru.ozon.android.messenger.framework.domain.model.c cVar, PaginationErrorDTO.a aVar, d dVar, kotlin.coroutines.d dVar2) {
        super(2, dVar2);
        this.f90135e = cVar;
        this.f90136f = aVar;
        this.f90137g = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new g(this.f90135e, this.f90136f, this.f90137g, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((g) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0048, code lost:
    
        if (r2.a(r8, r1, r7) == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005b, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0059, code lost:
    
        if (r8 == r0) goto L19;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object p11;
        PaginationErrorDTO.a aVar;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f90134d;
        if (i11 == 0) {
            s.b(obj);
            ru.ozon.android.messenger.framework.domain.model.c cVar = this.f90135e;
            d dVar = this.f90137g;
            if (cVar == null || (aVar = this.f90136f) == null) {
                ru.ozon.android.messenger.framework.data.local.a aVar3 = dVar.f90074j;
                List p12 = dVar.p();
                this.f90134d = 2;
                p11 = aVar3.p(p12, aVar3.u().getValue().c(), this);
            } else {
                ru.ozon.android.messenger.framework.data.local.a aVar4 = dVar.f90074j;
                ArrayList a11 = dVar.f90069e.a(new Pair(f.b.PAGINATION_ERROR, new PaginationErrorDTO(aVar)));
                this.f90134d = 1;
            }
        } else {
            if (i11 != 1 && i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        return Unit.f71690a;
    }
}

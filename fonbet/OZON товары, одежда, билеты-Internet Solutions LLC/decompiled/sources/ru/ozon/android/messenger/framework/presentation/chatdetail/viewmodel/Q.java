package ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ru.ozon.android.messenger.framework.presentation.common.screen.m;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.ChatViewModelImpl$handleSocketConnectionError$2$1", f = "ChatViewModel.kt", l = {1384, 1388}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class Q extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f90023d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C9467e f90024e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ List<ru.ozon.android.messenger.framework.presentation.models.q> f90025f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Q(C9467e c9467e, List<ru.ozon.android.messenger.framework.presentation.models.q> list, kotlin.coroutines.d<? super Q> dVar) {
        super(2, dVar);
        this.f90024e = c9467e;
        this.f90025f = list;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new Q(this.f90024e, this.f90025f, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((Q) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0050, code lost:
    
        if (r5.k(r4.f90025f, null, r4) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0052, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0027, code lost:
    
        if (xe.Y.b(100, r4) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.delegates.a aVar;
        ru.ozon.android.messenger.framework.domain.repository.d dVar;
        ru.ozon.android.messenger.framework.domain.repository.d dVar2;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f90023d;
        if (i11 == 0) {
            Sc.s.b(obj);
            this.f90023d = 1;
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
                return Unit.f71690a;
            }
            Sc.s.b(obj);
        }
        G.c.a();
        C9467e c9467e = this.f90024e;
        aVar = c9467e.f90220p;
        aVar.w(false, new m.a(null));
        dVar = c9467e.f90207c;
        dVar.d(new ArrayList());
        dVar2 = c9467e.f90207c;
        this.f90023d = 2;
    }
}

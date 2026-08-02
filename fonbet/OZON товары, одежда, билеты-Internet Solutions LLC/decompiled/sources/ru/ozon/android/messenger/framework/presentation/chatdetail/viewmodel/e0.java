package ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ru.ozon.android.messenger.framework.domain.model.g;
import ru.ozon.android.messenger.framework.domain.model.h;
import ru.ozon.android.messenger.framework.presentation.chatdetail.j;
import ru.ozon.android.messenger.utils.i;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.ChatViewModelImpl$onSendMessageClicked$1", f = "ChatViewModel.kt", l = {1048}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class e0 extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f90245d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C9467e f90246e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ z0 f90247f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ String f90248g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    e0(C9467e c9467e, z0 z0Var, String str, kotlin.coroutines.d<? super e0> dVar) {
        super(2, dVar);
        this.f90246e = c9467e;
        this.f90247f = z0Var;
        this.f90248g = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new e0(this.f90246e, this.f90247f, this.f90248g, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((e0) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ru.ozon.android.messenger.framework.domain.usecases.P p11;
        ru.ozon.android.messenger.framework.presentation.mapper.a aVar;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f90245d;
        C9467e c9467e = this.f90246e;
        if (i11 == 0) {
            Sc.s.b(obj);
            C9467e.f1(c9467e, j.C1661j.f89878a);
            p11 = c9467e.f90224s;
            aVar = c9467e.f90228u;
            g.a a11 = aVar.a(this.f90247f, this.f90248g, true);
            this.f90245d = 1;
            obj = p11.i(a11, this);
            if (obj == aVar2) {
                return aVar2;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Sc.s.b(obj);
        }
        ru.ozon.android.messenger.utils.i iVar = (ru.ozon.android.messenger.utils.i) obj;
        if (iVar instanceof i.b) {
            ru.ozon.android.messenger.framework.domain.model.h hVar = (ru.ozon.android.messenger.framework.domain.model.h) ((i.b) iVar).b();
            h.c cVar = hVar instanceof h.c ? (h.c) hVar : null;
            if (cVar != null && cVar.a()) {
                C9467e.f1(c9467e, new j.i(0));
            }
        }
        return Unit.f71690a;
    }
}

package ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.delegates;

import Sc.s;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.android.messenger.framework.presentation.chatdetail.j;
import xe.C10737n;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.delegates.ChatLoadingDelegateImpl$getTopVisibleMsgIdOrNull$2$1", f = "ChatLoadingDelegate.kt", l = {438}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class e extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f90121d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ d f90122e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C10737n f90123f;

    static final class a extends AbstractC7737t implements Function1<String, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C10737n f90124b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C10737n c10737n) {
            super(1);
            this.f90124b = c10737n;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(String str) {
            this.f90124b.u(str, null);
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    e(d dVar, C10737n c10737n, kotlin.coroutines.d dVar2) {
        super(2, dVar2);
        this.f90122e = dVar;
        this.f90123f = c10737n;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new e(this.f90122e, this.f90123f, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((e) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f90121d;
        if (i11 == 0) {
            s.b(obj);
            ze.h<ru.ozon.android.messenger.framework.presentation.chatdetail.j> b11 = this.f90122e.b();
            j.d dVar = new j.d(new a(this.f90123f));
            this.f90121d = 1;
            if (b11.n(dVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        return Unit.f71690a;
    }
}

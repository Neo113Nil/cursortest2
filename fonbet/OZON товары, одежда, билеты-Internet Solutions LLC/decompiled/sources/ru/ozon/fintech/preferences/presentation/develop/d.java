package ru.ozon.fintech.preferences.presentation.develop;

import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import B90.v0;
import Be.AbstractC2635g;
import Sc.s;
import androidx.fragment.app.r;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import o40.InterfaceC8640a;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.preferences.presentation.develop.FintechPreferencesViewModel$gotoSoftUpdate$1", f = "FintechPreferencesViewModel.kt", l = {263}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class d extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f96762d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ v0 f96763e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ r f96764f;

    static final class a<T> implements InterfaceC2397i {

        /* renamed from: a, reason: collision with root package name */
        public static final a<T> f96765a = new a<>();

        @Override // Ae.InterfaceC2397i
        public final Object emit(Object obj, kotlin.coroutines.d dVar) {
            L80.a.a("FintechPreferencesViewModel", "soft update result = " + ((Boolean) obj).booleanValue());
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(v0 v0Var, r rVar, kotlin.coroutines.d<? super d> dVar) {
        super(2, dVar);
        this.f96763e = v0Var;
        this.f96764f = rVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new d(this.f96763e, this.f96764f, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((d) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC8640a interfaceC8640a;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f96762d;
        if (i11 == 0) {
            s.b(obj);
            interfaceC8640a = this.f96763e.f3211m;
            InterfaceC2395h<Boolean> b11 = interfaceC8640a.b(this.f96764f, false);
            InterfaceC2397i interfaceC2397i = a.f96765a;
            this.f96762d = 1;
            if (((AbstractC2635g) b11).collect(interfaceC2397i, this) == aVar) {
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

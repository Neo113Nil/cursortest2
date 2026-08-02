package t80;

import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Be.AbstractC2635g;
import Sc.s;
import androidx.fragment.app.r;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import o40.InterfaceC8640a;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.updatewall.presentation.UpdateWallViewModel$startHardUpdate$1", f = "UpdateWallViewModel.kt", l = {75}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class g extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f99273d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ h f99274e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ r f99275f;

    static final class a<T> implements InterfaceC2397i {

        /* renamed from: a, reason: collision with root package name */
        public static final a<T> f99276a = new a<>();

        @Override // Ae.InterfaceC2397i
        public final Object emit(Object obj, kotlin.coroutines.d dVar) {
            L80.a.a("UpdateWallViewModel", "hard update result = " + ((Boolean) obj).booleanValue());
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    g(h hVar, r rVar, kotlin.coroutines.d<? super g> dVar) {
        super(2, dVar);
        this.f99274e = hVar;
        this.f99275f = rVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new g(this.f99274e, this.f99275f, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((g) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC8640a interfaceC8640a;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f99273d;
        if (i11 == 0) {
            s.b(obj);
            interfaceC8640a = this.f99274e.f99277a;
            InterfaceC2395h<Boolean> b11 = interfaceC8640a.b(this.f99275f, true);
            InterfaceC2397i interfaceC2397i = a.f99276a;
            this.f99273d = 1;
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

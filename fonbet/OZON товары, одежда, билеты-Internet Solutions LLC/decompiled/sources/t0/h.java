package t0;

import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import S0.InterfaceC3978p0;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.interaction.FocusInteractionKt$collectIsFocusedAsState$1$1", f = "FocusInteraction.kt", l = {69}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class h extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f98925d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ o f98926e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ InterfaceC3978p0<Boolean> f98927f;

    static final class a<T> implements InterfaceC2397i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ArrayList f98928a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC3978p0<Boolean> f98929b;

        a(ArrayList arrayList, InterfaceC3978p0 interfaceC3978p0) {
            this.f98928a = arrayList;
            this.f98929b = interfaceC3978p0;
        }

        @Override // Ae.InterfaceC2397i
        public final Object emit(Object obj, kotlin.coroutines.d dVar) {
            n nVar = (n) obj;
            boolean z11 = nVar instanceof C9717f;
            ArrayList arrayList = this.f98928a;
            if (z11) {
                arrayList.add(nVar);
            } else if (nVar instanceof C9718g) {
                arrayList.remove(((C9718g) nVar).a());
            }
            this.f98929b.setValue(Boolean.valueOf(!arrayList.isEmpty()));
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    h(o oVar, InterfaceC3978p0<Boolean> interfaceC3978p0, kotlin.coroutines.d<? super h> dVar) {
        super(2, dVar);
        this.f98926e = oVar;
        this.f98927f = interfaceC3978p0;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
        return new h(this.f98926e, this.f98927f, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((h) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f98925d;
        if (i11 == 0) {
            Sc.s.b(obj);
            ArrayList arrayList = new ArrayList();
            InterfaceC2395h<n> interactions = this.f98926e.getInteractions();
            a aVar2 = new a(arrayList, this.f98927f);
            this.f98925d = 1;
            if (interactions.collect(aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Sc.s.b(obj);
        }
        return Unit.f71690a;
    }
}

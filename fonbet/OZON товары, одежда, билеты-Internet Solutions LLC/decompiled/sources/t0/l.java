package t0;

import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import S0.InterfaceC3978p0;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.interaction.HoverInteractionKt$collectIsHoveredAsState$1$1", f = "HoverInteraction.kt", l = {69}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class l extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f98931d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ q f98932e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ InterfaceC3978p0<Boolean> f98933f;

    static final class a<T> implements InterfaceC2397i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ArrayList f98934a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC3978p0<Boolean> f98935b;

        a(ArrayList arrayList, InterfaceC3978p0 interfaceC3978p0) {
            this.f98934a = arrayList;
            this.f98935b = interfaceC3978p0;
        }

        @Override // Ae.InterfaceC2397i
        public final Object emit(Object obj, kotlin.coroutines.d dVar) {
            n nVar = (n) obj;
            boolean z11 = nVar instanceof j;
            ArrayList arrayList = this.f98934a;
            if (z11) {
                arrayList.add(nVar);
            } else if (nVar instanceof k) {
                arrayList.remove(((k) nVar).a());
            }
            this.f98935b.setValue(Boolean.valueOf(!arrayList.isEmpty()));
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    l(q qVar, InterfaceC3978p0 interfaceC3978p0, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f98932e = qVar;
        this.f98933f = interfaceC3978p0;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
        return new l(this.f98932e, this.f98933f, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((l) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f98931d;
        if (i11 == 0) {
            Sc.s.b(obj);
            ArrayList arrayList = new ArrayList();
            InterfaceC2395h<n> interactions = this.f98932e.getInteractions();
            a aVar2 = new a(arrayList, this.f98933f);
            this.f98931d = 1;
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

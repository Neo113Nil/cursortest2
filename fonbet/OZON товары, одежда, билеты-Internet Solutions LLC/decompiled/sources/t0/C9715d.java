package t0;

import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import S0.InterfaceC3978p0;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.interaction.DragInteractionKt$collectIsDraggedAsState$1$1", f = "DragInteraction.kt", l = {84}, m = "invokeSuspend")
/* renamed from: t0.d, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C9715d extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f98919d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ o f98920e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ InterfaceC3978p0<Boolean> f98921f;

    /* renamed from: t0.d$a */
    static final class a<T> implements InterfaceC2397i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ArrayList f98922a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC3978p0<Boolean> f98923b;

        a(ArrayList arrayList, InterfaceC3978p0 interfaceC3978p0) {
            this.f98922a = arrayList;
            this.f98923b = interfaceC3978p0;
        }

        @Override // Ae.InterfaceC2397i
        public final Object emit(Object obj, kotlin.coroutines.d dVar) {
            n nVar = (n) obj;
            boolean z11 = nVar instanceof C9713b;
            ArrayList arrayList = this.f98922a;
            if (z11) {
                arrayList.add(nVar);
            } else if (nVar instanceof C9714c) {
                arrayList.remove(((C9714c) nVar).a());
            } else if (nVar instanceof C9712a) {
                arrayList.remove(((C9712a) nVar).a());
            }
            this.f98923b.setValue(Boolean.valueOf(!arrayList.isEmpty()));
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C9715d(o oVar, InterfaceC3978p0<Boolean> interfaceC3978p0, kotlin.coroutines.d<? super C9715d> dVar) {
        super(2, dVar);
        this.f98920e = oVar;
        this.f98921f = interfaceC3978p0;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
        return new C9715d(this.f98920e, this.f98921f, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((C9715d) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f98919d;
        if (i11 == 0) {
            Sc.s.b(obj);
            ArrayList arrayList = new ArrayList();
            InterfaceC2395h interactions = ((r) this.f98920e).getInteractions();
            a aVar2 = new a(arrayList, this.f98921f);
            this.f98919d = 1;
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

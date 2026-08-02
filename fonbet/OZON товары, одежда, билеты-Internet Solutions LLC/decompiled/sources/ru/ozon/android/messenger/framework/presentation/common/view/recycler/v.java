package ru.ozon.android.messenger.framework.presentation.common.view.recycler;

import Ae.AbstractC2381a;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import S0.n1;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import v0.I;
import v0.InterfaceC10174n;
import xe.C10727i;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.common.view.recycler.PaginationListenerKt$MessengerPaginationHandler$1$1", f = "PaginationListener.kt", l = {82}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class v extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f91269d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ I f91270e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ u f91271f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ int f91272g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ M f91273h;

    static final class a extends AbstractC7737t implements Function0<List<? extends InterfaceC10174n>> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ I f91274b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(I i11) {
            super(0);
            this.f91274b = i11;
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<? extends InterfaceC10174n> invoke() {
            return this.f91274b.t().g();
        }
    }

    static final class b<T> implements InterfaceC2397i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ u f91275a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ I f91276b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f91277c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ M f91278d;

        b(u uVar, I i11, int i12, M m11) {
            this.f91275a = uVar;
            this.f91276b = i11;
            this.f91277c = i12;
            this.f91278d = m11;
        }

        @Override // Ae.InterfaceC2397i
        public final Object emit(Object obj, kotlin.coroutines.d dVar) {
            List list = (List) obj;
            u uVar = this.f91275a;
            if (uVar.Y()) {
                return Unit.f71690a;
            }
            InterfaceC10174n interfaceC10174n = (InterfaceC10174n) C7714v.M(list);
            int index = interfaceC10174n != null ? interfaceC10174n.getIndex() : 0;
            InterfaceC10174n interfaceC10174n2 = (InterfaceC10174n) C7714v.Z(list);
            int index2 = interfaceC10174n2 != null ? interfaceC10174n2.getIndex() : 0;
            int d11 = this.f91276b.t().d();
            int i11 = this.f91277c;
            int i12 = d11 - i11;
            M m11 = this.f91278d;
            if (index2 >= i12 && uVar.S()) {
                C10727i.c(m11, null, null, new w(uVar, null), 3);
            }
            if (index <= i11 && uVar.A()) {
                C10727i.c(m11, null, null, new x(uVar, null), 3);
            }
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    v(I i11, u uVar, int i12, M m11, kotlin.coroutines.d<? super v> dVar) {
        super(2, dVar);
        this.f91270e = i11;
        this.f91271f = uVar;
        this.f91272g = i12;
        this.f91273h = m11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new v(this.f91270e, this.f91271f, this.f91272g, this.f91273h, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((v) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f91269d;
        if (i11 == 0) {
            Sc.s.b(obj);
            I i12 = this.f91270e;
            InterfaceC2395h m11 = n1.m(new a(i12));
            b bVar = new b(this.f91271f, i12, this.f91272g, this.f91273h);
            this.f91269d = 1;
            if (((AbstractC2381a) m11).collect(bVar, this) == aVar) {
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

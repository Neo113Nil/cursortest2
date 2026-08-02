package pj0;

import Ae.x0;
import Sc.s;
import fj0.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kj0.C7688a;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import nj0.InterfaceC8600a;
import oj0.InterfaceC8746a;
import pi0.h;
import qj0.InterfaceC9075e;
import rj0.InterfaceC9287a;

@e(c = "ru.ozon.tracker.debug.menu.shared.configuration.presentation.viewmodel.ConfigurationViewModel$1", f = "ConfigurationViewModel.kt", l = {51}, m = "invokeSuspend")
/* renamed from: pj0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C8939a extends j implements Function2<C7688a, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f81238d;

    /* renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f81239e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ d<InterfaceC9287a> f81240f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ h f81241g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C8939a(d dVar, h hVar, kotlin.coroutines.d dVar2) {
        super(2, dVar2);
        this.f81240f = dVar;
        this.f81241g = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        C8939a c8939a = new C8939a(this.f81240f, this.f81241g, dVar);
        c8939a.f81239e = obj;
        return c8939a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C7688a c7688a, kotlin.coroutines.d<? super Unit> dVar) {
        return ((C8939a) create(c7688a, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC8600a interfaceC8600a;
        x0 x0Var;
        x0 x0Var2;
        List list;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f81238d;
        if (i11 == 0) {
            s.b(obj);
            C7688a c7688a = (C7688a) this.f81239e;
            List<g<?>> a11 = c7688a.a();
            d<InterfaceC9287a> dVar = this.f81240f;
            interfaceC8600a = ((d) dVar).f81248a;
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = a11.iterator();
            while (it.hasNext()) {
                InterfaceC9075e<?> c11 = interfaceC8600a.c((g) it.next());
                if (c11 != null) {
                    arrayList.add(c11);
                }
            }
            x0Var = ((d) dVar).f81252e;
            boolean z11 = !(((InterfaceC8746a) x0Var.getValue()) instanceof InterfaceC8746a.b) || this.f81241g.i() || c7688a.b();
            x0Var2 = ((d) dVar).f81252e;
            list = ((d) dVar).f81251d;
            InterfaceC8746a.C1332a c1332a = new InterfaceC8746a.C1332a(arrayList, list, z11);
            this.f81238d = 1;
            if (x0Var2.emit(c1332a, this) == aVar) {
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

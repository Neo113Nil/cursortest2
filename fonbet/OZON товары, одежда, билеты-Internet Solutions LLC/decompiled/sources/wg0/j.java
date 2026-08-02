package wg0;

import Ae.x0;
import Sc.o;
import Sc.s;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import wg0.g;
import xe.M;
import yg0.AbstractC10901d;
import yg0.AbstractC10902e;
import yg0.C10900c;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.ozonSentryHelper.internal.ui.debugActivity.SentryHelperDebugViewModel$sendFatal$1", f = "SentryHelperDebugViewModel.kt", l = {58}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class j extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f104549d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ m f104550e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    j(m mVar, kotlin.coroutines.d<? super j> dVar) {
        super(2, dVar);
        this.f104550e = mVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new j(this.f104550e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((j) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        x0 x0Var;
        C10900c c10900c;
        g.a hVar;
        x0 x0Var2;
        Object value;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f104549d;
        m mVar = this.f104550e;
        if (i11 == 0) {
            s.b(obj);
            x0Var = mVar.f104557e;
            String b11 = ((g) x0Var.getValue()).b();
            if (kotlin.text.h.K(b11)) {
                b11 = null;
            }
            if (b11 == null) {
                b11 = "Тестовый Fatal-ивент";
            }
            c10900c = mVar.f104553a;
            AbstractC10902e.a aVar2 = new AbstractC10902e.a(b11);
            this.f104549d = 1;
            obj = c10900c.b(aVar2, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        AbstractC10901d abstractC10901d = (AbstractC10901d) obj;
        if (abstractC10901d instanceof AbstractC10901d.c) {
            hVar = g.a.c.f104540c;
        } else if (abstractC10901d instanceof AbstractC10901d.C2305d) {
            hVar = g.a.b.f104539c;
        } else if (abstractC10901d instanceof AbstractC10901d.b) {
            hVar = g.a.d.f104541c;
        } else {
            if (!(abstractC10901d instanceof AbstractC10901d.a)) {
                throw new o();
            }
            hVar = new g.a.h(((AbstractC10901d.a) abstractC10901d).a());
        }
        x0Var2 = mVar.f104557e;
        do {
            value = x0Var2.getValue();
        } while (!x0Var2.b(value, g.a((g) value, null, hVar, false, 5)));
        return Unit.f71690a;
    }
}

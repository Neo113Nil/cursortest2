package o1;

import Kk.C3532b;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import l1.s0;
import n1.C8408a;
import n1.InterfaceC8412e;

/* renamed from: o1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C8628b extends AbstractC7737t implements Function1<InterfaceC8412e, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ d f77480b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C8628b(d dVar) {
        super(1);
        this.f77480b = dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InterfaceC8412e interfaceC8412e) {
        s0 s0Var;
        boolean z11;
        Function1 function1;
        Function1 function12;
        InterfaceC8412e interfaceC8412e2 = interfaceC8412e;
        d dVar = this.f77480b;
        s0Var = dVar.f77493l;
        z11 = dVar.f77495n;
        if (z11 && dVar.h() && s0Var != null) {
            function12 = dVar.f77485d;
            C8408a.b w02 = interfaceC8412e2.w0();
            long e11 = w02.e();
            w02.a().save();
            try {
                w02.f().a(s0Var);
                function12.invoke(interfaceC8412e2);
            } finally {
                C3532b.b(w02, e11);
            }
        } else {
            function1 = dVar.f77485d;
            function1.invoke(interfaceC8412e2);
        }
        return Unit.f71690a;
    }
}

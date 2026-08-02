package n0;

import Bl0.C2652m;
import S0.C3969l;
import S0.InterfaceC3967k;
import S0.J0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import n1.InterfaceC8412e;
import org.jetbrains.annotations.NotNull;

/* renamed from: n0.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8392m {

    /* renamed from: n0.m$a */
    /* loaded from: classes8.dex */
    static final class a extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f76207b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<InterfaceC8412e, Unit> f76208c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f76209d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(androidx.compose.ui.e eVar, Function1<? super InterfaceC8412e, Unit> function1, int i11) {
            super(2);
            this.f76207b = eVar;
            this.f76208c = function1;
            this.f76209d = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
            num.intValue();
            int e11 = C2652m.e(this.f76209d | 1);
            C8392m.a(this.f76207b, this.f76208c, interfaceC3967k, e11);
            return Unit.f71690a;
        }
    }

    public static final void a(@NotNull androidx.compose.ui.e eVar, @NotNull Function1<? super InterfaceC8412e, Unit> function1, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        C3969l u11 = interfaceC3967k.u(-932836462);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(eVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.F(function1) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && u11.b()) {
            u11.j();
        } else {
            u0.E.a(u11, androidx.compose.ui.draw.c.b(eVar, function1));
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new a(eVar, function1, i11));
        }
    }
}

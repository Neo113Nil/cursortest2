package ru.ozon.android.messenger.blocks.ai.aiThinkingIndicator.presentation.compose;

import Bl0.C2652m;
import S0.A1;
import S0.C3969l;
import S0.D1;
import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import S0.J0;
import S0.Q;
import S0.n1;
import androidx.compose.foundation.layout.a0;
import androidx.recyclerview.widget.m;
import fd.InterfaceC6512o;
import i1.C6981a;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l0.C7770n;
import l0.InterfaceC7772p;
import l0.N;
import l0.r;
import m0.C8004n;
import m0.EnumC7987e0;
import m0.F;
import m0.G;
import m0.O;
import m0.T;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.ds.compose.component.text.DsTextAtomKt;
import ru.ozon.uni.atoms.data.text.TextDTO;

/* loaded from: classes10.dex */
public final class d {

    static final class a extends AbstractC7737t implements Function1<r<TextDTO>, N> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f84082b = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final N invoke(r<TextDTO> rVar) {
            r<TextDTO> AnimatedContent = rVar;
            Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
            return C7770n.c(androidx.compose.animation.b.h(C8004n.d(m.e.DEFAULT_DRAG_ANIMATION_DURATION, 0, F.a(), 2), 2), androidx.compose.animation.b.i(C8004n.d(m.e.DEFAULT_DRAG_ANIMATION_DURATION, 0, F.e(), 2), 2));
        }
    }

    static final class b extends AbstractC7737t implements InterfaceC6512o<InterfaceC7772p, TextDTO, InterfaceC3967k, Integer, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ A1<e> f84083b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(A1<e> a12) {
            super(4);
            this.f84083b = a12;
        }

        @Override // fd.InterfaceC6512o
        public final Unit invoke(InterfaceC7772p interfaceC7772p, TextDTO textDTO, InterfaceC3967k interfaceC3967k, Integer num) {
            InterfaceC7772p AnimatedContent = interfaceC7772p;
            TextDTO dto = textDTO;
            int intValue = num.intValue();
            Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
            Intrinsics.checkNotNullParameter(dto, "dto");
            DsTextAtomKt.DsTextAtom(dto, C6981a.a(a0.e(androidx.compose.ui.e.f40358c0, 1.0f), this.f84083b.getValue().a()), interfaceC3967k, (intValue >> 3) & 14, 0);
            return Unit.f71690a;
        }
    }

    static final class c extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ List<TextDTO> f84084b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(List<TextDTO> list, int i11) {
            super(2);
            this.f84084b = list;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
            num.intValue();
            int e11 = C2652m.e(1);
            d.a(this.f84084b, interfaceC3967k, e11);
            return Unit.f71690a;
        }
    }

    public static final void a(@NotNull List<TextDTO> statusMessages, InterfaceC3967k interfaceC3967k, int i11) {
        Intrinsics.checkNotNullParameter(statusMessages, "statusMessages");
        C3969l u11 = interfaceC3967k.u(-1627301588);
        int i12 = (u11.n(statusMessages) ? 4 : 2) | i11;
        if ((i12 & 3) == 2 && u11.b()) {
            u11.j();
        } else {
            Intrinsics.checkNotNullParameter(statusMessages, "statusMessages");
            u11.o(-648130554);
            u11.o(611642432);
            Object C11 = u11.C();
            if (C11 == InterfaceC3967k.a.a()) {
                C11 = n1.f(C7714v.K(statusMessages), D1.f25195a);
                u11.x(C11);
            }
            InterfaceC3978p0 interfaceC3978p0 = (InterfaceC3978p0) C11;
            u11.k();
            O.a a11 = T.a(T.c("infiniteAlphaAnim", u11, 0), 1.0f, 0.5f, C8004n.a(C8004n.d(1000, 0, G.b(), 2), EnumC7987e0.Reverse, 4), null, u11, 4536, 8);
            Unit unit = Unit.f71690a;
            u11.o(611660935);
            boolean z11 = (((i12 & 14) ^ 6) > 4 && u11.n(statusMessages)) || (i12 & 6) == 4;
            Object C12 = u11.C();
            if (z11 || C12 == InterfaceC3967k.a.a()) {
                C12 = new f(statusMessages, interfaceC3978p0, null);
                u11.x(C12);
            }
            u11.k();
            Q.e(u11, unit, (Function2) C12);
            u11.o(611667243);
            Object C13 = u11.C();
            if (C13 == InterfaceC3967k.a.a()) {
                C13 = n1.e(new g(a11, interfaceC3978p0));
                u11.x(C13);
            }
            A1 a12 = (A1) C13;
            u11.k();
            u11.k();
            TextDTO b11 = ((e) a12.getValue()).b();
            u11.o(1403544302);
            Object C14 = u11.C();
            if (C14 == InterfaceC3967k.a.a()) {
                C14 = a.f84082b;
                u11.x(C14);
            }
            u11.k();
            C7770n.a(b11, null, (Function1) C14, null, null, null, a1.c.c(1461345727, new b(a12), u11), u11, 1573248, 58);
            u11 = u11;
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new c(statusMessages, i11));
        }
    }
}

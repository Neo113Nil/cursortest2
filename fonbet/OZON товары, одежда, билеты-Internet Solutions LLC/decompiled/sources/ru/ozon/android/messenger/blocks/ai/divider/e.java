package ru.ozon.android.messenger.blocks.ai.divider;

import Bl0.C2652m;
import D1.InterfaceC2801g;
import Fr.g;
import S0.A0;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.J0;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.X;
import androidx.compose.foundation.layout.Y;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.e;
import e1.InterfaceC6250b;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l1.y0;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.ds.compose.component.text.DsTextAtomKt;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.core.repository.UniTheme;
import u0.C9891D;

/* loaded from: classes10.dex */
public final class e {

    static final class a extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f84103b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ru.ozon.android.messenger.blocks.ai.divider.b f84104c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(androidx.compose.ui.e eVar, ru.ozon.android.messenger.blocks.ai.divider.b bVar, int i11) {
            super(2);
            this.f84103b = eVar;
            this.f84104c = bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
            num.intValue();
            int e11 = C2652m.e(1);
            e.a(this.f84103b, this.f84104c, interfaceC3967k, e11);
            return Unit.f71690a;
        }
    }

    static final class b extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f84105b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ TextDTO f84106c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(androidx.compose.ui.e eVar, TextDTO textDTO, int i11) {
            super(2);
            this.f84105b = eVar;
            this.f84106c = textDTO;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
            num.intValue();
            int e11 = C2652m.e(1);
            e.b(this.f84105b, this.f84106c, interfaceC3967k, e11);
            return Unit.f71690a;
        }
    }

    public static final void a(@NotNull androidx.compose.ui.e modifier, @NotNull ru.ozon.android.messenger.blocks.ai.divider.b blockVO, InterfaceC3967k interfaceC3967k, int i11) {
        androidx.compose.ui.e b11;
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(blockVO, "blockVO");
        C3969l u11 = interfaceC3967k.u(-1219102176);
        if ((((u11.n(modifier) ? 4 : 2) | i11 | (u11.n(blockVO) ? 32 : 16)) & 19) == 18 && u11.b()) {
            u11.j();
        } else if (blockVO.a() != null) {
            u11.o(138723499);
            b(T.h(a0.e(modifier, 1.0f), 10, 0.0f, 2), blockVO.a(), u11, 0);
            u11.k();
        } else {
            u11.o(138899238);
            float f7 = 10;
            b11 = androidx.compose.foundation.e.b(T.j(a0.f(a0.e(androidx.compose.ui.e.f40358c0, 1.0f), 1), f7, 0.0f, f7, 0.0f, 10), UniTheme.INSTANCE.getColors(u11, UniTheme.$stable).getGraphicNeutral(), y0.a());
            C5185h.a(b11, u11, 0);
            u11.k();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new a(modifier, blockVO, i11));
        }
    }

    public static final void b(@NotNull androidx.compose.ui.e modifier, @NotNull TextDTO text, InterfaceC3967k interfaceC3967k, int i11) {
        androidx.compose.ui.e b11;
        androidx.compose.ui.e b12;
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(text, "text");
        C3969l u11 = interfaceC3967k.u(2077698680);
        int i12 = (u11.n(modifier) ? 4 : 2) | i11 | (u11.n(text) ? 32 : 16);
        if ((i12 & 19) == 18 && u11.b()) {
            u11.j();
        } else {
            Y b13 = X.b(C5179b.f(), InterfaceC6250b.a.i(), u11, 48);
            int I11 = u11.I();
            A0 d11 = u11.d();
            androidx.compose.ui.e f7 = androidx.compose.ui.c.f(u11, modifier);
            Function0 a11 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a11);
            } else {
                u11.e();
            }
            Function2 h11 = Cm.e.h(u11, b13, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                Ep.a.d(I11, u11, I11, h11);
            }
            F1.b(u11, f7, InterfaceC2801g.a.f());
            C9891D c9891d = C9891D.f99599a;
            e.a aVar = androidx.compose.ui.e.f40358c0;
            float f11 = 1;
            float f12 = 10;
            androidx.compose.ui.e j11 = T.j(a0.f(c9891d.a(aVar, 1.0f, true), f11), f12, 0.0f, f12, 0.0f, 10);
            UniTheme uniTheme = UniTheme.INSTANCE;
            int i13 = UniTheme.$stable;
            b11 = androidx.compose.foundation.e.b(j11, uniTheme.getColors(u11, i13).getGraphicNeutral(), y0.a());
            C5185h.a(b11, u11, 0);
            DsTextAtomKt.DsTextAtom(text, T.g(aVar, 0, f12), u11, ((i12 >> 3) & 14) | 48, 0);
            b12 = androidx.compose.foundation.e.b(T.j(a0.f(c9891d.a(aVar, 1.0f, true), f11), f12, 0.0f, f12, 0.0f, 10), uniTheme.getColors(u11, i13).getGraphicNeutral(), y0.a());
            C5185h.a(b12, u11, 0);
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new b(modifier, text, i11));
        }
    }
}

package ru.ozon.android.messenger.framework.presentation.common.screen.compose;

import Bl0.C2652m;
import D1.InterfaceC2801g;
import E0.C2942q;
import S0.A0;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.J0;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.X;
import androidx.compose.foundation.layout.Y;
import androidx.compose.ui.e;
import e1.InterfaceC6250b;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.ds.compose.component.button.DsIconButtonAtomKt;
import ru.ozon.uni.android.ds.compose.component.text.DsTextAtomKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import u0.C9915y;

/* loaded from: classes10.dex */
public final class j {

    static final class a extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ TextDTO f91084b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<AtomAction, Unit> f91085c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f91086d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(TextDTO textDTO, Function1<? super AtomAction, Unit> function1, int i11) {
            super(2);
            this.f91084b = textDTO;
            this.f91085c = function1;
            this.f91086d = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
            num.intValue();
            int e11 = C2652m.e(this.f91086d | 1);
            j.a(this.f91084b, this.f91085c, interfaceC3967k, e11);
            return Unit.f71690a;
        }
    }

    public static final void a(@NotNull TextDTO title, Function1<? super AtomAction, Unit> function1, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        Intrinsics.checkNotNullParameter(title, "title");
        C3969l u11 = interfaceC3967k.u(-142113649);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(title) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.F(function1) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && u11.b()) {
            u11.j();
        } else {
            float f7 = 16;
            C9915y b11 = T.b(0.0f, f7, f7, 8, 1);
            e.a aVar = androidx.compose.ui.e.f40358c0;
            Y b12 = X.b(C5179b.f(), InterfaceC6250b.a.l(), u11, 0);
            int I11 = u11.I();
            A0 d11 = u11.d();
            androidx.compose.ui.e f11 = androidx.compose.ui.c.f(u11, aVar);
            Function0 a11 = Fr.g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a11);
            } else {
                u11.e();
            }
            Function2 h11 = Cm.e.h(u11, b12, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                Ep.a.d(I11, u11, I11, h11);
            }
            F1.b(u11, f11, InterfaceC2801g.a.f());
            if (1.0f <= 0.0d) {
                throw new IllegalArgumentException(C2942q.b(1.0f, "invalid weight ", "; must be greater than zero").toString());
            }
            DsTextAtomKt.DsTextAtom(title, new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), u11, i12 & 14, 0);
            DsIconButtonAtomKt.DsIconButtonAtom(new IconButtonV3DTO(null, ButtonV3DTO.StyleTypes.CUSTOM, IconButtonV3DTO.IconButtonShape.SHAPE_CIRCLE, "ic_s_cross_filled", null, "graphicSecondary", "bgOverlap", new CommonControlSettings(new AtomActionDTO(AtomActionDTO.Behavior.DISMISS, null, null, null, 14, null), null, null, 6, null), null, null, null, null, null, null, 16145, null), T.e(aVar, b11), false, function1, u11, IconButtonV3DTO.$stable | 48 | ((i12 << 6) & 7168), 4);
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new a(title, function1, i11));
        }
    }
}

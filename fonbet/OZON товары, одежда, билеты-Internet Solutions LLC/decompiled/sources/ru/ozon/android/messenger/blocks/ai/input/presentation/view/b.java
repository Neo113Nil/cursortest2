package ru.ozon.android.messenger.blocks.ai.input.presentation.view;

import B1.V;
import Bl0.C2652m;
import D1.InterfaceC2801g;
import S0.A0;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.J0;
import T7.E;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.X;
import androidx.compose.foundation.layout.Y;
import androidx.compose.foundation.layout.a0;
import androidx.compose.foundation.z;
import androidx.compose.ui.e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import n0.C8385f;
import n0.C8391l;
import n0.d0;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.analytics.MessengerTrackingInfo;
import ru.ozon.uni.android.ds.compose.component.text.DsTextAtomKt;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.core.repository.UniTheme;
import u0.C9891D;

/* loaded from: classes10.dex */
public final class b {

    static final class a extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ TextDTO f84215b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ IconButtonV3DTO f84216c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f84217d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f84218e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function2<InterfaceC3967k, Integer, Unit> f84219f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function2<Map<String, MessengerTrackingInfo>, ru.ozon.android.messenger.framework.navigation.action.a, Unit> f84220g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f84221h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(TextDTO textDTO, IconButtonV3DTO iconButtonV3DTO, String str, boolean z11, Function2<? super InterfaceC3967k, ? super Integer, Unit> function2, Function2<? super Map<String, MessengerTrackingInfo>, ? super ru.ozon.android.messenger.framework.navigation.action.a, Unit> function22, int i11) {
            super(2);
            this.f84215b = textDTO;
            this.f84216c = iconButtonV3DTO;
            this.f84217d = str;
            this.f84218e = z11;
            this.f84219f = function2;
            this.f84220g = function22;
            this.f84221h = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
            num.intValue();
            int e11 = C2652m.e(this.f84221h | 1);
            Function2<InterfaceC3967k, Integer, Unit> function2 = this.f84219f;
            Function2<Map<String, MessengerTrackingInfo>, ru.ozon.android.messenger.framework.navigation.action.a, Unit> function22 = this.f84220g;
            b.a(this.f84215b, this.f84216c, this.f84217d, this.f84218e, function2, function22, interfaceC3967k, e11);
            return Unit.f71690a;
        }
    }

    public static final void a(TextDTO textDTO, IconButtonV3DTO iconButtonV3DTO, @NotNull String outlineColor, boolean z11, @NotNull Function2<? super InterfaceC3967k, ? super Integer, Unit> innerTextField, @NotNull Function2<? super Map<String, MessengerTrackingInfo>, ? super ru.ozon.android.messenger.framework.navigation.action.a, Unit> onSendClick, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        boolean z12;
        Intrinsics.checkNotNullParameter(outlineColor, "outlineColor");
        Intrinsics.checkNotNullParameter(innerTextField, "innerTextField");
        Intrinsics.checkNotNullParameter(onSendClick, "onSendClick");
        C3969l u11 = interfaceC3967k.u(1796343941);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(textDTO) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= (i11 & 64) == 0 ? u11.n(iconButtonV3DTO) : u11.F(iconButtonV3DTO) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.n(outlineColor) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i11 & 3072) == 0) {
            z12 = z11;
            i12 |= u11.p(z12) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        } else {
            z12 = z11;
        }
        if ((i11 & 24576) == 0) {
            i12 |= u11.F(innerTextField) ? 16384 : 8192;
        }
        if ((196608 & i11) == 0) {
            i12 |= u11.F(onSendClick) ? 131072 : 65536;
        }
        if ((74899 & i12) == 74898 && u11.b()) {
            u11.j();
        } else {
            UniTheme uniTheme = UniTheme.INSTANCE;
            float padding350 = uniTheme.getPaddings().getPadding350();
            float padding400 = uniTheme.getPaddings().getPadding400();
            float padding500 = uniTheme.getPaddings().getPadding500();
            d0 b11 = z.b(u11);
            e.a aVar = androidx.compose.ui.e.f40358c0;
            int i13 = i12 >> 6;
            int i14 = i12;
            C8391l c8391l = new C8391l(ru.ozon.android.messenger.utils.compose.a.a(outlineColor, u11, i13 & 14), ru.ozon.android.messenger.blocks.ai.input.presentation.view.a.c());
            androidx.compose.ui.e e11 = a0.e(T.i(androidx.compose.foundation.e.b(a0.h(a0.b(C8385f.d(aVar, c8391l.c(), c8391l.b(), A0.h.b(uniTheme.getRadii().getRadius600())), 0.0f, ru.ozon.android.messenger.blocks.ai.input.presentation.view.a.e(), 1), 0.0f, ru.ozon.android.messenger.blocks.ai.input.presentation.view.a.d(), 1), uniTheme.getColors(u11, UniTheme.$stable).getLayerFloor1(), A0.h.b(uniTheme.getRadii().getRadius600())), padding500, ru.ozon.android.messenger.blocks.ai.input.presentation.view.a.c(), padding400, ru.ozon.android.messenger.blocks.ai.input.presentation.view.a.c()), 1.0f);
            Y b12 = X.b(C5179b.f(), InterfaceC6250b.a.i(), u11, 48);
            int I11 = u11.I();
            A0 d11 = u11.d();
            androidx.compose.ui.e f7 = androidx.compose.ui.c.f(u11, e11);
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
            F1.b(u11, f7, InterfaceC2801g.a.f());
            C9891D c9891d = C9891D.f99599a;
            androidx.compose.ui.e b13 = c9891d.b(T.h(z.c(T.j(c9891d.a(aVar, 1.0f, true), 0.0f, 0.0f, padding400, 0.0f, 11), b11, 6), 0.0f, padding350, 1), InterfaceC6250b.a.i());
            V f11 = C5185h.f(InterfaceC6250b.a.o(), false);
            int I12 = u11.I();
            A0 d12 = u11.d();
            androidx.compose.ui.e f12 = androidx.compose.ui.c.f(u11, b13);
            Function0 a12 = InterfaceC2801g.a.a();
            u11.i();
            if (u11.t()) {
                u11.H(a12);
            } else {
                u11.e();
            }
            Function2 f13 = E.f(u11, f11, u11, d12);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I12))) {
                Ep.a.d(I12, u11, I12, f13);
            }
            F1.b(u11, f12, InterfaceC2801g.a.f());
            innerTextField.invoke(u11, Integer.valueOf((i14 >> 12) & 14));
            u11.o(-1092082654);
            if (textDTO != null) {
                DsTextAtomKt.DsTextAtom(textDTO, null, u11, i14 & 14, 2);
            }
            u11.k();
            u11.f();
            e.a(c9891d.b(T.j(aVar, 0.0f, 0.0f, 0.0f, padding350, 7), InterfaceC6250b.a.a()), z12, iconButtonV3DTO, onSendClick, u11, (IconButtonV3DTO.$stable << 6) | (i13 & 112) | ((i14 << 3) & 896) | (i13 & 7168));
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new a(textDTO, iconButtonV3DTO, outlineColor, z11, innerTextField, onSendClick, i11));
        }
    }
}

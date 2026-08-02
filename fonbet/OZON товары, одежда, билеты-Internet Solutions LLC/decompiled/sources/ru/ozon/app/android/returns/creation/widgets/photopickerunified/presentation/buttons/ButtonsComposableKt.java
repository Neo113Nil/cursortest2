package ru.ozon.app.android.returns.creation.widgets.photopickerunified.presentation.buttons;

import A0.h;
import D1.InterfaceC2801g;
import Ep.a;
import Fr.g;
import K00.b;
import S0.A0;
import S0.C3969l;
import S0.InterfaceC3967k;
import S0.J0;
import U7.i;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5193p;
import androidx.compose.foundation.layout.C5194q;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.C5236c1;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.ds.compose.component.button.DsButtonAtomKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.core.repository.UniTheme;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aK\u0010\b\u001a\u00020\u00052\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0007¢\u0006\u0004\b\b\u0010\t\u001a)\u0010\u0012\u001a\u00020\n*\u00020\n2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "continueButton", "addPhotoButton", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "onContinue", "onAddPhoto", "ButtonsComposable", "(Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;LS0/k;I)V", "Landroidx/compose/ui/e;", "LZ1/h;", "strokeWidth", "radius", "Ll1/Z;", "color", "outerRoundedBorder-B2jEHPA", "(Landroidx/compose/ui/e;FFJ)Landroidx/compose/ui/e;", "outerRoundedBorder", "creation_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ButtonsComposableKt {
    public static final void ButtonsComposable(ButtonV3DTO buttonV3DTO, ButtonV3DTO buttonV3DTO2, @NotNull Function1<? super AtomAction, Unit> onContinue, @NotNull Function1<? super AtomAction, Unit> onAddPhoto, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        Intrinsics.checkNotNullParameter(onContinue, "onContinue");
        Intrinsics.checkNotNullParameter(onAddPhoto, "onAddPhoto");
        C3969l u11 = interfaceC3967k.u(461525311);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(buttonV3DTO) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.n(buttonV3DTO2) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.F(onContinue) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i11 & 3072) == 0) {
            i12 |= u11.F(onAddPhoto) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        int i13 = i12;
        if ((i13 & 1171) == 1170 && u11.b()) {
            u11.j();
        } else {
            e.a aVar = e.f40358c0;
            float f7 = 1;
            e j11 = T.j(a0.e(aVar, 1.0f), 0.0f, f7, 0.0f, 0.0f, 13);
            UniTheme uniTheme = UniTheme.INSTANCE;
            int i14 = UniTheme.$stable;
            float f11 = 20;
            e m947outerRoundedBorderB2jEHPA = m947outerRoundedBorderB2jEHPA(androidx.compose.foundation.e.b(j11, uniTheme.getColors(u11, i14).getLayerFloor1(), h.d(f11, f11, 0.0f, 0.0f, 12)), f7, f11, uniTheme.getColors(u11, i14).getGraphicDisabled());
            float f12 = 8;
            e i15 = T.i(m947outerRoundedBorderB2jEHPA, f12, f12, f12, 4);
            C5194q a11 = C5193p.a(C5179b.n(f12), InterfaceC6250b.a.k(), u11, 6);
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f13 = c.f(u11, i15);
            Function0 a12 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a12);
            } else {
                u11.e();
            }
            Function2 g10 = b.g(u11, a11, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                a.d(I11, u11, I11, g10);
            }
            i.b(u11, f13, 1486233227);
            if (buttonV3DTO != null) {
                DsButtonAtomKt.DsButtonAtom(buttonV3DTO, a0.e(aVar, 1.0f), false, onContinue, u11, ((i13 << 3) & 7168) | 48, 4);
            }
            u11.k();
            u11.o(1486240235);
            if (buttonV3DTO2 != null) {
                DsButtonAtomKt.DsButtonAtom(buttonV3DTO2, a0.e(aVar, 1.0f), false, onAddPhoto, u11, (i13 & 7168) | 48, 4);
            }
            u11.k();
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new ButtonsComposableKt$ButtonsComposable$2(buttonV3DTO, buttonV3DTO2, onContinue, onAddPhoto, i11));
        }
    }

    @NotNull
    /* renamed from: outerRoundedBorder-B2jEHPA, reason: not valid java name */
    public static final e m947outerRoundedBorderB2jEHPA(@NotNull e outerRoundedBorder, float f7, float f11, long j11) {
        e b11;
        Intrinsics.checkNotNullParameter(outerRoundedBorder, "$this$outerRoundedBorder");
        b11 = c.b(outerRoundedBorder, C5236c1.a(), new ButtonsComposableKt$outerRoundedBorder$1(j11, f11, f7));
        return b11;
    }
}

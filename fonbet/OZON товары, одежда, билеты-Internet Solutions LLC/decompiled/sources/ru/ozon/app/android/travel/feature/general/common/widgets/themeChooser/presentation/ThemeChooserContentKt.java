package ru.ozon.app.android.travel.feature.general.common.widgets.themeChooser.presentation;

import D1.InterfaceC2801g;
import Ep.a;
import Fr.g;
import J0.r;
import S0.A0;
import S0.A1;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import S0.J0;
import android.content.Context;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.X;
import androidx.compose.foundation.layout.Y;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import e3.C6285b;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.h;
import l1.C7811b0;
import l1.y0;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.common.widgets.themeChooser.data.ThemeChooserDTO;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.selectionControls.radiobutton.RadioDTO;
import u0.C9891D;
import u0.InterfaceC9890C;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a7\u0010\f\u001a\u00020\u0002*\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00020\nH\u0003¢\u0006\u0004\b\f\u0010\r¨\u0006\u0010²\u0006\f\u0010\u000f\u001a\u00020\u000e8\nX\u008a\u0084\u0002"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/themeChooser/presentation/ThemeChooserViewModel;", "viewModel", "", "ThemeChooserContent", "(Lru/ozon/app/android/travel/feature/general/common/widgets/themeChooser/presentation/ThemeChooserViewModel;LS0/k;I)V", "Lu0/C;", "Lru/ozon/app/android/travel/feature/general/common/widgets/themeChooser/data/ThemeChooserDTO$ThemeSelector;", "themeSelector", "Lru/ozon/app/android/travel/feature/general/common/widgets/themeChooser/data/ThemeChooserDTO$ThemeEnum;", "currentTheme", "Lkotlin/Function1;", "themeSelectCallback", "ThemeItem", "(Lu0/C;Lru/ozon/app/android/travel/feature/general/common/widgets/themeChooser/data/ThemeChooserDTO$ThemeSelector;Lru/ozon/app/android/travel/feature/general/common/widgets/themeChooser/data/ThemeChooserDTO$ThemeEnum;Lkotlin/jvm/functions/Function1;LS0/k;I)V", "Lru/ozon/app/android/travel/feature/general/common/widgets/themeChooser/presentation/UIState;", "state", "common_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ThemeChooserContentKt {
    public static final void ThemeChooserContent(@NotNull ThemeChooserViewModel viewModel, InterfaceC3967k interfaceC3967k, int i11) {
        e b11;
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        C3969l u11 = interfaceC3967k.u(-1076217267);
        if ((((i11 & 6) == 0 ? (u11.F(viewModel) ? 4 : 2) | i11 : i11) & 3) == 2 && u11.b()) {
            u11.j();
        } else {
            int themeColor = ThemeExtKt.themeColor((Context) u11.m(AndroidCompositionLocals_androidKt.d()), R$attr.layerFloor1);
            InterfaceC3978p0 c11 = C6285b.c(viewModel.getWidgetState(), u11, 0);
            b11 = androidx.compose.foundation.e.b(a0.e(e.f40358c0, 1.0f), C7811b0.b(themeColor), y0.a());
            e h11 = T.h(b11, Paddings.PADDING_500.m1867getDpD9Ej5fM(), 0.0f, 2);
            int i12 = C5179b.f39454h;
            Y b12 = X.b(C5179b.o(Paddings.PADDING_400.m1867getDpD9Ej5fM(), InterfaceC6250b.a.g()), InterfaceC6250b.a.l(), u11, 0);
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f7 = c.f(u11, h11);
            Function0 a11 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a11);
            } else {
                u11.e();
            }
            Function2 h12 = Cm.e.h(u11, b12, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                a.d(I11, u11, I11, h12);
            }
            F1.b(u11, f7, InterfaceC2801g.a.f());
            C9891D c9891d = C9891D.f99599a;
            ThemeChooserVI data = ThemeChooserContent$lambda$0(c11).getData();
            List<ThemeChooserDTO.ThemeSelector> selectors = data != null ? data.getSelectors() : null;
            u11.o(-1638138938);
            if (selectors != null) {
                for (ThemeChooserDTO.ThemeSelector themeSelector : selectors) {
                    ThemeChooserDTO.ThemeEnum currentTheme = ThemeChooserContent$lambda$0(c11).getCurrentTheme();
                    u11.o(629995186);
                    boolean F11 = u11.F(viewModel);
                    Object C11 = u11.C();
                    if (F11 || C11 == InterfaceC3967k.a.a()) {
                        C11 = new ThemeChooserContentKt$ThemeChooserContent$1$1$1$1(viewModel);
                        u11.x(C11);
                    }
                    u11.k();
                    ThemeItem(c9891d, themeSelector, currentTheme, (Function1) ((h) C11), u11, (RadioDTO.$stable << 3) | 6);
                }
            }
            u11.k();
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new ThemeChooserContentKt$ThemeChooserContent$2(viewModel, i11));
        }
    }

    private static final UIState ThemeChooserContent$lambda$0(A1<UIState> a12) {
        return a12.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ThemeItem(InterfaceC9890C interfaceC9890C, ThemeChooserDTO.ThemeSelector themeSelector, ThemeChooserDTO.ThemeEnum themeEnum, Function1<? super ThemeChooserDTO.ThemeEnum, Unit> function1, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        C3969l u11 = interfaceC3967k.u(843101711);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(interfaceC9890C) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= (i11 & 64) == 0 ? u11.n(themeSelector) : u11.F(themeSelector) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.n(themeEnum) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i11 & 3072) == 0) {
            i12 |= u11.F(function1) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i12 & 1171) == 1170 && u11.b()) {
            u11.j();
        } else {
            int parseColor = StyleParser.INSTANCE.parseColor((Context) u11.m(AndroidCompositionLocals_androidKt.d()), themeSelector.getBackgroundColor(), R$color.bg_secondary);
            boolean z11 = true;
            boolean z12 = themeEnum == themeSelector.getTheme();
            e a11 = interfaceC9890C.a(e.f40358c0, 1.0f, true);
            u11.o(944299302);
            boolean z13 = (i12 & 7168) == 2048;
            if ((i12 & 112) != 32 && ((i12 & 64) == 0 || !u11.F(themeSelector))) {
                z11 = false;
            }
            boolean z14 = z13 | z11;
            Object C11 = u11.C();
            if (z14 || C11 == InterfaceC3967k.a.a()) {
                C11 = new ThemeChooserContentKt$ThemeItem$1$1(function1, themeSelector);
                u11.x(C11);
            }
            u11.k();
            r.a(androidx.compose.foundation.selection.c.b(a11, z12, null, (Function0) C11, 6), A0.h.b(CornerRadius.RADIUS_400.m1866getDpD9Ej5fM()), C7811b0.b(parseColor), Paddings.NONE.m1867getDpD9Ej5fM(), a1.c.c(698428530, new ThemeChooserContentKt$ThemeItem$2(themeSelector), u11), u11, 1572864, 24);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new ThemeChooserContentKt$ThemeItem$3(interfaceC9890C, themeSelector, themeEnum, function1, i11));
        }
    }
}

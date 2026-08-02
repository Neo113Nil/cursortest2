package ru.ozon.app.android.travel.feature.general.common.widgets.iconChooser.presentation;

import A0.h;
import B1.V;
import D1.InterfaceC2801g;
import Ep.a;
import Fr.g;
import K00.b;
import S0.A0;
import S0.A1;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import S0.J0;
import S0.Q;
import T7.E;
import WZ.l;
import WZ.t;
import androidx.compose.foundation.layout.B;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.C5193p;
import androidx.compose.foundation.layout.C5194q;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.lifecycle.AbstractC5434v;
import b00.f;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import e3.C6285b;
import e3.i;
import i1.C6988h;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l1.C7807Z;
import l1.y0;
import n0.C8366G;
import n0.C8385f;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.travel.feature.general.common.widgets.iconChooser.data.IconChooserDTO;
import ru.ozon.app.android.travel.feature.general.common.widgets.iconChooser.presentation.IconChooserVI;
import ru.ozon.app.android.travel.utils.extensions.ComposeColorKt;
import ru.ozon.uni.android.ds.compose.component.text.DsTextAtomKt;
import ru.ozon.uni.atoms.data.aspect.AspectDTO;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.core.UniColors;
import ru.ozon.uni.core.compose.tokens.TokenParserKt;
import t0.p;
import t0.q;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a%\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001aO\u0010\u0012\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\r2\u000e\u0010\u0011\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u0010H\u0001¢\u0006\u0004\b\u0012\u0010\u0013\u001aE\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u001b\u001a\u00020\u001aH\u0003¢\u0006\u0004\b\u001c\u0010\u001d\u001a;\u0010\u001e\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\r2\u000e\u0010\u0011\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u0010H\u0002¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006\"²\u0006\f\u0010!\u001a\u00020 8\nX\u008a\u0084\u0002"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/iconChooser/presentation/IconChooserViewModel;", "viewModel", "Lkotlin/Function0;", "", "openBottomSheetCallback", "IconChooserContent", "(Lru/ozon/app/android/travel/feature/general/common/widgets/iconChooser/presentation/IconChooserViewModel;Lkotlin/jvm/functions/Function0;LS0/k;I)V", "Lru/ozon/app/android/travel/feature/general/common/widgets/iconChooser/presentation/IconChooserVI$IconSelectorVI;", "selector", "Lru/ozon/app/android/travel/feature/general/common/widgets/iconChooser/data/IconChooserDTO$SelectedStyle;", "selectedStyle", "Lru/ozon/app/android/travel/feature/general/common/widgets/iconChooser/presentation/IconChooserVI$EnabledStyle;", "enabledStyle", "Lkotlin/Function1;", "iconSelectCallback", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "IconSelector", "(Lru/ozon/app/android/travel/feature/general/common/widgets/iconChooser/presentation/IconChooserVI$IconSelectorVI;Lru/ozon/app/android/travel/feature/general/common/widgets/iconChooser/data/IconChooserDTO$SelectedStyle;Lru/ozon/app/android/travel/feature/general/common/widgets/iconChooser/presentation/IconChooserVI$EnabledStyle;Lkotlin/jvm/functions/Function1;LWZ/l;LS0/k;I)V", "", "iconName", "Lru/ozon/uni/atoms/data/aspect/AspectDTO;", "aspect", "Lru/ozon/app/android/travel/feature/general/common/widgets/iconChooser/presentation/IconChooserVI$IconEnum;", "icon", "", "isSelected", "AspectIcon", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/aspect/AspectDTO;Lru/ozon/app/android/travel/feature/general/common/widgets/iconChooser/presentation/IconChooserVI$IconEnum;Lru/ozon/app/android/travel/feature/general/common/widgets/iconChooser/data/IconChooserDTO$SelectedStyle;Lru/ozon/app/android/travel/feature/general/common/widgets/iconChooser/presentation/IconChooserVI$EnabledStyle;ZLS0/k;I)V", "onItemClick", "(Lru/ozon/app/android/travel/feature/general/common/widgets/iconChooser/presentation/IconChooserVI$IconSelectorVI;Lkotlin/jvm/functions/Function1;LWZ/l;)V", "Lru/ozon/app/android/travel/feature/general/common/widgets/iconChooser/presentation/UIState;", "state", "common_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class IconChooserContentKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void AspectIcon(String str, AspectDTO aspectDTO, IconChooserVI.IconEnum iconEnum, IconChooserDTO.SelectedStyle selectedStyle, IconChooserVI.EnabledStyle enabledStyle, boolean z11, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        IconChooserVI.IconEnum iconEnum2;
        CornerRadius cornerRadius;
        C3969l u11 = interfaceC3967k.u(-1253478269);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(str) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= (i11 & 64) == 0 ? u11.n(aspectDTO) : u11.F(aspectDTO) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            iconEnum2 = iconEnum;
            i12 |= u11.n(iconEnum2) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        } else {
            iconEnum2 = iconEnum;
        }
        if ((i11 & 3072) == 0) {
            i12 |= u11.n(selectedStyle) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i11 & 24576) == 0) {
            i12 |= u11.n(enabledStyle) ? 16384 : 8192;
        }
        if ((196608 & i11) == 0) {
            i12 |= u11.p(z11) ? 131072 : 65536;
        }
        if ((74899 & i12) == 74898 && u11.b()) {
            u11.j();
        } else {
            C7807Z parseColorToken = TokenParserKt.parseColorToken(selectedStyle != null ? selectedStyle.getAspectBorderColor() : null, u11, 0);
            u11.o(1222845352);
            long composeColor = parseColorToken == null ? ComposeColorKt.composeColor(UniColors.GRAPHIC_ACTION_PRIMARY, u11, 6) : parseColorToken.w();
            u11.k();
            C7807Z parseColorToken2 = TokenParserKt.parseColorToken(enabledStyle != null ? enabledStyle.getAspectBorderColor() : null, u11, 0);
            u11.o(1222849312);
            long composeColor2 = parseColorToken2 == null ? ComposeColorKt.composeColor(UniColors.GRAPHIC_NEUTRAL, u11, 6) : parseColorToken2.w();
            u11.k();
            e.a aVar = e.f40358c0;
            e n11 = a0.n(aVar, 72);
            float f7 = z11 ? 2 : 1;
            if (!z11) {
                composeColor = composeColor2;
            }
            if (aspectDTO == null || (cornerRadius = aspectDTO.getRadius()) == null) {
                cornerRadius = CornerRadius.RADIUS_600;
            }
            e c11 = C8385f.c(f7, composeColor, n11, h.b(cornerRadius.m1866getDpD9Ej5fM()));
            V f11 = C5185h.f(InterfaceC6250b.a.e(), false);
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f12 = c.f(u11, c11);
            Function0 a11 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a11);
            } else {
                u11.e();
            }
            Function2 f13 = E.f(u11, f11, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                a.d(I11, u11, I11, f13);
            }
            F1.b(u11, f12, InterfaceC2801g.a.f());
            C8366G.a(G1.e.a(IconChooserMapperKt.mapToResourceId(iconEnum2), u11, 0), str, C6988h.a(a0.n(aVar, 64), h.b(CornerRadius.RADIUS_550.m1866getDpD9Ej5fM())), null, null, 0.0f, null, u11, (i12 << 3) & 112, 120);
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new IconChooserContentKt$AspectIcon$2(str, aspectDTO, iconEnum2, selectedStyle, enabledStyle, z11, i11));
        }
    }

    public static final void IconChooserContent(@NotNull IconChooserViewModel viewModel, @NotNull Function0<Unit> openBottomSheetCallback, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        e b11;
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(openBottomSheetCallback, "openBottomSheetCallback");
        C3969l u11 = interfaceC3967k.u(-346572657);
        if ((i11 & 6) == 0) {
            i12 = (u11.F(viewModel) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.F(openBottomSheetCallback) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && u11.b()) {
            u11.j();
        } else {
            l lVar = (l) u11.m(f.e());
            InterfaceC3978p0 c11 = C6285b.c(viewModel.getWidgetState(), u11, 0);
            IconChooserVI data = IconChooserContent$lambda$0(c11).getData();
            t viewEvent = data != null ? data.getViewEvent() : null;
            u11.o(-1009453074);
            if (viewEvent != null) {
                AbstractC5434v.a aVar = AbstractC5434v.a.ON_RESUME;
                u11.o(194388585);
                boolean F11 = u11.F(lVar) | u11.F(viewEvent);
                Object C11 = u11.C();
                if (F11 || C11 == InterfaceC3967k.a.a()) {
                    C11 = new IconChooserContentKt$IconChooserContent$1$1$1(lVar, viewEvent);
                    u11.x(C11);
                }
                u11.k();
                i.a(aVar, null, (Function0) C11, u11, 6);
                Unit unit = Unit.f71690a;
            }
            u11.k();
            Unit unit2 = Unit.f71690a;
            u11.o(-1009447712);
            boolean F12 = ((i12 & 112) == 32) | u11.F(viewModel);
            Object C12 = u11.C();
            if (F12 || C12 == InterfaceC3967k.a.a()) {
                C12 = new IconChooserContentKt$IconChooserContent$2$1(viewModel, openBottomSheetCallback, null);
                u11.x(C12);
            }
            u11.k();
            Q.e(u11, unit2, (Function2) C12);
            e.a aVar2 = e.f40358c0;
            b11 = androidx.compose.foundation.e.b(a0.e(aVar2, 1.0f), ComposeColorKt.composeColor(UniColors.LAYER_FLOOR_1, u11, 6), y0.a());
            C5194q a11 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), u11, 48);
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f7 = c.f(u11, b11);
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
            F1.b(u11, f7, InterfaceC2801g.a.f());
            IconChooserVI data2 = IconChooserContent$lambda$0(c11).getData();
            TextDTO title = data2 != null ? data2.getTitle() : null;
            u11.o(194406132);
            if (title != null) {
                Paddings paddings = Paddings.PADDING_500;
                DsTextAtomKt.DsTextAtom(title, T.h(aVar2, paddings.m1867getDpD9Ej5fM(), 0.0f, 2), u11, 0, 0);
                u0.E.a(u11, a0.f(aVar2, paddings.m1867getDpD9Ej5fM()));
            }
            u11.k();
            e h11 = T.h(a0.e(aVar2, 1.0f), Paddings.PADDING_500.m1867getDpD9Ej5fM(), 0.0f, 2);
            Paddings paddings2 = Paddings.PADDING_550;
            B.a(h11, C5179b.n(paddings2.m1867getDpD9Ej5fM()), C5179b.n(paddings2.m1867getDpD9Ej5fM()), 0, 0, null, a1.c.c(1589191124, new IconChooserContentKt$IconChooserContent$3$2(c11, viewModel, lVar), u11), u11, 1572864, 56);
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new IconChooserContentKt$IconChooserContent$4(viewModel, openBottomSheetCallback, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UIState IconChooserContent$lambda$0(A1<UIState> a12) {
        return a12.getValue();
    }

    public static final void IconSelector(@NotNull IconChooserVI.IconSelectorVI selector, IconChooserDTO.SelectedStyle selectedStyle, IconChooserVI.EnabledStyle enabledStyle, @NotNull Function1<? super IconChooserVI.IconSelectorVI, Unit> iconSelectCallback, l lVar, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        boolean z11;
        Intrinsics.checkNotNullParameter(selector, "selector");
        Intrinsics.checkNotNullParameter(iconSelectCallback, "iconSelectCallback");
        C3969l u11 = interfaceC3967k.u(-643495063);
        if ((i11 & 6) == 0) {
            i12 = (u11.F(selector) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.n(selectedStyle) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.n(enabledStyle) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i11 & 3072) == 0) {
            i12 |= u11.F(iconSelectCallback) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i11 & 24576) == 0) {
            i12 |= u11.F(lVar) ? 16384 : 8192;
        }
        if ((i12 & 9363) == 9362 && u11.b()) {
            u11.j();
        } else {
            AspectDTO aspect = selector.getAspect();
            boolean z12 = false;
            if ((aspect != null ? aspect.getState() : null) == AspectDTO.AspectState.SELECTED) {
                z11 = false;
                z12 = true;
            } else {
                z11 = false;
            }
            e.a aVar = e.f40358c0;
            u11.o(-2113215406);
            Object C11 = u11.C();
            if (C11 == InterfaceC3967k.a.a()) {
                C11 = p.a();
                u11.x(C11);
            }
            q qVar = (q) C11;
            u11.k();
            u11.o(-2113227143);
            boolean p11 = u11.p(z12) | u11.F(selector) | ((i12 & 7168) != 2048 ? z11 : true) | u11.F(lVar);
            Object C12 = u11.C();
            if (p11 || C12 == InterfaceC3967k.a.a()) {
                C12 = new IconChooserContentKt$IconSelector$2$1(z12, selector, iconSelectCallback, lVar);
                u11.x(C12);
            }
            u11.k();
            e b11 = androidx.compose.foundation.i.b(aVar, qVar, null, false, null, null, (Function0) C12, 28);
            C5194q a11 = C5193p.a(C5179b.g(), InterfaceC6250b.a.g(), u11, 48);
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f7 = c.f(u11, b11);
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
            F1.b(u11, f7, InterfaceC2801g.a.f());
            AspectDTO aspect2 = selector.getAspect();
            IconChooserVI.IconEnum appIcon = selector.getAppIcon();
            String obj = selector.getTitle().getText().toString();
            Intrinsics.checkNotNullExpressionValue(obj, "toString(...)");
            int i13 = i12 << 6;
            AspectIcon(obj, aspect2, appIcon, selectedStyle, enabledStyle, z12, u11, (AspectDTO.$stable << 3) | (i13 & 7168) | (i13 & 57344));
            DsTextAtomKt.DsTextAtom(selector.getTitle(), null, u11, 0, 2);
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new IconChooserContentKt$IconSelector$4(selector, selectedStyle, enabledStyle, iconSelectCallback, lVar, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onItemClick(IconChooserVI.IconSelectorVI iconSelectorVI, Function1<? super IconChooserVI.IconSelectorVI, Unit> function1, l lVar) {
        function1.invoke(iconSelectorVI);
        t clickEvent = iconSelectorVI.getClickEvent();
        if (clickEvent == null || lVar == null) {
            return;
        }
        TokenizedAnalyticsExtensionsKt.processClickEvents$default(lVar, clickEvent, null, 2, null);
    }
}

package ru.ozon.android.messenger.blocks.ai.header.presentation.compose;

import B1.v0;
import D1.InterfaceC2801g;
import S0.A0;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.J0;
import a1.C4912a;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5193p;
import androidx.compose.foundation.layout.C5194q;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.X;
import androidx.compose.foundation.layout.Y;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.Q1;
import androidx.lifecycle.AbstractC5434v;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l1.C7807Z;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.blocks.ai.header.AiHeaderDTO;
import ru.ozon.android.messenger.blocks.ai.header.presentation.a;
import ru.ozon.uni.android.ds.compose.component.button.DsButtonAtomKt;
import ru.ozon.uni.android.ds.compose.component.button.DsIconButtonAtomKt;
import ru.ozon.uni.android.ds.compose.component.icon.DsIconAtomKt;
import ru.ozon.uni.android.ds.compose.component.text.DsTextAtomKt;
import ru.ozon.uni.android.ds.compose.util.DsSpacings;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.common.CommonAtomIconDTO;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.data.text.TextPreset;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;
import ru.ozon.uni.core.compose.tokens.TokenParserKt;
import ru.ozon.uni.core.repository.UniTheme;

/* loaded from: classes10.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    private static final float f84179a = 44;

    /* renamed from: b, reason: collision with root package name */
    private static final float f84180b = 10;

    /* renamed from: c, reason: collision with root package name */
    private static final float f84181c = 8;

    /* renamed from: d, reason: collision with root package name */
    private static final float f84182d = 4;

    /* renamed from: e, reason: collision with root package name */
    private static final float f84183e = 16;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private static final IconDTO f84184f;

    static {
        IconDTO.IconSize iconSize = IconDTO.IconSize.SIZE_300;
        IconDTO.IconShape iconShape = IconDTO.IconShape.SHAPE_NONE;
        UniTheme uniTheme = UniTheme.INSTANCE;
        f84184f = new IconDTO(iconSize, null, iconShape, null, new CommonAtomIconDTO("ic_s_chevron_right", uniTheme.getColorTokens().getGraphicTertiary().getId()), null, null, null, null, null, null, null, null, null, null, null, 65514, null);
        AtomActionDTO atomActionDTO = new AtomActionDTO(AtomActionDTO.Behavior.CUSTOM, "preview", null, null, 12, null);
        String id2 = uniTheme.getColorTokens().getGraphicTertiary().getId();
        ButtonV3DTO.StyleTypes styleTypes = ButtonV3DTO.StyleTypes.CUSTOM;
        String id3 = uniTheme.getColorTokens().getClearLightKey0().getId();
        IconButtonV3DTO.IconButtonShape iconButtonShape = IconButtonV3DTO.IconButtonShape.SHAPE_CIRCLE;
        a.C1458a c1458a = new a.C1458a(new IconButtonV3DTO(null, styleTypes, iconButtonShape, "ic_s_plus_sign_filled", null, id2, id3, new CommonControlSettings(atomActionDTO, null, null, 6, null), null, null, null, null, null, null, 16145, null), null);
        a.C1458a c1458a2 = new a.C1458a(new IconButtonV3DTO(null, styleTypes, iconButtonShape, uniTheme.getIconTokens().getIc_s_cross_filled().getId(), null, uniTheme.getColorTokens().getGraphicSecondary().getId(), uniTheme.getColorTokens().getBgOverlap().getId(), new CommonControlSettings(new AtomActionDTO(AtomActionDTO.Behavior.DISMISS, null, null, null, 14, null), null, null, 6, null), null, null, null, null, null, null, 16145, null), null);
        OzonSpannableString ozonSpannableString = OzonSpannableStringKt.toOzonSpannableString("ИИ-помощник");
        TextPreset textPreset = TextPreset.PRESET_CUSTOM;
        TextDTO.TextAlignment textAlignment = TextDTO.TextAlignment.CENTER;
        TextDTO textDTO = new TextDTO(ozonSpannableString, textAlignment, null, null, null, null, textPreset, uniTheme.getTypographyTokens().getHeadline500Medium().getId(), uniTheme.getColorTokens().getTextPrimary().getId(), 1, null, null, null, false, null, null, null, null, null, 523324, null);
        TextDTO textDTO2 = new TextDTO(OzonSpannableStringKt.toOzonSpannableString("Могут быть неточности - я ещё учусь"), textAlignment, null, null, null, null, textPreset, uniTheme.getTypographyTokens().getCompact400Small().getId(), uniTheme.getColorTokens().getTextSecondary().getId(), 1, null, null, null, false, null, null, null, null, null, 523324, null);
        ru.ozon.android.messenger.blocks.ai.header.presentation.a aVar = new ru.ozon.android.messenger.blocks.ai.header.presentation.a(new ru.ozon.android.messenger.framework.presentation.models.c("ai-header-title-subtitle", 0), uniTheme.getColorTokens().getLayerFloor1().getId(), C7714v.a0(c1458a), new AiHeaderDTO.TitleSubtitle(textDTO, textDTO2, null), null, C7714v.a0(c1458a2), CornerRadius.RADIUS_600, new TestInfo("AIHeaderBlock"), null);
        ru.ozon.android.messenger.blocks.ai.header.presentation.a.a(aVar, new ru.ozon.android.messenger.framework.presentation.models.c("ai-header-subtitle-action", 0), new AiHeaderDTO.TitleSubtitle(textDTO, textDTO2, atomActionDTO), null, 502);
        ru.ozon.android.messenger.blocks.ai.header.presentation.a.a(aVar, new ru.ozon.android.messenger.framework.presentation.models.c("ai-header-action-button", 0), null, new ButtonV3DTO(ButtonV3DTO.StyleTypes.ACTION_SECONDARY, ButtonV3DTO.Sizes.SIZE_400, "Спросить Ozon AI", null, null, null, null, null, null, null, null, null, null, new CommonControlSettings(atomActionDTO, null, null, 6, null), null, null, null, null, 253944, null), 486);
    }

    public static final void a(@NotNull ru.ozon.android.messenger.blocks.ai.header.presentation.a state, e.a aVar, @NotNull Function2 onAtomAction, @NotNull Function1 onTitleSubtitleAction, @NotNull Function1 onView, InterfaceC3967k interfaceC3967k, int i11) {
        float f7;
        e.a aVar2;
        String automatizationId;
        androidx.compose.ui.e a11;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onAtomAction, "onAtomAction");
        Intrinsics.checkNotNullParameter(onTitleSubtitleAction, "onTitleSubtitleAction");
        Intrinsics.checkNotNullParameter(onView, "onView");
        C3969l u11 = interfaceC3967k.u(-983437365);
        int i12 = i11 | (u11.n(state) ? 4 : 2) | 48 | (u11.F(onAtomAction) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN) | (u11.F(onTitleSubtitleAction) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL) | (u11.F(onView) ? 16384 : 8192);
        if ((i12 & 9363) == 9362 && u11.b()) {
            u11.j();
            aVar2 = aVar;
        } else {
            e.a aVar3 = androidx.compose.ui.e.f40358c0;
            AbstractC5434v.a aVar4 = AbstractC5434v.a.ON_RESUME;
            u11.o(-1634042045);
            boolean F11 = ((i12 & 57344) == 16384) | u11.F(state);
            Object C11 = u11.C();
            if (F11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new a(onView, state);
                u11.x(C11);
            }
            u11.k();
            e3.i.a(aVar4, null, (Function0) C11, u11, 6);
            C7807Z c7807z = TokenParserKt.tokenToColor(state.getBackgroundColor(), u11, 0);
            u11.o(-1634039780);
            long layerFloor0 = c7807z == null ? UniTheme.INSTANCE.getColors(u11, UniTheme.$stable).getLayerFloor0() : c7807z.w();
            u11.k();
            a.C1458a c1458a = (a.C1458a) C7714v.M(state.d());
            ButtonV3DTO b11 = c1458a != null ? c1458a.b() : null;
            float f11 = f84183e;
            float f12 = f84182d;
            if (b11 != null) {
                f7 = f11;
                f11 = f12;
            } else {
                f7 = f11;
            }
            a.C1458a c1458a2 = (a.C1458a) C7714v.Z(state.h());
            if ((c1458a2 != null ? c1458a2.b() : null) == null) {
                f12 = f7;
            }
            float f13 = 0;
            androidx.compose.ui.e j11 = T.j(androidx.compose.foundation.e.b(a0.e(aVar3, 1.0f), layerFloor0, A0.h.c(f13, f13, state.c().m1866getDpD9Ej5fM(), state.c().m1866getDpD9Ej5fM())), 0.0f, 0.0f, 0.0f, DsSpacings.INSTANCE.m1861getDp8D9Ej5fM(), 7);
            TestInfo e11 = state.e();
            if (e11 != null && (automatizationId = e11.getAutomatizationId()) != null && (a11 = Q1.a(j11, automatizationId)) != null) {
                j11 = a11;
            }
            C5194q a12 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), u11, 0);
            int I11 = u11.I();
            A0 d11 = u11.d();
            androidx.compose.ui.e f14 = androidx.compose.ui.c.f(u11, j11);
            Function0 a13 = Fr.g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a13);
            } else {
                u11.e();
            }
            Function2 g10 = K00.b.g(u11, a12, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                Ep.a.d(I11, u11, I11, g10);
            }
            b(a0.h(GZ.e.c(u11, f14, aVar3, 1.0f), f84179a, 0.0f, 2), a1.c.c(-864839883, new b(state, onAtomAction), u11), a1.c.c(-1832800812, new d(state, onTitleSubtitleAction, onAtomAction), u11), a1.c.c(1494205555, new e(state, onAtomAction), u11), f11, f12, u11, 3510);
            u11.f();
            aVar2 = aVar3;
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new f(state, aVar2, onAtomAction, onTitleSubtitleAction, onView, i11));
        }
    }

    public static final void b(androidx.compose.ui.e eVar, @NotNull C4912a left, @NotNull C4912a center, @NotNull C4912a right, float f7, float f11, InterfaceC3967k interfaceC3967k, int i11) {
        Intrinsics.checkNotNullParameter(left, "left");
        Intrinsics.checkNotNullParameter(center, "center");
        Intrinsics.checkNotNullParameter(right, "right");
        C3969l u11 = interfaceC3967k.u(1625519965);
        int i12 = i11 | (u11.q(f7) ? 16384 : 8192) | (u11.q(f11) ? 131072 : 65536);
        if ((74899 & i12) == 74898 && u11.b()) {
            u11.j();
        } else {
            u11.o(1322795063);
            boolean z11 = ((57344 & i12) == 16384) | ((i12 & 458752) == 131072);
            Object C11 = u11.C();
            if (z11 || C11 == InterfaceC3967k.a.a()) {
                h hVar = new h(f7, f11, left, right, center);
                u11.x(hVar);
                C11 = hVar;
            }
            u11.k();
            v0.b(eVar, (Function2) C11, u11, 6, 0);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new i(eVar, left, center, right, f7, f11, i11));
        }
    }

    public static final void c(androidx.compose.ui.e eVar, List list, Function2 function2, InterfaceC3967k interfaceC3967k, int i11) {
        androidx.compose.ui.e eVar2;
        C3969l u11 = interfaceC3967k.u(-1580991897);
        int i12 = i11 | 6;
        if ((i11 & 48) == 0) {
            i12 |= (i11 & 64) == 0 ? u11.n(list) : u11.F(list) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.F(function2) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i12 & 147) == 146 && u11.b()) {
            u11.j();
            eVar2 = eVar;
        } else {
            eVar2 = androidx.compose.ui.e.f40358c0;
            int i13 = C5179b.f39454h;
            Y b11 = X.b(C5179b.n(f84181c), InterfaceC6250b.a.l(), u11, 6);
            int I11 = u11.I();
            A0 d11 = u11.d();
            androidx.compose.ui.e f7 = androidx.compose.ui.c.f(u11, eVar2);
            Function0 a11 = Fr.g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a11);
            } else {
                u11.e();
            }
            Function2 h11 = Cm.e.h(u11, b11, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                Ep.a.d(I11, u11, I11, h11);
            }
            U7.i.b(u11, f7, 2035221979);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                a.C1458a c1458a = (a.C1458a) it.next();
                ButtonV3DTO b12 = c1458a.b();
                u11.o(2035223257);
                if (b12 != null) {
                    u11.o(2105618079);
                    boolean n11 = ((i12 & 896) == 256) | u11.n(b12);
                    Object C11 = u11.C();
                    if (n11 || C11 == InterfaceC3967k.a.a()) {
                        C11 = new j(function2, b12);
                        u11.x(C11);
                    }
                    u11.k();
                    DsButtonAtomKt.DsButtonAtom(b12, null, false, (Function1) C11, u11, 0, 6);
                }
                u11.k();
                IconButtonV3DTO a12 = c1458a.a();
                u11.o(2035232509);
                if (a12 != null) {
                    u11.o(2105627455);
                    boolean F11 = u11.F(a12) | ((i12 & 896) == 256);
                    Object C12 = u11.C();
                    if (F11 || C12 == InterfaceC3967k.a.a()) {
                        C12 = new k(function2, a12);
                        u11.x(C12);
                    }
                    u11.k();
                    DsIconButtonAtomKt.DsIconButtonAtom(a12, null, false, (Function1) C12, u11, IconButtonV3DTO.$stable, 6);
                }
                u11.k();
            }
            u11.k();
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new l(eVar2, list, function2, i11));
        }
    }

    public static final void d(androidx.compose.ui.e eVar, AiHeaderDTO.TitleSubtitle titleSubtitle, Function1 function1, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        C3969l u11 = interfaceC3967k.u(-635215809);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(eVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.n(titleSubtitle) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.F(function1) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i12 & 147) == 146 && u11.b()) {
            u11.j();
        } else {
            C5194q a11 = C5193p.a(C5179b.b(), InterfaceC6250b.a.g(), u11, 54);
            int I11 = u11.I();
            A0 d11 = u11.d();
            androidx.compose.ui.e f7 = androidx.compose.ui.c.f(u11, eVar);
            Function0 a12 = Fr.g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a12);
            } else {
                u11.e();
            }
            Function2 g10 = K00.b.g(u11, a11, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                Ep.a.d(I11, u11, I11, g10);
            }
            F1.b(u11, f7, InterfaceC2801g.a.f());
            TextDTO title = titleSubtitle.getTitle();
            u11.o(-1628079183);
            if (title != null) {
                DsTextAtomKt.DsTextAtom(title, null, u11, 0, 2);
            }
            u11.k();
            TextDTO subtitle = titleSubtitle.getSubtitle();
            u11.o(-1628075804);
            if (subtitle != null) {
                if (titleSubtitle.getAction() == null) {
                    u11.o(1737195508);
                    DsTextAtomKt.DsTextAtom(subtitle, null, u11, 0, 2);
                    u11.k();
                } else {
                    u11.o(1737267273);
                    e.a aVar = androidx.compose.ui.e.f40358c0;
                    u11.o(1441516246);
                    boolean z11 = ((i12 & 896) == 256) | ((i12 & 112) == 32);
                    Object C11 = u11.C();
                    if (z11 || C11 == InterfaceC3967k.a.a()) {
                        C11 = new m(function1, titleSubtitle);
                        u11.x(C11);
                    }
                    u11.k();
                    androidx.compose.ui.e c11 = androidx.compose.foundation.i.c(aVar, false, null, null, (Function0) C11, 7);
                    Y b11 = X.b(C5179b.f(), InterfaceC6250b.a.i(), u11, 48);
                    int I12 = u11.I();
                    A0 d12 = u11.d();
                    androidx.compose.ui.e f11 = androidx.compose.ui.c.f(u11, c11);
                    Function0 a13 = InterfaceC2801g.a.a();
                    u11.i();
                    if (u11.t()) {
                        u11.H(a13);
                    } else {
                        u11.e();
                    }
                    Function2 h11 = Cm.e.h(u11, b11, u11, d12);
                    if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I12))) {
                        Ep.a.d(I12, u11, I12, h11);
                    }
                    F1.b(u11, f11, InterfaceC2801g.a.f());
                    DsTextAtomKt.DsTextAtom(subtitle, null, u11, 0, 2);
                    DsIconAtomKt.DsIconAtom(f84184f, null, u11, IconDTO.$stable, 2);
                    u11.f();
                    u11.k();
                }
            }
            u11.k();
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new n(eVar, titleSubtitle, function1, i11));
        }
    }
}

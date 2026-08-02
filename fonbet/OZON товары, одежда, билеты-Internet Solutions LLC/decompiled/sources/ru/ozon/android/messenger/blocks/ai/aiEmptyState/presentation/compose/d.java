package ru.ozon.android.messenger.blocks.ai.aiEmptyState.presentation.compose;

import D1.InterfaceC2801g;
import Fr.g;
import S0.A0;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.J0;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5193p;
import androidx.compose.foundation.layout.C5194q;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.Q1;
import androidx.lifecycle.AbstractC5434v;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import e1.d;
import e3.i;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.ds.compose.component.badge.DsBadgeAtomKt;
import ru.ozon.uni.android.ds.compose.component.icon.DsIconAtomKt;
import ru.ozon.uni.android.ds.compose.component.text.DsTextAtomKt;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.common.CommonAtomIconDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.data.text.TextPreset;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;
import ru.ozon.uni.core.repository.UniTheme;
import u0.E;

/* loaded from: classes10.dex */
public final class d {

    /* renamed from: b, reason: collision with root package name */
    private static final float f83962b;

    /* renamed from: d, reason: collision with root package name */
    private static final float f83964d;

    /* renamed from: a, reason: collision with root package name */
    private static final float f83961a = 16;

    /* renamed from: c, reason: collision with root package name */
    private static final float f83963c = 30;

    static {
        float f7 = 8;
        f83962b = f7;
        f83964d = f7;
        UniTheme uniTheme = UniTheme.INSTANCE;
        IconDTO iconDTO = new IconDTO(IconDTO.IconSize.SIZE_800, null, IconDTO.IconShape.SHAPE_NONE, null, new CommonAtomIconDTO("ic_m_ai_stars_filled", uniTheme.getGradients().getGrSocialPrimary().getId()), null, null, null, null, null, null, null, null, null, null, null, 65514, null);
        OzonSpannableString ozonSpannableString = OzonSpannableStringKt.toOzonSpannableString("Спросите Ozon AI");
        TextDTO.TextAlignment textAlignment = TextDTO.TextAlignment.CENTER;
        TextPreset textPreset = TextPreset.PRESET_CUSTOM;
        ru.ozon.android.messenger.blocks.ai.aiEmptyState.presentation.a.a(new ru.ozon.android.messenger.blocks.ai.aiEmptyState.presentation.a(new ru.ozon.android.messenger.framework.presentation.models.c("bx", 0), null, new TextDTO(ozonSpannableString, textAlignment, null, null, null, null, textPreset, uniTheme.getTypographyTokens().getHeadline600Large().getId(), uniTheme.getColorTokens().getTextPrimary().getId(), null, new TestInfo("AIEmptyStateBlock.Title"), null, null, false, null, null, null, null, null, 522812, null), new TextDTO(OzonSpannableStringKt.toOzonSpannableString("Поможем найти то самое\nсреди миллионов товаров"), textAlignment, null, null, null, null, textPreset, uniTheme.getTypographyTokens().getBody500Medium().getId(), uniTheme.getColorTokens().getTextSecondary().getId(), null, new TestInfo("AIEmptyStateBlock.Subtitle"), null, null, false, null, null, null, null, null, 522812, null), null, 56, "AIEmptyStateBlock", null), new ru.ozon.android.messenger.framework.presentation.models.c("sx", 0), iconDTO, new TextDTO(OzonSpannableStringKt.toOzonSpannableString("Здравствуйте, я ИИ-помощник"), textAlignment, null, null, null, null, textPreset, uniTheme.getTypographyTokens().getHeadline500Medium().getId(), uniTheme.getColorTokens().getTextPrimary().getId(), null, new TestInfo("AIEmptyStateBlock.Title"), null, null, false, null, null, null, null, null, 522812, null), new TextDTO(OzonSpannableStringKt.toOzonSpannableString("Найду ответы на ваши вопросы"), textAlignment, null, null, null, null, textPreset, uniTheme.getTypographyTokens().getBody500Medium().getId(), uniTheme.getColorTokens().getTextSecondary().getId(), null, new TestInfo("AIEmptyStateBlock.Subtitle"), null, null, false, null, null, null, null, null, 522812, null), new BadgeDTO("Условия использования", null, BadgeDTO.BadgeSize.SIZE_400, null, new BadgeDTO.CustomStyle(new BadgeDTO.CustomBackground(uniTheme.getColorTokens().getClearLightKey0().getId(), null, 2, null), null, uniTheme.getColorTokens().getGraphicTertiary().getId(), null, null, 26, null), new CommonControlSettings(new AtomActionDTO(AtomActionDTO.Behavior.CUSTOM, "link", null, null, 12, null), null, new TestInfo("AIEmptyStateBlock.Badge"), 2, null), null, null, BadgeDTO.Style.CUSTOM, null, null, null, 3786, null));
    }

    public static final void a(@NotNull ru.ozon.android.messenger.blocks.ai.aiEmptyState.presentation.a state, e eVar, Function0 function0, Function1 function1, InterfaceC3967k interfaceC3967k, int i11) {
        Intrinsics.checkNotNullParameter(state, "state");
        C3969l u11 = interfaceC3967k.u(-1378778760);
        int i12 = i11 | (u11.n(state) ? 4 : 2) | (u11.n(eVar) ? 32 : 16) | (u11.F(function0) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN) | (u11.F(function1) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL);
        if ((i12 & 1171) == 1170 && u11.b()) {
            u11.j();
        } else {
            AbstractC5434v.a aVar = AbstractC5434v.a.ON_RESUME;
            u11.o(1904783601);
            boolean F11 = ((i12 & 7168) == 2048) | u11.F(state);
            Object C11 = u11.C();
            if (F11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new a(function1, state);
                u11.x(C11);
            }
            u11.k();
            i.a(aVar, null, (Function0) C11, u11, 6);
            float g10 = state.g();
            e e11 = a0.e(eVar, 1.0f);
            float f7 = f83961a;
            e a11 = Q1.a(T.j(e11, f7, g10, f7, 0.0f, 8), state.b());
            C5194q a12 = C5193p.a(C5179b.g(), InterfaceC6250b.a.g(), u11, 48);
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f11 = androidx.compose.ui.c.f(u11, a11);
            Function0 a13 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a13);
            } else {
                u11.e();
            }
            Function2 g11 = K00.b.g(u11, a12, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                Ep.a.d(I11, u11, I11, g11);
            }
            F1.b(u11, f11, InterfaceC2801g.a.f());
            IconDTO d12 = state.d();
            u11.o(-1932920576);
            if (d12 != null) {
                DsIconAtomKt.DsIconAtom(d12, null, u11, IconDTO.$stable, 2);
                Unit unit = Unit.f71690a;
            }
            u11.k();
            u11.o(-1932918306);
            if (state.d() != null && (state.f() != null || state.e() != null)) {
                E.a(u11, a0.f(e.f40358c0, f83962b));
            }
            u11.k();
            u11.o(-1932912688);
            if (state.f() != null || state.e() != null) {
                d.a g12 = InterfaceC6250b.a.g();
                C5179b.i n11 = C5179b.n(f83964d);
                e.a aVar2 = e.f40358c0;
                C5194q a14 = C5193p.a(n11, g12, u11, 54);
                int I12 = u11.I();
                A0 d13 = u11.d();
                e f12 = androidx.compose.ui.c.f(u11, aVar2);
                Function0 a15 = InterfaceC2801g.a.a();
                u11.i();
                if (u11.t()) {
                    u11.H(a15);
                } else {
                    u11.e();
                }
                Function2 g13 = K00.b.g(u11, a14, u11, d13);
                if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I12))) {
                    Ep.a.d(I12, u11, I12, g13);
                }
                F1.b(u11, f12, InterfaceC2801g.a.f());
                TextDTO f13 = state.f();
                u11.o(-823328863);
                if (f13 != null) {
                    DsTextAtomKt.DsTextAtom(f13, T.j(aVar2, 0.0f, 8, 0.0f, 0.0f, 13), u11, 48, 0);
                    Unit unit2 = Unit.f71690a;
                }
                u11.k();
                TextDTO e12 = state.e();
                u11.o(-823321897);
                if (e12 != null) {
                    DsTextAtomKt.DsTextAtom(e12, null, u11, 0, 2);
                    Unit unit3 = Unit.f71690a;
                }
                u11.k();
                u11.f();
            }
            u11.k();
            BadgeDTO c11 = state.c();
            u11.o(-1932893283);
            if (c11 != null) {
                u11.o(-1932892571);
                if (state.d() != null || state.f() != null || state.e() != null) {
                    E.a(u11, a0.f(e.f40358c0, f83963c));
                }
                u11.k();
                u11.o(-823309065);
                boolean z11 = (i12 & 896) == 256;
                Object C12 = u11.C();
                if (z11 || C12 == InterfaceC3967k.a.a()) {
                    C12 = new b(function0);
                    u11.x(C12);
                }
                u11.k();
                DsBadgeAtomKt.DsBadgeAtom(c11, null, (Function1) C12, u11, 0, 2);
                Unit unit4 = Unit.f71690a;
            }
            u11.k();
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new c(state, eVar, function0, function1, i11));
        }
    }
}

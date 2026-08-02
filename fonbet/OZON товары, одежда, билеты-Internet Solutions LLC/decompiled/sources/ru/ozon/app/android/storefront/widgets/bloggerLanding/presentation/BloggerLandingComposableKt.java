package ru.ozon.app.android.storefront.widgets.bloggerLanding.presentation;

import A0.h;
import B1.InterfaceC2547p;
import B1.V;
import D1.InterfaceC2801g;
import Ep.a;
import Fr.g;
import J0.T0;
import K00.b;
import S0.A0;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.J0;
import T7.E;
import WZ.l;
import WZ.t;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.C5187j;
import androidx.compose.foundation.layout.C5193p;
import androidx.compose.foundation.layout.C5194q;
import androidx.compose.foundation.layout.M;
import androidx.compose.foundation.layout.P;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.VerticalAlignElement;
import androidx.compose.foundation.layout.X;
import androidx.compose.foundation.layout.Y;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.lifecycle.AbstractC5434v;
import b00.f;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import e3.i;
import i1.C6988h;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l1.C7807Z;
import l1.y0;
import n0.C8366G;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.widgets.bloggerLanding.data.LandingCell;
import ru.ozon.uni.android.ds.compose.component.button.DsButtonAtomKt;
import ru.ozon.uni.android.ds.compose.component.icon.DsIconAtomKt;
import ru.ozon.uni.android.ds.compose.component.text.DsTextAtomKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.core.compose.tokens.TokenParserKt;
import ru.ozon.uni.core.compose.tokens.TokensExtKt;
import ru.ozon.uni.core.models.UniIconToken;
import ru.ozon.uni.core.repository.UniTheme;
import u0.EnumC9909s;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a5\u0010\b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\b\u0010\t\u001a)\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/storefront/widgets/bloggerLanding/presentation/BloggerLandingVI;", "item", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "Landroidx/compose/ui/e;", "modifier", "BloggerLandingComposable", "(Lru/ozon/app/android/storefront/widgets/bloggerLanding/presentation/BloggerLandingVI;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/e;LS0/k;II)V", "Lru/ozon/app/android/storefront/widgets/bloggerLanding/data/LandingCell;", "cell", "", "isLast", "BloggerLandingCell", "(Lru/ozon/app/android/storefront/widgets/bloggerLanding/data/LandingCell;ZLandroidx/compose/ui/e;LS0/k;II)V", "storefront_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BloggerLandingComposableKt {
    /* JADX WARN: Removed duplicated region for block: B:100:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BloggerLandingCell(@NotNull LandingCell cell, boolean z11, e eVar, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        e eVar2;
        long graphicPrimary;
        int I11;
        boolean F11;
        Object C11;
        int I12;
        int I13;
        int I14;
        List<String> socialIcons;
        e eVar3;
        J0 m02;
        Intrinsics.checkNotNullParameter(cell, "cell");
        C3969l u11 = interfaceC3967k.u(487994492);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.F(cell) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= u11.p(z11) ? 32 : 16;
        }
        int i14 = i12 & 4;
        if (i14 != 0) {
            i13 |= 384;
        } else if ((i11 & 384) == 0) {
            eVar2 = eVar;
            i13 |= u11.n(eVar2) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
            if ((i13 & 147) == 146 || !u11.b()) {
                e eVar4 = i14 == 0 ? e.f40358c0 : eVar2;
                C7807Z c7807z = TokenParserKt.tokenToColor(cell.getIcon().getBackgroundColor(), u11, 0);
                u11.o(456492156);
                graphicPrimary = c7807z != null ? UniTheme.INSTANCE.getColors(u11, UniTheme.$stable).getGraphicPrimary() : c7807z.w();
                u11.k();
                float f7 = 1;
                e a11 = M.a(eVar4, EnumC9909s.Min);
                Y b11 = X.b(C5179b.f(), InterfaceC6250b.a.l(), u11, 0);
                I11 = u11.I();
                A0 d11 = u11.d();
                e f11 = c.f(u11, a11);
                Function0 a12 = g.a(InterfaceC2801g.f5440U, u11);
                if (u11.t()) {
                    u11.e();
                } else {
                    u11.H(a12);
                }
                Function2 h11 = Cm.e.h(u11, b11, u11, d11);
                if (!u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                    a.d(I11, u11, I11, h11);
                }
                F1.b(u11, f11, InterfaceC2801g.a.f());
                e l02 = a0.c(eVar4).l0(new VerticalAlignElement(InterfaceC6250b.a.i()));
                u11.o(1494828237);
                F11 = u11.F(cell) | ((i13 & 112) != 32) | u11.s(graphicPrimary);
                C11 = u11.C();
                if (!F11 || C11 == InterfaceC3967k.a.a()) {
                    BloggerLandingComposableKt$BloggerLandingCell$1$1$1 bloggerLandingComposableKt$BloggerLandingCell$1$1$1 = new BloggerLandingComposableKt$BloggerLandingCell$1$1$1(cell, z11, graphicPrimary, f7);
                    u11.x(bloggerLandingComposableKt$BloggerLandingCell$1$1$1);
                    C11 = bloggerLandingComposableKt$BloggerLandingCell$1$1$1;
                }
                u11.k();
                e j11 = T.j(androidx.compose.ui.draw.c.b(l02, (Function1) C11), 0.0f, 0.0f, 0.0f, !z11 ? 0 : 14, 7);
                V f12 = C5185h.f(InterfaceC6250b.a.o(), false);
                I12 = u11.I();
                A0 d12 = u11.d();
                e f13 = c.f(u11, j11);
                Function0 a13 = InterfaceC2801g.a.a();
                u11.i();
                if (u11.t()) {
                    u11.e();
                } else {
                    u11.H(a13);
                }
                Function2 f14 = E.f(u11, f12, u11, d12);
                if (!u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I12))) {
                    a.d(I12, u11, I12, f14);
                }
                F1.b(u11, f13, InterfaceC2801g.a.f());
                float f15 = 16;
                DsIconAtomKt.DsIconAtom(cell.getIcon(), T.h(eVar4, f15, 0.0f, 2), u11, IconDTO.$stable, 0);
                u11.f();
                e j12 = T.j(eVar4, 0.0f, 5, 0.0f, !z11 ? 0 : 14, 5);
                C5194q a14 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), u11, 0);
                I13 = u11.I();
                A0 d13 = u11.d();
                e f16 = c.f(u11, j12);
                Function0 a15 = InterfaceC2801g.a.a();
                u11.i();
                if (u11.t()) {
                    u11.e();
                } else {
                    u11.H(a15);
                }
                Function2 g10 = b.g(u11, a14, u11, d13);
                if (!u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I13))) {
                    a.d(I13, u11, I13, g10);
                }
                F1.b(u11, f16, InterfaceC2801g.a.f());
                DsTextAtomKt.DsTextAtom(cell.getTitle(), T.j(eVar4, 0.0f, 0.0f, f15, 0.0f, 11), u11, 0, 0);
                e.a aVar = e.f40358c0;
                Y b12 = X.b(C5179b.f(), InterfaceC6250b.a.l(), u11, 0);
                I14 = u11.I();
                A0 d14 = u11.d();
                e f17 = c.f(u11, aVar);
                Function0 a16 = InterfaceC2801g.a.a();
                u11.i();
                if (u11.t()) {
                    u11.e();
                } else {
                    u11.H(a16);
                }
                Function2 h12 = Cm.e.h(u11, b12, u11, d14);
                if (!u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I14))) {
                    a.d(I14, u11, I14, h12);
                }
                F1.b(u11, f17, InterfaceC2801g.a.f());
                socialIcons = cell.getSocialIcons();
                u11.o(-1293016715);
                if (socialIcons != null) {
                    eVar2 = eVar4;
                } else {
                    for (String str : socialIcons) {
                        UniTheme uniTheme = UniTheme.INSTANCE;
                        UniIconToken byId = uniTheme.getIconTokens().getById(str);
                        u11.o(-1293013044);
                        if (byId != null) {
                            eVar3 = eVar4;
                            T0.a(TokensExtKt.getIcon(byId, u11, UniIconToken.$stable), null, T.j(eVar4, 0.0f, 0.0f, 8, 0.0f, 11), uniTheme.getColors(u11, UniTheme.$stable).getClearLightKey500(), u11, 48);
                        } else {
                            eVar3 = eVar4;
                        }
                        u11.k();
                        eVar4 = eVar3;
                    }
                    eVar2 = eVar4;
                    Unit unit = Unit.f71690a;
                }
                u11.k();
                u11.f();
                u11.f();
                u11.f();
            } else {
                u11.j();
            }
            e eVar5 = eVar2;
            m02 = u11.m0();
            if (m02 == null) {
                m02.G(new BloggerLandingComposableKt$BloggerLandingCell$2(cell, z11, eVar5, i11, i12));
                return;
            }
            return;
        }
        eVar2 = eVar;
        if ((i13 & 147) == 146) {
        }
        if (i14 == 0) {
        }
        C7807Z c7807z2 = TokenParserKt.tokenToColor(cell.getIcon().getBackgroundColor(), u11, 0);
        u11.o(456492156);
        if (c7807z2 != null) {
        }
        u11.k();
        float f72 = 1;
        e a112 = M.a(eVar4, EnumC9909s.Min);
        Y b112 = X.b(C5179b.f(), InterfaceC6250b.a.l(), u11, 0);
        I11 = u11.I();
        A0 d112 = u11.d();
        e f112 = c.f(u11, a112);
        Function0 a122 = g.a(InterfaceC2801g.f5440U, u11);
        if (u11.t()) {
        }
        Function2 h112 = Cm.e.h(u11, b112, u11, d112);
        if (!u11.t()) {
        }
        a.d(I11, u11, I11, h112);
        F1.b(u11, f112, InterfaceC2801g.a.f());
        e l022 = a0.c(eVar4).l0(new VerticalAlignElement(InterfaceC6250b.a.i()));
        u11.o(1494828237);
        F11 = u11.F(cell) | ((i13 & 112) != 32) | u11.s(graphicPrimary);
        C11 = u11.C();
        if (!F11) {
        }
        BloggerLandingComposableKt$BloggerLandingCell$1$1$1 bloggerLandingComposableKt$BloggerLandingCell$1$1$12 = new BloggerLandingComposableKt$BloggerLandingCell$1$1$1(cell, z11, graphicPrimary, f72);
        u11.x(bloggerLandingComposableKt$BloggerLandingCell$1$1$12);
        C11 = bloggerLandingComposableKt$BloggerLandingCell$1$1$12;
        u11.k();
        e j112 = T.j(androidx.compose.ui.draw.c.b(l022, (Function1) C11), 0.0f, 0.0f, 0.0f, !z11 ? 0 : 14, 7);
        V f122 = C5185h.f(InterfaceC6250b.a.o(), false);
        I12 = u11.I();
        A0 d122 = u11.d();
        e f132 = c.f(u11, j112);
        Function0 a132 = InterfaceC2801g.a.a();
        u11.i();
        if (u11.t()) {
        }
        Function2 f142 = E.f(u11, f122, u11, d122);
        if (!u11.t()) {
        }
        a.d(I12, u11, I12, f142);
        F1.b(u11, f132, InterfaceC2801g.a.f());
        float f152 = 16;
        DsIconAtomKt.DsIconAtom(cell.getIcon(), T.h(eVar4, f152, 0.0f, 2), u11, IconDTO.$stable, 0);
        u11.f();
        e j122 = T.j(eVar4, 0.0f, 5, 0.0f, !z11 ? 0 : 14, 5);
        C5194q a142 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), u11, 0);
        I13 = u11.I();
        A0 d132 = u11.d();
        e f162 = c.f(u11, j122);
        Function0 a152 = InterfaceC2801g.a.a();
        u11.i();
        if (u11.t()) {
        }
        Function2 g102 = b.g(u11, a142, u11, d132);
        if (!u11.t()) {
        }
        a.d(I13, u11, I13, g102);
        F1.b(u11, f162, InterfaceC2801g.a.f());
        DsTextAtomKt.DsTextAtom(cell.getTitle(), T.j(eVar4, 0.0f, 0.0f, f152, 0.0f, 11), u11, 0, 0);
        e.a aVar2 = e.f40358c0;
        Y b122 = X.b(C5179b.f(), InterfaceC6250b.a.l(), u11, 0);
        I14 = u11.I();
        A0 d142 = u11.d();
        e f172 = c.f(u11, aVar2);
        Function0 a162 = InterfaceC2801g.a.a();
        u11.i();
        if (u11.t()) {
        }
        Function2 h122 = Cm.e.h(u11, b122, u11, d142);
        if (!u11.t()) {
        }
        a.d(I14, u11, I14, h122);
        F1.b(u11, f172, InterfaceC2801g.a.f());
        socialIcons = cell.getSocialIcons();
        u11.o(-1293016715);
        if (socialIcons != null) {
        }
        u11.k();
        u11.f();
        u11.f();
        u11.f();
        e eVar52 = eVar2;
        m02 = u11.m0();
        if (m02 == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BloggerLandingComposable(@NotNull BloggerLandingVI item, @NotNull Function1<? super AtomAction, Unit> actionHandler, e eVar, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        e eVar2;
        int i14;
        t tokenizedEvent;
        long j11;
        e b11;
        int I11;
        int I12;
        e eVar3;
        J0 m02;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        C3969l u11 = interfaceC3967k.u(-654523961);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.F(item) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= u11.F(actionHandler) ? 32 : 16;
        }
        int i15 = i12 & 4;
        if (i15 != 0) {
            i13 |= 384;
        } else if ((i11 & 384) == 0) {
            eVar2 = eVar;
            i13 |= u11.n(eVar2) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
            i14 = i13;
            if ((i14 & 147) == 146 || !u11.b()) {
                e eVar4 = i15 == 0 ? e.f40358c0 : eVar2;
                l lVar = (l) u11.m(f.e());
                tokenizedEvent = item.getTokenizedEvent();
                u11.o(-1130921279);
                if (tokenizedEvent != null) {
                    AbstractC5434v.a aVar = AbstractC5434v.a.ON_RESUME;
                    u11.o(-467134276);
                    boolean F11 = u11.F(lVar) | u11.F(tokenizedEvent);
                    Object C11 = u11.C();
                    if (F11 || C11 == InterfaceC3967k.a.a()) {
                        C11 = new BloggerLandingComposableKt$BloggerLandingComposable$1$1$1(lVar, tokenizedEvent);
                        u11.x(C11);
                    }
                    u11.k();
                    i.a(aVar, null, (Function0) C11, u11, 6);
                    Unit unit = Unit.f71690a;
                }
                u11.k();
                float f7 = 8;
                float f11 = 24;
                e a11 = C6988h.a(T.h(a0.e(eVar4, 1.0f), f7, 0.0f, 2), h.b(f11));
                j11 = C7807Z.f72258l;
                b11 = androidx.compose.foundation.e.b(a11, j11, y0.a());
                V f12 = C5185h.f(InterfaceC6250b.a.o(), false);
                I11 = u11.I();
                A0 d11 = u11.d();
                e f13 = c.f(u11, b11);
                Function0 a12 = g.a(InterfaceC2801g.f5440U, u11);
                if (u11.t()) {
                    u11.e();
                } else {
                    u11.H(a12);
                }
                Function2 f14 = E.f(u11, f12, u11, d11);
                if (!u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                    a.d(I11, u11, I11, f14);
                }
                F1.b(u11, f13, InterfaceC2801g.a.f());
                C5187j c5187j = C5187j.f39515a;
                C8366G.a(ru.ozon.pikazon.compose.painter.f.a(item.getBackgroundImage(), null, null, null, u11, 0, 14), null, C6988h.a(c5187j.b(eVar4), h.b(f11)), InterfaceC6250b.a.e(), InterfaceC2547p.a.b(), 0.0f, null, u11, 27696, 96);
                C8366G.a(ru.ozon.pikazon.compose.painter.f.a(item.getAccentImage(), null, null, null, u11, 0, 14), null, T.j(P.c(c5187j.a(a0.n(eVar4, 140), InterfaceC6250b.a.n()), 40, 0.0f, 2), 0.0f, 16, 0.0f, 0.0f, 13), null, InterfaceC2547p.a.a(), 0.0f, null, u11, 24624, 104);
                u11 = u11;
                e.a aVar2 = e.f40358c0;
                C5194q a13 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), u11, 0);
                I12 = u11.I();
                A0 d12 = u11.d();
                e f15 = c.f(u11, aVar2);
                Function0 a14 = InterfaceC2801g.a.a();
                u11.i();
                if (u11.t()) {
                    u11.e();
                } else {
                    u11.H(a14);
                }
                Function2 g10 = b.g(u11, a13, u11, d12);
                if (!u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I12))) {
                    a.d(I12, u11, I12, g10);
                }
                F1.b(u11, f15, InterfaceC2801g.a.f());
                e eVar5 = eVar4;
                DsTextAtomKt.DsTextAtom(item.getTitle(), T.j(eVar5, 0.0f, 0.0f, 0.0f, 12, 7), u11, 0, 0);
                u11.o(877950084);
                int i16 = 0;
                for (Object obj : item.getCells()) {
                    int i17 = i16 + 1;
                    if (i16 < 0) {
                        C7714v.O0();
                        throw null;
                    }
                    C3969l c3969l = u11;
                    BloggerLandingCell((LandingCell) obj, i16 == C7714v.P(item.getCells()), eVar5, c3969l, i14 & 896, 0);
                    u11 = c3969l;
                    i16 = i17;
                }
                u11.k();
                DsButtonAtomKt.DsButtonAtom(item.getActionButton(), T.i(a0.e(eVar5, 1.0f), f7, f11, f7, f7), false, actionHandler, u11, (i14 << 6) & 7168, 4);
                u11.f();
                u11.f();
                eVar3 = eVar5;
            } else {
                u11.j();
                eVar3 = eVar2;
            }
            m02 = u11.m0();
            if (m02 == null) {
                m02.G(new BloggerLandingComposableKt$BloggerLandingComposable$3(item, actionHandler, eVar3, i11, i12));
                return;
            }
            return;
        }
        eVar2 = eVar;
        i14 = i13;
        if ((i14 & 147) == 146) {
        }
        if (i15 == 0) {
        }
        l lVar2 = (l) u11.m(f.e());
        tokenizedEvent = item.getTokenizedEvent();
        u11.o(-1130921279);
        if (tokenizedEvent != null) {
        }
        u11.k();
        float f72 = 8;
        float f112 = 24;
        e a112 = C6988h.a(T.h(a0.e(eVar4, 1.0f), f72, 0.0f, 2), h.b(f112));
        j11 = C7807Z.f72258l;
        b11 = androidx.compose.foundation.e.b(a112, j11, y0.a());
        V f122 = C5185h.f(InterfaceC6250b.a.o(), false);
        I11 = u11.I();
        A0 d112 = u11.d();
        e f132 = c.f(u11, b11);
        Function0 a122 = g.a(InterfaceC2801g.f5440U, u11);
        if (u11.t()) {
        }
        Function2 f142 = E.f(u11, f122, u11, d112);
        if (!u11.t()) {
        }
        a.d(I11, u11, I11, f142);
        F1.b(u11, f132, InterfaceC2801g.a.f());
        C5187j c5187j2 = C5187j.f39515a;
        C8366G.a(ru.ozon.pikazon.compose.painter.f.a(item.getBackgroundImage(), null, null, null, u11, 0, 14), null, C6988h.a(c5187j2.b(eVar4), h.b(f112)), InterfaceC6250b.a.e(), InterfaceC2547p.a.b(), 0.0f, null, u11, 27696, 96);
        C8366G.a(ru.ozon.pikazon.compose.painter.f.a(item.getAccentImage(), null, null, null, u11, 0, 14), null, T.j(P.c(c5187j2.a(a0.n(eVar4, 140), InterfaceC6250b.a.n()), 40, 0.0f, 2), 0.0f, 16, 0.0f, 0.0f, 13), null, InterfaceC2547p.a.a(), 0.0f, null, u11, 24624, 104);
        u11 = u11;
        e.a aVar22 = e.f40358c0;
        C5194q a132 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), u11, 0);
        I12 = u11.I();
        A0 d122 = u11.d();
        e f152 = c.f(u11, aVar22);
        Function0 a142 = InterfaceC2801g.a.a();
        u11.i();
        if (u11.t()) {
        }
        Function2 g102 = b.g(u11, a132, u11, d122);
        if (!u11.t()) {
        }
        a.d(I12, u11, I12, g102);
        F1.b(u11, f152, InterfaceC2801g.a.f());
        e eVar52 = eVar4;
        DsTextAtomKt.DsTextAtom(item.getTitle(), T.j(eVar52, 0.0f, 0.0f, 0.0f, 12, 7), u11, 0, 0);
        u11.o(877950084);
        int i162 = 0;
        while (r0.hasNext()) {
        }
        u11.k();
        DsButtonAtomKt.DsButtonAtom(item.getActionButton(), T.i(a0.e(eVar52, 1.0f), f72, f112, f72, f72), false, actionHandler, u11, (i14 << 6) & 7168, 4);
        u11.f();
        u11.f();
        eVar3 = eVar52;
        m02 = u11.m0();
        if (m02 == null) {
        }
    }
}

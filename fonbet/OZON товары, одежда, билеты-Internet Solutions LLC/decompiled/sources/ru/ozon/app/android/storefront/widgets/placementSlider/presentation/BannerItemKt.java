package ru.ozon.app.android.storefront.widgets.placementSlider.presentation;

import A0.h;
import B1.InterfaceC2547p;
import B1.V;
import D1.InterfaceC2801g;
import Ep.a;
import Fr.g;
import K00.b;
import S0.A0;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.J0;
import S1.p;
import T7.E;
import androidx.compose.foundation.i;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.C5187j;
import androidx.compose.foundation.layout.C5193p;
import androidx.compose.foundation.layout.C5194q;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import i1.C6988h;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l1.C7807Z;
import l1.y0;
import org.jetbrains.annotations.NotNull;
import ru.ozon.pikazon.compose.painter.PikazonImagePainter;
import ru.ozon.pikazon.compose.painter.f;
import ru.ozon.uni.android.ds.compose.component.badge.DsBadgeAtomKt;
import ru.ozon.uni.android.ds.compose.component.image.DsImageKt;
import ru.ozon.uni.android.ds.compose.component.text.DsTextAtomKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.core.compose.tokens.TokenParserKt;
import ru.ozon.uni.core.repository.UniTheme;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a5\u0010\b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\b\u0010\t\u001a\u0015\u0010\u000b\u001a\u0004\u0018\u00010\n*\u00020\u0000H\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/storefront/widgets/placementSlider/presentation/BannerVO;", "item", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "Landroidx/compose/ui/e;", "modifier", "BannerItem", "(Lru/ozon/app/android/storefront/widgets/placementSlider/presentation/BannerVO;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/e;LS0/k;II)V", "Ll1/Z;", "backgroundColor", "(Lru/ozon/app/android/storefront/widgets/placementSlider/presentation/BannerVO;LS0/k;I)Ll1/Z;", "storefront_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BannerItemKt {
    /* JADX WARN: Removed duplicated region for block: B:18:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BannerItem(@NotNull BannerVO item, @NotNull Function1<? super AtomAction, Unit> actionHandler, e eVar, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        e eVar2;
        e b11;
        Object C11;
        boolean F11;
        Object C12;
        int I11;
        C3969l c3969l;
        int I12;
        BadgeDTO actionBadge;
        e eVar3;
        J0 m02;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        C3969l u11 = interfaceC3967k.u(1179399629);
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
        int i14 = i12 & 4;
        if (i14 != 0) {
            i13 |= 384;
        } else if ((i11 & 384) == 0) {
            eVar2 = eVar;
            i13 |= u11.n(eVar2) ? 256 : 128;
            if ((i13 & 147) == 146 || !u11.b()) {
                e eVar4 = i14 == 0 ? e.f40358c0 : eVar2;
                C7807Z backgroundColor = backgroundColor(item, u11, i13 & 14);
                u11.o(-1599255008);
                long layerFloor1 = backgroundColor != null ? UniTheme.INSTANCE.getColors(u11, UniTheme.$stable).getLayerFloor1() : backgroundColor.w();
                u11.k();
                e e11 = a0.e(eVar4, 1.0f);
                float f7 = UserVerificationMethods.USER_VERIFY_PATTERN;
                b11 = androidx.compose.foundation.e.b(C6988h.a(a0.f(e11, f7), h.b(24)), layerFloor1, y0.a());
                boolean z11 = item.getAction() == null;
                u11.o(-1599241619);
                C11 = u11.C();
                if (C11 == InterfaceC3967k.a.a()) {
                    C11 = BannerItemKt$BannerItem$1$1.INSTANCE;
                    u11.x(C11);
                }
                Function0 function0 = (Function0) C11;
                u11.k();
                u11.o(-1599240982);
                int i15 = i13 & 112;
                F11 = u11.F(item) | (i15 != 32);
                C12 = u11.C();
                if (!F11 || C12 == InterfaceC3967k.a.a()) {
                    C12 = new BannerItemKt$BannerItem$2$1(item, actionHandler);
                    u11.x(C12);
                }
                u11.k();
                e d11 = i.d(b11, null, z11, function0, (Function0) C12, 184);
                V f11 = C5185h.f(InterfaceC6250b.a.o(), false);
                I11 = u11.I();
                A0 d12 = u11.d();
                e f12 = c.f(u11, d11);
                Function0 a11 = g.a(InterfaceC2801g.f5440U, u11);
                if (u11.t()) {
                    u11.e();
                } else {
                    u11.H(a11);
                }
                Function2 f13 = E.f(u11, f11, u11, d12);
                if (!u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                    a.d(I11, u11, I11, f13);
                }
                F1.b(u11, f12, InterfaceC2801g.a.f());
                C5187j c5187j = C5187j.f39515a;
                e eVar5 = eVar4;
                PikazonImagePainter a12 = f.a(item.getImageURL(), null, null, null, u11, 0, 14);
                e.a aVar = e.f40358c0;
                DsImageKt.m1720DsImageA8mMYrQ(a12, a0.n(c5187j.a(aVar, InterfaceC6250b.a.f()), f7), false, 0.0f, layerFloor1, InterfaceC2547p.a.d(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, u11, 196608, 0, 1996);
                c3969l = u11;
                float f14 = 16;
                e j11 = T.j(c5187j.a(aVar, InterfaceC6250b.a.m()), f14, f14, 120, 0.0f, 8);
                C5194q a13 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), c3969l, 0);
                I12 = c3969l.I();
                A0 d13 = c3969l.d();
                e f15 = c.f(c3969l, j11);
                Function0 a14 = InterfaceC2801g.a.a();
                c3969l.i();
                if (c3969l.t()) {
                    c3969l.e();
                } else {
                    c3969l.H(a14);
                }
                Function2 g10 = b.g(c3969l, a13, c3969l, d13);
                if (!c3969l.t() || !Intrinsics.d(c3969l.C(), Integer.valueOf(I12))) {
                    a.d(I12, c3969l, I12, g10);
                }
                F1.b(c3969l, f15, InterfaceC2801g.a.f());
                DsTextAtomKt.DsTextAtom(item.getTitle(), null, c3969l, 0, 2);
                u0.E.a(c3969l, a0.f(aVar, 4));
                DsTextAtomKt.DsTextAtom(item.getSubtitle(), null, c3969l, 0, 2);
                c3969l.f();
                actionBadge = item.getActionBadge();
                c3969l.o(1946809435);
                if (actionBadge != null) {
                    CommonControlSettings common = actionBadge.getCommon();
                    AtomAction atomAction = common != null ? common.toAtomAction() : null;
                    e j12 = T.j(c5187j.a(aVar, InterfaceC6250b.a.d()), f14, 0.0f, 0.0f, f14, 6);
                    V f16 = C5185h.f(InterfaceC6250b.a.o(), false);
                    int I13 = c3969l.I();
                    A0 d14 = c3969l.d();
                    e f17 = c.f(c3969l, j12);
                    Function0 a15 = InterfaceC2801g.a.a();
                    c3969l.i();
                    if (c3969l.t()) {
                        c3969l.H(a15);
                    } else {
                        c3969l.e();
                    }
                    Function2 f18 = E.f(c3969l, f16, c3969l, d14);
                    if (c3969l.t() || !Intrinsics.d(c3969l.C(), Integer.valueOf(I13))) {
                        a.d(I13, c3969l, I13, f18);
                    }
                    F1.b(c3969l, f17, InterfaceC2801g.a.f());
                    c3969l.o(-777511446);
                    Object C13 = c3969l.C();
                    if (C13 == InterfaceC3967k.a.a()) {
                        C13 = BannerItemKt$BannerItem$3$2$1$1$1.INSTANCE;
                        c3969l.x(C13);
                    }
                    c3969l.k();
                    AtomAction atomAction2 = atomAction;
                    DsBadgeAtomKt.DsBadgeAtom(actionBadge, null, (Function1) C13, c3969l, 384, 2);
                    c3969l = c3969l;
                    e b12 = c5187j.b(aVar);
                    boolean z12 = atomAction2 != null;
                    c3969l.o(-777499542);
                    Object C14 = c3969l.C();
                    if (C14 == InterfaceC3967k.a.a()) {
                        C14 = BannerItemKt$BannerItem$3$2$1$2$1.INSTANCE;
                        c3969l.x(C14);
                    }
                    Function0 function02 = (Function0) C14;
                    c3969l.k();
                    c3969l.o(-777498105);
                    boolean F12 = c3969l.F(atomAction2) | (i15 == 32);
                    Object C15 = c3969l.C();
                    if (F12 || C15 == InterfaceC3967k.a.a()) {
                        C15 = new BannerItemKt$BannerItem$3$2$1$3$1(atomAction2, actionHandler);
                        c3969l.x(C15);
                    }
                    c3969l.k();
                    C5185h.a(i.d(b12, null, z12, function02, (Function0) C15, 184), c3969l, 0);
                    c3969l.f();
                    Unit unit = Unit.f71690a;
                }
                c3969l.k();
                c3969l.f();
                eVar3 = eVar5;
            } else {
                u11.j();
                eVar3 = eVar2;
                c3969l = u11;
            }
            m02 = c3969l.m0();
            if (m02 == null) {
                m02.G(new BannerItemKt$BannerItem$4(item, actionHandler, eVar3, i11, i12));
                return;
            }
            return;
        }
        eVar2 = eVar;
        if ((i13 & 147) == 146) {
        }
        if (i14 == 0) {
        }
        C7807Z backgroundColor2 = backgroundColor(item, u11, i13 & 14);
        u11.o(-1599255008);
        if (backgroundColor2 != null) {
        }
        u11.k();
        e e112 = a0.e(eVar4, 1.0f);
        float f72 = UserVerificationMethods.USER_VERIFY_PATTERN;
        b11 = androidx.compose.foundation.e.b(C6988h.a(a0.f(e112, f72), h.b(24)), layerFloor1, y0.a());
        if (item.getAction() == null) {
        }
        u11.o(-1599241619);
        C11 = u11.C();
        if (C11 == InterfaceC3967k.a.a()) {
        }
        Function0 function03 = (Function0) C11;
        u11.k();
        u11.o(-1599240982);
        int i152 = i13 & 112;
        F11 = u11.F(item) | (i152 != 32);
        C12 = u11.C();
        if (!F11) {
        }
        C12 = new BannerItemKt$BannerItem$2$1(item, actionHandler);
        u11.x(C12);
        u11.k();
        e d112 = i.d(b11, null, z11, function03, (Function0) C12, 184);
        V f112 = C5185h.f(InterfaceC6250b.a.o(), false);
        I11 = u11.I();
        A0 d122 = u11.d();
        e f122 = c.f(u11, d112);
        Function0 a112 = g.a(InterfaceC2801g.f5440U, u11);
        if (u11.t()) {
        }
        Function2 f132 = E.f(u11, f112, u11, d122);
        if (!u11.t()) {
        }
        a.d(I11, u11, I11, f132);
        F1.b(u11, f122, InterfaceC2801g.a.f());
        C5187j c5187j2 = C5187j.f39515a;
        e eVar52 = eVar4;
        PikazonImagePainter a122 = f.a(item.getImageURL(), null, null, null, u11, 0, 14);
        e.a aVar2 = e.f40358c0;
        DsImageKt.m1720DsImageA8mMYrQ(a122, a0.n(c5187j2.a(aVar2, InterfaceC6250b.a.f()), f72), false, 0.0f, layerFloor1, InterfaceC2547p.a.d(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, u11, 196608, 0, 1996);
        c3969l = u11;
        float f142 = 16;
        e j112 = T.j(c5187j2.a(aVar2, InterfaceC6250b.a.m()), f142, f142, 120, 0.0f, 8);
        C5194q a132 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), c3969l, 0);
        I12 = c3969l.I();
        A0 d132 = c3969l.d();
        e f152 = c.f(c3969l, j112);
        Function0 a142 = InterfaceC2801g.a.a();
        c3969l.i();
        if (c3969l.t()) {
        }
        Function2 g102 = b.g(c3969l, a132, c3969l, d132);
        if (!c3969l.t()) {
        }
        a.d(I12, c3969l, I12, g102);
        F1.b(c3969l, f152, InterfaceC2801g.a.f());
        DsTextAtomKt.DsTextAtom(item.getTitle(), null, c3969l, 0, 2);
        u0.E.a(c3969l, a0.f(aVar2, 4));
        DsTextAtomKt.DsTextAtom(item.getSubtitle(), null, c3969l, 0, 2);
        c3969l.f();
        actionBadge = item.getActionBadge();
        c3969l.o(1946809435);
        if (actionBadge != null) {
        }
        c3969l.k();
        c3969l.f();
        eVar3 = eVar52;
        m02 = c3969l.m0();
        if (m02 == null) {
        }
    }

    public static final C7807Z backgroundColor(@NotNull BannerVO bannerVO, InterfaceC3967k interfaceC3967k, int i11) {
        Intrinsics.checkNotNullParameter(bannerVO, "<this>");
        interfaceC3967k.o(1748634140);
        C7807Z c7807z = TokenParserKt.tokenToColor(p.a(interfaceC3967k) ? bannerVO.getDarkBackgroundColor() : bannerVO.getLightBackgroundColor(), interfaceC3967k, 0);
        interfaceC3967k.k();
        return c7807z;
    }
}

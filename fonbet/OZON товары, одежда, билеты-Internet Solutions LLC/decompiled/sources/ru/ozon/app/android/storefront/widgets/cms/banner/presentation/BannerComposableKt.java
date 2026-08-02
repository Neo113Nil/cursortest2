package ru.ozon.app.android.storefront.widgets.cms.banner.presentation;

import A0.h;
import B1.InterfaceC2547p;
import B1.V;
import D1.InterfaceC2801g;
import Ep.a;
import GZ.g;
import I1.o;
import S0.A0;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.J0;
import T7.E;
import Tg.b;
import WZ.l;
import WZ.t;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.C5187j;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.Q1;
import androidx.lifecycle.AbstractC5434v;
import b00.f;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
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
import org.jetbrains.annotations.NotNull;
import ru.ozon.pikazon.compose.painter.PikazonImagePainter;
import ru.ozon.uni.android.ds.compose.component.badge.DsBadgeAtomKt;
import ru.ozon.uni.android.ds.compose.component.image.DsImageKt;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.core.compose.tokens.TokenParserKt;
import ru.ozon.uni.core.repository.UniTheme;
import u0.C9915y;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a=\u0010\n\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\b\b\u0002\u0010\t\u001a\u00020\bH\u0001¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/storefront/widgets/cms/banner/presentation/BannerVI;", "item", "LGZ/g;", "router", "Lkotlin/Function1;", "LTg/b;", "", "actionHandler", "Landroidx/compose/ui/e;", "modifier", "BannerComposable", "(Lru/ozon/app/android/storefront/widgets/cms/banner/presentation/BannerVI;LGZ/g;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/e;LS0/k;II)V", "cms_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BannerComposableKt {
    /* JADX WARN: Removed duplicated region for block: B:22:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x009e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BannerComposable(@NotNull BannerVI item, @NotNull g router, @NotNull Function1<? super b, Unit> actionHandler, e eVar, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        e eVar2;
        l lVar;
        t tokenizedEvent;
        C9915y c9915y;
        C9915y c9915y2;
        boolean F11;
        Object C11;
        Object C12;
        int I11;
        BadgeDTO advBadge;
        J0 m02;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        C3969l u11 = interfaceC3967k.u(-1846992501);
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
            i13 |= u11.F(router) ? 32 : 16;
        }
        if ((i12 & 4) != 0) {
            i13 |= 384;
        } else if ((i11 & 384) == 0) {
            i13 |= u11.F(actionHandler) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        int i14 = i12 & 8;
        if (i14 != 0) {
            i13 |= 3072;
        } else if ((i11 & 3072) == 0) {
            eVar2 = eVar;
            i13 |= u11.n(eVar2) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
            if ((i13 & 1171) == 1170 || !u11.b()) {
                e eVar3 = i14 == 0 ? e.f40358c0 : eVar2;
                lVar = (l) u11.m(f.e());
                tokenizedEvent = item.getTokenizedEvent();
                u11.o(-1254825292);
                if (tokenizedEvent != null) {
                    AbstractC5434v.a aVar = AbstractC5434v.a.ON_RESUME;
                    u11.o(1574712367);
                    boolean F12 = u11.F(lVar) | u11.F(tokenizedEvent);
                    Object C13 = u11.C();
                    if (F12 || C13 == InterfaceC3967k.a.a()) {
                        C13 = new BannerComposableKt$BannerComposable$1$1$1(lVar, tokenizedEvent);
                        u11.x(C13);
                    }
                    u11.k();
                    i.a(aVar, null, (Function0) C13, u11, 6);
                    Unit unit = Unit.f71690a;
                }
                u11.k();
                C7807Z c7807z = TokenParserKt.tokenToColor(item.getBackgroundColor(), u11, 0);
                l1.J0 b11 = !item.getIsRounded() ? h.b(16) : y0.a();
                if (item.getIsRounded() || !item.getDisableVerticalMargins()) {
                    if (item.getIsRounded()) {
                        float f7 = 0;
                        c9915y = new C9915y(f7, f7, f7, f7);
                    } else {
                        float f11 = 16;
                        c9915y = new C9915y(f11, f11, f11, f11);
                    }
                    c9915y2 = c9915y;
                } else {
                    c9915y2 = T.a(16, 2, 0.0f);
                }
                e e11 = T.e(a0.e(eVar3, 1.0f), c9915y2);
                u11.o(-1254802501);
                F11 = u11.F(item) | u11.F(lVar) | u11.F(router);
                C11 = u11.C();
                if (!F11 || C11 == InterfaceC3967k.a.a()) {
                    C11 = new BannerComposableKt$BannerComposable$2$1(item, router, lVar);
                    u11.x(C11);
                }
                u11.k();
                e b12 = androidx.compose.foundation.i.b(e11, null, null, false, null, null, (Function0) C11, 28);
                u11.o(-1254795409);
                C12 = u11.C();
                if (C12 == InterfaceC3967k.a.a()) {
                    C12 = BannerComposableKt$BannerComposable$3$1.INSTANCE;
                    u11.x(C12);
                }
                u11.k();
                e a11 = Q1.a(o.c(b12, false, (Function1) C12), "bannerFl");
                V f12 = C5185h.f(InterfaceC6250b.a.o(), false);
                I11 = u11.I();
                A0 d11 = u11.d();
                e f13 = c.f(u11, a11);
                Function0 a12 = Fr.g.a(InterfaceC2801g.f5440U, u11);
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
                l1.J0 j02 = b11;
                PikazonImagePainter a13 = ru.ozon.pikazon.compose.painter.f.a(item.getImage(), null, null, null, u11, 0, 14);
                float ratio = item.getRatio();
                InterfaceC2547p.a.C0051a a14 = InterfaceC2547p.a.a();
                u11.o(1574750173);
                long layerFloor1 = c7807z != null ? UniTheme.INSTANCE.getColors(u11, UniTheme.$stable).getLayerFloor1() : c7807z.w();
                u11.k();
                e.a aVar2 = e.f40358c0;
                DsImageKt.m1720DsImageA8mMYrQ(a13, Q1.a(C6988h.a(a0.e(aVar2, 1.0f), j02), "bannerImageIv"), false, ratio, layerFloor1, a14, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, u11, 196608, 0, 1988);
                u11 = u11;
                advBadge = item.getAdvBadge();
                u11.o(1574757645);
                if (advBadge != null) {
                    eVar2 = eVar3;
                } else {
                    eVar2 = eVar3;
                    DsBadgeAtomKt.DsBadgeAtom(advBadge, T.f(S8.b.c(c5187j.a(aVar2, InterfaceC6250b.a.n()), 11, null, 30), 8), actionHandler, u11, i13 & 896, 0);
                }
                u11.k();
                u11.f();
            } else {
                u11.j();
            }
            e eVar4 = eVar2;
            m02 = u11.m0();
            if (m02 == null) {
                m02.G(new BannerComposableKt$BannerComposable$5(item, router, actionHandler, eVar4, i11, i12));
                return;
            }
            return;
        }
        eVar2 = eVar;
        if ((i13 & 1171) == 1170) {
        }
        if (i14 == 0) {
        }
        lVar = (l) u11.m(f.e());
        tokenizedEvent = item.getTokenizedEvent();
        u11.o(-1254825292);
        if (tokenizedEvent != null) {
        }
        u11.k();
        C7807Z c7807z2 = TokenParserKt.tokenToColor(item.getBackgroundColor(), u11, 0);
        if (!item.getIsRounded()) {
        }
        if (item.getIsRounded()) {
        }
        if (item.getIsRounded()) {
        }
        c9915y2 = c9915y;
        e e112 = T.e(a0.e(eVar3, 1.0f), c9915y2);
        u11.o(-1254802501);
        F11 = u11.F(item) | u11.F(lVar) | u11.F(router);
        C11 = u11.C();
        if (!F11) {
        }
        C11 = new BannerComposableKt$BannerComposable$2$1(item, router, lVar);
        u11.x(C11);
        u11.k();
        e b122 = androidx.compose.foundation.i.b(e112, null, null, false, null, null, (Function0) C11, 28);
        u11.o(-1254795409);
        C12 = u11.C();
        if (C12 == InterfaceC3967k.a.a()) {
        }
        u11.k();
        e a112 = Q1.a(o.c(b122, false, (Function1) C12), "bannerFl");
        V f122 = C5185h.f(InterfaceC6250b.a.o(), false);
        I11 = u11.I();
        A0 d112 = u11.d();
        e f132 = c.f(u11, a112);
        Function0 a122 = Fr.g.a(InterfaceC2801g.f5440U, u11);
        if (u11.t()) {
        }
        Function2 f142 = E.f(u11, f122, u11, d112);
        if (!u11.t()) {
        }
        a.d(I11, u11, I11, f142);
        F1.b(u11, f132, InterfaceC2801g.a.f());
        C5187j c5187j2 = C5187j.f39515a;
        l1.J0 j022 = b11;
        PikazonImagePainter a132 = ru.ozon.pikazon.compose.painter.f.a(item.getImage(), null, null, null, u11, 0, 14);
        float ratio2 = item.getRatio();
        InterfaceC2547p.a.C0051a a142 = InterfaceC2547p.a.a();
        u11.o(1574750173);
        if (c7807z2 != null) {
        }
        u11.k();
        e.a aVar22 = e.f40358c0;
        DsImageKt.m1720DsImageA8mMYrQ(a132, Q1.a(C6988h.a(a0.e(aVar22, 1.0f), j022), "bannerImageIv"), false, ratio2, layerFloor1, a142, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, u11, 196608, 0, 1988);
        u11 = u11;
        advBadge = item.getAdvBadge();
        u11.o(1574757645);
        if (advBadge != null) {
        }
        u11.k();
        u11.f();
        e eVar42 = eVar2;
        m02 = u11.m0();
        if (m02 == null) {
        }
    }
}

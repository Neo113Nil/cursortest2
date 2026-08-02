package ru.ozon.app.android.cscore.orderdetails.molecule.imagesCompose.presentation.compose;

import B1.InterfaceC2547p;
import B1.V;
import D1.InterfaceC2801g;
import Ep.a;
import Fr.g;
import J0.T0;
import S0.A0;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.J0;
import T7.E;
import android.content.Context;
import androidx.compose.foundation.i;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.C5187j;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import i1.C6981a;
import i1.C6988h;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import l1.C7807Z;
import n0.C8366G;
import n0.C8385f;
import org.jetbrains.annotations.NotNull;
import q1.AbstractC8972b;
import ru.ozon.app.android.cscore.orderdetails.molecule.imagesCompose.data.ComposableImageDTO;
import ru.ozon.app.android.cscore.orderdetails.molecule.imagesCompose.presentation.ComposableImageVO;
import ru.ozon.app.android.cscore.orderdetails.molecule.imagesCompose.presentation.ImageBlurManager;
import ru.ozon.pikazon.compose.painter.f;
import ru.ozon.uni.android.atom.productMedia.Ratio;
import ru.ozon.uni.android.atom.productMedia.RatioKt;
import ru.ozon.uni.android.ds.compose.component.badge.DsBadgeAtomKt;
import ru.ozon.uni.android.ds.compose.component.image.DsImageAtomKt;
import ru.ozon.uni.android.ds.compose.component.text.DsTextAtomKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.image.CornerRadius;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.productMedia.ProductMediaDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.components.productMedia.UniProductMediaAtomKt;
import ru.ozon.uni.core.R$drawable;
import ru.ozon.uni.core.compose.tokens.TokenParserKt;
import ru.ozon.uni.core.compose.tokens.UniComposeIconTokensKt;
import ru.ozon.uni.core.repository.UniTheme;
import t0.p;
import t0.q;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a3\u0010\b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t\u001a3\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/cscore/orderdetails/molecule/imagesCompose/presentation/ComposableImageVO;", "item", "", "position", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "ImageComposable", "(Lru/ozon/app/android/cscore/orderdetails/molecule/imagesCompose/presentation/ComposableImageVO;ILkotlin/jvm/functions/Function1;LS0/k;I)V", "Lru/ozon/app/android/cscore/orderdetails/molecule/imagesCompose/presentation/compose/ImageSlotSize;", "slotSize", "Landroidx/compose/ui/e;", "modifier", "", "showIcon", "AdultImage", "(Lru/ozon/app/android/cscore/orderdetails/molecule/imagesCompose/presentation/ComposableImageVO;Lru/ozon/app/android/cscore/orderdetails/molecule/imagesCompose/presentation/compose/ImageSlotSize;Landroidx/compose/ui/e;ZLS0/k;II)V", "csma_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ImageComposableKt {
    /* JADX WARN: Removed duplicated region for block: B:13:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AdultImage(@NotNull ComposableImageVO item, @NotNull ImageSlotSize slotSize, e eVar, boolean z11, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        e eVar2;
        int i14;
        boolean z12;
        e eVar3;
        boolean z13;
        boolean n11;
        Object C11;
        String blurImageUrl;
        AbstractC8972b abstractC8972b;
        int I11;
        boolean z14;
        J0 m02;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(slotSize, "slotSize");
        C3969l u11 = interfaceC3967k.u(1522094245);
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
            i13 |= u11.n(slotSize) ? 32 : 16;
        }
        int i15 = i12 & 4;
        if (i15 != 0) {
            i13 |= 384;
        } else if ((i11 & 384) == 0) {
            eVar2 = eVar;
            i13 |= u11.n(eVar2) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
            i14 = i12 & 8;
            if (i14 == 0) {
                i13 |= 3072;
            } else if ((i11 & 3072) == 0) {
                z12 = z11;
                i13 |= u11.p(z12) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
                if ((i13 & 1171) == 1170 || !u11.b()) {
                    eVar3 = i15 != 0 ? e.f40358c0 : eVar2;
                    z13 = i14 != 0 ? true : z12;
                    u11.o(1151356789);
                    n11 = u11.n(item);
                    C11 = u11.C();
                    if (!n11 || C11 == InterfaceC3967k.a.a()) {
                        C11 = Integer.valueOf(ImageBlurManager.INSTANCE.getBlurImageRes(item));
                        u11.x(C11);
                    }
                    int intValue = ((Number) C11).intValue();
                    u11.k();
                    blurImageUrl = item.getBlurImageUrl();
                    abstractC8972b = null;
                    if (blurImageUrl != null || h.K(blurImageUrl)) {
                        blurImageUrl = null;
                    }
                    u11.o(1151362030);
                    if (blurImageUrl != null) {
                        boolean z15 = true;
                        String str = blurImageUrl;
                        InterfaceC2547p.a.C0051a a11 = InterfaceC2547p.a.a();
                        u11.o(92487597);
                        if ((i13 & 112) != 32) {
                            z15 = false;
                        }
                        boolean r11 = u11.r(intValue) | z15;
                        Object C12 = u11.C();
                        if (r11 || C12 == InterfaceC3967k.a.a()) {
                            C12 = new ImageComposableKt$AdultImage$painter$1$1$1(slotSize, intValue);
                            u11.x(C12);
                        }
                        u11.k();
                        abstractC8972b = f.a(str, a11, null, (Function1) C12, u11, 48, 4);
                    }
                    u11.k();
                    u11.o(1151361783);
                    if (abstractC8972b == null) {
                        abstractC8972b = G1.e.a(intValue, u11, 0);
                    }
                    AbstractC8972b abstractC8972b2 = abstractC8972b;
                    u11.k();
                    V f7 = C5185h.f(InterfaceC6250b.a.o(), false);
                    I11 = u11.I();
                    A0 d11 = u11.d();
                    e f11 = c.f(u11, eVar3);
                    Function0 a12 = g.a(InterfaceC2801g.f5440U, u11);
                    if (u11.t()) {
                        u11.H(a12);
                    } else {
                        u11.e();
                    }
                    Function2 f12 = E.f(u11, f7, u11, d11);
                    if (!u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                        a.d(I11, u11, I11, f12);
                    }
                    F1.b(u11, f11, InterfaceC2801g.a.f());
                    C5187j c5187j = C5187j.f39515a;
                    InterfaceC2547p.a.C0051a a13 = InterfaceC2547p.a.a();
                    e.a aVar = e.f40358c0;
                    C8366G.a(abstractC8972b2, null, a0.d(aVar), null, a13, 0.0f, null, u11, 25008, 104);
                    u11 = u11;
                    u11.o(92500249);
                    if (z13) {
                        UniTheme uniTheme = UniTheme.INSTANCE;
                        uniTheme.getIcons();
                        u11.B(-1732297917);
                        AbstractC8972b uniPainterResource = UniComposeIconTokensKt.uniPainterResource(R$drawable.ic_m_non_visibility_filled, "ic_m_non_visibility_filled", u11, 48);
                        u11.K();
                        T0.a(uniPainterResource, null, c5187j.a(a0.n(aVar, 24), InterfaceC6250b.a.e()), uniTheme.getColors(u11, UniTheme.$stable).getGraphicPrimaryOnLight(), u11, 48);
                        u11 = u11;
                    }
                    u11.k();
                    u11.f();
                    z14 = z13;
                } else {
                    u11.j();
                    eVar3 = eVar2;
                    z14 = z12;
                }
                m02 = u11.m0();
                if (m02 != null) {
                    m02.G(new ImageComposableKt$AdultImage$2(item, slotSize, eVar3, z14, i11, i12));
                    return;
                }
                return;
            }
            z12 = z11;
            if ((i13 & 1171) == 1170) {
            }
            if (i15 != 0) {
            }
            if (i14 != 0) {
            }
            u11.o(1151356789);
            n11 = u11.n(item);
            C11 = u11.C();
            if (!n11) {
            }
            C11 = Integer.valueOf(ImageBlurManager.INSTANCE.getBlurImageRes(item));
            u11.x(C11);
            int intValue2 = ((Number) C11).intValue();
            u11.k();
            blurImageUrl = item.getBlurImageUrl();
            abstractC8972b = null;
            if (blurImageUrl != null) {
            }
            blurImageUrl = null;
            u11.o(1151362030);
            if (blurImageUrl != null) {
            }
            u11.k();
            u11.o(1151361783);
            if (abstractC8972b == null) {
            }
            AbstractC8972b abstractC8972b22 = abstractC8972b;
            u11.k();
            V f72 = C5185h.f(InterfaceC6250b.a.o(), false);
            I11 = u11.I();
            A0 d112 = u11.d();
            e f112 = c.f(u11, eVar3);
            Function0 a122 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
            }
            Function2 f122 = E.f(u11, f72, u11, d112);
            if (!u11.t()) {
            }
            a.d(I11, u11, I11, f122);
            F1.b(u11, f112, InterfaceC2801g.a.f());
            C5187j c5187j2 = C5187j.f39515a;
            InterfaceC2547p.a.C0051a a132 = InterfaceC2547p.a.a();
            e.a aVar2 = e.f40358c0;
            C8366G.a(abstractC8972b22, null, a0.d(aVar2), null, a132, 0.0f, null, u11, 25008, 104);
            u11 = u11;
            u11.o(92500249);
            if (z13) {
            }
            u11.k();
            u11.f();
            z14 = z13;
            m02 = u11.m0();
            if (m02 != null) {
            }
        }
        eVar2 = eVar;
        i14 = i12 & 8;
        if (i14 == 0) {
        }
        z12 = z11;
        if ((i13 & 1171) == 1170) {
        }
        if (i15 != 0) {
        }
        if (i14 != 0) {
        }
        u11.o(1151356789);
        n11 = u11.n(item);
        C11 = u11.C();
        if (!n11) {
        }
        C11 = Integer.valueOf(ImageBlurManager.INSTANCE.getBlurImageRes(item));
        u11.x(C11);
        int intValue22 = ((Number) C11).intValue();
        u11.k();
        blurImageUrl = item.getBlurImageUrl();
        abstractC8972b = null;
        if (blurImageUrl != null) {
        }
        blurImageUrl = null;
        u11.o(1151362030);
        if (blurImageUrl != null) {
        }
        u11.k();
        u11.o(1151361783);
        if (abstractC8972b == null) {
        }
        AbstractC8972b abstractC8972b222 = abstractC8972b;
        u11.k();
        V f722 = C5185h.f(InterfaceC6250b.a.o(), false);
        I11 = u11.I();
        A0 d1122 = u11.d();
        e f1122 = c.f(u11, eVar3);
        Function0 a1222 = g.a(InterfaceC2801g.f5440U, u11);
        if (u11.t()) {
        }
        Function2 f1222 = E.f(u11, f722, u11, d1122);
        if (!u11.t()) {
        }
        a.d(I11, u11, I11, f1222);
        F1.b(u11, f1122, InterfaceC2801g.a.f());
        C5187j c5187j22 = C5187j.f39515a;
        InterfaceC2547p.a.C0051a a1322 = InterfaceC2547p.a.a();
        e.a aVar22 = e.f40358c0;
        C8366G.a(abstractC8972b222, null, a0.d(aVar22), null, a1322, 0.0f, null, u11, 25008, 104);
        u11 = u11;
        u11.o(92500249);
        if (z13) {
        }
        u11.k();
        u11.f();
        z14 = z13;
        m02 = u11.m0();
        if (m02 != null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [S0.k, S0.l] */
    /* JADX WARN: Type inference failed for: r15v5, types: [ru.ozon.uni.core.repository.UniTheme] */
    /* JADX WARN: Type inference failed for: r3v30, types: [androidx.compose.ui.e] */
    public static final void ImageComposable(@NotNull ComposableImageVO item, int i11, @NotNull Function1<? super AtomAction, Unit> actionHandler, InterfaceC3967k interfaceC3967k, int i12) {
        int i13;
        ProductMediaDTO.Width width;
        int px;
        CornerRadius cornerRadius;
        ImageSlotSize imageSlotSize;
        e f7;
        AtomActionDTO action;
        ProductMediaDTO copy;
        e.a aVar;
        C5187j c5187j;
        int i14;
        Unit unit;
        ImageDTO image;
        ru.ozon.uni.atoms.data.common.CornerRadius radius;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        ?? u11 = interfaceC3967k.u(-1851377825);
        if ((i12 & 6) == 0) {
            i13 = (u11.F(item) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 48) == 0) {
            i13 |= u11.r(i11) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i13 |= u11.F(actionHandler) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i13 & 147) == 146 && u11.b()) {
            u11.j();
        } else {
            Context context = (Context) u11.m(AndroidCompositionLocals_androidKt.d());
            ProductMediaDTO productMedia = item.getProductMedia();
            ProductMediaDTO.Width width2 = productMedia != null ? productMedia.getWidth() : null;
            ProductMediaDTO productMedia2 = item.getProductMedia();
            ProductMediaDTO.Ratio ratio = productMedia2 != null ? productMedia2.getRatio() : null;
            u11.o(1895571763);
            boolean n11 = u11.n(width2) | u11.n(ratio);
            Object C11 = u11.C();
            if (n11 || C11 == InterfaceC3967k.a.a()) {
                ProductMediaDTO productMedia3 = item.getProductMedia();
                Ratio mapProductMediaRatio = RatioKt.mapProductMediaRatio(productMedia3 != null ? productMedia3.getRatio() : null);
                ProductMediaDTO productMedia4 = item.getProductMedia();
                float dp = (productMedia4 == null || (width = productMedia4.getWidth()) == null) ? 64 : width.getDp();
                ImageSlotSize imageSlotSize2 = new ImageSlotSize(dp, (dp / mapProductMediaRatio.getWidthRatio()) * mapProductMediaRatio.getHeightRatio(), null);
                u11.x(imageSlotSize2);
                C11 = imageSlotSize2;
            }
            ImageSlotSize imageSlotSize3 = (ImageSlotSize) C11;
            u11.k();
            ProductMediaDTO productMedia5 = item.getProductMedia();
            if (productMedia5 == null || (radius = productMedia5.getRadius()) == null) {
                ImageDTO image2 = item.getImage();
                px = (image2 == null || (cornerRadius = image2.getCornerRadius()) == null) ? CornerRadius.NO_RADIUS.getPx() : cornerRadius.getPx();
            } else {
                px = radius.getPx();
            }
            float f11 = px;
            u11.o(1895586065);
            boolean q11 = u11.q(f11);
            Object C12 = u11.C();
            if (q11 || C12 == InterfaceC3967k.a.a()) {
                C12 = A0.h.b(f11);
                u11.x(C12);
            }
            A0.g gVar = (A0.g) C12;
            Object b11 = Pk0.h.b(u11, 1895588786);
            if (b11 == InterfaceC3967k.a.a()) {
                b11 = A0.h.b(CornerRadius.RADIUS_500.getPx());
                u11.x(b11);
            }
            A0.g gVar2 = (A0.g) b11;
            u11.k();
            ?? r15 = UniTheme.INSTANCE;
            int i15 = UniTheme.$stable;
            long graphicTertiaryOnLight = r15.getColors(u11, i15).getGraphicTertiaryOnLight();
            ComposableImageDTO.Border border = item.getBorder();
            u11.o(1895594608);
            if (border == null) {
                imageSlotSize = imageSlotSize3;
                f7 = null;
            } else {
                e.a aVar2 = e.f40358c0;
                float width3 = border.getWidth();
                imageSlotSize = imageSlotSize3;
                C7807Z c7807z = TokenParserKt.tokenToColor(border.getColor(), u11, 0);
                u11.o(1895598199);
                long graphicActionPrimary = c7807z == null ? r15.getColors(u11, i15).getGraphicActionPrimary() : c7807z.w();
                u11.k();
                f7 = T.f(C8385f.c(width3, graphicActionPrimary, aVar2, gVar2), 6);
            }
            u11.k();
            if (f7 == null) {
                f7 = e.f40358c0;
            }
            u11.o(1895605474);
            boolean n12 = u11.n(item) | ((i13 & 112) == 32) | ((i13 & 896) == 256) | u11.n(context);
            Object C13 = u11.C();
            if (n12 || C13 == InterfaceC3967k.a.a()) {
                CommonControlSettings common = item.getCommon();
                AtomAction atomAction = (common == null || (action = common.getAction()) == null) ? null : AtomActionMapperKt.toAtomAction(action, item.getCommon().getTrackingInfo());
                C13 = atomAction != null ? new ImageComposableKt$ImageComposable$onClick$1$1(actionHandler, atomAction) : !item.getGalleryItems().isEmpty() ? new ImageComposableKt$ImageComposable$onClick$1$2(item, i11, context) : null;
                u11.x(C13);
            }
            Function0 function0 = (Function0) C13;
            u11.k();
            e.a aVar3 = e.f40358c0;
            e.a a11 = item.getIsTranslucent() ? C6981a.a(aVar3, 0.5f) : aVar3;
            u11.o(1895628891);
            Object C14 = u11.C();
            if (C14 == InterfaceC3967k.a.a()) {
                C14 = p.a();
                u11.x(C14);
            }
            q qVar = (q) C14;
            u11.k();
            boolean z11 = function0 != null;
            u11.o(1895633129);
            boolean n13 = u11.n(function0);
            Object C15 = u11.C();
            if (n13 || C15 == InterfaceC3967k.a.a()) {
                C15 = new ImageComposableKt$ImageComposable$2$1(function0);
                u11.x(C15);
            }
            u11.k();
            e l02 = i.b(a11, qVar, null, z11, null, null, (Function0) C15, 24).l0(f7);
            V f12 = C5185h.f(InterfaceC6250b.a.o(), false);
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f13 = c.f(u11, l02);
            Function0 a12 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a12);
            } else {
                u11.e();
            }
            Function2 f14 = E.f(u11, f12, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                a.d(I11, u11, I11, f14);
            }
            F1.b(u11, f13, InterfaceC2801g.a.f());
            C5187j c5187j2 = C5187j.f39515a;
            if (item.getShouldBlur()) {
                u11.o(-241941329);
                AdultImage(item, imageSlotSize, C6988h.a(a0.o(aVar3, imageSlotSize.getWidth(), imageSlotSize.getHeight()), gVar), item.getCounter() == null, u11, i13 & 14, 0);
                u11.k();
                Unit unit2 = Unit.f71690a;
                aVar = aVar3;
                c5187j = c5187j2;
            } else {
                u11.o(-241634398);
                ProductMediaDTO productMedia6 = item.getProductMedia();
                u11.o(-2086004144);
                if (productMedia6 == null) {
                    aVar = aVar3;
                    c5187j = c5187j2;
                    i14 = 64;
                    unit = null;
                } else {
                    copy = productMedia6.copy((r34 & 1) != 0 ? productMedia6.context : null, (r34 & 2) != 0 ? productMedia6.image : null, (r34 & 4) != 0 ? productMedia6.width : null, (r34 & 8) != 0 ? productMedia6.ratio : null, (r34 & 16) != 0 ? productMedia6.radius : null, (r34 & 32) != 0 ? productMedia6.backgroundColor : null, (r34 & 64) != 0 ? productMedia6.border : null, (r34 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? productMedia6.hasParanja : null, (r34 & 256) != 0 ? productMedia6.hasOverlay : Boolean.valueOf(item.getCounter() != null), (r34 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? productMedia6.icon : null, (r34 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? productMedia6.label : null, (r34 & 2048) != 0 ? productMedia6.smallIcon : null, (r34 & 4096) != 0 ? productMedia6.smallLabel : null, (r34 & 8192) != 0 ? productMedia6.common : null, (r34 & 16384) != 0 ? productMedia6.smallIconColor : null, (r34 & 32768) != 0 ? productMedia6.smallLabelColor : null);
                    aVar = aVar3;
                    c5187j = c5187j2;
                    i14 = 64;
                    UniProductMediaAtomKt.UniProductMediaAtom(copy, c5187j2.a(aVar3, InterfaceC6250b.a.e()), null, u11, ProductMediaDTO.$stable, 4);
                    unit = Unit.f71690a;
                }
                u11.k();
                if (unit == null && (image = item.getImage()) != null) {
                    DsImageAtomKt.DsImageAtom(image, c5187j.a(a0.n(aVar, i14), InterfaceC6250b.a.e()), u11, 0, 0);
                    u11.o(-2085988668);
                    if (item.getCounter() != null) {
                        C5185h.a(androidx.compose.foundation.e.b(c5187j.b(aVar), graphicTertiaryOnLight, gVar), u11, 0);
                    }
                    u11.k();
                    Unit unit3 = Unit.f71690a;
                }
                u11.k();
            }
            TextDTO counter = item.getCounter();
            u11.o(-2085979552);
            if (counter != null) {
                DsTextAtomKt.DsTextAtom(counter, c5187j.a(aVar, InterfaceC6250b.a.e()), u11, 0, 0);
                Unit unit4 = Unit.f71690a;
            }
            u11.k();
            BadgeDTO badge = item.getBadge();
            u11.o(-2085975244);
            if (badge != null) {
                DsBadgeAtomKt.DsBadgeAtom(badge, T.f(c5187j.a(aVar, InterfaceC6250b.a.d()), 4), null, u11, 0, 4);
                Unit unit5 = Unit.f71690a;
            }
            u11.k();
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new ImageComposableKt$ImageComposable$4(item, i11, actionHandler, i12));
        }
    }
}

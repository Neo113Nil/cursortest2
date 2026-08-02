package ru.ozon.app.android.account.orders.shipmentwidget.v2.presentation.products.composable;

import A0.g;
import A0.h;
import B1.InterfaceC2547p;
import B1.V;
import D1.InterfaceC2801g;
import Ep.a;
import Ge.n;
import K00.b;
import S0.A0;
import S0.A1;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import S0.J0;
import S0.n1;
import Sc.o;
import T7.E;
import androidx.compose.foundation.i;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.C5187j;
import androidx.compose.foundation.layout.C5193p;
import androidx.compose.foundation.layout.C5194q;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.X;
import androidx.compose.foundation.layout.Y;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import b1.C5503f;
import b1.C5517t;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import i1.C6981a;
import i1.C6983c;
import i1.C6984d;
import i1.C6988h;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l1.C7809a0;
import l1.y0;
import n0.C8366G;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.adult.presenter.AdultListDelegate;
import ru.ozon.app.android.account.orders.shipmentwidget.v2.presentation.products.viewItem.ProductImageVO;
import ru.ozon.app.android.account.orders.shipmentwidget.v2.presentation.products.viewItem.ProductsVO;
import ru.ozon.pikazon.compose.painter.PikazonImagePainter;
import ru.ozon.pikazon.compose.painter.f;
import ru.ozon.uni.android.ds.compose.component.badge.DsBadgeAtomKt;
import ru.ozon.uni.android.ds.compose.component.price.DsPriceAtomKt;
import ru.ozon.uni.android.ds.compose.component.text.DsTextAtomKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.productMedia.ProductMediaDTO;
import ru.ozon.uni.core.R$drawable;
import ru.ozon.uni.core.repository.UniTheme;
import t0.p;
import t0.q;
import u0.C9915y;
import v0.C10164d;
import v0.I;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\b\u0003\u001a9\u0010\t\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0001¢\u0006\u0004\b\t\u0010\n\u001a+\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0003¢\u0006\u0004\b\f\u0010\r\u001a\u0013\u0010\u0010\u001a\u00020\u000f*\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a!\u0010\u0015\u001a\u00020\u0012*\u00020\u00122\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u0013H\u0003¢\u0006\u0004\b\u0015\u0010\u0016\"\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019\"\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019\"\u0014\u0010\u001b\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019\"\u0014\u0010\u001c\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019\"\u0014\u0010\u001d\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019\"\u0014\u0010\u001e\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019\"\u0014\u0010\u001f\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019\"\u0014\u0010 \u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019\"\u0014\u0010!\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019¨\u0006%²\u0006 \u0010$\u001a\u0016\u0012\u0004\u0012\u00020\u0003 #*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\"0\"8\nX\u008a\u0084\u0002"}, d2 = {"Lru/ozon/app/android/account/orders/shipmentwidget/v2/presentation/products/viewItem/ProductsVO;", "item", "Lru/ozon/app/android/account/adult/presenter/AdultListDelegate;", "Lru/ozon/app/android/account/orders/shipmentwidget/v2/presentation/products/viewItem/ProductImageVO;", "adultListDelegate", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "ProductsComposable", "(Lru/ozon/app/android/account/orders/shipmentwidget/v2/presentation/products/viewItem/ProductsVO;Lru/ozon/app/android/account/adult/presenter/AdultListDelegate;Lkotlin/jvm/functions/Function1;LS0/k;I)V", "productImage", "ProductImage", "(Lru/ozon/app/android/account/orders/shipmentwidget/v2/presentation/products/viewItem/ProductImageVO;Lkotlin/jvm/functions/Function1;LS0/k;I)V", "Lru/ozon/uni/atoms/data/productMedia/ProductMediaDTO$Ratio;", "", "toFloat", "(Lru/ozon/uni/atoms/data/productMedia/ProductMediaDTO$Ratio;)F", "Landroidx/compose/ui/e;", "Lkotlin/Function0;", "onClick", "silentClickable", "(Landroidx/compose/ui/e;Lkotlin/jvm/functions/Function0;LS0/k;I)Landroidx/compose/ui/e;", "LZ1/h;", "PREVIEW_SPACING", "F", "DP_2", "DP_4", "DP_6", "DP_8", "DP_10", "DP_40", "EYE_IMAGE_SIZE", "DEFAULT_BLUR_RADIUS", "", "kotlin.jvm.PlatformType", "products", "cs-orders_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ProductsComposableKt {
    private static final float DP_8;
    private static final float PREVIEW_SPACING;
    private static final float DP_2 = 2;
    private static final float DP_4 = 4;
    private static final float DP_6 = 6;
    private static final float DP_10 = 10;
    private static final float DP_40 = 40;
    private static final float EYE_IMAGE_SIZE = 24;
    private static final float DEFAULT_BLUR_RADIUS = 25;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ProductMediaDTO.Ratio.values().length];
            try {
                iArr[ProductMediaDTO.Ratio.RATIO_1_1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ProductMediaDTO.Ratio.RATIO_3_4.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ProductMediaDTO.Ratio.RATIO_4_3.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        float f7 = 8;
        PREVIEW_SPACING = f7;
        DP_8 = f7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v19, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v20 */
    public static final void ProductImage(ProductImageVO productImageVO, Function1<? super AtomAction, Unit> function1, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        boolean z11;
        e.a aVar;
        C3969l c3969l;
        float f7;
        y0.a aVar2;
        ?? r11;
        e eVar;
        e.a aVar3;
        C3969l c3969l2;
        int i13;
        float f11;
        C3969l c3969l3;
        Function1<? super AtomAction, Unit> function12 = function1;
        C3969l u11 = interfaceC3967k.u(1946556095);
        if ((i11 & 6) == 0) {
            i12 = (u11.F(productImageVO) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.F(function12) ? 32 : 16;
        }
        int i14 = i12;
        if ((i14 & 19) == 18 && u11.b()) {
            u11.j();
            c3969l3 = u11;
        } else {
            g d11 = h.d(productImageVO.getTopCornerRadius(), productImageVO.getTopCornerRadius(), 0.0f, 0.0f, 12);
            float f12 = productImageVO.getIsTranslucent() ? 0.5f : 1.0f;
            ProductMediaDTO.Ratio ratio = productImageVO.getProductMediaImage().getRatio();
            float f13 = ratio != null ? toFloat(ratio) : 1.0f;
            ProductMediaDTO.Width width = productImageVO.getProductMediaImage().getWidth();
            float dp = width != null ? width.getDp() : 0;
            int i15 = (int) (dp / f13);
            e.a aVar4 = e.f40358c0;
            e a11 = C6981a.a(a0.r(C6988h.a(T.j(aVar4, 0.0f, 0.0f, 0.0f, DP_8, 7), d11), dp), f12);
            u11.o(1414006425);
            int i16 = i14 & 112;
            boolean F11 = u11.F(productImageVO) | (i16 == 32);
            Object C11 = u11.C();
            if (F11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new ProductsComposableKt$ProductImage$1$1(productImageVO, function12);
                u11.x(C11);
            }
            u11.k();
            e silentClickable = silentClickable(a11, (Function0) C11, u11, 0);
            C5194q a12 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), u11, 48);
            int I11 = u11.I();
            A0 d12 = u11.d();
            e f14 = c.f(u11, silentClickable);
            Function0 a13 = Fr.g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a13);
            } else {
                u11.e();
            }
            Function2 g10 = b.g(u11, a12, u11, d12);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                a.d(I11, u11, I11, g10);
            }
            F1.b(u11, f14, InterfaceC2801g.a.f());
            V f15 = C5185h.f(InterfaceC6250b.a.o(), false);
            int I12 = u11.I();
            A0 d13 = u11.d();
            e f16 = c.f(u11, aVar4);
            Function0 a14 = InterfaceC2801g.a.a();
            u11.i();
            if (u11.t()) {
                u11.H(a14);
            } else {
                u11.e();
            }
            Function2 f17 = E.f(u11, f15, u11, d13);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I12))) {
                a.d(I12, u11, I12, f17);
            }
            F1.b(u11, f16, InterfaceC2801g.a.f());
            C5187j c5187j = C5187j.f39515a;
            if (productImageVO.getShouldBlur()) {
                z11 = false;
                aVar = aVar4;
                c3969l = u11;
                f7 = dp;
                c3969l.o(1305824519);
                e o11 = a0.o(aVar, f7, i15);
                V f18 = C5185h.f(InterfaceC6250b.a.e(), false);
                int I13 = c3969l.I();
                A0 d14 = c3969l.d();
                e f19 = c.f(c3969l, o11);
                Function0 a15 = InterfaceC2801g.a.a();
                c3969l.i();
                if (c3969l.t()) {
                    c3969l.H(a15);
                } else {
                    c3969l.e();
                }
                Function2 f21 = E.f(c3969l, f18, c3969l, d14);
                if (c3969l.t() || !Intrinsics.d(c3969l.C(), Integer.valueOf(I13))) {
                    a.d(I13, c3969l, I13, f21);
                }
                F1.b(c3969l, f19, InterfaceC2801g.a.f());
                c3969l.o(1976493647);
                String blurImageUrl = productImageVO.getBlurImageUrl();
                if (blurImageUrl == null) {
                    ProductMediaDTO.Image image = productImageVO.getProductMediaImage().getImage();
                    blurImageUrl = image != null ? image.getUrl() : null;
                    if (blurImageUrl == null) {
                        c3969l.k();
                        c3969l.f();
                        c3969l.k();
                    }
                }
                PikazonImagePainter a16 = f.a(blurImageUrl, null, null, null, c3969l, 0, 14);
                e b11 = c5187j.b(aVar);
                String blurImageUrl2 = productImageVO.getBlurImageUrl();
                if (blurImageUrl2 == null || kotlin.text.h.K(blurImageUrl2)) {
                    float f22 = DEFAULT_BLUR_RADIUS;
                    aVar2 = C6984d.f65679b;
                    b11 = C6983c.a(b11, C6984d.b(aVar2).c(), f22);
                }
                C8366G.a(a16, null, b11, InterfaceC6250b.a.e(), InterfaceC2547p.a.b(), 0.0f, null, c3969l, 27696, 96);
                C8366G.a(f.a(Integer.valueOf(R$drawable.ic_m_non_visibility_filled), null, null, null, c3969l, 0, 14), null, a0.n(aVar, EYE_IMAGE_SIZE), null, null, 0.0f, C7809a0.a.a(5, UniTheme.INSTANCE.getColors(c3969l, UniTheme.$stable).getGraphicPrimaryOnLight()), c3969l, 432, 56);
                c3969l = c3969l;
                c3969l.k();
                c3969l.f();
                c3969l.k();
            } else {
                u11.o(1305380723);
                u11.o(-512075644);
                Object C12 = u11.C();
                if (C12 == InterfaceC3967k.a.a()) {
                    C12 = ProductsComposableKt$ProductImage$2$1$1$1.INSTANCE;
                    u11.x(C12);
                }
                Function1 function13 = (Function1) C12;
                u11.k();
                u11.o(-512071936);
                boolean F12 = u11.F(productImageVO) | (i16 == 32);
                Object C13 = u11.C();
                if (F12 || C13 == InterfaceC3967k.a.a()) {
                    C13 = new ProductsComposableKt$ProductImage$2$1$2$1(productImageVO, function12);
                    u11.x(C13);
                }
                Function1 function14 = (Function1) C13;
                u11.k();
                f7 = dp;
                z11 = false;
                aVar = aVar4;
                androidx.compose.ui.viewinterop.a.a(function13, null, function14, u11, 6, 2);
                c3969l = u11;
                c3969l.k();
            }
            e a17 = c5187j.a(aVar, InterfaceC6250b.a.d());
            float f23 = DP_4;
            e f24 = T.f(a17, f23);
            float f25 = DP_2;
            C5194q a18 = C5193p.a(C5179b.n(f25), InterfaceC6250b.a.k(), c3969l, 6);
            int I14 = c3969l.I();
            A0 d15 = c3969l.d();
            e f26 = c.f(c3969l, f24);
            Function0 a19 = InterfaceC2801g.a.a();
            c3969l.i();
            if (c3969l.t()) {
                c3969l.H(a19);
            } else {
                c3969l.e();
            }
            Function2 g11 = b.g(c3969l, a18, c3969l, d15);
            if (c3969l.t() || !Intrinsics.d(c3969l.C(), Integer.valueOf(I14))) {
                a.d(I14, c3969l, I14, g11);
            }
            F1.b(c3969l, f26, InterfaceC2801g.a.f());
            c3969l.o(617988043);
            if (productImageVO.getCounterBadge() != null) {
                r11 = z11;
                C3969l c3969l4 = c3969l;
                f11 = f7;
                eVar = null;
                aVar3 = aVar;
                i13 = 2;
                DsBadgeAtomKt.DsBadgeAtom(productImageVO.getCounterBadge(), null, function12, c3969l4, (i14 << 3) & 896, 2);
                c3969l2 = c3969l4;
            } else {
                r11 = z11;
                eVar = null;
                aVar3 = aVar;
                c3969l2 = c3969l;
                i13 = 2;
                f11 = f7;
            }
            c3969l2.k();
            c3969l2.o(617995625);
            if (productImageVO.getStatusBadge() != null) {
                DsBadgeAtomKt.DsBadgeAtom(productImageVO.getStatusBadge(), null, function1, c3969l2, (i14 << 3) & 896, 2);
            }
            c3969l2.k();
            c3969l2.f();
            c3969l2.f();
            c3969l2.o(2015962916);
            if (productImageVO.getPrice() != null) {
                long layerFloor1 = UniTheme.INSTANCE.getColors(c3969l2, UniTheme.$stable).getLayerFloor1();
                e j11 = T.j(a0.r(aVar3, f11), f23, DP_6, 0.0f, 0.0f, 12);
                c3969l2.o(2015973328);
                boolean s11 = c3969l2.s(layerFloor1);
                Object C14 = c3969l2.C();
                if (s11 || C14 == InterfaceC3967k.a.a()) {
                    C14 = new ProductsComposableKt$ProductImage$2$2$1(layerFloor1);
                    c3969l2.x(C14);
                }
                c3969l2.k();
                e d16 = androidx.compose.ui.draw.c.d(j11, (Function1) C14);
                Y b12 = X.b(C5179b.n(f23), InterfaceC6250b.a.i(), c3969l2, 54);
                int I15 = c3969l2.I();
                A0 d17 = c3969l2.d();
                e f27 = c.f(c3969l2, d16);
                Function0 a21 = InterfaceC2801g.a.a();
                c3969l2.i();
                if (c3969l2.t()) {
                    c3969l2.H(a21);
                } else {
                    c3969l2.e();
                }
                Function2 h11 = Cm.e.h(c3969l2, b12, c3969l2, d17);
                if (c3969l2.t() || !Intrinsics.d(c3969l2.C(), Integer.valueOf(I15))) {
                    a.d(I15, c3969l2, I15, h11);
                }
                F1.b(c3969l2, f27, InterfaceC2801g.a.f());
                DsPriceAtomKt.DsPriceAtom(eVar, productImageVO.getPrice(), c3969l2, PriceDTO.$stable << 3, 1);
                c3969l2.o(-511965368);
                if (productImageVO.getPriceBadge() != null) {
                    function12 = function1;
                    C3969l c3969l5 = c3969l2;
                    DsBadgeAtomKt.DsBadgeAtom(productImageVO.getPriceBadge(), null, function12, c3969l5, (i14 << 3) & 896, 2);
                    c3969l3 = c3969l5;
                } else {
                    function12 = function1;
                    c3969l3 = c3969l2;
                }
                c3969l3.k();
                c3969l3.f();
            } else {
                function12 = function1;
                c3969l3 = c3969l2;
            }
            c3969l3.k();
            c3969l3.o(2016007809);
            if (productImageVO.getCaption() != null) {
                e j12 = T.j(a0.e(aVar3, 1.0f), 0.0f, f25, 0.0f, 0.0f, 13);
                V f28 = C5185h.f(InterfaceC6250b.a.o(), r11);
                int I16 = c3969l3.I();
                A0 d18 = c3969l3.d();
                e f29 = c.f(c3969l3, j12);
                Function0 a22 = InterfaceC2801g.a.a();
                c3969l3.i();
                if (c3969l3.t()) {
                    c3969l3.H(a22);
                } else {
                    c3969l3.e();
                }
                Function2 f31 = E.f(c3969l3, f28, c3969l3, d18);
                if (c3969l3.t() || !Intrinsics.d(c3969l3.C(), Integer.valueOf(I16))) {
                    a.d(I16, c3969l3, I16, f31);
                }
                F1.b(c3969l3, f29, InterfaceC2801g.a.f());
                DsTextAtomKt.DsTextAtom(productImageVO.getCaption(), T.h(aVar3, f23, 0.0f, i13), c3969l3, 48, r11);
                c3969l3.f();
            }
            c3969l3.k();
            c3969l3.f();
        }
        J0 m02 = c3969l3.m0();
        if (m02 != null) {
            m02.G(new ProductsComposableKt$ProductImage$3(productImageVO, function12, i11));
        }
    }

    public static final void ProductsComposable(@NotNull ProductsVO item, @NotNull AdultListDelegate<ProductImageVO> adultListDelegate, @NotNull Function1<? super AtomAction, Unit> actionHandler, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(adultListDelegate, "adultListDelegate");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        C3969l u11 = interfaceC3967k.u(-808445501);
        if ((i11 & 6) == 0) {
            i12 = (u11.F(item) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.F(adultListDelegate) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.F(actionHandler) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        int i13 = i12;
        if ((i13 & 147) == 146 && u11.b()) {
            u11.j();
        } else {
            InterfaceC3978p0 a11 = n1.a(n.a(adultListDelegate.observeItems()), item.getProducts(), null, u11, 0, 2);
            Object[] objArr = new Object[0];
            C5517t c5517t = I.f101467x;
            u11.o(32468598);
            Object C11 = u11.C();
            if (C11 == InterfaceC3967k.a.a()) {
                C11 = ProductsComposableKt$ProductsComposable$listState$1$1.INSTANCE;
                u11.x(C11);
            }
            u11.k();
            I i14 = (I) C5503f.c(objArr, c5517t, (Function0) C11, u11, 3072, 4);
            float f7 = DP_10;
            float f11 = DP_8;
            C9915y b11 = T.b(f11, f7, f11, 0.0f, 8);
            int i15 = C5179b.f39454h;
            C5179b.i n11 = C5179b.n(item.getSpaceBetween());
            e.a aVar = e.f40358c0;
            u11.o(32477966);
            int i16 = i13 & 896;
            boolean F11 = u11.F(item) | (i16 == 256);
            Object C12 = u11.C();
            if (F11 || C12 == InterfaceC3967k.a.a()) {
                C12 = new ProductsComposableKt$ProductsComposable$1$1(item, actionHandler);
                u11.x(C12);
            }
            u11.k();
            e silentClickable = silentClickable(aVar, (Function0) C12, u11, 6);
            u11.o(32481042);
            boolean n12 = u11.n(a11) | (i16 == 256);
            Object C13 = u11.C();
            if (n12 || C13 == InterfaceC3967k.a.a()) {
                C13 = new ProductsComposableKt$ProductsComposable$2$1(a11, actionHandler);
                u11.x(C13);
            }
            u11.k();
            C10164d.b(silentClickable, i14, b11, n11, null, null, false, (Function1) C13, u11, 0, 232);
            u11 = u11;
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new ProductsComposableKt$ProductsComposable$3(item, adultListDelegate, actionHandler, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<ProductImageVO> ProductsComposable$lambda$0(A1<? extends List<ProductImageVO>> a12) {
        return a12.getValue();
    }

    private static final e silentClickable(e eVar, Function0<Unit> function0, InterfaceC3967k interfaceC3967k, int i11) {
        interfaceC3967k.o(-60695648);
        interfaceC3967k.o(-64520978);
        Object C11 = interfaceC3967k.C();
        if (C11 == InterfaceC3967k.a.a()) {
            C11 = p.a();
            interfaceC3967k.x(C11);
        }
        q qVar = (q) C11;
        interfaceC3967k.k();
        interfaceC3967k.o(-64519628);
        boolean z11 = (((i11 & 112) ^ 48) > 32 && interfaceC3967k.n(function0)) || (i11 & 48) == 32;
        Object C12 = interfaceC3967k.C();
        if (z11 || C12 == InterfaceC3967k.a.a()) {
            C12 = new ProductsComposableKt$silentClickable$2$1(function0);
            interfaceC3967k.x(C12);
        }
        interfaceC3967k.k();
        e b11 = i.b(eVar, qVar, null, false, null, null, (Function0) C12, 28);
        interfaceC3967k.k();
        return b11;
    }

    private static final float toFloat(ProductMediaDTO.Ratio ratio) {
        int i11 = WhenMappings.$EnumSwitchMapping$0[ratio.ordinal()];
        if (i11 == 1) {
            return 1.0f;
        }
        if (i11 == 2) {
            return 0.75f;
        }
        if (i11 == 3) {
            return 1.3333334f;
        }
        throw new o();
    }
}

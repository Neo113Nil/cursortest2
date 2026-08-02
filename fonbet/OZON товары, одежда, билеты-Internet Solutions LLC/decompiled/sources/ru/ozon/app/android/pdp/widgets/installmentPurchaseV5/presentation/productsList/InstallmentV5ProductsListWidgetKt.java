package ru.ozon.app.android.pdp.widgets.installmentPurchaseV5.presentation.productsList;

import A0.h;
import D1.InterfaceC2801g;
import E0.C2942q;
import Ep.a;
import Fr.g;
import I1.o;
import K00.b;
import S0.A0;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.J0;
import WZ.t;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5193p;
import androidx.compose.foundation.layout.C5194q;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.M;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.X;
import androidx.compose.foundation.layout.Y;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.Q1;
import androidx.lifecycle.AbstractC5434v;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import e3.i;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l1.C7807Z;
import l1.C7809a0;
import l1.y0;
import n0.C8366G;
import org.jetbrains.annotations.NotNull;
import q1.AbstractC8972b;
import ru.ozon.app.android.pdp.widgets.installmentPurchaseV5.presentation.InstallmentPurchaseV5VO;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.data.ReviewGalleryV2DTO;
import ru.ozon.uni.android.ds.compose.component.button.DsButtonAtomKt;
import ru.ozon.uni.android.ds.compose.component.text.DsTextAtomKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.common.CommonAtomIconDTO;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.core.compose.tokens.TokenParserKt;
import ru.ozon.uni.core.repository.UniTheme;
import u0.C9891D;
import u0.EnumC9909s;
import u0.InterfaceC9890C;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aA\u0010\b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\b\u0010\t\u001aA\u0010\n\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002H\u0003¢\u0006\u0004\b\n\u0010\t\u001aE\u0010\u000e\u001a\u00020\u0004*\u00020\u000b2\u0006\u0010\r\u001a\u00020\f2\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002H\u0003¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0017\u0010\u0010\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0003¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/pdp/widgets/installmentPurchaseV5/presentation/InstallmentPurchaseV5VO$CreditProductsList;", "state", "Lkotlin/Function1;", "LWZ/t;", "", "onView", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "InstallmentV5ProductsListWidget", "(Lru/ozon/app/android/pdp/widgets/installmentPurchaseV5/presentation/InstallmentPurchaseV5VO$CreditProductsList;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;LS0/k;II)V", "InstallmentV5ProductsListContent", "Lu0/C;", "Lru/ozon/app/android/pdp/widgets/installmentPurchaseV5/presentation/InstallmentPurchaseV5VO$CreditProductsList$CreditProduct;", ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO.PRODUCT_FIELD_NAME, "InstallmentProduct", "(Lu0/C;Lru/ozon/app/android/pdp/widgets/installmentPurchaseV5/presentation/InstallmentPurchaseV5VO$CreditProductsList$CreditProduct;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;LS0/k;II)V", "ProductTitle", "(Lru/ozon/app/android/pdp/widgets/installmentPurchaseV5/presentation/InstallmentPurchaseV5VO$CreditProductsList$CreditProduct;LS0/k;I)V", "pdp_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class InstallmentV5ProductsListWidgetKt {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void InstallmentProduct(InterfaceC9890C interfaceC9890C, InstallmentPurchaseV5VO.CreditProductsList.CreditProduct creditProduct, Function1<? super t, Unit> function1, Function1<? super AtomAction, Unit> function12, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        Function1<? super t, Unit> function13;
        String str;
        t tokenizedEvent;
        boolean z11;
        Object C11;
        InstallmentPurchaseV5VO.CommonVO common;
        int I11;
        TextDTO subtitle;
        int i14;
        float m1867getDpD9Ej5fM;
        e.a aVar;
        C3969l c3969l;
        TestInfo testInfo;
        J0 m02;
        C3969l u11 = interfaceC3967k.u(310050303);
        if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.n(interfaceC9890C) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i12 & 1) != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= u11.n(creditProduct) ? 32 : 16;
        }
        int i15 = i12 & 2;
        if (i15 != 0) {
            i13 |= 384;
        } else if ((i11 & 384) == 0) {
            function13 = function1;
            i13 |= u11.F(function13) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
            if ((i12 & 4) == 0) {
                i13 |= 3072;
            } else if ((i11 & 3072) == 0) {
                i13 |= u11.F(function12) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
            }
            if ((i13 & 1171) == 1170 || !u11.b()) {
                if (i15 != 0) {
                    u11.o(54337051);
                    Object C12 = u11.C();
                    if (C12 == InterfaceC3967k.a.a()) {
                        C12 = InstallmentV5ProductsListWidgetKt$InstallmentProduct$1$1.INSTANCE;
                        u11.x(C12);
                    }
                    u11.k();
                    function13 = (Function1) C12;
                }
                InstallmentPurchaseV5VO.CommonVO common2 = creditProduct.getCommon();
                str = null;
                tokenizedEvent = common2 == null ? common2.getTokenizedEvent() : null;
                u11.o(54339871);
                if (tokenizedEvent != null) {
                    AbstractC5434v.a aVar2 = AbstractC5434v.a.ON_RESUME;
                    u11.o(-1465465574);
                    boolean F11 = ((i13 & 896) == 256) | u11.F(tokenizedEvent);
                    Object C13 = u11.C();
                    if (F11 || C13 == InterfaceC3967k.a.a()) {
                        C13 = new InstallmentV5ProductsListWidgetKt$InstallmentProduct$2$1$1(function13, tokenizedEvent);
                        u11.x(C13);
                    }
                    u11.k();
                    i.a(aVar2, null, (Function0) C13, u11, 6);
                    Unit unit = Unit.f71690a;
                }
                u11.k();
                C7807Z c7807z = TokenParserKt.tokenToColor(creditProduct.getBackground(), u11, 0);
                u11.o(54344217);
                long layerFloor1 = c7807z != null ? UniTheme.INSTANCE.getColors(u11, UniTheme.$stable).getLayerFloor1() : c7807z.w();
                u11.k();
                C5179b.g d11 = C5179b.d();
                e.a aVar3 = e.f40358c0;
                e a11 = interfaceC9890C.a(androidx.compose.foundation.e.b(aVar3, layerFloor1, h.b(CornerRadius.RADIUS_550.m1866getDpD9Ej5fM())), 1.0f, true);
                u11.o(54354347);
                int i16 = i13 & 7168;
                z11 = (i16 != 2048) | ((i13 & 112) != 32);
                C11 = u11.C();
                if (!z11 || C11 == InterfaceC3967k.a.a()) {
                    C11 = new InstallmentV5ProductsListWidgetKt$InstallmentProduct$3$1(creditProduct, function12);
                    u11.x(C11);
                }
                u11.k();
                e b11 = androidx.compose.foundation.i.b(a11, null, null, false, null, null, (Function0) C11, 28);
                InstallmentV5ProductsListDefaults installmentV5ProductsListDefaults = InstallmentV5ProductsListDefaults.INSTANCE;
                e c11 = a0.c(T.j(b11, installmentV5ProductsListDefaults.m880getDEFAULT_PRODUCT_PADDINGD9Ej5fM(), 0.0f, 0.0f, installmentV5ProductsListDefaults.m880getDEFAULT_PRODUCT_PADDINGD9Ej5fM(), 6));
                common = creditProduct.getCommon();
                if (common != null && (testInfo = common.getTestInfo()) != null) {
                    str = testInfo.getAutomatizationId();
                }
                if (str == null) {
                    str = "";
                }
                e a12 = Q1.a(c11, str);
                C5194q a13 = C5193p.a(d11, InterfaceC6250b.a.k(), u11, 6);
                I11 = u11.I();
                A0 d12 = u11.d();
                e f7 = c.f(u11, a12);
                Function0 a14 = g.a(InterfaceC2801g.f5440U, u11);
                if (u11.t()) {
                    u11.e();
                } else {
                    u11.H(a14);
                }
                Function2 g10 = b.g(u11, a13, u11, d12);
                if (!u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                    a.d(I11, u11, I11, g10);
                }
                F1.b(u11, f7, InterfaceC2801g.a.f());
                ProductTitle(creditProduct, u11, (i13 >> 3) & 14);
                subtitle = creditProduct.getSubtitle();
                u11.o(-1465441935);
                if (subtitle != null) {
                    aVar = aVar3;
                } else {
                    if (creditProduct.getIcon() != null) {
                        i14 = 0;
                        m1867getDpD9Ej5fM = 0;
                    } else {
                        i14 = 0;
                        m1867getDpD9Ej5fM = Paddings.PADDING_100.m1867getDpD9Ej5fM();
                    }
                    aVar = aVar3;
                    DsTextAtomKt.DsTextAtom(subtitle, T.j(aVar3, 0.0f, m1867getDpD9Ej5fM, installmentV5ProductsListDefaults.m880getDEFAULT_PRODUCT_PADDINGD9Ej5fM(), 0.0f, 9), u11, i14, i14);
                }
                u11.k();
                c3969l = u11;
                DsButtonAtomKt.DsButtonAtom(creditProduct.getButton(), T.j(a0.e(aVar, 1.0f), 0.0f, Paddings.PADDING_500.m1867getDpD9Ej5fM(), installmentV5ProductsListDefaults.m880getDEFAULT_PRODUCT_PADDINGD9Ej5fM(), 0.0f, 9), false, function12, c3969l, i16, 4);
                c3969l.f();
            } else {
                u11.j();
                c3969l = u11;
            }
            Function1<? super t, Unit> function14 = function13;
            m02 = c3969l.m0();
            if (m02 == null) {
                m02.G(new InstallmentV5ProductsListWidgetKt$InstallmentProduct$5(interfaceC9890C, creditProduct, function14, function12, i11, i12));
                return;
            }
            return;
        }
        function13 = function1;
        if ((i12 & 4) == 0) {
        }
        if ((i13 & 1171) == 1170) {
        }
        if (i15 != 0) {
        }
        InstallmentPurchaseV5VO.CommonVO common22 = creditProduct.getCommon();
        str = null;
        if (common22 == null) {
        }
        u11.o(54339871);
        if (tokenizedEvent != null) {
        }
        u11.k();
        C7807Z c7807z2 = TokenParserKt.tokenToColor(creditProduct.getBackground(), u11, 0);
        u11.o(54344217);
        long layerFloor12 = c7807z2 != null ? UniTheme.INSTANCE.getColors(u11, UniTheme.$stable).getLayerFloor1() : c7807z2.w();
        u11.k();
        C5179b.g d112 = C5179b.d();
        e.a aVar32 = e.f40358c0;
        e a112 = interfaceC9890C.a(androidx.compose.foundation.e.b(aVar32, layerFloor12, h.b(CornerRadius.RADIUS_550.m1866getDpD9Ej5fM())), 1.0f, true);
        u11.o(54354347);
        if ((i13 & 112) != 32) {
        }
        int i162 = i13 & 7168;
        z11 = (i162 != 2048) | ((i13 & 112) != 32);
        C11 = u11.C();
        if (!z11) {
        }
        C11 = new InstallmentV5ProductsListWidgetKt$InstallmentProduct$3$1(creditProduct, function12);
        u11.x(C11);
        u11.k();
        e b112 = androidx.compose.foundation.i.b(a112, null, null, false, null, null, (Function0) C11, 28);
        InstallmentV5ProductsListDefaults installmentV5ProductsListDefaults2 = InstallmentV5ProductsListDefaults.INSTANCE;
        e c112 = a0.c(T.j(b112, installmentV5ProductsListDefaults2.m880getDEFAULT_PRODUCT_PADDINGD9Ej5fM(), 0.0f, 0.0f, installmentV5ProductsListDefaults2.m880getDEFAULT_PRODUCT_PADDINGD9Ej5fM(), 6));
        common = creditProduct.getCommon();
        if (common != null) {
            str = testInfo.getAutomatizationId();
        }
        if (str == null) {
        }
        e a122 = Q1.a(c112, str);
        C5194q a132 = C5193p.a(d112, InterfaceC6250b.a.k(), u11, 6);
        I11 = u11.I();
        A0 d122 = u11.d();
        e f72 = c.f(u11, a122);
        Function0 a142 = g.a(InterfaceC2801g.f5440U, u11);
        if (u11.t()) {
        }
        Function2 g102 = b.g(u11, a132, u11, d122);
        if (!u11.t()) {
        }
        a.d(I11, u11, I11, g102);
        F1.b(u11, f72, InterfaceC2801g.a.f());
        ProductTitle(creditProduct, u11, (i13 >> 3) & 14);
        subtitle = creditProduct.getSubtitle();
        u11.o(-1465441935);
        if (subtitle != null) {
        }
        u11.k();
        c3969l = u11;
        DsButtonAtomKt.DsButtonAtom(creditProduct.getButton(), T.j(a0.e(aVar, 1.0f), 0.0f, Paddings.PADDING_500.m1867getDpD9Ej5fM(), installmentV5ProductsListDefaults2.m880getDEFAULT_PRODUCT_PADDINGD9Ej5fM(), 0.0f, 9), false, function12, c3969l, i162, 4);
        c3969l.f();
        Function1<? super t, Unit> function142 = function13;
        m02 = c3969l.m0();
        if (m02 == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void InstallmentV5ProductsListContent(InstallmentPurchaseV5VO.CreditProductsList creditProductsList, Function1<? super t, Unit> function1, Function1<? super AtomAction, Unit> function12, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        e b11;
        Function1<? super t, Unit> function13;
        TestInfo testInfo;
        C3969l u11 = interfaceC3967k.u(1336173939);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.n(creditProductsList) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i14 = i12 & 2;
        if (i14 != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= u11.F(function1) ? 32 : 16;
        }
        if ((i12 & 4) != 0) {
            i13 |= 384;
        } else if ((i11 & 384) == 0) {
            i13 |= u11.F(function12) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i13 & 147) == 146 && u11.b()) {
            u11.j();
            function13 = function1;
        } else {
            if (i14 != 0) {
                u11.o(-338629244);
                Object C11 = u11.C();
                if (C11 == InterfaceC3967k.a.a()) {
                    C11 = InstallmentV5ProductsListWidgetKt$InstallmentV5ProductsListContent$1$1.INSTANCE;
                    u11.x(C11);
                }
                function1 = (Function1) C11;
                u11.k();
            }
            Function1<? super t, Unit> function14 = function1;
            C7807Z c7807z = TokenParserKt.tokenToColor(creditProductsList.getBackground(), u11, 0);
            u11.o(-338626752);
            long layerFloor1 = c7807z == null ? UniTheme.INSTANCE.getColors(u11, UniTheme.$stable).getLayerFloor1() : c7807z.w();
            u11.k();
            b11 = androidx.compose.foundation.e.b(M.a(a0.e(e.f40358c0, 1.0f), EnumC9909s.Max), layerFloor1, y0.a());
            e i15 = T.i(b11, creditProductsList.getHorizontalPaddings().m1867getDpD9Ej5fM(), creditProductsList.getTopPadding().m1867getDpD9Ej5fM(), creditProductsList.getHorizontalPaddings().m1867getDpD9Ej5fM(), creditProductsList.getBottomPadding().m1867getDpD9Ej5fM());
            u11.o(-338611935);
            Object C12 = u11.C();
            if (C12 == InterfaceC3967k.a.a()) {
                C12 = InstallmentV5ProductsListWidgetKt$InstallmentV5ProductsListContent$2$1.INSTANCE;
                u11.x(C12);
            }
            u11.k();
            e c11 = o.c(i15, false, (Function1) C12);
            InstallmentPurchaseV5VO.CommonVO common = creditProductsList.getCommon();
            String automatizationId = (common == null || (testInfo = common.getTestInfo()) == null) ? null : testInfo.getAutomatizationId();
            if (automatizationId == null) {
                automatizationId = "";
            }
            e a11 = Q1.a(c11, automatizationId);
            Y b12 = X.b(C5179b.n(6), InterfaceC6250b.a.i(), u11, 54);
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f7 = c.f(u11, a11);
            Function0 a12 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a12);
            } else {
                u11.e();
            }
            Function2 h11 = Cm.e.h(u11, b12, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                a.d(I11, u11, I11, h11);
            }
            F1.b(u11, f7, InterfaceC2801g.a.f());
            C9891D c9891d = C9891D.f99599a;
            u11.o(1827520788);
            List<InstallmentPurchaseV5VO.CreditProductsList.CreditProduct> creditProducts = creditProductsList.getCreditProducts();
            int size = creditProducts.size();
            for (int i16 = 0; i16 < size; i16++) {
                int i17 = i13 << 3;
                InstallmentProduct(c9891d, creditProducts.get(i16), function14, function12, u11, (i17 & 896) | 6 | (i17 & 7168), 0);
            }
            u11.k();
            u11.f();
            function13 = function14;
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new InstallmentV5ProductsListWidgetKt$InstallmentV5ProductsListContent$4(creditProductsList, function13, function12, i11, i12));
        }
    }

    public static final void InstallmentV5ProductsListWidget(@NotNull InstallmentPurchaseV5VO.CreditProductsList state, Function1<? super t, Unit> function1, @NotNull Function1<? super AtomAction, Unit> actionHandler, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        InstallmentPurchaseV5VO.CreditProductsList creditProductsList;
        Function1<? super AtomAction, Unit> function12;
        Function1<? super t, Unit> function13;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        C3969l u11 = interfaceC3967k.u(2004455254);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.n(state) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i14 = 2 & i12;
        if (i14 != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= u11.F(function1) ? 32 : 16;
        }
        if ((4 & i12) != 0) {
            i13 |= 384;
        } else if ((i11 & 384) == 0) {
            i13 |= u11.F(actionHandler) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i13 & 147) == 146 && u11.b()) {
            u11.j();
            function12 = actionHandler;
            function13 = function1;
            creditProductsList = state;
        } else {
            if (i14 != 0) {
                u11.o(958388253);
                Object C11 = u11.C();
                if (C11 == InterfaceC3967k.a.a()) {
                    C11 = InstallmentV5ProductsListWidgetKt$InstallmentV5ProductsListWidget$1$1.INSTANCE;
                    u11.x(C11);
                }
                function1 = (Function1) C11;
                u11.k();
            }
            Function1<? super t, Unit> function14 = function1;
            InstallmentPurchaseV5VO.CommonVO common = state.getCommon();
            t tokenizedEvent = common != null ? common.getTokenizedEvent() : null;
            u11.o(958391041);
            if (tokenizedEvent != null) {
                AbstractC5434v.a aVar = AbstractC5434v.a.ON_RESUME;
                u11.o(1590320124);
                boolean F11 = ((i13 & 112) == 32) | u11.F(tokenizedEvent);
                Object C12 = u11.C();
                if (F11 || C12 == InterfaceC3967k.a.a()) {
                    C12 = new InstallmentV5ProductsListWidgetKt$InstallmentV5ProductsListWidget$2$1$1(function14, tokenizedEvent);
                    u11.x(C12);
                }
                u11.k();
                i.a(aVar, null, (Function0) C12, u11, 6);
                Unit unit = Unit.f71690a;
            }
            u11.k();
            InstallmentV5ProductsListContent(state, function14, actionHandler, u11, i13 & 1022, 0);
            creditProductsList = state;
            function12 = actionHandler;
            function13 = function14;
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new InstallmentV5ProductsListWidgetKt$InstallmentV5ProductsListWidget$3(creditProductsList, function13, function12, i11, i12));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ProductTitle(InstallmentPurchaseV5VO.CreditProductsList.CreditProduct creditProduct, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        C3969l u11 = interfaceC3967k.u(-1380951906);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(creditProduct) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i12 & 3) == 2 && u11.b()) {
            u11.j();
        } else {
            CommonAtomIconDTO icon = creditProduct.getIcon();
            u11.o(-1280779518);
            Unit unit = null;
            if (icon != null) {
                e.a aVar = e.f40358c0;
                Paddings paddings = Paddings.PADDING_350;
                e j11 = T.j(aVar, 0.0f, paddings.m1867getDpD9Ej5fM(), paddings.m1867getDpD9Ej5fM(), 0.0f, 9);
                Y b11 = X.b(C5179b.d(), InterfaceC6250b.a.i(), u11, 54);
                int I11 = u11.I();
                A0 d11 = u11.d();
                e f7 = c.f(u11, j11);
                Function0 a11 = g.a(InterfaceC2801g.f5440U, u11);
                if (u11.t()) {
                    u11.H(a11);
                } else {
                    u11.e();
                }
                Function2 h11 = Cm.e.h(u11, b11, u11, d11);
                if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                    a.d(I11, u11, I11, h11);
                }
                F1.b(u11, f7, InterfaceC2801g.a.f());
                TextDTO title = creditProduct.getTitle();
                if (1.0f <= 0.0d) {
                    throw new IllegalArgumentException(C2942q.b(1.0f, "invalid weight ", "; must be greater than zero").toString());
                }
                DsTextAtomKt.DsTextAtom(title, new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), u11, 0, 0);
                AbstractC8972b abstractC8972b = TokenParserKt.tokenToIcon(icon.getIcon(), u11, 0);
                u11.o(-1026981849);
                if (abstractC8972b != null) {
                    C7807Z c7807z = TokenParserKt.tokenToColor(icon.getTintColor(), u11, 0);
                    C8366G.a(abstractC8972b, null, a0.n(T.j(aVar, Paddings.PADDING_100.m1867getDpD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14), 24), null, null, 0.0f, c7807z != null ? C7809a0.a.a(5, c7807z.w()) : null, u11, 48, 56);
                }
                u11.k();
                u11.f();
                unit = Unit.f71690a;
            }
            u11.k();
            if (unit == null) {
                TextDTO title2 = creditProduct.getTitle();
                e.a aVar2 = e.f40358c0;
                InstallmentV5ProductsListDefaults installmentV5ProductsListDefaults = InstallmentV5ProductsListDefaults.INSTANCE;
                DsTextAtomKt.DsTextAtom(title2, T.j(aVar2, 0.0f, installmentV5ProductsListDefaults.m880getDEFAULT_PRODUCT_PADDINGD9Ej5fM(), installmentV5ProductsListDefaults.m880getDEFAULT_PRODUCT_PADDINGD9Ej5fM(), 0.0f, 9), u11, 48, 0);
            }
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new InstallmentV5ProductsListWidgetKt$ProductTitle$2(creditProduct, i11));
        }
    }
}

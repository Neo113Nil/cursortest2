package ru.ozon.app.android.pdp.widgets.installmentPurchaseV5.presentation.singleProduct;

import A0.h;
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
import WZ.t;
import a00.C4911f;
import android.annotation.SuppressLint;
import android.content.res.Configuration;
import androidx.compose.foundation.i;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5193p;
import androidx.compose.foundation.layout.C5194q;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.Q1;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.AbstractC5434v;
import b00.f;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import i1.C6988h;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l1.AbstractC7799Q;
import l1.C7807Z;
import l1.C7811b0;
import l1.y0;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.BaseOnBoardingViewModel;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.OnBoardingCutConfig;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.ShowOnboardingComposableKt;
import ru.ozon.app.android.pdp.utils.CollectionsExtKt;
import ru.ozon.app.android.pdp.utils.ComposeExtKt;
import ru.ozon.app.android.pdp.widgets.installmentPurchaseV5.presentation.InstallmentPurchaseV5VO;
import ru.ozon.uni.android.ds.compose.component.text.DsTextAtomKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.core.compose.tokens.TokenParserKt;
import ru.ozon.uni.core.repository.UniTheme;
import u0.C9915y;
import v0.C10164d;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u001aQ\u0010\f\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0001¢\u0006\u0004\b\f\u0010\r\u001a=\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u00042\b\b\u0003\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u0010\u0010\u0011\u001aE\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0004H\u0003¢\u0006\u0004\b\u0017\u0010\u0018\u001aE\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0004H\u0003¢\u0006\u0004\b\u001b\u0010\u0018\u001a=\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0004H\u0003¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/pdp/widgets/installmentPurchaseV5/presentation/InstallmentPurchaseV5VO$SingleProduct;", "state", "", "isSelect", "Lkotlin/Function1;", "LWZ/t;", "", "onView", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/BaseOnBoardingViewModel$Default;", "onboardingViewModel", "InstallmentV5SingleProductWidget", "(Lru/ozon/app/android/pdp/widgets/installmentPurchaseV5/presentation/InstallmentPurchaseV5VO$SingleProduct;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/BaseOnBoardingViewModel$Default;LS0/k;II)V", "Landroidx/compose/ui/e;", "onboardingPositonModifier", "InstallmentV5SingleProductContent", "(Lru/ozon/app/android/pdp/widgets/installmentPurchaseV5/presentation/InstallmentPurchaseV5VO$SingleProduct;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/e;ZLS0/k;II)V", "Lru/ozon/app/android/pdp/widgets/installmentPurchaseV5/presentation/InstallmentPurchaseV5VO$SingleProduct$SingleProductContent;", "content", "Ll1/Z;", "topBlockBackingBackground", "modifier", "InstallmentWithBottomBlock-8V94_ZQ", "(Lru/ozon/app/android/pdp/widgets/installmentPurchaseV5/presentation/InstallmentPurchaseV5VO$SingleProduct$SingleProductContent;JLandroidx/compose/ui/e;ZLkotlin/jvm/functions/Function1;LS0/k;II)V", "InstallmentWithBottomBlock", "backingBackground", "InstallmentTopBlock-8V94_ZQ", "InstallmentTopBlock", "InstallmentMainContentWithBadges", "(Lru/ozon/app/android/pdp/widgets/installmentPurchaseV5/presentation/InstallmentPurchaseV5VO$SingleProduct$SingleProductContent;Landroidx/compose/ui/e;ZLkotlin/jvm/functions/Function1;LS0/k;II)V", "pdp_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class InstallmentV5SingleProductWidgetKt {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void InstallmentMainContentWithBadges(InstallmentPurchaseV5VO.SingleProduct.SingleProductContent singleProductContent, e eVar, boolean z11, Function1<? super AtomAction, Unit> function1, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        e eVar2;
        int i14;
        int I11;
        boolean n11;
        Object C11;
        boolean q11;
        Object C12;
        boolean n12;
        Object C13;
        boolean n13;
        Object C14;
        boolean z12;
        Object C15;
        J0 m02;
        C3969l u11 = interfaceC3967k.u(676859844);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.n(singleProductContent) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i15 = i12 & 2;
        if (i15 != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            eVar2 = eVar;
            i13 |= u11.n(eVar2) ? 32 : 16;
            if ((i12 & 4) == 0) {
                i13 |= 384;
            } else if ((i11 & 384) == 0) {
                i13 |= u11.p(z11) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
                if ((i12 & 8) != 0) {
                    i13 |= 3072;
                } else if ((i11 & 3072) == 0) {
                    i13 |= u11.F(function1) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
                }
                i14 = i13;
                if ((i14 & 1171) == 1170 || !u11.b()) {
                    e eVar3 = i15 != 0 ? e.f40358c0 : eVar2;
                    Configuration configuration = (Configuration) u11.m(AndroidCompositionLocals_androidKt.c());
                    C5194q a11 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), u11, 0);
                    I11 = u11.I();
                    A0 d11 = u11.d();
                    e f7 = c.f(u11, eVar3);
                    Function0 a12 = g.a(InterfaceC2801g.f5440U, u11);
                    if (u11.t()) {
                        u11.H(a12);
                    } else {
                        u11.e();
                    }
                    Function2 g10 = b.g(u11, a11, u11, d11);
                    if (!u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                        a.d(I11, u11, I11, g10);
                    }
                    F1.b(u11, f7, InterfaceC2801g.a.f());
                    u11.o(429834683);
                    n11 = u11.n(configuration);
                    C11 = u11.C();
                    if (!n11 || C11 == InterfaceC3967k.a.a()) {
                        C11 = Float.valueOf(8.0f / configuration.screenWidthDp);
                        u11.x(C11);
                    }
                    float floatValue = ((Number) C11).floatValue();
                    u11.k();
                    u11.o(429838239);
                    q11 = u11.q(floatValue);
                    C12 = u11.C();
                    if (!q11 || C12 == InterfaceC3967k.a.a()) {
                        C12 = new Pair[]{new Pair(Float.valueOf(0.0f), C7807Z.m(C7811b0.b(1291845632))), new Pair(Float.valueOf(floatValue), C7807Z.m(C7811b0.c(4278190080L))), new Pair(Float.valueOf(1.0f - floatValue), C7807Z.m(C7811b0.c(4278190080L))), new Pair(Float.valueOf(1.0f), C7807Z.m(C7811b0.b(1291845632)))};
                        u11.x(C12);
                    }
                    Pair[] pairArr = (Pair[]) C12;
                    u11.k();
                    u11.o(429847754);
                    n12 = u11.n(pairArr);
                    C13 = u11.C();
                    if (!n12 || C13 == InterfaceC3967k.a.a()) {
                        C13 = AbstractC7799Q.a.b(AbstractC7799Q.Companion, (Pair[]) Arrays.copyOf(pairArr, pairArr.length));
                        u11.x(C13);
                    }
                    AbstractC7799Q abstractC7799Q = (AbstractC7799Q) C13;
                    u11.k();
                    int i16 = i14 & 14;
                    InstallmentV5MainContentKt.InstallmentV5MainContent(singleProductContent, null, z11, u11, i14 & 910, 2);
                    C5179b.i n14 = C5179b.n(4);
                    C9915y a13 = T.a(8, 2, 0.0f);
                    e b11 = androidx.compose.ui.graphics.a.b(T.j(e.f40358c0, 0.0f, 0.0f, 0.0f, Paddings.PADDING_300.m1867getDpD9Ej5fM(), 7), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, false, 65535);
                    u11.o(429863545);
                    n13 = u11.n(abstractC7799Q);
                    C14 = u11.C();
                    if (!n13 || C14 == InterfaceC3967k.a.a()) {
                        C14 = new InstallmentV5SingleProductWidgetKt$InstallmentMainContentWithBadges$1$1$1(abstractC7799Q);
                        u11.x(C14);
                    }
                    u11.k();
                    e d12 = androidx.compose.ui.draw.c.d(b11, (Function1) C14);
                    u11.o(429870431);
                    z12 = (i16 == 4) | ((i14 & 7168) == 2048);
                    C15 = u11.C();
                    if (!z12 || C15 == InterfaceC3967k.a.a()) {
                        C15 = new InstallmentV5SingleProductWidgetKt$InstallmentMainContentWithBadges$1$2$1(singleProductContent, function1);
                        u11.x(C15);
                    }
                    u11.k();
                    eVar2 = eVar3;
                    C10164d.b(d12, null, a13, n14, null, null, false, (Function1) C15, u11, 24960, 234);
                    u11.f();
                } else {
                    u11.j();
                }
                e eVar4 = eVar2;
                m02 = u11.m0();
                if (m02 != null) {
                    m02.G(new InstallmentV5SingleProductWidgetKt$InstallmentMainContentWithBadges$2(singleProductContent, eVar4, z11, function1, i11, i12));
                    return;
                }
                return;
            }
            if ((i12 & 8) != 0) {
            }
            i14 = i13;
            if ((i14 & 1171) == 1170) {
            }
            if (i15 != 0) {
            }
            Configuration configuration2 = (Configuration) u11.m(AndroidCompositionLocals_androidKt.c());
            C5194q a112 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), u11, 0);
            I11 = u11.I();
            A0 d112 = u11.d();
            e f72 = c.f(u11, eVar3);
            Function0 a122 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
            }
            Function2 g102 = b.g(u11, a112, u11, d112);
            if (!u11.t()) {
            }
            a.d(I11, u11, I11, g102);
            F1.b(u11, f72, InterfaceC2801g.a.f());
            u11.o(429834683);
            n11 = u11.n(configuration2);
            C11 = u11.C();
            if (!n11) {
            }
            C11 = Float.valueOf(8.0f / configuration2.screenWidthDp);
            u11.x(C11);
            float floatValue2 = ((Number) C11).floatValue();
            u11.k();
            u11.o(429838239);
            q11 = u11.q(floatValue2);
            C12 = u11.C();
            if (!q11) {
            }
            C12 = new Pair[]{new Pair(Float.valueOf(0.0f), C7807Z.m(C7811b0.b(1291845632))), new Pair(Float.valueOf(floatValue2), C7807Z.m(C7811b0.c(4278190080L))), new Pair(Float.valueOf(1.0f - floatValue2), C7807Z.m(C7811b0.c(4278190080L))), new Pair(Float.valueOf(1.0f), C7807Z.m(C7811b0.b(1291845632)))};
            u11.x(C12);
            Pair[] pairArr2 = (Pair[]) C12;
            u11.k();
            u11.o(429847754);
            n12 = u11.n(pairArr2);
            C13 = u11.C();
            if (!n12) {
            }
            C13 = AbstractC7799Q.a.b(AbstractC7799Q.Companion, (Pair[]) Arrays.copyOf(pairArr2, pairArr2.length));
            u11.x(C13);
            AbstractC7799Q abstractC7799Q2 = (AbstractC7799Q) C13;
            u11.k();
            int i162 = i14 & 14;
            InstallmentV5MainContentKt.InstallmentV5MainContent(singleProductContent, null, z11, u11, i14 & 910, 2);
            C5179b.i n142 = C5179b.n(4);
            C9915y a132 = T.a(8, 2, 0.0f);
            e b112 = androidx.compose.ui.graphics.a.b(T.j(e.f40358c0, 0.0f, 0.0f, 0.0f, Paddings.PADDING_300.m1867getDpD9Ej5fM(), 7), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, false, 65535);
            u11.o(429863545);
            n13 = u11.n(abstractC7799Q2);
            C14 = u11.C();
            if (!n13) {
            }
            C14 = new InstallmentV5SingleProductWidgetKt$InstallmentMainContentWithBadges$1$1$1(abstractC7799Q2);
            u11.x(C14);
            u11.k();
            e d122 = androidx.compose.ui.draw.c.d(b112, (Function1) C14);
            u11.o(429870431);
            z12 = (i162 == 4) | ((i14 & 7168) == 2048);
            C15 = u11.C();
            if (!z12) {
            }
            C15 = new InstallmentV5SingleProductWidgetKt$InstallmentMainContentWithBadges$1$2$1(singleProductContent, function1);
            u11.x(C15);
            u11.k();
            eVar2 = eVar3;
            C10164d.b(d122, null, a132, n142, null, null, false, (Function1) C15, u11, 24960, 234);
            u11.f();
            e eVar42 = eVar2;
            m02 = u11.m0();
            if (m02 != null) {
            }
        }
        eVar2 = eVar;
        if ((i12 & 4) == 0) {
        }
        if ((i12 & 8) != 0) {
        }
        i14 = i13;
        if ((i14 & 1171) == 1170) {
        }
        if (i15 != 0) {
        }
        Configuration configuration22 = (Configuration) u11.m(AndroidCompositionLocals_androidKt.c());
        C5194q a1122 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), u11, 0);
        I11 = u11.I();
        A0 d1122 = u11.d();
        e f722 = c.f(u11, eVar3);
        Function0 a1222 = g.a(InterfaceC2801g.f5440U, u11);
        if (u11.t()) {
        }
        Function2 g1022 = b.g(u11, a1122, u11, d1122);
        if (!u11.t()) {
        }
        a.d(I11, u11, I11, g1022);
        F1.b(u11, f722, InterfaceC2801g.a.f());
        u11.o(429834683);
        n11 = u11.n(configuration22);
        C11 = u11.C();
        if (!n11) {
        }
        C11 = Float.valueOf(8.0f / configuration22.screenWidthDp);
        u11.x(C11);
        float floatValue22 = ((Number) C11).floatValue();
        u11.k();
        u11.o(429838239);
        q11 = u11.q(floatValue22);
        C12 = u11.C();
        if (!q11) {
        }
        C12 = new Pair[]{new Pair(Float.valueOf(0.0f), C7807Z.m(C7811b0.b(1291845632))), new Pair(Float.valueOf(floatValue22), C7807Z.m(C7811b0.c(4278190080L))), new Pair(Float.valueOf(1.0f - floatValue22), C7807Z.m(C7811b0.c(4278190080L))), new Pair(Float.valueOf(1.0f), C7807Z.m(C7811b0.b(1291845632)))};
        u11.x(C12);
        Pair[] pairArr22 = (Pair[]) C12;
        u11.k();
        u11.o(429847754);
        n12 = u11.n(pairArr22);
        C13 = u11.C();
        if (!n12) {
        }
        C13 = AbstractC7799Q.a.b(AbstractC7799Q.Companion, (Pair[]) Arrays.copyOf(pairArr22, pairArr22.length));
        u11.x(C13);
        AbstractC7799Q abstractC7799Q22 = (AbstractC7799Q) C13;
        u11.k();
        int i1622 = i14 & 14;
        InstallmentV5MainContentKt.InstallmentV5MainContent(singleProductContent, null, z11, u11, i14 & 910, 2);
        C5179b.i n1422 = C5179b.n(4);
        C9915y a1322 = T.a(8, 2, 0.0f);
        e b1122 = androidx.compose.ui.graphics.a.b(T.j(e.f40358c0, 0.0f, 0.0f, 0.0f, Paddings.PADDING_300.m1867getDpD9Ej5fM(), 7), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, false, 65535);
        u11.o(429863545);
        n13 = u11.n(abstractC7799Q22);
        C14 = u11.C();
        if (!n13) {
        }
        C14 = new InstallmentV5SingleProductWidgetKt$InstallmentMainContentWithBadges$1$1$1(abstractC7799Q22);
        u11.x(C14);
        u11.k();
        e d1222 = androidx.compose.ui.draw.c.d(b1122, (Function1) C14);
        u11.o(429870431);
        z12 = (i1622 == 4) | ((i14 & 7168) == 2048);
        C15 = u11.C();
        if (!z12) {
        }
        C15 = new InstallmentV5SingleProductWidgetKt$InstallmentMainContentWithBadges$1$2$1(singleProductContent, function1);
        u11.x(C15);
        u11.k();
        eVar2 = eVar3;
        C10164d.b(d1222, null, a1322, n1422, null, null, false, (Function1) C15, u11, 24960, 234);
        u11.f();
        e eVar422 = eVar2;
        m02 = u11.m0();
        if (m02 != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0063  */
    /* renamed from: InstallmentTopBlock-8V94_ZQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m884InstallmentTopBlock8V94_ZQ(InstallmentPurchaseV5VO.SingleProduct.SingleProductContent singleProductContent, long j11, e eVar, boolean z11, Function1<? super AtomAction, Unit> function1, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        InstallmentPurchaseV5VO.SingleProduct.SingleProductContent singleProductContent2;
        int i13;
        e eVar2;
        e b11;
        int i14;
        e eVar3;
        e eVar4;
        long j12;
        long j13;
        long j14;
        long j15;
        long j16;
        long j17;
        long j18;
        long j19;
        long j21;
        long j22;
        J0 m02;
        C3969l u11 = interfaceC3967k.u(1093540195);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
            singleProductContent2 = singleProductContent;
        } else {
            singleProductContent2 = singleProductContent;
            if ((i11 & 6) == 0) {
                i13 = (u11.n(singleProductContent2) ? 4 : 2) | i11;
            } else {
                i13 = i11;
            }
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= u11.s(j11) ? 32 : 16;
        }
        int i15 = i12 & 4;
        if (i15 != 0) {
            i13 |= 384;
        } else if ((i11 & 384) == 0) {
            eVar2 = eVar;
            i13 |= u11.n(eVar2) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
            if ((i12 & 8) == 0) {
                i13 |= 3072;
            } else if ((i11 & 3072) == 0) {
                i13 |= u11.p(z11) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
            }
            if ((i12 & 16) == 0) {
                i13 |= 24576;
            } else if ((i11 & 24576) == 0) {
                i13 |= u11.F(function1) ? 16384 : 8192;
                if ((i13 & 9363) == 9362 || !u11.b()) {
                    e eVar5 = i15 != 0 ? e.f40358c0 : eVar2;
                    C7807Z c7807z = TokenParserKt.tokenToColor(singleProductContent2.getBackground(), u11, 0);
                    u11.o(-753787775);
                    long bgSecondary = c7807z == null ? UniTheme.INSTANCE.getColors(u11, UniTheme.$stable).getBgSecondary() : c7807z.w();
                    u11.k();
                    long f7 = C7811b0.f(bgSecondary, j11);
                    u11.o(-753775696);
                    InstallmentV5SingleDefaults installmentV5SingleDefaults = InstallmentV5SingleDefaults.INSTANCE;
                    b11 = androidx.compose.foundation.e.b(C6988h.a(eVar5, h.b(z11 ? installmentV5SingleDefaults.m882getMAIN_BLOCK_SELECT_RADIUSD9Ej5fM() : installmentV5SingleDefaults.m881getMAIN_BLOCK_RADIUSD9Ej5fM())), f7, y0.a());
                    if (singleProductContent2.getShimmerAnimationTimer() != null) {
                        boolean a11 = p.a(u11);
                        u11.o(1362170220);
                        Object C11 = u11.C();
                        if (C11 == InterfaceC3967k.a.a()) {
                            j17 = C7807Z.f72258l;
                            C7807Z m11 = C7807Z.m(j17);
                            j18 = C7807Z.f72251e;
                            C7807Z m12 = C7807Z.m(C7807Z.o(0.6f, j18));
                            j19 = C7807Z.f72251e;
                            C7807Z m13 = C7807Z.m(C7807Z.o(0.8f, j19));
                            i14 = i13;
                            j21 = C7807Z.f72251e;
                            C7807Z m14 = C7807Z.m(C7807Z.o(0.6f, j21));
                            j22 = C7807Z.f72258l;
                            C11 = C7714v.b0(m11, m12, m13, m14, C7807Z.m(j22));
                            u11.x(C11);
                        } else {
                            i14 = i13;
                        }
                        List list = (List) C11;
                        Object b12 = Pk0.h.b(u11, 1362181071);
                        if (b12 == InterfaceC3967k.a.a()) {
                            j12 = C7807Z.f72258l;
                            C7807Z m15 = C7807Z.m(j12);
                            j13 = C7807Z.f72251e;
                            C7807Z m16 = C7807Z.m(C7807Z.o(0.36f, j13));
                            j14 = C7807Z.f72251e;
                            C7807Z m17 = C7807Z.m(C7807Z.o(0.42f, j14));
                            j15 = C7807Z.f72251e;
                            C7807Z m18 = C7807Z.m(C7807Z.o(0.36f, j15));
                            j16 = C7807Z.f72258l;
                            b12 = C7714v.b0(m15, m16, m17, m18, C7807Z.m(j16));
                            u11.x(b12);
                        }
                        List list2 = (List) b12;
                        u11.k();
                        float pxF = UiExtKt.toPxF(104);
                        float pxF2 = UiExtKt.toPxF(30);
                        Integer shimmerAnimationTimer = singleProductContent2.getShimmerAnimationTimer();
                        b11 = ComposeExtKt.m875shimmeryBXNGS4(b11, 1300, 0.0f, pxF, pxF2, shimmerAnimationTimer != null ? shimmerAnimationTimer.intValue() : 0, a11, list, list2, 0.0f, u11, 48, 258);
                        u11 = u11;
                    } else {
                        i14 = i13;
                    }
                    u11.k();
                    if (CollectionsExtKt.isNotNullOrEmpty(singleProductContent2.getBadges())) {
                        u11.o(-1891006798);
                        int i16 = i14 >> 3;
                        eVar3 = eVar5;
                        e eVar6 = b11;
                        C3969l c3969l = u11;
                        InstallmentMainContentWithBadges(singleProductContent2, eVar6, z11, function1, c3969l, (i14 & 14) | (i16 & 896) | (i16 & 7168), 0);
                        u11 = c3969l;
                        u11.k();
                    } else {
                        eVar3 = eVar5;
                        u11.o(-1890797083);
                        InstallmentV5MainContentKt.InstallmentV5MainContent(singleProductContent, b11, z11, u11, (i14 & 14) | ((i14 >> 3) & 896), 0);
                        u11.k();
                    }
                    eVar4 = eVar3;
                } else {
                    u11.j();
                    eVar4 = eVar2;
                }
                m02 = u11.m0();
                if (m02 != null) {
                    m02.G(new InstallmentV5SingleProductWidgetKt$InstallmentTopBlock$1(singleProductContent, j11, eVar4, z11, function1, i11, i12));
                    return;
                }
                return;
            }
            if ((i13 & 9363) == 9362) {
            }
            if (i15 != 0) {
            }
            C7807Z c7807z2 = TokenParserKt.tokenToColor(singleProductContent2.getBackground(), u11, 0);
            u11.o(-753787775);
            if (c7807z2 == null) {
            }
            u11.k();
            long f72 = C7811b0.f(bgSecondary, j11);
            u11.o(-753775696);
            InstallmentV5SingleDefaults installmentV5SingleDefaults2 = InstallmentV5SingleDefaults.INSTANCE;
            b11 = androidx.compose.foundation.e.b(C6988h.a(eVar5, h.b(z11 ? installmentV5SingleDefaults2.m882getMAIN_BLOCK_SELECT_RADIUSD9Ej5fM() : installmentV5SingleDefaults2.m881getMAIN_BLOCK_RADIUSD9Ej5fM())), f72, y0.a());
            if (singleProductContent2.getShimmerAnimationTimer() != null) {
            }
            u11.k();
            if (CollectionsExtKt.isNotNullOrEmpty(singleProductContent2.getBadges())) {
            }
            eVar4 = eVar3;
            m02 = u11.m0();
            if (m02 != null) {
            }
        }
        eVar2 = eVar;
        if ((i12 & 8) == 0) {
        }
        if ((i12 & 16) == 0) {
        }
        if ((i13 & 9363) == 9362) {
        }
        if (i15 != 0) {
        }
        C7807Z c7807z22 = TokenParserKt.tokenToColor(singleProductContent2.getBackground(), u11, 0);
        u11.o(-753787775);
        if (c7807z22 == null) {
        }
        u11.k();
        long f722 = C7811b0.f(bgSecondary, j11);
        u11.o(-753775696);
        InstallmentV5SingleDefaults installmentV5SingleDefaults22 = InstallmentV5SingleDefaults.INSTANCE;
        b11 = androidx.compose.foundation.e.b(C6988h.a(eVar5, h.b(z11 ? installmentV5SingleDefaults22.m882getMAIN_BLOCK_SELECT_RADIUSD9Ej5fM() : installmentV5SingleDefaults22.m881getMAIN_BLOCK_RADIUSD9Ej5fM())), f722, y0.a());
        if (singleProductContent2.getShimmerAnimationTimer() != null) {
        }
        u11.k();
        if (CollectionsExtKt.isNotNullOrEmpty(singleProductContent2.getBadges())) {
        }
        eVar4 = eVar3;
        m02 = u11.m0();
        if (m02 != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void InstallmentV5SingleProductContent(InstallmentPurchaseV5VO.SingleProduct singleProduct, Function1<? super AtomAction, Unit> function1, @SuppressLint({"ModifierParameter"}) e eVar, boolean z11, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        e eVar2;
        boolean z12;
        e b11;
        boolean z13;
        Object C11;
        String automatizationId;
        e eVar3;
        TestInfo testInfo;
        J0 m02;
        C3969l u11 = interfaceC3967k.u(1309195210);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.n(singleProduct) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= u11.F(function1) ? 32 : 16;
        }
        int i14 = i12 & 4;
        if (i14 != 0) {
            i13 |= 384;
        } else if ((i11 & 384) == 0) {
            eVar2 = eVar;
            i13 |= u11.n(eVar2) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
            if ((i12 & 8) == 0) {
                i13 |= 3072;
            } else if ((i11 & 3072) == 0) {
                z12 = z11;
                i13 |= u11.p(z12) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
                if ((i13 & 1171) == 1170 || !u11.b()) {
                    e eVar4 = i14 != 0 ? e.f40358c0 : eVar2;
                    C7807Z c7807z = TokenParserKt.tokenToColor(singleProduct.getBackground(), u11, 0);
                    u11.o(698010264);
                    long layerFloor1 = c7807z == null ? UniTheme.INSTANCE.getColors(u11, UniTheme.$stable).getLayerFloor1() : c7807z.w();
                    u11.k();
                    b11 = androidx.compose.foundation.e.b(a0.e(e.f40358c0, 1.0f), layerFloor1, y0.a());
                    e i15 = T.i(b11.l0(eVar4), singleProduct.getHorizontalPaddings().m1867getDpD9Ej5fM(), singleProduct.getTopPadding().m1867getDpD9Ej5fM(), singleProduct.getHorizontalPaddings().m1867getDpD9Ej5fM(), singleProduct.getBottomPadding().m1867getDpD9Ej5fM());
                    u11.o(698024258);
                    z13 = ((i13 & 14) == 4) | ((i13 & 112) == 32);
                    C11 = u11.C();
                    if (!z13 || C11 == InterfaceC3967k.a.a()) {
                        C11 = new InstallmentV5SingleProductWidgetKt$InstallmentV5SingleProductContent$rootModifier$1$1(singleProduct, function1);
                        u11.x(C11);
                    }
                    u11.k();
                    e b12 = i.b(i15, null, null, false, null, null, (Function0) C11, 28);
                    InstallmentPurchaseV5VO.CommonVO common = singleProduct.getCommon();
                    automatizationId = (common != null || (testInfo = common.getTestInfo()) == null) ? null : testInfo.getAutomatizationId();
                    if (automatizationId == null) {
                        automatizationId = "";
                    }
                    e a11 = Q1.a(b12, automatizationId);
                    if (singleProduct.getContent().getBottomBlock() != null) {
                        u11.o(164105860);
                        m885InstallmentWithBottomBlock8V94_ZQ(singleProduct.getContent(), layerFloor1, a11, z12, function1, u11, ((i13 << 9) & 57344) | (i13 & 7168), 0);
                        u11.k();
                    } else {
                        u11.o(164369267);
                        m884InstallmentTopBlock8V94_ZQ(singleProduct.getContent(), layerFloor1, a11, z11, function1, u11, (i13 & 7168) | ((i13 << 9) & 57344), 0);
                        u11.k();
                    }
                    eVar3 = eVar4;
                } else {
                    u11.j();
                    eVar3 = eVar2;
                }
                m02 = u11.m0();
                if (m02 != null) {
                    m02.G(new InstallmentV5SingleProductWidgetKt$InstallmentV5SingleProductContent$1(singleProduct, function1, eVar3, z11, i11, i12));
                    return;
                }
                return;
            }
            z12 = z11;
            if ((i13 & 1171) == 1170) {
            }
            if (i14 != 0) {
            }
            C7807Z c7807z2 = TokenParserKt.tokenToColor(singleProduct.getBackground(), u11, 0);
            u11.o(698010264);
            if (c7807z2 == null) {
            }
            u11.k();
            b11 = androidx.compose.foundation.e.b(a0.e(e.f40358c0, 1.0f), layerFloor1, y0.a());
            e i152 = T.i(b11.l0(eVar4), singleProduct.getHorizontalPaddings().m1867getDpD9Ej5fM(), singleProduct.getTopPadding().m1867getDpD9Ej5fM(), singleProduct.getHorizontalPaddings().m1867getDpD9Ej5fM(), singleProduct.getBottomPadding().m1867getDpD9Ej5fM());
            u11.o(698024258);
            z13 = ((i13 & 14) == 4) | ((i13 & 112) == 32);
            C11 = u11.C();
            if (!z13) {
            }
            C11 = new InstallmentV5SingleProductWidgetKt$InstallmentV5SingleProductContent$rootModifier$1$1(singleProduct, function1);
            u11.x(C11);
            u11.k();
            e b122 = i.b(i152, null, null, false, null, null, (Function0) C11, 28);
            InstallmentPurchaseV5VO.CommonVO common2 = singleProduct.getCommon();
            if (common2 != null) {
            }
            if (automatizationId == null) {
            }
            e a112 = Q1.a(b122, automatizationId);
            if (singleProduct.getContent().getBottomBlock() != null) {
            }
            eVar3 = eVar4;
            m02 = u11.m0();
            if (m02 != null) {
            }
        }
        eVar2 = eVar;
        if ((i12 & 8) == 0) {
        }
        z12 = z11;
        if ((i13 & 1171) == 1170) {
        }
        if (i14 != 0) {
        }
        C7807Z c7807z22 = TokenParserKt.tokenToColor(singleProduct.getBackground(), u11, 0);
        u11.o(698010264);
        if (c7807z22 == null) {
        }
        u11.k();
        b11 = androidx.compose.foundation.e.b(a0.e(e.f40358c0, 1.0f), layerFloor1, y0.a());
        e i1522 = T.i(b11.l0(eVar4), singleProduct.getHorizontalPaddings().m1867getDpD9Ej5fM(), singleProduct.getTopPadding().m1867getDpD9Ej5fM(), singleProduct.getHorizontalPaddings().m1867getDpD9Ej5fM(), singleProduct.getBottomPadding().m1867getDpD9Ej5fM());
        u11.o(698024258);
        z13 = ((i13 & 14) == 4) | ((i13 & 112) == 32);
        C11 = u11.C();
        if (!z13) {
        }
        C11 = new InstallmentV5SingleProductWidgetKt$InstallmentV5SingleProductContent$rootModifier$1$1(singleProduct, function1);
        u11.x(C11);
        u11.k();
        e b1222 = i.b(i1522, null, null, false, null, null, (Function0) C11, 28);
        InstallmentPurchaseV5VO.CommonVO common22 = singleProduct.getCommon();
        if (common22 != null) {
        }
        if (automatizationId == null) {
        }
        e a1122 = Q1.a(b1222, automatizationId);
        if (singleProduct.getContent().getBottomBlock() != null) {
        }
        eVar3 = eVar4;
        m02 = u11.m0();
        if (m02 != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void InstallmentV5SingleProductWidget(@NotNull InstallmentPurchaseV5VO.SingleProduct state, boolean z11, Function1<? super t, Unit> function1, @NotNull Function1<? super AtomAction, Unit> actionHandler, @NotNull BaseOnBoardingViewModel.Default onboardingViewModel, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        Function1<? super t, Unit> function12;
        Function1<? super t, Unit> function13;
        OnBoardingDTO onBoardingDTO;
        t tokenizedEvent;
        String tag;
        OnBoardingDTO onboarding;
        String str;
        boolean n11;
        Object C11;
        J0 m02;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(onboardingViewModel, "onboardingViewModel");
        C3969l u11 = interfaceC3967k.u(389519414);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.n(state) ? 4 : 2) | i11;
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
            function12 = function1;
            i13 |= u11.F(function12) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
            if ((i12 & 8) == 0) {
                i13 |= 3072;
            } else if ((i11 & 3072) == 0) {
                i13 |= u11.F(actionHandler) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
            }
            if ((i12 & 16) == 0) {
                i13 |= 24576;
            } else if ((i11 & 24576) == 0) {
                i13 |= (32768 & i11) == 0 ? u11.n(onboardingViewModel) : u11.F(onboardingViewModel) ? 16384 : 8192;
            }
            if ((i13 & 9363) == 9362 || !u11.b()) {
                if (i14 == 0) {
                    u11.o(-255022651);
                    Object C12 = u11.C();
                    if (C12 == InterfaceC3967k.a.a()) {
                        C12 = InstallmentV5SingleProductWidgetKt$InstallmentV5SingleProductWidget$1$1.INSTANCE;
                        u11.x(C12);
                    }
                    function13 = (Function1) C12;
                    u11.k();
                } else {
                    function13 = function12;
                }
                InstallmentPurchaseV5VO.CommonVO common = state.getCommon();
                onBoardingDTO = null;
                tokenizedEvent = common == null ? common.getTokenizedEvent() : null;
                u11.o(-255018039);
                if (tokenizedEvent != null) {
                    AbstractC5434v.a aVar = AbstractC5434v.a.ON_RESUME;
                    u11.o(1074948292);
                    boolean F11 = u11.F(tokenizedEvent) | ((i13 & 896) == 256);
                    Object C13 = u11.C();
                    if (F11 || C13 == InterfaceC3967k.a.a()) {
                        C13 = new InstallmentV5SingleProductWidgetKt$InstallmentV5SingleProductWidget$2$1$1(function13, tokenizedEvent);
                        u11.x(C13);
                    }
                    u11.k();
                    e3.i.a(aVar, null, (Function0) C13, u11, 6);
                    Unit unit = Unit.f71690a;
                }
                u11.k();
                ComponentCallbacksC5392m c11 = ((C4911f) u11.m(f.d())).c();
                tag = c11 == null ? c11.getTag() : null;
                onboarding = state.getContent().getOnboarding();
                if (onboarding != null || (str = onboarding.getOnboardingKey()) == null) {
                    str = "installment_onboarding_is_shown";
                }
                u11.o(-255008921);
                n11 = u11.n(tag) | u11.n(str);
                C11 = u11.C();
                if (!n11 || C11 == InterfaceC3967k.a.a()) {
                    if (tag != null && onboardingViewModel.isNeedToShow(tag, str)) {
                        onBoardingDTO = state.getContent().getOnboarding();
                    }
                    u11.x(onBoardingDTO);
                    C11 = onBoardingDTO;
                }
                OnBoardingDTO onBoardingDTO2 = (OnBoardingDTO) C11;
                u11.k();
                Integer valueOf = Integer.valueOf(-(!state.getHasTitle() ? InstallmentV5SingleDefaults.INSTANCE.getONBOARDING_WITH_TITLE_TOP_MARGIN() : InstallmentV5SingleDefaults.INSTANCE.getONBOARDING_TOP_MARGIN()));
                InstallmentV5SingleDefaults installmentV5SingleDefaults = InstallmentV5SingleDefaults.INSTANCE;
                ShowOnboardingComposableKt.WidgetWithOnboarding(onBoardingDTO2, str, onboardingViewModel, new OnBoardingCutConfig(null, valueOf, null, Integer.valueOf(UiExtKt.toPx(state.getBottomPadding().getPx()) + (-installmentV5SingleDefaults.getONBOARDING_BOTTOM_MARGIN())), null, null, Float.valueOf(installmentV5SingleDefaults.getONBOARDING_RADIUS()), false, 181, null), null, a1.c.c(-38091087, new InstallmentV5SingleProductWidgetKt$InstallmentV5SingleProductWidget$3(state, actionHandler, z11), u11), u11, ((i13 >> 6) & 896) | (BaseOnBoardingViewModel.Default.$stable << 6) | 196608 | (OnBoardingCutConfig.$stable << 9), 16);
            } else {
                u11.j();
                function13 = function12;
            }
            m02 = u11.m0();
            if (m02 == null) {
                m02.G(new InstallmentV5SingleProductWidgetKt$InstallmentV5SingleProductWidget$4(state, z11, function13, actionHandler, onboardingViewModel, i11, i12));
                return;
            }
            return;
        }
        function12 = function1;
        if ((i12 & 8) == 0) {
        }
        if ((i12 & 16) == 0) {
        }
        if ((i13 & 9363) == 9362) {
        }
        if (i14 == 0) {
        }
        InstallmentPurchaseV5VO.CommonVO common2 = state.getCommon();
        onBoardingDTO = null;
        if (common2 == null) {
        }
        u11.o(-255018039);
        if (tokenizedEvent != null) {
        }
        u11.k();
        ComponentCallbacksC5392m c112 = ((C4911f) u11.m(f.d())).c();
        if (c112 == null) {
        }
        onboarding = state.getContent().getOnboarding();
        if (onboarding != null) {
        }
        str = "installment_onboarding_is_shown";
        u11.o(-255008921);
        n11 = u11.n(tag) | u11.n(str);
        C11 = u11.C();
        if (!n11) {
        }
        if (tag != null) {
            onBoardingDTO = state.getContent().getOnboarding();
        }
        u11.x(onBoardingDTO);
        C11 = onBoardingDTO;
        OnBoardingDTO onBoardingDTO22 = (OnBoardingDTO) C11;
        u11.k();
        Integer valueOf2 = Integer.valueOf(-(!state.getHasTitle() ? InstallmentV5SingleDefaults.INSTANCE.getONBOARDING_WITH_TITLE_TOP_MARGIN() : InstallmentV5SingleDefaults.INSTANCE.getONBOARDING_TOP_MARGIN()));
        InstallmentV5SingleDefaults installmentV5SingleDefaults2 = InstallmentV5SingleDefaults.INSTANCE;
        ShowOnboardingComposableKt.WidgetWithOnboarding(onBoardingDTO22, str, onboardingViewModel, new OnBoardingCutConfig(null, valueOf2, null, Integer.valueOf(UiExtKt.toPx(state.getBottomPadding().getPx()) + (-installmentV5SingleDefaults2.getONBOARDING_BOTTOM_MARGIN())), null, null, Float.valueOf(installmentV5SingleDefaults2.getONBOARDING_RADIUS()), false, 181, null), null, a1.c.c(-38091087, new InstallmentV5SingleProductWidgetKt$InstallmentV5SingleProductWidget$3(state, actionHandler, z11), u11), u11, ((i13 >> 6) & 896) | (BaseOnBoardingViewModel.Default.$stable << 6) | 196608 | (OnBoardingCutConfig.$stable << 9), 16);
        m02 = u11.m0();
        if (m02 == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0069  */
    /* renamed from: InstallmentWithBottomBlock-8V94_ZQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m885InstallmentWithBottomBlock8V94_ZQ(InstallmentPurchaseV5VO.SingleProduct.SingleProductContent singleProductContent, long j11, e eVar, boolean z11, Function1<? super AtomAction, Unit> function1, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        InstallmentPurchaseV5VO.SingleProduct.SingleProductContent singleProductContent2;
        int i13;
        e eVar2;
        Function1<? super AtomAction, Unit> function12;
        int I11;
        InstallmentPurchaseV5VO.SingleProduct.SingleProductContent.BottomBlock bottomBlock;
        e eVar3;
        J0 m02;
        C3969l u11 = interfaceC3967k.u(597042581);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
            singleProductContent2 = singleProductContent;
        } else if ((i11 & 6) == 0) {
            singleProductContent2 = singleProductContent;
            i13 = (u11.n(singleProductContent2) ? 4 : 2) | i11;
        } else {
            singleProductContent2 = singleProductContent;
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= u11.s(j11) ? 32 : 16;
        }
        int i14 = i12 & 4;
        if (i14 != 0) {
            i13 |= 384;
        } else if ((i11 & 384) == 0) {
            eVar2 = eVar;
            i13 |= u11.n(eVar2) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
            if ((i12 & 8) == 0) {
                i13 |= 3072;
            } else if ((i11 & 3072) == 0) {
                i13 |= u11.p(z11) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
            }
            if ((i12 & 16) == 0) {
                i13 |= 24576;
            } else if ((i11 & 24576) == 0) {
                function12 = function1;
                i13 |= u11.F(function12) ? 16384 : 8192;
                if ((i13 & 9363) == 9362 || !u11.b()) {
                    e eVar4 = i14 != 0 ? e.f40358c0 : eVar2;
                    InstallmentPurchaseV5VO.SingleProduct.SingleProductContent.BottomBlock bottomBlock2 = singleProductContent2.getBottomBlock();
                    C7807Z c7807z = TokenParserKt.tokenToColor(bottomBlock2 != null ? bottomBlock2.getBackground() : null, u11, 0);
                    u11.o(40088448);
                    long bgSecondary = c7807z == null ? UniTheme.INSTANCE.getColors(u11, UniTheme.$stable).getBgSecondary() : c7807z.w();
                    u11.k();
                    InstallmentV5SingleDefaults installmentV5SingleDefaults = InstallmentV5SingleDefaults.INSTANCE;
                    e b11 = androidx.compose.foundation.e.b(eVar4, bgSecondary, h.b(z11 ? installmentV5SingleDefaults.m882getMAIN_BLOCK_SELECT_RADIUSD9Ej5fM() : installmentV5SingleDefaults.m881getMAIN_BLOCK_RADIUSD9Ej5fM()));
                    C5194q a11 = C5193p.a(C5179b.n(4), InterfaceC6250b.a.k(), u11, 6);
                    I11 = u11.I();
                    A0 d11 = u11.d();
                    e f7 = c.f(u11, b11);
                    Function0 a12 = g.a(InterfaceC2801g.f5440U, u11);
                    if (u11.t()) {
                        u11.H(a12);
                    } else {
                        u11.e();
                    }
                    Function2 g10 = b.g(u11, a11, u11, d11);
                    if (!u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                        a.d(I11, u11, I11, g10);
                    }
                    F1.b(u11, f7, InterfaceC2801g.a.f());
                    m884InstallmentTopBlock8V94_ZQ(singleProductContent2, j11, null, z11, function12, u11, 64638 & i13, 4);
                    bottomBlock = singleProductContent.getBottomBlock();
                    u11.o(1210650122);
                    if (bottomBlock != null) {
                        DsTextAtomKt.DsTextAtom(bottomBlock.getTitle(), T.j(e.f40358c0, Paddings.PADDING_350.m1867getDpD9Ej5fM(), 0.0f, Paddings.PADDING_500.m1867getDpD9Ej5fM(), Paddings.PADDING_300.m1867getDpD9Ej5fM(), 2), u11, 0, 0);
                    }
                    u11.k();
                    u11.f();
                    eVar3 = eVar4;
                } else {
                    u11.j();
                    eVar3 = eVar2;
                }
                m02 = u11.m0();
                if (m02 != null) {
                    m02.G(new InstallmentV5SingleProductWidgetKt$InstallmentWithBottomBlock$2(singleProductContent, j11, eVar3, z11, function1, i11, i12));
                    return;
                }
                return;
            }
            function12 = function1;
            if ((i13 & 9363) == 9362) {
            }
            if (i14 != 0) {
            }
            InstallmentPurchaseV5VO.SingleProduct.SingleProductContent.BottomBlock bottomBlock22 = singleProductContent2.getBottomBlock();
            C7807Z c7807z2 = TokenParserKt.tokenToColor(bottomBlock22 != null ? bottomBlock22.getBackground() : null, u11, 0);
            u11.o(40088448);
            if (c7807z2 == null) {
            }
            u11.k();
            InstallmentV5SingleDefaults installmentV5SingleDefaults2 = InstallmentV5SingleDefaults.INSTANCE;
            e b112 = androidx.compose.foundation.e.b(eVar4, bgSecondary, h.b(z11 ? installmentV5SingleDefaults2.m882getMAIN_BLOCK_SELECT_RADIUSD9Ej5fM() : installmentV5SingleDefaults2.m881getMAIN_BLOCK_RADIUSD9Ej5fM()));
            C5194q a112 = C5193p.a(C5179b.n(4), InterfaceC6250b.a.k(), u11, 6);
            I11 = u11.I();
            A0 d112 = u11.d();
            e f72 = c.f(u11, b112);
            Function0 a122 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
            }
            Function2 g102 = b.g(u11, a112, u11, d112);
            if (!u11.t()) {
            }
            a.d(I11, u11, I11, g102);
            F1.b(u11, f72, InterfaceC2801g.a.f());
            m884InstallmentTopBlock8V94_ZQ(singleProductContent2, j11, null, z11, function12, u11, 64638 & i13, 4);
            bottomBlock = singleProductContent.getBottomBlock();
            u11.o(1210650122);
            if (bottomBlock != null) {
            }
            u11.k();
            u11.f();
            eVar3 = eVar4;
            m02 = u11.m0();
            if (m02 != null) {
            }
        }
        eVar2 = eVar;
        if ((i12 & 8) == 0) {
        }
        if ((i12 & 16) == 0) {
        }
        function12 = function1;
        if ((i13 & 9363) == 9362) {
        }
        if (i14 != 0) {
        }
        InstallmentPurchaseV5VO.SingleProduct.SingleProductContent.BottomBlock bottomBlock222 = singleProductContent2.getBottomBlock();
        C7807Z c7807z22 = TokenParserKt.tokenToColor(bottomBlock222 != null ? bottomBlock222.getBackground() : null, u11, 0);
        u11.o(40088448);
        if (c7807z22 == null) {
        }
        u11.k();
        InstallmentV5SingleDefaults installmentV5SingleDefaults22 = InstallmentV5SingleDefaults.INSTANCE;
        e b1122 = androidx.compose.foundation.e.b(eVar4, bgSecondary, h.b(z11 ? installmentV5SingleDefaults22.m882getMAIN_BLOCK_SELECT_RADIUSD9Ej5fM() : installmentV5SingleDefaults22.m881getMAIN_BLOCK_RADIUSD9Ej5fM()));
        C5194q a1122 = C5193p.a(C5179b.n(4), InterfaceC6250b.a.k(), u11, 6);
        I11 = u11.I();
        A0 d1122 = u11.d();
        e f722 = c.f(u11, b1122);
        Function0 a1222 = g.a(InterfaceC2801g.f5440U, u11);
        if (u11.t()) {
        }
        Function2 g1022 = b.g(u11, a1122, u11, d1122);
        if (!u11.t()) {
        }
        a.d(I11, u11, I11, g1022);
        F1.b(u11, f722, InterfaceC2801g.a.f());
        m884InstallmentTopBlock8V94_ZQ(singleProductContent2, j11, null, z11, function12, u11, 64638 & i13, 4);
        bottomBlock = singleProductContent.getBottomBlock();
        u11.o(1210650122);
        if (bottomBlock != null) {
        }
        u11.k();
        u11.f();
        eVar3 = eVar4;
        m02 = u11.m0();
        if (m02 != null) {
        }
    }
}

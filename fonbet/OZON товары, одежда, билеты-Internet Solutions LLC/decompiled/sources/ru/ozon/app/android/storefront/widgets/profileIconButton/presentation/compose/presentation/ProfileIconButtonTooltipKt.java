package ru.ozon.app.android.storefront.widgets.profileIconButton.presentation.compose.presentation;

import B1.B;
import S0.A1;
import S0.C3956f1;
import S0.C3969l;
import S0.D1;
import S0.InterfaceC3967k;
import S0.InterfaceC3972m0;
import S0.InterfaceC3978p0;
import S0.J0;
import S0.Q;
import S0.n1;
import Sc.o;
import Z1.d;
import android.content.res.Configuration;
import androidx.compose.ui.e;
import androidx.compose.ui.graphics.a;
import androidx.compose.ui.layout.g;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.K0;
import bc.C5637m;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import d2.C6041S;
import i1.C6981a;
import k1.C7459e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.K;
import kotlin.ranges.h;
import m0.C8025y;
import m0.D0;
import m0.H0;
import m0.U0;
import m0.W0;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.widgets.profileIconButton.data.IconTooltipDto;
import ru.ozon.uni.android.ds.compose.component.tooltip.DsTooltipAtomKt;
import ru.ozon.uni.atoms.data.common.TooltipDTO;
import ru.ozon.uni.core.compose.tokens.TokensExtKt;
import ru.ozon.uni.core.models.UniPaddingToken;
import ru.ozon.uni.core.repository.UniTheme;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\u001a=\u0010\b\u001a\u00020\u00052\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0001¢\u0006\u0004\b\b\u0010\t\u001a+\u0010\u0010\u001a\u00020\u000f*\u00020\n2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001aA\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\n2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0019\u0010\u001a\"\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006#²\u0006\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u00008\n@\nX\u008a\u008e\u0002²\u0006\f\u0010 \u001a\u00020\u001f8\nX\u008a\u0084\u0002²\u0006\f\u0010!\u001a\u00020\u001f8\nX\u008a\u0084\u0002²\u0006\f\u0010\"\u001a\u00020\u001f8\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u0015\u001a\u00020\u000b8\n@\nX\u008a\u008e\u0002"}, d2 = {"Lru/ozon/app/android/storefront/widgets/profileIconButton/presentation/compose/presentation/ActiveTooltip;", "activeTooltip", "", "isRichAnimationEnabled", "Lkotlin/Function0;", "", "onDismiss", "onCloseClick", "ProfileIconButtonTooltip", "(Lru/ozon/app/android/storefront/widgets/profileIconButton/presentation/compose/presentation/ActiveTooltip;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;LS0/k;I)V", "Lru/ozon/uni/atoms/data/common/TooltipDTO$BeakPosition;", "", "beakOffset", "leftMargin", "tooltipWidth", "Ll1/N0;", "toTransformOrigin", "(Lru/ozon/uni/atoms/data/common/TooltipDTO$BeakPosition;III)J", "beakPosition", "LB1/B;", "anchorCoordinates", "tooltipWidthPx", "leftMarginPx", "rightMarginPx", "windowWidth", "calculateBeakOffset", "(Lru/ozon/uni/atoms/data/common/TooltipDTO$BeakPosition;LB1/B;IIII)I", "Lm0/y;", "TooltipOvershootEasing", "Lm0/y;", "lastTooltip", "", "alpha", "scale", "rotation", "storefront_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ProfileIconButtonTooltipKt {

    @NotNull
    private static final C8025y TooltipOvershootEasing = new C8025y(0.25f, 0.1f, 0.25f, 1.0f);

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TooltipDTO.BeakPosition.values().length];
            try {
                iArr[TooltipDTO.BeakPosition.TOP_CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TooltipDTO.BeakPosition.BOTTOM_CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TooltipDTO.BeakPosition.TOP_CUSTOM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TooltipDTO.BeakPosition.BOTTOM_CUSTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[TooltipDTO.BeakPosition.LEFT_CENTER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[TooltipDTO.BeakPosition.RIGHT_CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void ProfileIconButtonTooltip(ActiveTooltip activeTooltip, boolean z11, @NotNull Function0<Unit> onDismiss, @NotNull Function0<Unit> onCloseClick, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        boolean z12;
        boolean z13;
        Integer num;
        TooltipDTO.BeakPosition beakPosition;
        UniPaddingToken padding200;
        UniPaddingToken padding2002;
        e a11;
        C3969l c3969l;
        IconTooltipDto dto;
        IconTooltipDto dto2;
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Intrinsics.checkNotNullParameter(onCloseClick, "onCloseClick");
        C3969l u11 = interfaceC3967k.u(282213229);
        if ((i11 & 6) == 0) {
            i12 = (u11.F(activeTooltip) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.p(z11) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.F(onDismiss) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i11 & 3072) == 0) {
            i12 |= u11.F(onCloseClick) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        int i13 = i12;
        if ((i13 & 1171) == 1170 && u11.b()) {
            u11.j();
            c3969l = u11;
        } else {
            u11.o(-352491970);
            Object C11 = u11.C();
            if (C11 == InterfaceC3967k.a.a()) {
                C11 = n1.f(null, D1.f25195a);
                u11.x(C11);
            }
            InterfaceC3978p0 interfaceC3978p0 = (InterfaceC3978p0) C11;
            u11.k();
            if (activeTooltip != null) {
                interfaceC3978p0.setValue(activeTooltip);
            }
            boolean z14 = activeTooltip != null;
            Integer autoHideDelay = (activeTooltip == null || (dto2 = activeTooltip.getDto()) == null) ? null : dto2.getAutoHideDelay();
            Boolean valueOf = Boolean.valueOf(z14);
            Boolean valueOf2 = Boolean.valueOf(z11);
            u11.o(-352482297);
            boolean p11 = ((i13 & 112) == 32) | u11.p(z14) | u11.n(autoHideDelay) | ((i13 & 896) == 256);
            Object C12 = u11.C();
            if (p11 || C12 == InterfaceC3967k.a.a()) {
                Object profileIconButtonTooltipKt$ProfileIconButtonTooltip$1$1 = new ProfileIconButtonTooltipKt$ProfileIconButtonTooltip$1$1(z14, autoHideDelay, z11, onDismiss, null);
                Integer num2 = autoHideDelay;
                z12 = z14;
                z13 = z11;
                num = num2;
                u11.x(profileIconButtonTooltipKt$ProfileIconButtonTooltip$1$1);
                C12 = profileIconButtonTooltipKt$ProfileIconButtonTooltip$1$1;
            } else {
                num = autoHideDelay;
                z12 = z14;
                z13 = z11;
            }
            u11.k();
            Q.f(valueOf, num, valueOf2, (Function2) C12, u11);
            D0 g10 = H0.g(Boolean.valueOf(z12), "ProfileIconButtonTooltipTransition", u11, 48);
            ProfileIconButtonTooltipKt$ProfileIconButtonTooltip$alpha$2 profileIconButtonTooltipKt$ProfileIconButtonTooltip$alpha$2 = new ProfileIconButtonTooltipKt$ProfileIconButtonTooltip$alpha$2(z13);
            U0 b11 = W0.b();
            boolean booleanValue = ((Boolean) g10.h()).booleanValue();
            u11.o(180335165);
            float f7 = booleanValue ? 1.0f : 0.0f;
            u11.k();
            Float valueOf3 = Float.valueOf(f7);
            boolean booleanValue2 = ((Boolean) g10.n()).booleanValue();
            u11.o(180335165);
            float f11 = booleanValue2 ? 1.0f : 0.0f;
            u11.k();
            D0.d d11 = H0.d(g10, valueOf3, Float.valueOf(f11), profileIconButtonTooltipKt$ProfileIconButtonTooltip$alpha$2.invoke((ProfileIconButtonTooltipKt$ProfileIconButtonTooltip$alpha$2) g10.m(), (D0.b) u11, (C3969l) 0), b11, u11, 196608);
            ProfileIconButtonTooltipKt$ProfileIconButtonTooltip$scale$2 profileIconButtonTooltipKt$ProfileIconButtonTooltip$scale$2 = ProfileIconButtonTooltipKt$ProfileIconButtonTooltip$scale$2.INSTANCE;
            U0 b12 = W0.b();
            boolean booleanValue3 = ((Boolean) g10.h()).booleanValue();
            u11.o(99018193);
            float f12 = booleanValue3 ? 1.0f : 0.0f;
            u11.k();
            Float valueOf4 = Float.valueOf(f12);
            boolean booleanValue4 = ((Boolean) g10.n()).booleanValue();
            u11.o(99018193);
            float f13 = booleanValue4 ? 1.0f : 0.0f;
            u11.k();
            D0.d d12 = H0.d(g10, valueOf4, Float.valueOf(f13), profileIconButtonTooltipKt$ProfileIconButtonTooltip$scale$2.invoke((ProfileIconButtonTooltipKt$ProfileIconButtonTooltip$scale$2) g10.m(), (D0.b) u11, (C3969l) 0), b12, u11, 196608);
            ProfileIconButtonTooltipKt$ProfileIconButtonTooltip$rotation$2 profileIconButtonTooltipKt$ProfileIconButtonTooltip$rotation$2 = ProfileIconButtonTooltipKt$ProfileIconButtonTooltip$rotation$2.INSTANCE;
            U0 b13 = W0.b();
            boolean booleanValue5 = ((Boolean) g10.h()).booleanValue();
            u11.o(671073781);
            float f14 = booleanValue5 ? 0.0f : 10.0f;
            u11.k();
            Float valueOf5 = Float.valueOf(f14);
            boolean booleanValue6 = ((Boolean) g10.n()).booleanValue();
            u11.o(671073781);
            float f15 = booleanValue6 ? 0.0f : 10.0f;
            u11.k();
            D0.d d13 = H0.d(g10, valueOf5, Float.valueOf(f15), profileIconButtonTooltipKt$ProfileIconButtonTooltip$rotation$2.invoke((ProfileIconButtonTooltipKt$ProfileIconButtonTooltip$rotation$2) g10.m(), (D0.b) u11, (C3969l) 0), b13, u11, 196608);
            ActiveTooltip ProfileIconButtonTooltip$lambda$1 = ProfileIconButtonTooltip$lambda$1(interfaceC3978p0);
            TooltipDTO tooltipModel = (ProfileIconButtonTooltip$lambda$1 == null || (dto = ProfileIconButtonTooltip$lambda$1.getDto()) == null) ? null : dto.getTooltipModel();
            ActiveTooltip ProfileIconButtonTooltip$lambda$12 = ProfileIconButtonTooltip$lambda$1(interfaceC3978p0);
            B anchor = ProfileIconButtonTooltip$lambda$12 != null ? ProfileIconButtonTooltip$lambda$12.getAnchor() : null;
            if (tooltipModel == null || (beakPosition = tooltipModel.getBeakPosition()) == null) {
                beakPosition = TooltipDTO.BeakPosition.TOP_CENTER;
            }
            if (tooltipModel == null || (padding200 = tooltipModel.getLeftMargin()) == null) {
                padding200 = UniTheme.INSTANCE.getPaddingTokens().getPadding200();
            }
            float dp = TokensExtKt.getDp(padding200);
            if (tooltipModel == null || (padding2002 = tooltipModel.getRightMargin()) == null) {
                padding2002 = UniTheme.INSTANCE.getPaddingTokens().getPadding200();
            }
            float dp2 = TokensExtKt.getDp(padding2002);
            K k11 = new K();
            d dVar = (d) u11.m(K0.e());
            k11.f71785a = dVar.Y0(dp);
            int Y02 = dVar.Y0(dp2);
            Unit unit = Unit.f71690a;
            int g11 = (int) (((Configuration) u11.m(AndroidCompositionLocals_androidKt.c())).screenWidthDp * ((d) u11.m(K0.e())).g());
            u11.o(-352365778);
            Object C13 = u11.C();
            if (C13 == InterfaceC3967k.a.a()) {
                C13 = C3956f1.a(0);
                u11.x(C13);
            }
            InterfaceC3972m0 interfaceC3972m0 = (InterfaceC3972m0) C13;
            u11.k();
            int intValue = interfaceC3972m0.getIntValue();
            boolean z15 = z12;
            u11.o(-352363659);
            boolean n11 = u11.n(anchor) | u11.r(intValue) | u11.r(k11.f71785a) | u11.r(Y02) | u11.r(g11);
            Object C14 = u11.C();
            if (n11 || C14 == InterfaceC3967k.a.a()) {
                C14 = Integer.valueOf(calculateBeakOffset(beakPosition, anchor, interfaceC3972m0.getIntValue(), k11.f71785a, Y02, g11));
                u11.x(C14);
            }
            int intValue2 = ((Number) C14).intValue();
            u11.k();
            u11.o(-352350048);
            if (z11) {
                e.a aVar = e.f40358c0;
                u11.o(-352348172);
                Object C15 = u11.C();
                if (C15 == InterfaceC3967k.a.a()) {
                    C15 = new ProfileIconButtonTooltipKt$ProfileIconButtonTooltip$animatedModifier$1$1(interfaceC3972m0);
                    u11.x(C15);
                }
                u11.k();
                e a12 = g.a(aVar, (Function1) C15);
                u11.o(-352345726);
                boolean n12 = u11.n(d12) | u11.n(d13) | u11.n(beakPosition) | u11.r(intValue2) | u11.r(k11.f71785a);
                Object C16 = u11.C();
                if (n12 || C16 == InterfaceC3967k.a.a()) {
                    C16 = new ProfileIconButtonTooltipKt$ProfileIconButtonTooltip$animatedModifier$2$1(beakPosition, intValue2, k11, d12, d13, interfaceC3972m0);
                    u11.x(C16);
                }
                u11.k();
                a11 = a.a(a12, (Function1) C16);
            } else {
                a11 = C6981a.a(e.f40358c0, ProfileIconButtonTooltip$lambda$5(d11));
            }
            e eVar = a11;
            u11.k();
            boolean z16 = !z11 ? !(z15 || ProfileIconButtonTooltip$lambda$5(d11) > 0.0f) : !(z15 || ((Boolean) g10.h()).booleanValue());
            ActiveTooltip ProfileIconButtonTooltip$lambda$13 = ProfileIconButtonTooltip$lambda$1(interfaceC3978p0);
            if (ProfileIconButtonTooltip$lambda$13 == null) {
                c3969l = u11;
            } else {
                u11.o(-352326672);
                if (z16) {
                    int i14 = i13 << 6;
                    DsTooltipAtomKt.DsTooltipAtom(ProfileIconButtonTooltip$lambda$13.getDto().getTooltipModel(), eVar, ProfileIconButtonTooltip$lambda$13.getAnchor(), new C6041S(9, false, false), onDismiss, onCloseClick, u11, TooltipDTO.$stable | 3072 | (57344 & i14) | (i14 & 458752), 0);
                }
                c3969l = u11;
                c3969l.k();
            }
        }
        J0 m02 = c3969l.m0();
        if (m02 != null) {
            m02.G(new ProfileIconButtonTooltipKt$ProfileIconButtonTooltip$4(activeTooltip, z11, onDismiss, onCloseClick, i11));
        }
    }

    private static final ActiveTooltip ProfileIconButtonTooltip$lambda$1(InterfaceC3978p0<ActiveTooltip> interfaceC3978p0) {
        return interfaceC3978p0.getValue();
    }

    private static final float ProfileIconButtonTooltip$lambda$5(A1<Float> a12) {
        return a12.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float ProfileIconButtonTooltip$lambda$7(A1<Float> a12) {
        return a12.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float ProfileIconButtonTooltip$lambda$9(A1<Float> a12) {
        return a12.getValue().floatValue();
    }

    private static final int calculateBeakOffset(TooltipDTO.BeakPosition beakPosition, B b11, int i11, int i12, int i13, int i14) {
        if ((beakPosition != TooltipDTO.BeakPosition.TOP_CUSTOM && beakPosition != TooltipDTO.BeakPosition.BOTTOM_CUSTOM) || b11 == null || i11 <= 0) {
            return 0;
        }
        long u11 = b11.u(0L);
        int g10 = (int) C7459e.g(u11);
        int g11 = (int) C7459e.g(u11);
        int a11 = (int) (b11.a() >> 32);
        int abs = Math.abs(a11 - i11) / 2;
        int i15 = a11 > i11 ? g10 + abs : g10 - abs;
        int i16 = (a11 / 2) + g11;
        if (a11 >= i11) {
            return ((i11 - i12) - i13) / 2;
        }
        if (i15 > 0) {
            i12 += i15;
        }
        int i17 = (i15 + i11) - i14;
        int i18 = i16 - i12;
        return i17 > 0 ? i18 + i17 : i18;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long toTransformOrigin(TooltipDTO.BeakPosition beakPosition, int i11, int i12, int i13) {
        float f7;
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        float f11 = 0.5f;
        switch (iArr[beakPosition.ordinal()]) {
            case 3:
            case 4:
                if (i13 > 0) {
                    f7 = h.d((i12 + i11) / i13, 0.0f, 1.0f);
                    switch (iArr[beakPosition.ordinal()]) {
                        case 1:
                        case 3:
                            f11 = 0.0f;
                            break;
                        case 2:
                        case 4:
                            f11 = 1.0f;
                            break;
                        case 5:
                        case 6:
                            break;
                        default:
                            throw new o();
                    }
                    return C5637m.a(f7, f11);
                }
            case 1:
            case 2:
                f7 = 0.5f;
                switch (iArr[beakPosition.ordinal()]) {
                }
                return C5637m.a(f7, f11);
            case 5:
                f7 = 0.0f;
                switch (iArr[beakPosition.ordinal()]) {
                }
                return C5637m.a(f7, f11);
            case 6:
                f7 = 1.0f;
                switch (iArr[beakPosition.ordinal()]) {
                }
                return C5637m.a(f7, f11);
            default:
                throw new o();
        }
    }
}

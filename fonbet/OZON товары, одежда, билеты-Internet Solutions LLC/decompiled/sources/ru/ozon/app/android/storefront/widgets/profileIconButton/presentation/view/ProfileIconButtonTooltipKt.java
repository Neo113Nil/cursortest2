package ru.ozon.app.android.storefront.widgets.profileIconButton.presentation.view;

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
import a1.c;
import androidx.compose.ui.e;
import androidx.compose.ui.graphics.a;
import androidx.compose.ui.layout.g;
import androidx.compose.ui.platform.K0;
import bc.C5637m;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import d2.C6041S;
import i1.C6981a;
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
import m0.H;
import m0.H0;
import m0.U0;
import m0.W0;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;
import ru.ozon.uni.atoms.data.common.TooltipDTO;
import ru.ozon.uni.core.compose.tokens.TokensExtKt;
import ru.ozon.uni.core.models.UniPaddingToken;
import ru.ozon.uni.core.repository.UniThemeKt;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\u001aa\u0010\u000f\u001a\u00020\f2\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u001a+\u0010\u0016\u001a\u00020\u0015*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0016\u0010\u0017\"\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006!²\u0006\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u00008\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u001c\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002²\u0006\f\u0010\u0012\u001a\u00020\u00028\nX\u008a\u0084\u0002²\u0006\f\u0010\u001e\u001a\u00020\u001d8\nX\u008a\u0084\u0002²\u0006\f\u0010\u001f\u001a\u00020\u001d8\nX\u008a\u0084\u0002²\u0006\f\u0010 \u001a\u00020\u001d8\nX\u008a\u0084\u0002"}, d2 = {"Lru/ozon/uni/atoms/data/common/TooltipDTO;", "dto", "", "autohideDelaySeconds", "Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", "anchorView", "", "isVisible", "isRichAnimationEnabled", "Ld2/S;", "properties", "Lkotlin/Function0;", "", "onDismissRequest", "onCloseClick", "ProfileIconButtonTooltip", "(Lru/ozon/uni/atoms/data/common/TooltipDTO;Ljava/lang/Integer;Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;ZZLd2/S;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;LS0/k;I)V", "Lru/ozon/uni/atoms/data/common/TooltipDTO$BeakPosition;", "beakOffset", "leftMargin", "tooltipWidth", "Ll1/N0;", "toTransformOrigin", "(Lru/ozon/uni/atoms/data/common/TooltipDTO$BeakPosition;III)J", "Lm0/y;", "TooltipOvershootEasing", "Lm0/y;", "lastTooltip", "tooltipWidthPx", "", "alpha", "scale", "rotation", "storefront_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
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

    public static final void ProfileIconButtonTooltip(TooltipDTO tooltipDTO, Integer num, @NotNull IconButtonV3View anchorView, boolean z11, boolean z12, @NotNull C6041S properties, Function0<Unit> function0, @NotNull Function0<Unit> onCloseClick, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        IconButtonV3View iconButtonV3View;
        boolean z13;
        C3969l c3969l;
        e a11;
        Intrinsics.checkNotNullParameter(anchorView, "anchorView");
        Intrinsics.checkNotNullParameter(properties, "properties");
        Intrinsics.checkNotNullParameter(onCloseClick, "onCloseClick");
        C3969l u11 = interfaceC3967k.u(-194353390);
        if ((i11 & 6) == 0) {
            i12 = ((i11 & 8) == 0 ? u11.n(tooltipDTO) : u11.F(tooltipDTO) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.n(num) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= (i11 & UserVerificationMethods.USER_VERIFY_NONE) == 0 ? u11.n(anchorView) : u11.F(anchorView) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i11 & 3072) == 0) {
            i12 |= u11.p(z11) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i11 & 24576) == 0) {
            i12 |= u11.p(z12) ? 16384 : 8192;
        }
        if ((196608 & i11) == 0) {
            i12 |= u11.n(properties) ? 131072 : 65536;
        }
        if ((1572864 & i11) == 0) {
            i12 |= u11.F(function0) ? 1048576 : 524288;
        }
        if ((12582912 & i11) == 0) {
            i12 |= u11.F(onCloseClick) ? 8388608 : 4194304;
        }
        if ((4793491 & i12) == 4793490 && u11.b()) {
            u11.j();
            c3969l = u11;
            iconButtonV3View = anchorView;
            z13 = z11;
        } else {
            u11.o(-1568745748);
            Object C11 = u11.C();
            if (C11 == InterfaceC3967k.a.a()) {
                C11 = n1.f(null, D1.f25195a);
                u11.x(C11);
            }
            InterfaceC3978p0 interfaceC3978p0 = (InterfaceC3978p0) C11;
            u11.k();
            if (tooltipDTO != null) {
                interfaceC3978p0.setValue(tooltipDTO);
            }
            TooltipDTO ProfileIconButtonTooltip$lambda$1 = ProfileIconButtonTooltip$lambda$1(interfaceC3978p0);
            if (ProfileIconButtonTooltip$lambda$1 == null) {
                J0 m02 = u11.m0();
                if (m02 != null) {
                    m02.G(new ProfileIconButtonTooltipKt$ProfileIconButtonTooltip$tooltip$1(tooltipDTO, num, anchorView, z11, z12, properties, function0, onCloseClick, i11));
                    return;
                }
                return;
            }
            iconButtonV3View = anchorView;
            z13 = z11;
            TooltipDTO.BeakPosition beakPosition = ProfileIconButtonTooltip$lambda$1.getBeakPosition();
            if (beakPosition == null) {
                beakPosition = TooltipDTO.INSTANCE.getDefaultBeakPosition();
            }
            UniPaddingToken leftMargin = ProfileIconButtonTooltip$lambda$1.getLeftMargin();
            if (leftMargin == null) {
                leftMargin = TooltipDTO.INSTANCE.getDefaultRightMargin();
            }
            float dp = TokensExtKt.getDp(leftMargin);
            UniPaddingToken rightMargin = ProfileIconButtonTooltip$lambda$1.getRightMargin();
            if (rightMargin == null) {
                rightMargin = TooltipDTO.INSTANCE.getDefaultRightMargin();
            }
            float dp2 = TokensExtKt.getDp(rightMargin);
            K k11 = new K();
            d dVar = (d) u11.m(K0.e());
            k11.f71785a = dVar.Y0(dp);
            int Y02 = dVar.Y0(dp2);
            Unit unit = Unit.f71690a;
            u11.o(-1568727329);
            Object C12 = u11.C();
            if (C12 == InterfaceC3967k.a.a()) {
                C12 = C3956f1.a(0);
                u11.x(C12);
            }
            InterfaceC3972m0 interfaceC3972m0 = (InterfaceC3972m0) C12;
            u11.k();
            u11.o(-1568725127);
            boolean n11 = ((i12 & 896) == 256 || ((i12 & UserVerificationMethods.USER_VERIFY_NONE) != 0 && u11.n(iconButtonV3View))) | u11.n(beakPosition) | u11.r(k11.f71785a) | u11.r(Y02);
            Object C13 = u11.C();
            if (n11 || C13 == InterfaceC3967k.a.a()) {
                C13 = new AndroidViewTooltipPositionProvider(iconButtonV3View, beakPosition, k11.f71785a, Y02);
                u11.x(C13);
            }
            AndroidViewTooltipPositionProvider androidViewTooltipPositionProvider = (AndroidViewTooltipPositionProvider) C13;
            u11.k();
            A1<Integer> beakOffset = androidViewTooltipPositionProvider.getBeakOffset();
            Boolean valueOf = Boolean.valueOf(z13);
            u11.o(-1568712516);
            boolean z14 = ((i12 & 7168) == 2048) | ((i12 & 112) == 32) | ((3670016 & i12) == 1048576);
            Object C14 = u11.C();
            if (z14 || C14 == InterfaceC3967k.a.a()) {
                C14 = new ProfileIconButtonTooltipKt$ProfileIconButtonTooltip$2$1(z13, num, function0, null);
                u11.x(C14);
            }
            u11.k();
            int i13 = (i12 >> 9) & 14;
            TooltipDTO.Companion companion = TooltipDTO.INSTANCE;
            Q.f(valueOf, ProfileIconButtonTooltip$lambda$1, num, (Function2) C14, u11);
            D0 g10 = H0.g(Boolean.valueOf(z13), "ProfileIconButtonTooltipTransition", u11, i13 | 48);
            ProfileIconButtonTooltipKt$ProfileIconButtonTooltip$alpha$2 profileIconButtonTooltipKt$ProfileIconButtonTooltip$alpha$2 = ProfileIconButtonTooltipKt$ProfileIconButtonTooltip$alpha$2.INSTANCE;
            U0 b11 = W0.b();
            boolean booleanValue = ((Boolean) g10.h()).booleanValue();
            u11.o(531495394);
            float f7 = booleanValue ? 1.0f : 0.0f;
            u11.k();
            Float valueOf2 = Float.valueOf(f7);
            boolean booleanValue2 = ((Boolean) g10.n()).booleanValue();
            u11.o(531495394);
            float f11 = booleanValue2 ? 1.0f : 0.0f;
            u11.k();
            Float valueOf3 = Float.valueOf(f11);
            H<Float> invoke = profileIconButtonTooltipKt$ProfileIconButtonTooltip$alpha$2.invoke((ProfileIconButtonTooltipKt$ProfileIconButtonTooltip$alpha$2) g10.m(), (D0.b) u11, (C3969l) 0);
            TooltipDTO.BeakPosition beakPosition2 = beakPosition;
            D0.d d11 = H0.d(g10, valueOf2, valueOf3, invoke, b11, u11, 196608);
            ProfileIconButtonTooltipKt$ProfileIconButtonTooltip$scale$2 profileIconButtonTooltipKt$ProfileIconButtonTooltip$scale$2 = ProfileIconButtonTooltipKt$ProfileIconButtonTooltip$scale$2.INSTANCE;
            U0 b12 = W0.b();
            boolean booleanValue3 = ((Boolean) g10.h()).booleanValue();
            u11.o(826874998);
            float f12 = booleanValue3 ? 1.0f : 0.0f;
            u11.k();
            Float valueOf4 = Float.valueOf(f12);
            boolean booleanValue4 = ((Boolean) g10.n()).booleanValue();
            u11.o(826874998);
            float f13 = booleanValue4 ? 1.0f : 0.0f;
            u11.k();
            D0.d d12 = H0.d(g10, valueOf4, Float.valueOf(f13), profileIconButtonTooltipKt$ProfileIconButtonTooltip$scale$2.invoke((ProfileIconButtonTooltipKt$ProfileIconButtonTooltip$scale$2) g10.m(), (D0.b) u11, (C3969l) 0), b12, u11, 196608);
            ProfileIconButtonTooltipKt$ProfileIconButtonTooltip$rotation$2 profileIconButtonTooltipKt$ProfileIconButtonTooltip$rotation$2 = ProfileIconButtonTooltipKt$ProfileIconButtonTooltip$rotation$2.INSTANCE;
            U0 b13 = W0.b();
            boolean booleanValue5 = ((Boolean) g10.h()).booleanValue();
            u11.o(1668306842);
            float f14 = booleanValue5 ? 0.0f : 10.0f;
            u11.k();
            Float valueOf5 = Float.valueOf(f14);
            boolean booleanValue6 = ((Boolean) g10.n()).booleanValue();
            u11.o(1668306842);
            float f15 = booleanValue6 ? 0.0f : 10.0f;
            u11.k();
            D0.d d13 = H0.d(g10, valueOf5, Float.valueOf(f15), profileIconButtonTooltipKt$ProfileIconButtonTooltip$rotation$2.invoke((ProfileIconButtonTooltipKt$ProfileIconButtonTooltip$rotation$2) g10.m(), (D0.b) u11, (C3969l) 0), b13, u11, 196608);
            c3969l = u11;
            c3969l.o(-1568623993);
            if (z12) {
                e.a aVar = e.f40358c0;
                c3969l.o(-1568622117);
                Object C15 = c3969l.C();
                if (C15 == InterfaceC3967k.a.a()) {
                    C15 = new ProfileIconButtonTooltipKt$ProfileIconButtonTooltip$animatedModifier$1$1(interfaceC3972m0);
                    c3969l.x(C15);
                }
                c3969l.k();
                e a12 = g.a(aVar, (Function1) C15);
                c3969l.o(-1568619981);
                boolean n12 = c3969l.n(d12) | c3969l.n(d13) | c3969l.n(beakPosition2) | c3969l.n(beakOffset) | c3969l.r(k11.f71785a);
                Object C16 = c3969l.C();
                if (n12 || C16 == InterfaceC3967k.a.a()) {
                    C16 = new ProfileIconButtonTooltipKt$ProfileIconButtonTooltip$animatedModifier$2$1(beakPosition2, k11, d12, d13, beakOffset, interfaceC3972m0);
                    c3969l.x(C16);
                }
                c3969l.k();
                a11 = a.a(a12, (Function1) C16);
            } else {
                a11 = C6981a.a(e.f40358c0, ProfileIconButtonTooltip$lambda$11(d11));
            }
            e eVar = a11;
            c3969l.k();
            if (!z12 ? !(z13 || ProfileIconButtonTooltip$lambda$11(d11) > 0.0f) : !(z13 || ((Boolean) g10.h()).booleanValue())) {
                UniThemeKt.UniTheme(false, c.c(2026786219, new ProfileIconButtonTooltipKt$ProfileIconButtonTooltip$3(ProfileIconButtonTooltip$lambda$1, eVar, androidViewTooltipPositionProvider, properties, function0, onCloseClick), c3969l), c3969l, 48, 1);
            }
        }
        J0 m03 = c3969l.m0();
        if (m03 != null) {
            m03.G(new ProfileIconButtonTooltipKt$ProfileIconButtonTooltip$4(tooltipDTO, num, iconButtonV3View, z13, z12, properties, function0, onCloseClick, i11));
        }
    }

    private static final TooltipDTO ProfileIconButtonTooltip$lambda$1(InterfaceC3978p0<TooltipDTO> interfaceC3978p0) {
        return interfaceC3978p0.getValue();
    }

    private static final float ProfileIconButtonTooltip$lambda$11(A1<Float> a12) {
        return a12.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float ProfileIconButtonTooltip$lambda$13(A1<Float> a12) {
        return a12.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float ProfileIconButtonTooltip$lambda$15(A1<Float> a12) {
        return a12.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int ProfileIconButtonTooltip$lambda$8(A1<Integer> a12) {
        return a12.getValue().intValue();
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

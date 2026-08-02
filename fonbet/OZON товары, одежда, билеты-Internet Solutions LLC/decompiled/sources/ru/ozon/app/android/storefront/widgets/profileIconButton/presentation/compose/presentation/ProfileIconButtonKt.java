package ru.ozon.app.android.storefront.widgets.profileIconButton.presentation.compose.presentation;

import B1.B;
import B1.U;
import B1.V;
import B1.W;
import B1.Y;
import B1.m0;
import D1.InterfaceC2801g;
import Ep.a;
import Fr.g;
import I1.o;
import Pk0.h;
import S0.A0;
import S0.C3969l;
import S0.D1;
import S0.F1;
import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import S0.J0;
import S0.Q;
import S0.n1;
import T7.E;
import WZ.l;
import Z1.b;
import Z1.d;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.K0;
import b00.f;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.widgets.profileIconButton.data.IconTooltipDto;
import ru.ozon.app.android.storefront.widgets.profileIconButton.data.PaddingOption;
import ru.ozon.app.android.storefront.widgets.profileIconButton.presentation.ProfileIconButtonVO;
import ru.ozon.uni.android.ds.compose.component.button.DsIconButtonAtomKt;
import ru.ozon.uni.android.ds.compose.component.indicator.DsIndicatorAtomKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.common.TooltipDTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.indicator.IndicatorDTO;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001am\u0010\r\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0014\u0010\t\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\u00020\u00042\u0014\u0010\n\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\u00060\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000bH\u0001¢\u0006\u0004\b\r\u0010\u000e\u001a\u0095\u0001\u0010\u0015\u001a\u00020\u00062\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0001\u001a\u00020\u00002\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u00022\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\b2\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\u00020\u00042\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\u00060\u00042\u0016\b\u0002\u0010\u0014\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0004\u0012\u00020\u00060\u0004H\u0003¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u001a²\u0006\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u00138\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0011\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u00188\n@\nX\u008a\u008e\u0002"}, d2 = {"Lru/ozon/app/android/storefront/widgets/profileIconButton/presentation/ProfileIconButtonVO;", "state", "", "isRichTooltipAnimationEnabled", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "onClick", "", "shouldShowTooltip", "onTooltipShown", "Lkotlin/Function0;", "onTooltipDismiss", "ProfileIconButton", "(Lru/ozon/app/android/storefront/widgets/profileIconButton/presentation/ProfileIconButtonVO;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;LS0/k;I)V", "Landroidx/compose/ui/e;", "modifier", "isWidgetVisible", "activeTooltipKey", "Lru/ozon/app/android/storefront/widgets/profileIconButton/presentation/compose/presentation/ActiveTooltip;", "onTooltipRequest", "ProfileIconButtonContent", "(Landroidx/compose/ui/e;Lru/ozon/app/android/storefront/widgets/profileIconButton/presentation/ProfileIconButtonVO;Lkotlin/jvm/functions/Function1;ZLjava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;LS0/k;II)V", "activeTooltip", "LB1/B;", "tooltipAnchorCoordinates", "storefront_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ProfileIconButtonKt {
    public static final void ProfileIconButton(@NotNull ProfileIconButtonVO state, boolean z11, @NotNull Function1<? super AtomAction, Unit> onClick, @NotNull Function1<? super String, Boolean> shouldShowTooltip, @NotNull Function1<? super String, Unit> onTooltipShown, @NotNull Function0<Unit> onTooltipDismiss, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        ProfileIconButtonVO profileIconButtonVO;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(shouldShowTooltip, "shouldShowTooltip");
        Intrinsics.checkNotNullParameter(onTooltipShown, "onTooltipShown");
        Intrinsics.checkNotNullParameter(onTooltipDismiss, "onTooltipDismiss");
        C3969l u11 = interfaceC3967k.u(-1123342382);
        if ((i11 & 6) == 0) {
            i12 = ((i11 & 8) == 0 ? u11.n(state) : u11.F(state) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.p(z11) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.F(onClick) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i11 & 3072) == 0) {
            i12 |= u11.F(shouldShowTooltip) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i11 & 24576) == 0) {
            i12 |= u11.F(onTooltipShown) ? 16384 : 8192;
        }
        if ((196608 & i11) == 0) {
            i12 |= u11.F(onTooltipDismiss) ? 131072 : 65536;
        }
        if ((74899 & i12) == 74898 && u11.b()) {
            u11.j();
            profileIconButtonVO = state;
        } else {
            u11.o(9261607);
            Object C11 = u11.C();
            if (C11 == InterfaceC3967k.a.a()) {
                C11 = n1.f(null, D1.f25195a);
                u11.x(C11);
            }
            InterfaceC3978p0 interfaceC3978p0 = (InterfaceC3978p0) C11;
            Object b11 = h.b(u11, 9264055);
            if (b11 == InterfaceC3967k.a.a()) {
                b11 = n1.f(Boolean.TRUE, D1.f25195a);
                u11.x(b11);
            }
            u11.k();
            l lVar = (l) u11.m(f.e());
            boolean ProfileIconButton$lambda$4 = ProfileIconButton$lambda$4((InterfaceC3978p0) b11);
            ActiveTooltip ProfileIconButton$lambda$1 = ProfileIconButton$lambda$1(interfaceC3978p0);
            String key = ProfileIconButton$lambda$1 != null ? ProfileIconButton$lambda$1.getKey() : null;
            u11.o(9274882);
            boolean z12 = (57344 & i12) == 16384;
            Object C12 = u11.C();
            if (z12 || C12 == InterfaceC3967k.a.a()) {
                C12 = new ProfileIconButtonKt$ProfileIconButton$1$1(onTooltipShown);
                u11.x(C12);
            }
            Function1 function1 = (Function1) C12;
            Object b12 = h.b(u11, 9277196);
            if (b12 == InterfaceC3967k.a.a()) {
                b12 = new ProfileIconButtonKt$ProfileIconButton$2$1(interfaceC3978p0);
                u11.x(b12);
            }
            u11.k();
            int i13 = i12;
            ProfileIconButtonContent(null, state, onClick, ProfileIconButton$lambda$4, key, shouldShowTooltip, function1, (Function1) b12, u11, (i12 & 896) | ((IconButtonV3DTO.$stable | TooltipDTO.$stable) << 3) | 12582912 | ((i12 << 3) & 112) | ((i12 << 6) & 458752), 1);
            profileIconButtonVO = state;
            ActiveTooltip ProfileIconButton$lambda$12 = ProfileIconButton$lambda$1(interfaceC3978p0);
            u11.o(9284791);
            boolean F11 = ((i13 & 14) == 4 || ((i13 & 8) != 0 && u11.F(profileIconButtonVO))) | u11.F(lVar) | ((i13 & 458752) == 131072);
            Object C13 = u11.C();
            if (F11 || C13 == InterfaceC3967k.a.a()) {
                C13 = new ProfileIconButtonKt$ProfileIconButton$3$1(onTooltipDismiss, interfaceC3978p0, profileIconButtonVO, lVar);
                u11.x(C13);
            }
            u11.k();
            ProfileIconButtonTooltipKt.ProfileIconButtonTooltip(ProfileIconButton$lambda$12, z11, onTooltipDismiss, (Function0) C13, u11, (i13 & 112) | ((i13 >> 9) & 896));
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new ProfileIconButtonKt$ProfileIconButton$4(profileIconButtonVO, z11, onClick, shouldShowTooltip, onTooltipShown, onTooltipDismiss, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ActiveTooltip ProfileIconButton$lambda$1(InterfaceC3978p0<ActiveTooltip> interfaceC3978p0) {
        return interfaceC3978p0.getValue();
    }

    private static final boolean ProfileIconButton$lambda$4(InterfaceC3978p0<Boolean> interfaceC3978p0) {
        return interfaceC3978p0.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:102:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0428  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ProfileIconButtonContent(e eVar, ProfileIconButtonVO profileIconButtonVO, Function1<? super AtomAction, Unit> function1, boolean z11, String str, Function1<? super String, Boolean> function12, Function1<? super String, Unit> function13, Function1<? super ActiveTooltip, Unit> function14, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        e eVar2;
        int i13;
        Function1<? super AtomAction, Unit> function15;
        int i14;
        boolean z12;
        int i15;
        String str2;
        int i16;
        Function1<? super String, Boolean> function16;
        int i17;
        Function1<? super String, Unit> function17;
        int i18;
        Function1<? super String, Boolean> function18;
        Function1<? super String, Unit> function19;
        Function1<? super ActiveTooltip, Unit> function110;
        Object C11;
        boolean r11;
        Object C12;
        int I11;
        e eVar3;
        Object b11;
        C3969l c3969l;
        IndicatorDTO indicator;
        boolean z13;
        IconTooltipDto iconTooltip;
        String str3;
        Function1<? super ActiveTooltip, Unit> function111;
        String str4;
        Function1<? super String, Unit> function112;
        e eVar4;
        Function1<? super AtomAction, Unit> function113;
        boolean z14;
        Integer bottomMargin;
        Integer rightMargin;
        Integer leftMargin;
        Integer topMargin;
        J0 m02;
        C3969l u11 = interfaceC3967k.u(-675123290);
        int i19 = i12 & 1;
        if (i19 != 0) {
            i13 = i11 | 6;
            eVar2 = eVar;
        } else if ((i11 & 6) == 0) {
            eVar2 = eVar;
            i13 = (u11.n(eVar2) ? 4 : 2) | i11;
        } else {
            eVar2 = eVar;
            i13 = i11;
        }
        if ((2 & i12) != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= (i11 & 64) == 0 ? u11.n(profileIconButtonVO) : u11.F(profileIconButtonVO) ? 32 : 16;
        }
        int i21 = i12 & 4;
        if (i21 != 0) {
            i13 |= 384;
        } else if ((i11 & 384) == 0) {
            function15 = function1;
            i13 |= u11.F(function15) ? 256 : 128;
            i14 = i12 & 8;
            if (i14 == 0) {
                i13 |= 3072;
            } else if ((i11 & 3072) == 0) {
                z12 = z11;
                i13 |= u11.p(z12) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
                i15 = 16 & i12;
                if (i15 != 0) {
                    i13 |= 24576;
                } else if ((i11 & 24576) == 0) {
                    str2 = str;
                    i13 |= u11.n(str2) ? 16384 : 8192;
                    i16 = i12 & 32;
                    if (i16 == 0) {
                        i13 |= 196608;
                        function16 = function12;
                    } else {
                        function16 = function12;
                        if ((i11 & 196608) == 0) {
                            i13 |= u11.F(function16) ? 131072 : 65536;
                        }
                    }
                    i17 = i12 & 64;
                    if (i17 == 0) {
                        i13 |= 1572864;
                        function17 = function13;
                    } else {
                        function17 = function13;
                        if ((i11 & 1572864) == 0) {
                            i13 |= u11.F(function17) ? 1048576 : 524288;
                        }
                    }
                    i18 = 128 & i12;
                    if (i18 == 0) {
                        i13 |= 12582912;
                    } else if ((i11 & 12582912) == 0) {
                        i13 |= u11.F(function14) ? 8388608 : 4194304;
                    }
                    if ((i13 & 4793491) == 4793490 || !u11.b()) {
                        if (i19 != 0) {
                            eVar2 = e.f40358c0;
                        }
                        if (i21 != 0) {
                            u11.o(-362697307);
                            Object C13 = u11.C();
                            if (C13 == InterfaceC3967k.a.a()) {
                                C13 = ProfileIconButtonKt$ProfileIconButtonContent$1$1.INSTANCE;
                                u11.x(C13);
                            }
                            u11.k();
                            function15 = (Function1) C13;
                        }
                        if (i14 != 0) {
                            z12 = true;
                        }
                        if (i15 != 0) {
                            str2 = null;
                        }
                        if (i16 == 0) {
                            u11.o(-362693300);
                            Object C14 = u11.C();
                            if (C14 == InterfaceC3967k.a.a()) {
                                C14 = ProfileIconButtonKt$ProfileIconButtonContent$2$1.INSTANCE;
                                u11.x(C14);
                            }
                            u11.k();
                            function18 = (Function1) C14;
                        } else {
                            function18 = function16;
                        }
                        if (i17 == 0) {
                            u11.o(-362691675);
                            Object C15 = u11.C();
                            if (C15 == InterfaceC3967k.a.a()) {
                                C15 = ProfileIconButtonKt$ProfileIconButtonContent$3$1.INSTANCE;
                                u11.x(C15);
                            }
                            u11.k();
                            function19 = (Function1) C15;
                        } else {
                            function19 = function17;
                        }
                        if (i18 == 0) {
                            u11.o(-362689979);
                            Object C16 = u11.C();
                            if (C16 == InterfaceC3967k.a.a()) {
                                C16 = ProfileIconButtonKt$ProfileIconButtonContent$4$1.INSTANCE;
                                u11.x(C16);
                            }
                            u11.k();
                            function110 = (Function1) C16;
                        } else {
                            function110 = function14;
                        }
                        u11.o(-362688520);
                        C11 = u11.C();
                        if (C11 == InterfaceC3967k.a.a()) {
                            C11 = n1.f(null, D1.f25195a);
                            u11.x(C11);
                        }
                        InterfaceC3978p0 interfaceC3978p0 = (InterfaceC3978p0) C11;
                        u11.k();
                        d dVar = (d) u11.m(K0.e());
                        PaddingOption options = profileIconButtonVO.getOptions();
                        final int Y02 = dVar.Y0((options != null || (topMargin = options.getTopMargin()) == null) ? 0 : topMargin.intValue());
                        PaddingOption options2 = profileIconButtonVO.getOptions();
                        final int Y03 = dVar.Y0((options2 != null || (leftMargin = options2.getLeftMargin()) == null) ? 0 : leftMargin.intValue());
                        PaddingOption options3 = profileIconButtonVO.getOptions();
                        final int Y04 = dVar.Y0((options3 != null || (rightMargin = options3.getRightMargin()) == null) ? 0 : rightMargin.intValue());
                        PaddingOption options4 = profileIconButtonVO.getOptions();
                        final int Y05 = dVar.Y0((options4 != null || (bottomMargin = options4.getBottomMargin()) == null) ? 0 : bottomMargin.intValue());
                        final int Y06 = dVar.Y0(4);
                        final int Y07 = dVar.Y0(1);
                        u11.o(-362639415);
                        r11 = u11.r(Y03) | u11.r(Y02) | u11.r(Y04) | u11.r(Y05) | u11.r(Y06) | u11.r(Y07);
                        C12 = u11.C();
                        if (!r11 || C12 == InterfaceC3967k.a.a()) {
                            C12 = new V() { // from class: ru.ozon.app.android.storefront.widgets.profileIconButton.presentation.compose.presentation.ProfileIconButtonKt$ProfileIconButtonContent$5$1

                                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LB1/m0$a;", "", "invoke", "(LB1/m0$a;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
                                /* renamed from: ru.ozon.app.android.storefront.widgets.profileIconButton.presentation.compose.presentation.ProfileIconButtonKt$ProfileIconButtonContent$5$1$1, reason: invalid class name */
                                static final class AnonymousClass1 extends AbstractC7737t implements Function1<m0.a, Unit> {
                                    final /* synthetic */ m0 $buttonPlaceable;
                                    final /* synthetic */ int $iconLeft;
                                    final /* synthetic */ int $iconTop;
                                    final /* synthetic */ m0 $indicatorPlaceable;
                                    final /* synthetic */ int $indicatorRightOffsetPx;
                                    final /* synthetic */ int $indicatorTopOffsetPx;

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    AnonymousClass1(m0 m0Var, int i11, int i12, m0 m0Var2, int i13, int i14) {
                                        super(1);
                                        this.$buttonPlaceable = m0Var;
                                        this.$iconLeft = i11;
                                        this.$iconTop = i12;
                                        this.$indicatorPlaceable = m0Var2;
                                        this.$indicatorRightOffsetPx = i13;
                                        this.$indicatorTopOffsetPx = i14;
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(m0.a aVar) {
                                        invoke2(aVar);
                                        return Unit.f71690a;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(m0.a layout) {
                                        Intrinsics.checkNotNullParameter(layout, "$this$layout");
                                        layout.h(this.$buttonPlaceable, this.$iconLeft, this.$iconTop, 0.0f);
                                        m0 m0Var = this.$indicatorPlaceable;
                                        if (m0Var != null) {
                                            layout.h(m0Var, (this.$buttonPlaceable.u0() + this.$iconLeft) - this.$indicatorRightOffsetPx, this.$iconTop - this.$indicatorTopOffsetPx, 0.0f);
                                        }
                                    }
                                }

                                @Override // B1.V
                                /* renamed from: measure-3p2s80s */
                                public final W mo2measure3p2s80s(Y Layout, List<? extends U> measurables, long j11) {
                                    W z02;
                                    Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
                                    Intrinsics.checkNotNullParameter(measurables, "measurables");
                                    m0 a02 = ((U) C7714v.K(measurables)).a0(b.c(0, 0, 0, 0, 10, j11));
                                    U u12 = (U) C7714v.Q(1, measurables);
                                    m0 a03 = u12 != null ? u12.a0(b.c(0, 0, 0, 0, 10, j11)) : null;
                                    int u02 = a03 != null ? a03.u0() : 0;
                                    int l02 = a03 != null ? a03.l0() : 0;
                                    z02 = Layout.z0(a02.u0() + Y03 + Y04 + u02, a02.l0() + Y02 + Y05 + l02, kotlin.collections.U.c(), new AnonymousClass1(a02, (u02 / 2) + Y03, (l02 / 2) + Y02, a03, Y06, Y07));
                                    return z02;
                                }
                            };
                            u11.x(C12);
                        }
                        V v11 = (V) C12;
                        u11.k();
                        int i22 = i13 << 3;
                        I11 = u11.I();
                        A0 d11 = u11.d();
                        e f7 = c.f(u11, eVar2);
                        Function0 a11 = g.a(InterfaceC2801g.f5440U, u11);
                        if (u11.t()) {
                            u11.e();
                        } else {
                            u11.H(a11);
                        }
                        Function2 f11 = E.f(u11, v11, u11, d11);
                        if (!u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                            a.d(I11, u11, I11, f11);
                        }
                        F1.b(u11, f7, InterfaceC2801g.a.f());
                        u11.o(-1512240342);
                        if (profileIconButtonVO.getIconTooltip() == null) {
                            e.a aVar = e.f40358c0;
                            u11.o(-1512237953);
                            Object C17 = u11.C();
                            if (C17 == InterfaceC3967k.a.a()) {
                                C17 = new ProfileIconButtonKt$ProfileIconButtonContent$6$iconModifier$1$1(interfaceC3978p0);
                                u11.x(C17);
                            }
                            u11.k();
                            eVar3 = androidx.compose.ui.layout.c.a(aVar, (Function1) C17);
                        } else {
                            eVar3 = e.f40358c0;
                        }
                        b11 = h.b(u11, -1512230449);
                        if (b11 == InterfaceC3967k.a.a()) {
                            b11 = ProfileIconButtonKt$ProfileIconButtonContent$6$1$1.INSTANCE;
                            u11.x(b11);
                        }
                        u11.k();
                        DsIconButtonAtomKt.DsIconButtonAtom(profileIconButtonVO.getIconButton(), o.c(eVar3, false, (Function1) b11), false, function15, u11, (i22 & 7168) | IconButtonV3DTO.$stable, 4);
                        c3969l = u11;
                        indicator = profileIconButtonVO.getIndicator();
                        c3969l.o(-1512223863);
                        if (indicator != null) {
                            z13 = false;
                        } else {
                            e.a aVar2 = e.f40358c0;
                            c3969l.o(-2111242685);
                            Object C18 = c3969l.C();
                            if (C18 == InterfaceC3967k.a.a()) {
                                C18 = ProfileIconButtonKt$ProfileIconButtonContent$6$2$1$1.INSTANCE;
                                c3969l.x(C18);
                            }
                            c3969l.k();
                            z13 = false;
                            DsIndicatorAtomKt.DsIndicatorAtom(indicator, o.c(aVar2, false, (Function1) C18), c3969l, 0, 0);
                            Unit unit = Unit.f71690a;
                        }
                        c3969l.k();
                        c3969l.f();
                        iconTooltip = profileIconButtonVO.getIconTooltip();
                        if (iconTooltip != null) {
                            str3 = str2;
                        } else {
                            String tooltipKey = iconTooltip.getTooltipKey();
                            boolean d12 = Intrinsics.d(str2, tooltipKey);
                            boolean z15 = (profileIconButtonVO.getIsTooltipClosed() || !z12 || ProfileIconButtonContent$lambda$14(interfaceC3978p0) == null) ? z13 : true;
                            Boolean valueOf = Boolean.valueOf(z15);
                            Boolean valueOf2 = Boolean.valueOf(d12);
                            B ProfileIconButtonContent$lambda$14 = ProfileIconButtonContent$lambda$14(interfaceC3978p0);
                            c3969l.o(-1512172807);
                            str3 = str2;
                            boolean p11 = ((i13 & 29360128) == 8388608) | c3969l.p(z15) | c3969l.p(d12) | ((57344 & i13) == 16384) | ((458752 & i13) == 131072) | c3969l.n(tooltipKey) | c3969l.F(iconTooltip) | ((3670016 & i13) == 1048576);
                            Object C19 = c3969l.C();
                            if (p11 || C19 == InterfaceC3967k.a.a()) {
                                C19 = new ProfileIconButtonKt$ProfileIconButtonContent$7$1$1(z15, d12, function110, str3, function18, tooltipKey, iconTooltip, function19, interfaceC3978p0, null);
                                c3969l.x(C19);
                            }
                            c3969l.k();
                            Q.f(valueOf, valueOf2, ProfileIconButtonContent$lambda$14, (Function2) C19, c3969l);
                            Unit unit2 = Unit.f71690a;
                        }
                        function111 = function110;
                        str4 = str3;
                        function16 = function18;
                        function112 = function19;
                        eVar4 = eVar2;
                        function113 = function15;
                        z14 = z12;
                    } else {
                        u11.j();
                        c3969l = u11;
                        function112 = function17;
                        function111 = function14;
                        str4 = str2;
                        eVar4 = eVar2;
                        z14 = z12;
                        function113 = function15;
                    }
                    m02 = c3969l.m0();
                    if (m02 == null) {
                        m02.G(new ProfileIconButtonKt$ProfileIconButtonContent$8(eVar4, profileIconButtonVO, function113, z14, str4, function16, function112, function111, i11, i12));
                        return;
                    }
                    return;
                }
                str2 = str;
                i16 = i12 & 32;
                if (i16 == 0) {
                }
                i17 = i12 & 64;
                if (i17 == 0) {
                }
                i18 = 128 & i12;
                if (i18 == 0) {
                }
                if ((i13 & 4793491) == 4793490) {
                }
                if (i19 != 0) {
                }
                if (i21 != 0) {
                }
                if (i14 != 0) {
                }
                if (i15 != 0) {
                }
                if (i16 == 0) {
                }
                if (i17 == 0) {
                }
                if (i18 == 0) {
                }
                u11.o(-362688520);
                C11 = u11.C();
                if (C11 == InterfaceC3967k.a.a()) {
                }
                InterfaceC3978p0 interfaceC3978p02 = (InterfaceC3978p0) C11;
                u11.k();
                d dVar2 = (d) u11.m(K0.e());
                PaddingOption options5 = profileIconButtonVO.getOptions();
                final int Y022 = dVar2.Y0((options5 != null || (topMargin = options5.getTopMargin()) == null) ? 0 : topMargin.intValue());
                PaddingOption options22 = profileIconButtonVO.getOptions();
                final int Y032 = dVar2.Y0((options22 != null || (leftMargin = options22.getLeftMargin()) == null) ? 0 : leftMargin.intValue());
                PaddingOption options32 = profileIconButtonVO.getOptions();
                final int Y042 = dVar2.Y0((options32 != null || (rightMargin = options32.getRightMargin()) == null) ? 0 : rightMargin.intValue());
                PaddingOption options42 = profileIconButtonVO.getOptions();
                final int Y052 = dVar2.Y0((options42 != null || (bottomMargin = options42.getBottomMargin()) == null) ? 0 : bottomMargin.intValue());
                final int Y062 = dVar2.Y0(4);
                final int Y072 = dVar2.Y0(1);
                u11.o(-362639415);
                r11 = u11.r(Y032) | u11.r(Y022) | u11.r(Y042) | u11.r(Y052) | u11.r(Y062) | u11.r(Y072);
                C12 = u11.C();
                if (!r11) {
                }
                C12 = new V() { // from class: ru.ozon.app.android.storefront.widgets.profileIconButton.presentation.compose.presentation.ProfileIconButtonKt$ProfileIconButtonContent$5$1

                    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LB1/m0$a;", "", "invoke", "(LB1/m0$a;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
                    /* renamed from: ru.ozon.app.android.storefront.widgets.profileIconButton.presentation.compose.presentation.ProfileIconButtonKt$ProfileIconButtonContent$5$1$1, reason: invalid class name */
                    static final class AnonymousClass1 extends AbstractC7737t implements Function1<m0.a, Unit> {
                        final /* synthetic */ m0 $buttonPlaceable;
                        final /* synthetic */ int $iconLeft;
                        final /* synthetic */ int $iconTop;
                        final /* synthetic */ m0 $indicatorPlaceable;
                        final /* synthetic */ int $indicatorRightOffsetPx;
                        final /* synthetic */ int $indicatorTopOffsetPx;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        AnonymousClass1(m0 m0Var, int i11, int i12, m0 m0Var2, int i13, int i14) {
                            super(1);
                            this.$buttonPlaceable = m0Var;
                            this.$iconLeft = i11;
                            this.$iconTop = i12;
                            this.$indicatorPlaceable = m0Var2;
                            this.$indicatorRightOffsetPx = i13;
                            this.$indicatorTopOffsetPx = i14;
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(m0.a aVar) {
                            invoke2(aVar);
                            return Unit.f71690a;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(m0.a layout) {
                            Intrinsics.checkNotNullParameter(layout, "$this$layout");
                            layout.h(this.$buttonPlaceable, this.$iconLeft, this.$iconTop, 0.0f);
                            m0 m0Var = this.$indicatorPlaceable;
                            if (m0Var != null) {
                                layout.h(m0Var, (this.$buttonPlaceable.u0() + this.$iconLeft) - this.$indicatorRightOffsetPx, this.$iconTop - this.$indicatorTopOffsetPx, 0.0f);
                            }
                        }
                    }

                    @Override // B1.V
                    /* renamed from: measure-3p2s80s */
                    public final W mo2measure3p2s80s(Y Layout, List<? extends U> measurables, long j11) {
                        W z02;
                        Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
                        Intrinsics.checkNotNullParameter(measurables, "measurables");
                        m0 a02 = ((U) C7714v.K(measurables)).a0(b.c(0, 0, 0, 0, 10, j11));
                        U u12 = (U) C7714v.Q(1, measurables);
                        m0 a03 = u12 != null ? u12.a0(b.c(0, 0, 0, 0, 10, j11)) : null;
                        int u02 = a03 != null ? a03.u0() : 0;
                        int l02 = a03 != null ? a03.l0() : 0;
                        z02 = Layout.z0(a02.u0() + Y032 + Y042 + u02, a02.l0() + Y022 + Y052 + l02, kotlin.collections.U.c(), new AnonymousClass1(a02, (u02 / 2) + Y032, (l02 / 2) + Y022, a03, Y062, Y072));
                        return z02;
                    }
                };
                u11.x(C12);
                V v112 = (V) C12;
                u11.k();
                int i222 = i13 << 3;
                I11 = u11.I();
                A0 d112 = u11.d();
                e f72 = c.f(u11, eVar2);
                Function0 a112 = g.a(InterfaceC2801g.f5440U, u11);
                if (u11.t()) {
                }
                Function2 f112 = E.f(u11, v112, u11, d112);
                if (!u11.t()) {
                }
                a.d(I11, u11, I11, f112);
                F1.b(u11, f72, InterfaceC2801g.a.f());
                u11.o(-1512240342);
                if (profileIconButtonVO.getIconTooltip() == null) {
                }
                b11 = h.b(u11, -1512230449);
                if (b11 == InterfaceC3967k.a.a()) {
                }
                u11.k();
                DsIconButtonAtomKt.DsIconButtonAtom(profileIconButtonVO.getIconButton(), o.c(eVar3, false, (Function1) b11), false, function15, u11, (i222 & 7168) | IconButtonV3DTO.$stable, 4);
                c3969l = u11;
                indicator = profileIconButtonVO.getIndicator();
                c3969l.o(-1512223863);
                if (indicator != null) {
                }
                c3969l.k();
                c3969l.f();
                iconTooltip = profileIconButtonVO.getIconTooltip();
                if (iconTooltip != null) {
                }
                function111 = function110;
                str4 = str3;
                function16 = function18;
                function112 = function19;
                eVar4 = eVar2;
                function113 = function15;
                z14 = z12;
                m02 = c3969l.m0();
                if (m02 == null) {
                }
            }
            z12 = z11;
            i15 = 16 & i12;
            if (i15 != 0) {
            }
            str2 = str;
            i16 = i12 & 32;
            if (i16 == 0) {
            }
            i17 = i12 & 64;
            if (i17 == 0) {
            }
            i18 = 128 & i12;
            if (i18 == 0) {
            }
            if ((i13 & 4793491) == 4793490) {
            }
            if (i19 != 0) {
            }
            if (i21 != 0) {
            }
            if (i14 != 0) {
            }
            if (i15 != 0) {
            }
            if (i16 == 0) {
            }
            if (i17 == 0) {
            }
            if (i18 == 0) {
            }
            u11.o(-362688520);
            C11 = u11.C();
            if (C11 == InterfaceC3967k.a.a()) {
            }
            InterfaceC3978p0 interfaceC3978p022 = (InterfaceC3978p0) C11;
            u11.k();
            d dVar22 = (d) u11.m(K0.e());
            PaddingOption options52 = profileIconButtonVO.getOptions();
            final int Y0222 = dVar22.Y0((options52 != null || (topMargin = options52.getTopMargin()) == null) ? 0 : topMargin.intValue());
            PaddingOption options222 = profileIconButtonVO.getOptions();
            final int Y0322 = dVar22.Y0((options222 != null || (leftMargin = options222.getLeftMargin()) == null) ? 0 : leftMargin.intValue());
            PaddingOption options322 = profileIconButtonVO.getOptions();
            final int Y0422 = dVar22.Y0((options322 != null || (rightMargin = options322.getRightMargin()) == null) ? 0 : rightMargin.intValue());
            PaddingOption options422 = profileIconButtonVO.getOptions();
            final int Y0522 = dVar22.Y0((options422 != null || (bottomMargin = options422.getBottomMargin()) == null) ? 0 : bottomMargin.intValue());
            final int Y0622 = dVar22.Y0(4);
            final int Y0722 = dVar22.Y0(1);
            u11.o(-362639415);
            r11 = u11.r(Y0322) | u11.r(Y0222) | u11.r(Y0422) | u11.r(Y0522) | u11.r(Y0622) | u11.r(Y0722);
            C12 = u11.C();
            if (!r11) {
            }
            C12 = new V() { // from class: ru.ozon.app.android.storefront.widgets.profileIconButton.presentation.compose.presentation.ProfileIconButtonKt$ProfileIconButtonContent$5$1

                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LB1/m0$a;", "", "invoke", "(LB1/m0$a;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
                /* renamed from: ru.ozon.app.android.storefront.widgets.profileIconButton.presentation.compose.presentation.ProfileIconButtonKt$ProfileIconButtonContent$5$1$1, reason: invalid class name */
                static final class AnonymousClass1 extends AbstractC7737t implements Function1<m0.a, Unit> {
                    final /* synthetic */ m0 $buttonPlaceable;
                    final /* synthetic */ int $iconLeft;
                    final /* synthetic */ int $iconTop;
                    final /* synthetic */ m0 $indicatorPlaceable;
                    final /* synthetic */ int $indicatorRightOffsetPx;
                    final /* synthetic */ int $indicatorTopOffsetPx;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(m0 m0Var, int i11, int i12, m0 m0Var2, int i13, int i14) {
                        super(1);
                        this.$buttonPlaceable = m0Var;
                        this.$iconLeft = i11;
                        this.$iconTop = i12;
                        this.$indicatorPlaceable = m0Var2;
                        this.$indicatorRightOffsetPx = i13;
                        this.$indicatorTopOffsetPx = i14;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(m0.a aVar) {
                        invoke2(aVar);
                        return Unit.f71690a;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(m0.a layout) {
                        Intrinsics.checkNotNullParameter(layout, "$this$layout");
                        layout.h(this.$buttonPlaceable, this.$iconLeft, this.$iconTop, 0.0f);
                        m0 m0Var = this.$indicatorPlaceable;
                        if (m0Var != null) {
                            layout.h(m0Var, (this.$buttonPlaceable.u0() + this.$iconLeft) - this.$indicatorRightOffsetPx, this.$iconTop - this.$indicatorTopOffsetPx, 0.0f);
                        }
                    }
                }

                @Override // B1.V
                /* renamed from: measure-3p2s80s */
                public final W mo2measure3p2s80s(Y Layout, List<? extends U> measurables, long j11) {
                    W z02;
                    Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
                    Intrinsics.checkNotNullParameter(measurables, "measurables");
                    m0 a02 = ((U) C7714v.K(measurables)).a0(b.c(0, 0, 0, 0, 10, j11));
                    U u12 = (U) C7714v.Q(1, measurables);
                    m0 a03 = u12 != null ? u12.a0(b.c(0, 0, 0, 0, 10, j11)) : null;
                    int u02 = a03 != null ? a03.u0() : 0;
                    int l02 = a03 != null ? a03.l0() : 0;
                    z02 = Layout.z0(a02.u0() + Y0322 + Y0422 + u02, a02.l0() + Y0222 + Y0522 + l02, kotlin.collections.U.c(), new AnonymousClass1(a02, (u02 / 2) + Y0322, (l02 / 2) + Y0222, a03, Y0622, Y0722));
                    return z02;
                }
            };
            u11.x(C12);
            V v1122 = (V) C12;
            u11.k();
            int i2222 = i13 << 3;
            I11 = u11.I();
            A0 d1122 = u11.d();
            e f722 = c.f(u11, eVar2);
            Function0 a1122 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
            }
            Function2 f1122 = E.f(u11, v1122, u11, d1122);
            if (!u11.t()) {
            }
            a.d(I11, u11, I11, f1122);
            F1.b(u11, f722, InterfaceC2801g.a.f());
            u11.o(-1512240342);
            if (profileIconButtonVO.getIconTooltip() == null) {
            }
            b11 = h.b(u11, -1512230449);
            if (b11 == InterfaceC3967k.a.a()) {
            }
            u11.k();
            DsIconButtonAtomKt.DsIconButtonAtom(profileIconButtonVO.getIconButton(), o.c(eVar3, false, (Function1) b11), false, function15, u11, (i2222 & 7168) | IconButtonV3DTO.$stable, 4);
            c3969l = u11;
            indicator = profileIconButtonVO.getIndicator();
            c3969l.o(-1512223863);
            if (indicator != null) {
            }
            c3969l.k();
            c3969l.f();
            iconTooltip = profileIconButtonVO.getIconTooltip();
            if (iconTooltip != null) {
            }
            function111 = function110;
            str4 = str3;
            function16 = function18;
            function112 = function19;
            eVar4 = eVar2;
            function113 = function15;
            z14 = z12;
            m02 = c3969l.m0();
            if (m02 == null) {
            }
        }
        function15 = function1;
        i14 = i12 & 8;
        if (i14 == 0) {
        }
        z12 = z11;
        i15 = 16 & i12;
        if (i15 != 0) {
        }
        str2 = str;
        i16 = i12 & 32;
        if (i16 == 0) {
        }
        i17 = i12 & 64;
        if (i17 == 0) {
        }
        i18 = 128 & i12;
        if (i18 == 0) {
        }
        if ((i13 & 4793491) == 4793490) {
        }
        if (i19 != 0) {
        }
        if (i21 != 0) {
        }
        if (i14 != 0) {
        }
        if (i15 != 0) {
        }
        if (i16 == 0) {
        }
        if (i17 == 0) {
        }
        if (i18 == 0) {
        }
        u11.o(-362688520);
        C11 = u11.C();
        if (C11 == InterfaceC3967k.a.a()) {
        }
        InterfaceC3978p0 interfaceC3978p0222 = (InterfaceC3978p0) C11;
        u11.k();
        d dVar222 = (d) u11.m(K0.e());
        PaddingOption options522 = profileIconButtonVO.getOptions();
        final int Y02222 = dVar222.Y0((options522 != null || (topMargin = options522.getTopMargin()) == null) ? 0 : topMargin.intValue());
        PaddingOption options2222 = profileIconButtonVO.getOptions();
        final int Y03222 = dVar222.Y0((options2222 != null || (leftMargin = options2222.getLeftMargin()) == null) ? 0 : leftMargin.intValue());
        PaddingOption options3222 = profileIconButtonVO.getOptions();
        final int Y04222 = dVar222.Y0((options3222 != null || (rightMargin = options3222.getRightMargin()) == null) ? 0 : rightMargin.intValue());
        PaddingOption options4222 = profileIconButtonVO.getOptions();
        final int Y05222 = dVar222.Y0((options4222 != null || (bottomMargin = options4222.getBottomMargin()) == null) ? 0 : bottomMargin.intValue());
        final int Y06222 = dVar222.Y0(4);
        final int Y07222 = dVar222.Y0(1);
        u11.o(-362639415);
        r11 = u11.r(Y03222) | u11.r(Y02222) | u11.r(Y04222) | u11.r(Y05222) | u11.r(Y06222) | u11.r(Y07222);
        C12 = u11.C();
        if (!r11) {
        }
        C12 = new V() { // from class: ru.ozon.app.android.storefront.widgets.profileIconButton.presentation.compose.presentation.ProfileIconButtonKt$ProfileIconButtonContent$5$1

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LB1/m0$a;", "", "invoke", "(LB1/m0$a;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
            /* renamed from: ru.ozon.app.android.storefront.widgets.profileIconButton.presentation.compose.presentation.ProfileIconButtonKt$ProfileIconButtonContent$5$1$1, reason: invalid class name */
            static final class AnonymousClass1 extends AbstractC7737t implements Function1<m0.a, Unit> {
                final /* synthetic */ m0 $buttonPlaceable;
                final /* synthetic */ int $iconLeft;
                final /* synthetic */ int $iconTop;
                final /* synthetic */ m0 $indicatorPlaceable;
                final /* synthetic */ int $indicatorRightOffsetPx;
                final /* synthetic */ int $indicatorTopOffsetPx;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(m0 m0Var, int i11, int i12, m0 m0Var2, int i13, int i14) {
                    super(1);
                    this.$buttonPlaceable = m0Var;
                    this.$iconLeft = i11;
                    this.$iconTop = i12;
                    this.$indicatorPlaceable = m0Var2;
                    this.$indicatorRightOffsetPx = i13;
                    this.$indicatorTopOffsetPx = i14;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(m0.a aVar) {
                    invoke2(aVar);
                    return Unit.f71690a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(m0.a layout) {
                    Intrinsics.checkNotNullParameter(layout, "$this$layout");
                    layout.h(this.$buttonPlaceable, this.$iconLeft, this.$iconTop, 0.0f);
                    m0 m0Var = this.$indicatorPlaceable;
                    if (m0Var != null) {
                        layout.h(m0Var, (this.$buttonPlaceable.u0() + this.$iconLeft) - this.$indicatorRightOffsetPx, this.$iconTop - this.$indicatorTopOffsetPx, 0.0f);
                    }
                }
            }

            @Override // B1.V
            /* renamed from: measure-3p2s80s */
            public final W mo2measure3p2s80s(Y Layout, List<? extends U> measurables, long j11) {
                W z02;
                Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
                Intrinsics.checkNotNullParameter(measurables, "measurables");
                m0 a02 = ((U) C7714v.K(measurables)).a0(b.c(0, 0, 0, 0, 10, j11));
                U u12 = (U) C7714v.Q(1, measurables);
                m0 a03 = u12 != null ? u12.a0(b.c(0, 0, 0, 0, 10, j11)) : null;
                int u02 = a03 != null ? a03.u0() : 0;
                int l02 = a03 != null ? a03.l0() : 0;
                z02 = Layout.z0(a02.u0() + Y03222 + Y04222 + u02, a02.l0() + Y02222 + Y05222 + l02, kotlin.collections.U.c(), new AnonymousClass1(a02, (u02 / 2) + Y03222, (l02 / 2) + Y02222, a03, Y06222, Y07222));
                return z02;
            }
        };
        u11.x(C12);
        V v11222 = (V) C12;
        u11.k();
        int i22222 = i13 << 3;
        I11 = u11.I();
        A0 d11222 = u11.d();
        e f7222 = c.f(u11, eVar2);
        Function0 a11222 = g.a(InterfaceC2801g.f5440U, u11);
        if (u11.t()) {
        }
        Function2 f11222 = E.f(u11, v11222, u11, d11222);
        if (!u11.t()) {
        }
        a.d(I11, u11, I11, f11222);
        F1.b(u11, f7222, InterfaceC2801g.a.f());
        u11.o(-1512240342);
        if (profileIconButtonVO.getIconTooltip() == null) {
        }
        b11 = h.b(u11, -1512230449);
        if (b11 == InterfaceC3967k.a.a()) {
        }
        u11.k();
        DsIconButtonAtomKt.DsIconButtonAtom(profileIconButtonVO.getIconButton(), o.c(eVar3, false, (Function1) b11), false, function15, u11, (i22222 & 7168) | IconButtonV3DTO.$stable, 4);
        c3969l = u11;
        indicator = profileIconButtonVO.getIndicator();
        c3969l.o(-1512223863);
        if (indicator != null) {
        }
        c3969l.k();
        c3969l.f();
        iconTooltip = profileIconButtonVO.getIconTooltip();
        if (iconTooltip != null) {
        }
        function111 = function110;
        str4 = str3;
        function16 = function18;
        function112 = function19;
        eVar4 = eVar2;
        function113 = function15;
        z14 = z12;
        m02 = c3969l.m0();
        if (m02 == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final B ProfileIconButtonContent$lambda$14(InterfaceC3978p0<B> interfaceC3978p0) {
        return interfaceC3978p0.getValue();
    }
}

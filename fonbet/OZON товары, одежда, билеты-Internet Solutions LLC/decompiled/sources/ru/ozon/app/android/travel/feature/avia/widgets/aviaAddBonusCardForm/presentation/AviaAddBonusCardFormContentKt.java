package ru.ozon.app.android.travel.feature.avia.widgets.aviaAddBonusCardForm.presentation;

import B0.M0;
import B0.N0;
import D1.InterfaceC2801g;
import Ep.a;
import Fr.g;
import K00.b;
import Q1.X;
import S0.A0;
import S0.C3969l;
import S0.D1;
import S0.F1;
import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import S0.J0;
import S0.Q;
import S0.n1;
import WZ.l;
import WZ.t;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5193p;
import androidx.compose.foundation.layout.C5194q;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.C5239d1;
import androidx.compose.ui.platform.K0;
import androidx.compose.ui.platform.P1;
import androidx.lifecycle.AbstractC5434v;
import b00.f;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import e1.InterfaceC6250b;
import e3.i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l1.C7807Z;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.molecules.input.v2.CommonInputV2VO;
import ru.ozon.uni.android.ds.compose.component.button.DsButtonAtomKt;
import ru.ozon.uni.android.ds.compose.component.input.DsInputBaseKt;
import ru.ozon.uni.android.ds.compose.component.input.DsInputLabelPosition;
import ru.ozon.uni.android.ds.compose.component.input.DsInputSize;
import ru.ozon.uni.android.ds.compose.component.input.DsInputState;
import ru.ozon.uni.android.ds.compose.component.input.DsInputStatus;
import ru.ozon.uni.android.ds.compose.component.input.DsInputTheme;
import ru.ozon.uni.android.ds.compose.component.input.DsInputType;
import ru.ozon.uni.android.ds.compose.component.text.DsTextAtomKt;
import ru.ozon.uni.android.ds.compose.util.DsSpacings;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.core.models.UniIconToken;
import ru.ozon.uni.core.repository.UniTheme;
import t0.p;
import t0.q;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a1\u0010\u0007\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\u0005H\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0003¢\u0006\u0004\b\u000b\u0010\f\u001a\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0003¢\u0006\u0004\b\r\u0010\f\u001a=\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u00102\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\u0005H\u0003¢\u0006\u0004\b\u0012\u0010\u0013\u001aQ\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00040\u00022\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u00102\u000e\u0010\u001b\u001a\n\u0018\u00010\u0019j\u0004\u0018\u0001`\u001aH\u0003¢\u0006\u0004\b\u001c\u0010\u001d\u001aM\u0010!\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u00162\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u00102\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\u0005H\u0003¢\u0006\u0004\b!\u0010\"¨\u0006#²\u0006\u000e\u0010 \u001a\u00020\u00168\n@\nX\u008a\u008e\u0002"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaAddBonusCardForm/presentation/AviaAddBonusCardFormVI;", "state", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "Lru/ozon/app/android/action/BuildedActionHandler;", "actionHandler", "AviaAddBonusCardFormContent", "(Lru/ozon/app/android/travel/feature/avia/widgets/aviaAddBonusCardForm/presentation/AviaAddBonusCardFormVI;Lkotlin/jvm/functions/Function1;LS0/k;I)V", "Lru/ozon/uni/atoms/data/text/TextDTO;", "dto", "Title", "(Lru/ozon/uni/atoms/data/text/TextDTO;LS0/k;I)V", "Subtitle", "Lru/ozon/app/android/travel/molecules/input/v2/CommonInputV2VO$SelectorV2;", "airline", "Lkotlin/Function0;", "onHideKeyboard", "AirlineInput", "(Lru/ozon/app/android/travel/molecules/input/v2/CommonInputV2VO$SelectorV2;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;LS0/k;I)V", "Lru/ozon/app/android/travel/molecules/input/v2/CommonInputV2VO$TextInputV2;", "bonusCardNumber", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "onValueChange", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "BonusCardInput", "(Lru/ozon/app/android/travel/molecules/input/v2/CommonInputV2VO$TextInputV2;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;LWZ/l;LS0/k;I)V", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "actionButton", "bonusCardInputText", "ActionButton", "(Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/app/android/travel/feature/avia/widgets/aviaAddBonusCardForm/presentation/AviaAddBonusCardFormVI;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;LS0/k;I)V", "avia_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AviaAddBonusCardFormContentKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void ActionButton(ButtonV3DTO buttonV3DTO, AviaAddBonusCardFormVI aviaAddBonusCardFormVI, String str, Function0<Unit> function0, Function1<? super AtomAction, Unit> function1, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        ButtonV3DTO buttonV3DTO2;
        C3969l u11 = interfaceC3967k.u(-1346672362);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(buttonV3DTO) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.n(aviaAddBonusCardFormVI) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.n(str) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i11 & 3072) == 0) {
            i12 |= u11.F(function0) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i11 & 24576) == 0) {
            i12 |= u11.F(function1) ? 16384 : 8192;
        }
        if ((i12 & 9363) == 9362 && u11.b()) {
            u11.j();
            buttonV3DTO2 = buttonV3DTO;
        } else {
            e h11 = T.h(a0.e(e.f40358c0, 1.0f), 0.0f, DsSpacings.INSTANCE.m1845getDp16D9Ej5fM(), 1);
            u11.o(1235163724);
            boolean z11 = ((i12 & 112) == 32) | ((i12 & 7168) == 2048) | ((i12 & 896) == 256) | ((57344 & i12) == 16384);
            Object C11 = u11.C();
            if (z11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new AviaAddBonusCardFormContentKt$ActionButton$1$1(function0, aviaAddBonusCardFormVI, function1, str);
                u11.x(C11);
            }
            u11.k();
            buttonV3DTO2 = buttonV3DTO;
            DsButtonAtomKt.DsButtonAtom(buttonV3DTO2, h11, false, (Function1) C11, u11, i12 & 14, 4);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new AviaAddBonusCardFormContentKt$ActionButton$2(buttonV3DTO2, aviaAddBonusCardFormVI, str, function0, function1, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AirlineInput(CommonInputV2VO.SelectorV2 selectorV2, Function0<Unit> function0, Function1<? super AtomAction, Unit> function1, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        Object aviaAddBonusCardFormContentKt$AirlineInput$1$1;
        q qVar;
        C3969l c3969l;
        C3969l u11 = interfaceC3967k.u(89017802);
        if ((i11 & 6) == 0) {
            i12 = ((i11 & 8) == 0 ? u11.n(selectorV2) : u11.F(selectorV2) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.F(function0) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.F(function1) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i12 & 147) == 146 && u11.b()) {
            u11.j();
            c3969l = u11;
        } else {
            u11.o(-402209295);
            Object C11 = u11.C();
            if (C11 == InterfaceC3967k.a.a()) {
                C11 = p.a();
                u11.x(C11);
            }
            q qVar2 = (q) C11;
            u11.k();
            AtomAction onClick = selectorV2.getOnClick();
            u11.o(-402206023);
            int i13 = i12 & 112;
            boolean z11 = ((i12 & 896) == 256) | ((i12 & 14) == 4 || ((i12 & 8) != 0 && u11.F(selectorV2))) | (i13 == 32);
            Object C12 = u11.C();
            if (z11 || C12 == InterfaceC3967k.a.a()) {
                qVar = qVar2;
                aviaAddBonusCardFormContentKt$AirlineInput$1$1 = new AviaAddBonusCardFormContentKt$AirlineInput$1$1(qVar, function0, selectorV2, function1, null);
                u11.x(aviaAddBonusCardFormContentKt$AirlineInput$1$1);
            } else {
                aviaAddBonusCardFormContentKt$AirlineInput$1$1 = C12;
                qVar = qVar2;
            }
            u11.k();
            Q.g(qVar, onClick, (Function2) aviaAddBonusCardFormContentKt$AirlineInput$1$1, u11);
            e e11 = a0.e(e.f40358c0, 1.0f);
            String text = selectorV2.getText();
            String label = selectorV2.getLabel();
            u11.o(-402191970);
            boolean z12 = i13 == 32;
            Object C13 = u11.C();
            if (z12 || C13 == InterfaceC3967k.a.a()) {
                C13 = new AviaAddBonusCardFormContentKt$AirlineInput$2$1(function0);
                u11.x(C13);
            }
            u11.k();
            M0 m02 = new M0((Function1) C13, 62);
            UniIconToken ic_s_picker = UniTheme.INSTANCE.getIconTokens().getIc_s_picker();
            u11.o(-402190484);
            Object C14 = u11.C();
            if (C14 == InterfaceC3967k.a.a()) {
                C14 = AviaAddBonusCardFormContentKt$AirlineInput$3$1.INSTANCE;
                u11.x(C14);
            }
            u11.k();
            c3969l = u11;
            DsInputBaseKt.m1743DsInputBaseawFkL_c(text, (Function1<? super String, Unit>) C14, e11, (DsInputSize) null, (DsInputType) null, (DsInputTheme) null, (DsInputState) null, (DsInputStatus) null, false, label, (DsInputLabelPosition) null, (String) null, (String) null, (C7807Z) null, (UniIconToken) null, ic_s_picker, false, false, false, (N0) null, m02, (X) null, qVar, (Function0<Unit>) null, (Function0<Unit>) null, (Function0<Unit>) null, (Function1<? super DsInputStatus, Unit>) null, (Function1<? super Boolean, Unit>) null, (Function1<? super String, Unit>) null, (InterfaceC3967k) c3969l, 432, (UniIconToken.$stable << 15) | 1572864, 384, 531529208);
        }
        J0 m03 = c3969l.m0();
        if (m03 != null) {
            m03.G(new AviaAddBonusCardFormContentKt$AirlineInput$4(selectorV2, function0, function1, i11));
        }
    }

    public static final void AviaAddBonusCardFormContent(AviaAddBonusCardFormVI aviaAddBonusCardFormVI, @NotNull Function1<? super AtomAction, Unit> actionHandler, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        String str;
        CommonInputV2VO.TextInputV2 bonusCardNumber;
        AviaAddBonusCardFormVI aviaAddBonusCardFormVI2;
        Function1<? super AtomAction, Unit> function1;
        CommonInputV2VO.TextInputV2 bonusCardNumber2;
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        C3969l u11 = interfaceC3967k.u(658163697);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(aviaAddBonusCardFormVI) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.F(actionHandler) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && u11.b()) {
            u11.j();
            aviaAddBonusCardFormVI2 = aviaAddBonusCardFormVI;
            function1 = actionHandler;
        } else {
            u11.o(-1870021146);
            l lVar = ((Boolean) u11.m(C5239d1.a())).booleanValue() ? null : (l) u11.m(f.e());
            u11.k();
            Object value = (aviaAddBonusCardFormVI == null || (bonusCardNumber2 = aviaAddBonusCardFormVI.getBonusCardNumber()) == null) ? null : bonusCardNumber2.getValue();
            u11.o(-1870016729);
            boolean n11 = u11.n(value);
            Object C11 = u11.C();
            if (n11 || C11 == InterfaceC3967k.a.a()) {
                if (aviaAddBonusCardFormVI == null || (bonusCardNumber = aviaAddBonusCardFormVI.getBonusCardNumber()) == null || (str = bonusCardNumber.getValue()) == null) {
                    str = "";
                }
                C11 = n1.f(str, D1.f25195a);
                u11.x(C11);
            }
            InterfaceC3978p0 interfaceC3978p0 = (InterfaceC3978p0) C11;
            u11.k();
            t viewEvent = aviaAddBonusCardFormVI != null ? aviaAddBonusCardFormVI.getViewEvent() : null;
            u11.o(-1870012491);
            if (viewEvent != null) {
                AbstractC5434v.a aVar = AbstractC5434v.a.ON_RESUME;
                u11.o(-2113068861);
                boolean F11 = u11.F(lVar) | u11.F(viewEvent);
                Object C12 = u11.C();
                if (F11 || C12 == InterfaceC3967k.a.a()) {
                    C12 = new AviaAddBonusCardFormContentKt$AviaAddBonusCardFormContent$1$1$1(lVar, viewEvent);
                    u11.x(C12);
                }
                u11.k();
                i.a(aVar, null, (Function0) C12, u11, 6);
                Unit unit = Unit.f71690a;
            }
            u11.k();
            P1 p12 = (P1) u11.m(K0.o());
            j1.i iVar = (j1.i) u11.m(K0.f());
            u11.o(-1870002296);
            boolean F12 = u11.F(iVar) | u11.n(p12);
            Object C13 = u11.C();
            if (F12 || C13 == InterfaceC3967k.a.a()) {
                C13 = new AviaAddBonusCardFormContentKt$AviaAddBonusCardFormContent$hideKeyboardAndClearFocus$1$1(iVar, p12);
                u11.x(C13);
            }
            Function0 function0 = (Function0) C13;
            u11.k();
            e h11 = T.h(a0.e(e.f40358c0, 1.0f), DsSpacings.INSTANCE.m1845getDp16D9Ej5fM(), 0.0f, 2);
            C5194q a11 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), u11, 0);
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f7 = c.f(u11, h11);
            Function0 a12 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a12);
            } else {
                u11.e();
            }
            Function2 g10 = b.g(u11, a11, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                a.d(I11, u11, I11, g10);
            }
            F1.b(u11, f7, InterfaceC2801g.a.f());
            TextDTO title = aviaAddBonusCardFormVI != null ? aviaAddBonusCardFormVI.getTitle() : null;
            u11.o(-2113053748);
            if (title != null) {
                Title(title, u11, 0);
            }
            u11.k();
            TextDTO subtitle = aviaAddBonusCardFormVI != null ? aviaAddBonusCardFormVI.getSubtitle() : null;
            u11.o(-2113052369);
            if (subtitle != null) {
                Subtitle(subtitle, u11, 0);
            }
            u11.k();
            CommonInputV2VO.SelectorV2 airline = aviaAddBonusCardFormVI != null ? aviaAddBonusCardFormVI.getAirline() : null;
            u11.o(-2113050709);
            if (airline != null) {
                AirlineInput(airline, function0, actionHandler, u11, CommonInputV2VO.SelectorV2.$stable | ((i12 << 3) & 896));
            }
            u11.k();
            CommonInputV2VO.TextInputV2 bonusCardNumber3 = aviaAddBonusCardFormVI != null ? aviaAddBonusCardFormVI.getBonusCardNumber() : null;
            u11.o(-2113042824);
            if (bonusCardNumber3 != null) {
                String AviaAddBonusCardFormContent$lambda$1 = AviaAddBonusCardFormContent$lambda$1(interfaceC3978p0);
                u11.o(33148213);
                boolean n12 = u11.n(interfaceC3978p0);
                Object C14 = u11.C();
                if (n12 || C14 == InterfaceC3967k.a.a()) {
                    C14 = new AviaAddBonusCardFormContentKt$AviaAddBonusCardFormContent$2$4$1$1(interfaceC3978p0);
                    u11.x(C14);
                }
                u11.k();
                BonusCardInput(bonusCardNumber3, AviaAddBonusCardFormContent$lambda$1, (Function1) C14, function0, lVar, u11, CommonInputV2VO.TextInputV2.$stable);
            }
            u11.k();
            ButtonV3DTO actionButton = aviaAddBonusCardFormVI != null ? aviaAddBonusCardFormVI.getActionButton() : null;
            u11.o(-2113030702);
            if (actionButton == null) {
                aviaAddBonusCardFormVI2 = aviaAddBonusCardFormVI;
                function1 = actionHandler;
            } else {
                aviaAddBonusCardFormVI2 = aviaAddBonusCardFormVI;
                function1 = actionHandler;
                ActionButton(actionButton, aviaAddBonusCardFormVI2, AviaAddBonusCardFormContent$lambda$1(interfaceC3978p0), function0, function1, u11, ((i12 << 3) & 112) | ((i12 << 9) & 57344));
            }
            u11.k();
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new AviaAddBonusCardFormContentKt$AviaAddBonusCardFormContent$3(aviaAddBonusCardFormVI2, function1, i11));
        }
    }

    private static final String AviaAddBonusCardFormContent$lambda$1(InterfaceC3978p0<String> interfaceC3978p0) {
        return interfaceC3978p0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void BonusCardInput(CommonInputV2VO.TextInputV2 textInputV2, String str, Function1<? super String, Unit> function1, Function0<Unit> function0, l lVar, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        String str2;
        Function1<? super String, Unit> function12;
        C3969l c3969l;
        C3969l u11 = interfaceC3967k.u(-1730679937);
        if ((i11 & 6) == 0) {
            i12 = ((i11 & 8) == 0 ? u11.n(textInputV2) : u11.F(textInputV2) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            str2 = str;
            i12 |= u11.n(str2) ? 32 : 16;
        } else {
            str2 = str;
        }
        if ((i11 & 384) == 0) {
            function12 = function1;
            i12 |= u11.F(function12) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        } else {
            function12 = function1;
        }
        if ((i11 & 3072) == 0) {
            i12 |= u11.F(function0) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i11 & 24576) == 0) {
            i12 |= u11.F(lVar) ? 16384 : 8192;
        }
        if ((i12 & 9363) == 9362 && u11.b()) {
            u11.j();
            c3969l = u11;
        } else {
            e j11 = T.j(a0.e(e.f40358c0, 1.0f), 0.0f, DsSpacings.INSTANCE.m1861getDp8D9Ej5fM(), 0.0f, 0.0f, 13);
            String label = textInputV2.getLabel();
            boolean z11 = false;
            N0 n02 = new N0(0, textInputV2.getKeyboardType(), 123);
            u11.o(-546219603);
            boolean z12 = (i12 & 7168) == 2048;
            Object C11 = u11.C();
            if (z12 || C11 == InterfaceC3967k.a.a()) {
                C11 = new AviaAddBonusCardFormContentKt$BonusCardInput$1$1(function0);
                u11.x(C11);
            }
            u11.k();
            M0 m02 = new M0((Function1) C11, 62);
            u11.o(-546216629);
            if ((i12 & 14) == 4 || ((i12 & 8) != 0 && u11.F(textInputV2))) {
                z11 = true;
            }
            boolean F11 = u11.F(lVar) | z11;
            Object C12 = u11.C();
            if (F11 || C12 == InterfaceC3967k.a.a()) {
                C12 = new AviaAddBonusCardFormContentKt$BonusCardInput$2$1(textInputV2, lVar);
                u11.x(C12);
            }
            u11.k();
            c3969l = u11;
            DsInputBaseKt.m1743DsInputBaseawFkL_c(str2, function12, j11, (DsInputSize) null, (DsInputType) null, (DsInputTheme) null, (DsInputState) null, (DsInputStatus) null, false, label, (DsInputLabelPosition) null, (String) null, (String) null, (C7807Z) null, (UniIconToken) null, (UniIconToken) null, false, false, false, n02, m02, (X) null, (q) null, (Function0<Unit>) null, (Function0<Unit>) null, (Function0<Unit>) null, (Function1<? super DsInputStatus, Unit>) null, (Function1<? super Boolean, Unit>) C12, (Function1<? super String, Unit>) null, (InterfaceC3967k) c3969l, (i12 >> 3) & 126, 0, 0, 401079800);
        }
        J0 m03 = c3969l.m0();
        if (m03 != null) {
            m03.G(new AviaAddBonusCardFormContentKt$BonusCardInput$3(textInputV2, str, function1, function0, lVar, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Subtitle(TextDTO textDTO, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        C3969l u11 = interfaceC3967k.u(-782443108);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(textDTO) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i12 & 3) == 2 && u11.b()) {
            u11.j();
        } else {
            DsTextAtomKt.DsTextAtom(textDTO, null, u11, i12 & 14, 2);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new AviaAddBonusCardFormContentKt$Subtitle$1(textDTO, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Title(TextDTO textDTO, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        C3969l u11 = interfaceC3967k.u(-328242824);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(textDTO) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i12 & 3) == 2 && u11.b()) {
            u11.j();
        } else {
            DsTextAtomKt.DsTextAtom(textDTO, null, u11, i12 & 14, 2);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new AviaAddBonusCardFormContentKt$Title$1(textDTO, i11));
        }
    }
}

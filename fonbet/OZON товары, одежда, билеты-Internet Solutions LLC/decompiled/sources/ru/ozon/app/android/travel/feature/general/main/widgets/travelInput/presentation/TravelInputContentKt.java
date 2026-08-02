package ru.ozon.app.android.travel.feature.general.main.widgets.travelInput.presentation;

import B0.M0;
import B0.N0;
import D1.InterfaceC2801g;
import Ep.a;
import Fr.g;
import G1.h;
import K00.b;
import Q1.X;
import S0.A0;
import S0.A1;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import S0.J0;
import S0.Q;
import UZ.d;
import WZ.l;
import WZ.t;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5193p;
import androidx.compose.foundation.layout.C5194q;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.K0;
import androidx.compose.ui.platform.P1;
import androidx.lifecycle.AbstractC5434v;
import b00.f;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import e3.C6285b;
import j1.i;
import j1.r;
import java.util.Arrays;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l1.C7807Z;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.travel.feature.general.main.R$string;
import ru.ozon.app.android.travel.feature.general.main.widgets.travelInput.presentation.TravelInputContentKt;
import ru.ozon.app.android.travel.molecules.input.v2.CommonInputV2VO;
import ru.ozon.uni.android.ds.compose.component.button.DsButtonAtomKt;
import ru.ozon.uni.android.ds.compose.component.input.DsInputBaseKt;
import ru.ozon.uni.android.ds.compose.component.input.DsInputLabelPosition;
import ru.ozon.uni.android.ds.compose.component.input.DsInputSize;
import ru.ozon.uni.android.ds.compose.component.input.DsInputState;
import ru.ozon.uni.android.ds.compose.component.input.DsInputStatus;
import ru.ozon.uni.android.ds.compose.component.input.DsInputTheme;
import ru.ozon.uni.android.ds.compose.component.input.DsInputType;
import ru.ozon.uni.android.ds.compose.util.DsSpacings;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.core.models.UniIconToken;
import t0.q;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a/\u0010\u0007\u001a\u00020\u00022\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000j\u0002`\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0001¢\u0006\u0004\b\u0007\u0010\b\u001aa\u0010\u0015\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00020\u00002\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u0013H\u0003¢\u0006\u0004\b\u0015\u0010\u0016\u001a=\u0010\u001c\u001a\u00020\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\t2\u0018\u0010\u001b\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00020\u001aH\u0003¢\u0006\u0004\b\u001c\u0010\u001d\u001a+\u0010#\u001a\u00020\u0002*\u00060\u001ej\u0002`\u001f2\n\u0010\"\u001a\u00060 j\u0002`!2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b#\u0010$¨\u0006'²\u0006\f\u0010&\u001a\u00020%8\nX\u008a\u0084\u0002"}, d2 = {"Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "Lru/ozon/app/android/action/BuildedActionHandler;", "actionHandler", "Lru/ozon/app/android/travel/feature/general/main/widgets/travelInput/presentation/TravelInputViewModel;", "viewModel", "TravelInputContent", "(Lkotlin/jvm/functions/Function1;Lru/ozon/app/android/travel/feature/general/main/widgets/travelInput/presentation/TravelInputViewModel;LS0/k;I)V", "", "inputText", "Lru/ozon/app/android/travel/molecules/input/v2/CommonInputV2VO$TextInputV2;", "input", "Lkotlin/Pair;", "", "captionNumbers", "Lj1/r;", "focusRequester", "onValueChange", "Lkotlin/Function0;", "onDone", "TravelInputField", "(Ljava/lang/String;Lru/ozon/app/android/travel/molecules/input/v2/CommonInputV2VO$TextInputV2;Lkotlin/Pair;Lj1/r;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;LS0/k;I)V", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "button", "inputName", "Lkotlin/Function2;", "onButtonClick", "TravelInputButton", "(Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Ljava/lang/String;Lkotlin/jvm/functions/Function2;LS0/k;I)V", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "clickEvent", "processButtonClickWithInput", "(LWZ/l;LWZ/t;Ljava/lang/String;)V", "Lru/ozon/app/android/travel/feature/general/main/widgets/travelInput/presentation/WidgetState;", "widgetState", "main_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelInputContentKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void TravelInputButton(ButtonV3DTO buttonV3DTO, String str, Function2<? super AtomAction, ? super String, Unit> function2, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        C3969l u11 = interfaceC3967k.u(392646747);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(buttonV3DTO) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.n(str) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.F(function2) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i12 & 147) == 146 && u11.b()) {
            u11.j();
        } else if (buttonV3DTO != null) {
            e j11 = T.j(a0.e(e.f40358c0, 1.0f), 0.0f, 0.0f, 0.0f, DsSpacings.INSTANCE.m1850getDp24D9Ej5fM(), 7);
            u11.o(1344334554);
            boolean z11 = ((i12 & 112) == 32) | ((i12 & 896) == 256);
            Object C11 = u11.C();
            if (z11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new TravelInputContentKt$TravelInputButton$1$1$1(str, function2);
                u11.x(C11);
            }
            u11.k();
            DsButtonAtomKt.DsButtonAtom(buttonV3DTO, j11, false, (Function1) C11, u11, 0, 4);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new TravelInputContentKt$TravelInputButton$2(buttonV3DTO, str, function2, i11));
        }
    }

    public static final void TravelInputContent(@NotNull Function1<? super AtomAction, Unit> actionHandler, @NotNull TravelInputViewModel viewModel, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        P1 p12;
        CommonInputV2VO.TextInputV2 input;
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        C3969l u11 = interfaceC3967k.u(-504878766);
        if ((i11 & 6) == 0) {
            i12 = (u11.F(actionHandler) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.F(viewModel) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && u11.b()) {
            u11.j();
        } else {
            InterfaceC3978p0 c11 = C6285b.c(viewModel.getState(), u11, 0);
            u11.o(245242325);
            Object C11 = u11.C();
            if (C11 == InterfaceC3967k.a.a()) {
                C11 = new r();
                u11.x(C11);
            }
            r rVar = (r) C11;
            u11.k();
            P1 p13 = (P1) u11.m(K0.o());
            i iVar = (i) u11.m(K0.f());
            l lVar = (l) u11.m(f.e());
            TravelInputVI data = TravelInputContent$lambda$0(c11).getData();
            t viewEvent = data != null ? data.getViewEvent() : null;
            u11.o(245250256);
            if (viewEvent != null) {
                AbstractC5434v.a aVar = AbstractC5434v.a.ON_RESUME;
                u11.o(535732190);
                boolean F11 = u11.F(lVar) | u11.F(viewEvent);
                Object C12 = u11.C();
                if (F11 || C12 == InterfaceC3967k.a.a()) {
                    C12 = new TravelInputContentKt$TravelInputContent$1$1$1(lVar, viewEvent);
                    u11.x(C12);
                }
                u11.k();
                e3.i.a(aVar, null, (Function0) C12, u11, 6);
                Unit unit = Unit.f71690a;
            }
            u11.k();
            Unit unit2 = Unit.f71690a;
            u11.o(245256186);
            boolean n11 = u11.n(p13) | u11.F(viewModel) | u11.n(c11) | u11.F(lVar) | ((i12 & 14) == 4);
            Object C13 = u11.C();
            if (n11 || C13 == InterfaceC3967k.a.a()) {
                p12 = p13;
                Object travelInputContentKt$TravelInputContent$2$1 = new TravelInputContentKt$TravelInputContent$2$1(rVar, p12, viewModel, actionHandler, c11, lVar, null);
                u11.x(travelInputContentKt$TravelInputContent$2$1);
                C13 = travelInputContentKt$TravelInputContent$2$1;
            } else {
                p12 = p13;
            }
            u11.k();
            Q.e(u11, unit2, (Function2) C13);
            e e11 = a0.e(e.f40358c0, 1.0f);
            DsSpacings dsSpacings = DsSpacings.INSTANCE;
            e h11 = T.h(e11, dsSpacings.m1845getDp16D9Ej5fM(), 0.0f, 2);
            int i13 = C5179b.f39454h;
            C5194q a11 = C5193p.a(C5179b.n(dsSpacings.m1845getDp16D9Ej5fM()), InterfaceC6250b.a.k(), u11, 0);
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
            String inputText = TravelInputContent$lambda$0(c11).getInputText();
            TravelInputVI data2 = TravelInputContent$lambda$0(c11).getData();
            CommonInputV2VO.TextInputV2 input2 = data2 != null ? data2.getInput() : null;
            Pair<Integer, Integer> captionNumbers = TravelInputContent$lambda$0(c11).getCaptionNumbers();
            u11.o(535764836);
            boolean F12 = u11.F(viewModel);
            Object C14 = u11.C();
            if (F12 || C14 == InterfaceC3967k.a.a()) {
                C14 = new TravelInputContentKt$TravelInputContent$3$1$1(viewModel);
                u11.x(C14);
            }
            Function1 function1 = (Function1) C14;
            u11.k();
            u11.o(535768982);
            boolean F13 = u11.F(iVar) | u11.n(p12);
            Object C15 = u11.C();
            if (F13 || C15 == InterfaceC3967k.a.a()) {
                C15 = new TravelInputContentKt$TravelInputContent$3$2$1(iVar, p12);
                u11.x(C15);
            }
            u11.k();
            String str = null;
            TravelInputField(inputText, input2, captionNumbers, rVar, function1, (Function0) C15, u11, (CommonInputV2VO.TextInputV2.$stable << 3) | 3072);
            TravelInputVI data3 = TravelInputContent$lambda$0(c11).getData();
            ButtonV3DTO button = data3 != null ? data3.getButton() : null;
            TravelInputVI data4 = TravelInputContent$lambda$0(c11).getData();
            if (data4 != null && (input = data4.getInput()) != null) {
                str = input.getName();
            }
            u11.o(535775552);
            boolean F14 = u11.F(iVar) | u11.n(p12) | u11.F(viewModel);
            Object C16 = u11.C();
            if (F14 || C16 == InterfaceC3967k.a.a()) {
                C16 = new TravelInputContentKt$TravelInputContent$3$3$1(viewModel, iVar, p12);
                u11.x(C16);
            }
            u11.k();
            TravelInputButton(button, str, (Function2) C16, u11, 0);
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new TravelInputContentKt$TravelInputContent$4(actionHandler, viewModel, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void TravelInputContent$hideKeyboardAndClearFocus(i iVar, P1 p12) {
        iVar.g(false);
        if (p12 != null) {
            p12.hide();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WidgetState TravelInputContent$lambda$0(A1<WidgetState> a12) {
        return a12.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:52:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TravelInputField(String str, CommonInputV2VO.TextInputV2 textInputV2, Pair<Integer, Integer> pair, r rVar, Function1<? super String, Unit> function1, Function0<Unit> function0, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        Function1<? super String, Unit> function12;
        C3969l c3969l;
        J0 m02;
        C3969l u11 = interfaceC3967k.u(-986515783);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(str) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= (i11 & 64) == 0 ? u11.n(textInputV2) : u11.F(textInputV2) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.n(pair) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i11 & 3072) == 0) {
            i12 |= u11.n(rVar) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i11 & 24576) == 0) {
            function12 = function1;
            i12 |= u11.F(function12) ? 16384 : 8192;
        } else {
            function12 = function1;
        }
        if ((196608 & i11) == 0) {
            i12 |= u11.F(function0) ? 131072 : 65536;
        }
        if ((74899 & i12) == 74898 && u11.b()) {
            u11.j();
        } else if (textInputV2 != null) {
            e a11 = androidx.compose.ui.focus.i.a(a0.e(e.f40358c0, 1.0f), rVar);
            String label = textInputV2.getLabel();
            u11.o(-20202269);
            String string = pair == null ? null : h.a(u11).getString(R$string.travel_input_caption, Arrays.copyOf(new Object[]{pair.e(), pair.f()}, 2));
            u11.k();
            u11.o(-1815786780);
            boolean z11 = (458752 & i12) == 131072;
            Object C11 = u11.C();
            if (z11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new TravelInputContentKt$TravelInputField$1$2$1(function0);
                u11.x(C11);
            }
            u11.k();
            c3969l = u11;
            DsInputBaseKt.m1743DsInputBaseawFkL_c(str, function12, a11, (DsInputSize) null, (DsInputType) null, (DsInputTheme) null, (DsInputState) null, (DsInputStatus) null, false, label, (DsInputLabelPosition) null, (String) null, string, (C7807Z) null, (UniIconToken) null, (UniIconToken) null, false, false, false, (N0) null, new M0((Function1) C11, 62), (X) null, (q) null, (Function0<Unit>) null, (Function0<Unit>) null, (Function0<Unit>) null, (Function1<? super DsInputStatus, Unit>) null, (Function1<? super Boolean, Unit>) null, (Function1<? super String, Unit>) null, (InterfaceC3967k) c3969l, (i12 & 14) | ((i12 >> 9) & 112), 1572864, 0, 535752184);
            m02 = c3969l.m0();
            if (m02 == null) {
                m02.G(new TravelInputContentKt$TravelInputField$2(str, textInputV2, pair, rVar, function1, function0, i11));
                return;
            }
            return;
        }
        c3969l = u11;
        m02 = c3969l.m0();
        if (m02 == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void processButtonClickWithInput(l lVar, t tVar, final String str) {
        TokenizedAnalyticsExtensionsKt.processClickEvents(lVar, tVar, new WZ.e() { // from class: FQ.a
            @Override // WZ.e
            public final WZ.g modifyParams(UZ.a aVar, WZ.g gVar) {
                WZ.g processButtonClickWithInput$lambda$16;
                processButtonClickWithInput$lambda$16 = TravelInputContentKt.processButtonClickWithInput$lambda$16(str, (d) aVar, gVar);
                return processButtonClickWithInput$lambda$16;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WZ.g processButtonClickWithInput$lambda$16(String str, UZ.a aVar, WZ.g params) {
        Intrinsics.checkNotNullParameter(aVar, "<unused var>");
        Intrinsics.checkNotNullParameter(params, "params");
        LinkedHashMap a11 = WZ.h.a(params.b());
        a11.put("status", str);
        return WZ.g.a(params, a11, null, 2);
    }
}

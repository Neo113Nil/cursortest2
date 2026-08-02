package ru.ozon.app.android.travel.feature.b2b.widgets.b2bForm.presentation;

import Ae.E0;
import Ae.w0;
import B0.M0;
import B0.N0;
import B1.V;
import D1.InterfaceC2801g;
import Ep.a;
import Fr.g;
import K00.b;
import S0.A0;
import S0.A1;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import S0.J0;
import S0.Q;
import S0.n1;
import T7.E;
import WZ.l;
import WZ.t;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.C5193p;
import androidx.compose.foundation.layout.C5194q;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.X;
import androidx.compose.foundation.layout.Y;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.K0;
import androidx.compose.ui.platform.P1;
import androidx.lifecycle.AbstractC5434v;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import e1.InterfaceC6250b;
import e3.i;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l1.C7807Z;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.b2b.widgets.b2bForm.presentation.B2bFormVI;
import ru.ozon.app.android.travel.molecules.input.v2.CommonInputV2VO;
import ru.ozon.app.android.travel.molecules.input.v2.mapper.CommonInputV2MapperKt;
import ru.ozon.app.android.travel.molecules.view.travelWidgetSettings.TravelWidgetSettingsExtKt;
import ru.ozon.app.android.travel.utils.visualTransformation.MaskVisualTransformation;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.app.android.utils.CollectionExtKt;
import ru.ozon.uni.android.ds.compose.component.button.DsButtonAtomKt;
import ru.ozon.uni.android.ds.compose.component.button.DsIconButtonAtomKt;
import ru.ozon.uni.android.ds.compose.component.cell.DsCellAtomKt;
import ru.ozon.uni.android.ds.compose.component.disclaimer.DsDisclaimerAtomKt;
import ru.ozon.uni.android.ds.compose.component.image.DsImageAtomKt;
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
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.disclaimer.DisclaimerDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.core.models.UniIconToken;
import ru.ozon.uni.core.repository.UniTheme;
import t0.q;
import u0.C9891D;
import ze.EnumC11113a;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a«\u0001\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\u00052\u000e\u0010\t\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\n2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\r0\n2\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n2\u0018\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00040\u00102\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0017\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0015H\u0003¢\u0006\u0004\b\u0017\u0010\u0018\u001a¹\u0001\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00192\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\n2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\r0\n2\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n2\u0018\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00040\u00102\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00040\u00022\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u001b2\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\u00052\u000e\u0010\t\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\bH\u0003¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u0093\u0001\u0010&\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\r2\b\u0010#\u001a\u0004\u0018\u00010\u000b2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00040\u00022\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u001b2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u001b2\u000e\u0010\t\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b2\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\u00052\b\u0010%\u001a\u0004\u0018\u00010$H\u0003¢\u0006\u0004\b&\u0010'\u001a=\u0010*\u001a\u00020\u00042\u0006\u0010)\u001a\u00020(2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u001b2\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\u0005H\u0001¢\u0006\u0004\b*\u0010+¨\u0006-²\u0006\u001c\u0010,\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lru/ozon/app/android/travel/feature/b2b/widgets/b2bForm/presentation/B2bFormVI;", "state", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "Lru/ozon/app/android/action/BuildedActionHandler;", "actionHandler", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "", "", "inputValues", "Lru/ozon/uni/android/ds/compose/component/input/DsInputStatus;", "inputStatuses", "inputErrors", "Lkotlin/Function2;", "onValueChange", "onClearError", "B2bFormContent", "(Lru/ozon/app/android/travel/feature/b2b/widgets/b2bForm/presentation/B2bFormVI;Lkotlin/jvm/functions/Function1;LWZ/l;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;LS0/k;I)V", "Lru/ozon/app/android/travel/feature/b2b/widgets/b2bForm/presentation/B2bFormVI$HeaderSectionVI;", CommentV3DTO.HEADER_FIELD_NAME, "HeaderSection", "(Lru/ozon/app/android/travel/feature/b2b/widgets/b2bForm/presentation/B2bFormVI$HeaderSectionVI;LS0/k;I)V", "Lru/ozon/app/android/travel/feature/b2b/widgets/b2bForm/presentation/B2bFormVI$FormBlockVI;", "block", "Lkotlin/Function0;", "onHideKeyboard", "FormBlockSection", "(Lru/ozon/app/android/travel/feature/b2b/widgets/b2bForm/presentation/B2bFormVI$FormBlockVI;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;LWZ/l;LS0/k;I)V", "Lru/ozon/app/android/travel/molecules/input/v2/CommonInputV2VO$TextInputV2;", "input", AppMeasurementSdk.ConditionalUserProperty.VALUE, "status", "error", "", "gap", "DsTextInput", "(Lru/ozon/app/android/travel/molecules/input/v2/CommonInputV2VO$TextInputV2;Ljava/lang/String;Lru/ozon/uni/android/ds/compose/component/input/DsInputStatus;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;LWZ/l;Lkotlin/jvm/functions/Function1;Ljava/lang/Integer;LS0/k;I)V", "Lru/ozon/app/android/travel/feature/b2b/widgets/b2bForm/presentation/B2bFormVI$ButtonSectionVI;", "buttonSection", "ButtonSection", "(Lru/ozon/app/android/travel/feature/b2b/widgets/b2bForm/presentation/B2bFormVI$ButtonSectionVI;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;LS0/k;I)V", "currentActionHandler", "b2b_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class B2bFormContentKt {
    public static final void B2bFormContent(@NotNull B2bFormVI state, @NotNull Function1<? super AtomAction, Unit> actionHandler, l lVar, @NotNull Map<String, String> map, @NotNull Map<String, ? extends DsInputStatus> map2, @NotNull Map<String, String> map3, @NotNull Function2<? super String, ? super String, Unit> function2, @NotNull Function1<? super String, Unit> function1, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        int i13;
        int i14;
        l lVar2 = lVar;
        Map<String, String> inputValues = map;
        Map<String, ? extends DsInputStatus> inputStatuses = map2;
        Map<String, String> inputErrors = map3;
        Function2<? super String, ? super String, Unit> onValueChange = function2;
        Function1<? super String, Unit> onClearError = function1;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(inputValues, "inputValues");
        Intrinsics.checkNotNullParameter(inputStatuses, "inputStatuses");
        Intrinsics.checkNotNullParameter(inputErrors, "inputErrors");
        Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
        Intrinsics.checkNotNullParameter(onClearError, "onClearError");
        C3969l u11 = interfaceC3967k.u(-324509898);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(state) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.F(actionHandler) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.F(lVar2) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i11 & 3072) == 0) {
            i12 |= u11.F(inputValues) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i11 & 24576) == 0) {
            i12 |= u11.F(inputStatuses) ? 16384 : 8192;
        }
        if ((196608 & i11) == 0) {
            i12 |= u11.F(inputErrors) ? 131072 : 65536;
        }
        if ((i11 & 1572864) == 0) {
            i12 |= u11.F(onValueChange) ? 1048576 : 524288;
        }
        if ((12582912 & i11) == 0) {
            i12 |= u11.F(onClearError) ? 8388608 : 4194304;
        }
        int i15 = i12;
        if ((4793491 & i15) == 4793490 && u11.b()) {
            u11.j();
        } else {
            t viewEvent = state.getViewEvent();
            u11.o(-829262794);
            if (viewEvent == null) {
                i13 = 1572864;
            } else {
                AbstractC5434v.a aVar = AbstractC5434v.a.ON_RESUME;
                u11.o(1396001732);
                boolean F11 = u11.F(lVar2) | u11.F(viewEvent);
                i13 = 1572864;
                Object C11 = u11.C();
                if (F11 || C11 == InterfaceC3967k.a.a()) {
                    C11 = new B2bFormContentKt$B2bFormContent$1$1$1(lVar2, viewEvent);
                    u11.x(C11);
                }
                u11.k();
                i.a(aVar, null, (Function0) C11, u11, 6);
                Unit unit = Unit.f71690a;
            }
            u11.k();
            P1 p12 = (P1) u11.m(K0.o());
            j1.i iVar = (j1.i) u11.m(K0.f());
            u11.o(-829252562);
            Object C12 = u11.C();
            if (C12 == InterfaceC3967k.a.a()) {
                C12 = new B2bFormContentKt$B2bFormContent$hideKeyboardAndClearFocus$1$1(iVar, p12);
                u11.x(C12);
            }
            Function0 function0 = (Function0) C12;
            u11.k();
            e e11 = a0.e(e.f40358c0, 1.0f);
            int i16 = C5179b.f39454h;
            C5194q a11 = C5193p.a(C5179b.n(state.getGap()), InterfaceC6250b.a.k(), u11, 0);
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f7 = c.f(u11, e11);
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
            B2bFormVI.HeaderSectionVI headerSection = state.getHeaderSection();
            u11.o(1396018368);
            if (headerSection == null) {
                i14 = 0;
            } else {
                i14 = 0;
                HeaderSection(headerSection, u11, 0);
            }
            u11.k();
            u11.o(1396021932);
            List<B2bFormVI.FormBlockVI> formBlockList = state.getFormBlockList();
            int size = formBlockList.size();
            int i17 = i14;
            while (i17 < size) {
                B2bFormVI.FormBlockVI formBlockVI = formBlockList.get(i17);
                int i18 = i15 >> 6;
                List<B2bFormVI.FormBlockVI> list = formBlockList;
                int i19 = (i18 & 112) | i13 | (i18 & 896) | (i18 & 7168) | (i18 & 57344) | (i18 & 458752);
                int i21 = i15 << 18;
                int i22 = i19 | (i21 & 29360128) | (i21 & 234881024);
                Map<String, String> map4 = inputErrors;
                Function2<? super String, ? super String, Unit> function22 = onValueChange;
                Function1<? super String, Unit> function12 = onClearError;
                Function0 function02 = function0;
                FormBlockSection(formBlockVI, inputValues, inputStatuses, map4, function22, function12, function02, actionHandler, lVar2, u11, i22);
                i17++;
                lVar2 = lVar;
                inputValues = map;
                inputStatuses = map2;
                inputErrors = map3;
                onValueChange = function2;
                function0 = function02;
                formBlockList = list;
                onClearError = function1;
            }
            Function0 function03 = function0;
            u11.k();
            u11.o(1396037906);
            if (state.getButtonSection() != null && !state.getButtonSection().getIsSticky()) {
                ButtonSection(state.getButtonSection(), function03, actionHandler, u11, ((i15 << 3) & 896) | 48);
            }
            u11.k();
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new B2bFormContentKt$B2bFormContent$3(state, actionHandler, lVar, map, map2, map3, function2, function1, i11));
        }
    }

    public static final void ButtonSection(@NotNull B2bFormVI.ButtonSectionVI buttonSection, @NotNull Function0<Unit> onHideKeyboard, @NotNull Function1<? super AtomAction, Unit> actionHandler, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        Intrinsics.checkNotNullParameter(buttonSection, "buttonSection");
        Intrinsics.checkNotNullParameter(onHideKeyboard, "onHideKeyboard");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        C3969l u11 = interfaceC3967k.u(1418457725);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(buttonSection) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.F(onHideKeyboard) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.F(actionHandler) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i12 & 147) == 146 && u11.b()) {
            u11.j();
        } else {
            e.a aVar = e.f40358c0;
            e applyWidgetSettings = TravelWidgetSettingsExtKt.applyWidgetSettings(a0.e(aVar, 1.0f), buttonSection.getSettings(), u11, 6, 0);
            int i13 = C5179b.f39454h;
            DsSpacings dsSpacings = DsSpacings.INSTANCE;
            C5194q a11 = C5193p.a(C5179b.n(dsSpacings.m1842getDp12D9Ej5fM()), InterfaceC6250b.a.k(), u11, 0);
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f7 = c.f(u11, applyWidgetSettings);
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
            e c11 = GZ.e.c(u11, f7, aVar, 1.0f);
            Y b11 = X.b(C5179b.n(dsSpacings.m1861getDp8D9Ej5fM()), InterfaceC6250b.a.i(), u11, 48);
            int I12 = u11.I();
            A0 d12 = u11.d();
            e f11 = c.f(u11, c11);
            Function0 a13 = InterfaceC2801g.a.a();
            u11.i();
            if (u11.t()) {
                u11.H(a13);
            } else {
                u11.e();
            }
            Function2 h11 = Cm.e.h(u11, b11, u11, d12);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I12))) {
                a.d(I12, u11, I12, h11);
            }
            F1.b(u11, f11, InterfaceC2801g.a.f());
            C9891D c9891d = C9891D.f99599a;
            e a14 = c9891d.a(aVar, 1.0f, true);
            V f12 = C5185h.f(InterfaceC6250b.a.o(), false);
            int I13 = u11.I();
            A0 d13 = u11.d();
            e f13 = c.f(u11, a14);
            Function0 a15 = InterfaceC2801g.a.a();
            u11.i();
            if (u11.t()) {
                u11.H(a15);
            } else {
                u11.e();
            }
            Function2 f14 = E.f(u11, f12, u11, d13);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I13))) {
                a.d(I13, u11, I13, f14);
            }
            F1.b(u11, f13, InterfaceC2801g.a.f());
            ButtonV3DTO submitButton = buttonSection.getSubmitButton();
            e e11 = a0.e(aVar, 1.0f);
            u11.o(-70064074);
            int i14 = i12 & 112;
            int i15 = i12 & 896;
            boolean z11 = (i15 == 256) | (i14 == 32);
            Object C11 = u11.C();
            if (z11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new B2bFormContentKt$ButtonSection$1$1$1$1$1(onHideKeyboard, actionHandler);
                u11.x(C11);
            }
            u11.k();
            DsButtonAtomKt.DsButtonAtom(submitButton, e11, false, (Function1) C11, u11, 48, 4);
            u11.f();
            ButtonV3DTO additionalButton = buttonSection.getAdditionalButton();
            u11.o(-1367123009);
            if (additionalButton != null) {
                e a16 = c9891d.a(aVar, 1.0f, true);
                V f15 = C5185h.f(InterfaceC6250b.a.o(), false);
                int I14 = u11.I();
                A0 d14 = u11.d();
                e f16 = c.f(u11, a16);
                Function0 a17 = InterfaceC2801g.a.a();
                u11.i();
                if (u11.t()) {
                    u11.H(a17);
                } else {
                    u11.e();
                }
                Function2 f17 = E.f(u11, f15, u11, d14);
                if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I14))) {
                    a.d(I14, u11, I14, f17);
                }
                F1.b(u11, f16, InterfaceC2801g.a.f());
                e e12 = a0.e(aVar, 1.0f);
                u11.o(-1763671445);
                boolean z12 = (i15 == 256) | (i14 == 32);
                Object C12 = u11.C();
                if (z12 || C12 == InterfaceC3967k.a.a()) {
                    C12 = new B2bFormContentKt$ButtonSection$1$1$2$1$1$1(onHideKeyboard, actionHandler);
                    u11.x(C12);
                }
                u11.k();
                DsButtonAtomKt.DsButtonAtom(additionalButton, e12, false, (Function1) C12, u11, 48, 4);
                u11.f();
                Unit unit = Unit.f71690a;
            }
            u11.k();
            IconButtonV3DTO additionalIconButton = buttonSection.getAdditionalIconButton();
            u11.o(-1367108009);
            if (additionalIconButton != null) {
                u11.o(-70038560);
                boolean z13 = (i14 == 32) | (i15 == 256);
                Object C13 = u11.C();
                if (z13 || C13 == InterfaceC3967k.a.a()) {
                    C13 = new B2bFormContentKt$ButtonSection$1$1$3$1$1(onHideKeyboard, actionHandler);
                    u11.x(C13);
                }
                u11.k();
                DsIconButtonAtomKt.DsIconButtonAtom(additionalIconButton, null, false, (Function1) C13, u11, IconButtonV3DTO.$stable, 6);
                Unit unit2 = Unit.f71690a;
            }
            u11.k();
            u11.f();
            TextDTO agreement = buttonSection.getAgreement();
            u11.o(-560198334);
            if (agreement != null) {
                DsTextAtomKt.DsTextAtom(agreement, null, u11, 0, 2);
                Unit unit3 = Unit.f71690a;
            }
            u11.k();
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new B2bFormContentKt$ButtonSection$2(buttonSection, onHideKeyboard, actionHandler, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void DsTextInput(CommonInputV2VO.TextInputV2 textInputV2, String str, DsInputStatus dsInputStatus, String str2, Function1<? super String, Unit> function1, Function0<Unit> function0, Function0<Unit> function02, l lVar, Function1<? super AtomAction, Unit> function12, Integer num, InterfaceC3967k interfaceC3967k, int i11) {
        DsInputType dsInputType;
        long textSecondary;
        C3969l c3969l;
        C3969l u11 = interfaceC3967k.u(1399526181);
        int i12 = (i11 & 6) == 0 ? ((i11 & 8) == 0 ? u11.n(textInputV2) : u11.F(textInputV2) ? 4 : 2) | i11 : i11;
        if ((i11 & 48) == 0) {
            i12 |= u11.n(str) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.n(dsInputStatus) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i11 & 3072) == 0) {
            i12 |= u11.n(str2) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i11 & 24576) == 0) {
            i12 |= u11.F(function1) ? 16384 : 8192;
        }
        if ((196608 & i11) == 0) {
            i12 |= u11.F(function0) ? 131072 : 65536;
        }
        if ((1572864 & i11) == 0) {
            i12 |= u11.F(function02) ? 1048576 : 524288;
        }
        if ((i11 & 12582912) == 0) {
            i12 |= u11.F(lVar) ? 8388608 : 4194304;
        }
        if ((i11 & 100663296) == 0) {
            i12 |= u11.F(function12) ? 67108864 : 33554432;
        }
        if ((i11 & 805306368) == 0) {
            i12 |= u11.n(num) ? 536870912 : 268435456;
        }
        if ((i12 & 306783379) == 306783378 && u11.b()) {
            u11.j();
            c3969l = u11;
        } else {
            u11.o(-266012299);
            Object C11 = u11.C();
            if (C11 == InterfaceC3967k.a.a()) {
                C11 = E0.b(0, 1, EnumC11113a.DROP_OLDEST, 1);
                u11.x(C11);
            }
            w0 w0Var = (w0) C11;
            u11.k();
            InterfaceC3978p0 l11 = n1.l(function12, u11);
            Unit unit = Unit.f71690a;
            u11.o(-266004100);
            boolean F11 = u11.F(w0Var) | u11.n(l11);
            Object C12 = u11.C();
            if (F11 || C12 == InterfaceC3967k.a.a()) {
                C12 = new B2bFormContentKt$DsTextInput$1$1(w0Var, l11, null);
                u11.x(C12);
            }
            u11.k();
            Q.e(u11, unit, (Function2) C12);
            String mask = textInputV2.getMask();
            u11.o(-265998748);
            boolean n11 = u11.n(mask);
            Object C13 = u11.C();
            if (n11 || C13 == InterfaceC3967k.a.a()) {
                C13 = new MaskVisualTransformation(textInputV2.getMask(), (char) 0, 2, null);
                u11.x(C13);
            }
            MaskVisualTransformation maskVisualTransformation = (MaskVisualTransformation) C13;
            u11.k();
            String mask2 = textInputV2.getMask();
            u11.o(-265991976);
            boolean n12 = u11.n(mask2) | ((i12 & 112) == 32);
            Object C14 = u11.C();
            if (n12 || C14 == InterfaceC3967k.a.a()) {
                if (textInputV2.getMask() != null) {
                    StringBuilder sb2 = new StringBuilder();
                    int length = str.length();
                    for (int i13 = 0; i13 < length; i13++) {
                        char charAt = str.charAt(i13);
                        if (Character.isLetterOrDigit(charAt)) {
                            sb2.append(charAt);
                        }
                    }
                    String sb3 = sb2.toString();
                    Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
                    C14 = sb3;
                } else {
                    C14 = str;
                }
                u11.x(C14);
            }
            String str3 = (String) C14;
            u11.k();
            e j11 = T.j(a0.e(e.f40358c0, 1.0f), 0.0f, 0.0f, 0.0f, num != null ? num.intValue() : 0, 7);
            String label = textInputV2.getLabel();
            u11.o(-265978718);
            if (textInputV2.getOnClick() != null) {
                u11.o(-265976917);
                boolean n13 = ((i12 & 3670016) == 1048576) | ((i12 & 14) == 4 || ((i12 & 8) != 0 && u11.F(textInputV2))) | u11.n(l11);
                Object C15 = u11.C();
                if (n13 || C15 == InterfaceC3967k.a.a()) {
                    C15 = new B2bFormContentKt$DsTextInput$2$1(function02, textInputV2, l11);
                    u11.x(C15);
                }
                u11.k();
                dsInputType = new DsInputType.Button((Function0) C15);
            } else {
                dsInputType = DsInputType.Default.INSTANCE;
            }
            u11.k();
            if (dsInputStatus == DsInputStatus.ERROR) {
                u11.o(-265968896);
                textSecondary = UniTheme.INSTANCE.getColors(u11, UniTheme.$stable).getTextNegative();
            } else {
                u11.o(-265967807);
                textSecondary = UniTheme.INSTANCE.getColors(u11, UniTheme.$stable).getTextSecondary();
            }
            u11.k();
            DsInputType dsInputType2 = dsInputType;
            N0 n02 = new N0(CommonInputV2MapperKt.toKeyboardCapitalization(textInputV2.getInputType()), textInputV2.getKeyboardType(), 122);
            u11.o(-265959320);
            boolean z11 = (i12 & 3670016) == 1048576;
            Object C16 = u11.C();
            if (z11 || C16 == InterfaceC3967k.a.a()) {
                C16 = new B2bFormContentKt$DsTextInput$3$1(function02);
                u11.x(C16);
            }
            u11.k();
            M0 m02 = new M0((Function1) C16, 62);
            String icon = textInputV2.getIcon();
            UniIconToken byId = icon != null ? UniTheme.INSTANCE.getIconTokens().getById(icon) : null;
            u11.o(-265956635);
            int i14 = i12 & 14;
            boolean F12 = (i14 == 4 || ((i12 & 8) != 0 && u11.F(textInputV2))) | ((i12 & 57344) == 16384) | u11.F(w0Var);
            Object C17 = u11.C();
            if (F12 || C17 == InterfaceC3967k.a.a()) {
                C17 = new B2bFormContentKt$DsTextInput$5$1(textInputV2, function1, w0Var);
                u11.x(C17);
            }
            Function1 function13 = (Function1) C17;
            u11.k();
            C7807Z m11 = C7807Z.m(textSecondary);
            u11.o(-265914170);
            boolean F13 = ((i12 & 896) == 256) | ((458752 & i12) == 131072) | (i14 == 4 || ((i12 & 8) != 0 && u11.F(textInputV2))) | u11.F(lVar);
            Object C18 = u11.C();
            if (F13 || C18 == InterfaceC3967k.a.a()) {
                C18 = new B2bFormContentKt$DsTextInput$6$1(dsInputStatus, function0, textInputV2, lVar);
                u11.x(C18);
            }
            u11.k();
            c3969l = u11;
            DsInputBaseKt.m1743DsInputBaseawFkL_c(str3, (Function1<? super String, Unit>) function13, j11, (DsInputSize) null, dsInputType2, (DsInputTheme) null, (DsInputState) null, dsInputStatus, false, label, (DsInputLabelPosition) null, (String) null, str2, m11, (UniIconToken) null, byId, false, false, false, n02, m02, (Q1.X) maskVisualTransformation, (q) null, (Function0<Unit>) null, (Function0<Unit>) null, (Function0<Unit>) null, (Function1<? super DsInputStatus, Unit>) null, (Function1<? super Boolean, Unit>) C18, (Function1<? super String, Unit>) null, (InterfaceC3967k) c3969l, (i12 << 15) & 29360128, ((i12 >> 3) & 896) | 12582912 | (UniIconToken.$stable << 15), 0, 398806376);
        }
        J0 m03 = c3969l.m0();
        if (m03 != null) {
            m03.G(new B2bFormContentKt$DsTextInput$7(textInputV2, str, dsInputStatus, str2, function1, function0, function02, lVar, function12, num, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Function1<AtomAction, Unit> DsTextInput$lambda$19(A1<? extends Function1<? super AtomAction, Unit>> a12) {
        return (Function1) a12.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x02d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FormBlockSection(B2bFormVI.FormBlockVI formBlockVI, Map<String, String> map, Map<String, ? extends DsInputStatus> map2, Map<String, String> map3, Function2<? super String, ? super String, Unit> function2, Function1<? super String, Unit> function1, Function0<Unit> function0, Function1<? super AtomAction, Unit> function12, l lVar, InterfaceC3967k interfaceC3967k, int i11) {
        B2bFormVI.FormBlockVI formBlockVI2;
        int i12;
        Function1<? super AtomAction, Unit> function13;
        int i13;
        int i14;
        float f7;
        int I11;
        List<CellDTO> cellList;
        DisclaimerDTO disclaimer;
        float gap;
        List<CommonInputV2VO> list;
        int i15;
        C3969l u11 = interfaceC3967k.u(250351656);
        if ((i11 & 6) == 0) {
            formBlockVI2 = formBlockVI;
            i12 = (u11.n(formBlockVI2) ? 4 : 2) | i11;
        } else {
            formBlockVI2 = formBlockVI;
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.F(map) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.F(map2) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i11 & 3072) == 0) {
            i12 |= u11.F(map3) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i11 & 24576) == 0) {
            i12 |= u11.F(function2) ? 16384 : 8192;
        }
        if ((196608 & i11) == 0) {
            i12 |= u11.F(function1) ? 131072 : 65536;
        }
        if ((1572864 & i11) == 0) {
            i12 |= u11.F(function0) ? 1048576 : 524288;
        }
        if ((12582912 & i11) == 0) {
            function13 = function12;
            i12 |= u11.F(function13) ? 8388608 : 4194304;
        } else {
            function13 = function12;
        }
        if ((i11 & 100663296) == 0) {
            i12 |= u11.F(lVar) ? 67108864 : 33554432;
        }
        if ((i12 & 38347923) == 38347922 && u11.b()) {
            u11.j();
        } else {
            e applyWidgetSettings = TravelWidgetSettingsExtKt.applyWidgetSettings(a0.e(e.f40358c0, 1.0f), formBlockVI2.getSettings(), u11, 6, 0);
            C5194q a11 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), u11, 0);
            int I12 = u11.I();
            A0 d11 = u11.d();
            e f11 = c.f(u11, applyWidgetSettings);
            Function0 a12 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a12);
            } else {
                u11.e();
            }
            Function2 g10 = b.g(u11, a11, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I12))) {
                a.d(I12, u11, I12, g10);
            }
            F1.b(u11, f11, InterfaceC2801g.a.f());
            TextDTO title = formBlockVI2.getTitle();
            u11.o(-1867557263);
            if (title == null) {
                i13 = 2;
                i14 = 0;
            } else {
                i13 = 2;
                i14 = 0;
                DsTextAtomKt.DsTextAtom(title, null, u11, 0, 2);
                Unit unit = Unit.f71690a;
            }
            u11.k();
            TextDTO subtitle = formBlockVI2.getSubtitle();
            u11.o(-1867554537);
            if (subtitle != null) {
                DsTextAtomKt.DsTextAtom(subtitle, null, u11, i14, i13);
                Unit unit2 = Unit.f71690a;
            }
            u11.k();
            u11.o(-1867550620);
            List<CommonInputV2VO> inputList = formBlockVI2.getInputList();
            int size = inputList.size();
            int i16 = 0;
            while (i16 < size) {
                CommonInputV2VO commonInputV2VO = inputList.get(i16);
                u11.o(-1867549111);
                if (commonInputV2VO instanceof CommonInputV2VO.TextInputV2) {
                    CommonInputV2VO.TextInputV2 textInputV2 = (CommonInputV2VO.TextInputV2) commonInputV2VO;
                    list = inputList;
                    u11.G(-226621442, textInputV2.getName());
                    String str = map.get(textInputV2.getName());
                    if (str == null) {
                        str = textInputV2.getValue();
                    }
                    DsInputStatus dsInputStatus = map2.get(textInputV2.getName());
                    if (dsInputStatus == null) {
                        dsInputStatus = textInputV2.getStatus();
                    }
                    String str2 = str;
                    String str3 = map3.get(textInputV2.getName());
                    if (str3 == null) {
                        str3 = textInputV2.getError();
                    }
                    String str4 = str3;
                    u11.o(-226606041);
                    DsInputStatus dsInputStatus2 = dsInputStatus;
                    boolean F11 = ((57344 & i12) == 16384) | u11.F(commonInputV2VO);
                    Object C11 = u11.C();
                    if (F11 || C11 == InterfaceC3967k.a.a()) {
                        C11 = new B2bFormContentKt$FormBlockSection$1$3$1$1(function2, commonInputV2VO);
                        u11.x(C11);
                    }
                    Function1 function14 = (Function1) C11;
                    u11.k();
                    u11.o(-226603120);
                    boolean F12 = ((458752 & i12) == 131072) | u11.F(commonInputV2VO);
                    Object C12 = u11.C();
                    if (F12 || C12 == InterfaceC3967k.a.a()) {
                        C12 = new B2bFormContentKt$FormBlockSection$1$3$2$1(function1, commonInputV2VO);
                        u11.x(C12);
                    }
                    Function0 function02 = (Function0) C12;
                    u11.k();
                    C3969l c3969l = u11;
                    i15 = i16;
                    DsTextInput(textInputV2, str2, dsInputStatus2, str4, function14, function02, function0, lVar, function13, i16 != C7714v.P(formBlockVI2.getInputList()) ? Integer.valueOf(formBlockVI2.getGap()) : null, c3969l, CommonInputV2VO.TextInputV2.$stable | (i12 & 3670016) | ((i12 >> 3) & 29360128) | ((i12 << 3) & 234881024));
                    u11 = c3969l;
                    u11.J();
                } else {
                    list = inputList;
                    i15 = i16;
                }
                u11.k();
                i16 = i15 + 1;
                function13 = function12;
                inputList = list;
            }
            u11.k();
            e e11 = a0.e(e.f40358c0, 1.0f);
            if (!formBlockVI2.getInputList().isEmpty()) {
                B2bFormVI.FormBlockVI.CellListBlockVI cellListBlock = formBlockVI2.getCellListBlock();
                if ((cellListBlock != null ? cellListBlock.getCellList() : null) != null) {
                    f7 = formBlockVI2.getGap();
                    e j11 = T.j(e11, 0.0f, f7, 0.0f, 0.0f, 13);
                    B2bFormVI.FormBlockVI.CellListBlockVI cellListBlock2 = formBlockVI2.getCellListBlock();
                    e applyWidgetSettings2 = TravelWidgetSettingsExtKt.applyWidgetSettings(j11, cellListBlock2 == null ? cellListBlock2.getSettings() : null, u11, 0, 0);
                    C5194q a13 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), u11, 0);
                    I11 = u11.I();
                    A0 d12 = u11.d();
                    e f12 = c.f(u11, applyWidgetSettings2);
                    Function0 a14 = g.a(InterfaceC2801g.f5440U, u11);
                    if (u11.t()) {
                        u11.e();
                    } else {
                        u11.H(a14);
                    }
                    Function2 g11 = b.g(u11, a13, u11, d12);
                    if (!u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                        a.d(I11, u11, I11, g11);
                    }
                    F1.b(u11, f12, InterfaceC2801g.a.f());
                    B2bFormVI.FormBlockVI.CellListBlockVI cellListBlock3 = formBlockVI2.getCellListBlock();
                    cellList = cellListBlock3 == null ? cellListBlock3.getCellList() : null;
                    u11.o(-226580027);
                    if (cellList != null) {
                        int size2 = cellList.size();
                        int i17 = 0;
                        while (i17 < size2) {
                            CellDTO cellDTO = cellList.get(i17);
                            u11.G(63861855, cellDTO.getCenterBlock().getTitle().getText());
                            e.a aVar = e.f40358c0;
                            u0.E.a(u11, a0.f(aVar, i17 != 0 ? formBlockVI2.getCellListBlock().getGap() : 0));
                            DsCellAtomKt.DsCellAtom(cellDTO, a0.e(aVar, 1.0f), function12, u11, ((i12 >> 15) & 896) | CellDTO.$stable | 48, 0);
                            u11.J();
                            i17++;
                        }
                        Unit unit3 = Unit.f71690a;
                    }
                    u11.k();
                    u11.f();
                    disclaimer = formBlockVI2.getDisclaimer();
                    u11.o(-1867489712);
                    if (disclaimer != null) {
                        e e12 = a0.e(e.f40358c0, 1.0f);
                        if (formBlockVI2.getInputList().isEmpty()) {
                            B2bFormVI.FormBlockVI.CellListBlockVI cellListBlock4 = formBlockVI2.getCellListBlock();
                            if (CollectionExtKt.isNullOrEmpty(cellListBlock4 != null ? cellListBlock4.getCellList() : null)) {
                                gap = 0;
                                DsDisclaimerAtomKt.DsDisclaimerAtom(disclaimer, T.j(e12, 0.0f, gap, 0.0f, 0.0f, 13), function12, u11, DisclaimerDTO.$stable | ((i12 >> 15) & 896), 0);
                                Unit unit4 = Unit.f71690a;
                            }
                        }
                        gap = formBlockVI2.getGap();
                        DsDisclaimerAtomKt.DsDisclaimerAtom(disclaimer, T.j(e12, 0.0f, gap, 0.0f, 0.0f, 13), function12, u11, DisclaimerDTO.$stable | ((i12 >> 15) & 896), 0);
                        Unit unit42 = Unit.f71690a;
                    }
                    u11.k();
                    u11.f();
                }
            }
            f7 = 0;
            e j112 = T.j(e11, 0.0f, f7, 0.0f, 0.0f, 13);
            B2bFormVI.FormBlockVI.CellListBlockVI cellListBlock22 = formBlockVI2.getCellListBlock();
            e applyWidgetSettings22 = TravelWidgetSettingsExtKt.applyWidgetSettings(j112, cellListBlock22 == null ? cellListBlock22.getSettings() : null, u11, 0, 0);
            C5194q a132 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), u11, 0);
            I11 = u11.I();
            A0 d122 = u11.d();
            e f122 = c.f(u11, applyWidgetSettings22);
            Function0 a142 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
            }
            Function2 g112 = b.g(u11, a132, u11, d122);
            if (!u11.t()) {
            }
            a.d(I11, u11, I11, g112);
            F1.b(u11, f122, InterfaceC2801g.a.f());
            B2bFormVI.FormBlockVI.CellListBlockVI cellListBlock32 = formBlockVI2.getCellListBlock();
            if (cellListBlock32 == null) {
            }
            u11.o(-226580027);
            if (cellList != null) {
            }
            u11.k();
            u11.f();
            disclaimer = formBlockVI2.getDisclaimer();
            u11.o(-1867489712);
            if (disclaimer != null) {
            }
            u11.k();
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new B2bFormContentKt$FormBlockSection$2(formBlockVI2, map, map2, map3, function2, function1, function0, function12, lVar, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void HeaderSection(B2bFormVI.HeaderSectionVI headerSectionVI, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        C3969l u11 = interfaceC3967k.u(279727278);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(headerSectionVI) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i12 & 3) == 2 && u11.b()) {
            u11.j();
        } else {
            e.a aVar = e.f40358c0;
            e applyWidgetSettings = TravelWidgetSettingsExtKt.applyWidgetSettings(a0.e(aVar, 1.0f), headerSectionVI.getSettings(), u11, 6, 0);
            C5194q a11 = C5193p.a(C5179b.g(), InterfaceC6250b.a.g(), u11, 48);
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f7 = c.f(u11, applyWidgetSettings);
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
            ImageDTO image = headerSectionVI.getImage();
            u11.o(-1117710592);
            if (image != null) {
                DsImageAtomKt.DsImageAtom(image, null, u11, 0, 2);
            }
            u11.k();
            DsTextAtomKt.DsTextAtom(headerSectionVI.getTitle(), a0.e(aVar, 1.0f), u11, 48, 0);
            TextDTO subtitle = headerSectionVI.getSubtitle();
            u11.o(-1117703950);
            if (subtitle != null) {
                DsTextAtomKt.DsTextAtom(subtitle, a0.e(aVar, 1.0f), u11, 48, 0);
            }
            u11.k();
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new B2bFormContentKt$HeaderSection$2(headerSectionVI, i11));
        }
    }
}

package ru.ozon.app.android.pdp.widgets.wholeSaleModal3P.presentation.wholeSaleModal;

import B0.M0;
import B0.N0;
import D1.InterfaceC2801g;
import Ep.a;
import Fr.g;
import K00.b;
import Pk0.h;
import Q1.X;
import S0.A0;
import S0.C3969l;
import S0.D1;
import S0.F1;
import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import S0.J0;
import S0.n1;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5193p;
import androidx.compose.foundation.layout.C5194q;
import androidx.compose.foundation.layout.T;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.Q1;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l1.C7807Z;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.widgets.wholeSaleModal3P.data.DeliveryType;
import ru.ozon.app.android.pdp.widgets.wholeSaleModal3P.presentation.ViewIntent;
import ru.ozon.app.android.pdp.widgets.wholeSaleModal3P.presentation.wholeSaleModal.WholeSaleModalVI;
import ru.ozon.uni.android.ds.compose.component.input.DsInputBaseKt;
import ru.ozon.uni.android.ds.compose.component.input.DsInputLabelPosition;
import ru.ozon.uni.android.ds.compose.component.input.DsInputSize;
import ru.ozon.uni.android.ds.compose.component.input.DsInputState;
import ru.ozon.uni.android.ds.compose.component.input.DsInputStatus;
import ru.ozon.uni.android.ds.compose.component.input.DsInputTheme;
import ru.ozon.uni.android.ds.compose.component.input.DsInputType;
import ru.ozon.uni.android.ds.compose.component.tabs.DsTabsAtomKt;
import ru.ozon.uni.android.ds.compose.component.text.DsTextAtomKt;
import ru.ozon.uni.android.ds.compose.util.DsSpacings;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.tabs.TabsDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.core.models.UniIconToken;
import ru.ozon.uni.core.repository.UniTheme;
import t0.q;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u001a_\u0010\f\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0001¢\u0006\u0004\b\f\u0010\r\u001aC\u0010\u0015\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0011\u001a\u00020\u00102\u0018\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\n0\u0012H\u0003¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0019²\u0006\u000e\u0010\u0017\u001a\u00020\u00058\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0018\u001a\u00020\u00138\n@\nX\u008a\u008e\u0002"}, d2 = {"Lru/ozon/app/android/pdp/widgets/wholeSaleModal3P/presentation/wholeSaleModal/WholeSaleModalVI;", "state", "Lru/ozon/app/android/pdp/widgets/wholeSaleModal3P/data/DeliveryType;", "selectedTab", "Lkotlin/Pair;", "", "countText", "regionText", "Lkotlin/Function1;", "Lru/ozon/app/android/pdp/widgets/wholeSaleModal3P/presentation/ViewIntent;", "", "onViewIntent", "WholeSaleModalComposable", "(Lru/ozon/app/android/pdp/widgets/wholeSaleModal3P/presentation/wholeSaleModal/WholeSaleModalVI;Lru/ozon/app/android/pdp/widgets/wholeSaleModal3P/data/DeliveryType;Lkotlin/Pair;Lkotlin/Pair;Lkotlin/jvm/functions/Function1;LS0/k;I)V", "text", "inputError", "Lru/ozon/app/android/pdp/widgets/wholeSaleModal3P/presentation/wholeSaleModal/WholeSaleModalVI$TextInput;", "textInput", "Lkotlin/Function2;", "", "onInputChanged", "WholeSaleInput", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/pdp/widgets/wholeSaleModal3P/presentation/wholeSaleModal/WholeSaleModalVI$TextInput;Lkotlin/jvm/functions/Function2;LS0/k;I)V", "inputText", "savedFocus", "pdp_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class WholeSaleModalComposableKt {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00ae, code lost:
    
        if (r12 == null) goto L52;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void WholeSaleInput(String str, String str2, WholeSaleModalVI.TextInput textInput, Function2<? super String, ? super Boolean, Unit> function2, InterfaceC3967k interfaceC3967k, int i11) {
        String str3;
        int i12;
        String hint;
        C3969l c3969l;
        C3969l u11 = interfaceC3967k.u(974521506);
        if ((i11 & 6) == 0) {
            str3 = str;
            i12 = (u11.n(str3) ? 4 : 2) | i11;
        } else {
            str3 = str;
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.n(str2) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.n(textInput) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i11 & 3072) == 0) {
            i12 |= u11.F(function2) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i12 & 1171) == 1170 && u11.b()) {
            u11.j();
            c3969l = u11;
        } else {
            u11.o(-1926610620);
            Object C11 = u11.C();
            if (C11 == InterfaceC3967k.a.a()) {
                C11 = n1.f(str3, D1.f25195a);
                u11.x(C11);
            }
            InterfaceC3978p0 interfaceC3978p0 = (InterfaceC3978p0) C11;
            Object b11 = h.b(u11, -1926608827);
            if (b11 == InterfaceC3967k.a.a()) {
                b11 = n1.f(Boolean.FALSE, D1.f25195a);
                u11.x(b11);
            }
            InterfaceC3978p0 interfaceC3978p02 = (InterfaceC3978p0) b11;
            u11.k();
            String placeholder = textInput.getPlaceholder();
            if (str2 != null) {
                hint = str2.length() == 0 ? null : str2;
            }
            hint = textInput.getHint();
            String str4 = hint;
            N0 n02 = textInput.getIsDigit() ? new N0(0, 3, 123) : N0.f1448g;
            u11.o(-1926597753);
            C7807Z m11 = str2 == null ? null : C7807Z.m(UniTheme.INSTANCE.getColors(u11, UniTheme.$stable).getTextNegative());
            u11.k();
            DsInputStatus dsInputStatus = str2 != null ? DsInputStatus.ERROR : DsInputStatus.NEUTRAL;
            u11.o(-1926587033);
            int i13 = i12 & 7168;
            boolean z11 = ((i12 & 896) == 256) | (i13 == 2048);
            Object C12 = u11.C();
            if (z11 || C12 == InterfaceC3967k.a.a()) {
                C12 = new WholeSaleModalComposableKt$WholeSaleInput$3$1(textInput, function2, interfaceC3978p0);
                u11.x(C12);
            }
            Function1 function1 = (Function1) C12;
            u11.k();
            u11.o(-1926591842);
            boolean z12 = i13 == 2048;
            Object C13 = u11.C();
            if (z12 || C13 == InterfaceC3967k.a.a()) {
                C13 = new WholeSaleModalComposableKt$WholeSaleInput$4$1(function2, interfaceC3978p0, interfaceC3978p02);
                u11.x(C13);
            }
            u11.k();
            int i14 = i12 & 14;
            c3969l = u11;
            DsInputBaseKt.m1743DsInputBaseawFkL_c(str3, (Function1<? super String, Unit>) function1, (e) null, (DsInputSize) null, (DsInputType) null, (DsInputTheme) null, (DsInputState) null, dsInputStatus, false, placeholder, (DsInputLabelPosition) null, (String) null, str4, m11, (UniIconToken) null, (UniIconToken) null, false, false, false, n02, (M0) null, (X) null, (q) null, (Function0<Unit>) null, (Function0<Unit>) null, (Function0<Unit>) null, (Function1<? super DsInputStatus, Unit>) null, (Function1<? super Boolean, Unit>) C13, (Function1<? super String, Unit>) null, (InterfaceC3967k) c3969l, i14, 12582912, 0, 401984892);
        }
        J0 m02 = c3969l.m0();
        if (m02 != null) {
            m02.G(new WholeSaleModalComposableKt$WholeSaleInput$5(str, str2, textInput, function2, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void WholeSaleInput$lambda$10(InterfaceC3978p0<Boolean> interfaceC3978p0, boolean z11) {
        interfaceC3978p0.setValue(Boolean.valueOf(z11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String WholeSaleInput$lambda$6(InterfaceC3978p0<String> interfaceC3978p0) {
        return interfaceC3978p0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean WholeSaleInput$lambda$9(InterfaceC3978p0<Boolean> interfaceC3978p0) {
        return interfaceC3978p0.getValue().booleanValue();
    }

    public static final void WholeSaleModalComposable(@NotNull WholeSaleModalVI state, @NotNull DeliveryType selectedTab, @NotNull Pair<String, String> countText, @NotNull Pair<String, String> regionText, @NotNull Function1<? super ViewIntent, Unit> onViewIntent, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        int i13;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(selectedTab, "selectedTab");
        Intrinsics.checkNotNullParameter(countText, "countText");
        Intrinsics.checkNotNullParameter(regionText, "regionText");
        Intrinsics.checkNotNullParameter(onViewIntent, "onViewIntent");
        C3969l u11 = interfaceC3967k.u(769645400);
        if ((i11 & 6) == 0) {
            i12 = (u11.F(state) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.n(selectedTab) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.n(countText) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i11 & 3072) == 0) {
            i12 |= u11.n(regionText) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i11 & 24576) == 0) {
            i12 |= u11.F(onViewIntent) ? 16384 : 8192;
        }
        if ((i12 & 9363) == 9362 && u11.b()) {
            u11.j();
        } else {
            e g10 = T.g(Q1.a(e.f40358c0, "pdp.wholeSaleModal3P.1"), Paddings.PADDING_500.m1867getDpD9Ej5fM(), Paddings.PADDING_300.m1867getDpD9Ej5fM());
            int i14 = C5179b.f39454h;
            C5194q a11 = C5193p.a(C5179b.n(DsSpacings.INSTANCE.m1842getDp12D9Ej5fM()), InterfaceC6250b.a.k(), u11, 0);
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f7 = c.f(u11, g10);
            Function0 a12 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a12);
            } else {
                u11.e();
            }
            Function2 g11 = b.g(u11, a11, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                a.d(I11, u11, I11, g11);
            }
            F1.b(u11, f7, InterfaceC2801g.a.f());
            String e11 = countText.e();
            String f11 = countText.f();
            WholeSaleModalVI.TextInput countTextInput = state.getCountTextInput();
            u11.o(215484880);
            int i15 = i12 & 57344;
            boolean z11 = i15 == 16384;
            Object C11 = u11.C();
            if (z11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new WholeSaleModalComposableKt$WholeSaleModalComposable$1$1$1(onViewIntent);
                u11.x(C11);
            }
            u11.k();
            WholeSaleInput(e11, f11, countTextInput, (Function2) C11, u11, 0);
            TabsDTO tabs = state.getDeliveryTabs().getTabs();
            u11.o(215491178);
            boolean z12 = i15 == 16384;
            Object C12 = u11.C();
            if (z12 || C12 == InterfaceC3967k.a.a()) {
                C12 = new WholeSaleModalComposableKt$WholeSaleModalComposable$1$2$1(onViewIntent);
                u11.x(C12);
            }
            u11.k();
            DsTabsAtomKt.DsTabsAtom(tabs, null, null, (Function1) C12, u11, TabsDTO.$stable, 6);
            if (selectedTab == DeliveryType.Pickup) {
                u11.o(-1909584723);
                String e12 = regionText.e();
                String f12 = regionText.f();
                WholeSaleModalVI.TextInput regionTextInput = state.getRegionTextInput();
                u11.o(215501425);
                boolean z13 = i15 == 16384;
                Object C13 = u11.C();
                if (z13 || C13 == InterfaceC3967k.a.a()) {
                    C13 = new WholeSaleModalComposableKt$WholeSaleModalComposable$1$3$1(onViewIntent);
                    u11.x(C13);
                }
                u11.k();
                WholeSaleInput(e12, f12, regionTextInput, (Function2) C13, u11, 0);
                u11.k();
                i13 = 0;
            } else {
                u11.o(-1909266694);
                i13 = 0;
                DsTextAtomKt.DsTextAtom(state.getDeliveryText(), null, u11, 0, 2);
                u11.k();
            }
            TextDTO footerText = state.getFooterText();
            u11.o(215507996);
            if (footerText != null) {
                DsTextAtomKt.DsTextAtom(footerText, null, u11, i13, 2);
            }
            u11.k();
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new WholeSaleModalComposableKt$WholeSaleModalComposable$2(state, selectedTab, countText, regionText, onViewIntent, i11));
        }
    }
}

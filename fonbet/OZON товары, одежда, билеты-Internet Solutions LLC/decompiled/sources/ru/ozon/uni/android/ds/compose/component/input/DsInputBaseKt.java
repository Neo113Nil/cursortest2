package ru.ozon.uni.android.ds.compose.component.input;

import B0.M0;
import B0.N0;
import Q1.K;
import Q1.X;
import S0.D1;
import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import S0.Q;
import S0.n1;
import androidx.compose.ui.e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l1.C7807Z;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.data.HammersV3BodyDTO;
import ru.ozon.uni.android.ds.compose.component.input.DsInputType;
import ru.ozon.uni.android.ds.compose.util.ClipboardExtKt;
import ru.ozon.uni.core.models.UniIconToken;
import t0.p;
import t0.q;

@Metadata(d1 = {"\u0000z\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aû\u0002\u00101\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\u0015\u001a\u00020\u00142\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001a2\b\b\u0002\u0010\u001d\u001a\u00020\u00112\b\b\u0002\u0010\u001e\u001a\u00020\u00112\b\b\u0002\u0010\u001f\u001a\u00020\u00112\b\b\u0002\u0010!\u001a\u00020 2\b\b\u0002\u0010#\u001a\u00020\"2\b\b\u0002\u0010%\u001a\u00020$2\b\b\u0002\u0010'\u001a\u00020&2\u000e\b\u0002\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00030(2\u000e\b\u0002\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00030(2\u000e\b\u0002\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00030(2\u0014\b\u0002\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00030\u00022\u0014\b\u0002\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00030\u00022\u0014\b\u0002\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b/\u00100\u001aû\u0002\u00101\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u0002022\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\u0015\u001a\u00020\u00142\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001a2\b\b\u0002\u0010\u001d\u001a\u00020\u00112\b\b\u0002\u0010\u001e\u001a\u00020\u00112\b\b\u0002\u0010\u001f\u001a\u00020\u00112\b\b\u0002\u0010!\u001a\u00020 2\b\b\u0002\u0010#\u001a\u00020\"2\b\b\u0002\u0010%\u001a\u00020$2\b\b\u0002\u0010'\u001a\u00020&2\u000e\b\u0002\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00030(2\u000e\b\u0002\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00030(2\u000e\b\u0002\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00030(2\u0014\b\u0002\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00030\u00022\u0014\b\u0002\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00030\u00022\u0014\b\u0002\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b/\u00103¨\u00066²\u0006\u000e\u00104\u001a\u0002028\n@\nX\u008a\u008e\u0002²\u0006\u000e\u00105\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002"}, d2 = {"", AppMeasurementSdk.ConditionalUserProperty.VALUE, "Lkotlin/Function1;", "", "onValueChange", "Landroidx/compose/ui/e;", "modifier", "Lru/ozon/uni/android/ds/compose/component/input/DsInputSize;", "size", "Lru/ozon/uni/android/ds/compose/component/input/DsInputType;", "type", "Lru/ozon/uni/android/ds/compose/component/input/DsInputTheme;", "theme", "Lru/ozon/uni/android/ds/compose/component/input/DsInputState;", "state", "Lru/ozon/uni/android/ds/compose/component/input/DsInputStatus;", "status", "", "loading", "label", "Lru/ozon/uni/android/ds/compose/component/input/DsInputLabelPosition;", "labelPosition", HammersV3BodyDTO.PLACEHOLDER, "caption", "Ll1/Z;", "captionColor", "Lru/ozon/uni/core/models/UniIconToken;", "firstIcon", "secondIcon", "hasClearButton", "hasErrorIcon", "hasCopyButton", "LB0/N0;", "keyboardOptions", "LB0/M0;", "keyboardActions", "LQ1/X;", "visualTransformation", "Lt0/q;", "interactionSource", "Lkotlin/Function0;", "onFirstIconClick", "onSecondIconClick", "onClearClick", "onStatusChanged", "onFocusChanged", "copyTextAction", "DsInputBase-awFkL_c", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/e;Lru/ozon/uni/android/ds/compose/component/input/DsInputSize;Lru/ozon/uni/android/ds/compose/component/input/DsInputType;Lru/ozon/uni/android/ds/compose/component/input/DsInputTheme;Lru/ozon/uni/android/ds/compose/component/input/DsInputState;Lru/ozon/uni/android/ds/compose/component/input/DsInputStatus;ZLjava/lang/String;Lru/ozon/uni/android/ds/compose/component/input/DsInputLabelPosition;Ljava/lang/String;Ljava/lang/String;Ll1/Z;Lru/ozon/uni/core/models/UniIconToken;Lru/ozon/uni/core/models/UniIconToken;ZZZLB0/N0;LB0/M0;LQ1/X;Lt0/q;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;LS0/k;IIII)V", "DsInputBase", "LQ1/K;", "(LQ1/K;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/e;Lru/ozon/uni/android/ds/compose/component/input/DsInputSize;Lru/ozon/uni/android/ds/compose/component/input/DsInputType;Lru/ozon/uni/android/ds/compose/component/input/DsInputTheme;Lru/ozon/uni/android/ds/compose/component/input/DsInputState;Lru/ozon/uni/android/ds/compose/component/input/DsInputStatus;ZLjava/lang/String;Lru/ozon/uni/android/ds/compose/component/input/DsInputLabelPosition;Ljava/lang/String;Ljava/lang/String;Ll1/Z;Lru/ozon/uni/core/models/UniIconToken;Lru/ozon/uni/core/models/UniIconToken;ZZZLB0/N0;LB0/M0;LQ1/X;Lt0/q;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;LS0/k;IIII)V", "textFieldValueState", "lastTextValue", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DsInputBaseKt {
    /* renamed from: DsInputBase-awFkL_c, reason: not valid java name */
    public static final void m1743DsInputBaseawFkL_c(@NotNull String value, @NotNull Function1<? super String, Unit> onValueChange, e eVar, DsInputSize dsInputSize, DsInputType dsInputType, DsInputTheme dsInputTheme, DsInputState dsInputState, DsInputStatus dsInputStatus, boolean z11, String str, DsInputLabelPosition dsInputLabelPosition, String str2, String str3, C7807Z c7807z, UniIconToken uniIconToken, UniIconToken uniIconToken2, boolean z12, boolean z13, boolean z14, N0 n02, M0 m02, X x11, q qVar, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, Function1<? super DsInputStatus, Unit> function1, Function1<? super Boolean, Unit> function12, Function1<? super String, Unit> function13, InterfaceC3967k interfaceC3967k, int i11, int i12, int i13, int i14) {
        UniIconToken uniIconToken3;
        q qVar2;
        q qVar3;
        Function0<Unit> function04;
        Function0<Unit> function05;
        Function0<Unit> function06;
        Function0<Unit> function07;
        Function0<Unit> function08;
        Function0<Unit> function09;
        Function1<? super DsInputStatus, Unit> function14;
        Function1<? super DsInputStatus, Unit> function15;
        Function1<? super Boolean, Unit> function16;
        int i15;
        Object f7;
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
        interfaceC3967k.o(447497623);
        e eVar2 = (i14 & 4) != 0 ? e.f40358c0 : eVar;
        DsInputSize dsInputSize2 = (i14 & 8) != 0 ? DsInputSize.SIZE_600 : dsInputSize;
        DsInputType dsInputType2 = (i14 & 16) != 0 ? DsInputType.Default.INSTANCE : dsInputType;
        DsInputTheme dsInputTheme2 = (i14 & 32) != 0 ? DsInputTheme.SOLID : dsInputTheme;
        DsInputState dsInputState2 = (i14 & 64) != 0 ? DsInputState.DEFAULT : dsInputState;
        DsInputStatus dsInputStatus2 = (i14 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? DsInputStatus.NEUTRAL : dsInputStatus;
        boolean z15 = (i14 & 256) != 0 ? false : z11;
        String str4 = (i14 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? null : str;
        DsInputLabelPosition dsInputLabelPosition2 = (i14 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? DsInputLabelPosition.INSIDE_TOP : dsInputLabelPosition;
        String str5 = (i14 & 2048) != 0 ? null : str2;
        String str6 = (i14 & 4096) != 0 ? null : str3;
        C7807Z c7807z2 = (i14 & 8192) != 0 ? null : c7807z;
        UniIconToken uniIconToken4 = (i14 & 16384) != 0 ? null : uniIconToken;
        UniIconToken uniIconToken5 = (i14 & 32768) == 0 ? uniIconToken2 : null;
        boolean z16 = true;
        boolean z17 = (i14 & 65536) != 0 ? true : z12;
        boolean z18 = (i14 & 131072) != 0 ? true : z13;
        boolean z19 = (i14 & 262144) != 0 ? true : z14;
        N0 n03 = (i14 & 524288) != 0 ? N0.f1448g : n02;
        M0 m03 = (i14 & 1048576) != 0 ? M0.f1437b : m02;
        X a11 = (i14 & 2097152) != 0 ? X.a.a() : x11;
        if ((i14 & 4194304) != 0) {
            interfaceC3967k.o(49400473);
            Object C11 = interfaceC3967k.C();
            uniIconToken3 = uniIconToken4;
            if (C11 == InterfaceC3967k.a.a()) {
                C11 = p.a();
                interfaceC3967k.x(C11);
            }
            qVar2 = (q) C11;
            interfaceC3967k.k();
        } else {
            uniIconToken3 = uniIconToken4;
            qVar2 = qVar;
        }
        if ((i14 & 8388608) != 0) {
            interfaceC3967k.o(49402868);
            Object C12 = interfaceC3967k.C();
            qVar3 = qVar2;
            if (C12 == InterfaceC3967k.a.a()) {
                C12 = DsInputBaseKt$DsInputBase$2$1.INSTANCE;
                interfaceC3967k.x(C12);
            }
            function04 = (Function0) C12;
            interfaceC3967k.k();
        } else {
            qVar3 = qVar2;
            function04 = function0;
        }
        if ((i14 & 16777216) != 0) {
            interfaceC3967k.o(49404148);
            Object C13 = interfaceC3967k.C();
            function05 = function04;
            if (C13 == InterfaceC3967k.a.a()) {
                C13 = DsInputBaseKt$DsInputBase$3$1.INSTANCE;
                interfaceC3967k.x(C13);
            }
            function06 = (Function0) C13;
            interfaceC3967k.k();
        } else {
            function05 = function04;
            function06 = function02;
        }
        if ((i14 & 33554432) != 0) {
            interfaceC3967k.o(49405268);
            Object C14 = interfaceC3967k.C();
            function07 = function06;
            if (C14 == InterfaceC3967k.a.a()) {
                C14 = DsInputBaseKt$DsInputBase$4$1.INSTANCE;
                interfaceC3967k.x(C14);
            }
            function08 = (Function0) C14;
            interfaceC3967k.k();
        } else {
            function07 = function06;
            function08 = function03;
        }
        if ((i14 & 67108864) != 0) {
            interfaceC3967k.o(49406900);
            Object C15 = interfaceC3967k.C();
            function09 = function08;
            if (C15 == InterfaceC3967k.a.a()) {
                C15 = DsInputBaseKt$DsInputBase$5$1.INSTANCE;
                interfaceC3967k.x(C15);
            }
            function14 = (Function1) C15;
            interfaceC3967k.k();
        } else {
            function09 = function08;
            function14 = function1;
        }
        if ((i14 & 134217728) != 0) {
            interfaceC3967k.o(49408308);
            Object C16 = interfaceC3967k.C();
            function15 = function14;
            if (C16 == InterfaceC3967k.a.a()) {
                C16 = DsInputBaseKt$DsInputBase$6$1.INSTANCE;
                interfaceC3967k.x(C16);
            }
            interfaceC3967k.k();
            function16 = (Function1) C16;
        } else {
            function15 = function14;
            function16 = function12;
        }
        Function1<? super String, Unit> addToClipboard = (i14 & 268435456) != 0 ? ClipboardExtKt.addToClipboard(interfaceC3967k, 0) : function13;
        interfaceC3967k.o(49418123);
        Object C17 = interfaceC3967k.C();
        DsInputLabelPosition dsInputLabelPosition3 = dsInputLabelPosition2;
        String str7 = str4;
        if (C17 == InterfaceC3967k.a.a()) {
            f7 = n1.f(new K(6, 0L, value), D1.f25195a);
            interfaceC3967k.x(f7);
            C17 = f7;
            i15 = 6;
        } else {
            i15 = 6;
        }
        InterfaceC3978p0 interfaceC3978p0 = (InterfaceC3978p0) C17;
        interfaceC3967k.k();
        e eVar3 = eVar2;
        K b11 = K.b(DsInputBase_awFkL_c$lambda$7(interfaceC3978p0), value, 0L, i15);
        interfaceC3967k.o(49429587);
        boolean n11 = interfaceC3967k.n(b11);
        Object C18 = interfaceC3967k.C();
        if (n11 || C18 == InterfaceC3967k.a.a()) {
            C18 = new DsInputBaseKt$DsInputBase$7$1(b11, interfaceC3978p0);
            interfaceC3967k.x(C18);
        }
        interfaceC3967k.k();
        int i16 = Q.f25307b;
        interfaceC3967k.g((Function0) C18);
        interfaceC3967k.o(49446875);
        boolean z21 = (((i11 & 14) ^ 6) > 4 && interfaceC3967k.n(value)) || (i11 & 6) == 4;
        Object C19 = interfaceC3967k.C();
        if (z21 || C19 == InterfaceC3967k.a.a()) {
            C19 = n1.f(value, D1.f25195a);
            interfaceC3967k.x(C19);
        }
        InterfaceC3978p0 interfaceC3978p02 = (InterfaceC3978p0) C19;
        interfaceC3967k.k();
        interfaceC3967k.o(49450411);
        boolean n12 = interfaceC3967k.n(interfaceC3978p02);
        if ((((i11 & 112) ^ 48) <= 32 || !interfaceC3967k.n(onValueChange)) && (i11 & 48) != 32) {
            z16 = false;
        }
        boolean z22 = n12 | z16;
        Object C21 = interfaceC3967k.C();
        if (z22 || C21 == InterfaceC3967k.a.a()) {
            C21 = new DsInputBaseKt$DsInputBase$internalOnValueChange$1$1(onValueChange, interfaceC3978p0, interfaceC3978p02);
            interfaceC3967k.x(C21);
        }
        interfaceC3967k.k();
        int i17 = i12 >> 6;
        int i18 = ((i11 >> 27) & 14) | ((i12 << 3) & 112) | (i12 & 896) | (i12 & 7168) | (i17 & 57344) | (i17 & 458752) | (i17 & 3670016);
        int i19 = UniIconToken.$stable;
        int i21 = i12 << 9;
        int i22 = i18 | (i19 << 21) | (i21 & 29360128) | (i19 << 24) | (i21 & 234881024) | ((i13 << 18) & 1879048192);
        int i23 = i13 << 6;
        DsInputSize dsInputSize3 = dsInputSize2;
        DsInputTheme dsInputTheme3 = dsInputTheme2;
        DsInputBaseImplKt.m1736DsInputBaseImploiW5flc(eVar3, b11, (Function1) C21, dsInputSize3, dsInputType2, dsInputTheme3, dsInputState2, z15, dsInputStatus2, str5, str7, dsInputLabelPosition3, str6, c7807z2, z17, z18, z19, uniIconToken3, uniIconToken5, function05, function07, n03, m03, a11, qVar3, function09, function15, function16, addToClipboard, interfaceC3967k, ((i11 >> 6) & 14) | (i11 & 7168) | (i11 & 57344) | (i11 & 458752) | (i11 & 3670016) | ((i11 >> 3) & 29360128) | ((i11 << 3) & 234881024) | ((i12 << 24) & 1879048192), i22, (i23 & 896) | ((i12 >> 24) & 112) | ((i13 >> 12) & 14) | (i23 & 7168) | (i23 & 57344) | (i13 & 458752) | (i13 & 3670016) | (i13 & 29360128) | (i13 & 234881024));
        interfaceC3967k.k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String DsInputBase_awFkL_c$lambda$11(InterfaceC3978p0<String> interfaceC3978p0) {
        return interfaceC3978p0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final K DsInputBase_awFkL_c$lambda$7(InterfaceC3978p0<K> interfaceC3978p0) {
        return interfaceC3978p0.getValue();
    }

    /* renamed from: DsInputBase-awFkL_c, reason: not valid java name */
    public static final void m1742DsInputBaseawFkL_c(@NotNull K value, @NotNull Function1<? super K, Unit> onValueChange, e eVar, DsInputSize dsInputSize, DsInputType dsInputType, DsInputTheme dsInputTheme, DsInputState dsInputState, DsInputStatus dsInputStatus, boolean z11, String str, DsInputLabelPosition dsInputLabelPosition, String str2, String str3, C7807Z c7807z, UniIconToken uniIconToken, UniIconToken uniIconToken2, boolean z12, boolean z13, boolean z14, N0 n02, M0 m02, X x11, q qVar, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, Function1<? super DsInputStatus, Unit> function1, Function1<? super Boolean, Unit> function12, Function1<? super String, Unit> function13, InterfaceC3967k interfaceC3967k, int i11, int i12, int i13, int i14) {
        boolean z15;
        q qVar2;
        Function0<Unit> function04;
        Function0<Unit> function05;
        Function0<Unit> function06;
        Function0<Unit> function07;
        Function0<Unit> function08;
        Function1<? super DsInputStatus, Unit> function14;
        Function1<? super Boolean, Unit> function15;
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
        interfaceC3967k.o(-727204060);
        e eVar2 = (i14 & 4) != 0 ? e.f40358c0 : eVar;
        DsInputSize dsInputSize2 = (i14 & 8) != 0 ? DsInputSize.SIZE_600 : dsInputSize;
        DsInputType dsInputType2 = (i14 & 16) != 0 ? DsInputType.Default.INSTANCE : dsInputType;
        DsInputTheme dsInputTheme2 = (i14 & 32) != 0 ? DsInputTheme.SOLID : dsInputTheme;
        DsInputState dsInputState2 = (i14 & 64) != 0 ? DsInputState.DEFAULT : dsInputState;
        DsInputStatus dsInputStatus2 = (i14 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? DsInputStatus.NEUTRAL : dsInputStatus;
        boolean z16 = (i14 & 256) != 0 ? false : z11;
        String str4 = (i14 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? null : str;
        DsInputLabelPosition dsInputLabelPosition2 = (i14 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? DsInputLabelPosition.INSIDE_TOP : dsInputLabelPosition;
        String str5 = (i14 & 2048) != 0 ? null : str2;
        e eVar3 = eVar2;
        String str6 = (i14 & 4096) != 0 ? null : str3;
        C7807Z c7807z2 = (i14 & 8192) != 0 ? null : c7807z;
        UniIconToken uniIconToken3 = (i14 & 16384) != 0 ? null : uniIconToken;
        UniIconToken uniIconToken4 = (32768 & i14) != 0 ? null : uniIconToken2;
        boolean z17 = (65536 & i14) != 0 ? true : z12;
        boolean z18 = (i14 & 131072) != 0 ? true : z13;
        boolean z19 = (i14 & 262144) == 0 ? z14 : true;
        N0 n03 = (i14 & 524288) != 0 ? N0.f1448g : n02;
        M0 m03 = (i14 & 1048576) != 0 ? M0.f1437b : m02;
        X a11 = (i14 & 2097152) != 0 ? X.a.a() : x11;
        if ((i14 & 4194304) != 0) {
            interfaceC3967k.o(49593625);
            Object C11 = interfaceC3967k.C();
            z15 = z17;
            if (C11 == InterfaceC3967k.a.a()) {
                C11 = p.a();
                interfaceC3967k.x(C11);
            }
            interfaceC3967k.k();
            qVar2 = (q) C11;
        } else {
            z15 = z17;
            qVar2 = qVar;
        }
        if ((i14 & 8388608) != 0) {
            interfaceC3967k.o(49596020);
            Object C12 = interfaceC3967k.C();
            if (C12 == InterfaceC3967k.a.a()) {
                C12 = DsInputBaseKt$DsInputBase$9$1.INSTANCE;
                interfaceC3967k.x(C12);
            }
            function04 = (Function0) C12;
            interfaceC3967k.k();
        } else {
            function04 = function0;
        }
        if ((i14 & 16777216) != 0) {
            interfaceC3967k.o(49597300);
            Object C13 = interfaceC3967k.C();
            function05 = function04;
            if (C13 == InterfaceC3967k.a.a()) {
                C13 = DsInputBaseKt$DsInputBase$10$1.INSTANCE;
                interfaceC3967k.x(C13);
            }
            function06 = (Function0) C13;
            interfaceC3967k.k();
        } else {
            function05 = function04;
            function06 = function02;
        }
        if ((i14 & 33554432) != 0) {
            interfaceC3967k.o(49598420);
            Object C14 = interfaceC3967k.C();
            function07 = function06;
            if (C14 == InterfaceC3967k.a.a()) {
                C14 = DsInputBaseKt$DsInputBase$11$1.INSTANCE;
                interfaceC3967k.x(C14);
            }
            interfaceC3967k.k();
            function08 = (Function0) C14;
        } else {
            function07 = function06;
            function08 = function03;
        }
        if ((i14 & 67108864) != 0) {
            interfaceC3967k.o(49600052);
            Object C15 = interfaceC3967k.C();
            if (C15 == InterfaceC3967k.a.a()) {
                C15 = DsInputBaseKt$DsInputBase$12$1.INSTANCE;
                interfaceC3967k.x(C15);
            }
            interfaceC3967k.k();
            function14 = (Function1) C15;
        } else {
            function14 = function1;
        }
        if ((i14 & 134217728) != 0) {
            interfaceC3967k.o(49601460);
            Object C16 = interfaceC3967k.C();
            if (C16 == InterfaceC3967k.a.a()) {
                C16 = DsInputBaseKt$DsInputBase$13$1.INSTANCE;
                interfaceC3967k.x(C16);
            }
            interfaceC3967k.k();
            function15 = (Function1) C16;
        } else {
            function15 = function12;
        }
        Function1<? super String, Unit> addToClipboard = (i14 & 268435456) != 0 ? ClipboardExtKt.addToClipboard(interfaceC3967k, 0) : function13;
        int i15 = i11 << 3;
        int i16 = (i15 & 896) | ((i11 >> 6) & 14) | (i15 & 112) | (i11 & 7168) | (i11 & 57344) | (i11 & 458752) | (i11 & 3670016) | ((i11 >> 3) & 29360128) | (i15 & 234881024) | ((i12 << 24) & 1879048192);
        int i17 = i12 >> 6;
        int i18 = ((i11 >> 27) & 14) | ((i12 << 3) & 112) | (i12 & 896) | (i12 & 7168) | (i17 & 57344) | (i17 & 458752) | (i17 & 3670016);
        int i19 = UniIconToken.$stable;
        int i21 = i12 << 9;
        int i22 = i18 | (i19 << 21) | (i21 & 29360128) | (i19 << 24) | (i21 & 234881024) | ((i13 << 18) & 1879048192);
        int i23 = i13 << 6;
        DsInputBaseImplKt.m1736DsInputBaseImploiW5flc(eVar3, value, onValueChange, dsInputSize2, dsInputType2, dsInputTheme2, dsInputState2, z16, dsInputStatus2, str5, str4, dsInputLabelPosition2, str6, c7807z2, z15, z18, z19, uniIconToken3, uniIconToken4, function05, function07, n03, m03, a11, qVar2, function08, function14, function15, addToClipboard, interfaceC3967k, i16, i22, ((i12 >> 24) & 112) | ((i13 >> 12) & 14) | (i23 & 896) | (i23 & 7168) | (i23 & 57344) | (i13 & 458752) | (i13 & 3670016) | (i13 & 29360128) | (i13 & 234881024));
        interfaceC3967k.k();
    }
}

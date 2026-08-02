package ru.ozon.uni.ozi.components.inputs;

import B0.M0;
import B0.N0;
import G1.b;
import K1.T;
import Q1.K;
import Q1.X;
import S0.A1;
import S0.C3969l;
import S0.D1;
import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import S0.J0;
import S0.n1;
import a1.C4912a;
import a1.c;
import android.os.Build;
import androidx.compose.ui.e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import fd.InterfaceC6511n;
import j1.r;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l1.C7807Z;
import org.jetbrains.annotations.NotNull;
import q1.AbstractC8972b;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.data.HammersV3BodyDTO;
import ru.ozon.uni.core.R$drawable;
import ru.ozon.uni.core.UniColors;
import ru.ozon.uni.core.compose.tokens.UniComposeIconTokensKt;
import ru.ozon.uni.core.compose.tokens.UniPaddings;
import ru.ozon.uni.core.compose.tokens.UniRadii;
import ru.ozon.uni.core.compose.tokens.UniResourceIcons;
import ru.ozon.uni.foundation.components.input.FoundationInputKt;
import ru.ozon.uni.ozi.components.inputs.core.OziInputRightContentScope;
import ru.ozon.uni.ozi.components.inputs.core.OziInputsCoreTestTags;
import ru.ozon.uni.ozi.components.inputs.presets.InputState;
import ru.ozon.uni.ozi.components.inputs.presets.OziInputDefaults;
import ru.ozon.uni.ozi.components.inputs.presets.OziInputStatus;
import ru.ozon.uni.ozi.components.inputs.presets.OziInputStatusKt;
import ru.ozon.uni.ozi.theme.OziTheme;
import ru.ozon.uni.ozi.utils.OziTestTagsKt;
import ru.ozon.uni.ozi.utils.PainterUtilsKt;
import ru.ozon.uni.ozi.utils.internal.presets.DeferredColor;
import t0.i;
import t0.p;
import t0.q;

@Metadata(d1 = {"\u0000d\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aí\u0001\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\f2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\u0014\b\u0002\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00040\u00032\u0014\b\u0002\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0007¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u0095\u0002\u0010&\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u000b\u001a\u00020\n2\b\u0010!\u001a\u0004\u0018\u00010 2\u0014\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0014\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u000e\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00122\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00122\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00040\u00032\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0001¢\u0006\u0004\b&\u0010'\u001ai\u0010*\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00122\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010(\u001a\u00020\f2\u0006\u0010)\u001a\u00020\u00102\u0014\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b*\u0010+¨\u00060²\u0006\f\u0010,\u001a\u00020\f8\nX\u008a\u0084\u0002²\u0006\u000e\u0010.\u001a\u00020-8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010/\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002²\u0006\f\u0010,\u001a\u00020\f8\nX\u008a\u0084\u0002"}, d2 = {"", AppMeasurementSdk.ConditionalUserProperty.VALUE, "label", "Lkotlin/Function1;", "", "onValueChange", "Landroidx/compose/ui/e;", "modifier", HammersV3BodyDTO.PLACEHOLDER, "caption", "", "captionLineLimit", "", "enabled", "showCopyButton", "showSystemContent", "Lru/ozon/uni/ozi/components/inputs/presets/OziInputStatus;", "status", "Lkotlin/Function0;", "onClearClick", "LQ1/X;", "visualTransformation", "LB0/N0;", "keyboardOptions", "LB0/M0;", "keyboardActions", "Lt0/q;", "interactionSource", "onFocusChanged", "copyTextAction", "OziInput", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/e;Ljava/lang/String;Ljava/lang/String;IZZZLru/ozon/uni/ozi/components/inputs/presets/OziInputStatus;Lkotlin/jvm/functions/Function0;LQ1/X;LB0/N0;LB0/M0;Lt0/q;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;LS0/k;III)V", "Lq1/b;", "startContent", "Lru/ozon/uni/ozi/components/inputs/core/OziInputRightContentScope;", "endContent", "systemEndContent", "onInputClick", "OziInputImpl", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/e;Ljava/lang/String;Ljava/lang/String;ILq1/b;Lfd/n;Lfd/n;ZZZLru/ozon/uni/ozi/components/inputs/presets/OziInputStatus;LQ1/X;LB0/N0;LB0/M0;Lt0/q;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;LS0/k;III)V", "isActive", "currentStatus", "getFinalEndContent", "(Ljava/lang/String;ZZLru/ozon/uni/ozi/components/inputs/presets/OziInputStatus;Lfd/n;Lkotlin/jvm/functions/Function1;LQ1/X;)Lkotlin/jvm/functions/Function2;", "isFocused", "LQ1/K;", "textFieldValueState", "lastTextValue", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OziInputKt {
    public static final void OziInput(@NotNull String value, @NotNull String label, @NotNull Function1<? super String, Unit> onValueChange, e eVar, String str, String str2, int i11, boolean z11, boolean z12, boolean z13, OziInputStatus oziInputStatus, Function0<Unit> function0, X x11, N0 n02, M0 m02, q qVar, Function1<? super Boolean, Unit> function1, Function1<? super String, Unit> function12, InterfaceC3967k interfaceC3967k, int i12, int i13, int i14) {
        M0 m03;
        q qVar2;
        Function1<? super Boolean, Unit> function13;
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
        interfaceC3967k.o(1703516604);
        e eVar2 = (i14 & 8) != 0 ? e.f40358c0 : eVar;
        String str3 = (i14 & 16) != 0 ? null : str;
        String str4 = (i14 & 32) != 0 ? null : str2;
        int i15 = (i14 & 64) != 0 ? 2 : i11;
        boolean z14 = (i14 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? true : z11;
        boolean z15 = (i14 & 256) != 0 ? true : z12;
        boolean z16 = (i14 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? true : z13;
        OziInputStatus oziInputStatus2 = (i14 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? OziInputStatus.Neutral.INSTANCE : oziInputStatus;
        Function0<Unit> function02 = (i14 & 2048) != 0 ? null : function0;
        X a11 = (i14 & 4096) != 0 ? X.a.a() : x11;
        N0 n03 = (i14 & 8192) != 0 ? N0.f1448g : n02;
        e eVar3 = eVar2;
        M0 m04 = (i14 & 16384) != 0 ? M0.f1437b : m02;
        if ((i14 & 32768) != 0) {
            interfaceC3967k.o(-627795193);
            Object C11 = interfaceC3967k.C();
            m03 = m04;
            if (C11 == InterfaceC3967k.a.a()) {
                C11 = p.a();
                interfaceC3967k.x(C11);
            }
            interfaceC3967k.k();
            qVar2 = (q) C11;
        } else {
            m03 = m04;
            qVar2 = qVar;
        }
        if ((i14 & 65536) != 0) {
            interfaceC3967k.o(-627792638);
            Object C12 = interfaceC3967k.C();
            if (C12 == InterfaceC3967k.a.a()) {
                C12 = OziInputKt$OziInput$4$1.INSTANCE;
                interfaceC3967k.x(C12);
            }
            interfaceC3967k.k();
            function13 = (Function1) C12;
        } else {
            function13 = function1;
        }
        int i16 = i12 >> 21;
        int i17 = i13 << 6;
        String str5 = str4;
        String str6 = str3;
        int i18 = i15;
        boolean z17 = z14;
        boolean z18 = z15;
        OziInputStatus oziInputStatus3 = oziInputStatus2;
        N0 n04 = n03;
        boolean z19 = z16;
        X x12 = a11;
        M0 m05 = m03;
        OziInputImpl(value, label, onValueChange, eVar3, str6, str5, i18, null, null, null, z17, z18, z19, oziInputStatus3, x12, n04, m05, qVar2, null, function02, function13, (i14 & 131072) != 0 ? OziInputDefaults.INSTANCE.addToClipboard(null, interfaceC3967k, 48, 1) : function12, interfaceC3967k, (i12 & 14) | 918552576 | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (i12 & 57344) | (i12 & 458752) | (i12 & 3670016), (i16 & 896) | (i16 & 14) | 100663296 | (i16 & 112) | ((i13 << 9) & 7168) | (57344 & i17) | (i17 & 458752) | (i17 & 3670016) | (i17 & 29360128) | ((i13 << 24) & 1879048192), (i13 >> 18) & 126);
        interfaceC3967k.k();
    }

    public static final void OziInputImpl(@NotNull String value, @NotNull String label, @NotNull Function1<? super String, Unit> onValueChange, @NotNull e modifier, String str, String str2, int i11, AbstractC8972b abstractC8972b, InterfaceC6511n<? super OziInputRightContentScope, ? super InterfaceC3967k, ? super Integer, Unit> interfaceC6511n, InterfaceC6511n<? super OziInputRightContentScope, ? super InterfaceC3967k, ? super Integer, Unit> interfaceC6511n2, boolean z11, boolean z12, boolean z13, @NotNull OziInputStatus status, @NotNull X visualTransformation, @NotNull N0 keyboardOptions, @NotNull M0 keyboardActions, @NotNull q interactionSource, Function0<Unit> function0, Function0<Unit> function02, @NotNull Function1<? super Boolean, Unit> onFocusChanged, @NotNull Function1<? super String, Unit> copyTextAction, InterfaceC3967k interfaceC3967k, int i12, int i13, int i14) {
        int i15;
        int i16;
        int i17;
        boolean z14;
        X x11;
        Function1<? super String, Unit> function1;
        InputState inputState;
        OziTheme oziTheme;
        InputState inputState2;
        OziInputStatus oziInputStatus;
        int i18;
        String str3;
        InterfaceC6511n<? super OziInputRightContentScope, ? super InterfaceC3967k, ? super Integer, Unit> interfaceC6511n3;
        C3969l c3969l;
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(visualTransformation, "visualTransformation");
        Intrinsics.checkNotNullParameter(keyboardOptions, "keyboardOptions");
        Intrinsics.checkNotNullParameter(keyboardActions, "keyboardActions");
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        Intrinsics.checkNotNullParameter(onFocusChanged, "onFocusChanged");
        Intrinsics.checkNotNullParameter(copyTextAction, "copyTextAction");
        C3969l u11 = interfaceC3967k.u(-562019991);
        if ((i12 & 6) == 0) {
            i15 = i12 | (u11.n(value) ? 4 : 2);
        } else {
            i15 = i12;
        }
        if ((i12 & 48) == 0) {
            i15 |= u11.n(label) ? 32 : 16;
        }
        int i19 = i12 & 384;
        int i21 = UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i19 == 0) {
            i15 |= u11.F(onValueChange) ? 256 : 128;
        }
        int i22 = i12 & 3072;
        int i23 = UserVerificationMethods.USER_VERIFY_ALL;
        if (i22 == 0) {
            i15 |= u11.n(modifier) ? 2048 : 1024;
        }
        if ((i12 & 24576) == 0) {
            i15 |= u11.n(str) ? 16384 : 8192;
        }
        if ((i12 & 196608) == 0) {
            i15 |= u11.n(str2) ? 131072 : 65536;
        }
        if ((i12 & 1572864) == 0) {
            i15 |= u11.r(i11) ? 1048576 : 524288;
        }
        if ((i12 & 12582912) == 0) {
            i15 |= u11.n(abstractC8972b) ? 8388608 : 4194304;
        }
        if ((i12 & 100663296) == 0) {
            i15 |= u11.F(interfaceC6511n) ? 67108864 : 33554432;
        }
        if ((i12 & 805306368) == 0) {
            i15 |= u11.F(interfaceC6511n2) ? 536870912 : 268435456;
        }
        int i24 = i15;
        if ((i13 & 6) == 0) {
            i16 = i13 | (u11.p(z11) ? 4 : 2);
        } else {
            i16 = i13;
        }
        if ((i13 & 48) == 0) {
            i16 |= u11.p(z12) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            if (u11.p(z13)) {
                i21 = 256;
            }
            i16 |= i21;
        }
        if ((i13 & 3072) == 0) {
            if (u11.n(status)) {
                i23 = 2048;
            }
            i16 |= i23;
        }
        if ((i13 & 24576) == 0) {
            i16 |= u11.n(visualTransformation) ? 16384 : 8192;
        }
        if ((i13 & 196608) == 0) {
            i16 |= u11.n(keyboardOptions) ? 131072 : 65536;
        }
        if ((i13 & 1572864) == 0) {
            i16 |= u11.n(keyboardActions) ? 1048576 : 524288;
        }
        if ((i13 & 12582912) == 0) {
            i16 |= u11.n(interactionSource) ? 8388608 : 4194304;
        }
        if ((i13 & 100663296) == 0) {
            i16 |= u11.F(function0) ? 67108864 : 33554432;
        }
        if ((i13 & 805306368) == 0) {
            i16 |= u11.F(function02) ? 536870912 : 268435456;
        }
        int i25 = i16;
        if ((i14 & 6) == 0) {
            i17 = i14 | (u11.F(onFocusChanged) ? 4 : 2);
        } else {
            i17 = i14;
        }
        if ((i14 & 48) == 0) {
            i17 |= u11.F(copyTextAction) ? 32 : 16;
        }
        int i26 = i17;
        if ((i24 & 306783379) == 306783378 && (i25 & 306783379) == 306783378 && (i26 & 19) == 18 && u11.b()) {
            u11.j();
            c3969l = u11;
        } else {
            u11.o(-232474755);
            Object C11 = u11.C();
            if (C11 == InterfaceC3967k.a.a()) {
                C11 = new r();
                u11.x(C11);
            }
            r rVar = (r) C11;
            u11.k();
            InterfaceC3978p0 a11 = i.a(interactionSource, u11, (i25 >> 21) & 14);
            InputState inputState3 = z11 ? (!OziInputImpl$lambda$7(a11) || Intrinsics.d(status, OziInputStatus.ReadOnly.INSTANCE)) ? InputState.Default : InputState.Active : InputState.Disabled;
            OziInputStatus oziInputStatus2 = (Intrinsics.d(status, OziInputStatus.Success.INSTANCE) && inputState3 == InputState.Active) ? OziInputStatus.Neutral.INSTANCE : status;
            long a12 = b.a(u11, UniColors.BLUE_400.getResId());
            OziTheme oziTheme2 = OziTheme.INSTANCE;
            int i27 = UniResourceIcons.$stable | UniPaddings.$stable | UniRadii.$stable;
            long layerFloor1 = oziTheme2.getColors(u11, i27).getLayerFloor1();
            OziInputStatus oziInputStatus3 = oziInputStatus2;
            long textPrimary = oziTheme2.getColors(u11, i27).getTextPrimary();
            if (!z11) {
                textPrimary = C7807Z.o(C7807Z.q(textPrimary) * 0.4f, textPrimary);
            }
            long j11 = textPrimary;
            long textSecondaryTransparent = oziTheme2.getColors(u11, i27).getTextSecondaryTransparent();
            if (!z11) {
                textSecondaryTransparent = C7807Z.o(C7807Z.q(textSecondaryTransparent) * 0.4f, textSecondaryTransparent);
            }
            long j12 = textSecondaryTransparent;
            long textTertiaryTransparent = oziTheme2.getColors(u11, i27).getTextTertiaryTransparent();
            long value2 = DeferredColor.getValue(status.getCaptionColor(), u11, 0);
            if (!z11) {
                value2 = C7807Z.o(C7807Z.q(value2) * 0.4f, value2);
            }
            long j13 = value2;
            T compact500 = oziTheme2.getTypography().getCompact500();
            T body300 = (OziInputImpl$lambda$7(a11) || value.length() > 0) ? oziTheme2.getTypography().getBody300() : compact500;
            T body3002 = oziTheme2.getTypography().getBody300();
            InputState inputState4 = InputState.Active;
            if (inputState3 == inputState4) {
                z14 = true;
                interfaceC6511n3 = interfaceC6511n;
                x11 = visualTransformation;
                function1 = copyTextAction;
                inputState = inputState3;
                oziTheme = oziTheme2;
                inputState2 = inputState4;
                oziInputStatus = oziInputStatus3;
                i18 = 4;
                str3 = value;
            } else {
                z14 = false;
                x11 = visualTransformation;
                function1 = copyTextAction;
                inputState = inputState3;
                oziTheme = oziTheme2;
                inputState2 = inputState4;
                oziInputStatus = oziInputStatus3;
                i18 = 4;
                str3 = value;
                interfaceC6511n3 = interfaceC6511n;
            }
            Function2<InterfaceC3967k, Integer, Unit> finalEndContent = getFinalEndContent(str3, z12, z14, oziInputStatus, interfaceC6511n3, function1, x11);
            String str4 = str3;
            OziInputStatus oziInputStatus4 = oziInputStatus;
            u11.o(-232415303);
            Object C12 = u11.C();
            if (C12 == InterfaceC3967k.a.a()) {
                C12 = n1.f(new K(6, 0L, str4), D1.f25195a);
                u11.x(C12);
            }
            InterfaceC3978p0 interfaceC3978p0 = (InterfaceC3978p0) C12;
            u11.k();
            K b11 = K.b(OziInputImpl$lambda$12(interfaceC3978p0), str4, 0L, 6);
            u11.o(-232403839);
            boolean n11 = u11.n(b11);
            Object C13 = u11.C();
            if (n11 || C13 == InterfaceC3967k.a.a()) {
                C13 = new OziInputKt$OziInputImpl$1$1(b11, interfaceC3978p0);
                u11.x(C13);
            }
            u11.k();
            u11.g((Function0) C13);
            u11.o(-232386551);
            boolean z15 = (i24 & 14) == i18;
            Object C14 = u11.C();
            if (z15 || C14 == InterfaceC3967k.a.a()) {
                C14 = n1.f(str4, D1.f25195a);
                u11.x(C14);
            }
            InterfaceC3978p0 interfaceC3978p02 = (InterfaceC3978p0) C14;
            u11.k();
            u11.o(-232383015);
            boolean n12 = u11.n(interfaceC3978p02) | ((i24 & 896) == 256);
            Object C15 = u11.C();
            if (n12 || C15 == InterfaceC3967k.a.a()) {
                C15 = new OziInputKt$OziInputImpl$internalOnValueChange$1$1(onValueChange, interfaceC3978p0, interfaceC3978p02);
                u11.x(C15);
            }
            Function1 function12 = (Function1) C15;
            u11.k();
            SafeAreaInSheetOracleState rememberSafeAreaInSheetOracleState = SafeAreaInSheetOracleKt.rememberSafeAreaInSheetOracleState(u11, 0);
            SafeAreaInSheetOracleKt.SafeAreaInSheetOracle(rememberSafeAreaInSheetOracleState, OziInputImpl$lambda$7(a11), u11, 0);
            e safeAreaInSheetOracle = SafeAreaInSheetOracleKt.safeAreaInSheetOracle(OziTestTagsKt.oziTestTag(modifier, OziInputTestTags.Container, null, u11, ((i24 >> 9) & 14) | 48, 2), rememberSafeAreaInSheetOracleState);
            AbstractC8972b systemIcon = OziInputStatusKt.systemIcon(oziInputStatus4, u11, 0);
            u11.o(-232349552);
            C4912a c11 = interfaceC6511n2 == null ? null : c.c(-1731239352, new OziInputKt$OziInputImpl$2$1(interfaceC6511n2), u11);
            u11.k();
            boolean d11 = Intrinsics.d(oziInputStatus4, OziInputStatus.ReadOnly.INSTANCE);
            InputState inputState5 = inputState;
            boolean z16 = inputState5 != InputState.Disabled;
            boolean z17 = inputState5 == inputState2;
            OziTheme oziTheme3 = oziTheme;
            long graphicTertiaryTransparent = oziTheme3.getColors(u11, i27).getGraphicTertiaryTransparent();
            long value3 = DeferredColor.getValue(oziInputStatus4.getBorderColor(), u11, 0);
            long value4 = DeferredColor.getValue(oziInputStatus4.getActiveBorderColor(), u11, 0);
            long value5 = DeferredColor.getValue(oziInputStatus4.getSystemIconColor(), u11, 0);
            float borderWidth = inputState5.getBorderWidth();
            e.a aVar = e.f40358c0;
            oziTheme3.getIcons();
            u11.B(138200983);
            AbstractC8972b uniPainterResource = UniComposeIconTokensKt.uniPainterResource(R$drawable.ic_m_lock_closed_filled, "ic_m_lock_closed_filled", u11, 48);
            u11.K();
            int i28 = i25 << 3;
            FoundationInputKt.m3007FoundationInputYx1CVQ(safeAreaInSheetOracle, function12, b11, label, str, str2, i11, abstractC8972b, systemIcon, finalEndContent, c11, d11, z16, z17, z13, keyboardOptions, keyboardActions, visualTransformation, interactionSource, function0, onFocusChanged, layerFloor1, a12, j11, j12, textTertiaryTransparent, graphicTertiaryTransparent, j13, value3, value4, value5, body300, compact500, body3002, borderWidth, rVar, OziTestTagsKt.oziTestTag(aVar, OziInputTestTags.SystemContent, null, u11, 54, 2), c.c(1781161689, new OziInputKt$OziInputImpl$3(function12, function02), u11), OziTestTagsKt.oziTestTag(aVar, OziInputTestTags.LeftContent, PainterUtilsKt.getIconNameTestTagParameter(abstractC8972b, OziInputTestTags.INSTANCE.getLeftIconName()), u11, 54, 0), oziTheme3.getColors(u11, i27).getGraphicTertiaryTransparent(), androidx.compose.foundation.layout.T.j(OziTestTagsKt.oziTestTag(aVar, OziInputTestTags.Caption, null, u11, 54, 2), 12, 0.0f, 0.0f, 0.0f, 14), OziTestTagsKt.oziTestTag(aVar, OziInputTestTags.TextField, null, u11, 54, 2), OziTestTagsKt.oziTestTag(aVar, OziInputsCoreTestTags.Label, null, u11, 54, 2), OziTestTagsKt.oziTestTag(aVar, OziInputsCoreTestTags.Placeholder, null, u11, 54, 2), OziTestTagsKt.oziTestTag(aVar, OziInputsCoreTestTags.LockIcon, null, u11, 54, 2), uniPainterResource, 9, u11, ((i24 << 6) & 7168) | (i24 & 57344) | (i24 & 458752) | (i24 & 3670016) | (i24 & 29360128), ((i25 << 6) & 57344) | (i25 & 458752) | (i25 & 3670016) | ((i25 << 9) & 29360128) | (i28 & 234881024) | (i28 & 1879048192), i26 & 14, 12779520, 1572864);
            c3969l = u11;
            int i29 = Build.VERSION.SDK_INT;
            if (i29 == 26 || i29 == 27) {
                InputUtilsKt.removeFocusAndroid8(c3969l, 0);
            }
        }
        J0 m02 = c3969l.m0();
        if (m02 != null) {
            m02.G(new OziInputKt$OziInputImpl$4(value, label, onValueChange, modifier, str, str2, i11, abstractC8972b, interfaceC6511n, interfaceC6511n2, z11, z12, z13, status, visualTransformation, keyboardOptions, keyboardActions, interactionSource, function0, function02, onFocusChanged, copyTextAction, i12, i13, i14));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final K OziInputImpl$lambda$12(InterfaceC3978p0<K> interfaceC3978p0) {
        return interfaceC3978p0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String OziInputImpl$lambda$16(InterfaceC3978p0<String> interfaceC3978p0) {
        return interfaceC3978p0.getValue();
    }

    private static final boolean OziInputImpl$lambda$7(A1<Boolean> a12) {
        return a12.getValue().booleanValue();
    }

    private static final Function2<InterfaceC3967k, Integer, Unit> getFinalEndContent(String str, boolean z11, boolean z12, OziInputStatus oziInputStatus, InterfaceC6511n<? super OziInputRightContentScope, ? super InterfaceC3967k, ? super Integer, Unit> interfaceC6511n, Function1<? super String, Unit> function1, X x11) {
        if (z11 && interfaceC6511n == null && str.length() > 0 && !z12 && (Intrinsics.d(oziInputStatus, OziInputStatus.ReadOnly.INSTANCE) || Intrinsics.d(oziInputStatus, OziInputStatus.Neutral.INSTANCE))) {
            return new C4912a(true, -3012292, new OziInputKt$getFinalEndContent$1(x11, str, function1));
        }
        if (interfaceC6511n != null) {
            return new C4912a(true, -1552112013, new OziInputKt$getFinalEndContent$2(interfaceC6511n));
        }
        return null;
    }
}

package ru.ozon.debugMenu.internal.core.ui.widgets.input;

import D1.InterfaceC2801g;
import E0.C2942q;
import I0.C3173b;
import K1.T;
import Nk.a;
import Q1.K;
import S0.A0;
import S0.A1;
import S0.D1;
import S0.F1;
import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import S0.n1;
import a1.C4912a;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.X;
import androidx.compose.foundation.layout.Y;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import e1.InterfaceC6250b;
import j1.r;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l1.C7807Z;
import m3.C8060b;
import org.jetbrains.annotations.NotNull;
import q1.AbstractC8972b;
import ru.ozon.app.android.R;
import ru.ozon.debugMenu.internal.core.ui.utils.b;
import ru.ozon.debugMenu.internal.core.ui.widgets.button.DebugMenuIconButtonKt;
import ru.ozon.debugMenu.internal.core.ui.widgets.button.presets.size.DebugMenuIconButtonSize;
import ru.ozon.debugMenu.internal.core.ui.widgets.button.presets.style.DebugMenuIconButtonStyle;
import ru.ozon.debugMenu.internal.core.ui.widgets.input.presets.DebugMenuInputDefaults;
import ru.ozon.debugMenu.internal.core.ui.widgets.input.presets.DebugMenuInputStatus;
import ru.ozon.debugMenu.internal.core.ui.widgets.input.presets.InputState;
import t0.i;
import t0.p;
import t0.q;
import y20.C10833a;

@Metadata(d1 = {"\u0000>\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a¿\u0001\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\f2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000e2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\u0014\b\u0002\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u00032\u0014\b\u0002\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0001¢\u0006\u0004\b\u0015\u0010\u0016\u001aK\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000e2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\f2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0002¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001f²\u0006\f\u0010\u001b\u001a\u00020\b8\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u001d\u001a\u00020\u001c8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u001e\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002"}, d2 = {"", AppMeasurementSdk.ConditionalUserProperty.VALUE, "label", "Lkotlin/Function1;", "", "onValueChange", "Landroidx/compose/ui/e;", "modifier", "", "enabled", "showCopyButton", "showSystemContent", "Lru/ozon/debugMenu/internal/core/ui/widgets/input/presets/DebugMenuInputStatus;", "status", "Lkotlin/Function0;", "onClearClick", "onActionClick", "Lt0/q;", "interactionSource", "onFocusChanged", "copyTextAction", "DebugMenuInput", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/e;ZZZLru/ozon/debugMenu/internal/core/ui/widgets/input/presets/DebugMenuInputStatus;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lt0/q;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;LS0/k;III)V", "isActive", "currentStatus", "getFinalRightContent", "(Ljava/lang/String;ZZLru/ozon/debugMenu/internal/core/ui/widgets/input/presets/DebugMenuInputStatus;Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function2;", "isFocused", "LQ1/K;", "textFieldValueState", "lastTextValue", "ozon-debug-menu_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DebugMenuInputKt {
    public static final void DebugMenuInput(@NotNull String value, @NotNull String label, @NotNull Function1<? super String, Unit> onValueChange, e eVar, boolean z11, boolean z12, boolean z13, DebugMenuInputStatus debugMenuInputStatus, Function0<Unit> function0, Function0<Unit> function02, q qVar, Function1<? super Boolean, Unit> function1, Function1<? super String, Unit> function12, InterfaceC3967k interfaceC3967k, int i11, int i12, int i13) {
        q qVar2;
        Function1<? super Boolean, Unit> function13;
        boolean z14;
        e eVar2;
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
        interfaceC3967k.o(966011223);
        e eVar3 = (i13 & 8) != 0 ? e.f40358c0 : eVar;
        boolean z15 = (i13 & 16) != 0 ? true : z11;
        boolean z16 = (i13 & 32) != 0 ? true : z12;
        boolean z17 = (i13 & 64) != 0 ? true : z13;
        DebugMenuInputStatus debugMenuInputStatus2 = (i13 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? DebugMenuInputStatus.Neutral.INSTANCE : debugMenuInputStatus;
        Function0<Unit> function03 = (i13 & 256) != 0 ? null : function0;
        Function0<Unit> function04 = (i13 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? null : function02;
        if ((i13 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
            interfaceC3967k.o(-1599502871);
            Object C11 = interfaceC3967k.C();
            if (C11 == InterfaceC3967k.a.a()) {
                C11 = p.a();
                interfaceC3967k.x(C11);
            }
            qVar2 = (q) C11;
            interfaceC3967k.k();
        } else {
            qVar2 = qVar;
        }
        if ((i13 & 2048) != 0) {
            interfaceC3967k.o(-1599500316);
            Object C12 = interfaceC3967k.C();
            if (C12 == InterfaceC3967k.a.a()) {
                C12 = DebugMenuInputKt$DebugMenuInput$2$1.INSTANCE;
                interfaceC3967k.x(C12);
            }
            function13 = (Function1) C12;
            interfaceC3967k.k();
        } else {
            function13 = function1;
        }
        Function1<? super String, Unit> addToClipboard = (i13 & 4096) != 0 ? DebugMenuInputDefaults.INSTANCE.addToClipboard(null, interfaceC3967k, 48, 1) : function12;
        interfaceC3967k.o(-1599496673);
        Object C13 = interfaceC3967k.C();
        if (C13 == InterfaceC3967k.a.a()) {
            C13 = new r();
            interfaceC3967k.x(C13);
        }
        r rVar = (r) C13;
        interfaceC3967k.k();
        InterfaceC3978p0 a11 = i.a(qVar2, interfaceC3967k, i12 & 14);
        InputState inputState = z15 ? DebugMenuInput$lambda$3(a11) ? InputState.Active : InputState.Default : InputState.Disabled;
        long h11 = C10833a.a(interfaceC3967k).h();
        boolean z18 = z17;
        long l11 = C10833a.a(interfaceC3967k).l();
        if (!z15) {
            l11 = C7807Z.o(C7807Z.q(l11) * 0.4f, l11);
        }
        long j11 = l11;
        long n11 = C10833a.a(interfaceC3967k).n();
        if (!z15) {
            n11 = C7807Z.o(C7807Z.q(n11) * 0.4f, n11);
        }
        long j12 = n11;
        T d11 = C10833a.b().d();
        T a12 = (DebugMenuInput$lambda$3(a11) || value.length() > 0) ? C10833a.b().a() : d11;
        InputState inputState2 = InputState.Active;
        Function2<InterfaceC3967k, Integer, Unit> finalRightContent = getFinalRightContent(value, z16, inputState == inputState2, debugMenuInputStatus2, addToClipboard);
        interfaceC3967k.o(-1599455781);
        Object C14 = interfaceC3967k.C();
        DebugMenuInputStatus debugMenuInputStatus3 = debugMenuInputStatus2;
        q qVar3 = qVar2;
        if (C14 == InterfaceC3967k.a.a()) {
            C14 = n1.f(new K(6, 0L, value), D1.f25195a);
            interfaceC3967k.x(C14);
        }
        InterfaceC3978p0 interfaceC3978p0 = (InterfaceC3978p0) C14;
        interfaceC3967k.k();
        K b11 = K.b(DebugMenuInput$lambda$7(interfaceC3978p0), value, 0L, 6);
        interfaceC3967k.o(-1599444317);
        boolean n12 = interfaceC3967k.n(b11);
        Object C15 = interfaceC3967k.C();
        if (n12 || C15 == InterfaceC3967k.a.a()) {
            C15 = new DebugMenuInputKt$DebugMenuInput$3$1(b11, interfaceC3978p0);
            interfaceC3967k.x(C15);
        }
        interfaceC3967k.k();
        interfaceC3967k.g((Function0) C15);
        interfaceC3967k.o(-1599427029);
        boolean z19 = ((6 ^ (i11 & 14)) > 4 && interfaceC3967k.n(value)) || (i11 & 6) == 4;
        Object C16 = interfaceC3967k.C();
        if (z19 || C16 == InterfaceC3967k.a.a()) {
            C16 = n1.f(value, D1.f25195a);
            interfaceC3967k.x(C16);
        }
        InterfaceC3978p0 interfaceC3978p02 = (InterfaceC3978p0) C16;
        interfaceC3967k.k();
        interfaceC3967k.o(-1599423493);
        boolean n13 = interfaceC3967k.n(interfaceC3978p02) | ((((i11 & 896) ^ 384) > 256 && interfaceC3967k.n(onValueChange)) || (i11 & 384) == 256);
        Object C17 = interfaceC3967k.C();
        if (n13 || C17 == InterfaceC3967k.a.a()) {
            C17 = new DebugMenuInputKt$DebugMenuInput$internalOnValueChange$1$1(onValueChange, interfaceC3978p0, interfaceC3978p02);
            interfaceC3967k.x(C17);
        }
        Function1 function14 = (Function1) C17;
        interfaceC3967k.k();
        e a13 = b.a(eVar3, DebugMenuInputTestTags.Container);
        Y b12 = X.b(C5179b.n(8), InterfaceC6250b.a.i(), interfaceC3967k, 54);
        int I11 = interfaceC3967k.I();
        A0 d12 = interfaceC3967k.d();
        e f7 = c.f(interfaceC3967k, a13);
        InterfaceC2801g.f5440U.getClass();
        Function0 a14 = InterfaceC2801g.a.a();
        if (interfaceC3967k.v() == null) {
            C8060b.c();
            throw null;
        }
        interfaceC3967k.i();
        if (interfaceC3967k.t()) {
            interfaceC3967k.H(a14);
        } else {
            interfaceC3967k.e();
        }
        Function2 f11 = C3173b.f(interfaceC3967k, b12, interfaceC3967k, d12);
        if (interfaceC3967k.t() || !Intrinsics.d(interfaceC3967k.C(), Integer.valueOf(I11))) {
            a.d(f11, I11, interfaceC3967k, I11);
        }
        F1.b(interfaceC3967k, f7, InterfaceC2801g.a.f());
        e.a aVar = e.f40358c0;
        if (function04 != null) {
            if (1.0f <= 0.0d) {
                throw new IllegalArgumentException(C2942q.b(1.0f, "invalid weight ", "; must be greater than zero").toString());
            }
            z14 = true;
            eVar2 = new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
        } else {
            z14 = true;
            eVar2 = aVar;
        }
        boolean z21 = inputState != InputState.Disabled ? z14 : false;
        if (inputState != inputState2) {
            z14 = false;
        }
        BasicInputKt.m1620BasicInputqDwmbCE(eVar2, function14, b11, label, null, finalRightContent, z21, z14, z18, null, null, null, qVar3, function03, function13, h11, C10833a.a(interfaceC3967k).a(), j11, j12, A20.b.b(debugMenuInputStatus3.getBorderColor(), interfaceC3967k), A20.b.b(debugMenuInputStatus3.getActiveBorderColor(), interfaceC3967k), a12, d11, inputState.getBorderWidth(), rVar, interfaceC3967k, (i11 << 6) & 234888192, ((i12 << 6) & 896) | ((i11 >> 15) & 7168) | ((i12 << 9) & 57344), 24960, 3600);
        interfaceC3967k.o(-311212269);
        if (function04 != null) {
            e a15 = b.a(aVar, DebugMenuInputTestTags.ActionButton);
            interfaceC3967k.o(785864230);
            AbstractC8972b a16 = G1.e.a(R.drawable.ozon_debug_menu_ic_m_confirmed, interfaceC3967k, 0);
            interfaceC3967k.k();
            DebugMenuIconButtonKt.DebugMenuIconButton(a16, function04, a15, z15, null, DebugMenuIconButtonStyle.ActionSecondary.INSTANCE, DebugMenuIconButtonSize.Size600, null, interfaceC3967k, ((i11 >> 24) & 112) | 1769472 | ((i11 >> 3) & 7168), 144);
        }
        interfaceC3967k.k();
        interfaceC3967k.f();
        interfaceC3967k.k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String DebugMenuInput$lambda$11(InterfaceC3978p0<String> interfaceC3978p0) {
        return interfaceC3978p0.getValue();
    }

    private static final boolean DebugMenuInput$lambda$3(A1<Boolean> a12) {
        return a12.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final K DebugMenuInput$lambda$7(InterfaceC3978p0<K> interfaceC3978p0) {
        return interfaceC3978p0.getValue();
    }

    private static final Function2<InterfaceC3967k, Integer, Unit> getFinalRightContent(String str, boolean z11, boolean z12, DebugMenuInputStatus debugMenuInputStatus, Function1<? super String, Unit> function1) {
        if (!z11 || str.length() <= 0 || z12 || !Intrinsics.d(debugMenuInputStatus, DebugMenuInputStatus.Neutral.INSTANCE)) {
            return null;
        }
        return new C4912a(true, 1145421994, new DebugMenuInputKt$getFinalRightContent$1(function1, str));
    }
}

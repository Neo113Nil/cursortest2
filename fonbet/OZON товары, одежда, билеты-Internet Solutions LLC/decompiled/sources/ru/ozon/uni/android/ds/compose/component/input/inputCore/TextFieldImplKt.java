package ru.ozon.uni.android.ds.compose.component.input.inputCore;

import B1.E;
import B1.InterfaceC2552v;
import B1.m0;
import K1.C3422b;
import Q1.W;
import Q1.X;
import S0.C3969l;
import S0.InterfaceC3967k;
import S0.J0;
import Z1.c;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.data.HammersV3BodyDTO;
import ru.ozon.uni.android.ds.compose.component.input.DsInputLabelPosition;
import t0.i;
import t0.o;
import u0.InterfaceC9914x;

@Metadata(d1 = {"\u0000J\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u001ag\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH\u0001¢\u0006\u0004\b\u000f\u0010\u0010\"\u001a\u0010\u0012\u001a\u00020\u00118\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u001a\u0010\u001a\u001a\u00020\u0017*\u0004\u0018\u00010\u00168@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019\"\u001a\u0010\u001c\u001a\u00020\u0017*\u0004\u0018\u00010\u00168@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0019\"\u001a\u0010!\u001a\u0004\u0018\u00010\u001e*\u00020\u001d8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"", AppMeasurementSdk.ConditionalUserProperty.VALUE, "LQ1/X;", "visualTransformation", "Lt0/o;", "interactionSource", "Lru/ozon/uni/android/ds/compose/component/input/DsInputLabelPosition;", "labelPosition", "Lu0/x;", "contentPadding", "Lkotlin/Function0;", "", "innerTextField", "label", HammersV3BodyDTO.PLACEHOLDER, "CommonDecorationBox", "(Ljava/lang/String;LQ1/X;Lt0/o;Lru/ozon/uni/android/ds/compose/component/input/DsInputLabelPosition;Lu0/x;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;LS0/k;II)V", "LZ1/b;", "ZeroConstraints", "J", "getZeroConstraints", "()J", "LB1/m0;", "", "getWidthOrZero", "(LB1/m0;)I", "widthOrZero", "getHeightOrZero", "heightOrZero", "LB1/v;", "", "getLayoutId", "(LB1/v;)Ljava/lang/Object;", "layoutId", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TextFieldImplKt {
    private static final long ZeroConstraints = c.a(0, 0, 0, 0);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CommonDecorationBox(@NotNull String value, @NotNull X visualTransformation, @NotNull o interactionSource, @NotNull DsInputLabelPosition labelPosition, @NotNull InterfaceC9914x contentPadding, @NotNull Function2<? super InterfaceC3967k, ? super Integer, Unit> innerTextField, Function2<? super InterfaceC3967k, ? super Integer, Unit> function2, Function2<? super InterfaceC3967k, ? super Integer, Unit> function22, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        Function2<? super InterfaceC3967k, ? super Integer, Unit> function23;
        int i14;
        Function2<? super InterfaceC3967k, ? super Integer, Unit> function24;
        boolean z11;
        Object C11;
        J0 m02;
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(visualTransformation, "visualTransformation");
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        Intrinsics.checkNotNullParameter(labelPosition, "labelPosition");
        Intrinsics.checkNotNullParameter(contentPadding, "contentPadding");
        Intrinsics.checkNotNullParameter(innerTextField, "innerTextField");
        C3969l u11 = interfaceC3967k.u(-518094095);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.n(value) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= u11.n(visualTransformation) ? 32 : 16;
        }
        if ((i12 & 4) != 0) {
            i13 |= 384;
        } else if ((i11 & 384) == 0) {
            i13 |= u11.n(interactionSource) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i12 & 8) != 0) {
            i13 |= 3072;
        } else if ((i11 & 3072) == 0) {
            i13 |= u11.n(labelPosition) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i12 & 16) != 0) {
            i13 |= 24576;
        } else if ((i11 & 24576) == 0) {
            i13 |= u11.n(contentPadding) ? 16384 : 8192;
        }
        if ((i12 & 32) != 0) {
            i13 |= 196608;
        } else if ((i11 & 196608) == 0) {
            i13 |= u11.F(innerTextField) ? 131072 : 65536;
        }
        if ((i12 & 64) != 0) {
            i13 |= 1572864;
        } else if ((i11 & 1572864) == 0) {
            function23 = function2;
            i13 |= u11.F(function23) ? 1048576 : 524288;
            i14 = i12 & UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i14 == 0) {
                i13 |= 12582912;
            } else if ((12582912 & i11) == 0) {
                function24 = function22;
                i13 |= u11.F(function24) ? 8388608 : 4194304;
                if ((4793491 & i13) == 4793490 || !u11.b()) {
                    if (i14 != 0) {
                        function24 = null;
                    }
                    u11.o(-905609158);
                    z11 = ((i13 & 14) == 4) | ((i13 & 112) == 32);
                    C11 = u11.C();
                    if (!z11 || C11 == InterfaceC3967k.a.a()) {
                        C11 = visualTransformation.filter(new C3422b(6, value, null));
                        u11.x(C11);
                    }
                    u11.k();
                    String h11 = ((W) C11).b().h();
                    TextFieldTransitionScope.INSTANCE.Transition(((Boolean) i.a(interactionSource, u11, (i13 >> 6) & 14).getValue()).booleanValue() ? InputPhase.Focused : h11.length() == 0 ? InputPhase.UnfocusedEmpty : InputPhase.UnfocusedNotEmpty, a1.c.c(-925499948, new TextFieldImplKt$CommonDecorationBox$1(innerTextField, function23, (h11.length() == 0 || labelPosition == DsInputLabelPosition.INSIDE_TOP) ? null : function24, contentPadding, labelPosition), u11), u11, 432);
                } else {
                    u11.j();
                }
                Function2<? super InterfaceC3967k, ? super Integer, Unit> function25 = function24;
                m02 = u11.m0();
                if (m02 != null) {
                    m02.G(new TextFieldImplKt$CommonDecorationBox$2(value, visualTransformation, interactionSource, labelPosition, contentPadding, innerTextField, function2, function25, i11, i12));
                    return;
                }
                return;
            }
            function24 = function22;
            if ((4793491 & i13) == 4793490) {
            }
            if (i14 != 0) {
            }
            u11.o(-905609158);
            z11 = ((i13 & 14) == 4) | ((i13 & 112) == 32);
            C11 = u11.C();
            if (!z11) {
            }
            C11 = visualTransformation.filter(new C3422b(6, value, null));
            u11.x(C11);
            u11.k();
            String h112 = ((W) C11).b().h();
            TextFieldTransitionScope.INSTANCE.Transition(((Boolean) i.a(interactionSource, u11, (i13 >> 6) & 14).getValue()).booleanValue() ? InputPhase.Focused : h112.length() == 0 ? InputPhase.UnfocusedEmpty : InputPhase.UnfocusedNotEmpty, a1.c.c(-925499948, new TextFieldImplKt$CommonDecorationBox$1(innerTextField, function23, (h112.length() == 0 || labelPosition == DsInputLabelPosition.INSIDE_TOP) ? null : function24, contentPadding, labelPosition), u11), u11, 432);
            Function2<? super InterfaceC3967k, ? super Integer, Unit> function252 = function24;
            m02 = u11.m0();
            if (m02 != null) {
            }
        }
        function23 = function2;
        i14 = i12 & UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i14 == 0) {
        }
        function24 = function22;
        if ((4793491 & i13) == 4793490) {
        }
        if (i14 != 0) {
        }
        u11.o(-905609158);
        z11 = ((i13 & 14) == 4) | ((i13 & 112) == 32);
        C11 = u11.C();
        if (!z11) {
        }
        C11 = visualTransformation.filter(new C3422b(6, value, null));
        u11.x(C11);
        u11.k();
        String h1122 = ((W) C11).b().h();
        TextFieldTransitionScope.INSTANCE.Transition(((Boolean) i.a(interactionSource, u11, (i13 >> 6) & 14).getValue()).booleanValue() ? InputPhase.Focused : h1122.length() == 0 ? InputPhase.UnfocusedEmpty : InputPhase.UnfocusedNotEmpty, a1.c.c(-925499948, new TextFieldImplKt$CommonDecorationBox$1(innerTextField, function23, (h1122.length() == 0 || labelPosition == DsInputLabelPosition.INSIDE_TOP) ? null : function24, contentPadding, labelPosition), u11), u11, 432);
        Function2<? super InterfaceC3967k, ? super Integer, Unit> function2522 = function24;
        m02 = u11.m0();
        if (m02 != null) {
        }
    }

    public static final int getHeightOrZero(m0 m0Var) {
        if (m0Var != null) {
            return m0Var.l0();
        }
        return 0;
    }

    public static final Object getLayoutId(@NotNull InterfaceC2552v interfaceC2552v) {
        Intrinsics.checkNotNullParameter(interfaceC2552v, "<this>");
        Object m11 = interfaceC2552v.m();
        E e11 = m11 instanceof E ? (E) m11 : null;
        if (e11 != null) {
            return e11.e1();
        }
        return null;
    }

    public static final int getWidthOrZero(m0 m0Var) {
        if (m0Var != null) {
            return m0Var.u0();
        }
        return 0;
    }

    public static final long getZeroConstraints() {
        return ZeroConstraints;
    }
}

package ru.ozon.debugMenu.internal.core.ui.widgets.input.core.decorationBox;

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
import t0.i;
import t0.o;
import u0.InterfaceC9914x;

@Metadata(d1 = {"\u0000V\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u001ai\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\b\b\u0002\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0019\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0019\u0010\u0016\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0000¢\u0006\u0004\b\u0016\u0010\u0015\"\u001a\u0010\u0018\u001a\u00020\u00178\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u001a\u0010\u001d\u001a\u00020\u001c8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u001a\u0010%\u001a\u0004\u0018\u00010\"*\u00020!8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006&"}, d2 = {"", AppMeasurementSdk.ConditionalUserProperty.VALUE, "Lkotlin/Function0;", "", "innerTextField", "LQ1/X;", "visualTransformation", "label", HammersV3BodyDTO.PLACEHOLDER, "", "singleLine", "Lt0/o;", "interactionSource", "Lu0/x;", "contentPadding", "CommonDecorationBox", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;LQ1/X;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLt0/o;Lu0/x;LS0/k;II)V", "LB1/m0;", "placeable", "", "widthOrZero", "(LB1/m0;)I", "heightOrZero", "LZ1/b;", "ZeroConstraints", "J", "getZeroConstraints", "()J", "LZ1/h;", "TextFieldPadding", "F", "getTextFieldPadding", "()F", "LB1/v;", "", "getLayoutId", "(LB1/v;)Ljava/lang/Object;", "layoutId", "ozon-debug-menu_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TextFieldImplKt {
    private static final long ZeroConstraints = c.a(0, 0, 0, 0);
    private static final float TextFieldPadding = 16;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CommonDecorationBox(@NotNull String value, @NotNull Function2<? super InterfaceC3967k, ? super Integer, Unit> innerTextField, @NotNull X visualTransformation, Function2<? super InterfaceC3967k, ? super Integer, Unit> function2, Function2<? super InterfaceC3967k, ? super Integer, Unit> function22, boolean z11, @NotNull o interactionSource, @NotNull InterfaceC9914x contentPadding, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        Function2<? super InterfaceC3967k, ? super Integer, Unit> function23;
        int i14;
        Function2<? super InterfaceC3967k, ? super Integer, Unit> function24;
        int i15;
        boolean z12;
        Function2<? super InterfaceC3967k, ? super Integer, Unit> function25;
        boolean z13;
        Object C11;
        String h11;
        boolean z14;
        J0 m02;
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(innerTextField, "innerTextField");
        Intrinsics.checkNotNullParameter(visualTransformation, "visualTransformation");
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        Intrinsics.checkNotNullParameter(contentPadding, "contentPadding");
        C3969l u11 = interfaceC3967k.u(-505485378);
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
            i13 |= u11.F(innerTextField) ? 32 : 16;
        }
        if ((i12 & 4) != 0) {
            i13 |= 384;
        } else if ((i11 & 384) == 0) {
            i13 |= u11.n(visualTransformation) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i12 & 8) != 0) {
            i13 |= 3072;
        } else if ((i11 & 3072) == 0) {
            function23 = function2;
            i13 |= u11.F(function23) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
            i14 = i12 & 16;
            if (i14 == 0) {
                i13 |= 24576;
            } else if ((i11 & 24576) == 0) {
                function24 = function22;
                i13 |= u11.F(function24) ? 16384 : 8192;
                i15 = i12 & 32;
                if (i15 != 0) {
                    i13 |= 196608;
                } else if ((196608 & i11) == 0) {
                    z12 = z11;
                    i13 |= u11.p(z12) ? 131072 : 65536;
                    if ((i12 & 64) == 0) {
                        i13 |= 1572864;
                    } else if ((i11 & 1572864) == 0) {
                        i13 |= u11.n(interactionSource) ? 1048576 : 524288;
                    }
                    if ((i12 & UserVerificationMethods.USER_VERIFY_PATTERN) == 0) {
                        i13 |= 12582912;
                    } else if ((i11 & 12582912) == 0) {
                        i13 |= u11.n(contentPadding) ? 8388608 : 4194304;
                    }
                    if ((4793491 & i13) == 4793490 || !u11.b()) {
                        function25 = null;
                        if (i14 != 0) {
                            function24 = null;
                        }
                        if (i15 != 0) {
                            z12 = false;
                        }
                        u11.o(2116537249);
                        z13 = ((i13 & 14) != 4) | ((i13 & 896) != 256);
                        C11 = u11.C();
                        if (!z13 || C11 == InterfaceC3967k.a.a()) {
                            C11 = visualTransformation.filter(new C3422b(6, value, null));
                            u11.x(C11);
                        }
                        u11.k();
                        h11 = ((W) C11).b().h();
                        InputPhase inputPhase = !((Boolean) i.a(interactionSource, u11, (i13 >> 18) & 14).getValue()).booleanValue() ? InputPhase.Focused : h11.length() == 0 ? InputPhase.UnfocusedEmpty : InputPhase.UnfocusedNotEmpty;
                        if (h11.length() == 0 && inputPhase == InputPhase.Focused) {
                            function25 = function24;
                        }
                        z14 = z12;
                        TextFieldTransitionScope.INSTANCE.Transition(inputPhase, a1.c.c(-1846689951, new TextFieldImplKt$CommonDecorationBox$1(innerTextField, function23, function25, z14, contentPadding), u11), u11, 432);
                    } else {
                        u11.j();
                        z14 = z12;
                    }
                    Function2<? super InterfaceC3967k, ? super Integer, Unit> function26 = function24;
                    m02 = u11.m0();
                    if (m02 == null) {
                        m02.G(new TextFieldImplKt$CommonDecorationBox$2(value, innerTextField, visualTransformation, function2, function26, z14, interactionSource, contentPadding, i11, i12));
                        return;
                    }
                    return;
                }
                z12 = z11;
                if ((i12 & 64) == 0) {
                }
                if ((i12 & UserVerificationMethods.USER_VERIFY_PATTERN) == 0) {
                }
                if ((4793491 & i13) == 4793490) {
                }
                function25 = null;
                if (i14 != 0) {
                }
                if (i15 != 0) {
                }
                u11.o(2116537249);
                z13 = ((i13 & 14) != 4) | ((i13 & 896) != 256);
                C11 = u11.C();
                if (!z13) {
                }
                C11 = visualTransformation.filter(new C3422b(6, value, null));
                u11.x(C11);
                u11.k();
                h11 = ((W) C11).b().h();
                InputPhase inputPhase2 = !((Boolean) i.a(interactionSource, u11, (i13 >> 18) & 14).getValue()).booleanValue() ? InputPhase.Focused : h11.length() == 0 ? InputPhase.UnfocusedEmpty : InputPhase.UnfocusedNotEmpty;
                if (h11.length() == 0) {
                    function25 = function24;
                }
                z14 = z12;
                TextFieldTransitionScope.INSTANCE.Transition(inputPhase2, a1.c.c(-1846689951, new TextFieldImplKt$CommonDecorationBox$1(innerTextField, function23, function25, z14, contentPadding), u11), u11, 432);
                Function2<? super InterfaceC3967k, ? super Integer, Unit> function262 = function24;
                m02 = u11.m0();
                if (m02 == null) {
                }
            }
            function24 = function22;
            i15 = i12 & 32;
            if (i15 != 0) {
            }
            z12 = z11;
            if ((i12 & 64) == 0) {
            }
            if ((i12 & UserVerificationMethods.USER_VERIFY_PATTERN) == 0) {
            }
            if ((4793491 & i13) == 4793490) {
            }
            function25 = null;
            if (i14 != 0) {
            }
            if (i15 != 0) {
            }
            u11.o(2116537249);
            z13 = ((i13 & 14) != 4) | ((i13 & 896) != 256);
            C11 = u11.C();
            if (!z13) {
            }
            C11 = visualTransformation.filter(new C3422b(6, value, null));
            u11.x(C11);
            u11.k();
            h11 = ((W) C11).b().h();
            InputPhase inputPhase22 = !((Boolean) i.a(interactionSource, u11, (i13 >> 18) & 14).getValue()).booleanValue() ? InputPhase.Focused : h11.length() == 0 ? InputPhase.UnfocusedEmpty : InputPhase.UnfocusedNotEmpty;
            if (h11.length() == 0) {
            }
            z14 = z12;
            TextFieldTransitionScope.INSTANCE.Transition(inputPhase22, a1.c.c(-1846689951, new TextFieldImplKt$CommonDecorationBox$1(innerTextField, function23, function25, z14, contentPadding), u11), u11, 432);
            Function2<? super InterfaceC3967k, ? super Integer, Unit> function2622 = function24;
            m02 = u11.m0();
            if (m02 == null) {
            }
        }
        function23 = function2;
        i14 = i12 & 16;
        if (i14 == 0) {
        }
        function24 = function22;
        i15 = i12 & 32;
        if (i15 != 0) {
        }
        z12 = z11;
        if ((i12 & 64) == 0) {
        }
        if ((i12 & UserVerificationMethods.USER_VERIFY_PATTERN) == 0) {
        }
        if ((4793491 & i13) == 4793490) {
        }
        function25 = null;
        if (i14 != 0) {
        }
        if (i15 != 0) {
        }
        u11.o(2116537249);
        z13 = ((i13 & 14) != 4) | ((i13 & 896) != 256);
        C11 = u11.C();
        if (!z13) {
        }
        C11 = visualTransformation.filter(new C3422b(6, value, null));
        u11.x(C11);
        u11.k();
        h11 = ((W) C11).b().h();
        InputPhase inputPhase222 = !((Boolean) i.a(interactionSource, u11, (i13 >> 18) & 14).getValue()).booleanValue() ? InputPhase.Focused : h11.length() == 0 ? InputPhase.UnfocusedEmpty : InputPhase.UnfocusedNotEmpty;
        if (h11.length() == 0) {
        }
        z14 = z12;
        TextFieldTransitionScope.INSTANCE.Transition(inputPhase222, a1.c.c(-1846689951, new TextFieldImplKt$CommonDecorationBox$1(innerTextField, function23, function25, z14, contentPadding), u11), u11, 432);
        Function2<? super InterfaceC3967k, ? super Integer, Unit> function26222 = function24;
        m02 = u11.m0();
        if (m02 == null) {
        }
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

    public static final float getTextFieldPadding() {
        return TextFieldPadding;
    }

    public static final long getZeroConstraints() {
        return ZeroConstraints;
    }

    public static final int heightOrZero(m0 m0Var) {
        if (m0Var != null) {
            return m0Var.l0();
        }
        return 0;
    }

    public static final int widthOrZero(m0 m0Var) {
        if (m0Var != null) {
            return m0Var.u0();
        }
        return 0;
    }
}

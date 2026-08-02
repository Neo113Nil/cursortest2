package ru.ozon.app.android.fresh.chat.widgets.textInput.presentation;

import A0.g;
import A0.h;
import B1.V;
import D0.e;
import D1.InterfaceC2801g;
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
import WZ.d;
import WZ.l;
import WZ.t;
import android.view.View;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.X;
import androidx.compose.foundation.layout.Y;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.K0;
import androidx.compose.ui.platform.P1;
import androidx.lifecycle.J;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import e3.r;
import i1.C6988h;
import j1.i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l1.y0;
import n0.C8385f;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.chat.R$string;
import ru.ozon.app.android.fresh.chat.widgets.textInput.presentation.components.CustomizableTextInputKt;
import ru.ozon.app.android.fresh.chat.widgets.textInput.presentation.components.CustomizableTextInputStyle;
import ru.ozon.app.android.fresh.chat.widgets.textInput.presentation.components.IconButtonStyle;
import ru.ozon.app.android.fresh.chat.widgets.textInput.presentation.components.IconLoaderButtonKt;
import ru.ozon.app.android.fresh.chat.widgets.textInput.presentation.components.VerticalScrollbarStyle;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.core.repository.UniTheme;
import u0.C9891D;
import u0.M;
import u0.N;
import u0.O;
import x1.L;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aµ\u0001\u0010\u001e\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u000e2\b\b\u0002\u0010\u0012\u001a\u00020\u000e2\b\b\u0002\u0010\u0013\u001a\u00020\u000e2\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001aH\u0001¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u001f\u0010#\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!H\u0001¢\u0006\u0004\b#\u0010$\u001a%\u0010)\u001a\u00020%*\u00020%2\u0006\u0010&\u001a\u00020\n2\b\b\u0002\u0010(\u001a\u00020'H\u0001¢\u0006\u0004\b)\u0010*\u001a)\u0010.\u001a\u00020\b*\u00060\u0002j\u0002`\u00032\b\u0010,\u001a\u0004\u0018\u00010+2\u0006\u0010-\u001a\u00020\u0005H\u0000¢\u0006\u0004\b.\u0010/¨\u00061²\u0006\u000e\u00100\u001a\u00020\n8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010&\u001a\u00020\n8\n@\nX\u008a\u008e\u0002"}, d2 = {"Lru/ozon/app/android/fresh/chat/widgets/textInput/presentation/TextInputVO;", "item", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "", "currentText", "Lkotlin/Function1;", "", "onTextChanged", "", "isLoading", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "LZ1/h;", "containerRadius", "containerLeftPadding", "containerTopPadding", "containerRightPadding", "containerBottomPadding", "Ll1/Z;", "containerBackgroundColor", "Lru/ozon/app/android/fresh/chat/widgets/textInput/presentation/components/CustomizableTextInputStyle;", "textInputStyle", "Lru/ozon/app/android/fresh/chat/widgets/textInput/presentation/components/VerticalScrollbarStyle;", "scrollbarStyle", "Lru/ozon/app/android/fresh/chat/widgets/textInput/presentation/components/IconButtonStyle;", "buttonStyle", "TextInputWidgetHolder-Ow1X5yo", "(Lru/ozon/app/android/fresh/chat/widgets/textInput/presentation/TextInputVO;LWZ/l;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ZLkotlin/jvm/functions/Function1;FFFFFJLru/ozon/app/android/fresh/chat/widgets/textInput/presentation/components/CustomizableTextInputStyle;Lru/ozon/app/android/fresh/chat/widgets/textInput/presentation/components/VerticalScrollbarStyle;Lru/ozon/app/android/fresh/chat/widgets/textInput/presentation/components/IconButtonStyle;LS0/k;III)V", "TextInputWidgetHolder", "Landroid/view/View;", "view", "Lj1/i;", "focusManager", "ClearFocusOnKeyboardHideEffect", "(Landroid/view/View;Lj1/i;LS0/k;I)V", "Landroidx/compose/ui/e;", "isFocused", "Lu0/J;", "defaultWindowInsets", "setupImeAwareness", "(Landroidx/compose/ui/e;ZLu0/J;LS0/k;II)Landroidx/compose/ui/e;", "LWZ/t;", "event", "payloadType", "processTypedEvent", "(LWZ/l;LWZ/t;Ljava/lang/String;)V", "showLoader", "chat_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class TextInputWidgetHolderKt {
    public static final void ClearFocusOnKeyboardHideEffect(@NotNull View view, @NotNull i focusManager, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(focusManager, "focusManager");
        C3969l u11 = interfaceC3967k.u(-58899906);
        if ((i11 & 6) == 0) {
            i12 = (u11.F(view) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.F(focusManager) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && u11.b()) {
            u11.j();
        } else {
            u11.o(-1369142846);
            boolean F11 = u11.F(view) | u11.F(focusManager);
            Object C11 = u11.C();
            if (F11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new TextInputWidgetHolderKt$ClearFocusOnKeyboardHideEffect$1$1(view, focusManager);
                u11.x(C11);
            }
            u11.k();
            Q.c(view, (Function1) C11, u11);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new TextInputWidgetHolderKt$ClearFocusOnKeyboardHideEffect$2(view, focusManager, i11));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x041d  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0437  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x048d  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x04b9  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x057f  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x05b4  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0602  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x06dc  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x06f2  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x06f5  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x06de  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0606  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x05bb  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0583  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x04bb  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x048f  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0762  */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /* renamed from: TextInputWidgetHolder-Ow1X5yo, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m710TextInputWidgetHolderOw1X5yo(@NotNull TextInputVO item, @NotNull l tokenizedAnalytics, @NotNull String currentText, @NotNull Function1<? super String, Unit> onTextChanged, boolean z11, @NotNull Function1<? super AtomAction, Unit> actionHandler, float f7, float f11, float f12, float f13, float f14, long j11, CustomizableTextInputStyle customizableTextInputStyle, VerticalScrollbarStyle verticalScrollbarStyle, IconButtonStyle iconButtonStyle, InterfaceC3967k interfaceC3967k, int i11, int i12, int i13) {
        int i14;
        float f15;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        long j12;
        float f16;
        float f17;
        C3969l c3969l;
        int i21;
        int i22;
        CustomizableTextInputStyle customizableTextInputStyle2;
        CustomizableTextInputStyle customizableTextInputStyle3;
        int i23;
        VerticalScrollbarStyle verticalScrollbarStyle2;
        C3969l c3969l2;
        CustomizableTextInputStyle customizableTextInputStyle4;
        IconButtonStyle iconButtonStyle2;
        VerticalScrollbarStyle verticalScrollbarStyle3;
        float f18;
        float f19;
        long j13;
        boolean q11;
        Object C11;
        boolean n11;
        Object C12;
        String placeholder;
        Object b11;
        boolean z12;
        Object C13;
        e eVar;
        Object b12;
        InterfaceC3978p0 interfaceC3978p0;
        Object b13;
        InterfaceC3978p0 interfaceC3978p02;
        boolean F11;
        Object C14;
        boolean z13;
        Object C15;
        boolean n12;
        Object C16;
        boolean F12;
        Object C17;
        androidx.compose.ui.e b14;
        int I11;
        androidx.compose.ui.e b15;
        int I12;
        boolean F13;
        Object C18;
        InterfaceC3978p0 interfaceC3978p03;
        boolean n13;
        Object C19;
        C3969l c3969l3;
        VerticalScrollbarStyle verticalScrollbarStyle4;
        IconButtonStyle iconButtonStyle3;
        long j14;
        float f21;
        float f22;
        float f23;
        float f24;
        float f25;
        CustomizableTextInputStyle customizableTextInputStyle5;
        J0 m02;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(currentText, "currentText");
        Intrinsics.checkNotNullParameter(onTextChanged, "onTextChanged");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        C3969l u11 = interfaceC3967k.u(1324095425);
        if ((i13 & 1) != 0) {
            i14 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i14 = (u11.F(item) ? 4 : 2) | i11;
        } else {
            i14 = i11;
        }
        if ((i13 & 2) != 0) {
            i14 |= 48;
        } else if ((i11 & 48) == 0) {
            i14 |= u11.F(tokenizedAnalytics) ? 32 : 16;
        }
        int i24 = i13 & 4;
        int i25 = UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i24 != 0) {
            i14 |= 384;
        } else if ((i11 & 384) == 0) {
            i14 |= u11.n(currentText) ? 256 : 128;
        }
        int i26 = i13 & 8;
        int i27 = UserVerificationMethods.USER_VERIFY_ALL;
        if (i26 != 0) {
            i14 |= 3072;
        } else if ((i11 & 3072) == 0) {
            i14 |= u11.F(onTextChanged) ? 2048 : 1024;
        }
        int i28 = 8192;
        if ((i13 & 16) != 0) {
            i14 |= 24576;
        } else if ((i11 & 24576) == 0) {
            i14 |= u11.p(z11) ? 16384 : 8192;
        }
        if ((i13 & 32) != 0) {
            i14 |= 196608;
        } else if ((i11 & 196608) == 0) {
            i14 |= u11.F(actionHandler) ? 131072 : 65536;
        }
        int i29 = i13 & 64;
        if (i29 != 0) {
            i14 |= 1572864;
        } else if ((i11 & 1572864) == 0) {
            i14 |= u11.q(f7) ? 1048576 : 524288;
        }
        int i31 = i13 & UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i31 != 0) {
            i14 |= 12582912;
            f15 = f11;
        } else {
            f15 = f11;
            if ((i11 & 12582912) == 0) {
                i14 |= u11.q(f15) ? 8388608 : 4194304;
            }
        }
        int i32 = i13 & 256;
        if (i32 != 0) {
            i14 |= 100663296;
        } else if ((i11 & 100663296) == 0) {
            i14 |= u11.q(f12) ? 67108864 : 33554432;
        }
        int i33 = i13 & UserVerificationMethods.USER_VERIFY_NONE;
        if (i33 != 0) {
            i14 |= 805306368;
        } else if ((i11 & 805306368) == 0) {
            i15 = i33;
            i14 |= u11.q(f13) ? 536870912 : 268435456;
            i16 = i13 & UserVerificationMethods.USER_VERIFY_ALL;
            if (i16 == 0) {
                i18 = i12 | 6;
                i17 = i16;
            } else if ((i12 & 6) == 0) {
                i17 = i16;
                i18 = i12 | (u11.q(f14) ? 4 : 2);
            } else {
                i17 = i16;
                i18 = i12;
            }
            if ((i12 & 48) != 0) {
                i19 = i14;
                j12 = j11;
                i18 |= ((i13 & 2048) == 0 && u11.s(j12)) ? 32 : 16;
            } else {
                i19 = i14;
                j12 = j11;
            }
            if ((i12 & 384) == 0) {
                if ((i13 & 4096) == 0 && u11.n(customizableTextInputStyle)) {
                    i25 = 256;
                }
                i18 |= i25;
            }
            if ((i12 & 3072) == 0) {
                if ((i13 & 8192) == 0 && u11.n(verticalScrollbarStyle)) {
                    i27 = 2048;
                }
                i18 |= i27;
            }
            if ((i12 & 24576) == 0) {
                if ((i13 & 16384) == 0 && u11.n(iconButtonStyle)) {
                    i28 = 16384;
                }
                i18 |= i28;
            }
            int i34 = i18;
            if ((i19 & 306783379) != 306783378 && (i34 & 9363) == 9362 && u11.b()) {
                u11.j();
                f21 = f7;
                customizableTextInputStyle5 = customizableTextInputStyle;
                iconButtonStyle3 = iconButtonStyle;
                c3969l3 = u11;
                j14 = j12;
                f24 = f15;
                f25 = f12;
                f22 = f13;
                f23 = f14;
                verticalScrollbarStyle4 = verticalScrollbarStyle;
            } else {
                u11.Q0();
                if ((i11 & 1) != 0 || u11.w0()) {
                    f16 = i29 == 0 ? 32 : f7;
                    float f26 = i31 == 0 ? 8 : f15;
                    float f27 = i32 == 0 ? 10 : f12;
                    f17 = i15 == 0 ? 8 : f13;
                    float f28 = i17 == 0 ? 20 : f14;
                    if ((i13 & 2048) != 0) {
                        j12 = UniTheme.INSTANCE.getColors(u11, UniTheme.$stable).getLayerFloor1();
                        i34 &= -113;
                    }
                    long j15 = j12;
                    if ((i13 & 4096) == 0) {
                        c3969l = u11;
                        i21 = i19;
                        i22 = i34 & (-897);
                        customizableTextInputStyle2 = CustomizableTextInputStyle.INSTANCE.m722createDefaultFreshStylemVkhe_I(0L, 0, null, null, 0.0f, 0.0f, 0L, 0L, 0.0f, 0.0f, 0.0f, 0L, 0L, c3969l, 0, 3072, 8191);
                    } else {
                        c3969l = u11;
                        i21 = i19;
                        i22 = i34;
                        customizableTextInputStyle2 = customizableTextInputStyle;
                    }
                    if ((i13 & 8192) == 0) {
                        customizableTextInputStyle3 = customizableTextInputStyle2;
                        i23 = i22 & (-7169);
                        verticalScrollbarStyle2 = VerticalScrollbarStyle.INSTANCE.m736createDefaultFreshStylenbzeIBc(0.0f, 0.0f, 0.0f, 0L, 0L, c3969l, 196608, 31);
                    } else {
                        customizableTextInputStyle3 = customizableTextInputStyle2;
                        i23 = i22;
                        verticalScrollbarStyle2 = verticalScrollbarStyle;
                    }
                    if ((i13 & 16384) == 0) {
                        C3969l c3969l4 = c3969l;
                        c3969l2 = c3969l4;
                        customizableTextInputStyle4 = customizableTextInputStyle3;
                        verticalScrollbarStyle3 = verticalScrollbarStyle2;
                        iconButtonStyle2 = IconButtonStyle.INSTANCE.m730createDefaultFreshStyleqCw55Ws(0.0f, 0.0f, 0.0f, 0L, 0L, 0L, 0L, c3969l4, 12582912, 127);
                        i23 &= -57345;
                    } else {
                        c3969l2 = c3969l;
                        customizableTextInputStyle4 = customizableTextInputStyle3;
                        iconButtonStyle2 = iconButtonStyle;
                        verticalScrollbarStyle3 = verticalScrollbarStyle2;
                    }
                    f15 = f26;
                    f18 = f27;
                    f19 = f28;
                    j13 = j15;
                } else {
                    u11.j();
                    if ((i13 & 2048) != 0) {
                        i34 &= -113;
                    }
                    if ((i13 & 4096) != 0) {
                        i34 &= -897;
                    }
                    if ((i13 & 8192) != 0) {
                        i34 &= -7169;
                    }
                    if ((i13 & 16384) != 0) {
                        i34 &= -57345;
                    }
                    f16 = f7;
                    f17 = f13;
                    customizableTextInputStyle4 = customizableTextInputStyle;
                    verticalScrollbarStyle3 = verticalScrollbarStyle;
                    iconButtonStyle2 = iconButtonStyle;
                    i23 = i34;
                    j13 = j12;
                    f18 = f12;
                    f19 = f14;
                    c3969l2 = u11;
                    i21 = i19;
                }
                c3969l2.j0();
                P1 p12 = (P1) c3969l2.m(K0.o());
                CustomizableTextInputStyle customizableTextInputStyle6 = customizableTextInputStyle4;
                i iVar = (i) c3969l2.m(K0.f());
                float f29 = f18;
                J j16 = (J) c3969l2.m(r.a());
                float f31 = f17;
                View view = (View) c3969l2.m(AndroidCompositionLocals_androidKt.h());
                float f32 = f19;
                float textBoxRadius = customizableTextInputStyle6.getTextBoxRadius();
                float f33 = f15;
                c3969l2.o(552369633);
                q11 = c3969l2.q(textBoxRadius);
                C11 = c3969l2.C();
                if (!q11 || C11 == InterfaceC3967k.a.a()) {
                    C11 = h.b(customizableTextInputStyle6.getTextBoxRadius());
                    c3969l2.x(C11);
                }
                g gVar = (g) C11;
                c3969l2.k();
                String placeholder2 = item.getPlaceholder();
                c3969l2.o(552373810);
                n11 = c3969l2.n(placeholder2);
                C12 = c3969l2.C();
                if (!n11 || C12 == InterfaceC3967k.a.a()) {
                    placeholder = item.getPlaceholder();
                    if (placeholder == null) {
                        placeholder = StringProvider.getString(R$string.text_input_placeholder);
                    }
                    C12 = placeholder;
                    c3969l2.x(C12);
                }
                String str = (String) C12;
                b11 = Pk0.h.b(c3969l2, 552378423);
                if (b11 == InterfaceC3967k.a.a()) {
                    b11 = new j1.r();
                    c3969l2.x(b11);
                }
                j1.r rVar = (j1.r) b11;
                c3969l2.k();
                c3969l2.o(552380047);
                z12 = (i21 & 896) != 256;
                C13 = c3969l2.C();
                if (!z12 || C13 == InterfaceC3967k.a.a()) {
                    C13 = new e(currentText);
                    c3969l2.x(C13);
                }
                eVar = (e) C13;
                b12 = Pk0.h.b(c3969l2, 552382492);
                if (b12 == InterfaceC3967k.a.a()) {
                    b12 = n1.f(Boolean.FALSE, D1.f25195a);
                    c3969l2.x(b12);
                }
                interfaceC3978p0 = (InterfaceC3978p0) b12;
                b13 = Pk0.h.b(c3969l2, 552384284);
                long j17 = j13;
                if (b13 == InterfaceC3967k.a.a()) {
                    b13 = n1.f(Boolean.FALSE, D1.f25195a);
                    c3969l2.x(b13);
                }
                interfaceC3978p02 = (InterfaceC3978p0) b13;
                c3969l2.k();
                ClearFocusOnKeyboardHideEffect(view, iVar, c3969l2, 0);
                Unit unit = Unit.f71690a;
                c3969l2.o(552388136);
                F11 = c3969l2.F(item) | c3969l2.F(tokenizedAnalytics);
                C14 = c3969l2.C();
                if (!F11 || C14 == InterfaceC3967k.a.a()) {
                    C14 = new TextInputWidgetHolderKt$TextInputWidgetHolder$1$1(item, tokenizedAnalytics, null);
                    c3969l2.x(C14);
                }
                c3969l2.k();
                Q.e(c3969l2, unit, (Function2) C14);
                Boolean valueOf = Boolean.valueOf(z11);
                c3969l2.o(552393612);
                z13 = (57344 & i21) != 16384;
                C15 = c3969l2.C();
                if (!z13 || C15 == InterfaceC3967k.a.a()) {
                    C15 = new TextInputWidgetHolderKt$TextInputWidgetHolder$2$1(z11, interfaceC3978p0, null);
                    c3969l2.x(C15);
                }
                c3969l2.k();
                Q.e(c3969l2, valueOf, (Function2) C15);
                c3969l2.o(552397059);
                int i35 = i21 & 7168;
                n12 = (i35 != 2048) | c3969l2.n(eVar) | c3969l2.F(j16);
                C16 = c3969l2.C();
                if (!n12 || C16 == InterfaceC3967k.a.a()) {
                    C16 = new TextInputWidgetHolderKt$TextInputWidgetHolder$3$1(j16, onTextChanged, eVar);
                    c3969l2.x(C16);
                }
                c3969l2.k();
                Q.b(j16, eVar, (Function1) C16, c3969l2);
                e.a aVar = androidx.compose.ui.e.f40358c0;
                androidx.compose.ui.e u12 = a0.u(a0.e(setupImeAwareness(aVar, TextInputWidgetHolder_Ow1X5yo$lambda$8(interfaceC3978p02), null, c3969l2, 6, 2), 1.0f), 3);
                c3969l2.o(552411969);
                F12 = c3969l2.F(iVar) | c3969l2.n(p12);
                C17 = c3969l2.C();
                if (!F12 || C17 == InterfaceC3967k.a.a()) {
                    C17 = new TextInputWidgetHolderKt$TextInputWidgetHolder$4$1(iVar, p12, null);
                    c3969l2.x(C17);
                }
                c3969l2.k();
                b14 = androidx.compose.foundation.e.b(C6988h.a(L.b(u12, unit, (Function2) C17), h.d(f16, f16, 0.0f, 0.0f, 12)), j17, y0.a());
                float f34 = f16;
                androidx.compose.ui.e i36 = T.i(b14, f33, f29, f31, f32);
                V f35 = C5185h.f(InterfaceC6250b.a.o(), false);
                I11 = c3969l2.I();
                A0 d11 = c3969l2.d();
                androidx.compose.ui.e f36 = c.f(c3969l2, i36);
                Function0 a11 = Fr.g.a(InterfaceC2801g.f5440U, c3969l2);
                if (c3969l2.t()) {
                    c3969l2.e();
                } else {
                    c3969l2.H(a11);
                }
                Function2 f37 = E.f(c3969l2, f35, c3969l2, d11);
                if (!c3969l2.t() || !Intrinsics.d(c3969l2.C(), Integer.valueOf(I11))) {
                    Ep.a.d(I11, c3969l2, I11, f37);
                }
                b15 = androidx.compose.foundation.e.b(C6988h.a(C8385f.c(customizableTextInputStyle6.getBorderWidth(), !TextInputWidgetHolder_Ow1X5yo$lambda$8(interfaceC3978p02) ? customizableTextInputStyle6.getBorderFocusedColor() : customizableTextInputStyle6.getBorderUnfocusedColor(), GZ.e.c(c3969l2, f36, aVar, 1.0f), gVar), gVar), customizableTextInputStyle6.getBackgroundColor(), y0.a());
                androidx.compose.ui.e g10 = T.g(b15, customizableTextInputStyle6.getTextHorizontalPadding(), customizableTextInputStyle6.getTextVerticalPadding());
                Y b16 = X.b(C5179b.f(), InterfaceC6250b.a.l(), c3969l2, 0);
                I12 = c3969l2.I();
                A0 d12 = c3969l2.d();
                androidx.compose.ui.e f38 = c.f(c3969l2, g10);
                Function0 a12 = InterfaceC2801g.a.a();
                c3969l2.i();
                if (c3969l2.t()) {
                    c3969l2.e();
                } else {
                    c3969l2.H(a12);
                }
                Function2 h11 = Cm.e.h(c3969l2, b16, c3969l2, d12);
                if (!c3969l2.t() || !Intrinsics.d(c3969l2.C(), Integer.valueOf(I12))) {
                    Ep.a.d(I12, c3969l2, I12, h11);
                }
                F1.b(c3969l2, f38, InterfaceC2801g.a.f());
                C9891D c9891d = C9891D.f99599a;
                androidx.compose.ui.e b17 = c9891d.b(c9891d.a(aVar, 1.0f, true), InterfaceC6250b.a.i());
                boolean z14 = !z11;
                c3969l2.o(-539876999);
                F13 = c3969l2.F(tokenizedAnalytics) | c3969l2.F(item);
                C18 = c3969l2.C();
                if (!F13 || C18 == InterfaceC3967k.a.a()) {
                    interfaceC3978p03 = interfaceC3978p02;
                    C18 = new TextInputWidgetHolderKt$TextInputWidgetHolder$5$1$1$1(tokenizedAnalytics, item, interfaceC3978p03);
                    c3969l2.x(C18);
                } else {
                    interfaceC3978p03 = interfaceC3978p02;
                }
                Function1 function1 = (Function1) C18;
                c3969l2.k();
                int i37 = i23 << 3;
                VerticalScrollbarStyle verticalScrollbarStyle5 = verticalScrollbarStyle3;
                CustomizableTextInputKt.CustomizableTextInput(b17, eVar, str, customizableTextInputStyle6, verticalScrollbarStyle5, z14, rVar, function1, c3969l2, (i37 & 57344) | (i37 & 7168) | 1572864);
                androidx.compose.ui.e b18 = c9891d.b(aVar, InterfaceC6250b.a.a());
                boolean z15 = (TextInputWidgetHolder_Ow1X5yo$lambda$8(interfaceC3978p03) || kotlin.text.h.K(eVar.e())) ? false : true;
                boolean z16 = z11 && !kotlin.text.h.K(eVar.e());
                boolean z17 = !TextInputWidgetHolder_Ow1X5yo$lambda$5(interfaceC3978p0) && z11;
                c3969l2.o(-539854498);
                n13 = c3969l2.n(eVar) | (i35 != 2048) | c3969l2.n(p12) | c3969l2.F(item) | ((458752 & i21) != 131072) | c3969l2.F(tokenizedAnalytics);
                C19 = c3969l2.C();
                if (!n13 || C19 == InterfaceC3967k.a.a()) {
                    C19 = new TextInputWidgetHolderKt$TextInputWidgetHolder$5$1$2$1(eVar, onTextChanged, p12, item, actionHandler, tokenizedAnalytics, interfaceC3978p0);
                    c3969l2.x(C19);
                }
                c3969l2.k();
                C3969l c3969l5 = c3969l2;
                IconButtonStyle iconButtonStyle4 = iconButtonStyle2;
                IconLoaderButtonKt.IconLoaderButton(b18, iconButtonStyle4, z15, z16, z17, (Function0) C19, c3969l5, (i23 >> 9) & 112, 0);
                c3969l3 = c3969l5;
                c3969l3.f();
                c3969l3.f();
                verticalScrollbarStyle4 = verticalScrollbarStyle5;
                iconButtonStyle3 = iconButtonStyle4;
                j14 = j17;
                f21 = f34;
                f22 = f31;
                f23 = f32;
                f24 = f33;
                f25 = f29;
                customizableTextInputStyle5 = customizableTextInputStyle6;
            }
            m02 = c3969l3.m0();
            if (m02 == null) {
                m02.G(new TextInputWidgetHolderKt$TextInputWidgetHolder$6(item, tokenizedAnalytics, currentText, onTextChanged, z11, actionHandler, f21, f24, f25, f22, f23, j14, customizableTextInputStyle5, verticalScrollbarStyle4, iconButtonStyle3, i11, i12, i13));
                return;
            }
            return;
        }
        i15 = i33;
        i16 = i13 & UserVerificationMethods.USER_VERIFY_ALL;
        if (i16 == 0) {
        }
        if ((i12 & 48) != 0) {
        }
        if ((i12 & 384) == 0) {
        }
        if ((i12 & 3072) == 0) {
        }
        if ((i12 & 24576) == 0) {
        }
        int i342 = i18;
        if ((i19 & 306783379) != 306783378) {
        }
        u11.Q0();
        if ((i11 & 1) != 0) {
        }
        if (i29 == 0) {
        }
        if (i31 == 0) {
        }
        if (i32 == 0) {
        }
        if (i15 == 0) {
        }
        if (i17 == 0) {
        }
        if ((i13 & 2048) != 0) {
        }
        long j152 = j12;
        if ((i13 & 4096) == 0) {
        }
        if ((i13 & 8192) == 0) {
        }
        if ((i13 & 16384) == 0) {
        }
        f15 = f26;
        f18 = f27;
        f19 = f28;
        j13 = j152;
        c3969l2.j0();
        P1 p122 = (P1) c3969l2.m(K0.o());
        CustomizableTextInputStyle customizableTextInputStyle62 = customizableTextInputStyle4;
        i iVar2 = (i) c3969l2.m(K0.f());
        float f292 = f18;
        J j162 = (J) c3969l2.m(r.a());
        float f312 = f17;
        View view2 = (View) c3969l2.m(AndroidCompositionLocals_androidKt.h());
        float f322 = f19;
        float textBoxRadius2 = customizableTextInputStyle62.getTextBoxRadius();
        float f332 = f15;
        c3969l2.o(552369633);
        q11 = c3969l2.q(textBoxRadius2);
        C11 = c3969l2.C();
        if (!q11) {
        }
        C11 = h.b(customizableTextInputStyle62.getTextBoxRadius());
        c3969l2.x(C11);
        g gVar2 = (g) C11;
        c3969l2.k();
        String placeholder22 = item.getPlaceholder();
        c3969l2.o(552373810);
        n11 = c3969l2.n(placeholder22);
        C12 = c3969l2.C();
        if (!n11) {
        }
        placeholder = item.getPlaceholder();
        if (placeholder == null) {
        }
        C12 = placeholder;
        c3969l2.x(C12);
        String str2 = (String) C12;
        b11 = Pk0.h.b(c3969l2, 552378423);
        if (b11 == InterfaceC3967k.a.a()) {
        }
        j1.r rVar2 = (j1.r) b11;
        c3969l2.k();
        c3969l2.o(552380047);
        if ((i21 & 896) != 256) {
        }
        C13 = c3969l2.C();
        if (!z12) {
        }
        C13 = new D0.e(currentText);
        c3969l2.x(C13);
        eVar = (D0.e) C13;
        b12 = Pk0.h.b(c3969l2, 552382492);
        if (b12 == InterfaceC3967k.a.a()) {
        }
        interfaceC3978p0 = (InterfaceC3978p0) b12;
        b13 = Pk0.h.b(c3969l2, 552384284);
        long j172 = j13;
        if (b13 == InterfaceC3967k.a.a()) {
        }
        interfaceC3978p02 = (InterfaceC3978p0) b13;
        c3969l2.k();
        ClearFocusOnKeyboardHideEffect(view2, iVar2, c3969l2, 0);
        Unit unit2 = Unit.f71690a;
        c3969l2.o(552388136);
        F11 = c3969l2.F(item) | c3969l2.F(tokenizedAnalytics);
        C14 = c3969l2.C();
        if (!F11) {
        }
        C14 = new TextInputWidgetHolderKt$TextInputWidgetHolder$1$1(item, tokenizedAnalytics, null);
        c3969l2.x(C14);
        c3969l2.k();
        Q.e(c3969l2, unit2, (Function2) C14);
        Boolean valueOf2 = Boolean.valueOf(z11);
        c3969l2.o(552393612);
        if ((57344 & i21) != 16384) {
        }
        C15 = c3969l2.C();
        if (!z13) {
        }
        C15 = new TextInputWidgetHolderKt$TextInputWidgetHolder$2$1(z11, interfaceC3978p0, null);
        c3969l2.x(C15);
        c3969l2.k();
        Q.e(c3969l2, valueOf2, (Function2) C15);
        c3969l2.o(552397059);
        int i352 = i21 & 7168;
        n12 = (i352 != 2048) | c3969l2.n(eVar) | c3969l2.F(j162);
        C16 = c3969l2.C();
        if (!n12) {
        }
        C16 = new TextInputWidgetHolderKt$TextInputWidgetHolder$3$1(j162, onTextChanged, eVar);
        c3969l2.x(C16);
        c3969l2.k();
        Q.b(j162, eVar, (Function1) C16, c3969l2);
        e.a aVar2 = androidx.compose.ui.e.f40358c0;
        androidx.compose.ui.e u122 = a0.u(a0.e(setupImeAwareness(aVar2, TextInputWidgetHolder_Ow1X5yo$lambda$8(interfaceC3978p02), null, c3969l2, 6, 2), 1.0f), 3);
        c3969l2.o(552411969);
        F12 = c3969l2.F(iVar2) | c3969l2.n(p122);
        C17 = c3969l2.C();
        if (!F12) {
        }
        C17 = new TextInputWidgetHolderKt$TextInputWidgetHolder$4$1(iVar2, p122, null);
        c3969l2.x(C17);
        c3969l2.k();
        b14 = androidx.compose.foundation.e.b(C6988h.a(L.b(u122, unit2, (Function2) C17), h.d(f16, f16, 0.0f, 0.0f, 12)), j172, y0.a());
        float f342 = f16;
        androidx.compose.ui.e i362 = T.i(b14, f332, f292, f312, f322);
        V f352 = C5185h.f(InterfaceC6250b.a.o(), false);
        I11 = c3969l2.I();
        A0 d112 = c3969l2.d();
        androidx.compose.ui.e f362 = c.f(c3969l2, i362);
        Function0 a112 = Fr.g.a(InterfaceC2801g.f5440U, c3969l2);
        if (c3969l2.t()) {
        }
        Function2 f372 = E.f(c3969l2, f352, c3969l2, d112);
        if (!c3969l2.t()) {
        }
        Ep.a.d(I11, c3969l2, I11, f372);
        b15 = androidx.compose.foundation.e.b(C6988h.a(C8385f.c(customizableTextInputStyle62.getBorderWidth(), !TextInputWidgetHolder_Ow1X5yo$lambda$8(interfaceC3978p02) ? customizableTextInputStyle62.getBorderFocusedColor() : customizableTextInputStyle62.getBorderUnfocusedColor(), GZ.e.c(c3969l2, f362, aVar2, 1.0f), gVar2), gVar2), customizableTextInputStyle62.getBackgroundColor(), y0.a());
        androidx.compose.ui.e g102 = T.g(b15, customizableTextInputStyle62.getTextHorizontalPadding(), customizableTextInputStyle62.getTextVerticalPadding());
        Y b162 = X.b(C5179b.f(), InterfaceC6250b.a.l(), c3969l2, 0);
        I12 = c3969l2.I();
        A0 d122 = c3969l2.d();
        androidx.compose.ui.e f382 = c.f(c3969l2, g102);
        Function0 a122 = InterfaceC2801g.a.a();
        c3969l2.i();
        if (c3969l2.t()) {
        }
        Function2 h112 = Cm.e.h(c3969l2, b162, c3969l2, d122);
        if (!c3969l2.t()) {
        }
        Ep.a.d(I12, c3969l2, I12, h112);
        F1.b(c3969l2, f382, InterfaceC2801g.a.f());
        C9891D c9891d2 = C9891D.f99599a;
        androidx.compose.ui.e b172 = c9891d2.b(c9891d2.a(aVar2, 1.0f, true), InterfaceC6250b.a.i());
        boolean z142 = !z11;
        c3969l2.o(-539876999);
        F13 = c3969l2.F(tokenizedAnalytics) | c3969l2.F(item);
        C18 = c3969l2.C();
        if (F13) {
        }
        interfaceC3978p03 = interfaceC3978p02;
        C18 = new TextInputWidgetHolderKt$TextInputWidgetHolder$5$1$1$1(tokenizedAnalytics, item, interfaceC3978p03);
        c3969l2.x(C18);
        Function1 function12 = (Function1) C18;
        c3969l2.k();
        int i372 = i23 << 3;
        VerticalScrollbarStyle verticalScrollbarStyle52 = verticalScrollbarStyle3;
        CustomizableTextInputKt.CustomizableTextInput(b172, eVar, str2, customizableTextInputStyle62, verticalScrollbarStyle52, z142, rVar2, function12, c3969l2, (i372 & 57344) | (i372 & 7168) | 1572864);
        androidx.compose.ui.e b182 = c9891d2.b(aVar2, InterfaceC6250b.a.a());
        if (TextInputWidgetHolder_Ow1X5yo$lambda$8(interfaceC3978p03)) {
        }
        if (z11) {
        }
        if (TextInputWidgetHolder_Ow1X5yo$lambda$5(interfaceC3978p0)) {
        }
        c3969l2.o(-539854498);
        n13 = c3969l2.n(eVar) | (i352 != 2048) | c3969l2.n(p122) | c3969l2.F(item) | ((458752 & i21) != 131072) | c3969l2.F(tokenizedAnalytics);
        C19 = c3969l2.C();
        if (!n13) {
        }
        C19 = new TextInputWidgetHolderKt$TextInputWidgetHolder$5$1$2$1(eVar, onTextChanged, p122, item, actionHandler, tokenizedAnalytics, interfaceC3978p0);
        c3969l2.x(C19);
        c3969l2.k();
        C3969l c3969l52 = c3969l2;
        IconButtonStyle iconButtonStyle42 = iconButtonStyle2;
        IconLoaderButtonKt.IconLoaderButton(b182, iconButtonStyle42, z15, z16, z17, (Function0) C19, c3969l52, (i23 >> 9) & 112, 0);
        c3969l3 = c3969l52;
        c3969l3.f();
        c3969l3.f();
        verticalScrollbarStyle4 = verticalScrollbarStyle52;
        iconButtonStyle3 = iconButtonStyle42;
        j14 = j172;
        f21 = f342;
        f22 = f312;
        f23 = f322;
        f24 = f332;
        f25 = f292;
        customizableTextInputStyle5 = customizableTextInputStyle62;
        m02 = c3969l3.m0();
        if (m02 == null) {
        }
    }

    private static final boolean TextInputWidgetHolder_Ow1X5yo$lambda$5(InterfaceC3978p0<Boolean> interfaceC3978p0) {
        return interfaceC3978p0.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void TextInputWidgetHolder_Ow1X5yo$lambda$6(InterfaceC3978p0<Boolean> interfaceC3978p0, boolean z11) {
        interfaceC3978p0.setValue(Boolean.valueOf(z11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean TextInputWidgetHolder_Ow1X5yo$lambda$8(InterfaceC3978p0<Boolean> interfaceC3978p0) {
        return interfaceC3978p0.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void TextInputWidgetHolder_Ow1X5yo$lambda$9(InterfaceC3978p0<Boolean> interfaceC3978p0, boolean z11) {
        interfaceC3978p0.setValue(Boolean.valueOf(z11));
    }

    public static final void processTypedEvent(@NotNull l lVar, t tVar, @NotNull String payloadType) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        Intrinsics.checkNotNullParameter(payloadType, "payloadType");
        if (tVar == null) {
            return;
        }
        lVar.f(tVar, new d(new TextInputWidgetHolderKt$processTypedEvent$1(payloadType)), null);
    }

    @NotNull
    public static final androidx.compose.ui.e setupImeAwareness(@NotNull androidx.compose.ui.e eVar, boolean z11, u0.J j11, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        u0.J j12;
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        interfaceC3967k.o(1644022029);
        if ((i12 & 2) != 0) {
            j11 = N.a();
        }
        interfaceC3967k.o(-1238221503);
        if (z11) {
            int i13 = u0.J.f99608a;
            j12 = u0.Y.a(interfaceC3967k);
        } else {
            j12 = j11;
        }
        interfaceC3967k.k();
        androidx.compose.ui.e a11 = O.a(eVar, j12);
        if (z11) {
            int i14 = u0.J.f99608a;
            int i15 = M.f99615y;
            j11 = M.a.c(interfaceC3967k).d();
        }
        androidx.compose.ui.e d11 = O.d(a11, j11);
        interfaceC3967k.k();
        return d11;
    }
}

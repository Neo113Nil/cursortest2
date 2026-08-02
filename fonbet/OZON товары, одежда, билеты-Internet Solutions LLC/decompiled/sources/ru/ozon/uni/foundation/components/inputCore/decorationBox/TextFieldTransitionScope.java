package ru.ozon.uni.foundation.components.inputCore.decorationBox;

import S0.A1;
import S0.C3969l;
import S0.InterfaceC3967k;
import S0.J0;
import Sc.o;
import androidx.compose.ui.platform.C5239d1;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import m0.D0;
import m0.H0;
import m0.U0;
import m0.W0;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J+\u0010\f\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00042\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\tH\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f²\u0006\f\u0010\u000e\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lru/ozon/uni/foundation/components/inputCore/decorationBox/TextFieldTransitionScope;", "", "<init>", "()V", "Lru/ozon/uni/foundation/components/inputCore/decorationBox/InputPhase;", "", "toAnimTargetValue", "(Lru/ozon/uni/foundation/components/inputCore/decorationBox/InputPhase;)F", "inputState", "Lkotlin/Function1;", "", "content", "Transition", "(Lru/ozon/uni/foundation/components/inputCore/decorationBox/InputPhase;Lfd/n;LS0/k;I)V", "labelProgress", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
final class TextFieldTransitionScope {

    @NotNull
    public static final TextFieldTransitionScope INSTANCE = new TextFieldTransitionScope();

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[InputPhase.values().length];
            try {
                iArr[InputPhase.Focused.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InputPhase.UnfocusedEmpty.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[InputPhase.UnfocusedNotEmpty.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private TextFieldTransitionScope() {
    }

    private static final float Transition$lambda$1(A1<Float> a12) {
        return a12.getValue().floatValue();
    }

    private final float toAnimTargetValue(InputPhase inputPhase) {
        int i11 = WhenMappings.$EnumSwitchMapping$0[inputPhase.ordinal()];
        if (i11 == 1) {
            return 1.0f;
        }
        if (i11 == 2) {
            return 0.0f;
        }
        if (i11 == 3) {
            return 1.0f;
        }
        throw new o();
    }

    public final void Transition(@NotNull InputPhase inputState, @NotNull InterfaceC6511n<? super Float, ? super InterfaceC3967k, ? super Integer, Unit> content, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        Intrinsics.checkNotNullParameter(inputState, "inputState");
        Intrinsics.checkNotNullParameter(content, "content");
        C3969l u11 = interfaceC3967k.u(-914828643);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(inputState) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.F(content) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.n(this) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i12 & 147) == 146 && u11.b()) {
            u11.j();
        } else {
            D0 g10 = H0.g(inputState, "TextFieldInputState", u11, (i12 & 14) | 48);
            TextFieldTransitionScope$Transition$labelProgress$2 textFieldTransitionScope$Transition$labelProgress$2 = TextFieldTransitionScope$Transition$labelProgress$2.INSTANCE;
            U0 b11 = W0.b();
            InputPhase inputPhase = (InputPhase) g10.h();
            u11.o(384435083);
            TextFieldTransitionScope textFieldTransitionScope = INSTANCE;
            float animTargetValue = textFieldTransitionScope.toAnimTargetValue(inputPhase);
            u11.k();
            Float valueOf = Float.valueOf(animTargetValue);
            InputPhase inputPhase2 = (InputPhase) g10.n();
            u11.o(384435083);
            float animTargetValue2 = textFieldTransitionScope.toAnimTargetValue(inputPhase2);
            u11.k();
            content.invoke(Float.valueOf(((Boolean) u11.m(C5239d1.a())).booleanValue() ? toAnimTargetValue(inputState) : Transition$lambda$1(H0.d(g10, valueOf, Float.valueOf(animTargetValue2), textFieldTransitionScope$Transition$labelProgress$2.invoke((TextFieldTransitionScope$Transition$labelProgress$2) g10.m(), (D0.b) u11, (C3969l) 0), b11, u11, 196608))), u11, Integer.valueOf(i12 & 112));
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new TextFieldTransitionScope$Transition$1(this, inputState, content, i11));
        }
    }
}

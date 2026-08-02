package ru.ozon.app.android.monetization.widgets.matchShoppingCards.presentation.components;

import B1.V;
import D1.InterfaceC2801g;
import Ep.a;
import Fr.g;
import Ra.h;
import S0.A0;
import S0.A1;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.J0;
import Sc.o;
import T7.E;
import Z1.d;
import Z1.j;
import androidx.compose.foundation.i;
import androidx.compose.foundation.layout.C5182e;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.C5236c1;
import androidx.compose.ui.platform.K0;
import androidx.compose.ui.platform.Q1;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import fd.InterfaceC6512o;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import k1.C7459e;
import k1.C7464j;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l1.AbstractC7799Q;
import l1.C7807Z;
import m0.C7990g;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.monetization.widgets.matchShoppingCards.presentation.AnimationSpecs;
import ru.ozon.app.android.monetization.widgets.matchShoppingCards.presentation.MatchShoppingCardsVI;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.core.compose.tokens.TokenParserKt;
import ru.ozon.uni.core.models.GradientDirection;
import t0.p;
import t0.q;
import t0.u;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a7\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002H\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a7\u0010\u000f\u001a\u00020\t*\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0018\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\t0\fH\u0003¢\u0006\u0004\b\u000f\u0010\u0010\u001a;\u0010\u0018\u001a\u00020\t*\u00020\t2\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0003¢\u0006\u0004\b\u0016\u0010\u0017\"\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b\"\u0014\u0010\u001c\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006!²\u0006\f\u0010\u001f\u001a\u00020\u001e8\nX\u008a\u0084\u0002²\u0006\f\u0010 \u001a\u00020\u00038\nX\u008a\u0084\u0002"}, d2 = {"Lru/ozon/app/android/monetization/widgets/matchShoppingCards/presentation/MatchShoppingCardsVI$ReactionButton;", "state", "Lkotlin/Function0;", "", "preferredPressedStrokeAlpha", "", "onClick", "ReactionButton", "(Lru/ozon/app/android/monetization/widgets/matchShoppingCards/presentation/MatchShoppingCardsVI$ReactionButton;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;LS0/k;II)V", "Landroidx/compose/ui/e;", "Lru/ozon/app/android/monetization/widgets/matchShoppingCards/presentation/MatchShoppingCardsVI$Gradient;", "gradient", "Lkotlin/Function2;", "Ll1/Q;", "block", "withGradientBrush", "(Landroidx/compose/ui/e;Lru/ozon/app/android/monetization/widgets/matchShoppingCards/presentation/MatchShoppingCardsVI$Gradient;Lfd/o;LS0/k;I)Landroidx/compose/ui/e;", "brush", "LZ1/h;", "width", "cornerRadius", "alpha", "borderInside-vz2T9sI", "(Landroidx/compose/ui/e;Ll1/Q;FFLkotlin/jvm/functions/Function0;LS0/k;II)Landroidx/compose/ui/e;", "borderInside", "LZ1/j;", "BUTTON_SIZE", "J", "BUTTON_CORNER_RADIUS", "F", "", "isPressed", "animatedPressedStrokeAlpha", "monetization_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ReactionButtonKt {
    private static final long BUTTON_SIZE = h.d(132, 68);
    private static final float BUTTON_CORNER_RADIUS = 24;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GradientDirection.values().length];
            try {
                iArr[GradientDirection.LEFT_RIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GradientDirection.RIGHT_LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[GradientDirection.TOP_BOTTOM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[GradientDirection.BOTTOM_TOP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[GradientDirection.TL_BR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[GradientDirection.TR_BL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[GradientDirection.BL_TR.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[GradientDirection.BR_TL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ReactionButton(@NotNull MatchShoppingCardsVI.ReactionButton state, Function0<Float> function0, Function0<Unit> function02, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        Function0<Float> function03;
        int i14;
        Function0<Unit> function04;
        Function0<Float> function05;
        Function0<Unit> function06;
        Object C11;
        String automatizationId;
        int I11;
        Function0<Float> function07;
        Function0<Unit> function08;
        J0 m02;
        Intrinsics.checkNotNullParameter(state, "state");
        C3969l u11 = interfaceC3967k.u(-1915196482);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.n(state) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i15 = i12 & 2;
        if (i15 != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            function03 = function0;
            i13 |= u11.F(function03) ? 32 : 16;
            i14 = i12 & 4;
            if (i14 == 0) {
                i13 |= 384;
            } else if ((i11 & 384) == 0) {
                function04 = function02;
                i13 |= u11.F(function04) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
                if ((i13 & 147) == 146 || !u11.b()) {
                    if (i15 != 0) {
                        u11.o(1736700734);
                        Object C12 = u11.C();
                        if (C12 == InterfaceC3967k.a.a()) {
                            C12 = ReactionButtonKt$ReactionButton$1$1.INSTANCE;
                            u11.x(C12);
                        }
                        function05 = (Function0) C12;
                        u11.k();
                    } else {
                        function05 = function03;
                    }
                    if (i14 != 0) {
                        u11.o(1736701818);
                        Object C13 = u11.C();
                        if (C13 == InterfaceC3967k.a.a()) {
                            C13 = ReactionButtonKt$ReactionButton$2$1.INSTANCE;
                            u11.x(C13);
                        }
                        function06 = (Function0) C13;
                        u11.k();
                    } else {
                        function06 = function04;
                    }
                    u11.o(1736703007);
                    C11 = u11.C();
                    if (C11 == InterfaceC3967k.a.a()) {
                        C11 = p.a();
                        u11.x(C11);
                    }
                    q qVar = (q) C11;
                    u11.k();
                    A1 b11 = C7990g.b(ReactionButton$lambda$3(u.a(qVar, u11, 6)) ? 1.0f : 0.0f, AnimationSpecs.INSTANCE.getReactionButtonPress(), null, u11, 48, 28);
                    e.a aVar = e.f40358c0;
                    long j11 = BUTTON_SIZE;
                    int i16 = a0.f39446j;
                    Function0<Unit> function09 = function06;
                    e withGradientBrush = withGradientBrush(withGradientBrush(withGradientBrush(i.b(a0.k(aVar, j.c(j11), j.b(j11)), qVar, null, false, null, null, function09, 28), state.getBackground(), ReactionButtonKt$ReactionButton$3.INSTANCE, u11, 0), state.getDefaultStroke(), ReactionButtonKt$ReactionButton$4.INSTANCE, u11, 0), state.getPressedStroke(), new ReactionButtonKt$ReactionButton$5(b11, function05), u11, 0);
                    TestInfo testInfo = state.getTestInfo();
                    automatizationId = testInfo != null ? testInfo.getAutomatizationId() : null;
                    if (automatizationId == null) {
                        automatizationId = "";
                    }
                    e a11 = Q1.a(withGradientBrush, automatizationId);
                    V f7 = C5185h.f(InterfaceC6250b.a.e(), false);
                    I11 = u11.I();
                    A0 d11 = u11.d();
                    e f11 = c.f(u11, a11);
                    Function0 a12 = g.a(InterfaceC2801g.f5440U, u11);
                    if (u11.t()) {
                        u11.H(a12);
                    } else {
                        u11.e();
                    }
                    Function2 f12 = E.f(u11, f7, u11, d11);
                    if (!u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                        a.d(I11, u11, I11, f12);
                    }
                    F1.b(u11, f11, InterfaceC2801g.a.f());
                    Ag0.e.a(state.getIconUrl(), C5182e.a(a0.c(aVar), 1.0f, false), null, null, null, 0.0f, null, u11, 3120, 244);
                    u11.f();
                    function07 = function05;
                    function08 = function09;
                } else {
                    u11.j();
                    function07 = function03;
                    function08 = function04;
                }
                m02 = u11.m0();
                if (m02 != null) {
                    m02.G(new ReactionButtonKt$ReactionButton$7(state, function07, function08, i11, i12));
                    return;
                }
                return;
            }
            function04 = function02;
            if ((i13 & 147) == 146) {
            }
            if (i15 != 0) {
            }
            if (i14 != 0) {
            }
            u11.o(1736703007);
            C11 = u11.C();
            if (C11 == InterfaceC3967k.a.a()) {
            }
            q qVar2 = (q) C11;
            u11.k();
            A1 b112 = C7990g.b(ReactionButton$lambda$3(u.a(qVar2, u11, 6)) ? 1.0f : 0.0f, AnimationSpecs.INSTANCE.getReactionButtonPress(), null, u11, 48, 28);
            e.a aVar2 = e.f40358c0;
            long j112 = BUTTON_SIZE;
            int i162 = a0.f39446j;
            Function0<Unit> function092 = function06;
            e withGradientBrush2 = withGradientBrush(withGradientBrush(withGradientBrush(i.b(a0.k(aVar2, j.c(j112), j.b(j112)), qVar2, null, false, null, null, function092, 28), state.getBackground(), ReactionButtonKt$ReactionButton$3.INSTANCE, u11, 0), state.getDefaultStroke(), ReactionButtonKt$ReactionButton$4.INSTANCE, u11, 0), state.getPressedStroke(), new ReactionButtonKt$ReactionButton$5(b112, function05), u11, 0);
            TestInfo testInfo2 = state.getTestInfo();
            if (testInfo2 != null) {
            }
            if (automatizationId == null) {
            }
            e a112 = Q1.a(withGradientBrush2, automatizationId);
            V f72 = C5185h.f(InterfaceC6250b.a.e(), false);
            I11 = u11.I();
            A0 d112 = u11.d();
            e f112 = c.f(u11, a112);
            Function0 a122 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
            }
            Function2 f122 = E.f(u11, f72, u11, d112);
            if (!u11.t()) {
            }
            a.d(I11, u11, I11, f122);
            F1.b(u11, f112, InterfaceC2801g.a.f());
            Ag0.e.a(state.getIconUrl(), C5182e.a(a0.c(aVar2), 1.0f, false), null, null, null, 0.0f, null, u11, 3120, 244);
            u11.f();
            function07 = function05;
            function08 = function092;
            m02 = u11.m0();
            if (m02 != null) {
            }
        }
        function03 = function0;
        i14 = i12 & 4;
        if (i14 == 0) {
        }
        function04 = function02;
        if ((i13 & 147) == 146) {
        }
        if (i15 != 0) {
        }
        if (i14 != 0) {
        }
        u11.o(1736703007);
        C11 = u11.C();
        if (C11 == InterfaceC3967k.a.a()) {
        }
        q qVar22 = (q) C11;
        u11.k();
        A1 b1122 = C7990g.b(ReactionButton$lambda$3(u.a(qVar22, u11, 6)) ? 1.0f : 0.0f, AnimationSpecs.INSTANCE.getReactionButtonPress(), null, u11, 48, 28);
        e.a aVar22 = e.f40358c0;
        long j1122 = BUTTON_SIZE;
        int i1622 = a0.f39446j;
        Function0<Unit> function0922 = function06;
        e withGradientBrush22 = withGradientBrush(withGradientBrush(withGradientBrush(i.b(a0.k(aVar22, j.c(j1122), j.b(j1122)), qVar22, null, false, null, null, function0922, 28), state.getBackground(), ReactionButtonKt$ReactionButton$3.INSTANCE, u11, 0), state.getDefaultStroke(), ReactionButtonKt$ReactionButton$4.INSTANCE, u11, 0), state.getPressedStroke(), new ReactionButtonKt$ReactionButton$5(b1122, function05), u11, 0);
        TestInfo testInfo22 = state.getTestInfo();
        if (testInfo22 != null) {
        }
        if (automatizationId == null) {
        }
        e a1122 = Q1.a(withGradientBrush22, automatizationId);
        V f722 = C5185h.f(InterfaceC6250b.a.e(), false);
        I11 = u11.I();
        A0 d1122 = u11.d();
        e f1122 = c.f(u11, a1122);
        Function0 a1222 = g.a(InterfaceC2801g.f5440U, u11);
        if (u11.t()) {
        }
        Function2 f1222 = E.f(u11, f722, u11, d1122);
        if (!u11.t()) {
        }
        a.d(I11, u11, I11, f1222);
        F1.b(u11, f1122, InterfaceC2801g.a.f());
        Ag0.e.a(state.getIconUrl(), C5182e.a(a0.c(aVar22), 1.0f, false), null, null, null, 0.0f, null, u11, 3120, 244);
        u11.f();
        function07 = function05;
        function08 = function0922;
        m02 = u11.m0();
        if (m02 != null) {
        }
    }

    private static final boolean ReactionButton$lambda$3(A1<Boolean> a12) {
        return a12.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float ReactionButton$lambda$4(A1<Float> a12) {
        return a12.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: borderInside-vz2T9sI, reason: not valid java name */
    public static final e m816borderInsidevz2T9sI(e eVar, AbstractC7799Q abstractC7799Q, float f7, float f11, Function0<Float> function0, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        e b11;
        interfaceC3967k.o(1136119368);
        if ((i12 & 8) != 0) {
            interfaceC3967k.o(-1153977877);
            Object C11 = interfaceC3967k.C();
            if (C11 == InterfaceC3967k.a.a()) {
                C11 = ReactionButtonKt$borderInside$1$1.INSTANCE;
                interfaceC3967k.x(C11);
            }
            function0 = (Function0) C11;
            interfaceC3967k.k();
        }
        b11 = c.b(eVar, C5236c1.a(), new ReactionButtonKt$borderInside$2(f7, f11, function0, abstractC7799Q));
        interfaceC3967k.k();
        return b11;
    }

    private static final e withGradientBrush(e eVar, MatchShoppingCardsVI.Gradient gradient, InterfaceC6512o<? super e, ? super AbstractC7799Q, ? super InterfaceC3967k, ? super Integer, ? extends e> interfaceC6512o, InterfaceC3967k interfaceC3967k, int i11) {
        Pair pair;
        interfaceC3967k.o(-527764169);
        if (gradient == null) {
            interfaceC3967k.k();
            return eVar;
        }
        long D02 = ((d) interfaceC3967k.m(K0.e())).D0(BUTTON_SIZE);
        List<MatchShoppingCardsVI.Gradient.Stop> stops = gradient.getStops();
        ArrayList arrayList = new ArrayList();
        for (MatchShoppingCardsVI.Gradient.Stop stop : stops) {
            Float valueOf = Float.valueOf(stop.getPosition());
            C7807Z c7807z = TokenParserKt.tokenToColor(stop.getColor(), interfaceC3967k, 0);
            Pair pair2 = c7807z != null ? new Pair(valueOf, C7807Z.m(c7807z.w())) : null;
            if (pair2 != null) {
                arrayList.add(pair2);
            }
        }
        Pair[] pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
        switch (WhenMappings.$EnumSwitchMapping$0[gradient.getDirection().ordinal()]) {
            case 1:
                pair = new Pair(C7459e.a(P9.a.a(0.0f, 0.0f)), C7459e.a(P9.a.a(C7464j.f(D02), 0.0f)));
                break;
            case 2:
                pair = new Pair(C7459e.a(P9.a.a(C7464j.f(D02), 0.0f)), C7459e.a(P9.a.a(0.0f, 0.0f)));
                break;
            case 3:
                pair = new Pair(C7459e.a(P9.a.a(0.0f, 0.0f)), C7459e.a(P9.a.a(0.0f, C7464j.d(D02))));
                break;
            case 4:
                pair = new Pair(C7459e.a(P9.a.a(0.0f, C7464j.d(D02))), C7459e.a(P9.a.a(0.0f, 0.0f)));
                break;
            case 5:
                pair = new Pair(C7459e.a(P9.a.a(0.0f, 0.0f)), C7459e.a(P9.a.a(C7464j.f(D02), C7464j.d(D02))));
                break;
            case 6:
                pair = new Pair(C7459e.a(P9.a.a(C7464j.f(D02), 0.0f)), C7459e.a(P9.a.a(0.0f, C7464j.d(D02))));
                break;
            case 7:
                pair = new Pair(C7459e.a(P9.a.a(0.0f, C7464j.d(D02))), C7459e.a(P9.a.a(C7464j.f(D02), 0.0f)));
                break;
            case 8:
                pair = new Pair(C7459e.a(P9.a.a(C7464j.f(D02), C7464j.d(D02))), C7459e.a(P9.a.a(0.0f, 0.0f)));
                break;
            default:
                throw new o();
        }
        long n11 = ((C7459e) pair.a()).n();
        long n12 = ((C7459e) pair.b()).n();
        interfaceC3967k.o(1717486030);
        boolean n13 = interfaceC3967k.n(pairArr) | interfaceC3967k.s(n11) | interfaceC3967k.s(n12);
        Object C11 = interfaceC3967k.C();
        if (n13 || C11 == InterfaceC3967k.a.a()) {
            C11 = AbstractC7799Q.a.e(AbstractC7799Q.Companion, (Pair[]) Arrays.copyOf(pairArr, pairArr.length), n11, n12, 8);
            interfaceC3967k.x(C11);
        }
        interfaceC3967k.k();
        e invoke = interfaceC6512o.invoke(eVar, (AbstractC7799Q) C11, interfaceC3967k, Integer.valueOf(i11 & 910));
        interfaceC3967k.k();
        return invoke;
    }
}

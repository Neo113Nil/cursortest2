package com.vk.id.onetap.compose.onetap;

import S0.C3996z;
import S0.D;
import S0.D1;
import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import S0.Q;
import S0.n1;
import a1.C4912a;
import androidx.compose.foundation.layout.C5191n;
import com.vk.id.AccessToken;
import com.vk.id.VKIDAuthFail;
import com.vk.id.VKIDUser;
import com.vk.id.auth.AuthCodeData;
import com.vk.id.auth.Prompt;
import com.vk.id.auth.VKIDAuthParams;
import com.vk.id.auth.VKIDAuthUiParams;
import com.vk.id.multibranding.internal.MultibrandingAnalyticsContext;
import com.vk.id.multibranding.internal.MultibrandingAnalyticsContextKt;
import com.vk.id.onetap.common.OneTapOAuth;
import com.vk.id.onetap.common.OneTapStyle;
import com.vk.id.onetap.common.auth.style.InternalVKIDButtonStyle;
import com.vk.id.onetap.compose.button.CommonKt;
import com.vk.id.onetap.compose.button.auth.VKIDButtonSmallKt;
import com.vk.id.onetap.compose.util.MeasureUnconstrainedViewWidthKt;
import fd.InterfaceC6511n;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import u0.InterfaceC9894c;
import xe.M;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
final class OneTapKt$OneTap$16 implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ VKIDAuthUiParams $authParams;
    final /* synthetic */ boolean $fastAuthEnabled;
    final /* synthetic */ androidx.compose.ui.e $modifier;
    final /* synthetic */ Set<OneTapOAuth> $oAuths;
    final /* synthetic */ Function2<OneTapOAuth, AccessToken, Unit> $onAuth;
    final /* synthetic */ Function2<AuthCodeData, Boolean, Unit> $onAuthCode;
    final /* synthetic */ Function2<OneTapOAuth, VKIDAuthFail, Unit> $onFail;
    final /* synthetic */ Function1<kotlin.coroutines.d<? super VKIDAuthUiParams>, Object> $onGetParams;
    final /* synthetic */ OneTapTitleScenario $scenario;
    final /* synthetic */ boolean $signInAnotherAccountButtonEnabled;
    final /* synthetic */ OneTapStyle $style;

    /* JADX WARN: Multi-variable type inference failed */
    OneTapKt$OneTap$16(boolean z11, OneTapStyle oneTapStyle, androidx.compose.ui.e eVar, OneTapTitleScenario oneTapTitleScenario, Function2<? super OneTapOAuth, ? super AccessToken, Unit> function2, Function2<? super AuthCodeData, ? super Boolean, Unit> function22, Function2<? super OneTapOAuth, ? super VKIDAuthFail, Unit> function23, VKIDAuthUiParams vKIDAuthUiParams, Function1<? super kotlin.coroutines.d<? super VKIDAuthUiParams>, ? extends Object> function1, Set<? extends OneTapOAuth> set, boolean z12) {
        this.$fastAuthEnabled = z11;
        this.$style = oneTapStyle;
        this.$modifier = eVar;
        this.$scenario = oneTapTitleScenario;
        this.$onAuth = function2;
        this.$onAuthCode = function22;
        this.$onFail = function23;
        this.$authParams = vKIDAuthUiParams;
        this.$onGetParams = function1;
        this.$oAuths = set;
        this.$signInAnotherAccountButtonEnabled = z12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$IconOneTap(OneTapTitleScenario oneTapTitleScenario, OneTapStyle oneTapStyle, final M m11, final Function2<? super OneTapOAuth, ? super AccessToken, Unit> function2, final Function2<? super AuthCodeData, ? super Boolean, Unit> function22, final Function2<? super OneTapOAuth, ? super VKIDAuthFail, Unit> function23, final VKIDAuthUiParams vKIDAuthUiParams, final boolean z11, final Function1<? super kotlin.coroutines.d<? super VKIDAuthUiParams>, ? extends Object> function1, final InterfaceC3978p0<VKIDUser> interfaceC3978p0, InterfaceC3967k interfaceC3967k, int i11) {
        interfaceC3967k.o(-2118777298);
        OneTapAnalytics.INSTANCE.OneTapIconShown$onetap_compose_release(oneTapTitleScenario, oneTapStyle, interfaceC3967k, 384);
        InternalVKIDButtonStyle vkidButtonStyle = oneTapStyle.getVkidButtonStyle();
        interfaceC3967k.o(-1072716674);
        boolean F11 = interfaceC3967k.F(m11) | interfaceC3967k.n(function2) | interfaceC3967k.n(function22) | interfaceC3967k.n(function23) | interfaceC3967k.F(vKIDAuthUiParams) | interfaceC3967k.p(z11) | interfaceC3967k.F(function1);
        Object C11 = interfaceC3967k.C();
        if (F11 || C11 == InterfaceC3967k.a.a()) {
            Function0 function0 = new Function0() { // from class: com.vk.id.onetap.compose.onetap.a
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$IconOneTap$lambda$9$lambda$8;
                    invoke$IconOneTap$lambda$9$lambda$8 = OneTapKt$OneTap$16.invoke$IconOneTap$lambda$9$lambda$8(M.this, function22, vKIDAuthUiParams, function1, interfaceC3978p0, function2, function23, z11);
                    return invoke$IconOneTap$lambda$9$lambda$8;
                }
            };
            interfaceC3967k.x(function0);
            C11 = function0;
        }
        Function0 function02 = (Function0) C11;
        interfaceC3967k.k();
        interfaceC3967k.o(-1072680519);
        Object C12 = interfaceC3967k.C();
        if (C12 == InterfaceC3967k.a.a()) {
            C12 = new Function1() { // from class: com.vk.id.onetap.compose.onetap.b
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invoke$IconOneTap$lambda$11$lambda$10;
                    invoke$IconOneTap$lambda$11$lambda$10 = OneTapKt$OneTap$16.invoke$IconOneTap$lambda$11$lambda$10(InterfaceC3978p0.this, (VKIDUser) obj);
                    return invoke$IconOneTap$lambda$11$lambda$10;
                }
            };
            interfaceC3967k.x(C12);
        }
        interfaceC3967k.k();
        VKIDButtonSmallKt.VKIDButtonSmall(null, vkidButtonStyle, function02, (Function1) C12, z11, interfaceC3967k, 3072, 1);
        interfaceC3967k.k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$IconOneTap$lambda$11$lambda$10(InterfaceC3978p0 interfaceC3978p0, VKIDUser vKIDUser) {
        interfaceC3978p0.setValue(vKIDUser);
        if (invoke$lambda$1(interfaceC3978p0) == null) {
            OneTapAnalytics oneTapAnalytics = OneTapAnalytics.INSTANCE;
            oneTapAnalytics.sessionNotFound$onetap_compose_release();
            oneTapAnalytics.userNotFoundIcon$onetap_compose_release();
        } else {
            OneTapAnalytics.INSTANCE.userWasFoundIcon$onetap_compose_release();
        }
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$IconOneTap$lambda$9$lambda$8(M m11, Function2 function2, VKIDAuthUiParams vKIDAuthUiParams, Function1 function1, final InterfaceC3978p0 interfaceC3978p0, final Function2 function22, final Function2 function23, final boolean z11) {
        final Map<String, String> oneTapPressedIcon$onetap_compose_release = OneTapAnalytics.INSTANCE.oneTapPressedIcon$onetap_compose_release(invoke$lambda$1(interfaceC3978p0));
        CommonKt.startAuth(m11, new Function1() { // from class: com.vk.id.onetap.compose.onetap.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit invoke$IconOneTap$lambda$9$lambda$8$lambda$5;
                invoke$IconOneTap$lambda$9$lambda$8$lambda$5 = OneTapKt$OneTap$16.invoke$IconOneTap$lambda$9$lambda$8$lambda$5(Function2.this, (AccessToken) obj);
                return invoke$IconOneTap$lambda$9$lambda$8$lambda$5;
            }
        }, function2, new Function1() { // from class: com.vk.id.onetap.compose.onetap.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit invoke$IconOneTap$lambda$9$lambda$8$lambda$6;
                invoke$IconOneTap$lambda$9$lambda$8$lambda$6 = OneTapKt$OneTap$16.invoke$IconOneTap$lambda$9$lambda$8$lambda$6(oneTapPressedIcon$onetap_compose_release, function23, (VKIDAuthFail) obj);
                return invoke$IconOneTap$lambda$9$lambda$8$lambda$6;
            }
        }, vKIDAuthUiParams.asParamsBuilder(new Function1() { // from class: com.vk.id.onetap.compose.onetap.e
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit invoke$IconOneTap$lambda$9$lambda$8$lambda$7;
                invoke$IconOneTap$lambda$9$lambda$8$lambda$7 = OneTapKt$OneTap$16.invoke$IconOneTap$lambda$9$lambda$8$lambda$7(oneTapPressedIcon$onetap_compose_release, z11, interfaceC3978p0, (VKIDAuthParams.Builder) obj);
                return invoke$IconOneTap$lambda$9$lambda$8$lambda$7;
            }
        }), function1);
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$IconOneTap$lambda$9$lambda$8$lambda$5(Function2 function2, AccessToken it) {
        Intrinsics.checkNotNullParameter(it, "it");
        function2.invoke(null, it);
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$IconOneTap$lambda$9$lambda$8$lambda$6(Map map, Function2 function2, VKIDAuthFail it) {
        Intrinsics.checkNotNullParameter(it, "it");
        OneTapAnalytics oneTapAnalytics = OneTapAnalytics.INSTANCE;
        oneTapAnalytics.authErrorIcon$onetap_compose_release(oneTapAnalytics.uuidFromParams$onetap_compose_release(map));
        function2.invoke(null, it);
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$IconOneTap$lambda$9$lambda$8$lambda$7(Map map, boolean z11, InterfaceC3978p0 interfaceC3978p0, VKIDAuthParams.Builder asParamsBuilder) {
        Intrinsics.checkNotNullParameter(asParamsBuilder, "$this$asParamsBuilder");
        asParamsBuilder.setExtraParams(map);
        if (!z11) {
            asParamsBuilder.setUseOAuthProviderIfPossible(false);
            asParamsBuilder.setPrompt(Prompt.LOGIN);
        } else if (invoke$lambda$1(interfaceC3978p0) == null) {
            asParamsBuilder.setPrompt(Prompt.CONSENT);
        }
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$LargeOneTap(OneTapTitleScenario oneTapTitleScenario, OneTapStyle oneTapStyle, Set<? extends OneTapOAuth> set, boolean z11, M m11, Function2<? super OneTapOAuth, ? super AccessToken, Unit> function2, Function2<? super AuthCodeData, ? super Boolean, Unit> function22, Function2<? super OneTapOAuth, ? super VKIDAuthFail, Unit> function23, VKIDAuthUiParams vKIDAuthUiParams, boolean z12, Function1<? super kotlin.coroutines.d<? super VKIDAuthUiParams>, ? extends Object> function1, InterfaceC3978p0<VKIDUser> interfaceC3978p0, boolean z13, boolean z14, InterfaceC3967k interfaceC3967k, int i11) {
        interfaceC3967k.o(1750795056);
        interfaceC3967k.o(803501096);
        if (!z13) {
            OneTapAnalytics.INSTANCE.OneTapShown$onetap_compose_release(false, oneTapTitleScenario, oneTapStyle, interfaceC3967k, 3072, 1);
        }
        interfaceC3967k.k();
        C3996z.a(MultibrandingAnalyticsContextKt.getLocalMultibrandingAnalyticsContext().c(new MultibrandingAnalyticsContext("nowhere", z13)), a1.c.c(-215873552, new OneTapKt$OneTap$16$LargeOneTap$1(oneTapStyle, set, z11, m11, function2, function22, function23, vKIDAuthUiParams, z12, function1, z13, z14, oneTapTitleScenario, interfaceC3978p0), interfaceC3967k), interfaceC3967k, 56);
        interfaceC3967k.k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VKIDUser invoke$lambda$1(InterfaceC3978p0<VKIDUser> interfaceC3978p0) {
        return interfaceC3978p0.getValue();
    }

    private static final boolean invoke$lambda$4(InterfaceC3978p0<Boolean> interfaceC3978p0) {
        return interfaceC3978p0.getValue().booleanValue();
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        if ((i11 & 3) == 2 && interfaceC3967k.b()) {
            interfaceC3967k.j();
            return;
        }
        Object C11 = interfaceC3967k.C();
        if (C11 == InterfaceC3967k.a.a()) {
            D d11 = new D(Q.j(kotlin.coroutines.g.f71771a, interfaceC3967k));
            interfaceC3967k.x(d11);
            C11 = d11;
        }
        final M a11 = ((D) C11).a();
        interfaceC3967k.o(-1074945133);
        Object C12 = interfaceC3967k.C();
        if (C12 == InterfaceC3967k.a.a()) {
            C12 = n1.f(null, D1.f25195a);
            interfaceC3967k.x(C12);
        }
        final InterfaceC3978p0 interfaceC3978p0 = (InterfaceC3978p0) C12;
        interfaceC3967k.k();
        interfaceC3967k.o(-1074942541);
        boolean z11 = this.$fastAuthEnabled;
        Object C13 = interfaceC3967k.C();
        if (C13 == InterfaceC3967k.a.a()) {
            C13 = n1.f(Boolean.valueOf(z11), D1.f25195a);
            interfaceC3967k.x(C13);
        }
        interfaceC3967k.k();
        if (invoke$lambda$4((InterfaceC3978p0) C13) != this.$fastAuthEnabled) {
            throw new IllegalStateException("You can't change fastAuthEnabled in runtime");
        }
        if (this.$style instanceof OneTapStyle.Icon) {
            interfaceC3967k.o(1042349335);
            invoke$IconOneTap(this.$scenario, this.$style, a11, this.$onAuth, this.$onAuthCode, this.$onFail, this.$authParams, this.$fastAuthEnabled, this.$onGetParams, interfaceC3978p0, interfaceC3967k, 0);
            interfaceC3967k.k();
            return;
        }
        interfaceC3967k.o(1042420480);
        androidx.compose.ui.e eVar = this.$modifier;
        final OneTapTitleScenario oneTapTitleScenario = this.$scenario;
        final OneTapStyle oneTapStyle = this.$style;
        final Set<OneTapOAuth> set = this.$oAuths;
        final boolean z12 = this.$signInAnotherAccountButtonEnabled;
        final Function2<OneTapOAuth, AccessToken, Unit> function2 = this.$onAuth;
        final Function2<AuthCodeData, Boolean, Unit> function22 = this.$onAuthCode;
        final Function2<OneTapOAuth, VKIDAuthFail, Unit> function23 = this.$onFail;
        final VKIDAuthUiParams vKIDAuthUiParams = this.$authParams;
        final boolean z13 = this.$fastAuthEnabled;
        final Function1<kotlin.coroutines.d<? super VKIDAuthUiParams>, Object> function1 = this.$onGetParams;
        C5191n.a(eVar, null, a1.c.c(885953879, new InterfaceC6511n<InterfaceC9894c, InterfaceC3967k, Integer, Unit>() { // from class: com.vk.id.onetap.compose.onetap.OneTapKt$OneTap$16.1
            @Override // fd.InterfaceC6511n
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC9894c interfaceC9894c, InterfaceC3967k interfaceC3967k2, Integer num) {
                invoke(interfaceC9894c, interfaceC3967k2, num.intValue());
                return Unit.f71690a;
            }

            public final void invoke(final InterfaceC9894c BoxWithConstraints, InterfaceC3967k interfaceC3967k2, int i12) {
                int i13;
                Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
                if ((i12 & 6) == 0) {
                    i13 = i12 | (interfaceC3967k2.n(BoxWithConstraints) ? 4 : 2);
                } else {
                    i13 = i12;
                }
                if ((i13 & 19) == 18 && interfaceC3967k2.b()) {
                    interfaceC3967k2.j();
                    return;
                }
                final OneTapTitleScenario oneTapTitleScenario2 = OneTapTitleScenario.this;
                final OneTapStyle oneTapStyle2 = oneTapStyle;
                final Set<OneTapOAuth> set2 = set;
                final boolean z14 = z12;
                final M m11 = a11;
                final Function2<OneTapOAuth, AccessToken, Unit> function24 = function2;
                final Function2<AuthCodeData, Boolean, Unit> function25 = function22;
                final Function2<OneTapOAuth, VKIDAuthFail, Unit> function26 = function23;
                final VKIDAuthUiParams vKIDAuthUiParams2 = vKIDAuthUiParams;
                final boolean z15 = z13;
                final Function1<kotlin.coroutines.d<? super VKIDAuthUiParams>, Object> function12 = function1;
                final InterfaceC3978p0<VKIDUser> interfaceC3978p02 = interfaceC3978p0;
                C4912a c11 = a1.c.c(1420599904, new Function2<InterfaceC3967k, Integer, Unit>() { // from class: com.vk.id.onetap.compose.onetap.OneTapKt.OneTap.16.1.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k3, Integer num) {
                        invoke(interfaceC3967k3, num.intValue());
                        return Unit.f71690a;
                    }

                    public final void invoke(InterfaceC3967k interfaceC3967k3, int i14) {
                        if ((i14 & 3) == 2 && interfaceC3967k3.b()) {
                            interfaceC3967k3.j();
                        } else {
                            OneTapKt$OneTap$16.invoke$LargeOneTap(OneTapTitleScenario.this, oneTapStyle2, set2, z14, m11, function24, function25, function26, vKIDAuthUiParams2, z15, function12, interfaceC3978p02, true, true, interfaceC3967k3, 54);
                        }
                    }
                }, interfaceC3967k2);
                final OneTapTitleScenario oneTapTitleScenario3 = OneTapTitleScenario.this;
                final OneTapStyle oneTapStyle3 = oneTapStyle;
                final Set<OneTapOAuth> set3 = set;
                final boolean z16 = z12;
                final M m12 = a11;
                final Function2<OneTapOAuth, AccessToken, Unit> function27 = function2;
                final Function2<AuthCodeData, Boolean, Unit> function28 = function22;
                final Function2<OneTapOAuth, VKIDAuthFail, Unit> function29 = function23;
                final VKIDAuthUiParams vKIDAuthUiParams3 = vKIDAuthUiParams;
                final boolean z17 = z13;
                final Function1<kotlin.coroutines.d<? super VKIDAuthUiParams>, Object> function13 = function1;
                final InterfaceC3978p0<VKIDUser> interfaceC3978p03 = interfaceC3978p0;
                MeasureUnconstrainedViewWidthKt.MeasureUnconstrainedViewWidth(c11, a1.c.c(2081168885, new InterfaceC6511n<Z1.h, InterfaceC3967k, Integer, Unit>() { // from class: com.vk.id.onetap.compose.onetap.OneTapKt.OneTap.16.1.2
                    @Override // fd.InterfaceC6511n
                    public /* bridge */ /* synthetic */ Unit invoke(Z1.h hVar, InterfaceC3967k interfaceC3967k3, Integer num) {
                        m54invoke8Feqmps(hVar.d(), interfaceC3967k3, num.intValue());
                        return Unit.f71690a;
                    }

                    /* renamed from: invoke-8Feqmps, reason: not valid java name */
                    public final void m54invoke8Feqmps(float f7, InterfaceC3967k interfaceC3967k3, int i14) {
                        int i15;
                        if ((i14 & 6) == 0) {
                            i15 = i14 | (interfaceC3967k3.q(f7) ? 4 : 2);
                        } else {
                            i15 = i14;
                        }
                        if ((i15 & 19) == 18 && interfaceC3967k3.b()) {
                            interfaceC3967k3.j();
                            return;
                        }
                        if (Float.compare(f7, InterfaceC9894c.this.d()) <= 0) {
                            interfaceC3967k3.o(-338972779);
                            OneTapKt$OneTap$16.invoke$LargeOneTap(oneTapTitleScenario3, oneTapStyle3, set3, z16, m12, function27, function28, function29, vKIDAuthUiParams3, z17, function13, interfaceC3978p03, false, true, interfaceC3967k3, 54);
                            interfaceC3967k3.k();
                            return;
                        }
                        interfaceC3967k3.o(-338850856);
                        final OneTapTitleScenario oneTapTitleScenario4 = oneTapTitleScenario3;
                        final OneTapStyle oneTapStyle4 = oneTapStyle3;
                        final Set<OneTapOAuth> set4 = set3;
                        final boolean z18 = z16;
                        final M m13 = m12;
                        final Function2<OneTapOAuth, AccessToken, Unit> function210 = function27;
                        final Function2<AuthCodeData, Boolean, Unit> function211 = function28;
                        final Function2<OneTapOAuth, VKIDAuthFail, Unit> function212 = function29;
                        final VKIDAuthUiParams vKIDAuthUiParams4 = vKIDAuthUiParams3;
                        final boolean z19 = z17;
                        final Function1<kotlin.coroutines.d<? super VKIDAuthUiParams>, Object> function14 = function13;
                        final InterfaceC3978p0<VKIDUser> interfaceC3978p04 = interfaceC3978p03;
                        C4912a c12 = a1.c.c(-1485744208, new Function2<InterfaceC3967k, Integer, Unit>() { // from class: com.vk.id.onetap.compose.onetap.OneTapKt.OneTap.16.1.2.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k4, Integer num) {
                                invoke(interfaceC3967k4, num.intValue());
                                return Unit.f71690a;
                            }

                            public final void invoke(InterfaceC3967k interfaceC3967k4, int i16) {
                                if ((i16 & 3) == 2 && interfaceC3967k4.b()) {
                                    interfaceC3967k4.j();
                                } else {
                                    OneTapKt$OneTap$16.invoke$LargeOneTap(OneTapTitleScenario.this, oneTapStyle4, set4, z18, m13, function210, function211, function212, vKIDAuthUiParams4, z19, function14, interfaceC3978p04, true, false, interfaceC3967k4, 54);
                                }
                            }
                        }, interfaceC3967k3);
                        final InterfaceC9894c interfaceC9894c = InterfaceC9894c.this;
                        final OneTapTitleScenario oneTapTitleScenario5 = oneTapTitleScenario3;
                        final OneTapStyle oneTapStyle5 = oneTapStyle3;
                        final Set<OneTapOAuth> set5 = set3;
                        final boolean z21 = z16;
                        final M m14 = m12;
                        final Function2<OneTapOAuth, AccessToken, Unit> function213 = function27;
                        final Function2<AuthCodeData, Boolean, Unit> function214 = function28;
                        final Function2<OneTapOAuth, VKIDAuthFail, Unit> function215 = function29;
                        final VKIDAuthUiParams vKIDAuthUiParams5 = vKIDAuthUiParams3;
                        final boolean z22 = z17;
                        final Function1<kotlin.coroutines.d<? super VKIDAuthUiParams>, Object> function15 = function13;
                        final InterfaceC3978p0<VKIDUser> interfaceC3978p05 = interfaceC3978p03;
                        MeasureUnconstrainedViewWidthKt.MeasureUnconstrainedViewWidth(c12, a1.c.c(2120563643, new InterfaceC6511n<Z1.h, InterfaceC3967k, Integer, Unit>() { // from class: com.vk.id.onetap.compose.onetap.OneTapKt.OneTap.16.1.2.2
                            @Override // fd.InterfaceC6511n
                            public /* bridge */ /* synthetic */ Unit invoke(Z1.h hVar, InterfaceC3967k interfaceC3967k4, Integer num) {
                                m55invoke8Feqmps(hVar.d(), interfaceC3967k4, num.intValue());
                                return Unit.f71690a;
                            }

                            /* renamed from: invoke-8Feqmps, reason: not valid java name */
                            public final void m55invoke8Feqmps(float f11, InterfaceC3967k interfaceC3967k4, int i16) {
                                int i17;
                                if ((i16 & 6) == 0) {
                                    i17 = i16 | (interfaceC3967k4.q(f11) ? 4 : 2);
                                } else {
                                    i17 = i16;
                                }
                                if ((i17 & 19) == 18 && interfaceC3967k4.b()) {
                                    interfaceC3967k4.j();
                                    return;
                                }
                                if (Float.compare(f11, InterfaceC9894c.this.d()) <= 0) {
                                    interfaceC3967k4.o(98988037);
                                    OneTapKt$OneTap$16.invoke$LargeOneTap(oneTapTitleScenario5, oneTapStyle5, set5, z21, m14, function213, function214, function215, vKIDAuthUiParams5, z22, function15, interfaceC3978p05, false, false, interfaceC3967k4, 54);
                                    interfaceC3967k4.k();
                                } else {
                                    interfaceC3967k4.o(99112626);
                                    OneTapKt$OneTap$16.invoke$IconOneTap(oneTapTitleScenario5, oneTapStyle5, m14, function213, function214, function215, vKIDAuthUiParams5, z22, function15, interfaceC3978p05, interfaceC3967k4, 0);
                                    interfaceC3967k4.k();
                                }
                            }
                        }, interfaceC3967k3), interfaceC3967k3, 54);
                        interfaceC3967k3.k();
                    }
                }, interfaceC3967k2), interfaceC3967k2, 54);
            }
        }, interfaceC3967k), interfaceC3967k, 3072, 6);
        interfaceC3967k.k();
    }
}

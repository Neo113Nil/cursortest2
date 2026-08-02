package com.vk.id.onetap.compose.onetap;

import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import androidx.compose.ui.e;
import com.vk.id.AccessToken;
import com.vk.id.VKIDAuthFail;
import com.vk.id.VKIDUser;
import com.vk.id.auth.AuthCodeData;
import com.vk.id.auth.Prompt;
import com.vk.id.auth.VKIDAuthParams;
import com.vk.id.auth.VKIDAuthUiParams;
import com.vk.id.onetap.common.OneTapOAuth;
import com.vk.id.onetap.common.OneTapStyle;
import com.vk.id.onetap.compose.button.CommonKt;
import com.vk.id.onetap.compose.button.auth.VKIDButtonTextProvider;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import xe.M;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
final class OneTapKt$OneTap$16$LargeOneTap$1 implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ VKIDAuthUiParams $authParams;
    final /* synthetic */ M $coroutineScope;
    final /* synthetic */ boolean $fastAuthEnabled;
    final /* synthetic */ boolean $largeText;
    final /* synthetic */ boolean $measureInProgress;
    final /* synthetic */ Set<OneTapOAuth> $oAuths;
    final /* synthetic */ Function2<OneTapOAuth, AccessToken, Unit> $onAuth;
    final /* synthetic */ Function2<AuthCodeData, Boolean, Unit> $onAuthCode;
    final /* synthetic */ Function2<OneTapOAuth, VKIDAuthFail, Unit> $onFail;
    final /* synthetic */ Function1<kotlin.coroutines.d<? super VKIDAuthUiParams>, Object> $onGetParams;
    final /* synthetic */ OneTapTitleScenario $scenario;
    final /* synthetic */ boolean $signInAnotherAccountButtonEnabled;
    final /* synthetic */ OneTapStyle $style;
    final /* synthetic */ InterfaceC3978p0<VKIDUser> $user$delegate;

    /* JADX WARN: Multi-variable type inference failed */
    OneTapKt$OneTap$16$LargeOneTap$1(OneTapStyle oneTapStyle, Set<? extends OneTapOAuth> set, boolean z11, M m11, Function2<? super OneTapOAuth, ? super AccessToken, Unit> function2, Function2<? super AuthCodeData, ? super Boolean, Unit> function22, Function2<? super OneTapOAuth, ? super VKIDAuthFail, Unit> function23, VKIDAuthUiParams vKIDAuthUiParams, boolean z12, Function1<? super kotlin.coroutines.d<? super VKIDAuthUiParams>, ? extends Object> function1, boolean z13, boolean z14, OneTapTitleScenario oneTapTitleScenario, InterfaceC3978p0<VKIDUser> interfaceC3978p0) {
        this.$style = oneTapStyle;
        this.$oAuths = set;
        this.$signInAnotherAccountButtonEnabled = z11;
        this.$coroutineScope = m11;
        this.$onAuth = function2;
        this.$onAuthCode = function22;
        this.$onFail = function23;
        this.$authParams = vKIDAuthUiParams;
        this.$fastAuthEnabled = z12;
        this.$onGetParams = function1;
        this.$measureInProgress = z13;
        this.$largeText = z14;
        this.$scenario = oneTapTitleScenario;
        this.$user$delegate = interfaceC3978p0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$11$lambda$10(boolean z11, boolean z12, InterfaceC3978p0 interfaceC3978p0, VKIDUser vKIDUser) {
        VKIDUser invoke$lambda$1;
        if (!z11) {
            interfaceC3978p0.setValue(vKIDUser);
            invoke$lambda$1 = OneTapKt$OneTap$16.invoke$lambda$1(interfaceC3978p0);
            if (invoke$lambda$1 == null) {
                OneTapAnalytics oneTapAnalytics = OneTapAnalytics.INSTANCE;
                oneTapAnalytics.sessionNotFound$onetap_compose_release();
                OneTapAnalytics.userNotFound$onetap_compose_release$default(oneTapAnalytics, false, 1, null);
            } else {
                OneTapAnalytics.userWasFound$onetap_compose_release$default(OneTapAnalytics.INSTANCE, z12, false, 2, null);
            }
        }
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$4$lambda$3(M m11, Function2 function2, VKIDAuthUiParams vKIDAuthUiParams, Function1 function1, final InterfaceC3978p0 interfaceC3978p0, final Function2 function22, final Function2 function23, final OneTapStyle oneTapStyle, final boolean z11) {
        VKIDUser invoke$lambda$1;
        OneTapAnalytics oneTapAnalytics = OneTapAnalytics.INSTANCE;
        invoke$lambda$1 = OneTapKt$OneTap$16.invoke$lambda$1(interfaceC3978p0);
        final Map oneTapPressed$onetap_compose_release$default = OneTapAnalytics.oneTapPressed$onetap_compose_release$default(oneTapAnalytics, invoke$lambda$1, false, 2, null);
        CommonKt.startAuth(m11, new Function1() { // from class: com.vk.id.onetap.compose.onetap.l
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit invoke$lambda$4$lambda$3$lambda$0;
                invoke$lambda$4$lambda$3$lambda$0 = OneTapKt$OneTap$16$LargeOneTap$1.invoke$lambda$4$lambda$3$lambda$0(Function2.this, (AccessToken) obj);
                return invoke$lambda$4$lambda$3$lambda$0;
            }
        }, function2, new Function1() { // from class: com.vk.id.onetap.compose.onetap.m
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit invoke$lambda$4$lambda$3$lambda$1;
                invoke$lambda$4$lambda$3$lambda$1 = OneTapKt$OneTap$16$LargeOneTap$1.invoke$lambda$4$lambda$3$lambda$1(oneTapPressed$onetap_compose_release$default, function23, (VKIDAuthFail) obj);
                return invoke$lambda$4$lambda$3$lambda$1;
            }
        }, vKIDAuthUiParams.asParamsBuilder(new Function1() { // from class: com.vk.id.onetap.compose.onetap.n
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit invoke$lambda$4$lambda$3$lambda$2;
                Map map = oneTapPressed$onetap_compose_release$default;
                boolean z12 = z11;
                invoke$lambda$4$lambda$3$lambda$2 = OneTapKt$OneTap$16$LargeOneTap$1.invoke$lambda$4$lambda$3$lambda$2(OneTapStyle.this, map, z12, interfaceC3978p0, (VKIDAuthParams.Builder) obj);
                return invoke$lambda$4$lambda$3$lambda$2;
            }
        }), function1);
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$4$lambda$3$lambda$0(Function2 function2, AccessToken it) {
        Intrinsics.checkNotNullParameter(it, "it");
        function2.invoke(null, it);
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$4$lambda$3$lambda$1(Map map, Function2 function2, VKIDAuthFail it) {
        Intrinsics.checkNotNullParameter(it, "it");
        OneTapAnalytics oneTapAnalytics = OneTapAnalytics.INSTANCE;
        OneTapAnalytics.authError$onetap_compose_release$default(oneTapAnalytics, oneTapAnalytics.uuidFromParams$onetap_compose_release(map), false, 2, null);
        function2.invoke(null, it);
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$4$lambda$3$lambda$2(OneTapStyle oneTapStyle, Map map, boolean z11, InterfaceC3978p0 interfaceC3978p0, VKIDAuthParams.Builder asParamsBuilder) {
        VKIDAuthParams.Theme providerTheme;
        VKIDUser invoke$lambda$1;
        Intrinsics.checkNotNullParameter(asParamsBuilder, "$this$asParamsBuilder");
        providerTheme = OneTapKt.toProviderTheme(oneTapStyle);
        asParamsBuilder.setTheme(providerTheme);
        asParamsBuilder.setExtraParams(map);
        if (z11) {
            invoke$lambda$1 = OneTapKt$OneTap$16.invoke$lambda$1(interfaceC3978p0);
            if (invoke$lambda$1 == null) {
                asParamsBuilder.setPrompt(Prompt.CONSENT);
            }
        } else {
            asParamsBuilder.setUseOAuthProviderIfPossible(false);
            asParamsBuilder.setPrompt(Prompt.LOGIN);
        }
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$9$lambda$8(M m11, Function2 function2, VKIDAuthUiParams vKIDAuthUiParams, final Function2 function22, final Function2 function23, final OneTapStyle oneTapStyle) {
        final Map<String, String> alternatePressed$onetap_compose_release = OneTapAnalytics.INSTANCE.alternatePressed$onetap_compose_release();
        CommonKt.startAuth$default(m11, new Function1() { // from class: com.vk.id.onetap.compose.onetap.i
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit invoke$lambda$9$lambda$8$lambda$5;
                invoke$lambda$9$lambda$8$lambda$5 = OneTapKt$OneTap$16$LargeOneTap$1.invoke$lambda$9$lambda$8$lambda$5(Function2.this, (AccessToken) obj);
                return invoke$lambda$9$lambda$8$lambda$5;
            }
        }, function2, new Function1() { // from class: com.vk.id.onetap.compose.onetap.j
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit invoke$lambda$9$lambda$8$lambda$6;
                invoke$lambda$9$lambda$8$lambda$6 = OneTapKt$OneTap$16$LargeOneTap$1.invoke$lambda$9$lambda$8$lambda$6(alternatePressed$onetap_compose_release, function23, (VKIDAuthFail) obj);
                return invoke$lambda$9$lambda$8$lambda$6;
            }
        }, vKIDAuthUiParams.asParamsBuilder(new Function1() { // from class: com.vk.id.onetap.compose.onetap.k
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit invoke$lambda$9$lambda$8$lambda$7;
                invoke$lambda$9$lambda$8$lambda$7 = OneTapKt$OneTap$16$LargeOneTap$1.invoke$lambda$9$lambda$8$lambda$7(OneTapStyle.this, alternatePressed$onetap_compose_release, (VKIDAuthParams.Builder) obj);
                return invoke$lambda$9$lambda$8$lambda$7;
            }
        }), null, 32, null);
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$9$lambda$8$lambda$5(Function2 function2, AccessToken it) {
        Intrinsics.checkNotNullParameter(it, "it");
        function2.invoke(null, it);
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$9$lambda$8$lambda$6(Map map, Function2 function2, VKIDAuthFail it) {
        Intrinsics.checkNotNullParameter(it, "it");
        OneTapAnalytics oneTapAnalytics = OneTapAnalytics.INSTANCE;
        OneTapAnalytics.authError$onetap_compose_release$default(oneTapAnalytics, oneTapAnalytics.uuidFromParams$onetap_compose_release(map), false, 2, null);
        function2.invoke(null, it);
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$9$lambda$8$lambda$7(OneTapStyle oneTapStyle, Map map, VKIDAuthParams.Builder asParamsBuilder) {
        VKIDAuthParams.Theme providerTheme;
        Intrinsics.checkNotNullParameter(asParamsBuilder, "$this$asParamsBuilder");
        asParamsBuilder.setUseOAuthProviderIfPossible(false);
        providerTheme = OneTapKt.toProviderTheme(oneTapStyle);
        asParamsBuilder.setTheme(providerTheme);
        asParamsBuilder.setPrompt(Prompt.LOGIN);
        asParamsBuilder.setExtraParams(map);
        return Unit.f71690a;
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
        e.a aVar = androidx.compose.ui.e.f40358c0;
        OneTapStyle oneTapStyle = this.$style;
        Set<OneTapOAuth> set = this.$oAuths;
        boolean z11 = this.$signInAnotherAccountButtonEnabled;
        interfaceC3967k.o(-446722238);
        boolean F11 = interfaceC3967k.F(this.$coroutineScope) | interfaceC3967k.n(this.$onAuth) | interfaceC3967k.n(this.$onAuthCode) | interfaceC3967k.n(this.$onFail) | interfaceC3967k.F(this.$authParams) | interfaceC3967k.n(this.$style) | interfaceC3967k.p(this.$fastAuthEnabled) | interfaceC3967k.F(this.$onGetParams);
        final M m11 = this.$coroutineScope;
        final Function2<AuthCodeData, Boolean, Unit> function2 = this.$onAuthCode;
        final VKIDAuthUiParams vKIDAuthUiParams = this.$authParams;
        final Function1<kotlin.coroutines.d<? super VKIDAuthUiParams>, Object> function1 = this.$onGetParams;
        final InterfaceC3978p0<VKIDUser> interfaceC3978p0 = this.$user$delegate;
        final Function2<OneTapOAuth, AccessToken, Unit> function22 = this.$onAuth;
        final Function2<OneTapOAuth, VKIDAuthFail, Unit> function23 = this.$onFail;
        final OneTapStyle oneTapStyle2 = this.$style;
        final boolean z12 = this.$fastAuthEnabled;
        Object C11 = interfaceC3967k.C();
        if (F11 || C11 == InterfaceC3967k.a.a()) {
            Function0 function0 = new Function0() { // from class: com.vk.id.onetap.compose.onetap.f
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$4$lambda$3;
                    invoke$lambda$4$lambda$3 = OneTapKt$OneTap$16$LargeOneTap$1.invoke$lambda$4$lambda$3(M.this, function2, vKIDAuthUiParams, function1, interfaceC3978p0, function22, function23, oneTapStyle2, z12);
                    return invoke$lambda$4$lambda$3;
                }
            };
            interfaceC3967k.x(function0);
            C11 = function0;
        }
        Function0 function02 = (Function0) C11;
        interfaceC3967k.k();
        interfaceC3967k.o(-446682589);
        boolean F12 = interfaceC3967k.F(this.$coroutineScope) | interfaceC3967k.n(this.$onAuth) | interfaceC3967k.n(this.$onAuthCode) | interfaceC3967k.n(this.$onFail) | interfaceC3967k.F(this.$authParams) | interfaceC3967k.n(this.$style);
        final M m12 = this.$coroutineScope;
        final Function2<AuthCodeData, Boolean, Unit> function24 = this.$onAuthCode;
        final VKIDAuthUiParams vKIDAuthUiParams2 = this.$authParams;
        final Function2<OneTapOAuth, AccessToken, Unit> function25 = this.$onAuth;
        final Function2<OneTapOAuth, VKIDAuthFail, Unit> function26 = this.$onFail;
        final OneTapStyle oneTapStyle3 = this.$style;
        Object C12 = interfaceC3967k.C();
        if (F12 || C12 == InterfaceC3967k.a.a()) {
            C12 = new Function0() { // from class: com.vk.id.onetap.compose.onetap.g
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$9$lambda$8;
                    invoke$lambda$9$lambda$8 = OneTapKt$OneTap$16$LargeOneTap$1.invoke$lambda$9$lambda$8(M.this, function24, vKIDAuthUiParams2, function25, function26, oneTapStyle3);
                    return invoke$lambda$9$lambda$8;
                }
            };
            interfaceC3967k.x(C12);
        }
        Function0 function03 = (Function0) C12;
        interfaceC3967k.k();
        Function2<OneTapOAuth, AccessToken, Unit> function27 = this.$onAuth;
        Function2<AuthCodeData, Boolean, Unit> function28 = this.$onAuthCode;
        Function2<OneTapOAuth, VKIDAuthFail, Unit> function29 = this.$onFail;
        VKIDAuthUiParams vKIDAuthUiParams3 = this.$authParams;
        interfaceC3967k.o(-446648275);
        boolean p11 = interfaceC3967k.p(this.$measureInProgress) | interfaceC3967k.p(this.$signInAnotherAccountButtonEnabled);
        final boolean z13 = this.$measureInProgress;
        final boolean z14 = this.$signInAnotherAccountButtonEnabled;
        final InterfaceC3978p0<VKIDUser> interfaceC3978p02 = this.$user$delegate;
        Object C13 = interfaceC3967k.C();
        if (p11 || C13 == InterfaceC3967k.a.a()) {
            C13 = new Function1() { // from class: com.vk.id.onetap.compose.onetap.h
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invoke$lambda$11$lambda$10;
                    invoke$lambda$11$lambda$10 = OneTapKt$OneTap$16$LargeOneTap$1.invoke$lambda$11$lambda$10(z13, z14, interfaceC3978p02, (VKIDUser) obj);
                    return invoke$lambda$11$lambda$10;
                }
            };
            interfaceC3967k.x(C13);
        }
        interfaceC3967k.k();
        OneTapKt.OneTap(aVar, oneTapStyle, set, z11, (VKIDButtonTextProvider) null, (Function0<Unit>) function02, (Function0<Unit>) function03, function27, function28, function29, vKIDAuthUiParams3, (Function1<? super VKIDUser, Unit>) C13, this.$fastAuthEnabled, this.$largeText, this.$measureInProgress, this.$scenario, interfaceC3967k, 24582, VKIDAuthUiParams.$stable, 0);
    }
}

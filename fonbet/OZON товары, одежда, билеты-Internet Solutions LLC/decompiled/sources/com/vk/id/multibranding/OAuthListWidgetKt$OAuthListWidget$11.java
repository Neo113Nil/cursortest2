package com.vk.id.multibranding;

import D1.InterfaceC2801g;
import E0.C2942q;
import I0.C3173b;
import J0.P;
import S0.A0;
import S0.D;
import S0.InterfaceC3967k;
import S0.Q;
import android.content.Context;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5193p;
import androidx.compose.foundation.layout.C5194q;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.X;
import androidx.compose.foundation.layout.Y;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.Q1;
import com.vk.id.AccessToken;
import com.vk.id.OAuth;
import com.vk.id.VKIDAuthFail;
import com.vk.id.auth.AuthCodeData;
import com.vk.id.auth.VKIDAuthUiParams;
import com.vk.id.multibranding.common.style.OAuthListWidgetStyle;
import com.vk.id.multibranding.internal.MultibrandingAnalyticsContext;
import com.vk.id.multibranding.internal.MultibrandingAnalyticsContextKt;
import e1.InterfaceC6250b;
import e1.d;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import m3.C8060b;
import u0.E;
import xe.M;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
final class OAuthListWidgetKt$OAuthListWidget$11 implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ VKIDAuthUiParams $authParams;
    final /* synthetic */ boolean $measureInProgress;
    final /* synthetic */ e $modifier;
    final /* synthetic */ Set<OAuth> $oAuths;
    final /* synthetic */ Function2<OAuth, AccessToken, Unit> $onAuth;
    final /* synthetic */ Function2<AuthCodeData, Boolean, Unit> $onAuthCode;
    final /* synthetic */ Function2<OAuth, VKIDAuthFail, Unit> $onFail;
    final /* synthetic */ OAuthListWidgetStyle $style;

    /* JADX WARN: Multi-variable type inference failed */
    OAuthListWidgetKt$OAuthListWidget$11(Set<? extends OAuth> set, e eVar, boolean z11, OAuthListWidgetStyle oAuthListWidgetStyle, Function2<? super OAuth, ? super AccessToken, Unit> function2, Function2<? super AuthCodeData, ? super Boolean, Unit> function22, Function2<? super OAuth, ? super VKIDAuthFail, Unit> function23, VKIDAuthUiParams vKIDAuthUiParams) {
        this.$oAuths = set;
        this.$modifier = eVar;
        this.$measureInProgress = z11;
        this.$style = oAuthListWidgetStyle;
        this.$onAuth = function2;
        this.$onAuthCode = function22;
        this.$onFail = function23;
        this.$authParams = vKIDAuthUiParams;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$6$lambda$5$lambda$4$lambda$3$lambda$2(Function2 function2, OAuth oAuth, VKIDAuthFail it) {
        Intrinsics.checkNotNullParameter(it, "it");
        function2.invoke(oAuth, it);
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        Set<OAuth> set;
        boolean z11;
        if ((i11 & 3) == 2 && interfaceC3967k.b()) {
            interfaceC3967k.j();
            return;
        }
        Context context = (Context) interfaceC3967k.m(AndroidCompositionLocals_androidKt.d());
        Object C11 = interfaceC3967k.C();
        if (C11 == InterfaceC3967k.a.a()) {
            Object d11 = new D(Q.j(g.f71771a, interfaceC3967k));
            interfaceC3967k.x(d11);
            C11 = d11;
        }
        M a11 = ((D) C11).a();
        if (this.$oAuths.isEmpty()) {
            throw new IllegalStateException("You need to add at least one oAuth to display the widget");
        }
        MultibrandingAnalyticsContext multibrandingAnalyticsContext = (MultibrandingAnalyticsContext) interfaceC3967k.m(MultibrandingAnalyticsContextKt.getLocalMultibrandingAnalyticsContext());
        interfaceC3967k.o(-1337182320);
        Object C12 = interfaceC3967k.C();
        if (C12 == InterfaceC3967k.a.a()) {
            C12 = new OAuthListWidgetAnalytics(multibrandingAnalyticsContext.getScreen(), multibrandingAnalyticsContext.getIsPaused());
            interfaceC3967k.x(C12);
        }
        OAuthListWidgetAnalytics oAuthListWidgetAnalytics = (OAuthListWidgetAnalytics) C12;
        interfaceC3967k.k();
        Set<OAuth> set2 = this.$oAuths;
        interfaceC3967k.o(-1337178453);
        boolean F11 = interfaceC3967k.F(this.$oAuths);
        Set<OAuth> set3 = this.$oAuths;
        Object C13 = interfaceC3967k.C();
        if (F11 || C13 == InterfaceC3967k.a.a()) {
            C13 = new OAuthListWidgetKt$OAuthListWidget$11$1$1(oAuthListWidgetAnalytics, set3, null);
            interfaceC3967k.x(C13);
        }
        interfaceC3967k.k();
        Q.e(interfaceC3967k, set2, (Function2) C13);
        e eVar = this.$modifier;
        d.a g10 = InterfaceC6250b.a.g();
        boolean z12 = this.$measureInProgress;
        Set<OAuth> set4 = this.$oAuths;
        OAuthListWidgetStyle oAuthListWidgetStyle = this.$style;
        Function2<OAuth, AccessToken, Unit> function2 = this.$onAuth;
        OAuthListWidgetStyle oAuthListWidgetStyle2 = oAuthListWidgetStyle;
        Function2<AuthCodeData, Boolean, Unit> function22 = this.$onAuthCode;
        final Function2<OAuth, VKIDAuthFail, Unit> function23 = this.$onFail;
        VKIDAuthUiParams vKIDAuthUiParams = this.$authParams;
        C5194q a12 = C5193p.a(C5179b.g(), g10, interfaceC3967k, 48);
        int I11 = interfaceC3967k.I();
        A0 d12 = interfaceC3967k.d();
        e f7 = c.f(interfaceC3967k, eVar);
        InterfaceC2801g.f5440U.getClass();
        Function0 a13 = InterfaceC2801g.a.a();
        if (interfaceC3967k.v() == null) {
            C8060b.c();
            throw null;
        }
        interfaceC3967k.i();
        if (interfaceC3967k.t()) {
            interfaceC3967k.H(a13);
        } else {
            interfaceC3967k.e();
        }
        Function2 c11 = P.c(interfaceC3967k, a12, interfaceC3967k, d12);
        if (interfaceC3967k.t() || !Intrinsics.d(interfaceC3967k.C(), Integer.valueOf(I11))) {
            Nk.a.d(c11, I11, interfaceC3967k, I11);
        }
        Ek.a.g(f7, interfaceC3967k, 1096340986);
        if (!z12) {
            OAuthListWidgetKt.OAuthTitle(interfaceC3967k, 0);
        }
        interfaceC3967k.k();
        e.a aVar = e.f40358c0;
        E.a(interfaceC3967k, a0.f(aVar, 16));
        Y b11 = X.b(C5179b.f(), InterfaceC6250b.a.l(), interfaceC3967k, 0);
        int I12 = interfaceC3967k.I();
        A0 d13 = interfaceC3967k.d();
        e f11 = c.f(interfaceC3967k, aVar);
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
        Function2 f12 = C3173b.f(interfaceC3967k, b11, interfaceC3967k, d13);
        if (interfaceC3967k.t() || !Intrinsics.d(interfaceC3967k.C(), Integer.valueOf(I12))) {
            Nk.a.d(f12, I12, interfaceC3967k, I12);
        }
        Ek.a.g(f11, interfaceC3967k, -613736799);
        Iterator it = set4.iterator();
        int i12 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i13 = i12 + 1;
            if (i12 < 0) {
                C7714v.O0();
                throw null;
            }
            final OAuth oAuth = (OAuth) next;
            e.a aVar2 = e.f40358c0;
            String lowerCase = oAuth.name().toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            int i14 = i12;
            e a15 = Q1.a(aVar2, "oauth_button_" + lowerCase);
            Context context2 = context;
            if (1.0f <= 0.0d) {
                throw new IllegalArgumentException(C2942q.b(1.0f, "invalid weight ", "; must be greater than zero").toString());
            }
            e l02 = a15.l0(new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
            if (set4.size() == 1) {
                set = set4;
                z11 = true;
            } else {
                set = set4;
                z11 = false;
            }
            interfaceC3967k.o(272176168);
            boolean n11 = interfaceC3967k.n(function23) | interfaceC3967k.n(oAuth);
            Object C14 = interfaceC3967k.C();
            if (n11 || C14 == InterfaceC3967k.a.a()) {
                C14 = new Function1() { // from class: com.vk.id.multibranding.b
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit invoke$lambda$6$lambda$5$lambda$4$lambda$3$lambda$2;
                        invoke$lambda$6$lambda$5$lambda$4$lambda$3$lambda$2 = OAuthListWidgetKt$OAuthListWidget$11.invoke$lambda$6$lambda$5$lambda$4$lambda$3$lambda$2(Function2.this, oAuth, (VKIDAuthFail) obj);
                        return invoke$lambda$6$lambda$5$lambda$4$lambda$3$lambda$2;
                    }
                };
                interfaceC3967k.x(C14);
            }
            interfaceC3967k.k();
            Function2<OAuth, VKIDAuthFail, Unit> function24 = function23;
            VKIDAuthUiParams vKIDAuthUiParams2 = vKIDAuthUiParams;
            context = context2;
            Set<OAuth> set5 = set;
            OAuthListWidgetStyle oAuthListWidgetStyle3 = oAuthListWidgetStyle2;
            Iterator it2 = it;
            OAuthListWidgetKt.OAuthButton(l02, context, oAuthListWidgetStyle3, oAuth, z11, a11, function2, function22, (Function1) C14, vKIDAuthUiParams2, oAuthListWidgetAnalytics, interfaceC3967k, VKIDAuthUiParams.$stable << 27, 6);
            interfaceC3967k.o(-613713877);
            if (i14 != set5.size() - 1) {
                E.a(interfaceC3967k, a0.r(aVar2, 12));
            }
            interfaceC3967k.k();
            oAuthListWidgetStyle2 = oAuthListWidgetStyle3;
            vKIDAuthUiParams = vKIDAuthUiParams2;
            i12 = i13;
            set4 = set5;
            it = it2;
            function23 = function24;
        }
        interfaceC3967k.k();
        interfaceC3967k.f();
        interfaceC3967k.f();
    }
}

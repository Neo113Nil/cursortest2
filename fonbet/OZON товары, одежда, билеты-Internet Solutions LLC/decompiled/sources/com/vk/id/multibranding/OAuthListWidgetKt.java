package com.vk.id.multibranding;

import B0.C2510t;
import B1.V;
import Bl0.C2652m;
import D1.InterfaceC2801g;
import Fr.g;
import I1.i;
import K1.T;
import P1.F;
import S0.A0;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.J0;
import Sc.o;
import T7.E;
import android.content.Context;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.X;
import androidx.compose.foundation.layout.Y;
import androidx.compose.foundation.layout.a0;
import androidx.compose.material3.d;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.vk.id.AccessToken;
import com.vk.id.OAuth;
import com.vk.id.VKIDAuthFail;
import com.vk.id.auth.AuthCodeData;
import com.vk.id.auth.VKIDAuthParams;
import com.vk.id.auth.VKIDAuthUiParams;
import com.vk.id.multibranding.OAuthListWidgetAnalytics;
import com.vk.id.multibranding.OAuthListWidgetKt;
import com.vk.id.multibranding.common.style.OAuthListWidgetStyle;
import com.vk.id.util.UpdateLocaleKt;
import e1.InterfaceC6250b;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import n0.C8366G;
import n0.InterfaceC8369J;
import org.jetbrains.annotations.NotNull;
import sa.h;
import t0.p;
import t0.q;
import xe.C10727i;
import xe.M;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0095\u0001\u0010\u0013\u001a\u00020\u00072\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00042\u001a\b\u0002\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00070\u00042\u0018\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00070\u00042\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u000f\u0010\u0015\u001a\u00020\u0007H\u0003¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0097\u0001\u0010 \u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u001b2\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00042\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00070\u00042\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00070\u001d2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\u001eH\u0003¢\u0006\u0004\b \u0010!\u001a/\u0010\"\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0017H\u0003¢\u0006\u0004\b\"\u0010#\u001a\u001f\u0010$\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b$\u0010%\u001a/\u0010&\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0017H\u0003¢\u0006\u0004\b&\u0010#\u001a\u001f\u0010)\u001a\u00020(2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010'\u001a\u00020\u0005H\u0002¢\u0006\u0004\b)\u0010*\u001a\u0013\u0010,\u001a\u00020+*\u00020\u0002H\u0002¢\u0006\u0004\b,\u0010-¨\u0006/²\u0006\u000e\u0010.\u001a\u00020(8\n@\nX\u008a\u008e\u0002"}, d2 = {"Landroidx/compose/ui/e;", "modifier", "Lcom/vk/id/multibranding/common/style/OAuthListWidgetStyle;", "style", "Lkotlin/Function2;", "Lcom/vk/id/OAuth;", "Lcom/vk/id/AccessToken;", "", "onAuth", "Lcom/vk/id/auth/AuthCodeData;", "", "onAuthCode", "Lcom/vk/id/VKIDAuthFail;", "onFail", "", "oAuths", "Lcom/vk/id/auth/VKIDAuthUiParams;", "authParams", "measureInProgress", "OAuthListWidget", "(Landroidx/compose/ui/e;Lcom/vk/id/multibranding/common/style/OAuthListWidgetStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Ljava/util/Set;Lcom/vk/id/auth/VKIDAuthUiParams;ZLS0/k;II)V", "OAuthTitle", "(LS0/k;I)V", "Landroid/content/Context;", "context", "item", "showText", "Lxe/M;", "coroutineScope", "Lkotlin/Function1;", "Lcom/vk/id/multibranding/OAuthListWidgetAnalytics;", "analytics", "OAuthButton", "(Landroidx/compose/ui/e;Landroid/content/Context;Lcom/vk/id/multibranding/common/style/OAuthListWidgetStyle;Lcom/vk/id/OAuth;ZLxe/M;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lcom/vk/id/auth/VKIDAuthUiParams;Lcom/vk/id/multibranding/OAuthListWidgetAnalytics;LS0/k;II)V", "OAuthListWithTextEnding", "(Landroidx/compose/ui/e;Lcom/vk/id/OAuth;Lcom/vk/id/multibranding/common/style/OAuthListWidgetStyle;Landroid/content/Context;LS0/k;I)V", "OAuthListImage", "(Lcom/vk/id/OAuth;Lcom/vk/id/multibranding/common/style/OAuthListWidgetStyle;LS0/k;I)V", "OAuthListText", "oAuth", "", "getWidgetTitle", "(Landroid/content/Context;Lcom/vk/id/OAuth;)Ljava/lang/String;", "Lcom/vk/id/auth/VKIDAuthParams$Theme;", "toProviderTheme", "(Lcom/vk/id/multibranding/common/style/OAuthListWidgetStyle;)Lcom/vk/id/auth/VKIDAuthParams$Theme;", "isSuccessfulAuth", "multibranding-compose_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class OAuthListWidgetKt {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OAuth.values().length];
            try {
                iArr[OAuth.VK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OAuth.MAIL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OAuth.OK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void OAuthButton(final e eVar, final Context context, final OAuthListWidgetStyle oAuthListWidgetStyle, final OAuth oAuth, final boolean z11, final M m11, final Function2<? super OAuth, ? super AccessToken, Unit> function2, final Function2<? super AuthCodeData, ? super Boolean, Unit> function22, final Function1<? super VKIDAuthFail, Unit> function1, final VKIDAuthUiParams vKIDAuthUiParams, final OAuthListWidgetAnalytics oAuthListWidgetAnalytics, InterfaceC3967k interfaceC3967k, final int i11, final int i12) {
        int i13;
        Function2<? super OAuth, ? super AccessToken, Unit> function23;
        int i14;
        int i15;
        final OAuthListWidgetStyle oAuthListWidgetStyle2;
        int i16;
        OAuth oAuth2;
        C3969l c3969l;
        C3969l u11 = interfaceC3967k.u(319219586);
        if ((i11 & 6) == 0) {
            i13 = (u11.n(eVar) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= u11.F(context) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i13 |= u11.n(oAuthListWidgetStyle) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i11 & 3072) == 0) {
            i13 |= u11.n(oAuth) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i11 & 24576) == 0) {
            i13 |= u11.p(z11) ? 16384 : 8192;
        }
        if ((196608 & i11) == 0) {
            i13 |= u11.F(m11) ? 131072 : 65536;
        }
        if ((1572864 & i11) == 0) {
            function23 = function2;
            i13 |= u11.F(function23) ? 1048576 : 524288;
        } else {
            function23 = function2;
        }
        if ((i11 & 12582912) == 0) {
            i13 |= u11.F(function22) ? 8388608 : 4194304;
        }
        if ((i11 & 100663296) == 0) {
            i13 |= u11.F(function1) ? 67108864 : 33554432;
        }
        if ((i11 & 805306368) == 0) {
            i13 |= (i11 & 1073741824) == 0 ? u11.n(vKIDAuthUiParams) : u11.F(vKIDAuthUiParams) ? 536870912 : 268435456;
        }
        if ((i12 & 6) == 0) {
            i14 = i12 | (u11.n(oAuthListWidgetAnalytics) ? 4 : 2);
        } else {
            i14 = i12;
        }
        if ((i13 & 306783379) == 306783378 && (i14 & 3) == 2 && u11.b()) {
            u11.j();
            c3969l = u11;
        } else {
            int i17 = i13 >> 9;
            int i18 = i17 & 14;
            oAuthListWidgetAnalytics.OAuthShown(oAuth, z11, u11, (i17 & 126) | ((i14 << 6) & 896));
            e background = OAuthListWidgetBackgroundStyleKt.background(OAuthListWidgetCornersStyleKt.clip(OAuthListWidgetBorderStyleKt.border(OAuthListWidgetSizeStyleKt.height(eVar, oAuthListWidgetStyle.getSizeStyle()), oAuthListWidgetStyle.getBorderStyle(), oAuthListWidgetStyle.getCornersStyle()), oAuthListWidgetStyle.getCornersStyle()), oAuthListWidgetStyle);
            u11.o(-622770385);
            Object C11 = u11.C();
            if (C11 == InterfaceC3967k.a.a()) {
                C11 = p.a();
                u11.x(C11);
            }
            q qVar = (q) C11;
            u11.k();
            InterfaceC8369J c11 = d.c(OAuthListWidgetRippleStyleKt.asColor(oAuthListWidgetStyle.getRippleStyle()));
            i a11 = i.a(0);
            u11.o(-622762073);
            int i19 = i13 & 896;
            boolean F11 = ((i13 & 7168) == 2048) | ((i14 & 14) == 4) | ((57344 & i13) == 16384) | u11.F(m11) | ((3670016 & i13) == 1048576) | ((29360128 & i13) == 8388608) | ((234881024 & i13) == 67108864) | ((1879048192 & i13) == 536870912 || ((i13 & 1073741824) != 0 && u11.F(vKIDAuthUiParams))) | (i19 == 256);
            Object C12 = u11.C();
            if (F11 || C12 == InterfaceC3967k.a.a()) {
                i15 = i13;
                oAuthListWidgetStyle2 = oAuthListWidgetStyle;
                i16 = i19;
                final Function2<? super OAuth, ? super AccessToken, Unit> function24 = function23;
                Function0 function0 = new Function0() { // from class: sa.j
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit OAuthButton$lambda$28$lambda$27;
                        OAuthListWidgetStyle oAuthListWidgetStyle3 = oAuthListWidgetStyle2;
                        OAuthButton$lambda$28$lambda$27 = OAuthListWidgetKt.OAuthButton$lambda$28$lambda$27(OAuthListWidgetAnalytics.this, oAuth, z11, m11, vKIDAuthUiParams, function24, function22, function1, oAuthListWidgetStyle3);
                        return OAuthButton$lambda$28$lambda$27;
                    }
                };
                oAuth2 = oAuth;
                u11.x(function0);
                C12 = function0;
            } else {
                i15 = i13;
                oAuthListWidgetStyle2 = oAuthListWidgetStyle;
                oAuth2 = oAuth;
                i16 = i19;
            }
            u11.k();
            e b11 = androidx.compose.foundation.i.b(background, qVar, c11, false, null, a11, (Function0) C12, 12);
            Y b12 = X.b(C5179b.b(), InterfaceC6250b.a.i(), u11, 54);
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f7 = c.f(u11, b11);
            Function0 a12 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a12);
            } else {
                u11.e();
            }
            Function2 h11 = Cm.e.h(u11, b12, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                Ep.a.d(I11, u11, I11, h11);
            }
            F1.b(u11, f7, InterfaceC2801g.a.f());
            OAuthListImage(oAuth2, oAuthListWidgetStyle2, u11, i18 | ((i15 >> 3) & 112));
            u11.o(38250678);
            if (z11) {
                c3969l = u11;
                OAuthListWithTextEnding(e.f40358c0, oAuth2, oAuthListWidgetStyle2, context, c3969l, ((i15 >> 6) & 112) | 6 | i16 | ((i15 << 6) & 7168));
            } else {
                c3969l = u11;
            }
            c3969l.k();
            c3969l.f();
        }
        J0 m02 = c3969l.m0();
        if (m02 != null) {
            m02.G(new Function2() { // from class: sa.k
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit OAuthButton$lambda$30;
                    int intValue = ((Integer) obj2).intValue();
                    int i21 = i11;
                    int i22 = i12;
                    OAuthButton$lambda$30 = OAuthListWidgetKt.OAuthButton$lambda$30(androidx.compose.ui.e.this, context, oAuthListWidgetStyle, oAuth, z11, m11, function2, function22, function1, vKIDAuthUiParams, oAuthListWidgetAnalytics, i21, i22, (InterfaceC3967k) obj, intValue);
                    return OAuthButton$lambda$30;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OAuthButton$lambda$28$lambda$27(OAuthListWidgetAnalytics oAuthListWidgetAnalytics, OAuth oAuth, boolean z11, M m11, VKIDAuthUiParams vKIDAuthUiParams, Function2 function2, Function2 function22, Function1 function1, OAuthListWidgetStyle oAuthListWidgetStyle) {
        C10727i.c(m11, null, null, new OAuthListWidgetKt$OAuthButton$2$1$1(vKIDAuthUiParams, function2, oAuth, function22, oAuthListWidgetAnalytics, oAuthListWidgetAnalytics.onOAuthTap(oAuth, z11), function1, oAuthListWidgetStyle, null), 3);
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OAuthButton$lambda$30(e eVar, Context context, OAuthListWidgetStyle oAuthListWidgetStyle, OAuth oAuth, boolean z11, M m11, Function2 function2, Function2 function22, Function1 function1, VKIDAuthUiParams vKIDAuthUiParams, OAuthListWidgetAnalytics oAuthListWidgetAnalytics, int i11, int i12, InterfaceC3967k interfaceC3967k, int i13) {
        OAuthButton(eVar, context, oAuthListWidgetStyle, oAuth, z11, m11, function2, function22, function1, vKIDAuthUiParams, oAuthListWidgetAnalytics, interfaceC3967k, C2652m.e(i11 | 1), C2652m.e(i12));
        return Unit.f71690a;
    }

    private static final void OAuthListImage(final OAuth oAuth, final OAuthListWidgetStyle oAuthListWidgetStyle, InterfaceC3967k interfaceC3967k, final int i11) {
        int i12;
        int i13;
        C3969l u11 = interfaceC3967k.u(-950158263);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(oAuth) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.n(oAuthListWidgetStyle) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && u11.b()) {
            u11.j();
        } else {
            int i14 = WhenMappings.$EnumSwitchMapping$0[oAuth.ordinal()];
            if (i14 == 1) {
                i13 = R$drawable.vkid_vk_icon_blue;
            } else if (i14 == 2) {
                i13 = R$drawable.vkid_mail_icon_blue;
            } else {
                if (i14 != 3) {
                    throw new o();
                }
                i13 = R$drawable.vkid_ok_icon_yellow;
            }
            C8366G.a(G1.e.a(i13, u11, 0), null, a0.f(a0.r(OAuthListWidgetSizeStyleKt.iconPadding(e.f40358c0, oAuthListWidgetStyle.getSizeStyle()), OAuthListWidgetSizeStyleKt.iconSize(oAuthListWidgetStyle.getSizeStyle())), OAuthListWidgetSizeStyleKt.iconSize(oAuthListWidgetStyle.getSizeStyle())), null, null, 0.0f, null, u11, 48, 120);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new Function2() { // from class: sa.m
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit OAuthListImage$lambda$32;
                    int intValue = ((Integer) obj2).intValue();
                    OAuthListWidgetStyle oAuthListWidgetStyle2 = oAuthListWidgetStyle;
                    int i15 = i11;
                    OAuthListImage$lambda$32 = OAuthListWidgetKt.OAuthListImage$lambda$32(OAuth.this, oAuthListWidgetStyle2, i15, (InterfaceC3967k) obj, intValue);
                    return OAuthListImage$lambda$32;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OAuthListImage$lambda$32(OAuth oAuth, OAuthListWidgetStyle oAuthListWidgetStyle, int i11, InterfaceC3967k interfaceC3967k, int i12) {
        OAuthListImage(oAuth, oAuthListWidgetStyle, interfaceC3967k, C2652m.e(i11 | 1));
        return Unit.f71690a;
    }

    private static final void OAuthListText(final e eVar, final OAuth oAuth, OAuthListWidgetStyle oAuthListWidgetStyle, final Context context, InterfaceC3967k interfaceC3967k, final int i11) {
        int i12;
        final OAuthListWidgetStyle oAuthListWidgetStyle2;
        F f7;
        C3969l u11 = interfaceC3967k.u(909668857);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(eVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.n(oAuth) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            oAuthListWidgetStyle2 = oAuthListWidgetStyle;
            i12 |= u11.n(oAuthListWidgetStyle2) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        } else {
            oAuthListWidgetStyle2 = oAuthListWidgetStyle;
        }
        if ((i11 & 3072) == 0) {
            i12 |= u11.F(context) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i12 & 1171) == 1170 && u11.b()) {
            u11.j();
        } else {
            e c11 = a0.c(eVar);
            V f11 = C5185h.f(InterfaceC6250b.a.e(), false);
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f12 = c.f(u11, c11);
            Function0 a11 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a11);
            } else {
                u11.e();
            }
            Function2 f13 = E.f(u11, f11, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                Ep.a.d(I11, u11, I11, f13);
            }
            F1.b(u11, f12, InterfaceC2801g.a.f());
            String widgetTitle = getWidgetTitle(context, oAuth);
            e.a aVar = e.f40358c0;
            long asColorResource = OAuthListWidgetTextStyleKt.asColorResource(oAuthListWidgetStyle2.getTextStyle(), u11, 0);
            long asFontSize = OAuthListWidgetSizeStyleKt.asFontSize(oAuthListWidgetStyle2.getSizeStyle());
            long asLineHeight = OAuthListWidgetSizeStyleKt.asLineHeight(oAuthListWidgetStyle2.getSizeStyle());
            f7 = F.f21510h;
            C2510t.b(widgetTitle, aVar, new T(asColorResource, asFontSize, f7, null, 0L, 3, asLineHeight, null, 0, 16613368), null, 0, false, 1, 0, null, u11, 1572912, 440);
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new Function2() { // from class: sa.o
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit OAuthListText$lambda$34;
                    int intValue = ((Integer) obj2).intValue();
                    Context context2 = context;
                    int i13 = i11;
                    OAuthListText$lambda$34 = OAuthListWidgetKt.OAuthListText$lambda$34(androidx.compose.ui.e.this, oAuth, oAuthListWidgetStyle2, context2, i13, (InterfaceC3967k) obj, intValue);
                    return OAuthListText$lambda$34;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OAuthListText$lambda$34(e eVar, OAuth oAuth, OAuthListWidgetStyle oAuthListWidgetStyle, Context context, int i11, InterfaceC3967k interfaceC3967k, int i12) {
        OAuthListText(eVar, oAuth, oAuthListWidgetStyle, context, interfaceC3967k, C2652m.e(i11 | 1));
        return Unit.f71690a;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OAuthListWidget(e eVar, OAuthListWidgetStyle oAuthListWidgetStyle, @NotNull final Function2<? super OAuth, ? super AccessToken, Unit> onAuth, Function2<? super AuthCodeData, ? super Boolean, Unit> function2, @NotNull final Function2<? super OAuth, ? super VKIDAuthFail, Unit> onFail, Set<? extends OAuth> set, VKIDAuthUiParams vKIDAuthUiParams, final boolean z11, InterfaceC3967k interfaceC3967k, final int i11, final int i12) {
        int i13;
        Function2<? super AuthCodeData, ? super Boolean, Unit> function22;
        Set<? extends OAuth> set2;
        boolean z12;
        e eVar2;
        OAuthListWidgetStyle oAuthListWidgetStyle2;
        final Set<? extends OAuth> set3;
        final e eVar3;
        final OAuthListWidgetStyle oAuthListWidgetStyle3;
        final Function2<? super AuthCodeData, ? super Boolean, Unit> function23;
        final VKIDAuthUiParams vKIDAuthUiParams2;
        J0 m02;
        int i14;
        int i15;
        VKIDAuthUiParams vKIDAuthUiParams3 = vKIDAuthUiParams;
        Intrinsics.checkNotNullParameter(onAuth, "onAuth");
        Intrinsics.checkNotNullParameter(onFail, "onFail");
        C3969l u11 = interfaceC3967k.u(-992845632);
        int i16 = i12 & 1;
        if (i16 != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.n(eVar) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= ((i12 & 2) == 0 && u11.n(oAuthListWidgetStyle)) ? 32 : 16;
        }
        if ((i12 & 4) != 0) {
            i13 |= 384;
        } else if ((i11 & 384) == 0) {
            i13 |= u11.F(onAuth) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        int i17 = i12 & 8;
        if (i17 != 0) {
            i13 |= 3072;
        } else if ((i11 & 3072) == 0) {
            function22 = function2;
            i13 |= u11.F(function22) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
            if ((i12 & 16) == 0) {
                i13 |= 24576;
            } else if ((i11 & 24576) == 0) {
                i13 |= u11.F(onFail) ? 16384 : 8192;
            }
            if ((196608 & i11) != 0) {
                if ((i12 & 32) == 0) {
                    set2 = set;
                    if (u11.F(set2)) {
                        i15 = 131072;
                        i13 |= i15;
                    }
                } else {
                    set2 = set;
                }
                i15 = 65536;
                i13 |= i15;
            } else {
                set2 = set;
            }
            if ((1572864 & i11) == 0) {
                if ((i12 & 64) == 0) {
                    if ((2097152 & i11) == 0 ? u11.n(vKIDAuthUiParams3) : u11.F(vKIDAuthUiParams3)) {
                        i14 = 1048576;
                        i13 |= i14;
                    }
                }
                i14 = 524288;
                i13 |= i14;
            }
            if ((i12 & UserVerificationMethods.USER_VERIFY_PATTERN) == 0) {
                i13 |= 12582912;
            } else if ((i11 & 12582912) == 0) {
                z12 = z11;
                i13 |= u11.p(z12) ? 8388608 : 4194304;
                if ((i13 & 4793491) == 4793490 || !u11.b()) {
                    u11.Q0();
                    if ((i11 & 1) != 0 || u11.w0()) {
                        if (i16 != 0) {
                            eVar = e.f40358c0;
                        }
                        OAuthListWidgetStyle dark = (i12 & 2) != 0 ? new OAuthListWidgetStyle.Dark(null, null, 3, null) : oAuthListWidgetStyle;
                        if (i17 != 0) {
                            u11.o(66024227);
                            Object C11 = u11.C();
                            if (C11 == InterfaceC3967k.a.a()) {
                                C11 = new h(0);
                                u11.x(C11);
                            }
                            u11.k();
                            function22 = (Function2) C11;
                        }
                        if ((i12 & 32) != 0) {
                            set2 = C7714v.Y0(OAuth.getEntries());
                        }
                        if ((i12 & 64) != 0) {
                            vKIDAuthUiParams3 = new VKIDAuthUiParams.Builder().build();
                        }
                        eVar2 = eVar;
                        oAuthListWidgetStyle2 = dark;
                    } else {
                        u11.j();
                        eVar2 = eVar;
                        oAuthListWidgetStyle2 = oAuthListWidgetStyle;
                    }
                    Set<? extends OAuth> set4 = set2;
                    VKIDAuthUiParams vKIDAuthUiParams4 = vKIDAuthUiParams3;
                    u11.j0();
                    UpdateLocaleKt.InternalVKIDWithUpdatedLocale(a1.c.c(631545303, new OAuthListWidgetKt$OAuthListWidget$11(set4, eVar2, z12, oAuthListWidgetStyle2, onAuth, function22, onFail, vKIDAuthUiParams4), u11), u11, 6);
                    Function2<? super AuthCodeData, ? super Boolean, Unit> function24 = function22;
                    set3 = set4;
                    eVar3 = eVar2;
                    oAuthListWidgetStyle3 = oAuthListWidgetStyle2;
                    function23 = function24;
                    vKIDAuthUiParams2 = vKIDAuthUiParams4;
                } else {
                    u11.j();
                    eVar3 = eVar;
                    oAuthListWidgetStyle3 = oAuthListWidgetStyle;
                    vKIDAuthUiParams2 = vKIDAuthUiParams3;
                    function23 = function22;
                    set3 = set2;
                }
                m02 = u11.m0();
                if (m02 != null) {
                    m02.G(new Function2() { // from class: sa.i
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit OAuthListWidget$lambda$24;
                            int intValue = ((Integer) obj2).intValue();
                            int i18 = i11;
                            int i19 = i12;
                            OAuthListWidget$lambda$24 = OAuthListWidgetKt.OAuthListWidget$lambda$24(androidx.compose.ui.e.this, oAuthListWidgetStyle3, onAuth, function23, onFail, set3, vKIDAuthUiParams2, z11, i18, i19, (InterfaceC3967k) obj, intValue);
                            return OAuthListWidget$lambda$24;
                        }
                    });
                    return;
                }
                return;
            }
            z12 = z11;
            if ((i13 & 4793491) == 4793490) {
            }
            u11.Q0();
            if ((i11 & 1) != 0) {
            }
            if (i16 != 0) {
            }
            if ((i12 & 2) != 0) {
            }
            if (i17 != 0) {
            }
            if ((i12 & 32) != 0) {
            }
            if ((i12 & 64) != 0) {
            }
            eVar2 = eVar;
            oAuthListWidgetStyle2 = dark;
            Set<? extends OAuth> set42 = set2;
            VKIDAuthUiParams vKIDAuthUiParams42 = vKIDAuthUiParams3;
            u11.j0();
            UpdateLocaleKt.InternalVKIDWithUpdatedLocale(a1.c.c(631545303, new OAuthListWidgetKt$OAuthListWidget$11(set42, eVar2, z12, oAuthListWidgetStyle2, onAuth, function22, onFail, vKIDAuthUiParams42), u11), u11, 6);
            Function2<? super AuthCodeData, ? super Boolean, Unit> function242 = function22;
            set3 = set42;
            eVar3 = eVar2;
            oAuthListWidgetStyle3 = oAuthListWidgetStyle2;
            function23 = function242;
            vKIDAuthUiParams2 = vKIDAuthUiParams42;
            m02 = u11.m0();
            if (m02 != null) {
            }
        }
        function22 = function2;
        if ((i12 & 16) == 0) {
        }
        if ((196608 & i11) != 0) {
        }
        if ((1572864 & i11) == 0) {
        }
        if ((i12 & UserVerificationMethods.USER_VERIFY_PATTERN) == 0) {
        }
        z12 = z11;
        if ((i13 & 4793491) == 4793490) {
        }
        u11.Q0();
        if ((i11 & 1) != 0) {
        }
        if (i16 != 0) {
        }
        if ((i12 & 2) != 0) {
        }
        if (i17 != 0) {
        }
        if ((i12 & 32) != 0) {
        }
        if ((i12 & 64) != 0) {
        }
        eVar2 = eVar;
        oAuthListWidgetStyle2 = dark;
        Set<? extends OAuth> set422 = set2;
        VKIDAuthUiParams vKIDAuthUiParams422 = vKIDAuthUiParams3;
        u11.j0();
        UpdateLocaleKt.InternalVKIDWithUpdatedLocale(a1.c.c(631545303, new OAuthListWidgetKt$OAuthListWidget$11(set422, eVar2, z12, oAuthListWidgetStyle2, onAuth, function22, onFail, vKIDAuthUiParams422), u11), u11, 6);
        Function2<? super AuthCodeData, ? super Boolean, Unit> function2422 = function22;
        set3 = set422;
        eVar3 = eVar2;
        oAuthListWidgetStyle3 = oAuthListWidgetStyle2;
        function23 = function2422;
        vKIDAuthUiParams2 = vKIDAuthUiParams422;
        m02 = u11.m0();
        if (m02 != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OAuthListWidget$lambda$22$lambda$21(AuthCodeData authCodeData, boolean z11) {
        Intrinsics.checkNotNullParameter(authCodeData, "<unused var>");
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OAuthListWidget$lambda$24(e eVar, OAuthListWidgetStyle oAuthListWidgetStyle, Function2 function2, Function2 function22, Function2 function23, Set set, VKIDAuthUiParams vKIDAuthUiParams, boolean z11, int i11, int i12, InterfaceC3967k interfaceC3967k, int i13) {
        OAuthListWidget(eVar, oAuthListWidgetStyle, function2, function22, function23, set, vKIDAuthUiParams, z11, interfaceC3967k, C2652m.e(i11 | 1), i12);
        return Unit.f71690a;
    }

    private static final void OAuthListWithTextEnding(e eVar, OAuth oAuth, OAuthListWidgetStyle oAuthListWidgetStyle, Context context, InterfaceC3967k interfaceC3967k, final int i11) {
        int i12;
        final e eVar2;
        final OAuth oAuth2;
        final OAuthListWidgetStyle oAuthListWidgetStyle2;
        final Context context2;
        C3969l u11 = interfaceC3967k.u(102303212);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(eVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.n(oAuth) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.n(oAuthListWidgetStyle) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i11 & 3072) == 0) {
            i12 |= u11.F(context) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i12 & 1171) == 1170 && u11.b()) {
            u11.j();
            context2 = context;
            oAuthListWidgetStyle2 = oAuthListWidgetStyle;
            oAuth2 = oAuth;
            eVar2 = eVar;
        } else {
            OAuthListText(eVar, oAuth, oAuthListWidgetStyle, context, u11, i12 & 8190);
            eVar2 = eVar;
            oAuth2 = oAuth;
            oAuthListWidgetStyle2 = oAuthListWidgetStyle;
            context2 = context;
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new Function2() { // from class: sa.n
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit OAuthListWithTextEnding$lambda$31;
                    int intValue = ((Integer) obj2).intValue();
                    Context context3 = context2;
                    int i13 = i11;
                    OAuthListWithTextEnding$lambda$31 = OAuthListWidgetKt.OAuthListWithTextEnding$lambda$31(androidx.compose.ui.e.this, oAuth2, oAuthListWidgetStyle2, context3, i13, (InterfaceC3967k) obj, intValue);
                    return OAuthListWithTextEnding$lambda$31;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OAuthListWithTextEnding$lambda$31(e eVar, OAuth oAuth, OAuthListWidgetStyle oAuthListWidgetStyle, Context context, int i11, InterfaceC3967k interfaceC3967k, int i12) {
        OAuthListWithTextEnding(eVar, oAuth, oAuthListWidgetStyle, context, interfaceC3967k, C2652m.e(i11 | 1));
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void OAuthTitle(InterfaceC3967k interfaceC3967k, final int i11) {
        F f7;
        C3969l u11 = interfaceC3967k.u(514008081);
        if (i11 == 0 && u11.b()) {
            u11.j();
        } else {
            String a11 = G1.i.a(u11, R$string.vkid_oauth_list_widget_note);
            long d11 = Hj0.T.d(13);
            long d12 = Hj0.T.d(16);
            f7 = F.f21509g;
            C2510t.b(a11, null, new T(G1.b.a(u11, R$color.vkid_steel_gray_400), d11, f7, null, 0L, 3, d12, null, 0, 16613368), null, 0, false, 0, 0, null, u11, 0, 506);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new Function2() { // from class: sa.l
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit OAuthTitle$lambda$25;
                    int intValue = ((Integer) obj2).intValue();
                    OAuthTitle$lambda$25 = OAuthListWidgetKt.OAuthTitle$lambda$25(i11, (InterfaceC3967k) obj, intValue);
                    return OAuthTitle$lambda$25;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OAuthTitle$lambda$25(int i11, InterfaceC3967k interfaceC3967k, int i12) {
        OAuthTitle(interfaceC3967k, C2652m.e(i11 | 1));
        return Unit.f71690a;
    }

    private static final String getWidgetTitle(Context context, OAuth oAuth) {
        String string;
        int i11 = WhenMappings.$EnumSwitchMapping$0[oAuth.ordinal()];
        if (i11 == 1) {
            string = context.getString(R$string.vkid_oauth_list_widget_title_vk);
        } else if (i11 == 2) {
            string = context.getString(R$string.vkid_oauth_list_widget_title_mail);
        } else {
            if (i11 != 3) {
                throw new o();
            }
            string = context.getString(R$string.vkid_oauth_list_widget_title_ok);
        }
        Intrinsics.f(string);
        return string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VKIDAuthParams.Theme toProviderTheme(OAuthListWidgetStyle oAuthListWidgetStyle) {
        if (oAuthListWidgetStyle instanceof OAuthListWidgetStyle.Light) {
            return VKIDAuthParams.Theme.Light;
        }
        if (oAuthListWidgetStyle instanceof OAuthListWidgetStyle.Dark) {
            return VKIDAuthParams.Theme.Dark;
        }
        throw new o();
    }
}

package com.vk.id.multibranding;

import Bl0.C2652m;
import Ca.C2735c;
import D4.C2836k;
import R90.d;
import S0.A1;
import S0.C3969l;
import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import S0.J0;
import S0.M;
import S0.N;
import S0.Q;
import S0.n1;
import Sc.o;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.J;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.vk.id.OAuth;
import com.vk.id.VKID;
import com.vk.id.analytics.VKIDAnalytics;
import com.vk.id.multibranding.OAuthListWidgetAnalytics;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.S;
import org.jetbrains.annotations.NotNull;
import sa.f;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 (2\u00020\u0001:\u0001(B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u000eJ+\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u00022\u0012\u0010\u0011\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\u0010\"\u00020\tH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0018\u001a\u00020\u00122\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u00162\u0006\u0010\b\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ)\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u00162\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010!\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0016¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010$R \u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006)"}, d2 = {"Lcom/vk/id/multibranding/OAuthListWidgetAnalytics;", "", "", "screen", "", "paused", "<init>", "(Ljava/lang/String;Z)V", "isText", "Lcom/vk/id/analytics/VKIDAnalytics$EventParam;", "isIconParam", "(Z)Lcom/vk/id/analytics/VKIDAnalytics$EventParam;", "uuid", "uuidParam", "(Ljava/lang/String;)Lcom/vk/id/analytics/VKIDAnalytics$EventParam;", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "params", "", "track", "(Ljava/lang/String;[Lcom/vk/id/analytics/VKIDAnalytics$EventParam;)V", "", "Lcom/vk/id/OAuth;", "oAuths", "oauthAdded", "(Ljava/util/Set;)V", "oAuth", "OAuthShown", "(Lcom/vk/id/OAuth;ZLS0/k;I)V", "", "onOAuthTap", "(Lcom/vk/id/OAuth;Z)Ljava/util/Map;", "sessionId", "onAuthError", "(Ljava/lang/String;Lcom/vk/id/OAuth;)V", "Ljava/lang/String;", "Z", "Lkotlin/Pair;", "flowSource", "Lkotlin/Pair;", "Companion", "multibranding-compose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class OAuthListWidgetAnalytics {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final Pair<String, String> flowSource;
    private final boolean paused;

    @NotNull
    private final String screen;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/vk/id/multibranding/OAuthListWidgetAnalytics$Companion;", "", "<init>", "()V", "UNIQUE_SESSION_PARAM_NAME", "", "multibranding-compose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

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
            int[] iArr2 = new int[AbstractC5434v.a.values().length];
            try {
                iArr2[AbstractC5434v.a.ON_RESUME.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public OAuthListWidgetAnalytics(@NotNull String screen, boolean z11) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        this.screen = screen;
        this.paused = z11;
        this.flowSource = new Pair<>("flow_source", "from_multibranding");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final M OAuthShown$lambda$8$lambda$7(A1 a12, OAuth oAuth, OAuthListWidgetAnalytics oAuthListWidgetAnalytics, boolean z11, N DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        final AbstractC5434v lifecycle = ((J) a12.getValue()).getLifecycle();
        final C2836k c2836k = new C2836k(oAuth, oAuthListWidgetAnalytics, z11);
        lifecycle.a(c2836k);
        return new M() { // from class: com.vk.id.multibranding.OAuthListWidgetAnalytics$OAuthShown$lambda$8$lambda$7$$inlined$onDispose$1
            @Override // S0.M
            public void dispose() {
                AbstractC5434v.this.e(c2836k);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void OAuthShown$lambda$8$lambda$7$lambda$5(final OAuth oAuth, final OAuthListWidgetAnalytics oAuthListWidgetAnalytics, final boolean z11, J j11, AbstractC5434v.a event) {
        Intrinsics.checkNotNullParameter(j11, "<unused var>");
        Intrinsics.checkNotNullParameter(event, "event");
        if (WhenMappings.$EnumSwitchMapping$1[event.ordinal()] == 1) {
            VKID.INSTANCE.getInstance().getCrashReporter().runReportingCrashes(new d(3), new Function0() { // from class: sa.a
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit OAuthShown$lambda$8$lambda$7$lambda$5$lambda$4;
                    OAuthShown$lambda$8$lambda$7$lambda$5$lambda$4 = OAuthListWidgetAnalytics.OAuthShown$lambda$8$lambda$7$lambda$5$lambda$4(OAuth.this, oAuthListWidgetAnalytics, z11);
                    return OAuthShown$lambda$8$lambda$7$lambda$5$lambda$4;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OAuthShown$lambda$8$lambda$7$lambda$5$lambda$3(Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OAuthShown$lambda$8$lambda$7$lambda$5$lambda$4(OAuth oAuth, OAuthListWidgetAnalytics oAuthListWidgetAnalytics, boolean z11) {
        String str;
        int i11 = WhenMappings.$EnumSwitchMapping$0[oAuth.ordinal()];
        if (i11 == 1) {
            str = "vk_button_show";
        } else if (i11 == 2) {
            str = "mail_button_show";
        } else {
            if (i11 != 3) {
                throw new o();
            }
            str = "ok_button_show";
        }
        oAuthListWidgetAnalytics.track(str, oAuthListWidgetAnalytics.isIconParam(z11));
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OAuthShown$lambda$9(OAuthListWidgetAnalytics oAuthListWidgetAnalytics, OAuth oAuth, boolean z11, int i11, InterfaceC3967k interfaceC3967k, int i12) {
        oAuthListWidgetAnalytics.OAuthShown(oAuth, z11, interfaceC3967k, C2652m.e(i11 | 1));
        return Unit.f71690a;
    }

    private final VKIDAnalytics.EventParam isIconParam(boolean isText) {
        return new VKIDAnalytics.EventParam("button_type", isText ? "default" : "icon", null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit oauthAdded$lambda$0(Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit oauthAdded$lambda$2(OAuthListWidgetAnalytics oAuthListWidgetAnalytics, Set set) {
        oAuthListWidgetAnalytics.track("multibranding_oauth_added", oauthAdded$lambda$2$lambda$1(set, "ok_ru", OAuth.OK), oauthAdded$lambda$2$lambda$1(set, "mail_ru", OAuth.MAIL), oauthAdded$lambda$2$lambda$1(set, "vk", OAuth.VK));
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VKIDAnalytics.EventParam oauthAdded$lambda$2$lambda$1(Set set, String name, OAuth oauth) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(oauth, "oauth");
        return new VKIDAnalytics.EventParam(name, set.contains(oauth) ? "1" : "0", null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAuthError$lambda$12(Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAuthError$lambda$13(OAuthListWidgetAnalytics oAuthListWidgetAnalytics, OAuth oAuth, String str) {
        String str2;
        if (!oAuthListWidgetAnalytics.paused) {
            int i11 = WhenMappings.$EnumSwitchMapping$0[oAuth.ordinal()];
            if (i11 == 1) {
                str2 = "vk";
            } else if (i11 == 2) {
                str2 = "mail_ru";
            } else {
                if (i11 != 3) {
                    throw new o();
                }
                str2 = "ok_ru";
            }
            String str3 = str2;
            VKIDAnalytics.INSTANCE.trackEvent("sdk_auth_error", new VKIDAnalytics.EventParam("sdk_type", "vkid", null, 4, null), oAuthListWidgetAnalytics.uuidParam(str), new VKIDAnalytics.EventParam("error", "sdk_auth_error", null, 4, null), new VKIDAnalytics.EventParam("from_multibranding", "true", null, 4, null), new VKIDAnalytics.EventParam("oauth_service", str3, null, 4, null), new VKIDAnalytics.EventParam("screen", oAuthListWidgetAnalytics.screen, null, 4, null));
        }
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onOAuthTap$lambda$10(Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onOAuthTap$lambda$11(OAuth oAuth, OAuthListWidgetAnalytics oAuthListWidgetAnalytics, boolean z11, String str) {
        String str2;
        int i11 = WhenMappings.$EnumSwitchMapping$0[oAuth.ordinal()];
        if (i11 == 1) {
            str2 = "vk_button_tap";
        } else if (i11 == 2) {
            str2 = "mail_button_tap";
        } else {
            if (i11 != 3) {
                throw new o();
            }
            str2 = "ok_button_tap";
        }
        oAuthListWidgetAnalytics.track(str2, oAuthListWidgetAnalytics.isIconParam(z11), oAuthListWidgetAnalytics.uuidParam(str));
        return Unit.f71690a;
    }

    private final void track(String name, VKIDAnalytics.EventParam... params) {
        if (this.paused) {
            return;
        }
        VKIDAnalytics.Companion companion = VKIDAnalytics.INSTANCE;
        S s11 = new S(3);
        s11.a(new VKIDAnalytics.EventParam("sdk_type", "vkid", null, 4, null));
        s11.a(new VKIDAnalytics.EventParam("screen", this.screen, null, 4, null));
        s11.b(params);
        companion.trackEvent(name, (VKIDAnalytics.EventParam[]) s11.d(new VKIDAnalytics.EventParam[s11.c()]));
    }

    private final VKIDAnalytics.EventParam uuidParam(String uuid) {
        return new VKIDAnalytics.EventParam("unique_session_id", uuid, null, 4, null);
    }

    public final void OAuthShown(@NotNull final OAuth oAuth, final boolean z11, InterfaceC3967k interfaceC3967k, final int i11) {
        int i12;
        Intrinsics.checkNotNullParameter(oAuth, "oAuth");
        C3969l u11 = interfaceC3967k.u(415891252);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(oAuth) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.p(z11) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.n(this) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i12 & 147) == 146 && u11.b()) {
            u11.j();
        } else {
            final InterfaceC3978p0 l11 = n1.l(u11.m(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner()), u11);
            T value = l11.getValue();
            u11.o(1941577090);
            boolean n11 = ((i12 & 14) == 4) | u11.n(l11) | ((i12 & 896) == 256) | ((i12 & 112) == 32);
            Object C11 = u11.C();
            if (n11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new Function1() { // from class: sa.c
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        M OAuthShown$lambda$8$lambda$7;
                        InterfaceC3978p0 interfaceC3978p0 = InterfaceC3978p0.this;
                        OAuthListWidgetAnalytics oAuthListWidgetAnalytics = this;
                        OAuthShown$lambda$8$lambda$7 = OAuthListWidgetAnalytics.OAuthShown$lambda$8$lambda$7(interfaceC3978p0, oAuth, oAuthListWidgetAnalytics, z11, (N) obj);
                        return OAuthShown$lambda$8$lambda$7;
                    }
                };
                u11.x(C11);
            }
            u11.k();
            Q.c(value, (Function1) C11, u11);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new Function2() { // from class: sa.d
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit OAuthShown$lambda$9;
                    int intValue = ((Integer) obj2).intValue();
                    OAuthListWidgetAnalytics oAuthListWidgetAnalytics = OAuthListWidgetAnalytics.this;
                    boolean z12 = z11;
                    int i13 = i11;
                    OAuthShown$lambda$9 = OAuthListWidgetAnalytics.OAuthShown$lambda$9(oAuthListWidgetAnalytics, oAuth, z12, i13, (InterfaceC3967k) obj, intValue);
                    return OAuthShown$lambda$9;
                }
            });
        }
    }

    public final void oauthAdded(@NotNull final Set<? extends OAuth> oAuths) {
        Intrinsics.checkNotNullParameter(oAuths, "oAuths");
        VKID.INSTANCE.getInstance().getCrashReporter().runReportingCrashes(new ru.ozon.fintech.ui.input.a(1), new Function0() { // from class: sa.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit oauthAdded$lambda$2;
                oauthAdded$lambda$2 = OAuthListWidgetAnalytics.oauthAdded$lambda$2(OAuthListWidgetAnalytics.this, oAuths);
                return oauthAdded$lambda$2;
            }
        });
    }

    public final void onAuthError(@NotNull final String sessionId, @NotNull final OAuth oAuth) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(oAuth, "oAuth");
        VKID.INSTANCE.getInstance().getCrashReporter().runReportingCrashes(new f(0), new Function0() { // from class: sa.g
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit onAuthError$lambda$13;
                onAuthError$lambda$13 = OAuthListWidgetAnalytics.onAuthError$lambda$13(OAuthListWidgetAnalytics.this, oAuth, sessionId);
                return onAuthError$lambda$13;
            }
        });
    }

    @NotNull
    public final Map<String, String> onOAuthTap(@NotNull final OAuth oAuth, final boolean isText) {
        Intrinsics.checkNotNullParameter(oAuth, "oAuth");
        final String uuid = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
        VKID.INSTANCE.getInstance().getCrashReporter().runReportingCrashes(new C2735c(1), new Function0() { // from class: sa.e
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit onOAuthTap$lambda$11;
                onOAuthTap$lambda$11 = OAuthListWidgetAnalytics.onOAuthTap$lambda$11(OAuth.this, this, isText, uuid);
                return onOAuthTap$lambda$11;
            }
        });
        return U.j(new Pair("session_id", uuid), this.flowSource);
    }
}

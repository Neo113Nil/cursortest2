package com.vk.id.onetap.compose.onetap;

import Aa.C2374a;
import Bl0.C2652m;
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
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.G;
import androidx.lifecycle.J;
import c40.C5744a;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.vk.id.VKID;
import com.vk.id.VKIDUser;
import com.vk.id.analytics.VKIDAnalytics;
import com.vk.id.analytics.param.LanguageParamKt;
import com.vk.id.onetap.common.OneTapStyle;
import com.vk.id.onetap.compose.onetap.OneTapAnalytics;
import com.vk.id.onetap.compose.onetap.OneTapTitleScenario;
import ja.y;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.S;
import ma.C8121b;
import na.C8479b;
import org.jetbrains.annotations.NotNull;
import za.C11013d;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\b\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\u0003J!\u0010\u000e\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\tH\u0000¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u0010\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u000f\u0010\u0003J\u0019\u0010\u0013\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\tH\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J)\u0010\u001d\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ%\u0010$\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020!0 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0000¢\u0006\u0004\b\"\u0010#J/\u0010'\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020!0 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\b\u0002\u0010\u000b\u001a\u00020\tH\u0000¢\u0006\u0004\b%\u0010&J\u001b\u0010*\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020!0 H\u0000¢\u0006\u0004\b(\u0010)J\u0017\u0010.\u001a\u00020\u00042\u0006\u0010+\u001a\u00020!H\u0000¢\u0006\u0004\b,\u0010-J!\u00101\u001a\u00020\u00042\u0006\u0010+\u001a\u00020!2\b\b\u0002\u0010\u000b\u001a\u00020\tH\u0000¢\u0006\u0004\b/\u00100J\u0017\u00105\u001a\u0002022\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b3\u00104J\u0017\u00108\u001a\u0002022\u0006\u0010+\u001a\u00020!H\u0000¢\u0006\u0004\b6\u00107J+\u0010>\u001a\u00020\u00042\u0006\u00109\u001a\u00020!2\u0012\u0010;\u001a\n\u0012\u0006\b\u0001\u0012\u0002020:\"\u000202H\u0000¢\u0006\u0004\b<\u0010=J\u001f\u0010A\u001a\u00020!*\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020!0 H\u0000¢\u0006\u0004\b?\u0010@J\u0017\u0010B\u001a\u0002022\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\bB\u0010CJ\u0017\u0010D\u001a\u0002022\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\bD\u0010CJ\u0017\u0010E\u001a\u0002022\u0006\u0010\u000b\u001a\u00020\tH\u0002¢\u0006\u0004\bE\u00104J\u0017\u0010F\u001a\u0002022\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\bF\u0010GR \u0010I\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020!0H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010J¨\u0006K"}, d2 = {"Lcom/vk/id/onetap/compose/onetap/OneTapAnalytics;", "", "<init>", "()V", "", "sessionNotFound$onetap_compose_release", "sessionNotFound", "userWasFoundIcon$onetap_compose_release", "userWasFoundIcon", "", "signInAnotherAccountButton", "icon", "userWasFound$onetap_compose_release", "(ZZ)V", "userWasFound", "userNotFoundIcon$onetap_compose_release", "userNotFoundIcon", "userNotFound$onetap_compose_release", "(Z)V", "userNotFound", "Lcom/vk/id/onetap/compose/onetap/OneTapTitleScenario;", "scenario", "Lcom/vk/id/onetap/common/OneTapStyle;", "style", "OneTapIconShown$onetap_compose_release", "(Lcom/vk/id/onetap/compose/onetap/OneTapTitleScenario;Lcom/vk/id/onetap/common/OneTapStyle;LS0/k;I)V", "OneTapIconShown", "OneTapShown$onetap_compose_release", "(ZLcom/vk/id/onetap/compose/onetap/OneTapTitleScenario;Lcom/vk/id/onetap/common/OneTapStyle;LS0/k;II)V", "OneTapShown", "Lcom/vk/id/VKIDUser;", "user", "", "", "oneTapPressedIcon$onetap_compose_release", "(Lcom/vk/id/VKIDUser;)Ljava/util/Map;", "oneTapPressedIcon", "oneTapPressed$onetap_compose_release", "(Lcom/vk/id/VKIDUser;Z)Ljava/util/Map;", "oneTapPressed", "alternatePressed$onetap_compose_release", "()Ljava/util/Map;", "alternatePressed", "uuid", "authErrorIcon$onetap_compose_release", "(Ljava/lang/String;)V", "authErrorIcon", "authError$onetap_compose_release", "(Ljava/lang/String;Z)V", "authError", "Lcom/vk/id/analytics/VKIDAnalytics$EventParam;", "alternateParam$onetap_compose_release", "(Z)Lcom/vk/id/analytics/VKIDAnalytics$EventParam;", "alternateParam", "uuidParam$onetap_compose_release", "(Ljava/lang/String;)Lcom/vk/id/analytics/VKIDAnalytics$EventParam;", "uuidParam", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "params", "track$onetap_compose_release", "(Ljava/lang/String;[Lcom/vk/id/analytics/VKIDAnalytics$EventParam;)V", "track", "uuidFromParams$onetap_compose_release", "(Ljava/util/Map;)Ljava/lang/String;", "uuidFromParams", "themeParam", "(Lcom/vk/id/onetap/common/OneTapStyle;)Lcom/vk/id/analytics/VKIDAnalytics$EventParam;", "styleParam", "iconParam", "textTypeParam", "(Lcom/vk/id/onetap/compose/onetap/OneTapTitleScenario;)Lcom/vk/id/analytics/VKIDAnalytics$EventParam;", "Lkotlin/Pair;", "FLOW_SOURCE", "Lkotlin/Pair;", "onetap-compose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class OneTapAnalytics {

    @NotNull
    public static final OneTapAnalytics INSTANCE = new OneTapAnalytics();

    @NotNull
    private static final Pair<String, String> FLOW_SOURCE = new Pair<>("flow_source", "from_one_tap");

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[AbstractC5434v.a.values().length];
            try {
                iArr[AbstractC5434v.a.ON_RESUME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[OneTapTitleScenario.values().length];
            try {
                iArr2[OneTapTitleScenario.SignIn.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[OneTapTitleScenario.SignUp.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[OneTapTitleScenario.Get.ordinal()] = 3;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[OneTapTitleScenario.Open.ordinal()] = 4;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[OneTapTitleScenario.Calculate.ordinal()] = 5;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[OneTapTitleScenario.Order.ordinal()] = 6;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[OneTapTitleScenario.PlaceOrder.ordinal()] = 7;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[OneTapTitleScenario.SendRequest.ordinal()] = 8;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[OneTapTitleScenario.Participate.ordinal()] = 9;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    private OneTapAnalytics() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OneTapIconShown$lambda$6(OneTapAnalytics oneTapAnalytics, OneTapTitleScenario oneTapTitleScenario, OneTapStyle oneTapStyle, int i11, InterfaceC3967k interfaceC3967k, int i12) {
        oneTapAnalytics.OneTapIconShown$onetap_compose_release(oneTapTitleScenario, oneTapStyle, interfaceC3967k, C2652m.e(i11 | 1));
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final M OneTapShown$lambda$12$lambda$11(A1 a12, final boolean z11, final OneTapTitleScenario oneTapTitleScenario, final OneTapStyle oneTapStyle, final Context context, N DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        final AbstractC5434v lifecycle = ((J) a12.getValue()).getLifecycle();
        final G g10 = new G() { // from class: za.k
            @Override // androidx.lifecycle.G
            public final void onStateChanged(J j11, AbstractC5434v.a aVar) {
                OneTapAnalytics.OneTapShown$lambda$12$lambda$11$lambda$9(z11, oneTapTitleScenario, oneTapStyle, context, j11, aVar);
            }
        };
        lifecycle.a(g10);
        return new M() { // from class: com.vk.id.onetap.compose.onetap.OneTapAnalytics$OneTapShown$lambda$12$lambda$11$$inlined$onDispose$1
            @Override // S0.M
            public void dispose() {
                AbstractC5434v.this.e(g10);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void OneTapShown$lambda$12$lambda$11$lambda$9(final boolean z11, final OneTapTitleScenario oneTapTitleScenario, final OneTapStyle oneTapStyle, final Context context, J j11, AbstractC5434v.a event) {
        Intrinsics.checkNotNullParameter(j11, "<unused var>");
        Intrinsics.checkNotNullParameter(event, "event");
        if (WhenMappings.$EnumSwitchMapping$0[event.ordinal()] == 1) {
            VKID.INSTANCE.getInstance().getCrashReporter().runReportingCrashes(new C8121b(1), new Function0() { // from class: za.b
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit OneTapShown$lambda$12$lambda$11$lambda$9$lambda$8;
                    OneTapShown$lambda$12$lambda$11$lambda$9$lambda$8 = OneTapAnalytics.OneTapShown$lambda$12$lambda$11$lambda$9$lambda$8(z11, oneTapTitleScenario, oneTapStyle, context);
                    return OneTapShown$lambda$12$lambda$11$lambda$9$lambda$8;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OneTapShown$lambda$12$lambda$11$lambda$9$lambda$7(Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OneTapShown$lambda$12$lambda$11$lambda$9$lambda$8(boolean z11, OneTapTitleScenario oneTapTitleScenario, OneTapStyle oneTapStyle, Context context) {
        OneTapAnalytics oneTapAnalytics = INSTANCE;
        oneTapAnalytics.track$onetap_compose_release("screen_proceed", oneTapAnalytics.iconParam(z11), oneTapAnalytics.textTypeParam(oneTapTitleScenario), oneTapAnalytics.themeParam(oneTapStyle), oneTapAnalytics.styleParam(oneTapStyle), LanguageParamKt.vkidInternalLanguageParam(context));
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OneTapShown$lambda$13(OneTapAnalytics oneTapAnalytics, boolean z11, OneTapTitleScenario oneTapTitleScenario, OneTapStyle oneTapStyle, int i11, int i12, InterfaceC3967k interfaceC3967k, int i13) {
        oneTapAnalytics.OneTapShown$onetap_compose_release(z11, oneTapTitleScenario, oneTapStyle, interfaceC3967k, C2652m.e(i11 | 1), i12);
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit alternatePressed$lambda$16(Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit alternatePressed$lambda$17(String str) {
        OneTapAnalytics oneTapAnalytics = INSTANCE;
        oneTapAnalytics.track$onetap_compose_release("onetap_button_alternative_sign_in_tap", oneTapAnalytics.uuidParam$onetap_compose_release(str));
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit authError$lambda$18(Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit authError$lambda$19(boolean z11, String str) {
        OneTapAnalytics oneTapAnalytics = INSTANCE;
        oneTapAnalytics.track$onetap_compose_release("sdk_auth_error", oneTapAnalytics.iconParam(z11), oneTapAnalytics.uuidParam$onetap_compose_release(str), new VKIDAnalytics.EventParam("from_one_tap", "true", null, 4, null), new VKIDAnalytics.EventParam("error", "sdk_auth_error", null, 4, null));
        return Unit.f71690a;
    }

    public static /* synthetic */ void authError$onetap_compose_release$default(OneTapAnalytics oneTapAnalytics, String str, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        oneTapAnalytics.authError$onetap_compose_release(str, z11);
    }

    private final VKIDAnalytics.EventParam iconParam(boolean icon) {
        return new VKIDAnalytics.EventParam("button_type", icon ? "icon" : "default", null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit oneTapPressed$lambda$14(Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit oneTapPressed$lambda$15(VKIDUser vKIDUser, boolean z11, String str) {
        if (vKIDUser != null) {
            OneTapAnalytics oneTapAnalytics = INSTANCE;
            oneTapAnalytics.track$onetap_compose_release("onetap_button_tap", oneTapAnalytics.iconParam(z11), oneTapAnalytics.uuidParam$onetap_compose_release(str));
        } else {
            OneTapAnalytics oneTapAnalytics2 = INSTANCE;
            oneTapAnalytics2.track$onetap_compose_release("onetap_button_no_user_tap", oneTapAnalytics2.iconParam(z11), oneTapAnalytics2.uuidParam$onetap_compose_release(str));
        }
        return Unit.f71690a;
    }

    public static /* synthetic */ Map oneTapPressed$onetap_compose_release$default(OneTapAnalytics oneTapAnalytics, VKIDUser vKIDUser, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return oneTapAnalytics.oneTapPressed$onetap_compose_release(vKIDUser, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit sessionNotFound$lambda$0(Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit sessionNotFound$lambda$1() {
        INSTANCE.track$onetap_compose_release("no_session_found", new VKIDAnalytics.EventParam[0]);
        return Unit.f71690a;
    }

    private final VKIDAnalytics.EventParam styleParam(OneTapStyle style) {
        String str;
        if ((style instanceof OneTapStyle.Dark) || (style instanceof OneTapStyle.Icon) || (style instanceof OneTapStyle.Light)) {
            str = "primary";
        } else {
            if (!(style instanceof OneTapStyle.SecondaryDark) && !(style instanceof OneTapStyle.SecondaryLight) && !(style instanceof OneTapStyle.TransparentDark) && !(style instanceof OneTapStyle.TransparentLight)) {
                throw new o();
            }
            str = "secondary";
        }
        return new VKIDAnalytics.EventParam("style_type", str, null, 4, null);
    }

    private final VKIDAnalytics.EventParam textTypeParam(OneTapTitleScenario scenario) {
        String str;
        switch (WhenMappings.$EnumSwitchMapping$1[scenario.ordinal()]) {
            case 1:
                str = "default";
                break;
            case 2:
                str = "appoint";
                break;
            case 3:
                str = "receive";
                break;
            case 4:
                str = "open";
                break;
            case 5:
                str = "calculate";
                break;
            case 6:
                str = "order";
                break;
            case 7:
                str = "service_order_placing";
                break;
            case 8:
                str = "request";
                break;
            case 9:
                str = "take_part";
                break;
            default:
                throw new o();
        }
        return new VKIDAnalytics.EventParam("text_type", str, null, 4, null);
    }

    private final VKIDAnalytics.EventParam themeParam(OneTapStyle style) {
        String str;
        if ((style instanceof OneTapStyle.Dark) || (style instanceof OneTapStyle.TransparentDark) || (style instanceof OneTapStyle.SecondaryDark) || (style instanceof OneTapStyle.Icon)) {
            str = "dark";
        } else {
            if (!(style instanceof OneTapStyle.Light) && !(style instanceof OneTapStyle.SecondaryLight) && !(style instanceof OneTapStyle.TransparentLight)) {
                throw new o();
            }
            str = "light";
        }
        return new VKIDAnalytics.EventParam("theme_type", str, null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit userNotFound$lambda$4(Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit userNotFound$lambda$5(boolean z11) {
        OneTapAnalytics oneTapAnalytics = INSTANCE;
        oneTapAnalytics.track$onetap_compose_release("onetap_button_no_user_show", oneTapAnalytics.iconParam(z11));
        return Unit.f71690a;
    }

    public static /* synthetic */ void userNotFound$onetap_compose_release$default(OneTapAnalytics oneTapAnalytics, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        oneTapAnalytics.userNotFound$onetap_compose_release(z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit userWasFound$lambda$2(Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit userWasFound$lambda$3(boolean z11, boolean z12) {
        OneTapAnalytics oneTapAnalytics = INSTANCE;
        oneTapAnalytics.track$onetap_compose_release("onetap_button_user_found", oneTapAnalytics.alternateParam$onetap_compose_release(z11), oneTapAnalytics.iconParam(z12));
        return Unit.f71690a;
    }

    public static /* synthetic */ void userWasFound$onetap_compose_release$default(OneTapAnalytics oneTapAnalytics, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z12 = false;
        }
        oneTapAnalytics.userWasFound$onetap_compose_release(z11, z12);
    }

    public final void OneTapIconShown$onetap_compose_release(@NotNull OneTapTitleScenario scenario, @NotNull OneTapStyle style, InterfaceC3967k interfaceC3967k, final int i11) {
        int i12;
        final OneTapTitleScenario oneTapTitleScenario;
        final OneTapStyle oneTapStyle;
        Intrinsics.checkNotNullParameter(scenario, "scenario");
        Intrinsics.checkNotNullParameter(style, "style");
        C3969l u11 = interfaceC3967k.u(-2102777987);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(scenario) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.n(style) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.n(this) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i12 & 147) == 146 && u11.b()) {
            u11.j();
            oneTapTitleScenario = scenario;
            oneTapStyle = style;
        } else {
            int i13 = i12 << 3;
            oneTapTitleScenario = scenario;
            oneTapStyle = style;
            OneTapShown$onetap_compose_release(true, oneTapTitleScenario, oneTapStyle, u11, (i13 & 112) | 6 | (i13 & 896) | (i13 & 7168), 0);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new Function2() { // from class: za.h
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit OneTapIconShown$lambda$6;
                    int intValue = ((Integer) obj2).intValue();
                    OneTapAnalytics oneTapAnalytics = OneTapAnalytics.this;
                    OneTapStyle oneTapStyle2 = oneTapStyle;
                    int i14 = i11;
                    OneTapIconShown$lambda$6 = OneTapAnalytics.OneTapIconShown$lambda$6(oneTapAnalytics, oneTapTitleScenario, oneTapStyle2, i14, (InterfaceC3967k) obj, intValue);
                    return OneTapIconShown$lambda$6;
                }
            });
        }
    }

    public final void OneTapShown$onetap_compose_release(boolean z11, @NotNull final OneTapTitleScenario scenario, @NotNull final OneTapStyle style, InterfaceC3967k interfaceC3967k, final int i11, final int i12) {
        final boolean z12;
        int i13;
        Intrinsics.checkNotNullParameter(scenario, "scenario");
        Intrinsics.checkNotNullParameter(style, "style");
        C3969l u11 = interfaceC3967k.u(-1081169912);
        int i14 = i12 & 1;
        if (i14 != 0) {
            i13 = i11 | 6;
            z12 = z11;
        } else if ((i11 & 6) == 0) {
            z12 = z11;
            i13 = (u11.p(z12) ? 4 : 2) | i11;
        } else {
            z12 = z11;
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= u11.n(scenario) ? 32 : 16;
        }
        if ((i12 & 4) != 0) {
            i13 |= 384;
        } else if ((i11 & 384) == 0) {
            i13 |= u11.n(style) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i13 & 147) == 146 && u11.b()) {
            u11.j();
        } else {
            if (i14 != 0) {
                z12 = false;
            }
            final Context context = (Context) u11.m(AndroidCompositionLocals_androidKt.d());
            final InterfaceC3978p0 l11 = n1.l(u11.m(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner()), u11);
            T value = l11.getValue();
            u11.o(-345230006);
            boolean n11 = ((i13 & 14) == 4) | u11.n(l11) | ((i13 & 112) == 32) | ((i13 & 896) == 256) | u11.F(context);
            Object C11 = u11.C();
            if (n11 || C11 == InterfaceC3967k.a.a()) {
                Function1 function1 = new Function1() { // from class: za.a
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        M OneTapShown$lambda$12$lambda$11;
                        InterfaceC3978p0 interfaceC3978p0 = InterfaceC3978p0.this;
                        OneTapTitleScenario oneTapTitleScenario = scenario;
                        OneTapStyle oneTapStyle = style;
                        OneTapShown$lambda$12$lambda$11 = OneTapAnalytics.OneTapShown$lambda$12$lambda$11(interfaceC3978p0, z12, oneTapTitleScenario, oneTapStyle, context, (N) obj);
                        return OneTapShown$lambda$12$lambda$11;
                    }
                };
                u11.x(function1);
                C11 = function1;
            }
            u11.k();
            Q.c(value, (Function1) C11, u11);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new Function2() { // from class: za.f
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit OneTapShown$lambda$13;
                    int intValue = ((Integer) obj2).intValue();
                    OneTapAnalytics oneTapAnalytics = OneTapAnalytics.this;
                    int i15 = i11;
                    int i16 = i12;
                    OneTapShown$lambda$13 = OneTapAnalytics.OneTapShown$lambda$13(oneTapAnalytics, z12, scenario, style, i15, i16, (InterfaceC3967k) obj, intValue);
                    return OneTapShown$lambda$13;
                }
            });
        }
    }

    @NotNull
    public final VKIDAnalytics.EventParam alternateParam$onetap_compose_release(boolean signInAnotherAccountButton) {
        return new VKIDAnalytics.EventParam("alternative_sign_in_availability", signInAnotherAccountButton ? "available" : "not_available", null, 4, null);
    }

    @NotNull
    public final Map<String, String> alternatePressed$onetap_compose_release() {
        String b11 = P4.f.b("toString(...)");
        VKID.INSTANCE.getInstance().getCrashReporter().runReportingCrashes(new C11013d(), new A50.a(b11, 7));
        return U.j(new Pair("session_id", b11), FLOW_SOURCE);
    }

    public final void authError$onetap_compose_release(@NotNull final String uuid, final boolean icon) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        VKID.INSTANCE.getInstance().getCrashReporter().runReportingCrashes(new ru.ozon.fintech.features.camera.scanners.mlkit.utils.bankcard.a(1), new Function0() { // from class: za.c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit authError$lambda$19;
                authError$lambda$19 = OneTapAnalytics.authError$lambda$19(icon, uuid);
                return authError$lambda$19;
            }
        });
    }

    public final void authErrorIcon$onetap_compose_release(@NotNull String uuid) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        authError$onetap_compose_release(uuid, true);
    }

    @NotNull
    public final Map<String, String> oneTapPressed$onetap_compose_release(final VKIDUser user, final boolean icon) {
        final String b11 = P4.f.b("toString(...)");
        VKID.INSTANCE.getInstance().getCrashReporter().runReportingCrashes(new y(1), new Function0() { // from class: za.e
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit oneTapPressed$lambda$15;
                oneTapPressed$lambda$15 = OneTapAnalytics.oneTapPressed$lambda$15(VKIDUser.this, icon, b11);
                return oneTapPressed$lambda$15;
            }
        });
        return U.j(new Pair("session_id", b11), FLOW_SOURCE);
    }

    @NotNull
    public final Map<String, String> oneTapPressedIcon$onetap_compose_release(VKIDUser user) {
        return oneTapPressed$onetap_compose_release(user, true);
    }

    public final void sessionNotFound$onetap_compose_release() {
        VKID.INSTANCE.getInstance().getCrashReporter().runReportingCrashes(new C2374a(2), new C5744a(1));
    }

    public final void track$onetap_compose_release(@NotNull String name, @NotNull VKIDAnalytics.EventParam... params) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(params, "params");
        VKIDAnalytics.Companion companion = VKIDAnalytics.INSTANCE;
        S s11 = new S(2);
        s11.a(new VKIDAnalytics.EventParam("sdk_type", "vkid", null, 4, null));
        s11.b(params);
        companion.trackEvent(name, (VKIDAnalytics.EventParam[]) s11.d(new VKIDAnalytics.EventParam[s11.c()]));
    }

    public final void userNotFound$onetap_compose_release(final boolean icon) {
        VKID.INSTANCE.getInstance().getCrashReporter().runReportingCrashes(new C8479b(2), new Function0() { // from class: za.g
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit userNotFound$lambda$5;
                userNotFound$lambda$5 = OneTapAnalytics.userNotFound$lambda$5(icon);
                return userNotFound$lambda$5;
            }
        });
    }

    public final void userNotFoundIcon$onetap_compose_release() {
        userNotFound$onetap_compose_release(true);
    }

    public final void userWasFound$onetap_compose_release(final boolean signInAnotherAccountButton, final boolean icon) {
        VKID.INSTANCE.getInstance().getCrashReporter().runReportingCrashes(new za.i(), new Function0() { // from class: za.j
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit userWasFound$lambda$3;
                userWasFound$lambda$3 = OneTapAnalytics.userWasFound$lambda$3(signInAnotherAccountButton, icon);
                return userWasFound$lambda$3;
            }
        });
    }

    public final void userWasFoundIcon$onetap_compose_release() {
        userWasFound$onetap_compose_release(false, true);
    }

    @NotNull
    public final String uuidFromParams$onetap_compose_release(@NotNull Map<String, String> map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        String str = map.get("session_id");
        return str == null ? "" : str;
    }

    @NotNull
    public final VKIDAnalytics.EventParam uuidParam$onetap_compose_release(@NotNull String uuid) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        return new VKIDAnalytics.EventParam("unique_session_id", uuid, null, 4, null);
    }
}

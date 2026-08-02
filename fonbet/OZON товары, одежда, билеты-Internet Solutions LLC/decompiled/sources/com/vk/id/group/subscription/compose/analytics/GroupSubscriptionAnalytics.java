package com.vk.id.group.subscription.compose.analytics;

import B50.n;
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
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.G;
import androidx.lifecycle.J;
import com.vk.id.VKID;
import com.vk.id.analytics.VKIDAnalytics;
import com.vk.id.analytics.param.LanguageParamKt;
import com.vk.id.group.subscription.common.style.GroupSubscriptionStyle;
import com.vk.id.group.subscription.compose.analytics.GroupSubscriptionAnalytics;
import fa.b;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\fJ\u000f\u0010\u000f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\fJ\u001d\u0010\u0012\u001a\u00020\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0010H\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0016\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0019\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\u001a\u0010\u0018J\u0019\u0010\u001d\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\u001c\u0010\u0018J\u0019\u0010\u001f\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0001¢\u0006\u0004\b\u001e\u0010\u0015J\u0019\u0010!\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b \u0010\u0018J\u0019\u0010#\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\"\u0010\u0018J\u0019\u0010%\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b$\u0010\u0018R\u001a\u0010'\u001a\u00020&8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\"\u0010-\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010,0+8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\"\u00101\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040+8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b1\u0010.\u001a\u0004\b2\u00100¨\u00063"}, d2 = {"Lcom/vk/id/group/subscription/compose/analytics/GroupSubscriptionAnalytics;", "", "<init>", "()V", "", "eventName", "accessToken", "", "track", "(Ljava/lang/String;Ljava/lang/String;)V", "Lcom/vk/id/analytics/VKIDAnalytics$EventParam;", "appIdParam", "()Lcom/vk/id/analytics/VKIDAnalytics$EventParam;", "nowhereScreen", "groupIdParam", "themeParam", "Lkotlin/Function0;", "fireAnalytics", "SheetScreenShown", "(Lkotlin/jvm/functions/Function0;LS0/k;I)V", "SheetShown$group_subscription_compose_release", "(Ljava/lang/String;LS0/k;I)V", "SheetShown", "subscribeToGroupClick$group_subscription_compose_release", "(Ljava/lang/String;)V", "subscribeToGroupClick", "nextTimeClick$group_subscription_compose_release", "nextTimeClick", "close$group_subscription_compose_release", "close", "ErrorShown$group_subscription_compose_release", "ErrorShown", "retryClick$group_subscription_compose_release", "retryClick", "cancelClick$group_subscription_compose_release", "cancelClick", "successShown$group_subscription_compose_release", "successShown", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isErrorState", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isErrorState$group_subscription_compose_release", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicReference;", "Lcom/vk/id/group/subscription/common/style/GroupSubscriptionStyle;", "style", "Ljava/util/concurrent/atomic/AtomicReference;", "getStyle$group_subscription_compose_release", "()Ljava/util/concurrent/atomic/AtomicReference;", "groupId", "getGroupId$group_subscription_compose_release", "group-subscription-compose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class GroupSubscriptionAnalytics {

    @NotNull
    public static final GroupSubscriptionAnalytics INSTANCE = new GroupSubscriptionAnalytics();

    @NotNull
    private static final AtomicBoolean isErrorState = new AtomicBoolean(false);

    @NotNull
    private static final AtomicReference<GroupSubscriptionStyle> style = new AtomicReference<>(null);

    @NotNull
    private static final AtomicReference<String> groupId = new AtomicReference<>(null);
    public static final int $stable = 8;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AbstractC5434v.a.values().length];
            try {
                iArr[AbstractC5434v.a.ON_RESUME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private GroupSubscriptionAnalytics() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ErrorShown$lambda$4$lambda$3(String str) {
        INSTANCE.track("community_follow_error_show", str);
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ErrorShown$lambda$5(GroupSubscriptionAnalytics groupSubscriptionAnalytics, String str, int i11, InterfaceC3967k interfaceC3967k, int i12) {
        groupSubscriptionAnalytics.ErrorShown$group_subscription_compose_release(str, interfaceC3967k, C2652m.e(i11 | 1));
        return Unit.f71690a;
    }

    private final void SheetScreenShown(final Function0<Unit> function0, InterfaceC3967k interfaceC3967k, final int i11) {
        int i12;
        C3969l u11 = interfaceC3967k.u(2002752177);
        if ((i11 & 6) == 0) {
            i12 = (u11.F(function0) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i12 & 3) == 2 && u11.b()) {
            u11.j();
        } else {
            final InterfaceC3978p0 l11 = n1.l(function0, u11);
            final InterfaceC3978p0 l12 = n1.l(u11.m(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner()), u11);
            T value = l12.getValue();
            u11.o(68777559);
            boolean n11 = u11.n(l12) | u11.n(l11);
            Object C11 = u11.C();
            if (n11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new Function1() { // from class: fa.d
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        M SheetScreenShown$lambda$9$lambda$8;
                        SheetScreenShown$lambda$9$lambda$8 = GroupSubscriptionAnalytics.SheetScreenShown$lambda$9$lambda$8(InterfaceC3978p0.this, l11, (N) obj);
                        return SheetScreenShown$lambda$9$lambda$8;
                    }
                };
                u11.x(C11);
            }
            u11.k();
            Q.c(value, (Function1) C11, u11);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new Function2() { // from class: fa.e
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit SheetScreenShown$lambda$10;
                    int intValue = ((Integer) obj2).intValue();
                    SheetScreenShown$lambda$10 = GroupSubscriptionAnalytics.SheetScreenShown$lambda$10(GroupSubscriptionAnalytics.this, function0, i11, (InterfaceC3967k) obj, intValue);
                    return SheetScreenShown$lambda$10;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SheetScreenShown$lambda$10(GroupSubscriptionAnalytics groupSubscriptionAnalytics, Function0 function0, int i11, InterfaceC3967k interfaceC3967k, int i12) {
        groupSubscriptionAnalytics.SheetScreenShown(function0, interfaceC3967k, C2652m.e(i11 | 1));
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final M SheetScreenShown$lambda$9$lambda$8(A1 a12, final A1 a13, N DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        final AbstractC5434v lifecycle = ((J) a12.getValue()).getLifecycle();
        final G g10 = new G() { // from class: fa.f
            @Override // androidx.lifecycle.G
            public final void onStateChanged(J j11, AbstractC5434v.a aVar) {
                GroupSubscriptionAnalytics.SheetScreenShown$lambda$9$lambda$8$lambda$6(A1.this, j11, aVar);
            }
        };
        lifecycle.a(g10);
        return new M() { // from class: com.vk.id.group.subscription.compose.analytics.GroupSubscriptionAnalytics$SheetScreenShown$lambda$9$lambda$8$$inlined$onDispose$1
            @Override // S0.M
            public void dispose() {
                AbstractC5434v.this.e(g10);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SheetScreenShown$lambda$9$lambda$8$lambda$6(A1 a12, J j11, AbstractC5434v.a event) {
        Intrinsics.checkNotNullParameter(j11, "<unused var>");
        Intrinsics.checkNotNullParameter(event, "event");
        if (WhenMappings.$EnumSwitchMapping$0[event.ordinal()] == 1) {
            ((Function0) a12.getValue()).invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SheetShown$lambda$1$lambda$0(String str) {
        INSTANCE.track("community_follow_modal_window_show", str);
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SheetShown$lambda$2(GroupSubscriptionAnalytics groupSubscriptionAnalytics, String str, int i11, InterfaceC3967k interfaceC3967k, int i12) {
        groupSubscriptionAnalytics.SheetShown$group_subscription_compose_release(str, interfaceC3967k, C2652m.e(i11 | 1));
        return Unit.f71690a;
    }

    private final VKIDAnalytics.EventParam appIdParam() {
        return new VKIDAnalytics.EventParam("app_id", null, h.w0(VKID.INSTANCE.getInstance().getClientId()), 2, null);
    }

    private final VKIDAnalytics.EventParam groupIdParam() {
        return new VKIDAnalytics.EventParam("group_id", groupId.get(), null, 4, null);
    }

    private final VKIDAnalytics.EventParam nowhereScreen() {
        return new VKIDAnalytics.EventParam("screen_current", "nowhere", null, 4, null);
    }

    private final VKIDAnalytics.EventParam themeParam() {
        GroupSubscriptionStyle groupSubscriptionStyle = style.get();
        String str = "light";
        if (groupSubscriptionStyle != null && !(groupSubscriptionStyle instanceof GroupSubscriptionStyle.Light)) {
            if (!(groupSubscriptionStyle instanceof GroupSubscriptionStyle.Dark)) {
                throw new o();
            }
            str = "dark";
        }
        return new VKIDAnalytics.EventParam("theme_type", str, null, 4, null);
    }

    private final void track(String eventName, String accessToken) {
        VKIDAnalytics.INSTANCE.trackEvent(accessToken, eventName, nowhereScreen(), appIdParam(), LanguageParamKt.vkidInternalLanguageParam(VKID.INSTANCE.getInstance().getContext()), themeParam(), groupIdParam());
    }

    public final void ErrorShown$group_subscription_compose_release(final String str, InterfaceC3967k interfaceC3967k, final int i11) {
        int i12;
        C3969l u11 = interfaceC3967k.u(2032583727);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(str) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.F(this) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && u11.b()) {
            u11.j();
        } else {
            u11.o(847683749);
            boolean z11 = (i12 & 14) == 4;
            Object C11 = u11.C();
            if (z11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new n(str, 2);
                u11.x(C11);
            }
            u11.k();
            SheetScreenShown((Function0) C11, u11, i12 & 112);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new Function2() { // from class: fa.a
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit ErrorShown$lambda$5;
                    int intValue = ((Integer) obj2).intValue();
                    ErrorShown$lambda$5 = GroupSubscriptionAnalytics.ErrorShown$lambda$5(GroupSubscriptionAnalytics.this, str, i11, (InterfaceC3967k) obj, intValue);
                    return ErrorShown$lambda$5;
                }
            });
        }
    }

    public final void SheetShown$group_subscription_compose_release(final String str, InterfaceC3967k interfaceC3967k, final int i11) {
        int i12;
        C3969l u11 = interfaceC3967k.u(-216950650);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(str) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.F(this) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && u11.b()) {
            u11.j();
        } else {
            u11.o(1789500725);
            boolean z11 = (i12 & 14) == 4;
            Object C11 = u11.C();
            if (z11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new b(str, 0);
                u11.x(C11);
            }
            u11.k();
            SheetScreenShown((Function0) C11, u11, i12 & 112);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new Function2() { // from class: fa.c
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit SheetShown$lambda$2;
                    int intValue = ((Integer) obj2).intValue();
                    SheetShown$lambda$2 = GroupSubscriptionAnalytics.SheetShown$lambda$2(GroupSubscriptionAnalytics.this, str, i11, (InterfaceC3967k) obj, intValue);
                    return SheetShown$lambda$2;
                }
            });
        }
    }

    public final void cancelClick$group_subscription_compose_release(String accessToken) {
        track("community_follow_error_cancel_click", accessToken);
    }

    public final void close$group_subscription_compose_release(String accessToken) {
        if (isErrorState.get()) {
            track("community_follow_error_close", accessToken);
        } else {
            track("community_follow_close", accessToken);
        }
    }

    @NotNull
    public final AtomicReference<String> getGroupId$group_subscription_compose_release() {
        return groupId;
    }

    @NotNull
    public final AtomicReference<GroupSubscriptionStyle> getStyle$group_subscription_compose_release() {
        return style;
    }

    @NotNull
    public final AtomicBoolean isErrorState$group_subscription_compose_release() {
        return isErrorState;
    }

    public final void nextTimeClick$group_subscription_compose_release(String accessToken) {
        track("community_follow_next_time_click", accessToken);
    }

    public final void retryClick$group_subscription_compose_release(String accessToken) {
        track("community_follow_error_retry_click", accessToken);
    }

    public final void subscribeToGroupClick$group_subscription_compose_release(String accessToken) {
        track("community_follow_click", accessToken);
    }

    public final void successShown$group_subscription_compose_release(String accessToken) {
        track("community_follow_success", accessToken);
    }
}

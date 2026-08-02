package com.vk.id.group.subscription.compose.ui;

import A0.h;
import B0.C2454a;
import B1.V;
import D1.InterfaceC2801g;
import S0.A0;
import S0.A1;
import S0.F1;
import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import U7.l;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.a0;
import androidx.compose.foundation.z;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.C5236c1;
import com.vk.id.AccessToken;
import com.vk.id.VKID;
import com.vk.id.group.subscription.common.fail.VKIDGroupSubscriptionFail;
import com.vk.id.group.subscription.common.style.GroupSubscriptionStyle;
import com.vk.id.group.subscription.compose.analytics.GroupSubscriptionAnalytics;
import com.vk.id.group.subscription.compose.interactor.GroupSubscriptionInteractor;
import com.vk.id.group.subscription.compose.ui.GroupSubscriptionSheetStatus;
import com.vk.id.group.subscription.compose.util.StylingUtilKt;
import e1.InterfaceC6250b;
import fd.InterfaceC6511n;
import i1.C6988h;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l1.y0;
import m3.C8060b;
import u0.InterfaceC9895d;
import u0.Q;
import xe.M;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
final class GroupSubscriptionSheetKt$GroupSubscriptionSheet$6$2 implements InterfaceC6511n<InterfaceC9895d, InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ A1<Function0<Unit>> $actualOnSuccess$delegate;
    final /* synthetic */ M $coroutineScope;
    final /* synthetic */ GroupSubscriptionInteractor $interactor;
    final /* synthetic */ Function1<VKIDGroupSubscriptionFail, Unit> $onFail;
    final /* synthetic */ GroupSubscriptionSheetState $state;
    final /* synthetic */ InterfaceC3978p0<GroupSubscriptionSheetStatus> $status;
    final /* synthetic */ GroupSubscriptionStyle $style;

    /* JADX WARN: Multi-variable type inference failed */
    GroupSubscriptionSheetKt$GroupSubscriptionSheet$6$2(GroupSubscriptionStyle groupSubscriptionStyle, InterfaceC3978p0<GroupSubscriptionSheetStatus> interfaceC3978p0, GroupSubscriptionInteractor groupSubscriptionInteractor, Function1<? super VKIDGroupSubscriptionFail, Unit> function1, GroupSubscriptionSheetState groupSubscriptionSheetState, M m11, A1<? extends Function0<Unit>> a12) {
        this.$style = groupSubscriptionStyle;
        this.$status = interfaceC3978p0;
        this.$interactor = groupSubscriptionInteractor;
        this.$onFail = function1;
        this.$state = groupSubscriptionSheetState;
        this.$coroutineScope = m11;
        this.$actualOnSuccess$delegate = a12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$7$lambda$2$lambda$1(InterfaceC3978p0 interfaceC3978p0, GroupSubscriptionSheetStatus groupSubscriptionSheetStatus, GroupSubscriptionSheetState groupSubscriptionSheetState, M m11, GroupSubscriptionInteractor groupSubscriptionInteractor, A1 a12) {
        Function0 GroupSubscriptionSheet$lambda$18;
        GroupSubscriptionAnalytics groupSubscriptionAnalytics = GroupSubscriptionAnalytics.INSTANCE;
        AccessToken accessToken = VKID.INSTANCE.getInstance().getAccessToken();
        groupSubscriptionAnalytics.subscribeToGroupClick$group_subscription_compose_release(accessToken != null ? accessToken.getToken() : null);
        GroupSubscriptionSheetStatus.Loaded loaded = (GroupSubscriptionSheetStatus.Loaded) groupSubscriptionSheetStatus;
        GroupSubscriptionSheetStatusData data = loaded.getData();
        GroupSubscriptionSheet$lambda$18 = GroupSubscriptionSheetKt.GroupSubscriptionSheet$lambda$18(a12);
        GroupSubscriptionSheetKt.subscribeToGroup(interfaceC3978p0, data, groupSubscriptionSheetState, m11, groupSubscriptionInteractor, GroupSubscriptionSheet$lambda$18, new GroupSubscriptionSheetStatus.Subscribing(loaded.getData()));
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$7$lambda$4$lambda$3(InterfaceC3978p0 interfaceC3978p0, GroupSubscriptionSheetStatus groupSubscriptionSheetStatus, GroupSubscriptionSheetState groupSubscriptionSheetState, M m11, GroupSubscriptionInteractor groupSubscriptionInteractor, A1 a12) {
        Function0 GroupSubscriptionSheet$lambda$18;
        GroupSubscriptionAnalytics groupSubscriptionAnalytics = GroupSubscriptionAnalytics.INSTANCE;
        AccessToken accessToken = VKID.INSTANCE.getInstance().getAccessToken();
        groupSubscriptionAnalytics.retryClick$group_subscription_compose_release(accessToken != null ? accessToken.getToken() : null);
        GroupSubscriptionSheetStatus.Failure failure = (GroupSubscriptionSheetStatus.Failure) groupSubscriptionSheetStatus;
        GroupSubscriptionSheetStatusData data = failure.getData();
        GroupSubscriptionSheet$lambda$18 = GroupSubscriptionSheetKt.GroupSubscriptionSheet$lambda$18(a12);
        GroupSubscriptionSheetKt.subscribeToGroup(interfaceC3978p0, data, groupSubscriptionSheetState, m11, groupSubscriptionInteractor, GroupSubscriptionSheet$lambda$18, new GroupSubscriptionSheetStatus.Resubscribing(failure.getData()));
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$7$lambda$6$lambda$5(InterfaceC3978p0 interfaceC3978p0, GroupSubscriptionSheetStatus groupSubscriptionSheetStatus, GroupSubscriptionSheetState groupSubscriptionSheetState, M m11, GroupSubscriptionInteractor groupSubscriptionInteractor, A1 a12) {
        Function0 GroupSubscriptionSheet$lambda$18;
        GroupSubscriptionSheetStatus.Resubscribing resubscribing = (GroupSubscriptionSheetStatus.Resubscribing) groupSubscriptionSheetStatus;
        GroupSubscriptionSheetStatusData data = resubscribing.getData();
        GroupSubscriptionSheet$lambda$18 = GroupSubscriptionSheetKt.GroupSubscriptionSheet$lambda$18(a12);
        GroupSubscriptionSheetKt.subscribeToGroup(interfaceC3978p0, data, groupSubscriptionSheetState, m11, groupSubscriptionInteractor, GroupSubscriptionSheet$lambda$18, new GroupSubscriptionSheetStatus.Resubscribing(resubscribing.getData()));
        return Unit.f71690a;
    }

    @Override // fd.InterfaceC6511n
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC9895d interfaceC9895d, InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC9895d, interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC9895d ModalBottomSheet, InterfaceC3967k interfaceC3967k, int i11) {
        e b11;
        final GroupSubscriptionSheetState groupSubscriptionSheetState;
        GroupSubscriptionSheetState groupSubscriptionSheetState2;
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        Intrinsics.checkNotNullParameter(ModalBottomSheet, "$this$ModalBottomSheet");
        if ((i11 & 17) == 16 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
            return;
        }
        b11 = androidx.compose.foundation.e.b(C6988h.a(T.f(a0.s(a0.e(a0.u(androidx.compose.ui.c.b(z.c(e.f40358c0, z.b(interfaceC3967k2), 14), C5236c1.a(), new Q(3)), 3), 1.0f), 344, 800), 16), h.b(this.$style.getCornersStyle().getRadiusDp())), StylingUtilKt.backgroundColor(this.$style, interfaceC3967k2, 0), y0.a());
        e1.d e11 = InterfaceC6250b.a.e();
        final InterfaceC3978p0<GroupSubscriptionSheetStatus> interfaceC3978p0 = this.$status;
        final GroupSubscriptionInteractor groupSubscriptionInteractor = this.$interactor;
        Function1<VKIDGroupSubscriptionFail, Unit> function1 = this.$onFail;
        GroupSubscriptionStyle groupSubscriptionStyle = this.$style;
        final GroupSubscriptionSheetState groupSubscriptionSheetState3 = this.$state;
        final M m11 = this.$coroutineScope;
        final A1<Function0<Unit>> a12 = this.$actualOnSuccess$delegate;
        V f7 = C5185h.f(e11, false);
        int I11 = interfaceC3967k2.I();
        A0 d11 = interfaceC3967k2.d();
        e f11 = androidx.compose.ui.c.f(interfaceC3967k2, b11);
        InterfaceC2801g.f5440U.getClass();
        Function0 a11 = InterfaceC2801g.a.a();
        if (interfaceC3967k2.v() == null) {
            C8060b.c();
            throw null;
        }
        interfaceC3967k2.i();
        if (interfaceC3967k2.t()) {
            interfaceC3967k2.H(a11);
        } else {
            interfaceC3967k2.e();
        }
        Function2 d12 = C2454a.d(interfaceC3967k2, f7, interfaceC3967k2, d11);
        if (interfaceC3967k2.t() || !Intrinsics.d(interfaceC3967k2.C(), Integer.valueOf(I11))) {
            Nk.a.d(d12, I11, interfaceC3967k2, I11);
        }
        F1.b(interfaceC3967k2, f11, InterfaceC2801g.a.f());
        GroupSubscriptionAnalytics.INSTANCE.isErrorState$group_subscription_compose_release().set((interfaceC3978p0.getValue() instanceof GroupSubscriptionSheetStatus.Failure) || (interfaceC3978p0.getValue() instanceof GroupSubscriptionSheetStatus.Resubscribing));
        GroupSubscriptionSheetStatus value = interfaceC3978p0.getValue();
        if (value instanceof GroupSubscriptionSheetStatus.Init) {
            interfaceC3967k2.o(880054567);
            interfaceC3967k2.k();
        } else if (value instanceof GroupSubscriptionSheetStatus.Loaded) {
            interfaceC3967k2.o(880057490);
            interfaceC3967k2.o(880057247);
            boolean F11 = interfaceC3967k2.F(groupSubscriptionInteractor);
            Object C11 = interfaceC3967k2.C();
            if (F11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new GroupSubscriptionSheetKt$GroupSubscriptionSheet$6$2$1$1$1(groupSubscriptionInteractor, null);
                interfaceC3967k2.x(C11);
            }
            Function1 function12 = (Function1) C11;
            interfaceC3967k2.k();
            GroupSubscriptionSheetStatus.Loaded loaded = (GroupSubscriptionSheetStatus.Loaded) value;
            interfaceC3967k2.o(880059908);
            boolean n11 = interfaceC3967k2.n(interfaceC3978p0) | interfaceC3967k2.n(value) | interfaceC3967k2.n(groupSubscriptionSheetState3) | interfaceC3967k2.F(m11) | interfaceC3967k2.F(groupSubscriptionInteractor) | interfaceC3967k2.n(a12);
            Object C12 = interfaceC3967k2.C();
            if (n11 || C12 == InterfaceC3967k.a.a()) {
                final GroupSubscriptionSheetStatus.Loaded loaded2 = (GroupSubscriptionSheetStatus.Loaded) value;
                Function0 function0 = new Function0() { // from class: com.vk.id.group.subscription.compose.ui.b
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit invoke$lambda$7$lambda$2$lambda$1;
                        invoke$lambda$7$lambda$2$lambda$1 = GroupSubscriptionSheetKt$GroupSubscriptionSheet$6$2.invoke$lambda$7$lambda$2$lambda$1(InterfaceC3978p0.this, loaded2, groupSubscriptionSheetState3, m11, groupSubscriptionInteractor, a12);
                        return invoke$lambda$7$lambda$2$lambda$1;
                    }
                };
                groupSubscriptionSheetState2 = groupSubscriptionSheetState3;
                interfaceC3967k2.x(function0);
                C12 = function0;
            } else {
                groupSubscriptionSheetState2 = groupSubscriptionSheetState3;
            }
            interfaceC3967k2.k();
            GroupSubscriptionSheetKt.LoadedState(function12, function1, groupSubscriptionStyle, groupSubscriptionSheetState2, loaded, (Function0) C12, interfaceC3967k2, 0);
            interfaceC3967k2 = interfaceC3967k2;
            interfaceC3967k2.k();
        } else if (value instanceof GroupSubscriptionSheetStatus.Subscribing) {
            interfaceC3967k2.o(880080183);
            GroupSubscriptionSheetKt.SubscribingState(groupSubscriptionStyle, groupSubscriptionSheetState3, (GroupSubscriptionSheetStatus.Subscribing) value, function1, interfaceC3967k2, 0);
            interfaceC3967k2.k();
        } else if (value instanceof GroupSubscriptionSheetStatus.Failure) {
            interfaceC3967k2.o(880084574);
            interfaceC3967k2.o(880085659);
            boolean n12 = interfaceC3967k2.n(interfaceC3978p0) | interfaceC3967k2.n(value) | interfaceC3967k2.n(groupSubscriptionSheetState3) | interfaceC3967k2.F(m11) | interfaceC3967k2.F(groupSubscriptionInteractor) | interfaceC3967k2.n(a12);
            Object C13 = interfaceC3967k2.C();
            if (n12 || C13 == InterfaceC3967k.a.a()) {
                groupSubscriptionSheetState = groupSubscriptionSheetState3;
                final GroupSubscriptionSheetStatus.Failure failure = (GroupSubscriptionSheetStatus.Failure) value;
                Function0 function02 = new Function0() { // from class: com.vk.id.group.subscription.compose.ui.c
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit invoke$lambda$7$lambda$4$lambda$3;
                        invoke$lambda$7$lambda$4$lambda$3 = GroupSubscriptionSheetKt$GroupSubscriptionSheet$6$2.invoke$lambda$7$lambda$4$lambda$3(InterfaceC3978p0.this, failure, groupSubscriptionSheetState, m11, groupSubscriptionInteractor, a12);
                        return invoke$lambda$7$lambda$4$lambda$3;
                    }
                };
                interfaceC3967k2.x(function02);
                C13 = function02;
            } else {
                groupSubscriptionSheetState = groupSubscriptionSheetState3;
            }
            interfaceC3967k2.k();
            interfaceC3967k2 = interfaceC3967k2;
            GroupSubscriptionSheetKt.FailureState(groupSubscriptionStyle, groupSubscriptionSheetState, function1, (Function0) C13, interfaceC3967k2, 0);
            interfaceC3967k2.k();
        } else {
            if (!(value instanceof GroupSubscriptionSheetStatus.Resubscribing)) {
                throw l.c(interfaceC3967k2, 880053436);
            }
            interfaceC3967k2.o(880106176);
            interfaceC3967k2.o(880107447);
            boolean n13 = interfaceC3967k2.n(interfaceC3978p0) | interfaceC3967k2.n(value) | interfaceC3967k2.n(groupSubscriptionSheetState3) | interfaceC3967k2.F(m11) | interfaceC3967k2.F(groupSubscriptionInteractor) | interfaceC3967k2.n(a12);
            Object C14 = interfaceC3967k2.C();
            if (n13 || C14 == InterfaceC3967k.a.a()) {
                final GroupSubscriptionSheetStatus.Resubscribing resubscribing = (GroupSubscriptionSheetStatus.Resubscribing) value;
                Function0 function03 = new Function0() { // from class: com.vk.id.group.subscription.compose.ui.d
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit invoke$lambda$7$lambda$6$lambda$5;
                        invoke$lambda$7$lambda$6$lambda$5 = GroupSubscriptionSheetKt$GroupSubscriptionSheet$6$2.invoke$lambda$7$lambda$6$lambda$5(InterfaceC3978p0.this, resubscribing, groupSubscriptionSheetState3, m11, groupSubscriptionInteractor, a12);
                        return invoke$lambda$7$lambda$6$lambda$5;
                    }
                };
                interfaceC3967k2.x(function03);
                C14 = function03;
            }
            interfaceC3967k2.k();
            interfaceC3967k2 = interfaceC3967k2;
            GroupSubscriptionSheetKt.ResubscribingState(groupSubscriptionStyle, groupSubscriptionSheetState3, function1, (Function0) C14, interfaceC3967k2, 0);
            interfaceC3967k2.k();
        }
        interfaceC3967k2.f();
    }
}

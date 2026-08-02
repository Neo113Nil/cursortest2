package com.vk.id.group.subscription.compose.ui;

import A0.h;
import B0.C2454a;
import B1.InterfaceC2547p;
import B1.V;
import B30.n;
import Bl0.C2652m;
import D1.InterfaceC2801g;
import E0.C2942q;
import Fr.g;
import G1.i;
import Me.k;
import P0.B0;
import P0.C3787x1;
import P0.EnumC3790y1;
import P0.InterfaceC3793z1;
import P0.K1;
import P0.N1;
import P0.p2;
import P1.F;
import Pk0.f;
import S0.A0;
import S0.A1;
import S0.C3969l;
import S0.C3991w0;
import S0.D;
import S0.D1;
import S0.F1;
import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import S0.J0;
import S0.Q;
import S0.n1;
import a1.C4912a;
import android.content.Context;
import androidx.compose.foundation.layout.B;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.C5187j;
import androidx.compose.foundation.layout.C5191n;
import androidx.compose.foundation.layout.C5193p;
import androidx.compose.foundation.layout.C5194q;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.X;
import androidx.compose.foundation.layout.Y;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.K0;
import androidx.compose.ui.platform.Q1;
import b1.C5503f;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.vk.id.AccessToken;
import com.vk.id.VKID;
import com.vk.id.group.subscription.common.fail.VKIDGroupSubscriptionFail;
import com.vk.id.group.subscription.common.style.GroupSubscriptionStyle;
import com.vk.id.group.subscription.compose.R$drawable;
import com.vk.id.group.subscription.compose.R$plurals;
import com.vk.id.group.subscription.compose.R$string;
import com.vk.id.group.subscription.compose.analytics.GroupSubscriptionAnalytics;
import com.vk.id.group.subscription.compose.close.CloseIconKt;
import com.vk.id.group.subscription.compose.interactor.GroupSubscriptionInteractor;
import com.vk.id.group.subscription.compose.progress.CircleProgressKt;
import com.vk.id.group.subscription.compose.snackbar.GroupSubscriptionSnackbarKt;
import com.vk.id.group.subscription.compose.storage.GroupSubscriptionPrefsStorage;
import com.vk.id.group.subscription.compose.ui.GroupSubscriptionSheetKt;
import com.vk.id.group.subscription.compose.ui.GroupSubscriptionSheetState;
import com.vk.id.group.subscription.compose.ui.GroupSubscriptionSheetStatus;
import com.vk.id.group.subscription.compose.ui.GroupSubscriptionSheetStatusData;
import com.vk.id.group.subscription.compose.util.PrimaryButtonKt;
import com.vk.id.group.subscription.compose.util.SecondaryButtonKt;
import com.vk.id.group.subscription.compose.util.StylingUtilKt;
import com.vk.id.group.subscription.compose.util.TightWrapTextKt;
import com.vk.id.group.subscription.compose.util.UserImageTransformation;
import d70.C6098a;
import e1.InterfaceC6250b;
import e1.d;
import fd.InterfaceC6511n;
import ha0.C6903a;
import i1.C6988h;
import ja.C7325e;
import ja.C7326f;
import ja.C7328h;
import ja.C7330j;
import ja.v;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l1.C7807Z;
import l1.C7811b0;
import m3.C8060b;
import m5.C8085h;
import n0.C8366G;
import org.jetbrains.annotations.NotNull;
import u0.C9896e;
import u0.E;
import u0.InterfaceC9894c;
import u0.InterfaceC9895d;
import u0.InterfaceC9904m;
import v5.C10234h;
import xe.C10727i;
import xe.H0;
import xe.M;
import y5.C10838a;

@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002\u001a!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\b\u0010\t\u001aw\u0010\u0015\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u00002\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\r2\u0014\b\u0002\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00070\u00122\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0015\u0010\u0016\u001aS\u0010!\u001a\u00020\u00072\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\r2\u0006\u0010 \u001a\u00020\u0018H\u0002¢\u0006\u0004\b!\u0010\"\u001ag\u0010(\u001a\u00020\u00072\u001c\u0010%\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070#\u0012\u0006\u0012\u0004\u0018\u00010$0\u00122\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00070\u00122\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020&2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00070\rH\u0001¢\u0006\u0004\b(\u0010)\u001a;\u0010+\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020*2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00070\u0012H\u0001¢\u0006\u0004\b+\u0010,\u001aA\u0010.\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00002\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00070\u00122\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00070\rH\u0001¢\u0006\u0004\b.\u0010/\u001aA\u00100\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00002\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00070\u00122\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00070\rH\u0001¢\u0006\u0004\b0\u0010/\u001aO\u00102\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00002\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00070\u00122\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00070\r2\f\u00101\u001a\b\u0012\u0004\u0012\u00020\u00070\rH\u0003¢\u0006\u0004\b2\u00103\u001aW\u00105\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00070\u00122\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00070\r2\f\u00104\u001a\b\u0012\u0004\u0012\u00020\u00070\rH\u0003¢\u0006\u0004\b5\u00106\u001aS\u00108\u001a\u00020\u0007*\u0002072\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00070\r2\u0006\u0010\f\u001a\u00020\u00002\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00070\u00122\f\u00104\u001a\b\u0012\u0004\u0012\u00020\u00070\rH\u0003¢\u0006\u0004\b8\u00109\u001a#\u0010:\u001a\u00020\u0007*\u0002072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u001aH\u0003¢\u0006\u0004\b:\u0010;\u001a#\u0010<\u001a\u00020\u0007*\u0002072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u001aH\u0003¢\u0006\u0004\b<\u0010;\u001a7\u0010=\u001a\u00020\u0007*\u0002072\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00070\u00122\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001aH\u0003¢\u0006\u0004\b=\u0010>\u001aS\u0010B\u001a\u000e\u0012\u0004\u0012\u00020@\u0012\u0004\u0012\u00020\u00070\u00122\u0012\u0010?\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00070\u00122\u0012\u0010A\u001a\u000e\u0012\u0004\u0012\u00020@\u0012\u0004\u0012\u00020\u00070\u00122\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\f\u001a\u00020\u0000H\u0003¢\u0006\u0004\bB\u0010C\u001a\u000f\u0010D\u001a\u00020\u0000H\u0003¢\u0006\u0004\bD\u0010\u0002¨\u0006N²\u0006\u000e\u0010E\u001a\u00020@8\n@\nX\u008a\u008e\u0002²\u0006\u0018\u0010F\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00070\u00128\nX\u008a\u0084\u0002²\u0006\u000e\u0010G\u001a\u00020@8\n@\nX\u008a\u008e\u0002²\u0006\u0012\u0010H\u001a\b\u0012\u0004\u0012\u00020\u00070\r8\nX\u008a\u0084\u0002²\u0006\u000e\u0010I\u001a\u00020@8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010J\u001a\u00020@8\n@\nX\u008a\u008e\u0002²\u0006\"\u0010K\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070#\u0012\u0006\u0012\u0004\u0018\u00010$0\u00128\nX\u008a\u0084\u0002²\u0006\u000e\u0010M\u001a\u00020L8\n@\nX\u008a\u008e\u0002"}, d2 = {"Lcom/vk/id/group/subscription/compose/ui/GroupSubscriptionSheetState;", "rememberGroupSubscriptionSheetState", "(LS0/k;I)Lcom/vk/id/group/subscription/compose/ui/GroupSubscriptionSheetState;", "LP0/N1;", "snackbarHostState", "Lcom/vk/id/group/subscription/common/style/GroupSubscriptionStyle;", "style", "", "GroupSubscriptionSnackbarHost", "(LP0/N1;Lcom/vk/id/group/subscription/common/style/GroupSubscriptionStyle;LS0/k;II)V", "Landroidx/compose/ui/e;", "modifier", "state", "Lkotlin/Function0;", "", "accessTokenProvider", "groupId", "onSuccess", "Lkotlin/Function1;", "Lcom/vk/id/group/subscription/common/fail/VKIDGroupSubscriptionFail;", "onFail", "GroupSubscriptionSheet", "(Landroidx/compose/ui/e;Lcom/vk/id/group/subscription/compose/ui/GroupSubscriptionSheetState;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;LP0/N1;Lcom/vk/id/group/subscription/common/style/GroupSubscriptionStyle;LS0/k;II)V", "LS0/p0;", "Lcom/vk/id/group/subscription/compose/ui/GroupSubscriptionSheetStatus;", "status", "Lcom/vk/id/group/subscription/compose/ui/GroupSubscriptionSheetStatusData;", "data", "Lxe/M;", "coroutineScope", "Lcom/vk/id/group/subscription/compose/interactor/GroupSubscriptionInteractor;", "interactor", "progressStatus", "subscribeToGroup", "(LS0/p0;Lcom/vk/id/group/subscription/compose/ui/GroupSubscriptionSheetStatusData;Lcom/vk/id/group/subscription/compose/ui/GroupSubscriptionSheetState;Lxe/M;Lcom/vk/id/group/subscription/compose/interactor/GroupSubscriptionInteractor;Lkotlin/jvm/functions/Function0;Lcom/vk/id/group/subscription/compose/ui/GroupSubscriptionSheetStatus;)V", "Lkotlin/coroutines/d;", "", "saveDisplay", "Lcom/vk/id/group/subscription/compose/ui/GroupSubscriptionSheetStatus$Loaded;", "onSubscribeButtonClick", "LoadedState", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/vk/id/group/subscription/common/style/GroupSubscriptionStyle;Lcom/vk/id/group/subscription/compose/ui/GroupSubscriptionSheetState;Lcom/vk/id/group/subscription/compose/ui/GroupSubscriptionSheetStatus$Loaded;Lkotlin/jvm/functions/Function0;LS0/k;I)V", "Lcom/vk/id/group/subscription/compose/ui/GroupSubscriptionSheetStatus$Subscribing;", "SubscribingState", "(Lcom/vk/id/group/subscription/common/style/GroupSubscriptionStyle;Lcom/vk/id/group/subscription/compose/ui/GroupSubscriptionSheetState;Lcom/vk/id/group/subscription/compose/ui/GroupSubscriptionSheetStatus$Subscribing;Lkotlin/jvm/functions/Function1;LS0/k;I)V", "onRetry", "ResubscribingState", "(Lcom/vk/id/group/subscription/common/style/GroupSubscriptionStyle;Lcom/vk/id/group/subscription/compose/ui/GroupSubscriptionSheetState;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;LS0/k;I)V", "FailureState", "retryButtonContent", "FailureDataState", "(Lcom/vk/id/group/subscription/common/style/GroupSubscriptionStyle;Lcom/vk/id/group/subscription/compose/ui/GroupSubscriptionSheetState;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;LS0/k;I)V", "subscribeButtonContent", "DataState", "(Lcom/vk/id/group/subscription/common/style/GroupSubscriptionStyle;Lcom/vk/id/group/subscription/compose/ui/GroupSubscriptionSheetState;Lcom/vk/id/group/subscription/compose/ui/GroupSubscriptionSheetStatusData;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;LS0/k;I)V", "Lu0/d;", "DataStateButtons", "(Lu0/d;Lcom/vk/id/group/subscription/common/style/GroupSubscriptionStyle;Lkotlin/jvm/functions/Function0;Lcom/vk/id/group/subscription/compose/ui/GroupSubscriptionSheetState;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;LS0/k;I)V", "DataStateSubscribers", "(Lu0/d;Lcom/vk/id/group/subscription/common/style/GroupSubscriptionStyle;Lcom/vk/id/group/subscription/compose/ui/GroupSubscriptionSheetStatusData;LS0/k;I)V", "DataStateLabels", "DataStateHeader", "(Lu0/d;Lkotlin/jvm/functions/Function1;Lcom/vk/id/group/subscription/compose/ui/GroupSubscriptionSheetState;Lcom/vk/id/group/subscription/compose/ui/GroupSubscriptionSheetStatusData;LS0/k;I)V", "onAuthStatusChange", "", "onShowBottomSheetChange", "processSheetShow", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lxe/M;Lcom/vk/id/group/subscription/compose/ui/GroupSubscriptionSheetState;LS0/k;I)Lkotlin/jvm/functions/Function1;", "rememberGroupSubscriptionSheetStateInternal", "showBottomSheet", "rememberedOnFail", "isSuccess", "actualOnSuccess", "wasVisible", "once", "rememberedSaveDisplay", "LP0/y1;", "previousValue", "group-subscription-compose_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class GroupSubscriptionSheetKt {
    private static final void DataState(final GroupSubscriptionStyle groupSubscriptionStyle, final GroupSubscriptionSheetState groupSubscriptionSheetState, GroupSubscriptionSheetStatusData groupSubscriptionSheetStatusData, final Function1<? super VKIDGroupSubscriptionFail, Unit> function1, final Function0<Unit> function0, final Function2<? super InterfaceC3967k, ? super Integer, Unit> function2, InterfaceC3967k interfaceC3967k, final int i11) {
        int i12;
        Function1<? super VKIDGroupSubscriptionFail, Unit> function12;
        GroupSubscriptionSheetStatusData groupSubscriptionSheetStatusData2;
        C3969l u11 = interfaceC3967k.u(651367239);
        if ((i11 & 6) == 0) {
            i12 = (u11.F(groupSubscriptionStyle) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.n(groupSubscriptionSheetState) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.n(groupSubscriptionSheetStatusData) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i11 & 3072) == 0) {
            function12 = function1;
            i12 |= u11.F(function12) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        } else {
            function12 = function1;
        }
        if ((i11 & 24576) == 0) {
            i12 |= u11.F(function0) ? 16384 : 8192;
        }
        if ((196608 & i11) == 0) {
            i12 |= u11.F(function2) ? 131072 : 65536;
        }
        if ((74899 & i12) == 74898 && u11.b()) {
            u11.j();
            groupSubscriptionSheetStatusData2 = groupSubscriptionSheetStatusData;
        } else {
            e.a aVar = e.f40358c0;
            e f7 = T.f(aVar, 16);
            C5194q a11 = C5193p.a(C5179b.g(), InterfaceC6250b.a.g(), u11, 48);
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f11 = androidx.compose.ui.c.f(u11, f7);
            Function0 a12 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a12);
            } else {
                u11.e();
            }
            Function2 g10 = K00.b.g(u11, a11, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                Ep.a.d(I11, u11, I11, g10);
            }
            F1.b(u11, f11, InterfaceC2801g.a.f());
            C9896e c9896e = C9896e.f99653a;
            int i13 = i12 >> 6;
            int i14 = i12 << 3;
            DataStateHeader(c9896e, function12, groupSubscriptionSheetState, groupSubscriptionSheetStatusData, u11, (i14 & 7168) | (i13 & 112) | 6 | (i14 & 896));
            groupSubscriptionSheetStatusData2 = groupSubscriptionSheetStatusData;
            E.a(u11, a0.f(aVar, 12));
            int i15 = (i14 & 112) | 6;
            int i16 = (i12 & 896) | i15;
            DataStateLabels(c9896e, groupSubscriptionStyle, groupSubscriptionSheetStatusData2, u11, i16);
            E.a(u11, a0.f(aVar, 8));
            DataStateSubscribers(c9896e, groupSubscriptionStyle, groupSubscriptionSheetStatusData2, u11, i16);
            E.a(u11, a0.f(aVar, 20));
            DataStateButtons(c9896e, groupSubscriptionStyle, function0, groupSubscriptionSheetState, function1, function2, u11, i15 | (i13 & 896) | ((i12 << 6) & 7168) | (57344 & i14) | (i12 & 458752));
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            final GroupSubscriptionSheetStatusData groupSubscriptionSheetStatusData3 = groupSubscriptionSheetStatusData2;
            m02.G(new Function2() { // from class: ja.l
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit DataState$lambda$51;
                    int intValue = ((Integer) obj2).intValue();
                    Function2 function22 = function2;
                    int i17 = i11;
                    DataState$lambda$51 = GroupSubscriptionSheetKt.DataState$lambda$51(GroupSubscriptionStyle.this, groupSubscriptionSheetState, groupSubscriptionSheetStatusData3, function1, function0, function22, i17, (InterfaceC3967k) obj, intValue);
                    return DataState$lambda$51;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DataState$lambda$51(GroupSubscriptionStyle groupSubscriptionStyle, GroupSubscriptionSheetState groupSubscriptionSheetState, GroupSubscriptionSheetStatusData groupSubscriptionSheetStatusData, Function1 function1, Function0 function0, Function2 function2, int i11, InterfaceC3967k interfaceC3967k, int i12) {
        DataState(groupSubscriptionStyle, groupSubscriptionSheetState, groupSubscriptionSheetStatusData, function1, function0, function2, interfaceC3967k, C2652m.e(i11 | 1));
        return Unit.f71690a;
    }

    private static final void DataStateButtons(final InterfaceC9895d interfaceC9895d, final GroupSubscriptionStyle groupSubscriptionStyle, final Function0<Unit> function0, final GroupSubscriptionSheetState groupSubscriptionSheetState, final Function1<? super VKIDGroupSubscriptionFail, Unit> function1, final Function2<? super InterfaceC3967k, ? super Integer, Unit> function2, InterfaceC3967k interfaceC3967k, final int i11) {
        int i12;
        C3969l u11 = interfaceC3967k.u(1809829193);
        if ((i11 & 48) == 0) {
            i12 = (u11.F(groupSubscriptionStyle) ? 32 : 16) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.F(function0) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i11 & 3072) == 0) {
            i12 |= u11.n(groupSubscriptionSheetState) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i11 & 24576) == 0) {
            i12 |= u11.F(function1) ? 16384 : 8192;
        }
        if ((196608 & i11) == 0) {
            i12 |= u11.F(function2) ? 131072 : 65536;
        }
        if ((74897 & i12) == 74896 && u11.b()) {
            u11.j();
        } else {
            int i13 = (i12 >> 3) & 14;
            PrimaryButtonKt.PrimaryButton(groupSubscriptionStyle, "group_subscription_subscribe", function0, a1.c.c(548176143, new Function2<InterfaceC3967k, Integer, Unit>() { // from class: com.vk.id.group.subscription.compose.ui.GroupSubscriptionSheetKt$DataStateButtons$1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k2, Integer num) {
                    invoke(interfaceC3967k2, num.intValue());
                    return Unit.f71690a;
                }

                public final void invoke(InterfaceC3967k interfaceC3967k2, int i14) {
                    if ((i14 & 3) == 2 && interfaceC3967k2.b()) {
                        interfaceC3967k2.j();
                    } else {
                        function2.invoke(interfaceC3967k2, 0);
                    }
                }
            }, u11), u11, i13 | 3120 | (i12 & 896));
            E.a(u11, a0.f(e.f40358c0, 12));
            String a11 = i.a(u11, R$string.vkid_group_subscription_secondary);
            u11.o(-795245409);
            boolean z11 = ((i12 & 7168) == 2048) | ((i12 & 57344) == 16384);
            Object C11 = u11.C();
            if (z11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new Function0() { // from class: ja.p
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit DataStateButtons$lambda$53$lambda$52;
                        DataStateButtons$lambda$53$lambda$52 = GroupSubscriptionSheetKt.DataStateButtons$lambda$53$lambda$52(GroupSubscriptionSheetState.this, function1);
                        return DataStateButtons$lambda$53$lambda$52;
                    }
                };
                u11.x(C11);
            }
            u11.k();
            SecondaryButtonKt.SecondaryButton(groupSubscriptionStyle, "group_subscription_later", a11, (Function0) C11, u11, i13 | 48);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new Function2() { // from class: ja.q
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit DataStateButtons$lambda$54;
                    int intValue = ((Integer) obj2).intValue();
                    Function2 function22 = function2;
                    int i14 = i11;
                    DataStateButtons$lambda$54 = GroupSubscriptionSheetKt.DataStateButtons$lambda$54(InterfaceC9895d.this, groupSubscriptionStyle, function0, groupSubscriptionSheetState, function1, function22, i14, (InterfaceC3967k) obj, intValue);
                    return DataStateButtons$lambda$54;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DataStateButtons$lambda$53$lambda$52(GroupSubscriptionSheetState groupSubscriptionSheetState, Function1 function1) {
        GroupSubscriptionAnalytics groupSubscriptionAnalytics = GroupSubscriptionAnalytics.INSTANCE;
        AccessToken accessToken = VKID.INSTANCE.getInstance().getAccessToken();
        groupSubscriptionAnalytics.nextTimeClick$group_subscription_compose_release(accessToken != null ? accessToken.getToken() : null);
        groupSubscriptionSheetState.hide();
        function1.invoke(new VKIDGroupSubscriptionFail.Cancel());
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DataStateButtons$lambda$54(InterfaceC9895d interfaceC9895d, GroupSubscriptionStyle groupSubscriptionStyle, Function0 function0, GroupSubscriptionSheetState groupSubscriptionSheetState, Function1 function1, Function2 function2, int i11, InterfaceC3967k interfaceC3967k, int i12) {
        DataStateButtons(interfaceC9895d, groupSubscriptionStyle, function0, groupSubscriptionSheetState, function1, function2, interfaceC3967k, C2652m.e(i11 | 1));
        return Unit.f71690a;
    }

    private static final void DataStateHeader(final InterfaceC9895d interfaceC9895d, final Function1<? super VKIDGroupSubscriptionFail, Unit> function1, final GroupSubscriptionSheetState groupSubscriptionSheetState, GroupSubscriptionSheetStatusData groupSubscriptionSheetStatusData, InterfaceC3967k interfaceC3967k, final int i11) {
        int i12;
        final GroupSubscriptionSheetStatusData groupSubscriptionSheetStatusData2;
        C3969l u11 = interfaceC3967k.u(-1256673908);
        if ((i11 & 48) == 0) {
            i12 = (u11.F(function1) ? 32 : 16) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.n(groupSubscriptionSheetState) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i11 & 3072) == 0) {
            groupSubscriptionSheetStatusData2 = groupSubscriptionSheetStatusData;
            i12 |= u11.n(groupSubscriptionSheetStatusData2) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        } else {
            groupSubscriptionSheetStatusData2 = groupSubscriptionSheetStatusData;
        }
        if ((i12 & 1169) == 1168 && u11.b()) {
            u11.j();
        } else {
            d.b i13 = InterfaceC6250b.a.i();
            e.a aVar = e.f40358c0;
            Y b11 = X.b(C5179b.f(), i13, u11, 48);
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f7 = androidx.compose.ui.c.f(u11, aVar);
            Function0 a11 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a11);
            } else {
                u11.e();
            }
            Function2 h11 = Cm.e.h(u11, b11, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                Ep.a.d(I11, u11, I11, h11);
            }
            F1.b(u11, f7, InterfaceC2801g.a.f());
            if (1.0f <= 0.0d) {
                throw new IllegalArgumentException(C2942q.b(1.0f, "invalid weight ", "; must be greater than zero").toString());
            }
            E.a(u11, new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
            u11.o(1797024825);
            boolean z11 = ((i12 & 896) == 256) | ((i12 & 112) == 32);
            Object C11 = u11.C();
            if (z11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new Function0() { // from class: ja.s
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit DataStateHeader$lambda$66$lambda$65$lambda$64;
                        DataStateHeader$lambda$66$lambda$65$lambda$64 = GroupSubscriptionSheetKt.DataStateHeader$lambda$66$lambda$65$lambda$64(GroupSubscriptionSheetState.this, function1);
                        return DataStateHeader$lambda$66$lambda$65$lambda$64;
                    }
                };
                u11.x(C11);
            }
            u11.k();
            CloseIconKt.CloseIcon((Function0) C11, u11, 0);
            u11.f();
            float f11 = 76;
            e n11 = a0.n(aVar, f11);
            V f12 = C5185h.f(InterfaceC6250b.a.o(), false);
            int I12 = u11.I();
            A0 d12 = u11.d();
            e f13 = androidx.compose.ui.c.f(u11, n11);
            Function0 a12 = InterfaceC2801g.a.a();
            u11.i();
            if (u11.t()) {
                u11.H(a12);
            } else {
                u11.e();
            }
            Function2 f14 = T7.E.f(u11, f12, u11, d12);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I12))) {
                Ep.a.d(I12, u11, I12, f14);
            }
            F1.b(u11, f13, InterfaceC2801g.a.f());
            C8085h.a(groupSubscriptionSheetStatusData2.getGroupImageUrl(), C6988h.a(T.j(a0.f(a0.r(aVar, 72), f11), 0.0f, 0.0f, 0.0f, 4, 7), h.e()), InterfaceC2547p.a.c(), u11, 1572912);
            float f15 = 48;
            C8366G.a(G1.e.a(R$drawable.vkid_sheet_vk_logo, u11, 0), null, T.j(aVar, f15, f15, 0.0f, 0.0f, 12), null, InterfaceC2547p.a.d(), 0.0f, null, u11, 24624, 104);
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new Function2() { // from class: ja.t
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit DataStateHeader$lambda$68;
                    int intValue = ((Integer) obj2).intValue();
                    GroupSubscriptionSheetStatusData groupSubscriptionSheetStatusData3 = groupSubscriptionSheetStatusData2;
                    int i14 = i11;
                    DataStateHeader$lambda$68 = GroupSubscriptionSheetKt.DataStateHeader$lambda$68(InterfaceC9895d.this, function1, groupSubscriptionSheetState, groupSubscriptionSheetStatusData3, i14, (InterfaceC3967k) obj, intValue);
                    return DataStateHeader$lambda$68;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DataStateHeader$lambda$66$lambda$65$lambda$64(GroupSubscriptionSheetState groupSubscriptionSheetState, Function1 function1) {
        GroupSubscriptionAnalytics groupSubscriptionAnalytics = GroupSubscriptionAnalytics.INSTANCE;
        AccessToken accessToken = VKID.INSTANCE.getInstance().getAccessToken();
        groupSubscriptionAnalytics.close$group_subscription_compose_release(accessToken != null ? accessToken.getToken() : null);
        groupSubscriptionSheetState.hide();
        function1.invoke(new VKIDGroupSubscriptionFail.Close());
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DataStateHeader$lambda$68(InterfaceC9895d interfaceC9895d, Function1 function1, GroupSubscriptionSheetState groupSubscriptionSheetState, GroupSubscriptionSheetStatusData groupSubscriptionSheetStatusData, int i11, InterfaceC3967k interfaceC3967k, int i12) {
        DataStateHeader(interfaceC9895d, function1, groupSubscriptionSheetState, groupSubscriptionSheetStatusData, interfaceC3967k, C2652m.e(i11 | 1));
        return Unit.f71690a;
    }

    private static final void DataStateLabels(final InterfaceC9895d interfaceC9895d, final GroupSubscriptionStyle groupSubscriptionStyle, final GroupSubscriptionSheetStatusData groupSubscriptionSheetStatusData, InterfaceC3967k interfaceC3967k, final int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        F f7;
        C3969l u11 = interfaceC3967k.u(1308295584);
        if ((i11 & 48) == 0) {
            i12 = (u11.F(groupSubscriptionStyle) ? 32 : 16) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.n(groupSubscriptionSheetStatusData) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i12 & 145) == 144 && u11.b()) {
            u11.j();
        } else {
            d.b a11 = InterfaceC6250b.a.a();
            C5179b.c b11 = C5179b.b();
            e.a aVar = e.f40358c0;
            Y b12 = X.b(b11, a11, u11, 54);
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f11 = androidx.compose.ui.c.f(u11, aVar);
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
            F1.b(u11, f11, InterfaceC2801g.a.f());
            C5191n.a(null, null, a1.c.c(147289434, new InterfaceC6511n<InterfaceC9894c, InterfaceC3967k, Integer, Unit>() { // from class: com.vk.id.group.subscription.compose.ui.GroupSubscriptionSheetKt$DataStateLabels$1$1
                @Override // fd.InterfaceC6511n
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC9894c interfaceC9894c, InterfaceC3967k interfaceC3967k2, Integer num) {
                    invoke(interfaceC9894c, interfaceC3967k2, num.intValue());
                    return Unit.f71690a;
                }

                public final void invoke(InterfaceC9894c BoxWithConstraints, InterfaceC3967k interfaceC3967k2, int i16) {
                    int i17;
                    F f12;
                    Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
                    if ((i16 & 6) == 0) {
                        i17 = i16 | (interfaceC3967k2.n(BoxWithConstraints) ? 4 : 2);
                    } else {
                        i17 = i16;
                    }
                    if ((i17 & 19) == 18 && interfaceC3967k2.b()) {
                        interfaceC3967k2.j();
                        return;
                    }
                    String groupName = GroupSubscriptionSheetStatusData.this.getGroupName();
                    e t2 = a0.t(e.f40358c0, 0.0f, BoxWithConstraints.d() - (GroupSubscriptionSheetStatusData.this.getIsGroupVerified() ? 20 : 0), 1);
                    long textPrimaryColor = StylingUtilKt.textPrimaryColor(groupSubscriptionStyle, interfaceC3967k2, 0);
                    long d12 = Hj0.T.d(23);
                    long d13 = Hj0.T.d(28);
                    f12 = F.f21511i;
                    TightWrapTextKt.m51TightWrapTextpNBRTJQ(groupName, t2, new K1.T(textPrimaryColor, d12, f12, null, 0L, 3, d13, null, 0, 16613368), 2, 2, interfaceC3967k2, 27648);
                }
            }, u11), u11, 3072, 7);
            u11.o(1829618985);
            if (groupSubscriptionSheetStatusData.getIsGroupVerified()) {
                E.a(u11, a0.r(aVar, 6));
                float p11 = ((Z1.d) u11.m(K0.e())).p(Hj0.T.d(4));
                float f12 = 20;
                i13 = 20;
                i14 = 0;
                i15 = 16;
                C8366G.a(G1.e.a(R$drawable.vkid_verified_20, u11, 0), null, T.j(a0.r(a0.f(aVar, f12 + p11), f12), 0.0f, 0.0f, 0.0f, p11, 7), null, null, 0.0f, null, u11, 48, 120);
            } else {
                i13 = 20;
                i14 = 0;
                i15 = 16;
            }
            u11.k();
            u11.f();
            if (!kotlin.text.h.K(groupSubscriptionSheetStatusData.getGroupDescription())) {
                E.a(u11, a0.f(aVar, 12));
                Y b13 = X.b(C5179b.f(), InterfaceC6250b.a.l(), u11, i14);
                int I12 = u11.I();
                A0 d12 = u11.d();
                e f13 = androidx.compose.ui.c.f(u11, aVar);
                Function0 a13 = InterfaceC2801g.a.a();
                u11.i();
                if (u11.t()) {
                    u11.H(a13);
                } else {
                    u11.e();
                }
                Function2 h12 = Cm.e.h(u11, b13, u11, d12);
                if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I12))) {
                    Ep.a.d(I12, u11, I12, h12);
                }
                F1.b(u11, f13, InterfaceC2801g.a.f());
                String groupDescription = groupSubscriptionSheetStatusData.getGroupDescription();
                long textSecondaryColor = StylingUtilKt.textSecondaryColor(groupSubscriptionStyle, u11, (i12 >> 3) & 14);
                long d13 = Hj0.T.d(i15);
                long d14 = Hj0.T.d(i13);
                f7 = F.f21509g;
                p2.b(groupDescription, aVar, 0L, 0L, 0L, null, 0L, 2, false, 3, 0, new K1.T(textSecondaryColor, d13, f7, null, 0L, 5, d14, null, 0, 16613368), u11, 48, 3120, 55292);
                u11 = u11;
                if (1.0f <= 0.0d) {
                    throw new IllegalArgumentException(C2942q.b(1.0f, "invalid weight ", "; must be greater than zero").toString());
                }
                E.a(u11, new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
                u11.f();
            }
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new Function2() { // from class: ja.o
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit DataStateLabels$lambda$63;
                    int intValue = ((Integer) obj2).intValue();
                    GroupSubscriptionSheetStatusData groupSubscriptionSheetStatusData2 = groupSubscriptionSheetStatusData;
                    int i16 = i11;
                    DataStateLabels$lambda$63 = GroupSubscriptionSheetKt.DataStateLabels$lambda$63(InterfaceC9895d.this, groupSubscriptionStyle, groupSubscriptionSheetStatusData2, i16, (InterfaceC3967k) obj, intValue);
                    return DataStateLabels$lambda$63;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DataStateLabels$lambda$63(InterfaceC9895d interfaceC9895d, GroupSubscriptionStyle groupSubscriptionStyle, GroupSubscriptionSheetStatusData groupSubscriptionSheetStatusData, int i11, InterfaceC3967k interfaceC3967k, int i12) {
        DataStateLabels(interfaceC9895d, groupSubscriptionStyle, groupSubscriptionSheetStatusData, interfaceC3967k, C2652m.e(i11 | 1));
        return Unit.f71690a;
    }

    private static final void DataStateSubscribers(final InterfaceC9895d interfaceC9895d, final GroupSubscriptionStyle groupSubscriptionStyle, final GroupSubscriptionSheetStatusData groupSubscriptionSheetStatusData, InterfaceC3967k interfaceC3967k, final int i11) {
        int i12;
        int i13 = 0;
        C3969l u11 = interfaceC3967k.u(1304970298);
        if ((i11 & 48) == 0) {
            i12 = (u11.F(groupSubscriptionStyle) ? 32 : 16) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.n(groupSubscriptionSheetStatusData) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i12 & 145) == 144 && u11.b()) {
            u11.j();
        } else {
            d.b i14 = InterfaceC6250b.a.i();
            e.a aVar = e.f40358c0;
            Y b11 = X.b(C5179b.f(), i14, u11, 48);
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f7 = androidx.compose.ui.c.f(u11, aVar);
            Function0 a11 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a11);
            } else {
                u11.e();
            }
            Function2 h11 = Cm.e.h(u11, b11, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                Ep.a.d(I11, u11, I11, h11);
            }
            F1.b(u11, f7, InterfaceC2801g.a.f());
            float f11 = 24;
            e f12 = a0.f(a0.r(aVar, 72), f11);
            V f13 = C5185h.f(InterfaceC6250b.a.o(), false);
            int I12 = u11.I();
            A0 d12 = u11.d();
            e f14 = androidx.compose.ui.c.f(u11, f12);
            Function0 a12 = InterfaceC2801g.a.a();
            u11.i();
            if (u11.t()) {
                u11.H(a12);
            } else {
                u11.e();
            }
            Function2 f15 = T7.E.f(u11, f13, u11, d12);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I12))) {
                Ep.a.d(I12, u11, I12, f15);
            }
            F1.b(u11, f14, InterfaceC2801g.a.f());
            u11.o(-1286971354);
            Iterator it = groupSubscriptionSheetStatusData.getUserImageUrls().iterator();
            int i15 = 0;
            while (it.hasNext()) {
                Object next = it.next();
                int i16 = i15 + 1;
                if (i15 < 0) {
                    C7714v.O0();
                    throw null;
                }
                String str = (String) next;
                u11.o(-1286969524);
                y5.b userImageTransformation = i15 > 0 ? new UserImageTransformation(C7811b0.i(StylingUtilKt.backgroundColor(groupSubscriptionStyle, u11, (i12 >> 3) & 14))) : new C10838a();
                u11.k();
                e.a aVar2 = e.f40358c0;
                Y b12 = X.b(C5179b.f(), InterfaceC6250b.a.l(), u11, i13);
                int I13 = u11.I();
                int i17 = i13;
                A0 d13 = u11.d();
                e f16 = androidx.compose.ui.c.f(u11, aVar2);
                Iterator it2 = it;
                Function0 a13 = g.a(InterfaceC2801g.f5440U, u11);
                if (u11.t()) {
                    u11.H(a13);
                } else {
                    u11.e();
                }
                Function2 h12 = Cm.e.h(u11, b12, u11, d13);
                if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I13))) {
                    Ep.a.d(I13, u11, I13, h12);
                }
                F1.b(u11, f16, InterfaceC2801g.a.f());
                E.a(u11, a0.r(aVar2, i15 * f11));
                e r11 = a0.r(a0.f(aVar2, f11), f11);
                C10234h.a aVar3 = new C10234h.a((Context) u11.m(AndroidCompositionLocals_androidKt.d()));
                aVar3.b(str);
                y5.b[] bVarArr = new y5.b[1];
                bVarArr[i17] = userImageTransformation;
                aVar3.j(bVarArr);
                C8085h.a(aVar3.a(), r11, InterfaceC2547p.a.c(), u11, 1573296);
                u11.f();
                i15 = i16;
                i13 = i17;
                it = it2;
            }
            u11.k();
            u11.f();
            E.a(u11, a0.r(e.f40358c0, 8));
            B.a(null, null, C5179b.b(), 0, 0, null, a1.c.c(1061970961, new InterfaceC6511n<InterfaceC9904m, InterfaceC3967k, Integer, Unit>() { // from class: com.vk.id.group.subscription.compose.ui.GroupSubscriptionSheetKt$DataStateSubscribers$1$2
                @Override // fd.InterfaceC6511n
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC9904m interfaceC9904m, InterfaceC3967k interfaceC3967k2, Integer num) {
                    invoke(interfaceC9904m, interfaceC3967k2, num.intValue());
                    return Unit.f71690a;
                }

                public final void invoke(InterfaceC9904m FlowRow, InterfaceC3967k interfaceC3967k2, int i18) {
                    int i19;
                    F f17;
                    F f18;
                    Intrinsics.checkNotNullParameter(FlowRow, "$this$FlowRow");
                    if ((i18 & 6) == 0) {
                        i19 = i18 | (interfaceC3967k2.n(FlowRow) ? 4 : 2);
                    } else {
                        i19 = i18;
                    }
                    if ((i19 & 19) == 18 && interfaceC3967k2.b()) {
                        interfaceC3967k2.j();
                        return;
                    }
                    String e11 = U7.d.e(G1.h.a(interfaceC3967k2).getQuantityString(R$plurals.vkid_group_subscription_subscribers, GroupSubscriptionSheetStatusData.this.getSubscriberCount(), Arrays.copyOf(new Object[]{SubscriberCountFormatter.INSTANCE.format(GroupSubscriptionSheetStatusData.this.getSubscriberCount())}, 1)), " ");
                    String b13 = Nk.a.b("· ", G1.h.a(interfaceC3967k2).getQuantityString(R$plurals.vkid_group_subscription_friends, GroupSubscriptionSheetStatusData.this.getFriendsCount(), Arrays.copyOf(new Object[]{Integer.valueOf(GroupSubscriptionSheetStatusData.this.getFriendsCount())}, 1)));
                    e.a aVar4 = e.f40358c0;
                    long textSecondaryColor = StylingUtilKt.textSecondaryColor(groupSubscriptionStyle, interfaceC3967k2, 0);
                    long d14 = Hj0.T.d(15);
                    long d15 = Hj0.T.d(20);
                    f17 = F.f21510h;
                    p2.b(e11, aVar4, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, new K1.T(textSecondaryColor, d14, f17, null, 0L, 3, d15, null, 0, 16613368), interfaceC3967k2, 48, 0, 65532);
                    InterfaceC3967k interfaceC3967k3 = interfaceC3967k2;
                    interfaceC3967k3.o(-1286919323);
                    if (GroupSubscriptionSheetStatusData.this.getFriendsCount() > 0) {
                        long textSecondaryColor2 = StylingUtilKt.textSecondaryColor(groupSubscriptionStyle, interfaceC3967k3, 0);
                        long d16 = Hj0.T.d(15);
                        long d17 = Hj0.T.d(20);
                        f18 = F.f21510h;
                        p2.b(b13, aVar4, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, new K1.T(textSecondaryColor2, d16, f18, null, 0L, 3, d17, null, 0, 16613368), interfaceC3967k3, 48, 0, 65532);
                        interfaceC3967k3 = interfaceC3967k3;
                    }
                    interfaceC3967k3.k();
                    E.a(interfaceC3967k3, FlowRow.a(aVar4, 1.0f, true));
                }
            }, u11), u11, 1573248, 59);
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new Function2() { // from class: ja.r
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit DataStateSubscribers$lambda$59;
                    int intValue = ((Integer) obj2).intValue();
                    GroupSubscriptionSheetStatusData groupSubscriptionSheetStatusData2 = groupSubscriptionSheetStatusData;
                    int i18 = i11;
                    DataStateSubscribers$lambda$59 = GroupSubscriptionSheetKt.DataStateSubscribers$lambda$59(InterfaceC9895d.this, groupSubscriptionStyle, groupSubscriptionSheetStatusData2, i18, (InterfaceC3967k) obj, intValue);
                    return DataStateSubscribers$lambda$59;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DataStateSubscribers$lambda$59(InterfaceC9895d interfaceC9895d, GroupSubscriptionStyle groupSubscriptionStyle, GroupSubscriptionSheetStatusData groupSubscriptionSheetStatusData, int i11, InterfaceC3967k interfaceC3967k, int i12) {
        DataStateSubscribers(interfaceC9895d, groupSubscriptionStyle, groupSubscriptionSheetStatusData, interfaceC3967k, C2652m.e(i11 | 1));
        return Unit.f71690a;
    }

    private static final void FailureDataState(final GroupSubscriptionStyle groupSubscriptionStyle, final GroupSubscriptionSheetState groupSubscriptionSheetState, final Function1<? super VKIDGroupSubscriptionFail, Unit> function1, final Function0<Unit> function0, final Function2<? super InterfaceC3967k, ? super Integer, Unit> function2, InterfaceC3967k interfaceC3967k, final int i11) {
        int i12;
        Function0<Unit> function02;
        F f7;
        F f11;
        C3969l c3969l;
        C3969l u11 = interfaceC3967k.u(840604150);
        if ((i11 & 6) == 0) {
            i12 = (u11.F(groupSubscriptionStyle) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.n(groupSubscriptionSheetState) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.F(function1) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i11 & 3072) == 0) {
            function02 = function0;
            i12 |= u11.F(function02) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        } else {
            function02 = function0;
        }
        if ((i11 & 24576) == 0) {
            i12 |= u11.F(function2) ? 16384 : 8192;
        }
        if ((i12 & 9363) == 9362 && u11.b()) {
            u11.j();
            c3969l = u11;
        } else {
            e.a aVar = e.f40358c0;
            float f12 = 16;
            e f13 = T.f(aVar, f12);
            C5194q a11 = C5193p.a(C5179b.g(), InterfaceC6250b.a.g(), u11, 48);
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f14 = androidx.compose.ui.c.f(u11, f13);
            Function0 a12 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a12);
            } else {
                u11.e();
            }
            Function2 g10 = K00.b.g(u11, a11, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                Ep.a.d(I11, u11, I11, g10);
            }
            F1.b(u11, f14, InterfaceC2801g.a.f());
            float f15 = 8;
            C8366G.a(G1.e.a(R$drawable.vkid_sheet_error, u11, 0), null, T.j(aVar, 0.0f, f15, 0.0f, f12, 5), null, InterfaceC2547p.a.d(), 0.0f, null, u11, 25008, 104);
            String a13 = i.a(u11, R$string.vkid_group_subscription_fail_title);
            int i13 = i12 & 14;
            long textPrimaryColor = StylingUtilKt.textPrimaryColor(groupSubscriptionStyle, u11, i13);
            long d12 = Hj0.T.d(20);
            long d13 = Hj0.T.d(24);
            f7 = F.f21510h;
            p2.b(a13, aVar, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, new K1.T(textPrimaryColor, d12, f7, null, 0L, 3, d13, null, 0, 16613368), u11, 48, 0, 65532);
            E.a(u11, a0.f(aVar, f15));
            String a14 = i.a(u11, R$string.vkid_group_subscription_fail_description);
            long textSecondaryColor = StylingUtilKt.textSecondaryColor(groupSubscriptionStyle, u11, i13);
            long d14 = Hj0.T.d(14);
            long d15 = Hj0.T.d(18);
            f11 = F.f21509g;
            p2.b(a14, aVar, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, new K1.T(textSecondaryColor, d14, f11, null, 0L, 3, d15, null, 0, 16613368), u11, 48, 0, 65532);
            E.a(u11, a0.f(aVar, 32));
            int i14 = i12;
            PrimaryButtonKt.PrimaryButton(groupSubscriptionStyle, "group_subscription_retry", function02, a1.c.c(-1798856526, new Function2<InterfaceC3967k, Integer, Unit>() { // from class: com.vk.id.group.subscription.compose.ui.GroupSubscriptionSheetKt$FailureDataState$1$1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k2, Integer num) {
                    invoke(interfaceC3967k2, num.intValue());
                    return Unit.f71690a;
                }

                public final void invoke(InterfaceC3967k interfaceC3967k2, int i15) {
                    if ((i15 & 3) == 2 && interfaceC3967k2.b()) {
                        interfaceC3967k2.j();
                    } else {
                        function2.invoke(interfaceC3967k2, 0);
                    }
                }
            }, u11), u11, i13 | 3120 | ((i12 >> 3) & 896));
            E.a(u11, a0.f(aVar, 12));
            String a15 = i.a(u11, R$string.vkid_group_subscription_fail_secondary);
            u11.o(-787858993);
            boolean z11 = ((i14 & 112) == 32) | ((i14 & 896) == 256);
            Object C11 = u11.C();
            if (z11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new Function0() { // from class: ja.m
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit FailureDataState$lambda$48$lambda$47$lambda$46;
                        FailureDataState$lambda$48$lambda$47$lambda$46 = GroupSubscriptionSheetKt.FailureDataState$lambda$48$lambda$47$lambda$46(GroupSubscriptionSheetState.this, function1);
                        return FailureDataState$lambda$48$lambda$47$lambda$46;
                    }
                };
                u11.x(C11);
            }
            u11.k();
            SecondaryButtonKt.SecondaryButton(groupSubscriptionStyle, "group_subscription_cancel", a15, (Function0) C11, u11, i13 | 48);
            c3969l = u11;
            c3969l.f();
        }
        J0 m02 = c3969l.m0();
        if (m02 != null) {
            m02.G(new Function2() { // from class: ja.n
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit FailureDataState$lambda$49;
                    int intValue = ((Integer) obj2).intValue();
                    Function2 function22 = function2;
                    int i15 = i11;
                    FailureDataState$lambda$49 = GroupSubscriptionSheetKt.FailureDataState$lambda$49(GroupSubscriptionStyle.this, groupSubscriptionSheetState, function1, function0, function22, i15, (InterfaceC3967k) obj, intValue);
                    return FailureDataState$lambda$49;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FailureDataState$lambda$48$lambda$47$lambda$46(GroupSubscriptionSheetState groupSubscriptionSheetState, Function1 function1) {
        groupSubscriptionSheetState.hide();
        GroupSubscriptionAnalytics groupSubscriptionAnalytics = GroupSubscriptionAnalytics.INSTANCE;
        AccessToken accessToken = VKID.INSTANCE.getInstance().getAccessToken();
        groupSubscriptionAnalytics.cancelClick$group_subscription_compose_release(accessToken != null ? accessToken.getToken() : null);
        function1.invoke(new VKIDGroupSubscriptionFail.Cancel());
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FailureDataState$lambda$49(GroupSubscriptionStyle groupSubscriptionStyle, GroupSubscriptionSheetState groupSubscriptionSheetState, Function1 function1, Function0 function0, Function2 function2, int i11, InterfaceC3967k interfaceC3967k, int i12) {
        FailureDataState(groupSubscriptionStyle, groupSubscriptionSheetState, function1, function0, function2, interfaceC3967k, C2652m.e(i11 | 1));
        return Unit.f71690a;
    }

    public static final void FailureState(@NotNull final GroupSubscriptionStyle style, @NotNull GroupSubscriptionSheetState state, @NotNull Function1<? super VKIDGroupSubscriptionFail, Unit> onFail, @NotNull Function0<Unit> onRetry, InterfaceC3967k interfaceC3967k, final int i11) {
        int i12;
        final GroupSubscriptionStyle groupSubscriptionStyle;
        final GroupSubscriptionSheetState groupSubscriptionSheetState;
        final Function1<? super VKIDGroupSubscriptionFail, Unit> function1;
        final Function0<Unit> function0;
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onFail, "onFail");
        Intrinsics.checkNotNullParameter(onRetry, "onRetry");
        C3969l u11 = interfaceC3967k.u(995379373);
        if ((i11 & 6) == 0) {
            i12 = (u11.F(style) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.n(state) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.F(onFail) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i11 & 3072) == 0) {
            i12 |= u11.F(onRetry) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i12 & 1171) == 1170 && u11.b()) {
            u11.j();
            function0 = onRetry;
            function1 = onFail;
            groupSubscriptionSheetState = state;
            groupSubscriptionStyle = style;
        } else {
            GroupSubscriptionAnalytics groupSubscriptionAnalytics = GroupSubscriptionAnalytics.INSTANCE;
            AccessToken accessToken = VKID.INSTANCE.getInstance().getAccessToken();
            groupSubscriptionAnalytics.ErrorShown$group_subscription_compose_release(accessToken != null ? accessToken.getToken() : null, u11, 0);
            FailureDataState(style, state, onFail, onRetry, a1.c.c(307974107, new Function2<InterfaceC3967k, Integer, Unit>() { // from class: com.vk.id.group.subscription.compose.ui.GroupSubscriptionSheetKt$FailureState$1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k2, Integer num) {
                    invoke(interfaceC3967k2, num.intValue());
                    return Unit.f71690a;
                }

                public final void invoke(InterfaceC3967k interfaceC3967k2, int i13) {
                    F f7;
                    if ((i13 & 3) == 2 && interfaceC3967k2.b()) {
                        interfaceC3967k2.j();
                        return;
                    }
                    String a11 = i.a(interfaceC3967k2, R$string.vkid_group_subscription_fail_primary);
                    e.a aVar = e.f40358c0;
                    long textPrimaryButtonColor = StylingUtilKt.textPrimaryButtonColor(GroupSubscriptionStyle.this);
                    long d11 = Hj0.T.d(GroupSubscriptionStyle.this.getButtonsSizeStyle().getTextSizeSp());
                    long d12 = Hj0.T.d(20);
                    f7 = F.f21510h;
                    p2.b(a11, aVar, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, new K1.T(textPrimaryButtonColor, d11, f7, null, 0L, 3, d12, null, 0, 16613368), interfaceC3967k2, 48, 0, 65532);
                }
            }, u11), u11, (i12 & 14) | 24576 | (i12 & 112) | (i12 & 896) | (i12 & 7168));
            groupSubscriptionStyle = style;
            groupSubscriptionSheetState = state;
            function1 = onFail;
            function0 = onRetry;
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new Function2() { // from class: ja.d
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit FailureState$lambda$45;
                    int intValue = ((Integer) obj2).intValue();
                    Function0 function02 = function0;
                    int i13 = i11;
                    FailureState$lambda$45 = GroupSubscriptionSheetKt.FailureState$lambda$45(GroupSubscriptionStyle.this, groupSubscriptionSheetState, function1, function02, i13, (InterfaceC3967k) obj, intValue);
                    return FailureState$lambda$45;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FailureState$lambda$45(GroupSubscriptionStyle groupSubscriptionStyle, GroupSubscriptionSheetState groupSubscriptionSheetState, Function1 function1, Function0 function0, int i11, InterfaceC3967k interfaceC3967k, int i12) {
        FailureState(groupSubscriptionStyle, groupSubscriptionSheetState, function1, function0, interfaceC3967k, C2652m.e(i11 | 1));
        return Unit.f71690a;
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x0431  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0487  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x04b5  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x053f  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x052c  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x048b  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0556  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x036f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void GroupSubscriptionSheet(e eVar, GroupSubscriptionSheetState groupSubscriptionSheetState, Function0<String> function0, @NotNull final String groupId, @NotNull final Function0<Unit> onSuccess, Function1<? super VKIDGroupSubscriptionFail, Unit> function1, N1 n12, GroupSubscriptionStyle groupSubscriptionStyle, InterfaceC3967k interfaceC3967k, final int i11, final int i12) {
        final e eVar2;
        int i13;
        GroupSubscriptionSheetState groupSubscriptionSheetState2;
        Function0<String> function02;
        int i14;
        Function1<? super VKIDGroupSubscriptionFail, Unit> function12;
        int i15;
        N1 n13;
        GroupSubscriptionStyle groupSubscriptionStyle2;
        GroupSubscriptionSheetState groupSubscriptionSheetState3;
        Function0<String> function03;
        N1 n14;
        GroupSubscriptionStyle groupSubscriptionStyle3;
        e eVar3;
        int i16;
        Function1<? super VKIDGroupSubscriptionFail, Unit> function13;
        GroupSubscriptionSheetState groupSubscriptionSheetState4;
        int i17;
        boolean z11;
        Object C11;
        int i18;
        int i19;
        String str;
        Function0<String> function04;
        GroupSubscriptionInteractor groupSubscriptionInteractor;
        N1 n15;
        Object C12;
        final M a11;
        Object C13;
        final InterfaceC3978p0 interfaceC3978p0;
        Object C14;
        InterfaceC3978p0 interfaceC3978p02;
        InterfaceC3978p0 l11;
        Object C15;
        final InterfaceC3978p0 interfaceC3978p03;
        final N1 n16;
        boolean F11;
        Object C16;
        InterfaceC3978p0 interfaceC3978p04;
        Function1<? super VKIDGroupSubscriptionFail, Unit> function14;
        InterfaceC3978p0 interfaceC3978p05;
        M m11;
        InterfaceC3978p0 interfaceC3978p06;
        Function0<String> function05;
        C3969l c3969l;
        Object C17;
        Unit unit;
        int i21;
        boolean n11;
        Object C18;
        int i22;
        Unit unit2;
        InterfaceC3978p0 interfaceC3978p07;
        final GroupSubscriptionSheetState groupSubscriptionSheetState5;
        boolean n17;
        Object C19;
        boolean n18;
        Object C21;
        final M m12;
        C3969l c3969l2;
        boolean z12;
        Object C22;
        final GroupSubscriptionInteractor groupSubscriptionInteractor2;
        InterfaceC3978p0 interfaceC3978p08;
        int I11;
        GroupSubscriptionSheetState groupSubscriptionSheetState6;
        e eVar4;
        GroupSubscriptionStyle groupSubscriptionStyle4;
        Function1<? super VKIDGroupSubscriptionFail, Unit> function15;
        int i23;
        GroupSubscriptionStyle groupSubscriptionStyle5;
        int i24;
        final GroupSubscriptionStyle groupSubscriptionStyle6;
        final Function1<? super VKIDGroupSubscriptionFail, Unit> function16;
        final GroupSubscriptionSheetState groupSubscriptionSheetState7;
        final N1 n19;
        final Function0<String> function06;
        long j11;
        J0 m02;
        int i25;
        int i26;
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        C3969l u11 = interfaceC3967k.u(-932287047);
        int i27 = i12 & 1;
        if (i27 != 0) {
            i13 = i11 | 6;
            eVar2 = eVar;
        } else if ((i11 & 6) == 0) {
            eVar2 = eVar;
            i13 = (u11.n(eVar2) ? 4 : 2) | i11;
        } else {
            eVar2 = eVar;
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            if ((i12 & 2) == 0) {
                groupSubscriptionSheetState2 = groupSubscriptionSheetState;
                if (u11.n(groupSubscriptionSheetState2)) {
                    i26 = 32;
                    i13 |= i26;
                }
            } else {
                groupSubscriptionSheetState2 = groupSubscriptionSheetState;
            }
            i26 = 16;
            i13 |= i26;
        } else {
            groupSubscriptionSheetState2 = groupSubscriptionSheetState;
        }
        int i28 = i12 & 4;
        if (i28 != 0) {
            i13 |= 384;
        } else if ((i11 & 384) == 0) {
            function02 = function0;
            i13 |= u11.F(function02) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
            if ((i12 & 8) == 0) {
                i13 |= 3072;
            } else if ((i11 & 3072) == 0) {
                i13 |= u11.n(groupId) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
            }
            if ((i12 & 16) == 0) {
                i13 |= 24576;
            } else if ((i11 & 24576) == 0) {
                i13 |= u11.F(onSuccess) ? 16384 : 8192;
            }
            i14 = i12 & 32;
            if (i14 == 0) {
                i13 |= 196608;
                function12 = function1;
            } else {
                function12 = function1;
                if ((i11 & 196608) == 0) {
                    i13 |= u11.F(function12) ? 131072 : 65536;
                }
            }
            i15 = i12 & 64;
            if (i15 == 0) {
                i13 |= 1572864;
                n13 = n12;
            } else {
                n13 = n12;
                if ((i11 & 1572864) == 0) {
                    i13 |= u11.n(n13) ? 1048576 : 524288;
                }
            }
            if ((i11 & 12582912) != 0) {
                if ((i12 & UserVerificationMethods.USER_VERIFY_PATTERN) == 0) {
                    groupSubscriptionStyle2 = groupSubscriptionStyle;
                    if (u11.F(groupSubscriptionStyle2)) {
                        i25 = 8388608;
                        i13 |= i25;
                    }
                } else {
                    groupSubscriptionStyle2 = groupSubscriptionStyle;
                }
                i25 = 4194304;
                i13 |= i25;
            } else {
                groupSubscriptionStyle2 = groupSubscriptionStyle;
            }
            if ((i13 & 4793491) == 4793490 || !u11.b()) {
                u11.Q0();
                if ((i11 & 1) != 0 || u11.w0()) {
                    e eVar5 = i27 == 0 ? e.f40358c0 : eVar2;
                    if ((i12 & 2) == 0) {
                        groupSubscriptionSheetState3 = rememberGroupSubscriptionSheetState(u11, 0);
                        i13 &= -113;
                    } else {
                        groupSubscriptionSheetState3 = groupSubscriptionSheetState2;
                    }
                    if (i28 != 0) {
                        function02 = null;
                    }
                    if (i14 != 0) {
                        u11.o(93866216);
                        Object C23 = u11.C();
                        if (C23 == InterfaceC3967k.a.a()) {
                            C23 = new C6098a(1);
                            u11.x(C23);
                        }
                        u11.k();
                        function12 = (Function1) C23;
                    }
                    if (i15 != 0) {
                        n13 = null;
                    }
                    if ((i12 & UserVerificationMethods.USER_VERIFY_PATTERN) == 0) {
                        function03 = function02;
                        n14 = n13;
                        function13 = function12;
                        groupSubscriptionStyle3 = new GroupSubscriptionStyle.Light(null, null, null, 7, null);
                        eVar3 = eVar5;
                        groupSubscriptionSheetState4 = groupSubscriptionSheetState3;
                        i16 = i13 & (-29360129);
                    } else {
                        function03 = function02;
                        n14 = n13;
                        groupSubscriptionStyle3 = groupSubscriptionStyle2;
                        eVar3 = eVar5;
                        i16 = i13;
                        function13 = function12;
                        groupSubscriptionSheetState4 = groupSubscriptionSheetState3;
                    }
                } else {
                    u11.j();
                    if ((i12 & 2) != 0) {
                        i13 &= -113;
                    }
                    if ((i12 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                        i13 &= -29360129;
                    }
                    i16 = i13;
                    n14 = n13;
                    groupSubscriptionStyle3 = groupSubscriptionStyle2;
                    eVar3 = eVar2;
                    function13 = function12;
                    groupSubscriptionSheetState4 = groupSubscriptionSheetState2;
                    function03 = function02;
                }
                u11.j0();
                u11.o(93871346);
                i17 = i16 & 7168;
                boolean z13 = true;
                z11 = i17 != 2048;
                C11 = u11.C();
                if (!z11 || C11 == InterfaceC3967k.a.a()) {
                    int i29 = i16;
                    VKID.Companion companion = VKID.INSTANCE;
                    i18 = i17;
                    i19 = i29;
                    Object groupSubscriptionInteractor3 = new GroupSubscriptionInteractor(companion.getInstance().getGroupSubscriptionApiService(), companion.getInstance().getTokenStorage(), groupId, function03, new GroupSubscriptionPrefsStorage(companion.getInstance().getPrefsStorage()), companion.getInstance().getGroupSubscriptionLimit());
                    str = groupId;
                    function04 = function03;
                    u11.x(groupSubscriptionInteractor3);
                    C11 = groupSubscriptionInteractor3;
                } else {
                    i19 = i16;
                    i18 = i17;
                    str = groupId;
                    function04 = function03;
                }
                groupSubscriptionInteractor = (GroupSubscriptionInteractor) C11;
                u11.k();
                GroupSubscriptionAnalytics groupSubscriptionAnalytics = GroupSubscriptionAnalytics.INSTANCE;
                groupSubscriptionAnalytics.getStyle$group_subscription_compose_release().set(groupSubscriptionStyle3);
                groupSubscriptionAnalytics.getGroupId$group_subscription_compose_release().set(str);
                u11.o(93888987);
                if (n14 != null) {
                    u11.o(93889638);
                    Object C24 = u11.C();
                    if (C24 == InterfaceC3967k.a.a()) {
                        C24 = new N1();
                        u11.x(C24);
                    }
                    n15 = (N1) C24;
                    u11.k();
                } else {
                    n15 = n14;
                }
                u11.k();
                C12 = u11.C();
                if (C12 == InterfaceC3967k.a.a()) {
                    C12 = f.b(Q.j(kotlin.coroutines.g.f71771a, u11), u11);
                }
                a11 = ((D) C12).a();
                Object[] objArr = new Object[0];
                u11.o(93893433);
                C13 = u11.C();
                if (C13 == InterfaceC3967k.a.a()) {
                    C13 = new n(2);
                    u11.x(C13);
                }
                u11.k();
                interfaceC3978p0 = (InterfaceC3978p0) C5503f.c(objArr, null, (Function0) C13, u11, 3072, 6);
                Object[] objArr2 = new Object[0];
                u11.o(93897471);
                C14 = u11.C();
                if (C14 == InterfaceC3967k.a.a()) {
                    C14 = new Q90.b(1);
                    u11.x(C14);
                }
                u11.k();
                interfaceC3978p02 = (InterfaceC3978p0) C5503f.c(objArr2, null, (Function0) C14, u11, 3072, 6);
                l11 = n1.l(function13, u11);
                final String a12 = i.a(u11, R$string.vkid_group_subscription_snackbar_label);
                u11.o(93903624);
                C15 = u11.C();
                if (C15 == InterfaceC3967k.a.a()) {
                    C15 = n1.f(Boolean.FALSE, D1.f25195a);
                    u11.x(C15);
                }
                interfaceC3978p03 = (InterfaceC3978p0) C15;
                u11.k();
                u11.o(93906523);
                n16 = n15;
                F11 = ((57344 & i19) != 16384) | u11.F(a11) | ((i19 & 896) != 256) | u11.n(n15) | u11.n(a12);
                C16 = u11.C();
                if (!F11 || C16 == InterfaceC3967k.a.a()) {
                    interfaceC3978p04 = interfaceC3978p02;
                    function14 = function13;
                    final Function0<String> function07 = function04;
                    interfaceC3978p05 = l11;
                    C3969l c3969l3 = u11;
                    Object obj = new Function0() { // from class: ja.u
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit GroupSubscriptionSheet$lambda$17$lambda$16;
                            GroupSubscriptionSheet$lambda$17$lambda$16 = GroupSubscriptionSheetKt.GroupSubscriptionSheet$lambda$17$lambda$16(M.this, onSuccess, interfaceC3978p03, function07, n16, a12);
                            return GroupSubscriptionSheet$lambda$17$lambda$16;
                        }
                    };
                    m11 = a11;
                    interfaceC3978p06 = interfaceC3978p03;
                    function05 = function07;
                    c3969l3.x(obj);
                    C16 = obj;
                    c3969l = c3969l3;
                } else {
                    interfaceC3978p04 = interfaceC3978p02;
                    function14 = function13;
                    function05 = function04;
                    interfaceC3978p05 = l11;
                    m11 = a11;
                    c3969l = u11;
                    interfaceC3978p06 = interfaceC3978p03;
                }
                c3969l.k();
                InterfaceC3978p0 l12 = n1.l((Function0) C16, c3969l);
                c3969l.o(93915880);
                C17 = c3969l.C();
                if (C17 == InterfaceC3967k.a.a()) {
                    C17 = n1.f(Boolean.FALSE, D1.f25195a);
                    c3969l.x(C17);
                }
                InterfaceC3978p0 interfaceC3978p09 = (InterfaceC3978p0) C17;
                c3969l.k();
                unit = Unit.f71690a;
                c3969l.o(93918239);
                i21 = (i19 & 112) ^ 48;
                n11 = ((i21 <= 32 && c3969l.n(groupSubscriptionSheetState4)) || (i19 & 48) == 32) | c3969l.n(interfaceC3978p05);
                C18 = c3969l.C();
                if (!n11 || C18 == InterfaceC3967k.a.a()) {
                    InterfaceC3978p0 interfaceC3978p010 = interfaceC3978p05;
                    i22 = i21;
                    GroupSubscriptionSheetState groupSubscriptionSheetState8 = groupSubscriptionSheetState4;
                    unit2 = unit;
                    Object groupSubscriptionSheetKt$GroupSubscriptionSheet$2$1 = new GroupSubscriptionSheetKt$GroupSubscriptionSheet$2$1(groupSubscriptionSheetState8, interfaceC3978p06, interfaceC3978p09, interfaceC3978p010, null);
                    interfaceC3978p07 = interfaceC3978p010;
                    groupSubscriptionSheetState5 = groupSubscriptionSheetState8;
                    c3969l.x(groupSubscriptionSheetKt$GroupSubscriptionSheet$2$1);
                    C18 = groupSubscriptionSheetKt$GroupSubscriptionSheet$2$1;
                } else {
                    groupSubscriptionSheetState5 = groupSubscriptionSheetState4;
                    interfaceC3978p07 = interfaceC3978p05;
                    unit2 = unit;
                    i22 = i21;
                }
                c3969l.k();
                Q.e(c3969l, unit2, (Function2) C18);
                c3969l.o(93933915);
                n17 = c3969l.n(interfaceC3978p0);
                C19 = c3969l.C();
                if (!n17 || C19 == InterfaceC3967k.a.a()) {
                    C19 = new C6903a(interfaceC3978p0, 1);
                    c3969l.x(C19);
                }
                Function1 function17 = (Function1) C19;
                c3969l.k();
                c3969l.o(93934910);
                n18 = c3969l.n(interfaceC3978p04);
                C21 = c3969l.C();
                if (!n18 || C21 == InterfaceC3967k.a.a()) {
                    C21 = new v(interfaceC3978p04, 0);
                    c3969l.x(C21);
                }
                c3969l.k();
                M m13 = m11;
                C3969l c3969l4 = c3969l;
                processSheetShow(function17, (Function1) C21, m13, groupSubscriptionSheetState5, c3969l4, (i19 << 6) & 7168);
                m12 = m13;
                c3969l2 = c3969l4;
                c3969l2.o(93940066);
                z12 = i18 != 2048;
                C22 = c3969l2.C();
                if (!z12 || C22 == InterfaceC3967k.a.a()) {
                    final InterfaceC3978p0 interfaceC3978p011 = interfaceC3978p04;
                    groupSubscriptionInteractor2 = groupSubscriptionInteractor;
                    final InterfaceC3978p0 interfaceC3978p012 = interfaceC3978p07;
                    Function1<? super Boolean, Unit> function18 = new Function1() { // from class: ja.w
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            Unit GroupSubscriptionSheet$lambda$30$lambda$29;
                            boolean booleanValue = ((Boolean) obj2).booleanValue();
                            GroupSubscriptionSheet$lambda$30$lambda$29 = GroupSubscriptionSheetKt.GroupSubscriptionSheet$lambda$30$lambda$29(InterfaceC3978p0.this, m12, groupSubscriptionInteractor2, groupSubscriptionSheetState5, interfaceC3978p011, interfaceC3978p012, booleanValue);
                            return GroupSubscriptionSheet$lambda$30$lambda$29;
                        }
                    };
                    m12 = m12;
                    interfaceC3978p08 = interfaceC3978p0;
                    groupSubscriptionSheetState5.setShowSheet$group_subscription_compose_release(function18);
                    C22 = 1;
                    c3969l2.x(C22);
                } else {
                    interfaceC3978p08 = interfaceC3978p0;
                    groupSubscriptionInteractor2 = groupSubscriptionInteractor;
                }
                ((Number) C22).intValue();
                c3969l2.k();
                V f7 = C5185h.f(InterfaceC6250b.a.o(), false);
                I11 = c3969l2.I();
                A0 d11 = c3969l2.d();
                e f11 = androidx.compose.ui.c.f(c3969l2, eVar3);
                Function0 a13 = g.a(InterfaceC2801g.f5440U, c3969l2);
                if (c3969l2.t()) {
                    c3969l2.e();
                } else {
                    c3969l2.H(a13);
                }
                Function2 f12 = T7.E.f(c3969l2, f7, c3969l2, d11);
                if (!c3969l2.t() || !Intrinsics.d(c3969l2.C(), Integer.valueOf(I11))) {
                    Ep.a.d(I11, c3969l2, I11, f12);
                }
                U7.i.b(c3969l2, f11, 717694292);
                if (GroupSubscriptionSheet$lambda$10(interfaceC3978p04)) {
                    groupSubscriptionSheetState6 = groupSubscriptionSheetState5;
                    eVar4 = eVar3;
                    groupSubscriptionStyle4 = groupSubscriptionStyle3;
                    function15 = function14;
                    i23 = 2;
                    groupSubscriptionStyle5 = null;
                    i24 = 0;
                } else {
                    e a14 = Q1.a(e.f40358c0, "group_subscription_sheet");
                    c3969l2.o(717696048);
                    if ((i22 <= 32 || !c3969l2.n(groupSubscriptionSheetState5)) && (i19 & 48) != 32) {
                        z13 = false;
                    }
                    Object C25 = c3969l2.C();
                    if (z13 || C25 == InterfaceC3967k.a.a()) {
                        C25 = new GroupSubscriptionSheetKt$GroupSubscriptionSheet$6$1$1(groupSubscriptionSheetState5);
                        c3969l2.x(C25);
                    }
                    c3969l2.k();
                    C3787x1 materialSheetState = groupSubscriptionSheetState5.getMaterialSheetState();
                    j11 = C7807Z.f72258l;
                    Function0 function08 = (Function0) ((kotlin.reflect.h) C25);
                    InterfaceC3978p0 interfaceC3978p013 = interfaceC3978p08;
                    groupSubscriptionStyle4 = groupSubscriptionStyle3;
                    groupSubscriptionSheetState6 = groupSubscriptionSheetState5;
                    function15 = function14;
                    C4912a c11 = a1.c.c(-1980725065, new GroupSubscriptionSheetKt$GroupSubscriptionSheet$6$2(groupSubscriptionStyle4, interfaceC3978p013, groupSubscriptionInteractor2, function15, groupSubscriptionSheetState6, m12, l12), c3969l2);
                    eVar4 = eVar3;
                    i24 = 0;
                    groupSubscriptionStyle5 = null;
                    i23 = 2;
                    B0.a(function08, a14, materialSheetState, 0.0f, null, j11, 0L, 0.0f, 0L, null, null, null, c11, c3969l2, 805503024);
                    c3969l2 = c3969l2;
                }
                c3969l2.k();
                c3969l2.o(717800306);
                if (n14 == null) {
                    GroupSubscriptionSnackbarHost(n16, groupSubscriptionStyle5, c3969l2, i24, i23);
                }
                c3969l2.k();
                c3969l2.f();
                groupSubscriptionStyle6 = groupSubscriptionStyle4;
                eVar2 = eVar4;
                function16 = function15;
                groupSubscriptionSheetState7 = groupSubscriptionSheetState6;
                n19 = n14;
                function06 = function05;
            } else {
                u11.j();
                groupSubscriptionSheetState7 = groupSubscriptionSheetState2;
                function06 = function02;
                n19 = n13;
                function16 = function12;
                c3969l2 = u11;
                groupSubscriptionStyle6 = groupSubscriptionStyle2;
            }
            m02 = c3969l2.m0();
            if (m02 == null) {
                m02.G(new Function2() { // from class: ja.x
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        Unit GroupSubscriptionSheet$lambda$33;
                        int intValue = ((Integer) obj3).intValue();
                        int i31 = i11;
                        int i32 = i12;
                        GroupSubscriptionSheet$lambda$33 = GroupSubscriptionSheetKt.GroupSubscriptionSheet$lambda$33(androidx.compose.ui.e.this, groupSubscriptionSheetState7, function06, groupId, onSuccess, function16, n19, groupSubscriptionStyle6, i31, i32, (InterfaceC3967k) obj2, intValue);
                        return GroupSubscriptionSheet$lambda$33;
                    }
                });
                return;
            }
            return;
        }
        function02 = function0;
        if ((i12 & 8) == 0) {
        }
        if ((i12 & 16) == 0) {
        }
        i14 = i12 & 32;
        if (i14 == 0) {
        }
        i15 = i12 & 64;
        if (i15 == 0) {
        }
        if ((i11 & 12582912) != 0) {
        }
        if ((i13 & 4793491) == 4793490) {
        }
        u11.Q0();
        if ((i11 & 1) != 0) {
        }
        if (i27 == 0) {
        }
        if ((i12 & 2) == 0) {
        }
        if (i28 != 0) {
        }
        if (i14 != 0) {
        }
        if (i15 != 0) {
        }
        if ((i12 & UserVerificationMethods.USER_VERIFY_PATTERN) == 0) {
        }
        u11.j0();
        u11.o(93871346);
        i17 = i16 & 7168;
        boolean z132 = true;
        if (i17 != 2048) {
        }
        C11 = u11.C();
        if (z11) {
        }
        int i292 = i16;
        VKID.Companion companion2 = VKID.INSTANCE;
        i18 = i17;
        i19 = i292;
        Object groupSubscriptionInteractor32 = new GroupSubscriptionInteractor(companion2.getInstance().getGroupSubscriptionApiService(), companion2.getInstance().getTokenStorage(), groupId, function03, new GroupSubscriptionPrefsStorage(companion2.getInstance().getPrefsStorage()), companion2.getInstance().getGroupSubscriptionLimit());
        str = groupId;
        function04 = function03;
        u11.x(groupSubscriptionInteractor32);
        C11 = groupSubscriptionInteractor32;
        groupSubscriptionInteractor = (GroupSubscriptionInteractor) C11;
        u11.k();
        GroupSubscriptionAnalytics groupSubscriptionAnalytics2 = GroupSubscriptionAnalytics.INSTANCE;
        groupSubscriptionAnalytics2.getStyle$group_subscription_compose_release().set(groupSubscriptionStyle3);
        groupSubscriptionAnalytics2.getGroupId$group_subscription_compose_release().set(str);
        u11.o(93888987);
        if (n14 != null) {
        }
        u11.k();
        C12 = u11.C();
        if (C12 == InterfaceC3967k.a.a()) {
        }
        a11 = ((D) C12).a();
        Object[] objArr3 = new Object[0];
        u11.o(93893433);
        C13 = u11.C();
        if (C13 == InterfaceC3967k.a.a()) {
        }
        u11.k();
        interfaceC3978p0 = (InterfaceC3978p0) C5503f.c(objArr3, null, (Function0) C13, u11, 3072, 6);
        Object[] objArr22 = new Object[0];
        u11.o(93897471);
        C14 = u11.C();
        if (C14 == InterfaceC3967k.a.a()) {
        }
        u11.k();
        interfaceC3978p02 = (InterfaceC3978p0) C5503f.c(objArr22, null, (Function0) C14, u11, 3072, 6);
        l11 = n1.l(function13, u11);
        final String a122 = i.a(u11, R$string.vkid_group_subscription_snackbar_label);
        u11.o(93903624);
        C15 = u11.C();
        if (C15 == InterfaceC3967k.a.a()) {
        }
        interfaceC3978p03 = (InterfaceC3978p0) C15;
        u11.k();
        u11.o(93906523);
        n16 = n15;
        F11 = ((57344 & i19) != 16384) | u11.F(a11) | ((i19 & 896) != 256) | u11.n(n15) | u11.n(a122);
        C16 = u11.C();
        if (F11) {
        }
        interfaceC3978p04 = interfaceC3978p02;
        function14 = function13;
        final Function0 function072 = function04;
        interfaceC3978p05 = l11;
        C3969l c3969l32 = u11;
        Object obj2 = new Function0() { // from class: ja.u
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit GroupSubscriptionSheet$lambda$17$lambda$16;
                GroupSubscriptionSheet$lambda$17$lambda$16 = GroupSubscriptionSheetKt.GroupSubscriptionSheet$lambda$17$lambda$16(M.this, onSuccess, interfaceC3978p03, function072, n16, a122);
                return GroupSubscriptionSheet$lambda$17$lambda$16;
            }
        };
        m11 = a11;
        interfaceC3978p06 = interfaceC3978p03;
        function05 = function072;
        c3969l32.x(obj2);
        C16 = obj2;
        c3969l = c3969l32;
        c3969l.k();
        InterfaceC3978p0 l122 = n1.l((Function0) C16, c3969l);
        c3969l.o(93915880);
        C17 = c3969l.C();
        if (C17 == InterfaceC3967k.a.a()) {
        }
        InterfaceC3978p0 interfaceC3978p092 = (InterfaceC3978p0) C17;
        c3969l.k();
        unit = Unit.f71690a;
        c3969l.o(93918239);
        i21 = (i19 & 112) ^ 48;
        n11 = ((i21 <= 32 && c3969l.n(groupSubscriptionSheetState4)) || (i19 & 48) == 32) | c3969l.n(interfaceC3978p05);
        C18 = c3969l.C();
        if (n11) {
        }
        InterfaceC3978p0 interfaceC3978p0102 = interfaceC3978p05;
        i22 = i21;
        GroupSubscriptionSheetState groupSubscriptionSheetState82 = groupSubscriptionSheetState4;
        unit2 = unit;
        Object groupSubscriptionSheetKt$GroupSubscriptionSheet$2$12 = new GroupSubscriptionSheetKt$GroupSubscriptionSheet$2$1(groupSubscriptionSheetState82, interfaceC3978p06, interfaceC3978p092, interfaceC3978p0102, null);
        interfaceC3978p07 = interfaceC3978p0102;
        groupSubscriptionSheetState5 = groupSubscriptionSheetState82;
        c3969l.x(groupSubscriptionSheetKt$GroupSubscriptionSheet$2$12);
        C18 = groupSubscriptionSheetKt$GroupSubscriptionSheet$2$12;
        c3969l.k();
        Q.e(c3969l, unit2, (Function2) C18);
        c3969l.o(93933915);
        n17 = c3969l.n(interfaceC3978p0);
        C19 = c3969l.C();
        if (!n17) {
        }
        C19 = new C6903a(interfaceC3978p0, 1);
        c3969l.x(C19);
        Function1 function172 = (Function1) C19;
        c3969l.k();
        c3969l.o(93934910);
        n18 = c3969l.n(interfaceC3978p04);
        C21 = c3969l.C();
        if (!n18) {
        }
        C21 = new v(interfaceC3978p04, 0);
        c3969l.x(C21);
        c3969l.k();
        M m132 = m11;
        C3969l c3969l42 = c3969l;
        processSheetShow(function172, (Function1) C21, m132, groupSubscriptionSheetState5, c3969l42, (i19 << 6) & 7168);
        m12 = m132;
        c3969l2 = c3969l42;
        c3969l2.o(93940066);
        if (i18 != 2048) {
        }
        C22 = c3969l2.C();
        if (z12) {
        }
        final InterfaceC3978p0 interfaceC3978p0112 = interfaceC3978p04;
        groupSubscriptionInteractor2 = groupSubscriptionInteractor;
        final InterfaceC3978p0 interfaceC3978p0122 = interfaceC3978p07;
        Function1<? super Boolean, Unit> function182 = new Function1() { // from class: ja.w
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj22) {
                Unit GroupSubscriptionSheet$lambda$30$lambda$29;
                boolean booleanValue = ((Boolean) obj22).booleanValue();
                GroupSubscriptionSheet$lambda$30$lambda$29 = GroupSubscriptionSheetKt.GroupSubscriptionSheet$lambda$30$lambda$29(InterfaceC3978p0.this, m12, groupSubscriptionInteractor2, groupSubscriptionSheetState5, interfaceC3978p0112, interfaceC3978p0122, booleanValue);
                return GroupSubscriptionSheet$lambda$30$lambda$29;
            }
        };
        m12 = m12;
        interfaceC3978p08 = interfaceC3978p0;
        groupSubscriptionSheetState5.setShowSheet$group_subscription_compose_release(function182);
        C22 = 1;
        c3969l2.x(C22);
        ((Number) C22).intValue();
        c3969l2.k();
        V f72 = C5185h.f(InterfaceC6250b.a.o(), false);
        I11 = c3969l2.I();
        A0 d112 = c3969l2.d();
        e f112 = androidx.compose.ui.c.f(c3969l2, eVar3);
        Function0 a132 = g.a(InterfaceC2801g.f5440U, c3969l2);
        if (c3969l2.t()) {
        }
        Function2 f122 = T7.E.f(c3969l2, f72, c3969l2, d112);
        if (!c3969l2.t()) {
        }
        Ep.a.d(I11, c3969l2, I11, f122);
        U7.i.b(c3969l2, f112, 717694292);
        if (GroupSubscriptionSheet$lambda$10(interfaceC3978p04)) {
        }
        c3969l2.k();
        c3969l2.o(717800306);
        if (n14 == null) {
        }
        c3969l2.k();
        c3969l2.f();
        groupSubscriptionStyle6 = groupSubscriptionStyle4;
        eVar2 = eVar4;
        function16 = function15;
        groupSubscriptionSheetState7 = groupSubscriptionSheetState6;
        n19 = n14;
        function06 = function05;
        m02 = c3969l2.m0();
        if (m02 == null) {
        }
    }

    private static final boolean GroupSubscriptionSheet$lambda$10(InterfaceC3978p0<Boolean> interfaceC3978p0) {
        return interfaceC3978p0.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void GroupSubscriptionSheet$lambda$11(InterfaceC3978p0<Boolean> interfaceC3978p0, boolean z11) {
        interfaceC3978p0.setValue(Boolean.valueOf(z11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Function1<VKIDGroupSubscriptionFail, Unit> GroupSubscriptionSheet$lambda$12(A1<? extends Function1<? super VKIDGroupSubscriptionFail, Unit>> a12) {
        return (Function1) a12.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean GroupSubscriptionSheet$lambda$14(InterfaceC3978p0<Boolean> interfaceC3978p0) {
        return interfaceC3978p0.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void GroupSubscriptionSheet$lambda$15(InterfaceC3978p0<Boolean> interfaceC3978p0, boolean z11) {
        interfaceC3978p0.setValue(Boolean.valueOf(z11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GroupSubscriptionSheet$lambda$17$lambda$16(M m11, Function0 function0, InterfaceC3978p0 interfaceC3978p0, Function0 function02, N1 n12, String str) {
        GroupSubscriptionSheet$lambda$15(interfaceC3978p0, true);
        C10727i.c(m11, null, null, new GroupSubscriptionSheetKt$GroupSubscriptionSheet$actualOnSuccess$2$1$1(function02, n12, str, null), 3);
        function0.invoke();
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Function0<Unit> GroupSubscriptionSheet$lambda$18(A1<? extends Function0<Unit>> a12) {
        return a12.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean GroupSubscriptionSheet$lambda$20(InterfaceC3978p0<Boolean> interfaceC3978p0) {
        return interfaceC3978p0.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void GroupSubscriptionSheet$lambda$21(InterfaceC3978p0<Boolean> interfaceC3978p0, boolean z11) {
        interfaceC3978p0.setValue(Boolean.valueOf(z11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GroupSubscriptionSheet$lambda$24$lambda$23(InterfaceC3978p0 interfaceC3978p0, GroupSubscriptionSheetStatus it) {
        Intrinsics.checkNotNullParameter(it, "it");
        interfaceC3978p0.setValue(it);
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GroupSubscriptionSheet$lambda$26$lambda$25(InterfaceC3978p0 interfaceC3978p0, boolean z11) {
        GroupSubscriptionSheet$lambda$11(interfaceC3978p0, z11);
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GroupSubscriptionSheet$lambda$3$lambda$2(VKIDGroupSubscriptionFail it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GroupSubscriptionSheet$lambda$30$lambda$29(final InterfaceC3978p0 interfaceC3978p0, final M m11, final GroupSubscriptionInteractor groupSubscriptionInteractor, final GroupSubscriptionSheetState groupSubscriptionSheetState, final InterfaceC3978p0 interfaceC3978p02, final A1 a12, final boolean z11) {
        VKID.INSTANCE.getInstance().getCrashReporter().runReportingCrashes(new k(1), new Function0() { // from class: ja.c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit GroupSubscriptionSheet$lambda$30$lambda$29$lambda$28;
                GroupSubscriptionSheet$lambda$30$lambda$29$lambda$28 = GroupSubscriptionSheetKt.GroupSubscriptionSheet$lambda$30$lambda$29$lambda$28(z11, interfaceC3978p0, m11, groupSubscriptionInteractor, groupSubscriptionSheetState, interfaceC3978p02, a12);
                return GroupSubscriptionSheet$lambda$30$lambda$29$lambda$28;
            }
        });
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GroupSubscriptionSheet$lambda$30$lambda$29$lambda$27(Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GroupSubscriptionSheet$lambda$30$lambda$29$lambda$28(boolean z11, InterfaceC3978p0 interfaceC3978p0, M m11, GroupSubscriptionInteractor groupSubscriptionInteractor, GroupSubscriptionSheetState groupSubscriptionSheetState, InterfaceC3978p0 interfaceC3978p02, A1 a12) {
        if (z11) {
            interfaceC3978p0.setValue(GroupSubscriptionSheetStatus.Init.INSTANCE);
            C10727i.c(m11, null, null, new GroupSubscriptionSheetKt$GroupSubscriptionSheet$5$1$2$1(groupSubscriptionInteractor, groupSubscriptionSheetState, interfaceC3978p0, interfaceC3978p02, a12, null), 3);
        } else {
            GroupSubscriptionSheet$lambda$11(interfaceC3978p02, false);
        }
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GroupSubscriptionSheet$lambda$33(e eVar, GroupSubscriptionSheetState groupSubscriptionSheetState, Function0 function0, String str, Function0 function02, Function1 function1, N1 n12, GroupSubscriptionStyle groupSubscriptionStyle, int i11, int i12, InterfaceC3967k interfaceC3967k, int i13) {
        GroupSubscriptionSheet(eVar, groupSubscriptionSheetState, function0, str, function02, function1, n12, groupSubscriptionStyle, interfaceC3967k, C2652m.e(i11 | 1), i12);
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC3978p0 GroupSubscriptionSheet$lambda$7$lambda$6() {
        C3991w0 f7;
        f7 = n1.f(GroupSubscriptionSheetStatus.Init.INSTANCE, D1.f25195a);
        return f7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC3978p0 GroupSubscriptionSheet$lambda$9$lambda$8() {
        C3991w0 f7;
        f7 = n1.f(Boolean.FALSE, D1.f25195a);
        return f7;
    }

    public static final void GroupSubscriptionSnackbarHost(@NotNull N1 snackbarHostState, final GroupSubscriptionStyle groupSubscriptionStyle, InterfaceC3967k interfaceC3967k, final int i11, final int i12) {
        int i13;
        final N1 n12;
        Intrinsics.checkNotNullParameter(snackbarHostState, "snackbarHostState");
        C3969l u11 = interfaceC3967k.u(362620788);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.n(snackbarHostState) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= ((i12 & 2) == 0 && u11.F(groupSubscriptionStyle)) ? 32 : 16;
        }
        if ((i13 & 19) == 18 && u11.b()) {
            u11.j();
            n12 = snackbarHostState;
        } else {
            u11.Q0();
            if ((i11 & 1) != 0 && !u11.w0()) {
                u11.j();
                if ((i12 & 2) != 0) {
                    i13 &= -113;
                }
            } else if ((i12 & 2) != 0) {
                i13 &= -113;
                groupSubscriptionStyle = new GroupSubscriptionStyle.Light(null, null, null, 7, null);
            }
            u11.j0();
            e.a aVar = e.f40358c0;
            e f7 = T.f(a0.d(aVar), 8);
            V f11 = C5185h.f(InterfaceC6250b.a.o(), false);
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f12 = androidx.compose.ui.c.f(u11, f7);
            Function0 a11 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a11);
            } else {
                u11.e();
            }
            Function2 f13 = T7.E.f(u11, f11, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                Ep.a.d(I11, u11, I11, f13);
            }
            F1.b(u11, f12, InterfaceC2801g.a.f());
            n12 = snackbarHostState;
            K1.b(n12, C5187j.f39515a.a(aVar, InterfaceC6250b.a.b()), a1.c.c(2082913281, new InterfaceC6511n<InterfaceC3793z1, InterfaceC3967k, Integer, Unit>() { // from class: com.vk.id.group.subscription.compose.ui.GroupSubscriptionSheetKt$GroupSubscriptionSnackbarHost$1$1
                @Override // fd.InterfaceC6511n
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3793z1 interfaceC3793z1, InterfaceC3967k interfaceC3967k2, Integer num) {
                    invoke(interfaceC3793z1, interfaceC3967k2, num.intValue());
                    return Unit.f71690a;
                }

                public final void invoke(InterfaceC3793z1 snackbarData, InterfaceC3967k interfaceC3967k2, int i14) {
                    Intrinsics.checkNotNullParameter(snackbarData, "snackbarData");
                    if ((i14 & 6) == 0) {
                        i14 |= interfaceC3967k2.n(snackbarData) ? 4 : 2;
                    }
                    if ((i14 & 19) == 18 && interfaceC3967k2.b()) {
                        interfaceC3967k2.j();
                    } else {
                        GroupSubscriptionSnackbarKt.GroupSubscriptionSnackbar(GroupSubscriptionStyle.this, snackbarData.b().getMessage(), interfaceC3967k2, 0);
                    }
                }
            }, u11), u11, (i13 & 14) | 384, 0);
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new Function2() { // from class: ja.a
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit GroupSubscriptionSnackbarHost$lambda$1;
                    int intValue = ((Integer) obj2).intValue();
                    int i14 = i11;
                    int i15 = i12;
                    GroupSubscriptionSnackbarHost$lambda$1 = GroupSubscriptionSheetKt.GroupSubscriptionSnackbarHost$lambda$1(N1.this, groupSubscriptionStyle, i14, i15, (InterfaceC3967k) obj, intValue);
                    return GroupSubscriptionSnackbarHost$lambda$1;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GroupSubscriptionSnackbarHost$lambda$1(N1 n12, GroupSubscriptionStyle groupSubscriptionStyle, int i11, int i12, InterfaceC3967k interfaceC3967k, int i13) {
        GroupSubscriptionSnackbarHost(n12, groupSubscriptionStyle, interfaceC3967k, C2652m.e(i11 | 1), i12);
        return Unit.f71690a;
    }

    public static final void LoadedState(@NotNull final Function1<? super kotlin.coroutines.d<? super Unit>, ? extends Object> saveDisplay, @NotNull final Function1<? super VKIDGroupSubscriptionFail, Unit> onFail, @NotNull final GroupSubscriptionStyle style, @NotNull final GroupSubscriptionSheetState state, @NotNull final GroupSubscriptionSheetStatus.Loaded status, @NotNull final Function0<Unit> onSubscribeButtonClick, InterfaceC3967k interfaceC3967k, final int i11) {
        int i12;
        C3969l c3969l;
        Intrinsics.checkNotNullParameter(saveDisplay, "saveDisplay");
        Intrinsics.checkNotNullParameter(onFail, "onFail");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(onSubscribeButtonClick, "onSubscribeButtonClick");
        C3969l u11 = interfaceC3967k.u(-869972361);
        if ((i11 & 6) == 0) {
            i12 = (u11.F(saveDisplay) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.F(onFail) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.F(style) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i11 & 3072) == 0) {
            i12 |= u11.n(state) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i11 & 24576) == 0) {
            i12 |= u11.n(status) ? 16384 : 8192;
        }
        if ((i11 & 196608) == 0) {
            i12 |= u11.F(onSubscribeButtonClick) ? 131072 : 65536;
        }
        if ((74899 & i12) == 74898 && u11.b()) {
            u11.j();
            c3969l = u11;
        } else {
            Object[] objArr = new Object[0];
            u11.o(-1463176991);
            Object C11 = u11.C();
            if (C11 == InterfaceC3967k.a.a()) {
                C11 = new C7326f();
                u11.x(C11);
            }
            u11.k();
            c3969l = u11;
            InterfaceC3978p0 interfaceC3978p0 = (InterfaceC3978p0) C5503f.c(objArr, null, (Function0) C11, c3969l, 3072, 6);
            InterfaceC3978p0 l11 = n1.l(saveDisplay, c3969l);
            Unit unit = Unit.f71690a;
            c3969l.o(-1463173173);
            boolean n11 = c3969l.n(interfaceC3978p0) | c3969l.n(l11);
            Object C12 = c3969l.C();
            if (n11 || C12 == InterfaceC3967k.a.a()) {
                C12 = new GroupSubscriptionSheetKt$LoadedState$1$1(interfaceC3978p0, l11, null);
                c3969l.x(C12);
            }
            c3969l.k();
            Q.e(c3969l, unit, (Function2) C12);
            GroupSubscriptionAnalytics groupSubscriptionAnalytics = GroupSubscriptionAnalytics.INSTANCE;
            AccessToken accessToken = VKID.INSTANCE.getInstance().getAccessToken();
            groupSubscriptionAnalytics.SheetShown$group_subscription_compose_release(accessToken != null ? accessToken.getToken() : null, c3969l, 0);
            int i13 = i12 >> 6;
            DataState(style, state, status.getData(), onFail, onSubscribeButtonClick, a1.c.c(-577510560, new Function2<InterfaceC3967k, Integer, Unit>() { // from class: com.vk.id.group.subscription.compose.ui.GroupSubscriptionSheetKt$LoadedState$2
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k2, Integer num) {
                    invoke(interfaceC3967k2, num.intValue());
                    return Unit.f71690a;
                }

                public final void invoke(InterfaceC3967k interfaceC3967k2, int i14) {
                    F f7;
                    if ((i14 & 3) == 2 && interfaceC3967k2.b()) {
                        interfaceC3967k2.j();
                        return;
                    }
                    String a11 = i.a(interfaceC3967k2, R$string.vkid_group_subscription_primary);
                    e.a aVar = e.f40358c0;
                    long textPrimaryButtonColor = StylingUtilKt.textPrimaryButtonColor(GroupSubscriptionStyle.this);
                    long d11 = Hj0.T.d(GroupSubscriptionStyle.this.getButtonsSizeStyle().getTextSizeSp());
                    long d12 = Hj0.T.d(20);
                    f7 = F.f21510h;
                    p2.b(a11, aVar, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, new K1.T(textPrimaryButtonColor, d11, f7, null, 0L, 3, d12, null, 0, 16613368), interfaceC3967k2, 48, 0, 65532);
                }
            }, c3969l), c3969l, (i13 & 112) | (i13 & 14) | 196608 | ((i12 << 6) & 7168) | ((i12 >> 3) & 57344));
        }
        J0 m02 = c3969l.m0();
        if (m02 != null) {
            m02.G(new Function2() { // from class: ja.g
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit LoadedState$lambda$40;
                    int intValue = ((Integer) obj2).intValue();
                    Function0 function0 = onSubscribeButtonClick;
                    int i14 = i11;
                    LoadedState$lambda$40 = GroupSubscriptionSheetKt.LoadedState$lambda$40(Function1.this, onFail, style, state, status, function0, i14, (InterfaceC3967k) obj, intValue);
                    return LoadedState$lambda$40;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC3978p0 LoadedState$lambda$35$lambda$34() {
        C3991w0 f7;
        f7 = n1.f(Boolean.TRUE, D1.f25195a);
        return f7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean LoadedState$lambda$36(InterfaceC3978p0<Boolean> interfaceC3978p0) {
        return interfaceC3978p0.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void LoadedState$lambda$37(InterfaceC3978p0<Boolean> interfaceC3978p0, boolean z11) {
        interfaceC3978p0.setValue(Boolean.valueOf(z11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Function1<kotlin.coroutines.d<? super Unit>, Object> LoadedState$lambda$38(A1<? extends Function1<? super kotlin.coroutines.d<? super Unit>, ? extends Object>> a12) {
        return (Function1) a12.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LoadedState$lambda$40(Function1 function1, Function1 function12, GroupSubscriptionStyle groupSubscriptionStyle, GroupSubscriptionSheetState groupSubscriptionSheetState, GroupSubscriptionSheetStatus.Loaded loaded, Function0 function0, int i11, InterfaceC3967k interfaceC3967k, int i12) {
        LoadedState(function1, function12, groupSubscriptionStyle, groupSubscriptionSheetState, loaded, function0, interfaceC3967k, C2652m.e(i11 | 1));
        return Unit.f71690a;
    }

    public static final void ResubscribingState(@NotNull final GroupSubscriptionStyle style, @NotNull GroupSubscriptionSheetState state, @NotNull Function1<? super VKIDGroupSubscriptionFail, Unit> onFail, @NotNull Function0<Unit> onRetry, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        GroupSubscriptionStyle groupSubscriptionStyle;
        GroupSubscriptionSheetState groupSubscriptionSheetState;
        Function1<? super VKIDGroupSubscriptionFail, Unit> function1;
        Function0<Unit> function0;
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onFail, "onFail");
        Intrinsics.checkNotNullParameter(onRetry, "onRetry");
        C3969l u11 = interfaceC3967k.u(1865814551);
        if ((i11 & 6) == 0) {
            i12 = (u11.F(style) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.n(state) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.F(onFail) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i11 & 3072) == 0) {
            i12 |= u11.F(onRetry) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i12 & 1171) == 1170 && u11.b()) {
            u11.j();
            function0 = onRetry;
            function1 = onFail;
            groupSubscriptionSheetState = state;
            groupSubscriptionStyle = style;
        } else {
            FailureDataState(style, state, onFail, onRetry, a1.c.c(1912241861, new Function2<InterfaceC3967k, Integer, Unit>() { // from class: com.vk.id.group.subscription.compose.ui.GroupSubscriptionSheetKt$ResubscribingState$1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k2, Integer num) {
                    invoke(interfaceC3967k2, num.intValue());
                    return Unit.f71690a;
                }

                public final void invoke(InterfaceC3967k interfaceC3967k2, int i13) {
                    if ((i13 & 3) == 2 && interfaceC3967k2.b()) {
                        interfaceC3967k2.j();
                        return;
                    }
                    e n11 = a0.n(e.f40358c0, 24);
                    GroupSubscriptionStyle groupSubscriptionStyle2 = GroupSubscriptionStyle.this;
                    V f7 = C5185h.f(InterfaceC6250b.a.o(), false);
                    int I11 = interfaceC3967k2.I();
                    A0 d11 = interfaceC3967k2.d();
                    e f11 = androidx.compose.ui.c.f(interfaceC3967k2, n11);
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
                    CircleProgressKt.CircleProgress(groupSubscriptionStyle2, "Resubscribing to group spinner", interfaceC3967k2, 48);
                    interfaceC3967k2.f();
                }
            }, u11), u11, (i12 & 14) | 24576 | (i12 & 112) | (i12 & 896) | (i12 & 7168));
            groupSubscriptionStyle = style;
            groupSubscriptionSheetState = state;
            function1 = onFail;
            function0 = onRetry;
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new C7325e(groupSubscriptionStyle, groupSubscriptionSheetState, function1, function0, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ResubscribingState$lambda$44(GroupSubscriptionStyle groupSubscriptionStyle, GroupSubscriptionSheetState groupSubscriptionSheetState, Function1 function1, Function0 function0, int i11, InterfaceC3967k interfaceC3967k, int i12) {
        ResubscribingState(groupSubscriptionStyle, groupSubscriptionSheetState, function1, function0, interfaceC3967k, C2652m.e(i11 | 1));
        return Unit.f71690a;
    }

    public static final void SubscribingState(@NotNull final GroupSubscriptionStyle style, @NotNull GroupSubscriptionSheetState state, @NotNull final GroupSubscriptionSheetStatus.Subscribing status, @NotNull Function1<? super VKIDGroupSubscriptionFail, Unit> onFail, InterfaceC3967k interfaceC3967k, final int i11) {
        int i12;
        GroupSubscriptionSheetState groupSubscriptionSheetState;
        final GroupSubscriptionStyle groupSubscriptionStyle;
        final Function1<? super VKIDGroupSubscriptionFail, Unit> function1;
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(onFail, "onFail");
        C3969l u11 = interfaceC3967k.u(1530893849);
        if ((i11 & 6) == 0) {
            i12 = (u11.F(style) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.n(state) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.n(status) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i11 & 3072) == 0) {
            i12 |= u11.F(onFail) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i12 & 1171) == 1170 && u11.b()) {
            u11.j();
            groupSubscriptionSheetState = state;
            function1 = onFail;
            groupSubscriptionStyle = style;
        } else {
            GroupSubscriptionSheetStatusData data = status.getData();
            u11.o(-368324177);
            Object C11 = u11.C();
            if (C11 == InterfaceC3967k.a.a()) {
                C11 = new C7328h();
                u11.x(C11);
            }
            u11.k();
            groupSubscriptionSheetState = state;
            DataState(style, groupSubscriptionSheetState, data, onFail, (Function0) C11, a1.c.c(-1285683696, new Function2<InterfaceC3967k, Integer, Unit>() { // from class: com.vk.id.group.subscription.compose.ui.GroupSubscriptionSheetKt$SubscribingState$2
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k2, Integer num) {
                    invoke(interfaceC3967k2, num.intValue());
                    return Unit.f71690a;
                }

                public final void invoke(InterfaceC3967k interfaceC3967k2, int i13) {
                    if ((i13 & 3) == 2 && interfaceC3967k2.b()) {
                        interfaceC3967k2.j();
                        return;
                    }
                    e n11 = a0.n(e.f40358c0, 24);
                    GroupSubscriptionStyle groupSubscriptionStyle2 = GroupSubscriptionStyle.this;
                    V f7 = C5185h.f(InterfaceC6250b.a.o(), false);
                    int I11 = interfaceC3967k2.I();
                    A0 d11 = interfaceC3967k2.d();
                    e f11 = androidx.compose.ui.c.f(interfaceC3967k2, n11);
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
                    CircleProgressKt.CircleProgress(groupSubscriptionStyle2, "Subscribing to group spinner", interfaceC3967k2, 48);
                    interfaceC3967k2.f();
                }
            }, u11), u11, (i12 & 14) | 221184 | (i12 & 112) | (i12 & 7168));
            groupSubscriptionStyle = style;
            function1 = onFail;
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            final GroupSubscriptionSheetState groupSubscriptionSheetState2 = groupSubscriptionSheetState;
            m02.G(new Function2() { // from class: ja.i
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit SubscribingState$lambda$43;
                    int intValue = ((Integer) obj2).intValue();
                    Function1 function12 = function1;
                    int i13 = i11;
                    SubscribingState$lambda$43 = GroupSubscriptionSheetKt.SubscribingState$lambda$43(GroupSubscriptionStyle.this, groupSubscriptionSheetState2, status, function12, i13, (InterfaceC3967k) obj, intValue);
                    return SubscribingState$lambda$43;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SubscribingState$lambda$43(GroupSubscriptionStyle groupSubscriptionStyle, GroupSubscriptionSheetState groupSubscriptionSheetState, GroupSubscriptionSheetStatus.Subscribing subscribing, Function1 function1, int i11, InterfaceC3967k interfaceC3967k, int i12) {
        SubscribingState(groupSubscriptionStyle, groupSubscriptionSheetState, subscribing, function1, interfaceC3967k, C2652m.e(i11 | 1));
        return Unit.f71690a;
    }

    private static final Function1<Boolean, Unit> processSheetShow(final Function1<? super GroupSubscriptionSheetStatus, Unit> function1, final Function1<? super Boolean, Unit> function12, final M m11, final GroupSubscriptionSheetState groupSubscriptionSheetState, InterfaceC3967k interfaceC3967k, int i11) {
        interfaceC3967k.o(-11956810);
        interfaceC3967k.o(-127985687);
        Object C11 = interfaceC3967k.C();
        if (C11 == InterfaceC3967k.a.a()) {
            C11 = new Function1() { // from class: ja.b
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit processSheetShow$lambda$71$lambda$70;
                    boolean booleanValue = ((Boolean) obj).booleanValue();
                    processSheetShow$lambda$71$lambda$70 = GroupSubscriptionSheetKt.processSheetShow$lambda$71$lambda$70(Function1.this, function12, m11, groupSubscriptionSheetState, booleanValue);
                    return processSheetShow$lambda$71$lambda$70;
                }
            };
            interfaceC3967k.x(C11);
        }
        Function1<Boolean, Unit> function13 = (Function1) C11;
        interfaceC3967k.k();
        interfaceC3967k.k();
        return function13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit processSheetShow$lambda$71$lambda$70(Function1 function1, final Function1 function12, M m11, final GroupSubscriptionSheetState groupSubscriptionSheetState, boolean z11) {
        if (z11) {
            function1.invoke(GroupSubscriptionSheetStatus.Init.INSTANCE);
        }
        if (z11) {
            function12.invoke(Boolean.TRUE);
        } else {
            ((H0) C10727i.c(m11, null, null, new GroupSubscriptionSheetKt$processSheetShow$1$1$1(groupSubscriptionSheetState, null), 3)).y(new Function1() { // from class: ja.k
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit processSheetShow$lambda$71$lambda$70$lambda$69;
                    processSheetShow$lambda$71$lambda$70$lambda$69 = GroupSubscriptionSheetKt.processSheetShow$lambda$71$lambda$70$lambda$69(GroupSubscriptionSheetState.this, function12, (Throwable) obj);
                    return processSheetShow$lambda$71$lambda$70$lambda$69;
                }
            });
        }
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit processSheetShow$lambda$71$lambda$70$lambda$69(GroupSubscriptionSheetState groupSubscriptionSheetState, Function1 function1, Throwable th2) {
        if (!groupSubscriptionSheetState.isVisible()) {
            function1.invoke(Boolean.FALSE);
        }
        return Unit.f71690a;
    }

    @NotNull
    public static final GroupSubscriptionSheetState rememberGroupSubscriptionSheetState(InterfaceC3967k interfaceC3967k, int i11) {
        interfaceC3967k.o(-1017502691);
        GroupSubscriptionSheetState rememberGroupSubscriptionSheetStateInternal = rememberGroupSubscriptionSheetStateInternal(interfaceC3967k, 0);
        interfaceC3967k.k();
        return rememberGroupSubscriptionSheetStateInternal;
    }

    private static final GroupSubscriptionSheetState rememberGroupSubscriptionSheetStateInternal(InterfaceC3967k interfaceC3967k, int i11) {
        interfaceC3967k.o(-712072454);
        interfaceC3967k.o(-1797808311);
        Object C11 = interfaceC3967k.C();
        if (C11 == InterfaceC3967k.a.a()) {
            C11 = n1.f(EnumC3790y1.Hidden, D1.f25195a);
            interfaceC3967k.x(C11);
        }
        InterfaceC3978p0 interfaceC3978p0 = (InterfaceC3978p0) C11;
        interfaceC3967k.k();
        interfaceC3967k.o(-1797803135);
        Object C12 = interfaceC3967k.C();
        if (C12 == InterfaceC3967k.a.a()) {
            C12 = new C7330j(interfaceC3978p0, 0);
            interfaceC3967k.x(C12);
        }
        interfaceC3967k.k();
        C3787x1 g10 = B0.g((Function1) C12, interfaceC3967k, 54, 0);
        interfaceC3967k.o(-1797796446);
        boolean n11 = interfaceC3967k.n(g10);
        Object C13 = interfaceC3967k.C();
        if (n11 || C13 == InterfaceC3967k.a.a()) {
            C13 = new GroupSubscriptionSheetState(g10);
            interfaceC3967k.x(C13);
        }
        GroupSubscriptionSheetState groupSubscriptionSheetState = (GroupSubscriptionSheetState) C13;
        interfaceC3967k.k();
        interfaceC3967k.k();
        return groupSubscriptionSheetState;
    }

    private static final EnumC3790y1 rememberGroupSubscriptionSheetStateInternal$lambda$73(InterfaceC3978p0<EnumC3790y1> interfaceC3978p0) {
        return interfaceC3978p0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean rememberGroupSubscriptionSheetStateInternal$lambda$76$lambda$75(InterfaceC3978p0 interfaceC3978p0, EnumC3790y1 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it == EnumC3790y1.Hidden && it != rememberGroupSubscriptionSheetStateInternal$lambda$73(interfaceC3978p0)) {
            GroupSubscriptionAnalytics groupSubscriptionAnalytics = GroupSubscriptionAnalytics.INSTANCE;
            AccessToken accessToken = VKID.INSTANCE.getInstance().getAccessToken();
            groupSubscriptionAnalytics.close$group_subscription_compose_release(accessToken != null ? accessToken.getToken() : null);
        }
        interfaceC3978p0.setValue(it);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void subscribeToGroup(InterfaceC3978p0<GroupSubscriptionSheetStatus> interfaceC3978p0, GroupSubscriptionSheetStatusData groupSubscriptionSheetStatusData, GroupSubscriptionSheetState groupSubscriptionSheetState, M m11, GroupSubscriptionInteractor groupSubscriptionInteractor, Function0<Unit> function0, GroupSubscriptionSheetStatus groupSubscriptionSheetStatus) {
        interfaceC3978p0.setValue(groupSubscriptionSheetStatus);
        C10727i.c(m11, null, null, new GroupSubscriptionSheetKt$subscribeToGroup$1(groupSubscriptionInteractor, function0, groupSubscriptionSheetState, interfaceC3978p0, groupSubscriptionSheetStatusData, null), 3);
    }
}

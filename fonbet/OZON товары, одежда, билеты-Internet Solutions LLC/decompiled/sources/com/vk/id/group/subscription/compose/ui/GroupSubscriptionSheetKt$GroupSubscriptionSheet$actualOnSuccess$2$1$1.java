package com.vk.id.group.subscription.compose.ui;

import P0.N1;
import Sc.s;
import com.vk.id.AccessToken;
import com.vk.id.VKID;
import com.vk.id.group.subscription.compose.analytics.GroupSubscriptionAnalytics;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "com.vk.id.group.subscription.compose.ui.GroupSubscriptionSheetKt$GroupSubscriptionSheet$actualOnSuccess$2$1$1", f = "GroupSubscriptionSheet.kt", l = {194}, m = "invokeSuspend")
/* loaded from: classes9.dex */
final class GroupSubscriptionSheetKt$GroupSubscriptionSheet$actualOnSuccess$2$1$1 extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {
    final /* synthetic */ Function0<String> $accessTokenProvider;
    final /* synthetic */ N1 $actualSnackbarHostState;
    final /* synthetic */ String $snackbarLabel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GroupSubscriptionSheetKt$GroupSubscriptionSheet$actualOnSuccess$2$1$1(Function0<String> function0, N1 n12, String str, kotlin.coroutines.d<? super GroupSubscriptionSheetKt$GroupSubscriptionSheet$actualOnSuccess$2$1$1> dVar) {
        super(2, dVar);
        this.$accessTokenProvider = function0;
        this.$actualSnackbarHostState = n12;
        this.$snackbarLabel = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new GroupSubscriptionSheetKt$GroupSubscriptionSheet$actualOnSuccess$2$1$1(this.$accessTokenProvider, this.$actualSnackbarHostState, this.$snackbarLabel, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        String token;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            GroupSubscriptionAnalytics groupSubscriptionAnalytics = GroupSubscriptionAnalytics.INSTANCE;
            Function0<String> function0 = this.$accessTokenProvider;
            if (function0 == null || (token = function0.invoke()) == null) {
                AccessToken accessToken = VKID.INSTANCE.getInstance().getAccessToken();
                token = accessToken != null ? accessToken.getToken() : null;
            }
            groupSubscriptionAnalytics.successShown$group_subscription_compose_release(token);
            N1 n12 = this.$actualSnackbarHostState;
            String str = this.$snackbarLabel;
            this.label = 1;
            if (N1.c(n12, str, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((GroupSubscriptionSheetKt$GroupSubscriptionSheet$actualOnSuccess$2$1$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}

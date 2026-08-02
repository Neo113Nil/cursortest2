package com.vk.id.network.groupsubscription;

import He.b;
import Wc.a;
import com.vk.id.network.groupsubscription.data.InternalVKIDGroupByIdData;
import com.vk.id.network.groupsubscription.data.InternalVKIDGroupMembersData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.C10720e0;
import xe.C10727i;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u000b\u0010\nJ \u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u000e\u0010\u000fJ(\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u0012\u0010\u0013J \u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u0015\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/vk/id/network/groupsubscription/InternalVKIDGroupSubscriptionApiService;", "Lcom/vk/id/network/groupsubscription/InternalVKIDGroupSubscriptionApiContract;", "Lcom/vk/id/network/groupsubscription/InternalVKIDGroupSubscriptionApi;", "api", "<init>", "(Lcom/vk/id/network/groupsubscription/InternalVKIDGroupSubscriptionApi;)V", "", "accessToken", "", "shouldShowSubscription", "(Ljava/lang/String;Lkotlin/coroutines/d;)Ljava/lang/Object;", "isServiceAccount", "groupId", "Lcom/vk/id/network/groupsubscription/data/InternalVKIDGroupByIdData;", "getGroup", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/d;)Ljava/lang/Object;", "justFriends", "Lcom/vk/id/network/groupsubscription/data/InternalVKIDGroupMembersData;", "getMembers", "(Ljava/lang/String;Ljava/lang/String;ZLkotlin/coroutines/d;)Ljava/lang/Object;", "", "subscribeToGroup", "Lcom/vk/id/network/groupsubscription/InternalVKIDGroupSubscriptionApi;", "network_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class InternalVKIDGroupSubscriptionApiService implements InternalVKIDGroupSubscriptionApiContract {

    @NotNull
    private final InternalVKIDGroupSubscriptionApi api;

    public InternalVKIDGroupSubscriptionApiService(@NotNull InternalVKIDGroupSubscriptionApi api) {
        Intrinsics.checkNotNullParameter(api, "api");
        this.api = api;
    }

    @Override // com.vk.id.network.groupsubscription.InternalVKIDGroupSubscriptionApiContract
    public Object getGroup(@NotNull String str, @NotNull String str2, @NotNull d<? super InternalVKIDGroupByIdData> dVar) {
        C10720e0 c10720e0 = C10720e0.f105451a;
        return C10727i.f(b.f10879b, new InternalVKIDGroupSubscriptionApiService$getGroup$2(this, str, str2, null), dVar);
    }

    @Override // com.vk.id.network.groupsubscription.InternalVKIDGroupSubscriptionApiContract
    public Object getMembers(@NotNull String str, @NotNull String str2, boolean z11, @NotNull d<? super InternalVKIDGroupMembersData> dVar) {
        C10720e0 c10720e0 = C10720e0.f105451a;
        return C10727i.f(b.f10879b, new InternalVKIDGroupSubscriptionApiService$getMembers$2(this, str, str2, z11, null), dVar);
    }

    @Override // com.vk.id.network.groupsubscription.InternalVKIDGroupSubscriptionApiContract
    public Object isServiceAccount(@NotNull String str, @NotNull d<? super Boolean> dVar) {
        C10720e0 c10720e0 = C10720e0.f105451a;
        return C10727i.f(b.f10879b, new InternalVKIDGroupSubscriptionApiService$isServiceAccount$2(this, str, null), dVar);
    }

    @Override // com.vk.id.network.groupsubscription.InternalVKIDGroupSubscriptionApiContract
    public Object shouldShowSubscription(@NotNull String str, @NotNull d<? super Boolean> dVar) {
        C10720e0 c10720e0 = C10720e0.f105451a;
        return C10727i.f(b.f10879b, new InternalVKIDGroupSubscriptionApiService$shouldShowSubscription$2(this, str, null), dVar);
    }

    @Override // com.vk.id.network.groupsubscription.InternalVKIDGroupSubscriptionApiContract
    public Object subscribeToGroup(@NotNull String str, @NotNull String str2, @NotNull d<? super Unit> dVar) {
        C10720e0 c10720e0 = C10720e0.f105451a;
        Object f7 = C10727i.f(b.f10879b, new InternalVKIDGroupSubscriptionApiService$subscribeToGroup$2(this, str, str2, null), dVar);
        return f7 == a.COROUTINE_SUSPENDED ? f7 : Unit.f71690a;
    }
}

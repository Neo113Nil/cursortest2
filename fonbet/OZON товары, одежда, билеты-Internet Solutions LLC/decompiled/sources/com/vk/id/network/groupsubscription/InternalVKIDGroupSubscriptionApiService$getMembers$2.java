package com.vk.id.network.groupsubscription;

import Sc.s;
import Wc.a;
import com.vk.id.network.groupsubscription.data.InternalVKIDGroupMembersData;
import com.vk.id.network.groupsubscription.data.InternalVKIDMemberData;
import java.io.IOException;
import java.util.ArrayList;
import kd.C7665d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.h;
import org.json.JSONArray;
import org.json.JSONObject;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "Lcom/vk/id/network/groupsubscription/data/InternalVKIDGroupMembersData;", "<anonymous>", "(Lxe/M;)Lcom/vk/id/network/groupsubscription/data/InternalVKIDGroupMembersData;"}, k = 3, mv = {2, 0, 0})
@e(c = "com.vk.id.network.groupsubscription.InternalVKIDGroupSubscriptionApiService$getMembers$2", f = "InternalVKIDGroupSubscriptionApiService.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes9.dex */
final class InternalVKIDGroupSubscriptionApiService$getMembers$2 extends j implements Function2<M, d<? super InternalVKIDGroupMembersData>, Object> {
    final /* synthetic */ String $accessToken;
    final /* synthetic */ String $groupId;
    final /* synthetic */ boolean $justFriends;
    int label;
    final /* synthetic */ InternalVKIDGroupSubscriptionApiService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InternalVKIDGroupSubscriptionApiService$getMembers$2(InternalVKIDGroupSubscriptionApiService internalVKIDGroupSubscriptionApiService, String str, String str2, boolean z11, d<? super InternalVKIDGroupSubscriptionApiService$getMembers$2> dVar) {
        super(2, dVar);
        this.this$0 = internalVKIDGroupSubscriptionApiService;
        this.$accessToken = str;
        this.$groupId = str2;
        this.$justFriends = z11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new InternalVKIDGroupSubscriptionApiService$getMembers$2(this.this$0, this.$accessToken, this.$groupId, this.$justFriends, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        InternalVKIDGroupSubscriptionApi internalVKIDGroupSubscriptionApi;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        internalVKIDGroupSubscriptionApi = this.this$0.api;
        We.M c11 = internalVKIDGroupSubscriptionApi.getMembers(this.$accessToken, this.$groupId, this.$justFriends).execute().c();
        if (c11 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        JSONObject jSONObject = new JSONObject(c11.string());
        if (!jSONObject.isNull("error")) {
            throw new IOException(jSONObject.getString("error"));
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("response");
        JSONArray jSONArray = jSONObject2.getJSONArray("items");
        int i11 = jSONObject2.getInt("count");
        IntRange o11 = h.o(0, jSONArray.length());
        ArrayList arrayList = new ArrayList(C7714v.z(o11, 10));
        C7665d it = o11.iterator();
        while (it.hasNext()) {
            String string = jSONArray.getJSONObject(it.b()).getString("photo_200");
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            arrayList.add(new InternalVKIDMemberData(string));
        }
        return new InternalVKIDGroupMembersData(i11, arrayList);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super InternalVKIDGroupMembersData> dVar) {
        return ((InternalVKIDGroupSubscriptionApiService$getMembers$2) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}

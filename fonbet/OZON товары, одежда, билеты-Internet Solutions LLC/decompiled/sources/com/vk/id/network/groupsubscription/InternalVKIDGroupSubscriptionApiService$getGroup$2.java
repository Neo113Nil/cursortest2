package com.vk.id.network.groupsubscription;

import Sc.s;
import Wc.a;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.vk.id.network.groupsubscription.data.InternalVKIDGroupByIdData;
import com.vk.id.network.groupsubscription.exception.InternalVKIDAlreadyGroupMemberException;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "Lcom/vk/id/network/groupsubscription/data/InternalVKIDGroupByIdData;", "<anonymous>", "(Lxe/M;)Lcom/vk/id/network/groupsubscription/data/InternalVKIDGroupByIdData;"}, k = 3, mv = {2, 0, 0})
@e(c = "com.vk.id.network.groupsubscription.InternalVKIDGroupSubscriptionApiService$getGroup$2", f = "InternalVKIDGroupSubscriptionApiService.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes9.dex */
final class InternalVKIDGroupSubscriptionApiService$getGroup$2 extends j implements Function2<M, d<? super InternalVKIDGroupByIdData>, Object> {
    final /* synthetic */ String $accessToken;
    final /* synthetic */ String $groupId;
    int label;
    final /* synthetic */ InternalVKIDGroupSubscriptionApiService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InternalVKIDGroupSubscriptionApiService$getGroup$2(InternalVKIDGroupSubscriptionApiService internalVKIDGroupSubscriptionApiService, String str, String str2, d<? super InternalVKIDGroupSubscriptionApiService$getGroup$2> dVar) {
        super(2, dVar);
        this.this$0 = internalVKIDGroupSubscriptionApiService;
        this.$accessToken = str;
        this.$groupId = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new InternalVKIDGroupSubscriptionApiService$getGroup$2(this.this$0, this.$accessToken, this.$groupId, dVar);
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
        We.M c11 = internalVKIDGroupSubscriptionApi.getGroup(this.$accessToken, this.$groupId).execute().c();
        if (c11 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        JSONObject jSONObject = new JSONObject(c11.string());
        if (!jSONObject.isNull("error")) {
            throw new IOException(jSONObject.getString("error"));
        }
        Object obj2 = jSONObject.getJSONObject("response").getJSONArray("groups").get(0);
        Intrinsics.g(obj2, "null cannot be cast to non-null type org.json.JSONObject");
        JSONObject jSONObject2 = (JSONObject) obj2;
        if (jSONObject2.getInt("is_member") == 1) {
            throw new InternalVKIDAlreadyGroupMemberException();
        }
        String string = jSONObject2.getString("id");
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String string2 = jSONObject2.getString(AppMeasurementSdk.ConditionalUserProperty.NAME);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        String string3 = jSONObject2.getString("photo_200");
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        String string4 = jSONObject2.getString("description");
        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
        return new InternalVKIDGroupByIdData(string, string2, string3, string4, jSONObject2.getInt("verified") == 1);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super InternalVKIDGroupByIdData> dVar) {
        return ((InternalVKIDGroupSubscriptionApiService$getGroup$2) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}

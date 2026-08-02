package com.vk.id.network.groupsubscription;

import Sc.s;
import Wc.a;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import org.json.JSONObject;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)Z"}, k = 3, mv = {2, 0, 0})
@e(c = "com.vk.id.network.groupsubscription.InternalVKIDGroupSubscriptionApiService$isServiceAccount$2", f = "InternalVKIDGroupSubscriptionApiService.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes9.dex */
final class InternalVKIDGroupSubscriptionApiService$isServiceAccount$2 extends j implements Function2<M, d<? super Boolean>, Object> {
    final /* synthetic */ String $accessToken;
    int label;
    final /* synthetic */ InternalVKIDGroupSubscriptionApiService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InternalVKIDGroupSubscriptionApiService$isServiceAccount$2(InternalVKIDGroupSubscriptionApiService internalVKIDGroupSubscriptionApiService, String str, d<? super InternalVKIDGroupSubscriptionApiService$isServiceAccount$2> dVar) {
        super(2, dVar);
        this.this$0 = internalVKIDGroupSubscriptionApiService;
        this.$accessToken = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new InternalVKIDGroupSubscriptionApiService$isServiceAccount$2(this.this$0, this.$accessToken, dVar);
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
        We.M c11 = internalVKIDGroupSubscriptionApi.getProfileShortInfo(this.$accessToken).execute().c();
        if (c11 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        JSONObject jSONObject = new JSONObject(c11.string());
        if (jSONObject.isNull("error")) {
            return Boolean.valueOf(jSONObject.getJSONObject("response").getBoolean("is_service_account"));
        }
        throw new IOException(jSONObject.getString("error"));
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Boolean> dVar) {
        return ((InternalVKIDGroupSubscriptionApiService$isServiceAccount$2) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}

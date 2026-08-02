package com.vk.id.internal.user;

import Fb.b;
import Sc.s;
import Wc.a;
import com.google.protobuf.DescriptorProtos$FileOptions;
import com.vk.id.internal.auth.ServiceCredentials;
import com.vk.id.internal.ipc.SilentAuthInfoProvider;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "LFb/b;", "<anonymous>", "(Lxe/M;)LFb/b;"}, k = 3, mv = {2, 0, 0})
@e(c = "com.vk.id.internal.user.UserDataFetcher$fetchUserData$2$info$1", f = "UserDataFetcher.kt", l = {DescriptorProtos$FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER}, m = "invokeSuspend")
/* loaded from: classes9.dex */
final class UserDataFetcher$fetchUserData$2$info$1 extends j implements Function2<M, d<? super b>, Object> {
    int label;
    final /* synthetic */ UserDataFetcher this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UserDataFetcher$fetchUserData$2$info$1(UserDataFetcher userDataFetcher, d<? super UserDataFetcher$fetchUserData$2$info$1> dVar) {
        super(2, dVar);
        this.this$0 = userDataFetcher;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new UserDataFetcher$fetchUserData$2$info$1(this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        SilentAuthInfoProvider silentAuthInfoProvider;
        ServiceCredentials serviceCredentials;
        SilentAuthInfoProvider silentAuthInfoProvider2;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            silentAuthInfoProvider = this.this$0.vkSilentAuthInfoProvider;
            serviceCredentials = this.this$0.serviceCredentials;
            silentAuthInfoProvider.setAppId(Integer.parseInt(serviceCredentials.getClientID()));
            silentAuthInfoProvider2 = this.this$0.vkSilentAuthInfoProvider;
            this.label = 1;
            obj = SilentAuthInfoProvider.DefaultImpls.getSilentAuthInfos$default(silentAuthInfoProvider2, 0L, this, 1, null);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        return C7714v.M((List) obj);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super b> dVar) {
        return ((UserDataFetcher$fetchUserData$2$info$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}

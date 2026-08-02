package com.unity3d.services.core.di;

import com.unity3d.ads.core.domain.HttpClientProvider;
import com.unity3d.services.core.network.core.HttpClient;
import kotlin.a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.b6l;
import xsna.fpf0;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;
import xsna.yvj;

/* compiled from: ServiceProvider.kt */
@b6l(c = "com.unity3d.services.core.di.ServiceProvider$initialize$1$35$1", f = "ServiceProvider.kt", l = {479}, m = "invokeSuspend")
/* loaded from: classes14.dex */
public final class ServiceProvider$initialize$1$35$1 extends SuspendLambda implements wzs<yvj, spj<? super HttpClient>, Object> {
    final /* synthetic */ ServicesRegistry $this_registry;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ServiceProvider$initialize$1$35$1(ServicesRegistry servicesRegistry, spj<? super ServiceProvider$initialize$1$35$1> spjVar) {
        super(2, spjVar);
        this.$this_registry = servicesRegistry;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new ServiceProvider$initialize$1$35$1(this.$this_registry, spjVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a.a(obj);
            return obj;
        }
        a.a(obj);
        HttpClientProvider httpClientProvider = (HttpClientProvider) this.$this_registry.resolveService(new ServiceKey("", fpf0.a(HttpClientProvider.class)));
        this.label = 1;
        Object invoke = httpClientProvider.invoke(this);
        return invoke == coroutineSingletons ? coroutineSingletons : invoke;
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super HttpClient> spjVar) {
        return ((ServiceProvider$initialize$1$35$1) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }
}

package com.unity3d.services.core.di;

import com.unity3d.ads.core.domain.HttpClientProvider;
import com.unity3d.services.core.network.core.HttpClient;
import defpackage.a70;
import defpackage.duf;
import defpackage.hoi;
import defpackage.il4;
import defpackage.ku3;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.y6a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku3;", "Lcom/unity3d/services/core/network/core/HttpClient;", "<anonymous>", "(Lku3;)Lcom/unity3d/services/core/network/core/HttpClient;"}, k = 3, mv = {2, 1, 0})
@il4(c = "com.unity3d.services.core.di.ServiceProvider$initialize$1$35$1", f = "ServiceProvider.kt", l = {479}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class ServiceProvider$initialize$1$35$1 extends hoi implements Function2<ku3, rq3<? super HttpClient>, Object> {
    final /* synthetic */ ServicesRegistry $this_registry;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ServiceProvider$initialize$1$35$1(ServicesRegistry servicesRegistry, rq3<? super ServiceProvider$initialize$1$35$1> rq3Var) {
        super(2, rq3Var);
        this.$this_registry = servicesRegistry;
    }

    @Override // defpackage.h21
    public final rq3<Unit> create(Object obj, rq3<?> rq3Var) {
        return new ServiceProvider$initialize$1$35$1(this.$this_registry, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ku3 ku3Var, rq3<? super HttpClient> rq3Var) {
        return ((ServiceProvider$initialize$1$35$1) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                y6a.M(obj);
                return obj;
            }
            a70.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        y6a.M(obj);
        HttpClientProvider httpClientProvider = (HttpClientProvider) this.$this_registry.resolveService(new ServiceKey("", duf.a.getOrCreateKotlinClass(HttpClientProvider.class)));
        this.label = 1;
        Object invoke = httpClientProvider.invoke(this);
        return invoke == lu3Var ? lu3Var : invoke;
    }
}

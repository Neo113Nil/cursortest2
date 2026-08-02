package com.unity3d.services.core.network.core;

import com.unity3d.services.core.network.core.HttpClient;
import com.unity3d.services.core.network.model.HttpRequest;
import com.unity3d.services.core.network.model.HttpResponse;
import defpackage.a70;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku3;", "Lcom/unity3d/services/core/network/model/HttpResponse;", "<anonymous>", "(Lku3;)Lcom/unity3d/services/core/network/model/HttpResponse;"}, k = 3, mv = {2, 1, 0})
@il4(c = "com.unity3d.services.core.network.core.CronetClient$executeBlocking$1", f = "CronetClient.kt", l = {37}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class CronetClient$executeBlocking$1 extends hoi implements Function2<ku3, rq3<? super HttpResponse>, Object> {
    final /* synthetic */ HttpRequest $request;
    int label;
    final /* synthetic */ CronetClient this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CronetClient$executeBlocking$1(CronetClient cronetClient, HttpRequest httpRequest, rq3<? super CronetClient$executeBlocking$1> rq3Var) {
        super(2, rq3Var);
        this.this$0 = cronetClient;
        this.$request = httpRequest;
    }

    @Override // defpackage.h21
    public final rq3<Unit> create(Object obj, rq3<?> rq3Var) {
        return new CronetClient$executeBlocking$1(this.this$0, this.$request, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ku3 ku3Var, rq3<? super HttpResponse> rq3Var) {
        return ((CronetClient$executeBlocking$1) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
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
        CronetClient cronetClient = this.this$0;
        HttpRequest httpRequest = this.$request;
        this.label = 1;
        Object execute$default = HttpClient.DefaultImpls.execute$default(cronetClient, httpRequest, false, this, 2, null);
        return execute$default == lu3Var ? lu3Var : execute$default;
    }
}

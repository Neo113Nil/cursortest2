package com.vk.push.pushsdk.work;

import com.vk.push.common.Logger;
import com.vk.push.core.utils.PackageExtenstionsKt;
import com.vk.push.pushsdk.VkpnsPushConfig;
import com.vk.push.pushsdk.work.StopDeliverToUninstalledWork;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.b6l;
import xsna.g790;
import xsna.go9;
import xsna.nhe0;
import xsna.qxi;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;
import xsna.yvj;

/* compiled from: StopDeliverToUninstalledWork.kt */
@b6l(c = "com.vk.push.pushsdk.work.StopDeliverToUninstalledWork$DoWorker$stopDeliverToUninstalledApps$2", f = "StopDeliverToUninstalledWork.kt", l = {65}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class i extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ StopDeliverToUninstalledWork.b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(StopDeliverToUninstalledWork.b bVar, spj<? super i> spjVar) {
        super(2, spjVar);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new i(this.this$0, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((i) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List<String> list;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            Logger.DefaultImpls.info$default((Logger) this.this$0.a.getValue(), "Handle package removed from work", null, 2, null);
            VkpnsPushConfig vkpnsPushConfig = qxi.b;
            if (vkpnsPushConfig == null) {
                throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
            }
            List<String> clientsPackages = PackageExtenstionsKt.getClientsPackages(vkpnsPushConfig.a.getApplicationContext().getPackageManager());
            g790 g790Var = (g790) this.this$0.c.getValue();
            this.L$0 = clientsPackages;
            this.label = 1;
            Object g = g790Var.g(this);
            if (g == coroutineSingletons) {
                return coroutineSingletons;
            }
            list = clientsPackages;
            obj = g;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list = (List) this.L$0;
            kotlin.a.a(obj);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : (Iterable) obj) {
            if (!list.contains((String) obj2)) {
                arrayList.add(obj2);
            }
        }
        StopDeliverToUninstalledWork.b bVar = this.this$0;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Logger.DefaultImpls.info$default((Logger) bVar.a.getValue(), go9.b("Stop delivering pushes to ", str), null, 2, null);
            ((nhe0) bVar.b.getValue()).f(str);
        }
        return s3q0.a;
    }
}

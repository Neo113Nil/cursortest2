package com.unity3d.ads.core.data.datasource;

import com.unity3d.ads.datastore.UniversalRequestStoreOuterClass;
import defpackage.a70;
import defpackage.b98;
import defpackage.ct8;
import defpackage.hoi;
import defpackage.il4;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.uu3;
import defpackage.y6a;
import kotlin.Metadata;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lb98;", "Lcom/unity3d/ads/datastore/UniversalRequestStoreOuterClass$UniversalRequestStore;", "", "exception", "", "<anonymous>", "(Lb98;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 1, 0})
@il4(c = "com.unity3d.ads.core.data.datasource.UniversalRequestDataSource$get$2", f = "UniversalRequestDataSource.kt", l = {15}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class UniversalRequestDataSource$get$2 extends hoi implements ct8 {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    public UniversalRequestDataSource$get$2(rq3<? super UniversalRequestDataSource$get$2> rq3Var) {
        super(3, rq3Var);
    }

    @Override // defpackage.ct8
    public final Object invoke(b98 b98Var, Throwable th, rq3<? super Unit> rq3Var) {
        UniversalRequestDataSource$get$2 universalRequestDataSource$get$2 = new UniversalRequestDataSource$get$2(rq3Var);
        universalRequestDataSource$get$2.L$0 = b98Var;
        universalRequestDataSource$get$2.L$1 = th;
        return universalRequestDataSource$get$2.invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        int i = this.label;
        if (i == 0) {
            y6a.M(obj);
            b98 b98Var = (b98) this.L$0;
            Throwable th = (Throwable) this.L$1;
            if (!(th instanceof uu3)) {
                throw th;
            }
            UniversalRequestStoreOuterClass.UniversalRequestStore defaultInstance = UniversalRequestStoreOuterClass.UniversalRequestStore.getDefaultInstance();
            defaultInstance.getClass();
            this.L$0 = null;
            this.label = 1;
            if (b98Var.emit(defaultInstance, this) == lu3Var) {
                return lu3Var;
            }
        } else {
            if (i != 1) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y6a.M(obj);
        }
        return Unit.a;
    }
}

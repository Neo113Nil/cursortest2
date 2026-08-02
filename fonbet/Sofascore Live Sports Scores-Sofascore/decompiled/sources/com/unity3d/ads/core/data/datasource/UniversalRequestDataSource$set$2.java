package com.unity3d.ads.core.data.datasource;

import com.google.protobuf.ByteString;
import com.unity3d.ads.datastore.UniversalRequestStoreOuterClass;
import defpackage.a70;
import defpackage.hoi;
import defpackage.il4;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.y6a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/datastore/UniversalRequestStoreOuterClass$UniversalRequestStore;", "currentData"}, k = 3, mv = {2, 1, 0}, xi = 48)
@il4(c = "com.unity3d.ads.core.data.datasource.UniversalRequestDataSource$set$2", f = "UniversalRequestDataSource.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class UniversalRequestDataSource$set$2 extends hoi implements Function2<UniversalRequestStoreOuterClass.UniversalRequestStore, rq3<? super UniversalRequestStoreOuterClass.UniversalRequestStore>, Object> {
    final /* synthetic */ ByteString $data;
    final /* synthetic */ String $key;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UniversalRequestDataSource$set$2(String str, ByteString byteString, rq3<? super UniversalRequestDataSource$set$2> rq3Var) {
        super(2, rq3Var);
        this.$key = str;
        this.$data = byteString;
    }

    @Override // defpackage.h21
    public final rq3<Unit> create(Object obj, rq3<?> rq3Var) {
        UniversalRequestDataSource$set$2 universalRequestDataSource$set$2 = new UniversalRequestDataSource$set$2(this.$key, this.$data, rq3Var);
        universalRequestDataSource$set$2.L$0 = obj;
        return universalRequestDataSource$set$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(UniversalRequestStoreOuterClass.UniversalRequestStore universalRequestStore, rq3<? super UniversalRequestStoreOuterClass.UniversalRequestStore> rq3Var) {
        return ((UniversalRequestDataSource$set$2) create(universalRequestStore, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        if (this.label != 0) {
            a70.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        y6a.M(obj);
        UniversalRequestStoreOuterClass.UniversalRequestStore.Builder builder = ((UniversalRequestStoreOuterClass.UniversalRequestStore) this.L$0).toBuilder();
        builder.putUniversalRequestMap(this.$key, this.$data);
        UniversalRequestStoreOuterClass.UniversalRequestStore build = builder.build();
        build.getClass();
        return build;
    }
}

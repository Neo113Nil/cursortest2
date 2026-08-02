package com.unity3d.ads.core.data.datasource;

import com.google.protobuf.ByteString;
import com.unity3d.ads.datastore.ByteStringStoreOuterClass;
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
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/datastore/ByteStringStoreOuterClass$ByteStringStore;", "currentData"}, k = 3, mv = {2, 1, 0}, xi = 48)
@il4(c = "com.unity3d.ads.core.data.datasource.AndroidByteStringDataSource$set$2", f = "AndroidByteStringDataSource.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class AndroidByteStringDataSource$set$2 extends hoi implements Function2<ByteStringStoreOuterClass.ByteStringStore, rq3<? super ByteStringStoreOuterClass.ByteStringStore>, Object> {
    final /* synthetic */ ByteString $data;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidByteStringDataSource$set$2(ByteString byteString, rq3<? super AndroidByteStringDataSource$set$2> rq3Var) {
        super(2, rq3Var);
        this.$data = byteString;
    }

    @Override // defpackage.h21
    public final rq3<Unit> create(Object obj, rq3<?> rq3Var) {
        AndroidByteStringDataSource$set$2 androidByteStringDataSource$set$2 = new AndroidByteStringDataSource$set$2(this.$data, rq3Var);
        androidByteStringDataSource$set$2.L$0 = obj;
        return androidByteStringDataSource$set$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ByteStringStoreOuterClass.ByteStringStore byteStringStore, rq3<? super ByteStringStoreOuterClass.ByteStringStore> rq3Var) {
        return ((AndroidByteStringDataSource$set$2) create(byteStringStore, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        if (this.label != 0) {
            a70.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        y6a.M(obj);
        ByteStringStoreOuterClass.ByteStringStore build = ((ByteStringStoreOuterClass.ByteStringStore) this.L$0).toBuilder().setData(this.$data).build();
        build.getClass();
        return build;
    }
}

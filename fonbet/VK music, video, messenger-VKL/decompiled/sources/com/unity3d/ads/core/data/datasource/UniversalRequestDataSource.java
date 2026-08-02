package com.unity3d.ads.core.data.datasource;

import com.google.protobuf.ByteString;
import com.unity3d.ads.datastore.UniversalRequestStoreOuterClass;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1;
import xsna.rsr;
import xsna.s3q0;
import xsna.spj;

/* compiled from: UniversalRequestDataSource.kt */
/* loaded from: classes14.dex */
public final class UniversalRequestDataSource {
    private final UniversalRequestDataStoreProvider universalRequestStoreProvider;

    public UniversalRequestDataSource(UniversalRequestDataStoreProvider universalRequestDataStoreProvider) {
        this.universalRequestStoreProvider = universalRequestDataStoreProvider;
    }

    public final Object get(spj<? super UniversalRequestStoreOuterClass.UniversalRequestStore> spjVar) {
        return rsr.n(new FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1(this.universalRequestStoreProvider.invoke().getData(), new UniversalRequestDataSource$get$2(null)), spjVar);
    }

    public final Object remove(String str, spj<? super s3q0> spjVar) {
        Object a = this.universalRequestStoreProvider.invoke().a(new UniversalRequestDataSource$remove$2(str, null), spjVar);
        return a == CoroutineSingletons.COROUTINE_SUSPENDED ? a : s3q0.a;
    }

    public final Object set(String str, ByteString byteString, spj<? super s3q0> spjVar) {
        Object a = this.universalRequestStoreProvider.invoke().a(new UniversalRequestDataSource$set$2(str, byteString, null), spjVar);
        return a == CoroutineSingletons.COROUTINE_SUSPENDED ? a : s3q0.a;
    }
}

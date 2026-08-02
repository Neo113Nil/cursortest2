package com.unity3d.ads.core.data.datasource;

import com.google.protobuf.ByteString;
import com.unity3d.ads.datastore.ByteStringStoreOuterClass;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1;
import xsna.fvk;
import xsna.rsr;
import xsna.s3q0;
import xsna.spj;

/* compiled from: AndroidByteStringDataSource.kt */
/* loaded from: classes14.dex */
public final class AndroidByteStringDataSource implements ByteStringDataSource {
    private final fvk<ByteStringStoreOuterClass.ByteStringStore> dataStore;

    public AndroidByteStringDataSource(fvk<ByteStringStoreOuterClass.ByteStringStore> fvkVar) {
        this.dataStore = fvkVar;
    }

    @Override // com.unity3d.ads.core.data.datasource.ByteStringDataSource
    public Object get(spj<? super ByteStringStoreOuterClass.ByteStringStore> spjVar) {
        return rsr.n(new FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1(this.dataStore.getData(), new AndroidByteStringDataSource$get$2(null)), spjVar);
    }

    @Override // com.unity3d.ads.core.data.datasource.ByteStringDataSource
    public Object set(ByteString byteString, spj<? super s3q0> spjVar) {
        Object a = this.dataStore.a(new AndroidByteStringDataSource$set$2(byteString, null), spjVar);
        return a == CoroutineSingletons.COROUTINE_SUSPENDED ? a : s3q0.a;
    }
}

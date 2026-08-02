package com.unity3d.ads.datastore;

import com.unity3d.ads.datastore.ByteStringStoreKt;
import com.unity3d.ads.datastore.ByteStringStoreOuterClass;
import xsna.izs;
import xsna.s3q0;

/* compiled from: ByteStringStoreKt.kt */
/* loaded from: classes14.dex */
public final class ByteStringStoreKtKt {
    /* renamed from: -initializebyteStringStore, reason: not valid java name */
    public static final ByteStringStoreOuterClass.ByteStringStore m74initializebyteStringStore(izs<? super ByteStringStoreKt.Dsl, s3q0> izsVar) {
        ByteStringStoreKt.Dsl _create = ByteStringStoreKt.Dsl.Companion._create(ByteStringStoreOuterClass.ByteStringStore.newBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }

    public static final ByteStringStoreOuterClass.ByteStringStore copy(ByteStringStoreOuterClass.ByteStringStore byteStringStore, izs<? super ByteStringStoreKt.Dsl, s3q0> izsVar) {
        ByteStringStoreKt.Dsl _create = ByteStringStoreKt.Dsl.Companion._create(byteStringStore.toBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }
}

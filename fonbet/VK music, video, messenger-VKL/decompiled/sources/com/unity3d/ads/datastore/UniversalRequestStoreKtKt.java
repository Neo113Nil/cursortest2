package com.unity3d.ads.datastore;

import com.unity3d.ads.datastore.UniversalRequestStoreKt;
import com.unity3d.ads.datastore.UniversalRequestStoreOuterClass;
import xsna.izs;
import xsna.s3q0;

/* compiled from: UniversalRequestStoreKt.kt */
/* loaded from: classes14.dex */
public final class UniversalRequestStoreKtKt {
    /* renamed from: -initializeuniversalRequestStore, reason: not valid java name */
    public static final UniversalRequestStoreOuterClass.UniversalRequestStore m75initializeuniversalRequestStore(izs<? super UniversalRequestStoreKt.Dsl, s3q0> izsVar) {
        UniversalRequestStoreKt.Dsl _create = UniversalRequestStoreKt.Dsl.Companion._create(UniversalRequestStoreOuterClass.UniversalRequestStore.newBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }

    public static final UniversalRequestStoreOuterClass.UniversalRequestStore copy(UniversalRequestStoreOuterClass.UniversalRequestStore universalRequestStore, izs<? super UniversalRequestStoreKt.Dsl, s3q0> izsVar) {
        UniversalRequestStoreKt.Dsl _create = UniversalRequestStoreKt.Dsl.Companion._create(universalRequestStore.toBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }
}

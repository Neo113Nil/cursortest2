package com.unity3d.ads.core.data.datasource;

import com.google.protobuf.ByteString;
import com.unity3d.ads.datastore.ByteStringStoreOuterClass;
import xsna.s3q0;
import xsna.spj;

/* compiled from: ByteStringDataSource.kt */
/* loaded from: classes14.dex */
public interface ByteStringDataSource {
    Object get(spj<? super ByteStringStoreOuterClass.ByteStringStore> spjVar);

    Object set(ByteString byteString, spj<? super s3q0> spjVar);
}

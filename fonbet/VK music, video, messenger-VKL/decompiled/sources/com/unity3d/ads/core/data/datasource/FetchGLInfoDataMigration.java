package com.unity3d.ads.core.data.datasource;

import com.google.protobuf.ByteString;
import com.unity3d.ads.core.domain.GetOpenGLRendererInfo;
import com.unity3d.ads.datastore.ByteStringStoreOuterClass;
import xsna.fuk;
import xsna.s3q0;
import xsna.spj;

/* compiled from: FetchGLInfoDataMigration.kt */
/* loaded from: classes14.dex */
public final class FetchGLInfoDataMigration implements fuk<ByteStringStoreOuterClass.ByteStringStore> {
    private final GetOpenGLRendererInfo getOpenGLRendererInfo;

    public FetchGLInfoDataMigration(GetOpenGLRendererInfo getOpenGLRendererInfo) {
        this.getOpenGLRendererInfo = getOpenGLRendererInfo;
    }

    private final ByteString gatherOpenGLRendererInfo() {
        return this.getOpenGLRendererInfo.invoke();
    }

    @Override // xsna.fuk
    public Object cleanUp(spj<? super s3q0> spjVar) {
        return s3q0.a;
    }

    @Override // xsna.fuk
    public /* bridge */ /* synthetic */ Object shouldMigrate(ByteStringStoreOuterClass.ByteStringStore byteStringStore, spj spjVar) {
        return shouldMigrate2(byteStringStore, (spj<? super Boolean>) spjVar);
    }

    @Override // xsna.fuk
    public Object migrate(ByteStringStoreOuterClass.ByteStringStore byteStringStore, spj<? super ByteStringStoreOuterClass.ByteStringStore> spjVar) {
        ByteString byteString;
        try {
            byteString = gatherOpenGLRendererInfo();
        } catch (Exception unused) {
            byteString = ByteString.EMPTY;
        }
        return ByteStringStoreOuterClass.ByteStringStore.newBuilder().setData(byteString).build();
    }

    /* renamed from: shouldMigrate, reason: avoid collision after fix types in other method */
    public Object shouldMigrate2(ByteStringStoreOuterClass.ByteStringStore byteStringStore, spj<? super Boolean> spjVar) {
        return Boolean.valueOf(byteStringStore.getData().isEmpty());
    }
}

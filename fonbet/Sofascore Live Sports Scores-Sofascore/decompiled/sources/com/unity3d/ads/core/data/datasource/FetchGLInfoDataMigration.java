package com.unity3d.ads.core.data.datasource;

import com.google.protobuf.ByteString;
import com.unity3d.ads.core.domain.GetOpenGLRendererInfo;
import com.unity3d.ads.datastore.ByteStringStoreOuterClass;
import defpackage.be4;
import defpackage.rq3;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH\u0096@¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0011\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/unity3d/ads/core/data/datasource/FetchGLInfoDataMigration;", "Lbe4;", "Lcom/unity3d/ads/datastore/ByteStringStoreOuterClass$ByteStringStore;", "Lcom/unity3d/ads/core/domain/GetOpenGLRendererInfo;", "getOpenGLRendererInfo", "<init>", "(Lcom/unity3d/ads/core/domain/GetOpenGLRendererInfo;)V", "Lcom/google/protobuf/ByteString;", "gatherOpenGLRendererInfo", "()Lcom/google/protobuf/ByteString;", "", "cleanUp", "(Lrq3;)Ljava/lang/Object;", "currentData", "", "shouldMigrate", "(Lcom/unity3d/ads/datastore/ByteStringStoreOuterClass$ByteStringStore;Lrq3;)Ljava/lang/Object;", "migrate", "Lcom/unity3d/ads/core/domain/GetOpenGLRendererInfo;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FetchGLInfoDataMigration implements be4 {

    @NotNull
    private final GetOpenGLRendererInfo getOpenGLRendererInfo;

    public FetchGLInfoDataMigration(@NotNull GetOpenGLRendererInfo getOpenGLRendererInfo) {
        getOpenGLRendererInfo.getClass();
        this.getOpenGLRendererInfo = getOpenGLRendererInfo;
    }

    private final ByteString gatherOpenGLRendererInfo() {
        return this.getOpenGLRendererInfo.invoke();
    }

    @Override // defpackage.be4
    @Nullable
    public Object cleanUp(@NotNull rq3<? super Unit> rq3Var) {
        return Unit.a;
    }

    @Nullable
    public Object migrate(@NotNull ByteStringStoreOuterClass.ByteStringStore byteStringStore, @NotNull rq3<? super ByteStringStoreOuterClass.ByteStringStore> rq3Var) {
        ByteString byteString;
        try {
            byteString = gatherOpenGLRendererInfo();
        } catch (Exception unused) {
            byteString = ByteString.EMPTY;
            byteString.getClass();
        }
        ByteStringStoreOuterClass.ByteStringStore build = ByteStringStoreOuterClass.ByteStringStore.newBuilder().setData(byteString).build();
        build.getClass();
        return build;
    }

    @Nullable
    public Object shouldMigrate(@NotNull ByteStringStoreOuterClass.ByteStringStore byteStringStore, @NotNull rq3<? super Boolean> rq3Var) {
        return Boolean.valueOf(byteStringStore.getData().isEmpty());
    }

    @Override // defpackage.be4
    public /* bridge */ /* synthetic */ Object shouldMigrate(Object obj, rq3 rq3Var) {
        return shouldMigrate((ByteStringStoreOuterClass.ByteStringStore) obj, (rq3<? super Boolean>) rq3Var);
    }

    @Override // defpackage.be4
    public /* bridge */ /* synthetic */ Object migrate(Object obj, rq3 rq3Var) {
        return migrate((ByteStringStoreOuterClass.ByteStringStore) obj, (rq3<? super ByteStringStoreOuterClass.ByteStringStore>) rq3Var);
    }
}

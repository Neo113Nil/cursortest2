package ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.cache.file.model;

import com.google.flatbuffers.a;
import com.google.flatbuffers.b;
import com.google.flatbuffers.d;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes3.dex */
public final class CacheClusterItem extends d {

    public static final class Vector extends a {
        public Vector __assign(int i11, int i12, ByteBuffer byteBuffer) {
            __reset(i11, i12, byteBuffer);
            return this;
        }

        public CacheClusterItem get(int i11) {
            return get(new CacheClusterItem(), i11);
        }

        public CacheClusterItem get(CacheClusterItem cacheClusterItem, int i11) {
            return cacheClusterItem.__assign(d.__indirect(__element(i11), this.f59759bb), this.f59759bb);
        }
    }

    public static void ValidateVersion() {
    }

    public static void addId(b bVar, long j11) {
        if (j11 == 0) {
            bVar.getClass();
        } else {
            bVar.a(j11);
            bVar.l(0);
        }
    }

    public static int createCacheClusterItem(b bVar, long j11) {
        bVar.m(1);
        addId(bVar, j11);
        return endCacheClusterItem(bVar);
    }

    public static int endCacheClusterItem(b bVar) {
        return bVar.d();
    }

    public static CacheClusterItem getRootAsCacheClusterItem(ByteBuffer byteBuffer) {
        return getRootAsCacheClusterItem(byteBuffer, new CacheClusterItem());
    }

    public static void startCacheClusterItem(b bVar) {
        bVar.m(1);
    }

    public CacheClusterItem __assign(int i11, ByteBuffer byteBuffer) {
        __init(i11, byteBuffer);
        return this;
    }

    public void __init(int i11, ByteBuffer byteBuffer) {
        __reset(i11, byteBuffer);
    }

    public long id() {
        int __offset = __offset(4);
        if (__offset != 0) {
            return this.f59773bb.getLong(__offset + this.bb_pos);
        }
        return 0L;
    }

    public static CacheClusterItem getRootAsCacheClusterItem(ByteBuffer byteBuffer, CacheClusterItem cacheClusterItem) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return cacheClusterItem.__assign(byteBuffer.position() + byteBuffer.getInt(byteBuffer.position()), byteBuffer);
    }
}

package ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.cache.file.model;

import com.google.flatbuffers.a;
import com.google.flatbuffers.b;
import com.google.flatbuffers.c;
import com.google.flatbuffers.d;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes3.dex */
public final class CacheCluster extends d {

    public static final class Vector extends a {
        public Vector __assign(int i11, int i12, ByteBuffer byteBuffer) {
            __reset(i11, i12, byteBuffer);
            return this;
        }

        public CacheCluster get(int i11) {
            return get(new CacheCluster(), i11);
        }

        public CacheCluster get(CacheCluster cacheCluster, int i11) {
            return cacheCluster.__assign(d.__indirect(__element(i11), this.f59759bb), this.f59759bb);
        }
    }

    public static void ValidateVersion() {
    }

    public static void addItemIds(b bVar, int i11) {
        if (i11 == 0) {
            bVar.getClass();
        } else {
            bVar.b(i11);
            bVar.l(0);
        }
    }

    public static int createCacheCluster(b bVar, int i11) {
        bVar.m(1);
        addItemIds(bVar, i11);
        return endCacheCluster(bVar);
    }

    public static int createItemIdsVector(b bVar, long[] jArr) {
        bVar.n(8, jArr.length, 8);
        for (int length = jArr.length - 1; length >= 0; length--) {
            bVar.a(jArr[length]);
        }
        return bVar.e();
    }

    public static int endCacheCluster(b bVar) {
        return bVar.d();
    }

    public static CacheCluster getRootAsCacheCluster(ByteBuffer byteBuffer) {
        return getRootAsCacheCluster(byteBuffer, new CacheCluster());
    }

    public static void startCacheCluster(b bVar) {
        bVar.m(1);
    }

    public static void startItemIdsVector(b bVar, int i11) {
        bVar.n(8, i11, 8);
    }

    public CacheCluster __assign(int i11, ByteBuffer byteBuffer) {
        __init(i11, byteBuffer);
        return this;
    }

    public void __init(int i11, ByteBuffer byteBuffer) {
        __reset(i11, byteBuffer);
    }

    public long itemIds(int i11) {
        int __offset = __offset(4);
        if (__offset == 0) {
            return 0L;
        }
        return this.f59773bb.getLong((i11 * 8) + __vector(__offset));
    }

    public ByteBuffer itemIdsAsByteBuffer() {
        return __vector_as_bytebuffer(4, 8);
    }

    public ByteBuffer itemIdsInByteBuffer(ByteBuffer byteBuffer) {
        return __vector_in_bytebuffer(byteBuffer, 4, 8);
    }

    public int itemIdsLength() {
        int __offset = __offset(4);
        if (__offset != 0) {
            return __vector_len(__offset);
        }
        return 0;
    }

    public c itemIdsVector() {
        return itemIdsVector(new c());
    }

    public static CacheCluster getRootAsCacheCluster(ByteBuffer byteBuffer, CacheCluster cacheCluster) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return cacheCluster.__assign(byteBuffer.position() + byteBuffer.getInt(byteBuffer.position()), byteBuffer);
    }

    public c itemIdsVector(c cVar) {
        int __offset = __offset(4);
        if (__offset == 0) {
            return null;
        }
        cVar.a(__vector(__offset), this.f59773bb);
        return cVar;
    }
}

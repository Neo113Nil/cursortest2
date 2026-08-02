package ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.cache.file.model;

import com.google.flatbuffers.a;
import com.google.flatbuffers.b;
import com.google.flatbuffers.d;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.cache.file.model.CacheCluster;
import ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.cache.file.model.CacheClusterItem;

/* loaded from: classes3.dex */
public final class CacheClusterList extends d {

    public static final class Vector extends a {
        public Vector __assign(int i11, int i12, ByteBuffer byteBuffer) {
            __reset(i11, i12, byteBuffer);
            return this;
        }

        public CacheClusterList get(int i11) {
            return get(new CacheClusterList(), i11);
        }

        public CacheClusterList get(CacheClusterList cacheClusterList, int i11) {
            return cacheClusterList.__assign(d.__indirect(__element(i11), this.f59759bb), this.f59759bb);
        }
    }

    public static void ValidateVersion() {
    }

    public static void addClusters(b bVar, int i11) {
        if (i11 == 0) {
            bVar.getClass();
        } else {
            bVar.b(i11);
            bVar.l(0);
        }
    }

    public static void addItems(b bVar, int i11) {
        if (i11 == 0) {
            bVar.getClass();
        } else {
            bVar.b(i11);
            bVar.l(1);
        }
    }

    public static int createCacheClusterList(b bVar, int i11, int i12) {
        bVar.m(2);
        addItems(bVar, i12);
        addClusters(bVar, i11);
        return endCacheClusterList(bVar);
    }

    public static int createClustersVector(b bVar, int[] iArr) {
        bVar.n(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            bVar.b(iArr[length]);
        }
        return bVar.e();
    }

    public static int createItemsVector(b bVar, int[] iArr) {
        bVar.n(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            bVar.b(iArr[length]);
        }
        return bVar.e();
    }

    public static int endCacheClusterList(b bVar) {
        return bVar.d();
    }

    public static void finishCacheClusterListBuffer(b bVar, int i11) {
        bVar.f(i11);
    }

    public static void finishSizePrefixedCacheClusterListBuffer(b bVar, int i11) {
        bVar.h(i11);
    }

    public static CacheClusterList getRootAsCacheClusterList(ByteBuffer byteBuffer) {
        return getRootAsCacheClusterList(byteBuffer, new CacheClusterList());
    }

    public static void startCacheClusterList(b bVar) {
        bVar.m(2);
    }

    public static void startClustersVector(b bVar, int i11) {
        bVar.n(4, i11, 4);
    }

    public static void startItemsVector(b bVar, int i11) {
        bVar.n(4, i11, 4);
    }

    public CacheClusterList __assign(int i11, ByteBuffer byteBuffer) {
        __init(i11, byteBuffer);
        return this;
    }

    public void __init(int i11, ByteBuffer byteBuffer) {
        __reset(i11, byteBuffer);
    }

    public CacheCluster clusters(int i11) {
        return clusters(new CacheCluster(), i11);
    }

    public int clustersLength() {
        int __offset = __offset(4);
        if (__offset != 0) {
            return __vector_len(__offset);
        }
        return 0;
    }

    public CacheCluster.Vector clustersVector() {
        return clustersVector(new CacheCluster.Vector());
    }

    public CacheClusterItem items(int i11) {
        return items(new CacheClusterItem(), i11);
    }

    public int itemsLength() {
        int __offset = __offset(6);
        if (__offset != 0) {
            return __vector_len(__offset);
        }
        return 0;
    }

    public CacheClusterItem.Vector itemsVector() {
        return itemsVector(new CacheClusterItem.Vector());
    }

    public static CacheClusterList getRootAsCacheClusterList(ByteBuffer byteBuffer, CacheClusterList cacheClusterList) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return cacheClusterList.__assign(byteBuffer.position() + byteBuffer.getInt(byteBuffer.position()), byteBuffer);
    }

    public CacheCluster clusters(CacheCluster cacheCluster, int i11) {
        int __offset = __offset(4);
        if (__offset == 0) {
            return null;
        }
        return cacheCluster.__assign(__indirect((i11 * 4) + __vector(__offset)), this.f59773bb);
    }

    public CacheCluster.Vector clustersVector(CacheCluster.Vector vector) {
        int __offset = __offset(4);
        if (__offset != 0) {
            return vector.__assign(__vector(__offset), 4, this.f59773bb);
        }
        return null;
    }

    public CacheClusterItem items(CacheClusterItem cacheClusterItem, int i11) {
        int __offset = __offset(6);
        if (__offset == 0) {
            return null;
        }
        return cacheClusterItem.__assign(__indirect((i11 * 4) + __vector(__offset)), this.f59773bb);
    }

    public CacheClusterItem.Vector itemsVector(CacheClusterItem.Vector vector) {
        int __offset = __offset(6);
        if (__offset != 0) {
            return vector.__assign(__vector(__offset), 4, this.f59773bb);
        }
        return null;
    }
}

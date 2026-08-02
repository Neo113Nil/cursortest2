package ru.ozon.app.android.search.catalog.components.clusters.presentation;

import B0.C2454a;
import G.g;
import J0.P;
import Lh.a;
import Lh.b;
import WZ.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001 B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lru/ozon/app/android/search/catalog/components/clusters/presentation/ClustersVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "Lru/ozon/app/android/search/catalog/components/clusters/presentation/ClustersVO$ClusterVO;", "clusters", "LWZ/t;", "tokenizedEvent", "<init>", "(JLjava/util/List;LWZ/t;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/util/List;", "getClusters", "()Ljava/util/List;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "ClusterVO", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ClustersVO implements c {

    @NotNull
    private final List<ClusterVO> clusters;
    private final long id;
    private final t tokenizedEvent;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0081\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0018\u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u0019\u0010\u000e¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/search/catalog/components/clusters/presentation/ClustersVO$ClusterVO;", "", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "cell", "", "leftBlockWidth", "leftBlockHeight", "textMaxWidth", "<init>", "(Lru/ozon/uni/atoms/data/dsCell/CellDTO;III)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getCell", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "I", "getLeftBlockWidth", "getLeftBlockHeight", "getTextMaxWidth", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ClusterVO {
        public static final int $stable = CellDTO.$stable;

        @NotNull
        private final CellDTO cell;
        private final int leftBlockHeight;
        private final int leftBlockWidth;
        private final int textMaxWidth;

        public ClusterVO(@NotNull CellDTO cell, int i11, int i12, int i13) {
            Intrinsics.checkNotNullParameter(cell, "cell");
            this.cell = cell;
            this.leftBlockWidth = i11;
            this.leftBlockHeight = i12;
            this.textMaxWidth = i13;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ClusterVO)) {
                return false;
            }
            ClusterVO clusterVO = (ClusterVO) other;
            return Intrinsics.d(this.cell, clusterVO.cell) && this.leftBlockWidth == clusterVO.leftBlockWidth && this.leftBlockHeight == clusterVO.leftBlockHeight && this.textMaxWidth == clusterVO.textMaxWidth;
        }

        @NotNull
        public final CellDTO getCell() {
            return this.cell;
        }

        public final int getLeftBlockHeight() {
            return this.leftBlockHeight;
        }

        public final int getLeftBlockWidth() {
            return this.leftBlockWidth;
        }

        public final int getTextMaxWidth() {
            return this.textMaxWidth;
        }

        public int hashCode() {
            return Integer.hashCode(this.textMaxWidth) + C2454a.a(this.leftBlockHeight, C2454a.a(this.leftBlockWidth, this.cell.hashCode() * 31, 31), 31);
        }

        @NotNull
        public String toString() {
            CellDTO cellDTO = this.cell;
            int i11 = this.leftBlockWidth;
            int i12 = this.leftBlockHeight;
            int i13 = this.textMaxWidth;
            StringBuilder sb2 = new StringBuilder("ClusterVO(cell=");
            sb2.append(cellDTO);
            sb2.append(", leftBlockWidth=");
            sb2.append(i11);
            sb2.append(", leftBlockHeight=");
            return P.a(i12, i13, ", textMaxWidth=", ")", sb2);
        }
    }

    public ClustersVO(long j11, @NotNull List<ClusterVO> clusters, t tVar) {
        Intrinsics.checkNotNullParameter(clusters, "clusters");
        this.id = j11;
        this.clusters = clusters;
        this.tokenizedEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ClustersVO)) {
            return false;
        }
        ClustersVO clustersVO = (ClustersVO) other;
        return this.id == clustersVO.id && Intrinsics.d(this.clusters, clustersVO.clusters) && Intrinsics.d(this.tokenizedEvent, clustersVO.tokenizedEvent);
    }

    @NotNull
    public final List<ClusterVO> getClusters() {
        return this.clusters;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int b11 = g.b(Long.hashCode(this.id) * 31, 31, this.clusters);
        t tVar = this.tokenizedEvent;
        return b11 + (tVar == null ? 0 : tVar.hashCode());
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        List<ClusterVO> list = this.clusters;
        return a.b(b.b(j11, "ClustersVO(id=", ", clusters=", list), ", tokenizedEvent=", this.tokenizedEvent, ")");
    }
}

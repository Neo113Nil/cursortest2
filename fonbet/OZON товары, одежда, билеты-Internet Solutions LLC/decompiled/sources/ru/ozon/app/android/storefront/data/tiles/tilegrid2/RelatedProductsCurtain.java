package ru.ozon.app.android.storefront.data.tiles.tilegrid2;

import B4.V;
import Tl.b;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B}\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u0017\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u0017\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u0017\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u0017\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u0017\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u008b\u0001\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001f\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001f\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u001f\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u001f\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u001f\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010¨\u0006\""}, d2 = {"Lru/ozon/app/android/storefront/data/tiles/tilegrid2/RelatedProductsCurtain;", "", "curtainDeeplink", "", "openTracking", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "miniCloseSwipeTracking", "miniCloseTapTracking", "openFullTracking", "closeFullTracking", "<init>", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)V", "getCurtainDeeplink", "()Ljava/lang/String;", "getOpenTracking", "()Ljava/util/Map;", "getMiniCloseSwipeTracking", "getMiniCloseTapTracking", "getOpenFullTracking", "getCloseFullTracking", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "tiles_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class RelatedProductsCurtain {
    private final Map<String, TokenizedTrackingInfo> closeFullTracking;

    @NotNull
    private final String curtainDeeplink;
    private final Map<String, TokenizedTrackingInfo> miniCloseSwipeTracking;
    private final Map<String, TokenizedTrackingInfo> miniCloseTapTracking;
    private final Map<String, TokenizedTrackingInfo> openFullTracking;
    private final Map<String, TokenizedTrackingInfo> openTracking;

    public RelatedProductsCurtain(@NotNull String curtainDeeplink, Map<String, TokenizedTrackingInfo> map, Map<String, TokenizedTrackingInfo> map2, Map<String, TokenizedTrackingInfo> map3, Map<String, TokenizedTrackingInfo> map4, Map<String, TokenizedTrackingInfo> map5) {
        Intrinsics.checkNotNullParameter(curtainDeeplink, "curtainDeeplink");
        this.curtainDeeplink = curtainDeeplink;
        this.openTracking = map;
        this.miniCloseSwipeTracking = map2;
        this.miniCloseTapTracking = map3;
        this.openFullTracking = map4;
        this.closeFullTracking = map5;
    }

    public static /* synthetic */ RelatedProductsCurtain copy$default(RelatedProductsCurtain relatedProductsCurtain, String str, Map map, Map map2, Map map3, Map map4, Map map5, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = relatedProductsCurtain.curtainDeeplink;
        }
        if ((i11 & 2) != 0) {
            map = relatedProductsCurtain.openTracking;
        }
        if ((i11 & 4) != 0) {
            map2 = relatedProductsCurtain.miniCloseSwipeTracking;
        }
        if ((i11 & 8) != 0) {
            map3 = relatedProductsCurtain.miniCloseTapTracking;
        }
        if ((i11 & 16) != 0) {
            map4 = relatedProductsCurtain.openFullTracking;
        }
        if ((i11 & 32) != 0) {
            map5 = relatedProductsCurtain.closeFullTracking;
        }
        Map map6 = map4;
        Map map7 = map5;
        return relatedProductsCurtain.copy(str, map, map2, map3, map6, map7);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getCurtainDeeplink() {
        return this.curtainDeeplink;
    }

    public final Map<String, TokenizedTrackingInfo> component2() {
        return this.openTracking;
    }

    public final Map<String, TokenizedTrackingInfo> component3() {
        return this.miniCloseSwipeTracking;
    }

    public final Map<String, TokenizedTrackingInfo> component4() {
        return this.miniCloseTapTracking;
    }

    public final Map<String, TokenizedTrackingInfo> component5() {
        return this.openFullTracking;
    }

    public final Map<String, TokenizedTrackingInfo> component6() {
        return this.closeFullTracking;
    }

    @NotNull
    public final RelatedProductsCurtain copy(@NotNull String curtainDeeplink, Map<String, TokenizedTrackingInfo> openTracking, Map<String, TokenizedTrackingInfo> miniCloseSwipeTracking, Map<String, TokenizedTrackingInfo> miniCloseTapTracking, Map<String, TokenizedTrackingInfo> openFullTracking, Map<String, TokenizedTrackingInfo> closeFullTracking) {
        Intrinsics.checkNotNullParameter(curtainDeeplink, "curtainDeeplink");
        return new RelatedProductsCurtain(curtainDeeplink, openTracking, miniCloseSwipeTracking, miniCloseTapTracking, openFullTracking, closeFullTracking);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RelatedProductsCurtain)) {
            return false;
        }
        RelatedProductsCurtain relatedProductsCurtain = (RelatedProductsCurtain) other;
        return Intrinsics.d(this.curtainDeeplink, relatedProductsCurtain.curtainDeeplink) && Intrinsics.d(this.openTracking, relatedProductsCurtain.openTracking) && Intrinsics.d(this.miniCloseSwipeTracking, relatedProductsCurtain.miniCloseSwipeTracking) && Intrinsics.d(this.miniCloseTapTracking, relatedProductsCurtain.miniCloseTapTracking) && Intrinsics.d(this.openFullTracking, relatedProductsCurtain.openFullTracking) && Intrinsics.d(this.closeFullTracking, relatedProductsCurtain.closeFullTracking);
    }

    public final Map<String, TokenizedTrackingInfo> getCloseFullTracking() {
        return this.closeFullTracking;
    }

    @NotNull
    public final String getCurtainDeeplink() {
        return this.curtainDeeplink;
    }

    public final Map<String, TokenizedTrackingInfo> getMiniCloseSwipeTracking() {
        return this.miniCloseSwipeTracking;
    }

    public final Map<String, TokenizedTrackingInfo> getMiniCloseTapTracking() {
        return this.miniCloseTapTracking;
    }

    public final Map<String, TokenizedTrackingInfo> getOpenFullTracking() {
        return this.openFullTracking;
    }

    public final Map<String, TokenizedTrackingInfo> getOpenTracking() {
        return this.openTracking;
    }

    public int hashCode() {
        int hashCode = this.curtainDeeplink.hashCode() * 31;
        Map<String, TokenizedTrackingInfo> map = this.openTracking;
        int hashCode2 = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map2 = this.miniCloseSwipeTracking;
        int hashCode3 = (hashCode2 + (map2 == null ? 0 : map2.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map3 = this.miniCloseTapTracking;
        int hashCode4 = (hashCode3 + (map3 == null ? 0 : map3.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map4 = this.openFullTracking;
        int hashCode5 = (hashCode4 + (map4 == null ? 0 : map4.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map5 = this.closeFullTracking;
        return hashCode5 + (map5 != null ? map5.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.curtainDeeplink;
        Map<String, TokenizedTrackingInfo> map = this.openTracking;
        Map<String, TokenizedTrackingInfo> map2 = this.miniCloseSwipeTracking;
        Map<String, TokenizedTrackingInfo> map3 = this.miniCloseTapTracking;
        Map<String, TokenizedTrackingInfo> map4 = this.openFullTracking;
        Map<String, TokenizedTrackingInfo> map5 = this.closeFullTracking;
        StringBuilder sb2 = new StringBuilder("RelatedProductsCurtain(curtainDeeplink=");
        sb2.append(str);
        sb2.append(", openTracking=");
        sb2.append(map);
        sb2.append(", miniCloseSwipeTracking=");
        b.g(sb2, map2, ", miniCloseTapTracking=", map3, ", openFullTracking=");
        return V.c(sb2, map4, ", closeFullTracking=", map5, ")");
    }
}

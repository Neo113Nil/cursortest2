package com.braze.reactbridge;

import com.braze.models.Banner;
import com.braze.reactbridge.util.MapFactoryKt;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0014\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u001a\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004¨\u0006\b"}, d2 = {"mapBanners", "Lcom/facebook/react/bridge/WritableArray;", "bannersList", "", "Lcom/braze/models/Banner;", "mapBanner", "Lcom/facebook/react/bridge/WritableMap;", "banner", "braze_react-native-sdk_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBannerUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BannerUtil.kt\ncom/braze/reactbridge/BannerUtilKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,42:1\n1803#2,2:43\n1805#2:46\n1#3:45\n*S KotlinDebug\n*F\n+ 1 BannerUtil.kt\ncom/braze/reactbridge/BannerUtilKt\n*L\n15#1:43,2\n15#1:46\n*E\n"})
/* loaded from: classes.dex */
public abstract class BannerUtilKt {
    @NotNull
    public static final WritableMap mapBanner(@NotNull Banner banner) {
        Intrinsics.checkNotNullParameter(banner, "banner");
        WritableMap mutableMap = MapFactoryKt.getMutableMap();
        mutableMap.putString("trackingId", banner.getTrackingId());
        mutableMap.putString("placementId", banner.getPlacementId());
        mutableMap.putBoolean("isTestSend", banner.getIsTestSend());
        mutableMap.putBoolean("isControl", banner.getIsControl());
        mutableMap.putString("html", banner.getHtml());
        mutableMap.putDouble("expiresAt", banner.getExpirationTimestampSeconds());
        mutableMap.putMap("properties", JsonUtilsKt.toNativeMap(banner.getProperties()));
        return mutableMap;
    }

    @NotNull
    public static final WritableArray mapBanners(@NotNull List<Banner> bannersList) {
        Intrinsics.checkNotNullParameter(bannersList, "bannersList");
        WritableArray mutableArray = MapFactoryKt.getMutableArray();
        Iterator<T> it = bannersList.iterator();
        while (it.hasNext()) {
            mutableArray.pushMap(mapBanner((Banner) it.next()));
        }
        return mutableArray;
    }
}

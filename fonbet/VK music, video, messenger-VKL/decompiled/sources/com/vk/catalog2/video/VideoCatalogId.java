package com.vk.catalog2.video;

import com.android.billingclient.api.BillingClient;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VideoCatalogId.kt */
/* loaded from: classes16.dex */
public final class VideoCatalogId {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VideoCatalogId[] $VALUES;
    public static final VideoCatalogId ALL_SUBSCRIPTIONS;
    public static final VideoCatalogId HOME;
    public static final VideoCatalogId KIDS;
    public static final VideoCatalogId LIBRARY;
    public static final VideoCatalogId PROFILE;
    public static final VideoCatalogId SUBSCRIPTIONS;
    public static final VideoCatalogId VIEWING_HISTORY;
    private final String id;
    private final List<Integer> shimmerIds;
    private final Integer shimmerLayoutRes;

    static {
        VideoCatalogId videoCatalogId = new VideoCatalogId("HOME", 0, "home");
        HOME = videoCatalogId;
        VideoCatalogId videoCatalogId2 = new VideoCatalogId("LIBRARY", 1, "library");
        LIBRARY = videoCatalogId2;
        VideoCatalogId videoCatalogId3 = new VideoCatalogId("SUBSCRIPTIONS", 2, BillingClient.FeatureType.SUBSCRIPTIONS);
        SUBSCRIPTIONS = videoCatalogId3;
        VideoCatalogId videoCatalogId4 = new VideoCatalogId("PROFILE", 3, CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE);
        PROFILE = videoCatalogId4;
        VideoCatalogId videoCatalogId5 = new VideoCatalogId("KIDS", 4, "for_kids");
        KIDS = videoCatalogId5;
        VideoCatalogId videoCatalogId6 = new VideoCatalogId("VIEWING_HISTORY", 5, "viewing_history");
        VIEWING_HISTORY = videoCatalogId6;
        VideoCatalogId videoCatalogId7 = new VideoCatalogId("ALL_SUBSCRIPTIONS", 6, "all_subscriptions");
        ALL_SUBSCRIPTIONS = videoCatalogId7;
        VideoCatalogId[] videoCatalogIdArr = {videoCatalogId, videoCatalogId2, videoCatalogId3, videoCatalogId4, videoCatalogId5, videoCatalogId6, videoCatalogId7};
        $VALUES = videoCatalogIdArr;
        $ENTRIES = new asp(videoCatalogIdArr);
    }

    public VideoCatalogId() {
        throw null;
    }

    public VideoCatalogId(String str, int i, String str2) {
        EmptyList emptyList = EmptyList.b;
        this.id = str2;
        this.shimmerLayoutRes = null;
        this.shimmerIds = emptyList;
    }

    public static VideoCatalogId valueOf(String str) {
        return (VideoCatalogId) Enum.valueOf(VideoCatalogId.class, str);
    }

    public static VideoCatalogId[] values() {
        return (VideoCatalogId[]) $VALUES.clone();
    }

    public final String getId() {
        return this.id;
    }

    public final List<Integer> h() {
        return this.shimmerIds;
    }

    public final Integer i() {
        return this.shimmerLayoutRes;
    }
}

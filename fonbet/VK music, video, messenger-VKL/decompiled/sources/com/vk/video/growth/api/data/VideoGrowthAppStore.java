package com.vk.video.growth.api.data;

import com.huawei.hms.android.SystemUtils;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VideoGrowthAppStore.kt */
/* loaded from: classes6.dex */
public final class VideoGrowthAppStore {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VideoGrowthAppStore[] $VALUES;
    public static final VideoGrowthAppStore GOOGLE;
    public static final VideoGrowthAppStore HUAWEI;
    public static final VideoGrowthAppStore RUSTORE;
    public static final VideoGrowthAppStore SAMSUNG;
    public static final VideoGrowthAppStore XIAOMI;

    static {
        VideoGrowthAppStore videoGrowthAppStore = new VideoGrowthAppStore("GOOGLE", 0);
        GOOGLE = videoGrowthAppStore;
        VideoGrowthAppStore videoGrowthAppStore2 = new VideoGrowthAppStore("RUSTORE", 1);
        RUSTORE = videoGrowthAppStore2;
        VideoGrowthAppStore videoGrowthAppStore3 = new VideoGrowthAppStore("SAMSUNG", 2);
        SAMSUNG = videoGrowthAppStore3;
        VideoGrowthAppStore videoGrowthAppStore4 = new VideoGrowthAppStore(SystemUtils.PRODUCT_HUAWEI, 3);
        HUAWEI = videoGrowthAppStore4;
        VideoGrowthAppStore videoGrowthAppStore5 = new VideoGrowthAppStore("XIAOMI", 4);
        XIAOMI = videoGrowthAppStore5;
        VideoGrowthAppStore[] videoGrowthAppStoreArr = {videoGrowthAppStore, videoGrowthAppStore2, videoGrowthAppStore3, videoGrowthAppStore4, videoGrowthAppStore5};
        $VALUES = videoGrowthAppStoreArr;
        $ENTRIES = new asp(videoGrowthAppStoreArr);
    }

    public VideoGrowthAppStore() {
        throw null;
    }

    public static VideoGrowthAppStore valueOf(String str) {
        return (VideoGrowthAppStore) Enum.valueOf(VideoGrowthAppStore.class, str);
    }

    public static VideoGrowthAppStore[] values() {
        return (VideoGrowthAppStore[]) $VALUES.clone();
    }
}

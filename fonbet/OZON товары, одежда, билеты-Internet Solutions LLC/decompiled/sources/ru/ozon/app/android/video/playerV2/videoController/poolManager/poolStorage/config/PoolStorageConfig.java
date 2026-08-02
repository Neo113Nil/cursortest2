package ru.ozon.app.android.video.playerV2.videoController.poolManager.poolStorage.config;

import Xc.a;
import Xc.b;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/video/playerV2/videoController/poolManager/poolStorage/config/PoolStorageConfig;", "", "<init>", "(Ljava/lang/String;I)V", "DEFAULT", "NO_LIMIT", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PoolStorageConfig {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ PoolStorageConfig[] $VALUES;
    public static final PoolStorageConfig DEFAULT = new PoolStorageConfig("DEFAULT", 0);
    public static final PoolStorageConfig NO_LIMIT = new PoolStorageConfig("NO_LIMIT", 1);

    private static final /* synthetic */ PoolStorageConfig[] $values() {
        return new PoolStorageConfig[]{DEFAULT, NO_LIMIT};
    }

    static {
        PoolStorageConfig[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private PoolStorageConfig(String str, int i11) {
    }

    public static PoolStorageConfig valueOf(String str) {
        return (PoolStorageConfig) Enum.valueOf(PoolStorageConfig.class, str);
    }

    public static PoolStorageConfig[] values() {
        return (PoolStorageConfig[]) $VALUES.clone();
    }
}

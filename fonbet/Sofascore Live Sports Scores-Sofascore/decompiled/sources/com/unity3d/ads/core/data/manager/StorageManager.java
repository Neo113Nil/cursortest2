package com.unity3d.ads.core.data.manager;

import android.content.Context;
import com.ironsource.S5;
import com.unity3d.services.core.device.Storage;
import com.unity3d.services.core.device.StorageManager;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0014\u0010\u0006\u001a\u00020\u00072\n\u0010\b\u001a\u00060\tj\u0002`\nH&J\u0018\u0010\u000b\u001a\u00060\fj\u0002`\r2\n\u0010\b\u001a\u00060\tj\u0002`\nH&J\u0014\u0010\u000e\u001a\u00020\u00032\n\u0010\b\u001a\u00060\tj\u0002`\nH&J\u001c\u0010\u000f\u001a\u00020\u00072\n\u0010\b\u001a\u00060\tj\u0002`\n2\u0006\u0010\u0010\u001a\u00020\u0011H&J\u0014\u0010\u0012\u001a\u00020\u00072\n\u0010\b\u001a\u00060\tj\u0002`\nH&J\b\u0010\u0013\u001a\u00020\u0007H&¨\u0006\u0014"}, d2 = {"Lcom/unity3d/ads/core/data/manager/StorageManager;", "", "init", "", "context", "Landroid/content/Context;", "initStorage", "", "type", "Lcom/unity3d/services/core/device/StorageManager$StorageType;", "Lcom/unity3d/ads/core/data/manager/LegacyStorageType;", "getStorage", "Lcom/unity3d/services/core/device/Storage;", "Lcom/unity3d/ads/core/data/manager/LegacyStorage;", "hasStorage", "addStorageLocation", S5.c.b, "", "removeStorage", "hasInitialized", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface StorageManager {
    void addStorageLocation(@NotNull StorageManager.StorageType type, @NotNull String fileName);

    @NotNull
    Storage getStorage(@NotNull StorageManager.StorageType type);

    void hasInitialized();

    boolean hasStorage(@NotNull StorageManager.StorageType type);

    boolean init(@NotNull Context context);

    void initStorage(@NotNull StorageManager.StorageType type);

    void removeStorage(@NotNull StorageManager.StorageType type);
}

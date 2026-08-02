package com.braze.storage;

import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.core.Preferences;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R2\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00048\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\b\u0010\t\u0012\u0004\b\f\u0010\u0003\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000e¨\u0006\u0010"}, d2 = {"com/braze/storage/TriggerAssetDataStoreProvider$Companion", "", "<init>", "()V", "Ljava/util/concurrent/ConcurrentHashMap;", "", "Landroidx/datastore/core/DataStore;", "Landroidx/datastore/preferences/core/Preferences;", "triggerAssetDataStores", "Ljava/util/concurrent/ConcurrentHashMap;", "getTriggerAssetDataStores$android_sdk_base_release", "()Ljava/util/concurrent/ConcurrentHashMap;", "getTriggerAssetDataStores$android_sdk_base_release$annotations", "TRIGGER_ASSET_DATA_STORE_STORAGE", "Ljava/lang/String;", "LOCAL_ASSETS_SHARED_PREFS", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TriggerAssetDataStoreProvider$Companion {
    public /* synthetic */ TriggerAssetDataStoreProvider$Companion(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static /* synthetic */ void getTriggerAssetDataStores$android_sdk_base_release$annotations() {
    }

    public final ConcurrentHashMap<String, DataStore<Preferences>> getTriggerAssetDataStores$android_sdk_base_release() {
        return j3.b;
    }

    private TriggerAssetDataStoreProvider$Companion() {
    }
}

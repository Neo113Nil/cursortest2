package com.braze.storage;

import androidx.datastore.migrations.SharedPreferencesView;
import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesKeys;
import com.braze.enums.DataStoreKey;
import com.braze.support.BrazeLogger;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class x0 {
    public final Preferences a(SharedPreferencesView sharedPrefs, Preferences currentData) {
        String str = "";
        Intrinsics.checkNotNullParameter(sharedPrefs, "sharedPrefs");
        Intrinsics.checkNotNullParameter(currentData, "currentData");
        DataStoreKey dataStoreKey = DataStoreKey.LEGACY_DEVICE_ID;
        if (currentData.contains(PreferencesKeys.stringKey(dataStoreKey.getKey()))) {
            return currentData;
        }
        try {
            MutablePreferences mutablePreferences = currentData.toMutablePreferences();
            String string = sharedPrefs.getString(DataStoreKey.DEVICE_ID.getKey(), "");
            if (string != null) {
                str = string;
            }
            mutablePreferences.set(PreferencesKeys.stringKey(dataStoreKey.getKey()), str);
            return mutablePreferences;
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, new Function0() { // from class: com.braze.storage.x0$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return x0.a();
                }
            }, 4, (Object) null);
            return currentData;
        }
    }

    public static final String a() {
        return "Failed to migrate legacy device id to DataStore.";
    }
}

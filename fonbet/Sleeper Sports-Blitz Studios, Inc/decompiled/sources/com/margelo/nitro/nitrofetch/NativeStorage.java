package com.margelo.nitro.nitrofetch;

import android.content.SharedPreferences;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.react.bridge.ReactApplicationContext;
import com.margelo.nitro.NitroModules;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NativeStorage.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H\u0016J\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010\f\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H\u0016J\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\u000f"}, d2 = {"Lcom/margelo/nitro/nitrofetch/NativeStorage;", "Lcom/margelo/nitro/nitrofetch/HybridNativeStorageSpec;", "<init>", "()V", "getString", "", SDKConstants.PARAM_KEY, "setString", "", "value", "removeString", "getSecureString", "setSecureString", "removeSecureString", "Companion", "react-native-nitro-fetch_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class NativeStorage extends HybridNativeStorageSpec {
    private static final String TAG = "HybridNativeStorage";

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Lazy<SharedPreferences> sharedPreferences$delegate = LazyKt.lazy(new Function0() { // from class: com.margelo.nitro.nitrofetch.NativeStorage$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            SharedPreferences sharedPreferences_delegate$lambda$0;
            sharedPreferences_delegate$lambda$0 = NativeStorage.sharedPreferences_delegate$lambda$0();
            return sharedPreferences_delegate$lambda$0;
        }
    });

    /* compiled from: NativeStorage.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/margelo/nitro/nitrofetch/NativeStorage$Companion;", "", "<init>", "()V", "TAG", "", "sharedPreferences", "Landroid/content/SharedPreferences;", "getSharedPreferences", "()Landroid/content/SharedPreferences;", "sharedPreferences$delegate", "Lkotlin/Lazy;", "react-native-nitro-fetch_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final SharedPreferences getSharedPreferences() {
            Object value = NativeStorage.sharedPreferences$delegate.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
            return (SharedPreferences) value;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SharedPreferences sharedPreferences_delegate$lambda$0() {
        ReactApplicationContext applicationContext = NitroModules.INSTANCE.getApplicationContext();
        if (applicationContext == null) {
            throw new Error("Cannot get Android Context - No Context available!");
        }
        return applicationContext.getSharedPreferences(NitroFetchSecureAtRest.PREFS_NAME, 0);
    }

    @Override // com.margelo.nitro.nitrofetch.HybridNativeStorageSpec
    public String getString(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            String string = INSTANCE.getSharedPreferences().getString(key, null);
            if (string != null) {
                NitroLogger.INSTANCE.d(TAG, "Retrieved value for key: " + key);
                return string;
            }
            NitroLogger.INSTANCE.d(TAG, "Key not found: " + key + ", returning empty string");
            return "";
        } catch (Throwable th) {
            NitroLogger.INSTANCE.e(TAG, "Error getting string for key: " + key, th);
            throw new RuntimeException("Failed to get string for key: " + key, th);
        }
    }

    @Override // com.margelo.nitro.nitrofetch.HybridNativeStorageSpec
    public void setString(String key, String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        try {
            SharedPreferences.Editor edit = INSTANCE.getSharedPreferences().edit();
            edit.putString(key, value);
            if (edit.commit()) {
                NitroLogger.INSTANCE.d(TAG, "Successfully stored value for key: " + key);
                return;
            }
            NitroLogger.e$default(NitroLogger.INSTANCE, TAG, "Failed to commit value for key: " + key, null, 4, null);
            throw new RuntimeException("Failed to store value for key: " + key);
        } catch (Throwable th) {
            NitroLogger.INSTANCE.e(TAG, "Error setting string for key: " + key, th);
            throw new RuntimeException("Failed to set string for key: " + key, th);
        }
    }

    @Override // com.margelo.nitro.nitrofetch.HybridNativeStorageSpec
    public void removeString(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            SharedPreferences.Editor edit = INSTANCE.getSharedPreferences().edit();
            edit.remove(key);
            if (edit.commit()) {
                NitroLogger.INSTANCE.d(TAG, "Successfully deleted key: " + key);
                return;
            }
            NitroLogger.e$default(NitroLogger.INSTANCE, TAG, "Failed to commit deletion for key: " + key, null, 4, null);
            throw new RuntimeException("Failed to delete key: " + key);
        } catch (Throwable th) {
            NitroLogger.INSTANCE.e(TAG, "Error deleting key: " + key, th);
            throw new RuntimeException("Failed to delete key: " + key, th);
        }
    }

    @Override // com.margelo.nitro.nitrofetch.HybridNativeStorageSpec
    public String getSecureString(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            String decryptedForPrefs = NitroFetchSecureAtRest.INSTANCE.getDecryptedForPrefs(INSTANCE.getSharedPreferences(), key);
            return decryptedForPrefs == null ? "" : decryptedForPrefs;
        } catch (Throwable th) {
            NitroLogger.INSTANCE.e(TAG, "Error getSecureString for key: " + key, th);
            throw new RuntimeException("Failed to get secure string for key: " + key, th);
        }
    }

    @Override // com.margelo.nitro.nitrofetch.HybridNativeStorageSpec
    public void setSecureString(String key, String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        try {
            if (NitroFetchSecureAtRest.INSTANCE.putEncrypted(INSTANCE.getSharedPreferences(), key, value)) {
            } else {
                throw new RuntimeException("commit failed");
            }
        } catch (Throwable th) {
            NitroLogger.INSTANCE.e(TAG, "Error setSecureString for key: " + key, th);
            throw new RuntimeException("Failed to set secure string for key: " + key, th);
        }
    }

    @Override // com.margelo.nitro.nitrofetch.HybridNativeStorageSpec
    public void removeSecureString(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            if (NitroFetchSecureAtRest.INSTANCE.removeFromPrefs(INSTANCE.getSharedPreferences(), key)) {
            } else {
                throw new RuntimeException("commit failed");
            }
        } catch (Throwable th) {
            NitroLogger.INSTANCE.e(TAG, "Error removeSecureString for key: " + key, th);
            throw new RuntimeException("Failed to remove secure string for key: " + key, th);
        }
    }
}

package com.appsflyer.internal;

import android.content.SharedPreferences;
import com.appsflyer.AFLogger;
import com.appsflyer.sdk_base.logger.AFLoggerBase;
import com.appsflyer.sdk_base.logger.LogTag;
import defpackage.dmi;
import defpackage.joa;
import defpackage.ypa;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class AFc1iSDK implements AFc1pSDK {

    @NotNull
    private final joa d;

    @NotNull
    private final AFd1zSDK<SharedPreferences> unregisterClient;

    public AFc1iSDK(@NotNull AFd1zSDK<SharedPreferences> aFd1zSDK) {
        aFd1zSDK.getClass();
        this.unregisterClient = aFd1zSDK;
        this.d = ypa.b(new e(this, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SharedPreferences q_(AFc1iSDK aFc1iSDK) {
        return (SharedPreferences) aFc1iSDK.unregisterClient.unregisterClient.invoke();
    }

    @Override // com.appsflyer.internal.AFc1pSDK
    public final long AFKeystoreWrapper(@Nullable String str, long j) {
        try {
            return ((SharedPreferences) this.d.getValue()).getLong(str, j);
        } catch (ClassCastException e) {
            AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.PREFERENCES, dmi.q("Unexpected data type found for key ", str), e, false, false, false, false, 120, null);
            return j;
        }
    }

    @Override // com.appsflyer.internal.AFc1pSDK
    public final void AFLogger(@Nullable String str, long j) {
        ((SharedPreferences) this.d.getValue()).edit().putLong(str, j).apply();
    }

    @Override // com.appsflyer.internal.AFc1pSDK
    @Nullable
    public final String d(@Nullable String str) {
        try {
            return ((SharedPreferences) this.d.getValue()).getString(str, null);
        } catch (ClassCastException e) {
            AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.PREFERENCES, dmi.q("Unexpected data type found for key ", str), e, false, false, false, false, 120, null);
            return null;
        }
    }

    @Override // com.appsflyer.internal.AFc1pSDK
    @NotNull
    public final SharedPreferences p_() {
        return (SharedPreferences) this.d.getValue();
    }

    @Override // com.appsflyer.internal.AFc1pSDK
    public final boolean registerClient(@Nullable String str) {
        try {
            return ((SharedPreferences) this.d.getValue()).getBoolean(str, false);
        } catch (ClassCastException e) {
            AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.PREFERENCES, dmi.q("Unexpected data type found for key ", str), e, false, false, false, false, 120, null);
            return false;
        }
    }

    @Override // com.appsflyer.internal.AFc1pSDK
    public final void unregisterClient(@Nullable String str, boolean z) {
        ((SharedPreferences) this.d.getValue()).edit().putBoolean(str, z).apply();
    }

    @Override // com.appsflyer.internal.AFc1pSDK
    public final void AFLogger(@Nullable String str) {
        ((SharedPreferences) this.d.getValue()).edit().remove(str).apply();
    }

    @Override // com.appsflyer.internal.AFc1pSDK
    public final void AFKeystoreWrapper(@Nullable String str, int i) {
        ((SharedPreferences) this.d.getValue()).edit().putInt(str, i).apply();
    }

    @Override // com.appsflyer.internal.AFc1pSDK
    public final void d(@Nullable String str, @Nullable String str2) {
        ((SharedPreferences) this.d.getValue()).edit().putString(str, str2).apply();
    }

    @Override // com.appsflyer.internal.AFc1pSDK
    public final boolean AFKeystoreWrapper(@Nullable String str) {
        return ((SharedPreferences) this.d.getValue()).contains(str);
    }

    @Override // com.appsflyer.internal.AFc1pSDK
    public final int d(@Nullable String str, int i) {
        try {
            return ((SharedPreferences) this.d.getValue()).getInt(str, i);
        } catch (ClassCastException e) {
            AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.PREFERENCES, dmi.q("Unexpected data type found for key ", str), e, false, false, false, false, 120, null);
            return i;
        }
    }
}

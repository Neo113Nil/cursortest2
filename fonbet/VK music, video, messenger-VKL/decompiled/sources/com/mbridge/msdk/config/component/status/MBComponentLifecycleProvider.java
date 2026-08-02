package com.mbridge.msdk.config.component.status;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes13.dex */
public class MBComponentLifecycleProvider extends ContentProvider {
    public MBComponentLifecycleProvider() {
        com.vk.metrics.performance.appstart.content_provider.a.b("com.mbridge.msdk.config.component.status.MBComponentLifecycleProvider.<init>(MBComponentLifecycleProvider.java:1)");
        try {
        } finally {
            com.vk.metrics.performance.appstart.content_provider.a.a("com.mbridge.msdk.config.component.status.MBComponentLifecycleProvider.<init>(MBComponentLifecycleProvider.java:1)");
        }
    }

    @Override // android.content.ContentProvider
    public int delete(@NonNull Uri uri, @Nullable String str, @Nullable String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public String getType(@NonNull Uri uri) {
        return "";
    }

    @Override // android.content.ContentProvider
    @Nullable
    public Uri insert(@NonNull Uri uri, @Nullable ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        com.vk.metrics.performance.appstart.content_provider.a.b("com.mbridge.msdk.config.component.status.MBComponentLifecycleProvider.onCreate(MBComponentLifecycleProvider.java:1)");
        try {
            if (com.mbridge.msdk.foundation.controller.a.s == null) {
                com.mbridge.msdk.foundation.controller.a.s = new b(getContext());
            }
        } catch (Throwable th) {
            Log.e("MBLifecycleProvider", th.getMessage());
        } finally {
        }
        return true;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public Cursor query(@NonNull Uri uri, @Nullable String[] strArr, @Nullable String str, @Nullable String[] strArr2, @Nullable String str2) {
        com.vk.metrics.performance.appstart.content_provider.a.b("com.mbridge.msdk.config.component.status.MBComponentLifecycleProvider.query(MBComponentLifecycleProvider.java)");
        try {
            return null;
        } finally {
            com.vk.metrics.performance.appstart.content_provider.a.a("com.mbridge.msdk.config.component.status.MBComponentLifecycleProvider.query(MBComponentLifecycleProvider.java)");
        }
    }

    @Override // android.content.ContentProvider
    public int update(@NonNull Uri uri, @Nullable ContentValues contentValues, @Nullable String str, @Nullable String[] strArr) {
        return 0;
    }
}

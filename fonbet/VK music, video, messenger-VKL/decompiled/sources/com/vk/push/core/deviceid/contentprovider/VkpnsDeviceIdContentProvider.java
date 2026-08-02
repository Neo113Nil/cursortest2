package com.vk.push.core.deviceid.contentprovider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import com.vk.metrics.performance.appstart.content_provider.a;
import com.vk.push.common.DefaultLogger;
import com.vk.push.core.deviceid.DeviceIdRepositoryProvider;
import com.vk.push.core.deviceid.contentprovider.DeviceIdUriMatcher;
import xsna.rl3;

/* compiled from: VkpnsDeviceIdContentProvider.kt */
/* loaded from: classes.dex */
public final class VkpnsDeviceIdContentProvider extends ContentProvider {
    public final DeviceIdUriMatcher b;
    public final DefaultLogger c;

    public VkpnsDeviceIdContentProvider() {
        a.b("com.vk.push.core.deviceid.contentprovider.VkpnsDeviceIdContentProvider.<init>(VkpnsDeviceIdContentProvider.kt:12)");
        try {
            this.b = new DeviceIdUriMatcher();
            this.c = new DefaultLogger("VkpnsDeviceIdContentProvider");
        } finally {
            a.a("com.vk.push.core.deviceid.contentprovider.VkpnsDeviceIdContentProvider.<init>(VkpnsDeviceIdContentProvider.kt:12)");
        }
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        throw new UnsupportedOperationException("DeviceIdContentProvider delete is not supported!");
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException("DeviceIdContentProvider insert is not supported!");
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        a.b("com.vk.push.core.deviceid.contentprovider.VkpnsDeviceIdContentProvider.onCreate(VkpnsDeviceIdContentProvider.kt:17)");
        try {
            return true;
        } finally {
            a.a("com.vk.push.core.deviceid.contentprovider.VkpnsDeviceIdContentProvider.onCreate(VkpnsDeviceIdContentProvider.kt:17)");
        }
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        DeviceIdUriMatcher deviceIdUriMatcher = this.b;
        a.b("com.vk.push.core.deviceid.contentprovider.VkpnsDeviceIdContentProvider.query(VkpnsDeviceIdContentProvider.kt:27)");
        try {
            Context context = getContext();
            if (context == null) {
                throw new IllegalStateException("Cannot find context from the provider.");
            }
            deviceIdUriMatcher.init(context);
            if (strArr == null || !deviceIdUriMatcher.match(uri)) {
                throw new IllegalArgumentException("Wrong URI: " + uri + " or projection is null");
            }
            MatrixCursor matrixCursor = new MatrixCursor(strArr);
            DeviceIdUriMatcher.Companion companion = DeviceIdUriMatcher.Companion;
            if (rl3.G(strArr, companion.getVirtualColumnName())) {
                DeviceIdRepositoryProvider deviceIdRepositoryProvider = DeviceIdRepositoryProvider.INSTANCE;
                Context context2 = getContext();
                if (context2 == null) {
                    throw new IllegalStateException("Cannot find context from the provider.");
                }
                matrixCursor.newRow().add(companion.getVirtualColumnName(), deviceIdRepositoryProvider.initIfRequired(context2, this.c).getDeviceIdBlocking());
            }
            a.a("com.vk.push.core.deviceid.contentprovider.VkpnsDeviceIdContentProvider.query(VkpnsDeviceIdContentProvider.kt:27)");
            return matrixCursor;
        } catch (Throwable th) {
            a.a("com.vk.push.core.deviceid.contentprovider.VkpnsDeviceIdContentProvider.query(VkpnsDeviceIdContentProvider.kt:27)");
            throw th;
        }
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException("DeviceIdContentProvider update is not supported!");
    }
}

package com.my.target.common;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.vk.metrics.performance.appstart.content_provider.a;
import xsna.gu8;
import xsna.o8z0;
import xsna.qp50;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes.dex */
public final class MyTargetContentProvider extends ContentProvider {
    public static final /* synthetic */ int c = 0;
    public boolean b;

    public MyTargetContentProvider() {
        a.b("com.my.target.common.MyTargetContentProvider.<init>(r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92:1)");
        try {
            this.b = true;
        } finally {
            a.a("com.my.target.common.MyTargetContentProvider.<init>(r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92:1)");
        }
    }

    @Override // android.content.ContentProvider
    public final void attachInfo(Context context, ProviderInfo providerInfo) {
        a.b("com.my.target.common.MyTargetContentProvider.attachInfo(r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92:1)");
        try {
            if (providerInfo == null) {
                a.a("com.my.target.common.MyTargetContentProvider.attachInfo(r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92)");
                return;
            }
            if ("com.my.target.mytargetcontentprovider".equals(providerInfo.authority)) {
                gu8.d("Incorrect provider authority in manifest. Most likely due to a missing applicationId variable in application's build.gradle.");
                this.b = false;
            }
            super.attachInfo(context, providerInfo);
            a.a("com.my.target.common.MyTargetContentProvider.attachInfo(r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92:1)");
        } catch (Throwable th) {
            a.a("com.my.target.common.MyTargetContentProvider.attachInfo(r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92:1)");
            throw th;
        }
    }

    @Override // android.content.ContentProvider
    public final int delete(@NonNull Uri uri, @Nullable String str, @Nullable String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public final String getType(@NonNull Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public final Uri insert(@NonNull Uri uri, @Nullable ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        a.b("com.my.target.common.MyTargetContentProvider.onCreate(r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92:1)");
        try {
            if (!this.b) {
                a.a("com.my.target.common.MyTargetContentProvider.onCreate(r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92:1)");
                return false;
            }
            o8z0.b.execute(new qp50(this, 0));
            a.a("com.my.target.common.MyTargetContentProvider.onCreate(r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92:1)");
            return false;
        } catch (Throwable th) {
            a.a("com.my.target.common.MyTargetContentProvider.onCreate(r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92:1)");
            throw th;
        }
    }

    @Override // android.content.ContentProvider
    @Nullable
    public final Cursor query(@NonNull Uri uri, @Nullable String[] strArr, @Nullable String str, @Nullable String[] strArr2, @Nullable String str2) {
        a.b("com.my.target.common.MyTargetContentProvider.query(r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92)");
        try {
            return null;
        } finally {
            a.a("com.my.target.common.MyTargetContentProvider.query(r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92)");
        }
    }

    @Override // android.content.ContentProvider
    public final int update(@NonNull Uri uri, @Nullable ContentValues contentValues, @Nullable String str, @Nullable String[] strArr) {
        return 0;
    }
}

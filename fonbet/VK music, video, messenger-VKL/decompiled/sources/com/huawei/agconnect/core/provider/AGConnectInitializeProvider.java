package com.huawei.agconnect.core.provider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import com.huawei.agconnect.AGConnectInstance;
import com.vk.metrics.performance.appstart.content_provider.a;

/* loaded from: classes.dex */
public class AGConnectInitializeProvider extends ContentProvider {
    public AGConnectInitializeProvider() {
        a.b("com.huawei.agconnect.core.provider.AGConnectInitializeProvider.<init>(Unknown Source)");
        try {
        } finally {
            a.a("com.huawei.agconnect.core.provider.AGConnectInitializeProvider.<init>(Unknown Source)");
        }
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        a.b("com.huawei.agconnect.core.provider.AGConnectInitializeProvider.onCreate(Unknown Source)");
        try {
            AGConnectInstance.initialize(getContext());
            return false;
        } finally {
            a.a("com.huawei.agconnect.core.provider.AGConnectInitializeProvider.onCreate(Unknown Source)");
        }
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        a.b("com.huawei.agconnect.core.provider.AGConnectInitializeProvider.query(Unknown Source)");
        try {
            return null;
        } finally {
            a.a("com.huawei.agconnect.core.provider.AGConnectInitializeProvider.query(Unknown Source)");
        }
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}

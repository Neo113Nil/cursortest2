package com.vk.metrics.performance.appstart;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import xsna.dx90;
import xsna.ow90;

/* compiled from: AppMeasuringContentProvider.kt */
/* loaded from: classes.dex */
public final class AppMeasuringContentProvider extends ContentProvider {
    static {
        com.vk.metrics.performance.appstart.content_provider.a.b("com.vk.metrics.performance.appstart.AppMeasuringContentProvider.<clinit>(AppMeasuringContentProvider.kt)");
        try {
        } finally {
            com.vk.metrics.performance.appstart.content_provider.a.a("com.vk.metrics.performance.appstart.AppMeasuringContentProvider.<clinit>(AppMeasuringContentProvider.kt)");
        }
    }

    public AppMeasuringContentProvider() {
        com.vk.metrics.performance.appstart.content_provider.a.b("com.vk.metrics.performance.appstart.AppMeasuringContentProvider.<init>(AppMeasuringContentProvider.kt:12)");
        try {
        } finally {
            com.vk.metrics.performance.appstart.content_provider.a.a("com.vk.metrics.performance.appstart.AppMeasuringContentProvider.<init>(AppMeasuringContentProvider.kt:12)");
        }
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        return -1;
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        com.vk.metrics.performance.appstart.content_provider.a.b("com.vk.metrics.performance.appstart.AppMeasuringContentProvider.onCreate(AppMeasuringContentProvider.kt:14)");
        try {
            ow90.g.getClass();
            dx90 dx90Var = ow90.e;
            dx90Var.getClass();
            dx90Var.e = System.currentTimeMillis();
            int i = dx90.W;
            dx90.b.b("initContentProviders");
            dx90Var.r();
            return true;
        } finally {
            com.vk.metrics.performance.appstart.content_provider.a.a("com.vk.metrics.performance.appstart.AppMeasuringContentProvider.onCreate(AppMeasuringContentProvider.kt:14)");
        }
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        com.vk.metrics.performance.appstart.content_provider.a.b("com.vk.metrics.performance.appstart.AppMeasuringContentProvider.query(AppMeasuringContentProvider.kt:25)");
        try {
            return null;
        } finally {
            com.vk.metrics.performance.appstart.content_provider.a.a("com.vk.metrics.performance.appstart.AppMeasuringContentProvider.query(AppMeasuringContentProvider.kt:25)");
        }
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return -1;
    }
}

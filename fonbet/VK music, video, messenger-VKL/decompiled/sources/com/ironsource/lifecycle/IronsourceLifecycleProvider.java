package com.ironsource.lifecycle;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;

/* loaded from: classes13.dex */
public class IronsourceLifecycleProvider extends ContentProvider {
    private static boolean a = false;

    static {
        com.vk.metrics.performance.appstart.content_provider.a.b("com.ironsource.lifecycle.IronsourceLifecycleProvider.<clinit>(SourceFile)");
        try {
        } finally {
            com.vk.metrics.performance.appstart.content_provider.a.a("com.ironsource.lifecycle.IronsourceLifecycleProvider.<clinit>(SourceFile)");
        }
    }

    public IronsourceLifecycleProvider() {
        com.vk.metrics.performance.appstart.content_provider.a.b("com.ironsource.lifecycle.IronsourceLifecycleProvider.<init>(SourceFile:1)");
        try {
        } finally {
            com.vk.metrics.performance.appstart.content_provider.a.a("com.ironsource.lifecycle.IronsourceLifecycleProvider.<init>(SourceFile:1)");
        }
    }

    public static boolean a() {
        return a;
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
        com.vk.metrics.performance.appstart.content_provider.a.b("com.ironsource.lifecycle.IronsourceLifecycleProvider.onCreate(SourceFile:1)");
        try {
            a = true;
            b.d().a(getContext());
            return true;
        } finally {
            com.vk.metrics.performance.appstart.content_provider.a.a("com.ironsource.lifecycle.IronsourceLifecycleProvider.onCreate(SourceFile:1)");
        }
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        com.vk.metrics.performance.appstart.content_provider.a.b("com.ironsource.lifecycle.IronsourceLifecycleProvider.query(SourceFile)");
        try {
            return null;
        } finally {
            com.vk.metrics.performance.appstart.content_provider.a.a("com.ironsource.lifecycle.IronsourceLifecycleProvider.query(SourceFile)");
        }
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}

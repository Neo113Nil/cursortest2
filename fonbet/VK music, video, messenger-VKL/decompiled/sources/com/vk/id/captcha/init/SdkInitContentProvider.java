package com.vk.id.captcha.init;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;
import com.vk.metrics.performance.appstart.content_provider.a;
import xsna.fpf0;
import xsna.var0;

/* compiled from: SdkInitContentProvider.kt */
/* loaded from: classes.dex */
public final class SdkInitContentProvider extends ContentProvider {
    public SdkInitContentProvider() {
        a.b("com.vk.id.captcha.init.SdkInitContentProvider.<init>(SdkInitContentProvider.kt:10)");
        try {
        } finally {
            a.a("com.vk.id.captcha.init.SdkInitContentProvider.<init>(SdkInitContentProvider.kt:10)");
        }
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        throw new IllegalStateException("Not supported");
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        throw new IllegalStateException("Not supported");
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        throw new IllegalStateException("Not supported");
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        var0 var0Var;
        Context context;
        a.b("com.vk.id.captcha.init.SdkInitContentProvider.onCreate(SdkInitContentProvider.kt:14)");
        try {
            try {
                var0Var = var0.a;
                context = getContext();
            } catch (Throwable unused) {
                Log.e(fpf0.a(SdkInitContentProvider.class).l(), "Failed to initialize Captcha SDK");
            }
            if (context == null) {
                throw new IllegalStateException("Required value was null.");
            }
            var0Var.getClass();
            var0.b(context);
            return true;
        } finally {
            a.a("com.vk.id.captcha.init.SdkInitContentProvider.onCreate(SdkInitContentProvider.kt:14)");
        }
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        a.b("com.vk.id.captcha.init.SdkInitContentProvider.query(SdkInitContentProvider.kt:22)");
        try {
            throw new IllegalStateException("Not supported");
        } catch (Throwable th) {
            a.a("com.vk.id.captcha.init.SdkInitContentProvider.query(SdkInitContentProvider.kt:22)");
            throw th;
        }
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new IllegalStateException("Not supported");
    }
}

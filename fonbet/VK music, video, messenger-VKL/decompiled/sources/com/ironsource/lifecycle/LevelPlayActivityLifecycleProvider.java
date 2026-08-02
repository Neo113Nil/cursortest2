package com.ironsource.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.logger.IronLog;

/* loaded from: classes13.dex */
public final class LevelPlayActivityLifecycleProvider extends ContentProvider {
    public LevelPlayActivityLifecycleProvider() {
        com.vk.metrics.performance.appstart.content_provider.a.b("com.ironsource.lifecycle.LevelPlayActivityLifecycleProvider.<init>(SourceFile:1)");
        try {
        } finally {
            com.vk.metrics.performance.appstart.content_provider.a.a("com.ironsource.lifecycle.LevelPlayActivityLifecycleProvider.<init>(SourceFile:1)");
        }
    }

    private final void a(Application application) {
        application.registerActivityLifecycleCallbacks(new a());
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
        com.vk.metrics.performance.appstart.content_provider.a.b("com.ironsource.lifecycle.LevelPlayActivityLifecycleProvider.onCreate(SourceFile:1)");
        try {
            Context context = getContext();
            Application application = context instanceof Application ? (Application) context : null;
            if (application == null) {
                IronLog.INTERNAL.verbose("context is not application");
                com.vk.metrics.performance.appstart.content_provider.a.a("com.ironsource.lifecycle.LevelPlayActivityLifecycleProvider.onCreate(SourceFile:1)");
                return true;
            }
            a(application);
            com.vk.metrics.performance.appstart.content_provider.a.a("com.ironsource.lifecycle.LevelPlayActivityLifecycleProvider.onCreate(SourceFile:1)");
            return true;
        } catch (Throwable th) {
            com.vk.metrics.performance.appstart.content_provider.a.a("com.ironsource.lifecycle.LevelPlayActivityLifecycleProvider.onCreate(SourceFile:1)");
            throw th;
        }
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        com.vk.metrics.performance.appstart.content_provider.a.b("com.ironsource.lifecycle.LevelPlayActivityLifecycleProvider.query(SourceFile)");
        try {
            return null;
        } finally {
            com.vk.metrics.performance.appstart.content_provider.a.a("com.ironsource.lifecycle.LevelPlayActivityLifecycleProvider.query(SourceFile)");
        }
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }

    public static final class a implements Application.ActivityLifecycleCallbacks {
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            ContextProvider.getInstance().updateActivity(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            ContextProvider.getInstance().updateActivity(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            ContextProvider.getInstance().updateActivity(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }
    }
}

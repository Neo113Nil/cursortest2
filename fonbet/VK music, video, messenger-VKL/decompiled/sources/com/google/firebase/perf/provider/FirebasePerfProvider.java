package com.google.firebase.perf.provider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.firebase.perf.metrics.AppStartTrace;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.util.Timer;
import com.vk.metrics.performance.appstart.content_provider.a;
import xsna.exc0;
import xsna.ljr;
import xsna.txi;
import xsna.u93;

@Keep
/* loaded from: classes.dex */
public class FirebasePerfProvider extends ContentProvider {
    private static final Timer APP_START_TIME;

    @VisibleForTesting
    static final String EMPTY_APPLICATION_ID_PROVIDER_AUTHORITY = "com.google.firebase.firebaseperfprovider";
    private final Handler mainHandler;

    static {
        a.b("com.google.firebase.perf.provider.FirebasePerfProvider.<clinit>(FirebasePerfProvider.java:43)");
        try {
            APP_START_TIME = new Timer();
        } finally {
            a.a("com.google.firebase.perf.provider.FirebasePerfProvider.<clinit>(FirebasePerfProvider.java:43)");
        }
    }

    public FirebasePerfProvider() {
        a.b("com.google.firebase.perf.provider.FirebasePerfProvider.<init>(FirebasePerfProvider.java:41)");
        try {
            this.mainHandler = new Handler(Looper.getMainLooper());
        } finally {
            a.a("com.google.firebase.perf.provider.FirebasePerfProvider.<init>(FirebasePerfProvider.java:41)");
        }
    }

    private static void checkContentProviderAuthority(@NonNull ProviderInfo providerInfo) {
        exc0.j(providerInfo, "FirebasePerfProvider ProviderInfo cannot be null.");
        if (EMPTY_APPLICATION_ID_PROVIDER_AUTHORITY.equals(providerInfo.authority)) {
            throw new IllegalStateException("Incorrect provider authority in manifest. Most likely due to a missing applicationId variable in application's build.gradle.");
        }
    }

    public static Timer getAppStartTime() {
        return APP_START_TIME;
    }

    @Override // android.content.ContentProvider
    public void attachInfo(Context context, ProviderInfo providerInfo) {
        a.b("com.google.firebase.perf.provider.FirebasePerfProvider.attachInfo(FirebasePerfProvider.java:58)");
        try {
            checkContentProviderAuthority(providerInfo);
            super.attachInfo(context, providerInfo);
            txi.e().r(getContext());
            u93 a = u93.a();
            a.c(getContext());
            a.d(new ljr());
            AppStartTrace a2 = AppStartTrace.a();
            a2.c(getContext());
            this.mainHandler.post(new AppStartTrace.a(a2));
            SessionManager.getInstance().initializeGaugeCollection();
        } finally {
            a.a("com.google.firebase.perf.provider.FirebasePerfProvider.attachInfo(FirebasePerfProvider.java:58)");
        }
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        a.b("com.google.firebase.perf.provider.FirebasePerfProvider.onCreate(FirebasePerfProvider.java:84)");
        try {
            return false;
        } finally {
            a.a("com.google.firebase.perf.provider.FirebasePerfProvider.onCreate(FirebasePerfProvider.java:84)");
        }
    }

    @Override // android.content.ContentProvider
    @Nullable
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        a.b("com.google.firebase.perf.provider.FirebasePerfProvider.query(FirebasePerfProvider.java:104)");
        try {
            return null;
        } finally {
            a.a("com.google.firebase.perf.provider.FirebasePerfProvider.query(FirebasePerfProvider.java:104)");
        }
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}

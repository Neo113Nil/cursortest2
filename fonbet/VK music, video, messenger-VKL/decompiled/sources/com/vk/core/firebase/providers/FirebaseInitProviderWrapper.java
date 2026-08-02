package com.vk.core.firebase.providers;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import java.io.File;
import java.util.concurrent.Executors;
import kotlin.NoWhenBranchMatchedException;
import xsna.ddk;

/* compiled from: FirebaseInitProviderWrapper.kt */
/* loaded from: classes.dex */
public final class FirebaseInitProviderWrapper extends ContentProvider {

    /* compiled from: FirebaseInitProviderWrapper.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FirebaseHijackingType.values().length];
            try {
                iArr[FirebaseHijackingType.ASYNC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FirebaseHijackingType.SYNC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FirebaseHijackingType.COLD_START.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        com.vk.metrics.performance.appstart.content_provider.a.b("com.vk.core.firebase.providers.FirebaseInitProviderWrapper.<clinit>(FirebaseInitProviderWrapper.kt)");
        try {
        } finally {
            com.vk.metrics.performance.appstart.content_provider.a.a("com.vk.core.firebase.providers.FirebaseInitProviderWrapper.<clinit>(FirebaseInitProviderWrapper.kt)");
        }
    }

    public FirebaseInitProviderWrapper() {
        com.vk.metrics.performance.appstart.content_provider.a.b("com.vk.core.firebase.providers.FirebaseInitProviderWrapper.<init>(FirebaseInitProviderWrapper.kt:16)");
        try {
        } finally {
            com.vk.metrics.performance.appstart.content_provider.a.a("com.vk.core.firebase.providers.FirebaseInitProviderWrapper.<init>(FirebaseInitProviderWrapper.kt:16)");
        }
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        return 0;
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
        com.vk.metrics.performance.appstart.content_provider.a.b("com.vk.core.firebase.providers.FirebaseInitProviderWrapper.onCreate(FirebaseInitProviderWrapper.kt:18)");
        try {
            com.vk.core.firebase.providers.a aVar = com.vk.core.firebase.providers.a.a;
            Context context = getContext();
            if (context == null) {
                com.vk.metrics.performance.appstart.content_provider.a.a("com.vk.core.firebase.providers.FirebaseInitProviderWrapper.onCreate(FirebaseInitProviderWrapper.kt:18)");
                return true;
            }
            com.vk.core.firebase.providers.a.c = new File(context.getCacheDir(), "init_firebase_provider");
            com.vk.core.firebase.providers.a.b = context;
            int i = a.$EnumSwitchMapping$0[com.vk.core.firebase.providers.a.d().ordinal()];
            if (i == 1) {
                aVar.c(Executors.newSingleThreadExecutor(), context);
            } else if (i == 2) {
                aVar.c(new ddk(), context);
            } else if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            return true;
        } finally {
            com.vk.metrics.performance.appstart.content_provider.a.a("com.vk.core.firebase.providers.FirebaseInitProviderWrapper.onCreate(FirebaseInitProviderWrapper.kt:18)");
        }
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        com.vk.metrics.performance.appstart.content_provider.a.b("com.vk.core.firebase.providers.FirebaseInitProviderWrapper.query(FirebaseInitProviderWrapper.kt:47)");
        try {
            return null;
        } finally {
            com.vk.metrics.performance.appstart.content_provider.a.a("com.vk.core.firebase.providers.FirebaseInitProviderWrapper.query(FirebaseInitProviderWrapper.kt:47)");
        }
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}

package androidx.startup;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.vk.metrics.performance.appstart.content_provider.a;
import xsna.o53;

/* loaded from: classes.dex */
public class InitializationProvider extends ContentProvider {
    public InitializationProvider() {
        a.b("androidx.startup.InitializationProvider.<init>(InitializationProvider.java:33)");
        try {
        } finally {
            a.a("androidx.startup.InitializationProvider.<init>(InitializationProvider.java:33)");
        }
    }

    @Override // android.content.ContentProvider
    public final int delete(@NonNull Uri uri, @Nullable String str, @Nullable String[] strArr) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    @Nullable
    public final String getType(@NonNull Uri uri) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    @Nullable
    public final Uri insert(@NonNull Uri uri, @Nullable ContentValues contentValues) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        a.b("androidx.startup.InitializationProvider.onCreate(InitializationProvider.java:37)");
        try {
            Context context = getContext();
            if (context == null) {
                throw new StartupException();
            }
            if (context.getApplicationContext() != null) {
                o53.d(context).a();
            }
            a.a("androidx.startup.InitializationProvider.onCreate(InitializationProvider.java:37)");
            return true;
        } catch (Throwable th) {
            a.a("androidx.startup.InitializationProvider.onCreate(InitializationProvider.java:37)");
            throw th;
        }
    }

    @Override // android.content.ContentProvider
    @Nullable
    public final Cursor query(@NonNull Uri uri, @Nullable String[] strArr, @Nullable String str, @Nullable String[] strArr2, @Nullable String str2) {
        a.b("androidx.startup.InitializationProvider.query(InitializationProvider.java:63)");
        try {
            throw new IllegalStateException("Not allowed.");
        } catch (Throwable th) {
            a.a("androidx.startup.InitializationProvider.query(InitializationProvider.java:63)");
            throw th;
        }
    }

    @Override // android.content.ContentProvider
    public final int update(@NonNull Uri uri, @Nullable ContentValues contentValues, @Nullable String str, @Nullable String[] strArr) {
        throw new IllegalStateException("Not allowed.");
    }
}

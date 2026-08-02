package androidx.startup;

import android.content.ComponentName;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.Trace;
import androidx.fragment.app.i0;
import io.sentry.android.core.performance.f;
import m4.g;
import x2.a;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class InitializationProvider extends ContentProvider {
    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        f.c(this);
        Context context = getContext();
        if (context == null) {
            i0 i0Var = new i0("Context cannot be null");
            f.d(this);
            throw i0Var;
        }
        if (context.getApplicationContext() != null) {
            a c2 = a.c(context);
            Class<?> cls = getClass();
            Context context2 = c2.f25386c;
            try {
                try {
                    Trace.beginSection(g.B("Startup"));
                    c2.a(context2.getPackageManager().getProviderInfo(new ComponentName(context2, cls), 128).metaData);
                } catch (PackageManager.NameNotFoundException e7) {
                    throw new i0(e7);
                }
            } finally {
                Trace.endSection();
            }
        }
        f.d(this);
        return true;
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new IllegalStateException("Not allowed.");
    }
}

package ru.ozon.fintech.base.content;

import G30.a;
import K1.G;
import Sc.InterfaceC4008j;
import Sc.k;
import Sc.n;
import android.content.ContentProvider;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import androidx.annotation.Keep;
import com.google.android.gms.actions.SearchIntents;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b'\u0018\u0000 ,2\u00020\u0001:\u0001-B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJQ\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u000b\u001a\u00020\n2\u0010\u0010\r\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0004\u0018\u00010\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00042\u0010\u0010\u000f\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0004\u0018\u00010\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0018\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J3\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00042\u0010\u0010\u000f\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ=\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u000e\u001a\u0004\u0018\u00010\u00042\u0010\u0010\u000f\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0016\u0010\u001f\u001a\u00020\n8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010!\u001a\u00020\u00048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010$\u001a\u00020#8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b$\u0010%R\u001b\u0010+\u001a\u00020&8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*¨\u0006."}, d2 = {"Lru/ozon/fintech/base/content/BaseSharedPrefsContentProvider;", "Landroid/content/ContentProvider;", "<init>", "()V", "", "getAuthoritySuffix", "()Ljava/lang/String;", "", "onCreate", "()Z", "Landroid/net/Uri;", "uri", "", "projection", "selection", "selectionArgs", "sortOrder", "Landroid/database/Cursor;", SearchIntents.EXTRA_QUERY, "(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;", "getType", "(Landroid/net/Uri;)Ljava/lang/String;", "Landroid/content/ContentValues;", "values", "insert", "(Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;", "", "delete", "(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I", "update", "(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I", "contentUri", "Landroid/net/Uri;", "authorityStr", "Ljava/lang/String;", "Landroid/content/SharedPreferences;", "sharedPrefs", "Landroid/content/SharedPreferences;", "Landroid/content/UriMatcher;", "matcher$delegate", "LSc/j;", "getMatcher", "()Landroid/content/UriMatcher;", "matcher", "Companion", "a", "fintech-base_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class BaseSharedPrefsContentProvider extends ContentProvider {
    private static final int DATA = 1;

    @NotNull
    private static final String DATA_PATH = "key/*";

    @NotNull
    private static final String TAG = "BaseSharedPrefsContentProvider";
    private String authorityStr;
    private Uri contentUri;

    /* renamed from: matcher$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j matcher = k.a(n.PUBLICATION, new a(this, 0));
    private SharedPreferences sharedPrefs;

    private final UriMatcher getMatcher() {
        return (UriMatcher) this.matcher.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UriMatcher matcher_delegate$lambda$1(BaseSharedPrefsContentProvider baseSharedPrefsContentProvider) {
        UriMatcher uriMatcher = new UriMatcher(-1);
        String str = baseSharedPrefsContentProvider.authorityStr;
        if (str != null) {
            uriMatcher.addURI(str, DATA_PATH, 1);
            return uriMatcher;
        }
        Intrinsics.n("authorityStr");
        throw null;
    }

    @Override // android.content.ContentProvider
    public int delete(@NotNull Uri uri, String selection, String[] selectionArgs) {
        ContentResolver contentResolver;
        Intrinsics.checkNotNullParameter(uri, "uri");
        if (getMatcher().match(uri) != 1) {
            throw new IllegalArgumentException(G.b(uri, "Unknown URI: "));
        }
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return 0;
        }
        SharedPreferences sharedPreferences = this.sharedPrefs;
        if (sharedPreferences == null) {
            Intrinsics.n("sharedPrefs");
            throw null;
        }
        if (!sharedPreferences.contains(lastPathSegment)) {
            return 0;
        }
        SharedPreferences sharedPreferences2 = this.sharedPrefs;
        if (sharedPreferences2 == null) {
            Intrinsics.n("sharedPrefs");
            throw null;
        }
        sharedPreferences2.edit().remove(lastPathSegment).commit();
        Context context = getContext();
        if (context != null && (contentResolver = context.getContentResolver()) != null) {
            contentResolver.notifyChange(uri, null);
        }
        return 1;
    }

    @NotNull
    public abstract String getAuthoritySuffix();

    @Override // android.content.ContentProvider
    public String getType(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return null;
    }

    @Override // android.content.ContentProvider
    public Uri insert(@NotNull Uri uri, ContentValues values) {
        ContentResolver contentResolver;
        Intrinsics.checkNotNullParameter(uri, "uri");
        if (getMatcher().match(uri) == 1) {
            String lastPathSegment = uri.getLastPathSegment();
            String asString = values != null ? values.getAsString(AppMeasurementSdk.ConditionalUserProperty.VALUE) : null;
            if (lastPathSegment != null && asString != null) {
                SharedPreferences sharedPreferences = this.sharedPrefs;
                if (sharedPreferences == null) {
                    Intrinsics.n("sharedPrefs");
                    throw null;
                }
                sharedPreferences.edit().putString(lastPathSegment, asString).commit();
                L80.a.a(TAG, "insert key=" + lastPathSegment + " value=" + asString);
                Context context = getContext();
                if (context != null && (contentResolver = context.getContentResolver()) != null) {
                    contentResolver.notifyChange(uri, null);
                }
                Uri uri2 = this.contentUri;
                if (uri2 != null) {
                    return Uri.withAppendedPath(uri2, lastPathSegment);
                }
                Intrinsics.n("contentUri");
                throw null;
            }
        }
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        Context context = getContext();
        if (context != null) {
            String authoritySuffix = getAuthoritySuffix();
            this.authorityStr = authoritySuffix;
            if (authoritySuffix == null) {
                Intrinsics.n("authorityStr");
                throw null;
            }
            this.sharedPrefs = context.getSharedPreferences(authoritySuffix, 0);
            this.contentUri = Uri.parse("content://" + getAuthoritySuffix() + "/key/*");
        }
        return this.sharedPrefs != null;
    }

    @Override // android.content.ContentProvider
    public Cursor query(@NotNull Uri uri, String[] projection, String selection, String[] selectionArgs, String sortOrder) {
        String lastPathSegment;
        Intrinsics.checkNotNullParameter(uri, "uri");
        if (getMatcher().match(uri) == 1 && (lastPathSegment = uri.getLastPathSegment()) != null) {
            SharedPreferences sharedPreferences = this.sharedPrefs;
            if (sharedPreferences == null) {
                Intrinsics.n("sharedPrefs");
                throw null;
            }
            String string = sharedPreferences.getString(lastPathSegment, null);
            if (string != null) {
                L80.a.a(TAG, "query key=" + lastPathSegment + " value=" + string);
                MatrixCursor matrixCursor = new MatrixCursor(new String[]{AppMeasurementSdk.ConditionalUserProperty.VALUE});
                matrixCursor.addRow(new String[]{string});
                return matrixCursor;
            }
        }
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(@NotNull Uri uri, ContentValues values, String selection, String[] selectionArgs) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return 0;
    }
}

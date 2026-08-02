package ru.ozon.fintech.base.shared;

import L80.a;
import Vd0.b;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u0014B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\n \t*\u0004\u0018\u00010\b0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012¨\u0006\u0015"}, d2 = {"Lru/ozon/fintech/base/shared/FintechExportedContentProviderInteractor;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", FintechExportedContentProviderInteractor.KEY, "Landroid/net/Uri;", "kotlin.jvm.PlatformType", "getContentProviderUri", "(Ljava/lang/String;)Landroid/net/Uri;", "value", "", "putStringValue", "(Ljava/lang/String;Ljava/lang/String;)V", "getStringValue", "(Ljava/lang/String;)Ljava/lang/String;", "Landroid/content/Context;", "Companion", "a", "fintech-base_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FintechExportedContentProviderInteractor {

    @NotNull
    private static final String KEY = "key";

    @NotNull
    private static final String TAG = "FintechExportedContentProviderInteractor";

    @NotNull
    private static final String VALUE = "value";

    @NotNull
    private final Context context;

    public FintechExportedContentProviderInteractor(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    private final Uri getContentProviderUri(String key) {
        return Uri.parse("content://ru.ozon.fintech.base.shared/key/" + key);
    }

    public final String getStringValue(@NotNull String key) {
        String string;
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            Cursor query = this.context.getContentResolver().query(getContentProviderUri(key), null, null, null, null);
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        string = query.getString(query.getColumnIndexOrThrow("value"));
                        b.a(query, null);
                        return string;
                    }
                } finally {
                }
            }
            string = null;
            b.a(query, null);
            return string;
        } catch (Exception e11) {
            a.c(TAG, "Error while try getStringValue()", e11);
            return null;
        }
    }

    public final void putStringValue(@NotNull String key, @NotNull String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        try {
            ContentResolver contentResolver = this.context.getContentResolver();
            Uri contentProviderUri = getContentProviderUri(key);
            ContentValues contentValues = new ContentValues();
            contentValues.put(KEY, key);
            contentValues.put("value", value);
            Unit unit = Unit.f71690a;
            contentResolver.insert(contentProviderUri, contentValues);
            contentResolver.notifyChange(contentProviderUri, null);
        } catch (Exception e11) {
            a.c(TAG, "putStringValue", e11);
        }
    }
}

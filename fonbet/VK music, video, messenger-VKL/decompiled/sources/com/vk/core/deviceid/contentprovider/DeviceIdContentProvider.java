package com.vk.core.deviceid.contentprovider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.text.TextUtils;
import com.vk.log.L;
import com.vk.metrics.performance.appstart.content_provider.a;
import kotlin.LazyThreadSafetyMode;
import xsna.eia;
import xsna.epx;
import xsna.i6n0;
import xsna.m8f0;
import xsna.msy;
import xsna.w83;
import xsna.y5m;

/* compiled from: DeviceIdContentProvider.kt */
/* loaded from: classes.dex */
public final class DeviceIdContentProvider extends ContentProvider {
    public static final /* synthetic */ int c = 0;
    public final Object b;

    public DeviceIdContentProvider() {
        a.b("com.vk.core.deviceid.contentprovider.DeviceIdContentProvider.<init>(DeviceIdContentProvider.kt:12)");
        try {
            this.b = msy.a(LazyThreadSafetyMode.NONE, new eia(this, 1));
        } finally {
            a.a("com.vk.core.deviceid.contentprovider.DeviceIdContentProvider.<init>(DeviceIdContentProvider.kt:12)");
        }
    }

    public static MatrixCursor a(String[] strArr) {
        String str;
        MatrixCursor matrixCursor = new MatrixCursor(strArr);
        String str2 = m8f0.a;
        if (m8f0.c == null) {
            m8f0.c = new w83();
        }
        synchronized (m8f0.class) {
            if (m8f0.b.length() > 0) {
                str = m8f0.b;
            } else {
                L.e("next_device_id is null or empty: " + m8f0.a);
                w83 w83Var = m8f0.c;
                if (w83Var == null) {
                    w83Var = null;
                }
                m8f0.b = w83Var.a();
                str = TextUtils.isEmpty(m8f0.b) ? null : m8f0.b;
            }
        }
        if (str != null) {
            MatrixCursor.RowBuilder newRow = matrixCursor.newRow();
            if (strArr != null) {
                for (String str3 : strArr) {
                    if (epx.f(str3, "device_id")) {
                        newRow.add(str3, str);
                    }
                }
            }
        }
        return matrixCursor;
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        throw new UnsupportedOperationException(i6n0.a(uri, "Operation delete does not support URI: "));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        ?? r0 = this.b;
        if (((y5m) r0.getValue()).b.match(uri) != 1) {
            return null;
        }
        y5m y5mVar = (y5m) r0.getValue();
        StringBuilder sb = new StringBuilder("vnd.android.cursor.dir/vnd.");
        sb.append(y5mVar.a + ".DeviceIdContentProvider");
        sb.append(".state");
        return sb.toString();
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException(i6n0.a(uri, "Operation insert does not support URI: "));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        a.b("com.vk.core.deviceid.contentprovider.DeviceIdContentProvider.onCreate(DeviceIdContentProvider.kt:23)");
        try {
            y5m y5mVar = (y5m) this.b.getValue();
            y5mVar.b.addURI(y5mVar.a + ".DeviceIdContentProvider", "state", 1);
            return true;
        } finally {
            a.a("com.vk.core.deviceid.contentprovider.DeviceIdContentProvider.onCreate(DeviceIdContentProvider.kt:23)");
        }
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        a.b("com.vk.core.deviceid.contentprovider.DeviceIdContentProvider.query(DeviceIdContentProvider.kt:34)");
        try {
            if (((y5m) this.b.getValue()).b.match(uri) == 1) {
                MatrixCursor a = a(strArr);
                a.a("com.vk.core.deviceid.contentprovider.DeviceIdContentProvider.query(DeviceIdContentProvider.kt:34)");
                return a;
            }
            throw new IllegalArgumentException("Wrong URI: " + uri);
        } catch (Throwable th) {
            a.a("com.vk.core.deviceid.contentprovider.DeviceIdContentProvider.query(DeviceIdContentProvider.kt:34)");
            throw th;
        }
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException(i6n0.a(uri, "Operation update does not support URI: "));
    }
}

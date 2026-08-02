package com.vk.usersstore.contentprovider;

import android.content.ContentProvider;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.util.Log;
import com.vk.api.sdk.auth.AccountProfileType;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import xsna.arm0;
import xsna.g5g;
import xsna.i6n0;
import xsna.j5g;
import xsna.p0r0;
import xsna.vu5;

/* compiled from: UsersContentProvider.kt */
/* loaded from: classes11.dex */
public final class UsersContentProvider extends ContentProvider {
    public static final a d;
    public p0r0 b;
    public UriMatcher c;

    /* compiled from: UsersContentProvider.kt */
    public static final class a {
    }

    /* compiled from: UsersContentProvider.kt */
    public static final class b {
        public final int a;
        public final int b;

        public b(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && this.b == bVar.b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MatchInfo(code=");
            sb.append(this.a);
            sb.append(", version=");
            return vu5.b(sb, this.b, ')');
        }
    }

    static {
        com.vk.metrics.performance.appstart.content_provider.a.b("com.vk.usersstore.contentprovider.UsersContentProvider.<clinit>(UsersContentProvider.kt)");
        try {
            d = new a();
        } finally {
            com.vk.metrics.performance.appstart.content_provider.a.a("com.vk.usersstore.contentprovider.UsersContentProvider.<clinit>(UsersContentProvider.kt)");
        }
    }

    public UsersContentProvider() {
        com.vk.metrics.performance.appstart.content_provider.a.b("com.vk.usersstore.contentprovider.UsersContentProvider.<init>(UsersContentProvider.kt:42)");
        try {
        } finally {
            com.vk.metrics.performance.appstart.content_provider.a.a("com.vk.usersstore.contentprovider.UsersContentProvider.<init>(UsersContentProvider.kt:42)");
        }
    }

    public static Pair b(String str, int i, String[] strArr) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (str != null) {
            arrayList.add("(" + str + ')');
        }
        if (strArr != null) {
            g5g.A(arrayList2, strArr);
        }
        if (i < 2) {
            arrayList.add("profile_type=?");
            arrayList2.add(String.valueOf(AccountProfileType.NORMAL.h()));
        }
        return new Pair(arrayList, arrayList2);
    }

    public final b a(Uri uri) {
        Integer m;
        UriMatcher uriMatcher = this.c;
        if (uriMatcher == null) {
            uriMatcher = null;
        }
        int match = uriMatcher.match(uri);
        if (match != 100 && match != 101) {
            throw new IllegalArgumentException(i6n0.a(uri, "Unknown URI: "));
        }
        String queryParameter = uri.getQueryParameter("version");
        return new b(match, (queryParameter == null || (m = arm0.m(10, queryParameter)) == null) ? 1 : m.intValue());
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        b a2 = a(uri);
        p0r0 p0r0Var = this.b;
        if (p0r0Var == null) {
            p0r0Var = null;
        }
        SQLiteDatabase writableDatabase = p0r0Var.getWritableDatabase();
        if (a2.a == 100) {
            return writableDatabase.delete("users", str, strArr);
        }
        d.getClass();
        return writableDatabase.delete("users", "user_id=?", new String[]{String.valueOf(ContentUris.parseId(uri))});
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        long parseId;
        Long asLong;
        if (a(uri).a == 100) {
            throw new IllegalArgumentException("insert is not supported for multiple users");
        }
        if (contentValues == null || (asLong = contentValues.getAsLong("user_id")) == null) {
            d.getClass();
            parseId = ContentUris.parseId(uri);
        } else {
            parseId = asLong.longValue();
        }
        if (contentValues == null || contentValues.getAsString("name") == null) {
            throw new IllegalArgumentException("User name should not be null");
        }
        if (contentValues.getAsString("exchange_token") == null) {
            throw new IllegalArgumentException("User exchange token should not be null");
        }
        contentValues.getAsString("last_name");
        contentValues.getAsString("phone");
        contentValues.getAsString("email");
        contentValues.put("user_id", Long.valueOf(parseId));
        p0r0 p0r0Var = this.b;
        if (p0r0Var == null) {
            p0r0Var = null;
        }
        if (p0r0Var.getWritableDatabase().insertWithOnConflict("users", null, contentValues, 5) == -1) {
            Log.e("UsersContentProvider", "Failed to insert user with userId=" + parseId);
        }
        return uri;
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        com.vk.metrics.performance.appstart.content_provider.a.b("com.vk.usersstore.contentprovider.UsersContentProvider.onCreate(UsersContentProvider.kt:47)");
        try {
            Context context = getContext();
            if (context == null) {
                com.vk.metrics.performance.appstart.content_provider.a.a("com.vk.usersstore.contentprovider.UsersContentProvider.onCreate(UsersContentProvider.kt:47)");
                return false;
            }
            this.b = new p0r0(context, "users.exchange.db");
            UriMatcher uriMatcher = new UriMatcher(-1);
            this.c = uriMatcher;
            uriMatcher.addURI(context.getPackageName().concat(".UsersContentProvider"), "users", 100);
            UriMatcher uriMatcher2 = this.c;
            if (uriMatcher2 == null) {
                uriMatcher2 = null;
            }
            uriMatcher2.addURI(context.getPackageName().concat(".UsersContentProvider"), "users/#", 101);
            com.vk.metrics.performance.appstart.content_provider.a.a("com.vk.usersstore.contentprovider.UsersContentProvider.onCreate(UsersContentProvider.kt:47)");
            return true;
        } catch (Throwable th) {
            com.vk.metrics.performance.appstart.content_provider.a.a("com.vk.usersstore.contentprovider.UsersContentProvider.onCreate(UsersContentProvider.kt:47)");
            throw th;
        }
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        com.vk.metrics.performance.appstart.content_provider.a.b("com.vk.usersstore.contentprovider.UsersContentProvider.query(UsersContentProvider.kt:56)");
        try {
            b a2 = a(uri);
            p0r0 p0r0Var = this.b;
            if (p0r0Var == null) {
                p0r0Var = null;
            }
            SQLiteDatabase readableDatabase = p0r0Var.getReadableDatabase();
            Pair b2 = b(str, a2.b, strArr2);
            List list = (List) b2.d();
            List list2 = (List) b2.g();
            if (a2.a == 101) {
                list.add("user_id=?");
                d.getClass();
                g5g.A(list2, new String[]{String.valueOf(ContentUris.parseId(uri))});
            }
            Cursor query = readableDatabase.query("users", strArr, j5g.g0(list, " AND ", null, null, 0, null, 62), (String[]) list2.toArray(new String[0]), null, null, str2);
            com.vk.metrics.performance.appstart.content_provider.a.a("com.vk.usersstore.contentprovider.UsersContentProvider.query(UsersContentProvider.kt:56)");
            return query;
        } catch (Throwable th) {
            com.vk.metrics.performance.appstart.content_provider.a.a("com.vk.usersstore.contentprovider.UsersContentProvider.query(UsersContentProvider.kt:56)");
            throw th;
        }
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        if (a(uri).a == 100) {
            throw new IllegalArgumentException("update is not supported for multiple users");
        }
        d.getClass();
        long parseId = ContentUris.parseId(uri);
        String[] strArr2 = {String.valueOf(parseId)};
        if (contentValues == null) {
            contentValues = new ContentValues(1);
        }
        contentValues.put("user_id", Long.valueOf(parseId));
        p0r0 p0r0Var = this.b;
        if (p0r0Var == null) {
            p0r0Var = null;
        }
        return p0r0Var.getWritableDatabase().update("users", contentValues, "user_id=?", strArr2);
    }
}

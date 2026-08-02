package com.zoho.livechat.android.provider;

import android.content.ContentProvider;
import android.content.ContentProviderOperation;
import android.content.ContentProviderResult;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import com.zoho.livechat.android.provider.b;
import com.zoho.livechat.android.utils.LiveChatUtil;
import com.zoho.livechat.android.utils.MobilistenUtil;
import io.agora.utils2.internal.CommonUtility;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public class ZohoLDContentProvider extends ContentProvider {

    /* renamed from: a, reason: collision with root package name */
    public static UriMatcher f44265a;

    /* renamed from: b, reason: collision with root package name */
    public static c f44266b;

    public static UriMatcher a() {
        UriMatcher uriMatcher = new UriMatcher(-1);
        String str = b.f44267a;
        uriMatcher.addURI(str, "ChatConversation", 1);
        uriMatcher.addURI(str, "ChatMessage", 2);
        uriMatcher.addURI(str, "ChatNotification", 3);
        return uriMatcher;
    }

    public static c b() {
        c(MobilistenInitProvider.k());
        return f44266b;
    }

    public static void c(Context context) {
        if (context == null) {
            context = MobilistenInitProvider.k() != null ? MobilistenInitProvider.k() : null;
        }
        if (context == null || f44266b != null) {
            return;
        }
        b.f44267a = MobilistenUtil.f() + ".livechat";
        b.f44268b = Uri.parse(CommonUtility.PREFIX_URI + b.f44267a);
        f44265a = a();
        f44266b = new c(context);
    }

    @Override // android.content.ContentProvider
    public synchronized ContentProviderResult[] applyBatch(ArrayList arrayList) {
        ContentProviderResult[] contentProviderResultArr;
        SQLiteDatabase writableDatabase = b().getWritableDatabase();
        writableDatabase.beginTransaction();
        try {
            try {
                int size = arrayList.size();
                contentProviderResultArr = new ContentProviderResult[size];
                for (int i10 = 0; i10 < size; i10++) {
                    contentProviderResultArr[i10] = ((ContentProviderOperation) arrayList.get(i10)).apply(this, contentProviderResultArr, i10);
                }
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
            } catch (Throwable th2) {
                writableDatabase.endTransaction();
                throw th2;
            }
        } catch (Exception e10) {
            LiveChatUtil.log(e10);
            writableDatabase.endTransaction();
            return null;
        }
        return contentProviderResultArr;
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        SQLiteDatabase writableDatabase = b().getWritableDatabase();
        int match = f44265a.match(uri);
        if (match == 1) {
            int delete = writableDatabase.delete("SIQ_CONVERSATIONS", str, strArr);
            getContext().getContentResolver().notifyChange(uri, null);
            return delete;
        }
        if (match != 3) {
            return -1;
        }
        int delete2 = writableDatabase.delete("SIQ_NOTIFICATIONS", str, strArr);
        getContext().getContentResolver().notifyChange(uri, null);
        return delete2;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        int match = f44265a.match(uri);
        if (match == 1) {
            return "vnd.android.cursor.dir/vnd.zohoLD.chattranscript";
        }
        if (match != 3) {
            return null;
        }
        return "vnd.android.cursor.dir/vnd.zohoLD.chatnotification";
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        int match = f44265a.match(uri);
        SQLiteDatabase writableDatabase = b().getWritableDatabase();
        if (match == 1) {
            contentValues.put("_id", Long.valueOf(writableDatabase.insert("SIQ_CONVERSATIONS", null, contentValues)));
            getContext().getContentResolver().notifyChange(uri, null);
            return b.a.a(contentValues.getAsString("_id"));
        }
        if (match != 3) {
            return null;
        }
        writableDatabase.insert("SIQ_NOTIFICATIONS", null, contentValues);
        getContext().getContentResolver().notifyChange(uri, null);
        return b.c.a(contentValues.getAsString("_id"));
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        c(getContext());
        return true;
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        SQLiteDatabase readableDatabase = b().getReadableDatabase();
        int match = f44265a.match(uri);
        if (match == 1) {
            return readableDatabase.query("SIQ_CONVERSATIONS", null, str, strArr2, null, null, str2);
        }
        if (match != 3) {
            return null;
        }
        return readableDatabase.query("SIQ_NOTIFICATIONS", null, str, strArr2, null, null, str2);
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        SQLiteDatabase writableDatabase = b().getWritableDatabase();
        int match = f44265a.match(uri);
        if (match == 1) {
            int update = writableDatabase.update("SIQ_CONVERSATIONS", contentValues, str, strArr);
            getContext().getContentResolver().notifyChange(uri, null);
            return update;
        }
        if (match != 3) {
            return -1;
        }
        int update2 = writableDatabase.update("SIQ_NOTIFICATIONS", contentValues, str, strArr);
        getContext().getContentResolver().notifyChange(uri, null);
        return update2;
    }
}

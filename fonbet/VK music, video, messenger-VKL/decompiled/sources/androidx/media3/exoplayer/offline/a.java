package androidx.media3.exoplayer.offline;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.media3.common.StreamKey;
import androidx.media3.database.DatabaseIOException;
import androidx.media3.exoplayer.offline.DownloadRequest;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.jsonwebtoken.JwtParser;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.bor0;
import xsna.fxc0;
import xsna.l8o;
import xsna.n9o;
import xsna.o7o;
import xsna.swk;
import xsna.y2r0;
import xsna.zzx0;

/* compiled from: DefaultDownloadIndex.java */
/* loaded from: classes.dex */
public final class a implements zzx0 {
    public static final String f = n(3, 4);
    public static final String[] g = {"id", "mime_type", "uri", "stream_keys", "custom_cache_key", "data", "state", "start_time_ms", "update_time_ms", "content_length", "stop_reason", "failure_reason", "percent_downloaded", "bytes_downloaded", "key_set_id"};
    public final String a;
    public final String b;
    public final swk c;
    public final Object d;
    public boolean e;

    /* compiled from: DefaultDownloadIndex.java */
    /* renamed from: androidx.media3.exoplayer.offline.a$a, reason: collision with other inner class name */
    public static final class C0060a implements l8o {
        public final Cursor b;

        public C0060a(Cursor cursor) {
            this.b = cursor;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            this.b.close();
        }

        @Override // xsna.l8o
        public final int getPosition() {
            return this.b.getPosition();
        }

        public final o7o m() {
            return a.l(this.b);
        }

        @Override // xsna.l8o
        public final boolean moveToPosition(int i) {
            return this.b.moveToPosition(i);
        }
    }

    public a(swk swkVar) {
        this(swkVar, "");
    }

    public static ArrayList i(@Nullable String str) {
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(str)) {
            String str2 = y2r0.a;
            for (String str3 : str.split(StringUtils.COMMA, -1)) {
                String[] split = str3.split("\\.", -1);
                fxc0.z(split.length == 3);
                arrayList.add(new StreamKey(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2])));
            }
        }
        return arrayList;
    }

    public static o7o l(Cursor cursor) {
        byte[] blob = cursor.getBlob(14);
        String string = cursor.getString(0);
        string.getClass();
        String string2 = cursor.getString(2);
        string2.getClass();
        DownloadRequest.b bVar = new DownloadRequest.b(string, Uri.parse(string2));
        bVar.e(cursor.getString(1));
        bVar.f(i(cursor.getString(3)));
        if (blob.length <= 0) {
            blob = null;
        }
        bVar.d(blob);
        bVar.b(cursor.getString(4));
        bVar.c(cursor.getBlob(5));
        DownloadRequest a = bVar.a();
        n9o n9oVar = new n9o();
        n9oVar.a = cursor.getLong(13);
        n9oVar.b = cursor.getFloat(12);
        int i = cursor.getInt(6);
        return new o7o(a, i, cursor.getLong(7), cursor.getLong(8), cursor.getLong(9), cursor.getInt(10), i == 4 ? cursor.getInt(11) : 0, n9oVar);
    }

    public static o7o m(Cursor cursor) {
        String string = cursor.getString(0);
        string.getClass();
        String string2 = cursor.getString(2);
        string2.getClass();
        DownloadRequest.b bVar = new DownloadRequest.b(string, Uri.parse(string2));
        String string3 = cursor.getString(1);
        bVar.e("dash".equals(string3) ? MimeTypes.APPLICATION_MPD : "hls".equals(string3) ? MimeTypes.APPLICATION_M3U8 : "ss".equals(string3) ? MimeTypes.APPLICATION_SS : MimeTypes.VIDEO_UNKNOWN);
        bVar.f(i(cursor.getString(3)));
        bVar.b(cursor.getString(4));
        bVar.c(cursor.getBlob(5));
        DownloadRequest a = bVar.a();
        n9o n9oVar = new n9o();
        n9oVar.a = cursor.getLong(13);
        n9oVar.b = cursor.getFloat(12);
        int i = cursor.getInt(6);
        return new o7o(a, i, cursor.getLong(7), cursor.getLong(8), cursor.getLong(9), cursor.getInt(10), i == 4 ? cursor.getInt(11) : 0, n9oVar);
    }

    public static String n(int... iArr) {
        if (iArr.length == 0) {
            return "1";
        }
        StringBuilder sb = new StringBuilder("state IN (");
        for (int i = 0; i < iArr.length; i++) {
            if (i > 0) {
                sb.append(',');
            }
            sb.append(iArr[i]);
        }
        sb.append(')');
        return sb.toString();
    }

    @Override // xsna.zzx0
    public final void a(String str) throws DatabaseIOException {
        j();
        try {
            this.c.getWritableDatabase().delete(this.b, "id = ?", new String[]{str});
        } catch (SQLiteException e) {
            throw new DatabaseIOException(e);
        }
    }

    @Override // xsna.zzx0
    @Nullable
    public final o7o b(String str) throws DatabaseIOException {
        j();
        try {
            Cursor k = k("id = ?", new String[]{str});
            try {
                if (k.getCount() == 0) {
                    k.close();
                    return null;
                }
                k.moveToNext();
                o7o l = l(k);
                k.close();
                return l;
            } finally {
            }
        } catch (SQLiteException e) {
            throw new DatabaseIOException(e);
        }
    }

    @Override // xsna.zzx0
    public final void c(int i, String str) throws DatabaseIOException {
        j();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("stop_reason", Integer.valueOf(i));
            this.c.getWritableDatabase().update(this.b, contentValues, f + " AND id = ?", new String[]{str});
        } catch (SQLException e) {
            throw new DatabaseIOException(e);
        }
    }

    @Override // xsna.zzx0
    public final void d(o7o o7oVar) throws DatabaseIOException {
        j();
        try {
            p(o7oVar, this.c.getWritableDatabase());
        } catch (SQLiteException e) {
            throw new DatabaseIOException(e);
        }
    }

    @Override // xsna.zzx0
    public final void e() throws DatabaseIOException {
        j();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("state", (Integer) 5);
            contentValues.put("failure_reason", (Integer) 0);
            this.c.getWritableDatabase().update(this.b, contentValues, null, null);
        } catch (SQLException e) {
            throw new DatabaseIOException(e);
        }
    }

    @Override // xsna.zzx0
    public final void f() throws DatabaseIOException {
        j();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("state", (Integer) 0);
            this.c.getWritableDatabase().update(this.b, contentValues, "state = 2", null);
        } catch (SQLException e) {
            throw new DatabaseIOException(e);
        }
    }

    @Override // xsna.zzx0
    public final C0060a g(int... iArr) throws DatabaseIOException {
        j();
        return new C0060a(k(n(iArr), null));
    }

    @Override // xsna.zzx0
    public final void h(int i) throws DatabaseIOException {
        j();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("stop_reason", Integer.valueOf(i));
            this.c.getWritableDatabase().update(this.b, contentValues, f, null);
        } catch (SQLException e) {
            throw new DatabaseIOException(e);
        }
    }

    public final void j() throws DatabaseIOException {
        synchronized (this.d) {
            if (this.e) {
                return;
            }
            try {
                int a = bor0.a(this.c.getReadableDatabase(), 0, this.a);
                if (a != 3) {
                    SQLiteDatabase writableDatabase = this.c.getWritableDatabase();
                    writableDatabase.beginTransactionNonExclusive();
                    try {
                        bor0.c(writableDatabase, 0, this.a, 3);
                        ArrayList o = a == 2 ? o(writableDatabase) : new ArrayList();
                        writableDatabase.execSQL("DROP TABLE IF EXISTS " + this.b);
                        writableDatabase.execSQL("CREATE TABLE " + this.b + " (id TEXT PRIMARY KEY NOT NULL,mime_type TEXT,uri TEXT NOT NULL,stream_keys TEXT NOT NULL,custom_cache_key TEXT,data BLOB NOT NULL,state INTEGER NOT NULL,start_time_ms INTEGER NOT NULL,update_time_ms INTEGER NOT NULL,content_length INTEGER NOT NULL,stop_reason INTEGER NOT NULL,failure_reason INTEGER NOT NULL,percent_downloaded REAL NOT NULL,bytes_downloaded INTEGER NOT NULL,key_set_id BLOB NOT NULL)");
                        Iterator it = o.iterator();
                        while (it.hasNext()) {
                            p((o7o) it.next(), writableDatabase);
                        }
                        writableDatabase.setTransactionSuccessful();
                        writableDatabase.endTransaction();
                    } catch (Throwable th) {
                        writableDatabase.endTransaction();
                        throw th;
                    }
                }
                this.e = true;
            } catch (SQLException e) {
                throw new DatabaseIOException(e);
            }
        }
    }

    public final Cursor k(String str, @Nullable String[] strArr) throws DatabaseIOException {
        try {
            return this.c.getReadableDatabase().query(this.b, g, str, strArr, null, null, "start_time_ms ASC");
        } catch (SQLiteException e) {
            throw new DatabaseIOException(e);
        }
    }

    public final ArrayList o(SQLiteDatabase sQLiteDatabase) {
        ArrayList arrayList = new ArrayList();
        if (!y2r0.g0(sQLiteDatabase, this.b)) {
            return arrayList;
        }
        Cursor query = sQLiteDatabase.query(this.b, new String[]{"id", "title", "uri", "stream_keys", "custom_cache_key", "data", "state", "start_time_ms", "update_time_ms", "content_length", "stop_reason", "failure_reason", "percent_downloaded", "bytes_downloaded"}, null, null, null, null, null);
        while (query.moveToNext()) {
            try {
                arrayList.add(m(query));
            } finally {
            }
        }
        query.close();
        return arrayList;
    }

    public final void p(o7o o7oVar, SQLiteDatabase sQLiteDatabase) {
        DownloadRequest downloadRequest = o7oVar.a;
        DownloadRequest downloadRequest2 = o7oVar.a;
        byte[] bArr = downloadRequest.f;
        if (bArr == null) {
            bArr = y2r0.b;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", downloadRequest2.b);
        contentValues.put("mime_type", downloadRequest2.d);
        contentValues.put("uri", downloadRequest2.c.toString());
        List<StreamKey> list = downloadRequest2.e;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            StreamKey streamKey = list.get(i);
            sb.append(streamKey.b);
            sb.append(JwtParser.SEPARATOR_CHAR);
            sb.append(streamKey.c);
            sb.append(JwtParser.SEPARATOR_CHAR);
            sb.append(streamKey.d);
            sb.append(',');
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        contentValues.put("stream_keys", sb.toString());
        contentValues.put("custom_cache_key", downloadRequest2.g);
        contentValues.put("data", downloadRequest2.h);
        contentValues.put("state", Integer.valueOf(o7oVar.b));
        contentValues.put("start_time_ms", Long.valueOf(o7oVar.c));
        contentValues.put("update_time_ms", Long.valueOf(o7oVar.d));
        contentValues.put("content_length", Long.valueOf(o7oVar.e));
        contentValues.put("stop_reason", Integer.valueOf(o7oVar.f));
        contentValues.put("failure_reason", Integer.valueOf(o7oVar.g));
        contentValues.put("percent_downloaded", Float.valueOf(o7oVar.b()));
        contentValues.put("bytes_downloaded", Long.valueOf(o7oVar.a()));
        contentValues.put("key_set_id", bArr);
        sQLiteDatabase.replaceOrThrow(this.b, null, contentValues);
    }

    public a(swk swkVar, String str) {
        this.a = str;
        this.c = swkVar;
        this.b = "ExoPlayerDownloads".concat(str);
        this.d = new Object();
    }
}

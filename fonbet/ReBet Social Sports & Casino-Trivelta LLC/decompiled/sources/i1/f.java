package i1;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import e1.AbstractC4134a;
import g1.AbstractC4317d;
import g1.C4314a;
import g1.InterfaceC4315b;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class f {
    private static final String[] COLUMNS = {"name", "length", "last_touch_timestamp"};

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC4315b f47957a;

    /* renamed from: b, reason: collision with root package name */
    public String f47958b;

    public f(InterfaceC4315b interfaceC4315b) {
        this.f47957a = interfaceC4315b;
    }

    public static void a(SQLiteDatabase sQLiteDatabase, String str) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + str);
    }

    public static String d(String str) {
        return "ExoPlayerCacheFileMetadata" + str;
    }

    public Map b() {
        try {
            Cursor c10 = c();
            try {
                HashMap hashMap = new HashMap(c10.getCount());
                while (c10.moveToNext()) {
                    hashMap.put((String) AbstractC4134a.e(c10.getString(0)), new e(c10.getLong(1), c10.getLong(2)));
                }
                c10.close();
                return hashMap;
            } finally {
            }
        } catch (SQLException e10) {
            throw new C4314a(e10);
        }
    }

    public final Cursor c() {
        AbstractC4134a.e(this.f47958b);
        return this.f47957a.getReadableDatabase().query(this.f47958b, COLUMNS, null, null, null, null, null);
    }

    public void e(long j10) {
        try {
            String hexString = Long.toHexString(j10);
            this.f47958b = d(hexString);
            if (AbstractC4317d.b(this.f47957a.getReadableDatabase(), 2, hexString) != 1) {
                SQLiteDatabase writableDatabase = this.f47957a.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    AbstractC4317d.d(writableDatabase, 2, hexString, 1);
                    a(writableDatabase, this.f47958b);
                    writableDatabase.execSQL("CREATE TABLE " + this.f47958b + " (name TEXT PRIMARY KEY NOT NULL,length INTEGER NOT NULL,last_touch_timestamp INTEGER NOT NULL)");
                    writableDatabase.setTransactionSuccessful();
                } finally {
                    writableDatabase.endTransaction();
                }
            }
        } catch (SQLException e10) {
            throw new C4314a(e10);
        }
    }

    public void f(String str) {
        AbstractC4134a.e(this.f47958b);
        try {
            this.f47957a.getWritableDatabase().delete(this.f47958b, "name = ?", new String[]{str});
        } catch (SQLException e10) {
            throw new C4314a(e10);
        }
    }

    public void g(Set set) {
        AbstractC4134a.e(this.f47958b);
        try {
            SQLiteDatabase writableDatabase = this.f47957a.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            try {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    writableDatabase.delete(this.f47958b, "name = ?", new String[]{(String) it.next()});
                }
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
            } catch (Throwable th2) {
                writableDatabase.endTransaction();
                throw th2;
            }
        } catch (SQLException e10) {
            throw new C4314a(e10);
        }
    }

    public void h(String str, long j10, long j11) {
        AbstractC4134a.e(this.f47958b);
        try {
            SQLiteDatabase writableDatabase = this.f47957a.getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put("name", str);
            contentValues.put("length", Long.valueOf(j10));
            contentValues.put("last_touch_timestamp", Long.valueOf(j11));
            writableDatabase.replaceOrThrow(this.f47958b, null, contentValues);
        } catch (SQLException e10) {
            throw new C4314a(e10);
        }
    }
}

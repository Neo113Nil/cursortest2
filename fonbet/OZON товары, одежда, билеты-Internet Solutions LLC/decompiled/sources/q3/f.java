package q3;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import o3.C8634a;
import o3.InterfaceC8635b;

/* loaded from: classes.dex */
final class f {

    /* renamed from: c, reason: collision with root package name */
    private static final String[] f81430c = {AppMeasurementSdk.ConditionalUserProperty.NAME, "length", "last_touch_timestamp"};

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC8635b f81431a;

    /* renamed from: b, reason: collision with root package name */
    private String f81432b;

    public f(InterfaceC8635b interfaceC8635b) {
        this.f81431a = interfaceC8635b;
    }

    public final HashMap a() throws C8634a {
        try {
            this.f81432b.getClass();
            Cursor query = this.f81431a.getReadableDatabase().query(this.f81432b, f81430c, null, null, null, null, null);
            try {
                HashMap hashMap = new HashMap(query.getCount());
                while (query.moveToNext()) {
                    String string = query.getString(0);
                    string.getClass();
                    hashMap.put(string, new e(query.getLong(1), query.getLong(2)));
                }
                query.close();
                return hashMap;
            } catch (Throwable th2) {
                if (query == null) {
                    throw th2;
                }
                try {
                    query.close();
                    throw th2;
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                    throw th2;
                }
            }
        } catch (SQLException e11) {
            throw new C8634a(e11);
        }
    }

    public final void b(long j11) throws C8634a {
        InterfaceC8635b interfaceC8635b = this.f81431a;
        try {
            String hexString = Long.toHexString(j11);
            this.f81432b = "ExoPlayerCacheFileMetadata" + hexString;
            if (o3.d.a(interfaceC8635b.getReadableDatabase(), 2, hexString) != 1) {
                SQLiteDatabase writableDatabase = interfaceC8635b.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    o3.d.b(writableDatabase, 2, hexString, 1);
                    writableDatabase.execSQL("DROP TABLE IF EXISTS " + this.f81432b);
                    writableDatabase.execSQL("CREATE TABLE " + this.f81432b + " (name TEXT PRIMARY KEY NOT NULL,length INTEGER NOT NULL,last_touch_timestamp INTEGER NOT NULL)");
                    writableDatabase.setTransactionSuccessful();
                } finally {
                    writableDatabase.endTransaction();
                }
            }
        } catch (SQLException e11) {
            throw new C8634a(e11);
        }
    }

    public final void c(String str) throws C8634a {
        this.f81432b.getClass();
        try {
            this.f81431a.getWritableDatabase().delete(this.f81432b, "name = ?", new String[]{str});
        } catch (SQLException e11) {
            throw new C8634a(e11);
        }
    }

    public final void d(Set<String> set) throws C8634a {
        this.f81432b.getClass();
        try {
            SQLiteDatabase writableDatabase = this.f81431a.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            try {
                Iterator<String> it = set.iterator();
                while (it.hasNext()) {
                    writableDatabase.delete(this.f81432b, "name = ?", new String[]{it.next()});
                }
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
            } catch (Throwable th2) {
                writableDatabase.endTransaction();
                throw th2;
            }
        } catch (SQLException e11) {
            throw new C8634a(e11);
        }
    }

    public final void e(String str, long j11, long j12) throws C8634a {
        this.f81432b.getClass();
        try {
            SQLiteDatabase writableDatabase = this.f81431a.getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put(AppMeasurementSdk.ConditionalUserProperty.NAME, str);
            contentValues.put("length", Long.valueOf(j11));
            contentValues.put("last_touch_timestamp", Long.valueOf(j12));
            writableDatabase.replaceOrThrow(this.f81432b, null, contentValues);
        } catch (SQLException e11) {
            throw new C8634a(e11);
        }
    }
}

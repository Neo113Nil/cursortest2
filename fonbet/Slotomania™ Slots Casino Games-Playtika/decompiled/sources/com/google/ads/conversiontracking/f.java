package com.google.ads.conversiontracking;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.net.Uri;
import android.util.Log;
import com.google.android.exoplayer2.audio.SilenceSkippingAudioProcessor;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;

/* loaded from: classes5.dex */
public class f {
    private static final String a = String.format(Locale.US, "CREATE TABLE IF NOT EXISTS %s ( %s INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, %s TEXT NOT NULL, %s TEXT, %s INTEGER, %s INTEGER, %s TEXT, %s INTEGER, %s INTEGER,%s INTEGER);", "conversiontracking", "conversion_ping_id", "string_url", "preference_key", "is_repeatable", "parameter_is_null", "preference_name", "record_time", "retry_count", "last_retry_time");
    private final a b;
    private final Object c = new Object();

    public f(Context context) {
        this.b = new a(context, "google_conversion_tracking.db");
    }

    public void a(d dVar) {
        if (dVar == null) {
            return;
        }
        synchronized (this.c) {
            SQLiteDatabase a2 = a();
            if (a2 == null) {
                return;
            }
            a2.delete("conversiontracking", String.format(Locale.US, "%s = %d", "conversion_ping_id", Long.valueOf(dVar.h)), null);
        }
    }

    public SQLiteDatabase a() {
        try {
            return this.b.getWritableDatabase();
        } catch (SQLiteException unused) {
            Log.w("GoogleConversionReporter", "Error opening writable conversion tracking database");
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x003d, code lost:
    
        if (r12 != null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x003f, code lost:
    
        r12.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006b, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0067, code lost:
    
        if (r12 == null) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public List<d> a(long j) {
        synchronized (this.c) {
            LinkedList linkedList = new LinkedList();
            if (j <= 0) {
                return linkedList;
            }
            SQLiteDatabase a2 = a();
            if (a2 == null) {
                return linkedList;
            }
            Cursor cursor = null;
            try {
                try {
                    cursor = a2.query("conversiontracking", null, null, null, null, null, "last_retry_time ASC", String.valueOf(j));
                    if (cursor.moveToFirst()) {
                        do {
                            linkedList.add(a(cursor));
                        } while (cursor.moveToNext());
                    }
                } catch (SQLiteException e) {
                    String valueOf = String.valueOf(e.getMessage());
                    Log.w("GoogleConversionReporter", valueOf.length() != 0 ? "Error extracing ping Info: ".concat(valueOf) : new String("Error extracing ping Info: "));
                }
            } finally {
            }
        }
    }

    public void b(d dVar) {
        if (dVar == null) {
            return;
        }
        synchronized (this.c) {
            SQLiteDatabase a2 = a();
            if (a2 == null) {
                return;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("string_url", dVar.g);
            contentValues.put("preference_key", dVar.f);
            contentValues.put("is_repeatable", Integer.valueOf(dVar.b ? 1 : 0));
            contentValues.put("parameter_is_null", Integer.valueOf(dVar.a ? 1 : 0));
            contentValues.put("preference_name", dVar.e);
            contentValues.put("record_time", Long.valueOf(dVar.d));
            contentValues.put("retry_count", (Integer) 0);
            contentValues.put("last_retry_time", Long.valueOf(dVar.d));
            dVar.h = a2.insert("conversiontracking", null, contentValues);
            b();
            if (c() > SilenceSkippingAudioProcessor.DEFAULT_PADDING_SILENCE_US) {
                d();
            }
        }
    }

    public void b() {
        synchronized (this.c) {
            SQLiteDatabase a2 = a();
            if (a2 == null) {
                return;
            }
            a2.delete("conversiontracking", String.format(Locale.US, "(%s > %d) or (%s < %d and %s > 0)", "retry_count", 9000L, "record_time", Long.valueOf(g.a() - 43200000), "retry_count"), null);
        }
    }

    public void c(d dVar) {
        if (dVar == null) {
            return;
        }
        synchronized (this.c) {
            SQLiteDatabase a2 = a();
            if (a2 == null) {
                return;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("last_retry_time", Long.valueOf(g.a()));
            contentValues.put("retry_count", Integer.valueOf(dVar.c + 1));
            a2.update("conversiontracking", contentValues, String.format(Locale.US, "%s = %d", "conversion_ping_id", Long.valueOf(dVar.h)), null);
            b();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0024, code lost:
    
        if (r3 != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0026, code lost:
    
        r3.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0050, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x004c, code lost:
    
        if (r3 == null) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int c() {
        synchronized (this.c) {
            SQLiteDatabase a2 = a();
            if (a2 == null) {
                return 0;
            }
            Cursor cursor = null;
            try {
                try {
                    cursor = a2.rawQuery("select count(*) from conversiontracking", null);
                    if (cursor.moveToFirst()) {
                        return cursor.getInt(0);
                    }
                } catch (SQLiteException e) {
                    String valueOf = String.valueOf(e.getMessage());
                    Log.w("GoogleConversionReporter", valueOf.length() != 0 ? "Error getting record count".concat(valueOf) : new String("Error getting record count"));
                }
            } finally {
                if (cursor != null) {
                    cursor.close();
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0056, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0052, code lost:
    
        if (r11 == null) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void d() {
        synchronized (this.c) {
            SQLiteDatabase a2 = a();
            if (a2 == null) {
                return;
            }
            Cursor cursor = null;
            try {
                try {
                    cursor = a2.query("conversiontracking", null, null, null, null, null, "record_time ASC", "1");
                    if (cursor != null && cursor.moveToFirst()) {
                        a(a(cursor));
                    }
                } catch (SQLiteException e) {
                    String valueOf = String.valueOf(e.getMessage());
                    Log.w("GoogleConversionReporter", valueOf.length() != 0 ? "Error remove oldest record".concat(valueOf) : new String("Error remove oldest record"));
                }
            } finally {
                if (cursor != null) {
                    cursor.close();
                }
            }
        }
    }

    public d a(Cursor cursor) {
        boolean z;
        String str;
        boolean z2;
        if (cursor == null) {
            return null;
        }
        int i = cursor.getInt(7);
        String string = cursor.getString(1);
        if (i > 0) {
            string = Uri.parse(string).buildUpon().appendQueryParameter("retry", Integer.toString(i)).build().toString();
        }
        String str2 = string;
        long j = cursor.getLong(0);
        String string2 = cursor.getString(2);
        if (cursor.getInt(3) > 0) {
            z = false;
            str = string2;
            z2 = true;
        } else {
            z = false;
            str = string2;
            z2 = false;
        }
        if (cursor.getInt(4) > 0) {
            z = true;
        }
        return new d(j, str2, str, z2, z, cursor.getString(5), cursor.getLong(6), i);
    }

    public class a extends SQLiteOpenHelper {
        public a(Context context, String str) {
            super(context, str, (SQLiteDatabase.CursorFactory) null, 5);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL(f.a);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            Log.i("GoogleConversionReporter", new StringBuilder(64).append("Database updated from version ").append(i).append(" to version ").append(i2).toString());
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS conversiontracking");
            onCreate(sQLiteDatabase);
        }
    }
}

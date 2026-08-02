package com.apm.insight.e.a;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import com.apm.insight.c;
import com.apm.insight.runtime.j;
import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import java.util.HashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class a<T> {
    protected final String a;
    private String b = "_id";

    public a(String str) {
        this.a = str;
    }

    public abstract ContentValues a(T t);

    public abstract HashMap<String, String> a();

    public final void a(SQLiteDatabase sQLiteDatabase) {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("CREATE TABLE ");
            sb.append(this.a);
            sb.append(" (_id INTEGER PRIMARY KEY AUTOINCREMENT, ");
            HashMap<String, String> a = a();
            for (String str : a.keySet()) {
                sb.append(str);
                sb.append(" ");
                sb.append(a.get(str));
                sb.append(BlazeDataSourcePersonalizedType.STRING_SEPARATOR);
            }
            sb.delete(sb.length() - 1, sb.length());
            sb.append(")");
            sQLiteDatabase.execSQL(sb.toString());
        } catch (Throwable th) {
            c.a();
            j.a(th, "NPTH_CATCH");
        }
    }

    public void a(SQLiteDatabase sQLiteDatabase, T t) {
        if (sQLiteDatabase == null || t == null) {
            return;
        }
        try {
            sQLiteDatabase.insert(this.a, null, a((a<T>) t));
        } catch (Throwable th) {
            com.apm.insight.a.b(th);
        }
    }
}

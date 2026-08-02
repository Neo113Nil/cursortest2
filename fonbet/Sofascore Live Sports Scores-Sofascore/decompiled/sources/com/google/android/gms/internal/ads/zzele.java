package com.google.android.gms.internal.ads;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import com.google.android.gms.ads.internal.util.client.zzu;
import com.ironsource.U3;
import defpackage.ddb;
import defpackage.fjn;
import defpackage.k02;
import defpackage.v35;
import defpackage.vlo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzele extends zzgap {
    public static final /* synthetic */ int c = 0;
    public final Context a;
    public final zzhdi b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzele(Context context, zzhdi zzhdiVar) {
        super(context, "AdMobOfflineBufferedPings.db", r0);
        int intValue = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.L9)).intValue();
        int i = zzgar.a;
        this.a = context;
        this.b = zzhdiVar;
    }

    public static void g(SQLiteDatabase sQLiteDatabase, zzu zzuVar) {
        SQLiteDatabase sQLiteDatabase2;
        String sb;
        sQLiteDatabase.beginTransaction();
        try {
            String[] strArr = {"timestamp", "url"};
            StringBuilder sb2 = new StringBuilder(15);
            sb2.append("event_state = 1");
            String sb3 = sb2.toString();
            sQLiteDatabase2 = sQLiteDatabase;
            try {
                Cursor query = sQLiteDatabase2.query("offline_buffered_pings", strArr, sb3, null, null, null, "timestamp ASC", null);
                int count = query.getCount();
                String[] strArr2 = new String[count];
                int i = 0;
                while (query.moveToNext()) {
                    int columnIndex = query.getColumnIndex("timestamp");
                    int columnIndex2 = query.getColumnIndex("url");
                    if (columnIndex2 != -1) {
                        long j = query.getLong(columnIndex);
                        String string = query.getString(columnIndex2);
                        if (string == null) {
                            sb = "";
                        } else {
                            Uri parse = Uri.parse(string);
                            long a = com.google.android.gms.ads.internal.zzt.zzk().a() - j;
                            String encodedQuery = parse.getEncodedQuery();
                            Uri.Builder clearQuery = parse.buildUpon().clearQuery();
                            clearQuery.appendQueryParameter("bd", Long.toString(a));
                            String valueOf = String.valueOf(clearQuery.build());
                            StringBuilder sb4 = new StringBuilder(valueOf.length() + 1 + String.valueOf(encodedQuery).length());
                            sb4.append(valueOf);
                            sb4.append(U3.j.c);
                            sb4.append(encodedQuery);
                            sb = sb4.toString();
                        }
                        strArr2[i] = sb;
                    }
                    i++;
                }
                query.close();
                sQLiteDatabase2.delete("offline_buffered_pings", "event_state = ?", new String[]{Integer.toString(1)});
                sQLiteDatabase2.setTransactionSuccessful();
                sQLiteDatabase2.endTransaction();
                for (int i2 = 0; i2 < count; i2++) {
                    zzuVar.zzc(strArr2[i2], null);
                }
            } catch (Throwable th) {
                th = th;
                Throwable th2 = th;
                sQLiteDatabase2.endTransaction();
                throw th2;
            }
        } catch (Throwable th3) {
            th = th3;
            sQLiteDatabase2 = sQLiteDatabase;
        }
    }

    public final void e(zzfpi zzfpiVar) {
        v35 v35Var = new v35(this, 13);
        zzhdi zzhdiVar = this.b;
        ddb submit = zzhdiVar.submit(v35Var);
        submit.addListener(new vlo(0, submit, new fjn(this, zzfpiVar)), zzhdiVar);
    }

    public final void f(String str) {
        e(new k02(str));
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE offline_buffered_pings (timestamp INTEGER PRIMARY_KEY, gws_query_id TEXT, url TEXT, event_state INTEGER)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_buffered_pings");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_buffered_pings");
    }
}

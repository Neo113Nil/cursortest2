package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import io.appmetrica.analytics.coreapi.internal.db.DatabaseScript;
import java.util.ArrayList;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class J4 extends DatabaseScript {

    /* renamed from: a, reason: collision with root package name */
    public final String f12409a = "sessions";

    /* renamed from: b, reason: collision with root package name */
    public final int f12410b = 200;

    /* renamed from: c, reason: collision with root package name */
    public final String f12411c = "id";

    /* renamed from: d, reason: collision with root package name */
    public final String f12412d = "start_time";

    /* renamed from: e, reason: collision with root package name */
    public final String f12413e = "report_request_parameters";

    /* renamed from: f, reason: collision with root package name */
    public final String f12414f = "server_time_offset";

    /* renamed from: g, reason: collision with root package name */
    public final String f12415g = "type";

    /* renamed from: h, reason: collision with root package name */
    public final String f12416h = "obtained_before_first_sync";

    /* renamed from: i, reason: collision with root package name */
    public final C0499t7 f12417i = new C0499t7(null, 1, 0 == true ? 1 : 0);

    public final C0474s7 a(Cursor cursor) {
        try {
            Long valueOf = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.f12411c)));
            int i5 = cursor.getInt(cursor.getColumnIndexOrThrow(this.f12415g));
            Vk vk = Vk.FOREGROUND;
            boolean z5 = true;
            if (i5 != 0) {
                vk = Vk.BACKGROUND;
                if (i5 != 1) {
                    vk = null;
                }
            }
            String string = cursor.getString(cursor.getColumnIndexOrThrow(this.f12413e));
            Long valueOf2 = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.f12412d)));
            Long valueOf3 = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.f12414f)));
            if (cursor.getInt(cursor.getColumnIndexOrThrow(this.f12416h)) != 1) {
                z5 = false;
            }
            return new C0474s7(valueOf, vk, string, new C0449r7(valueOf2, valueOf3, Boolean.valueOf(z5)));
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x005c, code lost:
    
        if (r12 != null) goto L30;
     */
    @Override // io.appmetrica.analytics.coreapi.internal.db.DatabaseScript
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void runScript(@NotNull SQLiteDatabase sQLiteDatabase) {
        SQLiteDatabase sQLiteDatabase2;
        Cursor cursor;
        Long l6;
        String str;
        Long l10;
        ArrayList arrayList = new ArrayList();
        try {
            sQLiteDatabase2 = sQLiteDatabase;
        } catch (Throwable unused) {
            sQLiteDatabase2 = sQLiteDatabase;
        }
        try {
            cursor = sQLiteDatabase2.query(this.f12409a, null, null, null, null, null, null, String.valueOf(this.f12410b));
            while (cursor.moveToNext()) {
                try {
                    C0474s7 a7 = a(cursor);
                    if (a7 != null && (l6 = a7.f14616a) != null && l6.longValue() >= 0 && a7.f14617b != null && (str = a7.f14618c) != null && str.length() != 0 && (l10 = a7.f14619d.f14547a) != null && l10.longValue() > 0) {
                        arrayList.add(this.f12417i.fromModel(a7));
                    }
                } catch (Throwable unused2) {
                }
            }
        } catch (Throwable unused3) {
            cursor = null;
        }
        cursor.close();
        sQLiteDatabase2.execSQL("DROP TABLE IF EXISTS " + this.f12409a);
        sQLiteDatabase2.execSQL("CREATE TABLE IF NOT EXISTS sessions (id INTEGER,type INTEGER,report_request_parameters TEXT,session_description BLOB )");
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            try {
                sQLiteDatabase2.insertOrThrow("sessions", null, (ContentValues) it.next());
            } catch (Throwable unused4) {
            }
        }
    }
}

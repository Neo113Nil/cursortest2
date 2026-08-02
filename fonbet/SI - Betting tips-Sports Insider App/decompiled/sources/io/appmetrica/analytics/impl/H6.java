package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.os.ResultReceiver;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.internal.CounterConfiguration;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class H6 {

    /* renamed from: a, reason: collision with root package name */
    public final CounterConfigurationReporterType f12304a;

    public H6(CounterConfigurationReporterType counterConfigurationReporterType) {
        this.f12304a = counterConfigurationReporterType;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:2|3)|(3:63|64|(9:66|(2:69|67)|70|6|7|8|(2:15|(8:18|76|26|27|(4:30|(5:34|35|(1:37)(1:41)|38|39)|40|28)|44|45|(2:49|50)))|59|60))|5|6|7|8|(4:10|12|15|(2:18|76))|59|60|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0059, code lost:
    
        r10 = 0;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0077 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final F6 a(SQLiteDatabase sQLiteDatabase, String str, int i5, String str2, boolean z5) {
        Cursor cursor;
        ArrayList<ContentValues> arrayList;
        C0337mj c0337mj;
        C0287kj c0287kj;
        M3 m32;
        Integer num;
        try {
            cursor = sQLiteDatabase.rawQuery("SELECT global_number, type, event_description FROM events WHERE " + str, null);
        } catch (Throwable th2) {
            th = th2;
            cursor = null;
        }
        if (cursor != null) {
            try {
            } catch (Throwable th3) {
                th = th3;
                try {
                    Qj qj = AbstractC0387oj.f14425a;
                    qj.getClass();
                    qj.a(new C0412pj("select_rows_to_delete_exception", th));
                    lo.a(cursor);
                    arrayList = null;
                    int i10 = sQLiteDatabase.delete("events", str, null);
                    if (arrayList != null) {
                    }
                    return new F6(arrayList, i10);
                } finally {
                    lo.a(cursor);
                }
            }
            if (cursor.getCount() > 0) {
                arrayList = new ArrayList(cursor.getCount());
                while (cursor.moveToNext()) {
                    ContentValues contentValues = new ContentValues();
                    DatabaseUtils.cursorRowToContentValues(cursor, contentValues);
                    arrayList.add(contentValues);
                }
                int i102 = sQLiteDatabase.delete("events", str, null);
                if (arrayList != null && arrayList.size() != 0 && i102 == arrayList.size() && z5) {
                    c0337mj = C0353na.I.f14326f;
                    if (str2 != null && c0337mj != null) {
                        CounterConfigurationReporterType counterConfigurationReporterType = this.f12304a;
                        synchronized (c0337mj) {
                            c0287kj = (C0287kj) c0337mj.f14279c.get(str2);
                            if (c0287kj == null) {
                                c0287kj = new C0287kj(str2, c0337mj.f14278b, counterConfigurationReporterType, c0337mj.f14277a);
                                c0337mj.f14279c.put(str2, c0287kj);
                            }
                        }
                        try {
                            JSONObject jSONObject = new JSONObject();
                            JSONArray jSONArray = new JSONArray();
                            JSONArray jSONArray2 = new JSONArray();
                            for (ContentValues contentValues2 : arrayList) {
                                Integer asInteger = contentValues2.getAsInteger("global_number");
                                Integer asInteger2 = contentValues2.getAsInteger("type");
                                if (asInteger != null && asInteger2 != null) {
                                    jSONArray.put(asInteger);
                                    EnumC0047bb a7 = EnumC0047bb.a(asInteger2.intValue());
                                    if (a7 == null) {
                                        Map map = Pf.f12751a;
                                        num = null;
                                    } else {
                                        num = (Integer) Pf.f12753c.get(a7);
                                    }
                                    jSONArray2.put(num);
                                }
                            }
                            jSONObject.put("global_number", jSONArray).put("event_type", jSONArray2);
                            JSONObject put = new JSONObject().put("details", new JSONObject().put("reason", G6.a(i5)).put("cleared", jSONObject).put("actual_deleted_number", i102));
                            PublicLogger orCreatePublicLogger = LoggerStorage.getOrCreatePublicLogger(str2);
                            String jSONObject2 = put.toString();
                            Set set = AbstractC0576w9.f14825a;
                            EnumC0047bb enumC0047bb = EnumC0047bb.EVENT_TYPE_UNDEFINED;
                            m32 = new M3(jSONObject2, "", 12290, 0, orCreatePublicLogger);
                        } catch (Throwable unused) {
                            m32 = null;
                        }
                        if (m32 != null && c0287kj.f14146c != null) {
                            try {
                                CounterConfiguration counterConfiguration = new CounterConfiguration(c0287kj.f14144a);
                                counterConfiguration.setReporterType(c0287kj.f14146c);
                                ((B1) c0287kj.f14147d.f14366a).reportData(1, m32.d(new Fh(new Bf(c0287kj.f14145b, (ResultReceiver) null), counterConfiguration, new D8(new C0463rl(LoggerStorage.getOrCreatePublicLogger(c0287kj.f14144a), "Crash Environment")), null).c()));
                            } catch (Throwable unused2) {
                            }
                        }
                    }
                }
                return new F6(arrayList, i102);
            }
        }
        arrayList = null;
        int i1022 = sQLiteDatabase.delete("events", str, null);
        if (arrayList != null) {
            c0337mj = C0353na.I.f14326f;
            if (str2 != null) {
                CounterConfigurationReporterType counterConfigurationReporterType2 = this.f12304a;
                synchronized (c0337mj) {
                }
            }
        }
        return new F6(arrayList, i1022);
    }
}

package yj;

import Am.C2438a;
import Ej.p;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.I;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;

/* renamed from: yj.c, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10912c extends SQLiteOpenHelper {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final C10911b f106766a = new C10911b();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10912c(@NotNull sj.c config) {
        super(config.u(), config.v(), null, 3, f106766a);
        Intrinsics.checkNotNullParameter(config, "config");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(@NotNull SQLiteDatabase db2) {
        Intrinsics.checkNotNullParameter(db2, "db");
        p.b("Log database is created with version=3 on path " + db2.getPath());
        String E02 = h.E0("\n            CREATE TABLE IF NOT EXISTS logs (\n                rowid INTEGER PRIMARY KEY,\n                uuid TEXT UNIQUE,\n                timestamp INTEGER,\n                message TEXT,\n                level INTEGER,\n                tag TEXT,\n                service TEXT,\n                app_uuid TEXT,\n                team TEXT,\n                _group TEXT,\n                ozon_id TEXT,\n                user_id TEXT,\n                session_id TEXT,\n                app_version TEXT,\n                platform TEXT,\n                env TEXT,\n                model TEXT,\n                manufacturer TEXT,\n                first_launch INTEGER,\n                custom_fields TEXT,\n                is_local INTEGER,\n                is_sent INTEGER\n            );\n        ");
        db2.execSQL(E02);
        p.b("Database table 'logs' is created. Scheme:\n" + E02);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(@NotNull SQLiteDatabase db2, int i11, int i12) {
        ArrayList o11;
        Intrinsics.checkNotNullParameter(db2, "db");
        o11 = I.o(new IntRange(i11, i12, 1), 2, 1, false);
        Iterator it = o11.iterator();
        while (it.hasNext()) {
            List list = (List) it.next();
            int intValue = ((Number) list.get(0)).intValue();
            int intValue2 = ((Number) list.get(1)).intValue();
            p.b("Log DB migration from version " + intValue + " to version " + intValue2 + " is started");
            long nanoTime = System.nanoTime();
            Pair pair = new Pair(Integer.valueOf(intValue), Integer.valueOf(intValue2));
            if (pair.equals(new Pair(1, 2))) {
                String E02 = h.E0("\n            CREATE TABLE IF NOT EXISTS logs_temp (\n                rowid INTEGER PRIMARY KEY,\n                uuid TEXT UNIQUE,\n                timestamp INTEGER,\n                message TEXT,\n                level INTEGER,\n                tag TEXT,\n                service TEXT,\n                app_uuid TEXT,\n                team TEXT,\n                _group TEXT,\n                ozon_id TEXT,\n                user_id TEXT,\n                session_id TEXT,\n                app_version TEXT,\n                platform TEXT,\n                env TEXT,\n                model TEXT,\n                manufacturer TEXT,\n                first_launch INTEGER,\n                custom_fields TEXT,\n                is_local INTEGER,\n                is_sent INTEGER\n            );\n        ");
                db2.execSQL(E02);
                p.b("Temporary table is created with scheme:\n" + E02);
                db2.execSQL(h.E0("\n            INSERT INTO logs_temp (\n                uuid,\n                timestamp,\n                message,\n                level,\n                service,\n                app_uuid,\n                team,\n                _group,\n                ozon_id,\n                user_id,\n                session_id,\n                app_version,\n                platform,\n                env,\n                model,\n                manufacturer,\n                first_launch,\n                custom_fields,\n                is_local,\n                is_sent\n            ) SELECT \n                uuid,\n                timestamp,\n                message,\n                level,\n                service,\n                app_uuid,\n                team,\n                _group,\n                ozon_id,\n                user_id,\n                session_id,\n                app_version,\n                platform,\n                env,\n                model,\n                manufacturer,\n                first_launch,\n                custom_fields,\n                is_local,\n                is_sent\n            FROM logs ORDER BY timestamp\n        "));
                p.b("Data is copied from logs table to logs_temp table");
                db2.execSQL("DROP TABLE logs;");
                p.b("Table logs is dropped");
                db2.execSQL("DROP INDEX IF EXISTS timeIndex;");
                p.b("Index timeIndex is dropped");
                db2.execSQL("ALTER TABLE logs_temp RENAME TO logs;");
                p.b("Table logs_temp is renamed to logs");
            } else if (pair.equals(new Pair(2, 3))) {
                db2.execSQL("ALTER TABLE logs ADD COLUMN tag TEXT DEFAULT NULL;");
                p.b("Column tag is added to table logs");
            }
            long nanoTime2 = System.nanoTime() - nanoTime;
            long j11 = 1000;
            StringBuilder a11 = C2438a.a("Log DB migration from version ", intValue, " to version ", " is finished, time spent: ", intValue2);
            a11.append(nanoTime2 / j11);
            a11.append(".");
            a11.append(nanoTime2 % j11);
            a11.append(" ms");
            p.b(a11.toString());
        }
    }
}

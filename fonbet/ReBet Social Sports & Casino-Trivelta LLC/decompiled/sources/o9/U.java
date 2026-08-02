package o9;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes2.dex */
public final class U extends SQLiteOpenHelper {

    /* renamed from: c, reason: collision with root package name */
    public static final String f59511c = "INSERT INTO global_log_event_state VALUES (" + System.currentTimeMillis() + ")";

    /* renamed from: d, reason: collision with root package name */
    public static int f59512d = 5;

    /* renamed from: e, reason: collision with root package name */
    public static final a f59513e;

    /* renamed from: f, reason: collision with root package name */
    public static final a f59514f;

    /* renamed from: g, reason: collision with root package name */
    public static final a f59515g;

    /* renamed from: h, reason: collision with root package name */
    public static final a f59516h;

    /* renamed from: i, reason: collision with root package name */
    public static final a f59517i;

    /* renamed from: j, reason: collision with root package name */
    public static final List f59518j;

    /* renamed from: a, reason: collision with root package name */
    public final int f59519a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f59520b;

    public interface a {
        void a(SQLiteDatabase sQLiteDatabase);
    }

    static {
        a aVar = new a() { // from class: o9.O
            @Override // o9.U.a
            public final void a(SQLiteDatabase sQLiteDatabase) {
                U.d(sQLiteDatabase);
            }
        };
        f59513e = aVar;
        a aVar2 = new a() { // from class: o9.P
            @Override // o9.U.a
            public final void a(SQLiteDatabase sQLiteDatabase) {
                U.B(sQLiteDatabase);
            }
        };
        f59514f = aVar2;
        a aVar3 = new a() { // from class: o9.Q
            @Override // o9.U.a
            public final void a(SQLiteDatabase sQLiteDatabase) {
                sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN payload_encoding TEXT");
            }
        };
        f59515g = aVar3;
        a aVar4 = new a() { // from class: o9.S
            @Override // o9.U.a
            public final void a(SQLiteDatabase sQLiteDatabase) {
                U.J(sQLiteDatabase);
            }
        };
        f59516h = aVar4;
        a aVar5 = new a() { // from class: o9.T
            @Override // o9.U.a
            public final void a(SQLiteDatabase sQLiteDatabase) {
                U.r(sQLiteDatabase);
            }
        };
        f59517i = aVar5;
        f59518j = Arrays.asList(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public U(Context context, String str, int i10) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i10);
        this.f59520b = false;
        this.f59519a = i10;
    }

    public static /* synthetic */ void B(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE transport_contexts ADD COLUMN extras BLOB");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority_extras on transport_contexts(backend_name, priority, extras)");
        sQLiteDatabase.execSQL("DROP INDEX contexts_backend_priority");
    }

    public static /* synthetic */ void J(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN inline BOOLEAN NOT NULL DEFAULT 1");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("CREATE TABLE event_payloads (sequence_num INTEGER NOT NULL, event_id INTEGER NOT NULL, bytes BLOB NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE,PRIMARY KEY (sequence_num, event_id))");
    }

    public static /* synthetic */ void d(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE events (_id INTEGER PRIMARY KEY, context_id INTEGER NOT NULL, transport_name TEXT NOT NULL, timestamp_ms INTEGER NOT NULL, uptime_ms INTEGER NOT NULL, payload BLOB NOT NULL, code INTEGER, num_attempts INTEGER NOT NULL,FOREIGN KEY (context_id) REFERENCES transport_contexts(_id) ON DELETE CASCADE)");
        sQLiteDatabase.execSQL("CREATE TABLE event_metadata (_id INTEGER PRIMARY KEY, event_id INTEGER NOT NULL, name TEXT NOT NULL, value TEXT NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE)");
        sQLiteDatabase.execSQL("CREATE TABLE transport_contexts (_id INTEGER PRIMARY KEY, backend_name TEXT NOT NULL, priority INTEGER NOT NULL, next_request_ms INTEGER NOT NULL)");
        sQLiteDatabase.execSQL("CREATE INDEX events_backend_id on events(context_id)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority on transport_contexts(backend_name, priority)");
    }

    public static /* synthetic */ void r(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
        sQLiteDatabase.execSQL("CREATE TABLE log_event_dropped (log_source VARCHAR(45) NOT NULL,reason INTEGER NOT NULL,events_dropped_count BIGINT NOT NULL,PRIMARY KEY(log_source, reason))");
        sQLiteDatabase.execSQL("CREATE TABLE global_log_event_state (last_metrics_upload_ms BIGINT PRIMARY KEY)");
        sQLiteDatabase.execSQL(f59511c);
    }

    public final void U(SQLiteDatabase sQLiteDatabase) {
        if (this.f59520b) {
            return;
        }
        onConfigure(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onConfigure(SQLiteDatabase sQLiteDatabase) {
        this.f59520b = true;
        sQLiteDatabase.rawQuery("PRAGMA busy_timeout=0;", new String[0]).close();
        sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        w0(sQLiteDatabase, this.f59519a);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        sQLiteDatabase.execSQL("DROP TABLE events");
        sQLiteDatabase.execSQL("DROP TABLE event_metadata");
        sQLiteDatabase.execSQL("DROP TABLE transport_contexts");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
        w0(sQLiteDatabase, i11);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        U(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        U(sQLiteDatabase);
        z0(sQLiteDatabase, i10, i11);
    }

    public final void w0(SQLiteDatabase sQLiteDatabase, int i10) {
        U(sQLiteDatabase);
        z0(sQLiteDatabase, 0, i10);
    }

    public final void z0(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        List list = f59518j;
        if (i11 <= list.size()) {
            while (i10 < i11) {
                ((a) f59518j.get(i10)).a(sQLiteDatabase);
                i10++;
            }
            return;
        }
        throw new IllegalArgumentException("Migration from " + i10 + " to " + i11 + " was requested, but cannot be performed. Only " + list.size() + " migrations are provided");
    }
}

package s7;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.SystemClock;
import com.google.android.gms.internal.measurement.o8;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class i extends SQLiteOpenHelper {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22799a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c0.x f22800b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i(j jVar, Context context) {
        this(context, "google_app_measurement.db");
        this.f22799a = 0;
        this.f22800b = jVar;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getWritableDatabase() {
        switch (this.f22799a) {
            case 0:
                j jVar = (j) this.f22800b;
                f1 f1Var = (f1) jVar.f3328a;
                f1 f1Var2 = (f1) jVar.f3328a;
                f1Var.getClass();
                androidx.recyclerview.widget.j jVar2 = jVar.f22823e;
                if (jVar2.f2438b != 0) {
                    ((q6.a) jVar2.f2439c).getClass();
                    if (SystemClock.elapsedRealtime() - jVar2.f2438b < 3600000) {
                        throw new SQLiteException("Database open failed");
                    }
                }
                try {
                    return super.getWritableDatabase();
                } catch (SQLiteException unused) {
                    ((q6.a) jVar2.f2439c).getClass();
                    jVar2.f2438b = SystemClock.elapsedRealtime();
                    n0 n0Var = f1Var2.f22745f;
                    f1.m(n0Var);
                    n0Var.f22903f.a("Opening the database failed, dropping and recreating it");
                    if (!f1Var2.f22740a.getDatabasePath("google_app_measurement.db").delete()) {
                        n0 n0Var2 = f1Var2.f22745f;
                        f1.m(n0Var2);
                        n0Var2.f22903f.b("google_app_measurement.db", "Failed to delete corrupted db file");
                    }
                    try {
                        SQLiteDatabase writableDatabase = super.getWritableDatabase();
                        jVar2.f2438b = 0L;
                        return writableDatabase;
                    } catch (SQLiteException e7) {
                        n0 n0Var3 = f1Var2.f22745f;
                        f1.m(n0Var3);
                        n0Var3.f22903f.b(e7, "Failed to open freshly created database");
                        throw e7;
                    }
                }
            default:
                h0 h0Var = (h0) this.f22800b;
                try {
                    return super.getWritableDatabase();
                } catch (SQLiteDatabaseLockedException e9) {
                    throw e9;
                } catch (SQLiteException unused2) {
                    f1 f1Var3 = (f1) h0Var.f3328a;
                    n0 n0Var4 = f1Var3.f22745f;
                    f1.m(n0Var4);
                    n0Var4.f22903f.a("Opening the local database failed, dropping and recreating it");
                    if (!f1Var3.f22740a.getDatabasePath("google_app_measurement_local.db").delete()) {
                        n0 n0Var5 = f1Var3.f22745f;
                        f1.m(n0Var5);
                        n0Var5.f22903f.b("google_app_measurement_local.db", "Failed to delete corrupted local db file");
                    }
                    try {
                        return super.getWritableDatabase();
                    } catch (SQLiteException e10) {
                        n0 n0Var6 = ((f1) h0Var.f3328a).f22745f;
                        f1.m(n0Var6);
                        n0Var6.f22903f.b(e10, "Failed to open local database. Events will bypass local storage");
                        return null;
                    }
                }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        switch (this.f22799a) {
            case 0:
                n0 n0Var = ((f1) ((j) this.f22800b).f3328a).f22745f;
                f1.m(n0Var);
                r1.f(n0Var, sQLiteDatabase);
                break;
            default:
                n0 n0Var2 = ((f1) ((h0) this.f22800b).f3328a).f22745f;
                f1.m(n0Var2);
                r1.f(n0Var2, sQLiteDatabase);
                break;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i5, int i10) {
        int i11 = this.f22799a;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        switch (this.f22799a) {
            case 0:
                f1 f1Var = (f1) ((j) this.f22800b).f3328a;
                n0 n0Var = f1Var.f22745f;
                f1.m(n0Var);
                r1.d(n0Var, sQLiteDatabase, "events", "CREATE TABLE IF NOT EXISTS events ( app_id TEXT NOT NULL, name TEXT NOT NULL, lifetime_count INTEGER NOT NULL, current_bundle_count INTEGER NOT NULL, last_fire_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,lifetime_count,current_bundle_count,last_fire_timestamp", j.f22812f);
                n0 n0Var2 = f1Var.f22745f;
                f1.m(n0Var2);
                r1.d(n0Var2, sQLiteDatabase, "events_snapshot", "CREATE TABLE IF NOT EXISTS events_snapshot ( app_id TEXT NOT NULL, name TEXT NOT NULL, lifetime_count INTEGER NOT NULL, current_bundle_count INTEGER NOT NULL, last_fire_timestamp INTEGER NOT NULL, last_bundled_timestamp INTEGER, last_bundled_day INTEGER, last_sampled_complex_event_id INTEGER, last_sampling_rate INTEGER, last_exempt_from_sampling INTEGER, current_session_count INTEGER, PRIMARY KEY (app_id, name)) ;", "app_id,name,lifetime_count,current_bundle_count,last_fire_timestamp,last_bundled_timestamp,last_bundled_day,last_sampled_complex_event_id,last_sampling_rate,last_exempt_from_sampling,current_session_count", null);
                f1.m(n0Var2);
                r1.d(n0Var2, sQLiteDatabase, "conditional_properties", "CREATE TABLE IF NOT EXISTS conditional_properties ( app_id TEXT NOT NULL, origin TEXT NOT NULL, name TEXT NOT NULL, value BLOB NOT NULL, creation_timestamp INTEGER NOT NULL, active INTEGER NOT NULL, trigger_event_name TEXT, trigger_timeout INTEGER NOT NULL, timed_out_event BLOB,triggered_event BLOB, triggered_timestamp INTEGER NOT NULL, time_to_live INTEGER NOT NULL, expired_event BLOB, PRIMARY KEY (app_id, name)) ;", "app_id,origin,name,value,active,trigger_event_name,trigger_timeout,creation_timestamp,timed_out_event,triggered_event,triggered_timestamp,time_to_live,expired_event", null);
                f1.m(n0Var2);
                r1.d(n0Var2, sQLiteDatabase, "user_attributes", "CREATE TABLE IF NOT EXISTS user_attributes ( app_id TEXT NOT NULL, name TEXT NOT NULL, set_timestamp INTEGER NOT NULL, value BLOB NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,set_timestamp,value", j.f22814h);
                f1.m(n0Var2);
                r1.d(n0Var2, sQLiteDatabase, "apps", "CREATE TABLE IF NOT EXISTS apps ( app_id TEXT NOT NULL, app_instance_id TEXT, gmp_app_id TEXT, resettable_device_id_hash TEXT, last_bundle_index INTEGER NOT NULL, last_bundle_end_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id)) ;", "app_id,app_instance_id,gmp_app_id,resettable_device_id_hash,last_bundle_index,last_bundle_end_timestamp", j.f22815i);
                f1.m(n0Var2);
                r1.d(n0Var2, sQLiteDatabase, "queue", "CREATE TABLE IF NOT EXISTS queue ( app_id TEXT NOT NULL, bundle_end_timestamp INTEGER NOT NULL, data BLOB NOT NULL);", "app_id,bundle_end_timestamp,data", j.f22816k);
                f1.m(n0Var2);
                r1.d(n0Var2, sQLiteDatabase, "raw_events_metadata", "CREATE TABLE IF NOT EXISTS raw_events_metadata ( app_id TEXT NOT NULL, metadata_fingerprint INTEGER NOT NULL, metadata BLOB NOT NULL, PRIMARY KEY (app_id, metadata_fingerprint));", "app_id,metadata_fingerprint,metadata", null);
                f1.m(n0Var2);
                r1.d(n0Var2, sQLiteDatabase, "raw_events", "CREATE TABLE IF NOT EXISTS raw_events ( app_id TEXT NOT NULL, name TEXT NOT NULL, timestamp INTEGER NOT NULL, metadata_fingerprint INTEGER NOT NULL, data BLOB NOT NULL);", "app_id,name,timestamp,metadata_fingerprint,data", j.j);
                f1.m(n0Var2);
                r1.d(n0Var2, sQLiteDatabase, "event_filters", "CREATE TABLE IF NOT EXISTS event_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, event_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, event_name, audience_id, filter_id));", "app_id,audience_id,filter_id,event_name,data", j.f22817l);
                f1.m(n0Var2);
                r1.d(n0Var2, sQLiteDatabase, "property_filters", "CREATE TABLE IF NOT EXISTS property_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, property_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, property_name, audience_id, filter_id));", "app_id,audience_id,filter_id,property_name,data", j.f22818m);
                f1.m(n0Var2);
                r1.d(n0Var2, sQLiteDatabase, "audience_filter_values", "CREATE TABLE IF NOT EXISTS audience_filter_values ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, current_results BLOB, PRIMARY KEY (app_id, audience_id));", "app_id,audience_id,current_results", null);
                f1.m(n0Var2);
                r1.d(n0Var2, sQLiteDatabase, "app2", "CREATE TABLE IF NOT EXISTS app2 ( app_id TEXT NOT NULL, first_open_count INTEGER NOT NULL, PRIMARY KEY (app_id));", "app_id,first_open_count", j.f22819n);
                f1.m(n0Var2);
                r1.d(n0Var2, sQLiteDatabase, "main_event_params", "CREATE TABLE IF NOT EXISTS main_event_params ( app_id TEXT NOT NULL, event_id TEXT NOT NULL, children_to_process INTEGER NOT NULL, main_event BLOB NOT NULL, PRIMARY KEY (app_id));", "app_id,event_id,children_to_process,main_event", null);
                f1.m(n0Var2);
                r1.d(n0Var2, sQLiteDatabase, "default_event_params", "CREATE TABLE IF NOT EXISTS default_event_params ( app_id TEXT NOT NULL, parameters BLOB NOT NULL, PRIMARY KEY (app_id));", "app_id,parameters", null);
                f1.m(n0Var2);
                r1.d(n0Var2, sQLiteDatabase, "consent_settings", "CREATE TABLE IF NOT EXISTS consent_settings ( app_id TEXT NOT NULL, consent_state TEXT NOT NULL, PRIMARY KEY (app_id));", "app_id,consent_state", j.f22820o);
                o8.a();
                f1.m(n0Var2);
                r1.d(n0Var2, sQLiteDatabase, "trigger_uris", "CREATE TABLE IF NOT EXISTS trigger_uris ( app_id TEXT NOT NULL, trigger_uri TEXT NOT NULL, timestamp_millis INTEGER NOT NULL, source INTEGER NOT NULL);", "app_id,trigger_uri,source,timestamp_millis", j.f22821p);
                f1.m(n0Var2);
                r1.d(n0Var2, sQLiteDatabase, "upload_queue", "CREATE TABLE IF NOT EXISTS upload_queue ( app_id TEXT NOT NULL, upload_uri TEXT NOT NULL, upload_headers TEXT NOT NULL, upload_type INTEGER NOT NULL, measurement_batch BLOB NOT NULL, retry_count INTEGER NOT NULL, creation_timestamp INTEGER NOT NULL );", "app_id,upload_uri,upload_headers,upload_type,measurement_batch,retry_count,creation_timestamp", j.f22813g);
                f1.m(n0Var2);
                r1.d(n0Var2, sQLiteDatabase, "no_data_mode_events", "CREATE TABLE IF NOT EXISTS no_data_mode_events ( app_id TEXT NOT NULL, name TEXT NOT NULL, data BLOB NOT NULL, timestamp_millis INTEGER NOT NULL);", "app_id,name,data,timestamp_millis", null);
                break;
            default:
                n0 n0Var3 = ((f1) ((h0) this.f22800b).f3328a).f22745f;
                f1.m(n0Var3);
                r1.d(n0Var3, sQLiteDatabase, "messages", "create table if not exists messages ( type INTEGER NOT NULL, entry BLOB NOT NULL)", "type,entry", h0.f22787e);
                break;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i5, int i10) {
        int i11 = this.f22799a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i(h0 h0Var, Context context) {
        this(context, "google_app_measurement_local.db");
        this.f22799a = 1;
        this.f22800b = h0Var;
    }

    public i(Context context, String str) {
        super(context, true == str.equals("") ? null : str, (SQLiteDatabase.CursorFactory) null, 1);
    }

    private final void c(SQLiteDatabase sQLiteDatabase, int i5, int i10) {
    }

    private final void k(SQLiteDatabase sQLiteDatabase, int i5, int i10) {
    }

    private final void n(SQLiteDatabase sQLiteDatabase, int i5, int i10) {
    }

    private final void r(SQLiteDatabase sQLiteDatabase, int i5, int i10) {
    }
}

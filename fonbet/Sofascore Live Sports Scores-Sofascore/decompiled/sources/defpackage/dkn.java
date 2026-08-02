package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.measurement.zzaif;
import com.google.android.gms.internal.measurement.zzcb;
import com.google.android.gms.measurement.internal.zzal;
import com.google.android.gms.measurement.internal.zzax;
import com.google.android.gms.measurement.internal.zzgl;
import com.google.android.gms.measurement.internal.zzgu;
import com.google.android.gms.measurement.internal.zzic;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class dkn extends zzcb {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ t01 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dkn(zzgl zzglVar, Context context) {
        super(context, "google_app_measurement_local.db");
        this.b = zzglVar;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getWritableDatabase() {
        int i = this.a;
        t01 t01Var = this.b;
        switch (i) {
            case 0:
                hkn hknVar = (hkn) t01Var;
                zzic zzicVar = (zzic) hknVar.b;
                zzal zzalVar = zzicVar.d;
                am0 am0Var = hknVar.f;
                if (am0Var.b != 0 && ((Clock) am0Var.c).elapsedRealtime() - am0Var.b < 3600000) {
                    throw new SQLiteException("Database open failed");
                }
                try {
                    return super.getWritableDatabase();
                } catch (SQLiteException unused) {
                    am0Var.b = ((Clock) am0Var.c).elapsedRealtime();
                    zzgu zzguVar = zzicVar.f;
                    zzic.m(zzguVar);
                    zzguVar.g.a("Opening the database failed, dropping and recreating it");
                    if (!zzicVar.a.getDatabasePath("google_app_measurement.db").delete()) {
                        zzgu zzguVar2 = zzicVar.f;
                        zzic.m(zzguVar2);
                        zzguVar2.g.b("google_app_measurement.db", "Failed to delete corrupted db file");
                    }
                    try {
                        SQLiteDatabase writableDatabase = super.getWritableDatabase();
                        am0Var.b = 0L;
                        return writableDatabase;
                    } catch (SQLiteException e) {
                        zzgu zzguVar3 = zzicVar.f;
                        zzic.m(zzguVar3);
                        zzguVar3.g.b(e, "Failed to open freshly created database");
                        throw e;
                    }
                }
            default:
                zzic zzicVar2 = (zzic) ((zzgl) t01Var).b;
                try {
                    return super.getWritableDatabase();
                } catch (SQLiteDatabaseLockedException e2) {
                    throw e2;
                } catch (SQLiteException unused2) {
                    zzgu zzguVar4 = zzicVar2.f;
                    zzic.m(zzguVar4);
                    zzguVar4.g.a("Opening the local database failed, dropping and recreating it");
                    if (!zzicVar2.a.getDatabasePath("google_app_measurement_local.db").delete()) {
                        zzgu zzguVar5 = zzicVar2.f;
                        zzic.m(zzguVar5);
                        zzguVar5.g.b("google_app_measurement_local.db", "Failed to delete corrupted local db file");
                    }
                    try {
                        return super.getWritableDatabase();
                    } catch (SQLiteException e3) {
                        zzgu zzguVar6 = zzicVar2.f;
                        zzic.m(zzguVar6);
                        zzguVar6.g.b(e3, "Failed to open local database. Events will bypass local storage");
                        return null;
                    }
                }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        int i = this.a;
        t01 t01Var = this.b;
        switch (i) {
            case 0:
                zzgu zzguVar = ((zzic) ((hkn) t01Var).b).f;
                zzic.m(zzguVar);
                zzax.b(zzguVar, sQLiteDatabase);
                break;
            default:
                zzgu zzguVar2 = ((zzic) ((zzgl) t01Var).b).f;
                zzic.m(zzguVar2);
                zzax.b(zzguVar2, sQLiteDatabase);
                break;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        int i3 = this.a;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        int i = this.a;
        t01 t01Var = this.b;
        switch (i) {
            case 0:
                zzic zzicVar = (zzic) ((hkn) t01Var).b;
                zzgu zzguVar = zzicVar.f;
                zzic.m(zzguVar);
                zzax.a(zzguVar, sQLiteDatabase, "events", "CREATE TABLE IF NOT EXISTS events ( app_id TEXT NOT NULL, name TEXT NOT NULL, lifetime_count INTEGER NOT NULL, current_bundle_count INTEGER NOT NULL, last_fire_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,lifetime_count,current_bundle_count,last_fire_timestamp", hkn.g);
                zzgu zzguVar2 = zzicVar.f;
                zzic.m(zzguVar2);
                zzax.a(zzguVar2, sQLiteDatabase, "events_snapshot", "CREATE TABLE IF NOT EXISTS events_snapshot ( app_id TEXT NOT NULL, name TEXT NOT NULL, lifetime_count INTEGER NOT NULL, current_bundle_count INTEGER NOT NULL, last_fire_timestamp INTEGER NOT NULL, last_bundled_timestamp INTEGER, last_bundled_day INTEGER, last_sampled_complex_event_id INTEGER, last_sampling_rate INTEGER, last_exempt_from_sampling INTEGER, current_session_count INTEGER, PRIMARY KEY (app_id, name)) ;", "app_id,name,lifetime_count,current_bundle_count,last_fire_timestamp,last_bundled_timestamp,last_bundled_day,last_sampled_complex_event_id,last_sampling_rate,last_exempt_from_sampling,current_session_count", null);
                zzic.m(zzguVar2);
                zzax.a(zzguVar2, sQLiteDatabase, "conditional_properties", "CREATE TABLE IF NOT EXISTS conditional_properties ( app_id TEXT NOT NULL, origin TEXT NOT NULL, name TEXT NOT NULL, value BLOB NOT NULL, creation_timestamp INTEGER NOT NULL, active INTEGER NOT NULL, trigger_event_name TEXT, trigger_timeout INTEGER NOT NULL, timed_out_event BLOB,triggered_event BLOB, triggered_timestamp INTEGER NOT NULL, time_to_live INTEGER NOT NULL, expired_event BLOB, PRIMARY KEY (app_id, name)) ;", "app_id,origin,name,value,active,trigger_event_name,trigger_timeout,creation_timestamp,timed_out_event,triggered_event,triggered_timestamp,time_to_live,expired_event", null);
                zzic.m(zzguVar2);
                zzax.a(zzguVar2, sQLiteDatabase, "user_attributes", "CREATE TABLE IF NOT EXISTS user_attributes ( app_id TEXT NOT NULL, name TEXT NOT NULL, set_timestamp INTEGER NOT NULL, value BLOB NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,set_timestamp,value", hkn.i);
                zzic.m(zzguVar2);
                zzax.a(zzguVar2, sQLiteDatabase, "apps", "CREATE TABLE IF NOT EXISTS apps ( app_id TEXT NOT NULL, app_instance_id TEXT, gmp_app_id TEXT, resettable_device_id_hash TEXT, last_bundle_index INTEGER NOT NULL, last_bundle_end_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id)) ;", "app_id,app_instance_id,gmp_app_id,resettable_device_id_hash,last_bundle_index,last_bundle_end_timestamp", hkn.j);
                zzic.m(zzguVar2);
                zzax.a(zzguVar2, sQLiteDatabase, "queue", "CREATE TABLE IF NOT EXISTS queue ( app_id TEXT NOT NULL, bundle_end_timestamp INTEGER NOT NULL, data BLOB NOT NULL);", "app_id,bundle_end_timestamp,data", hkn.l);
                zzic.m(zzguVar2);
                zzax.a(zzguVar2, sQLiteDatabase, "raw_events_metadata", "CREATE TABLE IF NOT EXISTS raw_events_metadata ( app_id TEXT NOT NULL, metadata_fingerprint INTEGER NOT NULL, metadata BLOB NOT NULL, PRIMARY KEY (app_id, metadata_fingerprint));", "app_id,metadata_fingerprint,metadata", null);
                zzic.m(zzguVar2);
                zzax.a(zzguVar2, sQLiteDatabase, "raw_events", "CREATE TABLE IF NOT EXISTS raw_events ( app_id TEXT NOT NULL, name TEXT NOT NULL, timestamp INTEGER NOT NULL, metadata_fingerprint INTEGER NOT NULL, data BLOB NOT NULL);", "app_id,name,timestamp,metadata_fingerprint,data", hkn.k);
                zzic.m(zzguVar2);
                zzax.a(zzguVar2, sQLiteDatabase, "event_filters", "CREATE TABLE IF NOT EXISTS event_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, event_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, event_name, audience_id, filter_id));", "app_id,audience_id,filter_id,event_name,data", hkn.m);
                zzic.m(zzguVar2);
                zzax.a(zzguVar2, sQLiteDatabase, "property_filters", "CREATE TABLE IF NOT EXISTS property_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, property_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, property_name, audience_id, filter_id));", "app_id,audience_id,filter_id,property_name,data", hkn.n);
                zzic.m(zzguVar2);
                zzax.a(zzguVar2, sQLiteDatabase, "audience_filter_values", "CREATE TABLE IF NOT EXISTS audience_filter_values ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, current_results BLOB, PRIMARY KEY (app_id, audience_id));", "app_id,audience_id,current_results", null);
                zzic.m(zzguVar2);
                zzax.a(zzguVar2, sQLiteDatabase, "app2", "CREATE TABLE IF NOT EXISTS app2 ( app_id TEXT NOT NULL, first_open_count INTEGER NOT NULL, PRIMARY KEY (app_id));", "app_id,first_open_count", hkn.o);
                zzic.m(zzguVar2);
                zzax.a(zzguVar2, sQLiteDatabase, "main_event_params", "CREATE TABLE IF NOT EXISTS main_event_params ( app_id TEXT NOT NULL, event_id TEXT NOT NULL, children_to_process INTEGER NOT NULL, main_event BLOB NOT NULL, PRIMARY KEY (app_id));", "app_id,event_id,children_to_process,main_event", null);
                zzic.m(zzguVar2);
                zzax.a(zzguVar2, sQLiteDatabase, "default_event_params", "CREATE TABLE IF NOT EXISTS default_event_params ( app_id TEXT NOT NULL, parameters BLOB NOT NULL, PRIMARY KEY (app_id));", "app_id,parameters", null);
                zzic.m(zzguVar2);
                zzax.a(zzguVar2, sQLiteDatabase, "consent_settings", "CREATE TABLE IF NOT EXISTS consent_settings ( app_id TEXT NOT NULL, consent_state TEXT NOT NULL, PRIMARY KEY (app_id));", "app_id,consent_state", hkn.p);
                zzaif.a();
                zzic.m(zzguVar2);
                zzax.a(zzguVar2, sQLiteDatabase, "trigger_uris", "CREATE TABLE IF NOT EXISTS trigger_uris ( app_id TEXT NOT NULL, trigger_uri TEXT NOT NULL, timestamp_millis INTEGER NOT NULL, source INTEGER NOT NULL);", "app_id,trigger_uri,source,timestamp_millis", hkn.q);
                zzic.m(zzguVar2);
                zzax.a(zzguVar2, sQLiteDatabase, "upload_queue", "CREATE TABLE IF NOT EXISTS upload_queue ( app_id TEXT NOT NULL, upload_uri TEXT NOT NULL, upload_headers TEXT NOT NULL, upload_type INTEGER NOT NULL, measurement_batch BLOB NOT NULL, retry_count INTEGER NOT NULL, creation_timestamp INTEGER NOT NULL );", "app_id,upload_uri,upload_headers,upload_type,measurement_batch,retry_count,creation_timestamp", hkn.h);
                zzic.m(zzguVar2);
                zzax.a(zzguVar2, sQLiteDatabase, "diagnostic_signals", "CREATE TABLE IF NOT EXISTS diagnostic_signals ( app_id TEXT NOT NULL, signal_name TEXT NOT NULL, metadata TEXT NOT NULL, count INTEGER NOT NULL, last_increment_timestamp INTEGER NOT NULL);", "app_id,signal_name,metadata,count,last_increment_timestamp", null);
                zzic.m(zzguVar2);
                zzax.a(zzguVar2, sQLiteDatabase, "no_data_mode_events", "CREATE TABLE IF NOT EXISTS no_data_mode_events ( app_id TEXT NOT NULL, name TEXT NOT NULL, data BLOB NOT NULL, timestamp_millis INTEGER NOT NULL);", "app_id,name,data,timestamp_millis", null);
                break;
            default:
                zzgu zzguVar3 = ((zzic) ((zzgl) t01Var).b).f;
                zzic.m(zzguVar3);
                zzax.a(zzguVar3, sQLiteDatabase, "messages", "create table if not exists messages ( type INTEGER NOT NULL, entry BLOB NOT NULL)", "type,entry", zzgl.f);
                break;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        int i3 = this.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dkn(hkn hknVar, Context context) {
        super(context, "google_app_measurement.db");
        this.b = hknVar;
    }

    private final void e(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    private final void f(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    private final void g(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    private final void h(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}

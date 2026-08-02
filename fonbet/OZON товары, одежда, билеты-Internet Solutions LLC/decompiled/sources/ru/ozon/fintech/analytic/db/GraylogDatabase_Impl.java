package ru.ozon.fintech.analytic.db;

import B90.C2616s;
import H3.c;
import J4.h;
import J4.p;
import J4.s;
import J4.v;
import L4.e;
import O4.b;
import O4.c;
import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.ImagesContract;
import d30.C6072c;
import d30.InterfaceC6070a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class GraylogDatabase_Impl extends GraylogDatabase {

    /* renamed from: a, reason: collision with root package name */
    private volatile C6072c f94911a;

    final class a extends v.a {
        a() {
            super(13);
        }

        @Override // J4.v.a
        public final void createAllTables(@NonNull b bVar) {
            Sh.b.d(bVar, "CREATE TABLE IF NOT EXISTS `graylog_event` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `timestamp` TEXT NOT NULL, `message` TEXT NOT NULL, `serviceName` TEXT, `userId` TEXT NOT NULL, `uuid` TEXT NOT NULL, `appVersion` TEXT NOT NULL, `sessionId` TEXT, `tags` TEXT, `data` TEXT, `delay` INTEGER, `tabId` TEXT, `webViewVersion` TEXT, `url` TEXT, `assetUrl` TEXT, `errorDescription` TEXT, `errorCode` INTEGER, `status` TEXT, `firstLaunch` INTEGER, `model` TEXT, `manufacturer` TEXT, `permPostNotification` INTEGER, `permCamera` INTEGER, `permAccessLocation` INTEGER, `permReadContacts` INTEGER, `permUseBiometric` INTEGER, `pushType` TEXT, `pins` TEXT, `sign` TEXT, `pubKey` TEXT, `result` INTEGER, `pinsType` TEXT, `pinsHashes` TEXT, `certsChain` TEXT, `storeName` TEXT, `needUpdate` INTEGER, `rustoreStatus` TEXT, `gmsStatus` TEXT, `ozonSdkStatus` TEXT, `platformVersion` TEXT, `barcodeRecognitionType` INTEGER, `barcodeRecognitionSource` TEXT, `barcodeRecognitionAvailableTypes` INTEGER, `ozonIdSessionId` TEXT, `vpn` INTEGER, `networkType` TEXT, `clusterName` TEXT, `regionName` TEXT, `cityName` TEXT)", "CREATE TABLE IF NOT EXISTS `user_id` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `userId` TEXT NOT NULL)", "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)", "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '33b16085c737f73d55bdda557d334208')");
        }

        @Override // J4.v.a
        public final void dropAllTables(@NonNull b db2) {
            db2.O0("DROP TABLE IF EXISTS `graylog_event`");
            db2.O0("DROP TABLE IF EXISTS `user_id`");
            List list = ((s) GraylogDatabase_Impl.this).mCallbacks;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((s.b) it.next()).getClass();
                    Intrinsics.checkNotNullParameter(db2, "db");
                }
            }
        }

        @Override // J4.v.a
        public final void onCreate(@NonNull b bVar) {
            List list = ((s) GraylogDatabase_Impl.this).mCallbacks;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((s.b) it.next()).a(bVar);
                }
            }
        }

        @Override // J4.v.a
        public final void onOpen(@NonNull b bVar) {
            GraylogDatabase_Impl graylogDatabase_Impl = GraylogDatabase_Impl.this;
            ((s) graylogDatabase_Impl).mDatabase = bVar;
            graylogDatabase_Impl.internalInitInvalidationTracker(bVar);
            List list = ((s) graylogDatabase_Impl).mCallbacks;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((s.b) it.next()).b(bVar);
                }
            }
        }

        @Override // J4.v.a
        public final void onPostMigrate(@NonNull b bVar) {
        }

        @Override // J4.v.a
        public final void onPreMigrate(@NonNull b bVar) {
            L4.b.a(bVar);
        }

        @Override // J4.v.a
        @NonNull
        public final v.b onValidateSchema(@NonNull b bVar) {
            HashMap hashMap = new HashMap(49);
            hashMap.put("id", new e.a("id", "INTEGER", 1, 1, true, null));
            hashMap.put("timestamp", new e.a("timestamp", "TEXT", 0, 1, true, null));
            hashMap.put("message", new e.a("message", "TEXT", 0, 1, true, null));
            hashMap.put("serviceName", new e.a("serviceName", "TEXT", 0, 1, false, null));
            hashMap.put("userId", new e.a("userId", "TEXT", 0, 1, true, null));
            hashMap.put("uuid", new e.a("uuid", "TEXT", 0, 1, true, null));
            hashMap.put("appVersion", new e.a("appVersion", "TEXT", 0, 1, true, null));
            hashMap.put("sessionId", new e.a("sessionId", "TEXT", 0, 1, false, null));
            hashMap.put("tags", new e.a("tags", "TEXT", 0, 1, false, null));
            hashMap.put("data", new e.a("data", "TEXT", 0, 1, false, null));
            hashMap.put("delay", new e.a("delay", "INTEGER", 0, 1, false, null));
            hashMap.put("tabId", new e.a("tabId", "TEXT", 0, 1, false, null));
            hashMap.put("webViewVersion", new e.a("webViewVersion", "TEXT", 0, 1, false, null));
            hashMap.put(ImagesContract.URL, new e.a(ImagesContract.URL, "TEXT", 0, 1, false, null));
            hashMap.put("assetUrl", new e.a("assetUrl", "TEXT", 0, 1, false, null));
            hashMap.put("errorDescription", new e.a("errorDescription", "TEXT", 0, 1, false, null));
            hashMap.put("errorCode", new e.a("errorCode", "INTEGER", 0, 1, false, null));
            hashMap.put("status", new e.a("status", "TEXT", 0, 1, false, null));
            hashMap.put("firstLaunch", new e.a("firstLaunch", "INTEGER", 0, 1, false, null));
            hashMap.put("model", new e.a("model", "TEXT", 0, 1, false, null));
            hashMap.put("manufacturer", new e.a("manufacturer", "TEXT", 0, 1, false, null));
            hashMap.put("permPostNotification", new e.a("permPostNotification", "INTEGER", 0, 1, false, null));
            hashMap.put("permCamera", new e.a("permCamera", "INTEGER", 0, 1, false, null));
            hashMap.put("permAccessLocation", new e.a("permAccessLocation", "INTEGER", 0, 1, false, null));
            hashMap.put("permReadContacts", new e.a("permReadContacts", "INTEGER", 0, 1, false, null));
            hashMap.put("permUseBiometric", new e.a("permUseBiometric", "INTEGER", 0, 1, false, null));
            hashMap.put("pushType", new e.a("pushType", "TEXT", 0, 1, false, null));
            hashMap.put("pins", new e.a("pins", "TEXT", 0, 1, false, null));
            hashMap.put("sign", new e.a("sign", "TEXT", 0, 1, false, null));
            hashMap.put("pubKey", new e.a("pubKey", "TEXT", 0, 1, false, null));
            hashMap.put("result", new e.a("result", "INTEGER", 0, 1, false, null));
            hashMap.put("pinsType", new e.a("pinsType", "TEXT", 0, 1, false, null));
            hashMap.put("pinsHashes", new e.a("pinsHashes", "TEXT", 0, 1, false, null));
            hashMap.put("certsChain", new e.a("certsChain", "TEXT", 0, 1, false, null));
            hashMap.put("storeName", new e.a("storeName", "TEXT", 0, 1, false, null));
            hashMap.put("needUpdate", new e.a("needUpdate", "INTEGER", 0, 1, false, null));
            hashMap.put("rustoreStatus", new e.a("rustoreStatus", "TEXT", 0, 1, false, null));
            hashMap.put("gmsStatus", new e.a("gmsStatus", "TEXT", 0, 1, false, null));
            hashMap.put("ozonSdkStatus", new e.a("ozonSdkStatus", "TEXT", 0, 1, false, null));
            hashMap.put("platformVersion", new e.a("platformVersion", "TEXT", 0, 1, false, null));
            hashMap.put("barcodeRecognitionType", new e.a("barcodeRecognitionType", "INTEGER", 0, 1, false, null));
            hashMap.put("barcodeRecognitionSource", new e.a("barcodeRecognitionSource", "TEXT", 0, 1, false, null));
            hashMap.put("barcodeRecognitionAvailableTypes", new e.a("barcodeRecognitionAvailableTypes", "INTEGER", 0, 1, false, null));
            hashMap.put("ozonIdSessionId", new e.a("ozonIdSessionId", "TEXT", 0, 1, false, null));
            hashMap.put("vpn", new e.a("vpn", "INTEGER", 0, 1, false, null));
            hashMap.put("networkType", new e.a("networkType", "TEXT", 0, 1, false, null));
            hashMap.put("clusterName", new e.a("clusterName", "TEXT", 0, 1, false, null));
            hashMap.put("regionName", new e.a("regionName", "TEXT", 0, 1, false, null));
            e eVar = new e("graylog_event", hashMap, c.b(hashMap, "cityName", new e.a("cityName", "TEXT", 0, 1, false, null), 0), new HashSet(0));
            e a11 = e.a(bVar, "graylog_event");
            if (!eVar.equals(a11)) {
                return new v.b(false, C2616s.c("graylog_event(ru.ozon.fintech.analytic.db.entity.GraylogEventEntity).\n Expected:\n", eVar, "\n Found:\n", a11));
            }
            HashMap hashMap2 = new HashMap(2);
            hashMap2.put("id", new e.a("id", "INTEGER", 1, 1, true, null));
            e eVar2 = new e("user_id", hashMap2, c.b(hashMap2, "userId", new e.a("userId", "TEXT", 0, 1, true, null), 0), new HashSet(0));
            e a12 = e.a(bVar, "user_id");
            return !eVar2.equals(a12) ? new v.b(false, C2616s.c("user_id(ru.ozon.fintech.analytic.db.entity.UserIdEntity).\n Expected:\n", eVar2, "\n Found:\n", a12)) : new v.b(true, null);
        }
    }

    @Override // ru.ozon.fintech.analytic.db.GraylogDatabase
    public final InterfaceC6070a a() {
        C6072c c6072c;
        if (this.f94911a != null) {
            return this.f94911a;
        }
        synchronized (this) {
            try {
                if (this.f94911a == null) {
                    this.f94911a = new C6072c(this);
                }
                c6072c = this.f94911a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c6072c;
    }

    @Override // J4.s
    @NonNull
    protected final p createInvalidationTracker() {
        return new p(this, new HashMap(0), new HashMap(0), "graylog_event", "user_id");
    }

    @Override // J4.s
    @NonNull
    protected final O4.c createOpenHelper(@NonNull h hVar) {
        v vVar = new v(hVar, new a(), "33b16085c737f73d55bdda557d334208", "7e56a9e05824c7718fa313e2dc4a81ca");
        Context context = hVar.f13876a;
        Intrinsics.checkNotNullParameter(context, "context");
        c.b.a aVar = new c.b.a(context);
        aVar.d(hVar.f13877b);
        aVar.c(vVar);
        return hVar.f13878c.a(aVar.b());
    }

    @Override // J4.s
    @NonNull
    public final List<K4.a> getAutoMigrations(@NonNull Map<Class<Object>, Object> map) {
        return new ArrayList();
    }

    @Override // J4.s
    @NonNull
    public final Set<Class<Object>> getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    @Override // J4.s
    @NonNull
    protected final Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        HashMap hashMap = new HashMap();
        hashMap.put(InterfaceC6070a.class, Collections.EMPTY_LIST);
        return hashMap;
    }
}

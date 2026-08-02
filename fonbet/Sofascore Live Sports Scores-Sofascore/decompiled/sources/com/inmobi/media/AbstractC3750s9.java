package com.inmobi.media;

import android.content.Context;
import defpackage.fz8;
import defpackage.joa;
import defpackage.xqm;
import defpackage.ypa;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.s9, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3750s9 {
    public static final joa a = ypa.b(new xqm(4));
    public static final joa b = ypa.b(new xqm(5));

    public static final C3466h9 a() {
        Context context = AbstractC3424fj.a;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C3606mk("ad_quality_db", "(id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, image_location TEXT NOT NULL, sdk_model_result TEXT, beacon_url TEXT NOT NULL, extras TEXT)"));
        arrayList.add(new C3606mk("click", "(id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, pending_attempts INTEGER NOT NULL, url TEXT NOT NULL, ping_in_webview TEXT NOT NULL, follow_redirect TEXT NOT NULL, ts TEXT NOT NULL, track_extras TEXT, created_ts TEXT NOT NULL )"));
        arrayList.add(new C3606mk("config_db", "(config_value TEXT NOT NULL,config_type TEXT NOT NULL,update_ts INTEGER DEFAULT 0,UNIQUE(config_type))"));
        arrayList.add(new C3606mk("c_data", "(id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, e_data TEXT NOT NULL, timestamp INTEGER NOT NULL )"));
        arrayList.add(new C3606mk("crash", "(id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, componentType TEXT NOT NULL, eventId TEXT NOT NULL, eventType TEXT NOT NULL, payload TEXT NOT NULL, ts TEXT NOT NULL)"));
        arrayList.add(new C3606mk("logs_v2", "(id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, filename TEXT NOT NULL, saveTimestamp INTEGER NOT NULL, retryCount INTEGER NOT NULL, hasLoggerFinished INTEGER NOT NULL, checkpoints INTEGER NOT NULL,lastRetryTimestamp INTEGER NOT NULL )"));
        arrayList.add(new C3606mk("pings", "(id TEXT PRIMARY KEY,url TEXT NOT NULL,headers TEXT,allow_redirects TEXT NOT NULL,priority TEXT NOT NULL,ack_required TEXT NOT NULL,time_created INTEGER NOT NULL,owner TEXT NOT NULL,retry_count INTEGER DEFAULT 0,retryAfter INTEGER DEFAULT 0,telemetry_metadata TEXT)"));
        arrayList.add(new C3606mk("telemetry", "(id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, eventType TEXT NOT NULL, payload TEXT NOT NULL, eventSource TEXT NOT NULL, ts TEXT NOT NULL)"));
        Object value = b.getValue();
        value.getClass();
        ExecutorService executorService = (ExecutorService) value;
        executorService.getClass();
        C3746s5 c3746s5 = new C3746s5(context, arrayList, Ma.a(), executorService);
        C3466h9 c3466h9 = new C3466h9(c3746s5);
        I9 i9 = new I9(c3746s5);
        C3724r9 c3724r9 = new C3724r9(i9, c3746s5);
        c3466h9.a = c3724r9;
        try {
            c3724r9.c = i9.getWritableDatabase();
        } catch (Exception unused) {
        }
        try {
            c3724r9.d = c3724r9.a.getReadableDatabase();
        } catch (Exception unused2) {
        }
        ExecutorService executorService2 = c3724r9.b.d;
        if (executorService2 != null) {
            c3724r9.e = fz8.P(executorService2);
        }
        return c3466h9;
    }

    public static final C3724r9 b() {
        C3724r9 c3724r9 = ((C3466h9) a.getValue()).a;
        if (c3724r9 != null) {
            return c3724r9;
        }
        Intrinsics.i("_inmobiDatabaseHelper");
        throw null;
    }

    public static final ExecutorService c() {
        return Executors.newSingleThreadExecutor(new M9("db.transactionExecutor", false));
    }
}

package com.google.android.gms.internal.appset;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.appset.AppSetIdClient;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import defpackage.dno;
import defpackage.qto;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzl implements AppSetIdClient {
    public static zzl d;
    public final Context a;
    public final ScheduledExecutorService b;
    public final ExecutorService c;

    public zzl(Context context) {
        ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        this.b = newSingleThreadScheduledExecutor;
        this.c = Executors.newSingleThreadExecutor();
        this.a = context;
        newSingleThreadScheduledExecutor.scheduleAtFixedRate(new dno(this, 2), 0L, 86400L, TimeUnit.SECONDS);
    }

    public static final SharedPreferences a(Context context) {
        return context.getSharedPreferences("app_set_id_storage", 0);
    }

    public static final void b(Context context) {
        SharedPreferences a = a(context);
        DefaultClock.a.getClass();
        if (a.edit().putLong("app_set_id_last_used_time", System.currentTimeMillis()).commit()) {
            return;
        }
        String valueOf = String.valueOf(context.getPackageName());
        if (valueOf.length() != 0) {
            "Failed to store app set ID last used time for App ".concat(valueOf);
        }
        throw new qto("Failed to store the app set ID last used time.");
    }

    @Override // com.google.android.gms.appset.AppSetIdClient
    public final Task getAppSetIdInfo() {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.c.execute(new Runnable() { // from class: com.google.android.gms.internal.appset.zzh
            @Override // java.lang.Runnable
            public final void run() {
                Context context = zzl.this.a;
                String string = zzl.a(context).getString("app_set_id", null);
                long j = zzl.a(context).getLong("app_set_id_last_used_time", -1L);
                long j2 = j != -1 ? j + 33696000000L : -1L;
                TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
                try {
                    if (string != null) {
                        DefaultClock.a.getClass();
                        if (System.currentTimeMillis() <= j2) {
                            try {
                                zzl.b(context);
                                taskCompletionSource2.setResult(new AppSetIdInfo(string, 1));
                                return;
                            } catch (qto e) {
                                taskCompletionSource2.setException(e);
                                return;
                            }
                        }
                    }
                    if (!context.getSharedPreferences("app_set_id_storage", 0).edit().putString("app_set_id", string).commit()) {
                        String valueOf = String.valueOf(context.getPackageName());
                        if (valueOf.length() != 0) {
                            "Failed to store app set ID generated for App ".concat(valueOf);
                        }
                        throw new qto("Failed to store the app set ID.");
                    }
                    zzl.b(context);
                    SharedPreferences sharedPreferences = context.getSharedPreferences("app_set_id_storage", 0);
                    DefaultClock.a.getClass();
                    if (!sharedPreferences.edit().putLong("app_set_id_creation_time", System.currentTimeMillis()).commit()) {
                        String valueOf2 = String.valueOf(context.getPackageName());
                        if (valueOf2.length() != 0) {
                            "Failed to store app set ID creation time for App ".concat(valueOf2);
                        }
                        throw new qto("Failed to store the app set ID creation time.");
                    }
                    taskCompletionSource2.setResult(new AppSetIdInfo(string, 1));
                    return;
                } catch (qto e2) {
                    taskCompletionSource2.setException(e2);
                    return;
                }
                string = UUID.randomUUID().toString();
            }
        });
        return taskCompletionSource.getTask();
    }
}

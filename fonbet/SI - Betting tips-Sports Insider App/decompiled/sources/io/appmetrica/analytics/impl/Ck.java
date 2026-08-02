package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import io.appmetrica.analytics.internal.AppMetricaService;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceWakeLock;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class Ck implements ServiceWakeLock {

    /* renamed from: a, reason: collision with root package name */
    public final Context f12116a;

    /* renamed from: b, reason: collision with root package name */
    public final Bk f12117b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f12118c = new HashMap();

    public Ck(@NotNull Context context, @NotNull Bk bk) {
        this.f12116a = context;
        this.f12117b = bk;
    }

    @NotNull
    public final String a(@NotNull String str) {
        return androidx.appcompat.widget.c1.m("io.appmetrica.analytics.ACTION_SERVICE_WAKELOCK.", str);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceWakeLock
    public final synchronized boolean acquireWakeLock(@NotNull String str) {
        try {
            if (this.f12118c.get(str) == null) {
                HashMap hashMap = this.f12118c;
                Bk bk = this.f12117b;
                Context context = this.f12116a;
                String a7 = a(str);
                bk.f12069a.getClass();
                Intent intent = new Intent(context, (Class<?>) AppMetricaService.class);
                intent.setAction(a7);
                Ak ak = new Ak();
                try {
                    context.bindService(intent, ak, 1);
                } catch (Throwable unused) {
                    ak = null;
                }
                hashMap.put(str, ak);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f12118c.get(str) != null;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceWakeLock
    public final synchronized void releaseWakeLock(@NotNull String str) {
        ServiceConnection serviceConnection = (ServiceConnection) this.f12118c.get(str);
        if (serviceConnection != null) {
            Bk bk = this.f12117b;
            a(str);
            Context context = this.f12116a;
            bk.getClass();
            try {
                context.unbindService(serviceConnection);
            } catch (Throwable unused) {
            }
        }
    }
}

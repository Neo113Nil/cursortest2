package com.sofascore.results.service.game;

import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import defpackage.f5p;
import defpackage.kc4;
import defpackage.qu1;
import defpackage.r6h;
import defpackage.rq3;
import defpackage.s1d;
import defpackage.s96;
import defpackage.vv8;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sofascore/results/service/game/MuteEventService;", "Landroid/app/Service;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MuteEventService extends Service implements vv8 {
    public volatile r6h a;
    public final Object b = new Object();
    public boolean c = false;
    public s96 d;

    @Override // defpackage.uv8
    public final Object f() {
        if (this.a == null) {
            synchronized (this.b) {
                try {
                    if (this.a == null) {
                        this.a = new r6h(this);
                    }
                } finally {
                }
            }
        }
        return this.a.f();
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        if (!this.c) {
            this.c = true;
            this.d = (s96) ((kc4) ((s1d) f())).a.U.get();
        }
        super.onCreate();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        if (intent != null) {
            int intExtra = intent.getIntExtra("GAME_ID", 0);
            f5p.E(this, new qu1(this, intExtra, (rq3) null, 20));
            NotificationManager notificationManager = (NotificationManager) getSystemService(NotificationManager.class);
            if (notificationManager != null) {
                notificationManager.cancel(intExtra);
            }
        }
        return super.onStartCommand(intent, i, i2);
    }
}

package com.vk.core.service;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class BoundService extends Service {
    public HashSet b;
    public boolean c;

    /* loaded from: classes17.dex */
    public static class a extends Binder {
        public final BoundService a;

        public a(BoundService boundService) {
            this.a = boundService;
        }
    }

    /* loaded from: classes17.dex */
    public interface b {
        void l();
    }

    public final boolean g() {
        return this.b == null;
    }

    public final void h() {
        if (g()) {
            return;
        }
        HashSet hashSet = this.b;
        this.b = null;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((b) it.next()).l();
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        this.c = true;
        i();
        return new a(this);
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.b = new HashSet();
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.b = null;
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onRebind(Intent intent) {
        super.onRebind(intent);
        this.c = true;
        i();
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        this.c = false;
        j();
        return true;
    }

    public void i() {
    }

    public void j() {
    }
}

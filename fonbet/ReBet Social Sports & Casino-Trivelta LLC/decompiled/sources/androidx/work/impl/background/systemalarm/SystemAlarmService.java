package androidx.work.impl.background.systemalarm;

import Q2.AbstractC1508t;
import Y2.F;
import android.content.Intent;
import androidx.lifecycle.AbstractServiceC2198x;
import androidx.work.impl.background.systemalarm.d;

/* loaded from: classes.dex */
public class SystemAlarmService extends AbstractServiceC2198x implements d.c {

    /* renamed from: d, reason: collision with root package name */
    public static final String f23793d = AbstractC1508t.i("SystemAlarmService");

    /* renamed from: b, reason: collision with root package name */
    public d f23794b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f23795c;

    @Override // androidx.work.impl.background.systemalarm.d.c
    public void b() {
        this.f23795c = true;
        AbstractC1508t.e().a(f23793d, "All commands completed in dispatcher");
        F.a();
        stopSelf();
    }

    public final void f() {
        d dVar = new d(this);
        this.f23794b = dVar;
        dVar.m(this);
    }

    @Override // androidx.lifecycle.AbstractServiceC2198x, android.app.Service
    public void onCreate() {
        super.onCreate();
        f();
        this.f23795c = false;
    }

    @Override // androidx.lifecycle.AbstractServiceC2198x, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.f23795c = true;
        this.f23794b.k();
    }

    @Override // androidx.lifecycle.AbstractServiceC2198x, android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        super.onStartCommand(intent, i10, i11);
        if (this.f23795c) {
            AbstractC1508t.e().f(f23793d, "Re-initializing SystemAlarmDispatcher after a request to shut-down.");
            this.f23794b.k();
            f();
            this.f23795c = false;
        }
        if (intent == null) {
            return 3;
        }
        this.f23794b.a(intent, i11);
        return 3;
    }
}

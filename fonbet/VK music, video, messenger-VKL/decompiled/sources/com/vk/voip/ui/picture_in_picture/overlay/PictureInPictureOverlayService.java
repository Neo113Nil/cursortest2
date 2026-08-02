package com.vk.voip.ui.picture_in_picture.overlay;

import android.app.Activity;
import android.app.Application;
import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.provider.Settings;
import com.vk.voip.ui.c;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.disposables.b;
import io.reactivex.rxjava3.internal.operators.observable.i0;
import io.reactivex.rxjava3.internal.operators.observable.y;
import java.util.concurrent.TimeUnit;
import xsna.asu0;
import xsna.bka0;
import xsna.cp50;
import xsna.dhr0;
import xsna.ebx;
import xsna.epx;
import xsna.fl30;
import xsna.gvs;
import xsna.gvw0;
import xsna.hi70;
import xsna.k170;
import xsna.l7s;
import xsna.oe40;
import xsna.oqu;
import xsna.qi00;
import xsna.tp1;

/* compiled from: PictureInPictureOverlayService.kt */
/* loaded from: classes7.dex */
public final class PictureInPictureOverlayService extends Service {
    public static final /* synthetic */ int g = 0;
    public bka0 b;
    public gvw0 c;
    public a d;
    public final b e = new b();
    public String f;

    public static final void a(PictureInPictureOverlayService pictureInPictureOverlayService, Activity activity) {
        if (epx.f(activity.getClass().getCanonicalName(), pictureInPictureOverlayService.f)) {
            pictureInPictureOverlayService.stopSelf();
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        dhr0.a.getClass();
        this.b = new bka0(new l7s(this, dhr0.u().c));
        this.c = new gvw0(this, null);
        this.d = new a();
        Application application = getApplication();
        a aVar = this.d;
        application.registerActivityLifecycleCallbacks(aVar != null ? aVar : null);
        c.b.getClass();
        i0 i0Var = new i0(c.H0(true), new tp1(new gvs(21), 22));
        asu0 asu0Var = asu0.a;
        io.reactivex.rxjava3.disposables.c subscribe = i0Var.a0(asu0Var.d()).subscribe(new fl30(new ebx(this, 17), 11));
        b bVar = this.e;
        bVar.b(subscribe);
        bVar.b(new y(new i0(q.s(q.T(0L), q.R(1L, TimeUnit.SECONDS)).U(new hi70(new qi00(this, 21), 2)), new oe40(new oqu(22), 3)), io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a).a0(asu0Var.d()).subscribe(new cp50(new k170(this, 8), 6)));
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.e.dispose();
        Application application = getApplication();
        a aVar = this.d;
        if (aVar == null) {
            aVar = null;
        }
        application.unregisterActivityLifecycleCallbacks(aVar);
        bka0 bka0Var = this.b;
        (bka0Var != null ? bka0Var : null).a();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        this.f = intent != null ? intent.getStringExtra("auto_stop_when_activity_launched") : null;
        gvw0 gvw0Var = this.c;
        if (gvw0Var == null) {
            gvw0Var = null;
        }
        if (!Settings.canDrawOverlays(gvw0Var.a)) {
            return 2;
        }
        bka0 bka0Var = this.b;
        bka0 bka0Var2 = bka0Var != null ? bka0Var : null;
        bka0Var2.getClass();
        try {
            bka0Var2.b();
            return 2;
        } catch (Throwable th) {
            com.vk.metrics.eventtracking.b.a.q(th);
            return 2;
        }
    }

    /* compiled from: PictureInPictureOverlayService.kt */
    public final class a implements Application.ActivityLifecycleCallbacks {
        public a() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity activity, Bundle bundle) {
            PictureInPictureOverlayService.a(PictureInPictureOverlayService.this, activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) {
            PictureInPictureOverlayService.a(PictureInPictureOverlayService.this, activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(Activity activity) {
            PictureInPictureOverlayService.a(PictureInPictureOverlayService.this, activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }
    }
}

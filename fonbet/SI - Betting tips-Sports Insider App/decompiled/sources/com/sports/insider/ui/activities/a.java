package com.sports.insider.ui.activities;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import androidx.appcompat.app.m;
import androidx.appcompat.app.n;
import androidx.appcompat.app.o;
import androidx.fragment.app.e1;
import androidx.lifecycle.d1;
import androidx.lifecycle.z;
import bd.b;
import ci.c;
import com.google.android.gms.internal.measurement.y3;
import com.sports.insider.MyApp;
import d2.i;
import eg.c0;
import eg.m0;
import eg.t1;
import g.f;
import gc.d;
import gf.k;
import gf.t;
import gf.u;
import hg.t0;
import java.lang.ref.WeakReference;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.Intrinsics;
import l0.g;
import pd.e;
import pd.r;
import pd.s;
import pd.y;
import rc.x;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class a extends o {
    public static long E;
    public static long F;
    public static final /* synthetic */ int G = 0;
    public f A;
    public final t B;
    public final y C;
    public boolean D;

    public a() {
        MainActivity mainActivity = (MainActivity) this;
        this.f8419d.f21928b.c("androidx:appcompat", new m(mainActivity));
        o(new n(mainActivity));
        this.B = k.b(new e(mainActivity, 5));
        this.C = new y(mainActivity);
        this.D = true;
    }

    public static void u(a aVar, int i5) {
        c0.t(d1.g(aVar), v(), null, new pd.c0((i5 & 1) == 0, aVar, 5000L, null), 2);
    }

    public static eg.y v() {
        return new eg.y("UpdateActivity");
    }

    public static void x(a aVar) {
        t0 t0Var = x.f22455a;
        Intrinsics.checkNotNullParameter("Update not found.", "msg");
        x.f22455a.b(new u(null, 500, "Update not found."));
    }

    public final void A() {
        zc.e.d(getPackageName(), new WeakReference(getBaseContext()));
    }

    @Override // android.view.ContextThemeWrapper
    public final void applyOverrideConfiguration(Configuration overrideConfiguration) {
        Intrinsics.checkNotNullParameter(overrideConfiguration, "overrideConfiguration");
        super.applyOverrideConfiguration(overrideConfiguration);
    }

    @Override // androidx.appcompat.app.o, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        Configuration overrideConfiguration;
        Intrinsics.checkNotNullParameter(context, "newBase");
        super.attachBaseContext(context);
        Locale locale = zc.f.f25910a;
        Intrinsics.checkNotNullParameter(context, "context");
        String str = d.f9945a;
        Locale locale2 = i.e();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(locale2, "locale");
        Locale.setDefault(locale2);
        if (Build.VERSION.SDK_INT >= 24) {
            overrideConfiguration = context.getResources().getConfiguration();
            overrideConfiguration.setLocale(locale2);
            Intrinsics.checkNotNull(overrideConfiguration);
            overrideConfiguration.fontScale = 1.0f;
            context.createConfigurationContext(overrideConfiguration);
        } else {
            Resources resources = context.getResources();
            overrideConfiguration = resources.getConfiguration();
            Intrinsics.checkNotNull(overrideConfiguration);
            overrideConfiguration.fontScale = 1.0f;
            overrideConfiguration.locale = locale2;
            resources.updateConfiguration(overrideConfiguration, resources.getDisplayMetrics());
        }
        Intrinsics.checkNotNullParameter(overrideConfiguration, "overrideConfiguration");
        super.applyOverrideConfiguration(overrideConfiguration);
    }

    @Override // androidx.appcompat.app.o, e.j, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) {
        Locale locale;
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        Locale locale2 = zc.f.f25910a;
        Intrinsics.checkNotNullParameter(newConfig, "<this>");
        newConfig.fontScale = 1.0f;
        Locale locale3 = zc.f.f25910a;
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 31) {
            locale3 = zc.f.c();
        } else {
            g u10 = c.u(newConfig);
            l0.i iVar = u10.f19306a;
            Intrinsics.checkNotNullExpressionValue(u10, "getLocales(...)");
            if (!iVar.isEmpty() && (locale = iVar.get(0)) != null) {
                locale3 = locale;
            }
        }
        Locale a7 = zc.f.a(locale3);
        if (i5 >= 24) {
            newConfig.setLocale(a7);
        } else {
            newConfig.locale = a7;
        }
        super.onConfigurationChanged(newConfig);
    }

    @Override // androidx.fragment.app.p0, e.j, c0.f, android.app.Activity
    public void onCreate(Bundle bundle) {
        w(bundle);
        c0.t(MyApp.f6830c, new eg.y("initWorker"), null, new b(2, null, 17), 2);
    }

    @Override // androidx.fragment.app.p0, android.app.Activity
    public final void onResume() {
        super.onResume();
        z g10 = d1.g(this);
        lg.e eVar = m0.f9201a;
        lg.d dVar = lg.d.f20063c;
        eg.y v5 = v();
        dVar.getClass();
        c0.t(g10, kotlin.coroutines.e.c(dVar, v5), null, new je.a(this, null, 2), 2);
    }

    @Override // androidx.appcompat.app.o, androidx.fragment.app.p0, android.app.Activity
    public void onStart() {
        y();
        c0.t(d1.g(this), null, null, new s(0, this, null), 3);
        u(this, 3);
    }

    @Override // androidx.appcompat.app.o, androidx.fragment.app.p0, android.app.Activity
    public void onStop() {
        z();
        pc.u uVar = (pc.u) y3.m(pc.u.class, null, 6);
        t1 t1Var = uVar.f21718t;
        if (t1Var != null) {
            CancellationException cancellationException = new CancellationException("onStop");
            cancellationException.initCause(null);
            t1Var.k(cancellationException);
        }
        uVar.f21718t = null;
        t1 t1Var2 = uVar.f21719u;
        if (t1Var2 != null) {
            CancellationException cancellationException2 = new CancellationException("onStop");
            cancellationException2.initCause(null);
            t1Var2.k(cancellationException2);
        }
        uVar.f21719u = null;
    }

    public final void w(Bundle bundle) {
        super.onCreate(bundle);
        this.A = (f) q(new e1(5), new io.sentry.android.core.internal.gestures.c(16, this));
    }

    public final void y() {
        super.onStart();
        jg.d dVar = MyApp.f6830c;
        lg.e eVar = m0.f9201a;
        lg.d dVar2 = lg.d.f20063c;
        eg.y v5 = v();
        dVar2.getClass();
        c0.t(dVar, kotlin.coroutines.e.c(dVar2, v5), null, new s(2, this, null), 2);
    }

    public final void z() {
        super.onStop();
        jg.d dVar = MyApp.f6830c;
        lg.e eVar = m0.f9201a;
        lg.d dVar2 = lg.d.f20063c;
        eg.y v5 = v();
        dVar2.getClass();
        c0.t(dVar, kotlin.coroutines.e.c(dVar2, v5), null, new r(2, this, null), 2);
    }
}

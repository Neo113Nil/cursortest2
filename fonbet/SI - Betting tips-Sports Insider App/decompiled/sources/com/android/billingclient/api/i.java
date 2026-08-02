package com.android.billingclient.api;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.firebase.messaging.FirebaseMessaging;
import com.sports.insider.R;
import io.sentry.t3;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import okio.Path;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public boolean f4027a;

    /* renamed from: b, reason: collision with root package name */
    public Object f4028b;

    /* renamed from: c, reason: collision with root package name */
    public Object f4029c;

    /* renamed from: d, reason: collision with root package name */
    public Object f4030d;

    public i(int i5) {
        switch (i5) {
            case 4:
                this.f4028b = null;
                this.f4029c = t3.AUTO;
                this.f4027a = false;
                this.f4030d = "manual";
                break;
            default:
                this.f4030d = new ba.d("crash-report-handler");
                this.f4027a = false;
                break;
        }
    }

    public void a() {
        this.f4028b = null;
        BottomSheetDialog bottomSheetDialog = (BottomSheetDialog) this.f4029c;
        RecyclerView recyclerView = (RecyclerView) bottomSheetDialog.findViewById(R.id.gallery_recycler);
        if (recyclerView != null) {
            recyclerView.setAdapter(null);
        }
        sd.h hVar = (sd.h) this.f4030d;
        if (hVar != null) {
            hVar.f23482b = null;
        }
        this.f4030d = null;
        bottomSheetDialog.dismiss();
    }

    public void b(boolean z5) {
        e4.e eVar = (e4.e) this.f4030d;
        synchronized (eVar.f8599h) {
            try {
                if (this.f4027a) {
                    throw new IllegalStateException("editor is closed");
                }
                if (Intrinsics.areEqual(((e4.b) this.f4028b).f8585g, this)) {
                    e4.e.c(eVar, this, z5);
                }
                this.f4027a = true;
                Unit unit = Unit.f19194a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public Path c(int i5) {
        Path path;
        e4.e eVar = (e4.e) this.f4030d;
        synchronized (eVar.f8599h) {
            if (this.f4027a) {
                throw new IllegalStateException("editor is closed");
            }
            ((boolean[]) this.f4029c)[i5] = true;
            Object obj = ((e4.b) this.f4028b).f8582d.get(i5);
            e4.d dVar = eVar.q;
            Path path2 = (Path) obj;
            if (!dVar.exists(path2)) {
                try {
                    dVar.sink(path2).close();
                } catch (RuntimeException e7) {
                    throw e7;
                } catch (Exception unused) {
                }
            }
            path = (Path) obj;
        }
        return path;
    }

    public synchronized void d() {
        try {
            if (this.f4027a) {
                return;
            }
            Boolean g10 = g();
            this.f4029c = g10;
            if (g10 == null) {
                com.google.firebase.messaging.k kVar = new com.google.firebase.messaging.k(1);
                o8.j jVar = (o8.j) ((x8.c) this.f4028b);
                jVar.a(jVar.f21127c, kVar);
            }
            this.f4027a = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized boolean e() {
        Boolean bool;
        try {
            d();
            bool = (Boolean) this.f4029c;
        } catch (Throwable th2) {
            throw th2;
        }
        return bool != null ? bool.booleanValue() : ((FirebaseMessaging) this.f4030d).f6062a.h();
    }

    public void f() {
        kotlin.collections.l lVar = (kotlin.collections.l) this.f4029c;
        if (!lVar.isEmpty()) {
            try {
                ((y1.r) this.f4028b).d((y1.c0) lVar.removeFirst());
                return;
            } catch (Exception e7) {
                zc.d.b(4, "NavigationQueueController", e7);
                return;
            }
        }
        this.f4027a = false;
        y1.r rVar = (y1.r) this.f4028b;
        pd.u listener = (pd.u) this.f4030d;
        rVar.getClass();
        Intrinsics.checkNotNullParameter(listener, "listener");
        b2.j jVar = rVar.f25625b;
        jVar.getClass();
        Intrinsics.checkNotNullParameter(listener, "listener");
        jVar.f2999o.remove(listener);
    }

    public Boolean g() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        h8.g gVar = ((FirebaseMessaging) this.f4030d).f6062a;
        gVar.a();
        Context context = gVar.f10401a;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
        if (sharedPreferences.contains("auto_init")) {
            return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                return null;
            }
            return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public String h() {
        if (!this.f4027a) {
            this.f4027a = true;
            s7.v0 v0Var = (s7.v0) this.f4030d;
            this.f4029c = v0Var.n().getString((String) this.f4028b, null);
        }
        return (String) this.f4029c;
    }

    public void i(String str) {
        SharedPreferences.Editor edit = ((s7.v0) this.f4030d).n().edit();
        edit.putString((String) this.f4028b, str);
        edit.apply();
        this.f4029c = str;
    }

    public i(s7.v0 v0Var, String str) {
        this.f4030d = v0Var;
        g6.v.e(str);
        this.f4028b = str;
    }

    public i(e4.e eVar, e4.b bVar) {
        this.f4030d = eVar;
        this.f4028b = bVar;
        this.f4029c = new boolean[2];
    }
}

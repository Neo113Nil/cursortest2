package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.zzdf;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class I4 implements Application.ActivityLifecycleCallbacks, G4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ W4 f33460a;

    public I4(W4 w42) {
        Objects.requireNonNull(w42);
        this.f33460a = w42;
    }

    @Override // com.google.android.gms.measurement.internal.G4
    public final void a(zzdf zzdfVar) {
        C3298l3 c3298l3 = this.f33460a.f33578a;
        c3298l3.I().x(zzdfVar);
        C3348r6 z10 = c3298l3.z();
        C3298l3 c3298l32 = z10.f33578a;
        c3298l32.b().t(new RunnableC3285j6(z10, c3298l32.e().b()));
    }

    @Override // com.google.android.gms.measurement.internal.G4
    public final void b(zzdf zzdfVar) {
        this.f33460a.f33578a.I().z(zzdfVar);
    }

    @Override // com.google.android.gms.measurement.internal.G4
    public final void c(zzdf zzdfVar, Bundle bundle) {
        this.f33460a.f33578a.I().y(zzdfVar, bundle);
    }

    @Override // com.google.android.gms.measurement.internal.G4
    public final void d(zzdf zzdfVar) {
        C3298l3 c3298l3 = this.f33460a.f33578a;
        C3348r6 z10 = c3298l3.z();
        C3298l3 c3298l32 = z10.f33578a;
        c3298l32.b().t(new RunnableC3277i6(z10, c3298l32.e().b()));
        c3298l3.I().w(zzdfVar);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:13|(12:20|21|22|(1:24)(1:39)|25|26|27|28|29|30|31|32)|40|21|22|(0)(0)|25|26|27|28|29|30|31|32) */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0094, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a0, code lost:
    
        r2.f33460a.f33578a.a().o().b("Throwable caught in onActivityCreated", r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0082  */
    @Override // com.google.android.gms.measurement.internal.G4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(zzdf zzdfVar, Bundle bundle) {
        I4 i42;
        C3298l3 c3298l3;
        W4 w42;
        C3298l3 c3298l32;
        Intent intent;
        Uri uri;
        String stringExtra;
        String str;
        try {
            try {
                w42 = this.f33460a;
                c3298l32 = w42.f33578a;
                c3298l32.a().w().a("onActivityCreated");
                intent = zzdfVar.zzc;
            } catch (Throwable th2) {
                th = th2;
                i42.f33460a.f33578a.I().v(zzdfVar, bundle);
                throw th;
            }
        } catch (RuntimeException e10) {
            e = e10;
            i42 = this;
        } catch (Throwable th3) {
            th = th3;
            i42 = this;
            i42.f33460a.f33578a.I().v(zzdfVar, bundle);
            throw th;
        }
        if (intent != null) {
            Uri data = intent.getData();
            if (data != null) {
                if (!data.isHierarchical()) {
                }
                uri = data;
                if (uri != null && uri.isHierarchical()) {
                    c3298l32.C();
                    stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
                    if (!"android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) && !"https://www.google.com".equals(stringExtra) && !"android-app://com.google.appcrawler".equals(stringExtra)) {
                        str = "auto";
                        String str2 = str;
                        String queryParameter = uri.getQueryParameter("referrer");
                        i42 = this;
                        c3298l32.b().t(new H4(i42, bundle != null, uri, str2, queryParameter));
                        c3298l3 = i42.f33460a.f33578a;
                        c3298l3.I().v(zzdfVar, bundle);
                    }
                    str = "gs";
                    String str22 = str;
                    String queryParameter2 = uri.getQueryParameter("referrer");
                    i42 = this;
                    c3298l32.b().t(new H4(i42, bundle != null, uri, str22, queryParameter2));
                    c3298l3 = i42.f33460a.f33578a;
                    c3298l3.I().v(zzdfVar, bundle);
                }
            }
            Bundle extras = intent.getExtras();
            uri = null;
            if (extras != null) {
                String string = extras.getString("com.android.vending.referral_url");
                if (!TextUtils.isEmpty(string)) {
                    data = Uri.parse(string);
                    uri = data;
                }
            }
            if (uri != null) {
                c3298l32.C();
                stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
                if (!"android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra)) {
                    str = "auto";
                    String str222 = str;
                    String queryParameter22 = uri.getQueryParameter("referrer");
                    i42 = this;
                    c3298l32.b().t(new H4(i42, bundle != null, uri, str222, queryParameter22));
                    c3298l3 = i42.f33460a.f33578a;
                    c3298l3.I().v(zzdfVar, bundle);
                }
                str = "gs";
                String str2222 = str;
                String queryParameter222 = uri.getQueryParameter("referrer");
                i42 = this;
                c3298l32.b().t(new H4(i42, bundle != null, uri, str2222, queryParameter222));
                c3298l3 = i42.f33460a.f33578a;
                c3298l3.I().v(zzdfVar, bundle);
            }
        }
        c3298l3 = w42.f33578a;
        c3298l3.I().v(zzdfVar, bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        e(zzdf.zza(activity), bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        b(zzdf.zza(activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        a(zzdf.zza(activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        d(zzdf.zza(activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        c(zzdf.zza(activity), bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}

package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.os.Build;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.ApiOptions;
import com.google.android.gms.common.api.internal.ApiExceptionMapper;
import com.google.android.gms.common.api.internal.ApiKey;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.RegistrationMethods;
import com.google.android.gms.common.api.internal.StatusExceptionMapper;
import com.google.android.gms.common.api.internal.c;
import com.google.android.gms.common.api.internal.d;
import com.google.android.gms.common.api.internal.e;
import com.google.android.gms.common.api.internal.zabq;
import com.google.android.gms.common.api.internal.zacc;
import com.google.android.gms.common.api.internal.zacd;
import com.google.android.gms.common.api.internal.zae;
import com.google.android.gms.common.api.internal.zaf;
import com.google.android.gms.common.api.internal.zag;
import com.google.android.gms.common.api.internal.zah;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.wrappers.AttributionSourceWrapper;
import com.google.android.gms.internal.base.zao;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import defpackage.gh0;
import java.util.Collection;
import java.util.Collections;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class GoogleApi<O extends Api.ApiOptions> implements HasApiKey<O> {
    public final Context a;
    public final String b;
    public final AttributionSourceWrapper c;
    public final Api d;
    public final Api.ApiOptions e;
    public final ApiKey f;
    public final Looper g;
    public final int h;
    public final zabq i;
    public final StatusExceptionMapper j;
    public final GoogleApiManager k;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @KeepForSdk
    public static class Settings {
        public static final Settings c = new Builder().a();
        public final StatusExceptionMapper a;
        public final Looper b;

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        @KeepForSdk
        public static class Builder {
            public ApiExceptionMapper a;
            public Looper b;

            @KeepForSdk
            public Builder() {
            }

            public final Settings a() {
                if (this.a == null) {
                    this.a = new ApiExceptionMapper();
                }
                if (this.b == null) {
                    this.b = Looper.getMainLooper();
                }
                return new Settings(this.a, this.b);
            }
        }

        public Settings(ApiExceptionMapper apiExceptionMapper, Looper looper) {
            this.a = apiExceptionMapper;
            this.b = looper;
        }
    }

    public GoogleApi(Context context, Api api, Api.ApiOptions apiOptions, Settings settings) {
        Preconditions.j(context, "Null context is not permitted.");
        Preconditions.j(api, "Api must not be null.");
        Preconditions.j(settings, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context applicationContext = context.getApplicationContext();
        Preconditions.j(applicationContext, "The provided context did not have an application context.");
        this.a = applicationContext;
        int i = Build.VERSION.SDK_INT;
        String attributionTag = (i < 30 || i < 30) ? null : context.getAttributionTag();
        this.b = attributionTag;
        this.c = i >= 31 ? new AttributionSourceWrapper(context.getAttributionSource()) : null;
        this.d = api;
        this.e = apiOptions;
        this.g = settings.b;
        this.f = new ApiKey(api, apiOptions, attributionTag);
        this.i = new zabq(this);
        GoogleApiManager e = GoogleApiManager.e(applicationContext);
        this.k = e;
        this.h = e.h.getAndIncrement();
        this.j = settings.a;
        zao zaoVar = e.n;
        zaoVar.sendMessage(zaoVar.obtainMessage(7, this));
    }

    public final ClientSettings.Builder d() {
        Collection collection;
        GoogleSignInAccount B0;
        ClientSettings.Builder builder = new ClientSettings.Builder();
        Api.ApiOptions apiOptions = this.e;
        boolean z = apiOptions instanceof Api.ApiOptions.HasGoogleSignInAccountOptions;
        Account account = null;
        if (z && (B0 = ((Api.ApiOptions.HasGoogleSignInAccountOptions) apiOptions).B0()) != null) {
            String str = B0.c;
            if (str != null) {
                account = new Account(str, "com.google");
            }
        } else if (apiOptions instanceof Api.ApiOptions.HasAccountOptions) {
            account = ((Api.ApiOptions.HasAccountOptions) apiOptions).H0();
        }
        builder.a = account;
        if (z) {
            GoogleSignInAccount B02 = ((Api.ApiOptions.HasGoogleSignInAccountOptions) apiOptions).B0();
            collection = B02 == null ? Collections.EMPTY_SET : B02.Y0();
        } else {
            collection = Collections.EMPTY_SET;
        }
        gh0 gh0Var = builder.b;
        if (gh0Var == null) {
            gh0Var = new gh0(0);
            builder.b = gh0Var;
        }
        gh0Var.addAll(collection);
        Context context = this.a;
        builder.d = context.getClass().getName();
        builder.c = context.getPackageName();
        return builder;
    }

    public final Task e(RegistrationMethods registrationMethods) {
        Preconditions.j(registrationMethods.a.a.b, "Listener has already been released.");
        d dVar = registrationMethods.b;
        Preconditions.j(dVar.a, "Listener has already been released.");
        c cVar = registrationMethods.a;
        Runnable runnable = registrationMethods.c;
        GoogleApiManager googleApiManager = this.k;
        googleApiManager.getClass();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        googleApiManager.c(taskCompletionSource, cVar.d, this);
        zacc zaccVar = new zacc(new zaf(new zacd(cVar, dVar, runnable), taskCompletionSource), googleApiManager.i.get(), this);
        zao zaoVar = googleApiManager.n;
        zaoVar.sendMessage(zaoVar.obtainMessage(8, zaccVar));
        return taskCompletionSource.getTask();
    }

    public final Task f(ListenerHolder.ListenerKey listenerKey, int i) {
        GoogleApiManager googleApiManager = this.k;
        googleApiManager.getClass();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        googleApiManager.c(taskCompletionSource, i, this);
        zacc zaccVar = new zacc(new zah(listenerKey, taskCompletionSource), googleApiManager.i.get(), this);
        zao zaoVar = googleApiManager.n;
        zaoVar.sendMessage(zaoVar.obtainMessage(13, zaccVar));
        return taskCompletionSource.getTask();
    }

    public final void g(int i, BaseImplementation.ApiMethodImpl apiMethodImpl) {
        apiMethodImpl.l();
        GoogleApiManager googleApiManager = this.k;
        googleApiManager.getClass();
        zacc zaccVar = new zacc(new zae(i, apiMethodImpl), googleApiManager.i.get(), this);
        zao zaoVar = googleApiManager.n;
        zaoVar.sendMessage(zaoVar.obtainMessage(4, zaccVar));
    }

    public final Task h(int i, e eVar) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        GoogleApiManager googleApiManager = this.k;
        googleApiManager.getClass();
        googleApiManager.c(taskCompletionSource, eVar.c, this);
        zacc zaccVar = new zacc(new zag(i, eVar, taskCompletionSource, this.j), googleApiManager.i.get(), this);
        zao zaoVar = googleApiManager.n;
        zaoVar.sendMessage(zaoVar.obtainMessage(4, zaccVar));
        return taskCompletionSource.getTask();
    }
}
